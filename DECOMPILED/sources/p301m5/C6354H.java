package p301m5;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p024C6.InterfaceC0154c;
import p024C6.InterfaceC0155d;
import p024C6.InterfaceC0156e;
import p024C6.InterfaceC0157f;
import p032D6.AbstractC0234o;
import p032D6.AbstractC0244y;
import p032D6.C0226g;
import p032D6.C0229j;
import p032D6.C0239t;
import p032D6.C0245z;
import p032D6.InterfaceC0225f;
import p408z6.C7620f;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: m5.H */
/* JADX INFO: loaded from: classes.dex */
public final class C6354H {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a */
    private final String f24221a;

    /* JADX INFO: renamed from: b */
    private final String f24222b;

    /* JADX INFO: renamed from: c */
    private final int f24223c;

    /* JADX INFO: renamed from: d */
    private final long f24224d;

    /* JADX INFO: renamed from: m5.H$a */
    public /* synthetic */ class a implements InterfaceC0225f {

        /* JADX INFO: renamed from: a */
        public static final a f24225a;
        private static final InterfaceC0096d descriptor;

        static {
            a aVar = new a();
            f24225a = aVar;
            C0239t c0239t = new C0239t("com.google.firebase.sessions.SessionDetails", aVar, 4);
            c0239t.m1164p("sessionId", false);
            c0239t.m1164p("firstSessionId", false);
            c0239t.m1164p("sessionIndex", false);
            c0239t.m1164p("sessionStartTimestampUs", false);
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
            C0245z c0245z = C0245z.f980a;
            return new InterfaceC7616b[]{c0245z, c0245z, C0226g.f944a, C0229j.f947a};
        }

        @Override // p408z6.InterfaceC7615a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final C6354H mo1109b(InterfaceC0156e decoder) {
            String strMo702o;
            int i7;
            int iMo694e;
            String str;
            long jMo693d;
            AbstractC6118n.m27187e(decoder, "decoder");
            InterfaceC0096d interfaceC0096d = descriptor;
            InterfaceC0154c interfaceC0154cMo725a = decoder.mo725a(interfaceC0096d);
            if (interfaceC0154cMo725a.mo703p()) {
                strMo702o = interfaceC0154cMo725a.mo702o(interfaceC0096d, 0);
                String strMo702o2 = interfaceC0154cMo725a.mo702o(interfaceC0096d, 1);
                i7 = 15;
                iMo694e = interfaceC0154cMo725a.mo694e(interfaceC0096d, 2);
                str = strMo702o2;
                jMo693d = interfaceC0154cMo725a.mo693d(interfaceC0096d, 3);
            } else {
                strMo702o = null;
                String strMo702o3 = null;
                boolean z7 = true;
                long jMo693d2 = 0;
                int i8 = 0;
                int iMo694e2 = 0;
                while (z7) {
                    int iMo719q = interfaceC0154cMo725a.mo719q(interfaceC0096d);
                    if (iMo719q == -1) {
                        z7 = false;
                    } else if (iMo719q == 0) {
                        strMo702o = interfaceC0154cMo725a.mo702o(interfaceC0096d, 0);
                        i8 |= 1;
                    } else if (iMo719q == 1) {
                        strMo702o3 = interfaceC0154cMo725a.mo702o(interfaceC0096d, 1);
                        i8 |= 2;
                    } else if (iMo719q == 2) {
                        iMo694e2 = interfaceC0154cMo725a.mo694e(interfaceC0096d, 2);
                        i8 |= 4;
                    } else {
                        if (iMo719q != 3) {
                            throw new C7620f(iMo719q);
                        }
                        jMo693d2 = interfaceC0154cMo725a.mo693d(interfaceC0096d, 3);
                        i8 |= 8;
                    }
                }
                i7 = i8;
                iMo694e = iMo694e2;
                str = strMo702o3;
                jMo693d = jMo693d2;
            }
            String str2 = strMo702o;
            interfaceC0154cMo725a.mo718b(interfaceC0096d);
            return new C6354H(i7, str2, str, iMo694e, jMo693d, null);
        }

        @Override // p408z6.InterfaceC7619e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo1121d(InterfaceC0157f encoder, C6354H value) {
            AbstractC6118n.m27187e(encoder, "encoder");
            AbstractC6118n.m27187e(value, "value");
            InterfaceC0096d interfaceC0096d = descriptor;
            InterfaceC0155d interfaceC0155dMo730a = encoder.mo730a(interfaceC0096d);
            C6354H.m27392e(value, interfaceC0155dMo730a, interfaceC0096d);
            interfaceC0155dMo730a.mo723b(interfaceC0096d);
        }
    }

    /* JADX INFO: renamed from: m5.H$b */
    public static final class b {
        private b() {
        }

        public final InterfaceC7616b serializer() {
            return a.f24225a;
        }

        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }
    }

    public /* synthetic */ C6354H(int i7, String str, String str2, int i8, long j7, AbstractC0244y abstractC0244y) {
        if (15 != (i7 & 15)) {
            AbstractC0234o.m1152a(i7, 15, a.f24225a.mo1120a());
        }
        this.f24221a = str;
        this.f24222b = str2;
        this.f24223c = i8;
        this.f24224d = j7;
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ void m27392e(C6354H c6354h, InterfaceC0155d interfaceC0155d, InterfaceC0096d interfaceC0096d) {
        interfaceC0155d.mo707g(interfaceC0096d, 0, c6354h.f24221a);
        interfaceC0155d.mo707g(interfaceC0096d, 1, c6354h.f24222b);
        interfaceC0155d.mo706e(interfaceC0096d, 2, c6354h.f24223c);
        interfaceC0155d.mo708i(interfaceC0096d, 3, c6354h.f24224d);
    }

    /* JADX INFO: renamed from: a */
    public final String m27393a() {
        return this.f24222b;
    }

    /* JADX INFO: renamed from: b */
    public final String m27394b() {
        return this.f24221a;
    }

    /* JADX INFO: renamed from: c */
    public final int m27395c() {
        return this.f24223c;
    }

    /* JADX INFO: renamed from: d */
    public final long m27396d() {
        return this.f24224d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6354H)) {
            return false;
        }
        C6354H c6354h = (C6354H) obj;
        return AbstractC6118n.m27183a(this.f24221a, c6354h.f24221a) && AbstractC6118n.m27183a(this.f24222b, c6354h.f24222b) && this.f24223c == c6354h.f24223c && this.f24224d == c6354h.f24224d;
    }

    public int hashCode() {
        return (((((this.f24221a.hashCode() * 31) + this.f24222b.hashCode()) * 31) + Integer.hashCode(this.f24223c)) * 31) + Long.hashCode(this.f24224d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f24221a + ", firstSessionId=" + this.f24222b + ", sessionIndex=" + this.f24223c + ", sessionStartTimestampUs=" + this.f24224d + ')';
    }

    public C6354H(String sessionId, String firstSessionId, int i7, long j7) {
        AbstractC6118n.m27187e(sessionId, "sessionId");
        AbstractC6118n.m27187e(firstSessionId, "firstSessionId");
        this.f24221a = sessionId;
        this.f24222b = firstSessionId;
        this.f24223c = i7;
        this.f24224d = j7;
    }
}
