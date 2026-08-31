package p172W4;

import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;
import p351s5.C7024f;

/* JADX INFO: renamed from: W4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1866a extends AbstractC5136y implements InterfaceC5083V {
    private static final C1866a DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* JADX INFO: renamed from: W4.a$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6021a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f6021a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6021a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6021a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6021a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6021a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6021a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6021a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: W4.a$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public b m7678A(C1869d c1869d) {
            m23724r();
            ((C1866a) this.f19622b).m7671o0(c1869d);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public b m7679x(C7024f c7024f) {
            m23724r();
            ((C1866a) this.f19622b).m7668l0(c7024f);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m7680y(boolean z7) {
            m23724r();
            ((C1866a) this.f19622b).m7669m0(z7);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m7681z(C1867b c1867b) {
            m23724r();
            ((C1866a) this.f19622b).m7670n0(c1867b);
            return this;
        }

        private b() {
            super(C1866a.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: W4.a$c */
    public enum c {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        private final int f6027a;

        c(int i7) {
            this.f6027a = i7;
        }

        /* JADX INFO: renamed from: d */
        public static c m7683d(int i7) {
            if (i7 == 0) {
                return DOCUMENTTYPE_NOT_SET;
            }
            if (i7 == 1) {
                return NO_DOCUMENT;
            }
            if (i7 == 2) {
                return DOCUMENT;
            }
            if (i7 != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }
    }

    static {
        C1866a c1866a = new C1866a();
        DEFAULT_INSTANCE = c1866a;
        AbstractC5136y.m23695V(C1866a.class, c1866a);
    }

    private C1866a() {
    }

    /* JADX INFO: renamed from: j0 */
    public static b m7666j0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: renamed from: k0 */
    public static C1866a m7667k0(byte[] bArr) {
        return (C1866a) AbstractC5136y.m23691R(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public void m7668l0(C7024f c7024f) {
        c7024f.getClass();
        this.documentType_ = c7024f;
        this.documentTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public void m7669m0(boolean z7) {
        this.hasCommittedMutations_ = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public void m7670n0(C1867b c1867b) {
        c1867b.getClass();
        this.documentType_ = c1867b;
        this.documentTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public void m7671o0(C1869d c1869d) {
        c1869d.getClass();
        this.documentType_ = c1869d;
        this.documentTypeCase_ = 3;
    }

    /* JADX INFO: renamed from: e0 */
    public C7024f m7672e0() {
        return this.documentTypeCase_ == 2 ? (C7024f) this.documentType_ : C7024f.m30701d0();
    }

    /* JADX INFO: renamed from: f0 */
    public c m7673f0() {
        return c.m7683d(this.documentTypeCase_);
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m7674g0() {
        return this.hasCommittedMutations_;
    }

    /* JADX INFO: renamed from: h0 */
    public C1867b m7675h0() {
        return this.documentTypeCase_ == 1 ? (C1867b) this.documentType_ : C1867b.m7687c0();
    }

    /* JADX INFO: renamed from: i0 */
    public C1869d m7676i0() {
        return this.documentTypeCase_ == 3 ? (C1869d) this.documentType_ : C1869d.m7735c0();
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f6021a[dVar.ordinal()]) {
            case 1:
                return new C1866a();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", C1867b.class, C7024f.class, C1869d.class, "hasCommittedMutations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C1866a.class) {
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
