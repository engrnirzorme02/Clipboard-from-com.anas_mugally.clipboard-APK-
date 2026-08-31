package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajc implements zzacu {
    private zzacx zza;
    private zzajj zzb;
    private boolean zzc;

    static {
        int i7 = zzajb.zza;
    }

    private final boolean zza(zzacv zzacvVar) {
        zzaje zzajeVar = new zzaje();
        if (zzajeVar.zzc(zzacvVar, true) && (zzajeVar.zza & 2) == 2) {
            int iMin = Math.min(zzajeVar.zze, 8);
            zzef zzefVar = new zzef(iMin);
            zzacvVar.zzi(zzefVar.zzi(), 0, iMin);
            zzefVar.zzh(0);
            if (zzefVar.zzd() >= 5 && zzefVar.zzs() == 127 && zzefVar.zzz() == 1179402563) {
                this.zzb = new zzaja();
            } else {
                zzefVar.zzh(0);
                try {
                    if (zzaeh.zzd(1, zzefVar, true)) {
                        this.zzb = new zzajl();
                    } else {
                        zzefVar.zzh(0);
                        if (zzajg.zzd(zzefVar)) {
                            this.zzb = new zzajg();
                        }
                    }
                } catch (zzas unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) {
        try {
            return zza(zzacvVar);
        } catch (zzas unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zza = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws zzas {
        this.zza.getClass();
        if (this.zzb == null) {
            if (!zza(zzacvVar)) {
                throw zzas.zzb("Failed to determine bitstream type", null);
            }
            zzacvVar.zzl();
        }
        if (!this.zzc) {
            zzaeb zzaebVarZzu = this.zza.zzu(0, 1);
            this.zza.zzv();
            this.zzb.zze(this.zza, zzaebVarZzu);
            this.zzc = true;
        }
        return this.zzb.zzg(zzacvVar, zzadsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        zzajj zzajjVar = this.zzb;
        if (zzajjVar != null) {
            zzajjVar.zzf(j7, j8);
        }
    }
}
