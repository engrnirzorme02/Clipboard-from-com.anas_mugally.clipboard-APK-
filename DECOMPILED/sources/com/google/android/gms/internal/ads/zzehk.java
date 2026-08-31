package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzehk {
    private final InterfaceC3750e zza;
    private final zzehm zzb;
    private final zzfjv zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) C3250D.m17200c().zzd(zzbci.zzhk)).booleanValue();
    private final zzeee zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzehk(InterfaceC3750e interfaceC3750e, zzehm zzehmVar, zzeee zzeeeVar, zzfjv zzfjvVar) {
        this.zza = interfaceC3750e;
        this.zzb = zzehmVar;
        this.zzf = zzeeeVar;
        this.zzc = zzfjvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized boolean zzi(zzfcj zzfcjVar) {
        zzehj zzehjVar = (zzehj) this.zzd.get(zzfcjVar);
        if (zzehjVar == null) {
            return false;
        }
        return zzehjVar.zzc == 8;
    }

    public final synchronized void zza() {
        this.zzi = this.zza.mo18161c();
    }

    public final synchronized void zzb() {
        this.zzh = this.zza.mo18161c() - this.zzi;
    }

    public final synchronized void zzc(List list) {
        this.zzi = this.zza.mo18161c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfcj zzfcjVar = (zzfcj) it.next();
            String str = zzfcjVar.zzw;
            if (!TextUtils.isEmpty(str)) {
                this.zzd.put(zzfcjVar, new zzehj(str, zzfcjVar.zzaf, C3553a.e.API_PRIORITY_OTHER, 0L, null));
            }
        }
    }

    public final synchronized void zzd(zzfcj zzfcjVar) {
        try {
            this.zzh = this.zza.mo18161c() - this.zzi;
            if (zzfcjVar != null) {
                this.zzf.zzi(zzfcjVar);
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized InterfaceFutureC1673e zze(zzfcu zzfcuVar, zzfcj zzfcjVar, InterfaceFutureC1673e interfaceFutureC1673e, zzfjr zzfjrVar) {
        zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
        long jMo18161c = this.zza.mo18161c();
        String str = zzfcjVar.zzw;
        if (str != null) {
            this.zzd.put(zzfcjVar, new zzehj(str, zzfcjVar.zzaf, 9, 0L, null));
            zzgot.zzq(interfaceFutureC1673e, new zzehi(this, jMo18161c, zzfcmVar, zzfcjVar, str, zzfjrVar, zzfcuVar), zzbzh.zzg);
        }
        return interfaceFutureC1673e;
    }

    public final synchronized void zzf(zzfcj zzfcjVar) {
        zzehj zzehjVar = (zzehj) this.zzd.get(zzfcjVar);
        if (zzehjVar == null || this.zzg) {
            return;
        }
        zzehjVar.zzc = 8;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.zzd.entrySet().iterator();
            while (it.hasNext()) {
                zzehj zzehjVar = (zzehj) ((Map.Entry) it.next()).getValue();
                if (zzehjVar.zzc != Integer.MAX_VALUE) {
                    arrayList.add(zzehjVar.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized long zzh() {
        return this.zzh;
    }

    final /* synthetic */ InterfaceC3750e zzj() {
        return this.zza;
    }

    final /* synthetic */ zzehm zzk() {
        return this.zzb;
    }

    final /* synthetic */ zzfjv zzl() {
        return this.zzc;
    }

    final /* synthetic */ LinkedHashMap zzm() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzn() {
        return this.zze;
    }

    final /* synthetic */ zzeee zzo() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzp() {
        return this.zzg;
    }
}
