package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbl {
    public final int zza;
    private final zzbf zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzbl(zzbf zzbfVar, boolean z7, int[] iArr, boolean[] zArr) {
        int i7 = zzbfVar.zza;
        this.zza = i7;
        zzghc.zza(i7 == iArr.length && i7 == zArr.length);
        this.zzb = zzbfVar;
        this.zzc = z7 && i7 > 1;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbl.class == obj.getClass()) {
            zzbl zzblVar = (zzbl) obj;
            if (this.zzc == zzblVar.zzc && this.zzb.equals(zzblVar.zzb) && Arrays.equals(this.zzd, zzblVar.zzd) && Arrays.equals(this.zze, zzblVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb.hashCode() * 31) + (this.zzc ? 1 : 0)) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    public final zzu zza(int i7) {
        return this.zzb.zza(i7);
    }

    public final boolean zzb() {
        for (boolean z7 : this.zze) {
            if (z7) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(int i7) {
        return this.zze[i7];
    }

    public final int zzd() {
        return this.zzb.zzc;
    }
}
