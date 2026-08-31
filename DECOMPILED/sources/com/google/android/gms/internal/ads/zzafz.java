package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafz extends zzagh {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzagh[] zzg;

    public zzafz(String str, int i7, int i8, long j7, long j8, zzagh[] zzaghVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = j7;
        this.zze = j8;
        this.zzg = zzaghVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafz.class == obj.getClass()) {
            zzafz zzafzVar = (zzafz) obj;
            if (this.zzb == zzafzVar.zzb && this.zzc == zzafzVar.zzc && this.zzd == zzafzVar.zzd && this.zze == zzafzVar.zze && Objects.equals(this.zza, zzafzVar.zza) && Arrays.equals(this.zzg, zzafzVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzb + 527;
        String str = this.zza;
        long j7 = this.zze;
        return (((((((i7 * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j7)) * 31) + str.hashCode();
    }
}
