package kotlin.jvm.internal;

import p286k6.InterfaceC6076b;
import p286k6.InterfaceC6082h;

/* JADX INFO: renamed from: kotlin.jvm.internal.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6125u extends AbstractC6127w implements InterfaceC6082h {
    public AbstractC6125u(Class cls, String str, String str2, int i7) {
        super(AbstractC6108d.NO_RECEIVER, cls, str, str2, i7);
    }

    @Override // kotlin.jvm.internal.AbstractC6108d
    protected InterfaceC6076b computeReflected() {
        return AbstractC6100C.m27143f(this);
    }

    @Override // p238e6.InterfaceC5371p
    public Object invoke(Object obj, Object obj2) {
        return mo27117I(obj, obj2);
    }

    @Override // p286k6.InterfaceC6082h
    /* JADX INFO: renamed from: o */
    public InterfaceC6082h.a mo27118o() {
        ((InterfaceC6082h) getReflected()).mo27118o();
        return null;
    }
}
