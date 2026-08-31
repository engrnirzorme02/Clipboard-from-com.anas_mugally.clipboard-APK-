package p196a0;

import androidx.datastore.preferences.protobuf.AbstractC2523k0;
import androidx.datastore.preferences.protobuf.AbstractC2533t;
import androidx.datastore.preferences.protobuf.C2479C;
import androidx.datastore.preferences.protobuf.C2480D;
import androidx.datastore.preferences.protobuf.InterfaceC2487K;
import androidx.datastore.preferences.protobuf.InterfaceC2494S;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: a0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2178f extends AbstractC2533t implements InterfaceC2487K {
    private static final C2178f DEFAULT_INSTANCE;
    private static volatile InterfaceC2494S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C2480D preferences_ = C2480D.m10872d();

    /* JADX INFO: renamed from: a0.f$a */
    public static final class a extends AbstractC2533t.a implements InterfaceC2487K {
        /* synthetic */ a(AbstractC2177e abstractC2177e) {
            this();
        }

        /* JADX INFO: renamed from: r */
        public a m8813r(String str, C2180h c2180h) {
            str.getClass();
            c2180h.getClass();
            m11634k();
            ((C2178f) this.f9713b).m8806Q().put(str, c2180h);
            return this;
        }

        private a() {
            super(C2178f.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: a0.f$b */
    private static final class b {

        /* JADX INFO: renamed from: a */
        static final C2479C f7045a = C2479C.m10865d(AbstractC2523k0.b.f9609v, "", AbstractC2523k0.b.f9611x, C2180h.m8831Z());
    }

    static {
        C2178f c2178f = new C2178f();
        DEFAULT_INSTANCE = c2178f;
        AbstractC2533t.m11604L(C2178f.class, c2178f);
    }

    private C2178f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public Map m8806Q() {
        return m8807S();
    }

    /* JADX INFO: renamed from: S */
    private C2480D m8807S() {
        if (!this.preferences_.m10876h()) {
            this.preferences_ = this.preferences_.m10879l();
        }
        return this.preferences_;
    }

    /* JADX INFO: renamed from: T */
    private C2480D m8808T() {
        return this.preferences_;
    }

    /* JADX INFO: renamed from: U */
    public static a m8809U() {
        return (a) DEFAULT_INSTANCE.m11622p();
    }

    /* JADX INFO: renamed from: V */
    public static C2178f m8810V(InputStream inputStream) {
        return (C2178f) AbstractC2533t.m11602J(DEFAULT_INSTANCE, inputStream);
    }

    /* JADX INFO: renamed from: R */
    public Map m8811R() {
        return Collections.unmodifiableMap(m8808T());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2533t
    /* JADX INFO: renamed from: s */
    protected final Object mo8812s(AbstractC2533t.d dVar, Object obj, Object obj2) {
        InterfaceC2494S bVar;
        AbstractC2177e abstractC2177e = null;
        switch (AbstractC2177e.f7044a[dVar.ordinal()]) {
            case 1:
                return new C2178f();
            case 2:
                return new a(abstractC2177e);
            case 3:
                return AbstractC2533t.m11601H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f7045a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2494S interfaceC2494S = PARSER;
                if (interfaceC2494S != null) {
                    return interfaceC2494S;
                }
                synchronized (C2178f.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC2533t.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
