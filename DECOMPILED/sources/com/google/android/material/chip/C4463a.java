package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.common.api.C3553a;
import com.google.android.material.drawable.AbstractC4498d;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.AbstractC4546v;
import com.google.android.material.internal.C4541q;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p033E.AbstractC0246a;
import p041F.AbstractC0400a;
import p045F3.AbstractC0423c;
import p045F3.C0424d;
import p053G3.AbstractC0481a;
import p069I3.C0622i;
import p097M.C0857a;
import p263i.AbstractC5659a;
import p325p3.AbstractC6752m;
import p333q3.C6831f;
import p365u3.AbstractC7159a;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: com.google.android.material.chip.a */
/* JADX INFO: loaded from: classes2.dex */
public class C4463a extends C0622i implements Drawable.Callback, C4541q.b {

    /* JADX INFO: renamed from: e1 */
    private static final int[] f16771e1 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: f1 */
    private static final ShapeDrawable f16772f1 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0 */
    private float f16773A0;

    /* JADX INFO: renamed from: B0 */
    private final Context f16774B0;

    /* JADX INFO: renamed from: C0 */
    private final Paint f16775C0;

    /* JADX INFO: renamed from: D0 */
    private final Paint f16776D0;

    /* JADX INFO: renamed from: E0 */
    private final Paint.FontMetrics f16777E0;

    /* JADX INFO: renamed from: F0 */
    private final RectF f16778F0;

    /* JADX INFO: renamed from: G0 */
    private final PointF f16779G0;

    /* JADX INFO: renamed from: H0 */
    private final Path f16780H0;

    /* JADX INFO: renamed from: I0 */
    private final C4541q f16781I0;

    /* JADX INFO: renamed from: J0 */
    private int f16782J0;

    /* JADX INFO: renamed from: K0 */
    private int f16783K0;

    /* JADX INFO: renamed from: L0 */
    private int f16784L0;

    /* JADX INFO: renamed from: M0 */
    private int f16785M0;

    /* JADX INFO: renamed from: N0 */
    private int f16786N0;

    /* JADX INFO: renamed from: O0 */
    private int f16787O0;

    /* JADX INFO: renamed from: P0 */
    private boolean f16788P0;

    /* JADX INFO: renamed from: Q0 */
    private int f16789Q0;

    /* JADX INFO: renamed from: R0 */
    private int f16790R0;

    /* JADX INFO: renamed from: S0 */
    private ColorFilter f16791S0;

    /* JADX INFO: renamed from: T0 */
    private PorterDuffColorFilter f16792T0;

    /* JADX INFO: renamed from: U */
    private ColorStateList f16793U;

    /* JADX INFO: renamed from: U0 */
    private ColorStateList f16794U0;

    /* JADX INFO: renamed from: V */
    private ColorStateList f16795V;

    /* JADX INFO: renamed from: V0 */
    private PorterDuff.Mode f16796V0;

    /* JADX INFO: renamed from: W */
    private float f16797W;

    /* JADX INFO: renamed from: W0 */
    private int[] f16798W0;

    /* JADX INFO: renamed from: X */
    private float f16799X;

    /* JADX INFO: renamed from: X0 */
    private boolean f16800X0;

    /* JADX INFO: renamed from: Y */
    private ColorStateList f16801Y;

    /* JADX INFO: renamed from: Y0 */
    private ColorStateList f16802Y0;

    /* JADX INFO: renamed from: Z */
    private float f16803Z;

    /* JADX INFO: renamed from: Z0 */
    private WeakReference f16804Z0;

    /* JADX INFO: renamed from: a0 */
    private ColorStateList f16805a0;

    /* JADX INFO: renamed from: a1 */
    private TextUtils.TruncateAt f16806a1;

    /* JADX INFO: renamed from: b0 */
    private CharSequence f16807b0;

    /* JADX INFO: renamed from: b1 */
    private boolean f16808b1;

    /* JADX INFO: renamed from: c0 */
    private boolean f16809c0;

    /* JADX INFO: renamed from: c1 */
    private int f16810c1;

    /* JADX INFO: renamed from: d0 */
    private Drawable f16811d0;

    /* JADX INFO: renamed from: d1 */
    private boolean f16812d1;

    /* JADX INFO: renamed from: e0 */
    private ColorStateList f16813e0;

    /* JADX INFO: renamed from: f0 */
    private float f16814f0;

    /* JADX INFO: renamed from: g0 */
    private boolean f16815g0;

    /* JADX INFO: renamed from: h0 */
    private boolean f16816h0;

    /* JADX INFO: renamed from: i0 */
    private Drawable f16817i0;

    /* JADX INFO: renamed from: j0 */
    private Drawable f16818j0;

    /* JADX INFO: renamed from: k0 */
    private ColorStateList f16819k0;

    /* JADX INFO: renamed from: l0 */
    private float f16820l0;

    /* JADX INFO: renamed from: m0 */
    private CharSequence f16821m0;

    /* JADX INFO: renamed from: n0 */
    private boolean f16822n0;

    /* JADX INFO: renamed from: o0 */
    private boolean f16823o0;

    /* JADX INFO: renamed from: p0 */
    private Drawable f16824p0;

    /* JADX INFO: renamed from: q0 */
    private ColorStateList f16825q0;

    /* JADX INFO: renamed from: r0 */
    private C6831f f16826r0;

    /* JADX INFO: renamed from: s0 */
    private C6831f f16827s0;

    /* JADX INFO: renamed from: t0 */
    private float f16828t0;

    /* JADX INFO: renamed from: u0 */
    private float f16829u0;

    /* JADX INFO: renamed from: v0 */
    private float f16830v0;

    /* JADX INFO: renamed from: w0 */
    private float f16831w0;

    /* JADX INFO: renamed from: x0 */
    private float f16832x0;

    /* JADX INFO: renamed from: y0 */
    private float f16833y0;

    /* JADX INFO: renamed from: z0 */
    private float f16834z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo20053a();
    }

    private C4463a(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f16799X = -1.0f;
        this.f16775C0 = new Paint(1);
        this.f16777E0 = new Paint.FontMetrics();
        this.f16778F0 = new RectF();
        this.f16779G0 = new PointF();
        this.f16780H0 = new Path();
        this.f16790R0 = 255;
        this.f16796V0 = PorterDuff.Mode.SRC_IN;
        this.f16804Z0 = new WeakReference(null);
        m2710U(context);
        this.f16774B0 = context;
        C4541q c4541q = new C4541q(this);
        this.f16781I0 = c4541q;
        this.f16807b0 = "";
        c4541q.m20803g().density = context.getResources().getDisplayMetrics().density;
        this.f16776D0 = null;
        int[] iArr = f16771e1;
        setState(iArr);
        m20105B2(iArr);
        this.f16808b1 = true;
        f16772f1.setTint(-1);
    }

    /* JADX INFO: renamed from: A0 */
    private void m20068A0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m20093e3() || m20092d3()) {
            float f7 = this.f16828t0 + this.f16829u0;
            float fM20099p1 = m20099p1();
            if (AbstractC0400a.m1700f(this) == 0) {
                float f8 = rect.left + f7;
                rectF.left = f8;
                rectF.right = f8 + fM20099p1;
            } else {
                float f9 = rect.right - f7;
                rectF.right = f9;
                rectF.left = f9 - fM20099p1;
            }
            float fM20098o1 = m20098o1();
            float fExactCenterY = rect.exactCenterY() - (fM20098o1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fM20098o1;
        }
    }

    /* JADX INFO: renamed from: A1 */
    private ColorFilter m20069A1() {
        ColorFilter colorFilter = this.f16791S0;
        return colorFilter != null ? colorFilter : this.f16792T0;
    }

    /* JADX INFO: renamed from: C0 */
    private void m20070C0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m20094f3()) {
            float f7 = this.f16773A0 + this.f16834z0 + this.f16820l0 + this.f16833y0 + this.f16832x0;
            if (AbstractC0400a.m1700f(this) == 0) {
                rectF.right = rect.right - f7;
            } else {
                rectF.left = rect.left + f7;
            }
        }
    }

    /* JADX INFO: renamed from: C1 */
    private static boolean m20071C1(int[] iArr, int i7) {
        if (iArr == null) {
            return false;
        }
        for (int i8 : iArr) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    private void m20072D0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m20094f3()) {
            float f7 = this.f16773A0 + this.f16834z0;
            if (AbstractC0400a.m1700f(this) == 0) {
                float f8 = rect.right - f7;
                rectF.right = f8;
                rectF.left = f8 - this.f16820l0;
            } else {
                float f9 = rect.left + f7;
                rectF.left = f9;
                rectF.right = f9 + this.f16820l0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f10 = this.f16820l0;
            float f11 = fExactCenterY - (f10 / 2.0f);
            rectF.top = f11;
            rectF.bottom = f11 + f10;
        }
    }

    /* JADX INFO: renamed from: E0 */
    private void m20073E0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m20094f3()) {
            float f7 = this.f16773A0 + this.f16834z0 + this.f16820l0 + this.f16833y0 + this.f16832x0;
            if (AbstractC0400a.m1700f(this) == 0) {
                float f8 = rect.right;
                rectF.right = f8;
                rectF.left = f8 - f7;
            } else {
                int i7 = rect.left;
                rectF.left = i7;
                rectF.right = i7 + f7;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* JADX INFO: renamed from: G0 */
    private void m20074G0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f16807b0 != null) {
            float fM20103B0 = this.f16828t0 + m20103B0() + this.f16831w0;
            float fM20111F0 = this.f16773A0 + m20111F0() + this.f16832x0;
            if (AbstractC0400a.m1700f(this) == 0) {
                rectF.left = rect.left + fM20103B0;
                rectF.right = rect.right - fM20111F0;
            } else {
                rectF.left = rect.left + fM20111F0;
                rectF.right = rect.right - fM20103B0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* JADX INFO: renamed from: G1 */
    private static boolean m20075G1(C0424d c0424d) {
        return (c0424d == null || c0424d.m1845j() == null || !c0424d.m1845j().isStateful()) ? false : true;
    }

    /* JADX INFO: renamed from: H0 */
    private float m20076H0() {
        this.f16781I0.m20803g().getFontMetrics(this.f16777E0);
        Paint.FontMetrics fontMetrics = this.f16777E0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX INFO: renamed from: H1 */
    private static boolean m20077H1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: I1 */
    private static boolean m20078I1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: J0 */
    private boolean m20079J0() {
        return this.f16823o0 && this.f16824p0 != null && this.f16822n0;
    }

    /* JADX INFO: renamed from: J1 */
    private void m20080J1(AttributeSet attributeSet, int i7, int i8) {
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(this.f16774B0, attributeSet, AbstractC6752m.f26684L0, i7, i8, new int[0]);
        this.f16812d1 = typedArrayM20818i.hasValue(AbstractC6752m.f27088w1);
        m20100r2(AbstractC0423c.m1825a(this.f16774B0, typedArrayM20818i, AbstractC6752m.f26945j1));
        m20142V1(AbstractC0423c.m1825a(this.f16774B0, typedArrayM20818i, AbstractC6752m.f26805W0));
        m20178j2(typedArrayM20818i.getDimension(AbstractC6752m.f26890e1, 0.0f));
        int i9 = AbstractC6752m.f26815X0;
        if (typedArrayM20818i.hasValue(i9)) {
            m20148X1(typedArrayM20818i.getDimension(i9, 0.0f));
        }
        m20186n2(AbstractC0423c.m1825a(this.f16774B0, typedArrayM20818i, AbstractC6752m.f26923h1));
        m20188p2(typedArrayM20818i.getDimension(AbstractC6752m.f26934i1, 0.0f));
        m20127O2(AbstractC0423c.m1825a(this.f16774B0, typedArrayM20818i, AbstractC6752m.f27077v1));
        m20137T2(typedArrayM20818i.getText(AbstractC6752m.f26739Q0));
        C0424d c0424dM1831g = AbstractC0423c.m1831g(this.f16774B0, typedArrayM20818i, AbstractC6752m.f26695M0);
        c0424dM1831g.m1848o(typedArrayM20818i.getDimension(AbstractC6752m.f26706N0, c0424dM1831g.m1846k()));
        m20140U2(c0424dM1831g);
        int i10 = typedArrayM20818i.getInt(AbstractC6752m.f26717O0, 0);
        if (i10 == 1) {
            m20114G2(TextUtils.TruncateAt.START);
        } else if (i10 == 2) {
            m20114G2(TextUtils.TruncateAt.MIDDLE);
        } else if (i10 == 3) {
            m20114G2(TextUtils.TruncateAt.END);
        }
        m20176i2(typedArrayM20818i.getBoolean(AbstractC6752m.f26879d1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            m20176i2(typedArrayM20818i.getBoolean(AbstractC6752m.f26846a1, false));
        }
        m20160b2(AbstractC0423c.m1828d(this.f16774B0, typedArrayM20818i, AbstractC6752m.f26835Z0));
        int i11 = AbstractC6752m.f26868c1;
        if (typedArrayM20818i.hasValue(i11)) {
            m20170f2(AbstractC0423c.m1825a(this.f16774B0, typedArrayM20818i, i11));
        }
        m20166d2(typedArrayM20818i.getDimension(AbstractC6752m.f26857b1, -1.0f));
        m20110E2(typedArrayM20818i.getBoolean(AbstractC6752m.f27022q1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            m20110E2(typedArrayM20818i.getBoolean(AbstractC6752m.f26967l1, false));
        }
        m20193s2(AbstractC0423c.m1828d(this.f16774B0, typedArrayM20818i, AbstractC6752m.f26956k1));
        m20106C2(AbstractC0423c.m1825a(this.f16774B0, typedArrayM20818i, AbstractC6752m.f27011p1));
        m20203x2(typedArrayM20818i.getDimension(AbstractC6752m.f26989n1, 0.0f));
        m20124N1(typedArrayM20818i.getBoolean(AbstractC6752m.f26750R0, false));
        m20139U1(typedArrayM20818i.getBoolean(AbstractC6752m.f26794V0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            m20139U1(typedArrayM20818i.getBoolean(AbstractC6752m.f26772T0, false));
        }
        m20128P1(AbstractC0423c.m1828d(this.f16774B0, typedArrayM20818i, AbstractC6752m.f26761S0));
        int i12 = AbstractC6752m.f26783U0;
        if (typedArrayM20818i.hasValue(i12)) {
            m20132R1(AbstractC0423c.m1825a(this.f16774B0, typedArrayM20818i, i12));
        }
        m20133R2(C6831f.m29853c(this.f16774B0, typedArrayM20818i, AbstractC6752m.f27099x1));
        m20115H2(C6831f.m29853c(this.f16774B0, typedArrayM20818i, AbstractC6752m.f27044s1));
        m20182l2(typedArrayM20818i.getDimension(AbstractC6752m.f26912g1, 0.0f));
        m20121L2(typedArrayM20818i.getDimension(AbstractC6752m.f27066u1, 0.0f));
        m20118J2(typedArrayM20818i.getDimension(AbstractC6752m.f27055t1, 0.0f));
        m20155Z2(typedArrayM20818i.getDimension(AbstractC6752m.f27121z1, 0.0f));
        m20146W2(typedArrayM20818i.getDimension(AbstractC6752m.f27110y1, 0.0f));
        m20207z2(typedArrayM20818i.getDimension(AbstractC6752m.f27000o1, 0.0f));
        m20197u2(typedArrayM20818i.getDimension(AbstractC6752m.f26978m1, 0.0f));
        m20154Z1(typedArrayM20818i.getDimension(AbstractC6752m.f26825Y0, 0.0f));
        m20125N2(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26728P0, C3553a.e.API_PRIORITY_OTHER));
        typedArrayM20818i.recycle();
    }

    /* JADX INFO: renamed from: K0 */
    public static C4463a m20081K0(Context context, AttributeSet attributeSet, int i7, int i8) {
        C4463a c4463a = new C4463a(context, attributeSet, i7, i8);
        c4463a.m20080J1(attributeSet, i7, i8);
        return c4463a;
    }

    /* JADX INFO: renamed from: L0 */
    private void m20082L0(Canvas canvas, Rect rect) {
        if (m20092d3()) {
            m20068A0(rect, this.f16778F0);
            RectF rectF = this.f16778F0;
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas.translate(f7, f8);
            this.f16824p0.setBounds(0, 0, (int) this.f16778F0.width(), (int) this.f16778F0.height());
            this.f16824p0.draw(canvas);
            canvas.translate(-f7, -f8);
        }
    }

    /* JADX INFO: renamed from: L1 */
    private boolean m20083L1(int[] iArr, int[] iArr2) {
        boolean z7;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f16793U;
        int iM2729q = m2729q(colorStateList != null ? colorStateList.getColorForState(iArr, this.f16782J0) : 0);
        boolean state = true;
        if (this.f16782J0 != iM2729q) {
            this.f16782J0 = iM2729q;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f16795V;
        int iM2729q2 = m2729q(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f16783K0) : 0);
        if (this.f16783K0 != iM2729q2) {
            this.f16783K0 = iM2729q2;
            zOnStateChange = true;
        }
        int iM33178i = AbstractC7539a.m33178i(iM2729q, iM2729q2);
        if ((this.f16784L0 != iM33178i) | (m2697D() == null)) {
            this.f16784L0 = iM33178i;
            m2718g0(ColorStateList.valueOf(iM33178i));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f16801Y;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f16785M0) : 0;
        if (this.f16785M0 != colorForState) {
            this.f16785M0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f16802Y0 == null || !AbstractC0481a.m2066e(iArr)) ? 0 : this.f16802Y0.getColorForState(iArr, this.f16786N0);
        if (this.f16786N0 != colorForState2) {
            this.f16786N0 = colorForState2;
            if (this.f16800X0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f16781I0.m20801e() == null || this.f16781I0.m20801e().m1845j() == null) ? 0 : this.f16781I0.m20801e().m1845j().getColorForState(iArr, this.f16787O0);
        if (this.f16787O0 != colorForState3) {
            this.f16787O0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z8 = m20071C1(getState(), R.attr.state_checked) && this.f16822n0;
        if (this.f16788P0 == z8 || this.f16824p0 == null) {
            z7 = false;
        } else {
            float fM20103B0 = m20103B0();
            this.f16788P0 = z8;
            if (fM20103B0 != m20103B0()) {
                zOnStateChange = true;
                z7 = true;
            } else {
                z7 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f16794U0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f16789Q0) : 0;
        if (this.f16789Q0 != colorForState4) {
            this.f16789Q0 = colorForState4;
            this.f16792T0 = AbstractC4498d.m20443o(this, this.f16794U0, this.f16796V0);
        } else {
            state = zOnStateChange;
        }
        if (m20078I1(this.f16811d0)) {
            state |= this.f16811d0.setState(iArr);
        }
        if (m20078I1(this.f16824p0)) {
            state |= this.f16824p0.setState(iArr);
        }
        if (m20078I1(this.f16817i0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f16817i0.setState(iArr3);
        }
        if (m20078I1(this.f16818j0)) {
            state |= this.f16818j0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z7) {
            m20119K1();
        }
        return state;
    }

    /* JADX INFO: renamed from: M0 */
    private void m20084M0(Canvas canvas, Rect rect) {
        if (this.f16812d1) {
            return;
        }
        this.f16775C0.setColor(this.f16783K0);
        this.f16775C0.setStyle(Paint.Style.FILL);
        this.f16775C0.setColorFilter(m20069A1());
        this.f16778F0.set(rect);
        canvas.drawRoundRect(this.f16778F0, m20147X0(), m20147X0(), this.f16775C0);
    }

    /* JADX INFO: renamed from: N0 */
    private void m20085N0(Canvas canvas, Rect rect) {
        if (m20093e3()) {
            m20068A0(rect, this.f16778F0);
            RectF rectF = this.f16778F0;
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas.translate(f7, f8);
            this.f16811d0.setBounds(0, 0, (int) this.f16778F0.width(), (int) this.f16778F0.height());
            this.f16811d0.draw(canvas);
            canvas.translate(-f7, -f8);
        }
    }

    /* JADX INFO: renamed from: O0 */
    private void m20086O0(Canvas canvas, Rect rect) {
        if (this.f16803Z <= 0.0f || this.f16812d1) {
            return;
        }
        this.f16775C0.setColor(this.f16785M0);
        this.f16775C0.setStyle(Paint.Style.STROKE);
        if (!this.f16812d1) {
            this.f16775C0.setColorFilter(m20069A1());
        }
        RectF rectF = this.f16778F0;
        float f7 = rect.left;
        float f8 = this.f16803Z;
        rectF.set(f7 + (f8 / 2.0f), rect.top + (f8 / 2.0f), rect.right - (f8 / 2.0f), rect.bottom - (f8 / 2.0f));
        float f9 = this.f16799X - (this.f16803Z / 2.0f);
        canvas.drawRoundRect(this.f16778F0, f9, f9, this.f16775C0);
    }

    /* JADX INFO: renamed from: P0 */
    private void m20087P0(Canvas canvas, Rect rect) {
        if (this.f16812d1) {
            return;
        }
        this.f16775C0.setColor(this.f16782J0);
        this.f16775C0.setStyle(Paint.Style.FILL);
        this.f16778F0.set(rect);
        canvas.drawRoundRect(this.f16778F0, m20147X0(), m20147X0(), this.f16775C0);
    }

    /* JADX INFO: renamed from: Q0 */
    private void m20088Q0(Canvas canvas, Rect rect) {
        if (m20094f3()) {
            m20072D0(rect, this.f16778F0);
            RectF rectF = this.f16778F0;
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas.translate(f7, f8);
            this.f16817i0.setBounds(0, 0, (int) this.f16778F0.width(), (int) this.f16778F0.height());
            this.f16818j0.setBounds(this.f16817i0.getBounds());
            this.f16818j0.jumpToCurrentState();
            this.f16818j0.draw(canvas);
            canvas.translate(-f7, -f8);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private void m20089R0(Canvas canvas, Rect rect) {
        this.f16775C0.setColor(this.f16786N0);
        this.f16775C0.setStyle(Paint.Style.FILL);
        this.f16778F0.set(rect);
        if (!this.f16812d1) {
            canvas.drawRoundRect(this.f16778F0, m20147X0(), m20147X0(), this.f16775C0);
        } else {
            m2723l(new RectF(rect), this.f16780H0);
            super.m2733v(canvas, this.f16775C0, this.f16780H0, m2737z());
        }
    }

    /* JADX INFO: renamed from: S0 */
    private void m20090S0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f16776D0;
        if (paint != null) {
            paint.setColor(AbstractC0246a.m1182k(-16777216, 127));
            canvas.drawRect(rect, this.f16776D0);
            if (m20093e3() || m20092d3()) {
                m20068A0(rect, this.f16778F0);
                canvas.drawRect(this.f16778F0, this.f16776D0);
            }
            if (this.f16807b0 != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f16776D0);
            } else {
                canvas2 = canvas;
            }
            if (m20094f3()) {
                m20072D0(rect, this.f16778F0);
                canvas2.drawRect(this.f16778F0, this.f16776D0);
            }
            this.f16776D0.setColor(AbstractC0246a.m1182k(-65536, 127));
            m20070C0(rect, this.f16778F0);
            canvas2.drawRect(this.f16778F0, this.f16776D0);
            this.f16776D0.setColor(AbstractC0246a.m1182k(-16711936, 127));
            m20073E0(rect, this.f16778F0);
            canvas2.drawRect(this.f16778F0, this.f16776D0);
        }
    }

    /* JADX INFO: renamed from: T0 */
    private void m20091T0(Canvas canvas, Rect rect) {
        if (this.f16807b0 != null) {
            Paint.Align alignM20116I0 = m20116I0(rect, this.f16779G0);
            m20074G0(rect, this.f16778F0);
            if (this.f16781I0.m20801e() != null) {
                this.f16781I0.m20803g().drawableState = getState();
                this.f16781I0.m20809n(this.f16774B0);
            }
            this.f16781I0.m20803g().setTextAlign(alignM20116I0);
            int iSave = 0;
            boolean z7 = Math.round(this.f16781I0.m20804h(m20200w1().toString())) > Math.round(this.f16778F0.width());
            if (z7) {
                iSave = canvas.save();
                canvas.clipRect(this.f16778F0);
            }
            CharSequence charSequenceEllipsize = this.f16807b0;
            if (z7 && this.f16806a1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f16781I0.m20803g(), this.f16778F0.width(), this.f16806a1);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f16779G0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f16781I0.m20803g());
            if (z7) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: d3 */
    private boolean m20092d3() {
        return this.f16823o0 && this.f16824p0 != null && this.f16788P0;
    }

    /* JADX INFO: renamed from: e3 */
    private boolean m20093e3() {
        return this.f16809c0 && this.f16811d0 != null;
    }

    /* JADX INFO: renamed from: f3 */
    private boolean m20094f3() {
        return this.f16816h0 && this.f16817i0 != null;
    }

    /* JADX INFO: renamed from: g3 */
    private void m20095g3(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: h3 */
    private void m20096h3() {
        this.f16802Y0 = this.f16800X0 ? AbstractC0481a.m2065d(this.f16805a0) : null;
    }

    /* JADX INFO: renamed from: i3 */
    private void m20097i3() {
        this.f16818j0 = new RippleDrawable(AbstractC0481a.m2065d(m20196u1()), this.f16817i0, f16772f1);
    }

    /* JADX INFO: renamed from: o1 */
    private float m20098o1() {
        Drawable drawable = this.f16788P0 ? this.f16824p0 : this.f16811d0;
        float fCeil = this.f16814f0;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(AbstractC4546v.m20828c(this.f16774B0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    /* JADX INFO: renamed from: p1 */
    private float m20099p1() {
        Drawable drawable = this.f16788P0 ? this.f16824p0 : this.f16811d0;
        float f7 = this.f16814f0;
        return (f7 > 0.0f || drawable == null) ? f7 : drawable.getIntrinsicWidth();
    }

    /* JADX INFO: renamed from: r2 */
    private void m20100r2(ColorStateList colorStateList) {
        if (this.f16793U != colorStateList) {
            this.f16793U = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: z0 */
    private void m20101z0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC0400a.m1707m(drawable, AbstractC0400a.m1700f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f16817i0) {
            if (drawable.isStateful()) {
                drawable.setState(m20181l1());
            }
            drawable.setTintList(this.f16819k0);
            return;
        }
        Drawable drawable2 = this.f16811d0;
        if (drawable == drawable2 && this.f16815g0) {
            drawable2.setTintList(this.f16813e0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m20102A2(int i7) {
        m20207z2(this.f16774B0.getResources().getDimension(i7));
    }

    /* JADX INFO: renamed from: B0 */
    float m20103B0() {
        if (m20093e3() || m20092d3()) {
            return this.f16829u0 + m20099p1() + this.f16830v0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: B1 */
    public boolean m20104B1() {
        return this.f16800X0;
    }

    /* JADX INFO: renamed from: B2 */
    public boolean m20105B2(int[] iArr) {
        if (Arrays.equals(this.f16798W0, iArr)) {
            return false;
        }
        this.f16798W0 = iArr;
        if (m20094f3()) {
            return m20083L1(getState(), iArr);
        }
        return false;
    }

    /* JADX INFO: renamed from: C2 */
    public void m20106C2(ColorStateList colorStateList) {
        if (this.f16819k0 != colorStateList) {
            this.f16819k0 = colorStateList;
            if (m20094f3()) {
                this.f16817i0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: D1 */
    public boolean m20107D1() {
        return this.f16822n0;
    }

    /* JADX INFO: renamed from: D2 */
    public void m20108D2(int i7) {
        m20106C2(AbstractC5659a.m25174a(this.f16774B0, i7));
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m20109E1() {
        return m20078I1(this.f16817i0);
    }

    /* JADX INFO: renamed from: E2 */
    public void m20110E2(boolean z7) {
        if (this.f16816h0 != z7) {
            boolean zM20094f3 = m20094f3();
            this.f16816h0 = z7;
            boolean zM20094f4 = m20094f3();
            if (zM20094f3 != zM20094f4) {
                if (zM20094f4) {
                    m20101z0(this.f16817i0);
                } else {
                    m20095g3(this.f16817i0);
                }
                invalidateSelf();
                m20119K1();
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    float m20111F0() {
        if (m20094f3()) {
            return this.f16833y0 + this.f16820l0 + this.f16834z0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m20112F1() {
        return this.f16816h0;
    }

    /* JADX INFO: renamed from: F2 */
    public void m20113F2(a aVar) {
        this.f16804Z0 = new WeakReference(aVar);
    }

    /* JADX INFO: renamed from: G2 */
    public void m20114G2(TextUtils.TruncateAt truncateAt) {
        this.f16806a1 = truncateAt;
    }

    /* JADX INFO: renamed from: H2 */
    public void m20115H2(C6831f c6831f) {
        this.f16827s0 = c6831f;
    }

    /* JADX INFO: renamed from: I0 */
    Paint.Align m20116I0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f16807b0 != null) {
            float fM20103B0 = this.f16828t0 + m20103B0() + this.f16831w0;
            if (AbstractC0400a.m1700f(this) == 0) {
                pointF.x = rect.left + fM20103B0;
            } else {
                pointF.x = rect.right - fM20103B0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m20076H0();
        }
        return align;
    }

    /* JADX INFO: renamed from: I2 */
    public void m20117I2(int i7) {
        m20115H2(C6831f.m29854d(this.f16774B0, i7));
    }

    /* JADX INFO: renamed from: J2 */
    public void m20118J2(float f7) {
        if (this.f16830v0 != f7) {
            float fM20103B0 = m20103B0();
            this.f16830v0 = f7;
            float fM20103B1 = m20103B0();
            invalidateSelf();
            if (fM20103B0 != fM20103B1) {
                m20119K1();
            }
        }
    }

    /* JADX INFO: renamed from: K1 */
    protected void m20119K1() {
        a aVar = (a) this.f16804Z0.get();
        if (aVar != null) {
            aVar.mo20053a();
        }
    }

    /* JADX INFO: renamed from: K2 */
    public void m20120K2(int i7) {
        m20118J2(this.f16774B0.getResources().getDimension(i7));
    }

    /* JADX INFO: renamed from: L2 */
    public void m20121L2(float f7) {
        if (this.f16829u0 != f7) {
            float fM20103B0 = m20103B0();
            this.f16829u0 = f7;
            float fM20103B1 = m20103B0();
            invalidateSelf();
            if (fM20103B0 != fM20103B1) {
                m20119K1();
            }
        }
    }

    /* JADX INFO: renamed from: M1 */
    boolean m20122M1(boolean z7) {
        if (this.f16817i0 != null) {
            return m20105B2(z7 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : f16771e1);
        }
        return false;
    }

    /* JADX INFO: renamed from: M2 */
    public void m20123M2(int i7) {
        m20121L2(this.f16774B0.getResources().getDimension(i7));
    }

    /* JADX INFO: renamed from: N1 */
    public void m20124N1(boolean z7) {
        if (this.f16822n0 != z7) {
            this.f16822n0 = z7;
            float fM20103B0 = m20103B0();
            if (!z7 && this.f16788P0) {
                this.f16788P0 = false;
            }
            float fM20103B1 = m20103B0();
            invalidateSelf();
            if (fM20103B0 != fM20103B1) {
                m20119K1();
            }
        }
    }

    /* JADX INFO: renamed from: N2 */
    public void m20125N2(int i7) {
        this.f16810c1 = i7;
    }

    /* JADX INFO: renamed from: O1 */
    public void m20126O1(int i7) {
        m20124N1(this.f16774B0.getResources().getBoolean(i7));
    }

    /* JADX INFO: renamed from: O2 */
    public void m20127O2(ColorStateList colorStateList) {
        if (this.f16805a0 != colorStateList) {
            this.f16805a0 = colorStateList;
            m20096h3();
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: P1 */
    public void m20128P1(Drawable drawable) {
        if (this.f16824p0 != drawable) {
            float fM20103B0 = m20103B0();
            this.f16824p0 = drawable;
            float fM20103B1 = m20103B0();
            m20095g3(this.f16824p0);
            m20101z0(this.f16824p0);
            invalidateSelf();
            if (fM20103B0 != fM20103B1) {
                m20119K1();
            }
        }
    }

    /* JADX INFO: renamed from: P2 */
    public void m20129P2(int i7) {
        m20127O2(AbstractC5659a.m25174a(this.f16774B0, i7));
    }

    /* JADX INFO: renamed from: Q1 */
    public void m20130Q1(int i7) {
        m20128P1(AbstractC5659a.m25175b(this.f16774B0, i7));
    }

    /* JADX INFO: renamed from: Q2 */
    void m20131Q2(boolean z7) {
        this.f16808b1 = z7;
    }

    /* JADX INFO: renamed from: R1 */
    public void m20132R1(ColorStateList colorStateList) {
        if (this.f16825q0 != colorStateList) {
            this.f16825q0 = colorStateList;
            if (m20079J0()) {
                this.f16824p0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: R2 */
    public void m20133R2(C6831f c6831f) {
        this.f16826r0 = c6831f;
    }

    /* JADX INFO: renamed from: S1 */
    public void m20134S1(int i7) {
        m20132R1(AbstractC5659a.m25174a(this.f16774B0, i7));
    }

    /* JADX INFO: renamed from: S2 */
    public void m20135S2(int i7) {
        m20133R2(C6831f.m29854d(this.f16774B0, i7));
    }

    /* JADX INFO: renamed from: T1 */
    public void m20136T1(int i7) {
        m20139U1(this.f16774B0.getResources().getBoolean(i7));
    }

    /* JADX INFO: renamed from: T2 */
    public void m20137T2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f16807b0, charSequence)) {
            return;
        }
        this.f16807b0 = charSequence;
        this.f16781I0.m20808m(true);
        invalidateSelf();
        m20119K1();
    }

    /* JADX INFO: renamed from: U0 */
    public Drawable m20138U0() {
        return this.f16824p0;
    }

    /* JADX INFO: renamed from: U1 */
    public void m20139U1(boolean z7) {
        if (this.f16823o0 != z7) {
            boolean zM20092d3 = m20092d3();
            this.f16823o0 = z7;
            boolean zM20092d4 = m20092d3();
            if (zM20092d3 != zM20092d4) {
                if (zM20092d4) {
                    m20101z0(this.f16824p0);
                } else {
                    m20095g3(this.f16824p0);
                }
                invalidateSelf();
                m20119K1();
            }
        }
    }

    /* JADX INFO: renamed from: U2 */
    public void m20140U2(C0424d c0424d) {
        this.f16781I0.m20806k(c0424d, this.f16774B0);
    }

    /* JADX INFO: renamed from: V0 */
    public ColorStateList m20141V0() {
        return this.f16825q0;
    }

    /* JADX INFO: renamed from: V1 */
    public void m20142V1(ColorStateList colorStateList) {
        if (this.f16795V != colorStateList) {
            this.f16795V = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: V2 */
    public void m20143V2(int i7) {
        m20140U2(new C0424d(this.f16774B0, i7));
    }

    /* JADX INFO: renamed from: W0 */
    public ColorStateList m20144W0() {
        return this.f16795V;
    }

    /* JADX INFO: renamed from: W1 */
    public void m20145W1(int i7) {
        m20142V1(AbstractC5659a.m25174a(this.f16774B0, i7));
    }

    /* JADX INFO: renamed from: W2 */
    public void m20146W2(float f7) {
        if (this.f16832x0 != f7) {
            this.f16832x0 = f7;
            invalidateSelf();
            m20119K1();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public float m20147X0() {
        return this.f16812d1 ? m2706N() : this.f16799X;
    }

    /* JADX INFO: renamed from: X1 */
    public void m20148X1(float f7) {
        if (this.f16799X != f7) {
            this.f16799X = f7;
            setShapeAppearanceModel(m2703J().m2777x(f7));
        }
    }

    /* JADX INFO: renamed from: X2 */
    public void m20149X2(int i7) {
        m20146W2(this.f16774B0.getResources().getDimension(i7));
    }

    /* JADX INFO: renamed from: Y0 */
    public float m20150Y0() {
        return this.f16773A0;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m20151Y1(int i7) {
        m20148X1(this.f16774B0.getResources().getDimension(i7));
    }

    /* JADX INFO: renamed from: Y2 */
    public void m20152Y2(float f7) {
        C0424d c0424dM20202x1 = m20202x1();
        if (c0424dM20202x1 != null) {
            c0424dM20202x1.m1848o(f7);
            this.f16781I0.m20803g().setTextSize(f7);
            mo4068a();
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public Drawable m20153Z0() {
        Drawable drawable = this.f16811d0;
        if (drawable != null) {
            return AbstractC0400a.m1711q(drawable);
        }
        return null;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m20154Z1(float f7) {
        if (this.f16773A0 != f7) {
            this.f16773A0 = f7;
            invalidateSelf();
            m20119K1();
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public void m20155Z2(float f7) {
        if (this.f16831w0 != f7) {
            this.f16831w0 = f7;
            invalidateSelf();
            m20119K1();
        }
    }

    @Override // com.google.android.material.internal.C4541q.b
    /* JADX INFO: renamed from: a */
    public void mo4068a() {
        m20119K1();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: a1 */
    public float m20156a1() {
        return this.f16814f0;
    }

    /* JADX INFO: renamed from: a2 */
    public void m20157a2(int i7) {
        m20154Z1(this.f16774B0.getResources().getDimension(i7));
    }

    /* JADX INFO: renamed from: a3 */
    public void m20158a3(int i7) {
        m20155Z2(this.f16774B0.getResources().getDimension(i7));
    }

    /* JADX INFO: renamed from: b1 */
    public ColorStateList m20159b1() {
        return this.f16813e0;
    }

    /* JADX INFO: renamed from: b2 */
    public void m20160b2(Drawable drawable) {
        Drawable drawableM20153Z0 = m20153Z0();
        if (drawableM20153Z0 != drawable) {
            float fM20103B0 = m20103B0();
            this.f16811d0 = drawable != null ? AbstractC0400a.m1712r(drawable).mutate() : null;
            float fM20103B1 = m20103B0();
            m20095g3(drawableM20153Z0);
            if (m20093e3()) {
                m20101z0(this.f16811d0);
            }
            invalidateSelf();
            if (fM20103B0 != fM20103B1) {
                m20119K1();
            }
        }
    }

    /* JADX INFO: renamed from: b3 */
    public void m20161b3(boolean z7) {
        if (this.f16800X0 != z7) {
            this.f16800X0 = z7;
            m20096h3();
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: c1 */
    public float m20162c1() {
        return this.f16797W;
    }

    /* JADX INFO: renamed from: c2 */
    public void m20163c2(int i7) {
        m20160b2(AbstractC5659a.m25175b(this.f16774B0, i7));
    }

    /* JADX INFO: renamed from: c3 */
    boolean m20164c3() {
        return this.f16808b1;
    }

    /* JADX INFO: renamed from: d1 */
    public float m20165d1() {
        return this.f16828t0;
    }

    /* JADX INFO: renamed from: d2 */
    public void m20166d2(float f7) {
        if (this.f16814f0 != f7) {
            float fM20103B0 = m20103B0();
            this.f16814f0 = f7;
            float fM20103B1 = m20103B0();
            invalidateSelf();
            if (fM20103B0 != fM20103B1) {
                m20119K1();
            }
        }
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iM31646a;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i7 = this.f16790R0;
        if (i7 < 255) {
            canvas2 = canvas;
            iM31646a = AbstractC7159a.m31646a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i7);
        } else {
            canvas2 = canvas;
            iM31646a = 0;
        }
        m20087P0(canvas2, bounds);
        m20084M0(canvas2, bounds);
        if (this.f16812d1) {
            super.draw(canvas2);
        }
        m20086O0(canvas2, bounds);
        m20089R0(canvas2, bounds);
        m20085N0(canvas2, bounds);
        m20082L0(canvas2, bounds);
        if (this.f16808b1) {
            m20091T0(canvas2, bounds);
        }
        m20088Q0(canvas2, bounds);
        m20090S0(canvas2, bounds);
        if (this.f16790R0 < 255) {
            canvas2.restoreToCount(iM31646a);
        }
    }

    /* JADX INFO: renamed from: e1 */
    public ColorStateList m20167e1() {
        return this.f16801Y;
    }

    /* JADX INFO: renamed from: e2 */
    public void m20168e2(int i7) {
        m20166d2(this.f16774B0.getResources().getDimension(i7));
    }

    /* JADX INFO: renamed from: f1 */
    public float m20169f1() {
        return this.f16803Z;
    }

    /* JADX INFO: renamed from: f2 */
    public void m20170f2(ColorStateList colorStateList) {
        this.f16815g0 = true;
        if (this.f16813e0 != colorStateList) {
            this.f16813e0 = colorStateList;
            if (m20093e3()) {
                this.f16811d0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: g1 */
    public Drawable m20171g1() {
        Drawable drawable = this.f16817i0;
        if (drawable != null) {
            return AbstractC0400a.m1711q(drawable);
        }
        return null;
    }

    /* JADX INFO: renamed from: g2 */
    public void m20172g2(int i7) {
        m20170f2(AbstractC5659a.m25174a(this.f16774B0, i7));
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f16790R0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f16791S0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f16797W;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f16828t0 + m20103B0() + this.f16831w0 + this.f16781I0.m20804h(m20200w1().toString()) + this.f16832x0 + m20111F0() + this.f16773A0), this.f16810c1);
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.f16812d1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f16799X);
        } else {
            outline.setRoundRect(bounds, this.f16799X);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    /* JADX INFO: renamed from: h1 */
    public CharSequence m20173h1() {
        return this.f16821m0;
    }

    /* JADX INFO: renamed from: h2 */
    public void m20174h2(int i7) {
        m20176i2(this.f16774B0.getResources().getBoolean(i7));
    }

    /* JADX INFO: renamed from: i1 */
    public float m20175i1() {
        return this.f16834z0;
    }

    /* JADX INFO: renamed from: i2 */
    public void m20176i2(boolean z7) {
        if (this.f16809c0 != z7) {
            boolean zM20093e3 = m20093e3();
            this.f16809c0 = z7;
            boolean zM20093e4 = m20093e3();
            if (zM20093e3 != zM20093e4) {
                if (zM20093e4) {
                    m20101z0(this.f16811d0);
                } else {
                    m20095g3(this.f16811d0);
                }
                invalidateSelf();
                m20119K1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (m20077H1(this.f16793U) || m20077H1(this.f16795V) || m20077H1(this.f16801Y)) {
            return true;
        }
        return (this.f16800X0 && m20077H1(this.f16802Y0)) || m20075G1(this.f16781I0.m20801e()) || m20079J0() || m20078I1(this.f16811d0) || m20078I1(this.f16824p0) || m20077H1(this.f16794U0);
    }

    /* JADX INFO: renamed from: j1 */
    public float m20177j1() {
        return this.f16820l0;
    }

    /* JADX INFO: renamed from: j2 */
    public void m20178j2(float f7) {
        if (this.f16797W != f7) {
            this.f16797W = f7;
            invalidateSelf();
            m20119K1();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public float m20179k1() {
        return this.f16833y0;
    }

    /* JADX INFO: renamed from: k2 */
    public void m20180k2(int i7) {
        m20178j2(this.f16774B0.getResources().getDimension(i7));
    }

    /* JADX INFO: renamed from: l1 */
    public int[] m20181l1() {
        return this.f16798W0;
    }

    /* JADX INFO: renamed from: l2 */
    public void m20182l2(float f7) {
        if (this.f16828t0 != f7) {
            this.f16828t0 = f7;
            invalidateSelf();
            m20119K1();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public ColorStateList m20183m1() {
        return this.f16819k0;
    }

    /* JADX INFO: renamed from: m2 */
    public void m20184m2(int i7) {
        m20182l2(this.f16774B0.getResources().getDimension(i7));
    }

    /* JADX INFO: renamed from: n1 */
    public void m20185n1(RectF rectF) {
        m20073E0(getBounds(), rectF);
    }

    /* JADX INFO: renamed from: n2 */
    public void m20186n2(ColorStateList colorStateList) {
        if (this.f16801Y != colorStateList) {
            this.f16801Y = colorStateList;
            if (this.f16812d1) {
                m2731r0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: o2 */
    public void m20187o2(int i7) {
        m20186n2(AbstractC5659a.m25174a(this.f16774B0, i7));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i7) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i7);
        if (m20093e3()) {
            zOnLayoutDirectionChanged |= AbstractC0400a.m1707m(this.f16811d0, i7);
        }
        if (m20092d3()) {
            zOnLayoutDirectionChanged |= AbstractC0400a.m1707m(this.f16824p0, i7);
        }
        if (m20094f3()) {
            zOnLayoutDirectionChanged |= AbstractC0400a.m1707m(this.f16817i0, i7);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i7) {
        boolean zOnLevelChange = super.onLevelChange(i7);
        if (m20093e3()) {
            zOnLevelChange |= this.f16811d0.setLevel(i7);
        }
        if (m20092d3()) {
            zOnLevelChange |= this.f16824p0.setLevel(i7);
        }
        if (m20094f3()) {
            zOnLevelChange |= this.f16817i0.setLevel(i7);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f16812d1) {
            super.onStateChange(iArr);
        }
        return m20083L1(iArr, m20181l1());
    }

    /* JADX INFO: renamed from: p2 */
    public void m20188p2(float f7) {
        if (this.f16803Z != f7) {
            this.f16803Z = f7;
            this.f16775C0.setStrokeWidth(f7);
            if (this.f16812d1) {
                super.m2732s0(f7);
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: q1 */
    public TextUtils.TruncateAt m20189q1() {
        return this.f16806a1;
    }

    /* JADX INFO: renamed from: q2 */
    public void m20190q2(int i7) {
        m20188p2(this.f16774B0.getResources().getDimension(i7));
    }

    /* JADX INFO: renamed from: r1 */
    public C6831f m20191r1() {
        return this.f16827s0;
    }

    /* JADX INFO: renamed from: s1 */
    public float m20192s1() {
        return this.f16830v0;
    }

    /* JADX INFO: renamed from: s2 */
    public void m20193s2(Drawable drawable) {
        Drawable drawableM20171g1 = m20171g1();
        if (drawableM20171g1 != drawable) {
            float fM20111F0 = m20111F0();
            this.f16817i0 = drawable != null ? AbstractC0400a.m1712r(drawable).mutate() : null;
            m20097i3();
            float fM20111F1 = m20111F0();
            m20095g3(drawableM20171g1);
            if (m20094f3()) {
                m20101z0(this.f16817i0);
            }
            invalidateSelf();
            if (fM20111F0 != fM20111F1) {
                m20119K1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j7);
        }
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (this.f16790R0 != i7) {
            this.f16790R0 = i7;
            invalidateSelf();
        }
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f16791S0 != colorFilter) {
            this.f16791S0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f16794U0 != colorStateList) {
            this.f16794U0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f16796V0 != mode) {
            this.f16796V0 = mode;
            this.f16792T0 = AbstractC4498d.m20443o(this, this.f16794U0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        if (m20093e3()) {
            visible |= this.f16811d0.setVisible(z7, z8);
        }
        if (m20092d3()) {
            visible |= this.f16824p0.setVisible(z7, z8);
        }
        if (m20094f3()) {
            visible |= this.f16817i0.setVisible(z7, z8);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: renamed from: t1 */
    public float m20194t1() {
        return this.f16829u0;
    }

    /* JADX INFO: renamed from: t2 */
    public void m20195t2(CharSequence charSequence) {
        if (this.f16821m0 != charSequence) {
            this.f16821m0 = C0857a.m3970c().m3975h(charSequence);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: u1 */
    public ColorStateList m20196u1() {
        return this.f16805a0;
    }

    /* JADX INFO: renamed from: u2 */
    public void m20197u2(float f7) {
        if (this.f16834z0 != f7) {
            this.f16834z0 = f7;
            invalidateSelf();
            if (m20094f3()) {
                m20119K1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public C6831f m20198v1() {
        return this.f16826r0;
    }

    /* JADX INFO: renamed from: v2 */
    public void m20199v2(int i7) {
        m20197u2(this.f16774B0.getResources().getDimension(i7));
    }

    /* JADX INFO: renamed from: w1 */
    public CharSequence m20200w1() {
        return this.f16807b0;
    }

    /* JADX INFO: renamed from: w2 */
    public void m20201w2(int i7) {
        m20193s2(AbstractC5659a.m25175b(this.f16774B0, i7));
    }

    /* JADX INFO: renamed from: x1 */
    public C0424d m20202x1() {
        return this.f16781I0.m20801e();
    }

    /* JADX INFO: renamed from: x2 */
    public void m20203x2(float f7) {
        if (this.f16820l0 != f7) {
            this.f16820l0 = f7;
            invalidateSelf();
            if (m20094f3()) {
                m20119K1();
            }
        }
    }

    /* JADX INFO: renamed from: y1 */
    public float m20204y1() {
        return this.f16832x0;
    }

    /* JADX INFO: renamed from: y2 */
    public void m20205y2(int i7) {
        m20203x2(this.f16774B0.getResources().getDimension(i7));
    }

    /* JADX INFO: renamed from: z1 */
    public float m20206z1() {
        return this.f16831w0;
    }

    /* JADX INFO: renamed from: z2 */
    public void m20207z2(float f7) {
        if (this.f16833y0 != f7) {
            this.f16833y0 = f7;
            invalidateSelf();
            if (m20094f3()) {
                m20119K1();
            }
        }
    }
}
