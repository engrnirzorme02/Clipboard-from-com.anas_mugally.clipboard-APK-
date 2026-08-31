package p301m5;

import java.util.Map;
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
import p032D6.C0228i;
import p032D6.C0239t;
import p032D6.C0245z;
import p032D6.InterfaceC0225f;
import p408z6.C7620f;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: m5.E */
/* JADX INFO: loaded from: classes.dex */
public final class C6351E {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: d */
    private static final InterfaceC7616b[] f24214d = {null, null, new C0228i(C0245z.f980a, C6394v.a.f24423a)};

    /* JADX INFO: renamed from: a */
    private final C6354H f24215a;

    /* JADX INFO: renamed from: b */
    private final C6368W f24216b;

    /* JADX INFO: renamed from: c */
    private final Map f24217c;

    /* JADX INFO: renamed from: m5.E$a */
    public /* synthetic */ class a implements InterfaceC0225f {

        /* JADX INFO: renamed from: a */
        public static final a f24218a;
        private static final InterfaceC0096d descriptor;

        static {
            a aVar = new a();
            f24218a = aVar;
            C0239t c0239t = new C0239t("com.google.firebase.sessions.SessionData", aVar, 3);
            c0239t.m1164p("sessionDetails", false);
            c0239t.m1164p("backgroundTime", true);
            c0239t.m1164p("processDataMap", true);
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
            return new InterfaceC7616b[]{C6354H.a.f24225a, AbstractC0037a.m171a(C6368W.a.f24321a), AbstractC0037a.m171a(C6351E.f24214d[2])};
        }

        @Override // p408z6.InterfaceC7615a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final C6351E mo1109b(InterfaceC0156e decoder) {
            int i7;
            C6354H c6354h;
            C6368W c6368w;
            Map map;
            AbstractC6118n.m27187e(decoder, "decoder");
            InterfaceC0096d interfaceC0096d = descriptor;
            InterfaceC0154c interfaceC0154cMo725a = decoder.mo725a(interfaceC0096d);
            InterfaceC7616b[] interfaceC7616bArr = C6351E.f24214d;
            C6354H c6354h2 = null;
            if (interfaceC0154cMo725a.mo703p()) {
                C6354H c6354h3 = (C6354H) interfaceC0154cMo725a.mo697h(interfaceC0096d, 0, C6354H.a.f24225a, null);
                C6368W c6368w2 = (C6368W) interfaceC0154cMo725a.mo695f(interfaceC0096d, 1, C6368W.a.f24321a, null);
                map = (Map) interfaceC0154cMo725a.mo695f(interfaceC0096d, 2, interfaceC7616bArr[2], null);
                c6354h = c6354h3;
                i7 = 7;
                c6368w = c6368w2;
            } else {
                boolean z7 = true;
                int i8 = 0;
                C6368W c6368w3 = null;
                Map map2 = null;
                while (z7) {
                    int iMo719q = interfaceC0154cMo725a.mo719q(interfaceC0096d);
                    if (iMo719q == -1) {
                        z7 = false;
                    } else if (iMo719q == 0) {
                        c6354h2 = (C6354H) interfaceC0154cMo725a.mo697h(interfaceC0096d, 0, C6354H.a.f24225a, c6354h2);
                        i8 |= 1;
                    } else if (iMo719q == 1) {
                        c6368w3 = (C6368W) interfaceC0154cMo725a.mo695f(interfaceC0096d, 1, C6368W.a.f24321a, c6368w3);
                        i8 |= 2;
                    } else {
                        if (iMo719q != 2) {
                            throw new C7620f(iMo719q);
                        }
                        map2 = (Map) interfaceC0154cMo725a.mo695f(interfaceC0096d, 2, interfaceC7616bArr[2], map2);
                        i8 |= 4;
                    }
                }
                i7 = i8;
                c6354h = c6354h2;
                c6368w = c6368w3;
                map = map2;
            }
            interfaceC0154cMo725a.mo718b(interfaceC0096d);
            return new C6351E(i7, c6354h, c6368w, map, (AbstractC0244y) null);
        }

        @Override // p408z6.InterfaceC7619e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo1121d(InterfaceC0157f encoder, C6351E value) {
            AbstractC6118n.m27187e(encoder, "encoder");
            AbstractC6118n.m27187e(value, "value");
            InterfaceC0096d interfaceC0096d = descriptor;
            InterfaceC0155d interfaceC0155dMo730a = encoder.mo730a(interfaceC0096d);
            C6351E.m27380g(value, interfaceC0155dMo730a, interfaceC0096d);
            interfaceC0155dMo730a.mo723b(interfaceC0096d);
        }
    }

    /* JADX INFO: renamed from: m5.E$b */
    public static final class b {
        private b() {
        }

        public final InterfaceC7616b serializer() {
            return a.f24218a;
        }

        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }
    }

    public /* synthetic */ C6351E(int i7, C6354H c6354h, C6368W c6368w, Map map, AbstractC0244y abstractC0244y) {
        if (1 != (i7 & 1)) {
            AbstractC0234o.m1152a(i7, 1, a.f24218a.mo1120a());
        }
        this.f24215a = c6354h;
        if ((i7 & 2) == 0) {
            this.f24216b = null;
        } else {
            this.f24216b = c6368w;
        }
        if ((i7 & 4) == 0) {
            this.f24217c = null;
        } else {
            this.f24217c = map;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C6351E m27379c(C6351E c6351e, C6354H c6354h, C6368W c6368w, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            c6354h = c6351e.f24215a;
        }
        if ((i7 & 2) != 0) {
            c6368w = c6351e.f24216b;
        }
        if ((i7 & 4) != 0) {
            map = c6351e.f24217c;
        }
        return c6351e.m27381b(c6354h, c6368w, map);
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ void m27380g(C6351E c6351e, InterfaceC0155d interfaceC0155d, InterfaceC0096d interfaceC0096d) {
        InterfaceC7616b[] interfaceC7616bArr = f24214d;
        interfaceC0155d.mo705d(interfaceC0096d, 0, C6354H.a.f24225a, c6351e.f24215a);
        if (interfaceC0155d.mo724j(interfaceC0096d, 1) || c6351e.f24216b != null) {
            interfaceC0155d.mo710l(interfaceC0096d, 1, C6368W.a.f24321a, c6351e.f24216b);
        }
        if (!interfaceC0155d.mo724j(interfaceC0096d, 2) && c6351e.f24217c == null) {
            return;
        }
        interfaceC0155d.mo710l(interfaceC0096d, 2, interfaceC7616bArr[2], c6351e.f24217c);
    }

    /* JADX INFO: renamed from: b */
    public final C6351E m27381b(C6354H sessionDetails, C6368W c6368w, Map map) {
        AbstractC6118n.m27187e(sessionDetails, "sessionDetails");
        return new C6351E(sessionDetails, c6368w, map);
    }

    /* JADX INFO: renamed from: d */
    public final C6368W m27382d() {
        return this.f24216b;
    }

    /* JADX INFO: renamed from: e */
    public final Map m27383e() {
        return this.f24217c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6351E)) {
            return false;
        }
        C6351E c6351e = (C6351E) obj;
        return AbstractC6118n.m27183a(this.f24215a, c6351e.f24215a) && AbstractC6118n.m27183a(this.f24216b, c6351e.f24216b) && AbstractC6118n.m27183a(this.f24217c, c6351e.f24217c);
    }

    /* JADX INFO: renamed from: f */
    public final C6354H m27384f() {
        return this.f24215a;
    }

    public int hashCode() {
        int iHashCode = this.f24215a.hashCode() * 31;
        C6368W c6368w = this.f24216b;
        int iHashCode2 = (iHashCode + (c6368w == null ? 0 : c6368w.hashCode())) * 31;
        Map map = this.f24217c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "SessionData(sessionDetails=" + this.f24215a + ", backgroundTime=" + this.f24216b + ", processDataMap=" + this.f24217c + ')';
    }

    public C6351E(C6354H sessionDetails, C6368W c6368w, Map map) {
        AbstractC6118n.m27187e(sessionDetails, "sessionDetails");
        this.f24215a = sessionDetails;
        this.f24216b = c6368w;
        this.f24217c = map;
    }

    public /* synthetic */ C6351E(C6354H c6354h, C6368W c6368w, Map map, int i7, AbstractC6112h abstractC6112h) {
        this(c6354h, (i7 & 2) != 0 ? null : c6368w, (i7 & 4) != 0 ? null : map);
    }
}
