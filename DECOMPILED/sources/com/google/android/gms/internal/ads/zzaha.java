package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzaha {
    private final zzef zza = new zzef(8);
    private int zzb;

    private final long zzb(zzacv zzacvVar) {
        int i7;
        zzef zzefVar = this.zza;
        zzacl zzaclVar = (zzacl) zzacvVar;
        int i8 = 0;
        zzaclVar.zzh(zzefVar.zzi(), 0, 1, false);
        int i9 = zzefVar.zzi()[0] & 255;
        if (i9 == 0) {
            return Long.MIN_VALUE;
        }
        int i10 = 128;
        int i11 = 0;
        while (true) {
            i7 = i11 + 1;
            if ((i9 & i10) != 0) {
                break;
            }
            i10 >>= 1;
            i11 = i7;
        }
        int i12 = i9 & (~i10);
        zzaclVar.zzh(zzefVar.zzi(), 1, i11, false);
        while (i8 < i11) {
            i8++;
            i12 = (zzefVar.zzi()[i8] & 255) + (i12 << 8);
        }
        this.zzb += i7;
        return i12;
    }

    public final boolean zza(zzacv zzacvVar) throws EOFException, InterruptedIOException {
        long jZzo = zzacvVar.zzo();
        long j7 = 1024;
        if (jZzo != -1 && jZzo <= 1024) {
            j7 = jZzo;
        }
        zzef zzefVar = this.zza;
        zzacl zzaclVar = (zzacl) zzacvVar;
        zzaclVar.zzh(zzefVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long jZzz = zzefVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | ((long) (zzefVar.zzi()[0] & 255))) {
            int i7 = (int) j7;
            int i8 = this.zzb + 1;
            this.zzb = i8;
            if (i8 == i7) {
                return false;
            }
            zzaclVar.zzh(zzefVar.zzi(), 0, 1, false);
        }
        long jZzb = zzb(zzacvVar);
        long j8 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j9 = j8 + jZzb;
            if (jZzo == -1 || j9 < jZzo) {
                while (true) {
                    long j10 = this.zzb;
                    if (j10 < j9) {
                        if (zzb(zzacvVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzacvVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i9 = (int) jZzb2;
                            zzaclVar.zzj(i9, false);
                            this.zzb += i9;
                        }
                    } else if (j10 == j9) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
