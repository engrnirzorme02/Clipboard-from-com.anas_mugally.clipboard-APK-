package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2519i0 {

    /* JADX INFO: renamed from: a */
    private static final Unsafe f9564a = m11400A();

    /* JADX INFO: renamed from: b */
    private static final Class f9565b = AbstractC2508d.m11129b();

    /* JADX INFO: renamed from: c */
    private static final boolean f9566c = m11429m(Long.TYPE);

    /* JADX INFO: renamed from: d */
    private static final boolean f9567d = m11429m(Integer.TYPE);

    /* JADX INFO: renamed from: e */
    private static final e f9568e = m11441y();

    /* JADX INFO: renamed from: f */
    private static final boolean f9569f = m11416Q();

    /* JADX INFO: renamed from: g */
    private static final boolean f9570g = m11415P();

    /* JADX INFO: renamed from: h */
    static final long f9571h;

    /* JADX INFO: renamed from: i */
    private static final long f9572i;

    /* JADX INFO: renamed from: j */
    private static final long f9573j;

    /* JADX INFO: renamed from: k */
    private static final long f9574k;

    /* JADX INFO: renamed from: l */
    private static final long f9575l;

    /* JADX INFO: renamed from: m */
    private static final long f9576m;

    /* JADX INFO: renamed from: n */
    private static final long f9577n;

    /* JADX INFO: renamed from: o */
    private static final long f9578o;

    /* JADX INFO: renamed from: p */
    private static final long f9579p;

    /* JADX INFO: renamed from: q */
    private static final long f9580q;

    /* JADX INFO: renamed from: r */
    private static final long f9581r;

    /* JADX INFO: renamed from: s */
    private static final long f9582s;

    /* JADX INFO: renamed from: t */
    private static final long f9583t;

    /* JADX INFO: renamed from: u */
    private static final long f9584u;

    /* JADX INFO: renamed from: v */
    private static final int f9585v;

    /* JADX INFO: renamed from: w */
    static final boolean f9586w;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i0$a */
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

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i0$b */
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: c */
        public boolean mo11444c(Object obj, long j7) {
            return AbstractC2519i0.f9586w ? AbstractC2519i0.m11433q(obj, j7) : AbstractC2519i0.m11434r(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: d */
        public double mo11445d(Object obj, long j7) {
            return Double.longBitsToDouble(m11456g(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: e */
        public float mo11446e(Object obj, long j7) {
            return Float.intBitsToFloat(m11455f(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: j */
        public void mo11447j(Object obj, long j7, boolean z7) {
            if (AbstractC2519i0.f9586w) {
                AbstractC2519i0.m11405F(obj, j7, z7);
            } else {
                AbstractC2519i0.m11406G(obj, j7, z7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: k */
        public void mo11448k(Object obj, long j7, byte b7) {
            if (AbstractC2519i0.f9586w) {
                AbstractC2519i0.m11408I(obj, j7, b7);
            } else {
                AbstractC2519i0.m11409J(obj, j7, b7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: l */
        public void mo11449l(Object obj, long j7, double d7) {
            m11460o(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: m */
        public void mo11450m(Object obj, long j7, float f7) {
            m11459n(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: r */
        public boolean mo11451r() {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i0$c */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: c */
        public boolean mo11444c(Object obj, long j7) {
            return AbstractC2519i0.f9586w ? AbstractC2519i0.m11433q(obj, j7) : AbstractC2519i0.m11434r(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: d */
        public double mo11445d(Object obj, long j7) {
            return Double.longBitsToDouble(m11456g(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: e */
        public float mo11446e(Object obj, long j7) {
            return Float.intBitsToFloat(m11455f(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: j */
        public void mo11447j(Object obj, long j7, boolean z7) {
            if (AbstractC2519i0.f9586w) {
                AbstractC2519i0.m11405F(obj, j7, z7);
            } else {
                AbstractC2519i0.m11406G(obj, j7, z7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: k */
        public void mo11448k(Object obj, long j7, byte b7) {
            if (AbstractC2519i0.f9586w) {
                AbstractC2519i0.m11408I(obj, j7, b7);
            } else {
                AbstractC2519i0.m11409J(obj, j7, b7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: l */
        public void mo11449l(Object obj, long j7, double d7) {
            m11460o(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: m */
        public void mo11450m(Object obj, long j7, float f7) {
            m11459n(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: r */
        public boolean mo11451r() {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i0$d */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: c */
        public boolean mo11444c(Object obj, long j7) {
            return this.f9587a.getBoolean(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: d */
        public double mo11445d(Object obj, long j7) {
            return this.f9587a.getDouble(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: e */
        public float mo11446e(Object obj, long j7) {
            return this.f9587a.getFloat(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: j */
        public void mo11447j(Object obj, long j7, boolean z7) {
            this.f9587a.putBoolean(obj, j7, z7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: k */
        public void mo11448k(Object obj, long j7, byte b7) {
            this.f9587a.putByte(obj, j7, b7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: l */
        public void mo11449l(Object obj, long j7, double d7) {
            this.f9587a.putDouble(obj, j7, d7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: m */
        public void mo11450m(Object obj, long j7, float f7) {
            this.f9587a.putFloat(obj, j7, f7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: q */
        public boolean mo11452q() {
            if (!super.mo11452q()) {
                return false;
            }
            try {
                Class<?> cls = this.f9587a.getClass();
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
                AbstractC2519i0.m11403D(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2519i0.e
        /* JADX INFO: renamed from: r */
        public boolean mo11451r() {
            if (!super.mo11451r()) {
                return false;
            }
            try {
                Class<?> cls = this.f9587a.getClass();
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
                AbstractC2519i0.m11403D(th);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i0$e */
    private static abstract class e {

        /* JADX INFO: renamed from: a */
        Unsafe f9587a;

        e(Unsafe unsafe) {
            this.f9587a = unsafe;
        }

        /* JADX INFO: renamed from: a */
        public final int m11453a(Class cls) {
            return this.f9587a.arrayBaseOffset(cls);
        }

        /* JADX INFO: renamed from: b */
        public final int m11454b(Class cls) {
            return this.f9587a.arrayIndexScale(cls);
        }

        /* JADX INFO: renamed from: c */
        public abstract boolean mo11444c(Object obj, long j7);

        /* JADX INFO: renamed from: d */
        public abstract double mo11445d(Object obj, long j7);

        /* JADX INFO: renamed from: e */
        public abstract float mo11446e(Object obj, long j7);

        /* JADX INFO: renamed from: f */
        public final int m11455f(Object obj, long j7) {
            return this.f9587a.getInt(obj, j7);
        }

        /* JADX INFO: renamed from: g */
        public final long m11456g(Object obj, long j7) {
            return this.f9587a.getLong(obj, j7);
        }

        /* JADX INFO: renamed from: h */
        public final Object m11457h(Object obj, long j7) {
            return this.f9587a.getObject(obj, j7);
        }

        /* JADX INFO: renamed from: i */
        public final long m11458i(Field field) {
            return this.f9587a.objectFieldOffset(field);
        }

        /* JADX INFO: renamed from: j */
        public abstract void mo11447j(Object obj, long j7, boolean z7);

        /* JADX INFO: renamed from: k */
        public abstract void mo11448k(Object obj, long j7, byte b7);

        /* JADX INFO: renamed from: l */
        public abstract void mo11449l(Object obj, long j7, double d7);

        /* JADX INFO: renamed from: m */
        public abstract void mo11450m(Object obj, long j7, float f7);

        /* JADX INFO: renamed from: n */
        public final void m11459n(Object obj, long j7, int i7) {
            this.f9587a.putInt(obj, j7, i7);
        }

        /* JADX INFO: renamed from: o */
        public final void m11460o(Object obj, long j7, long j8) {
            this.f9587a.putLong(obj, j7, j8);
        }

        /* JADX INFO: renamed from: p */
        public final void m11461p(Object obj, long j7, Object obj2) {
            this.f9587a.putObject(obj, j7, obj2);
        }

        /* JADX INFO: renamed from: q */
        public boolean mo11452q() {
            Unsafe unsafe = this.f9587a;
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
                AbstractC2519i0.m11403D(th);
                return false;
            }
        }

        /* JADX INFO: renamed from: r */
        public boolean mo11451r() {
            Unsafe unsafe = this.f9587a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return AbstractC2519i0.m11428l() != null;
            } catch (Throwable th) {
                AbstractC2519i0.m11403D(th);
                return false;
            }
        }
    }

    static {
        long jM11426j = m11426j(byte[].class);
        f9571h = jM11426j;
        f9572i = m11426j(boolean[].class);
        f9573j = m11427k(boolean[].class);
        f9574k = m11426j(int[].class);
        f9575l = m11427k(int[].class);
        f9576m = m11426j(long[].class);
        f9577n = m11427k(long[].class);
        f9578o = m11426j(float[].class);
        f9579p = m11427k(float[].class);
        f9580q = m11426j(double[].class);
        f9581r = m11427k(double[].class);
        f9582s = m11426j(Object[].class);
        f9583t = m11427k(Object[].class);
        f9584u = m11431o(m11428l());
        f9585v = (int) (jM11426j & 7);
        f9586w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: A */
    static Unsafe m11400A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    static boolean m11401B() {
        return f9570g;
    }

    /* JADX INFO: renamed from: C */
    static boolean m11402C() {
        return f9569f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static void m11403D(Throwable th) {
        Logger.getLogger(AbstractC2519i0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: E */
    static void m11404E(Object obj, long j7, boolean z7) {
        f9568e.mo11447j(obj, j7, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static void m11405F(Object obj, long j7, boolean z7) {
        m11408I(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static void m11406G(Object obj, long j7, boolean z7) {
        m11409J(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: H */
    static void m11407H(byte[] bArr, long j7, byte b7) {
        f9568e.mo11448k(bArr, f9571h + j7, b7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static void m11408I(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int iM11439w = m11439w(obj, j8);
        int i7 = ((~((int) j7)) & 3) << 3;
        m11412M(obj, j8, ((255 & b7) << i7) | (iM11439w & (~(255 << i7))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static void m11409J(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        m11412M(obj, j8, ((255 & b7) << i7) | (m11439w(obj, j8) & (~(255 << i7))));
    }

    /* JADX INFO: renamed from: K */
    static void m11410K(Object obj, long j7, double d7) {
        f9568e.mo11449l(obj, j7, d7);
    }

    /* JADX INFO: renamed from: L */
    static void m11411L(Object obj, long j7, float f7) {
        f9568e.mo11450m(obj, j7, f7);
    }

    /* JADX INFO: renamed from: M */
    static void m11412M(Object obj, long j7, int i7) {
        f9568e.m11459n(obj, j7, i7);
    }

    /* JADX INFO: renamed from: N */
    static void m11413N(Object obj, long j7, long j8) {
        f9568e.m11460o(obj, j7, j8);
    }

    /* JADX INFO: renamed from: O */
    static void m11414O(Object obj, long j7, Object obj2) {
        f9568e.m11461p(obj, j7, obj2);
    }

    /* JADX INFO: renamed from: P */
    private static boolean m11415P() {
        e eVar = f9568e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo11452q();
    }

    /* JADX INFO: renamed from: Q */
    private static boolean m11416Q() {
        e eVar = f9568e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo11451r();
    }

    /* JADX INFO: renamed from: i */
    static Object m11425i(Class cls) {
        try {
            return f9564a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    /* JADX INFO: renamed from: j */
    private static int m11426j(Class cls) {
        if (f9570g) {
            return f9568e.m11453a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    private static int m11427k(Class cls) {
        if (f9570g) {
            return f9568e.m11454b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static Field m11428l() {
        Field fieldM11430n;
        if (AbstractC2508d.m11130c() && (fieldM11430n = m11430n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldM11430n;
        }
        Field fieldM11430n2 = m11430n(Buffer.class, "address");
        if (fieldM11430n2 == null || fieldM11430n2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM11430n2;
    }

    /* JADX INFO: renamed from: m */
    static boolean m11429m(Class cls) {
        if (!AbstractC2508d.m11130c()) {
            return false;
        }
        try {
            Class cls2 = f9565b;
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

    /* JADX INFO: renamed from: n */
    private static Field m11430n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    private static long m11431o(Field field) {
        e eVar;
        if (field == null || (eVar = f9568e) == null) {
            return -1L;
        }
        return eVar.m11458i(field);
    }

    /* JADX INFO: renamed from: p */
    static boolean m11432p(Object obj, long j7) {
        return f9568e.mo11444c(obj, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static boolean m11433q(Object obj, long j7) {
        return m11435s(obj, j7) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static boolean m11434r(Object obj, long j7) {
        return m11436t(obj, j7) != 0;
    }

    /* JADX INFO: renamed from: s */
    private static byte m11435s(Object obj, long j7) {
        return (byte) ((m11439w(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: t */
    private static byte m11436t(Object obj, long j7) {
        return (byte) ((m11439w(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: u */
    static double m11437u(Object obj, long j7) {
        return f9568e.mo11445d(obj, j7);
    }

    /* JADX INFO: renamed from: v */
    static float m11438v(Object obj, long j7) {
        return f9568e.mo11446e(obj, j7);
    }

    /* JADX INFO: renamed from: w */
    static int m11439w(Object obj, long j7) {
        return f9568e.m11455f(obj, j7);
    }

    /* JADX INFO: renamed from: x */
    static long m11440x(Object obj, long j7) {
        return f9568e.m11456g(obj, j7);
    }

    /* JADX INFO: renamed from: y */
    private static e m11441y() {
        Unsafe unsafe = f9564a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC2508d.m11130c()) {
            return new d(unsafe);
        }
        if (f9566c) {
            return new c(unsafe);
        }
        if (f9567d) {
            return new b(unsafe);
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    static Object m11442z(Object obj, long j7) {
        return f9568e.m11457h(obj, j7);
    }
}
