package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzana {
    private final zzamd zza;
    private final zzel zzb;
    private final zzee zzc = new zzee(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzana(zzamd zzamdVar, zzel zzelVar) {
        this.zza = zzamdVar;
        this.zzb = zzelVar;
    }

    public final void zza() {
        this.zzf = false;
        this.zza.zza();
    }

    public final void zzb(zzef zzefVar) {
        long jZze;
        char c7;
        zzee zzeeVar = this.zzc;
        zzefVar.zzm(zzeeVar.zza, 0, 3);
        zzeeVar.zzf(0);
        zzeeVar.zzh(8);
        this.zzd = zzeeVar.zzi();
        this.zze = zzeeVar.zzi();
        zzeeVar.zzh(6);
        zzefVar.zzm(zzeeVar.zza, 0, zzeeVar.zzj(8));
        zzeeVar.zzf(0);
        if (this.zzd) {
            zzeeVar.zzh(4);
            long jZzj = zzeeVar.zzj(3);
            zzeeVar.zzh(1);
            int iZzj = zzeeVar.zzj(15) << 15;
            zzeeVar.zzh(1);
            long jZzj2 = zzeeVar.zzj(15);
            zzeeVar.zzh(1);
            if (this.zzf || !this.zze) {
                c7 = 30;
            } else {
                zzeeVar.zzh(4);
                long jZzj3 = ((long) zzeeVar.zzj(3)) << 30;
                zzeeVar.zzh(1);
                int iZzj2 = zzeeVar.zzj(15) << 15;
                zzeeVar.zzh(1);
                c7 = 30;
                long jZzj4 = zzeeVar.zzj(15);
                zzeeVar.zzh(1);
                this.zzb.zze(jZzj3 | ((long) iZzj2) | jZzj4);
                this.zzf = true;
            }
            jZze = this.zzb.zze((jZzj << c7) | ((long) iZzj) | jZzj2);
        } else {
            jZze = 0;
        }
        zzamd zzamdVar = this.zza;
        zzamdVar.zzc(jZze, 4);
        zzamdVar.zzd(zzefVar);
        zzamdVar.zze(false);
    }
}
