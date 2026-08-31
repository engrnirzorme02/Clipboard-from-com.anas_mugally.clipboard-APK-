package io.grpc.internal;

import java.util.concurrent.Executor;
import p063H5.AbstractC0551k;
import p063H5.C0516K;
import p063H5.C0530Z;
import p063H5.C0531a;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.C0554l0;
import p122P3.AbstractC1203g;

/* JADX INFO: renamed from: io.grpc.internal.K */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5742K implements InterfaceC5814w {
    AbstractC5742K() {
    }

    /* JADX INFO: renamed from: a */
    protected abstract InterfaceC5814w mo25600a();

    @Override // io.grpc.internal.InterfaceC5814w
    /* JADX INFO: renamed from: b */
    public C0531a mo3346b() {
        return mo25600a().mo3346b();
    }

    @Override // io.grpc.internal.InterfaceC5808t
    /* JADX INFO: renamed from: c */
    public InterfaceC5804r mo3348c(C0532a0 c0532a0, C0530Z c0530z, C0535c c0535c, AbstractC0551k[] abstractC0551kArr) {
        return mo25600a().mo3348c(c0532a0, c0530z, c0535c, abstractC0551kArr);
    }

    @Override // io.grpc.internal.InterfaceC5793l0
    /* JADX INFO: renamed from: d */
    public void mo3350d(C0554l0 c0554l0) {
        mo25600a().mo3350d(c0554l0);
    }

    @Override // io.grpc.internal.InterfaceC5793l0
    /* JADX INFO: renamed from: e */
    public Runnable mo3351e(InterfaceC5793l0.a aVar) {
        return mo25600a().mo3351e(aVar);
    }

    @Override // p063H5.InterfaceC0521P
    /* JADX INFO: renamed from: g */
    public C0516K mo2172g() {
        return mo25600a().mo2172g();
    }

    @Override // io.grpc.internal.InterfaceC5793l0
    /* JADX INFO: renamed from: h */
    public void mo3353h(C0554l0 c0554l0) {
        mo25600a().mo3353h(c0554l0);
    }

    @Override // io.grpc.internal.InterfaceC5808t
    /* JADX INFO: renamed from: i */
    public void mo3355i(InterfaceC5808t.a aVar, Executor executor) {
        mo25600a().mo3355i(aVar, executor);
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("delegate", mo25600a()).toString();
    }
}
