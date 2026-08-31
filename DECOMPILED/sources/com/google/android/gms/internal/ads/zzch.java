package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzch {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private double zzw;

    public zzch(int i7, int i8, float f7, float f8, int i9) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = f7;
        this.zzd = f8;
        this.zze = i7 / i9;
        this.zzf = i7 / 400;
        int i10 = i7 / 65;
        this.zzg = i10;
        int i11 = i10 + i10;
        this.zzh = i11;
        this.zzi = new short[i11];
        int i12 = i11 * i8;
        this.zzj = new short[i12];
        this.zzl = new short[i12];
        this.zzn = new short[i12];
    }

    private final short[] zzg(short[] sArr, int i7, int i8) {
        int length = sArr.length;
        int i9 = this.zzb;
        int i10 = length / i9;
        return i7 + i8 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i8) * i9);
    }

    private final void zzh(short[] sArr, int i7, int i8) {
        short[] sArrZzg = zzg(this.zzl, this.zzm, i8);
        this.zzl = sArrZzg;
        int i9 = this.zzm;
        int i10 = this.zzb;
        System.arraycopy(sArr, i7 * i10, sArrZzg, i9 * i10, i8 * i10);
        this.zzm += i8;
    }

    private final void zzi(short[] sArr, int i7, int i8) {
        int i9;
        for (int i10 = 0; i10 < this.zzh / i8; i10++) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.zzb;
                i9 = i13 * i8;
                if (i11 < i9) {
                    i12 += sArr[(i13 * i7) + (i9 * i10) + i11];
                    i11++;
                }
            }
            this.zzi[i10] = (short) (i12 / i9);
        }
    }

    private final int zzj(short[] sArr, int i7, int i8, int i9) {
        int i10 = 1;
        int i11 = 255;
        int i12 = 0;
        int i13 = 0;
        while (i8 <= i9) {
            int iAbs = 0;
            for (int i14 = 0; i14 < i8; i14++) {
                int i15 = this.zzb * i7;
                iAbs += Math.abs(sArr[i15 + i14] - sArr[(i15 + i8) + i14]);
            }
            int i16 = iAbs * i12;
            int i17 = i10 * i8;
            if (i16 < i17) {
                i10 = iAbs;
            }
            if (i16 < i17) {
                i12 = i8;
            }
            int i18 = iAbs * i11;
            int i19 = i13 * i8;
            if (i18 > i19) {
                i13 = iAbs;
            }
            if (i18 > i19) {
                i11 = i8;
            }
            i8++;
        }
        this.zzu = i10 / i12;
        this.zzv = i13 / i11;
        return i12;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0295 A[LOOP:4: B:13:0x0036->B:105:0x0295, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0194 A[EDGE_INSN: B:115:0x0194->B:68:0x0194 BREAK  A[LOOP:4: B:13:0x0036->B:105:0x0295], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    private final void zzk() {
        short[] sArr;
        int i7;
        int i8;
        int iZzj;
        int iZzj2;
        int i9;
        int i10;
        int i11;
        double d7;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        int i16;
        int i17;
        int i18;
        int i19;
        long j7;
        long j8;
        float f8 = this.zzc;
        float f9 = this.zzd;
        double d8 = f8 / f9;
        int i20 = this.zzm;
        int i21 = 0;
        int i22 = 1;
        if (d8 > 1.0000100135803223d || d8 < 0.9999899864196777d) {
            int i23 = this.zzk;
            int i24 = this.zzh;
            if (i23 >= i24) {
                int i25 = 0;
                while (true) {
                    int i26 = this.zzr;
                    if (i26 > 0) {
                        int iMin = Math.min(i24, i26);
                        zzh(this.zzj, i25, iMin);
                        this.zzr -= iMin;
                        i25 += iMin;
                        f9 = f9;
                        d7 = d8;
                    } else {
                        short[] sArr2 = this.zzj;
                        int i27 = this.zza;
                        int i28 = i27 > 4000 ? i27 / 4000 : i22;
                        int i29 = this.zzb;
                        if (i29 != i22) {
                            zzi(sArr2, i25, i28);
                            sArr = this.zzi;
                            i7 = this.zzf;
                            i8 = this.zzg;
                            iZzj = zzj(sArr, i21, i7 / i28, i8 / i28);
                            if (i28 != 1) {
                                int i30 = iZzj * i28;
                                int i31 = i28 * 4;
                                i10 = i30 - i31;
                                if (i10 >= i7) {
                                    i7 = i10;
                                }
                                i11 = i30 + i31;
                                if (i11 <= i8) {
                                    i8 = i11;
                                }
                                if (i29 == 1) {
                                    iZzj2 = zzj(sArr2, i25, i7, i8);
                                } else {
                                    zzi(sArr2, i25, 1);
                                    iZzj2 = zzj(sArr, i21, i7, i8);
                                }
                            } else {
                                iZzj2 = iZzj;
                            }
                            i9 = i29;
                        } else if (i28 == i22) {
                            iZzj2 = zzj(sArr2, i25, this.zzf, this.zzg);
                            i9 = i22;
                        } else {
                            i29 = i22;
                            zzi(sArr2, i25, i28);
                            sArr = this.zzi;
                            i7 = this.zzf;
                            i8 = this.zzg;
                            iZzj = zzj(sArr, i21, i7 / i28, i8 / i28);
                            if (i28 != 1) {
                                int i32 = iZzj * i28;
                                int i33 = i28 * 4;
                                i10 = i32 - i33;
                                if (i10 >= i7) {
                                    i7 = i10;
                                }
                                i11 = i32 + i33;
                                if (i11 <= i8) {
                                    i8 = i11;
                                }
                                if (i29 == 1) {
                                    iZzj2 = zzj(sArr2, i25, i7, i8);
                                } else {
                                    zzi(sArr2, i25, 1);
                                    iZzj2 = zzj(sArr, i21, i7, i8);
                                }
                            } else {
                                iZzj2 = iZzj;
                            }
                            i9 = i29;
                        }
                        int i34 = this.zzu;
                        int i35 = (i34 == 0 || (i15 = this.zzs) == 0 || this.zzv > i34 * 3 || i34 + i34 <= this.zzt * 3) ? iZzj2 : i15;
                        int i36 = i25 + i35;
                        this.zzt = i34;
                        this.zzs = iZzj2;
                        double d9 = i35;
                        if (d8 > 1.0d) {
                            short[] sArr3 = this.zzj;
                            double d10 = d8 - 1.0d;
                            if (d8 >= 2.0d) {
                                i13 = i35;
                                double d11 = (d9 / d10) + this.zzw;
                                int iRound = (int) Math.round(d11);
                                d7 = d8;
                                this.zzw = d11 - ((double) iRound);
                                i14 = iRound;
                            } else {
                                d7 = d8;
                                i13 = i35;
                                double d12 = ((d9 * (2.0d - d7)) / d10) + this.zzw;
                                int iRound2 = (int) Math.round(d12);
                                this.zzr = iRound2;
                                this.zzw = d12 - ((double) iRound2);
                                i14 = i13;
                            }
                            short[] sArrZzg = zzg(this.zzl, this.zzm, i14);
                            this.zzl = sArrZzg;
                            zzl(i14, i9, sArrZzg, this.zzm, sArr3, i25, sArr3, i36);
                            this.zzm += i14;
                            i25 += i13 + i14;
                        } else {
                            int i37 = i25;
                            d7 = d8;
                            int i38 = i35;
                            short[] sArr4 = this.zzj;
                            double d13 = 1.0d - d7;
                            if (d7 < 0.5d) {
                                double d14 = ((d9 * d7) / d13) + this.zzw;
                                int iRound3 = (int) Math.round(d14);
                                this.zzw = d14 - ((double) iRound3);
                                i12 = iRound3;
                            } else {
                                double d15 = ((d9 * ((d7 + d7) - 1.0d)) / d13) + this.zzw;
                                int iRound4 = (int) Math.round(d15);
                                this.zzr = iRound4;
                                this.zzw = d15 - ((double) iRound4);
                                i12 = i38;
                            }
                            int i39 = i38 + i12;
                            short[] sArrZzg2 = zzg(this.zzl, this.zzm, i39);
                            this.zzl = sArrZzg2;
                            System.arraycopy(sArr4, i37 * i9, sArrZzg2, this.zzm * i9, i38 * i9);
                            zzl(i12, i9, this.zzl, this.zzm + i38, sArr4, i36, sArr4, i37);
                            this.zzm += i39;
                            i25 = i37 + i12;
                        }
                        if (i25 + i24 > i23) {
                            break;
                        }
                        i22 = 1;
                        f9 = f9;
                        i20 = i20;
                        d8 = d7;
                        i21 = 0;
                    }
                    i20 = i20;
                    if (i25 + i24 > i23) {
                        break;
                        break;
                    }
                    i22 = 1;
                    f9 = f9;
                    i20 = i20;
                    d8 = d7;
                    i21 = 0;
                }
                int i40 = this.zzk - i25;
                short[] sArr5 = this.zzj;
                int i41 = this.zzb;
                System.arraycopy(sArr5, i25 * i41, sArr5, 0, i41 * i40);
                this.zzk = i40;
            }
            f7 = this.zze * f9;
            if (f7 != 1.0f || this.zzm == (i16 = i20)) {
            }
            int i42 = this.zza;
            long j9 = i42;
            long j10 = (long) (i42 / f7);
            while (j10 != 0 && j9 != 0 && j10 % 2 == 0 && j9 % 2 == 0) {
                j10 /= 2;
                j9 /= 2;
            }
            int i43 = this.zzm - i16;
            short[] sArrZzg3 = zzg(this.zzn, this.zzo, i43);
            this.zzn = sArrZzg3;
            short[] sArr6 = this.zzl;
            int i44 = this.zzb;
            System.arraycopy(sArr6, i16 * i44, sArrZzg3, this.zzo * i44, i43 * i44);
            this.zzm = i16;
            this.zzo += i43;
            int i45 = 0;
            while (true) {
                i17 = this.zzo;
                i18 = i17 - 1;
                if (i45 >= i18) {
                    break;
                }
                while (true) {
                    i19 = this.zzp + 1;
                    j7 = i19;
                    long j11 = j7 * j10;
                    j8 = this.zzq;
                    if (j11 <= j8 * j9) {
                        break;
                    }
                    this.zzl = zzg(this.zzl, this.zzm, 1);
                    int i46 = 0;
                    while (i46 < i44) {
                        short[] sArr7 = this.zzl;
                        int i47 = this.zzm * i44;
                        short[] sArr8 = this.zzn;
                        int i48 = (i45 * i44) + i46;
                        short s7 = sArr8[i48];
                        short s8 = sArr8[i48 + i44];
                        long j12 = ((long) this.zzq) * j9;
                        int i49 = this.zzp;
                        int i50 = i46;
                        long j13 = ((long) (i49 + 1)) * j10;
                        long j14 = j13 - (((long) i49) * j10);
                        long j15 = j13 - j12;
                        sArr7[i47 + i50] = (short) (((j15 * ((long) s7)) + ((j14 - j15) * ((long) s8))) / j14);
                        i46 = i50 + 1;
                    }
                    this.zzq++;
                    this.zzm++;
                }
                this.zzp = i19;
                if (j7 == j9) {
                    this.zzp = 0;
                    zzghc.zzh(j8 == j10);
                    this.zzq = 0;
                }
                i45++;
            }
            if (i18 != 0) {
                short[] sArr9 = this.zzn;
                System.arraycopy(sArr9, i18 * i44, sArr9, 0, (i17 - i18) * i44);
                this.zzo -= i18;
                return;
            }
            return;
        }
        zzh(this.zzj, 0, this.zzk);
        this.zzk = 0;
        f9 = f9;
        i20 = i20;
        f7 = this.zze * f9;
        if (f7 != 1.0f) {
        }
    }

    private static void zzl(int i7, int i8, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = (i10 * i8) + i12;
            int i14 = (i11 * i8) + i12;
            int i15 = (i9 * i8) + i12;
            for (int i16 = 0; i16 < i7; i16++) {
                sArr[i15] = (short) (((sArr2[i13] * (i7 - i16)) + (sArr3[i14] * i16)) / i7);
                i15 += i8;
                i13 += i8;
                i14 += i8;
            }
        }
    }

    public final int zza() {
        int i7 = this.zzk * this.zzb;
        return i7 + i7;
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i7 = this.zzb;
        int i8 = iRemaining / i7;
        int i9 = i8 * i7;
        short[] sArrZzg = zzg(this.zzj, this.zzk, i8);
        this.zzj = sArrZzg;
        shortBuffer.get(sArrZzg, this.zzk * i7, (i9 + i9) / 2);
        this.zzk += i8;
        zzk();
    }

    public final void zzc(ShortBuffer shortBuffer) {
        zzghc.zzh(this.zzm >= 0);
        int iRemaining = shortBuffer.remaining();
        int i7 = this.zzb;
        int iMin = Math.min(iRemaining / i7, this.zzm);
        int i8 = iMin * i7;
        shortBuffer.put(this.zzl, 0, i8);
        int i9 = this.zzm - iMin;
        this.zzm = i9;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, i8, sArr, 0, i9 * i7);
    }

    public final void zzd() {
        int i7 = this.zzk;
        int i8 = this.zzr;
        int i9 = this.zzm;
        float f7 = this.zzc;
        float f8 = this.zzd;
        int i10 = i9 + ((int) ((((((((double) (i7 - i8)) / ((double) (f7 / f8))) + ((double) i8)) + this.zzw) + ((double) this.zzo)) / ((double) (this.zze * f8))) + 0.5d));
        this.zzw = 0.0d;
        int i11 = this.zzh;
        int i12 = i11 + i11;
        this.zzj = zzg(this.zzj, i7, i7 + i12);
        int i13 = 0;
        while (true) {
            int i14 = this.zzb;
            if (i13 >= i12 * i14) {
                break;
            }
            this.zzj[(i14 * i7) + i13] = 0;
            i13++;
        }
        this.zzk += i12;
        zzk();
        if (this.zzm > i10) {
            this.zzm = Math.max(i10, 0);
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zze() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = 0.0d;
    }

    public final int zzf() {
        zzghc.zzh(this.zzm >= 0);
        int i7 = this.zzm * this.zzb;
        return i7 + i7;
    }
}
