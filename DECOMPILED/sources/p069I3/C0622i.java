package p069I3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.material.drawable.AbstractC4498d;
import java.util.BitSet;
import p005A3.C0015a;
import p021C3.AbstractC0141a;
import p061H3.C0499a;
import p104N.AbstractC0905b;
import p224d0.AbstractC5205i;
import p224d0.C5207k;
import p224d0.C5208l;
import p325p3.AbstractC6742c;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: I3.i */
/* JADX INFO: loaded from: classes2.dex */
public class C0622i extends Drawable implements InterfaceC0630q {

    /* JADX INFO: renamed from: Q */
    private static final String f2338Q = "i";

    /* JADX INFO: renamed from: R */
    static final C0627n f2339R = C0627n.m2754a().m2805q(0, 0.0f).m2802m();

    /* JADX INFO: renamed from: S */
    private static final Paint f2340S;

    /* JADX INFO: renamed from: T */
    private static final e[] f2341T;

    /* JADX INFO: renamed from: A */
    private final Paint f2342A;

    /* JADX INFO: renamed from: B */
    private final C0499a f2343B;

    /* JADX INFO: renamed from: C */
    private final C0628o.b f2344C;

    /* JADX INFO: renamed from: D */
    private final C0628o f2345D;

    /* JADX INFO: renamed from: E */
    private PorterDuffColorFilter f2346E;

    /* JADX INFO: renamed from: F */
    private PorterDuffColorFilter f2347F;

    /* JADX INFO: renamed from: G */
    private int f2348G;

    /* JADX INFO: renamed from: H */
    private final RectF f2349H;

    /* JADX INFO: renamed from: I */
    private boolean f2350I;

    /* JADX INFO: renamed from: J */
    private boolean f2351J;

    /* JADX INFO: renamed from: K */
    private C0627n f2352K;

    /* JADX INFO: renamed from: L */
    private C5208l f2353L;

    /* JADX INFO: renamed from: M */
    C5207k[] f2354M;

    /* JADX INFO: renamed from: N */
    private float[] f2355N;

    /* JADX INFO: renamed from: O */
    private float[] f2356O;

    /* JADX INFO: renamed from: P */
    private d f2357P;

    /* JADX INFO: renamed from: a */
    private final C0627n.c f2358a;

    /* JADX INFO: renamed from: b */
    private c f2359b;

    /* JADX INFO: renamed from: c */
    private final C0629p.g[] f2360c;

    /* JADX INFO: renamed from: d */
    private final C0629p.g[] f2361d;

    /* JADX INFO: renamed from: e */
    private final BitSet f2362e;

    /* JADX INFO: renamed from: f */
    private boolean f2363f;

    /* JADX INFO: renamed from: r */
    private boolean f2364r;

    /* JADX INFO: renamed from: s */
    private final Matrix f2365s;

    /* JADX INFO: renamed from: t */
    private final Path f2366t;

    /* JADX INFO: renamed from: u */
    private final Path f2367u;

    /* JADX INFO: renamed from: v */
    private final RectF f2368v;

    /* JADX INFO: renamed from: w */
    private final RectF f2369w;

    /* JADX INFO: renamed from: x */
    private final Region f2370x;

    /* JADX INFO: renamed from: y */
    private final Region f2371y;

    /* JADX INFO: renamed from: z */
    private final Paint f2372z;

    /* JADX INFO: renamed from: I3.i$a */
    class a implements C0627n.c {
        a() {
        }

        @Override // p069I3.C0627n.c
        /* JADX INFO: renamed from: a */
        public InterfaceC0617d mo2738a(InterfaceC0617d interfaceC0617d) {
            return interfaceC0617d instanceof C0625l ? interfaceC0617d : new C0615b(-C0622i.this.m2663L(), interfaceC0617d);
        }
    }

    /* JADX INFO: renamed from: I3.i$b */
    class b implements C0628o.b {
        b() {
        }

        @Override // p069I3.C0628o.b
        /* JADX INFO: renamed from: a */
        public void mo2739a(C0629p c0629p, Matrix matrix, int i7) {
            C0622i.this.f2362e.set(i7, c0629p.m2842e());
            C0622i.this.f2360c[i7] = c0629p.m2843f(matrix);
        }

        @Override // p069I3.C0628o.b
        /* JADX INFO: renamed from: b */
        public void mo2740b(C0629p c0629p, Matrix matrix, int i7) {
            C0622i.this.f2362e.set(i7 + 4, c0629p.m2842e());
            C0622i.this.f2361d[i7] = c0629p.m2843f(matrix);
        }
    }

    /* JADX INFO: renamed from: I3.i$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo2741a(float f7);
    }

    /* JADX INFO: renamed from: I3.i$e */
    private static class e extends AbstractC5205i {

        /* JADX INFO: renamed from: b */
        private final int f2398b;

        e(int i7) {
            super("cornerSizeAtIndex" + i7);
            this.f2398b = i7;
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(C0622i c0622i) {
            if (c0622i.f2355N != null) {
                return c0622i.f2355N[this.f2398b];
            }
            return 0.0f;
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(C0622i c0622i, float f7) {
            if (c0622i.f2355N == null || c0622i.f2355N[this.f2398b] == f7) {
                return;
            }
            c0622i.f2355N[this.f2398b] = f7;
            if (c0622i.f2357P != null) {
                c0622i.f2357P.mo2741a(c0622i.m2695B());
            }
            c0622i.invalidateSelf();
        }
    }

    static {
        int i7 = 0;
        Paint paint = new Paint(1);
        f2340S = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f2341T = new e[4];
        while (true) {
            e[] eVarArr = f2341T;
            if (i7 >= eVarArr.length) {
                return;
            }
            eVarArr[i7] = new e(i7);
            i7++;
        }
    }

    public C0622i() {
        this(new C0627n());
    }

    /* JADX INFO: renamed from: A */
    private RectF m2662A() {
        this.f2369w.set(m2737z());
        float fM2663L = m2663L();
        this.f2369w.inset(fM2663L, fM2663L);
        return this.f2369w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public float m2663L() {
        if (m2666T()) {
            return this.f2342A.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: R */
    private boolean m2664R() {
        c cVar = this.f2359b;
        int i7 = cVar.f2392r;
        if (i7 == 1 || cVar.f2393s <= 0) {
            return false;
        }
        return i7 == 2 || m2713b0();
    }

    /* JADX INFO: renamed from: S */
    private boolean m2665S() {
        Paint.Style style = this.f2359b.f2397w;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* JADX INFO: renamed from: T */
    private boolean m2666T() {
        Paint.Style style = this.f2359b.f2397w;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f2342A.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: V */
    private void m2667V() {
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: Y */
    private void m2668Y(Canvas canvas) {
        if (m2664R()) {
            canvas.save();
            m2670a0(canvas);
            if (!this.f2350I) {
                m2686s(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f2349H.width() - getBounds().width());
            int iHeight = (int) (this.f2349H.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f2349H.width()) + (this.f2359b.f2393s * 2) + iWidth, ((int) this.f2349H.height()) + (this.f2359b.f2393s * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f7 = (getBounds().left - this.f2359b.f2393s) - iWidth;
            float f8 = (getBounds().top - this.f2359b.f2393s) - iHeight;
            canvas2.translate(-f7, -f8);
            m2686s(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f7, f8, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: Z */
    private static int m2669Z(int i7, int i8) {
        return (i7 * (i8 + (i8 >>> 7))) >>> 8;
    }

    /* JADX INFO: renamed from: a0 */
    private void m2670a0(Canvas canvas) {
        canvas.translate(m2701H(), m2702I());
    }

    /* JADX INFO: renamed from: j */
    private PorterDuffColorFilter m2679j(Paint paint, boolean z7) {
        if (!z7) {
            return null;
        }
        int color = paint.getColor();
        int iM2729q = m2729q(color);
        this.f2348G = iM2729q;
        if (iM2729q != color) {
            return new PorterDuffColorFilter(iM2729q, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private void m2680k(RectF rectF, Path path) {
        m2723l(rectF, path);
        if (this.f2359b.f2385k != 1.0f) {
            this.f2365s.reset();
            Matrix matrix = this.f2365s;
            float f7 = this.f2359b.f2385k;
            matrix.setScale(f7, f7, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f2365s);
        }
        path.computeBounds(this.f2349H, true);
    }

    /* JADX INFO: renamed from: m */
    private float m2681m(RectF rectF, C0627n c0627n, float[] fArr) {
        if (fArr == null) {
            if (c0627n.m2775v(rectF)) {
                return c0627n.m2771r().mo2655a(rectF);
            }
            return -1.0f;
        }
        if (AbstractC0141a.m609a(fArr) && c0627n.m2774u()) {
            return fArr[0];
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: n */
    private void m2682n() {
        m2692w0();
        this.f2345D.m2828f(this.f2352K, this.f2356O, this.f2359b.f2386l, m2662A(), null, this.f2367u);
    }

    /* JADX INFO: renamed from: o */
    private PorterDuffColorFilter m2683o(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z7) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z7) {
            colorForState = m2729q(colorForState);
        }
        this.f2348G = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX INFO: renamed from: p */
    private PorterDuffColorFilter m2684p(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z7) {
        return (colorStateList == null || mode == null) ? m2679j(paint, z7) : m2683o(colorStateList, mode, z7);
    }

    /* JADX INFO: renamed from: r */
    public static C0622i m2685r(Context context, float f7, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(AbstractC7539a.m33172c(context, AbstractC6742c.f26262k, C0622i.class.getSimpleName()));
        }
        C0622i c0622i = new C0622i();
        c0622i.m2710U(context);
        c0622i.m2718g0(colorStateList);
        c0622i.m2717f0(f7);
        return c0622i;
    }

    /* JADX INFO: renamed from: s */
    private void m2686s(Canvas canvas) {
        if (this.f2362e.cardinality() > 0) {
            Log.w(f2338Q, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f2359b.f2394t != 0) {
            canvas.drawPath(this.f2366t, this.f2343B.m2112c());
        }
        for (int i7 = 0; i7 < 4; i7++) {
            this.f2360c[i7].m2878a(this.f2343B, this.f2359b.f2393s, canvas);
            this.f2361d[i7].m2878a(this.f2343B, this.f2359b.f2393s, canvas);
        }
        if (this.f2350I) {
            int iM2701H = m2701H();
            int iM2702I = m2702I();
            canvas.translate(-iM2701H, -iM2702I);
            canvas.drawPath(this.f2366t, f2340S);
            canvas.translate(iM2701H, iM2702I);
        }
    }

    /* JADX INFO: renamed from: t */
    private void m2687t(Canvas canvas) {
        m2689u(canvas, this.f2372z, this.f2366t, this.f2359b.f2375a, this.f2355N, m2737z());
    }

    /* JADX INFO: renamed from: t0 */
    private boolean m2688t0(int[] iArr) {
        boolean z7;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f2359b.f2379e == null || color2 == (colorForState2 = this.f2359b.f2379e.getColorForState(iArr, (color2 = this.f2372z.getColor())))) {
            z7 = false;
        } else {
            this.f2372z.setColor(colorForState2);
            z7 = true;
        }
        if (this.f2359b.f2380f == null || color == (colorForState = this.f2359b.f2380f.getColorForState(iArr, (color = this.f2342A.getColor())))) {
            return z7;
        }
        this.f2342A.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: u */
    private void m2689u(Canvas canvas, Paint paint, Path path, C0627n c0627n, float[] fArr, RectF rectF) {
        float fM2681m = m2681m(rectF, c0627n, fArr);
        if (fM2681m < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f7 = fM2681m * this.f2359b.f2386l;
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    /* JADX INFO: renamed from: u0 */
    private void m2690u0(int[] iArr) {
        m2691v0(iArr, false);
    }

    /* JADX INFO: renamed from: v0 */
    private void m2691v0(int[] iArr, boolean z7) {
        RectF rectFM2737z = m2737z();
        if (this.f2359b.f2376b == null || rectFM2737z.isEmpty()) {
            return;
        }
        boolean z8 = z7 | (this.f2353L == null);
        if (this.f2355N == null) {
            this.f2355N = new float[4];
        }
        C0627n c0627nM2911d = this.f2359b.f2376b.m2911d(iArr);
        for (int i7 = 0; i7 < 4; i7++) {
            float fMo2655a = this.f2345D.m2829h(i7, c0627nM2911d).mo2655a(rectFM2737z);
            if (z8) {
                this.f2355N[i7] = fMo2655a;
            }
            C5207k c5207k = this.f2354M[i7];
            if (c5207k != null) {
                c5207k.m24080m(fMo2655a);
                if (z8) {
                    this.f2354M[i7].m24084r();
                }
            }
        }
        if (z8) {
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: w0 */
    private void m2692w0() {
        this.f2352K = m2703J().m2779z(this.f2358a);
        float[] fArr = this.f2355N;
        if (fArr == null) {
            this.f2356O = null;
            return;
        }
        if (this.f2356O == null) {
            this.f2356O = new float[fArr.length];
        }
        float fM2663L = m2663L();
        int i7 = 0;
        while (true) {
            float[] fArr2 = this.f2355N;
            if (i7 >= fArr2.length) {
                return;
            }
            this.f2356O[i7] = Math.max(0.0f, fArr2[i7] - fM2663L);
            i7++;
        }
    }

    /* JADX INFO: renamed from: x0 */
    private boolean m2693x0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f2346E;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2347F;
        c cVar = this.f2359b;
        this.f2346E = m2684p(cVar.f2382h, cVar.f2383i, this.f2372z, true);
        c cVar2 = this.f2359b;
        this.f2347F = m2684p(cVar2.f2381g, cVar2.f2383i, this.f2342A, false);
        c cVar3 = this.f2359b;
        if (cVar3.f2396v) {
            this.f2343B.m2113d(cVar3.f2382h.getColorForState(getState(), 0));
        }
        return (AbstractC0905b.m4125a(porterDuffColorFilter, this.f2346E) && AbstractC0905b.m4125a(porterDuffColorFilter2, this.f2347F)) ? false : true;
    }

    /* JADX INFO: renamed from: y0 */
    private void m2694y0() {
        float fM2709Q = m2709Q();
        this.f2359b.f2393s = (int) Math.ceil(0.75f * fM2709Q);
        this.f2359b.f2394t = (int) Math.ceil(fM2709Q * 0.25f);
        m2693x0();
        m2667V();
    }

    /* JADX INFO: renamed from: B */
    public float m2695B() {
        float fMo2655a;
        float fMo2655a2;
        float[] fArr = this.f2355N;
        if (fArr != null) {
            fMo2655a = (fArr[3] + fArr[2]) - fArr[1];
            fMo2655a2 = fArr[0];
        } else {
            RectF rectFM2737z = m2737z();
            fMo2655a = (this.f2345D.m2829h(3, m2703J()).mo2655a(rectFM2737z) + this.f2345D.m2829h(2, m2703J()).mo2655a(rectFM2737z)) - this.f2345D.m2829h(1, m2703J()).mo2655a(rectFM2737z);
            fMo2655a2 = this.f2345D.m2829h(0, m2703J()).mo2655a(rectFM2737z);
        }
        return (fMo2655a - fMo2655a2) / 2.0f;
    }

    /* JADX INFO: renamed from: C */
    public float m2696C() {
        return this.f2359b.f2390p;
    }

    /* JADX INFO: renamed from: D */
    public ColorStateList m2697D() {
        return this.f2359b.f2379e;
    }

    /* JADX INFO: renamed from: E */
    public float m2698E() {
        return this.f2359b.f2386l;
    }

    /* JADX INFO: renamed from: F */
    public float m2699F() {
        return this.f2359b.f2389o;
    }

    /* JADX INFO: renamed from: G */
    public int m2700G() {
        return this.f2348G;
    }

    /* JADX INFO: renamed from: H */
    public int m2701H() {
        c cVar = this.f2359b;
        return (int) (((double) cVar.f2394t) * Math.sin(Math.toRadians(cVar.f2395u)));
    }

    /* JADX INFO: renamed from: I */
    public int m2702I() {
        c cVar = this.f2359b;
        return (int) (((double) cVar.f2394t) * Math.cos(Math.toRadians(cVar.f2395u)));
    }

    /* JADX INFO: renamed from: J */
    public C0627n m2703J() {
        return this.f2359b.f2375a;
    }

    /* JADX INFO: renamed from: K */
    public ColorStateList m2704K() {
        return this.f2359b.f2380f;
    }

    /* JADX INFO: renamed from: M */
    public float m2705M() {
        return this.f2359b.f2387m;
    }

    /* JADX INFO: renamed from: N */
    public float m2706N() {
        float[] fArr = this.f2355N;
        return fArr != null ? fArr[3] : this.f2359b.f2375a.m2771r().mo2655a(m2737z());
    }

    /* JADX INFO: renamed from: O */
    public float m2707O() {
        float[] fArr = this.f2355N;
        return fArr != null ? fArr[0] : this.f2359b.f2375a.m2773t().mo2655a(m2737z());
    }

    /* JADX INFO: renamed from: P */
    public float m2708P() {
        return this.f2359b.f2391q;
    }

    /* JADX INFO: renamed from: Q */
    public float m2709Q() {
        return m2696C() + m2708P();
    }

    /* JADX INFO: renamed from: U */
    public void m2710U(Context context) {
        this.f2359b.f2377c = new C0015a(context);
        m2694y0();
    }

    /* JADX INFO: renamed from: W */
    public boolean m2711W() {
        C0015a c0015a = this.f2359b.f2377c;
        return c0015a != null && c0015a.m83d();
    }

    /* JADX INFO: renamed from: X */
    public boolean m2712X() {
        if (this.f2359b.f2375a.m2775v(m2737z())) {
            return true;
        }
        float[] fArr = this.f2355N;
        return fArr != null && AbstractC0141a.m609a(fArr) && this.f2359b.f2375a.m2774u();
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m2713b0() {
        return (m2712X() || this.f2366t.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    /* JADX INFO: renamed from: c0 */
    public void m2714c0(float f7) {
        setShapeAppearanceModel(this.f2359b.f2375a.m2777x(f7));
    }

    /* JADX INFO: renamed from: d0 */
    public void m2715d0(InterfaceC0617d interfaceC0617d) {
        setShapeAppearanceModel(this.f2359b.f2375a.m2778y(interfaceC0617d));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2372z.setColorFilter(this.f2346E);
        int alpha = this.f2372z.getAlpha();
        this.f2372z.setAlpha(m2669Z(alpha, this.f2359b.f2388n));
        this.f2342A.setColorFilter(this.f2347F);
        this.f2342A.setStrokeWidth(this.f2359b.f2387m);
        int alpha2 = this.f2342A.getAlpha();
        this.f2342A.setAlpha(m2669Z(alpha2, this.f2359b.f2388n));
        if (m2665S()) {
            if (this.f2363f) {
                m2680k(m2737z(), this.f2366t);
                this.f2363f = false;
            }
            m2668Y(canvas);
            m2687t(canvas);
        }
        if (m2666T()) {
            if (this.f2364r) {
                m2682n();
                this.f2364r = false;
            }
            mo2734w(canvas);
        }
        this.f2372z.setAlpha(alpha);
        this.f2342A.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e0 */
    public void m2716e0(C5208l c5208l) {
        if (this.f2353L == c5208l) {
            return;
        }
        this.f2353L = c5208l;
        int i7 = 0;
        while (true) {
            C5207k[] c5207kArr = this.f2354M;
            if (i7 >= c5207kArr.length) {
                m2691v0(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (c5207kArr[i7] == null) {
                    c5207kArr[i7] = new C5207k(this, f2341T[i7]);
                }
                this.f2354M[i7].m24083q(new C5208l().m24090f(c5208l.m24086a()).m24092h(c5208l.m24088c()));
                i7++;
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m2717f0(float f7) {
        c cVar = this.f2359b;
        if (cVar.f2390p != f7) {
            cVar.f2390p = f7;
            m2694y0();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m2718g0(ColorStateList colorStateList) {
        c cVar = this.f2359b;
        if (cVar.f2379e != colorStateList) {
            cVar.f2379e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2359b.f2388n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f2359b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f2359b.f2392r == 2) {
            return;
        }
        RectF rectFM2737z = m2737z();
        if (rectFM2737z.isEmpty()) {
            return;
        }
        float fM2681m = m2681m(rectFM2737z, this.f2359b.f2375a, this.f2355N);
        if (fM2681m >= 0.0f) {
            outline.setRoundRect(getBounds(), fM2681m * this.f2359b.f2386l);
            return;
        }
        if (this.f2363f) {
            m2680k(rectFM2737z, this.f2366t);
            this.f2363f = false;
        }
        AbstractC4498d.m20440l(outline, this.f2366t);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f2359b.f2384j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f2370x.set(getBounds());
        m2680k(m2737z(), this.f2366t);
        this.f2371y.setPath(this.f2366t, this.f2370x);
        this.f2370x.op(this.f2371y, Region.Op.DIFFERENCE);
        return this.f2370x;
    }

    /* JADX INFO: renamed from: h0 */
    public void m2719h0(float f7) {
        c cVar = this.f2359b;
        if (cVar.f2386l != f7) {
            cVar.f2386l = f7;
            this.f2363f = true;
            this.f2364r = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m2720i0(d dVar) {
        this.f2357P = dVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f2363f = true;
        this.f2364r = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f2359b.f2382h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f2359b.f2381g;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f2359b.f2380f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f2359b.f2379e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        C0635v c0635v = this.f2359b.f2376b;
        return c0635v != null && c0635v.m2912f();
    }

    /* JADX INFO: renamed from: j0 */
    public void m2721j0(int i7, int i8, int i9, int i10) {
        c cVar = this.f2359b;
        if (cVar.f2384j == null) {
            cVar.f2384j = new Rect();
        }
        this.f2359b.f2384j.set(i7, i8, i9, i10);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k0 */
    public void m2722k0(float f7) {
        c cVar = this.f2359b;
        if (cVar.f2389o != f7) {
            cVar.f2389o = f7;
            m2694y0();
        }
    }

    /* JADX INFO: renamed from: l */
    protected final void m2723l(RectF rectF, Path path) {
        C0628o c0628o = this.f2345D;
        c cVar = this.f2359b;
        c0628o.m2828f(cVar.f2375a, this.f2355N, cVar.f2386l, rectF, this.f2344C, path);
    }

    /* JADX INFO: renamed from: l0 */
    public void m2724l0(boolean z7) {
        this.f2350I = z7;
    }

    /* JADX INFO: renamed from: m0 */
    public void m2725m0(int i7) {
        this.f2343B.m2113d(i7);
        this.f2359b.f2396v = false;
        m2667V();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2359b = new c(this.f2359b);
        return this;
    }

    /* JADX INFO: renamed from: n0 */
    public void m2726n0(int i7) {
        c cVar = this.f2359b;
        if (cVar.f2392r != i7) {
            cVar.f2392r = i7;
            m2667V();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m2727o0(C0635v c0635v) {
        c cVar = this.f2359b;
        if (cVar.f2376b != c0635v) {
            cVar.f2376b = c0635v;
            m2691v0(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f2363f = true;
        this.f2364r = true;
        super.onBoundsChange(rect);
        if (this.f2359b.f2376b != null && !rect.isEmpty()) {
            m2691v0(getState(), this.f2351J);
        }
        this.f2351J = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.f2359b.f2376b != null) {
            m2690u0(iArr);
        }
        boolean z7 = m2688t0(iArr) || m2693x0();
        if (z7) {
            invalidateSelf();
        }
        return z7;
    }

    /* JADX INFO: renamed from: p0 */
    public void m2728p0(float f7, int i7) {
        m2732s0(f7);
        m2731r0(ColorStateList.valueOf(i7));
    }

    /* JADX INFO: renamed from: q */
    protected int m2729q(int i7) {
        float fM2709Q = m2709Q() + m2699F();
        C0015a c0015a = this.f2359b.f2377c;
        return c0015a != null ? c0015a.m82c(i7, fM2709Q) : i7;
    }

    /* JADX INFO: renamed from: q0 */
    public void m2730q0(float f7, ColorStateList colorStateList) {
        m2732s0(f7);
        m2731r0(colorStateList);
    }

    /* JADX INFO: renamed from: r0 */
    public void m2731r0(ColorStateList colorStateList) {
        c cVar = this.f2359b;
        if (cVar.f2380f != colorStateList) {
            cVar.f2380f = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m2732s0(float f7) {
        this.f2359b.f2387m = f7;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        c cVar = this.f2359b;
        if (cVar.f2388n != i7) {
            cVar.f2388n = i7;
            m2667V();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2359b.f2378d = colorFilter;
        m2667V();
    }

    @Override // p069I3.InterfaceC0630q
    public void setShapeAppearanceModel(C0627n c0627n) {
        c cVar = this.f2359b;
        cVar.f2375a = c0627n;
        cVar.f2376b = null;
        this.f2355N = null;
        this.f2356O = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2359b.f2382h = colorStateList;
        m2693x0();
        m2667V();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f2359b;
        if (cVar.f2383i != mode) {
            cVar.f2383i = mode;
            m2693x0();
            m2667V();
        }
    }

    /* JADX INFO: renamed from: v */
    protected void m2733v(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m2689u(canvas, paint, path, this.f2359b.f2375a, this.f2355N, rectF);
    }

    /* JADX INFO: renamed from: w */
    protected void mo2734w(Canvas canvas) {
        m2689u(canvas, this.f2342A, this.f2367u, this.f2352K, this.f2356O, m2662A());
    }

    /* JADX INFO: renamed from: x */
    public float m2735x() {
        float[] fArr = this.f2355N;
        return fArr != null ? fArr[2] : this.f2359b.f2375a.m2764j().mo2655a(m2737z());
    }

    /* JADX INFO: renamed from: y */
    public float m2736y() {
        float[] fArr = this.f2355N;
        return fArr != null ? fArr[1] : this.f2359b.f2375a.m2766l().mo2655a(m2737z());
    }

    /* JADX INFO: renamed from: z */
    protected RectF m2737z() {
        this.f2368v.set(getBounds());
        return this.f2368v;
    }

    public C0622i(Context context, AttributeSet attributeSet, int i7, int i8) {
        this(C0627n.m2758e(context, attributeSet, i7, i8).m2802m());
    }

    public C0622i(C0627n c0627n) {
        this(new c(c0627n, null));
    }

    protected C0622i(c cVar) {
        C0628o c0628o;
        this.f2358a = new a();
        this.f2360c = new C0629p.g[4];
        this.f2361d = new C0629p.g[4];
        this.f2362e = new BitSet(8);
        this.f2365s = new Matrix();
        this.f2366t = new Path();
        this.f2367u = new Path();
        this.f2368v = new RectF();
        this.f2369w = new RectF();
        this.f2370x = new Region();
        this.f2371y = new Region();
        Paint paint = new Paint(1);
        this.f2372z = paint;
        Paint paint2 = new Paint(1);
        this.f2342A = paint2;
        this.f2343B = new C0499a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c0628o = C0628o.m2822l();
        } else {
            c0628o = new C0628o();
        }
        this.f2345D = c0628o;
        this.f2349H = new RectF();
        this.f2350I = true;
        this.f2351J = true;
        this.f2354M = new C5207k[4];
        this.f2359b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m2693x0();
        m2688t0(getState());
        this.f2344C = new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: I3.i$c */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        C0627n f2375a;

        /* JADX INFO: renamed from: b */
        C0635v f2376b;

        /* JADX INFO: renamed from: c */
        C0015a f2377c;

        /* JADX INFO: renamed from: d */
        ColorFilter f2378d;

        /* JADX INFO: renamed from: e */
        ColorStateList f2379e;

        /* JADX INFO: renamed from: f */
        ColorStateList f2380f;

        /* JADX INFO: renamed from: g */
        ColorStateList f2381g;

        /* JADX INFO: renamed from: h */
        ColorStateList f2382h;

        /* JADX INFO: renamed from: i */
        PorterDuff.Mode f2383i;

        /* JADX INFO: renamed from: j */
        Rect f2384j;

        /* JADX INFO: renamed from: k */
        float f2385k;

        /* JADX INFO: renamed from: l */
        float f2386l;

        /* JADX INFO: renamed from: m */
        float f2387m;

        /* JADX INFO: renamed from: n */
        int f2388n;

        /* JADX INFO: renamed from: o */
        float f2389o;

        /* JADX INFO: renamed from: p */
        float f2390p;

        /* JADX INFO: renamed from: q */
        float f2391q;

        /* JADX INFO: renamed from: r */
        int f2392r;

        /* JADX INFO: renamed from: s */
        int f2393s;

        /* JADX INFO: renamed from: t */
        int f2394t;

        /* JADX INFO: renamed from: u */
        int f2395u;

        /* JADX INFO: renamed from: v */
        boolean f2396v;

        /* JADX INFO: renamed from: w */
        Paint.Style f2397w;

        public c(C0627n c0627n, C0015a c0015a) {
            this.f2379e = null;
            this.f2380f = null;
            this.f2381g = null;
            this.f2382h = null;
            this.f2383i = PorterDuff.Mode.SRC_IN;
            this.f2384j = null;
            this.f2385k = 1.0f;
            this.f2386l = 1.0f;
            this.f2388n = 255;
            this.f2389o = 0.0f;
            this.f2390p = 0.0f;
            this.f2391q = 0.0f;
            this.f2392r = 0;
            this.f2393s = 0;
            this.f2394t = 0;
            this.f2395u = 0;
            this.f2396v = false;
            this.f2397w = Paint.Style.FILL_AND_STROKE;
            this.f2375a = c0627n;
            this.f2377c = c0015a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0622i c0622i = new C0622i(this);
            c0622i.f2363f = true;
            c0622i.f2364r = true;
            return c0622i;
        }

        public c(c cVar) {
            this.f2379e = null;
            this.f2380f = null;
            this.f2381g = null;
            this.f2382h = null;
            this.f2383i = PorterDuff.Mode.SRC_IN;
            this.f2384j = null;
            this.f2385k = 1.0f;
            this.f2386l = 1.0f;
            this.f2388n = 255;
            this.f2389o = 0.0f;
            this.f2390p = 0.0f;
            this.f2391q = 0.0f;
            this.f2392r = 0;
            this.f2393s = 0;
            this.f2394t = 0;
            this.f2395u = 0;
            this.f2396v = false;
            this.f2397w = Paint.Style.FILL_AND_STROKE;
            this.f2375a = cVar.f2375a;
            this.f2376b = cVar.f2376b;
            this.f2377c = cVar.f2377c;
            this.f2387m = cVar.f2387m;
            this.f2378d = cVar.f2378d;
            this.f2379e = cVar.f2379e;
            this.f2380f = cVar.f2380f;
            this.f2383i = cVar.f2383i;
            this.f2382h = cVar.f2382h;
            this.f2388n = cVar.f2388n;
            this.f2385k = cVar.f2385k;
            this.f2394t = cVar.f2394t;
            this.f2392r = cVar.f2392r;
            this.f2396v = cVar.f2396v;
            this.f2386l = cVar.f2386l;
            this.f2389o = cVar.f2389o;
            this.f2390p = cVar.f2390p;
            this.f2391q = cVar.f2391q;
            this.f2393s = cVar.f2393s;
            this.f2395u = cVar.f2395u;
            this.f2381g = cVar.f2381g;
            this.f2397w = cVar.f2397w;
            if (cVar.f2384j != null) {
                this.f2384j = new Rect(cVar.f2384j);
            }
        }
    }
}
