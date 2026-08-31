package io.grpc.internal;

import java.io.InputStream;
import p063H5.C0554l0;
import p063H5.C0568t;
import p063H5.C0570v;
import p063H5.InterfaceC0557n;
import p122P3.AbstractC1203g;

/* JADX INFO: renamed from: io.grpc.internal.I */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5738I implements InterfaceC5804r {
    AbstractC5738I() {
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: a */
    public void mo25438a(C0554l0 c0554l0) {
        mo25590h().mo25438a(c0554l0);
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: c */
    public void mo25458c(InterfaceC0557n interfaceC0557n) {
        mo25590h().mo25458c(interfaceC0557n);
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: d */
    public void mo25459d(int i7) {
        mo25590h().mo25459d(i7);
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: e */
    public boolean mo25460e() {
        return mo25590h().mo25460e();
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: f */
    public void mo25461f(InputStream inputStream) {
        mo25590h().mo25461f(inputStream);
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    public void flush() {
        mo25590h().flush();
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: g */
    public void mo25462g() {
        mo25590h().mo25462g();
    }

    /* JADX INFO: renamed from: h */
    protected abstract InterfaceC5804r mo25590h();

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: m */
    public void mo25463m(int i7) {
        mo25590h().mo25463m(i7);
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: n */
    public void mo25464n(int i7) {
        mo25590h().mo25464n(i7);
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: o */
    public void mo3265o(String str) {
        mo25590h().mo3265o(str);
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: p */
    public void mo25439p(C5768Y c5768y) {
        mo25590h().mo25439p(c5768y);
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: q */
    public void mo25465q() {
        mo25590h().mo25465q();
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: r */
    public void mo25466r(C0568t c0568t) {
        mo25590h().mo25466r(c0568t);
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: s */
    public void mo25467s(InterfaceC5806s interfaceC5806s) {
        mo25590h().mo25467s(interfaceC5806s);
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: t */
    public void mo25468t(C0570v c0570v) {
        mo25590h().mo25468t(c0570v);
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("delegate", mo25590h()).toString();
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: u */
    public void mo25469u(boolean z7) {
        mo25590h().mo25469u(z7);
    }
}
