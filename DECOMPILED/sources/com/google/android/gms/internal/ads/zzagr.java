package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagr implements zzan {
    public final float zza;
    public final int zzb;

    public zzagr(float f7, int i7) {
        this.zza = f7;
        this.zzb = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagr.class == obj.getClass()) {
            zzagr zzagrVar = (zzagr) obj;
            if (this.zza == zzagrVar.zza && this.zzb == zzagrVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.zza) + 527) * 31) + this.zzb;
    }

    public final String toString() {
        float f7 = this.zza;
        int length = String.valueOf(f7).length();
        int i7 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i7).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f7);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i7);
        return sb.toString();
    }
}
