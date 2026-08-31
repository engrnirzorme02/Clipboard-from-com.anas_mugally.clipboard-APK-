package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class zzgxa implements zzgxc {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    zzgxa(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.zzgxc
    public final boolean zza() {
        return this.zza.get();
    }
}
