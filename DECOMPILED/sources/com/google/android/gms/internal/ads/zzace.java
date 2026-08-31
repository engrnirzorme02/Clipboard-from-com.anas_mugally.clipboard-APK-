package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzace {
    public static final zzace zza = new zzace(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzace(int i7, long j7, long j8) {
        this.zzb = i7;
        this.zzc = j7;
        this.zzd = j8;
    }

    public static zzace zza(long j7, long j8) {
        return new zzace(-1, j7, j8);
    }

    public static zzace zzb(long j7, long j8) {
        return new zzace(-2, j7, j8);
    }

    public static zzace zzc(long j7) {
        return new zzace(0, -9223372036854775807L, j7);
    }

    final /* synthetic */ int zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
