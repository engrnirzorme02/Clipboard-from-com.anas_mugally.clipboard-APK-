package p351s5;

import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;

/* JADX INFO: renamed from: s5.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7033o extends AbstractC5136y implements InterfaceC5083V {
    private static final C7033o DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    /* JADX INFO: renamed from: s5.o$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28081a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28081a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28081a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28081a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28081a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28081a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28081a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28081a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.o$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(C7033o.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: s5.o$c */
    public enum c {
        TARGET_CHANGE(2),
        DOCUMENT_CHANGE(3),
        DOCUMENT_DELETE(4),
        DOCUMENT_REMOVE(6),
        FILTER(5),
        RESPONSETYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        private final int f28089a;

        c(int i7) {
            this.f28089a = i7;
        }

        /* JADX INFO: renamed from: d */
        public static c m30802d(int i7) {
            if (i7 == 0) {
                return RESPONSETYPE_NOT_SET;
            }
            if (i7 == 2) {
                return TARGET_CHANGE;
            }
            if (i7 == 3) {
                return DOCUMENT_CHANGE;
            }
            if (i7 == 4) {
                return DOCUMENT_DELETE;
            }
            if (i7 == 5) {
                return FILTER;
            }
            if (i7 != 6) {
                return null;
            }
            return DOCUMENT_REMOVE;
        }
    }

    static {
        C7033o c7033o = new C7033o();
        DEFAULT_INSTANCE = c7033o;
        AbstractC5136y.m23695V(C7033o.class, c7033o);
    }

    private C7033o() {
    }

    /* JADX INFO: renamed from: a0 */
    public static C7033o m30794a0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public C7025g m30795b0() {
        return this.responseTypeCase_ == 3 ? (C7025g) this.responseType_ : C7025g.m30715a0();
    }

    /* JADX INFO: renamed from: c0 */
    public C7026h m30796c0() {
        return this.responseTypeCase_ == 4 ? (C7026h) this.responseType_ : C7026h.m30720a0();
    }

    /* JADX INFO: renamed from: d0 */
    public C7028j m30797d0() {
        return this.responseTypeCase_ == 6 ? (C7028j) this.responseType_ : C7028j.m30734a0();
    }

    /* JADX INFO: renamed from: e0 */
    public C7030l m30798e0() {
        return this.responseTypeCase_ == 5 ? (C7030l) this.responseType_ : C7030l.m30768b0();
    }

    /* JADX INFO: renamed from: f0 */
    public c m30799f0() {
        return c.m30802d(this.responseTypeCase_);
    }

    /* JADX INFO: renamed from: g0 */
    public C7038t m30800g0() {
        return this.responseTypeCase_ == 2 ? (C7038t) this.responseType_ : C7038t.m31000b0();
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28081a[dVar.ordinal()]) {
            case 1:
                return new C7033o();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", C7038t.class, C7025g.class, C7026h.class, C7030l.class, C7028j.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7033o.class) {
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
