package p234e2;

import p138R5.InterfaceC1380a;

/* JADX INFO: renamed from: e2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5335a implements InterfaceC1380a {

    /* JADX INFO: renamed from: c */
    private static final Object f20441c = new Object();

    /* JADX INFO: renamed from: a */
    private volatile InterfaceC1380a f20442a;

    /* JADX INFO: renamed from: b */
    private volatile Object f20443b = f20441c;

    private C5335a(InterfaceC1380a interfaceC1380a) {
        this.f20442a = interfaceC1380a;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1380a m24325a(InterfaceC1380a interfaceC1380a) {
        AbstractC5338d.m24329b(interfaceC1380a);
        return interfaceC1380a instanceof C5335a ? interfaceC1380a : new C5335a(interfaceC1380a);
    }

    /* JADX INFO: renamed from: b */
    private static Object m24326b(Object obj, Object obj2) {
        if (obj == f20441c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p138R5.InterfaceC1380a
    public Object get() {
        Object obj;
        Object obj2 = this.f20443b;
        Object obj3 = f20441c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f20443b;
                if (obj == obj3) {
                    obj = this.f20442a.get();
                    this.f20443b = m24326b(this.f20443b, obj);
                    this.f20442a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
