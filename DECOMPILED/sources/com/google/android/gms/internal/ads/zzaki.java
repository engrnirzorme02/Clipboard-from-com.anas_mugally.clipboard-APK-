package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzaki {
    private final zzef zza = new zzef();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public final zzcl zza() {
        int i7;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzef zzefVar = this.zza;
        if (zzefVar.zze() == 0 || zzefVar.zzg() != zzefVar.zze() || !this.zzc) {
            return null;
        }
        zzefVar.zzh(0);
        int i8 = this.zzh * this.zzi;
        int[] iArr = new int[i8];
        int i9 = 0;
        while (i9 < i8) {
            int iZzs = zzefVar.zzs();
            if (iZzs != 0) {
                i7 = i9 + 1;
                iArr[i9] = this.zzb[iZzs];
            } else {
                int iZzs2 = zzefVar.zzs();
                if (iZzs2 != 0) {
                    int iZzs3 = iZzs2 & 63;
                    if ((iZzs2 & 64) != 0) {
                        iZzs3 = (iZzs3 << 8) | zzefVar.zzs();
                    }
                    i7 = iZzs3 + i9;
                    Arrays.fill(iArr, i9, i7, (iZzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzefVar.zzs()]);
                }
            }
            i9 = i7;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzck zzckVar = new zzck();
        zzckVar.zzc(bitmapCreateBitmap);
        zzckVar.zzi(this.zzf / this.zzd);
        zzckVar.zzj(0);
        zzckVar.zzf(this.zzg / this.zze, 0);
        zzckVar.zzg(0);
        zzckVar.zzm(this.zzh / this.zzd);
        zzckVar.zzn(this.zzi / this.zze);
        return zzckVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    final /* synthetic */ void zzc(zzef zzefVar, int i7) {
        if (i7 % 5 != 2) {
            return;
        }
        zzef zzefVar2 = zzefVar;
        zzefVar2.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i8 = i7 / 5;
        int i9 = 0;
        while (i9 < i8) {
            int iZzs = zzefVar2.zzs();
            int iZzs2 = zzefVar2.zzs();
            int iZzs3 = zzefVar2.zzs();
            int iZzs4 = zzefVar2.zzs();
            double d7 = iZzs2;
            int iZzs5 = zzefVar2.zzs() << 24;
            String str = zzeo.zza;
            double d8 = iZzs3 - 128;
            double d9 = iZzs4 - 128;
            iArr[iZzs] = (Math.max(0, Math.min((int) (d7 + (1.402d * d8)), 255)) << 16) | iZzs5 | (Math.max(0, Math.min((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) (d7 + (d9 * 1.772d)), 255));
            i9++;
            zzefVar2 = zzefVar;
        }
        this.zzc = true;
    }

    final /* synthetic */ void zzd(zzef zzefVar, int i7) {
        int iZzx;
        if (i7 < 4) {
            return;
        }
        zzefVar.zzk(3);
        int i8 = i7 - 4;
        if ((zzefVar.zzs() & 128) != 0) {
            if (i8 < 7 || (iZzx = zzefVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzefVar.zzt();
            this.zzi = zzefVar.zzt();
            this.zza.zza(iZzx - 4);
            i8 = i7 - 11;
        }
        zzef zzefVar2 = this.zza;
        int iZzg = zzefVar2.zzg();
        int iZze = zzefVar2.zze();
        if (iZzg >= iZze || i8 <= 0) {
            return;
        }
        int iMin = Math.min(i8, iZze - iZzg);
        zzefVar.zzm(zzefVar2.zzi(), iZzg, iMin);
        zzefVar2.zzh(iZzg + iMin);
    }

    final /* synthetic */ void zze(zzef zzefVar, int i7) {
        if (i7 < 19) {
            return;
        }
        this.zzd = zzefVar.zzt();
        this.zze = zzefVar.zzt();
        zzefVar.zzk(11);
        this.zzf = zzefVar.zzt();
        this.zzg = zzefVar.zzt();
    }
}
