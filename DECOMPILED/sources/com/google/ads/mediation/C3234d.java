package com.google.ads.mediation;

import p012B2.InterfaceC0074o;
import p314o2.AbstractC6560l;

/* JADX INFO: renamed from: com.google.ads.mediation.d */
/* JADX INFO: loaded from: classes.dex */
final class C3234d extends AbstractC6560l {

    /* JADX INFO: renamed from: a */
    final AbstractAdViewAdapter f13837a;

    /* JADX INFO: renamed from: b */
    final InterfaceC0074o f13838b;

    public C3234d(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC0074o interfaceC0074o) {
        this.f13837a = abstractAdViewAdapter;
        this.f13838b = interfaceC0074o;
    }

    @Override // p314o2.AbstractC6560l
    /* JADX INFO: renamed from: b */
    public final void mo16281b() {
        this.f13838b.onAdClosed(this.f13837a);
    }

    @Override // p314o2.AbstractC6560l
    /* JADX INFO: renamed from: e */
    public final void mo16283e() {
        this.f13838b.onAdOpened(this.f13837a);
    }
}
