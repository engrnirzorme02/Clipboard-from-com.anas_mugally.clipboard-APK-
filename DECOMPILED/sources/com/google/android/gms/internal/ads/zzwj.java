package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwj extends zzbe {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final zzaj zzf;
    private final zzae zzg;

    static {
        zzy zzyVar = new zzy();
        zzyVar.zza("SinglePeriodTimeline");
        zzyVar.zzb(Uri.EMPTY);
        zzyVar.zzc();
    }

    public zzwj(long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z7, boolean z8, boolean z9, Object obj, zzaj zzajVar, zzae zzaeVar) {
        this.zzc = j10;
        this.zzd = j11;
        this.zze = z7;
        zzajVar.getClass();
        this.zzf = zzajVar;
        this.zzg = zzaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i7, zzbd zzbdVar, long j7) {
        zzghc.zzm(i7, 1, "index");
        boolean z7 = this.zze;
        zzbdVar.zza(zzbd.zza, this.zzf, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z7, false, this.zzg, 0L, this.zzd, 0, 0, 0L);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i7, zzbc zzbcVar, boolean z7) {
        zzghc.zzm(i7, 1, "index");
        zzbcVar.zza(null, z7 ? zzb : null, 0, this.zzc, 0L, zzb.zza, false);
        return zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zze(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final Object zzf(int i7) {
        zzghc.zzm(i7, 1, "index");
        return zzb;
    }
}
