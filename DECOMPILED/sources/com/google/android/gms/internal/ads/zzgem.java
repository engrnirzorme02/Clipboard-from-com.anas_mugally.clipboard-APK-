package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgem extends zzgfn {
    private int zza;
    private String zzb;
    private int zzc;
    private byte zzd;

    zzgem() {
    }

    @Override // com.google.android.gms.internal.ads.zzgfn
    public final zzgfn zza(int i7) {
        this.zza = i7;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgfn
    public final zzgfn zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgfn
    public final zzgfn zzc(int i7) {
        this.zzc = i7;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgfn
    public final zzgfo zzd() {
        if (this.zzd == 3) {
            return new zzgen(this.zza, this.zzb, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzd & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
