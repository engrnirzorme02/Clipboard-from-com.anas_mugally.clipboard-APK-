package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagk extends zzagh {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzagk(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagk.class == obj.getClass()) {
            zzagk zzagkVar = (zzagk) obj;
            if (this.zza == zzagkVar.zza && this.zzb == zzagkVar.zzb && this.zzc == zzagkVar.zzc && Arrays.equals(this.zzd, zzagkVar.zzd) && Arrays.equals(this.zze, zzagkVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }
}
