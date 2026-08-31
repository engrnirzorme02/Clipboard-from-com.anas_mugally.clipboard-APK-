package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfqk extends zzfqq {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zzfqk() {
    }

    public final zzfqq zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqq
    public final zzfqq zzb(boolean z7) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqq
    public final zzfqr zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzfql(this.zza, false, this.zzc, null, null, this.zzd, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.ads.zzfqq
    final zzfqq zzd(int i7) {
        this.zzc = i7;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqq
    public final zzfqq zze(int i7) {
        this.zzd = 1;
        return this;
    }
}
