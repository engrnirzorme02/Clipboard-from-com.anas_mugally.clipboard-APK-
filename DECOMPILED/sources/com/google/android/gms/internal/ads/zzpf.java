package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpf {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpf zza(boolean z7) {
        this.zza = true;
        return this;
    }

    public final zzpf zzb(boolean z7) {
        this.zzb = z7;
        return this;
    }

    public final zzpf zzc(boolean z7) {
        this.zzc = z7;
        return this;
    }

    public final zzpg zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpg(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    final /* synthetic */ boolean zze() {
        return this.zza;
    }

    final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}
