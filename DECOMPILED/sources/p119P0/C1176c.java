package p119P0;

import androidx.lifecycle.C2611C;
import androidx.work.impl.utils.futures.C2913c;
import p112O0.InterfaceC1100m;

/* JADX INFO: renamed from: P0.c */
/* JADX INFO: loaded from: classes.dex */
public class C1176c implements InterfaceC1100m {

    /* JADX INFO: renamed from: c */
    private final C2611C f4141c = new C2611C();

    /* JADX INFO: renamed from: d */
    private final C2913c f4142d = C2913c.m14629s();

    public C1176c() {
        m5124a(InterfaceC1100m.f3963b);
    }

    /* JADX INFO: renamed from: a */
    public void m5124a(InterfaceC1100m.b bVar) {
        this.f4141c.mo12525o(bVar);
        if (bVar instanceof InterfaceC1100m.b.c) {
            this.f4142d.mo14619o((InterfaceC1100m.b.c) bVar);
        } else if (bVar instanceof InterfaceC1100m.b.a) {
            this.f4142d.mo14620p(((InterfaceC1100m.b.a) bVar).m4857a());
        }
    }
}
