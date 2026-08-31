package p351s5;

import com.google.protobuf.AbstractC5104i;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5125s0;
import com.google.protobuf.EnumC5095d0;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;
import p407z5.C7614a;

/* JADX INFO: renamed from: s5.u */
/* JADX INFO: loaded from: classes.dex */
public final class C7039u extends AbstractC5136y implements InterfaceC5083V {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final C7039u DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    /* JADX INFO: renamed from: s5.u$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28154a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28154a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28154a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28154a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28154a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28154a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28154a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28154a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.u$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public b m31046A(AbstractC5104i abstractC5104i) {
            m23724r();
            ((C7039u) this.f19622b).m31010B0(abstractC5104i);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public b m31047B(double d7) {
            m23724r();
            ((C7039u) this.f19622b).m31011C0(d7);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public b m31048C(C7614a.b bVar) {
            m23724r();
            ((C7039u) this.f19622b).m31012D0((C7614a) bVar.m23721o());
            return this;
        }

        /* JADX INFO: renamed from: D */
        public b m31049D(long j7) {
            m23724r();
            ((C7039u) this.f19622b).m31013E0(j7);
            return this;
        }

        /* JADX INFO: renamed from: E */
        public b m31050E(C7034p.b bVar) {
            m23724r();
            ((C7039u) this.f19622b).m31014F0((C7034p) bVar.m23721o());
            return this;
        }

        /* JADX INFO: renamed from: F */
        public b m31051F(C7034p c7034p) {
            m23724r();
            ((C7039u) this.f19622b).m31014F0(c7034p);
            return this;
        }

        /* JADX INFO: renamed from: G */
        public b m31052G(EnumC5095d0 enumC5095d0) {
            m23724r();
            ((C7039u) this.f19622b).m31015G0(enumC5095d0);
            return this;
        }

        /* JADX INFO: renamed from: H */
        public b m31053H(String str) {
            m23724r();
            ((C7039u) this.f19622b).m31016H0(str);
            return this;
        }

        /* JADX INFO: renamed from: I */
        public b m31054I(String str) {
            m23724r();
            ((C7039u) this.f19622b).m31017I0(str);
            return this;
        }

        /* JADX INFO: renamed from: J */
        public b m31055J(C5125s0.b bVar) {
            m23724r();
            ((C7039u) this.f19622b).m31018J0((C5125s0) bVar.m23721o());
            return this;
        }

        /* JADX INFO: renamed from: x */
        public b m31056x(C7019a.b bVar) {
            m23724r();
            ((C7039u) this.f19622b).m31033z0((C7019a) bVar.m23721o());
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m31057y(C7019a c7019a) {
            m23724r();
            ((C7039u) this.f19622b).m31033z0(c7019a);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m31058z(boolean z7) {
            m23724r();
            ((C7039u) this.f19622b).m31009A0(z7);
            return this;
        }

        private b() {
            super(C7039u.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: s5.u$c */
    public enum c {
        NULL_VALUE(11),
        BOOLEAN_VALUE(1),
        INTEGER_VALUE(2),
        DOUBLE_VALUE(3),
        TIMESTAMP_VALUE(10),
        STRING_VALUE(17),
        BYTES_VALUE(18),
        REFERENCE_VALUE(5),
        GEO_POINT_VALUE(8),
        ARRAY_VALUE(9),
        MAP_VALUE(6),
        VALUETYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        private final int f28168a;

        c(int i7) {
            this.f28168a = i7;
        }

        /* JADX INFO: renamed from: d */
        public static c m31060d(int i7) {
            if (i7 == 0) {
                return VALUETYPE_NOT_SET;
            }
            if (i7 == 1) {
                return BOOLEAN_VALUE;
            }
            if (i7 == 2) {
                return INTEGER_VALUE;
            }
            if (i7 == 3) {
                return DOUBLE_VALUE;
            }
            if (i7 == 5) {
                return REFERENCE_VALUE;
            }
            if (i7 == 6) {
                return MAP_VALUE;
            }
            if (i7 == 17) {
                return STRING_VALUE;
            }
            if (i7 == 18) {
                return BYTES_VALUE;
            }
            switch (i7) {
                case 8:
                    return GEO_POINT_VALUE;
                case 9:
                    return ARRAY_VALUE;
                case 10:
                    return TIMESTAMP_VALUE;
                case 11:
                    return NULL_VALUE;
                default:
                    return null;
            }
        }
    }

    static {
        C7039u c7039u = new C7039u();
        DEFAULT_INSTANCE = c7039u;
        AbstractC5136y.m23695V(C7039u.class, c7039u);
    }

    private C7039u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public void m31009A0(boolean z7) {
        this.valueTypeCase_ = 1;
        this.valueType_ = Boolean.valueOf(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public void m31010B0(AbstractC5104i abstractC5104i) {
        abstractC5104i.getClass();
        this.valueTypeCase_ = 18;
        this.valueType_ = abstractC5104i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public void m31011C0(double d7) {
        this.valueTypeCase_ = 3;
        this.valueType_ = Double.valueOf(d7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public void m31012D0(C7614a c7614a) {
        c7614a.getClass();
        this.valueType_ = c7614a;
        this.valueTypeCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public void m31013E0(long j7) {
        this.valueTypeCase_ = 2;
        this.valueType_ = Long.valueOf(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public void m31014F0(C7034p c7034p) {
        c7034p.getClass();
        this.valueType_ = c7034p;
        this.valueTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public void m31015G0(EnumC5095d0 enumC5095d0) {
        this.valueType_ = Integer.valueOf(enumC5095d0.mo22846a());
        this.valueTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public void m31016H0(String str) {
        str.getClass();
        this.valueTypeCase_ = 5;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public void m31017I0(String str) {
        str.getClass();
        this.valueTypeCase_ = 17;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public void m31018J0(C5125s0 c5125s0) {
        c5125s0.getClass();
        this.valueType_ = c5125s0;
        this.valueTypeCase_ = 10;
    }

    /* JADX INFO: renamed from: o0 */
    public static C7039u m31031o0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static b m31032y0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public void m31033z0(C7019a c7019a) {
        c7019a.getClass();
        this.valueType_ = c7019a;
        this.valueTypeCase_ = 9;
    }

    /* JADX INFO: renamed from: l0 */
    public C7019a m31034l0() {
        return this.valueTypeCase_ == 9 ? (C7019a) this.valueType_ : C7019a.m30665g0();
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m31035m0() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public AbstractC5104i m31036n0() {
        return this.valueTypeCase_ == 18 ? (AbstractC5104i) this.valueType_ : AbstractC5104i.f19401b;
    }

    /* JADX INFO: renamed from: p0 */
    public double m31037p0() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: q0 */
    public C7614a m31038q0() {
        return this.valueTypeCase_ == 8 ? (C7614a) this.valueType_ : C7614a.m33388c0();
    }

    /* JADX INFO: renamed from: r0 */
    public long m31039r0() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: s0 */
    public C7034p m31040s0() {
        return this.valueTypeCase_ == 6 ? (C7034p) this.valueType_ : C7034p.m30805b0();
    }

    /* JADX INFO: renamed from: t0 */
    public String m31041t0() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    /* JADX INFO: renamed from: u0 */
    public String m31042u0() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    /* JADX INFO: renamed from: v0 */
    public C5125s0 m31043v0() {
        return this.valueTypeCase_ == 10 ? (C5125s0) this.valueType_ : C5125s0.m23581c0();
    }

    /* JADX INFO: renamed from: w0 */
    public c m31044w0() {
        return c.m31060d(this.valueTypeCase_);
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m31045x0() {
        return this.valueTypeCase_ == 11;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28154a[dVar.ordinal()]) {
            case 1:
                return new C7039u();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", C7034p.class, C7614a.class, C7019a.class, C5125s0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7039u.class) {
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
