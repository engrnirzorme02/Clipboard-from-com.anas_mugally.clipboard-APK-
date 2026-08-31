package p079J5;

import io.grpc.internal.InterfaceC5764V0;
import io.grpc.internal.InterfaceC5766W0;
import p072I6.C0648e;

/* JADX INFO: renamed from: J5.q */
/* JADX INFO: loaded from: classes.dex */
class C0703q implements InterfaceC5766W0 {
    C0703q() {
    }

    @Override // io.grpc.internal.InterfaceC5766W0
    /* JADX INFO: renamed from: a */
    public InterfaceC5764V0 mo3409a(int i7) {
        return new C0702p(new C0648e(), Math.min(1048576, Math.max(4096, i7)));
    }
}
