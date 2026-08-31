package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakh implements zzajv {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzaka zzg;
    private final zzajz zzh;
    private final zzakg zzi;
    private Bitmap zzj;

    public zzakh(List list) {
        zzef zzefVar = new zzef((byte[]) list.get(0));
        int iZzt = zzefVar.zzt();
        int iZzt2 = zzefVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzaka(719, 575, 0, 719, 0, 575);
        this.zzh = new zzajz(0, zzd(), zze(), zzf());
        this.zzi = new zzakg(iZzt, iZzt2);
    }

    private static zzajz zzb(zzee zzeeVar, int i7) {
        int[] iArr;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i8 = 8;
        int iZzj5 = zzeeVar.zzj(8);
        zzeeVar.zzh(8);
        int[] iArrZzd = zzd();
        int[] iArrZze = zze();
        int[] iArrZzf = zzf();
        int i9 = i7 - 2;
        while (i9 > 0) {
            int iZzj6 = zzeeVar.zzj(i8);
            int iZzj7 = zzeeVar.zzj(i8);
            if ((iZzj7 & 128) != 0) {
                iArr = iArrZzd;
            } else {
                iArr = (iZzj7 & 64) != 0 ? iArrZze : iArrZzf;
            }
            if ((iZzj7 & 1) != 0) {
                iZzj3 = zzeeVar.zzj(i8);
                iZzj4 = zzeeVar.zzj(i8);
                iZzj = zzeeVar.zzj(i8);
                iZzj2 = zzeeVar.zzj(i8);
                i9 -= 6;
            } else {
                int iZzj8 = zzeeVar.zzj(6) << 2;
                int iZzj9 = zzeeVar.zzj(4) << 4;
                i9 -= 4;
                iZzj = zzeeVar.zzj(4) << 4;
                iZzj2 = zzeeVar.zzj(2) << 6;
                iZzj3 = iZzj8;
                iZzj4 = iZzj9;
            }
            if (iZzj3 == 0) {
                iZzj2 = 255;
            }
            if (iZzj3 == 0) {
                iZzj = 0;
            }
            if (iZzj3 == 0) {
                iZzj4 = 0;
            }
            double d7 = iZzj3;
            String str = zzeo.zza;
            double d8 = iZzj4 - 128;
            double d9 = iZzj - 128;
            iArr[iZzj6] = zzg((byte) (255 - (iZzj2 & 255)), Math.max(0, Math.min((int) (d7 + (1.402d * d8)), 255)), Math.max(0, Math.min((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d7 + (d9 * 1.772d)), 255)));
            iZzj5 = iZzj5;
            i8 = 8;
        }
        return new zzajz(iZzj5, iArrZzd, iArrZze, iArrZzf);
    }

    private static zzakb zzc(zzee zzeeVar) {
        byte[] bArr;
        int iZzj = zzeeVar.zzj(16);
        zzeeVar.zzh(4);
        int iZzj2 = zzeeVar.zzj(2);
        boolean zZzi = zzeeVar.zzi();
        zzeeVar.zzh(1);
        byte[] bArr2 = zzeo.zzb;
        if (iZzj2 != 1) {
            if (iZzj2 == 0) {
                int iZzj3 = zzeeVar.zzj(16);
                int iZzj4 = zzeeVar.zzj(16);
                if (iZzj3 > 0) {
                    bArr2 = new byte[iZzj3];
                    zzeeVar.zzn(bArr2, 0, iZzj3);
                }
                if (iZzj4 > 0) {
                    bArr = new byte[iZzj4];
                    zzeeVar.zzn(bArr, 0, iZzj4);
                }
            }
            return new zzakb(iZzj, zZzi, bArr2, bArr);
        }
        zzeeVar.zzh(zzeeVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzakb(iZzj, zZzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            int i8 = i7 & 4;
            int i9 = i7 & 2;
            int i10 = i7 & 1;
            if (i7 < 8) {
                iArr[i7] = zzg(255, 1 != i10 ? 0 : 255, i9 != 0 ? 255 : 0, i8 != 0 ? 255 : 0);
            } else {
                iArr[i7] = zzg(255, 1 != i10 ? 0 : 127, i9 != 0 ? 127 : 0, i8 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            if (i7 < 8) {
                iArr[i7] = zzg(63, 1 != (i7 & 1) ? 0 : 255, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) == 0 ? 0 : 255);
            } else {
                int i8 = i7 & 136;
                if (i8 == 0) {
                    iArr[i7] = zzg(255, (1 != (i7 & 1) ? 0 : 85) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 8) {
                    iArr[i7] = zzg(127, (1 != (i7 & 1) ? 0 : 85) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 128) {
                    iArr[i7] = zzg(255, (1 != (i7 & 1) ? 0 : 43) + 127 + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + 127 + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + 127 + ((i7 & 64) == 0 ? 0 : 85));
                } else if (i8 == 136) {
                    iArr[i7] = zzg(255, (1 != (i7 & 1) ? 0 : 43) + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + ((i7 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i7, int i8, int i9, int i10) {
        return (i7 << 24) | (i8 << 16) | (i9 << 8) | i10;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa A[SYNTHETIC] */
    private static void zzh(byte[] bArr, int[] iArr, int i7, int i8, int i9, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c7;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int i10;
        int iZzj4;
        int iZzj5;
        int i11;
        int i12;
        int iZzj6;
        int i13;
        Paint paint2 = paint;
        zzee zzeeVar = new zzee(bArr, bArr.length);
        int i14 = i8;
        int i15 = i9;
        byte[] bArrZzi = null;
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        while (zzeeVar.zzc() != 0) {
            int iZzj7 = zzeeVar.zzj(8);
            if (iZzj7 != 240) {
                int i16 = 4;
                int i17 = 1;
                int i18 = 2;
                switch (iZzj7) {
                    case 16:
                        if (i7 == 3) {
                            if (bArrZzi == null) {
                                bArr3 = zzb;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrZzi;
                            }
                        } else if (i7 != 2) {
                            bArr2 = null;
                        } else if (bArrZzi3 == null) {
                            bArr3 = zza;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrZzi3;
                        }
                        boolean z7 = false;
                        while (true) {
                            int iZzj8 = zzeeVar.zzj(2);
                            if (iZzj8 != 0) {
                                iZzj2 = 1;
                                iZzj = iZzj8;
                            } else {
                                if (zzeeVar.zzi()) {
                                    iZzj3 = zzeeVar.zzj(3) + 3;
                                    iZzj = zzeeVar.zzj(2);
                                } else {
                                    if (zzeeVar.zzi()) {
                                        iZzj2 = 1;
                                        iZzj = 0;
                                    } else {
                                        int iZzj9 = zzeeVar.zzj(2);
                                        if (iZzj9 == 0) {
                                            c7 = 4;
                                            z7 = true;
                                            iZzj = 0;
                                            iZzj2 = 0;
                                        } else if (iZzj9 == 1) {
                                            c7 = 4;
                                            z7 = z7;
                                            iZzj2 = 2;
                                            iZzj = 0;
                                        } else if (iZzj9 == 2) {
                                            c7 = 4;
                                            z7 = z7;
                                            iZzj2 = zzeeVar.zzj(4) + 12;
                                            iZzj = zzeeVar.zzj(2);
                                        } else if (iZzj9 != 3) {
                                            iZzj = 0;
                                            iZzj2 = 0;
                                        } else {
                                            iZzj3 = zzeeVar.zzj(8) + 29;
                                            iZzj = zzeeVar.zzj(2);
                                        }
                                        if (iZzj2 == 0 && paint2 != null) {
                                            int i19 = i15 + 1;
                                            float f7 = i15;
                                            if (bArr2 != 0) {
                                                iZzj = bArr2[iZzj];
                                            }
                                            paint2.setColor(iArr[iZzj]);
                                            canvas.drawRect(i14, f7, i14 + iZzj2, i19, paint2);
                                        }
                                        i14 += iZzj2;
                                        if (z7) {
                                            zzeeVar.zzm();
                                        } else {
                                            paint2 = paint;
                                            z7 = z7;
                                        }
                                    }
                                    c7 = 4;
                                    if (iZzj2 == 0) {
                                    }
                                    i14 += iZzj2;
                                    if (z7) {
                                        zzeeVar.zzm();
                                    } else {
                                        paint2 = paint;
                                        z7 = z7;
                                    }
                                }
                                iZzj2 = iZzj3;
                            }
                            c7 = 4;
                            if (iZzj2 == 0) {
                            }
                            i14 += iZzj2;
                            if (z7) {
                                zzeeVar.zzm();
                            } else {
                                paint2 = paint;
                                z7 = z7;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i7 == 3 ? bArrZzi2 == null ? zzc : bArrZzi2 : null;
                        boolean z8 = false;
                        while (true) {
                            int iZzj10 = zzeeVar.zzj(i16);
                            if (iZzj10 != 0) {
                                i10 = 1;
                                z8 = z8;
                            } else if (zzeeVar.zzi()) {
                                if (zzeeVar.zzi()) {
                                    int iZzj11 = zzeeVar.zzj(i18);
                                    if (iZzj11 == 0) {
                                        i10 = 1;
                                    } else if (iZzj11 == 1) {
                                        i10 = i18;
                                    } else if (iZzj11 == i18) {
                                        iZzj4 = zzeeVar.zzj(i16) + 9;
                                        iZzj5 = zzeeVar.zzj(i16);
                                    } else if (iZzj11 != 3) {
                                        z8 = z8;
                                        iZzj10 = 0;
                                        i10 = 0;
                                    } else {
                                        iZzj4 = zzeeVar.zzj(8) + 25;
                                        iZzj5 = zzeeVar.zzj(i16);
                                    }
                                    iZzj10 = 0;
                                } else {
                                    iZzj4 = zzeeVar.zzj(i18) + i16;
                                    iZzj5 = zzeeVar.zzj(i16);
                                }
                                i10 = iZzj4;
                                z8 = z8;
                                iZzj10 = iZzj5;
                            } else {
                                int iZzj12 = zzeeVar.zzj(3);
                                if (iZzj12 != 0) {
                                    i10 = iZzj12 + 2;
                                    iZzj10 = 0;
                                } else {
                                    z8 = true;
                                    iZzj10 = 0;
                                    i10 = 0;
                                }
                            }
                            if (i10 == 0 || paint2 == null) {
                                i11 = i18;
                            } else {
                                int i20 = i15 + 1;
                                float f8 = i15;
                                if (bArr4 != 0) {
                                    iZzj10 = bArr4[iZzj10];
                                }
                                paint2.setColor(iArr[iZzj10]);
                                i11 = 2;
                                canvas.drawRect(i14, f8, i14 + i10, i20, paint2);
                            }
                            i14 += i10;
                            if (z8) {
                                zzeeVar.zzm();
                                continue;
                            } else {
                                i18 = i11;
                                z8 = z8;
                                i16 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i21 = i14;
                        int i22 = 0;
                        while (true) {
                            int iZzj13 = zzeeVar.zzj(8);
                            if (iZzj13 != 0) {
                                i12 = i22;
                                iZzj6 = i17;
                            } else if (zzeeVar.zzi()) {
                                i12 = i22;
                                iZzj6 = zzeeVar.zzj(7);
                                iZzj13 = zzeeVar.zzj(8);
                            } else {
                                int iZzj14 = zzeeVar.zzj(7);
                                if (iZzj14 != 0) {
                                    i12 = i22;
                                    iZzj6 = iZzj14;
                                    iZzj13 = 0;
                                } else {
                                    i12 = i17;
                                    iZzj13 = 0;
                                    iZzj6 = 0;
                                }
                            }
                            if (iZzj6 == 0 || paint2 == null) {
                                i13 = i17;
                            } else {
                                paint2.setColor(iArr[iZzj13]);
                                i13 = i17;
                                canvas.drawRect(i21, i15, i21 + iZzj6, i15 + 1, paint2);
                            }
                            i21 += iZzj6;
                            if (i12 != 0) {
                                i14 = i21;
                                continue;
                            } else {
                                i17 = i13;
                                i22 = i12;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iZzj7) {
                            case 32:
                                bArrZzi3 = zzi(4, 4, zzeeVar);
                                break;
                            case 33:
                                bArrZzi = zzi(4, 8, zzeeVar);
                                break;
                            case 34:
                                bArrZzi2 = zzi(16, 8, zzeeVar);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i15 += 2;
                i14 = i8;
            }
            paint2 = paint;
        }
    }

    private static byte[] zzi(int i7, int i8, zzee zzeeVar) {
        byte[] bArr = new byte[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) zzeeVar.zzj(i8);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i7, int i8, zzaju zzajuVar, zzdf zzdfVar) {
        boolean z7;
        zzajn zzajnVar;
        Canvas canvas;
        char c7;
        char c8;
        char c9;
        int i9;
        Canvas canvas2;
        int i10;
        zzake zzakeVar;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i11;
        int iZzj5;
        zzee zzeeVar = new zzee(bArr, i7 + i8);
        zzeeVar.zzf(i7);
        while (true) {
            z7 = true;
            if (zzeeVar.zzc() >= 48 && zzeeVar.zzj(8) == 15) {
                zzakg zzakgVar = this.zzi;
                int iZzj6 = zzeeVar.zzj(8);
                int iZzj7 = zzeeVar.zzj(16);
                int iZzj8 = zzeeVar.zzj(16);
                int iZze = zzeeVar.zze() + iZzj8;
                if (iZzj8 * 8 > zzeeVar.zzc()) {
                    zzds.zzc("DvbParser", "Data field length exceeds limit");
                    zzeeVar.zzh(zzeeVar.zzc());
                } else {
                    switch (iZzj6) {
                        case 16:
                            if (iZzj7 == zzakgVar.zza) {
                                zzakc zzakcVar = zzakgVar.zzi;
                                int iZzj9 = zzeeVar.zzj(8);
                                int iZzj10 = zzeeVar.zzj(4);
                                int iZzj11 = zzeeVar.zzj(2);
                                zzeeVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i12 = iZzj8 - 2; i12 > 0; i12 -= 6) {
                                    int iZzj12 = zzeeVar.zzj(8);
                                    zzeeVar.zzh(8);
                                    sparseArray.put(iZzj12, new zzakd(zzeeVar.zzj(16), zzeeVar.zzj(16)));
                                }
                                zzakc zzakcVar2 = new zzakc(iZzj9, iZzj10, iZzj11, sparseArray);
                                if (zzakcVar2.zzb != 0) {
                                    zzakgVar.zzi = zzakcVar2;
                                    zzakgVar.zzc.clear();
                                    zzakgVar.zzd.clear();
                                    zzakgVar.zze.clear();
                                } else if (zzakcVar != null) {
                                    if (zzakcVar.zza != zzakcVar2.zza) {
                                        zzakgVar.zzi = zzakcVar2;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzakc zzakcVar3 = zzakgVar.zzi;
                            if (iZzj7 == zzakgVar.zza && zzakcVar3 != null) {
                                int iZzj13 = zzeeVar.zzj(8);
                                zzeeVar.zzh(4);
                                boolean zZzi = zzeeVar.zzi();
                                zzeeVar.zzh(3);
                                int iZzj14 = zzeeVar.zzj(16);
                                int iZzj15 = zzeeVar.zzj(16);
                                int iZzj16 = zzeeVar.zzj(3);
                                int iZzj17 = zzeeVar.zzj(3);
                                zzeeVar.zzh(2);
                                int iZzj18 = zzeeVar.zzj(8);
                                int iZzj19 = zzeeVar.zzj(8);
                                int iZzj20 = zzeeVar.zzj(4);
                                int iZzj21 = zzeeVar.zzj(2);
                                zzeeVar.zzh(2);
                                int i13 = iZzj8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i13 > 0) {
                                    int iZzj22 = zzeeVar.zzj(16);
                                    int iZzj23 = zzeeVar.zzj(2);
                                    int iZzj24 = zzeeVar.zzj(2);
                                    int iZzj25 = zzeeVar.zzj(12);
                                    zzeeVar.zzh(4);
                                    int iZzj26 = zzeeVar.zzj(12);
                                    int i14 = i13 - 6;
                                    if (iZzj23 == 1) {
                                        i13 -= 8;
                                        iZzj = zzeeVar.zzj(8);
                                        iZzj2 = zzeeVar.zzj(8);
                                    } else if (iZzj23 == 2) {
                                        iZzj23 = 2;
                                        i13 -= 8;
                                        iZzj = zzeeVar.zzj(8);
                                        iZzj2 = zzeeVar.zzj(8);
                                    } else {
                                        i13 = i14;
                                        iZzj = 0;
                                        iZzj2 = 0;
                                    }
                                    sparseArray2.put(iZzj22, new zzakf(iZzj23, iZzj24, iZzj25, iZzj26, iZzj, iZzj2));
                                }
                                zzake zzakeVar2 = new zzake(iZzj13, zZzi, iZzj14, iZzj15, iZzj16, iZzj17, iZzj18, iZzj19, iZzj20, iZzj21, sparseArray2);
                                if (zzakcVar3.zzb == 0 && (zzakeVar = (zzake) zzakgVar.zzc.get(zzakeVar2.zza)) != null) {
                                    int i15 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzakeVar.zzj;
                                        if (i15 < sparseArray3.size()) {
                                            zzakeVar2.zzj.put(sparseArray3.keyAt(i15), (zzakf) sparseArray3.valueAt(i15));
                                            i15++;
                                        }
                                    }
                                }
                                zzakgVar.zzc.put(zzakeVar2.zza, zzakeVar2);
                            }
                            break;
                        case 18:
                            if (iZzj7 == zzakgVar.zza) {
                                zzajz zzajzVarZzb = zzb(zzeeVar, iZzj8);
                                zzakgVar.zzd.put(zzajzVarZzb.zza, zzajzVarZzb);
                            } else if (iZzj7 == zzakgVar.zzb) {
                                zzajz zzajzVarZzb2 = zzb(zzeeVar, iZzj8);
                                zzakgVar.zzf.put(zzajzVarZzb2.zza, zzajzVarZzb2);
                            }
                            break;
                        case 19:
                            if (iZzj7 == zzakgVar.zza) {
                                zzakb zzakbVarZzc = zzc(zzeeVar);
                                zzakgVar.zze.put(zzakbVarZzc.zza, zzakbVarZzc);
                            } else if (iZzj7 == zzakgVar.zzb) {
                                zzakb zzakbVarZzc2 = zzc(zzeeVar);
                                zzakgVar.zzg.put(zzakbVarZzc2.zza, zzakbVarZzc2);
                            }
                            break;
                        case 20:
                            if (iZzj7 == zzakgVar.zza) {
                                zzeeVar.zzh(4);
                                boolean zZzi2 = zzeeVar.zzi();
                                zzeeVar.zzh(3);
                                int iZzj27 = zzeeVar.zzj(16);
                                int iZzj28 = zzeeVar.zzj(16);
                                if (zZzi2) {
                                    int iZzj29 = zzeeVar.zzj(16);
                                    iZzj3 = zzeeVar.zzj(16);
                                    iZzj5 = zzeeVar.zzj(16);
                                    iZzj4 = zzeeVar.zzj(16);
                                    i11 = iZzj29;
                                } else {
                                    iZzj3 = iZzj27;
                                    iZzj4 = iZzj28;
                                    i11 = 0;
                                    iZzj5 = 0;
                                }
                                zzakgVar.zzh = new zzaka(iZzj27, iZzj28, i11, iZzj3, iZzj5, iZzj4);
                            }
                            break;
                    }
                    zzeeVar.zzo(iZze - zzeeVar.zze());
                }
            }
        }
        zzakg zzakgVar2 = this.zzi;
        zzakc zzakcVar4 = zzakgVar2.zzi;
        if (zzakcVar4 == null) {
            zzajnVar = new zzajn(zzgjz.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzaka zzakaVar = zzakgVar2.zzh;
            if (zzakaVar == null) {
                zzakaVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzakaVar.zza + 1 != bitmap.getWidth() || zzakaVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzakaVar.zza + 1, zzakaVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzakcVar4.zzc;
            int i16 = 0;
            while (i16 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzakd zzakdVar = (zzakd) sparseArray4.valueAt(i16);
                zzake zzakeVar3 = (zzake) zzakgVar2.zzc.get(sparseArray4.keyAt(i16));
                int i17 = zzakdVar.zza + zzakaVar.zzc;
                int i18 = zzakdVar.zzb + zzakaVar.zze;
                int i19 = zzakeVar3.zzc;
                int i20 = i17 + i19;
                boolean z8 = z7;
                int iMin = Math.min(i20, zzakaVar.zzd);
                int i21 = zzakeVar3.zzd;
                int i22 = i18 + i21;
                canvas3.clipRect(i17, i18, iMin, Math.min(i22, zzakaVar.zzf));
                int i23 = zzakeVar3.zzf;
                zzajz zzajzVar = (zzajz) zzakgVar2.zzd.get(i23);
                if (zzajzVar == null && (zzajzVar = (zzajz) zzakgVar2.zzf.get(i23)) == null) {
                    zzajzVar = this.zzh;
                }
                SparseArray sparseArray5 = zzakeVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i24 = i16;
                int i25 = 0;
                while (i25 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i25);
                    int i26 = i25;
                    zzakf zzakfVar = (zzakf) sparseArray5.valueAt(i25);
                    SparseArray sparseArray7 = sparseArray5;
                    zzakb zzakbVar = (zzakb) zzakgVar2.zze.get(iKeyAt);
                    if (zzakbVar == null) {
                        zzakbVar = (zzakb) zzakgVar2.zzg.get(iKeyAt);
                    }
                    if (zzakbVar != null) {
                        Paint paint = zzakbVar.zzb ? null : this.zzd;
                        int i27 = zzakeVar3.zze;
                        int i28 = zzakfVar.zza + i17;
                        int i29 = i18 + zzakfVar.zzb;
                        canvas2 = canvas3;
                        int[] iArr = i27 == 3 ? zzajzVar.zzd : i27 == 2 ? zzajzVar.zzc : zzajzVar.zzb;
                        i10 = i20;
                        zzh(zzakbVar.zzc, iArr, i27, i28, i29, paint, canvas2);
                        zzh(zzakbVar.zzd, iArr, i27, i28, i29 + 1, paint, canvas2);
                    } else {
                        canvas2 = canvas3;
                        i10 = i20;
                    }
                    i17 = i17;
                    i20 = i10;
                    i25 = i26 + 1;
                    i19 = i19;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzakgVar2 = zzakgVar2;
                }
                zzakg zzakgVar3 = zzakgVar2;
                Canvas canvas4 = canvas3;
                int i30 = i17;
                int i31 = i19;
                int i32 = i20;
                float f7 = i18;
                float f8 = i30;
                if (zzakeVar3.zzb) {
                    int i33 = zzakeVar3.zze;
                    if (i33 == 3) {
                        i9 = zzajzVar.zzd[zzakeVar3.zzg];
                        c9 = 2;
                    } else {
                        c9 = 2;
                        i9 = i33 == 2 ? zzajzVar.zzc[zzakeVar3.zzh] : zzajzVar.zzb[zzakeVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i9);
                    float f9 = i32;
                    c8 = c9;
                    c7 = 3;
                    canvas = canvas4;
                    canvas.drawRect(f8, f7, f9, i22, paint2);
                } else {
                    canvas = canvas4;
                    c7 = 3;
                    c8 = 2;
                }
                zzck zzckVar = new zzck();
                zzckVar.zzc(Bitmap.createBitmap(this.zzj, i30, i18, i31, i21));
                float f10 = zzakaVar.zza;
                zzckVar.zzi(f8 / f10);
                zzckVar.zzj(0);
                float f11 = zzakaVar.zzb;
                zzckVar.zzf(f7 / f11, 0);
                zzckVar.zzg(0);
                zzckVar.zzm(i31 / f10);
                zzckVar.zzn(i21 / f11);
                arrayList.add(zzckVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i16 = i24 + 1;
                z7 = z8;
                zzakgVar2 = zzakgVar3;
                sparseArray4 = sparseArray6;
            }
            zzajnVar = new zzajn(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdfVar.zza(zzajnVar);
    }
}
