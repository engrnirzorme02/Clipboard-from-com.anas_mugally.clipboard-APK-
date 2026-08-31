package p024C6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p408z6.InterfaceC7619e;

/* JADX INFO: renamed from: C6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0153b implements InterfaceC0157f, InterfaceC0155d {
    @Override // p024C6.InterfaceC0155d
    /* JADX INFO: renamed from: d */
    public void mo705d(InterfaceC0096d descriptor, int i7, InterfaceC7619e serializer, Object obj) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        AbstractC6118n.m27187e(serializer, "serializer");
        if (mo716s(descriptor, i7)) {
            mo713p(serializer, obj);
        }
    }

    @Override // p024C6.InterfaceC0155d
    /* JADX INFO: renamed from: e */
    public final void mo706e(InterfaceC0096d descriptor, int i7, int i8) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        if (mo716s(descriptor, i7)) {
            mo712o(i8);
        }
    }

    @Override // p024C6.InterfaceC0155d
    /* JADX INFO: renamed from: g */
    public final void mo707g(InterfaceC0096d descriptor, int i7, String value) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        AbstractC6118n.m27187e(value, "value");
        if (mo716s(descriptor, i7)) {
            mo715r(value);
        }
    }

    @Override // p024C6.InterfaceC0155d
    /* JADX INFO: renamed from: i */
    public final void mo708i(InterfaceC0096d descriptor, int i7, long j7) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        if (mo716s(descriptor, i7)) {
            mo714q(j7);
        }
    }

    @Override // p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: k */
    public void mo709k() {
        InterfaceC0157f.a.m735b(this);
    }

    @Override // p024C6.InterfaceC0155d
    /* JADX INFO: renamed from: l */
    public void mo710l(InterfaceC0096d descriptor, int i7, InterfaceC7619e serializer, Object obj) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        AbstractC6118n.m27187e(serializer, "serializer");
        if (mo716s(descriptor, i7)) {
            m717t(serializer, obj);
        }
    }

    @Override // p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: m */
    public InterfaceC0155d mo711m(InterfaceC0096d interfaceC0096d, int i7) {
        return InterfaceC0157f.a.m734a(this, interfaceC0096d, i7);
    }

    @Override // p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: o */
    public abstract void mo712o(int i7);

    @Override // p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: p */
    public abstract void mo713p(InterfaceC7619e interfaceC7619e, Object obj);

    @Override // p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: q */
    public abstract void mo714q(long j7);

    @Override // p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: r */
    public abstract void mo715r(String str);

    /* JADX INFO: renamed from: s */
    public abstract boolean mo716s(InterfaceC0096d interfaceC0096d, int i7);

    /* JADX INFO: renamed from: t */
    public void m717t(InterfaceC7619e interfaceC7619e, Object obj) {
        InterfaceC0157f.a.m736c(this, interfaceC7619e, obj);
    }
}
