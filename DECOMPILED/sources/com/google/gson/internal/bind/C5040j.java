package com.google.gson.internal.bind;

import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.EnumC5056q;
import com.google.gson.InterfaceC5057r;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p367u5.C7195z;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.internal.bind.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5040j extends AbstractC5059s {

    /* JADX INFO: renamed from: c */
    private static final InterfaceC5060t f19123c = m22701f(EnumC5056q.f19245a);

    /* JADX INFO: renamed from: a */
    private final C5026e f19124a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5057r f19125b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.j$a */
    class a implements InterfaceC5060t {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5057r f19126a;

        a(InterfaceC5057r interfaceC5057r) {
            this.f19126a = interfaceC5057r;
        }

        @Override // com.google.gson.InterfaceC5060t
        /* JADX INFO: renamed from: a */
        public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
            a aVar = null;
            if (c5058a.m22814c() == Object.class) {
                return new C5040j(c5026e, this.f19126a, aVar);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.j$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f19127a;

        static {
            int[] iArr = new int[EnumC7416b.values().length];
            f19127a = iArr;
            try {
                iArr[EnumC7416b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19127a[EnumC7416b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19127a[EnumC7416b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19127a[EnumC7416b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19127a[EnumC7416b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19127a[EnumC7416b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* synthetic */ C5040j(C5026e c5026e, InterfaceC5057r interfaceC5057r, a aVar) {
        this(c5026e, interfaceC5057r);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC5060t m22700e(InterfaceC5057r interfaceC5057r) {
        return interfaceC5057r == EnumC5056q.f19245a ? f19123c : m22701f(interfaceC5057r);
    }

    /* JADX INFO: renamed from: f */
    private static InterfaceC5060t m22701f(InterfaceC5057r interfaceC5057r) {
        return new a(interfaceC5057r);
    }

    /* JADX INFO: renamed from: g */
    private Object m22702g(C7415a c7415a, EnumC7416b enumC7416b) throws IOException {
        int i7 = b.f19127a[enumC7416b.ordinal()];
        if (i7 == 3) {
            return c7415a.m32822b1();
        }
        if (i7 == 4) {
            return this.f19125b.mo22805c(c7415a);
        }
        if (i7 == 5) {
            return Boolean.valueOf(c7415a.m32816T0());
        }
        if (i7 == 6) {
            c7415a.m32821Z0();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + enumC7416b);
    }

    /* JADX INFO: renamed from: h */
    private Object m22703h(C7415a c7415a, EnumC7416b enumC7416b) throws IOException {
        int i7 = b.f19127a[enumC7416b.ordinal()];
        if (i7 == 1) {
            c7415a.m32827m();
            return new ArrayList();
        }
        if (i7 != 2) {
            return null;
        }
        c7415a.m32828n();
        return new C7195z();
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: b */
    public Object mo22636b(C7415a c7415a) throws IOException {
        EnumC7416b enumC7416bM32824d1 = c7415a.m32824d1();
        Object objM22703h = m22703h(c7415a, enumC7416bM32824d1);
        if (objM22703h == null) {
            return m22702g(c7415a, enumC7416bM32824d1);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c7415a.m32812K0()) {
                String strM32820X0 = objM22703h instanceof Map ? c7415a.m32820X0() : null;
                EnumC7416b enumC7416bM32824d2 = c7415a.m32824d1();
                Object objM22703h2 = m22703h(c7415a, enumC7416bM32824d2);
                boolean z7 = objM22703h2 != null;
                if (objM22703h2 == null) {
                    objM22703h2 = m22702g(c7415a, enumC7416bM32824d2);
                }
                if (objM22703h instanceof List) {
                    ((List) objM22703h).add(objM22703h2);
                } else {
                    ((Map) objM22703h).put(strM32820X0, objM22703h2);
                }
                if (z7) {
                    arrayDeque.addLast(objM22703h);
                    objM22703h = objM22703h2;
                }
            } else {
                if (objM22703h instanceof List) {
                    c7415a.m32823d0();
                } else {
                    c7415a.m32826k0();
                }
                if (arrayDeque.isEmpty()) {
                    return objM22703h;
                }
                objM22703h = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: d */
    public void mo22637d(C7417c c7417c, Object obj) throws IOException {
        if (obj == null) {
            c7417c.mo22681R0();
            return;
        }
        AbstractC5059s abstractC5059sM22625m = this.f19124a.m22625m(obj.getClass());
        if (!(abstractC5059sM22625m instanceof C5040j)) {
            abstractC5059sM22625m.mo22637d(c7417c, obj);
        } else {
            c7417c.mo22679J();
            c7417c.mo22690k0();
        }
    }

    private C5040j(C5026e c5026e, InterfaceC5057r interfaceC5057r) {
        this.f19124a = c5026e;
        this.f19125b = interfaceC5057r;
    }
}
