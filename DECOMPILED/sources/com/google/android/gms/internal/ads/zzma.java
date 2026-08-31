package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzma extends IllegalStateException {
    public final int zza;

    public zzma(int i7) {
        super(i7 != 0 ? "Player stuck buffering with no progress" : "Player stuck buffering and not loading");
        this.zza = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzma.class == obj.getClass() && this.zza == ((zzma) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }
}
