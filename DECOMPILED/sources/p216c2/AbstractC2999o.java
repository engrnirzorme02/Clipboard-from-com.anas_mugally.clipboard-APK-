package p216c2;

import p198a2.AbstractC2188d;
import p198a2.C2187c;
import p198a2.InterfaceC2192h;

/* JADX INFO: renamed from: c2.o */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2999o {

    /* JADX INFO: renamed from: c2.o$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC2999o mo14923a();

        /* JADX INFO: renamed from: b */
        abstract a mo14924b(C2187c c2187c);

        /* JADX INFO: renamed from: c */
        abstract a mo14925c(AbstractC2188d abstractC2188d);

        /* JADX INFO: renamed from: d */
        abstract a mo14926d(InterfaceC2192h interfaceC2192h);

        /* JADX INFO: renamed from: e */
        public abstract a mo14927e(AbstractC3000p abstractC3000p);

        /* JADX INFO: renamed from: f */
        public abstract a mo14928f(String str);
    }

    AbstractC2999o() {
    }

    /* JADX INFO: renamed from: a */
    public static a m14962a() {
        return new C2987c.b();
    }

    /* JADX INFO: renamed from: b */
    public abstract C2187c mo14918b();

    /* JADX INFO: renamed from: c */
    abstract AbstractC2188d mo14919c();

    /* JADX INFO: renamed from: d */
    public byte[] m14963d() {
        return (byte[]) mo14920e().apply(mo14919c().mo8921c());
    }

    /* JADX INFO: renamed from: e */
    abstract InterfaceC2192h mo14920e();

    /* JADX INFO: renamed from: f */
    public abstract AbstractC3000p mo14921f();

    /* JADX INFO: renamed from: g */
    public abstract String mo14922g();
}
