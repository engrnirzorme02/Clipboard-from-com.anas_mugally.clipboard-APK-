package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaje {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzef zzg = new zzef(255);

    zzaje() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzacv zzacvVar, long j7) {
        zzghc.zza(zzacvVar.zzn() == zzacvVar.zzm());
        zzef zzefVar = this.zzg;
        zzefVar.zza(4);
        while (true) {
            if ((j7 != -1 && zzacvVar.zzn() + 4 >= j7) || !zzacy.zze(zzacvVar, zzefVar.zzi(), 0, 4, true)) {
                break;
            }
            zzefVar.zzh(0);
            if (zzefVar.zzz() == 1332176723) {
                zzacvVar.zzl();
                return true;
            }
            zzacvVar.zzf(1);
        }
        do {
            if (j7 != -1 && zzacvVar.zzn() >= j7) {
                break;
            }
        } while (zzacvVar.zzd(1) != -1);
        return false;
    }

    public final boolean zzc(zzacv zzacvVar, boolean z7) throws zzas {
        zza();
        zzef zzefVar = this.zzg;
        zzefVar.zza(27);
        if (zzacy.zze(zzacvVar, zzefVar.zzi(), 0, 27, z7) && zzefVar.zzz() == 1332176723) {
            if (zzefVar.zzs() != 0) {
                if (z7) {
                    return false;
                }
                throw zzas.zzc("unsupported bit stream revision");
            }
            this.zza = zzefVar.zzs();
            this.zzb = zzefVar.zzE();
            zzefVar.zzA();
            zzefVar.zzA();
            zzefVar.zzA();
            int iZzs = zzefVar.zzs();
            this.zzc = iZzs;
            this.zzd = iZzs + 27;
            zzefVar.zza(iZzs);
            if (zzacy.zze(zzacvVar, zzefVar.zzi(), 0, this.zzc, z7)) {
                for (int i7 = 0; i7 < this.zzc; i7++) {
                    int[] iArr = this.zzf;
                    int iZzs2 = zzefVar.zzs();
                    iArr[i7] = iZzs2;
                    this.zze += iZzs2;
                }
                return true;
            }
        }
        return false;
    }
}
