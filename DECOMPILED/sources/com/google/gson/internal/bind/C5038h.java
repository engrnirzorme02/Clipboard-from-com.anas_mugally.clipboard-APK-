package com.google.gson.internal.bind;

import com.google.gson.AbstractC5028g;
import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.C5051l;
import com.google.gson.C5052m;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p367u5.AbstractC7167F;
import p367u5.AbstractC7191v;
import p367u5.AbstractC7193x;
import p367u5.C7189t;
import p367u5.InterfaceC7163B;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.internal.bind.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5038h implements InterfaceC5060t {

    /* JADX INFO: renamed from: a */
    private final C7189t f19113a;

    /* JADX INFO: renamed from: b */
    final boolean f19114b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.h$a */
    private final class a extends AbstractC5059s {

        /* JADX INFO: renamed from: a */
        private final AbstractC5059s f19115a;

        /* JADX INFO: renamed from: b */
        private final AbstractC5059s f19116b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC7163B f19117c;

        a(AbstractC5059s abstractC5059s, AbstractC5059s abstractC5059s2, InterfaceC7163B interfaceC7163B) {
            this.f19115a = abstractC5059s;
            this.f19116b = abstractC5059s2;
            this.f19117c = interfaceC7163B;
        }

        /* JADX INFO: renamed from: e */
        private String m22693e(AbstractC5028g abstractC5028g) {
            if (!abstractC5028g.m22658m()) {
                if (abstractC5028g.m22656j()) {
                    return "null";
                }
                throw new AssertionError();
            }
            C5051l c5051lM22654e = abstractC5028g.m22654e();
            if (c5051lM22654e.m22792A()) {
                return String.valueOf(c5051lM22654e.m22798w());
            }
            if (c5051lM22654e.m22800y()) {
                return Boolean.toString(c5051lM22654e.m22796q());
            }
            if (c5051lM22654e.m22793B()) {
                return c5051lM22654e.m22799x();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map mo22636b(C7415a c7415a) throws IOException {
            EnumC7416b enumC7416bM32824d1 = c7415a.m32824d1();
            if (enumC7416bM32824d1 == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            Map map = (Map) this.f19117c.mo31666a();
            if (enumC7416bM32824d1 != EnumC7416b.BEGIN_ARRAY) {
                c7415a.m32828n();
                while (c7415a.m32812K0()) {
                    AbstractC7193x.f28678a.mo31746a(c7415a);
                    Object objMo22636b = this.f19115a.mo22636b(c7415a);
                    if (map.put(objMo22636b, this.f19116b.mo22636b(c7415a)) != null) {
                        throw new C5052m("duplicate key: " + objMo22636b);
                    }
                }
                c7415a.m32826k0();
                return map;
            }
            c7415a.m32827m();
            while (c7415a.m32812K0()) {
                c7415a.m32827m();
                Object objMo22636b2 = this.f19115a.mo22636b(c7415a);
                if (map.put(objMo22636b2, this.f19116b.mo22636b(c7415a)) != null) {
                    throw new C5052m("duplicate key: " + objMo22636b2);
                }
                c7415a.m32823d0();
            }
            c7415a.m32823d0();
            return map;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Map map) throws IOException {
            if (map == null) {
                c7417c.mo22681R0();
                return;
            }
            if (!C5038h.this.f19114b) {
                c7417c.mo22679J();
                for (Map.Entry entry : map.entrySet()) {
                    c7417c.mo22680K0(String.valueOf(entry.getKey()));
                    this.f19116b.mo22637d(c7417c, entry.getValue());
                }
                c7417c.mo22690k0();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i7 = 0;
            boolean z7 = false;
            for (Map.Entry entry2 : map.entrySet()) {
                AbstractC5028g abstractC5028gM22817c = this.f19115a.m22817c(entry2.getKey());
                arrayList.add(abstractC5028gM22817c);
                arrayList2.add(entry2.getValue());
                z7 |= abstractC5028gM22817c.m22655g() || abstractC5028gM22817c.m22657k();
            }
            if (!z7) {
                c7417c.mo22679J();
                int size = arrayList.size();
                while (i7 < size) {
                    c7417c.mo22680K0(m22693e((AbstractC5028g) arrayList.get(i7)));
                    this.f19116b.mo22637d(c7417c, arrayList2.get(i7));
                    i7++;
                }
                c7417c.mo22690k0();
                return;
            }
            c7417c.mo22691x();
            int size2 = arrayList.size();
            while (i7 < size2) {
                c7417c.mo22691x();
                AbstractC7167F.m31675a((AbstractC5028g) arrayList.get(i7), c7417c);
                this.f19116b.mo22637d(c7417c, arrayList2.get(i7));
                c7417c.mo22684d0();
                i7++;
            }
            c7417c.mo22684d0();
        }
    }

    public C5038h(C7189t c7189t, boolean z7) {
        this.f19113a = c7189t;
        this.f19114b = z7;
    }

    /* JADX INFO: renamed from: b */
    private AbstractC5059s m22692b(C5026e c5026e, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? AbstractC5044n.f19185f : c5026e.m22624l(C5058a.m22810b(type));
    }

    @Override // com.google.gson.InterfaceC5060t
    /* JADX INFO: renamed from: a */
    public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
        Type typeM22815d = c5058a.m22815d();
        Class clsM22814c = c5058a.m22814c();
        if (!Map.class.isAssignableFrom(clsM22814c)) {
            return null;
        }
        Type[] typeArrM31728j = AbstractC7191v.m31728j(typeM22815d, clsM22814c);
        Type type = typeArrM31728j[0];
        Type type2 = typeArrM31728j[1];
        return new a(new C5043m(c5026e, m22692b(c5026e, type), type), new C5043m(c5026e, c5026e.m22624l(C5058a.m22810b(type2)), type2), this.f19113a.m31710u(c5058a, false));
    }
}
