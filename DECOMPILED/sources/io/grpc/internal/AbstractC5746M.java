package io.grpc.internal;

import p063H5.AbstractC0526V;
import p063H5.AbstractC0543g;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.EnumC0561p;
import p122P3.AbstractC1203g;

/* JADX INFO: renamed from: io.grpc.internal.M */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5746M extends AbstractC0526V {

    /* JADX INFO: renamed from: a */
    private final AbstractC0526V f22213a;

    AbstractC5746M(AbstractC0526V abstractC0526V) {
        this.f22213a = abstractC0526V;
    }

    @Override // p063H5.AbstractC0537d
    /* JADX INFO: renamed from: a */
    public String mo2404a() {
        return this.f22213a.mo2404a();
    }

    @Override // p063H5.AbstractC0537d
    /* JADX INFO: renamed from: f */
    public AbstractC0543g mo2405f(C0532a0 c0532a0, C0535c c0535c) {
        return this.f22213a.mo2405f(c0532a0, c0535c);
    }

    @Override // p063H5.AbstractC0526V
    /* JADX INFO: renamed from: j */
    public void mo2245j() {
        this.f22213a.mo2245j();
    }

    @Override // p063H5.AbstractC0526V
    /* JADX INFO: renamed from: k */
    public EnumC0561p mo2246k(boolean z7) {
        return this.f22213a.mo2246k(z7);
    }

    @Override // p063H5.AbstractC0526V
    /* JADX INFO: renamed from: l */
    public void mo2247l(EnumC0561p enumC0561p, Runnable runnable) {
        this.f22213a.mo2247l(enumC0561p, runnable);
    }

    @Override // p063H5.AbstractC0526V
    /* JADX INFO: renamed from: m */
    public AbstractC0526V mo2248m() {
        return this.f22213a.mo2248m();
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("delegate", this.f22213a).toString();
    }
}
