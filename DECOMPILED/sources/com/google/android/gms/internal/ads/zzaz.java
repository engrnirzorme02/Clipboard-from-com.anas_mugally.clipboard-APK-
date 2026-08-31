package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaz {
    public final Object zza;
    public final int zzb;
    public final zzaj zzc;
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzaz(Object obj, int i7, zzaj zzajVar, Object obj2, int i8, long j7, long j8, int i9, int i10) {
        this.zza = obj;
        this.zzb = i7;
        this.zzc = zzajVar;
        this.zzd = obj2;
        this.zze = i8;
        this.zzf = j7;
        this.zzg = j8;
        this.zzh = i9;
        this.zzi = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaz.class == obj.getClass()) {
            zzaz zzazVar = (zzaz) obj;
            if (this.zzb == zzazVar.zzb && this.zze == zzazVar.zze && this.zzf == zzazVar.zzf && this.zzg == zzazVar.zzg && this.zzh == zzazVar.zzh && this.zzi == zzazVar.zzi && Objects.equals(this.zzc, zzazVar.zzc) && Objects.equals(this.zza, zzazVar.zza) && Objects.equals(this.zzd, zzazVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi));
    }

    public final String toString() {
        int i7 = this.zzb;
        int length = String.valueOf(i7).length();
        int i8 = this.zze;
        int length2 = String.valueOf(i8).length();
        long j7 = this.zzf;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j7).length());
        sb.append("mediaItem=");
        sb.append(i7);
        sb.append(", period=");
        sb.append(i8);
        sb.append(", pos=");
        sb.append(j7);
        String string = sb.toString();
        int i9 = this.zzh;
        if (i9 == -1) {
            return string;
        }
        long j8 = this.zzg;
        int i10 = this.zzi;
        int length3 = string.length();
        StringBuilder sb2 = new StringBuilder(length3 + 13 + String.valueOf(j8).length() + 10 + String.valueOf(i9).length() + 5 + String.valueOf(i10).length());
        sb2.append(string);
        sb2.append(", contentPos=");
        sb2.append(j8);
        sb2.append(", adGroup=");
        sb2.append(i9);
        sb2.append(", ad=");
        sb2.append(i10);
        return sb2.toString();
    }
}
