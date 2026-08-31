package p196a0;

import androidx.datastore.preferences.protobuf.AbstractC2502a;
import androidx.datastore.preferences.protobuf.AbstractC2533t;
import androidx.datastore.preferences.protobuf.AbstractC2534u;
import androidx.datastore.preferences.protobuf.InterfaceC2487K;
import androidx.datastore.preferences.protobuf.InterfaceC2494S;
import java.util.List;

/* JADX INFO: renamed from: a0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2179g extends AbstractC2533t implements InterfaceC2487K {
    private static final C2179g DEFAULT_INSTANCE;
    private static volatile InterfaceC2494S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC2534u.b strings_ = AbstractC2533t.m11607t();

    /* JADX INFO: renamed from: a0.g$a */
    public static final class a extends AbstractC2533t.a implements InterfaceC2487K {
        /* synthetic */ a(AbstractC2177e abstractC2177e) {
            this();
        }

        /* JADX INFO: renamed from: r */
        public a m8821r(Iterable iterable) {
            m11634k();
            ((C2179g) this.f9713b).m8816Q(iterable);
            return this;
        }

        private a() {
            super(C2179g.DEFAULT_INSTANCE);
        }
    }

    static {
        C2179g c2179g = new C2179g();
        DEFAULT_INSTANCE = c2179g;
        AbstractC2533t.m11604L(C2179g.class, c2179g);
    }

    private C2179g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public void m8816Q(Iterable iterable) {
        m8817R();
        AbstractC2502a.m11036e(iterable, this.strings_);
    }

    /* JADX INFO: renamed from: R */
    private void m8817R() {
        AbstractC2534u.b bVar = this.strings_;
        if (bVar.mo11127h()) {
            return;
        }
        this.strings_ = AbstractC2533t.m11600F(bVar);
    }

    /* JADX INFO: renamed from: S */
    public static C2179g m8818S() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static a m8819U() {
        return (a) DEFAULT_INSTANCE.m11622p();
    }

    /* JADX INFO: renamed from: T */
    public List m8820T() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2533t
    /* JADX INFO: renamed from: s */
    protected final Object mo8812s(AbstractC2533t.d dVar, Object obj, Object obj2) {
        InterfaceC2494S bVar;
        AbstractC2177e abstractC2177e = null;
        switch (AbstractC2177e.f7044a[dVar.ordinal()]) {
            case 1:
                return new C2179g();
            case 2:
                return new a(abstractC2177e);
            case 3:
                return AbstractC2533t.m11601H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2494S interfaceC2494S = PARSER;
                if (interfaceC2494S != null) {
                    return interfaceC2494S;
                }
                synchronized (C2179g.class) {
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
