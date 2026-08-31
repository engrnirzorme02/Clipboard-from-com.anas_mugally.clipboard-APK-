package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh {
    public static final zzh zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzg zzgVar = new zzg();
        zzgVar.zza(1);
        zzgVar.zzb(2);
        zzgVar.zzc(3);
        zza = zzgVar.zzg();
        zzg zzgVar2 = new zzg();
        zzgVar2.zza(1);
        zzgVar2.zzb(1);
        zzgVar2.zzc(2);
        zzgVar2.zzg();
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ zzh(int i7, int i8, int i9, byte[] bArr, int i10, int i11, byte[] bArr2) {
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = i9;
        this.zze = bArr;
        this.zzf = i10;
        this.zzg = i11;
    }

    public static boolean zza(zzh zzhVar) {
        if (zzhVar == null) {
            return true;
        }
        int i7 = zzhVar.zzb;
        if (i7 != -1 && i7 != 1 && i7 != 2) {
            return false;
        }
        int i8 = zzhVar.zzc;
        if (i8 != -1 && i8 != 2) {
            return false;
        }
        int i9 = zzhVar.zzd;
        if ((i9 != -1 && i9 != 3) || zzhVar.zze != null) {
            return false;
        }
        int i10 = zzhVar.zzg;
        if (i10 != -1 && i10 != 8) {
            return false;
        }
        int i11 = zzhVar.zzf;
        return i11 == -1 || i11 == 8;
    }

    public static int zzb(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 9) {
            return (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzc(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 4) {
            return 10;
        }
        if (i7 == 13) {
            return 2;
        }
        if (i7 == 16) {
            return 6;
        }
        if (i7 != 18) {
            return (i7 == 6 || i7 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzh(int i7) {
        if (i7 == -1) {
            return "Unset color space";
        }
        if (i7 == 6) {
            return "BT2020";
        }
        if (i7 == 1) {
            return "BT709";
        }
        if (i7 == 2) {
            return "BT601";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 22);
        sb.append("Undefined color space ");
        sb.append(i7);
        return sb.toString();
    }

    private static String zzi(int i7) {
        if (i7 == -1) {
            return "Unset color transfer";
        }
        if (i7 == 10) {
            return "Gamma 2.2";
        }
        if (i7 == 1) {
            return "Linear";
        }
        if (i7 == 2) {
            return "sRGB";
        }
        if (i7 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i7 == 6) {
            return "ST2084 PQ";
        }
        if (i7 == 7) {
            return "HLG";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 25);
        sb.append("Undefined color transfer ");
        sb.append(i7);
        return sb.toString();
    }

    private static String zzj(int i7) {
        if (i7 == -1) {
            return "Unset color range";
        }
        if (i7 == 1) {
            return "Full range";
        }
        if (i7 == 2) {
            return "Limited range";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 22);
        sb.append("Undefined color range ");
        sb.append(i7);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzh.class == obj.getClass()) {
            zzh zzhVar = (zzh) obj;
            if (this.zzb == zzhVar.zzb && this.zzc == zzhVar.zzc && this.zzd == zzhVar.zzd && Arrays.equals(this.zze, zzhVar.zze) && this.zzf == zzhVar.zzf && this.zzg == zzhVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzh;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = ((((((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31) + Arrays.hashCode(this.zze)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string;
        int i7 = this.zzf;
        int i8 = this.zzd;
        int i9 = this.zzc;
        String strZzh = zzh(this.zzb);
        String strZzj = zzj(i9);
        String strZzi = zzi(i8);
        String string2 = "NA";
        if (i7 != -1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 8);
            sb.append(i7);
            sb.append("bit Luma");
            string = sb.toString();
        } else {
            string = "NA";
        }
        int i10 = this.zzg;
        if (i10 != -1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 10);
            sb2.append(i10);
            sb2.append("bit Chroma");
            string2 = sb2.toString();
        }
        boolean z7 = this.zze != null;
        StringBuilder sb3 = new StringBuilder(strZzh.length() + 12 + strZzj.length() + 2 + strZzi.length() + 2 + String.valueOf(z7).length() + 2 + string.length() + 2 + string2.length() + 1);
        sb3.append("ColorInfo(");
        sb3.append(strZzh);
        sb3.append(", ");
        sb3.append(strZzj);
        sb3.append(", ");
        sb3.append(strZzi);
        sb3.append(", ");
        sb3.append(z7);
        sb3.append(", ");
        sb3.append(string);
        sb3.append(", ");
        sb3.append(string2);
        sb3.append(")");
        return sb3.toString();
    }

    public final zzg zzd() {
        return new zzg(this, null);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }

    public final String zzg() {
        String str;
        String string;
        if (zzf()) {
            Object[] objArr = {zzh(this.zzb), zzj(this.zzc), zzi(this.zzd)};
            String str2 = zzeo.zza;
            str = String.format(Locale.US, "%s/%s/%s", objArr);
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            int i7 = this.zzf;
            int i8 = this.zzg;
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 1 + String.valueOf(i8).length());
            sb.append(i7);
            sb.append("/");
            sb.append(i8);
            string = sb.toString();
        } else {
            string = "NA/NA";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + string.length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(string);
        return sb2.toString();
    }
}
