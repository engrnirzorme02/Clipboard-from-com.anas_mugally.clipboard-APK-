package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzmt implements Map.Entry {
    private final Map.Entry zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzmv) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zznm) {
            return ((zzmv) this.zza.getValue()).zza((zznm) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzmv zza() {
        return (zzmv) this.zza.getValue();
    }
}
