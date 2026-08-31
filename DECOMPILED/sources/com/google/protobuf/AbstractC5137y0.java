package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.y0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5137y0 {

    /* JADX INFO: renamed from: a */
    private static final Unsafe f19632a = m23736H();

    /* JADX INFO: renamed from: b */
    private static final Class f19633b = AbstractC5094d.m23097b();

    /* JADX INFO: renamed from: c */
    private static final boolean f19634c = m23769q(Long.TYPE);

    /* JADX INFO: renamed from: d */
    private static final boolean f19635d = m23769q(Integer.TYPE);

    /* JADX INFO: renamed from: e */
    private static final e f19636e = m23734F();

    /* JADX INFO: renamed from: f */
    private static final boolean f19637f = m23752X();

    /* JADX INFO: renamed from: g */
    private static final boolean f19638g = m23751W();

    /* JADX INFO: renamed from: h */
    static final long f19639h;

    /* JADX INFO: renamed from: i */
    private static final long f19640i;

    /* JADX INFO: renamed from: j */
    private static final long f19641j;

    /* JADX INFO: renamed from: k */
    private static final long f19642k;

    /* JADX INFO: renamed from: l */
    private static final long f19643l;

    /* JADX INFO: renamed from: m */
    private static final long f19644m;

    /* JADX INFO: renamed from: n */
    private static final long f19645n;

    /* JADX INFO: renamed from: o */
    private static final long f19646o;

    /* JADX INFO: renamed from: p */
    private static final long f19647p;

    /* JADX INFO: renamed from: q */
    private static final long f19648q;

    /* JADX INFO: renamed from: r */
    private static final long f19649r;

    /* JADX INFO: renamed from: s */
    private static final long f19650s;

    /* JADX INFO: renamed from: t */
    private static final long f19651t;

    /* JADX INFO: renamed from: u */
    private static final long f19652u;

    /* JADX INFO: renamed from: v */
    private static final int f19653v;

    /* JADX INFO: renamed from: w */
    static final boolean f19654w;

    /* JADX INFO: renamed from: com.google.protobuf.y0$a */
    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.y0$b */
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: c */
        public void mo23780c(long j7, byte[] bArr, long j8, long j9) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: d */
        public boolean mo23781d(Object obj, long j7) {
            return AbstractC5137y0.f19654w ? AbstractC5137y0.m23773u(obj, j7) : AbstractC5137y0.m23774v(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: e */
        public byte mo23782e(long j7) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: f */
        public byte mo23783f(Object obj, long j7) {
            return AbstractC5137y0.f19654w ? AbstractC5137y0.m23777y(obj, j7) : AbstractC5137y0.m23778z(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: g */
        public double mo23784g(Object obj, long j7) {
            return Double.longBitsToDouble(m23796k(obj, j7));
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: h */
        public float mo23785h(Object obj, long j7) {
            return Float.intBitsToFloat(m23795i(obj, j7));
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: j */
        public long mo23786j(long j7) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: n */
        public void mo23787n(Object obj, long j7, boolean z7) {
            if (AbstractC5137y0.f19654w) {
                AbstractC5137y0.m23741M(obj, j7, z7);
            } else {
                AbstractC5137y0.m23742N(obj, j7, z7);
            }
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: o */
        public void mo23788o(Object obj, long j7, byte b7) {
            if (AbstractC5137y0.f19654w) {
                AbstractC5137y0.m23744P(obj, j7, b7);
            } else {
                AbstractC5137y0.m23745Q(obj, j7, b7);
            }
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: p */
        public void mo23789p(Object obj, long j7, double d7) {
            m23800s(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: q */
        public void mo23790q(Object obj, long j7, float f7) {
            m23799r(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: v */
        public boolean mo23791v() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.y0$c */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: c */
        public void mo23780c(long j7, byte[] bArr, long j8, long j9) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: d */
        public boolean mo23781d(Object obj, long j7) {
            return AbstractC5137y0.f19654w ? AbstractC5137y0.m23773u(obj, j7) : AbstractC5137y0.m23774v(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: e */
        public byte mo23782e(long j7) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: f */
        public byte mo23783f(Object obj, long j7) {
            return AbstractC5137y0.f19654w ? AbstractC5137y0.m23777y(obj, j7) : AbstractC5137y0.m23778z(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: g */
        public double mo23784g(Object obj, long j7) {
            return Double.longBitsToDouble(m23796k(obj, j7));
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: h */
        public float mo23785h(Object obj, long j7) {
            return Float.intBitsToFloat(m23795i(obj, j7));
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: j */
        public long mo23786j(long j7) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: n */
        public void mo23787n(Object obj, long j7, boolean z7) {
            if (AbstractC5137y0.f19654w) {
                AbstractC5137y0.m23741M(obj, j7, z7);
            } else {
                AbstractC5137y0.m23742N(obj, j7, z7);
            }
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: o */
        public void mo23788o(Object obj, long j7, byte b7) {
            if (AbstractC5137y0.f19654w) {
                AbstractC5137y0.m23744P(obj, j7, b7);
            } else {
                AbstractC5137y0.m23745Q(obj, j7, b7);
            }
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: p */
        public void mo23789p(Object obj, long j7, double d7) {
            m23800s(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: q */
        public void mo23790q(Object obj, long j7, float f7) {
            m23799r(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: v */
        public boolean mo23791v() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.y0$d */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: c */
        public void mo23780c(long j7, byte[] bArr, long j8, long j9) {
            this.f19655a.copyMemory((Object) null, j7, bArr, AbstractC5137y0.f19639h + j8, j9);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: d */
        public boolean mo23781d(Object obj, long j7) {
            return this.f19655a.getBoolean(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: e */
        public byte mo23782e(long j7) {
            return this.f19655a.getByte(j7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: f */
        public byte mo23783f(Object obj, long j7) {
            return this.f19655a.getByte(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: g */
        public double mo23784g(Object obj, long j7) {
            return this.f19655a.getDouble(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: h */
        public float mo23785h(Object obj, long j7) {
            return this.f19655a.getFloat(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: j */
        public long mo23786j(long j7) {
            return this.f19655a.getLong(j7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: n */
        public void mo23787n(Object obj, long j7, boolean z7) {
            this.f19655a.putBoolean(obj, j7, z7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: o */
        public void mo23788o(Object obj, long j7, byte b7) {
            this.f19655a.putByte(obj, j7, b7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: p */
        public void mo23789p(Object obj, long j7, double d7) {
            this.f19655a.putDouble(obj, j7, d7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: q */
        public void mo23790q(Object obj, long j7, float f7) {
            this.f19655a.putFloat(obj, j7, f7);
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: u */
        public boolean mo23792u() {
            if (!super.mo23792u()) {
                return false;
            }
            try {
                Class<?> cls = this.f19655a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                AbstractC5137y0.m23739K(th);
                return false;
            }
        }

        @Override // com.google.protobuf.AbstractC5137y0.e
        /* JADX INFO: renamed from: v */
        public boolean mo23791v() {
            if (!super.mo23791v()) {
                return false;
            }
            try {
                Class<?> cls = this.f19655a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                AbstractC5137y0.m23739K(th);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.y0$e */
    private static abstract class e {

        /* JADX INFO: renamed from: a */
        Unsafe f19655a;

        e(Unsafe unsafe) {
            this.f19655a = unsafe;
        }

        /* JADX INFO: renamed from: a */
        public final int m23793a(Class cls) {
            return this.f19655a.arrayBaseOffset(cls);
        }

        /* JADX INFO: renamed from: b */
        public final int m23794b(Class cls) {
            return this.f19655a.arrayIndexScale(cls);
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo23780c(long j7, byte[] bArr, long j8, long j9);

        /* JADX INFO: renamed from: d */
        public abstract boolean mo23781d(Object obj, long j7);

        /* JADX INFO: renamed from: e */
        public abstract byte mo23782e(long j7);

        /* JADX INFO: renamed from: f */
        public abstract byte mo23783f(Object obj, long j7);

        /* JADX INFO: renamed from: g */
        public abstract double mo23784g(Object obj, long j7);

        /* JADX INFO: renamed from: h */
        public abstract float mo23785h(Object obj, long j7);

        /* JADX INFO: renamed from: i */
        public final int m23795i(Object obj, long j7) {
            return this.f19655a.getInt(obj, j7);
        }

        /* JADX INFO: renamed from: j */
        public abstract long mo23786j(long j7);

        /* JADX INFO: renamed from: k */
        public final long m23796k(Object obj, long j7) {
            return this.f19655a.getLong(obj, j7);
        }

        /* JADX INFO: renamed from: l */
        public final Object m23797l(Object obj, long j7) {
            return this.f19655a.getObject(obj, j7);
        }

        /* JADX INFO: renamed from: m */
        public final long m23798m(Field field) {
            return this.f19655a.objectFieldOffset(field);
        }

        /* JADX INFO: renamed from: n */
        public abstract void mo23787n(Object obj, long j7, boolean z7);

        /* JADX INFO: renamed from: o */
        public abstract void mo23788o(Object obj, long j7, byte b7);

        /* JADX INFO: renamed from: p */
        public abstract void mo23789p(Object obj, long j7, double d7);

        /* JADX INFO: renamed from: q */
        public abstract void mo23790q(Object obj, long j7, float f7);

        /* JADX INFO: renamed from: r */
        public final void m23799r(Object obj, long j7, int i7) {
            this.f19655a.putInt(obj, j7, i7);
        }

        /* JADX INFO: renamed from: s */
        public final void m23800s(Object obj, long j7, long j8) {
            this.f19655a.putLong(obj, j7, j8);
        }

        /* JADX INFO: renamed from: t */
        public final void m23801t(Object obj, long j7, Object obj2) {
            this.f19655a.putObject(obj, j7, obj2);
        }

        /* JADX INFO: renamed from: u */
        public boolean mo23792u() {
            Unsafe unsafe = this.f19655a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                AbstractC5137y0.m23739K(th);
                return false;
            }
        }

        /* JADX INFO: renamed from: v */
        public boolean mo23791v() {
            Unsafe unsafe = this.f19655a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return AbstractC5137y0.m23767o() != null;
            } catch (Throwable th) {
                AbstractC5137y0.m23739K(th);
                return false;
            }
        }
    }

    static {
        long jM23765m = m23765m(byte[].class);
        f19639h = jM23765m;
        f19640i = m23765m(boolean[].class);
        f19641j = m23766n(boolean[].class);
        f19642k = m23765m(int[].class);
        f19643l = m23766n(int[].class);
        f19644m = m23765m(long[].class);
        f19645n = m23766n(long[].class);
        f19646o = m23765m(float[].class);
        f19647p = m23766n(float[].class);
        f19648q = m23765m(double[].class);
        f19649r = m23766n(double[].class);
        f19650s = m23765m(Object[].class);
        f19651t = m23766n(Object[].class);
        f19652u = m23771s(m23767o());
        f19653v = (int) (jM23765m & 7);
        f19654w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: A */
    static double m23729A(Object obj, long j7) {
        return f19636e.mo23784g(obj, j7);
    }

    /* JADX INFO: renamed from: B */
    static float m23730B(Object obj, long j7) {
        return f19636e.mo23785h(obj, j7);
    }

    /* JADX INFO: renamed from: C */
    static int m23731C(Object obj, long j7) {
        return f19636e.m23795i(obj, j7);
    }

    /* JADX INFO: renamed from: D */
    static long m23732D(long j7) {
        return f19636e.mo23786j(j7);
    }

    /* JADX INFO: renamed from: E */
    static long m23733E(Object obj, long j7) {
        return f19636e.m23796k(obj, j7);
    }

    /* JADX INFO: renamed from: F */
    private static e m23734F() {
        Unsafe unsafe = f19632a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC5094d.m23098c()) {
            return new d(unsafe);
        }
        if (f19634c) {
            return new c(unsafe);
        }
        if (f19635d) {
            return new b(unsafe);
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    static Object m23735G(Object obj, long j7) {
        return f19636e.m23797l(obj, j7);
    }

    /* JADX INFO: renamed from: H */
    static Unsafe m23736H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: I */
    static boolean m23737I() {
        return f19638g;
    }

    /* JADX INFO: renamed from: J */
    static boolean m23738J() {
        return f19637f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static void m23739K(Throwable th) {
        Logger.getLogger(AbstractC5137y0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: L */
    static void m23740L(Object obj, long j7, boolean z7) {
        f19636e.mo23787n(obj, j7, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static void m23741M(Object obj, long j7, boolean z7) {
        m23744P(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static void m23742N(Object obj, long j7, boolean z7) {
        m23745Q(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: O */
    static void m23743O(byte[] bArr, long j7, byte b7) {
        f19636e.mo23788o(bArr, f19639h + j7, b7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static void m23744P(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int iM23731C = m23731C(obj, j8);
        int i7 = ((~((int) j7)) & 3) << 3;
        m23748T(obj, j8, ((255 & b7) << i7) | (iM23731C & (~(255 << i7))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static void m23745Q(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        m23748T(obj, j8, ((255 & b7) << i7) | (m23731C(obj, j8) & (~(255 << i7))));
    }

    /* JADX INFO: renamed from: R */
    static void m23746R(Object obj, long j7, double d7) {
        f19636e.mo23789p(obj, j7, d7);
    }

    /* JADX INFO: renamed from: S */
    static void m23747S(Object obj, long j7, float f7) {
        f19636e.mo23790q(obj, j7, f7);
    }

    /* JADX INFO: renamed from: T */
    static void m23748T(Object obj, long j7, int i7) {
        f19636e.m23799r(obj, j7, i7);
    }

    /* JADX INFO: renamed from: U */
    static void m23749U(Object obj, long j7, long j8) {
        f19636e.m23800s(obj, j7, j8);
    }

    /* JADX INFO: renamed from: V */
    static void m23750V(Object obj, long j7, Object obj2) {
        f19636e.m23801t(obj, j7, obj2);
    }

    /* JADX INFO: renamed from: W */
    private static boolean m23751W() {
        e eVar = f19636e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo23792u();
    }

    /* JADX INFO: renamed from: X */
    private static boolean m23752X() {
        e eVar = f19636e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo23791v();
    }

    /* JADX INFO: renamed from: k */
    static long m23763k(ByteBuffer byteBuffer) {
        return f19636e.m23796k(byteBuffer, f19652u);
    }

    /* JADX INFO: renamed from: l */
    static Object m23764l(Class cls) {
        try {
            return f19632a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    /* JADX INFO: renamed from: m */
    private static int m23765m(Class cls) {
        if (f19638g) {
            return f19636e.m23793a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    private static int m23766n(Class cls) {
        if (f19638g) {
            return f19636e.m23794b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static Field m23767o() {
        Field fieldM23770r;
        if (AbstractC5094d.m23098c() && (fieldM23770r = m23770r(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldM23770r;
        }
        Field fieldM23770r2 = m23770r(Buffer.class, "address");
        if (fieldM23770r2 == null || fieldM23770r2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM23770r2;
    }

    /* JADX INFO: renamed from: p */
    static void m23768p(long j7, byte[] bArr, long j8, long j9) {
        f19636e.mo23780c(j7, bArr, j8, j9);
    }

    /* JADX INFO: renamed from: q */
    static boolean m23769q(Class cls) {
        if (!AbstractC5094d.m23098c()) {
            return false;
        }
        try {
            Class cls2 = f19633b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    private static Field m23770r(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    private static long m23771s(Field field) {
        e eVar;
        if (field == null || (eVar = f19636e) == null) {
            return -1L;
        }
        return eVar.m23798m(field);
    }

    /* JADX INFO: renamed from: t */
    static boolean m23772t(Object obj, long j7) {
        return f19636e.mo23781d(obj, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static boolean m23773u(Object obj, long j7) {
        return m23777y(obj, j7) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static boolean m23774v(Object obj, long j7) {
        return m23778z(obj, j7) != 0;
    }

    /* JADX INFO: renamed from: w */
    static byte m23775w(long j7) {
        return f19636e.mo23782e(j7);
    }

    /* JADX INFO: renamed from: x */
    static byte m23776x(byte[] bArr, long j7) {
        return f19636e.mo23783f(bArr, f19639h + j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static byte m23777y(Object obj, long j7) {
        return (byte) ((m23731C(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static byte m23778z(Object obj, long j7) {
        return (byte) ((m23731C(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255);
    }
}
