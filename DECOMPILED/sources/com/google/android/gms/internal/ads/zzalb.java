package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzalb {
    private boolean zzb;
    private boolean zzc;
    private int[] zzd;
    private int zze;
    private int zzf;
    private Rect zzg;
    private final int[] zza = new int[4];
    private int zzh = -1;
    private int zzi = -1;

    private static int zze(int[] iArr, int i7) {
        if (i7 >= iArr.length) {
            i7 = 0;
        }
        return iArr[i7];
    }

    private static int zzf(int i7, int i8) {
        return (i7 & 16777215) | ((i8 * 17) << 24);
    }

    private final void zzg(zzee zzeeVar, boolean z7, Rect rect, int[] iArr) {
        int i7;
        int i8;
        int i9 = !z7 ? 1 : 0;
        int iWidth = rect.width();
        int i10 = i9 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i11 = 0;
            do {
                int i12 = 1;
                int iZzj = 0;
                while (true) {
                    if (iZzj >= i12 || i12 > 64) {
                        i7 = iZzj & 3;
                        if (iZzj >= 4) {
                            i8 = iZzj >> 2;
                            break;
                        } else {
                            i8 = iWidth;
                            break;
                        }
                    }
                    if (zzeeVar.zzc() < 4) {
                        i7 = -1;
                        i8 = 0;
                        break;
                    } else {
                        iZzj = (iZzj << 4) | zzeeVar.zzj(4);
                        i12 <<= 2;
                    }
                }
                int iMin = Math.min(i8, iWidth - i11);
                if (iMin > 0) {
                    int i13 = i10 + iMin;
                    Arrays.fill(iArr, i10, i13, this.zza[i7]);
                    i11 += iMin;
                    i10 = i13;
                }
            } while (i11 < iWidth);
            i9 += 2;
            if (i9 >= iHeight) {
                return;
            }
            i10 = i9 * iWidth;
            zzeeVar.zzm();
        }
    }

    public final void zza(String str) {
        int i7;
        String strTrim = str.trim();
        String str2 = zzeo.zza;
        for (String str3 : strTrim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                String[] strArrSplit = str3.substring(9).split(",", -1);
                this.zzd = new int[strArrSplit.length];
                for (int i8 = 0; i8 < strArrSplit.length; i8++) {
                    int[] iArr = this.zzd;
                    try {
                        i7 = Integer.parseInt(strArrSplit[i8].trim(), 16);
                    } catch (RuntimeException unused) {
                        i7 = 0;
                    }
                    iArr[i8] = i7;
                }
            } else if (str3.startsWith("size: ")) {
                String[] strArrSplit2 = str3.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        this.zze = Integer.parseInt(strArrSplit2[0]);
                        this.zzf = Integer.parseInt(strArrSplit2[1]);
                        this.zzb = true;
                    } catch (RuntimeException e7) {
                        zzds.zzd("VobsubParser", "Parsing IDX failed", e7);
                    }
                }
            }
        }
    }

    public final void zzb(zzef zzefVar) {
        int[] iArr = this.zzd;
        if (iArr == null || !this.zzb) {
            return;
        }
        zzefVar.zzk(zzefVar.zzt() - 2);
        int iZzt = zzefVar.zzt();
        while (zzefVar.zzg() < iZzt && zzefVar.zzd() > 0) {
            switch (zzefVar.zzs()) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    if (zzefVar.zzd() < 2) {
                        return;
                    }
                    int iZzs = zzefVar.zzs();
                    int iZzs2 = zzefVar.zzs();
                    int[] iArr2 = this.zza;
                    iArr2[3] = zze(iArr, iZzs >> 4);
                    iArr2[2] = zze(iArr, iZzs & 15);
                    iArr2[1] = zze(iArr, iZzs2 >> 4);
                    iArr2[0] = zze(iArr, iZzs2 & 15);
                    this.zzc = true;
                    break;
                case 4:
                    if (zzefVar.zzd() < 2 || !this.zzc) {
                        return;
                    }
                    int iZzs3 = zzefVar.zzs();
                    int iZzs4 = zzefVar.zzs();
                    int[] iArr3 = this.zza;
                    iArr3[3] = zzf(iArr3[3], iZzs3 >> 4);
                    iArr3[2] = zzf(iArr3[2], iZzs3 & 15);
                    iArr3[1] = zzf(iArr3[1], iZzs4 >> 4);
                    iArr3[0] = zzf(iArr3[0], iZzs4 & 15);
                    break;
                case 5:
                    if (zzefVar.zzd() < 6) {
                        return;
                    }
                    int iZzs5 = zzefVar.zzs();
                    int iZzs6 = zzefVar.zzs();
                    int i7 = iZzs6 >> 4;
                    int iZzs7 = ((iZzs6 & 15) << 8) | zzefVar.zzs();
                    int iZzs8 = zzefVar.zzs();
                    int iZzs9 = zzefVar.zzs();
                    this.zzg = new Rect((iZzs5 << 4) | i7, (iZzs8 << 4) | (iZzs9 >> 4), iZzs7 + 1, (((iZzs9 & 15) << 8) | zzefVar.zzs()) + 1);
                    break;
                case 6:
                    if (zzefVar.zzd() < 4) {
                        return;
                    }
                    this.zzh = zzefVar.zzt();
                    this.zzi = zzefVar.zzt();
                    break;
                default:
                    return;
            }
        }
    }

    public final zzcl zzc(zzef zzefVar) {
        Rect rect;
        if (this.zzd == null || !this.zzb || !this.zzc || (rect = this.zzg) == null || this.zzh == -1 || this.zzi == -1 || rect.width() < 2 || this.zzg.height() < 2) {
            return null;
        }
        Rect rect2 = this.zzg;
        int[] iArr = new int[rect2.width() * rect2.height()];
        zzee zzeeVar = new zzee();
        zzefVar.zzh(this.zzh);
        zzeeVar.zza(zzefVar);
        zzg(zzeeVar, true, rect2, iArr);
        zzefVar.zzh(this.zzi);
        zzeeVar.zza(zzefVar);
        zzg(zzeeVar, false, rect2, iArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        zzck zzckVar = new zzck();
        zzckVar.zzc(bitmapCreateBitmap);
        zzckVar.zzi(rect2.left / this.zze);
        zzckVar.zzj(0);
        zzckVar.zzf(rect2.top / this.zzf, 0);
        zzckVar.zzg(0);
        zzckVar.zzm(rect2.width() / this.zze);
        zzckVar.zzn(rect2.height() / this.zzf);
        return zzckVar.zzr();
    }

    public final void zzd() {
        this.zzc = false;
        this.zzg = null;
        this.zzh = -1;
        this.zzi = -1;
    }
}
