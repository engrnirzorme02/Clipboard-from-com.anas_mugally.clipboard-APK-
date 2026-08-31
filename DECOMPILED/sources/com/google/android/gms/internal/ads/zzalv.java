package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalv implements zzacu {
    private final zzalw zza = new zzalw(null, 0, "audio/ac4");
    private final zzef zzb = new zzef(16384);
    private boolean zzc;

    static {
        int i7 = zzalu.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws EOFException, InterruptedIOException {
        int i7;
        char c7 = 2;
        zzef zzefVar = new zzef(10);
        int i8 = 0;
        while (true) {
            zzacl zzaclVar = (zzacl) zzacvVar;
            zzaclVar.zzh(zzefVar.zzi(), 0, 10, false);
            zzefVar.zzh(0);
            if (zzefVar.zzx() != 4801587) {
                break;
            }
            char c8 = c7;
            zzefVar.zzk(3);
            int iZzG = zzefVar.zzG();
            i8 += iZzG + 10;
            zzaclVar.zzj(iZzG, false);
            c7 = c8;
        }
        zzacvVar.zzl();
        zzacl zzaclVar2 = (zzacl) zzacvVar;
        zzaclVar2.zzj(i8, false);
        int i9 = 0;
        int i10 = i8;
        while (true) {
            int i11 = 7;
            zzaclVar2.zzh(zzefVar.zzi(), 0, 7, false);
            zzefVar.zzh(0);
            int iZzt = zzefVar.zzt();
            if (iZzt == 44096 || iZzt == 44097) {
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                byte[] bArrZzi = zzefVar.zzi();
                int i12 = zzaby.zza;
                if (bArrZzi.length < 7) {
                    i7 = -1;
                } else {
                    int i13 = (bArrZzi[3] & 255) | ((bArrZzi[c7] & 255) << 8);
                    if (i13 == 65535) {
                        i13 = ((bArrZzi[4] & 255) << 16) | ((bArrZzi[5] & 255) << 8) | (bArrZzi[6] & 255);
                    } else {
                        i11 = 4;
                    }
                    if (iZzt == 44097) {
                        i11 += 2;
                    }
                    i7 = i13 + i11;
                }
                if (i7 == -1) {
                    return false;
                }
                zzaclVar2.zzj(i7 - 7, false);
                c7 = c7;
            } else {
                zzacvVar.zzl();
                i10++;
                if (i10 - i8 >= 8192) {
                    return false;
                }
                zzaclVar2.zzj(i10, false);
                i9 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zza.zzb(zzacxVar, new zzanr(Integer.MIN_VALUE, 0, 1));
        zzacxVar.zzv();
        zzacxVar.zzw(new zzadu(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) {
        zzef zzefVar = this.zzb;
        int iZza = zzacvVar.zza(zzefVar.zzi(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        zzefVar.zzh(0);
        zzefVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzefVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        this.zzc = false;
        this.zza.zza();
    }
}
