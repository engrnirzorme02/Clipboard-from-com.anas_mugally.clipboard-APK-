package com.google.gson.internal.bind;

import com.google.gson.AbstractC5028g;
import com.google.gson.AbstractC5059s;
import com.google.gson.C5027f;
import com.google.gson.C5030i;
import com.google.gson.C5049j;
import com.google.gson.C5051l;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import p367u5.C7194y;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.internal.bind.f */
/* JADX INFO: loaded from: classes.dex */
class C5036f extends AbstractC5059s {

    /* JADX INFO: renamed from: a */
    static final C5036f f19106a = new C5036f();

    /* JADX INFO: renamed from: com.google.gson.internal.bind.f$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f19107a;

        static {
            int[] iArr = new int[EnumC7416b.values().length];
            f19107a = iArr;
            try {
                iArr[EnumC7416b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19107a[EnumC7416b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19107a[EnumC7416b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19107a[EnumC7416b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19107a[EnumC7416b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19107a[EnumC7416b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private C5036f() {
    }

    /* JADX INFO: renamed from: f */
    private AbstractC5028g m22673f(C7415a c7415a, EnumC7416b enumC7416b) throws IOException {
        int i7 = a.f19107a[enumC7416b.ordinal()];
        if (i7 == 3) {
            return new C5051l(c7415a.m32822b1());
        }
        if (i7 == 4) {
            return new C5051l(new C7194y(c7415a.m32822b1()));
        }
        if (i7 == 5) {
            return new C5051l(Boolean.valueOf(c7415a.m32816T0()));
        }
        if (i7 == 6) {
            c7415a.m32821Z0();
            return C5030i.f19086a;
        }
        throw new IllegalStateException("Unexpected token: " + enumC7416b);
    }

    /* JADX INFO: renamed from: g */
    private AbstractC5028g m22674g(C7415a c7415a, EnumC7416b enumC7416b) throws IOException {
        int i7 = a.f19107a[enumC7416b.ordinal()];
        if (i7 == 1) {
            c7415a.m32827m();
            return new C5027f();
        }
        if (i7 != 2) {
            return null;
        }
        c7415a.m32828n();
        return new C5049j();
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC5028g mo22636b(C7415a c7415a) throws IOException {
        EnumC7416b enumC7416bM32824d1 = c7415a.m32824d1();
        AbstractC5028g abstractC5028gM22674g = m22674g(c7415a, enumC7416bM32824d1);
        if (abstractC5028gM22674g == null) {
            return m22673f(c7415a, enumC7416bM32824d1);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c7415a.m32812K0()) {
                String strM32820X0 = abstractC5028gM22674g instanceof C5049j ? c7415a.m32820X0() : null;
                EnumC7416b enumC7416bM32824d2 = c7415a.m32824d1();
                AbstractC5028g abstractC5028gM22674g2 = m22674g(c7415a, enumC7416bM32824d2);
                boolean z7 = abstractC5028gM22674g2 != null;
                if (abstractC5028gM22674g2 == null) {
                    abstractC5028gM22674g2 = m22673f(c7415a, enumC7416bM32824d2);
                }
                if (abstractC5028gM22674g instanceof C5027f) {
                    ((C5027f) abstractC5028gM22674g).m22651n(abstractC5028gM22674g2);
                } else {
                    ((C5049j) abstractC5028gM22674g).m22789n(strM32820X0, abstractC5028gM22674g2);
                }
                if (z7) {
                    arrayDeque.addLast(abstractC5028gM22674g);
                    abstractC5028gM22674g = abstractC5028gM22674g2;
                }
            } else {
                if (abstractC5028gM22674g instanceof C5027f) {
                    c7415a.m32823d0();
                } else {
                    c7415a.m32826k0();
                }
                if (arrayDeque.isEmpty()) {
                    return abstractC5028gM22674g;
                }
                abstractC5028gM22674g = (AbstractC5028g) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo22637d(C7417c c7417c, AbstractC5028g abstractC5028g) throws IOException {
        if (abstractC5028g == null || abstractC5028g.m22656j()) {
            c7417c.mo22681R0();
            return;
        }
        if (abstractC5028g.m22658m()) {
            C5051l c5051lM22654e = abstractC5028g.m22654e();
            if (c5051lM22654e.m22792A()) {
                c7417c.mo22686e1(c5051lM22654e.m22798w());
                return;
            } else if (c5051lM22654e.m22800y()) {
                c7417c.mo22688g1(c5051lM22654e.m22796q());
                return;
            } else {
                c7417c.mo22687f1(c5051lM22654e.m22799x());
                return;
            }
        }
        if (abstractC5028g.m22655g()) {
            c7417c.mo22691x();
            Iterator it = abstractC5028g.m22652a().iterator();
            while (it.hasNext()) {
                mo22637d(c7417c, (AbstractC5028g) it.next());
            }
            c7417c.mo22684d0();
            return;
        }
        if (!abstractC5028g.m22657k()) {
            throw new IllegalArgumentException("Couldn't write " + abstractC5028g.getClass());
        }
        c7417c.mo22679J();
        for (Map.Entry entry : abstractC5028g.m22653b().m22790p()) {
            c7417c.mo22680K0((String) entry.getKey());
            mo22637d(c7417c, (AbstractC5028g) entry.getValue());
        }
        c7417c.mo22690k0();
    }
}
