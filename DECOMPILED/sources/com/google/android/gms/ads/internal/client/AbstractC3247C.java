package com.google.android.gms.ads.internal.client;

import p314o2.AbstractC6552d;
import p314o2.C6561m;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3247C extends AbstractC6552d {

    /* JADX INFO: renamed from: a */
    private final Object f13876a = new Object();

    /* JADX INFO: renamed from: b */
    private AbstractC6552d f13877b;

    /* JADX INFO: renamed from: d */
    public final void m17195d(AbstractC6552d abstractC6552d) {
        synchronized (this.f13876a) {
            this.f13877b = abstractC6552d;
        }
    }

    @Override // p314o2.AbstractC6552d, com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final void onAdClicked() {
        synchronized (this.f13876a) {
            try {
                AbstractC6552d abstractC6552d = this.f13877b;
                if (abstractC6552d != null) {
                    abstractC6552d.onAdClicked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdClosed() {
        synchronized (this.f13876a) {
            try {
                AbstractC6552d abstractC6552d = this.f13877b;
                if (abstractC6552d != null) {
                    abstractC6552d.onAdClosed();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p314o2.AbstractC6552d
    public void onAdFailedToLoad(C6561m c6561m) {
        synchronized (this.f13876a) {
            try {
                AbstractC6552d abstractC6552d = this.f13877b;
                if (abstractC6552d != null) {
                    abstractC6552d.onAdFailedToLoad(c6561m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdImpression() {
        synchronized (this.f13876a) {
            try {
                AbstractC6552d abstractC6552d = this.f13877b;
                if (abstractC6552d != null) {
                    abstractC6552d.onAdImpression();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p314o2.AbstractC6552d
    public void onAdLoaded() {
        synchronized (this.f13876a) {
            try {
                AbstractC6552d abstractC6552d = this.f13877b;
                if (abstractC6552d != null) {
                    abstractC6552d.onAdLoaded();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdOpened() {
        synchronized (this.f13876a) {
            try {
                AbstractC6552d abstractC6552d = this.f13877b;
                if (abstractC6552d != null) {
                    abstractC6552d.onAdOpened();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
