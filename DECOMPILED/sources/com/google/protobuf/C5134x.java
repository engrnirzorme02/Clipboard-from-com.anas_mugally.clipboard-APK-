package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.x */
/* JADX INFO: loaded from: classes.dex */
class C5134x implements InterfaceC5081T {

    /* JADX INFO: renamed from: a */
    private static final C5134x f19614a = new C5134x();

    private C5134x() {
    }

    /* JADX INFO: renamed from: c */
    public static C5134x m23675c() {
        return f19614a;
    }

    @Override // com.google.protobuf.InterfaceC5081T
    /* JADX INFO: renamed from: a */
    public InterfaceC5080S mo22935a(Class cls) {
        if (!AbstractC5136y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC5080S) AbstractC5136y.m23684B(cls.asSubclass(AbstractC5136y.class)).m23711o();
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e7);
        }
    }

    @Override // com.google.protobuf.InterfaceC5081T
    /* JADX INFO: renamed from: b */
    public boolean mo22936b(Class cls) {
        return AbstractC5136y.class.isAssignableFrom(cls);
    }
}
