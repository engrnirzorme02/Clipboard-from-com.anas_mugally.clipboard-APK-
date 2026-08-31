package p137R4;

import java.util.ArrayList;
import java.util.List;
import p158U4.AbstractC1701y;
import p158U4.C1687k;
import p158U4.C1693q;
import p158U4.InterfaceC1684h;
import p186Y4.AbstractC2034b;
import p351s5.C7039u;

/* JADX INFO: renamed from: R4.C */
/* JADX INFO: loaded from: classes.dex */
public class C1335C extends C1369p {

    /* JADX INFO: renamed from: d */
    private final List f4660d;

    /* JADX WARN: Illegal instructions before constructor call */
    C1335C(C1693q c1693q, C7039u c7039u) {
        C1369p.b bVar = C1369p.b.IN;
        super(c1693q, bVar, c7039u);
        ArrayList arrayList = new ArrayList();
        this.f4660d = arrayList;
        arrayList.addAll(m5718k(bVar, c7039u));
    }

    /* JADX INFO: renamed from: k */
    static List m5718k(C1369p.b bVar, C7039u c7039u) {
        AbstractC2034b.m8460d(bVar == C1369p.b.IN || bVar == C1369p.b.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        AbstractC2034b.m8460d(AbstractC1701y.m7193u(c7039u), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (C7039u c7039u2 : c7039u.m31034l0().mo30668g()) {
            AbstractC2034b.m8460d(AbstractC1701y.m7165C(c7039u2), "Comparing on key with " + bVar.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(C1687k.m7087k(c7039u2.m31041t0()));
        }
        return arrayList;
    }

    @Override // p137R4.C1369p, p137R4.AbstractC1370q
    /* JADX INFO: renamed from: d */
    public boolean mo5717d(InterfaceC1684h interfaceC1684h) {
        return this.f4660d.contains(interfaceC1684h.getKey());
    }
}
