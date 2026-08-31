package io.grpc.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p063H5.AbstractC0512G;
import p063H5.AbstractC0523S;
import p063H5.C0532a0;
import p063H5.C0535c;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1205i;
import p122P3.AbstractC1209m;
import p122P3.AbstractC1213q;

/* JADX INFO: renamed from: io.grpc.internal.k0 */
/* JADX INFO: loaded from: classes.dex */
final class C5791k0 {

    /* JADX INFO: renamed from: a */
    private final b f22713a;

    /* JADX INFO: renamed from: b */
    private final Map f22714b;

    /* JADX INFO: renamed from: c */
    private final Map f22715c;

    /* JADX INFO: renamed from: d */
    private final AbstractC5727C0.D f22716d;

    /* JADX INFO: renamed from: e */
    private final Object f22717e;

    /* JADX INFO: renamed from: f */
    private final Map f22718f;

    /* JADX INFO: renamed from: io.grpc.internal.k0$b */
    static final class b {

        /* JADX INFO: renamed from: g */
        static final C0535c.c f22719g = C0535c.c.m2365b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* JADX INFO: renamed from: a */
        final Long f22720a;

        /* JADX INFO: renamed from: b */
        final Boolean f22721b;

        /* JADX INFO: renamed from: c */
        final Integer f22722c;

        /* JADX INFO: renamed from: d */
        final Integer f22723d;

        /* JADX INFO: renamed from: e */
        final C5729D0 f22724e;

        /* JADX INFO: renamed from: f */
        final C5761U f22725f;

        b(Map map, boolean z7, int i7, int i8) {
            this.f22720a = AbstractC5743K0.m25624w(map);
            this.f22721b = AbstractC5743K0.m25625x(map);
            Integer numM25613l = AbstractC5743K0.m25613l(map);
            this.f22722c = numM25613l;
            if (numM25613l != null) {
                AbstractC1209m.m5298j(numM25613l.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numM25613l);
            }
            Integer numM25612k = AbstractC5743K0.m25612k(map);
            this.f22723d = numM25612k;
            if (numM25612k != null) {
                AbstractC1209m.m5298j(numM25612k.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numM25612k);
            }
            Map mapM25619r = z7 ? AbstractC5743K0.m25619r(map) : null;
            this.f22724e = mapM25619r == null ? null : m26055b(mapM25619r, i7);
            Map mapM25605d = z7 ? AbstractC5743K0.m25605d(map) : null;
            this.f22725f = mapM25605d != null ? m26054a(mapM25605d, i8) : null;
        }

        /* JADX INFO: renamed from: a */
        private static C5761U m26054a(Map map, int i7) {
            int iIntValue = ((Integer) AbstractC1209m.m5303o(AbstractC5743K0.m25609h(map), "maxAttempts cannot be empty")).intValue();
            AbstractC1209m.m5296h(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i7);
            long jLongValue = ((Long) AbstractC1209m.m5303o(AbstractC5743K0.m25604c(map), "hedgingDelay cannot be empty")).longValue();
            AbstractC1209m.m5297i(jLongValue >= 0, "hedgingDelay must not be negative: %s", jLongValue);
            return new C5761U(iMin, jLongValue, AbstractC5743K0.m25617p(map));
        }

        /* JADX INFO: renamed from: b */
        private static C5729D0 m26055b(Map map, int i7) {
            int iIntValue = ((Integer) AbstractC1209m.m5303o(AbstractC5743K0.m25610i(map), "maxAttempts cannot be empty")).intValue();
            AbstractC1209m.m5296h(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i7);
            long jLongValue = ((Long) AbstractC1209m.m5303o(AbstractC5743K0.m25606e(map), "initialBackoff cannot be empty")).longValue();
            AbstractC1209m.m5297i(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            long jLongValue2 = ((Long) AbstractC1209m.m5303o(AbstractC5743K0.m25611j(map), "maxBackoff cannot be empty")).longValue();
            AbstractC1209m.m5297i(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double d7 = (Double) AbstractC1209m.m5303o(AbstractC5743K0.m25602a(map), "backoffMultiplier cannot be empty");
            double dDoubleValue = d7.doubleValue();
            AbstractC1209m.m5298j(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", d7);
            Long lM25618q = AbstractC5743K0.m25618q(map);
            AbstractC1209m.m5298j(lM25618q == null || lM25618q.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lM25618q);
            Set setM25620s = AbstractC5743K0.m25620s(map);
            AbstractC1209m.m5293e((lM25618q == null && setM25620s.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new C5729D0(iMin, jLongValue, jLongValue2, dDoubleValue, lM25618q, setM25620s);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC1205i.m5282a(this.f22720a, bVar.f22720a) && AbstractC1205i.m5282a(this.f22721b, bVar.f22721b) && AbstractC1205i.m5282a(this.f22722c, bVar.f22722c) && AbstractC1205i.m5282a(this.f22723d, bVar.f22723d) && AbstractC1205i.m5282a(this.f22724e, bVar.f22724e) && AbstractC1205i.m5282a(this.f22725f, bVar.f22725f);
        }

        public int hashCode() {
            return AbstractC1205i.m5283b(this.f22720a, this.f22721b, this.f22722c, this.f22723d, this.f22724e, this.f22725f);
        }

        public String toString() {
            return AbstractC1203g.m5267b(this).m5277d("timeoutNanos", this.f22720a).m5277d("waitForReady", this.f22721b).m5277d("maxInboundMessageSize", this.f22722c).m5277d("maxOutboundMessageSize", this.f22723d).m5277d("retryPolicy", this.f22724e).m5277d("hedgingPolicy", this.f22725f).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.k0$c */
    static final class c extends AbstractC0512G {

        /* JADX INFO: renamed from: b */
        final C5791k0 f22726b;

        @Override // p063H5.AbstractC0512G
        /* JADX INFO: renamed from: a */
        public AbstractC0512G.b mo2151a(AbstractC0523S.g gVar) {
            return AbstractC0512G.b.m2152d().m2157b(this.f22726b).m2156a();
        }

        private c(C5791k0 c5791k0) {
            this.f22726b = c5791k0;
        }
    }

    C5791k0(b bVar, Map map, Map map2, AbstractC5727C0.D d7, Object obj, Map map3) {
        this.f22713a = bVar;
        this.f22714b = Collections.unmodifiableMap(new HashMap(map));
        this.f22715c = Collections.unmodifiableMap(new HashMap(map2));
        this.f22716d = d7;
        this.f22717e = obj;
        this.f22718f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: renamed from: a */
    static C5791k0 m26047a() {
        return new C5791k0(null, new HashMap(), new HashMap(), null, null, null);
    }

    /* JADX INFO: renamed from: b */
    static C5791k0 m26048b(Map map, boolean z7, int i7, int i8, Object obj) {
        AbstractC5727C0.D dM25623v = z7 ? AbstractC5743K0.m25623v(map) : null;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapM25603b = AbstractC5743K0.m25603b(map);
        List<Map> listM25614m = AbstractC5743K0.m25614m(map);
        if (listM25614m == null) {
            return new C5791k0(null, map2, map3, dM25623v, obj, mapM25603b);
        }
        b bVar = null;
        for (Map map4 : listM25614m) {
            b bVar2 = new b(map4, z7, i7, i8);
            List<Map> listM25616o = AbstractC5743K0.m25616o(map4);
            if (listM25616o != null && !listM25616o.isEmpty()) {
                for (Map map5 : listM25616o) {
                    String strM25621t = AbstractC5743K0.m25621t(map5);
                    String strM25615n = AbstractC5743K0.m25615n(map5);
                    if (AbstractC1213q.m5323a(strM25621t)) {
                        AbstractC1209m.m5298j(AbstractC1213q.m5323a(strM25615n), "missing service name for method %s", strM25615n);
                        AbstractC1209m.m5298j(bVar == null, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else if (AbstractC1213q.m5323a(strM25615n)) {
                        AbstractC1209m.m5298j(!map3.containsKey(strM25621t), "Duplicate service %s", strM25621t);
                        map3.put(strM25621t, bVar2);
                    } else {
                        String strM2321b = C0532a0.m2321b(strM25621t, strM25615n);
                        AbstractC1209m.m5298j(!map2.containsKey(strM2321b), "Duplicate method name %s", strM2321b);
                        map2.put(strM2321b, bVar2);
                    }
                }
            }
        }
        return new C5791k0(bVar, map2, map3, dM25623v, obj, mapM25603b);
    }

    /* JADX INFO: renamed from: c */
    AbstractC0512G m26049c() {
        if (this.f22715c.isEmpty() && this.f22714b.isEmpty() && this.f22713a == null) {
            return null;
        }
        return new c();
    }

    /* JADX INFO: renamed from: d */
    Map m26050d() {
        return this.f22718f;
    }

    /* JADX INFO: renamed from: e */
    Object m26051e() {
        return this.f22717e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5791k0.class == obj.getClass()) {
            C5791k0 c5791k0 = (C5791k0) obj;
            if (AbstractC1205i.m5282a(this.f22713a, c5791k0.f22713a) && AbstractC1205i.m5282a(this.f22714b, c5791k0.f22714b) && AbstractC1205i.m5282a(this.f22715c, c5791k0.f22715c) && AbstractC1205i.m5282a(this.f22716d, c5791k0.f22716d) && AbstractC1205i.m5282a(this.f22717e, c5791k0.f22717e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    b m26052f(C0532a0 c0532a0) {
        b bVar = (b) this.f22714b.get(c0532a0.m2324c());
        if (bVar == null) {
            bVar = (b) this.f22715c.get(c0532a0.m2325d());
        }
        return bVar == null ? this.f22713a : bVar;
    }

    /* JADX INFO: renamed from: g */
    AbstractC5727C0.D m26053g() {
        return this.f22716d;
    }

    public int hashCode() {
        return AbstractC1205i.m5283b(this.f22713a, this.f22714b, this.f22715c, this.f22716d, this.f22717e);
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("defaultMethodConfig", this.f22713a).m5277d("serviceMethodMap", this.f22714b).m5277d("serviceMap", this.f22715c).m5277d("retryThrottling", this.f22716d).m5277d("loadBalancingConfig", this.f22717e).toString();
    }
}
