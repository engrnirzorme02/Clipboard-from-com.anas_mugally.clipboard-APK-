package io.grpc.internal;

import p063H5.AbstractC0536c0;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.N */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5748N extends AbstractC0536c0 {

    /* JADX INFO: renamed from: a */
    private final AbstractC0536c0 f22215a;

    AbstractC5748N(AbstractC0536c0 abstractC0536c0) {
        AbstractC1209m.m5303o(abstractC0536c0, "delegate can not be null");
        this.f22215a = abstractC0536c0;
    }

    @Override // p063H5.AbstractC0536c0
    /* JADX INFO: renamed from: a */
    public String mo2366a() {
        return this.f22215a.mo2366a();
    }

    @Override // p063H5.AbstractC0536c0
    /* JADX INFO: renamed from: b */
    public void mo2367b() {
        this.f22215a.mo2367b();
    }

    @Override // p063H5.AbstractC0536c0
    /* JADX INFO: renamed from: c */
    public void mo2368c() {
        this.f22215a.mo2368c();
    }

    @Override // p063H5.AbstractC0536c0
    /* JADX INFO: renamed from: d */
    public void mo2369d(AbstractC0536c0.d dVar) {
        this.f22215a.mo2369d(dVar);
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("delegate", this.f22215a).toString();
    }
}
