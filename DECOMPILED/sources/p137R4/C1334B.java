package p137R4;

import p158U4.AbstractC1701y;
import p158U4.C1687k;
import p158U4.C1693q;
import p158U4.InterfaceC1684h;
import p186Y4.AbstractC2034b;
import p351s5.C7039u;

/* JADX INFO: renamed from: R4.B */
/* JADX INFO: loaded from: classes.dex */
public class C1334B extends C1369p {

    /* JADX INFO: renamed from: d */
    private final C1687k f4659d;

    C1334B(C1693q c1693q, C1369p.b bVar, C7039u c7039u) {
        super(c1693q, bVar, c7039u);
        AbstractC2034b.m8460d(AbstractC1701y.m7165C(c7039u), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.f4659d = C1687k.m7087k(m5924h().m31041t0());
    }

    @Override // p137R4.C1369p, p137R4.AbstractC1370q
    /* JADX INFO: renamed from: d */
    public boolean mo5717d(InterfaceC1684h interfaceC1684h) {
        return m5926j(interfaceC1684h.getKey().compareTo(this.f4659d));
    }
}
