package p216c2;

import p198a2.AbstractC2188d;
import p198a2.C2187c;
import p198a2.InterfaceC2192h;

/* JADX INFO: renamed from: c2.c */
/* JADX INFO: loaded from: classes.dex */
final class C2987c extends AbstractC2999o {

    /* JADX INFO: renamed from: a */
    private final AbstractC3000p f12376a;

    /* JADX INFO: renamed from: b */
    private final String f12377b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2188d f12378c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC2192h f12379d;

    /* JADX INFO: renamed from: e */
    private final C2187c f12380e;

    /* JADX INFO: renamed from: c2.c$b */
    static final class b extends AbstractC2999o.a {

        /* JADX INFO: renamed from: a */
        private AbstractC3000p f12381a;

        /* JADX INFO: renamed from: b */
        private String f12382b;

        /* JADX INFO: renamed from: c */
        private AbstractC2188d f12383c;

        /* JADX INFO: renamed from: d */
        private InterfaceC2192h f12384d;

        /* JADX INFO: renamed from: e */
        private C2187c f12385e;

        b() {
        }

        @Override // p216c2.AbstractC2999o.a
        /* JADX INFO: renamed from: a */
        public AbstractC2999o mo14923a() {
            String str = "";
            if (this.f12381a == null) {
                str = " transportContext";
            }
            if (this.f12382b == null) {
                str = str + " transportName";
            }
            if (this.f12383c == null) {
                str = str + " event";
            }
            if (this.f12384d == null) {
                str = str + " transformer";
            }
            if (this.f12385e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C2987c(this.f12381a, this.f12382b, this.f12383c, this.f12384d, this.f12385e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p216c2.AbstractC2999o.a
        /* JADX INFO: renamed from: b */
        AbstractC2999o.a mo14924b(C2187c c2187c) {
            if (c2187c == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f12385e = c2187c;
            return this;
        }

        @Override // p216c2.AbstractC2999o.a
        /* JADX INFO: renamed from: c */
        AbstractC2999o.a mo14925c(AbstractC2188d abstractC2188d) {
            if (abstractC2188d == null) {
                throw new NullPointerException("Null event");
            }
            this.f12383c = abstractC2188d;
            return this;
        }

        @Override // p216c2.AbstractC2999o.a
        /* JADX INFO: renamed from: d */
        AbstractC2999o.a mo14926d(InterfaceC2192h interfaceC2192h) {
            if (interfaceC2192h == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f12384d = interfaceC2192h;
            return this;
        }

        @Override // p216c2.AbstractC2999o.a
        /* JADX INFO: renamed from: e */
        public AbstractC2999o.a mo14927e(AbstractC3000p abstractC3000p) {
            if (abstractC3000p == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f12381a = abstractC3000p;
            return this;
        }

        @Override // p216c2.AbstractC2999o.a
        /* JADX INFO: renamed from: f */
        public AbstractC2999o.a mo14928f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f12382b = str;
            return this;
        }
    }

    @Override // p216c2.AbstractC2999o
    /* JADX INFO: renamed from: b */
    public C2187c mo14918b() {
        return this.f12380e;
    }

    @Override // p216c2.AbstractC2999o
    /* JADX INFO: renamed from: c */
    AbstractC2188d mo14919c() {
        return this.f12378c;
    }

    @Override // p216c2.AbstractC2999o
    /* JADX INFO: renamed from: e */
    InterfaceC2192h mo14920e() {
        return this.f12379d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2999o) {
            AbstractC2999o abstractC2999o = (AbstractC2999o) obj;
            if (this.f12376a.equals(abstractC2999o.mo14921f()) && this.f12377b.equals(abstractC2999o.mo14922g()) && this.f12378c.equals(abstractC2999o.mo14919c()) && this.f12379d.equals(abstractC2999o.mo14920e()) && this.f12380e.equals(abstractC2999o.mo14918b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p216c2.AbstractC2999o
    /* JADX INFO: renamed from: f */
    public AbstractC3000p mo14921f() {
        return this.f12376a;
    }

    @Override // p216c2.AbstractC2999o
    /* JADX INFO: renamed from: g */
    public String mo14922g() {
        return this.f12377b;
    }

    public int hashCode() {
        return ((((((((this.f12376a.hashCode() ^ 1000003) * 1000003) ^ this.f12377b.hashCode()) * 1000003) ^ this.f12378c.hashCode()) * 1000003) ^ this.f12379d.hashCode()) * 1000003) ^ this.f12380e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f12376a + ", transportName=" + this.f12377b + ", event=" + this.f12378c + ", transformer=" + this.f12379d + ", encoding=" + this.f12380e + "}";
    }

    private C2987c(AbstractC3000p abstractC3000p, String str, AbstractC2188d abstractC2188d, InterfaceC2192h interfaceC2192h, C2187c c2187c) {
        this.f12376a = abstractC3000p;
        this.f12377b = str;
        this.f12378c = abstractC2188d;
        this.f12379d = interfaceC2192h;
        this.f12380e = c2187c;
    }
}
