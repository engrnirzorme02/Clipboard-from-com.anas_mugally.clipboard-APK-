package com.google.android.gms.ads.internal.client;

import java.util.Objects;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.H1 */
/* JADX INFO: loaded from: classes.dex */
final class BinderC3264H1 extends AbstractBinderC3286P {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC3267I1 f13891a;

    /* synthetic */ BinderC3264H1(BinderC3267I1 binderC3267I1, byte[] bArr) {
        Objects.requireNonNull(binderC3267I1);
        this.f13891a = binderC3267I1;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3289Q
    public final void zze(C3349h2 c3349h2) {
        zzi(c3349h2, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3289Q
    public final String zzf() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3289Q
    public final boolean zzg() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3289Q
    public final String zzh() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3289Q
    public final void zzi(C3349h2 c3349h2, int i7) {
        AbstractC7599p.m33328c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        C7590g.f30239b.post(new RunnableC3261G1(this));
    }
}
