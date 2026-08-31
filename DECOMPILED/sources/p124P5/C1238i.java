package p124P5;

import io.grpc.internal.AbstractC5743K0;
import io.grpc.internal.AbstractC5775c0;
import io.grpc.internal.InterfaceC5756R0;
import java.util.List;
import java.util.Map;
import p063H5.AbstractC0523S;
import p063H5.AbstractC0524T;
import p063H5.AbstractC0536c0;
import p063H5.C0525U;
import p063H5.C0554l0;

/* JADX INFO: renamed from: P5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1238i extends AbstractC0524T {
    /* JADX INFO: renamed from: f */
    private AbstractC0536c0.b m5462f(Map map) {
        Long lM25883l = AbstractC5775c0.m25883l(map, "interval");
        Long lM25883l2 = AbstractC5775c0.m25883l(map, "baseEjectionTime");
        Long lM25883l3 = AbstractC5775c0.m25883l(map, "maxEjectionTime");
        Integer numM25880i = AbstractC5775c0.m25880i(map, "maxEjectionPercentage");
        C1237h.g.a aVar = new C1237h.g.a();
        if (lM25883l != null) {
            aVar.m5437e(lM25883l);
        }
        if (lM25883l2 != null) {
            aVar.m5434b(lM25883l2);
        }
        if (lM25883l3 != null) {
            aVar.m5439g(lM25883l3);
        }
        if (numM25880i != null) {
            aVar.m5438f(numM25880i);
        }
        Map mapM25881j = AbstractC5775c0.m25881j(map, "successRateEjection");
        if (mapM25881j != null) {
            C1237h.g.c.a aVar2 = new C1237h.g.c.a();
            Integer numM25880i2 = AbstractC5775c0.m25880i(mapM25881j, "stdevFactor");
            Integer numM25880i3 = AbstractC5775c0.m25880i(mapM25881j, "enforcementPercentage");
            Integer numM25880i4 = AbstractC5775c0.m25880i(mapM25881j, "minimumHosts");
            Integer numM25880i5 = AbstractC5775c0.m25880i(mapM25881j, "requestVolume");
            if (numM25880i2 != null) {
                aVar2.m5450e(numM25880i2);
            }
            if (numM25880i3 != null) {
                aVar2.m5447b(numM25880i3);
            }
            if (numM25880i4 != null) {
                aVar2.m5448c(numM25880i4);
            }
            if (numM25880i5 != null) {
                aVar2.m5449d(numM25880i5);
            }
            aVar.m5440h(aVar2.m5446a());
        }
        Map mapM25881j2 = AbstractC5775c0.m25881j(map, "failurePercentageEjection");
        if (mapM25881j2 != null) {
            C1237h.g.b.a aVar3 = new C1237h.g.b.a();
            Integer numM25880i6 = AbstractC5775c0.m25880i(mapM25881j2, "threshold");
            Integer numM25880i7 = AbstractC5775c0.m25880i(mapM25881j2, "enforcementPercentage");
            Integer numM25880i8 = AbstractC5775c0.m25880i(mapM25881j2, "minimumHosts");
            Integer numM25880i9 = AbstractC5775c0.m25880i(mapM25881j2, "requestVolume");
            if (numM25880i6 != null) {
                aVar3.m5445e(numM25880i6);
            }
            if (numM25880i7 != null) {
                aVar3.m5442b(numM25880i7);
            }
            if (numM25880i8 != null) {
                aVar3.m5443c(numM25880i8);
            }
            if (numM25880i9 != null) {
                aVar3.m5444d(numM25880i9);
            }
            aVar.m5436d(aVar3.m5441a());
        }
        List listM25601A = AbstractC5743K0.m25601A(AbstractC5775c0.m25877f(map, "childPolicy"));
        if (listM25601A == null || listM25601A.isEmpty()) {
            return AbstractC0536c0.b.m2387b(C0554l0.f2112s.m2462q("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        AbstractC0536c0.b bVarM25626y = AbstractC5743K0.m25626y(listM25601A, C0525U.m2237b());
        if (bVarM25626y.m2389d() != null) {
            return bVarM25626y;
        }
        aVar.m5435c((AbstractC5743K0.b) bVarM25626y.m2388c());
        return AbstractC0536c0.b.m2386a(aVar.m5433a());
    }

    @Override // p063H5.AbstractC0523S.c
    /* JADX INFO: renamed from: a */
    public AbstractC0523S mo2193a(AbstractC0523S.e eVar) {
        return new C1237h(eVar, InterfaceC5756R0.f22224a);
    }

    @Override // p063H5.AbstractC0524T
    /* JADX INFO: renamed from: b */
    public String mo2232b() {
        return "outlier_detection_experimental";
    }

    @Override // p063H5.AbstractC0524T
    /* JADX INFO: renamed from: c */
    public int mo2233c() {
        return 5;
    }

    @Override // p063H5.AbstractC0524T
    /* JADX INFO: renamed from: d */
    public boolean mo2234d() {
        return true;
    }

    @Override // p063H5.AbstractC0524T
    /* JADX INFO: renamed from: e */
    public AbstractC0536c0.b mo2235e(Map map) {
        try {
            return m5462f(map);
        } catch (RuntimeException e7) {
            return AbstractC0536c0.b.m2387b(C0554l0.f2113t.m2461p(e7).m2462q("Failed parsing configuration for " + mo2232b()));
        }
    }
}
