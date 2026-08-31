package p163V2;

import android.os.Bundle;

/* JADX INFO: renamed from: V2.z */
/* JADX INFO: loaded from: classes.dex */
final class C1755z extends AbstractC1722A {
    C1755z(int i7, int i8, Bundle bundle) {
        super(i7, i8, bundle);
    }

    @Override // p163V2.AbstractC1722A
    /* JADX INFO: renamed from: a */
    final void mo7338a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m7341d(null);
        } else {
            m7340c(new C1723B(4, "Invalid response to one way request", null));
        }
    }

    @Override // p163V2.AbstractC1722A
    /* JADX INFO: renamed from: b */
    final boolean mo7339b() {
        return true;
    }
}
