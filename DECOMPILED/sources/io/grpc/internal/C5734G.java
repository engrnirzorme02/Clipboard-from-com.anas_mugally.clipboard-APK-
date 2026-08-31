package io.grpc.internal;

import p063H5.AbstractC0551k;
import p063H5.C0530Z;
import p063H5.C0554l0;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.G */
/* JADX INFO: loaded from: classes.dex */
public final class C5734G extends C5801p0 {

    /* JADX INFO: renamed from: b */
    private boolean f22178b;

    /* JADX INFO: renamed from: c */
    private final C0554l0 f22179c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5806s.a f22180d;

    /* JADX INFO: renamed from: e */
    private final AbstractC0551k[] f22181e;

    public C5734G(C0554l0 c0554l0, AbstractC0551k[] abstractC0551kArr) {
        this(c0554l0, InterfaceC5806s.a.PROCESSED, abstractC0551kArr);
    }

    @Override // io.grpc.internal.C5801p0, io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: p */
    public void mo25439p(C5768Y c5768y) {
        c5768y.m25763b("error", this.f22179c).m25763b("progress", this.f22180d);
    }

    @Override // io.grpc.internal.C5801p0, io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: s */
    public void mo25467s(InterfaceC5806s interfaceC5806s) {
        AbstractC1209m.m5309u(!this.f22178b, "already started");
        this.f22178b = true;
        for (AbstractC0551k abstractC0551k : this.f22181e) {
            abstractC0551k.mo2487i(this.f22179c);
        }
        interfaceC5806s.mo25475c(this.f22179c, this.f22180d, new C0530Z());
    }

    public C5734G(C0554l0 c0554l0, InterfaceC5806s.a aVar, AbstractC0551k[] abstractC0551kArr) {
        AbstractC1209m.m5293e(!c0554l0.m2460o(), "error must not be OK");
        this.f22179c = c0554l0;
        this.f22180d = aVar;
        this.f22181e = abstractC0551kArr;
    }
}
