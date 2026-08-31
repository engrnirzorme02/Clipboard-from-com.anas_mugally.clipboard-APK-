package kotlin.jvm.internal;

import p286k6.InterfaceC6076b;
import p286k6.InterfaceC6079e;

/* JADX INFO: renamed from: kotlin.jvm.internal.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6115k extends AbstractC6108d implements InterfaceC6114j, InterfaceC6079e {
    private final int arity;
    private final int flags;

    public AbstractC6115k(int i7, Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.arity = i7;
        this.flags = i8 >> 1;
    }

    @Override // kotlin.jvm.internal.AbstractC6108d
    protected InterfaceC6076b computeReflected() {
        return AbstractC6100C.m27138a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6115k) {
            AbstractC6115k abstractC6115k = (AbstractC6115k) obj;
            return getName().equals(abstractC6115k.getName()) && getSignature().equals(abstractC6115k.getSignature()) && this.flags == abstractC6115k.flags && this.arity == abstractC6115k.arity && AbstractC6118n.m27183a(getBoundReceiver(), abstractC6115k.getBoundReceiver()) && AbstractC6118n.m27183a(getOwner(), abstractC6115k.getOwner());
        }
        if (obj instanceof InterfaceC6079e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC6114j
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // p286k6.InterfaceC6079e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p286k6.InterfaceC6079e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p286k6.InterfaceC6079e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p286k6.InterfaceC6079e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p286k6.InterfaceC6079e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC6076b interfaceC6076bCompute = compute();
        if (interfaceC6076bCompute != this) {
            return interfaceC6076bCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC6108d
    public InterfaceC6079e getReflected() {
        return (InterfaceC6079e) super.getReflected();
    }
}
