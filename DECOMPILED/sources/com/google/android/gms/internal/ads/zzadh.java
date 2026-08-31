package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadh {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzadg zzk;
    private final zzao zzl;

    zzadh(int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, zzadg zzadgVar, zzao zzaoVar) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = zzf(i11);
        this.zzg = i12;
        this.zzh = i13;
        this.zzi = zzg(i13);
        this.zzj = j7;
        this.zzk = zzadgVar;
        this.zzl = zzaoVar;
    }

    private static int zzf(int i7) {
        switch (i7) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int zzg(int i7) {
        if (i7 == 8) {
            return 1;
        }
        if (i7 == 12) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 20) {
            return 5;
        }
        if (i7 != 24) {
            return i7 != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long zza() {
        long j7 = this.zzj;
        if (j7 == 0) {
            return -9223372036854775807L;
        }
        return (j7 * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j7) {
        String str = zzeo.zza;
        return Math.max(0L, Math.min((j7 * ((long) this.zze)) / 1000000, this.zzj - 1));
    }

    public final zzu zzc(byte[] bArr, zzao zzaoVar) {
        bArr[4] = -128;
        zzao zzaoVarZzd = zzd(zzaoVar);
        zzs zzsVar = new zzs();
        zzsVar.zzm("audio/flac");
        int i7 = this.zzd;
        if (i7 <= 0) {
            i7 = -1;
        }
        zzsVar.zzn(i7);
        zzsVar.zzE(this.zzg);
        zzsVar.zzF(this.zze);
        zzsVar.zzG(zzeo.zzz(this.zzh, ByteOrder.LITTLE_ENDIAN));
        zzsVar.zzp(Collections.singletonList(bArr));
        zzsVar.zzk(zzaoVarZzd);
        return zzsVar.zzM();
    }

    public final zzao zzd(zzao zzaoVar) {
        zzao zzaoVar2 = this.zzl;
        return zzaoVar2 == null ? zzaoVar : zzaoVar2.zzc(zzaoVar);
    }

    public final zzadh zze(zzadg zzadgVar) {
        return new zzadh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzadgVar, this.zzl);
    }

    public zzadh(byte[] bArr, int i7) {
        zzee zzeeVar = new zzee(bArr, bArr.length);
        zzeeVar.zzf(i7 * 8);
        this.zza = zzeeVar.zzj(16);
        this.zzb = zzeeVar.zzj(16);
        this.zzc = zzeeVar.zzj(24);
        this.zzd = zzeeVar.zzj(24);
        int iZzj = zzeeVar.zzj(20);
        this.zze = iZzj;
        this.zzf = zzf(iZzj);
        this.zzg = zzeeVar.zzj(3) + 1;
        int iZzj2 = zzeeVar.zzj(5) + 1;
        this.zzh = iZzj2;
        this.zzi = zzg(iZzj2);
        this.zzj = zzeeVar.zzk(36);
        this.zzk = null;
        this.zzl = null;
    }
}
