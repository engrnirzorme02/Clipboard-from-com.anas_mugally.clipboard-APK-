package p327p5;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p008A6.AbstractC0037a;
import p016B6.InterfaceC0096d;
import p024C6.InterfaceC0154c;
import p024C6.InterfaceC0155d;
import p024C6.InterfaceC0156e;
import p024C6.InterfaceC0157f;
import p032D6.AbstractC0234o;
import p032D6.AbstractC0244y;
import p032D6.C0221b;
import p032D6.C0223d;
import p032D6.C0226g;
import p032D6.C0229j;
import p032D6.C0239t;
import p032D6.InterfaceC0225f;
import p408z6.C7620f;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: p5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6765h {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a */
    private final Boolean f27176a;

    /* JADX INFO: renamed from: b */
    private final Double f27177b;

    /* JADX INFO: renamed from: c */
    private final Integer f27178c;

    /* JADX INFO: renamed from: d */
    private final Integer f27179d;

    /* JADX INFO: renamed from: e */
    private final Long f27180e;

    /* JADX INFO: renamed from: p5.h$a */
    public /* synthetic */ class a implements InterfaceC0225f {

        /* JADX INFO: renamed from: a */
        public static final a f27181a;
        private static final InterfaceC0096d descriptor;

        static {
            a aVar = new a();
            f27181a = aVar;
            C0239t c0239t = new C0239t("com.google.firebase.sessions.settings.SessionConfigs", aVar, 5);
            c0239t.m1164p("sessionsEnabled", false);
            c0239t.m1164p("sessionSamplingRate", false);
            c0239t.m1164p("sessionTimeoutSeconds", false);
            c0239t.m1164p("cacheDurationSeconds", false);
            c0239t.m1164p("cacheUpdatedTimeSeconds", false);
            descriptor = c0239t;
        }

        private a() {
        }

        @Override // p408z6.InterfaceC7616b, p408z6.InterfaceC7619e, p408z6.InterfaceC7615a
        /* JADX INFO: renamed from: a */
        public final InterfaceC0096d mo1120a() {
            return descriptor;
        }

        @Override // p032D6.InterfaceC0225f
        /* JADX INFO: renamed from: c */
        public InterfaceC7616b[] mo1132c() {
            return InterfaceC0225f.a.m1134a(this);
        }

        @Override // p032D6.InterfaceC0225f
        /* JADX INFO: renamed from: e */
        public final InterfaceC7616b[] mo1133e() {
            InterfaceC7616b interfaceC7616bM171a = AbstractC0037a.m171a(C0221b.f934a);
            InterfaceC7616b interfaceC7616bM171a2 = AbstractC0037a.m171a(C0223d.f936a);
            C0226g c0226g = C0226g.f944a;
            return new InterfaceC7616b[]{interfaceC7616bM171a, interfaceC7616bM171a2, AbstractC0037a.m171a(c0226g), AbstractC0037a.m171a(c0226g), AbstractC0037a.m171a(C0229j.f947a)};
        }

        @Override // p408z6.InterfaceC7615a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final C6765h mo1109b(InterfaceC0156e decoder) {
            int i7;
            Boolean bool;
            Double d7;
            Integer num;
            Integer num2;
            Long l7;
            AbstractC6118n.m27187e(decoder, "decoder");
            InterfaceC0096d interfaceC0096d = descriptor;
            InterfaceC0154c interfaceC0154cMo725a = decoder.mo725a(interfaceC0096d);
            Boolean bool2 = null;
            if (interfaceC0154cMo725a.mo703p()) {
                Boolean bool3 = (Boolean) interfaceC0154cMo725a.mo695f(interfaceC0096d, 0, C0221b.f934a, null);
                Double d8 = (Double) interfaceC0154cMo725a.mo695f(interfaceC0096d, 1, C0223d.f936a, null);
                C0226g c0226g = C0226g.f944a;
                Integer num3 = (Integer) interfaceC0154cMo725a.mo695f(interfaceC0096d, 2, c0226g, null);
                bool = bool3;
                num2 = (Integer) interfaceC0154cMo725a.mo695f(interfaceC0096d, 3, c0226g, null);
                l7 = (Long) interfaceC0154cMo725a.mo695f(interfaceC0096d, 4, C0229j.f947a, null);
                num = num3;
                d7 = d8;
                i7 = 31;
            } else {
                boolean z7 = true;
                int i8 = 0;
                Double d9 = null;
                Integer num4 = null;
                Integer num5 = null;
                Long l8 = null;
                while (z7) {
                    int iMo719q = interfaceC0154cMo725a.mo719q(interfaceC0096d);
                    if (iMo719q == -1) {
                        z7 = false;
                    } else if (iMo719q == 0) {
                        bool2 = (Boolean) interfaceC0154cMo725a.mo695f(interfaceC0096d, 0, C0221b.f934a, bool2);
                        i8 |= 1;
                    } else if (iMo719q == 1) {
                        d9 = (Double) interfaceC0154cMo725a.mo695f(interfaceC0096d, 1, C0223d.f936a, d9);
                        i8 |= 2;
                    } else if (iMo719q == 2) {
                        num4 = (Integer) interfaceC0154cMo725a.mo695f(interfaceC0096d, 2, C0226g.f944a, num4);
                        i8 |= 4;
                    } else if (iMo719q == 3) {
                        num5 = (Integer) interfaceC0154cMo725a.mo695f(interfaceC0096d, 3, C0226g.f944a, num5);
                        i8 |= 8;
                    } else {
                        if (iMo719q != 4) {
                            throw new C7620f(iMo719q);
                        }
                        l8 = (Long) interfaceC0154cMo725a.mo695f(interfaceC0096d, 4, C0229j.f947a, l8);
                        i8 |= 16;
                    }
                }
                i7 = i8;
                bool = bool2;
                d7 = d9;
                num = num4;
                num2 = num5;
                l7 = l8;
            }
            interfaceC0154cMo725a.mo718b(interfaceC0096d);
            return new C6765h(i7, bool, d7, num, num2, l7, null);
        }

        @Override // p408z6.InterfaceC7619e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo1121d(InterfaceC0157f encoder, C6765h value) {
            AbstractC6118n.m27187e(encoder, "encoder");
            AbstractC6118n.m27187e(value, "value");
            InterfaceC0096d interfaceC0096d = descriptor;
            InterfaceC0155d interfaceC0155dMo730a = encoder.mo730a(interfaceC0096d);
            C6765h.m29569f(value, interfaceC0155dMo730a, interfaceC0096d);
            interfaceC0155dMo730a.mo723b(interfaceC0096d);
        }
    }

    /* JADX INFO: renamed from: p5.h$b */
    public static final class b {
        private b() {
        }

        public final InterfaceC7616b serializer() {
            return a.f27181a;
        }

        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }
    }

    public /* synthetic */ C6765h(int i7, Boolean bool, Double d7, Integer num, Integer num2, Long l7, AbstractC0244y abstractC0244y) {
        if (31 != (i7 & 31)) {
            AbstractC0234o.m1152a(i7, 31, a.f27181a.mo1120a());
        }
        this.f27176a = bool;
        this.f27177b = d7;
        this.f27178c = num;
        this.f27179d = num2;
        this.f27180e = l7;
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ void m29569f(C6765h c6765h, InterfaceC0155d interfaceC0155d, InterfaceC0096d interfaceC0096d) {
        interfaceC0155d.mo710l(interfaceC0096d, 0, C0221b.f934a, c6765h.f27176a);
        interfaceC0155d.mo710l(interfaceC0096d, 1, C0223d.f936a, c6765h.f27177b);
        C0226g c0226g = C0226g.f944a;
        interfaceC0155d.mo710l(interfaceC0096d, 2, c0226g, c6765h.f27178c);
        interfaceC0155d.mo710l(interfaceC0096d, 3, c0226g, c6765h.f27179d);
        interfaceC0155d.mo710l(interfaceC0096d, 4, C0229j.f947a, c6765h.f27180e);
    }

    /* JADX INFO: renamed from: a */
    public final Integer m29570a() {
        return this.f27179d;
    }

    /* JADX INFO: renamed from: b */
    public final Long m29571b() {
        return this.f27180e;
    }

    /* JADX INFO: renamed from: c */
    public final Double m29572c() {
        return this.f27177b;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m29573d() {
        return this.f27178c;
    }

    /* JADX INFO: renamed from: e */
    public final Boolean m29574e() {
        return this.f27176a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6765h)) {
            return false;
        }
        C6765h c6765h = (C6765h) obj;
        return AbstractC6118n.m27183a(this.f27176a, c6765h.f27176a) && AbstractC6118n.m27183a(this.f27177b, c6765h.f27177b) && AbstractC6118n.m27183a(this.f27178c, c6765h.f27178c) && AbstractC6118n.m27183a(this.f27179d, c6765h.f27179d) && AbstractC6118n.m27183a(this.f27180e, c6765h.f27180e);
    }

    public int hashCode() {
        Boolean bool = this.f27176a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d7 = this.f27177b;
        int iHashCode2 = (iHashCode + (d7 == null ? 0 : d7.hashCode())) * 31;
        Integer num = this.f27178c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f27179d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l7 = this.f27180e;
        return iHashCode4 + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f27176a + ", sessionSamplingRate=" + this.f27177b + ", sessionTimeoutSeconds=" + this.f27178c + ", cacheDurationSeconds=" + this.f27179d + ", cacheUpdatedTimeSeconds=" + this.f27180e + ')';
    }

    public C6765h(Boolean bool, Double d7, Integer num, Integer num2, Long l7) {
        this.f27176a = bool;
        this.f27177b = d7;
        this.f27178c = num;
        this.f27179d = num2;
        this.f27180e = l7;
    }
}
