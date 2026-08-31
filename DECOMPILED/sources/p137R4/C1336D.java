package p137R4;

import java.util.ArrayList;
import java.util.List;
import p158U4.C1693q;
import p158U4.InterfaceC1684h;
import p351s5.C7039u;

/* JADX INFO: renamed from: R4.D */
/* JADX INFO: loaded from: classes.dex */
public class C1336D extends C1369p {

    /* JADX INFO: renamed from: d */
    private final List f4661d;

    /* JADX WARN: Illegal instructions before constructor call */
    C1336D(C1693q c1693q, C7039u c7039u) {
        C1369p.b bVar = C1369p.b.NOT_IN;
        super(c1693q, bVar, c7039u);
        ArrayList arrayList = new ArrayList();
        this.f4661d = arrayList;
        arrayList.addAll(C1335C.m5718k(bVar, c7039u));
    }

    @Override // p137R4.C1369p, p137R4.AbstractC1370q
    /* JADX INFO: renamed from: d */
    public boolean mo5717d(InterfaceC1684h interfaceC1684h) {
        return !this.f4661d.contains(interfaceC1684h.getKey());
    }
}
