package com.google.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.P */
/* JADX INFO: loaded from: classes.dex */
class C5078P implements InterfaceC5077O {
    C5078P() {
    }

    /* JADX INFO: renamed from: i */
    private static int m22961i(int i7, Object obj, Object obj2) {
        C5076N c5076n = (C5076N) obj;
        C5075M c5075m = (C5075M) obj2;
        int iM22940a = 0;
        if (c5076n.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : c5076n.entrySet()) {
            iM22940a += c5075m.m22940a(i7, entry.getKey(), entry.getValue());
        }
        return iM22940a;
    }

    /* JADX INFO: renamed from: j */
    private static C5076N m22962j(Object obj, Object obj2) {
        C5076N c5076nM22952l = (C5076N) obj;
        C5076N c5076n = (C5076N) obj2;
        if (!c5076n.isEmpty()) {
            if (!c5076nM22952l.m22949h()) {
                c5076nM22952l = c5076nM22952l.m22952l();
            }
            c5076nM22952l.m22951k(c5076n);
        }
        return c5076nM22952l;
    }

    @Override // com.google.protobuf.InterfaceC5077O
    /* JADX INFO: renamed from: a */
    public Object mo22953a(Object obj, Object obj2) {
        return m22962j(obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC5077O
    /* JADX INFO: renamed from: b */
    public Object mo22954b(Object obj) {
        ((C5076N) obj).m22950i();
        return obj;
    }

    @Override // com.google.protobuf.InterfaceC5077O
    /* JADX INFO: renamed from: c */
    public C5075M.a mo22955c(Object obj) {
        return ((C5075M) obj).m22941c();
    }

    @Override // com.google.protobuf.InterfaceC5077O
    /* JADX INFO: renamed from: d */
    public Map mo22956d(Object obj) {
        return (C5076N) obj;
    }

    @Override // com.google.protobuf.InterfaceC5077O
    /* JADX INFO: renamed from: e */
    public Object mo22957e(Object obj) {
        return C5076N.m22945d().m22952l();
    }

    @Override // com.google.protobuf.InterfaceC5077O
    /* JADX INFO: renamed from: f */
    public int mo22958f(int i7, Object obj, Object obj2) {
        return m22961i(i7, obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC5077O
    /* JADX INFO: renamed from: g */
    public boolean mo22959g(Object obj) {
        return !((C5076N) obj).m22949h();
    }

    @Override // com.google.protobuf.InterfaceC5077O
    /* JADX INFO: renamed from: h */
    public Map mo22960h(Object obj) {
        return (C5076N) obj;
    }
}
