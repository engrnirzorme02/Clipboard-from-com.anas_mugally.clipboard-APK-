package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcqu implements zzcqv {
    private final Map zza;

    zzcqu(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final zzedz zza(int i7, String str) {
        return (zzedz) this.zza.get(str);
    }
}
