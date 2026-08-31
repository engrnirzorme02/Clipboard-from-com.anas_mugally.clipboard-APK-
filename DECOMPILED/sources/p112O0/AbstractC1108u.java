package p112O0;

import androidx.work.C2896b;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import p168W0.C1814p;

/* JADX INFO: renamed from: O0.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1108u {

    /* JADX INFO: renamed from: a */
    private UUID f3976a;

    /* JADX INFO: renamed from: b */
    private C1814p f3977b;

    /* JADX INFO: renamed from: c */
    private Set f3978c;

    /* JADX INFO: renamed from: O0.u$a */
    public static abstract class a {

        /* JADX INFO: renamed from: c */
        C1814p f3981c;

        /* JADX INFO: renamed from: e */
        Class f3983e;

        /* JADX INFO: renamed from: a */
        boolean f3979a = false;

        /* JADX INFO: renamed from: d */
        Set f3982d = new HashSet();

        /* JADX INFO: renamed from: b */
        UUID f3980b = UUID.randomUUID();

        a(Class cls) {
            this.f3983e = cls;
            this.f3981c = new C1814p(this.f3980b.toString(), cls.getName());
            m4870a(cls.getName());
        }

        /* JADX INFO: renamed from: a */
        public final a m4870a(String str) {
            this.f3982d.add(str);
            return mo4854d();
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC1108u m4871b() {
            AbstractC1108u abstractC1108uMo4853c = mo4853c();
            C1089b c1089b = this.f3981c.f5901j;
            boolean z7 = c1089b.m4815e() || c1089b.m4816f() || c1089b.m4817g() || c1089b.m4818h();
            if (this.f3981c.f5908q && z7) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f3980b = UUID.randomUUID();
            C1814p c1814p = new C1814p(this.f3981c);
            this.f3981c = c1814p;
            c1814p.f5892a = this.f3980b.toString();
            return abstractC1108uMo4853c;
        }

        /* JADX INFO: renamed from: c */
        abstract AbstractC1108u mo4853c();

        /* JADX INFO: renamed from: d */
        abstract a mo4854d();

        /* JADX INFO: renamed from: e */
        public final a m4872e(C1089b c1089b) {
            this.f3981c.f5901j = c1089b;
            return mo4854d();
        }

        /* JADX INFO: renamed from: f */
        public final a m4873f(C2896b c2896b) {
            this.f3981c.f5896e = c2896b;
            return mo4854d();
        }
    }

    protected AbstractC1108u(UUID uuid, C1814p c1814p, Set set) {
        this.f3976a = uuid;
        this.f3977b = c1814p;
        this.f3978c = set;
    }

    /* JADX INFO: renamed from: a */
    public String m4867a() {
        return this.f3976a.toString();
    }

    /* JADX INFO: renamed from: b */
    public Set m4868b() {
        return this.f3978c;
    }

    /* JADX INFO: renamed from: c */
    public C1814p m4869c() {
        return this.f3977b;
    }
}
