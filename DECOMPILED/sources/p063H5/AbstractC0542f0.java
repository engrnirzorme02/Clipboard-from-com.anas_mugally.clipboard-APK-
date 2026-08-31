package p063H5;

import p122P3.AbstractC1203g;

/* JADX INFO: renamed from: H5.f0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0542f0 extends AbstractC0543g {
    AbstractC0542f0() {
    }

    @Override // p063H5.AbstractC0543g
    /* JADX INFO: renamed from: a */
    public void mo2118a(String str, Throwable th) {
        mo2123f().mo2118a(str, th);
    }

    @Override // p063H5.AbstractC0543g
    /* JADX INFO: renamed from: b */
    public void mo2119b() {
        mo2123f().mo2119b();
    }

    @Override // p063H5.AbstractC0543g
    /* JADX INFO: renamed from: c */
    public void mo2120c(int i7) {
        mo2123f().mo2120c(i7);
    }

    /* JADX INFO: renamed from: f */
    protected abstract AbstractC0543g mo2123f();

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("delegate", mo2123f()).toString();
    }
}
