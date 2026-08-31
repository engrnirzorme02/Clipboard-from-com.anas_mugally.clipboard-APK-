package kotlin.jvm.internal;

import p286k6.InterfaceC6076b;
import p286k6.InterfaceC6083i;

/* JADX INFO: renamed from: kotlin.jvm.internal.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6127w extends AbstractC6108d implements InterfaceC6083i {

    /* JADX INFO: renamed from: a */
    private final boolean f23884a;

    public AbstractC6127w(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.f23884a = (i7 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.AbstractC6108d
    public InterfaceC6076b compute() {
        return this.f23884a ? this : super.compute();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC6108d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC6083i getReflected() {
        if (this.f23884a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (InterfaceC6083i) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6127w) {
            AbstractC6127w abstractC6127w = (AbstractC6127w) obj;
            return getOwner().equals(abstractC6127w.getOwner()) && getName().equals(abstractC6127w.getName()) && getSignature().equals(abstractC6127w.getSignature()) && AbstractC6118n.m27183a(getBoundReceiver(), abstractC6127w.getBoundReceiver());
        }
        if (obj instanceof InterfaceC6083i) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        InterfaceC6076b interfaceC6076bCompute = compute();
        if (interfaceC6076bCompute != this) {
            return interfaceC6076bCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
