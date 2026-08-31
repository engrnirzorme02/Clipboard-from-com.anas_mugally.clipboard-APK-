package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s */
/* JADX INFO: loaded from: classes.dex */
class C2532s implements InterfaceC2485I {

    /* JADX INFO: renamed from: a */
    private static final C2532s f9711a = new C2532s();

    private C2532s() {
    }

    /* JADX INFO: renamed from: c */
    public static C2532s m11598c() {
        return f9711a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2485I
    /* JADX INFO: renamed from: a */
    public InterfaceC2484H mo10862a(Class cls) {
        if (!AbstractC2533t.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC2484H) AbstractC2533t.m11608u(cls.asSubclass(AbstractC2533t.class)).m11618i();
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e7);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2485I
    /* JADX INFO: renamed from: b */
    public boolean mo10863b(Class cls) {
        return AbstractC2533t.class.isAssignableFrom(cls);
    }
}
