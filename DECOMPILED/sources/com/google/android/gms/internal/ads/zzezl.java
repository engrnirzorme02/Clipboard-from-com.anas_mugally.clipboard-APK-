package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
final class zzezl implements zzgoq {
    zzezl(zzezo zzezoVar) {
        Objects.requireNonNull(zzezoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        AbstractC3490o0.m17545k("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        AbstractC3490o0.m17545k("Notification of cache hit successful.");
    }
}
