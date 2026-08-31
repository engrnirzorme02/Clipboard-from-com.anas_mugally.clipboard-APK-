package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqk {
    private final Context zza;
    private final zzoz zzb;
    private boolean zzc;
    private final zzqj zzd;
    private zzqm zze;
    private zzqi zzf;

    @Deprecated
    public zzqk() {
        this.zza = null;
        this.zzb = zzoz.zza;
        this.zzd = zzqj.zza;
    }

    public final zzrc zza() {
        zzghc.zzh(!this.zzc);
        this.zzc = true;
        if (this.zze == null) {
            this.zze = new zzqm(new zzcf[0]);
        }
        if (this.zzf == null) {
            this.zzf = new zzqi(this.zza);
        }
        return new zzrc(this, null);
    }

    final /* synthetic */ Context zzb() {
        return this.zza;
    }

    final /* synthetic */ zzoz zzc() {
        return this.zzb;
    }

    final /* synthetic */ zzqm zzd() {
        return this.zze;
    }

    final /* synthetic */ zzqi zze() {
        return this.zzf;
    }

    public zzqk(Context context) {
        this.zza = context;
        this.zzb = zzoz.zza;
        this.zzd = zzqj.zza;
    }
}
