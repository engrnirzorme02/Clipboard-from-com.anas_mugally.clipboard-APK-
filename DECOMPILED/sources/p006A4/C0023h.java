package p006A4;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p014B4.C0087b;
import p014B4.C0088c;
import p014B4.C0090e;
import p014B4.InterfaceC0089d;
import p030D4.AbstractC0204h;
import p030D4.AbstractC0211o;
import p030D4.AbstractC0214r;
import p030D4.C0197a;
import p030D4.C0198b;
import p030D4.C0202f;
import p030D4.C0203g;
import p030D4.C0208l;
import p030D4.C0213q;
import p030D4.C0216t;
import p030D4.InterfaceC0210n;
import p046F4.AbstractC0432b;

/* JADX INFO: renamed from: A4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0023h {

    /* JADX INFO: renamed from: i */
    public static final C0023h f119i = new C0023h();

    /* JADX INFO: renamed from: a */
    private Integer f120a;

    /* JADX INFO: renamed from: b */
    private b f121b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0210n f122c = null;

    /* JADX INFO: renamed from: d */
    private C0198b f123d = null;

    /* JADX INFO: renamed from: e */
    private InterfaceC0210n f124e = null;

    /* JADX INFO: renamed from: f */
    private C0198b f125f = null;

    /* JADX INFO: renamed from: g */
    private AbstractC0204h f126g = C0213q.m1089j();

    /* JADX INFO: renamed from: h */
    private String f127h = null;

    /* JADX INFO: renamed from: A4.h$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f128a;

        static {
            int[] iArr = new int[b.values().length];
            f128a = iArr;
            try {
                iArr[b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f128a[b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: A4.h$b */
    private enum b {
        LEFT,
        RIGHT
    }

    /* JADX INFO: renamed from: a */
    public static C0023h m116a(Map map) {
        C0023h c0023h = new C0023h();
        c0023h.f120a = (Integer) map.get("l");
        if (map.containsKey("sp")) {
            c0023h.f122c = m117p(AbstractC0211o.m1085a(map.get("sp")));
            String str = (String) map.get("sn");
            if (str != null) {
                c0023h.f123d = C0198b.m988j(str);
            }
        }
        if (map.containsKey("ep")) {
            c0023h.f124e = m117p(AbstractC0211o.m1085a(map.get("ep")));
            String str2 = (String) map.get("en");
            if (str2 != null) {
                c0023h.f125f = C0198b.m988j(str2);
            }
        }
        String str3 = (String) map.get("vf");
        if (str3 != null) {
            c0023h.f121b = str3.equals("l") ? b.LEFT : b.RIGHT;
        }
        String str4 = (String) map.get("i");
        if (str4 != null) {
            c0023h.f126g = AbstractC0204h.m1052b(str4);
        }
        return c0023h;
    }

    /* JADX INFO: renamed from: p */
    private static InterfaceC0210n m117p(InterfaceC0210n interfaceC0210n) {
        if ((interfaceC0210n instanceof C0216t) || (interfaceC0210n instanceof C0197a) || (interfaceC0210n instanceof C0202f) || (interfaceC0210n instanceof C0203g)) {
            return interfaceC0210n;
        }
        if (interfaceC0210n instanceof C0208l) {
            return new C0202f(Double.valueOf(((Long) interfaceC0210n.getValue()).doubleValue()), AbstractC0214r.m1091a());
        }
        throw new IllegalStateException("Unexpected value passed to normalizeValue: " + interfaceC0210n.getValue());
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0204h m118b() {
        return this.f126g;
    }

    /* JADX INFO: renamed from: c */
    public C0198b m119c() {
        if (!m126j()) {
            throw new IllegalArgumentException("Cannot get index end name if start has not been set");
        }
        C0198b c0198b = this.f125f;
        return c0198b != null ? c0198b : C0198b.m989k();
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0210n m120d() {
        if (m126j()) {
            return this.f124e;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }

    /* JADX INFO: renamed from: e */
    public C0198b m121e() {
        if (!m128l()) {
            throw new IllegalArgumentException("Cannot get index start name if start has not been set");
        }
        C0198b c0198b = this.f123d;
        return c0198b != null ? c0198b : C0198b.m990m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0023h.class != obj.getClass()) {
            return false;
        }
        C0023h c0023h = (C0023h) obj;
        Integer num = this.f120a;
        if (num == null ? c0023h.f120a != null : !num.equals(c0023h.f120a)) {
            return false;
        }
        AbstractC0204h abstractC0204h = this.f126g;
        if (abstractC0204h == null ? c0023h.f126g != null : !abstractC0204h.equals(c0023h.f126g)) {
            return false;
        }
        C0198b c0198b = this.f125f;
        if (c0198b == null ? c0023h.f125f != null : !c0198b.equals(c0023h.f125f)) {
            return false;
        }
        InterfaceC0210n interfaceC0210n = this.f124e;
        if (interfaceC0210n == null ? c0023h.f124e != null : !interfaceC0210n.equals(c0023h.f124e)) {
            return false;
        }
        C0198b c0198b2 = this.f123d;
        if (c0198b2 == null ? c0023h.f123d != null : !c0198b2.equals(c0023h.f123d)) {
            return false;
        }
        InterfaceC0210n interfaceC0210n2 = this.f122c;
        if (interfaceC0210n2 == null ? c0023h.f122c == null : interfaceC0210n2.equals(c0023h.f122c)) {
            return m130n() == c0023h.m130n();
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0210n m122f() {
        if (m128l()) {
            return this.f122c;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }

    /* JADX INFO: renamed from: g */
    public int m123g() {
        if (m127k()) {
            return this.f120a.intValue();
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC0089d m124h() {
        if (m131o()) {
            return new C0087b(m118b());
        }
        return m127k() ? new C0088c(this) : new C0090e(this);
    }

    public int hashCode() {
        Integer num = this.f120a;
        int iIntValue = (((num != null ? num.intValue() : 0) * 31) + (m130n() ? 1231 : 1237)) * 31;
        InterfaceC0210n interfaceC0210n = this.f122c;
        int iHashCode = (iIntValue + (interfaceC0210n != null ? interfaceC0210n.hashCode() : 0)) * 31;
        C0198b c0198b = this.f123d;
        int iHashCode2 = (iHashCode + (c0198b != null ? c0198b.hashCode() : 0)) * 31;
        InterfaceC0210n interfaceC0210n2 = this.f124e;
        int iHashCode3 = (iHashCode2 + (interfaceC0210n2 != null ? interfaceC0210n2.hashCode() : 0)) * 31;
        C0198b c0198b2 = this.f125f;
        int iHashCode4 = (iHashCode3 + (c0198b2 != null ? c0198b2.hashCode() : 0)) * 31;
        AbstractC0204h abstractC0204h = this.f126g;
        return iHashCode4 + (abstractC0204h != null ? abstractC0204h.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public Map m125i() {
        HashMap map = new HashMap();
        if (m128l()) {
            map.put("sp", this.f122c.getValue());
            C0198b c0198b = this.f123d;
            if (c0198b != null) {
                map.put("sn", c0198b.m992d());
            }
        }
        if (m126j()) {
            map.put("ep", this.f124e.getValue());
            C0198b c0198b2 = this.f125f;
            if (c0198b2 != null) {
                map.put("en", c0198b2.m992d());
            }
        }
        Integer num = this.f120a;
        if (num != null) {
            map.put("l", num);
            b bVar = this.f121b;
            if (bVar == null) {
                bVar = m128l() ? b.LEFT : b.RIGHT;
            }
            int i7 = a.f128a[bVar.ordinal()];
            if (i7 == 1) {
                map.put("vf", "l");
            } else if (i7 == 2) {
                map.put("vf", "r");
            }
        }
        if (!this.f126g.equals(C0213q.m1089j())) {
            map.put("i", this.f126g.mo1054c());
        }
        return map;
    }

    /* JADX INFO: renamed from: j */
    public boolean m126j() {
        return this.f124e != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m127k() {
        return this.f120a != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m128l() {
        return this.f122c != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m129m() {
        return m131o() && this.f126g.equals(C0213q.m1089j());
    }

    /* JADX INFO: renamed from: n */
    public boolean m130n() {
        b bVar = this.f121b;
        if (bVar != null) {
            return bVar == b.LEFT;
        }
        return m128l();
    }

    /* JADX INFO: renamed from: o */
    public boolean m131o() {
        return (m128l() || m126j() || m127k()) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public String m132q() {
        if (this.f127h == null) {
            try {
                this.f127h = AbstractC0432b.m1863c(m125i());
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
        return this.f127h;
    }

    public String toString() {
        return m125i().toString();
    }
}
