package p069I3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: renamed from: I3.o */
/* JADX INFO: loaded from: classes2.dex */
public class C0628o {

    /* JADX INFO: renamed from: a */
    private final C0629p[] f2428a = new C0629p[4];

    /* JADX INFO: renamed from: b */
    private final Matrix[] f2429b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    private final Matrix[] f2430c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    private final PointF f2431d = new PointF();

    /* JADX INFO: renamed from: e */
    private final Path f2432e = new Path();

    /* JADX INFO: renamed from: f */
    private final Path f2433f = new Path();

    /* JADX INFO: renamed from: g */
    private final C0629p f2434g = new C0629p();

    /* JADX INFO: renamed from: h */
    private final float[] f2435h = new float[2];

    /* JADX INFO: renamed from: i */
    private final float[] f2436i = new float[2];

    /* JADX INFO: renamed from: j */
    private final Path f2437j = new Path();

    /* JADX INFO: renamed from: k */
    private final Path f2438k = new Path();

    /* JADX INFO: renamed from: l */
    private boolean f2439l = true;

    /* JADX INFO: renamed from: I3.o$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        static final C0628o f2440a = new C0628o();
    }

    /* JADX INFO: renamed from: I3.o$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2739a(C0629p c0629p, Matrix matrix, int i7);

        /* JADX INFO: renamed from: b */
        void mo2740b(C0629p c0629p, Matrix matrix, int i7);
    }

    /* JADX INFO: renamed from: I3.o$c */
    static final class c {

        /* JADX INFO: renamed from: a */
        public final C0627n f2441a;

        /* JADX INFO: renamed from: b */
        public final Path f2442b;

        /* JADX INFO: renamed from: c */
        public final RectF f2443c;

        /* JADX INFO: renamed from: d */
        public final b f2444d;

        /* JADX INFO: renamed from: e */
        public final float f2445e;

        c(C0627n c0627n, float f7, RectF rectF, b bVar, Path path) {
            this.f2444d = bVar;
            this.f2441a = c0627n;
            this.f2445e = f7;
            this.f2443c = rectF;
            this.f2442b = path;
        }
    }

    public C0628o() {
        for (int i7 = 0; i7 < 4; i7++) {
            this.f2428a[i7] = new C0629p();
            this.f2429b[i7] = new Matrix();
            this.f2430c[i7] = new Matrix();
        }
    }

    /* JADX INFO: renamed from: a */
    private float m2815a(int i7) {
        return ((i7 + 1) % 4) * 90;
    }

    /* JADX INFO: renamed from: b */
    private void m2816b(c cVar, int i7) {
        this.f2435h[0] = this.f2428a[i7].m2846k();
        this.f2435h[1] = this.f2428a[i7].m2847l();
        this.f2429b[i7].mapPoints(this.f2435h);
        if (i7 == 0) {
            Path path = cVar.f2442b;
            float[] fArr = this.f2435h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f2442b;
            float[] fArr2 = this.f2435h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f2428a[i7].m2841d(this.f2429b[i7], cVar.f2442b);
        b bVar = cVar.f2444d;
        if (bVar != null) {
            bVar.mo2739a(this.f2428a[i7], this.f2429b[i7], i7);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2817c(c cVar, int i7) {
        int i8 = (i7 + 1) % 4;
        this.f2435h[0] = this.f2428a[i7].m2844i();
        this.f2435h[1] = this.f2428a[i7].m2845j();
        this.f2429b[i7].mapPoints(this.f2435h);
        this.f2436i[0] = this.f2428a[i8].m2846k();
        this.f2436i[1] = this.f2428a[i8].m2847l();
        this.f2429b[i8].mapPoints(this.f2436i);
        float[] fArr = this.f2435h;
        float f7 = fArr[0];
        float[] fArr2 = this.f2436i;
        float fMax = Math.max(((float) Math.hypot(f7 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float fM2820j = m2820j(cVar.f2443c, i7);
        this.f2434g.m2849n(0.0f, 0.0f);
        C0620g c0620gM2821k = m2821k(i7, cVar.f2441a);
        c0620gM2821k.mo2661b(fMax, fM2820j, cVar.f2445e, this.f2434g);
        this.f2437j.reset();
        this.f2434g.m2841d(this.f2430c[i7], this.f2437j);
        if (this.f2439l && (c0620gM2821k.mo2660a() || m2823m(this.f2437j, i7) || m2823m(this.f2437j, i8))) {
            Path path = this.f2437j;
            path.op(path, this.f2433f, Path.Op.DIFFERENCE);
            this.f2435h[0] = this.f2434g.m2846k();
            this.f2435h[1] = this.f2434g.m2847l();
            this.f2430c[i7].mapPoints(this.f2435h);
            Path path2 = this.f2432e;
            float[] fArr3 = this.f2435h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f2434g.m2841d(this.f2430c[i7], this.f2432e);
        } else {
            this.f2434g.m2841d(this.f2430c[i7], cVar.f2442b);
        }
        b bVar = cVar.f2444d;
        if (bVar != null) {
            bVar.mo2740b(this.f2434g, this.f2430c[i7], i7);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m2818g(int i7, RectF rectF, PointF pointF) {
        if (i7 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i7 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i7 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* JADX INFO: renamed from: i */
    private AbstractC0618e m2819i(int i7, C0627n c0627n) {
        if (i7 == 1) {
            return c0627n.m2765k();
        }
        if (i7 != 2) {
            return i7 != 3 ? c0627n.m2772s() : c0627n.m2770q();
        }
        return c0627n.m2763i();
    }

    /* JADX INFO: renamed from: j */
    private float m2820j(RectF rectF, int i7) {
        float[] fArr = this.f2435h;
        C0629p c0629p = this.f2428a[i7];
        fArr[0] = c0629p.f2448c;
        fArr[1] = c0629p.f2449d;
        this.f2429b[i7].mapPoints(fArr);
        return (i7 == 1 || i7 == 3) ? Math.abs(rectF.centerX() - this.f2435h[0]) : Math.abs(rectF.centerY() - this.f2435h[1]);
    }

    /* JADX INFO: renamed from: k */
    private C0620g m2821k(int i7, C0627n c0627n) {
        if (i7 == 1) {
            return c0627n.m2762h();
        }
        if (i7 != 2) {
            return i7 != 3 ? c0627n.m2768o() : c0627n.m2769p();
        }
        return c0627n.m2767n();
    }

    /* JADX INFO: renamed from: l */
    public static C0628o m2822l() {
        return a.f2440a;
    }

    /* JADX INFO: renamed from: m */
    private boolean m2823m(Path path, int i7) {
        this.f2438k.reset();
        this.f2428a[i7].m2841d(this.f2429b[i7], this.f2438k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f2438k.computeBounds(rectF, true);
        path.op(this.f2438k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX INFO: renamed from: n */
    private void m2824n(c cVar, int i7, float[] fArr) {
        m2819i(i7, cVar.f2441a).m2659b(this.f2428a[i7], 90.0f, cVar.f2445e, cVar.f2443c, fArr == null ? m2829h(i7, cVar.f2441a) : new C0616c(fArr[i7]));
        float fM2815a = m2815a(i7);
        this.f2429b[i7].reset();
        m2818g(i7, cVar.f2443c, this.f2431d);
        Matrix matrix = this.f2429b[i7];
        PointF pointF = this.f2431d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f2429b[i7].preRotate(fM2815a);
    }

    /* JADX INFO: renamed from: o */
    private void m2825o(int i7) {
        this.f2435h[0] = this.f2428a[i7].m2844i();
        this.f2435h[1] = this.f2428a[i7].m2845j();
        this.f2429b[i7].mapPoints(this.f2435h);
        float fM2815a = m2815a(i7);
        this.f2430c[i7].reset();
        Matrix matrix = this.f2430c[i7];
        float[] fArr = this.f2435h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f2430c[i7].preRotate(fM2815a);
    }

    /* JADX INFO: renamed from: d */
    public void m2826d(C0627n c0627n, float f7, RectF rectF, b bVar, Path path) {
        m2828f(c0627n, null, f7, rectF, bVar, path);
    }

    /* JADX INFO: renamed from: e */
    public void m2827e(C0627n c0627n, float f7, RectF rectF, Path path) {
        m2826d(c0627n, f7, rectF, null, path);
    }

    /* JADX INFO: renamed from: f */
    public void m2828f(C0627n c0627n, float[] fArr, float f7, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f2432e.rewind();
        this.f2433f.rewind();
        this.f2433f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(c0627n, f7, rectF, bVar, path);
        for (int i7 = 0; i7 < 4; i7++) {
            m2824n(cVar, i7, fArr);
            m2825o(i7);
        }
        for (int i8 = 0; i8 < 4; i8++) {
            m2816b(cVar, i8);
            m2817c(cVar, i8);
        }
        path.close();
        this.f2432e.close();
        if (this.f2432e.isEmpty()) {
            return;
        }
        path.op(this.f2432e, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: h */
    InterfaceC0617d m2829h(int i7, C0627n c0627n) {
        if (i7 == 1) {
            return c0627n.m2766l();
        }
        if (i7 != 2) {
            return i7 != 3 ? c0627n.m2773t() : c0627n.m2771r();
        }
        return c0627n.m2764j();
    }
}
