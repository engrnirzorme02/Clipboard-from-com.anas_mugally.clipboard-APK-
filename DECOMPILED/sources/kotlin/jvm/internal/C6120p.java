package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6120p implements InterfaceC6109e {

    /* JADX INFO: renamed from: a */
    private final Class f23882a;

    /* JADX INFO: renamed from: b */
    private final String f23883b;

    public C6120p(Class jClass, String moduleName) {
        AbstractC6118n.m27187e(jClass, "jClass");
        AbstractC6118n.m27187e(moduleName, "moduleName");
        this.f23882a = jClass;
        this.f23883b = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC6109e
    /* JADX INFO: renamed from: d */
    public Class mo27173d() {
        return this.f23882a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6120p) && AbstractC6118n.m27183a(mo27173d(), ((C6120p) obj).mo27173d());
    }

    public int hashCode() {
        return mo27173d().hashCode();
    }

    public String toString() {
        return mo27173d() + " (Kotlin reflection is not available)";
    }
}
