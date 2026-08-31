package p374v4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p030D4.AbstractC0211o;
import p030D4.C0198b;
import p030D4.C0209m;
import p030D4.InterfaceC0210n;
import p398y4.AbstractC7551l;
import p398y4.C7543d;

/* JADX INFO: renamed from: v4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7236a implements Iterable {

    /* JADX INFO: renamed from: b */
    private static final C7236a f28836b = new C7236a(new C7543d(null));

    /* JADX INFO: renamed from: a */
    private final C7543d f28837a;

    /* JADX INFO: renamed from: v4.a$a */
    class a implements C7543d.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7245j f28838a;

        a(C7245j c7245j) {
            this.f28838a = c7245j;
        }

        @Override // p398y4.C7543d.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C7236a mo30316a(C7245j c7245j, InterfaceC0210n interfaceC0210n, C7236a c7236a) {
            return c7236a.m31935b(this.f28838a.m32000q(c7245j), interfaceC0210n);
        }
    }

    /* JADX INFO: renamed from: v4.a$b */
    class b implements C7543d.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f28840a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f28841b;

        b(Map map, boolean z7) {
            this.f28840a = map;
            this.f28841b = z7;
        }

        @Override // p398y4.C7543d.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo30316a(C7245j c7245j, InterfaceC0210n interfaceC0210n, Void r7) {
            this.f28840a.put(c7245j.m31997D(), interfaceC0210n.mo1001N(this.f28841b));
            return null;
        }
    }

    private C7236a(C7543d c7543d) {
        this.f28837a = c7543d;
    }

    /* JADX INFO: renamed from: j */
    private InterfaceC0210n m31929j(C7245j c7245j, C7543d c7543d, InterfaceC0210n interfaceC0210n) {
        if (c7543d.getValue() != null) {
            return interfaceC0210n.mo1015u(c7245j, (InterfaceC0210n) c7543d.getValue());
        }
        InterfaceC0210n interfaceC0210n2 = null;
        for (Map.Entry entry : c7543d.m33199q()) {
            C7543d c7543d2 = (C7543d) entry.getValue();
            C0198b c0198b = (C0198b) entry.getKey();
            if (c0198b.m996q()) {
                AbstractC7551l.m33234g(c7543d2.getValue() != null, "Priority writes must always be leaf nodes");
                interfaceC0210n2 = (InterfaceC0210n) c7543d2.getValue();
            } else {
                interfaceC0210n = m31929j(c7245j.m31999p(c0198b), c7543d2, interfaceC0210n);
            }
        }
        return (interfaceC0210n.mo1013r(c7245j).isEmpty() || interfaceC0210n2 == null) ? interfaceC0210n : interfaceC0210n.mo1015u(c7245j.m31999p(C0198b.m991n()), interfaceC0210n2);
    }

    /* JADX INFO: renamed from: n */
    public static C7236a m31930n() {
        return f28836b;
    }

    /* JADX INFO: renamed from: p */
    public static C7236a m31931p(Map map) {
        C7543d c7543dM33187b = C7543d.m33187b();
        for (Map.Entry entry : map.entrySet()) {
            c7543dM33187b = c7543dM33187b.m33189A((C7245j) entry.getKey(), new C7543d((InterfaceC0210n) entry.getValue()));
        }
        return new C7236a(c7543dM33187b);
    }

    /* JADX INFO: renamed from: q */
    public static C7236a m31932q(Map map) {
        C7543d c7543dM33187b = C7543d.m33187b();
        for (Map.Entry entry : map.entrySet()) {
            c7543dM33187b = c7543dM33187b.m33189A(new C7245j((String) entry.getKey()), new C7543d(AbstractC0211o.m1085a(entry.getValue())));
        }
        return new C7236a(c7543dM33187b);
    }

    /* JADX INFO: renamed from: A */
    public InterfaceC0210n m31933A() {
        return (InterfaceC0210n) this.f28837a.getValue();
    }

    /* JADX INFO: renamed from: a */
    public C7236a m31934a(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
        return m31935b(new C7245j(c0198b), interfaceC0210n);
    }

    /* JADX INFO: renamed from: b */
    public C7236a m31935b(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
        if (c7245j.isEmpty()) {
            return new C7236a(new C7543d(interfaceC0210n));
        }
        C7245j c7245jM33194g = this.f28837a.m33194g(c7245j);
        if (c7245jM33194g == null) {
            return new C7236a(this.f28837a.m33189A(c7245j, new C7543d(interfaceC0210n)));
        }
        C7245j c7245jM31990B = C7245j.m31990B(c7245jM33194g, c7245j);
        InterfaceC0210n interfaceC0210n2 = (InterfaceC0210n) this.f28837a.m33197n(c7245jM33194g);
        C0198b c0198bM32003x = c7245jM31990B.m32003x();
        if (c0198bM32003x != null && c0198bM32003x.m996q() && interfaceC0210n2.mo1013r(c7245jM31990B.m31995A()).isEmpty()) {
            return this;
        }
        return new C7236a(this.f28837a.m33204z(c7245jM33194g, interfaceC0210n2.mo1015u(c7245jM31990B, interfaceC0210n)));
    }

    /* JADX INFO: renamed from: e */
    public C7236a m31936e(C7245j c7245j, C7236a c7236a) {
        return (C7236a) c7236a.f28837a.m33195j(this, new a(c7245j));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C7236a.class) {
            return false;
        }
        return ((C7236a) obj).m31942x(true).equals(m31942x(true));
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC0210n m31937g(InterfaceC0210n interfaceC0210n) {
        return m31929j(C7245j.m31994y(), this.f28837a, interfaceC0210n);
    }

    public int hashCode() {
        return m31942x(true).hashCode();
    }

    public boolean isEmpty() {
        return this.f28837a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f28837a.iterator();
    }

    /* JADX INFO: renamed from: k */
    public C7236a m31938k(C7245j c7245j) {
        if (c7245j.isEmpty()) {
            return this;
        }
        InterfaceC0210n interfaceC0210nM31941w = m31941w(c7245j);
        return interfaceC0210nM31941w != null ? new C7236a(new C7543d(interfaceC0210nM31941w)) : new C7236a(this.f28837a.m33190B(c7245j));
    }

    /* JADX INFO: renamed from: m */
    public Map m31939m() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f28837a.m33199q()) {
            map.put((C0198b) entry.getKey(), new C7236a((C7543d) entry.getValue()));
        }
        return map;
    }

    public String toString() {
        return "CompoundWrite{" + m31942x(true).toString() + "}";
    }

    /* JADX INFO: renamed from: v */
    public List m31940v() {
        ArrayList arrayList = new ArrayList();
        if (this.f28837a.getValue() != null) {
            for (C0209m c0209m : (InterfaceC0210n) this.f28837a.getValue()) {
                arrayList.add(new C0209m(c0209m.m1082c(), c0209m.m1083d()));
            }
        } else {
            for (Map.Entry entry : this.f28837a.m33199q()) {
                C7543d c7543d = (C7543d) entry.getValue();
                if (c7543d.getValue() != null) {
                    arrayList.add(new C0209m((C0198b) entry.getKey(), (InterfaceC0210n) c7543d.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public InterfaceC0210n m31941w(C7245j c7245j) {
        C7245j c7245jM33194g = this.f28837a.m33194g(c7245j);
        if (c7245jM33194g != null) {
            return ((InterfaceC0210n) this.f28837a.m33197n(c7245jM33194g)).mo1013r(C7245j.m31990B(c7245jM33194g, c7245j));
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public Map m31942x(boolean z7) {
        HashMap map = new HashMap();
        this.f28837a.m33196m(new b(map, z7));
        return map;
    }

    /* JADX INFO: renamed from: y */
    public boolean m31943y(C7245j c7245j) {
        return m31941w(c7245j) != null;
    }

    /* JADX INFO: renamed from: z */
    public C7236a m31944z(C7245j c7245j) {
        return c7245j.isEmpty() ? f28836b : new C7236a(this.f28837a.m33189A(c7245j, C7543d.m33187b()));
    }
}
