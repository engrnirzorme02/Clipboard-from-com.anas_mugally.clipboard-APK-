package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zztx extends zzto {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzgy zzc;

    protected zztx() {
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzM() {
        for (zztw zztwVar : this.zza.values()) {
            zztwVar.zza.zzq(zztwVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected void zza(zzgy zzgyVar) {
        this.zzc = zzgyVar;
        this.zzb = zzeo.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzc() {
        for (zztw zztwVar : this.zza.values()) {
            zztwVar.zza.zzr(zztwVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected void zzd() {
        HashMap map = this.zza;
        for (zztw zztwVar : map.values()) {
            zzur zzurVar = zztwVar.zza;
            zzurVar.zzs(zztwVar.zzb);
            zztv zztvVar = zztwVar.zzc;
            zzurVar.zzm(zztvVar);
            zzurVar.zzo(zztvVar);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public void zzt() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zztw) it.next()).zza.zzt();
        }
    }

    protected abstract void zzu(Object obj, zzur zzurVar, zzbe zzbeVar);

    protected final void zzv(final Object obj, zzur zzurVar) {
        HashMap map = this.zza;
        zzghc.zza(!map.containsKey(obj));
        zzuq zzuqVar = new zzuq() { // from class: com.google.android.gms.internal.ads.zztu
            @Override // com.google.android.gms.internal.ads.zzuq
            public final /* synthetic */ void zza(zzur zzurVar2, zzbe zzbeVar) {
                this.zza.zzu(obj, zzurVar2, zzbeVar);
            }
        };
        zztv zztvVar = new zztv(this, obj);
        map.put(obj, new zztw(zzurVar, zzuqVar, zztvVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzurVar.zzl(handler, zztvVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzurVar.zzn(handler2, zztvVar);
        zzurVar.zzp(zzuqVar, this.zzc, zzk());
        if (zzj()) {
            return;
        }
        zzurVar.zzr(zzuqVar);
    }

    protected int zzw(Object obj, int i7) {
        return 0;
    }

    protected zzup zzx(Object obj, zzup zzupVar) {
        throw null;
    }

    protected long zzy(Object obj, long j7, zzup zzupVar) {
        return j7;
    }
}
