package p301m5;

import com.google.android.gms.internal.ads.zzbbn;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p024C6.InterfaceC0154c;
import p024C6.InterfaceC0155d;
import p024C6.InterfaceC0156e;
import p024C6.InterfaceC0157f;
import p032D6.AbstractC0234o;
import p032D6.AbstractC0244y;
import p032D6.C0229j;
import p032D6.C0239t;
import p032D6.InterfaceC0225f;
import p310n6.AbstractC6506c;
import p310n6.C6504a;
import p310n6.EnumC6507d;
import p408z6.C7620f;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: m5.W */
/* JADX INFO: loaded from: classes.dex */
public final class C6368W {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a */
    private final long f24318a;

    /* JADX INFO: renamed from: b */
    private final long f24319b;

    /* JADX INFO: renamed from: c */
    private final long f24320c;

    /* JADX INFO: renamed from: m5.W$a */
    public /* synthetic */ class a implements InterfaceC0225f {

        /* JADX INFO: renamed from: a */
        public static final a f24321a;
        private static final InterfaceC0096d descriptor;

        static {
            a aVar = new a();
            f24321a = aVar;
            C0239t c0239t = new C0239t("com.google.firebase.sessions.Time", aVar, 3);
            c0239t.m1164p("ms", false);
            c0239t.m1164p("us", true);
            c0239t.m1164p("seconds", true);
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
            C0229j c0229j = C0229j.f947a;
            return new InterfaceC7616b[]{c0229j, c0229j, c0229j};
        }

        @Override // p408z6.InterfaceC7615a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final C6368W mo1109b(InterfaceC0156e decoder) {
            int i7;
            long jMo693d;
            long j7;
            long j8;
            AbstractC6118n.m27187e(decoder, "decoder");
            InterfaceC0096d interfaceC0096d = descriptor;
            InterfaceC0154c interfaceC0154cMo725a = decoder.mo725a(interfaceC0096d);
            if (interfaceC0154cMo725a.mo703p()) {
                long jMo693d2 = interfaceC0154cMo725a.mo693d(interfaceC0096d, 0);
                long jMo693d3 = interfaceC0154cMo725a.mo693d(interfaceC0096d, 1);
                jMo693d = interfaceC0154cMo725a.mo693d(interfaceC0096d, 2);
                i7 = 7;
                j7 = jMo693d2;
                j8 = jMo693d3;
            } else {
                long jMo693d4 = 0;
                boolean z7 = true;
                int i8 = 0;
                long jMo693d5 = 0;
                long jMo693d6 = 0;
                while (z7) {
                    int iMo719q = interfaceC0154cMo725a.mo719q(interfaceC0096d);
                    if (iMo719q == -1) {
                        z7 = false;
                    } else if (iMo719q == 0) {
                        jMo693d5 = interfaceC0154cMo725a.mo693d(interfaceC0096d, 0);
                        i8 |= 1;
                    } else if (iMo719q == 1) {
                        jMo693d6 = interfaceC0154cMo725a.mo693d(interfaceC0096d, 1);
                        i8 |= 2;
                    } else {
                        if (iMo719q != 2) {
                            throw new C7620f(iMo719q);
                        }
                        jMo693d4 = interfaceC0154cMo725a.mo693d(interfaceC0096d, 2);
                        i8 |= 4;
                    }
                }
                i7 = i8;
                jMo693d = jMo693d4;
                j7 = jMo693d5;
                j8 = jMo693d6;
            }
            interfaceC0154cMo725a.mo718b(interfaceC0096d);
            return new C6368W(i7, j7, j8, jMo693d, null);
        }

        @Override // p408z6.InterfaceC7619e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo1121d(InterfaceC0157f encoder, C6368W value) {
            AbstractC6118n.m27187e(encoder, "encoder");
            AbstractC6118n.m27187e(value, "value");
            InterfaceC0096d interfaceC0096d = descriptor;
            InterfaceC0155d interfaceC0155dMo730a = encoder.mo730a(interfaceC0096d);
            C6368W.m27464d(value, interfaceC0155dMo730a, interfaceC0096d);
            interfaceC0155dMo730a.mo723b(interfaceC0096d);
        }
    }

    /* JADX INFO: renamed from: m5.W$b */
    public static final class b {
        private b() {
        }

        public final InterfaceC7616b serializer() {
            return a.f24321a;
        }

        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }
    }

    public /* synthetic */ C6368W(int i7, long j7, long j8, long j9, AbstractC0244y abstractC0244y) {
        if (1 != (i7 & 1)) {
            AbstractC0234o.m1152a(i7, 1, a.f24321a.mo1120a());
        }
        this.f24318a = j7;
        this.f24319b = (i7 & 2) == 0 ? ((long) zzbbn.zzq.zzf) * j7 : j8;
        if ((i7 & 4) == 0) {
            this.f24320c = j7 / ((long) zzbbn.zzq.zzf);
        } else {
            this.f24320c = j9;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ void m27464d(C6368W c6368w, InterfaceC0155d interfaceC0155d, InterfaceC0096d interfaceC0096d) {
        interfaceC0155d.mo708i(interfaceC0096d, 0, c6368w.f24318a);
        if (interfaceC0155d.mo724j(interfaceC0096d, 1) || c6368w.f24319b != c6368w.f24318a * ((long) zzbbn.zzq.zzf)) {
            interfaceC0155d.mo708i(interfaceC0096d, 1, c6368w.f24319b);
        }
        if (!interfaceC0155d.mo724j(interfaceC0096d, 2) && c6368w.f24320c == c6368w.f24318a / ((long) zzbbn.zzq.zzf)) {
            return;
        }
        interfaceC0155d.mo708i(interfaceC0096d, 2, c6368w.f24320c);
    }

    /* JADX INFO: renamed from: a */
    public final long m27465a() {
        return this.f24320c;
    }

    /* JADX INFO: renamed from: b */
    public final long m27466b() {
        return this.f24319b;
    }

    /* JADX INFO: renamed from: c */
    public final long m27467c(C6368W time) {
        AbstractC6118n.m27187e(time, "time");
        C6504a.a aVar = C6504a.f24605b;
        return AbstractC6506c.m27724i(this.f24318a - time.f24318a, EnumC6507d.MILLISECONDS);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6368W) && this.f24318a == ((C6368W) obj).f24318a;
    }

    public int hashCode() {
        return Long.hashCode(this.f24318a);
    }

    public String toString() {
        return "Time(ms=" + this.f24318a + ')';
    }

    public C6368W(long j7) {
        this.f24318a = j7;
        long j8 = zzbbn.zzq.zzf;
        this.f24319b = j7 * j8;
        this.f24320c = j7 / j8;
    }
}
