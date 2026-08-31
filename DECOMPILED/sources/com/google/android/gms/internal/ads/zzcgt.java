package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3369m2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgt {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgt(int i7, int i8, int i9) {
        this.zzc = i7;
        this.zzb = i8;
        this.zza = i9;
    }

    public static zzcgt zza(C3369m2 c3369m2) {
        if (c3369m2.f14025d) {
            return new zzcgt(3, 0, 0);
        }
        if (c3369m2.f14030t) {
            return new zzcgt(2, 0, 0);
        }
        return c3369m2.f14029s ? new zzcgt(0, 0, 0) : new zzcgt(1, c3369m2.f14027f, c3369m2.f14024c);
    }

    public static zzcgt zzb() {
        return new zzcgt(0, 0, 0);
    }

    public static zzcgt zzc(int i7, int i8) {
        return new zzcgt(1, i7, i8);
    }

    public static zzcgt zzd() {
        return new zzcgt(4, 0, 0);
    }

    public static zzcgt zze() {
        return new zzcgt(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}
