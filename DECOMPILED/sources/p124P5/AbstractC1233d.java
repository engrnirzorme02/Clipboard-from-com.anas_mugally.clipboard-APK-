package p124P5;

import java.util.List;
import p063H5.AbstractC0523S;
import p063H5.AbstractC0541f;
import p063H5.C0531a;
import p122P3.AbstractC1203g;

/* JADX INFO: renamed from: P5.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1233d extends AbstractC0523S.i {
    @Override // p063H5.AbstractC0523S.i
    /* JADX INFO: renamed from: b */
    public List mo2222b() {
        return mo5354j().mo2222b();
    }

    @Override // p063H5.AbstractC0523S.i
    /* JADX INFO: renamed from: c */
    public C0531a mo2223c() {
        return mo5354j().mo2223c();
    }

    @Override // p063H5.AbstractC0523S.i
    /* JADX INFO: renamed from: d */
    public AbstractC0541f mo2224d() {
        return mo5354j().mo2224d();
    }

    @Override // p063H5.AbstractC0523S.i
    /* JADX INFO: renamed from: e */
    public Object mo2225e() {
        return mo5354j().mo2225e();
    }

    @Override // p063H5.AbstractC0523S.i
    /* JADX INFO: renamed from: f */
    public void mo2226f() {
        mo5354j().mo2226f();
    }

    @Override // p063H5.AbstractC0523S.i
    /* JADX INFO: renamed from: g */
    public void mo2227g() {
        mo5354j().mo2227g();
    }

    @Override // p063H5.AbstractC0523S.i
    /* JADX INFO: renamed from: h */
    public void mo2228h(AbstractC0523S.k kVar) {
        mo5354j().mo2228h(kVar);
    }

    @Override // p063H5.AbstractC0523S.i
    /* JADX INFO: renamed from: i */
    public void mo2229i(List list) {
        mo5354j().mo2229i(list);
    }

    /* JADX INFO: renamed from: j */
    protected abstract AbstractC0523S.i mo5354j();

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("delegate", mo5354j()).toString();
    }
}
