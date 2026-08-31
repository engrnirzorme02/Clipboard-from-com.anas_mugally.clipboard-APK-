package kotlin.jvm.internal;

import p286k6.InterfaceC6076b;
import p286k6.InterfaceC6080f;

/* JADX INFO: renamed from: kotlin.jvm.internal.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6121q extends AbstractC6127w implements InterfaceC6080f {
    public AbstractC6121q(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, i7);
    }

    @Override // kotlin.jvm.internal.AbstractC6108d
    protected InterfaceC6076b computeReflected() {
        return AbstractC6100C.m27141d(this);
    }

    @Override // p238e6.InterfaceC5356a
    public Object invoke() {
        return get();
    }
}
