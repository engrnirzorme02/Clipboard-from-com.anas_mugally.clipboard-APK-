package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6119o implements InterfaceC6114j, Serializable {
    private final int arity;

    public AbstractC6119o(int i7) {
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.InterfaceC6114j
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strM27145h = AbstractC6100C.m27145h(this);
        AbstractC6118n.m27186d(strM27145h, "renderLambdaToString(...)");
        return strM27145h;
    }
}
