package p069I3;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: I3.t */
/* JADX INFO: loaded from: classes2.dex */
class C0633t extends AbstractC0631r {

    /* JADX INFO: renamed from: I3.t$a */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (C0633t.this.f2478e.isEmpty()) {
                return;
            }
            outline.setPath(C0633t.this.f2478e);
        }
    }

    C0633t(View view) {
        m2895k(view);
    }

    /* JADX INFO: renamed from: k */
    private void m2895k(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // p069I3.AbstractC0631r
    /* JADX INFO: renamed from: b */
    void mo2882b(View view) {
        view.setClipToOutline(!mo2888i());
        if (mo2888i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // p069I3.AbstractC0631r
    /* JADX INFO: renamed from: i */
    boolean mo2888i() {
        return this.f2474a;
    }
}
