package p196a0;

import androidx.datastore.preferences.protobuf.AbstractC2512f;
import androidx.datastore.preferences.protobuf.AbstractC2533t;
import androidx.datastore.preferences.protobuf.InterfaceC2487K;
import androidx.datastore.preferences.protobuf.InterfaceC2494S;

/* JADX INFO: renamed from: a0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2180h extends AbstractC2533t implements InterfaceC2487K {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C2180h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC2494S PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    /* JADX INFO: renamed from: a0.h$a */
    public static final class a extends AbstractC2533t.a implements InterfaceC2487K {
        /* synthetic */ a(AbstractC2177e abstractC2177e) {
            this();
        }

        /* JADX INFO: renamed from: r */
        public a m8850r(boolean z7) {
            m11634k();
            ((C2180h) this.f9713b).m8833i0(z7);
            return this;
        }

        /* JADX INFO: renamed from: s */
        public a m8851s(AbstractC2512f abstractC2512f) {
            m11634k();
            ((C2180h) this.f9713b).m8834j0(abstractC2512f);
            return this;
        }

        /* JADX INFO: renamed from: t */
        public a m8852t(double d7) {
            m11634k();
            ((C2180h) this.f9713b).m8835k0(d7);
            return this;
        }

        /* JADX INFO: renamed from: u */
        public a m8853u(float f7) {
            m11634k();
            ((C2180h) this.f9713b).m8836l0(f7);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public a m8854v(int i7) {
            m11634k();
            ((C2180h) this.f9713b).m8837m0(i7);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public a m8855w(long j7) {
            m11634k();
            ((C2180h) this.f9713b).m8838n0(j7);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public a m8856x(String str) {
            m11634k();
            ((C2180h) this.f9713b).m8839o0(str);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public a m8857y(C2179g.a aVar) {
            m11634k();
            ((C2180h) this.f9713b).m8840p0((C2179g) aVar.m11631h());
            return this;
        }

        private a() {
            super(C2180h.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: a0.h$b */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        private final int f7056a;

        b(int i7) {
            this.f7056a = i7;
        }

        /* JADX INFO: renamed from: d */
        public static b m8859d(int i7) {
            switch (i7) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        C2180h c2180h = new C2180h();
        DEFAULT_INSTANCE = c2180h;
        AbstractC2533t.m11604L(C2180h.class, c2180h);
    }

    private C2180h() {
    }

    /* JADX INFO: renamed from: Z */
    public static C2180h m8831Z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: h0 */
    public static a m8832h0() {
        return (a) DEFAULT_INSTANCE.m11622p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public void m8833i0(boolean z7) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public void m8834j0(AbstractC2512f abstractC2512f) {
        abstractC2512f.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC2512f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public void m8835k0(double d7) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public void m8836l0(float f7) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public void m8837m0(int i7) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public void m8838n0(long j7) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public void m8839o0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public void m8840p0(C2179g c2179g) {
        c2179g.getClass();
        this.value_ = c2179g;
        this.valueCase_ = 6;
    }

    /* JADX INFO: renamed from: X */
    public boolean m8841X() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public AbstractC2512f m8842Y() {
        return this.valueCase_ == 8 ? (AbstractC2512f) this.value_ : AbstractC2512f.f9510b;
    }

    /* JADX INFO: renamed from: a0 */
    public double m8843a0() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: b0 */
    public float m8844b0() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c0 */
    public int m8845c0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public long m8846d0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e0 */
    public String m8847e0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: f0 */
    public C2179g m8848f0() {
        return this.valueCase_ == 6 ? (C2179g) this.value_ : C2179g.m8818S();
    }

    /* JADX INFO: renamed from: g0 */
    public b m8849g0() {
        return b.m8859d(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2533t
    /* JADX INFO: renamed from: s */
    protected final Object mo8812s(AbstractC2533t.d dVar, Object obj, Object obj2) {
        InterfaceC2494S bVar;
        AbstractC2177e abstractC2177e = null;
        switch (AbstractC2177e.f7044a[dVar.ordinal()]) {
            case 1:
                return new C2180h();
            case 2:
                return new a(abstractC2177e);
            case 3:
                return AbstractC2533t.m11601H(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C2179g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2494S interfaceC2494S = PARSER;
                if (interfaceC2494S != null) {
                    return interfaceC2494S;
                }
                synchronized (C2180h.class) {
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
