package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcis {
    private zzcgx zza;
    private zzcjl zzb;
    private zzfhl zzc;
    private zzcjy zzd;
    private zzfef zze;

    private zzcis() {
        throw null;
    }

    public final zzcis zza(zzcgx zzcgxVar) {
        this.zza = zzcgxVar;
        return this;
    }

    public final zzcis zzb(zzcjl zzcjlVar) {
        this.zzb = zzcjlVar;
        return this;
    }

    public final zzcgv zzc() {
        zzhqf.zzc(this.zza, zzcgx.class);
        zzhqf.zzc(this.zzb, zzcjl.class);
        if (this.zzc == null) {
            this.zzc = new zzfhl();
        }
        if (this.zzd == null) {
            this.zzd = new zzcjy();
        }
        if (this.zze == null) {
            this.zze = new zzfef();
        }
        return new zzcih(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    /* synthetic */ zzcis(byte[] bArr) {
    }
}
