package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgei extends zzgeq {
    private String zza;
    private String zzb;

    zzgei() {
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final zzgeq zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final zzgeq zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final zzger zzc() {
        return new zzgej(this.zza, this.zzb, null);
    }
}
