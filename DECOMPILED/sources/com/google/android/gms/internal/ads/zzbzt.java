package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.atomic.AtomicInteger;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class zzbzt {
    private final zzbzm zza;
    private final AtomicInteger zzb;

    public zzbzt() {
        zzbzm zzbzmVar = new zzbzm();
        this.zza = zzbzmVar;
        this.zzb = new AtomicInteger(0);
        zzgot.zzq(zzbzmVar, new zzbzr(this), zzbzh.zzg);
    }

    @Deprecated
    public final void zze(zzbzq zzbzqVar, zzbzo zzbzoVar) {
        zzgot.zzq(this.zza, new zzbzs(this, zzbzqVar, zzbzoVar), zzbzh.zzg);
    }

    @Deprecated
    public final void zzf(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzij)).booleanValue()) {
            C7351t.m32354l().zzh(th, str);
        }
    }

    @Deprecated
    public final int zzi() {
        return this.zzb.get();
    }

    final /* synthetic */ AtomicInteger zzj() {
        return this.zzb;
    }
}
