package p069I3;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: I3.s */
/* JADX INFO: loaded from: classes2.dex */
class C0632s extends AbstractC0631r {

    /* JADX INFO: renamed from: f */
    private boolean f2479f = false;

    /* JADX INFO: renamed from: g */
    private float f2480g = 0.0f;

    /* JADX INFO: renamed from: I3.s$a */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            C0632s c0632s = C0632s.this;
            if (c0632s.f2476c == null || c0632s.f2477d.isEmpty()) {
                return;
            }
            C0632s c0632s2 = C0632s.this;
            RectF rectF = c0632s2.f2477d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c0632s2.f2480g);
        }
    }

    C0632s(View view) {
        m2891m(view);
    }

    /* JADX INFO: renamed from: l */
    private float m2890l() {
        RectF rectF;
        C0627n c0627n = this.f2476c;
        if (c0627n == null || (rectF = this.f2477d) == null) {
            return 0.0f;
        }
        return c0627n.f2409f.mo2655a(rectF);
    }

    /* JADX INFO: renamed from: m */
    private void m2891m(View view) {
        view.setOutlineProvider(new a());
    }

    /* JADX INFO: renamed from: n */
    private boolean m2892n() {
        C0627n c0627n;
        if (this.f2477d.isEmpty() || (c0627n = this.f2476c) == null) {
            return false;
        }
        return c0627n.m2775v(this.f2477d);
    }

    /* JADX INFO: renamed from: o */
    private boolean m2893o() {
        C0627n c0627n;
        if (!this.f2477d.isEmpty() && (c0627n = this.f2476c) != null && this.f2475b && !c0627n.m2775v(this.f2477d) && m2894p(this.f2476c)) {
            float fMo2655a = this.f2476c.m2771r().mo2655a(this.f2477d);
            float fMo2655a2 = this.f2476c.m2773t().mo2655a(this.f2477d);
            float fMo2655a3 = this.f2476c.m2764j().mo2655a(this.f2477d);
            float fMo2655a4 = this.f2476c.m2766l().mo2655a(this.f2477d);
            if (fMo2655a == 0.0f && fMo2655a3 == 0.0f && fMo2655a2 == fMo2655a4) {
                RectF rectF = this.f2477d;
                rectF.set(rectF.left - fMo2655a2, rectF.top, rectF.right, rectF.bottom);
                this.f2480g = fMo2655a2;
                return true;
            }
            if (fMo2655a == 0.0f && fMo2655a2 == 0.0f && fMo2655a3 == fMo2655a4) {
                RectF rectF2 = this.f2477d;
                rectF2.set(rectF2.left, rectF2.top - fMo2655a3, rectF2.right, rectF2.bottom);
                this.f2480g = fMo2655a3;
                return true;
            }
            if (fMo2655a2 == 0.0f && fMo2655a4 == 0.0f && fMo2655a == fMo2655a3) {
                RectF rectF3 = this.f2477d;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + fMo2655a, rectF3.bottom);
                this.f2480g = fMo2655a;
                return true;
            }
            if (fMo2655a3 == 0.0f && fMo2655a4 == 0.0f && fMo2655a == fMo2655a2) {
                RectF rectF4 = this.f2477d;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + fMo2655a);
                this.f2480g = fMo2655a;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private static boolean m2894p(C0627n c0627n) {
        return (c0627n.m2770q() instanceof C0626m) && (c0627n.m2772s() instanceof C0626m) && (c0627n.m2763i() instanceof C0626m) && (c0627n.m2765k() instanceof C0626m);
    }

    @Override // p069I3.AbstractC0631r
    /* JADX INFO: renamed from: b */
    void mo2882b(View view) {
        this.f2480g = m2890l();
        this.f2479f = m2892n() || m2893o();
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
        return !this.f2479f || this.f2474a;
    }
}
