package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzau {
    public static final zzau zza = new zzau(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzau(float f7, float f8) {
        zzghc.zza(f7 > 0.0f);
        zzghc.zza(f8 > 0.0f);
        this.zzb = f7;
        this.zzc = f8;
        this.zzd = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzau.class == obj.getClass()) {
            zzau zzauVar = (zzau) obj;
            if (this.zzb == zzauVar.zzb && this.zzc == zzauVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzb) + 527) * 31) + Float.floatToRawIntBits(this.zzc);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.zzb), Float.valueOf(this.zzc)};
        String str = zzeo.zza;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public final long zza(long j7) {
        return j7 * ((long) this.zzd);
    }
}
