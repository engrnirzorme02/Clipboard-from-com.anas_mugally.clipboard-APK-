package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafp implements zzacx {
    private final long zzb;
    private final zzacx zzc;

    public zzafp(long j7, zzacx zzacxVar) {
        this.zzb = j7;
        this.zzc = zzacxVar;
    }

    final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final zzaeb zzu(int i7, int i8) {
        return this.zzc.zzu(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzw(zzadv zzadvVar) {
        this.zzc.zzw(new zzafo(this, zzadvVar, zzadvVar));
    }
}
