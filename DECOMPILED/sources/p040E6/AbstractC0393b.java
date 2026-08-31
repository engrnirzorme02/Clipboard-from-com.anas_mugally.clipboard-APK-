package p040E6;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p048F6.AbstractC0435A;
import p048F6.AbstractC0460u;
import p048F6.C0450k;
import p048F6.C0461v;
import p048F6.C0463x;
import p048F6.C0465z;
import p048F6.EnumC0438D;
import p056G6.AbstractC0488b;
import p056G6.AbstractC0489c;
import p408z6.InterfaceC7615a;
import p408z6.InterfaceC7619e;

/* JADX INFO: renamed from: E6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0393b {

    /* JADX INFO: renamed from: d */
    public static final a f1594d = new a(null);

    /* JADX INFO: renamed from: a */
    private final C0395d f1595a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0488b f1596b;

    /* JADX INFO: renamed from: c */
    private final C0450k f1597c;

    /* JADX INFO: renamed from: E6.b$a */
    public static final class a extends AbstractC0393b {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
            super(new C0395d(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), AbstractC0489c.m2089a(), null);
        }
    }

    public /* synthetic */ AbstractC0393b(C0395d c0395d, AbstractC0488b abstractC0488b, AbstractC6112h abstractC6112h) {
        this(c0395d, abstractC0488b);
    }

    /* JADX INFO: renamed from: a */
    public final Object m1671a(InterfaceC7615a deserializer, String string) {
        AbstractC6118n.m27187e(deserializer, "deserializer");
        AbstractC6118n.m27187e(string, "string");
        C0465z c0465zM1871a = AbstractC0435A.m1871a(this, string);
        Object objMo696g = new C0463x(this, EnumC0438D.OBJ, c0465zM1871a, deserializer.mo1120a(), null).mo696g(deserializer);
        c0465zM1871a.m1915t();
        return objMo696g;
    }

    /* JADX INFO: renamed from: b */
    public final String m1672b(InterfaceC7619e serializer, Object obj) {
        AbstractC6118n.m27187e(serializer, "serializer");
        C0461v c0461v = new C0461v();
        try {
            AbstractC0460u.m1988a(this, c0461v, serializer, obj);
            return c0461v.toString();
        } finally {
            c0461v.m1992h();
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0395d m1673c() {
        return this.f1595a;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC0488b m1674d() {
        return this.f1596b;
    }

    /* JADX INFO: renamed from: e */
    public final C0450k m1675e() {
        return this.f1597c;
    }

    private AbstractC0393b(C0395d c0395d, AbstractC0488b abstractC0488b) {
        this.f1595a = c0395d;
        this.f1596b = abstractC0488b;
        this.f1597c = new C0450k();
    }
}
