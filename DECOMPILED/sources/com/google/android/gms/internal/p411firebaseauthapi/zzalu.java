package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public class zzalu {
    private volatile zzamm zza;
    private volatile zzajv zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzalu)) {
            return false;
        }
        zzalu zzaluVar = (zzalu) obj;
        zzamm zzammVar = this.zza;
        zzamm zzammVar2 = zzaluVar.zza;
        if (zzammVar == null && zzammVar2 == null) {
            return zzb().equals(zzaluVar.zzb());
        }
        if (zzammVar == null || zzammVar2 == null) {
            return zzammVar != null ? zzammVar.equals(zzaluVar.zzb(zzammVar.zzs())) : zzb(zzammVar2.zzs()).equals(zzammVar2);
        }
        return zzammVar.equals(zzammVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return this.zzb.zzb();
        }
        if (this.zza != null) {
            return this.zza.zzl();
        }
        return 0;
    }

    public final zzajv zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzajv.zza;
                } else {
                    this.zzb = this.zza.zzj();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzamm zza(zzamm zzammVar) {
        zzamm zzammVar2 = this.zza;
        this.zzb = null;
        this.zza = zzammVar;
        return zzammVar2;
    }

    private final zzamm zzb(zzamm zzammVar) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza == null) {
                    try {
                        this.zza = zzammVar;
                        this.zzb = zzajv.zza;
                    } catch (zzall unused) {
                        this.zzc = true;
                        this.zza = zzammVar;
                        this.zzb = zzajv.zza;
                    }
                }
            }
        }
        return this.zza;
    }
}
