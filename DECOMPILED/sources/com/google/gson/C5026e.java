package com.google.gson;

import com.google.gson.internal.bind.AbstractC5042l;
import com.google.gson.internal.bind.AbstractC5044n;
import com.google.gson.internal.bind.C5031a;
import com.google.gson.internal.bind.C5032b;
import com.google.gson.internal.bind.C5033c;
import com.google.gson.internal.bind.C5035e;
import com.google.gson.internal.bind.C5038h;
import com.google.gson.internal.bind.C5039i;
import com.google.gson.internal.bind.C5040j;
import com.google.gson.internal.bind.C5041k;
import com.google.gson.internal.sql.AbstractC5048d;
import com.google.gson.reflect.C5058a;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p367u5.AbstractC7165D;
import p367u5.AbstractC7167F;
import p367u5.C7189t;
import p367u5.C7190u;
import p367u5.C7194y;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.C7418d;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5026e {

    /* JADX INFO: renamed from: A */
    static final C5025d f19049A = C5025d.f19044d;

    /* JADX INFO: renamed from: B */
    static final String f19050B = null;

    /* JADX INFO: renamed from: C */
    static final InterfaceC5024c f19051C = EnumC5023b.f19036a;

    /* JADX INFO: renamed from: D */
    static final InterfaceC5057r f19052D = EnumC5056q.f19245a;

    /* JADX INFO: renamed from: E */
    static final InterfaceC5057r f19053E = EnumC5056q.f19246b;

    /* JADX INFO: renamed from: z */
    static final EnumC5055p f19054z = null;

    /* JADX INFO: renamed from: a */
    private final ThreadLocal f19055a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentMap f19056b;

    /* JADX INFO: renamed from: c */
    private final C7189t f19057c;

    /* JADX INFO: renamed from: d */
    private final C5035e f19058d;

    /* JADX INFO: renamed from: e */
    final List f19059e;

    /* JADX INFO: renamed from: f */
    final C7190u f19060f;

    /* JADX INFO: renamed from: g */
    final InterfaceC5024c f19061g;

    /* JADX INFO: renamed from: h */
    final Map f19062h;

    /* JADX INFO: renamed from: i */
    final boolean f19063i;

    /* JADX INFO: renamed from: j */
    final boolean f19064j;

    /* JADX INFO: renamed from: k */
    final boolean f19065k;

    /* JADX INFO: renamed from: l */
    final boolean f19066l;

    /* JADX INFO: renamed from: m */
    final C5025d f19067m;

    /* JADX INFO: renamed from: n */
    final EnumC5055p f19068n;

    /* JADX INFO: renamed from: o */
    final boolean f19069o;

    /* JADX INFO: renamed from: p */
    final boolean f19070p;

    /* JADX INFO: renamed from: q */
    final String f19071q;

    /* JADX INFO: renamed from: r */
    final int f19072r;

    /* JADX INFO: renamed from: s */
    final int f19073s;

    /* JADX INFO: renamed from: t */
    final EnumC5053n f19074t;

    /* JADX INFO: renamed from: u */
    final List f19075u;

    /* JADX INFO: renamed from: v */
    final List f19076v;

    /* JADX INFO: renamed from: w */
    final InterfaceC5057r f19077w;

    /* JADX INFO: renamed from: x */
    final InterfaceC5057r f19078x;

    /* JADX INFO: renamed from: y */
    final List f19079y;

    /* JADX INFO: renamed from: com.google.gson.e$a */
    class a extends AbstractC5059s {
        a() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() != EnumC7416b.NULL) {
                return Double.valueOf(c7415a.m32817U0());
            }
            c7415a.m32821Z0();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Number number) throws IOException {
            if (number == null) {
                c7417c.mo22681R0();
                return;
            }
            double dDoubleValue = number.doubleValue();
            C5026e.m22615d(dDoubleValue);
            c7417c.mo22682b1(dDoubleValue);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.e$b */
    class b extends AbstractC5059s {
        b() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() != EnumC7416b.NULL) {
                return Float.valueOf((float) c7415a.m32817U0());
            }
            c7415a.m32821Z0();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Number number) throws IOException {
            if (number == null) {
                c7417c.mo22681R0();
                return;
            }
            float fFloatValue = number.floatValue();
            C5026e.m22615d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            c7417c.mo22686e1(number);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.e$c */
    class c extends AbstractC5059s {
        c() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() != EnumC7416b.NULL) {
                return Long.valueOf(c7415a.m32819W0());
            }
            c7415a.m32821Z0();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Number number) throws IOException {
            if (number == null) {
                c7417c.mo22681R0();
            } else {
                c7417c.mo22687f1(number.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.e$d */
    class d extends AbstractC5059s {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC5059s f19082a;

        d(AbstractC5059s abstractC5059s) {
            this.f19082a = abstractC5059s;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong mo22636b(C7415a c7415a) {
            return new AtomicLong(((Number) this.f19082a.mo22636b(c7415a)).longValue());
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, AtomicLong atomicLong) {
            this.f19082a.mo22637d(c7417c, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: renamed from: com.google.gson.e$e */
    class e extends AbstractC5059s {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC5059s f19083a;

        e(AbstractC5059s abstractC5059s) {
            this.f19083a = abstractC5059s;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray mo22636b(C7415a c7415a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c7415a.m32827m();
            while (c7415a.m32812K0()) {
                arrayList.add(Long.valueOf(((Number) this.f19083a.mo22636b(c7415a)).longValue()));
            }
            c7415a.m32823d0();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i7 = 0; i7 < size; i7++) {
                atomicLongArray.set(i7, ((Long) arrayList.get(i7)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, AtomicLongArray atomicLongArray) throws IOException {
            c7417c.mo22691x();
            int length = atomicLongArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                this.f19083a.mo22637d(c7417c, Long.valueOf(atomicLongArray.get(i7)));
            }
            c7417c.mo22684d0();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.e$f */
    static class f extends AbstractC5042l {

        /* JADX INFO: renamed from: a */
        private AbstractC5059s f19084a = null;

        f() {
        }

        /* JADX INFO: renamed from: f */
        private AbstractC5059s m22648f() {
            AbstractC5059s abstractC5059s = this.f19084a;
            if (abstractC5059s != null) {
                return abstractC5059s;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: b */
        public Object mo22636b(C7415a c7415a) {
            return m22648f().mo22636b(c7415a);
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: d */
        public void mo22637d(C7417c c7417c, Object obj) {
            m22648f().mo22637d(c7417c, obj);
        }

        @Override // com.google.gson.internal.bind.AbstractC5042l
        /* JADX INFO: renamed from: e */
        public AbstractC5059s mo22649e() {
            return m22648f();
        }

        /* JADX INFO: renamed from: g */
        public void m22650g(AbstractC5059s abstractC5059s) {
            if (this.f19084a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f19084a = abstractC5059s;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5026e() {
        C7190u c7190u = C7190u.f28657r;
        InterfaceC5024c interfaceC5024c = f19051C;
        Map map = Collections.EMPTY_MAP;
        C5025d c5025d = f19049A;
        EnumC5055p enumC5055p = f19054z;
        EnumC5053n enumC5053n = EnumC5053n.f19233a;
        String str = f19050B;
        List list = Collections.EMPTY_LIST;
        this(c7190u, interfaceC5024c, map, false, false, false, true, c5025d, enumC5055p, false, true, enumC5053n, str, 2, 2, list, list, list, f19052D, f19053E, list);
    }

    /* JADX INFO: renamed from: a */
    private static void m22612a(Object obj, C7415a c7415a) {
        if (obj != null) {
            try {
                if (c7415a.m32824d1() == EnumC7416b.END_DOCUMENT) {
                } else {
                    throw new C5052m("JSON document was not fully consumed.");
                }
            } catch (C7418d e7) {
                throw new C5052m(e7);
            } catch (IOException e8) {
                throw new C5029h(e8);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static AbstractC5059s m22613b(AbstractC5059s abstractC5059s) {
        return new d(abstractC5059s).m22816a();
    }

    /* JADX INFO: renamed from: c */
    private static AbstractC5059s m22614c(AbstractC5059s abstractC5059s) {
        return new e(abstractC5059s).m22816a();
    }

    /* JADX INFO: renamed from: d */
    static void m22615d(double d7) {
        if (Double.isNaN(d7) || Double.isInfinite(d7)) {
            throw new IllegalArgumentException(d7 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX INFO: renamed from: e */
    private AbstractC5059s m22616e(boolean z7) {
        return z7 ? AbstractC5044n.f19201v : new a();
    }

    /* JADX INFO: renamed from: f */
    private AbstractC5059s m22617f(boolean z7) {
        return z7 ? AbstractC5044n.f19200u : new b();
    }

    /* JADX INFO: renamed from: o */
    private static AbstractC5059s m22618o(EnumC5053n enumC5053n) {
        return enumC5053n == EnumC5053n.f19233a ? AbstractC5044n.f19199t : new c();
    }

    /* JADX INFO: renamed from: g */
    public Object m22619g(Reader reader, C5058a c5058a) {
        C7415a c7415aM22627p = m22627p(reader);
        Object objM22623k = m22623k(c7415aM22627p, c5058a);
        m22612a(objM22623k, c7415aM22627p);
        return objM22623k;
    }

    /* JADX INFO: renamed from: h */
    public Object m22620h(String str, C5058a c5058a) {
        if (str == null) {
            return null;
        }
        return m22619g(new StringReader(str), c5058a);
    }

    /* JADX INFO: renamed from: i */
    public Object m22621i(String str, Class cls) {
        return m22620h(str, C5058a.m22809a(cls));
    }

    /* JADX INFO: renamed from: j */
    public Object m22622j(String str, Type type) {
        return m22620h(str, C5058a.m22810b(type));
    }

    /* JADX INFO: renamed from: k */
    public Object m22623k(C7415a c7415a, C5058a c5058a) {
        boolean z7;
        EnumC5055p enumC5055pM32832w0 = c7415a.m32832w0();
        EnumC5055p enumC5055p = this.f19068n;
        if (enumC5055p != null) {
            c7415a.m32825i1(enumC5055p);
        } else if (c7415a.m32832w0() == EnumC5055p.LEGACY_STRICT) {
            c7415a.m32825i1(EnumC5055p.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        c7415a.m32824d1();
                        z7 = false;
                        try {
                            AbstractC5059s abstractC5059sM22624l = m22624l(c5058a);
                            Object objMo22636b = abstractC5059sM22624l.mo22636b(c7415a);
                            Class clsM31671b = AbstractC7165D.m31671b(c5058a.m22814c());
                            if (objMo22636b != null && !clsM31671b.isInstance(objMo22636b)) {
                                throw new ClassCastException("Type adapter '" + abstractC5059sM22624l + "' returned wrong type; requested " + c5058a.m22814c() + " but got instance of " + objMo22636b.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            c7415a.m32825i1(enumC5055pM32832w0);
                            return objMo22636b;
                        } catch (EOFException e7) {
                            e = e7;
                            if (!z7) {
                                throw new C5052m(e);
                            }
                            c7415a.m32825i1(enumC5055pM32832w0);
                            return null;
                        }
                    } catch (EOFException e8) {
                        e = e8;
                        z7 = true;
                    }
                } catch (IOException e9) {
                    throw new C5052m(e9);
                }
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e10.getMessage(), e10);
            } catch (IllegalStateException e11) {
                throw new C5052m(e11);
            }
        } catch (Throwable th) {
            c7415a.m32825i1(enumC5055pM32832w0);
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public AbstractC5059s m22624l(C5058a c5058a) {
        boolean z7;
        Objects.requireNonNull(c5058a, "type must not be null");
        AbstractC5059s abstractC5059s = (AbstractC5059s) this.f19056b.get(c5058a);
        if (abstractC5059s != null) {
            return abstractC5059s;
        }
        Map map = (Map) this.f19055a.get();
        if (map == null) {
            map = new HashMap();
            this.f19055a.set(map);
            z7 = true;
        } else {
            AbstractC5059s abstractC5059s2 = (AbstractC5059s) map.get(c5058a);
            if (abstractC5059s2 != null) {
                return abstractC5059s2;
            }
            z7 = false;
        }
        try {
            f fVar = new f();
            map.put(c5058a, fVar);
            Iterator it = this.f19059e.iterator();
            AbstractC5059s abstractC5059sMo22659a = null;
            while (it.hasNext()) {
                abstractC5059sMo22659a = ((InterfaceC5060t) it.next()).mo22659a(this, c5058a);
                if (abstractC5059sMo22659a != null) {
                    fVar.m22650g(abstractC5059sMo22659a);
                    map.put(c5058a, abstractC5059sMo22659a);
                    break;
                }
            }
            if (z7) {
                this.f19055a.remove();
            }
            if (abstractC5059sMo22659a != null) {
                if (z7) {
                    this.f19056b.putAll(map);
                }
                return abstractC5059sMo22659a;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + c5058a);
        } catch (Throwable th) {
            if (z7) {
                this.f19055a.remove();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public AbstractC5059s m22625m(Class cls) {
        return m22624l(C5058a.m22809a(cls));
    }

    /* JADX INFO: renamed from: n */
    public AbstractC5059s m22626n(InterfaceC5060t interfaceC5060t, C5058a c5058a) {
        Objects.requireNonNull(interfaceC5060t, "skipPast must not be null");
        Objects.requireNonNull(c5058a, "type must not be null");
        if (this.f19058d.m22672e(c5058a, interfaceC5060t)) {
            interfaceC5060t = this.f19058d;
        }
        boolean z7 = false;
        for (InterfaceC5060t interfaceC5060t2 : this.f19059e) {
            if (z7) {
                AbstractC5059s abstractC5059sMo22659a = interfaceC5060t2.mo22659a(this, c5058a);
                if (abstractC5059sMo22659a != null) {
                    return abstractC5059sMo22659a;
                }
            } else if (interfaceC5060t2 == interfaceC5060t) {
                z7 = true;
            }
        }
        if (!z7) {
            return m22624l(c5058a);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + c5058a);
    }

    /* JADX INFO: renamed from: p */
    public C7415a m22627p(Reader reader) {
        C7415a c7415a = new C7415a(reader);
        EnumC5055p enumC5055p = this.f19068n;
        if (enumC5055p == null) {
            enumC5055p = EnumC5055p.LEGACY_STRICT;
        }
        c7415a.m32825i1(enumC5055p);
        return c7415a;
    }

    /* JADX INFO: renamed from: q */
    public C7417c m22628q(Writer writer) throws IOException {
        if (this.f19065k) {
            writer.write(")]}'\n");
        }
        C7417c c7417c = new C7417c(writer);
        c7417c.m32845W0(this.f19067m);
        c7417c.m32846X0(this.f19066l);
        EnumC5055p enumC5055p = this.f19068n;
        if (enumC5055p == null) {
            enumC5055p = EnumC5055p.LEGACY_STRICT;
        }
        c7417c.m32848Z0(enumC5055p);
        c7417c.m32847Y0(this.f19063i);
        return c7417c;
    }

    /* JADX INFO: renamed from: r */
    public String m22629r(AbstractC5028g abstractC5028g) {
        StringBuilder sb = new StringBuilder();
        m22632u(abstractC5028g, sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public String m22630s(Object obj) {
        return obj == null ? m22629r(C5030i.f19086a) : m22631t(obj, obj.getClass());
    }

    /* JADX INFO: renamed from: t */
    public String m22631t(Object obj, Type type) {
        StringBuilder sb = new StringBuilder();
        m22634w(obj, type, sb);
        return sb.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f19063i + ",factories:" + this.f19059e + ",instanceCreators:" + this.f19057c + "}";
    }

    /* JADX INFO: renamed from: u */
    public void m22632u(AbstractC5028g abstractC5028g, Appendable appendable) {
        try {
            m22633v(abstractC5028g, m22628q(AbstractC7167F.m31676b(appendable)));
        } catch (IOException e7) {
            throw new C5029h(e7);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m22633v(AbstractC5028g abstractC5028g, C7417c c7417c) {
        EnumC5055p enumC5055pM32850o0 = c7417c.m32850o0();
        boolean zM32851p0 = c7417c.m32851p0();
        boolean zM32849l0 = c7417c.m32849l0();
        c7417c.m32846X0(this.f19066l);
        c7417c.m32847Y0(this.f19063i);
        EnumC5055p enumC5055p = this.f19068n;
        if (enumC5055p != null) {
            c7417c.m32848Z0(enumC5055p);
        } else if (c7417c.m32850o0() == EnumC5055p.LEGACY_STRICT) {
            c7417c.m32848Z0(EnumC5055p.LENIENT);
        }
        try {
            try {
                AbstractC7167F.m31675a(abstractC5028g, c7417c);
                c7417c.m32848Z0(enumC5055pM32850o0);
                c7417c.m32846X0(zM32851p0);
                c7417c.m32847Y0(zM32849l0);
            } catch (IOException e7) {
                throw new C5029h(e7);
            } catch (AssertionError e8) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e8.getMessage(), e8);
            }
        } catch (Throwable th) {
            c7417c.m32848Z0(enumC5055pM32850o0);
            c7417c.m32846X0(zM32851p0);
            c7417c.m32847Y0(zM32849l0);
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m22634w(Object obj, Type type, Appendable appendable) {
        try {
            m22635x(obj, type, m22628q(AbstractC7167F.m31676b(appendable)));
        } catch (IOException e7) {
            throw new C5029h(e7);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m22635x(Object obj, Type type, C7417c c7417c) {
        AbstractC5059s abstractC5059sM22624l = m22624l(C5058a.m22810b(type));
        EnumC5055p enumC5055pM32850o0 = c7417c.m32850o0();
        EnumC5055p enumC5055p = this.f19068n;
        if (enumC5055p != null) {
            c7417c.m32848Z0(enumC5055p);
        } else if (c7417c.m32850o0() == EnumC5055p.LEGACY_STRICT) {
            c7417c.m32848Z0(EnumC5055p.LENIENT);
        }
        boolean zM32851p0 = c7417c.m32851p0();
        boolean zM32849l0 = c7417c.m32849l0();
        c7417c.m32846X0(this.f19066l);
        c7417c.m32847Y0(this.f19063i);
        try {
            try {
                try {
                    abstractC5059sM22624l.mo22637d(c7417c, obj);
                    c7417c.m32848Z0(enumC5055pM32850o0);
                    c7417c.m32846X0(zM32851p0);
                    c7417c.m32847Y0(zM32849l0);
                } catch (AssertionError e7) {
                    throw new AssertionError("AssertionError (GSON 2.13.2): " + e7.getMessage(), e7);
                }
            } catch (IOException e8) {
                throw new C5029h(e8);
            }
        } catch (Throwable th) {
            c7417c.m32848Z0(enumC5055pM32850o0);
            c7417c.m32846X0(zM32851p0);
            c7417c.m32847Y0(zM32849l0);
            throw th;
        }
    }

    C5026e(C7190u c7190u, InterfaceC5024c interfaceC5024c, Map map, boolean z7, boolean z8, boolean z9, boolean z10, C5025d c5025d, EnumC5055p enumC5055p, boolean z11, boolean z12, EnumC5053n enumC5053n, String str, int i7, int i8, List list, List list2, List list3, InterfaceC5057r interfaceC5057r, InterfaceC5057r interfaceC5057r2, List list4) {
        this.f19055a = new ThreadLocal();
        this.f19056b = new ConcurrentHashMap();
        this.f19060f = c7190u;
        this.f19061g = interfaceC5024c;
        this.f19062h = map;
        C7189t c7189t = new C7189t(map, z12, list4);
        this.f19057c = c7189t;
        this.f19063i = z7;
        this.f19064j = z8;
        this.f19065k = z9;
        this.f19066l = z10;
        this.f19067m = c5025d;
        this.f19068n = enumC5055p;
        this.f19069o = z11;
        this.f19070p = z12;
        this.f19074t = enumC5053n;
        this.f19071q = str;
        this.f19072r = i7;
        this.f19073s = i8;
        this.f19075u = list;
        this.f19076v = list2;
        this.f19077w = interfaceC5057r;
        this.f19078x = interfaceC5057r2;
        this.f19079y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC5044n.f19178W);
        arrayList.add(C5040j.m22700e(interfaceC5057r));
        arrayList.add(c7190u);
        arrayList.addAll(list3);
        arrayList.add(AbstractC5044n.f19158C);
        arrayList.add(AbstractC5044n.f19192m);
        arrayList.add(AbstractC5044n.f19186g);
        arrayList.add(AbstractC5044n.f19188i);
        arrayList.add(AbstractC5044n.f19190k);
        AbstractC5059s abstractC5059sM22618o = m22618o(enumC5053n);
        arrayList.add(AbstractC5044n.m22724b(Long.TYPE, Long.class, abstractC5059sM22618o));
        arrayList.add(AbstractC5044n.m22724b(Double.TYPE, Double.class, m22616e(z11)));
        arrayList.add(AbstractC5044n.m22724b(Float.TYPE, Float.class, m22617f(z11)));
        arrayList.add(C5039i.m22696e(interfaceC5057r2));
        arrayList.add(AbstractC5044n.f19194o);
        arrayList.add(AbstractC5044n.f19196q);
        arrayList.add(AbstractC5044n.m22723a(AtomicLong.class, m22613b(abstractC5059sM22618o)));
        arrayList.add(AbstractC5044n.m22723a(AtomicLongArray.class, m22614c(abstractC5059sM22618o)));
        arrayList.add(AbstractC5044n.f19198s);
        arrayList.add(AbstractC5044n.f19203x);
        arrayList.add(AbstractC5044n.f19160E);
        arrayList.add(AbstractC5044n.f19162G);
        arrayList.add(AbstractC5044n.m22723a(BigDecimal.class, AbstractC5044n.f19205z));
        arrayList.add(AbstractC5044n.m22723a(BigInteger.class, AbstractC5044n.f19156A));
        arrayList.add(AbstractC5044n.m22723a(C7194y.class, AbstractC5044n.f19157B));
        arrayList.add(AbstractC5044n.f19164I);
        arrayList.add(AbstractC5044n.f19166K);
        arrayList.add(AbstractC5044n.f19170O);
        arrayList.add(AbstractC5044n.f19172Q);
        arrayList.add(AbstractC5044n.f19176U);
        arrayList.add(AbstractC5044n.f19168M);
        arrayList.add(AbstractC5044n.f19183d);
        arrayList.add(C5033c.f19093c);
        arrayList.add(AbstractC5044n.f19174S);
        if (AbstractC5048d.f19225a) {
            arrayList.add(AbstractC5048d.f19229e);
            arrayList.add(AbstractC5048d.f19228d);
            arrayList.add(AbstractC5048d.f19230f);
        }
        arrayList.add(C5031a.f19087c);
        arrayList.add(AbstractC5044n.f19181b);
        arrayList.add(new C5032b(c7189t));
        arrayList.add(new C5038h(c7189t, z8));
        C5035e c5035e = new C5035e(c7189t);
        this.f19058d = c5035e;
        arrayList.add(c5035e);
        arrayList.add(AbstractC5044n.f19179X);
        arrayList.add(new C5041k(c7189t, interfaceC5024c, c7190u, c5035e, list4));
        this.f19059e = Collections.unmodifiableList(arrayList);
    }
}
