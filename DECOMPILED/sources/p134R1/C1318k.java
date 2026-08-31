package p134R1;

import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.InterfaceC2613E;
import androidx.lifecycle.InterfaceC2656r;
import androidx.lifecycle.InterfaceC2657s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: R1.k */
/* JADX INFO: loaded from: classes.dex */
final class C1318k implements InterfaceC1317j, InterfaceC2656r {

    /* JADX INFO: renamed from: a */
    private final Set f4606a = new HashSet();

    /* JADX INFO: renamed from: b */
    private final AbstractC2650l f4607b;

    C1318k(AbstractC2650l abstractC2650l) {
        this.f4607b = abstractC2650l;
        abstractC2650l.mo12625a(this);
    }

    @Override // p134R1.InterfaceC1317j
    /* JADX INFO: renamed from: a */
    public void mo5648a(InterfaceC1319l interfaceC1319l) {
        this.f4606a.add(interfaceC1319l);
        if (this.f4607b.mo12626b() == AbstractC2650l.b.DESTROYED) {
            interfaceC1319l.onDestroy();
        } else if (this.f4607b.mo12626b().m12634d(AbstractC2650l.b.STARTED)) {
            interfaceC1319l.mo5654a();
        } else {
            interfaceC1319l.mo5655e();
        }
    }

    @Override // p134R1.InterfaceC1317j
    /* JADX INFO: renamed from: b */
    public void mo5649b(InterfaceC1319l interfaceC1319l) {
        this.f4606a.remove(interfaceC1319l);
    }

    @InterfaceC2613E(AbstractC2650l.a.ON_DESTROY)
    public void onDestroy(InterfaceC2657s interfaceC2657s) {
        Iterator it = AbstractC2023l.m8419j(this.f4606a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1319l) it.next()).onDestroy();
        }
        interfaceC2657s.mo419P().mo12628d(this);
    }

    @InterfaceC2613E(AbstractC2650l.a.ON_START)
    public void onStart(InterfaceC2657s interfaceC2657s) {
        Iterator it = AbstractC2023l.m8419j(this.f4606a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1319l) it.next()).mo5654a();
        }
    }

    @InterfaceC2613E(AbstractC2650l.a.ON_STOP)
    public void onStop(InterfaceC2657s interfaceC2657s) {
        Iterator it = AbstractC2023l.m8419j(this.f4606a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1319l) it.next()).mo5655e();
        }
    }
}
