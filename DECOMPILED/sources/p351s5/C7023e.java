package p351s5;

import com.google.protobuf.AbstractC5063B;
import com.google.protobuf.AbstractC5088a;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;
import java.util.List;

/* JADX INFO: renamed from: s5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7023e extends AbstractC5136y implements InterfaceC5083V {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final C7023e DEFAULT_INSTANCE;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private AbstractC5063B.e values_ = AbstractC5136y.m23683A();

    /* JADX INFO: renamed from: s5.e$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28053a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28053a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28053a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28053a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28053a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28053a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28053a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28053a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.e$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: x */
        public b m30695x(Iterable iterable) {
            m23724r();
            ((C7023e) this.f19622b).m30688c0(iterable);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m30696y(boolean z7) {
            m23724r();
            ((C7023e) this.f19622b).m30692h0(z7);
            return this;
        }

        private b() {
            super(C7023e.DEFAULT_INSTANCE);
        }
    }

    static {
        C7023e c7023e = new C7023e();
        DEFAULT_INSTANCE = c7023e;
        AbstractC5136y.m23695V(C7023e.class, c7023e);
    }

    private C7023e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public void m30688c0(Iterable iterable) {
        m30689d0();
        AbstractC5088a.m23068j(iterable, this.values_);
    }

    /* JADX INFO: renamed from: d0 */
    private void m30689d0() {
        AbstractC5063B.e eVar = this.values_;
        if (eVar.mo22849h()) {
            return;
        }
        this.values_ = AbstractC5136y.m23687L(eVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static C7023e m30690f0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static b m30691g0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public void m30692h0(boolean z7) {
        this.before_ = z7;
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m30693e0() {
        return this.before_;
    }

    /* JADX INFO: renamed from: g */
    public List m30694g() {
        return this.values_;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28053a[dVar.ordinal()]) {
            case 1:
                return new C7023e();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", C7039u.class, "before_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7023e.class) {
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
