package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzew implements zzan {
    public final float zza;
    public final float zzb;

    public zzew(float f7, float f8) {
        boolean z7 = false;
        if (f7 >= -90.0f && f7 <= 90.0f && f8 >= -180.0f && f8 <= 180.0f) {
            z7 = true;
        }
        zzghc.zzb(z7, "Invalid latitude or longitude");
        this.zza = f7;
        this.zzb = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzew.class == obj.getClass()) {
            zzew zzewVar = (zzew) obj;
            if (this.zza == zzewVar.zza && this.zzb == zzewVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.zza) + 527) * 31) + Float.hashCode(this.zzb);
    }

    public final String toString() {
        float f7 = this.zza;
        int length = String.valueOf(f7).length();
        float f8 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f8).length());
        sb.append("xyz: latitude=");
        sb.append(f7);
        sb.append(", longitude=");
        sb.append(f8);
        return sb.toString();
    }
}
