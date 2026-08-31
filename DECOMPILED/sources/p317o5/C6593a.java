package p317o5;

/* JADX INFO: renamed from: o5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6593a implements InterfaceC6597e {

    /* JADX INFO: renamed from: c */
    private static final Object f24862c = new Object();

    /* JADX INFO: renamed from: a */
    private volatile InterfaceC6597e f24863a;

    /* JADX INFO: renamed from: b */
    private volatile Object f24864b = f24862c;

    private C6593a(InterfaceC6597e interfaceC6597e) {
        this.f24863a = interfaceC6597e;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC6597e m27930a(InterfaceC6597e interfaceC6597e) {
        AbstractC6596d.m27934b(interfaceC6597e);
        return interfaceC6597e instanceof C6593a ? interfaceC6597e : new C6593a(interfaceC6597e);
    }

    /* JADX INFO: renamed from: b */
    private static Object m27931b(Object obj, Object obj2) {
        if (obj == f24862c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p138R5.InterfaceC1380a
    public Object get() {
        Object obj;
        Object obj2 = this.f24864b;
        Object obj3 = f24862c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f24864b;
                if (obj == obj3) {
                    obj = this.f24863a.get();
                    this.f24864b = m27931b(this.f24864b, obj);
                    this.f24863a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
