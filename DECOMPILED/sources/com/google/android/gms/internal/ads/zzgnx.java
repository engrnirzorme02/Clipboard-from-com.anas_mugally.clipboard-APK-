package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.AbstractC2404b;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class zzgnx extends zzgnw {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzgnz.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzgnz.class, "remainingField");

    private zzgnx() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnw
    final void zza(zzgnz zzgnzVar, Set set, Set set2) {
        AbstractC2404b.m10339a(zza, zzgnzVar, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnw
    final int zzb(zzgnz zzgnzVar) {
        return zzb.decrementAndGet(zzgnzVar);
    }

    /* synthetic */ zzgnx(byte[] bArr) {
        super(null);
    }
}
