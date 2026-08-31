package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacl implements zzacv {
    private final zzi zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    static {
        zzak.zzb("media3.extractor");
    }

    public zzacl(zzi zziVar, long j7, long j8) {
        this.zzb = zziVar;
        this.zzd = j7;
        this.zzc = j8;
    }

    private final void zzp(int i7) {
        int i8 = this.zzf + i7;
        int length = this.zze.length;
        if (i8 > length) {
            String str = zzeo.zza;
            this.zze = Arrays.copyOf(this.zze, Math.max(65536 + i8, Math.min(length + length, i8 + 524288)));
        }
    }

    private final int zzq(int i7) {
        int iMin = Math.min(this.zzg, i7);
        zzs(iMin);
        return iMin;
    }

    private final int zzr(byte[] bArr, int i7, int i8) {
        int i9 = this.zzg;
        if (i9 == 0) {
            return 0;
        }
        int iMin = Math.min(i9, i8);
        System.arraycopy(this.zze, 0, bArr, i7, iMin);
        zzs(iMin);
        return iMin;
    }

    private final void zzs(int i7) {
        int i8 = this.zzg - i7;
        this.zzg = i8;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i8 < bArr.length + (-524288) ? new byte[65536 + i8] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        this.zze = bArr2;
    }

    private final int zzt(byte[] bArr, int i7, int i8, int i9, boolean z7) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iZza = this.zzb.zza(bArr, i7 + i9, i8 - i9);
        if (iZza != -1) {
            return i9 + iZza;
        }
        if (i9 == 0 && z7) {
            return -1;
        }
        throw new EOFException();
    }

    private final void zzu(int i7) {
        if (i7 != -1) {
            this.zzd += (long) i7;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        int iZzr = zzr(bArr, i7, i8);
        if (iZzr == 0) {
            iZzr = zzt(bArr, i7, i8, 0, true);
        }
        zzu(iZzr);
        return iZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzb(byte[] bArr, int i7, int i8, boolean z7) throws EOFException, InterruptedIOException {
        int iZzr = zzr(bArr, i7, i8);
        while (iZzr < i8 && iZzr != -1) {
            iZzr = zzt(bArr, i7, i8, iZzr, z7);
        }
        zzu(iZzr);
        return iZzr != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzc(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        zzb(bArr, i7, i8, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzd(int i7) throws EOFException, InterruptedIOException {
        int iZzq = zzq(1);
        if (iZzq == 0) {
            iZzq = zzt(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzu(iZzq);
        return iZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zze(int i7, boolean z7) throws EOFException, InterruptedIOException {
        int iZzq = zzq(i7);
        while (iZzq < i7 && iZzq != -1) {
            iZzq = zzt(this.zza, -iZzq, Math.min(i7, iZzq + 4096), iZzq, z7);
        }
        zzu(iZzq);
        return iZzq != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(int i7) throws EOFException, InterruptedIOException {
        zze(i7, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzg(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        zzacl zzaclVar;
        int iMin;
        zzp(i8);
        int i9 = this.zzg;
        int i10 = this.zzf;
        int i11 = i9 - i10;
        if (i11 == 0) {
            zzaclVar = this;
            iMin = zzaclVar.zzt(this.zze, i10, i8, 0, true);
            if (iMin == -1) {
                return -1;
            }
            zzaclVar.zzg += iMin;
        } else {
            zzaclVar = this;
            iMin = Math.min(i8, i11);
        }
        System.arraycopy(zzaclVar.zze, zzaclVar.zzf, bArr, i7, iMin);
        zzaclVar.zzf += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzh(byte[] bArr, int i7, int i8, boolean z7) {
        if (!zzj(i8, z7)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i8, bArr, i7, i8);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzi(byte[] bArr, int i7, int i8) {
        zzh(bArr, i7, i8, false);
    }

    public final boolean zzj(int i7, boolean z7) throws EOFException, InterruptedIOException {
        zzp(i7);
        int iZzt = this.zzg - this.zzf;
        while (iZzt < i7) {
            int i8 = i7;
            boolean z8 = z7;
            iZzt = zzt(this.zze, this.zzf, i8, iZzt, z8);
            if (iZzt == -1) {
                return false;
            }
            this.zzg = this.zzf + iZzt;
            i7 = i8;
            z7 = z8;
        }
        this.zzf += i7;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzk(int i7) throws EOFException, InterruptedIOException {
        zzj(i7, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzl() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final long zzm() {
        return this.zzd + ((long) this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final long zzn() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final long zzo() {
        return this.zzc;
    }
}
