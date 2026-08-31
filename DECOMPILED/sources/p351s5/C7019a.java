package p351s5;

import com.google.protobuf.AbstractC5063B;
import com.google.protobuf.AbstractC5088a;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.InterfaceC5097e0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: s5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7019a extends AbstractC5136y implements InterfaceC7020b {
    private static final C7019a DEFAULT_INSTANCE;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private AbstractC5063B.e values_ = AbstractC5136y.m23683A();

    /* JADX INFO: renamed from: s5.a$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28050a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28050a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28050a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28050a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28050a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28050a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28050a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28050a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.a$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC7020b {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public int m30671A() {
            return ((C7019a) this.f19622b).m30670i0();
        }

        /* JADX INFO: renamed from: B */
        public b m30672B(int i7) {
            m23724r();
            ((C7019a) this.f19622b).m30667k0(i7);
            return this;
        }

        @Override // p351s5.InterfaceC7020b
        /* JADX INFO: renamed from: g */
        public List mo30668g() {
            return Collections.unmodifiableList(((C7019a) this.f19622b).mo30668g());
        }

        /* JADX INFO: renamed from: x */
        public b m30673x(Iterable iterable) {
            m23724r();
            ((C7019a) this.f19622b).m30662d0(iterable);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m30674y(C7039u c7039u) {
            m23724r();
            ((C7019a) this.f19622b).m30663e0(c7039u);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C7039u m30675z(int i7) {
            return ((C7019a) this.f19622b).m30669h0(i7);
        }

        private b() {
            super(C7019a.DEFAULT_INSTANCE);
        }
    }

    static {
        C7019a c7019a = new C7019a();
        DEFAULT_INSTANCE = c7019a;
        AbstractC5136y.m23695V(C7019a.class, c7019a);
    }

    private C7019a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public void m30662d0(Iterable iterable) {
        m30664f0();
        AbstractC5088a.m23068j(iterable, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public void m30663e0(C7039u c7039u) {
        c7039u.getClass();
        m30664f0();
        this.values_.add(c7039u);
    }

    /* JADX INFO: renamed from: f0 */
    private void m30664f0() {
        AbstractC5063B.e eVar = this.values_;
        if (eVar.mo22849h()) {
            return;
        }
        this.values_ = AbstractC5136y.m23687L(eVar);
    }

    /* JADX INFO: renamed from: g0 */
    public static C7019a m30665g0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: j0 */
    public static b m30666j0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public void m30667k0(int i7) {
        m30664f0();
        this.values_.remove(i7);
    }

    @Override // p351s5.InterfaceC7020b
    /* JADX INFO: renamed from: g */
    public List mo30668g() {
        return this.values_;
    }

    /* JADX INFO: renamed from: h0 */
    public C7039u m30669h0(int i7) {
        return (C7039u) this.values_.get(i7);
    }

    /* JADX INFO: renamed from: i0 */
    public int m30670i0() {
        return this.values_.size();
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28050a[dVar.ordinal()]) {
            case 1:
                return new C7019a();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", C7039u.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7019a.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC5136y.b(DEFAULT_INSTANCE);
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
