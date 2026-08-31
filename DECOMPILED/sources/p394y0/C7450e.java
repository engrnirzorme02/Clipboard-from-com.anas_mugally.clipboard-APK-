package p394y0;

import kotlin.jvm.internal.AbstractC6118n;
import p026D0.InterfaceC0177h;

/* JADX INFO: renamed from: y0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7450e implements InterfaceC0177h.c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0177h.c f29887a;

    /* JADX INFO: renamed from: b */
    private final C7448c f29888b;

    public C7450e(InterfaceC0177h.c delegate, C7448c autoCloser) {
        AbstractC6118n.m27187e(delegate, "delegate");
        AbstractC6118n.m27187e(autoCloser, "autoCloser");
        this.f29887a = delegate;
        this.f29888b = autoCloser;
    }

    @Override // p026D0.InterfaceC0177h.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7449d mo906a(InterfaceC0177h.b configuration) {
        AbstractC6118n.m27187e(configuration, "configuration");
        return new C7449d(this.f29887a.mo906a(configuration), this.f29888b);
    }
}
