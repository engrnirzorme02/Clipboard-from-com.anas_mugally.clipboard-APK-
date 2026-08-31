package p030D4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import p374v4.C7245j;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: D4.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0207k implements InterfaceC0210n {

    /* JADX INFO: renamed from: a */
    protected final InterfaceC0210n f907a;

    /* JADX INFO: renamed from: b */
    private String f908b;

    /* JADX INFO: renamed from: D4.k$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f909a;

        static {
            int[] iArr = new int[InterfaceC0210n.b.values().length];
            f909a = iArr;
            try {
                iArr[InterfaceC0210n.b.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f909a[InterfaceC0210n.b.V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: D4.k$b */
    protected enum b {
        DeferredValue,
        Boolean,
        Number,
        String
    }

    AbstractC0207k(InterfaceC0210n interfaceC0210n) {
        this.f907a = interfaceC0210n;
    }

    /* JADX INFO: renamed from: k */
    private static int m1073k(C0208l c0208l, C0202f c0202f) {
        return Double.valueOf(((Long) c0208l.getValue()).longValue()).compareTo((Double) c0202f.getValue());
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: E */
    public InterfaceC0210n mo999E(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
        if (c0198b.m996q()) {
            return mo981G(interfaceC0210n);
        }
        return interfaceC0210n.isEmpty() ? this : C0203g.m1050w().mo999E(c0198b, interfaceC0210n).mo981G(this.f907a);
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: H */
    public boolean mo1000H() {
        return true;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: N */
    public Object mo1001N(boolean z7) {
        if (!z7 || this.f907a.isEmpty()) {
            return getValue();
        }
        HashMap map = new HashMap();
        map.put(".value", getValue());
        map.put(".priority", this.f907a.getValue());
        return map;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: Q */
    public Iterator mo1002Q() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: R */
    public boolean mo1003R(C0198b c0198b) {
        return false;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: S */
    public String mo1004S() {
        if (this.f908b == null) {
            this.f908b = AbstractC7551l.m33236i(mo982L(InterfaceC0210n.b.V1));
        }
        return this.f908b;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: f */
    public int mo1005f() {
        return 0;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: i */
    public InterfaceC0210n mo1006i() {
        return this.f907a;
    }

    @Override // p030D4.InterfaceC0210n
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Collections.EMPTY_LIST.iterator();
    }

    /* JADX INFO: renamed from: j */
    protected abstract int mo983j(AbstractC0207k abstractC0207k);

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: l */
    public InterfaceC0210n mo1008l(C0198b c0198b) {
        return c0198b.m996q() ? this.f907a : C0203g.m1050w();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compareTo(InterfaceC0210n interfaceC0210n) {
        if (interfaceC0210n.isEmpty()) {
            return 1;
        }
        if (interfaceC0210n instanceof C0199c) {
            return -1;
        }
        AbstractC7551l.m33234g(interfaceC0210n.mo1000H(), "Node is not leaf node!");
        if ((this instanceof C0208l) && (interfaceC0210n instanceof C0202f)) {
            return m1073k((C0208l) this, (C0202f) interfaceC0210n);
        }
        return ((this instanceof C0202f) && (interfaceC0210n instanceof C0208l)) ? m1073k((C0208l) interfaceC0210n, (C0202f) this) * (-1) : m1076q((AbstractC0207k) interfaceC0210n);
    }

    /* JADX INFO: renamed from: n */
    protected abstract b mo984n();

    /* JADX INFO: renamed from: p */
    protected String m1075p(InterfaceC0210n.b bVar) {
        int i7 = a.f909a[bVar.ordinal()];
        if (i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException("Unknown hash version: " + bVar);
        }
        if (this.f907a.isEmpty()) {
            return "";
        }
        return "priority:" + this.f907a.mo982L(bVar) + ":";
    }

    /* JADX INFO: renamed from: q */
    protected int m1076q(AbstractC0207k abstractC0207k) {
        b bVarMo984n = mo984n();
        b bVarMo984n2 = abstractC0207k.mo984n();
        return bVarMo984n.equals(bVarMo984n2) ? mo983j(abstractC0207k) : bVarMo984n.compareTo(bVarMo984n2);
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: r */
    public InterfaceC0210n mo1013r(C7245j c7245j) {
        if (c7245j.isEmpty()) {
            return this;
        }
        return c7245j.m32004z().m996q() ? this.f907a : C0203g.m1050w();
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: s */
    public C0198b mo1014s(C0198b c0198b) {
        return null;
    }

    public String toString() {
        String string = mo1001N(true).toString();
        if (string.length() <= 100) {
            return string;
        }
        return string.substring(0, 100) + "...";
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: u */
    public InterfaceC0210n mo1015u(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
        C0198b c0198bM32004z = c7245j.m32004z();
        if (c0198bM32004z == null) {
            return interfaceC0210n;
        }
        if (interfaceC0210n.isEmpty() && !c0198bM32004z.m996q()) {
            return this;
        }
        boolean z7 = true;
        if (c7245j.m32004z().m996q() && c7245j.size() != 1) {
            z7 = false;
        }
        AbstractC7551l.m33233f(z7);
        return mo999E(c0198bM32004z, C0203g.m1050w().mo1015u(c7245j.m31996C(), interfaceC0210n));
    }
}
