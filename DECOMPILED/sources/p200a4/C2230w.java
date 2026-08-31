package p200a4;

import p211b5.InterfaceC2972b;

/* JADX INFO: renamed from: a4.w */
/* JADX INFO: loaded from: classes.dex */
public class C2230w implements InterfaceC2972b {

    /* JADX INFO: renamed from: c */
    private static final Object f7204c = new Object();

    /* JADX INFO: renamed from: a */
    private volatile Object f7205a = f7204c;

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC2972b f7206b;

    public C2230w(InterfaceC2972b interfaceC2972b) {
        this.f7206b = interfaceC2972b;
    }

    @Override // p211b5.InterfaceC2972b
    public Object get() {
        Object obj;
        Object obj2 = this.f7205a;
        Object obj3 = f7204c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f7205a;
                if (obj == obj3) {
                    obj = this.f7206b.get();
                    this.f7205a = obj;
                    this.f7206b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
