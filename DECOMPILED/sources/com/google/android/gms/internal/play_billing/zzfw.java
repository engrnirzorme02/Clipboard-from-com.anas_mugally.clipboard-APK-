package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public class zzfw {
    protected volatile zzgl zza;
    private volatile zzei zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfw)) {
            return false;
        }
        zzfw zzfwVar = (zzfw) obj;
        zzgl zzglVar = this.zza;
        zzgl zzglVar2 = zzfwVar.zza;
        if (zzglVar == null && zzglVar2 == null) {
            return zzb().equals(zzfwVar.zzb());
        }
        if (zzglVar != null && zzglVar2 != null) {
            return zzglVar.equals(zzglVar2);
        }
        if (zzglVar != null) {
            zzfwVar.zzd(zzglVar.zzh());
            return zzglVar.equals(zzfwVar.zza);
        }
        zzd(zzglVar2.zzh());
        return this.zza.equals(zzglVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzeg) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzj();
        }
        return 0;
    }

    public final zzei zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzei.zzb;
                } else {
                    this.zzb = this.zza.zzf();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzgl zzc(zzgl zzglVar) {
        zzgl zzglVar2 = this.zza;
        this.zzb = null;
        this.zza = zzglVar;
        return zzglVar2;
    }

    protected final void zzd(zzgl zzglVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzglVar;
                this.zzb = zzei.zzb;
            } catch (zzfq unused) {
                this.zzc = true;
                this.zza = zzglVar;
                this.zzb = zzei.zzb;
            }
        }
    }
}
