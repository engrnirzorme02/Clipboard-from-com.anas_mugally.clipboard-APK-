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
import p032D6.C0239t;
import p032D6.C0245z;
import p032D6.InterfaceC0225f;
import p408z6.C7620f;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: m5.v */
/* JADX INFO: loaded from: classes.dex */
public final class C6394v {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a */
    private final int f24421a;

    /* JADX INFO: renamed from: b */
    private final String f24422b;

    /* JADX INFO: renamed from: m5.v$a */
    public /* synthetic */ class a implements InterfaceC0225f {

        /* JADX INFO: renamed from: a */
        public static final a f24423a;
        private static final InterfaceC0096d descriptor;

        static {
            a aVar = new a();
            f24423a = aVar;
            C0239t c0239t = new C0239t("com.google.firebase.sessions.ProcessData", aVar, 2);
            c0239t.m1164p("pid", false);
            c0239t.m1164p("uuid", false);
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
            return new InterfaceC7616b[]{C0226g.f944a, C0245z.f980a};
        }

        @Override // p408z6.InterfaceC7615a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final C6394v mo1109b(InterfaceC0156e decoder) {
            int iMo694e;
            String strMo702o;
            int i7;
            AbstractC6118n.m27187e(decoder, "decoder");
            InterfaceC0096d interfaceC0096d = descriptor;
            InterfaceC0154c interfaceC0154cMo725a = decoder.mo725a(interfaceC0096d);
            AbstractC0244y abstractC0244y = null;
            if (interfaceC0154cMo725a.mo703p()) {
                iMo694e = interfaceC0154cMo725a.mo694e(interfaceC0096d, 0);
                strMo702o = interfaceC0154cMo725a.mo702o(interfaceC0096d, 1);
                i7 = 3;
            } else {
                boolean z7 = true;
                iMo694e = 0;
                int i8 = 0;
                String strMo702o2 = null;
                while (z7) {
                    int iMo719q = interfaceC0154cMo725a.mo719q(interfaceC0096d);
                    if (iMo719q == -1) {
                        z7 = false;
                    } else if (iMo719q == 0) {
                        iMo694e = interfaceC0154cMo725a.mo694e(interfaceC0096d, 0);
                        i8 |= 1;
                    } else {
                        if (iMo719q != 1) {
                            throw new C7620f(iMo719q);
                        }
                        strMo702o2 = interfaceC0154cMo725a.mo702o(interfaceC0096d, 1);
                        i8 |= 2;
                    }
                }
                strMo702o = strMo702o2;
                i7 = i8;
            }
            interfaceC0154cMo725a.mo718b(interfaceC0096d);
            return new C6394v(i7, iMo694e, strMo702o, abstractC0244y);
        }

        @Override // p408z6.InterfaceC7619e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo1121d(InterfaceC0157f encoder, C6394v value) {
            AbstractC6118n.m27187e(encoder, "encoder");
            AbstractC6118n.m27187e(value, "value");
            InterfaceC0096d interfaceC0096d = descriptor;
            InterfaceC0155d interfaceC0155dMo730a = encoder.mo730a(interfaceC0096d);
            C6394v.m27510c(value, interfaceC0155dMo730a, interfaceC0096d);
            interfaceC0155dMo730a.mo723b(interfaceC0096d);
        }
    }

    /* JADX INFO: renamed from: m5.v$b */
    public static final class b {
        private b() {
        }

        public final InterfaceC7616b serializer() {
            return a.f24423a;
        }

        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }
    }

    public /* synthetic */ C6394v(int i7, int i8, String str, AbstractC0244y abstractC0244y) {
        if (3 != (i7 & 3)) {
            AbstractC0234o.m1152a(i7, 3, a.f24423a.mo1120a());
        }
        this.f24421a = i8;
        this.f24422b = str;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ void m27510c(C6394v c6394v, InterfaceC0155d interfaceC0155d, InterfaceC0096d interfaceC0096d) {
        interfaceC0155d.mo706e(interfaceC0096d, 0, c6394v.f24421a);
        interfaceC0155d.mo707g(interfaceC0096d, 1, c6394v.f24422b);
    }

    /* JADX INFO: renamed from: a */
    public final int m27511a() {
        return this.f24421a;
    }

    /* JADX INFO: renamed from: b */
    public final String m27512b() {
        return this.f24422b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6394v)) {
            return false;
        }
        C6394v c6394v = (C6394v) obj;
        return this.f24421a == c6394v.f24421a && AbstractC6118n.m27183a(this.f24422b, c6394v.f24422b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f24421a) * 31) + this.f24422b.hashCode();
    }

    public String toString() {
        return "ProcessData(pid=" + this.f24421a + ", uuid=" + this.f24422b + ')';
    }

    public C6394v(int i7, String uuid) {
        AbstractC6118n.m27187e(uuid, "uuid");
        this.f24421a = i7;
        this.f24422b = uuid;
    }
}
