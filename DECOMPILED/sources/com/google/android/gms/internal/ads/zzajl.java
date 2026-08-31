package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzajl extends zzajj {
    private zzajk zza;
    private int zzb;
    private boolean zzc;
    private zzaeg zzd;
    private zzaee zze;

    zzajl() {
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final void zza(boolean z7) {
        super.zza(z7);
        if (z7) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final long zzb(zzef zzefVar) {
        if ((zzefVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b7 = zzefVar.zzi()[0];
        zzajk zzajkVar = this.zza;
        zzajkVar.getClass();
        int i7 = !zzajkVar.zzd[(b7 >> 1) & (255 >>> (8 - zzajkVar.zze))].zza ? zzajkVar.zza.zze : zzajkVar.zza.zzf;
        int i8 = this.zzc ? (this.zzb + i7) / 4 : 0;
        if (zzefVar.zzj() < zzefVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzefVar.zzi(), zzefVar.zze() + 4);
            zzefVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzefVar.zzf(zzefVar.zze() + 4);
        }
        long j7 = i8;
        byte[] bArrZzi = zzefVar.zzi();
        bArrZzi[zzefVar.zze() - 4] = (byte) (j7 & 255);
        bArrZzi[zzefVar.zze() - 3] = (byte) ((j7 >>> 8) & 255);
        bArrZzi[zzefVar.zze() - 2] = (byte) ((j7 >>> 16) & 255);
        bArrZzi[zzefVar.zze() - 1] = (byte) ((j7 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i7;
        return j7;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x03ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:170:0x03ec  */
    @Override // com.google.android.gms.internal.ads.zzajj
    protected final boolean zzc(zzef zzefVar, long j7, zzajh zzajhVar) throws zzas {
        zzajk zzajkVar;
        int i7;
        int iZzb;
        int i8;
        int[] iArr;
        if (this.zza != null) {
            zzajhVar.zza.getClass();
            return false;
        }
        zzaeg zzaegVar = this.zzd;
        int i9 = 1;
        if (zzaegVar != null) {
            int i10 = 4;
            zzaee zzaeeVar = this.zze;
            if (zzaeeVar == null) {
                this.zze = zzaeh.zzb(zzefVar, true, true);
            } else {
                byte[] bArr = new byte[zzefVar.zze()];
                System.arraycopy(zzefVar.zzi(), 0, bArr, 0, zzefVar.zze());
                int i11 = zzaegVar.zza;
                int i12 = 5;
                zzaeh.zzd(5, zzefVar, false);
                int iZzs = zzefVar.zzs() + 1;
                zzaed zzaedVar = new zzaed(zzefVar.zzi());
                zzaedVar.zzc(zzefVar.zzg() * 8);
                int i13 = 0;
                while (true) {
                    int i14 = 2;
                    int i15 = 16;
                    if (i13 >= iZzs) {
                        int i16 = i9;
                        int i17 = 6;
                        int iZzb2 = zzaedVar.zzb(6) + i16;
                        for (int i18 = 0; i18 < iZzb2; i18++) {
                            if (zzaedVar.zzb(16) != 0) {
                                throw zzas.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzaedVar.zzb(6) + i16;
                        int i19 = 0;
                        while (true) {
                            int i20 = 3;
                            if (i19 >= iZzb3) {
                                int i21 = 1;
                                int iZzb4 = zzaedVar.zzb(i17) + 1;
                                int i22 = 0;
                                while (i22 < iZzb4) {
                                    if (zzaedVar.zzb(16) > 2) {
                                        throw zzas.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzaedVar.zzc(24);
                                    zzaedVar.zzc(24);
                                    zzaedVar.zzc(24);
                                    int iZzb5 = zzaedVar.zzb(i17) + i21;
                                    int i23 = 8;
                                    zzaedVar.zzc(8);
                                    int[] iArr2 = new int[iZzb5];
                                    for (int i24 = 0; i24 < iZzb5; i24++) {
                                        iArr2[i24] = ((zzaedVar.zza() ? zzaedVar.zzb(5) : 0) * 8) + zzaedVar.zzb(3);
                                    }
                                    int i25 = 0;
                                    while (i25 < iZzb5) {
                                        int i26 = 0;
                                        while (i26 < i23) {
                                            if ((iArr2[i25] & (1 << i26)) != 0) {
                                                zzaedVar.zzc(i23);
                                            }
                                            i26++;
                                            i23 = 8;
                                        }
                                        i25++;
                                        i23 = 8;
                                    }
                                    i22++;
                                    i17 = 6;
                                    i21 = 1;
                                }
                                int iZzb6 = zzaedVar.zzb(i17) + 1;
                                for (int i27 = 0; i27 < iZzb6; i27++) {
                                    int iZzb7 = zzaedVar.zzb(16);
                                    if (iZzb7 != 0) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(iZzb7).length() + 41);
                                        sb.append("mapping type other than 0 not supported: ");
                                        sb.append(iZzb7);
                                        zzds.zze("VorbisUtil", sb.toString());
                                    } else {
                                        if (zzaedVar.zza()) {
                                            i7 = 1;
                                            iZzb = zzaedVar.zzb(4) + 1;
                                        } else {
                                            i7 = 1;
                                            iZzb = 1;
                                        }
                                        if (zzaedVar.zza()) {
                                            int iZzb8 = zzaedVar.zzb(8) + i7;
                                            for (int i28 = 0; i28 < iZzb8; i28++) {
                                                int i29 = i11 - 1;
                                                zzaedVar.zzc(zzaeh.zza(i29));
                                                zzaedVar.zzc(zzaeh.zza(i29));
                                            }
                                        }
                                        if (zzaedVar.zzb(2) != 0) {
                                            throw zzas.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i30 = 0; i30 < i11; i30++) {
                                                zzaedVar.zzc(4);
                                            }
                                        }
                                        for (int i31 = 0; i31 < iZzb; i31++) {
                                            zzaedVar.zzc(8);
                                            zzaedVar.zzc(8);
                                            zzaedVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb9 = zzaedVar.zzb(6);
                                int i32 = iZzb9 + 1;
                                zzaef[] zzaefVarArr = new zzaef[i32];
                                for (int i33 = 0; i33 < i32; i33++) {
                                    zzaefVarArr[i33] = new zzaef(zzaedVar.zza(), zzaedVar.zzb(16), zzaedVar.zzb(16), zzaedVar.zzb(8));
                                }
                                if (!zzaedVar.zza()) {
                                    throw zzas.zzb("framing bit after modes not set as expected", null);
                                }
                                zzajkVar = new zzajk(zzaegVar, zzaeeVar, bArr, zzaefVarArr, zzaeh.zza(iZzb9));
                                break;
                            }
                            int iZzb10 = zzaedVar.zzb(i15);
                            if (iZzb10 == 0) {
                                int i34 = 8;
                                zzaedVar.zzc(8);
                                zzaedVar.zzc(16);
                                zzaedVar.zzc(16);
                                zzaedVar.zzc(6);
                                zzaedVar.zzc(8);
                                int iZzb11 = zzaedVar.zzb(4) + 1;
                                int i35 = 0;
                                while (i35 < iZzb11) {
                                    zzaedVar.zzc(i34);
                                    i35++;
                                    i34 = 8;
                                }
                            } else {
                                if (iZzb10 != i16) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb10).length() + 41);
                                    sb2.append("floor type greater than 1 not decodable: ");
                                    sb2.append(iZzb10);
                                    throw zzas.zzb(sb2.toString(), null);
                                }
                                int iZzb12 = zzaedVar.zzb(5);
                                int[] iArr3 = new int[iZzb12];
                                int i36 = -1;
                                for (int i37 = 0; i37 < iZzb12; i37++) {
                                    int iZzb13 = zzaedVar.zzb(4);
                                    iArr3[i37] = iZzb13;
                                    if (iZzb13 > i36) {
                                        i36 = iZzb13;
                                    }
                                }
                                int i38 = i36 + 1;
                                int[] iArr4 = new int[i38];
                                int i39 = 0;
                                while (i39 < i38) {
                                    int i40 = 1;
                                    iArr4[i39] = zzaedVar.zzb(i20) + 1;
                                    int iZzb14 = zzaedVar.zzb(2);
                                    if (iZzb14 > 0) {
                                        i8 = 8;
                                        zzaedVar.zzc(8);
                                    } else {
                                        i8 = 8;
                                    }
                                    int i41 = i38;
                                    int i42 = 0;
                                    while (true) {
                                        int i43 = i40 << iZzb14;
                                        iArr = iArr3;
                                        if (i42 < i43) {
                                            zzaedVar.zzc(i8);
                                            i42++;
                                            iArr3 = iArr;
                                            i8 = 8;
                                            i40 = 1;
                                        }
                                    }
                                    i39++;
                                    iArr3 = iArr;
                                    i38 = i41;
                                    i20 = 3;
                                }
                                int[] iArr5 = iArr3;
                                zzaedVar.zzc(2);
                                int iZzb15 = zzaedVar.zzb(4);
                                int i44 = 0;
                                int i45 = 0;
                                for (int i46 = 0; i46 < iZzb12; i46++) {
                                    i44 += iArr4[iArr5[i46]];
                                    while (i45 < i44) {
                                        zzaedVar.zzc(iZzb15);
                                        i45++;
                                    }
                                }
                            }
                            i19++;
                            i17 = 6;
                            i15 = 16;
                            i16 = 1;
                        }
                    } else {
                        if (zzaedVar.zzb(24) != 5653314) {
                            int iZzd = zzaedVar.zzd();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(iZzd);
                            throw zzas.zzb(sb3.toString(), null);
                        }
                        int iZzb16 = zzaedVar.zzb(16);
                        int iZzb17 = zzaedVar.zzb(24);
                        if (zzaedVar.zza()) {
                            zzaedVar.zzc(i12);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzaedVar.zzb(zzaeh.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzaedVar.zza();
                            for (int i47 = 0; i47 < iZzb17; i47++) {
                                if (!zZza) {
                                    zzaedVar.zzc(i12);
                                } else if (zzaedVar.zza()) {
                                    zzaedVar.zzc(i12);
                                }
                            }
                        }
                        int i48 = i10;
                        int iZzb19 = zzaedVar.zzb(i48);
                        if (iZzb19 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(iZzb19);
                            throw zzas.zzb(sb4.toString(), null);
                        }
                        if (iZzb19 != i9) {
                            if (iZzb19 != 2) {
                                i9 = i9;
                            }
                            i13++;
                            i9 = i9;
                            i10 = 4;
                            i12 = 5;
                        } else {
                            i14 = iZzb19;
                        }
                        zzaedVar.zzc(32);
                        zzaedVar.zzc(32);
                        int iZzb20 = zzaedVar.zzb(i48) + i9;
                        zzaedVar.zzc(i9);
                        zzaedVar.zzc((int) ((i14 == i9 ? iZzb16 != 0 ? (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16))) : 0L : ((long) iZzb16) * ((long) iZzb17)) * ((long) iZzb20)));
                        i13++;
                        i9 = i9;
                        i10 = 4;
                        i12 = 5;
                    }
                }
            }
            this.zza = zzajkVar;
            if (zzajkVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zzaeg zzaegVar2 = zzajkVar.zza;
            arrayList.add(zzaegVar2.zzg);
            arrayList.add(zzajkVar.zzc);
            zzao zzaoVarZzc = zzaeh.zzc(zzgjz.zzr(zzajkVar.zzb.zza));
            zzs zzsVar = new zzs();
            zzsVar.zzl("audio/ogg");
            zzsVar.zzm("audio/vorbis");
            zzsVar.zzh(zzaegVar2.zzd);
            zzsVar.zzi(zzaegVar2.zzc);
            zzsVar.zzE(zzaegVar2.zza);
            zzsVar.zzF(zzaegVar2.zzb);
            zzsVar.zzp(arrayList);
            zzsVar.zzk(zzaoVarZzc);
            zzajhVar.zza = zzsVar.zzM();
            return true;
        }
        zzaeh.zzd(1, zzefVar, false);
        int iZzI = zzefVar.zzI();
        int iZzs2 = zzefVar.zzs();
        int iZzI2 = zzefVar.zzI();
        int iZzC = zzefVar.zzC();
        int i49 = iZzC <= 0 ? -1 : iZzC;
        int iZzC2 = zzefVar.zzC();
        int i50 = iZzC2 <= 0 ? -1 : iZzC2;
        int iZzC3 = zzefVar.zzC();
        int i51 = iZzC3 <= 0 ? -1 : iZzC3;
        int iZzs3 = zzefVar.zzs();
        this.zzd = new zzaeg(iZzI, iZzs2, iZzI2, i49, i50, i51, (int) Math.pow(2.0d, iZzs3 & 15), (int) Math.pow(2.0d, (iZzs3 & 240) >> 4), 1 == (zzefVar.zzs() & 1), Arrays.copyOf(zzefVar.zzi(), zzefVar.zze()));
        zzajkVar = null;
        this.zza = zzajkVar;
        if (zzajkVar == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        zzaeg zzaegVar3 = zzajkVar.zza;
        arrayList2.add(zzaegVar3.zzg);
        arrayList2.add(zzajkVar.zzc);
        zzao zzaoVarZzc2 = zzaeh.zzc(zzgjz.zzr(zzajkVar.zzb.zza));
        zzs zzsVar2 = new zzs();
        zzsVar2.zzl("audio/ogg");
        zzsVar2.zzm("audio/vorbis");
        zzsVar2.zzh(zzaegVar3.zzd);
        zzsVar2.zzi(zzaegVar3.zzc);
        zzsVar2.zzE(zzaegVar3.zza);
        zzsVar2.zzF(zzaegVar3.zzb);
        zzsVar2.zzp(arrayList2);
        zzsVar2.zzk(zzaoVarZzc2);
        zzajhVar.zza = zzsVar2.zzM();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final void zzj(long j7) {
        super.zzj(j7);
        this.zzc = j7 != 0;
        zzaeg zzaegVar = this.zzd;
        this.zzb = zzaegVar != null ? zzaegVar.zze : 0;
    }
}
