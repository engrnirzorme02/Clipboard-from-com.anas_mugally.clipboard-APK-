package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagg {
    public static final zzagd zza = zzage.zza;

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0112 A[SYNTHETIC] */
    public static final zzao zza(byte[] bArr, int i7, zzagd zzagdVar, zzafr zzafrVar) {
        boolean z7;
        zzagf zzagfVar;
        int i8;
        boolean zZzb;
        int iZzc;
        zzagh zzaghVarZzc;
        ArrayList arrayList = new ArrayList();
        zzef zzefVar = new zzef(bArr, i7);
        boolean z8 = false;
        if (zzefVar.zzd() < 10) {
            zzds.zzc("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iZzx = zzefVar.zzx();
            if (iZzx == 4801587) {
                int iZzs = zzefVar.zzs();
                zzefVar.zzk(1);
                int iZzs2 = zzefVar.zzs();
                int iZzG = zzefVar.zzG();
                if (iZzs != 2) {
                    if (iZzs == 3) {
                        if ((iZzs2 & 64) != 0) {
                            int iZzB = zzefVar.zzB();
                            zzefVar.zzk(iZzB);
                            iZzG -= iZzB + 4;
                        }
                    } else if (iZzs == 4) {
                        if ((iZzs2 & 64) != 0) {
                            int iZzG2 = zzefVar.zzG();
                            zzefVar.zzk(iZzG2 - 4);
                            iZzG -= iZzG2;
                        }
                        if ((iZzs2 & 16) != 0) {
                            iZzG -= 10;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzs).length() + 46);
                        sb.append("Skipped ID3 tag with unsupported majorVersion=");
                        sb.append(iZzs);
                        zzds.zzc("Id3Decoder", sb.toString());
                    }
                    if (iZzs < 4) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    zzagfVar = new zzagf(iZzs, z7, iZzG);
                } else if ((iZzs2 & 64) != 0) {
                    zzds.zzc("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZzs < 4 || (iZzs2 & 128) == 0) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    zzagfVar = new zzagf(iZzs, z7, iZzG);
                }
                if (zzagfVar == null) {
                    return null;
                }
                int iZzg = zzefVar.zzg();
                i8 = zzagfVar.zza() == 2 ? 6 : 10;
                zZzb = zzagfVar.zzb();
                iZzc = zzagfVar.zzc();
                if (zZzb) {
                    iZzc = zze(zzefVar, zzagfVar.zzc());
                }
                zzefVar.zzf(iZzg + iZzc);
                if (!zzb(zzefVar, zzagfVar.zza(), i8, false)) {
                    if (zzagfVar.zza() == 4 || !zzb(zzefVar, 4, i8, true)) {
                        int iZza = zzagfVar.zza();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 45);
                        sb2.append("Failed to validate ID3 tag with majorVersion=");
                        sb2.append(iZza);
                        zzds.zzc("Id3Decoder", sb2.toString());
                        return null;
                    }
                    z8 = true;
                }
                while (zzefVar.zzd() >= i8) {
                    zzaghVarZzc = zzc(zzagfVar.zza(), zzefVar, z8, i8, zzagdVar);
                    if (zzaghVarZzc != null) {
                        arrayList.add(zzaghVarZzc);
                    }
                }
                return new zzao(arrayList);
            }
            zzds.zzc("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iZzx))));
        }
        zzagfVar = null;
        if (zzagfVar == null) {
            return null;
        }
        int iZzg2 = zzefVar.zzg();
        if (zzagfVar.zza() == 2) {
        }
        zZzb = zzagfVar.zzb();
        iZzc = zzagfVar.zzc();
        if (zZzb) {
            iZzc = zze(zzefVar, zzagfVar.zzc());
        }
        zzefVar.zzf(iZzg2 + iZzc);
        if (!zzb(zzefVar, zzagfVar.zza(), i8, false)) {
            if (zzagfVar.zza() == 4) {
            }
            int iZza2 = zzagfVar.zza();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZza2).length() + 45);
            sb3.append("Failed to validate ID3 tag with majorVersion=");
            sb3.append(iZza2);
            zzds.zzc("Id3Decoder", sb3.toString());
            return null;
        }
        while (zzefVar.zzd() >= i8) {
            zzaghVarZzc = zzc(zzagfVar.zza(), zzefVar, z8, i8, zzagdVar);
            if (zzaghVarZzc != null) {
                arrayList.add(zzaghVarZzc);
            }
        }
        return new zzao(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    private static boolean zzb(zzef zzefVar, int i7, int i8, boolean z7) {
        boolean z8;
        int iZzx;
        long jZzx;
        int iZzt;
        int i9;
        int iZzg = zzefVar.zzg();
        while (true) {
            try {
                z8 = true;
                z8 = true;
                int i10 = 1;
                int i11 = 1;
                if (zzefVar.zzd() >= i8) {
                    if (i7 >= 3) {
                        iZzx = zzefVar.zzB();
                        jZzx = zzefVar.zzz();
                        iZzt = zzefVar.zzt();
                    } else {
                        iZzx = zzefVar.zzx();
                        jZzx = zzefVar.zzx();
                        iZzt = 0;
                    }
                    if (iZzx != 0 || jZzx != 0 || iZzt != 0) {
                        if (i7 != 4 || z7) {
                            if (i7 == 4) {
                                if ((iZzt & 64) != 0) {
                                    i10 = 0;
                                }
                                int i12 = i10;
                                i11 = iZzt & 1;
                                i9 = i12;
                            } else if (i7 == 3) {
                                if ((iZzt & 32) != 0) {
                                    i9 = 1;
                                } else {
                                    i9 = 0;
                                }
                                if ((iZzt & 128) != 0) {
                                    i11 = 0;
                                }
                            } else {
                                i9 = 0;
                                i11 = 0;
                            }
                            if (i11 != 0) {
                                i9 += 4;
                            }
                            if (jZzx >= i9 && zzefVar.zzd() >= jZzx) {
                                zzefVar.zzk((int) jZzx);
                            }
                        } else if ((8421504 & jZzx) == 0) {
                            long j7 = ((jZzx >> 16) & 255) << 14;
                            jZzx = ((jZzx >> 24) << 21) | j7 | (jZzx & 255) | (((jZzx >> 8) & 255) << 7);
                            if (i7 == 4) {
                                if ((iZzt & 64) != 0) {
                                    i10 = 0;
                                }
                                int i13 = i10;
                                i11 = iZzt & 1;
                                i9 = i13;
                            } else if (i7 == 3) {
                                if ((iZzt & 32) != 0) {
                                    i9 = 1;
                                } else {
                                    i9 = 0;
                                }
                                if ((iZzt & 128) != 0) {
                                    i11 = 0;
                                }
                            } else {
                                i9 = 0;
                                i11 = 0;
                            }
                            if (i11 != 0) {
                                i9 += 4;
                            }
                            if (jZzx >= i9) {
                                zzefVar.zzk((int) jZzx);
                            }
                        }
                        z8 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th) {
                zzefVar.zzh(iZzg);
                throw th;
            }
        }
        zzefVar.zzh(iZzg);
        return z8;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0278  */
    /* JADX WARN: Code duplicated, block: B:148:0x027c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0283  */
    /* JADX WARN: Code duplicated, block: B:153:0x0287  */
    /* JADX WARN: Code duplicated, block: B:155:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x02a7 A[Catch: all -> 0x013e, Exception -> 0x0262, OutOfMemoryError -> 0x0267, TRY_LEAVE, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x03a3, B:200:0x03b4, B:201:0x03bc, B:203:0x03c2, B:205:0x03c9, B:206:0x03cd, B:214:0x03ee, B:218:0x0419, B:220:0x0424, B:221:0x045a, B:222:0x0467, B:224:0x046d, B:226:0x0474, B:227:0x0478, B:231:0x048e, B:239:0x04a1, B:241:0x04cb, B:242:0x04da, B:243:0x04e5), top: B:256:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:164:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02cf A[Catch: all -> 0x013e, Exception -> 0x02c9, OutOfMemoryError -> 0x02cc, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x03a3, B:200:0x03b4, B:201:0x03bc, B:203:0x03c2, B:205:0x03c9, B:206:0x03cd, B:214:0x03ee, B:218:0x0419, B:220:0x0424, B:221:0x045a, B:222:0x0467, B:224:0x046d, B:226:0x0474, B:227:0x0478, B:231:0x048e, B:239:0x04a1, B:241:0x04cb, B:242:0x04da, B:243:0x04e5), top: B:256:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:172:0x02e9 A[Catch: all -> 0x013e, Exception -> 0x02c9, OutOfMemoryError -> 0x02cc, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x03a3, B:200:0x03b4, B:201:0x03bc, B:203:0x03c2, B:205:0x03c9, B:206:0x03cd, B:214:0x03ee, B:218:0x0419, B:220:0x0424, B:221:0x045a, B:222:0x0467, B:224:0x046d, B:226:0x0474, B:227:0x0478, B:231:0x048e, B:239:0x04a1, B:241:0x04cb, B:242:0x04da, B:243:0x04e5), top: B:256:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:173:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:178:0x031b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0362 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x0364  */
    /* JADX WARN: Code duplicated, block: B:208:0x03e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:232:0x0493 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x0495  */
    /* JADX WARN: Code duplicated, block: B:250:0x0506  */
    private static zzagh zzc(int i7, zzef zzefVar, boolean z7, int i8, zzagd zzagdVar) {
        int iZzH;
        int i9;
        int i10;
        boolean z8;
        boolean z9;
        zzagh zzaghVar;
        int i11;
        zzagh zzafyVar;
        zzagh zzagkVar;
        zzagh zzagbVar;
        byte[] bArr;
        int iZzi;
        String strZza;
        String strConcat;
        int iZzs = zzefVar.zzs();
        int iZzs2 = zzefVar.zzs();
        int iZzs3 = zzefVar.zzs();
        int iZzs4 = i7 >= 3 ? zzefVar.zzs() : 0;
        if (i7 == 4) {
            iZzH = zzefVar.zzH();
            if (!z7) {
                iZzH = ((iZzH >> 24) << 21) | (iZzH & 255) | (((iZzH >> 8) & 255) << 7) | (((iZzH >> 16) & 255) << 14);
            }
        } else {
            iZzH = i7 == 3 ? zzefVar.zzH() : zzefVar.zzx();
        }
        int iZzt = i7 >= 3 ? zzefVar.zzt() : 0;
        if (iZzs == 0 && iZzs2 == 0 && iZzs3 == 0 && iZzs4 == 0 && iZzH == 0 && iZzt == 0) {
            zzefVar.zzh(zzefVar.zze());
            return null;
        }
        int iZzg = zzefVar.zzg() + iZzH;
        String str = "Id3Decoder";
        if (iZzg > zzefVar.zze()) {
            zzds.zzc("Id3Decoder", "Frame size exceeds remaining tag data");
            zzefVar.zzh(zzefVar.zze());
            return null;
        }
        if (zzagdVar != null) {
            zzefVar.zzh(iZzg);
            return null;
        }
        if (i7 == 3) {
            int i12 = iZzt & 64;
            i9 = (iZzt & 128) != 0 ? 1 : 0;
            iZzs = 0;
            z9 = i12 != 0;
            z8 = (iZzt & 32) != 0;
            i10 = i9;
        } else if (i7 == 4) {
            boolean z10 = (iZzt & 64) != 0;
            int i13 = (iZzt & 8) != 0 ? 1 : 0;
            z9 = (iZzt & 4) != 0;
            iZzs = (iZzt & 2) != 0 ? 1 : 0;
            i10 = iZzt & 1;
            int i14 = i13;
            z8 = z10;
            i9 = i14;
        } else {
            i9 = 0;
            i10 = 0;
            z8 = false;
            z9 = false;
            iZzs = 0;
        }
        if (i9 != 0 || z9) {
            zzds.zzc("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzefVar.zzh(iZzg);
            return null;
        }
        if (z8) {
            zzefVar.zzk(1);
            iZzH--;
        }
        if (i10 != 0) {
            zzefVar.zzk(4);
            iZzH -= 4;
        }
        if (iZzs != 0) {
            iZzH = zze(zzefVar, iZzH);
        }
        try {
            try {
                if (iZzs == 84 && iZzs2 == 88 && iZzs3 == 88 && (i7 == 2 || iZzs4 == 88)) {
                    if (iZzH <= 0) {
                        iZzs = iZzs;
                        str = "Id3Decoder";
                        zzagbVar = null;
                    } else {
                        int iZzs5 = zzefVar.zzs();
                        int i15 = iZzH - 1;
                        byte[] bArr2 = new byte[i15];
                        zzefVar.zzm(bArr2, 0, i15);
                        int iZzh = zzh(bArr2, 0, iZzs5);
                        zzagbVar = new zzagm("TXXX", new String(bArr2, 0, iZzh, zzf(iZzs5)), zzd(bArr2, iZzs5, iZzh + zzj(iZzs5)));
                        str = "Id3Decoder";
                    }
                } else if (iZzs == 84) {
                    String strZzg = zzg(i7, 84, iZzs2, iZzs3, iZzs4);
                    if (iZzH <= 0) {
                        iZzs = iZzs;
                        str = "Id3Decoder";
                        zzagbVar = null;
                    } else {
                        int iZzs6 = zzefVar.zzs();
                        int i16 = iZzH - 1;
                        byte[] bArr3 = new byte[i16];
                        zzefVar.zzm(bArr3, 0, i16);
                        zzagbVar = new zzagm(strZzg, null, zzd(bArr3, iZzs6, 0));
                        str = "Id3Decoder";
                    }
                } else {
                    if (iZzs == 87) {
                        if (iZzs2 != 88 || iZzs3 != 88 || (i7 != 2 && iZzs4 != 88)) {
                            i11 = 87;
                        }
                        if (iZzH <= 0) {
                            iZzs = iZzs;
                            str = "Id3Decoder";
                            zzagbVar = null;
                        } else {
                            int iZzs7 = zzefVar.zzs();
                            int i17 = iZzH - 1;
                            byte[] bArr4 = new byte[i17];
                            zzefVar.zzm(bArr4, 0, i17);
                            int iZzh2 = zzh(bArr4, 0, iZzs7);
                            String str2 = new String(bArr4, 0, iZzh2, zzf(iZzs7));
                            int iZzj = iZzh2 + zzj(iZzs7);
                            zzagbVar = new zzagn("WXXX", str2, zzl(bArr4, iZzj, zzi(bArr4, iZzj), StandardCharsets.ISO_8859_1));
                            str = "Id3Decoder";
                        }
                    } else {
                        i11 = iZzs;
                    }
                    if (i11 == 87) {
                        String strZzg2 = zzg(i7, 87, iZzs2, iZzs3, iZzs4);
                        byte[] bArr5 = new byte[iZzH];
                        zzefVar.zzm(bArr5, 0, iZzH);
                        zzagbVar = new zzagn(strZzg2, null, new String(bArr5, 0, zzi(bArr5, 0), StandardCharsets.ISO_8859_1));
                    } else {
                        if (i11 == 80) {
                            if (iZzs2 == 82 && iZzs3 == 73 && iZzs4 == 86) {
                                byte[] bArr6 = new byte[iZzH];
                                zzefVar.zzm(bArr6, 0, iZzH);
                                int iZzi2 = zzi(bArr6, 0);
                                zzagbVar = new zzagl(new String(bArr6, 0, iZzi2, StandardCharsets.ISO_8859_1), zzk(bArr6, iZzi2 + 1, iZzH));
                            } else {
                                i11 = 80;
                            }
                        }
                        try {
                            if (i11 != 71) {
                                try {
                                    if (i7 != 2) {
                                        if (i11 != 65 && iZzs2 == 80 && iZzs3 == 73 && iZzs4 == 67) {
                                            int iZzs8 = zzefVar.zzs();
                                            Charset charsetZzf = zzf(iZzs8);
                                            int i18 = iZzH - 1;
                                            bArr = new byte[i18];
                                            zzefVar.zzm(bArr, 0, i18);
                                            if (i7 == 2) {
                                                iZzs = iZzs;
                                                strConcat = "image/".concat(String.valueOf(zzggj.zza(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                                if ("image/jpg".equals(strConcat)) {
                                                    strConcat = "image/jpeg";
                                                }
                                                iZzi = 2;
                                            } else {
                                                iZzs = iZzs;
                                                iZzi = zzi(bArr, 0);
                                                strZza = zzggj.zza(new String(bArr, 0, iZzi, StandardCharsets.ISO_8859_1));
                                                if (strZza.indexOf(47) == -1) {
                                                    strConcat = "image/".concat(strZza);
                                                } else {
                                                    strConcat = strZza;
                                                }
                                            }
                                            int i19 = bArr[iZzi + 1] & 255;
                                            int i20 = iZzi + 2;
                                            int iZzh3 = zzh(bArr, i20, iZzs8);
                                            zzafyVar = new zzafx(strConcat, new String(bArr, i20, iZzh3 - i20, charsetZzf), i19, zzk(bArr, iZzh3 + zzj(iZzs8), i18));
                                        } else {
                                            iZzs = iZzs;
                                            if (i11 == 67) {
                                                if (i11 != 67) {
                                                    if (i11 != 67) {
                                                        if (i11 != 77) {
                                                        }
                                                        String strZzg3 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr7 = new byte[iZzH];
                                                        zzefVar.zzm(bArr7, 0, iZzH);
                                                        zzafyVar = new zzafy(strZzg3, bArr7);
                                                    } else {
                                                        if (i11 != 77) {
                                                        }
                                                        String strZzg4 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr8 = new byte[iZzH];
                                                        zzefVar.zzm(bArr8, 0, iZzH);
                                                        zzafyVar = new zzafy(strZzg4, bArr8);
                                                    }
                                                } else if (i11 != 67) {
                                                    if (i11 != 77) {
                                                    }
                                                    String strZzg5 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr9 = new byte[iZzH];
                                                    zzefVar.zzm(bArr9, 0, iZzH);
                                                    zzafyVar = new zzafy(strZzg5, bArr9);
                                                } else {
                                                    if (i11 != 77) {
                                                    }
                                                    String strZzg6 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr10 = new byte[iZzH];
                                                    zzefVar.zzm(bArr10, 0, iZzH);
                                                    zzafyVar = new zzafy(strZzg6, bArr10);
                                                }
                                                zzagbVar = zzagkVar;
                                            } else {
                                                if (i11 != 67) {
                                                    if (i11 != 67) {
                                                        if (i11 != 77) {
                                                        }
                                                        String strZzg7 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr11 = new byte[iZzH];
                                                        zzefVar.zzm(bArr11, 0, iZzH);
                                                        zzafyVar = new zzafy(strZzg7, bArr11);
                                                    } else {
                                                        if (i11 != 77) {
                                                        }
                                                        String strZzg8 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr12 = new byte[iZzH];
                                                        zzefVar.zzm(bArr12, 0, iZzH);
                                                        zzafyVar = new zzafy(strZzg8, bArr12);
                                                    }
                                                } else if (i11 != 67) {
                                                    if (i11 != 77) {
                                                    }
                                                    String strZzg9 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr13 = new byte[iZzH];
                                                    zzefVar.zzm(bArr13, 0, iZzH);
                                                    zzafyVar = new zzafy(strZzg9, bArr13);
                                                } else {
                                                    if (i11 != 77) {
                                                    }
                                                    String strZzg10 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr14 = new byte[iZzH];
                                                    zzefVar.zzm(bArr14, 0, iZzH);
                                                    zzafyVar = new zzafy(strZzg10, bArr14);
                                                }
                                                zzagbVar = zzagkVar;
                                            }
                                        }
                                        zzagbVar = zzafyVar;
                                    } else if (i11 != 80 && iZzs2 == 73 && iZzs3 == 67) {
                                        int iZzs9 = zzefVar.zzs();
                                        Charset charsetZzf2 = zzf(iZzs9);
                                        int i110 = iZzH - 1;
                                        bArr = new byte[i110];
                                        zzefVar.zzm(bArr, 0, i110);
                                        if (i7 == 2) {
                                            iZzs = iZzs;
                                            strConcat = "image/".concat(String.valueOf(zzggj.zza(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                            if ("image/jpg".equals(strConcat)) {
                                                strConcat = "image/jpeg";
                                            }
                                            iZzi = 2;
                                        } else {
                                            iZzs = iZzs;
                                            iZzi = zzi(bArr, 0);
                                            strZza = zzggj.zza(new String(bArr, 0, iZzi, StandardCharsets.ISO_8859_1));
                                            if (strZza.indexOf(47) == -1) {
                                                strConcat = "image/".concat(strZza);
                                            } else {
                                                strConcat = strZza;
                                            }
                                        }
                                        int i111 = bArr[iZzi + 1] & 255;
                                        int i21 = iZzi + 2;
                                        int iZzh4 = zzh(bArr, i21, iZzs9);
                                        zzafyVar = new zzafx(strConcat, new String(bArr, i21, iZzh4 - i21, charsetZzf2), i111, zzk(bArr, iZzh4 + zzj(iZzs9), i110));
                                        zzagbVar = zzafyVar;
                                    } else {
                                        iZzs = iZzs;
                                        if (i11 == 67 || iZzs2 != 79 || iZzs3 != 77 || (iZzs4 != 77 && i7 != 2)) {
                                            if (i11 != 67 && iZzs2 == 72 && iZzs3 == 65 && iZzs4 == 80) {
                                                int iZzg2 = zzefVar.zzg();
                                                int iZzi3 = zzi(zzefVar.zzi(), iZzg2);
                                                String str3 = new String(zzefVar.zzi(), iZzg2, iZzi3 - iZzg2, StandardCharsets.ISO_8859_1);
                                                zzefVar.zzh(iZzi3 + 1);
                                                int iZzB = zzefVar.zzB();
                                                int iZzB2 = zzefVar.zzB();
                                                long jZzz = zzefVar.zzz();
                                                if (jZzz == 4294967295L) {
                                                    jZzz = -1;
                                                }
                                                long j7 = jZzz;
                                                long jZzz2 = zzefVar.zzz();
                                                if (jZzz2 == 4294967295L) {
                                                    jZzz2 = -1;
                                                }
                                                long j8 = jZzz2;
                                                ArrayList arrayList = new ArrayList();
                                                int i22 = iZzg2 + iZzH;
                                                while (zzefVar.zzg() < i22) {
                                                    zzagh zzaghVarZzc = zzc(i7, zzefVar, z7, i8, null);
                                                    if (zzaghVarZzc != null) {
                                                        arrayList.add(zzaghVarZzc);
                                                    }
                                                }
                                                zzagkVar = new zzafz(str3, iZzB, iZzB2, j7, j8, (zzagh[]) arrayList.toArray(new zzagh[0]));
                                            } else if (i11 != 67 && iZzs2 == 84 && iZzs3 == 79 && iZzs4 == 67) {
                                                int iZzg3 = zzefVar.zzg();
                                                int iZzi4 = zzi(zzefVar.zzi(), iZzg3);
                                                String str4 = new String(zzefVar.zzi(), iZzg3, iZzi4 - iZzg3, StandardCharsets.ISO_8859_1);
                                                zzefVar.zzh(iZzi4 + 1);
                                                int iZzs10 = zzefVar.zzs();
                                                boolean z11 = (iZzs10 & 2) != 0;
                                                int i23 = iZzs10 & 1;
                                                int iZzs11 = zzefVar.zzs();
                                                String[] strArr = new String[iZzs11];
                                                int i24 = 0;
                                                while (i24 < iZzs11) {
                                                    int iZzg4 = zzefVar.zzg();
                                                    int i25 = iZzg3;
                                                    int iZzi5 = zzi(zzefVar.zzi(), iZzg4);
                                                    String[] strArr2 = strArr;
                                                    strArr2[i24] = new String(zzefVar.zzi(), iZzg4, iZzi5 - iZzg4, StandardCharsets.ISO_8859_1);
                                                    zzefVar.zzh(iZzi5 + 1);
                                                    i24++;
                                                    iZzg3 = i25;
                                                    iZzs11 = iZzs11;
                                                    str4 = str4;
                                                    strArr = strArr2;
                                                }
                                                int i26 = iZzg3;
                                                String str5 = str4;
                                                String[] strArr3 = strArr;
                                                ArrayList arrayList2 = new ArrayList();
                                                int i27 = i26 + iZzH;
                                                while (zzefVar.zzg() < i27) {
                                                    zzagh zzaghVarZzc2 = zzc(i7, zzefVar, z7, i8, null);
                                                    if (zzaghVarZzc2 != null) {
                                                        arrayList2.add(zzaghVarZzc2);
                                                    }
                                                }
                                                zzagkVar = new zzaga(str5, z11, 1 == i23, strArr3, (zzagh[]) arrayList2.toArray(new zzagh[0]));
                                            } else if (i11 != 77 && iZzs2 == 76 && iZzs3 == 76 && iZzs4 == 84) {
                                                int iZzt2 = zzefVar.zzt();
                                                int iZzx = zzefVar.zzx();
                                                int iZzx2 = zzefVar.zzx();
                                                int iZzs12 = zzefVar.zzs();
                                                int iZzs13 = zzefVar.zzs();
                                                zzee zzeeVar = new zzee();
                                                zzeeVar.zza(zzefVar);
                                                int i28 = ((iZzH - 10) * 8) / (iZzs12 + iZzs13);
                                                int[] iArr = new int[i28];
                                                int[] iArr2 = new int[i28];
                                                for (int i29 = 0; i29 < i28; i29++) {
                                                    int iZzj2 = zzeeVar.zzj(iZzs12);
                                                    int iZzj3 = zzeeVar.zzj(iZzs13);
                                                    iArr[i29] = iZzj2;
                                                    iArr2[i29] = iZzj3;
                                                }
                                                zzagkVar = new zzagk(iZzt2, iZzx, iZzx2, iArr, iArr2);
                                            } else {
                                                String strZzg11 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr15 = new byte[iZzH];
                                                zzefVar.zzm(bArr15, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg11, bArr15);
                                                zzagbVar = zzafyVar;
                                            }
                                            zzagbVar = zzagkVar;
                                        } else if (iZzH < 4) {
                                            zzagbVar = null;
                                        } else {
                                            int iZzs14 = zzefVar.zzs();
                                            Charset charsetZzf3 = zzf(iZzs14);
                                            byte[] bArr16 = new byte[3];
                                            zzefVar.zzm(bArr16, 0, 3);
                                            String str6 = new String(bArr16, 0, 3);
                                            int i30 = iZzH - 4;
                                            byte[] bArr17 = new byte[i30];
                                            zzefVar.zzm(bArr17, 0, i30);
                                            int iZzh5 = zzh(bArr17, 0, iZzs14);
                                            String str7 = new String(bArr17, 0, iZzh5, charsetZzf3);
                                            int iZzj4 = iZzh5 + zzj(iZzs14);
                                            zzagbVar = new zzagb(str6, str7, zzl(bArr17, iZzj4, zzh(bArr17, iZzj4, iZzs14), charsetZzf3));
                                        }
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    zzefVar.zzh(iZzg);
                                    zzaghVar = null;
                                } catch (OutOfMemoryError e8) {
                                    e = e8;
                                    zzefVar.zzh(iZzg);
                                    zzaghVar = null;
                                }
                                if (zzaghVar == null) {
                                    String strZzg12 = zzg(i7, iZzs, iZzs2, iZzs3, iZzs4);
                                    StringBuilder sb = new StringBuilder(String.valueOf(strZzg12).length() + 39 + String.valueOf(iZzH).length());
                                    sb.append("Failed to decode frame: id=");
                                    sb.append(strZzg12);
                                    sb.append(", frameSize=");
                                    sb.append(iZzH);
                                    zzds.zzd(str, sb.toString(), e);
                                }
                                return zzaghVar;
                            }
                            if (iZzs2 != 69 || iZzs3 != 79) {
                                i11 = 71;
                                if (i7 != 2) {
                                    if (i11 != 80) {
                                    }
                                    iZzs = iZzs;
                                    if (i11 == 67) {
                                        if (i11 != 67) {
                                            if (i11 != 67) {
                                                if (i11 != 77) {
                                                }
                                                String strZzg13 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr18 = new byte[iZzH];
                                                zzefVar.zzm(bArr18, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg13, bArr18);
                                                zzagbVar = zzafyVar;
                                            } else {
                                                if (i11 != 77) {
                                                }
                                                String strZzg14 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr19 = new byte[iZzH];
                                                zzefVar.zzm(bArr19, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg14, bArr19);
                                                zzagbVar = zzafyVar;
                                            }
                                        } else if (i11 != 67) {
                                            if (i11 != 77) {
                                            }
                                            String strZzg15 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr110 = new byte[iZzH];
                                            zzefVar.zzm(bArr110, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg15, bArr110);
                                            zzagbVar = zzafyVar;
                                        } else {
                                            if (i11 != 77) {
                                            }
                                            String strZzg16 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr111 = new byte[iZzH];
                                            zzefVar.zzm(bArr111, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg16, bArr111);
                                            zzagbVar = zzafyVar;
                                        }
                                        zzagbVar = zzagkVar;
                                    } else {
                                        if (i11 != 67) {
                                            if (i11 != 67) {
                                                if (i11 != 77) {
                                                }
                                                String strZzg17 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr112 = new byte[iZzH];
                                                zzefVar.zzm(bArr112, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg17, bArr112);
                                                zzagbVar = zzafyVar;
                                            } else {
                                                if (i11 != 77) {
                                                }
                                                String strZzg18 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr113 = new byte[iZzH];
                                                zzefVar.zzm(bArr113, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg18, bArr113);
                                                zzagbVar = zzafyVar;
                                            }
                                        } else if (i11 != 67) {
                                            if (i11 != 77) {
                                            }
                                            String strZzg19 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr114 = new byte[iZzH];
                                            zzefVar.zzm(bArr114, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg19, bArr114);
                                            zzagbVar = zzafyVar;
                                        } else {
                                            if (i11 != 77) {
                                            }
                                            String strZzg110 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr115 = new byte[iZzH];
                                            zzefVar.zzm(bArr115, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg110, bArr115);
                                            zzagbVar = zzafyVar;
                                        }
                                        zzagbVar = zzagkVar;
                                    }
                                } else {
                                    if (i11 != 65) {
                                    }
                                    iZzs = iZzs;
                                    if (i11 == 67) {
                                        if (i11 != 67) {
                                            if (i11 != 67) {
                                                if (i11 != 77) {
                                                }
                                                String strZzg111 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr116 = new byte[iZzH];
                                                zzefVar.zzm(bArr116, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg111, bArr116);
                                                zzagbVar = zzafyVar;
                                            } else {
                                                if (i11 != 77) {
                                                }
                                                String strZzg112 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr117 = new byte[iZzH];
                                                zzefVar.zzm(bArr117, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg112, bArr117);
                                                zzagbVar = zzafyVar;
                                            }
                                        } else if (i11 != 67) {
                                            if (i11 != 77) {
                                            }
                                            String strZzg113 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr118 = new byte[iZzH];
                                            zzefVar.zzm(bArr118, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg113, bArr118);
                                            zzagbVar = zzafyVar;
                                        } else {
                                            if (i11 != 77) {
                                            }
                                            String strZzg114 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr119 = new byte[iZzH];
                                            zzefVar.zzm(bArr119, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg114, bArr119);
                                            zzagbVar = zzafyVar;
                                        }
                                        zzagbVar = zzagkVar;
                                    } else {
                                        if (i11 != 67) {
                                            if (i11 != 67) {
                                                if (i11 != 77) {
                                                }
                                                String strZzg115 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1110 = new byte[iZzH];
                                                zzefVar.zzm(bArr1110, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg115, bArr1110);
                                                zzagbVar = zzafyVar;
                                            } else {
                                                if (i11 != 77) {
                                                }
                                                String strZzg116 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1111 = new byte[iZzH];
                                                zzefVar.zzm(bArr1111, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg116, bArr1111);
                                                zzagbVar = zzafyVar;
                                            }
                                        } else if (i11 != 67) {
                                            if (i11 != 77) {
                                            }
                                            String strZzg117 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1112 = new byte[iZzH];
                                            zzefVar.zzm(bArr1112, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg117, bArr1112);
                                            zzagbVar = zzafyVar;
                                        } else {
                                            if (i11 != 77) {
                                            }
                                            String strZzg118 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1113 = new byte[iZzH];
                                            zzefVar.zzm(bArr1113, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg118, bArr1113);
                                            zzagbVar = zzafyVar;
                                        }
                                        zzagbVar = zzagkVar;
                                    }
                                }
                                if (zzaghVar == null) {
                                    String strZzg119 = zzg(i7, iZzs, iZzs2, iZzs3, iZzs4);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZzg119).length() + 39 + String.valueOf(iZzH).length());
                                    sb2.append("Failed to decode frame: id=");
                                    sb2.append(strZzg119);
                                    sb2.append(", frameSize=");
                                    sb2.append(iZzH);
                                    zzds.zzd(str, sb2.toString(), e);
                                }
                                return zzaghVar;
                            }
                            if (iZzs4 != 66 && i7 != 2) {
                                i11 = 71;
                                if (i7 != 2) {
                                    if (i11 != 80) {
                                    }
                                    iZzs = iZzs;
                                    if (i11 == 67) {
                                        if (i11 != 67) {
                                            if (i11 != 67) {
                                                if (i11 != 77) {
                                                }
                                                String strZzg1110 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1114 = new byte[iZzH];
                                                zzefVar.zzm(bArr1114, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg1110, bArr1114);
                                                zzagbVar = zzafyVar;
                                            } else {
                                                if (i11 != 77) {
                                                }
                                                String strZzg1111 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1115 = new byte[iZzH];
                                                zzefVar.zzm(bArr1115, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg1111, bArr1115);
                                                zzagbVar = zzafyVar;
                                            }
                                        } else if (i11 != 67) {
                                            if (i11 != 77) {
                                            }
                                            String strZzg1112 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1116 = new byte[iZzH];
                                            zzefVar.zzm(bArr1116, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg1112, bArr1116);
                                            zzagbVar = zzafyVar;
                                        } else {
                                            if (i11 != 77) {
                                            }
                                            String strZzg1113 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1117 = new byte[iZzH];
                                            zzefVar.zzm(bArr1117, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg1113, bArr1117);
                                            zzagbVar = zzafyVar;
                                        }
                                        zzagbVar = zzagkVar;
                                    } else {
                                        if (i11 != 67) {
                                            if (i11 != 67) {
                                                if (i11 != 77) {
                                                }
                                                String strZzg1114 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1118 = new byte[iZzH];
                                                zzefVar.zzm(bArr1118, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg1114, bArr1118);
                                                zzagbVar = zzafyVar;
                                            } else {
                                                if (i11 != 77) {
                                                }
                                                String strZzg1115 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1119 = new byte[iZzH];
                                                zzefVar.zzm(bArr1119, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg1115, bArr1119);
                                                zzagbVar = zzafyVar;
                                            }
                                        } else if (i11 != 67) {
                                            if (i11 != 77) {
                                            }
                                            String strZzg1116 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11110 = new byte[iZzH];
                                            zzefVar.zzm(bArr11110, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg1116, bArr11110);
                                            zzagbVar = zzafyVar;
                                        } else {
                                            if (i11 != 77) {
                                            }
                                            String strZzg1117 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11111 = new byte[iZzH];
                                            zzefVar.zzm(bArr11111, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg1117, bArr11111);
                                            zzagbVar = zzafyVar;
                                        }
                                        zzagbVar = zzagkVar;
                                    }
                                } else {
                                    if (i11 != 65) {
                                    }
                                    iZzs = iZzs;
                                    if (i11 == 67) {
                                        if (i11 != 67) {
                                            if (i11 != 67) {
                                                if (i11 != 77) {
                                                }
                                                String strZzg1118 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11112 = new byte[iZzH];
                                                zzefVar.zzm(bArr11112, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg1118, bArr11112);
                                                zzagbVar = zzafyVar;
                                            } else {
                                                if (i11 != 77) {
                                                }
                                                String strZzg1119 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11113 = new byte[iZzH];
                                                zzefVar.zzm(bArr11113, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg1119, bArr11113);
                                                zzagbVar = zzafyVar;
                                            }
                                        } else if (i11 != 67) {
                                            if (i11 != 77) {
                                            }
                                            String strZzg11110 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11114 = new byte[iZzH];
                                            zzefVar.zzm(bArr11114, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg11110, bArr11114);
                                            zzagbVar = zzafyVar;
                                        } else {
                                            if (i11 != 77) {
                                            }
                                            String strZzg11111 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11115 = new byte[iZzH];
                                            zzefVar.zzm(bArr11115, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg11111, bArr11115);
                                            zzagbVar = zzafyVar;
                                        }
                                        zzagbVar = zzagkVar;
                                    } else {
                                        if (i11 != 67) {
                                            if (i11 != 67) {
                                                if (i11 != 77) {
                                                }
                                                String strZzg11112 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11116 = new byte[iZzH];
                                                zzefVar.zzm(bArr11116, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg11112, bArr11116);
                                                zzagbVar = zzafyVar;
                                            } else {
                                                if (i11 != 77) {
                                                }
                                                String strZzg11113 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11117 = new byte[iZzH];
                                                zzefVar.zzm(bArr11117, 0, iZzH);
                                                zzafyVar = new zzafy(strZzg11113, bArr11117);
                                                zzagbVar = zzafyVar;
                                            }
                                        } else if (i11 != 67) {
                                            if (i11 != 77) {
                                            }
                                            String strZzg11114 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11118 = new byte[iZzH];
                                            zzefVar.zzm(bArr11118, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg11114, bArr11118);
                                            zzagbVar = zzafyVar;
                                        } else {
                                            if (i11 != 77) {
                                            }
                                            String strZzg11115 = zzg(i7, i11, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11119 = new byte[iZzH];
                                            zzefVar.zzm(bArr11119, 0, iZzH);
                                            zzafyVar = new zzafy(strZzg11115, bArr11119);
                                            zzagbVar = zzafyVar;
                                        }
                                        zzagbVar = zzagkVar;
                                    }
                                }
                                if (zzaghVar == null) {
                                    String strZzg1120 = zzg(i7, iZzs, iZzs2, iZzs3, iZzs4);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(strZzg1120).length() + 39 + String.valueOf(iZzH).length());
                                    sb3.append("Failed to decode frame: id=");
                                    sb3.append(strZzg1120);
                                    sb3.append(", frameSize=");
                                    sb3.append(iZzH);
                                    zzds.zzd(str, sb3.toString(), e);
                                }
                                return zzaghVar;
                            }
                            try {
                                int iZzs15 = zzefVar.zzs();
                                Charset charsetZzf4 = zzf(iZzs15);
                                int i31 = iZzH - 1;
                                byte[] bArr20 = new byte[i31];
                                zzefVar.zzm(bArr20, 0, i31);
                                int iZzi6 = zzi(bArr20, 0);
                                str = "Id3Decoder";
                                String strZzi = zzar.zzi(new String(bArr20, 0, iZzi6, StandardCharsets.ISO_8859_1));
                                int i32 = iZzi6 + 1;
                                int iZzh6 = zzh(bArr20, i32, iZzs15);
                                String strZzl = zzl(bArr20, i32, iZzh6, charsetZzf4);
                                int iZzj5 = iZzh6 + zzj(iZzs15);
                                int iZzh7 = zzh(bArr20, iZzj5, iZzs15);
                                iZzs = iZzs;
                                zzagbVar = new zzagc(strZzi, strZzl, zzl(bArr20, iZzj5, iZzh7, charsetZzf4), zzk(bArr20, iZzh7 + zzj(iZzs15), i31));
                            } catch (Exception e9) {
                                e = e9;
                                str = "Id3Decoder";
                                iZzs = iZzs;
                                zzefVar.zzh(iZzg);
                                zzaghVar = null;
                            } catch (OutOfMemoryError e10) {
                                e = e10;
                                str = "Id3Decoder";
                                iZzs = iZzs;
                                zzefVar.zzh(iZzg);
                                zzaghVar = null;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        } catch (OutOfMemoryError e12) {
                            e = e12;
                        }
                    }
                    str = "Id3Decoder";
                }
                zzefVar.zzh(iZzg);
                zzaghVar = zzagbVar;
                e = null;
            } catch (Throwable th) {
                zzefVar.zzh(iZzg);
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            iZzs = iZzs;
            str = "Id3Decoder";
            zzefVar.zzh(iZzg);
            zzaghVar = null;
            if (zzaghVar == null) {
                String strZzg1121 = zzg(i7, iZzs, iZzs2, iZzs3, iZzs4);
                StringBuilder sb4 = new StringBuilder(String.valueOf(strZzg1121).length() + 39 + String.valueOf(iZzH).length());
                sb4.append("Failed to decode frame: id=");
                sb4.append(strZzg1121);
                sb4.append(", frameSize=");
                sb4.append(iZzH);
                zzds.zzd(str, sb4.toString(), e);
            }
            return zzaghVar;
        } catch (OutOfMemoryError e14) {
            e = e14;
            iZzs = iZzs;
            str = "Id3Decoder";
            zzefVar.zzh(iZzg);
            zzaghVar = null;
            if (zzaghVar == null) {
                String strZzg1122 = zzg(i7, iZzs, iZzs2, iZzs3, iZzs4);
                StringBuilder sb5 = new StringBuilder(String.valueOf(strZzg1122).length() + 39 + String.valueOf(iZzH).length());
                sb5.append("Failed to decode frame: id=");
                sb5.append(strZzg1122);
                sb5.append(", frameSize=");
                sb5.append(iZzH);
                zzds.zzd(str, sb5.toString(), e);
            }
            return zzaghVar;
        }
        if (zzaghVar == null) {
            String strZzg1123 = zzg(i7, iZzs, iZzs2, iZzs3, iZzs4);
            StringBuilder sb6 = new StringBuilder(String.valueOf(strZzg1123).length() + 39 + String.valueOf(iZzH).length());
            sb6.append("Failed to decode frame: id=");
            sb6.append(strZzg1123);
            sb6.append(", frameSize=");
            sb6.append(iZzH);
            zzds.zzd(str, sb6.toString(), e);
        }
        return zzaghVar;
    }

    private static zzgjz zzd(byte[] bArr, int i7, int i8) {
        if (i8 >= bArr.length) {
            return zzgjz.zzj("");
        }
        int i9 = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        int iZzh = zzh(bArr, i8, i7);
        while (i8 < iZzh) {
            zzgjwVar.zzf(new String(bArr, i8, iZzh - i8, zzf(i7)));
            i8 = zzj(i7) + iZzh;
            iZzh = zzh(bArr, i8, i7);
        }
        zzgjz zzgjzVarZzi = zzgjwVar.zzi();
        return zzgjzVarZzi.isEmpty() ? zzgjz.zzj("") : zzgjzVarZzi;
    }

    private static int zze(zzef zzefVar, int i7) {
        byte[] bArrZzi = zzefVar.zzi();
        int iZzg = zzefVar.zzg();
        int i8 = iZzg;
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= iZzg + i7) {
                return i7;
            }
            if ((bArrZzi[i8] & 255) == 255 && bArrZzi[i9] == 0) {
                System.arraycopy(bArrZzi, i8 + 2, bArrZzi, i9, (i7 - (i8 - iZzg)) - 2);
                i7--;
            }
            i8 = i9;
        }
    }

    private static Charset zzf(int i7) {
        if (i7 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i7 != 2) {
            return i7 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    private static String zzg(int i7, int i8, int i9, int i10, int i11) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private static int zzh(byte[] bArr, int i7, int i8) {
        int iZzi = zzi(bArr, i7);
        if (i8 == 0 || i8 == 3) {
            return iZzi;
        }
        while (true) {
            int length = bArr.length;
            if (iZzi >= length - 1) {
                return length;
            }
            int i9 = iZzi + 1;
            if ((iZzi - i7) % 2 == 0 && bArr[i9] == 0) {
                return iZzi;
            }
            iZzi = zzi(bArr, i9);
        }
    }

    private static int zzi(byte[] bArr, int i7) {
        while (true) {
            int length = bArr.length;
            if (i7 >= length) {
                return length;
            }
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
    }

    private static int zzj(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    private static byte[] zzk(byte[] bArr, int i7, int i8) {
        return i8 <= i7 ? zzeo.zzb : Arrays.copyOfRange(bArr, i7, i8);
    }

    private static String zzl(byte[] bArr, int i7, int i8, Charset charset) {
        return (i8 <= i7 || i8 > bArr.length) ? "" : new String(bArr, i7, i8 - i7, charset);
    }
}
