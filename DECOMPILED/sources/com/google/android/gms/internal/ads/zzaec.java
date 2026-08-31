package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaec {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzacv zzacvVar) {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzacvVar.zzi(bArr, 0, 10);
        zzacvVar.zzl();
        int i7 = zzabv.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(zzaeb zzaebVar, long j7, int i7, int i8, int i9, zzaea zzaeaVar) {
        zzghc.zzi(this.zzg <= i8 + i9, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i10 = this.zzc;
            int i11 = i10 + 1;
            this.zzc = i11;
            if (i10 == 0) {
                this.zzd = j7;
                this.zze = i7;
                this.zzf = 0;
            }
            this.zzf += i8;
            this.zzg = i9;
            if (i11 >= 16) {
                zzd(zzaebVar, zzaeaVar);
            }
        }
    }

    public final void zzd(zzaeb zzaebVar, zzaea zzaeaVar) {
        if (this.zzc > 0) {
            zzaebVar.zzx(this.zzd, this.zze, this.zzf, this.zzg, zzaeaVar);
            this.zzc = 0;
        }
    }
}
