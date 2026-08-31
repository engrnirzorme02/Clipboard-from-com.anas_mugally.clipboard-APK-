package p024C6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p408z6.InterfaceC7615a;

/* JADX INFO: renamed from: C6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0152a implements InterfaceC0156e, InterfaceC0154c {
    @Override // p024C6.InterfaceC0154c
    /* JADX INFO: renamed from: d */
    public final long mo693d(InterfaceC0096d descriptor, int i7) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        return mo701m();
    }

    @Override // p024C6.InterfaceC0154c
    /* JADX INFO: renamed from: e */
    public final int mo694e(InterfaceC0096d descriptor, int i7) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        return mo698i();
    }

    @Override // p024C6.InterfaceC0154c
    /* JADX INFO: renamed from: f */
    public final Object mo695f(InterfaceC0096d descriptor, int i7, InterfaceC7615a deserializer, Object obj) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        AbstractC6118n.m27187e(deserializer, "deserializer");
        return (deserializer.mo1120a().mo372c() || mo728n()) ? m704s(deserializer, obj) : mo727j();
    }

    @Override // p024C6.InterfaceC0156e
    /* JADX INFO: renamed from: g */
    public abstract Object mo696g(InterfaceC7615a interfaceC7615a);

    @Override // p024C6.InterfaceC0154c
    /* JADX INFO: renamed from: h */
    public Object mo697h(InterfaceC0096d descriptor, int i7, InterfaceC7615a deserializer, Object obj) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        AbstractC6118n.m27187e(deserializer, "deserializer");
        return m704s(deserializer, obj);
    }

    @Override // p024C6.InterfaceC0156e
    /* JADX INFO: renamed from: i */
    public abstract int mo698i();

    @Override // p024C6.InterfaceC0154c
    /* JADX INFO: renamed from: k */
    public int mo699k(InterfaceC0096d interfaceC0096d) {
        return InterfaceC0154c.a.m720a(this, interfaceC0096d);
    }

    @Override // p024C6.InterfaceC0156e
    /* JADX INFO: renamed from: l */
    public abstract String mo700l();

    @Override // p024C6.InterfaceC0156e
    /* JADX INFO: renamed from: m */
    public abstract long mo701m();

    @Override // p024C6.InterfaceC0154c
    /* JADX INFO: renamed from: o */
    public final String mo702o(InterfaceC0096d descriptor, int i7) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        return mo700l();
    }

    @Override // p024C6.InterfaceC0154c
    /* JADX INFO: renamed from: p */
    public boolean mo703p() {
        return InterfaceC0154c.a.m721b(this);
    }

    /* JADX INFO: renamed from: s */
    public Object m704s(InterfaceC7615a deserializer, Object obj) {
        AbstractC6118n.m27187e(deserializer, "deserializer");
        return mo696g(deserializer);
    }
}
