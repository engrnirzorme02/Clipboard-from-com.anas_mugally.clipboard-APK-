package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzezt implements zzggr {
    final /* synthetic */ zzezx zza;

    zzezt(zzezx zzezxVar) {
        Objects.requireNonNull(zzezxVar);
        this.zza = zzezxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33329d("", (zzdzk) obj);
        AbstractC3490o0.m17545k("Failed to get a cache key, reverting to legacy flow.");
        zzezx zzezxVar = this.zza;
        zzezxVar.zzd(new zzezv(null, zzezxVar.zzb(), null));
        return zzezxVar.zzc();
    }
}
