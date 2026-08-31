package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
final class zzapu implements zzapg {
    private final Map zza = new HashMap();
    private final zzaot zzb;
    private final BlockingQueue zzc;
    private final zzaoy zzd;

    zzapu(zzaot zzaotVar, BlockingQueue blockingQueue, zzaoy zzaoyVar) {
        this.zzd = zzaoyVar;
        this.zzb = zzaotVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zza(zzaph zzaphVar, zzapn zzapnVar) {
        List list;
        zzaoq zzaoqVar = zzapnVar.zzb;
        if (zzaoqVar == null || zzaoqVar.zza(System.currentTimeMillis())) {
            zzb(zzaphVar);
            return;
        }
        String strZzi = zzaphVar.zzi();
        synchronized (this) {
            list = (List) this.zza.remove(strZzi);
        }
        if (list != null) {
            if (zzapt.zzb) {
                zzapt.zza("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzi);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zza((zzaph) it.next(), zzapnVar, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final synchronized void zzb(zzaph zzaphVar) {
        try {
            Map map = this.zza;
            String strZzi = zzaphVar.zzi();
            List list = (List) map.remove(strZzi);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (zzapt.zzb) {
                zzapt.zza("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzi);
            }
            zzaph zzaphVar2 = (zzaph) list.remove(0);
            map.put(strZzi, list);
            zzaphVar2.zzu(this);
            try {
                this.zzc.put(zzaphVar2);
            } catch (InterruptedException e7) {
                zzapt.zzc("Couldn't add request to queue. %s", e7.toString());
                Thread.currentThread().interrupt();
                this.zzb.zza();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized boolean zzc(zzaph zzaphVar) {
        try {
            Map map = this.zza;
            String strZzi = zzaphVar.zzi();
            if (!map.containsKey(strZzi)) {
                map.put(strZzi, null);
                zzaphVar.zzu(this);
                if (zzapt.zzb) {
                    zzapt.zzb("new request, sending to network %s", strZzi);
                }
                return false;
            }
            List arrayList = (List) map.get(strZzi);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            zzaphVar.zzc("waiting-for-response");
            arrayList.add(zzaphVar);
            map.put(strZzi, arrayList);
            if (zzapt.zzb) {
                zzapt.zzb("Request for cacheKey=%s is in flight, putting on hold.", strZzi);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
