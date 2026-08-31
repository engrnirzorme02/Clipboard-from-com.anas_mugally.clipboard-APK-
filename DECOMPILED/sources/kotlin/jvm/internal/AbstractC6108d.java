package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p230d6.C5246b;
import p286k6.EnumC6085k;
import p286k6.InterfaceC6076b;
import p286k6.InterfaceC6078d;
import p286k6.InterfaceC6084j;

/* JADX INFO: renamed from: kotlin.jvm.internal.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6108d implements InterfaceC6076b, Serializable {
    public static final Object NO_RECEIVER = a.f23873a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC6076b reflected;
    private final String signature;

    /* JADX INFO: renamed from: kotlin.jvm.internal.d$a */
    private static class a implements Serializable {

        /* JADX INFO: renamed from: a */
        private static final a f23873a = new a();

        private a() {
        }
    }

    protected AbstractC6108d(Object obj, Class cls, String str, String str2, boolean z7) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z7;
    }

    @Override // p286k6.InterfaceC6076b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p286k6.InterfaceC6076b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC6076b compute() {
        InterfaceC6076b interfaceC6076b = this.reflected;
        if (interfaceC6076b != null) {
            return interfaceC6076b;
        }
        InterfaceC6076b interfaceC6076bComputeReflected = computeReflected();
        this.reflected = interfaceC6076bComputeReflected;
        return interfaceC6076bComputeReflected;
    }

    protected abstract InterfaceC6076b computeReflected();

    @Override // p286k6.InterfaceC6075a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // p286k6.InterfaceC6076b
    public String getName() {
        return this.name;
    }

    public InterfaceC6078d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? AbstractC6100C.m27140c(cls) : AbstractC6100C.m27139b(cls);
    }

    @Override // p286k6.InterfaceC6076b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected InterfaceC6076b getReflected() {
        InterfaceC6076b interfaceC6076bCompute = compute();
        if (interfaceC6076bCompute != this) {
            return interfaceC6076bCompute;
        }
        throw new C5246b();
    }

    @Override // p286k6.InterfaceC6076b
    public InterfaceC6084j getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p286k6.InterfaceC6076b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p286k6.InterfaceC6076b
    public EnumC6085k getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p286k6.InterfaceC6076b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p286k6.InterfaceC6076b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p286k6.InterfaceC6076b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
