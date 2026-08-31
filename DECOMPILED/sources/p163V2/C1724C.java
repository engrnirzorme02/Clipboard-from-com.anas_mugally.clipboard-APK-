package p163V2;

import android.os.Bundle;

/* JADX INFO: renamed from: V2.C */
/* JADX INFO: loaded from: classes.dex */
final class C1724C extends AbstractC1722A {
    C1724C(int i7, int i8, Bundle bundle) {
        super(i7, i8, bundle);
    }

    @Override // p163V2.AbstractC1722A
    /* JADX INFO: renamed from: a */
    final void mo7338a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m7341d(bundle2);
    }

    @Override // p163V2.AbstractC1722A
    /* JADX INFO: renamed from: b */
    final boolean mo7339b() {
        return false;
    }
}
