package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadx implements zzacu {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzacx zzf;
    private zzaeb zzg;

    public zzadx(int i7, int i8, String str) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) {
        int i7 = this.zza;
        zzghc.zzh((i7 == -1 || this.zzb == -1) ? false : true);
        int i8 = this.zzb;
        zzef zzefVar = new zzef(i8);
        ((zzacl) zzacvVar).zzh(zzefVar.zzi(), 0, i8, false);
        return zzefVar.zzt() == i7;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzf = zzacxVar;
        zzaeb zzaebVarZzu = zzacxVar.zzu(1024, 4);
        this.zzg = zzaebVarZzu;
        zzs zzsVar = new zzs();
        String str = this.zzc;
        zzsVar.zzl(str);
        zzsVar.zzm(str);
        zzaebVarZzu.zzu(zzsVar.zzM());
        this.zzf.zzv();
        this.zzf.zzw(new zzady(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) {
        int i7 = this.zze;
        if (i7 != 1) {
            if (i7 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzaeb zzaebVar = this.zzg;
        zzaebVar.getClass();
        int iZzy = zzaebVar.zzy(zzacvVar, 1024, true);
        if (iZzy == -1) {
            this.zze = 2;
            this.zzg.zzx(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZzy;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        if (j7 == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }
}
