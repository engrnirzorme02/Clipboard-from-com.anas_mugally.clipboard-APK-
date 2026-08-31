package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafw implements zzan {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzafw(int i7, String str, String str2, String str3, boolean z7, int i8) {
        boolean z8 = true;
        if (i8 != -1 && i8 <= 0) {
            z8 = false;
        }
        zzghc.zza(z8);
        this.zza = i7;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z7;
        this.zzf = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafw.class == obj.getClass()) {
            zzafw zzafwVar = (zzafw) obj;
            if (this.zza == zzafwVar.zza && Objects.equals(this.zzb, zzafwVar.zzb) && Objects.equals(this.zzc, zzafwVar.zzc) && Objects.equals(this.zzd, zzafwVar.zzd) && this.zze == zzafwVar.zze && this.zzf == zzafwVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i7 = this.zza;
        String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i8 = ((i7 + 527) * 31) + iHashCode;
        String str3 = this.zzd;
        return (((((((i8 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        int i7 = this.zza;
        int length3 = String.valueOf(i7).length();
        int i8 = this.zzf;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i8).length());
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i7);
        sb.append(", metadataInterval=");
        sb.append(i8);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzan
    public final void zza(zzal zzalVar) {
        String str = this.zzc;
        if (str != null) {
            zzalVar.zzu(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzalVar.zzt(str2);
        }
    }
}
