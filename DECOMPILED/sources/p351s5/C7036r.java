package p351s5;

import com.google.protobuf.AbstractC5063B;
import com.google.protobuf.AbstractC5088a;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5138z;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;
import java.util.List;

/* JADX INFO: renamed from: s5.r */
/* JADX INFO: loaded from: classes.dex */
public final class C7036r extends AbstractC5136y implements InterfaceC5083V {
    private static final C7036r DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private C7023e endAt_;
    private C5138z limit_;
    private int offset_;
    private j select_;
    private C7023e startAt_;
    private h where_;
    private AbstractC5063B.e from_ = AbstractC5136y.m23683A();
    private AbstractC5063B.e orderBy_ = AbstractC5136y.m23683A();

    /* JADX INFO: renamed from: s5.r$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28098a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28098a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28098a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28098a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28098a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28098a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28098a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28098a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.r$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public b m30861A(C5138z.b bVar) {
            m23724r();
            ((C7036r) this.f19622b).m30848z0((C5138z) bVar.m23721o());
            return this;
        }

        /* JADX INFO: renamed from: B */
        public b m30862B(C7023e.b bVar) {
            m23724r();
            ((C7036r) this.f19622b).m30832A0((C7023e) bVar.m23721o());
            return this;
        }

        /* JADX INFO: renamed from: C */
        public b m30863C(h hVar) {
            m23724r();
            ((C7036r) this.f19622b).m30833B0(hVar);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public b m30864x(c.a aVar) {
            m23724r();
            ((C7036r) this.f19622b).m30841g0((c) aVar.m23721o());
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m30865y(i iVar) {
            m23724r();
            ((C7036r) this.f19622b).m30842h0(iVar);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m30866z(C7023e.b bVar) {
            m23724r();
            ((C7036r) this.f19622b).m30847y0((C7023e) bVar.m23721o());
            return this;
        }

        private b() {
            super(C7036r.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: s5.r$c */
    public static final class c extends AbstractC5136y implements InterfaceC5083V {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final c DEFAULT_INSTANCE;
        private static volatile InterfaceC5097e0 PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        /* JADX INFO: renamed from: s5.r$c$a */
        public static final class a extends AbstractC5136y.a implements InterfaceC5083V {
            /* synthetic */ a(a aVar) {
                this();
            }

            /* JADX INFO: renamed from: x */
            public a m30875x(boolean z7) {
                m23724r();
                ((c) this.f19622b).m30871f0(z7);
                return this;
            }

            /* JADX INFO: renamed from: y */
            public a m30876y(String str) {
                m23724r();
                ((c) this.f19622b).m30872g0(str);
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

        /* JADX INFO: renamed from: e0 */
        public static a m30870e0() {
            return (a) DEFAULT_INSTANCE.m23715u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f0 */
        public void m30871f0(boolean z7) {
            this.allDescendants_ = z7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g0 */
        public void m30872g0(String str) {
            str.getClass();
            this.collectionId_ = str;
        }

        /* JADX INFO: renamed from: c0 */
        public boolean m30873c0() {
            return this.allDescendants_;
        }

        /* JADX INFO: renamed from: d0 */
        public String m30874d0() {
            return this.collectionId_;
        }

        @Override // com.google.protobuf.AbstractC5136y
        /* JADX INFO: renamed from: y */
        protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
            InterfaceC5097e0 bVar;
            a aVar = null;
            switch (a.f28098a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
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

    /* JADX INFO: renamed from: s5.r$d */
    public static final class d extends AbstractC5136y implements InterfaceC5083V {
        private static final d DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile InterfaceC5097e0 PARSER;
        private AbstractC5063B.e filters_ = AbstractC5136y.m23683A();
        private int op_;

        /* JADX INFO: renamed from: s5.r$d$a */
        public static final class a extends AbstractC5136y.a implements InterfaceC5083V {
            /* synthetic */ a(a aVar) {
                this();
            }

            /* JADX INFO: renamed from: x */
            public a m30887x(Iterable iterable) {
                m23724r();
                ((d) this.f19622b).m30880c0(iterable);
                return this;
            }

            /* JADX INFO: renamed from: y */
            public a m30888y(b bVar) {
                m23724r();
                ((d) this.f19622b).m30884i0(bVar);
                return this;
            }

            private a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: s5.r$d$b */
        public enum b implements AbstractC5063B.a {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            OR(2),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: f */
            private static final AbstractC5063B.b f28103f = new a();

            /* JADX INFO: renamed from: a */
            private final int f28105a;

            /* JADX INFO: renamed from: s5.r$d$b$a */
            class a implements AbstractC5063B.b {
                a() {
                }
            }

            b(int i7) {
                this.f28105a = i7;
            }

            /* JADX INFO: renamed from: d */
            public static b m30890d(int i7) {
                if (i7 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i7 == 1) {
                    return AND;
                }
                if (i7 != 2) {
                    return null;
                }
                return OR;
            }

            @Override // com.google.protobuf.AbstractC5063B.a
            /* JADX INFO: renamed from: a */
            public final int mo22846a() {
                if (this != UNRECOGNIZED) {
                    return this.f28105a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            AbstractC5136y.m23695V(d.class, dVar);
        }

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c0 */
        public void m30880c0(Iterable iterable) {
            m30881d0();
            AbstractC5088a.m23068j(iterable, this.filters_);
        }

        /* JADX INFO: renamed from: d0 */
        private void m30881d0() {
            AbstractC5063B.e eVar = this.filters_;
            if (eVar.mo22849h()) {
                return;
            }
            this.filters_ = AbstractC5136y.m23687L(eVar);
        }

        /* JADX INFO: renamed from: e0 */
        public static d m30882e0() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: h0 */
        public static a m30883h0() {
            return (a) DEFAULT_INSTANCE.m23715u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i0 */
        public void m30884i0(b bVar) {
            this.op_ = bVar.mo22846a();
        }

        /* JADX INFO: renamed from: f0 */
        public List m30885f0() {
            return this.filters_;
        }

        /* JADX INFO: renamed from: g0 */
        public b m30886g0() {
            b bVarM30890d = b.m30890d(this.op_);
            return bVarM30890d == null ? b.UNRECOGNIZED : bVarM30890d;
        }

        @Override // com.google.protobuf.AbstractC5136y
        /* JADX INFO: renamed from: y */
        protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
            InterfaceC5097e0 bVar;
            a aVar = null;
            switch (a.f28098a[dVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", h.class});
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

    /* JADX INFO: renamed from: s5.r$e */
    public enum e implements AbstractC5063B.a {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: f */
        private static final AbstractC5063B.b f28110f = new a();

        /* JADX INFO: renamed from: a */
        private final int f28112a;

        /* JADX INFO: renamed from: s5.r$e$a */
        class a implements AbstractC5063B.b {
            a() {
            }
        }

        e(int i7) {
            this.f28112a = i7;
        }

        /* JADX INFO: renamed from: d */
        public static e m30892d(int i7) {
            if (i7 == 0) {
                return DIRECTION_UNSPECIFIED;
            }
            if (i7 == 1) {
                return ASCENDING;
            }
            if (i7 != 2) {
                return null;
            }
            return DESCENDING;
        }

        @Override // com.google.protobuf.AbstractC5063B.a
        /* JADX INFO: renamed from: a */
        public final int mo22846a() {
            if (this != UNRECOGNIZED) {
                return this.f28112a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: renamed from: s5.r$f */
    public static final class f extends AbstractC5136y implements InterfaceC5083V {
        private static final f DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile InterfaceC5097e0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private g field_;
        private int op_;
        private C7039u value_;

        /* JADX INFO: renamed from: s5.r$f$a */
        public static final class a extends AbstractC5136y.a implements InterfaceC5083V {
            /* synthetic */ a(a aVar) {
                this();
            }

            /* JADX INFO: renamed from: x */
            public a m30905x(g gVar) {
                m23724r();
                ((f) this.f19622b).m30899i0(gVar);
                return this;
            }

            /* JADX INFO: renamed from: y */
            public a m30906y(b bVar) {
                m23724r();
                ((f) this.f19622b).m30900j0(bVar);
                return this;
            }

            /* JADX INFO: renamed from: z */
            public a m30907z(C7039u c7039u) {
                m23724r();
                ((f) this.f19622b).m30901k0(c7039u);
                return this;
            }

            private a() {
                super(f.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: s5.r$f$b */
        public enum b implements AbstractC5063B.a {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: y */
            private static final AbstractC5063B.b f28125y = new a();

            /* JADX INFO: renamed from: a */
            private final int f28127a;

            /* JADX INFO: renamed from: s5.r$f$b$a */
            class a implements AbstractC5063B.b {
                a() {
                }
            }

            b(int i7) {
                this.f28127a = i7;
            }

            /* JADX INFO: renamed from: d */
            public static b m30909d(int i7) {
                switch (i7) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.AbstractC5063B.a
            /* JADX INFO: renamed from: a */
            public final int mo22846a() {
                if (this != UNRECOGNIZED) {
                    return this.f28127a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            AbstractC5136y.m23695V(f.class, fVar);
        }

        private f() {
        }

        /* JADX INFO: renamed from: d0 */
        public static f m30897d0() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: h0 */
        public static a m30898h0() {
            return (a) DEFAULT_INSTANCE.m23715u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i0 */
        public void m30899i0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j0 */
        public void m30900j0(b bVar) {
            this.op_ = bVar.mo22846a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k0 */
        public void m30901k0(C7039u c7039u) {
            c7039u.getClass();
            this.value_ = c7039u;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: renamed from: e0 */
        public g m30902e0() {
            g gVar = this.field_;
            return gVar == null ? g.m30912b0() : gVar;
        }

        /* JADX INFO: renamed from: f0 */
        public b m30903f0() {
            b bVarM30909d = b.m30909d(this.op_);
            return bVarM30909d == null ? b.UNRECOGNIZED : bVarM30909d;
        }

        /* JADX INFO: renamed from: g0 */
        public C7039u m30904g0() {
            C7039u c7039u = this.value_;
            return c7039u == null ? C7039u.m31031o0() : c7039u;
        }

        @Override // com.google.protobuf.AbstractC5136y
        /* JADX INFO: renamed from: y */
        protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
            InterfaceC5097e0 bVar;
            a aVar = null;
            switch (a.f28098a[dVar.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC5097e0 interfaceC5097e0 = PARSER;
                    if (interfaceC5097e0 != null) {
                        return interfaceC5097e0;
                    }
                    synchronized (f.class) {
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

    /* JADX INFO: renamed from: s5.r$g */
    public static final class g extends AbstractC5136y implements InterfaceC5083V {
        private static final g DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile InterfaceC5097e0 PARSER;
        private String fieldPath_ = "";

        /* JADX INFO: renamed from: s5.r$g$a */
        public static final class a extends AbstractC5136y.a implements InterfaceC5083V {
            /* synthetic */ a(a aVar) {
                this();
            }

            /* JADX INFO: renamed from: x */
            public a m30916x(String str) {
                m23724r();
                ((g) this.f19622b).m30914e0(str);
                return this;
            }

            private a() {
                super(g.DEFAULT_INSTANCE);
            }
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            AbstractC5136y.m23695V(g.class, gVar);
        }

        private g() {
        }

        /* JADX INFO: renamed from: b0 */
        public static g m30912b0() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: d0 */
        public static a m30913d0() {
            return (a) DEFAULT_INSTANCE.m23715u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e0 */
        public void m30914e0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: renamed from: c0 */
        public String m30915c0() {
            return this.fieldPath_;
        }

        @Override // com.google.protobuf.AbstractC5136y
        /* JADX INFO: renamed from: y */
        protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
            InterfaceC5097e0 bVar;
            a aVar = null;
            switch (a.f28098a[dVar.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC5097e0 interfaceC5097e0 = PARSER;
                    if (interfaceC5097e0 != null) {
                        return interfaceC5097e0;
                    }
                    synchronized (g.class) {
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

    /* JADX INFO: renamed from: s5.r$h */
    public static final class h extends AbstractC5136y implements InterfaceC5083V {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final h DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile InterfaceC5097e0 PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        /* JADX INFO: renamed from: s5.r$h$a */
        public static final class a extends AbstractC5136y.a implements InterfaceC5083V {
            /* synthetic */ a(a aVar) {
                this();
            }

            /* JADX INFO: renamed from: x */
            public a m30930x(d.a aVar) {
                m23724r();
                ((h) this.f19622b).m30923j0((d) aVar.m23721o());
                return this;
            }

            /* JADX INFO: renamed from: y */
            public a m30931y(f.a aVar) {
                m23724r();
                ((h) this.f19622b).m30924k0((f) aVar.m23721o());
                return this;
            }

            /* JADX INFO: renamed from: z */
            public a m30932z(k.a aVar) {
                m23724r();
                ((h) this.f19622b).m30925l0((k) aVar.m23721o());
                return this;
            }

            private a() {
                super(h.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: s5.r$h$b */
        public enum b {
            COMPOSITE_FILTER(1),
            FIELD_FILTER(2),
            UNARY_FILTER(3),
            FILTERTYPE_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            private final int f28133a;

            b(int i7) {
                this.f28133a = i7;
            }

            /* JADX INFO: renamed from: d */
            public static b m30934d(int i7) {
                if (i7 == 0) {
                    return FILTERTYPE_NOT_SET;
                }
                if (i7 == 1) {
                    return COMPOSITE_FILTER;
                }
                if (i7 == 2) {
                    return FIELD_FILTER;
                }
                if (i7 != 3) {
                    return null;
                }
                return UNARY_FILTER;
            }
        }

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            AbstractC5136y.m23695V(h.class, hVar);
        }

        private h() {
        }

        /* JADX INFO: renamed from: e0 */
        public static h m30921e0() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: i0 */
        public static a m30922i0() {
            return (a) DEFAULT_INSTANCE.m23715u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j0 */
        public void m30923j0(d dVar) {
            dVar.getClass();
            this.filterType_ = dVar;
            this.filterTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k0 */
        public void m30924k0(f fVar) {
            fVar.getClass();
            this.filterType_ = fVar;
            this.filterTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l0 */
        public void m30925l0(k kVar) {
            kVar.getClass();
            this.filterType_ = kVar;
            this.filterTypeCase_ = 3;
        }

        /* JADX INFO: renamed from: d0 */
        public d m30926d0() {
            return this.filterTypeCase_ == 1 ? (d) this.filterType_ : d.m30882e0();
        }

        /* JADX INFO: renamed from: f0 */
        public f m30927f0() {
            return this.filterTypeCase_ == 2 ? (f) this.filterType_ : f.m30897d0();
        }

        /* JADX INFO: renamed from: g0 */
        public b m30928g0() {
            return b.m30934d(this.filterTypeCase_);
        }

        /* JADX INFO: renamed from: h0 */
        public k m30929h0() {
            return this.filterTypeCase_ == 3 ? (k) this.filterType_ : k.m30949c0();
        }

        @Override // com.google.protobuf.AbstractC5136y
        /* JADX INFO: renamed from: y */
        protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
            InterfaceC5097e0 bVar;
            a aVar = null;
            switch (a.f28098a[dVar.ordinal()]) {
                case 1:
                    return new h();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", d.class, f.class, k.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC5097e0 interfaceC5097e0 = PARSER;
                    if (interfaceC5097e0 != null) {
                        return interfaceC5097e0;
                    }
                    synchronized (h.class) {
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

    /* JADX INFO: renamed from: s5.r$i */
    public static final class i extends AbstractC5136y implements InterfaceC5083V {
        private static final i DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile InterfaceC5097e0 PARSER;
        private int bitField0_;
        private int direction_;
        private g field_;

        /* JADX INFO: renamed from: s5.r$i$a */
        public static final class a extends AbstractC5136y.a implements InterfaceC5083V {
            /* synthetic */ a(a aVar) {
                this();
            }

            /* JADX INFO: renamed from: x */
            public a m30943x(e eVar) {
                m23724r();
                ((i) this.f19622b).m30939f0(eVar);
                return this;
            }

            /* JADX INFO: renamed from: y */
            public a m30944y(g gVar) {
                m23724r();
                ((i) this.f19622b).m30940g0(gVar);
                return this;
            }

            private a() {
                super(i.DEFAULT_INSTANCE);
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            AbstractC5136y.m23695V(i.class, iVar);
        }

        private i() {
        }

        /* JADX INFO: renamed from: e0 */
        public static a m30938e0() {
            return (a) DEFAULT_INSTANCE.m23715u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f0 */
        public void m30939f0(e eVar) {
            this.direction_ = eVar.mo22846a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g0 */
        public void m30940g0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: c0 */
        public e m30941c0() {
            e eVarM30892d = e.m30892d(this.direction_);
            return eVarM30892d == null ? e.UNRECOGNIZED : eVarM30892d;
        }

        /* JADX INFO: renamed from: d0 */
        public g m30942d0() {
            g gVar = this.field_;
            return gVar == null ? g.m30912b0() : gVar;
        }

        @Override // com.google.protobuf.AbstractC5136y
        /* JADX INFO: renamed from: y */
        protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
            InterfaceC5097e0 bVar;
            a aVar = null;
            switch (a.f28098a[dVar.ordinal()]) {
                case 1:
                    return new i();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC5097e0 interfaceC5097e0 = PARSER;
                    if (interfaceC5097e0 != null) {
                        return interfaceC5097e0;
                    }
                    synchronized (i.class) {
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

    /* JADX INFO: renamed from: s5.r$j */
    public static final class j extends AbstractC5136y implements InterfaceC5083V {
        private static final j DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile InterfaceC5097e0 PARSER;
        private AbstractC5063B.e fields_ = AbstractC5136y.m23683A();

        /* JADX INFO: renamed from: s5.r$j$a */
        public static final class a extends AbstractC5136y.a implements InterfaceC5083V {
            /* synthetic */ a(a aVar) {
                this();
            }

            private a() {
                super(j.DEFAULT_INSTANCE);
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            AbstractC5136y.m23695V(j.class, jVar);
        }

        private j() {
        }

        @Override // com.google.protobuf.AbstractC5136y
        /* JADX INFO: renamed from: y */
        protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
            InterfaceC5097e0 bVar;
            a aVar = null;
            switch (a.f28098a[dVar.ordinal()]) {
                case 1:
                    return new j();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC5097e0 interfaceC5097e0 = PARSER;
                    if (interfaceC5097e0 != null) {
                        return interfaceC5097e0;
                    }
                    synchronized (j.class) {
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

    /* JADX INFO: renamed from: s5.r$k */
    public static final class k extends AbstractC5136y implements InterfaceC5083V {
        private static final k DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile InterfaceC5097e0 PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        /* JADX INFO: renamed from: s5.r$k$a */
        public static final class a extends AbstractC5136y.a implements InterfaceC5083V {
            /* synthetic */ a(a aVar) {
                this();
            }

            /* JADX INFO: renamed from: x */
            public a m30955x(g gVar) {
                m23724r();
                ((k) this.f19622b).m30951g0(gVar);
                return this;
            }

            /* JADX INFO: renamed from: y */
            public a m30956y(b bVar) {
                m23724r();
                ((k) this.f19622b).m30952h0(bVar);
                return this;
            }

            private a() {
                super(k.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: s5.r$k$b */
        public enum b implements AbstractC5063B.a {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: s */
            private static final AbstractC5063B.b f28140s = new a();

            /* JADX INFO: renamed from: a */
            private final int f28142a;

            /* JADX INFO: renamed from: s5.r$k$b$a */
            class a implements AbstractC5063B.b {
                a() {
                }
            }

            b(int i7) {
                this.f28142a = i7;
            }

            /* JADX INFO: renamed from: d */
            public static b m30958d(int i7) {
                if (i7 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i7 == 2) {
                    return IS_NAN;
                }
                if (i7 == 3) {
                    return IS_NULL;
                }
                if (i7 == 4) {
                    return IS_NOT_NAN;
                }
                if (i7 != 5) {
                    return null;
                }
                return IS_NOT_NULL;
            }

            @Override // com.google.protobuf.AbstractC5063B.a
            /* JADX INFO: renamed from: a */
            public final int mo22846a() {
                if (this != UNRECOGNIZED) {
                    return this.f28142a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            k kVar = new k();
            DEFAULT_INSTANCE = kVar;
            AbstractC5136y.m23695V(k.class, kVar);
        }

        private k() {
        }

        /* JADX INFO: renamed from: c0 */
        public static k m30949c0() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: f0 */
        public static a m30950f0() {
            return (a) DEFAULT_INSTANCE.m23715u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g0 */
        public void m30951g0(g gVar) {
            gVar.getClass();
            this.operandType_ = gVar;
            this.operandTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h0 */
        public void m30952h0(b bVar) {
            this.op_ = bVar.mo22846a();
        }

        /* JADX INFO: renamed from: d0 */
        public g m30953d0() {
            return this.operandTypeCase_ == 2 ? (g) this.operandType_ : g.m30912b0();
        }

        /* JADX INFO: renamed from: e0 */
        public b m30954e0() {
            b bVarM30958d = b.m30958d(this.op_);
            return bVarM30958d == null ? b.UNRECOGNIZED : bVarM30958d;
        }

        @Override // com.google.protobuf.AbstractC5136y
        /* JADX INFO: renamed from: y */
        protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
            InterfaceC5097e0 bVar;
            a aVar = null;
            switch (a.f28098a[dVar.ordinal()]) {
                case 1:
                    return new k();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC5097e0 interfaceC5097e0 = PARSER;
                    if (interfaceC5097e0 != null) {
                        return interfaceC5097e0;
                    }
                    synchronized (k.class) {
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
        C7036r c7036r = new C7036r();
        DEFAULT_INSTANCE = c7036r;
        AbstractC5136y.m23695V(C7036r.class, c7036r);
    }

    private C7036r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public void m30832A0(C7023e c7023e) {
        c7023e.getClass();
        this.startAt_ = c7023e;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public void m30833B0(h hVar) {
        hVar.getClass();
        this.where_ = hVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m30841g0(c cVar) {
        cVar.getClass();
        m30843i0();
        this.from_.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public void m30842h0(i iVar) {
        iVar.getClass();
        m30844j0();
        this.orderBy_.add(iVar);
    }

    /* JADX INFO: renamed from: i0 */
    private void m30843i0() {
        AbstractC5063B.e eVar = this.from_;
        if (eVar.mo22849h()) {
            return;
        }
        this.from_ = AbstractC5136y.m23687L(eVar);
    }

    /* JADX INFO: renamed from: j0 */
    private void m30844j0() {
        AbstractC5063B.e eVar = this.orderBy_;
        if (eVar.mo22849h()) {
            return;
        }
        this.orderBy_ = AbstractC5136y.m23687L(eVar);
    }

    /* JADX INFO: renamed from: k0 */
    public static C7036r m30845k0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x0 */
    public static b m30846x0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public void m30847y0(C7023e c7023e) {
        c7023e.getClass();
        this.endAt_ = c7023e;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public void m30848z0(C5138z c5138z) {
        c5138z.getClass();
        this.limit_ = c5138z;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: l0 */
    public C7023e m30849l0() {
        C7023e c7023e = this.endAt_;
        return c7023e == null ? C7023e.m30690f0() : c7023e;
    }

    /* JADX INFO: renamed from: m0 */
    public c m30850m0(int i7) {
        return (c) this.from_.get(i7);
    }

    /* JADX INFO: renamed from: n0 */
    public int m30851n0() {
        return this.from_.size();
    }

    /* JADX INFO: renamed from: o0 */
    public C5138z m30852o0() {
        C5138z c5138z = this.limit_;
        return c5138z == null ? C5138z.m23804b0() : c5138z;
    }

    /* JADX INFO: renamed from: p0 */
    public i m30853p0(int i7) {
        return (i) this.orderBy_.get(i7);
    }

    /* JADX INFO: renamed from: q0 */
    public int m30854q0() {
        return this.orderBy_.size();
    }

    /* JADX INFO: renamed from: r0 */
    public C7023e m30855r0() {
        C7023e c7023e = this.startAt_;
        return c7023e == null ? C7023e.m30690f0() : c7023e;
    }

    /* JADX INFO: renamed from: s0 */
    public h m30856s0() {
        h hVar = this.where_;
        return hVar == null ? h.m30921e0() : hVar;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m30857t0() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m30858u0() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m30859v0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m30860w0() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28098a[dVar.ordinal()]) {
            case 1:
                return new C7036r();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", c.class, "where_", "orderBy_", i.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7036r.class) {
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
