package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzyh implements zzyf {
    private final zzyf zza;

    public zzyh(zzyf zzyfVar) {
        this.zza = zzyfVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzyh) {
            return this.zza.equals(((zzyh) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public zzbf zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public zzu zzb(int i7) {
        return this.zza.zzb(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public zzu zzc() {
        return this.zza.zzc();
    }

    public final zzyf zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zzf(int i7) {
        return this.zza.zzf(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zzg(int i7) {
        return this.zza.zzg(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final int zzh() {
        return this.zza.zzh();
    }
}
