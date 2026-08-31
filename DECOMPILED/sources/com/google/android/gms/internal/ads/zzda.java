package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzda {
    private final zzdl zza;
    private final zzdl zzb;
    private final zzcz zzc;
    private Object zzd;
    private Object zze;
    private int zzf;

    public zzda(Object obj, Looper looper, Looper looper2, zzdb zzdbVar, zzcz zzczVar) {
        this.zza = zzdbVar.zzd(looper, null);
        this.zzb = zzdbVar.zzd(looper2, null);
        this.zzd = obj;
        this.zze = obj;
        this.zzc = zzczVar;
    }

    private final void zzg(Runnable runnable) {
        zzdl zzdlVar = this.zzb;
        if (zzdlVar.zza().getThread().isAlive()) {
            zzdlVar.zzm(runnable);
        }
    }

    private final void zzh(Object obj) {
        Object obj2 = this.zzd;
        this.zzd = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.zzc.zza(obj2, obj);
    }

    public final void zza(zzggr zzggrVar, final zzggr zzggrVar2) {
        zzghc.zzh(Looper.myLooper() == this.zzb.zza());
        this.zzf++;
        zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(zzggrVar2);
            }
        });
        zzh(zzggrVar.apply(this.zzd));
    }

    public final void zzb(final Object obj) {
        this.zze = obj;
        zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(obj);
            }
        });
    }

    public final void zzc(Runnable runnable) {
        zzdl zzdlVar = this.zza;
        if (zzdlVar.zza().getThread().isAlive()) {
            zzdlVar.zzm(runnable);
        }
    }

    final /* synthetic */ void zzd(zzggr zzggrVar) {
        final Object objApply = zzggrVar.apply(this.zze);
        this.zze = objApply;
        zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(objApply);
            }
        });
    }

    final /* synthetic */ void zze(Object obj) {
        if (this.zzf == 0) {
            zzh(obj);
        }
    }

    final /* synthetic */ void zzf(Object obj) {
        int i7 = this.zzf - 1;
        this.zzf = i7;
        if (i7 == 0) {
            zzh(obj);
        }
    }
}
