package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaly implements zzacu {
    private final zzalz zza;
    private final zzef zzb;
    private final zzef zzc;
    private final zzee zzd;
    private zzacx zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        int i7 = zzalx.zza;
    }

    public zzaly() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws EOFException, InterruptedIOException {
        zzef zzefVar;
        int i7 = 0;
        while (true) {
            zzefVar = this.zzc;
            zzacl zzaclVar = (zzacl) zzacvVar;
            zzaclVar.zzh(zzefVar.zzi(), 0, 10, false);
            zzefVar.zzh(0);
            if (zzefVar.zzx() != 4801587) {
                break;
            }
            zzefVar.zzk(3);
            int iZzG = zzefVar.zzG();
            i7 += iZzG + 10;
            zzaclVar.zzj(iZzG, false);
        }
        zzacvVar.zzl();
        zzacl zzaclVar2 = (zzacl) zzacvVar;
        zzaclVar2.zzj(i7, false);
        if (this.zzg == -1) {
            this.zzg = i7;
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = i7;
        do {
            zzaclVar2.zzh(zzefVar.zzi(), 0, 2, false);
            zzefVar.zzh(0);
            if (zzalz.zzf(zzefVar.zzt())) {
                i8++;
                if (i8 >= 4 && i9 > 188) {
                    return true;
                }
                zzaclVar2.zzh(zzefVar.zzi(), 0, 4, false);
                zzee zzeeVar = this.zzd;
                zzeeVar.zzf(14);
                int iZzj = zzeeVar.zzj(13);
                if (iZzj <= 6) {
                    i10++;
                    zzacvVar.zzl();
                    zzaclVar2.zzj(i10, false);
                } else {
                    zzaclVar2.zzj(iZzj - 6, false);
                    i9 += iZzj;
                }
            } else {
                i10++;
                zzacvVar.zzl();
                zzaclVar2.zzj(i10, false);
            }
            i8 = 0;
            i9 = 0;
        } while (i10 - i7 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zze = zzacxVar;
        this.zza.zzb(zzacxVar, new zzanr(Integer.MIN_VALUE, 0, 1));
        zzacxVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) {
        this.zze.getClass();
        zzef zzefVar = this.zzb;
        int iZza = zzacvVar.zza(zzefVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzadu(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzefVar.zzh(0);
        zzefVar.zzf(iZza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzefVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j8;
    }

    public zzaly(int i7) {
        this.zza = new zzalz(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzef(2048);
        this.zzg = -1L;
        zzef zzefVar = new zzef(10);
        this.zzc = zzefVar;
        byte[] bArrZzi = zzefVar.zzi();
        this.zzd = new zzee(bArrZzi, bArrZzi.length);
    }
}
