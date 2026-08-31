package com.google.protobuf;

import com.google.android.gms.common.api.C3553a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.protobuf.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5136y extends AbstractC5088a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC5136y> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C5131v0 unknownFields = C5131v0.m23641c();

    /* JADX INFO: renamed from: com.google.protobuf.y$a */
    public static abstract class a extends AbstractC5088a.a {

        /* JADX INFO: renamed from: a */
        private final AbstractC5136y f19621a;

        /* JADX INFO: renamed from: b */
        protected AbstractC5136y f19622b;

        protected a(AbstractC5136y abstractC5136y) {
            this.f19621a = abstractC5136y;
            if (abstractC5136y.m23703I()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f19622b = m23720w();
        }

        /* JADX INFO: renamed from: v */
        private static void m23719v(Object obj, Object obj2) {
            C5103h0.m23146a().m23149d(obj).mo23051a(obj, obj2);
        }

        /* JADX INFO: renamed from: w */
        private AbstractC5136y m23720w() {
            return this.f19621a.m23707O();
        }

        @Override // com.google.protobuf.InterfaceC5083V
        /* JADX INFO: renamed from: d */
        public final boolean mo22977d() {
            return AbstractC5136y.m23686H(this.f19622b, false);
        }

        /* JADX INFO: renamed from: o */
        public final AbstractC5136y m23721o() {
            AbstractC5136y abstractC5136yMo22975m = mo22975m();
            if (abstractC5136yMo22975m.mo22977d()) {
                return abstractC5136yMo22975m;
            }
            throw AbstractC5088a.a.m23074l(abstractC5136yMo22975m);
        }

        @Override // com.google.protobuf.InterfaceC5082U.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public AbstractC5136y mo22975m() {
            if (!this.f19622b.m23703I()) {
                return this.f19622b;
            }
            this.f19622b.m23704J();
            return this.f19622b;
        }

        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarMo22970c = mo22976a().mo22970c();
            aVarMo22970c.f19622b = mo22975m();
            return aVarMo22970c;
        }

        /* JADX INFO: renamed from: r */
        protected final void m23724r() {
            if (this.f19622b.m23703I()) {
                return;
            }
            m23725s();
        }

        /* JADX INFO: renamed from: s */
        protected void m23725s() {
            AbstractC5136y abstractC5136yM23720w = m23720w();
            m23719v(abstractC5136yM23720w, this.f19622b);
            this.f19622b = abstractC5136yM23720w;
        }

        @Override // com.google.protobuf.InterfaceC5083V
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public AbstractC5136y mo22976a() {
            return this.f19621a;
        }

        /* JADX INFO: renamed from: u */
        public a m23727u(AbstractC5136y abstractC5136y) {
            if (mo22976a().equals(abstractC5136y)) {
                return this;
            }
            m23724r();
            m23719v(this.f19622b, abstractC5136y);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.y$b */
    protected static class b extends AbstractC5090b {

        /* JADX INFO: renamed from: b */
        private final AbstractC5136y f19623b;

        public b(AbstractC5136y abstractC5136y) {
            this.f19623b = abstractC5136y;
        }

        @Override // com.google.protobuf.InterfaceC5097e0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AbstractC5136y mo23100b(AbstractC5106j abstractC5106j, C5120q c5120q) {
            return AbstractC5136y.m23693T(this.f19623b, abstractC5106j, c5120q);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.y$c */
    public static class c extends AbstractC5116o {
    }

    /* JADX INFO: renamed from: com.google.protobuf.y$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: renamed from: A */
    protected static AbstractC5063B.e m23683A() {
        return C5105i0.m23179e();
    }

    /* JADX INFO: renamed from: B */
    static AbstractC5136y m23684B(Class cls) {
        AbstractC5136y abstractC5136y = defaultInstanceMap.get(cls);
        if (abstractC5136y == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC5136y = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC5136y != null) {
            return abstractC5136y;
        }
        AbstractC5136y abstractC5136yMo22976a = ((AbstractC5136y) AbstractC5137y0.m23764l(cls)).mo22976a();
        if (abstractC5136yMo22976a == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC5136yMo22976a);
        return abstractC5136yMo22976a;
    }

    /* JADX INFO: renamed from: G */
    static Object m23685G(Method method, Object obj, Object... objArr) {
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

    /* JADX INFO: renamed from: H */
    protected static final boolean m23686H(AbstractC5136y abstractC5136y, boolean z7) {
        byte bByteValue = ((Byte) abstractC5136y.m23717w(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo23053c = C5103h0.m23146a().m23149d(abstractC5136y).mo23053c(abstractC5136y);
        if (z7) {
            abstractC5136y.m23718x(d.SET_MEMOIZED_IS_INITIALIZED, zMo23053c ? abstractC5136y : null);
        }
        return zMo23053c;
    }

    /* JADX INFO: renamed from: L */
    protected static AbstractC5063B.e m23687L(AbstractC5063B.e eVar) {
        int size = eVar.size();
        return eVar.mo22823d(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: renamed from: N */
    protected static Object m23688N(InterfaceC5082U interfaceC5082U, String str, Object[] objArr) {
        return new C5107j0(interfaceC5082U, str, objArr);
    }

    /* JADX INFO: renamed from: P */
    protected static AbstractC5136y m23689P(AbstractC5136y abstractC5136y, AbstractC5104i abstractC5104i) {
        return m23696p(m23690Q(abstractC5136y, abstractC5104i, C5120q.m23562b()));
    }

    /* JADX INFO: renamed from: Q */
    protected static AbstractC5136y m23690Q(AbstractC5136y abstractC5136y, AbstractC5104i abstractC5104i, C5120q c5120q) {
        return m23696p(m23692S(abstractC5136y, abstractC5104i, c5120q));
    }

    /* JADX INFO: renamed from: R */
    protected static AbstractC5136y m23691R(AbstractC5136y abstractC5136y, byte[] bArr) {
        return m23696p(m23694U(abstractC5136y, bArr, 0, bArr.length, C5120q.m23562b()));
    }

    /* JADX INFO: renamed from: S */
    private static AbstractC5136y m23692S(AbstractC5136y abstractC5136y, AbstractC5104i abstractC5104i, C5120q c5120q) throws C5065C {
        AbstractC5106j abstractC5106jMo23085D = abstractC5104i.mo23085D();
        AbstractC5136y abstractC5136yM23693T = m23693T(abstractC5136y, abstractC5106jMo23085D, c5120q);
        try {
            abstractC5106jMo23085D.mo23203a(0);
            return abstractC5136yM23693T;
        } catch (C5065C e7) {
            throw e7.m22903k(abstractC5136yM23693T);
        }
    }

    /* JADX INFO: renamed from: T */
    static AbstractC5136y m23693T(AbstractC5136y abstractC5136y, AbstractC5106j abstractC5106j, C5120q c5120q) throws C5065C {
        AbstractC5136y abstractC5136yM23707O = abstractC5136y.m23707O();
        try {
            InterfaceC5113m0 interfaceC5113m0M23149d = C5103h0.m23146a().m23149d(abstractC5136yM23707O);
            interfaceC5113m0M23149d.mo23060i(abstractC5136yM23707O, C5108k.m23285O(abstractC5106j), c5120q);
            interfaceC5113m0M23149d.mo23052b(abstractC5136yM23707O);
            return abstractC5136yM23707O;
        } catch (C5065C e7) {
            e = e7;
            if (e.m22901a()) {
                e = new C5065C(e);
            }
            throw e.m22903k(abstractC5136yM23707O);
        } catch (C5127t0 e8) {
            throw e8.m23592a().m22903k(abstractC5136yM23707O);
        } catch (IOException e9) {
            if (e9.getCause() instanceof C5065C) {
                throw ((C5065C) e9.getCause());
            }
            throw new C5065C(e9).m22903k(abstractC5136yM23707O);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof C5065C) {
                throw ((C5065C) e10.getCause());
            }
            throw e10;
        }
    }

    /* JADX INFO: renamed from: U */
    private static AbstractC5136y m23694U(AbstractC5136y abstractC5136y, byte[] bArr, int i7, int i8, C5120q c5120q) throws C5065C {
        AbstractC5136y abstractC5136yM23707O = abstractC5136y.m23707O();
        try {
            InterfaceC5113m0 interfaceC5113m0M23149d = C5103h0.m23146a().m23149d(abstractC5136yM23707O);
            interfaceC5113m0M23149d.mo23061j(abstractC5136yM23707O, bArr, i7, i7 + i8, new AbstractC5098f.a(c5120q));
            interfaceC5113m0M23149d.mo23052b(abstractC5136yM23707O);
            return abstractC5136yM23707O;
        } catch (C5065C e7) {
            C5065C c5065c = e7;
            if (c5065c.m22901a()) {
                c5065c = new C5065C(c5065c);
            }
            throw c5065c.m22903k(abstractC5136yM23707O);
        } catch (C5127t0 e8) {
            throw e8.m23592a().m22903k(abstractC5136yM23707O);
        } catch (IOException e9) {
            if (e9.getCause() instanceof C5065C) {
                throw ((C5065C) e9.getCause());
            }
            throw new C5065C(e9).m22903k(abstractC5136yM23707O);
        } catch (IndexOutOfBoundsException unused) {
            throw C5065C.m22900m().m22903k(abstractC5136yM23707O);
        }
    }

    /* JADX INFO: renamed from: V */
    protected static void m23695V(Class cls, AbstractC5136y abstractC5136y) {
        abstractC5136y.m23705K();
        defaultInstanceMap.put(cls, abstractC5136y);
    }

    /* JADX INFO: renamed from: p */
    private static AbstractC5136y m23696p(AbstractC5136y abstractC5136y) throws C5065C {
        if (abstractC5136y == null || abstractC5136y.mo22977d()) {
            return abstractC5136y;
        }
        throw abstractC5136y.m23071n().m23592a().m22903k(abstractC5136y);
    }

    /* JADX INFO: renamed from: t */
    private int m23697t(InterfaceC5113m0 interfaceC5113m0) {
        return interfaceC5113m0 == null ? C5103h0.m23146a().m23149d(this).mo23056e(this) : interfaceC5113m0.mo23056e(this);
    }

    /* JADX INFO: renamed from: z */
    protected static AbstractC5063B.d m23698z() {
        return C5061A.m22819k();
    }

    @Override // com.google.protobuf.InterfaceC5083V
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final AbstractC5136y mo22976a() {
        return (AbstractC5136y) m23717w(d.GET_DEFAULT_INSTANCE);
    }

    /* JADX INFO: renamed from: D */
    int m23700D() {
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: E */
    int m23701E() {
        return this.memoizedSerializedSize & C3553a.e.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: F */
    boolean m23702F() {
        return m23700D() == 0;
    }

    /* JADX INFO: renamed from: I */
    boolean m23703I() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* JADX INFO: renamed from: J */
    protected void m23704J() {
        C5103h0.m23146a().m23149d(this).mo23052b(this);
        m23705K();
    }

    /* JADX INFO: renamed from: K */
    void m23705K() {
        this.memoizedSerializedSize &= C3553a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.protobuf.InterfaceC5082U
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final a mo22970c() {
        return (a) m23717w(d.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: O */
    AbstractC5136y m23707O() {
        return (AbstractC5136y) m23717w(d.NEW_MUTABLE_INSTANCE);
    }

    /* JADX INFO: renamed from: W */
    void m23708W(int i7) {
        this.memoizedHashCode = i7;
    }

    /* JADX INFO: renamed from: X */
    void m23709X(int i7) {
        if (i7 >= 0) {
            this.memoizedSerializedSize = (i7 & C3553a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i7);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final a m23710Y() {
        return ((a) m23717w(d.NEW_BUILDER)).m23727u(this);
    }

    @Override // com.google.protobuf.InterfaceC5082U
    /* JADX INFO: renamed from: b */
    public int mo22969b() {
        return mo23070k(null);
    }

    @Override // com.google.protobuf.InterfaceC5083V
    /* JADX INFO: renamed from: d */
    public final boolean mo22977d() {
        return m23686H(this, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C5103h0.m23146a().m23149d(this).mo23054d(this, (AbstractC5136y) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC5082U
    /* JADX INFO: renamed from: f */
    public void mo22972f(AbstractC5110l abstractC5110l) {
        C5103h0.m23146a().m23149d(this).mo23059h(this, C5112m.m23467P(abstractC5110l));
    }

    public int hashCode() {
        if (m23703I()) {
            return m23714s();
        }
        if (m23702F()) {
            m23708W(m23714s());
        }
        return m23700D();
    }

    @Override // com.google.protobuf.InterfaceC5082U
    /* JADX INFO: renamed from: i */
    public final InterfaceC5097e0 mo22974i() {
        return (InterfaceC5097e0) m23717w(d.GET_PARSER);
    }

    @Override // com.google.protobuf.AbstractC5088a
    /* JADX INFO: renamed from: k */
    int mo23070k(InterfaceC5113m0 interfaceC5113m0) {
        if (!m23703I()) {
            if (m23701E() != Integer.MAX_VALUE) {
                return m23701E();
            }
            int iM23697t = m23697t(interfaceC5113m0);
            m23709X(iM23697t);
            return iM23697t;
        }
        int iM23697t2 = m23697t(interfaceC5113m0);
        if (iM23697t2 >= 0) {
            return iM23697t2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iM23697t2);
    }

    /* JADX INFO: renamed from: o */
    Object m23711o() {
        return m23717w(d.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: renamed from: q */
    void m23712q() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: renamed from: r */
    void m23713r() {
        m23709X(C3553a.e.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: s */
    int m23714s() {
        return C5103h0.m23146a().m23149d(this).mo23058g(this);
    }

    public String toString() {
        return AbstractC5084W.m22983f(this, super.toString());
    }

    /* JADX INFO: renamed from: u */
    protected final a m23715u() {
        return (a) m23717w(d.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: v */
    protected final a m23716v(AbstractC5136y abstractC5136y) {
        return m23715u().m23727u(abstractC5136y);
    }

    /* JADX INFO: renamed from: w */
    protected Object m23717w(d dVar) {
        return mo7677y(dVar, null, null);
    }

    /* JADX INFO: renamed from: x */
    protected Object m23718x(d dVar, Object obj) {
        return mo7677y(dVar, obj, null);
    }

    /* JADX INFO: renamed from: y */
    protected abstract Object mo7677y(d dVar, Object obj, Object obj2);
}
