package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgxy {
    public static final zzgxy zza = new zzgxx().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzgxy) {
            return this.zzb.equals(((zzgxy) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final boolean zza() {
        return this.zzb.isEmpty();
    }
}
