package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class zzako {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzako(String str, int i7, Integer num, Integer num2, float f7, boolean z7, boolean z8, boolean z9, boolean z10, int i8) {
        this.zza = str;
        this.zzb = i7;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f7;
        this.zzf = z7;
        this.zzg = z8;
        this.zzh = z9;
        this.zzi = z10;
        this.zzj = i8;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0115 A[Catch: RuntimeException -> 0x00b8, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00b8, blocks: (B:33:0x00be, B:35:0x00c4, B:39:0x00d4, B:41:0x00d8, B:45:0x00e7, B:47:0x00eb, B:51:0x00fc, B:53:0x0100, B:57:0x0111, B:59:0x0115, B:60:0x011d, B:68:0x013b, B:66:0x012e, B:28:0x009f, B:23:0x008b), top: B:73:0x0081, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0139  */
    public static zzako zza(String str, zzakm zzakmVar) {
        float f7;
        int i7;
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        int i11;
        int i12;
        String strTrim;
        int i13;
        zzghc.zza(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i14 = zzakmVar.zzk;
        zzako zzakoVar = null;
        if (length != i14) {
            Object[] objArr = {Integer.valueOf(i14), Integer.valueOf(length), str};
            String str2 = zzeo.zza;
            zzds.zzc("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
            return null;
        }
        try {
            String strTrim2 = strArrSplit[zzakmVar.zza].trim();
            int i15 = zzakmVar.zzb;
            int iZzd = i15 != -1 ? zzd(strArrSplit[i15].trim()) : -1;
            int i16 = zzakmVar.zzc;
            Integer numZzb = i16 != -1 ? zzb(strArrSplit[i16].trim()) : null;
            int i17 = zzakmVar.zzd;
            Integer numZzb2 = i17 != -1 ? zzb(strArrSplit[i17].trim()) : null;
            int i18 = zzakmVar.zze;
            try {
                if (i18 != -1) {
                    String strTrim3 = strArrSplit[i18].trim();
                    try {
                        f7 = Float.parseFloat(strTrim3);
                        zzakoVar = null;
                    } catch (NumberFormatException e7) {
                        StringBuilder sb = new StringBuilder(String.valueOf(strTrim3).length() + 29);
                        sb.append("Failed to parse font size: '");
                        sb.append(strTrim3);
                        sb.append("'");
                        zzds.zzd("SsaStyle", sb.toString(), e7);
                        f7 = -3.4028235E38f;
                    }
                    i7 = zzakmVar.zzf;
                    boolean z10 = false;
                    if (i7 == -1 && zze(strArrSplit[i7].trim())) {
                        z10 = true;
                    }
                    i8 = zzakmVar.zzg;
                    if (i8 == -1 && zze(strArrSplit[i8].trim())) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    i9 = zzakmVar.zzh;
                    if (i9 == -1 && zze(strArrSplit[i9].trim())) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    i10 = zzakmVar.zzi;
                    if (i10 == -1 && zze(strArrSplit[i10].trim())) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    i11 = zzakmVar.zzj;
                    if (i11 != -1) {
                        strTrim = strArrSplit[i11].trim();
                        try {
                            i13 = Integer.parseInt(strTrim.trim());
                            if (i13 != 1 || i13 == 3) {
                                i12 = i13;
                            } else {
                                zzds.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim)));
                                i12 = -1;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        i12 = -1;
                    }
                    return new zzako(strTrim2, iZzd, numZzb, numZzb2, f7, z10, z7, z8, z9, i12);
                }
                f7 = -3.4028235E38f;
                i7 = zzakmVar.zzf;
                boolean z11 = false;
                if (i7 == -1) {
                }
                i8 = zzakmVar.zzg;
                if (i8 == -1) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                i9 = zzakmVar.zzh;
                if (i9 == -1) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                i10 = zzakmVar.zzi;
                if (i10 == -1) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                i11 = zzakmVar.zzj;
                if (i11 != -1) {
                    strTrim = strArrSplit[i11].trim();
                    i13 = Integer.parseInt(strTrim.trim());
                    if (i13 != 1) {
                    }
                    i12 = i13;
                } else {
                    i12 = -1;
                }
                return new zzako(strTrim2, iZzd, numZzb, numZzb2, f7, z11, z7, z8, z9, i12);
            } catch (RuntimeException e8) {
                e = e8;
                StringBuilder sb2 = new StringBuilder(str.length() + 36);
                sb2.append("Skipping malformed 'Style:' line: '");
                sb2.append(str);
                sb2.append("'");
                zzds.zzd("SsaStyle", sb2.toString(), e);
                return zzakoVar;
            }
        } catch (RuntimeException e9) {
            e = e9;
            zzakoVar = null;
        }
    }

    public static Integer zzb(String str) {
        try {
            long j7 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzghc.zza(j7 <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgne.zza(((j7 >> 24) & 255) ^ 255), zzgne.zza(j7 & 255), zzgne.zza((j7 >> 8) & 255), zzgne.zza((j7 >> 16) & 255)));
        } catch (IllegalArgumentException e7) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            zzds.zzd("SsaStyle", sb.toString(), e7);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        try {
            int i7 = Integer.parseInt(str.trim());
            switch (i7) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i7;
                default:
                    zzds.zzc("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    private static boolean zze(String str) {
        try {
            int i7 = Integer.parseInt(str);
            return i7 == 1 || i7 == -1;
        } catch (NumberFormatException e7) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            zzds.zzd("SsaStyle", sb.toString(), e7);
            return false;
        }
    }
}
