package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzok {
    public static final zzok zza = new zzoj().zza();
    private final Map<String, String> zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzok) {
            return this.zzb.equals(((zzok) obj).zzb);
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

    private zzok(Map<String, String> map) {
        this.zzb = map;
    }
}
