package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbbf {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbbf(InputStream inputStream, boolean z7, boolean z8, long j7, boolean z9) {
        this.zza = inputStream;
        this.zzb = z7;
        this.zzc = z8;
        this.zzd = j7;
        this.zze = z9;
    }

    public static zzbbf zza(InputStream inputStream, boolean z7, boolean z8, long j7, boolean z9) {
        return new zzbbf(inputStream, z7, z8, j7, z9);
    }

    public final InputStream zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzc;
    }

    public final long zze() {
        return this.zzd;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
