package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzddt extends zzdbq implements zzayi {
    private final Map zzb;
    private final Context zzc;
    private final zzfcj zzd;

    public zzddt(Context context, Set set, zzfcj zzfcjVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfcjVar;
    }

    public final synchronized void zza(View view) {
        try {
            Map map = this.zzb;
            zzayk zzaykVar = (zzayk) map.get(view);
            if (zzaykVar == null) {
                zzayk zzaykVar2 = new zzayk(this.zzc, view);
                zzaykVar2.zza(this);
                map.put(view, zzaykVar2);
                zzaykVar = zzaykVar2;
            }
            if (this.zzd.zzX) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbC)).booleanValue()) {
                    zzaykVar.zzd(((Long) C3250D.m17200c().zzd(zzbci.zzbB)).longValue());
                    return;
                }
            }
            zzaykVar.zze();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(View view) {
        Map map = this.zzb;
        if (map.containsKey(view)) {
            ((zzayk) map.get(view)).zzb(this);
            map.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final synchronized void zzdo(final zzayh zzayhVar) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzdds
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((zzayi) obj).zzdo(zzayhVar);
            }
        });
    }
}
