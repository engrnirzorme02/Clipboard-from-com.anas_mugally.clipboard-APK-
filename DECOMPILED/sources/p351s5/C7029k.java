package p351s5;

import com.google.protobuf.AbstractC5063B;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;
import java.util.List;

/* JADX INFO: renamed from: s5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7029k extends AbstractC5136y implements InterfaceC5083V {
    private static final C7029k DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5097e0 PARSER;
    private String document_ = "";
    private AbstractC5063B.e fieldTransforms_ = AbstractC5136y.m23683A();

    /* JADX INFO: renamed from: s5.k$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28060a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28060a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28060a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28060a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28060a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28060a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28060a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28060a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.k$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(C7029k.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: s5.k$c */
    public static final class c extends AbstractC5136y implements InterfaceC5083V {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile InterfaceC5097e0 PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private Object transformType_;
        private int transformTypeCase_ = 0;
        private String fieldPath_ = "";

        /* JADX INFO: renamed from: s5.k$c$a */
        public static final class a extends AbstractC5136y.a implements InterfaceC5083V {
            /* synthetic */ a(a aVar) {
                this();
            }

            /* JADX INFO: renamed from: A */
            public a m30758A(C7019a.b bVar) {
                m23724r();
                ((c) this.f19622b).m30750p0((C7019a) bVar.m23721o());
                return this;
            }

            /* JADX INFO: renamed from: B */
            public a m30759B(b bVar) {
                m23724r();
                ((c) this.f19622b).m30751q0(bVar);
                return this;
            }

            /* JADX INFO: renamed from: x */
            public a m30760x(C7019a.b bVar) {
                m23724r();
                ((c) this.f19622b).m30747m0((C7019a) bVar.m23721o());
                return this;
            }

            /* JADX INFO: renamed from: y */
            public a m30761y(String str) {
                m23724r();
                ((c) this.f19622b).m30748n0(str);
                return this;
            }

            /* JADX INFO: renamed from: z */
            public a m30762z(C7039u c7039u) {
                m23724r();
                ((c) this.f19622b).m30749o0(c7039u);
                return this;
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: s5.k$c$b */
        public enum b implements AbstractC5063B.a {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: e */
            private static final AbstractC5063B.b f28064e = new a();

            /* JADX INFO: renamed from: a */
            private final int f28066a;

            /* JADX INFO: renamed from: s5.k$c$b$a */
            class a implements AbstractC5063B.b {
                a() {
                }
            }

            b(int i7) {
                this.f28066a = i7;
            }

            /* JADX INFO: renamed from: d */
            public static b m30764d(int i7) {
                if (i7 == 0) {
                    return SERVER_VALUE_UNSPECIFIED;
                }
                if (i7 != 1) {
                    return null;
                }
                return REQUEST_TIME;
            }

            @Override // com.google.protobuf.AbstractC5063B.a
            /* JADX INFO: renamed from: a */
            public final int mo22846a() {
                if (this != UNRECOGNIZED) {
                    return this.f28066a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* JADX INFO: renamed from: s5.k$c$c, reason: collision with other inner class name */
        public enum EnumC7725c {
            SET_TO_SERVER_VALUE(2),
            INCREMENT(3),
            MAXIMUM(4),
            MINIMUM(5),
            APPEND_MISSING_ELEMENTS(6),
            REMOVE_ALL_FROM_ARRAY(7),
            TRANSFORMTYPE_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            private final int f28075a;

            EnumC7725c(int i7) {
                this.f28075a = i7;
            }

            /* JADX INFO: renamed from: d */
            public static EnumC7725c m30766d(int i7) {
                if (i7 == 0) {
                    return TRANSFORMTYPE_NOT_SET;
                }
                switch (i7) {
                    case 2:
                        return SET_TO_SERVER_VALUE;
                    case 3:
                        return INCREMENT;
                    case 4:
                        return MAXIMUM;
                    case 5:
                        return MINIMUM;
                    case 6:
                        return APPEND_MISSING_ELEMENTS;
                    case 7:
                        return REMOVE_ALL_FROM_ARRAY;
                    default:
                        return null;
                }
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC5136y.m23695V(c.class, cVar);
        }

        private c() {
        }

        /* JADX INFO: renamed from: l0 */
        public static a m30746l0() {
            return (a) DEFAULT_INSTANCE.m23715u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m0 */
        public void m30747m0(C7019a c7019a) {
            c7019a.getClass();
            this.transformType_ = c7019a;
            this.transformTypeCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n0 */
        public void m30748n0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o0 */
        public void m30749o0(C7039u c7039u) {
            c7039u.getClass();
            this.transformType_ = c7039u;
            this.transformTypeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p0 */
        public void m30750p0(C7019a c7019a) {
            c7019a.getClass();
            this.transformType_ = c7019a;
            this.transformTypeCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q0 */
        public void m30751q0(b bVar) {
            this.transformType_ = Integer.valueOf(bVar.mo22846a());
            this.transformTypeCase_ = 2;
        }

        /* JADX INFO: renamed from: f0 */
        public C7019a m30752f0() {
            return this.transformTypeCase_ == 6 ? (C7019a) this.transformType_ : C7019a.m30665g0();
        }

        /* JADX INFO: renamed from: g0 */
        public String m30753g0() {
            return this.fieldPath_;
        }

        /* JADX INFO: renamed from: h0 */
        public C7039u m30754h0() {
            return this.transformTypeCase_ == 3 ? (C7039u) this.transformType_ : C7039u.m31031o0();
        }

        /* JADX INFO: renamed from: i0 */
        public C7019a m30755i0() {
            return this.transformTypeCase_ == 7 ? (C7019a) this.transformType_ : C7019a.m30665g0();
        }

        /* JADX INFO: renamed from: j0 */
        public b m30756j0() {
            if (this.transformTypeCase_ != 2) {
                return b.SERVER_VALUE_UNSPECIFIED;
            }
            b bVarM30764d = b.m30764d(((Integer) this.transformType_).intValue());
            return bVarM30764d == null ? b.UNRECOGNIZED : bVarM30764d;
        }

        /* JADX INFO: renamed from: k0 */
        public EnumC7725c m30757k0() {
            return EnumC7725c.m30766d(this.transformTypeCase_);
        }

        @Override // com.google.protobuf.AbstractC5136y
        /* JADX INFO: renamed from: y */
        protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
            InterfaceC5097e0 bVar;
            a aVar = null;
            switch (a.f28060a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", C7039u.class, C7039u.class, C7039u.class, C7019a.class, C7019a.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC5097e0 interfaceC5097e0 = PARSER;
                    if (interfaceC5097e0 != null) {
                        return interfaceC5097e0;
                    }
                    synchronized (c.class) {
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

    static {
        C7029k c7029k = new C7029k();
        DEFAULT_INSTANCE = c7029k;
        AbstractC5136y.m23695V(C7029k.class, c7029k);
    }

    private C7029k() {
    }

    /* JADX INFO: renamed from: a0 */
    public static C7029k m30738a0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public List m30739b0() {
        return this.fieldTransforms_;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28060a[dVar.ordinal()]) {
            case 1:
                return new C7029k();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7029k.class) {
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
