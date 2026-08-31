package p318o6;

import kotlin.coroutines.jvm.internal.InterfaceC6090e;
import kotlin.jvm.internal.C6099B;
import p173W5.C1880j;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1876f;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: o6.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6614I {
    /* JADX INFO: renamed from: d */
    private static final InterfaceC1879i m28076d(InterfaceC1879i interfaceC1879i, InterfaceC1879i interfaceC1879i2, final boolean z7) {
        boolean zM28080h = m28080h(interfaceC1879i);
        boolean zM28080h2 = m28080h(interfaceC1879i2);
        if (!zM28080h && !zM28080h2) {
            return interfaceC1879i.plus(interfaceC1879i2);
        }
        final C6099B c6099b = new C6099B();
        c6099b.f23859a = interfaceC1879i2;
        C1880j c1880j = C1880j.f6044a;
        InterfaceC1879i interfaceC1879i3 = (InterfaceC1879i) interfaceC1879i.fold(c1880j, new InterfaceC5371p() { // from class: o6.G
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC6614I.m28077e(c6099b, z7, (InterfaceC1879i) obj, (InterfaceC1879i.b) obj2);
            }
        });
        if (zM28080h2) {
            c6099b.f23859a = ((InterfaceC1879i) c6099b.f23859a).fold(c1880j, new InterfaceC5371p() { // from class: o6.H
                @Override // p238e6.InterfaceC5371p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6614I.m28078f((InterfaceC1879i) obj, (InterfaceC1879i.b) obj2);
                }
            });
        }
        return interfaceC1879i3.plus((InterfaceC1879i) c6099b.f23859a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC1879i m28077e(C6099B c6099b, boolean z7, InterfaceC1879i interfaceC1879i, InterfaceC1879i.b bVar) {
        return interfaceC1879i.plus(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC1879i m28078f(InterfaceC1879i interfaceC1879i, InterfaceC1879i.b bVar) {
        return interfaceC1879i.plus(bVar);
    }

    /* JADX INFO: renamed from: g */
    public static final String m28079g(InterfaceC1879i interfaceC1879i) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    private static final boolean m28080h(InterfaceC1879i interfaceC1879i) {
        return ((Boolean) interfaceC1879i.fold(Boolean.FALSE, new InterfaceC5371p() { // from class: o6.F
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(AbstractC6614I.m28081i(((Boolean) obj).booleanValue(), (InterfaceC1879i.b) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final boolean m28081i(boolean z7, InterfaceC1879i.b bVar) {
        return z7;
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC1879i m28082j(InterfaceC1879i interfaceC1879i, InterfaceC1879i interfaceC1879i2) {
        return !m28080h(interfaceC1879i2) ? interfaceC1879i.plus(interfaceC1879i2) : m28076d(interfaceC1879i, interfaceC1879i2, false);
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC1879i m28083k(InterfaceC6624N interfaceC6624N, InterfaceC1879i interfaceC1879i) {
        InterfaceC1879i interfaceC1879iM28076d = m28076d(interfaceC6624N.mo12635Q(), interfaceC1879i, true);
        return (interfaceC1879iM28076d == C6656c0.m28162a() || interfaceC1879iM28076d.get(InterfaceC1876f.f6042h) != null) ? interfaceC1879iM28076d : interfaceC1879iM28076d.plus(C6656c0.m28162a());
    }

    /* JADX INFO: renamed from: l */
    public static final C6648Z0 m28084l(InterfaceC6090e interfaceC6090e) {
        while (!(interfaceC6090e instanceof C6647Z) && (interfaceC6090e = interfaceC6090e.getCallerFrame()) != null) {
            if (interfaceC6090e instanceof C6648Z0) {
                return (C6648Z0) interfaceC6090e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static final C6648Z0 m28085m(InterfaceC1875e interfaceC1875e, InterfaceC1879i interfaceC1879i, Object obj) {
        if (!(interfaceC1875e instanceof InterfaceC6090e) || interfaceC1879i.get(C6651a1.f24936a) == null) {
            return null;
        }
        C6648Z0 c6648z0M28084l = m28084l((InterfaceC6090e) interfaceC1875e);
        if (c6648z0M28084l != null) {
            c6648z0M28084l.m28145O0(interfaceC1879i, obj);
        }
        return c6648z0M28084l;
    }
}
