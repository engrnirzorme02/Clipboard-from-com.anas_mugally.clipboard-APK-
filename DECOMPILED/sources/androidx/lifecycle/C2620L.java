package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.lifecycle.L */
/* JADX INFO: loaded from: classes.dex */
public final class C2620L implements InterfaceC2654p {

    /* JADX INFO: renamed from: a */
    private final C2624P f10412a;

    public C2620L(C2624P provider) {
        AbstractC6118n.m27187e(provider, "provider");
        this.f10412a = provider;
    }

    @Override // androidx.lifecycle.InterfaceC2654p
    /* JADX INFO: renamed from: n */
    public void mo173n(InterfaceC2657s source, AbstractC2650l.a event) {
        AbstractC6118n.m27187e(source, "source");
        AbstractC6118n.m27187e(event, "event");
        if (event == AbstractC2650l.a.ON_CREATE) {
            source.mo419P().mo12628d(this);
            this.f10412a.m12567e();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
