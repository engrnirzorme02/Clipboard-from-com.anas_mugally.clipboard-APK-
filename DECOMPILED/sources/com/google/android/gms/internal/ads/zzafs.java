package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafs implements zzan {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzs zzsVar = new zzs();
        zzsVar.zzm("application/id3");
        zzsVar.zzM();
        zzs zzsVar2 = new zzs();
        zzsVar2.zzm("application/x-scte35");
        zzsVar2.zzM();
    }

    public zzafs(String str, String str2, long j7, long j8, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j7;
        this.zzd = j8;
        this.zze = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafs.class == obj.getClass()) {
            zzafs zzafsVar = (zzafs) obj;
            if (this.zzc == zzafsVar.zzc && this.zzd == zzafsVar.zzd && Objects.equals(this.zza, zzafsVar.zza) && Objects.equals(this.zzb, zzafsVar.zzb) && Arrays.equals(this.zze, zzafsVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzf;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
        long j7 = this.zzc;
        int iHashCode2 = (((((iHashCode * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) this.zzd)) * 31) + Arrays.hashCode(this.zze);
        this.zzf = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        long j7 = this.zzd;
        int length = String.valueOf(j7).length();
        long j8 = this.zzc;
        int length2 = String.valueOf(j8).length();
        String str = this.zza;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length3 + 8 + str2.length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j7);
        sb.append(", durationMs=");
        sb.append(j8);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }
}
