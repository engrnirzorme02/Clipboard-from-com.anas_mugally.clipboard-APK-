package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
final class zzecc extends zzecf {
    private final String zza;
    private final String zzb;
    private final Drawable zzc;

    zzecc(String str, String str2, Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzecf) {
            zzecf zzecfVar = (zzecf) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzecfVar.zza()) : zzecfVar.zza() == null) {
                if (this.zzb.equals(zzecfVar.zzb()) && ((drawable = this.zzc) != null ? drawable.equals(zzecfVar.zzc()) : zzecfVar.zzc() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 42 + str2.length() + 7 + length2 + 1);
        sb.append("OfflineAdAssets{advertiserName=");
        sb.append(str);
        sb.append(", imageUrl=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    final Drawable zzc() {
        return this.zzc;
    }
}
