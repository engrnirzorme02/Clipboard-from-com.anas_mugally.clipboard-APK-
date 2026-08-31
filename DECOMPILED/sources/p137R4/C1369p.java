package p137R4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p158U4.AbstractC1701y;
import p158U4.C1693q;
import p158U4.InterfaceC1684h;
import p186Y4.AbstractC2034b;
import p351s5.C7039u;

/* JADX INFO: renamed from: R4.p */
/* JADX INFO: loaded from: classes.dex */
public class C1369p extends AbstractC1370q {

    /* JADX INFO: renamed from: a */
    private final b f4836a;

    /* JADX INFO: renamed from: b */
    private final C7039u f4837b;

    /* JADX INFO: renamed from: c */
    private final C1693q f4838c;

    /* JADX INFO: renamed from: R4.p$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4839a;

        static {
            int[] iArr = new int[b.values().length];
            f4839a = iArr;
            try {
                iArr[b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4839a[b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4839a[b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4839a[b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4839a[b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4839a[b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: R4.p$b */
    public enum b {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");


        /* JADX INFO: renamed from: a */
        private final String f4851a;

        b(String str) {
            this.f4851a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f4851a;
        }
    }

    protected C1369p(C1693q c1693q, b bVar, C7039u c7039u) {
        this.f4838c = c1693q;
        this.f4836a = bVar;
        this.f4837b = c7039u;
    }

    /* JADX INFO: renamed from: e */
    public static C1369p m5921e(C1693q c1693q, b bVar, C7039u c7039u) {
        if (!c1693q.m7121B()) {
            if (bVar == b.ARRAY_CONTAINS) {
                return new C1359f(c1693q, c7039u);
            }
            if (bVar == b.IN) {
                return new C1333A(c1693q, c7039u);
            }
            if (bVar == b.ARRAY_CONTAINS_ANY) {
                return new C1358e(c1693q, c7039u);
            }
            return bVar == b.NOT_IN ? new C1340H(c1693q, c7039u) : new C1369p(c1693q, bVar, c7039u);
        }
        if (bVar == b.IN) {
            return new C1335C(c1693q, c7039u);
        }
        if (bVar == b.NOT_IN) {
            return new C1336D(c1693q, c7039u);
        }
        AbstractC2034b.m8460d((bVar == b.ARRAY_CONTAINS || bVar == b.ARRAY_CONTAINS_ANY) ? false : true, bVar.toString() + "queries don't make sense on document keys", new Object[0]);
        return new C1334B(c1693q, bVar, c7039u);
    }

    @Override // p137R4.AbstractC1370q
    /* JADX INFO: renamed from: a */
    public String mo5890a() {
        return m5922f().mo7057h() + m5923g().toString() + AbstractC1701y.m7174b(m5924h());
    }

    @Override // p137R4.AbstractC1370q
    /* JADX INFO: renamed from: b */
    public List mo5891b() {
        return Collections.singletonList(this);
    }

    @Override // p137R4.AbstractC1370q
    /* JADX INFO: renamed from: c */
    public List mo5892c() {
        return Collections.singletonList(this);
    }

    @Override // p137R4.AbstractC1370q
    /* JADX INFO: renamed from: d */
    public boolean mo5717d(InterfaceC1684h interfaceC1684h) {
        C7039u c7039uMo7078g = interfaceC1684h.mo7078g(this.f4838c);
        if (this.f4836a == b.NOT_EQUAL) {
            return (c7039uMo7078g == null || c7039uMo7078g.m31045x0() || !m5926j(AbstractC1701y.m7181i(c7039uMo7078g, this.f4837b))) ? false : true;
        }
        return c7039uMo7078g != null && AbstractC1701y.m7171I(c7039uMo7078g) == AbstractC1701y.m7171I(this.f4837b) && m5926j(AbstractC1701y.m7181i(c7039uMo7078g, this.f4837b));
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1369p)) {
            C1369p c1369p = (C1369p) obj;
            if (this.f4836a == c1369p.f4836a && this.f4838c.equals(c1369p.f4838c) && this.f4837b.equals(c1369p.f4837b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public C1693q m5922f() {
        return this.f4838c;
    }

    /* JADX INFO: renamed from: g */
    public b m5923g() {
        return this.f4836a;
    }

    /* JADX INFO: renamed from: h */
    public C7039u m5924h() {
        return this.f4837b;
    }

    public int hashCode() {
        return ((((1147 + this.f4836a.hashCode()) * 31) + this.f4838c.hashCode()) * 31) + this.f4837b.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public boolean m5925i() {
        return Arrays.asList(b.LESS_THAN, b.LESS_THAN_OR_EQUAL, b.GREATER_THAN, b.GREATER_THAN_OR_EQUAL, b.NOT_EQUAL, b.NOT_IN).contains(this.f4836a);
    }

    /* JADX INFO: renamed from: j */
    protected boolean m5926j(int i7) {
        switch (a.f4839a[this.f4836a.ordinal()]) {
            case 1:
                return i7 < 0;
            case 2:
                return i7 <= 0;
            case 3:
                return i7 == 0;
            case 4:
                return i7 != 0;
            case 5:
                return i7 > 0;
            case 6:
                return i7 >= 0;
            default:
                throw AbstractC2034b.m8457a("Unknown FieldFilter operator: %s", this.f4836a);
        }
    }

    public String toString() {
        return mo5890a();
    }
}
