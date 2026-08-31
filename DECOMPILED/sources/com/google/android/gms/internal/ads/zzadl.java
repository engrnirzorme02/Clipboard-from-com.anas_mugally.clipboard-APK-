package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadl {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final String zzn;
    public final zzfi zzo;

    private zzadl(List list, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f7, int i19, String str, zzfi zzfiVar) {
        this.zza = list;
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = i15;
        this.zzi = i16;
        this.zzj = i17;
        this.zzk = i18;
        this.zzl = f7;
        this.zzm = i19;
        this.zzn = str;
        this.zzo = zzfiVar;
    }

    public static zzadl zza(zzef zzefVar) {
        return zzc(zzefVar, false, null);
    }

    public static zzadl zzb(zzef zzefVar, zzfi zzfiVar) {
        return zzc(zzefVar, true, zzfiVar);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0296  */
    /* JADX WARN: Code duplicated, block: B:116:0x0299  */
    /* JADX WARN: Code duplicated, block: B:39:0x0133 A[PHI: r34
      0x0133: PHI (r34v2 int) = (r34v0 int), (r34v0 int), (r34v0 int), (r34v0 int), (r34v3 int) binds: [B:41:0x013c, B:42:0x013e, B:96:0x023e, B:97:0x0240, B:38:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    private static zzadl zzc(zzef zzefVar, boolean z7, zzfi zzfiVar) throws zzas {
        boolean z8;
        boolean z9;
        String str;
        int i7;
        int i8;
        zzfe zzfeVar;
        int i9;
        int iMax;
        int i10;
        int iMax2;
        int i11;
        int i12;
        int i13 = 4;
        boolean z10 = true;
        if (z7) {
            try {
                zzefVar.zzk(4);
            } catch (ArrayIndexOutOfBoundsException e7) {
                e = e7;
                z9 = true;
                if (z9 != z7) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzas.zzb("Error parsing".concat(str), e);
            }
        } else {
            try {
                zzefVar.zzk(21);
            } catch (ArrayIndexOutOfBoundsException e8) {
                e = e8;
                z8 = z10;
                z9 = z8;
                if (z9 != z7) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzas.zzb("Error parsing".concat(str), e);
            }
        }
        int iZzs = zzefVar.zzs() & 3;
        int iZzs2 = zzefVar.zzs();
        int iZzg = zzefVar.zzg();
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < iZzs2; i16++) {
            zzefVar.zzk(1);
            int iZzt = zzefVar.zzt();
            for (int i17 = 0; i17 < iZzt; i17++) {
                int iZzt2 = zzefVar.zzt();
                i15 += iZzt2 + 4;
                zzefVar.zzk(iZzt2);
            }
        }
        zzefVar.zzh(iZzg);
        byte[] bArr = new byte[i15];
        zzfi zzfiVar2 = zzfiVar;
        int i18 = 0;
        float f7 = 1.0f;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        String strZzc = null;
        int i31 = 0;
        while (i31 < iZzs2) {
            int iZzs3 = zzefVar.zzs() & 63;
            int iZzt3 = zzefVar.zzt();
            z8 = z10;
            int i32 = i14;
            zzfi zzfiVarZze = zzfiVar2;
            while (i32 < iZzt3) {
                try {
                    int iZzt4 = zzefVar.zzt();
                    int i33 = i32;
                    System.arraycopy(zzfl.zza, i14, bArr, i18, i13);
                    int i34 = i18 + 4;
                    System.arraycopy(zzefVar.zzi(), zzefVar.zzg(), bArr, i34, iZzt4);
                    int i35 = 32;
                    if (iZzs3 == 32) {
                        if (i33 == 0) {
                            zzfiVarZze = zzfl.zze(bArr, i34, i34 + iZzt4);
                            i8 = i34;
                            i7 = iZzs;
                            i12 = 0;
                            i11 = 0;
                        }
                        i18 = i8 + iZzt4;
                        zzefVar.zzk(iZzt4);
                        i32 = i12 + 1;
                        i14 = i11;
                        iZzs = i7;
                        i13 = 4;
                    } else {
                        i35 = iZzs3;
                    }
                    i7 = iZzs;
                    if (i35 != 33) {
                        i8 = i34;
                        int i36 = 8;
                        if (i35 == 39 && i33 == 0) {
                            int i37 = i18 + 6;
                            int i38 = (i8 + iZzt4) - 1;
                            while (true) {
                                byte b7 = bArr[i38];
                                if (b7 != 0) {
                                    if (b7 == 0 || i38 <= i37) {
                                        break;
                                    }
                                    zzfm zzfmVar = new zzfm(bArr, i37, i38 + 1);
                                    while (true) {
                                        if (zzfmVar.zzd(16)) {
                                            int i39 = i36;
                                            int iZzf = zzfmVar.zzf(i39);
                                            int i40 = 0;
                                            while (iZzf == 255) {
                                                i40 += 255;
                                                iZzf = zzfmVar.zzf(i39);
                                            }
                                            int i41 = i40 + iZzf;
                                            int iZzf2 = zzfmVar.zzf(i39);
                                            int i42 = 0;
                                            while (iZzf2 == 255) {
                                                i42 += 255;
                                                iZzf2 = zzfmVar.zzf(8);
                                            }
                                            i36 = 8;
                                            int i43 = i42 + iZzf2;
                                            if (i43 == 0 || !zzfmVar.zzd(i43)) {
                                                break;
                                            }
                                            if (i41 == 176) {
                                                int iZzg2 = zzfmVar.zzg();
                                                boolean zZze = zzfmVar.zze();
                                                int iZzg3 = zZze ? zzfmVar.zzg() : 0;
                                                int iZzg4 = zzfmVar.zzg();
                                                int iZzg5 = -1;
                                                int iZzg6 = -1;
                                                int i44 = -1;
                                                int iZzf3 = -1;
                                                int i45 = -1;
                                                int iZzf4 = -1;
                                                int i46 = 0;
                                                while (true) {
                                                    if (i46 > iZzg4) {
                                                        zzfeVar = new zzfe(iZzg2, iZzg3, iZzg4 + 1, iZzg5, iZzg6, i44, iZzf3, i45, iZzf4);
                                                        break;
                                                    }
                                                    iZzg5 = zzfmVar.zzg();
                                                    iZzg6 = zzfmVar.zzg();
                                                    boolean z11 = zZze;
                                                    int iZzf5 = zzfmVar.zzf(6);
                                                    if (iZzf5 != 63) {
                                                        if (iZzf5 == 0) {
                                                            i9 = iZzf5;
                                                            iMax = Math.max(0, iZzg2 - 30);
                                                        } else {
                                                            i9 = iZzf5;
                                                            iMax = Math.max(0, (i9 + iZzg2) - 31);
                                                        }
                                                        iZzf3 = zzfmVar.zzf(iMax);
                                                        if (z11) {
                                                            int iZzf6 = zzfmVar.zzf(6);
                                                            if (iZzf6 != 63) {
                                                                if (iZzf6 == 0) {
                                                                    i10 = iZzf6;
                                                                    iMax2 = Math.max(0, iZzg3 - 30);
                                                                } else {
                                                                    i10 = iZzf6;
                                                                    iMax2 = Math.max(0, (i10 + iZzg3) - 31);
                                                                }
                                                                iZzf4 = zzfmVar.zzf(iMax2);
                                                                i45 = i10;
                                                            }
                                                        }
                                                        if (zzfmVar.zze()) {
                                                            zzfmVar.zzb(10);
                                                        }
                                                        i46++;
                                                        zZze = z11;
                                                        i44 = i9;
                                                    }
                                                }
                                            } else {
                                                zzfmVar.zzb(i43 * 8);
                                            }
                                        }
                                    }
                                } else if (i38 > i37) {
                                    i38--;
                                }
                                zzfeVar = null;
                                break;
                            }
                            if (zzfeVar == null || zzfiVarZze == null) {
                                i11 = 0;
                            } else {
                                i11 = 0;
                                if (zzfeVar.zza == ((zzey) zzfiVarZze.zza.get(0)).zzb) {
                                    i12 = i33;
                                    i29 = 4;
                                } else {
                                    i29 = 5;
                                }
                            }
                            i12 = i33;
                        } else {
                            i11 = 0;
                            i12 = i33;
                        }
                    } else if (i33 == 0) {
                        zzff zzffVarZzf = zzfl.zzf(bArr, i34, i34 + iZzt4, zzfiVarZze);
                        int i47 = zzffVarZzf.zza + 1;
                        int i48 = zzffVarZzf.zze;
                        int i49 = zzffVarZzf.zzf;
                        int i50 = zzffVarZzf.zzg;
                        i8 = i34;
                        int i51 = zzffVarZzf.zzh;
                        int i52 = zzffVarZzf.zzc + 8;
                        int i53 = zzffVarZzf.zzd + 8;
                        int i54 = zzffVarZzf.zzk;
                        int i55 = zzffVarZzf.zzl;
                        int i56 = zzffVarZzf.zzm;
                        float f8 = zzffVarZzf.zzi;
                        int i57 = zzffVarZzf.zzj;
                        zzfa zzfaVar = zzffVarZzf.zzb;
                        if (zzfaVar != null) {
                            strZzc = zzdc.zzc(zzfaVar.zza, zzfaVar.zzb, zzfaVar.zzc, zzfaVar.zzd, zzfaVar.zze, zzfaVar.zzf);
                        }
                        i28 = i56;
                        f7 = f8;
                        i30 = i57;
                        i12 = i33;
                        i25 = i53;
                        i26 = i54;
                        i27 = i55;
                        i22 = i50;
                        i23 = i51;
                        i24 = i52;
                        i11 = 0;
                        i20 = i48;
                        i21 = i49;
                        i19 = i47;
                    } else {
                        i8 = i34;
                        i11 = 0;
                        i12 = i33;
                    }
                    i18 = i8 + iZzt4;
                    zzefVar.zzk(iZzt4);
                    i32 = i12 + 1;
                    i14 = i11;
                    iZzs = i7;
                    i13 = 4;
                } catch (ArrayIndexOutOfBoundsException e9) {
                    e = e9;
                    z9 = z8;
                    if (z9 != z7) {
                        str = "HEVC config";
                    } else {
                        str = "L-HEVC config";
                    }
                    throw zzas.zzb("Error parsing".concat(str), e);
                }
            }
            i31++;
            zzfiVar2 = zzfiVarZze;
            z10 = z8;
            iZzs = iZzs;
            i13 = 4;
        }
        z8 = z10;
        return new zzadl(i15 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iZzs + 1, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, f7, i30, strZzc, zzfiVar2);
    }
}
