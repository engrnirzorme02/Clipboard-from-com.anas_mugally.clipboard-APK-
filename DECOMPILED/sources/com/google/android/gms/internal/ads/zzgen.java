package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgen extends zzgfo {
    private final int zza;
    private final String zzb;
    private final int zzc;

    /* synthetic */ zzgen(int i7, String str, int i8, byte[] bArr) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = i8;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgfo) {
            zzgfo zzgfoVar = (zzgfo) obj;
            if (this.zza == zzgfoVar.zza() && ((str = this.zzb) != null ? str.equals(zzgfoVar.zzb()) : zzgfoVar.zzb() == null) && this.zzc == zzgfoVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        int i7 = this.zza;
        int length = String.valueOf(i7).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i8 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i8).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i7);
        sb.append(", sessionToken=");
        sb.append(str);
        sb.append(", uiMode=");
        sb.append(i8);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final int zzc() {
        return this.zzc;
    }
}
