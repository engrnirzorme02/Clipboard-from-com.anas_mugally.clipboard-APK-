package p351s5;

import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5125s0;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;

/* JADX INFO: renamed from: s5.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7035q extends AbstractC5136y implements InterfaceC5083V {
    private static final C7035q DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    /* JADX INFO: renamed from: s5.q$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28092a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28092a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28092a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28092a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28092a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28092a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28092a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28092a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.q$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: x */
        public b m30828x(boolean z7) {
            m23724r();
            ((C7035q) this.f19622b).m30823h0(z7);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m30829y(C5125s0 c5125s0) {
            m23724r();
            ((C7035q) this.f19622b).m30824i0(c5125s0);
            return this;
        }

        private b() {
            super(C7035q.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: s5.q$c */
    public enum c {
        EXISTS(1),
        UPDATE_TIME(2),
        CONDITIONTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        private final int f28097a;

        c(int i7) {
            this.f28097a = i7;
        }

        /* JADX INFO: renamed from: d */
        public static c m30831d(int i7) {
            if (i7 == 0) {
                return CONDITIONTYPE_NOT_SET;
            }
            if (i7 == 1) {
                return EXISTS;
            }
            if (i7 != 2) {
                return null;
            }
            return UPDATE_TIME;
        }
    }

    static {
        C7035q c7035q = new C7035q();
        DEFAULT_INSTANCE = c7035q;
        AbstractC5136y.m23695V(C7035q.class, c7035q);
    }

    private C7035q() {
    }

    /* JADX INFO: renamed from: d0 */
    public static C7035q m30821d0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static b m30822g0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public void m30823h0(boolean z7) {
        this.conditionTypeCase_ = 1;
        this.conditionType_ = Boolean.valueOf(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public void m30824i0(C5125s0 c5125s0) {
        c5125s0.getClass();
        this.conditionType_ = c5125s0;
        this.conditionTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: c0 */
    public c m30825c0() {
        return c.m30831d(this.conditionTypeCase_);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m30826e0() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public C5125s0 m30827f0() {
        return this.conditionTypeCase_ == 2 ? (C5125s0) this.conditionType_ : C5125s0.m23581c0();
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28092a[dVar.ordinal()]) {
            case 1:
                return new C7035q();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", C5125s0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7035q.class) {
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
