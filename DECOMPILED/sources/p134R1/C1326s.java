package p134R1;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p162V1.InterfaceC1720h;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: R1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1326s implements InterfaceC1319l {

    /* JADX INFO: renamed from: a */
    private final Set f4637a = Collections.newSetFromMap(new WeakHashMap());

    @Override // p134R1.InterfaceC1319l
    /* JADX INFO: renamed from: a */
    public void mo5654a() {
        Iterator it = AbstractC2023l.m8419j(this.f4637a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1720h) it.next()).mo5654a();
        }
    }

    @Override // p134R1.InterfaceC1319l
    /* JADX INFO: renamed from: e */
    public void mo5655e() {
        Iterator it = AbstractC2023l.m8419j(this.f4637a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1720h) it.next()).mo5655e();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m5687k() {
        this.f4637a.clear();
    }

    /* JADX INFO: renamed from: l */
    public List m5688l() {
        return AbstractC2023l.m8419j(this.f4637a);
    }

    /* JADX INFO: renamed from: m */
    public void m5689m(InterfaceC1720h interfaceC1720h) {
        this.f4637a.add(interfaceC1720h);
    }

    /* JADX INFO: renamed from: n */
    public void m5690n(InterfaceC1720h interfaceC1720h) {
        this.f4637a.remove(interfaceC1720h);
    }

    @Override // p134R1.InterfaceC1319l
    public void onDestroy() {
        Iterator it = AbstractC2023l.m8419j(this.f4637a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1720h) it.next()).onDestroy();
        }
    }
}
