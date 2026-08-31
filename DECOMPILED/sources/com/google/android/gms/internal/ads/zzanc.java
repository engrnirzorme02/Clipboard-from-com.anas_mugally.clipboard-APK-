package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzanc implements zzacu {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzamy zzi;
    private zzacx zzj;
    private boolean zzk;
    private final zzel zza = new zzel(0);
    private final zzef zzc = new zzef(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzamz zzd = new zzamz();

    static {
        int i7 = zzanb.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        zzacl zzaclVar = (zzacl) zzacvVar;
        zzaclVar.zzh(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzaclVar.zzj(bArr[13] & 7, false);
        zzaclVar.zzh(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzj = zzacxVar;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) {
        zzamd zzamfVar;
        zzacx zzacxVar = this.zzj;
        zzacxVar.getClass();
        long jZzo = zzacvVar.zzo();
        if (jZzo != -1) {
            zzamz zzamzVar = this.zzd;
            if (!zzamzVar.zza()) {
                return zzamzVar.zzc(zzacvVar, zzadsVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            zzamz zzamzVar2 = this.zzd;
            if (zzamzVar2.zzd() != -9223372036854775807L) {
                zzamy zzamyVar = new zzamy(zzamzVar2.zzb(), zzamzVar2.zzd(), jZzo);
                this.zzi = zzamyVar;
                this.zzj.zzw(zzamyVar.zza());
            } else {
                zzacxVar.zzw(new zzadu(zzamzVar2.zzd(), 0L));
            }
        }
        zzamy zzamyVar2 = this.zzi;
        if (zzamyVar2 != null && zzamyVar2.zzc()) {
            return zzamyVar2.zzd(zzacvVar, zzadsVar);
        }
        zzacvVar.zzl();
        long jZzm = jZzo != -1 ? jZzo - zzacvVar.zzm() : -1L;
        if (jZzm != -1 && jZzm < 4) {
            return -1;
        }
        zzef zzefVar = this.zzc;
        if (!zzacvVar.zzh(zzefVar.zzi(), 0, 4, true)) {
            return -1;
        }
        zzefVar.zzh(0);
        int iZzB = zzefVar.zzB();
        if (iZzB == 441) {
            return -1;
        }
        if (iZzB == 442) {
            zzacvVar.zzi(zzefVar.zzi(), 0, 10);
            zzefVar.zzh(9);
            zzacvVar.zzf((zzefVar.zzs() & 7) + 14);
            return 0;
        }
        if (iZzB == 443) {
            zzacvVar.zzi(zzefVar.zzi(), 0, 2);
            zzefVar.zzh(0);
            zzacvVar.zzf(zzefVar.zzt() + 6);
            return 0;
        }
        if ((iZzB >> 8) != 1) {
            zzacvVar.zzf(1);
            return 0;
        }
        int i7 = iZzB & 255;
        SparseArray sparseArray = this.zzb;
        zzana zzanaVar = (zzana) sparseArray.get(i7);
        if (!this.zze) {
            if (zzanaVar == null) {
                zzamd zzamdVar = null;
                if (i7 == 189) {
                    zzamfVar = new zzalt(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzacvVar.zzn();
                } else if ((iZzB & 224) == 192) {
                    zzamfVar = new zzamp(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzacvVar.zzn();
                } else if ((iZzB & 240) == 224) {
                    zzamfVar = new zzamf(null, "video/mp2p");
                    this.zzg = true;
                    this.zzh = zzacvVar.zzn();
                } else if (zzamdVar != null) {
                    zzamdVar.zzb(this.zzj, new zzanr(Integer.MIN_VALUE, i7, 256));
                    zzanaVar = new zzana(zzamdVar, this.zza);
                    sparseArray.put(i7, zzanaVar);
                }
                zzamdVar = zzamfVar;
                if (zzamdVar != null) {
                    zzamdVar.zzb(this.zzj, new zzanr(Integer.MIN_VALUE, i7, 256));
                    zzanaVar = new zzana(zzamdVar, this.zza);
                    sparseArray.put(i7, zzanaVar);
                }
            }
            long j7 = 1048576;
            if (this.zzf && this.zzg) {
                j7 = 8192 + this.zzh;
            }
            if (zzacvVar.zzn() > j7) {
                this.zze = true;
                this.zzj.zzv();
            }
        }
        zzacvVar.zzi(zzefVar.zzi(), 0, 2);
        zzefVar.zzh(0);
        int iZzt = zzefVar.zzt() + 6;
        if (zzanaVar == null) {
            zzacvVar.zzf(iZzt);
        } else {
            zzefVar.zza(iZzt);
            zzacvVar.zzc(zzefVar.zzi(), 0, iZzt);
            zzefVar.zzh(6);
            zzanaVar.zzb(zzefVar);
            zzefVar.zzf(zzefVar.zzj());
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        zzel zzelVar = this.zza;
        if (zzelVar.zzc() != -9223372036854775807L) {
            long jZza = zzelVar.zza();
            if (jZza != -9223372036854775807L && jZza != 0 && jZza != j8) {
                zzelVar.zzd(j8);
            }
        } else {
            zzelVar.zzd(j8);
        }
        zzamy zzamyVar = this.zzi;
        int i7 = 0;
        if (zzamyVar != null) {
            zzamyVar.zzb(j8);
        }
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i7 >= sparseArray.size()) {
                return;
            }
            ((zzana) sparseArray.valueAt(i7)).zza();
            i7++;
        }
    }
}
