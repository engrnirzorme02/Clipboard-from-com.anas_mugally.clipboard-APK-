package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfom extends zzfoj {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    /* synthetic */ zzfom(String str, boolean z7, boolean z8, boolean z9, long j7, boolean z10, long j8, byte[] bArr) {
        this.zza = str;
        this.zzb = z7;
        this.zzc = z8;
        this.zzd = j7;
        this.zze = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfoj) {
            zzfoj zzfojVar = (zzfoj) obj;
            if (this.zza.equals(zzfojVar.zza()) && this.zzb == zzfojVar.zzb() && this.zzc == zzfojVar.zzc()) {
                zzfojVar.zzd();
                if (this.zzd == zzfojVar.zze()) {
                    zzfojVar.zzf();
                    if (this.zze == zzfojVar.zzg()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zze);
    }

    public final String toString() {
        boolean z7 = this.zzb;
        int length = String.valueOf(z7).length();
        boolean z8 = this.zzc;
        int length2 = String.valueOf(z8).length();
        long j7 = this.zzd;
        int length3 = String.valueOf(j7).length();
        long j8 = this.zze;
        int length4 = String.valueOf(j8).length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z7);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z8);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(j7);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb.append(j8);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final boolean zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final long zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final long zzg() {
        return this.zze;
    }
}
