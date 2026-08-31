package p124P5;

import p063H5.AbstractC0523S;
import p063H5.C0554l0;
import p122P3.AbstractC1203g;

/* JADX INFO: renamed from: P5.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1231b extends AbstractC0523S {
    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: b */
    public boolean mo2174b() {
        return mo5352g().mo2174b();
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: c */
    public void mo2175c(C0554l0 c0554l0) {
        mo5352g().mo2175c(c0554l0);
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: d */
    public void mo2176d(AbstractC0523S.h hVar) {
        mo5352g().mo2176d(hVar);
    }

    @Override // p063H5.AbstractC0523S
    /* JADX INFO: renamed from: e */
    public void mo2177e() {
        mo5352g().mo2177e();
    }

    /* JADX INFO: renamed from: g */
    protected abstract AbstractC0523S mo5352g();

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("delegate", mo5352g()).toString();
    }
}
