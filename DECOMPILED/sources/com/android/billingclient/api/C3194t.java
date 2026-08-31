package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzp;
import java.util.Objects;
import p403z1.InterfaceC7562d;

/* JADX INFO: renamed from: com.android.billingclient.api.t */
/* JADX INFO: loaded from: classes.dex */
final class C3194t implements InterfaceC7562d {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ zzp f13663a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3176b f13664b;

    C3194t(C3176b c3176b, zzp zzpVar) {
        this.f13663a = zzpVar;
        Objects.requireNonNull(c3176b);
        this.f13664b = c3176b;
    }

    @Override // p403z1.InterfaceC7562d
    /* JADX INFO: renamed from: G */
    public final void mo15840G(final C3178d c3178d) {
        zzc.zzm("BillingClient", "Reconnection finished with result: " + c3178d.m16929c());
        try {
            this.f13663a.zzb(c3178d);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Exception setting completer.", th);
        }
        C3176b c3176b = this.f13664b;
        if (c3176b.f13513G != null) {
            c3176b.m16878M(new Runnable() { // from class: com.android.billingclient.api.s
                @Override // java.lang.Runnable
                public final void run() {
                    C3194t c3194t = this.f13661a;
                    try {
                        c3194t.f13664b.f13513G.mo15840G(c3178d);
                    } catch (Throwable th2) {
                        zzc.zzo("BillingClient", "Exception calling onBillingSetupFinished.", th2);
                    }
                }
            });
        }
    }

    @Override // p403z1.InterfaceC7562d
    /* JADX INFO: renamed from: O */
    public final void mo15841O() {
        zzc.zzm("BillingClient", "Reconnection attempt failed.");
        try {
            this.f13663a.zzb(AbstractC3163K.f13442j);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Exception setting completer.", th);
        }
        C3176b c3176b = this.f13664b;
        if (c3176b.f13513G != null) {
            c3176b.m16878M(new Runnable() { // from class: com.android.billingclient.api.r
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.f13660a.f13664b.f13513G.mo15841O();
                    } catch (Throwable th2) {
                        zzc.zzo("BillingClient", "Exception calling onBillingServiceDisconnected.", th2);
                    }
                }
            });
        }
    }
}
