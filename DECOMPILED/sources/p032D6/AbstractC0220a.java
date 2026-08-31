package p032D6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p024C6.InterfaceC0154c;
import p024C6.InterfaceC0156e;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: D6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0220a implements InterfaceC7616b {
    public /* synthetic */ AbstractC0220a(AbstractC6112h abstractC6112h) {
        this();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m1107n(AbstractC0220a abstractC0220a, InterfaceC0154c interfaceC0154c, int i7, Object obj, boolean z7, int i8, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i8 & 8) != 0) {
            z7 = true;
        }
        abstractC0220a.mo1117m(interfaceC0154c, i7, obj, z7);
    }

    /* JADX INFO: renamed from: o */
    private final int m1108o(InterfaceC0154c interfaceC0154c, Object obj) {
        int iMo699k = interfaceC0154c.mo699k(mo1120a());
        mo1112h(obj, iMo699k);
        return iMo699k;
    }

    @Override // p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: b */
    public Object mo1109b(InterfaceC0156e decoder) {
        AbstractC6118n.m27187e(decoder, "decoder");
        return m1115k(decoder, null);
    }

    /* JADX INFO: renamed from: f */
    protected abstract Object mo1110f();

    /* JADX INFO: renamed from: g */
    protected abstract int mo1111g(Object obj);

    /* JADX INFO: renamed from: h */
    protected abstract void mo1112h(Object obj, int i7);

    /* JADX INFO: renamed from: i */
    protected abstract Iterator mo1113i(Object obj);

    /* JADX INFO: renamed from: j */
    protected abstract int mo1114j(Object obj);

    /* JADX INFO: renamed from: k */
    public final Object m1115k(InterfaceC0156e decoder, Object obj) {
        Object objMo1110f;
        AbstractC6118n.m27187e(decoder, "decoder");
        if (obj == null || (objMo1110f = mo1118p(obj)) == null) {
            objMo1110f = mo1110f();
        }
        Object obj2 = objMo1110f;
        int iMo1111g = mo1111g(obj2);
        InterfaceC0154c interfaceC0154cMo725a = decoder.mo725a(mo1120a());
        if (!interfaceC0154cMo725a.mo703p()) {
            while (true) {
                int iMo719q = interfaceC0154cMo725a.mo719q(mo1120a());
                if (iMo719q == -1) {
                    break;
                }
                m1107n(this, interfaceC0154cMo725a, iMo1111g + iMo719q, obj2, false, 8, null);
            }
        } else {
            mo1116l(interfaceC0154cMo725a, obj2, iMo1111g, m1108o(interfaceC0154cMo725a, obj2));
        }
        interfaceC0154cMo725a.mo718b(mo1120a());
        return mo1119q(obj2);
    }

    /* JADX INFO: renamed from: l */
    protected abstract void mo1116l(InterfaceC0154c interfaceC0154c, Object obj, int i7, int i8);

    /* JADX INFO: renamed from: m */
    protected abstract void mo1117m(InterfaceC0154c interfaceC0154c, int i7, Object obj, boolean z7);

    /* JADX INFO: renamed from: p */
    protected abstract Object mo1118p(Object obj);

    /* JADX INFO: renamed from: q */
    protected abstract Object mo1119q(Object obj);

    private AbstractC0220a() {
    }
}
