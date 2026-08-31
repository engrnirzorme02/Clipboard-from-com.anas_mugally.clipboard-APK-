package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbf {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzu[] zzd;
    private int zze;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbf(String str, zzu... zzuVarArr) {
        int length = zzuVarArr.length;
        int i7 = 1;
        zzghc.zza(length > 0);
        this.zzb = str;
        this.zzd = zzuVarArr;
        this.zza = length;
        int iZzg = zzar.zzg(zzuVarArr[0].zzo);
        this.zzc = iZzg == -1 ? zzar.zzg(zzuVarArr[0].zzn) : iZzg;
        String strZzc = zzc(zzuVarArr[0].zzd);
        int i8 = zzuVarArr[0].zzf | 16384;
        while (true) {
            zzu[] zzuVarArr2 = this.zzd;
            if (i7 >= zzuVarArr2.length) {
                return;
            }
            if (!strZzc.equals(zzc(zzuVarArr2[i7].zzd))) {
                zzu[] zzuVarArr3 = this.zzd;
                zzd("languages", zzuVarArr3[0].zzd, zzuVarArr3[i7].zzd, i7);
                return;
            } else {
                zzu[] zzuVarArr4 = this.zzd;
                if (i8 != (zzuVarArr4[i7].zzf | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzuVarArr4[0].zzf), Integer.toBinaryString(this.zzd[i7].zzf), i7);
                    return;
                }
                i7++;
            }
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zzd(String str, String str2, String str3, int i7) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i7).length() + 1);
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i7);
        sb.append(")");
        zzds.zzf("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbf.class == obj.getClass()) {
            zzbf zzbfVar = (zzbf) obj;
            if (this.zzb.equals(zzbfVar.zzb) && Arrays.equals(this.zzd, zzbfVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zze;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = ((this.zzb.hashCode() + 527) * 31) + Arrays.hashCode(this.zzd);
        this.zze = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string = Arrays.toString(this.zzd);
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length());
        sb.append(str);
        sb.append(": ");
        sb.append(string);
        return sb.toString();
    }

    public final zzu zza(int i7) {
        return this.zzd[i7];
    }

    public final int zzb(zzu zzuVar) {
        int i7 = 0;
        while (true) {
            zzu[] zzuVarArr = this.zzd;
            if (i7 >= zzuVarArr.length) {
                return -1;
            }
            if (zzuVar == zzuVarArr[i7]) {
                return i7;
            }
            i7++;
        }
    }
}
