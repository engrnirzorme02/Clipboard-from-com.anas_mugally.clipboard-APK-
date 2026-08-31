package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.C2700b;
import p157U3.InterfaceFutureC1673e;
import p370v0.AbstractC7199a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedx {
    private final Context zza;

    zzedx(Context context) {
        this.zza = context;
    }

    public final InterfaceFutureC1673e zza(boolean z7) {
        try {
            C2700b c2700bM12810a = new C2700b.a().m12811b("com.google.android.gms.ads").m12812c(z7).m12810a();
            AbstractC7199a abstractC7199aM31769a = AbstractC7199a.m31769a(this.zza);
            return abstractC7199aM31769a != null ? abstractC7199aM31769a.mo31770b(c2700bM12810a) : zzgot.zzc(new IllegalStateException());
        } catch (Exception e7) {
            return zzgot.zzc(e7);
        }
    }
}
