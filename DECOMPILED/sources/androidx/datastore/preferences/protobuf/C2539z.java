package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z */
/* JADX INFO: loaded from: classes.dex */
final class C2539z implements InterfaceC2538y {
    C2539z() {
    }

    /* JADX INFO: renamed from: d */
    static AbstractC2534u.b m11663d(Object obj, long j7) {
        return (AbstractC2534u.b) AbstractC2519i0.m11442z(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2538y
    /* JADX INFO: renamed from: a */
    public void mo11660a(Object obj, Object obj2, long j7) {
        AbstractC2534u.b bVarM11663d = m11663d(obj, j7);
        AbstractC2534u.b bVarM11663d2 = m11663d(obj2, j7);
        int size = bVarM11663d.size();
        int size2 = bVarM11663d2.size();
        if (size > 0 && size2 > 0) {
            if (!bVarM11663d.mo11127h()) {
                bVarM11663d = bVarM11663d.mo10992d(size2 + size);
            }
            bVarM11663d.addAll(bVarM11663d2);
        }
        if (size > 0) {
            bVarM11663d2 = bVarM11663d;
        }
        AbstractC2519i0.m11414O(obj, j7, bVarM11663d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2538y
    /* JADX INFO: renamed from: b */
    public void mo11661b(Object obj, long j7) {
        m11663d(obj, j7).mo11126c();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2538y
    /* JADX INFO: renamed from: c */
    public List mo11662c(Object obj, long j7) {
        AbstractC2534u.b bVarM11663d = m11663d(obj, j7);
        if (bVarM11663d.mo11127h()) {
            return bVarM11663d;
        }
        int size = bVarM11663d.size();
        AbstractC2534u.b bVarMo10992d = bVarM11663d.mo10992d(size == 0 ? 10 : size * 2);
        AbstractC2519i0.m11414O(obj, j7, bVarMo10992d);
        return bVarMo10992d;
    }
}
