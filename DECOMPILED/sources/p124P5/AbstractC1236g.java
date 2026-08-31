package p124P5;

import io.grpc.internal.C5813v0;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p063H5.AbstractC0523S;
import p063H5.AbstractC0524T;
import p063H5.C0531a;
import p063H5.C0554l0;
import p063H5.C0572x;
import p063H5.EnumC0561p;
import p122P3.AbstractC1209m;
import p129Q3.AbstractC1260B;
import p129Q3.AbstractC1272k;

/* JADX INFO: renamed from: P5.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1236g extends AbstractC0523S {

    /* JADX INFO: renamed from: l */
    private static final Logger f4350l = Logger.getLogger(AbstractC1236g.class.getName());

    /* JADX INFO: renamed from: h */
    private final AbstractC0523S.e f4352h;

    /* JADX INFO: renamed from: i */
    protected boolean f4353i;

    /* JADX INFO: renamed from: k */
    protected EnumC0561p f4355k;

    /* JADX INFO: renamed from: g */
    private final Map f4351g = new LinkedHashMap();

    /* JADX INFO: renamed from: j */
    protected final AbstractC0524T f4354j = new C5813v0();

    /* JADX INFO: renamed from: P5.g$b */
    protected static class b {

        /* JADX INFO: renamed from: a */
        public final C0554l0 f4356a;

        /* JADX INFO: renamed from: b */
        public final List f4357b;

        public b(C0554l0 c0554l0, List list) {
            this.f4356a = c0554l0;
            this.f4357b = list;
        }
    }

    /* JADX INFO: renamed from: P5.g$c */
    public class c {

        /* JADX INFO: renamed from: a */
        private final Object f4358a;

        /* JADX INFO: renamed from: b */
        private AbstractC0523S.h f4359b;

        /* JADX INFO: renamed from: c */
        private final Object f4360c;

        /* JADX INFO: renamed from: d */
        private final C1234e f4361d;

        /* JADX INFO: renamed from: e */
        private final AbstractC0524T f4362e;

        /* JADX INFO: renamed from: f */
        private EnumC0561p f4363f;

        /* JADX INFO: renamed from: g */
        private AbstractC0523S.j f4364g;

        /* JADX INFO: renamed from: h */
        private boolean f4365h;

        /* JADX INFO: renamed from: P5.g$c$a */
        private final class a extends AbstractC1232c {
            private a() {
            }

            @Override // p124P5.AbstractC1232c, p063H5.AbstractC0523S.e
            /* JADX INFO: renamed from: f */
            public void mo2199f(EnumC0561p enumC0561p, AbstractC0523S.j jVar) {
                if (AbstractC1236g.this.f4351g.containsKey(c.this.f4358a)) {
                    c.this.f4363f = enumC0561p;
                    c.this.f4364g = jVar;
                    if (c.this.f4365h) {
                        return;
                    }
                    AbstractC1236g abstractC1236g = AbstractC1236g.this;
                    if (abstractC1236g.f4353i) {
                        return;
                    }
                    if (enumC0561p == EnumC0561p.IDLE && abstractC1236g.m5380t()) {
                        c.this.f4361d.mo2177e();
                    }
                    AbstractC1236g.this.mo5382v();
                }
            }

            @Override // p124P5.AbstractC1232c
            /* JADX INFO: renamed from: g */
            protected AbstractC0523S.e mo5353g() {
                return AbstractC1236g.this.f4352h;
            }
        }

        public c(AbstractC1236g abstractC1236g, Object obj, AbstractC0524T abstractC0524T, Object obj2, AbstractC0523S.j jVar) {
            this(obj, abstractC0524T, obj2, jVar, null, false);
        }

        /* JADX INFO: renamed from: f */
        protected void m5388f() {
            if (this.f4365h) {
                return;
            }
            AbstractC1236g.this.f4351g.remove(this.f4358a);
            this.f4365h = true;
            AbstractC1236g.f4350l.log(Level.FINE, "Child balancer {0} deactivated", this.f4358a);
        }

        /* JADX INFO: renamed from: g */
        Object m5389g() {
            return this.f4360c;
        }

        /* JADX INFO: renamed from: h */
        public AbstractC0523S.j m5390h() {
            return this.f4364g;
        }

        /* JADX INFO: renamed from: i */
        public EnumC0561p m5391i() {
            return this.f4363f;
        }

        /* JADX INFO: renamed from: j */
        public AbstractC0524T m5392j() {
            return this.f4362e;
        }

        /* JADX INFO: renamed from: k */
        public boolean m5393k() {
            return this.f4365h;
        }

        /* JADX INFO: renamed from: l */
        protected void m5394l(AbstractC0524T abstractC0524T) {
            this.f4365h = false;
        }

        /* JADX INFO: renamed from: m */
        protected void m5395m(AbstractC0523S.h hVar) {
            AbstractC1209m.m5303o(hVar, "Missing address list for child");
            this.f4359b = hVar;
        }

        /* JADX INFO: renamed from: n */
        protected void m5396n() {
            this.f4361d.mo2178f();
            this.f4363f = EnumC0561p.SHUTDOWN;
            AbstractC1236g.f4350l.log(Level.FINE, "Child balancer {0} deleted", this.f4358a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Address = ");
            sb.append(this.f4358a);
            sb.append(", state = ");
            sb.append(this.f4363f);
            sb.append(", picker type: ");
            sb.append(this.f4364g.getClass());
            sb.append(", lb: ");
            sb.append(this.f4361d.mo5352g().getClass());
            sb.append(this.f4365h ? ", deactivated" : "");
            return sb.toString();
        }

        public c(Object obj, AbstractC0524T abstractC0524T, Object obj2, AbstractC0523S.j jVar, AbstractC0523S.h hVar, boolean z7) {
            this.f4358a = obj;
            this.f4362e = abstractC0524T;
            this.f4365h = z7;
            this.f4364g = jVar;
            this.f4360c = obj2;
            C1234e c1234e = new C1234e(new a());
            this.f4361d = c1234e;
            this.f4363f = z7 ? EnumC0561p.IDLE : EnumC0561p.CONNECTING;
            this.f4359b = hVar;
            if (z7) {
                return;
            }
            c1234e.m5365r(abstractC0524T);
        }
    }

    /* JADX INFO: renamed from: P5.g$d */
    protected static class d {

        /* JADX INFO: renamed from: a */
        final String[] f4368a;

        /* JADX INFO: renamed from: b */
        final int f4369b;

        public d(C0572x c0572x) {
            AbstractC1209m.m5303o(c0572x, "eag");
            this.f4368a = new String[c0572x.m2533a().size()];
            Iterator it = c0572x.m2533a().iterator();
            int i7 = 0;
            while (it.hasNext()) {
                this.f4368a[i7] = ((SocketAddress) it.next()).toString();
                i7++;
            }
            Arrays.sort(this.f4368a);
            this.f4369b = Arrays.hashCode(this.f4368a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (dVar.f4369b == this.f4369b) {
                String[] strArr = dVar.f4368a;
                int length = strArr.length;
                String[] strArr2 = this.f4368a;
                if (length == strArr2.length) {
                    return Arrays.equals(strArr, strArr2);
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f4369b;
        }

        public String toString() {
            return Arrays.toString(this.f4368a);
        }
    }

    protected AbstractC1236g(AbstractC0523S.e eVar) {
        this.f4352h = (AbstractC0523S.e) AbstractC1209m.m5303o(eVar, "helper");
        f4350l.log(Level.FINE, "Created");
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: a */
    public C0554l0 mo2173a(AbstractC0523S.h hVar) {
        try {
            this.f4353i = true;
            b bVarM5370g = m5370g(hVar);
            if (!bVarM5370g.f4356a.m2460o()) {
                return bVarM5370g.f4356a;
            }
            mo5382v();
            m5381u(bVarM5370g.f4357b);
            return bVarM5370g.f4356a;
        } finally {
            this.f4353i = false;
        }
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: c */
    public void mo2175c(C0554l0 c0554l0) {
        if (this.f4355k != EnumC0561p.READY) {
            this.f4352h.mo2199f(EnumC0561p.TRANSIENT_FAILURE, m5375o(c0554l0));
        }
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: f */
    public void mo2178f() {
        f4350l.log(Level.FINE, "Shutdown");
        Iterator it = this.f4351g.values().iterator();
        while (it.hasNext()) {
            ((c) it.next()).m5396n();
        }
        this.f4351g.clear();
    }

    /* JADX INFO: renamed from: g */
    protected b m5370g(AbstractC0523S.h hVar) {
        f4350l.log(Level.FINE, "Received resolution result: {0}", hVar);
        Map mapM5371k = m5371k(hVar);
        if (mapM5371k.isEmpty()) {
            C0554l0 c0554l0M2462q = C0554l0.f2113t.m2462q("NameResolver returned no usable address. " + hVar);
            mo2175c(c0554l0M2462q);
            return new b(c0554l0M2462q, null);
        }
        for (Map.Entry entry : mapM5371k.entrySet()) {
            Object key = entry.getKey();
            AbstractC0524T abstractC0524TM5392j = ((c) entry.getValue()).m5392j();
            Object objM5389g = ((c) entry.getValue()).m5389g();
            if (this.f4351g.containsKey(key)) {
                c cVar = (c) this.f4351g.get(key);
                if (cVar.m5393k() && m5379s()) {
                    cVar.m5394l(abstractC0524TM5392j);
                }
            } else {
                this.f4351g.put(key, (c) entry.getValue());
            }
            c cVar2 = (c) this.f4351g.get(key);
            AbstractC0523S.h hVarM5373m = m5373m(key, hVar, objM5389g);
            ((c) this.f4351g.get(key)).m5395m(hVarM5373m);
            if (!cVar2.f4365h) {
                cVar2.f4361d.mo2176d(hVarM5373m);
            }
        }
        ArrayList arrayList = new ArrayList();
        AbstractC1260B it = AbstractC1272k.m5535v(this.f4351g.keySet()).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!mapM5371k.containsKey(next)) {
                c cVar3 = (c) this.f4351g.get(next);
                cVar3.m5388f();
                arrayList.add(cVar3);
            }
        }
        return new b(C0554l0.f2098e, arrayList);
    }

    /* JADX INFO: renamed from: k */
    protected Map m5371k(AbstractC0523S.h hVar) {
        HashMap map = new HashMap();
        Iterator it = hVar.m2213a().iterator();
        while (it.hasNext()) {
            d dVar = new d((C0572x) it.next());
            c cVar = (c) this.f4351g.get(dVar);
            if (cVar != null) {
                map.put(dVar, cVar);
            } else {
                map.put(dVar, m5372l(dVar, null, m5377q(), hVar));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: l */
    protected c m5372l(Object obj, Object obj2, AbstractC0523S.j jVar, AbstractC0523S.h hVar) {
        return new c(this, obj, this.f4354j, obj2, jVar);
    }

    /* JADX INFO: renamed from: m */
    protected AbstractC0523S.h m5373m(Object obj, AbstractC0523S.h hVar, Object obj2) {
        d dVar;
        if (obj instanceof C0572x) {
            dVar = new d((C0572x) obj);
        } else {
            AbstractC1209m.m5293e(obj instanceof d, "key is wrong type");
            dVar = (d) obj;
        }
        for (C0572x c0572x : hVar.m2213a()) {
            if (dVar.equals(new d(c0572x))) {
                AbstractC1209m.m5303o(c0572x, obj + " no longer present in load balancer children");
                return hVar.m2216e().m2218b(Collections.singletonList(c0572x)).m2219c(C0531a.m2312c().m2318d(AbstractC0523S.f1944e, Boolean.TRUE).m2316a()).m2220d(obj2).m2217a();
            }
        }
        c0572x = null;
        AbstractC1209m.m5303o(c0572x, obj + " no longer present in load balancer children");
        return hVar.m2216e().m2218b(Collections.singletonList(c0572x)).m2219c(C0531a.m2312c().m2318d(AbstractC0523S.f1944e, Boolean.TRUE).m2316a()).m2220d(obj2).m2217a();
    }

    /* JADX INFO: renamed from: n */
    protected Collection m5374n() {
        return this.f4351g.values();
    }

    /* JADX INFO: renamed from: o */
    protected AbstractC0523S.j m5375o(C0554l0 c0554l0) {
        return new AbstractC0523S.d(AbstractC0523S.f.m2201f(c0554l0));
    }

    /* JADX INFO: renamed from: p */
    protected AbstractC0523S.e m5376p() {
        return this.f4352h;
    }

    /* JADX INFO: renamed from: q */
    protected AbstractC0523S.j m5377q() {
        return new AbstractC0523S.d(AbstractC0523S.f.m2202g());
    }

    /* JADX INFO: renamed from: r */
    protected List m5378r() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : m5374n()) {
            if (!cVar.m5393k() && cVar.m5391i() == EnumC0561p.READY) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    protected boolean m5379s() {
        return true;
    }

    /* JADX INFO: renamed from: t */
    protected boolean m5380t() {
        return true;
    }

    /* JADX INFO: renamed from: u */
    protected void m5381u(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((c) it.next()).m5396n();
        }
    }

    /* JADX INFO: renamed from: v */
    protected abstract void mo5382v();
}
