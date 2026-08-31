package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgxg {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgxg() {
    }

    public final zzgxg zza(Enum r7, Object obj) {
        this.zza.put(r7, obj);
        this.zzb.put(obj, r7);
        return this;
    }

    public final zzgxh zzb() {
        return new zzgxh(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    /* synthetic */ zzgxg(byte[] bArr) {
    }
}
