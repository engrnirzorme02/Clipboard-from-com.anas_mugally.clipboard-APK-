package p351s5;

import com.google.protobuf.AbstractC5063B;
import com.google.protobuf.AbstractC5104i;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5125s0;
import com.google.protobuf.C5138z;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;

/* JADX INFO: renamed from: s5.s */
/* JADX INFO: loaded from: classes.dex */
public final class C7037s extends AbstractC5136y implements InterfaceC5083V {
    private static final C7037s DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private C5138z expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    /* JADX INFO: renamed from: s5.s$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28143a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28143a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28143a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28143a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28143a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28143a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28143a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28143a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.s$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public b m30973A(C5125s0 c5125s0) {
            m23724r();
            ((C7037s) this.f19622b).m30970k0(c5125s0);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public b m30974B(AbstractC5104i abstractC5104i) {
            m23724r();
            ((C7037s) this.f19622b).m30971l0(abstractC5104i);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public b m30975C(int i7) {
            m23724r();
            ((C7037s) this.f19622b).m30972m0(i7);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public b m30976x(c cVar) {
            m23724r();
            ((C7037s) this.f19622b).m30967h0(cVar);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m30977y(C5138z.b bVar) {
            m23724r();
            ((C7037s) this.f19622b).m30968i0((C5138z) bVar.m23721o());
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m30978z(d dVar) {
            m23724r();
            ((C7037s) this.f19622b).m30969j0(dVar);
            return this;
        }

        private b() {
            super(C7037s.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: s5.s$c */
    public static final class c extends AbstractC5136y implements InterfaceC5083V {
        private static final c DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile InterfaceC5097e0 PARSER;
        private AbstractC5063B.e documents_ = AbstractC5136y.m23683A();

        /* JADX INFO: renamed from: s5.s$c$a */
        public static final class a extends AbstractC5136y.a implements InterfaceC5083V {
            /* synthetic */ a(a aVar) {
                this();
            }

            /* JADX INFO: renamed from: x */
            public a m30987x(String str) {
                m23724r();
                ((c) this.f19622b).m30981b0(str);
                return this;
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC5136y.m23695V(c.class, cVar);
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b0 */
        public void m30981b0(String str) {
            str.getClass();
            m30982c0();
            this.documents_.add(str);
        }

        /* JADX INFO: renamed from: c0 */
        private void m30982c0() {
            AbstractC5063B.e eVar = this.documents_;
            if (eVar.mo22849h()) {
                return;
            }
            this.documents_ = AbstractC5136y.m23687L(eVar);
        }

        /* JADX INFO: renamed from: d0 */
        public static c m30983d0() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: g0 */
        public static a m30984g0() {
            return (a) DEFAULT_INSTANCE.m23715u();
        }

        /* JADX INFO: renamed from: e0 */
        public String m30985e0(int i7) {
            return (String) this.documents_.get(i7);
        }

        /* JADX INFO: renamed from: f0 */
        public int m30986f0() {
            return this.documents_.size();
        }

        @Override // com.google.protobuf.AbstractC5136y
        /* JADX INFO: renamed from: y */
        protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
            InterfaceC5097e0 bVar;
            a aVar = null;
            switch (a.f28143a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
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

    /* JADX INFO: renamed from: s5.s$d */
    public static final class d extends AbstractC5136y implements InterfaceC5083V {
        private static final d DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile InterfaceC5097e0 PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = "";

        /* JADX INFO: renamed from: s5.s$d$a */
        public static final class a extends AbstractC5136y.a implements InterfaceC5083V {
            /* synthetic */ a(a aVar) {
                this();
            }

            /* JADX INFO: renamed from: x */
            public a m30997x(String str) {
                m23724r();
                ((d) this.f19622b).m30993g0(str);
                return this;
            }

            /* JADX INFO: renamed from: y */
            public a m30998y(C7036r.b bVar) {
                m23724r();
                ((d) this.f19622b).m30994h0((C7036r) bVar.m23721o());
                return this;
            }

            private a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            AbstractC5136y.m23695V(d.class, dVar);
        }

        private d() {
        }

        /* JADX INFO: renamed from: c0 */
        public static d m30991c0() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: f0 */
        public static a m30992f0() {
            return (a) DEFAULT_INSTANCE.m23715u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g0 */
        public void m30993g0(String str) {
            str.getClass();
            this.parent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h0 */
        public void m30994h0(C7036r c7036r) {
            c7036r.getClass();
            this.queryType_ = c7036r;
            this.queryTypeCase_ = 2;
        }

        /* JADX INFO: renamed from: d0 */
        public String m30995d0() {
            return this.parent_;
        }

        /* JADX INFO: renamed from: e0 */
        public C7036r m30996e0() {
            return this.queryTypeCase_ == 2 ? (C7036r) this.queryType_ : C7036r.m30845k0();
        }

        @Override // com.google.protobuf.AbstractC5136y
        /* JADX INFO: renamed from: y */
        protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
            InterfaceC5097e0 bVar;
            a aVar = null;
            switch (a.f28143a[dVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", C7036r.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC5097e0 interfaceC5097e0 = PARSER;
                    if (interfaceC5097e0 != null) {
                        return interfaceC5097e0;
                    }
                    synchronized (d.class) {
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
        C7037s c7037s = new C7037s();
        DEFAULT_INSTANCE = c7037s;
        AbstractC5136y.m23695V(C7037s.class, c7037s);
    }

    private C7037s() {
    }

    /* JADX INFO: renamed from: g0 */
    public static b m30966g0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public void m30967h0(c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public void m30968i0(C5138z c5138z) {
        c5138z.getClass();
        this.expectedCount_ = c5138z;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public void m30969j0(d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public void m30970k0(C5125s0 c5125s0) {
        c5125s0.getClass();
        this.resumeType_ = c5125s0;
        this.resumeTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public void m30971l0(AbstractC5104i abstractC5104i) {
        abstractC5104i.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = abstractC5104i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public void m30972m0(int i7) {
        this.targetId_ = i7;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28143a[dVar.ordinal()]) {
            case 1:
                return new C7037s();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0001\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", d.class, c.class, "targetId_", "once_", C5125s0.class, "expectedCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7037s.class) {
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
