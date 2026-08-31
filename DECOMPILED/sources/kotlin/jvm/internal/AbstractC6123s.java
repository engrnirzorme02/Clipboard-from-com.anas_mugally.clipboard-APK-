package kotlin.jvm.internal;

import p286k6.InterfaceC6076b;
import p286k6.InterfaceC6081g;

/* JADX INFO: renamed from: kotlin.jvm.internal.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6123s extends AbstractC6127w implements InterfaceC6081g {
    public AbstractC6123s(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, i7);
    }

    @Override // kotlin.jvm.internal.AbstractC6108d
    protected InterfaceC6076b computeReflected() {
        return AbstractC6100C.m27142e(this);
    }

    @Override // p238e6.InterfaceC5367l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
