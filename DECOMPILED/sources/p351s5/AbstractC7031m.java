package p351s5;

import p063H5.AbstractC0537d;
import p063H5.C0532a0;
import p063H5.C0535c;
import p110N5.AbstractC0980b;
import p117O5.AbstractC1149a;
import p117O5.AbstractC1150b;

/* JADX INFO: renamed from: s5.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7031m {

    /* JADX INFO: renamed from: a */
    private static volatile C0532a0 f28077a;

    /* JADX INFO: renamed from: b */
    private static volatile C0532a0 f28078b;

    /* JADX INFO: renamed from: s5.m$a */
    class a implements AbstractC1150b.a {
        a() {
        }

        @Override // p117O5.AbstractC1150b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo4978a(AbstractC0537d abstractC0537d, C0535c c0535c) {
            return new b(abstractC0537d, c0535c, null);
        }
    }

    /* JADX INFO: renamed from: s5.m$b */
    public static final class b extends AbstractC1149a {
        /* synthetic */ b(AbstractC0537d abstractC0537d, C0535c c0535c, a aVar) {
            this(abstractC0537d, c0535c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p117O5.AbstractC1150b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b mo4974a(AbstractC0537d abstractC0537d, C0535c c0535c) {
            return new b(abstractC0537d, c0535c);
        }

        private b(AbstractC0537d abstractC0537d, C0535c c0535c) {
            super(abstractC0537d, c0535c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0532a0 m30772a() {
        C0532a0 c0532a0M2330a;
        C0532a0 c0532a0 = f28078b;
        if (c0532a0 != null) {
            return c0532a0;
        }
        synchronized (AbstractC7031m.class) {
            try {
                c0532a0M2330a = f28078b;
                if (c0532a0M2330a == null) {
                    c0532a0M2330a = C0532a0.m2322g().m2335f(C0532a0.d.BIDI_STREAMING).m2331b(C0532a0.m2321b("google.firestore.v1.Firestore", "Listen")).m2334e(true).m2332c(AbstractC0980b.m4258b(C7032n.m30782e0())).m2333d(AbstractC0980b.m4258b(C7033o.m30794a0())).m2330a();
                    f28078b = c0532a0M2330a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0532a0M2330a;
    }

    /* JADX INFO: renamed from: b */
    public static C0532a0 m30773b() {
        C0532a0 c0532a0M2330a;
        C0532a0 c0532a0 = f28077a;
        if (c0532a0 != null) {
            return c0532a0;
        }
        synchronized (AbstractC7031m.class) {
            try {
                c0532a0M2330a = f28077a;
                if (c0532a0M2330a == null) {
                    c0532a0M2330a = C0532a0.m2322g().m2335f(C0532a0.d.BIDI_STREAMING).m2331b(C0532a0.m2321b("google.firestore.v1.Firestore", "Write")).m2334e(true).m2332c(AbstractC0980b.m4258b(C7041w.m31104f0())).m2333d(AbstractC0980b.m4258b(C7042x.m31112b0())).m2330a();
                    f28077a = c0532a0M2330a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0532a0M2330a;
    }

    /* JADX INFO: renamed from: c */
    public static b m30774c(AbstractC0537d abstractC0537d) {
        return (b) AbstractC1149a.m4972e(new a(), abstractC0537d);
    }
}
