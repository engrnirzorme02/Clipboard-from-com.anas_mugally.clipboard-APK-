package p385x;

import java.util.ArrayList;
import p361u.C7145c;

/* JADX INFO: renamed from: x.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7378m extends C7370e {

    /* JADX INFO: renamed from: L0 */
    public ArrayList f29580L0 = new ArrayList();

    /* JADX INFO: renamed from: c */
    public void m32703c(C7370e c7370e) {
        this.f29580L0.add(c7370e);
        if (c7370e.m32486K() != null) {
            ((AbstractC7378m) c7370e.m32486K()).m32705u1(c7370e);
        }
        c7370e.m32523d1(this);
    }

    /* JADX INFO: renamed from: s1 */
    public ArrayList m32704s1() {
        return this.f29580L0;
    }

    @Override // p385x.C7370e
    /* JADX INFO: renamed from: t0 */
    public void mo32563t0() {
        this.f29580L0.clear();
        super.mo32563t0();
    }

    /* JADX INFO: renamed from: t1 */
    public abstract void mo32604t1();

    /* JADX INFO: renamed from: u1 */
    public void m32705u1(C7370e c7370e) {
        this.f29580L0.remove(c7370e);
        c7370e.mo32563t0();
    }

    /* JADX INFO: renamed from: v1 */
    public void m32706v1() {
        this.f29580L0.clear();
    }

    @Override // p385x.C7370e
    /* JADX INFO: renamed from: w0 */
    public void mo32569w0(C7145c c7145c) {
        super.mo32569w0(c7145c);
        int size = this.f29580L0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C7370e) this.f29580L0.get(i7)).mo32569w0(c7145c);
        }
    }
}
