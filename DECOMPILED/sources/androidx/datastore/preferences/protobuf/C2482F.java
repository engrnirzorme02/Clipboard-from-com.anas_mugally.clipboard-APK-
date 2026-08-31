package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.F */
/* JADX INFO: loaded from: classes.dex */
final class C2482F implements InterfaceC2481E {
    C2482F() {
    }

    /* JADX INFO: renamed from: i */
    private static int m10888i(int i7, Object obj, Object obj2) {
        C2480D c2480d = (C2480D) obj;
        C2479C c2479c = (C2479C) obj2;
        int iM10867a = 0;
        if (c2480d.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : c2480d.entrySet()) {
            iM10867a += c2479c.m10867a(i7, entry.getKey(), entry.getValue());
        }
        return iM10867a;
    }

    /* JADX INFO: renamed from: j */
    private static C2480D m10889j(Object obj, Object obj2) {
        C2480D c2480dM10879l = (C2480D) obj;
        C2480D c2480d = (C2480D) obj2;
        if (!c2480d.isEmpty()) {
            if (!c2480dM10879l.m10876h()) {
                c2480dM10879l = c2480dM10879l.m10879l();
            }
            c2480dM10879l.m10878k(c2480d);
        }
        return c2480dM10879l;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2481E
    /* JADX INFO: renamed from: a */
    public Object mo10880a(Object obj, Object obj2) {
        return m10889j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2481E
    /* JADX INFO: renamed from: b */
    public Object mo10881b(Object obj) {
        ((C2480D) obj).m10877i();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2481E
    /* JADX INFO: renamed from: c */
    public C2479C.a mo10882c(Object obj) {
        return ((C2479C) obj).m10868c();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2481E
    /* JADX INFO: renamed from: d */
    public Map mo10883d(Object obj) {
        return (C2480D) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2481E
    /* JADX INFO: renamed from: e */
    public Object mo10884e(Object obj) {
        return C2480D.m10872d().m10879l();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2481E
    /* JADX INFO: renamed from: f */
    public int mo10885f(int i7, Object obj, Object obj2) {
        return m10888i(i7, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2481E
    /* JADX INFO: renamed from: g */
    public boolean mo10886g(Object obj) {
        return !((C2480D) obj).m10876h();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2481E
    /* JADX INFO: renamed from: h */
    public Map mo10887h(Object obj) {
        return (C2480D) obj;
    }
}
