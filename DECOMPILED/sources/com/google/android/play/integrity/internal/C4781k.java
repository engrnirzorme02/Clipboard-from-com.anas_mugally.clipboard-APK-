package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C4781k implements InterfaceC4785o {

    /* JADX INFO: renamed from: c */
    private static final Object f18397c = new Object();

    /* JADX INFO: renamed from: a */
    private volatile InterfaceC4785o f18398a;

    /* JADX INFO: renamed from: b */
    private volatile Object f18399b = f18397c;

    private C4781k(InterfaceC4785o interfaceC4785o) {
        this.f18398a = interfaceC4785o;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC4785o m21927b(InterfaceC4785o interfaceC4785o) {
        return interfaceC4785o instanceof C4781k ? interfaceC4785o : new C4781k(interfaceC4785o);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC4785o
    /* JADX INFO: renamed from: a */
    public final Object mo21830a() {
        Object objMo21830a;
        Object obj = this.f18399b;
        Object obj2 = f18397c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objMo21830a = this.f18399b;
                if (objMo21830a == obj2) {
                    objMo21830a = this.f18398a.mo21830a();
                    Object obj3 = this.f18399b;
                    if (obj3 != obj2 && obj3 != objMo21830a) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objMo21830a + ". This is likely due to a circular dependency.");
                    }
                    this.f18399b = objMo21830a;
                    this.f18398a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objMo21830a;
    }
}
