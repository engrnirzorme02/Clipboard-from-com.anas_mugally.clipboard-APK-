package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.C3553a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2533t extends AbstractC2502a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC2533t> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C2515g0 unknownFields = C2515g0.m11249c();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$a */
    public static abstract class a extends AbstractC2502a.a {

        /* JADX INFO: renamed from: a */
        private final AbstractC2533t f9712a;

        /* JADX INFO: renamed from: b */
        protected AbstractC2533t f9713b;

        protected a(AbstractC2533t abstractC2533t) {
            this.f9712a = abstractC2533t;
            if (abstractC2533t.m11611C()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f9713b = m11630q();
        }

        /* JADX INFO: renamed from: p */
        private static void m11629p(Object obj, Object obj2) {
            C2496U.m10984a().m10987d(obj).mo10966a(obj, obj2);
        }

        /* JADX INFO: renamed from: q */
        private AbstractC2533t m11630q() {
            return this.f9712a.m11615I();
        }

        /* JADX INFO: renamed from: h */
        public final AbstractC2533t m11631h() {
            AbstractC2533t abstractC2533tMo10899m = mo10899m();
            if (abstractC2533tMo10899m.m11610A()) {
                return abstractC2533tMo10899m;
            }
            throw AbstractC2502a.a.m11042g(abstractC2533tMo10899m);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2486J.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public AbstractC2533t mo10899m() {
            if (!this.f9713b.m11611C()) {
                return this.f9713b;
            }
            this.f9713b.m11612D();
            return this.f9713b;
        }

        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarMo10897c = mo10900a().mo10897c();
            aVarMo10897c.f9713b = mo10899m();
            return aVarMo10897c;
        }

        /* JADX INFO: renamed from: k */
        protected final void m11634k() {
            if (this.f9713b.m11611C()) {
                return;
            }
            m11635l();
        }

        /* JADX INFO: renamed from: l */
        protected void m11635l() {
            AbstractC2533t abstractC2533tM11630q = m11630q();
            m11629p(abstractC2533tM11630q, this.f9713b);
            this.f9713b = abstractC2533tM11630q;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2487K
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public AbstractC2533t mo10900a() {
            return this.f9712a;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$b */
    protected static class b extends AbstractC2504b {

        /* JADX INFO: renamed from: b */
        private final AbstractC2533t f9714b;

        public b(AbstractC2533t abstractC2533t) {
            this.f9714b = abstractC2533t;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$c */
    public static class c extends AbstractC2522k {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: renamed from: B */
    protected static final boolean m11599B(AbstractC2533t abstractC2533t, boolean z7) {
        byte bByteValue = ((Byte) abstractC2533t.m11623q(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo10968c = C2496U.m10984a().m10987d(abstractC2533t).mo10968c(abstractC2533t);
        if (z7) {
            abstractC2533t.m11624r(d.SET_MEMOIZED_IS_INITIALIZED, zMo10968c ? abstractC2533t : null);
        }
        return zMo10968c;
    }

    /* JADX INFO: renamed from: F */
    protected static AbstractC2534u.b m11600F(AbstractC2534u.b bVar) {
        int size = bVar.size();
        return bVar.mo10992d(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: renamed from: H */
    protected static Object m11601H(InterfaceC2486J interfaceC2486J, String str, Object[] objArr) {
        return new C2498W(interfaceC2486J, str, objArr);
    }

    /* JADX INFO: renamed from: J */
    protected static AbstractC2533t m11602J(AbstractC2533t abstractC2533t, InputStream inputStream) {
        return m11605j(m11603K(abstractC2533t, AbstractC2514g.m11184g(inputStream), C2526m.m11556b()));
    }

    /* JADX INFO: renamed from: K */
    static AbstractC2533t m11603K(AbstractC2533t abstractC2533t, AbstractC2514g abstractC2514g, C2526m c2526m) throws C2535v {
        AbstractC2533t abstractC2533tM11615I = abstractC2533t.m11615I();
        try {
            InterfaceC2500Y interfaceC2500YM10987d = C2496U.m10984a().m10987d(abstractC2533tM11615I);
            interfaceC2500YM10987d.mo10973h(abstractC2533tM11615I, C2516h.m11266O(abstractC2514g), c2526m);
            interfaceC2500YM10987d.mo10967b(abstractC2533tM11615I);
            return abstractC2533tM11615I;
        } catch (C2511e0 e7) {
            throw e7.m11136a().m11657k(abstractC2533tM11615I);
        } catch (C2535v e8) {
            e = e8;
            if (e.m11655a()) {
                e = new C2535v(e);
            }
            throw e.m11657k(abstractC2533tM11615I);
        } catch (IOException e9) {
            if (e9.getCause() instanceof C2535v) {
                throw ((C2535v) e9.getCause());
            }
            throw new C2535v(e9).m11657k(abstractC2533tM11615I);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof C2535v) {
                throw ((C2535v) e10.getCause());
            }
            throw e10;
        }
    }

    /* JADX INFO: renamed from: L */
    protected static void m11604L(Class cls, AbstractC2533t abstractC2533t) {
        abstractC2533t.m11613E();
        defaultInstanceMap.put(cls, abstractC2533t);
    }

    /* JADX INFO: renamed from: j */
    private static AbstractC2533t m11605j(AbstractC2533t abstractC2533t) throws C2535v {
        if (abstractC2533t == null || abstractC2533t.m11610A()) {
            return abstractC2533t;
        }
        throw abstractC2533t.m11038g().m11136a().m11657k(abstractC2533t);
    }

    /* JADX INFO: renamed from: o */
    private int m11606o(InterfaceC2500Y interfaceC2500Y) {
        return interfaceC2500Y == null ? C2496U.m10984a().m10987d(this).mo10970e(this) : interfaceC2500Y.mo10970e(this);
    }

    /* JADX INFO: renamed from: t */
    protected static AbstractC2534u.b m11607t() {
        return C2497V.m10989e();
    }

    /* JADX INFO: renamed from: u */
    static AbstractC2533t m11608u(Class cls) {
        AbstractC2533t abstractC2533t = defaultInstanceMap.get(cls);
        if (abstractC2533t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2533t = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC2533t != null) {
            return abstractC2533t;
        }
        AbstractC2533t abstractC2533tMo10900a = ((AbstractC2533t) AbstractC2519i0.m11425i(cls)).mo10900a();
        if (abstractC2533tMo10900a == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC2533tMo10900a);
        return abstractC2533tMo10900a;
    }

    /* JADX INFO: renamed from: z */
    static Object m11609z(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m11610A() {
        return m11599B(this, true);
    }

    /* JADX INFO: renamed from: C */
    boolean m11611C() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* JADX INFO: renamed from: D */
    protected void m11612D() {
        C2496U.m10984a().m10987d(this).mo10967b(this);
        m11613E();
    }

    /* JADX INFO: renamed from: E */
    void m11613E() {
        this.memoizedSerializedSize &= C3553a.e.API_PRIORITY_OTHER;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2486J
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final a mo10897c() {
        return (a) m11623q(d.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: I */
    AbstractC2533t m11615I() {
        return (AbstractC2533t) m11623q(d.NEW_MUTABLE_INSTANCE);
    }

    /* JADX INFO: renamed from: M */
    void m11616M(int i7) {
        this.memoizedHashCode = i7;
    }

    /* JADX INFO: renamed from: N */
    void m11617N(int i7) {
        if (i7 >= 0) {
            this.memoizedSerializedSize = (i7 & C3553a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i7);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2486J
    /* JADX INFO: renamed from: b */
    public int mo10896b() {
        return mo11037f(null);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2486J
    /* JADX INFO: renamed from: d */
    public void mo10898d(AbstractC2518i abstractC2518i) {
        C2496U.m10984a().m10987d(this).mo10974i(this, C2520j.m11462P(abstractC2518i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C2496U.m10984a().m10987d(this).mo10969d(this, (AbstractC2533t) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2502a
    /* JADX INFO: renamed from: f */
    int mo11037f(InterfaceC2500Y interfaceC2500Y) {
        if (!m11611C()) {
            if (m11627x() != Integer.MAX_VALUE) {
                return m11627x();
            }
            int iM11606o = m11606o(interfaceC2500Y);
            m11617N(iM11606o);
            return iM11606o;
        }
        int iM11606o2 = m11606o(interfaceC2500Y);
        if (iM11606o2 >= 0) {
            return iM11606o2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iM11606o2);
    }

    public int hashCode() {
        if (m11611C()) {
            return m11621n();
        }
        if (m11628y()) {
            m11616M(m11621n());
        }
        return m11626w();
    }

    /* JADX INFO: renamed from: i */
    Object m11618i() {
        return m11623q(d.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: renamed from: k */
    void m11619k() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: renamed from: l */
    void m11620l() {
        m11617N(C3553a.e.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: n */
    int m11621n() {
        return C2496U.m10984a().m10987d(this).mo10972g(this);
    }

    /* JADX INFO: renamed from: p */
    protected final a m11622p() {
        return (a) m11623q(d.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: q */
    protected Object m11623q(d dVar) {
        return mo8812s(dVar, null, null);
    }

    /* JADX INFO: renamed from: r */
    protected Object m11624r(d dVar, Object obj) {
        return mo8812s(dVar, obj, null);
    }

    /* JADX INFO: renamed from: s */
    protected abstract Object mo8812s(d dVar, Object obj, Object obj2);

    public String toString() {
        return AbstractC2488L.m10906f(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2487K
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final AbstractC2533t mo10900a() {
        return (AbstractC2533t) m11623q(d.GET_DEFAULT_INSTANCE);
    }

    /* JADX INFO: renamed from: w */
    int m11626w() {
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: x */
    int m11627x() {
        return this.memoizedSerializedSize & C3553a.e.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: y */
    boolean m11628y() {
        return m11626w() == 0;
    }
}
