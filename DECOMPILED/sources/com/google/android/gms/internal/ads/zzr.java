package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            return this.zza.equals(((zzr) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final boolean zza(int i7) {
        return this.zza.get(i7);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc(int i7) {
        SparseBooleanArray sparseBooleanArray = this.zza;
        zzghc.zzm(i7, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i7);
    }
}
