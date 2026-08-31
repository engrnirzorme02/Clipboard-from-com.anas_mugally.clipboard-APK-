package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzer implements zzan {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    public zzer(String str, byte[] bArr, int i7, int i8) {
        byte b7;
        byte b8;
        boolean z7 = true;
        switch (str) {
            case "com.android.capture.fps":
                b7 = 0;
                break;
            case "auxiliary.tracks.interleaved":
                b7 = 4;
                break;
            case "auxiliary.tracks.length":
                b7 = 2;
                break;
            case "auxiliary.tracks.offset":
                b7 = 1;
                break;
            case "auxiliary.tracks.map":
                b7 = 3;
                break;
            default:
                b7 = -1;
                break;
        }
        if (b7 == 0) {
            if (i8 != 23) {
                z7 = false;
            } else if (bArr.length == 4) {
                i8 = 23;
            } else {
                i8 = 23;
                z7 = false;
            }
            zzghc.zza(z7);
        } else if (b7 == 1 || b7 == 2) {
            if (i8 != 78) {
                z7 = false;
            } else if (bArr.length == 8) {
                i8 = 78;
            } else {
                i8 = 78;
                z7 = false;
            }
            zzghc.zza(z7);
        } else if (b7 == 3) {
            zzghc.zza(i8 == 0);
        } else if (b7 == 4) {
            if (i8 != 75) {
                z7 = false;
            } else if (bArr.length == 1 && ((b8 = bArr[0]) == 0 || b8 == 1)) {
                i8 = 75;
            } else {
                i8 = 75;
                z7 = false;
            }
            zzghc.zza(z7);
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i7;
        this.zzd = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzer.class == obj.getClass()) {
            zzer zzerVar = (zzer) obj;
            if (this.zza.equals(zzerVar.zza) && Arrays.equals(this.zzb, zzerVar.zzb) && this.zzc == zzerVar.zzc && this.zzd == zzerVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0089 A[LOOP:0: B:23:0x0086->B:25:0x0089, LOOP_END] */
    public final String toString() {
        String string;
        byte[] bArr;
        StringBuilder sb;
        int i7 = this.zzd;
        if (i7 != 0) {
            if (i7 == 1) {
                string = zzeo.zzi(this.zzb);
            } else if (i7 == 23) {
                string = String.valueOf(Float.intBitsToFloat(zzgne.zzd(this.zzb)));
            } else if (i7 == 67) {
                string = String.valueOf(zzgne.zzd(this.zzb));
            } else if (i7 == 75) {
                string = String.valueOf(Byte.toUnsignedInt(this.zzb[0]));
            } else if (i7 != 78) {
                bArr = this.zzb;
                String str = zzeo.zza;
                int length = bArr.length;
                sb = new StringBuilder(length + length);
                for (int i8 = 0; i8 < bArr.length; i8++) {
                    sb.append(Character.forDigit((bArr[i8] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i8] & 15, 16));
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new zzef(this.zzb).zzJ());
            }
        } else if (this.zza.equals("auxiliary.tracks.map")) {
            List listZzb = zzb();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("track types = ");
            zzggw.zzb(sb2, listZzb, ",");
            string = sb2.toString();
        } else {
            bArr = this.zzb;
            String str2 = zzeo.zza;
            int length2 = bArr.length;
            sb = new StringBuilder(length2 + length2);
            while (i8 < bArr.length) {
                sb.append(Character.forDigit((bArr[i8] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i8] & 15, 16));
            }
            string = sb.toString();
        }
        String str3 = this.zza;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 18 + String.valueOf(string).length());
        sb3.append("mdta: key=");
        sb3.append(str3);
        sb3.append(", value=");
        sb3.append(string);
        return sb3.toString();
    }

    public final List zzb() {
        zzghc.zzi(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b7 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < b7; i7++) {
            arrayList.add(Integer.valueOf(bArr[i7 + 2]));
        }
        return arrayList;
    }
}
