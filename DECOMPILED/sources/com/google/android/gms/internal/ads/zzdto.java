package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzdto extends zzdts {
    private final long zza;
    private final int zzb;

    /* synthetic */ zzdto(long j7, int i7, byte[] bArr) {
        this.zza = j7;
        this.zzb = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdts) {
            zzdts zzdtsVar = (zzdts) obj;
            if (this.zza == zzdtsVar.zza() && this.zzb == zzdtsVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.zza;
        return ((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        long j7 = this.zza;
        int length = String.valueOf(j7).length();
        int i7 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i7).length() + 1);
        sb.append("OnDeviceStorageKey{id=");
        sb.append(j7);
        sb.append(", eventType=");
        sb.append(i7);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdts
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdts
    public final int zzb() {
        return this.zzb;
    }
}
