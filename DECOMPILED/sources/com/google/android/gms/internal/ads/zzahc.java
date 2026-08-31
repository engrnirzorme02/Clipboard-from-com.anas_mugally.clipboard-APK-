package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzahc extends zzack implements zzahi {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzahc(long j7, long j8, int i7, int i8, boolean z7) {
        super(j7, j8, i7, i8, false);
        this.zza = j8;
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = j7 != -1 ? j7 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zze(long j7) {
        return zzd(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final int zzg() {
        return this.zzb;
    }

    public final zzahc zzh(long j7) {
        return new zzahc(j7, this.zza, this.zzb, this.zzc, false);
    }
}
