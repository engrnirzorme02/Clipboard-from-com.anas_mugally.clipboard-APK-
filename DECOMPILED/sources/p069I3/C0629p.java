package p069I3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p061H3.C0499a;

/* JADX INFO: renamed from: I3.p */
/* JADX INFO: loaded from: classes2.dex */
public class C0629p {

    /* JADX INFO: renamed from: a */
    public float f2446a;

    /* JADX INFO: renamed from: b */
    public float f2447b;

    /* JADX INFO: renamed from: c */
    public float f2448c;

    /* JADX INFO: renamed from: d */
    public float f2449d;

    /* JADX INFO: renamed from: e */
    public float f2450e;

    /* JADX INFO: renamed from: f */
    public float f2451f;

    /* JADX INFO: renamed from: g */
    private final List f2452g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final List f2453h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private boolean f2454i;

    /* JADX INFO: renamed from: I3.p$a */
    class a extends g {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f2455c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Matrix f2456d;

        a(List list, Matrix matrix) {
            this.f2455c = list;
            this.f2456d = matrix;
        }

        @Override // p069I3.C0629p.g
        /* JADX INFO: renamed from: b */
        public void mo2851b(Matrix matrix, C0499a c0499a, int i7, Canvas canvas) {
            Iterator it = this.f2455c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).mo2851b(this.f2456d, c0499a, i7, canvas);
            }
        }
    }

    /* JADX INFO: renamed from: I3.p$b */
    static class b extends g {

        /* JADX INFO: renamed from: c */
        private final d f2458c;

        public b(d dVar) {
            this.f2458c = dVar;
        }

        @Override // p069I3.C0629p.g
        /* JADX INFO: renamed from: b */
        public void mo2851b(Matrix matrix, C0499a c0499a, int i7, Canvas canvas) {
            c0499a.m2110a(canvas, matrix, new RectF(this.f2458c.m2862k(), this.f2458c.m2866o(), this.f2458c.m2863l(), this.f2458c.m2861j()), i7, this.f2458c.m2864m(), this.f2458c.m2865n());
        }
    }

    /* JADX INFO: renamed from: I3.p$c */
    static class c extends g {

        /* JADX INFO: renamed from: c */
        private final e f2459c;

        /* JADX INFO: renamed from: d */
        private final float f2460d;

        /* JADX INFO: renamed from: e */
        private final float f2461e;

        public c(e eVar, float f7, float f8) {
            this.f2459c = eVar;
            this.f2460d = f7;
            this.f2461e = f8;
        }

        @Override // p069I3.C0629p.g
        /* JADX INFO: renamed from: b */
        public void mo2851b(Matrix matrix, C0499a c0499a, int i7, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f2459c.f2470c - this.f2461e, this.f2459c.f2469b - this.f2460d), 0.0f);
            this.f2473a.set(matrix);
            this.f2473a.preTranslate(this.f2460d, this.f2461e);
            this.f2473a.preRotate(m2852c());
            c0499a.m2111b(canvas, this.f2473a, rectF, i7);
        }

        /* JADX INFO: renamed from: c */
        float m2852c() {
            return (float) Math.toDegrees(Math.atan((this.f2459c.f2470c - this.f2461e) / (this.f2459c.f2469b - this.f2460d)));
        }
    }

    /* JADX INFO: renamed from: I3.p$d */
    public static class d extends f {

        /* JADX INFO: renamed from: h */
        private static final RectF f2462h = new RectF();

        /* JADX INFO: renamed from: b */
        public float f2463b;

        /* JADX INFO: renamed from: c */
        public float f2464c;

        /* JADX INFO: renamed from: d */
        public float f2465d;

        /* JADX INFO: renamed from: e */
        public float f2466e;

        /* JADX INFO: renamed from: f */
        public float f2467f;

        /* JADX INFO: renamed from: g */
        public float f2468g;

        public d(float f7, float f8, float f9, float f10) {
            m2868q(f7);
            m2872u(f8);
            m2869r(f9);
            m2867p(f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public float m2861j() {
            return this.f2466e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public float m2862k() {
            return this.f2463b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public float m2863l() {
            return this.f2465d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m */
        public float m2864m() {
            return this.f2467f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public float m2865n() {
            return this.f2468g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o */
        public float m2866o() {
            return this.f2464c;
        }

        /* JADX INFO: renamed from: p */
        private void m2867p(float f7) {
            this.f2466e = f7;
        }

        /* JADX INFO: renamed from: q */
        private void m2868q(float f7) {
            this.f2463b = f7;
        }

        /* JADX INFO: renamed from: r */
        private void m2869r(float f7) {
            this.f2465d = f7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public void m2870s(float f7) {
            this.f2467f = f7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t */
        public void m2871t(float f7) {
            this.f2468g = f7;
        }

        /* JADX INFO: renamed from: u */
        private void m2872u(float f7) {
            this.f2464c = f7;
        }

        @Override // p069I3.C0629p.f
        /* JADX INFO: renamed from: a */
        public void mo2873a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2471a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f2462h;
            rectF.set(m2862k(), m2866o(), m2863l(), m2861j());
            path.arcTo(rectF, m2864m(), m2865n(), false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: I3.p$e */
    public static class e extends f {

        /* JADX INFO: renamed from: b */
        private float f2469b;

        /* JADX INFO: renamed from: c */
        private float f2470c;

        @Override // p069I3.C0629p.f
        /* JADX INFO: renamed from: a */
        public void mo2873a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2471a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f2469b, this.f2470c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: I3.p$f */
    public static abstract class f {

        /* JADX INFO: renamed from: a */
        protected final Matrix f2471a = new Matrix();

        /* JADX INFO: renamed from: a */
        public abstract void mo2873a(Matrix matrix, Path path);
    }

    /* JADX INFO: renamed from: I3.p$g */
    static abstract class g {

        /* JADX INFO: renamed from: b */
        static final Matrix f2472b = new Matrix();

        /* JADX INFO: renamed from: a */
        final Matrix f2473a = new Matrix();

        g() {
        }

        /* JADX INFO: renamed from: a */
        public final void m2878a(C0499a c0499a, int i7, Canvas canvas) {
            mo2851b(f2472b, c0499a, i7, canvas);
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo2851b(Matrix matrix, C0499a c0499a, int i7, Canvas canvas);
    }

    public C0629p() {
        m2849n(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    private void m2830b(float f7) {
        if (m2832g() == f7) {
            return;
        }
        float fM2832g = ((f7 - m2832g()) + 360.0f) % 360.0f;
        if (fM2832g > 180.0f) {
            return;
        }
        d dVar = new d(m2844i(), m2845j(), m2844i(), m2845j());
        dVar.m2870s(m2832g());
        dVar.m2871t(fM2832g);
        this.f2453h.add(new b(dVar));
        m2834p(f7);
    }

    /* JADX INFO: renamed from: c */
    private void m2831c(g gVar, float f7, float f8) {
        m2830b(f7);
        this.f2453h.add(gVar);
        m2834p(f8);
    }

    /* JADX INFO: renamed from: g */
    private float m2832g() {
        return this.f2450e;
    }

    /* JADX INFO: renamed from: h */
    private float m2833h() {
        return this.f2451f;
    }

    /* JADX INFO: renamed from: p */
    private void m2834p(float f7) {
        this.f2450e = f7;
    }

    /* JADX INFO: renamed from: q */
    private void m2835q(float f7) {
        this.f2451f = f7;
    }

    /* JADX INFO: renamed from: r */
    private void m2836r(float f7) {
        this.f2448c = f7;
    }

    /* JADX INFO: renamed from: s */
    private void m2837s(float f7) {
        this.f2449d = f7;
    }

    /* JADX INFO: renamed from: t */
    private void m2838t(float f7) {
        this.f2446a = f7;
    }

    /* JADX INFO: renamed from: u */
    private void m2839u(float f7) {
        this.f2447b = f7;
    }

    /* JADX INFO: renamed from: a */
    public void m2840a(float f7, float f8, float f9, float f10, float f11, float f12) {
        d dVar = new d(f7, f8, f9, f10);
        dVar.m2870s(f11);
        dVar.m2871t(f12);
        this.f2452g.add(dVar);
        b bVar = new b(dVar);
        float f13 = f11 + f12;
        boolean z7 = f12 < 0.0f;
        if (z7) {
            f11 = (f11 + 180.0f) % 360.0f;
        }
        m2831c(bVar, f11, z7 ? (180.0f + f13) % 360.0f : f13);
        double d7 = f13;
        m2836r(((f7 + f9) * 0.5f) + (((f9 - f7) / 2.0f) * ((float) Math.cos(Math.toRadians(d7)))));
        m2837s(((f8 + f10) * 0.5f) + (((f10 - f8) / 2.0f) * ((float) Math.sin(Math.toRadians(d7)))));
    }

    /* JADX INFO: renamed from: d */
    public void m2841d(Matrix matrix, Path path) {
        int size = this.f2452g.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((f) this.f2452g.get(i7)).mo2873a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: e */
    boolean m2842e() {
        return this.f2454i;
    }

    /* JADX INFO: renamed from: f */
    g m2843f(Matrix matrix) {
        m2830b(m2833h());
        return new a(new ArrayList(this.f2453h), new Matrix(matrix));
    }

    /* JADX INFO: renamed from: i */
    float m2844i() {
        return this.f2448c;
    }

    /* JADX INFO: renamed from: j */
    float m2845j() {
        return this.f2449d;
    }

    /* JADX INFO: renamed from: k */
    float m2846k() {
        return this.f2446a;
    }

    /* JADX INFO: renamed from: l */
    float m2847l() {
        return this.f2447b;
    }

    /* JADX INFO: renamed from: m */
    public void m2848m(float f7, float f8) {
        e eVar = new e();
        eVar.f2469b = f7;
        eVar.f2470c = f8;
        this.f2452g.add(eVar);
        c cVar = new c(eVar, m2844i(), m2845j());
        m2831c(cVar, cVar.m2852c() + 270.0f, cVar.m2852c() + 270.0f);
        m2836r(f7);
        m2837s(f8);
    }

    /* JADX INFO: renamed from: n */
    public void m2849n(float f7, float f8) {
        m2850o(f7, f8, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: o */
    public void m2850o(float f7, float f8, float f9, float f10) {
        m2838t(f7);
        m2839u(f8);
        m2836r(f7);
        m2837s(f8);
        m2834p(f9);
        m2835q((f9 + f10) % 360.0f);
        this.f2452g.clear();
        this.f2453h.clear();
        this.f2454i = false;
    }
}
