package p181Y;

import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1875e;
import p174X.C1900d;
import p174X.InterfaceC1901e;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: Y.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2009b implements InterfaceC1901e {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5367l f6677a;

    public C2009b(InterfaceC5367l produceNewData) {
        AbstractC6118n.m27187e(produceNewData, "produceNewData");
        this.f6677a = produceNewData;
    }

    @Override // p174X.InterfaceC1901e
    /* JADX INFO: renamed from: a */
    public Object mo7838a(C1900d c1900d, InterfaceC1875e interfaceC1875e) {
        return this.f6677a.invoke(c1900d);
    }
}
