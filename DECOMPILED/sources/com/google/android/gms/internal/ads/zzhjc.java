package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzhjc {
    protected volatile zzhjs zza;
    private volatile zzhhb zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhjc)) {
            return false;
        }
        zzhjc zzhjcVar = (zzhjc) obj;
        zzhjs zzhjsVar = this.zza;
        zzhjs zzhjsVar2 = zzhjcVar.zza;
        if (zzhjsVar == null && zzhjsVar2 == null) {
            return zzc().equals(zzhjcVar.zzc());
        }
        if (zzhjsVar != null && zzhjsVar2 != null) {
            return zzhjsVar.equals(zzhjsVar2);
        }
        if (zzhjsVar != null) {
            zzhjcVar.zzd(zzhjsVar.zzbw());
            return zzhjsVar.equals(zzhjcVar.zza);
        }
        zzd(zzhjsVar2.zzbw());
        return this.zza.equals(zzhjsVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzhjs zza(zzhjs zzhjsVar) {
        zzhjs zzhjsVar2 = this.zza;
        this.zzb = null;
        this.zza = zzhjsVar;
        return zzhjsVar2;
    }

    public final int zzb() {
        if (this.zzb != null) {
            return ((zzhgz) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzbr();
        }
        return 0;
    }

    public final zzhhb zzc() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzhhb.zzb;
                } else {
                    this.zzb = this.zza.zzaM();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void zzd(zzhjs zzhjsVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzhjsVar;
                this.zzb = zzhhb.zzb;
            } catch (zzhiw unused) {
                this.zzc = true;
                this.zza = zzhjsVar;
                this.zzb = zzhhb.zzb;
            }
        }
    }
}
