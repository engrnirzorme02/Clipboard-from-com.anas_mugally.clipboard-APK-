package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.AbstractC6100C;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.InterfaceC6114j;
import p173W5.InterfaceC1875e;

/* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6096k extends AbstractC6095j implements InterfaceC6114j {

    /* JADX INFO: renamed from: a */
    private final int f23857a;

    public AbstractC6096k(int i7, InterfaceC1875e interfaceC1875e) {
        super(interfaceC1875e);
        this.f23857a = i7;
    }

    @Override // kotlin.jvm.internal.InterfaceC6114j
    public int getArity() {
        return this.f23857a;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strM27144g = AbstractC6100C.m27144g(this);
        AbstractC6118n.m27186d(strM27144g, "renderLambdaToString(...)");
        return strM27144g;
    }
}
