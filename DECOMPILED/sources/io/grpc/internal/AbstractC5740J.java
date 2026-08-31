package io.grpc.internal;

import p063H5.C0530Z;
import p063H5.C0554l0;
import p122P3.AbstractC1203g;

/* JADX INFO: renamed from: io.grpc.internal.J */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5740J implements InterfaceC5806s {
    AbstractC5740J() {
    }

    @Override // io.grpc.internal.InterfaceC5755Q0
    /* JADX INFO: renamed from: a */
    public void mo25473a(InterfaceC5755Q0.a aVar) {
        mo25593e().mo25473a(aVar);
    }

    @Override // io.grpc.internal.InterfaceC5755Q0
    /* JADX INFO: renamed from: b */
    public void mo25474b() {
        mo25593e().mo25474b();
    }

    @Override // io.grpc.internal.InterfaceC5806s
    /* JADX INFO: renamed from: c */
    public void mo25475c(C0554l0 c0554l0, InterfaceC5806s.a aVar, C0530Z c0530z) {
        mo25593e().mo25475c(c0554l0, aVar, c0530z);
    }

    @Override // io.grpc.internal.InterfaceC5806s
    /* JADX INFO: renamed from: d */
    public void mo25476d(C0530Z c0530z) {
        mo25593e().mo25476d(c0530z);
    }

    /* JADX INFO: renamed from: e */
    protected abstract InterfaceC5806s mo25593e();

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("delegate", mo25593e()).toString();
    }
}
