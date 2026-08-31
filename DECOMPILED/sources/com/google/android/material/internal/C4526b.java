package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import p045F3.AbstractC0430j;
import p045F3.C0421a;
import p045F3.C0424d;
import p065I.AbstractC0577a;
import p097M.AbstractC0869m;
import p104N.AbstractC0910g;
import p333q3.AbstractC6826a;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: com.google.android.material.internal.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C4526b {

    /* JADX INFO: renamed from: A */
    private Typeface f17214A;

    /* JADX INFO: renamed from: B */
    private Typeface f17215B;

    /* JADX INFO: renamed from: C */
    private Typeface f17216C;

    /* JADX INFO: renamed from: D */
    private Typeface f17217D;

    /* JADX INFO: renamed from: E */
    private C0421a f17218E;

    /* JADX INFO: renamed from: F */
    private C0421a f17219F;

    /* JADX INFO: renamed from: H */
    private CharSequence f17221H;

    /* JADX INFO: renamed from: I */
    private CharSequence f17222I;

    /* JADX INFO: renamed from: J */
    private boolean f17223J;

    /* JADX INFO: renamed from: L */
    private float f17225L;

    /* JADX INFO: renamed from: M */
    private float f17226M;

    /* JADX INFO: renamed from: N */
    private float f17227N;

    /* JADX INFO: renamed from: O */
    private float f17228O;

    /* JADX INFO: renamed from: P */
    private float f17229P;

    /* JADX INFO: renamed from: Q */
    private int f17230Q;

    /* JADX INFO: renamed from: R */
    private int f17231R;

    /* JADX INFO: renamed from: S */
    private int[] f17232S;

    /* JADX INFO: renamed from: T */
    private boolean f17233T;

    /* JADX INFO: renamed from: U */
    private final TextPaint f17234U;

    /* JADX INFO: renamed from: V */
    private final TextPaint f17235V;

    /* JADX INFO: renamed from: W */
    private TimeInterpolator f17236W;

    /* JADX INFO: renamed from: X */
    private TimeInterpolator f17237X;

    /* JADX INFO: renamed from: Y */
    private float f17238Y;

    /* JADX INFO: renamed from: Z */
    private float f17239Z;

    /* JADX INFO: renamed from: a */
    private final View f17240a;

    /* JADX INFO: renamed from: a0 */
    private float f17241a0;

    /* JADX INFO: renamed from: b */
    private float f17242b;

    /* JADX INFO: renamed from: b0 */
    private ColorStateList f17243b0;

    /* JADX INFO: renamed from: c */
    private boolean f17244c;

    /* JADX INFO: renamed from: c0 */
    private float f17245c0;

    /* JADX INFO: renamed from: d */
    private float f17246d;

    /* JADX INFO: renamed from: d0 */
    private float f17247d0;

    /* JADX INFO: renamed from: e */
    private float f17248e;

    /* JADX INFO: renamed from: e0 */
    private float f17249e0;

    /* JADX INFO: renamed from: f */
    private int f17250f;

    /* JADX INFO: renamed from: f0 */
    private ColorStateList f17251f0;

    /* JADX INFO: renamed from: g */
    private final Rect f17252g;

    /* JADX INFO: renamed from: g0 */
    private float f17253g0;

    /* JADX INFO: renamed from: h */
    private final Rect f17254h;

    /* JADX INFO: renamed from: h0 */
    private float f17255h0;

    /* JADX INFO: renamed from: i */
    private Rect f17256i;

    /* JADX INFO: renamed from: i0 */
    private float f17257i0;

    /* JADX INFO: renamed from: j */
    private final RectF f17258j;

    /* JADX INFO: renamed from: j0 */
    private StaticLayout f17259j0;

    /* JADX INFO: renamed from: k0 */
    private float f17261k0;

    /* JADX INFO: renamed from: l0 */
    private float f17263l0;

    /* JADX INFO: renamed from: m0 */
    private float f17265m0;

    /* JADX INFO: renamed from: n0 */
    private CharSequence f17267n0;

    /* JADX INFO: renamed from: o */
    private ColorStateList f17268o;

    /* JADX INFO: renamed from: p */
    private ColorStateList f17270p;

    /* JADX INFO: renamed from: q */
    private int f17272q;

    /* JADX INFO: renamed from: r */
    private float f17274r;

    /* JADX INFO: renamed from: s */
    private float f17276s;

    /* JADX INFO: renamed from: t */
    private float f17278t;

    /* JADX INFO: renamed from: t0 */
    private InterfaceC4540p f17279t0;

    /* JADX INFO: renamed from: u */
    private float f17280u;

    /* JADX INFO: renamed from: v */
    private float f17282v;

    /* JADX INFO: renamed from: w */
    private float f17284w;

    /* JADX INFO: renamed from: w0 */
    private boolean f17285w0;

    /* JADX INFO: renamed from: x */
    private Typeface f17286x;

    /* JADX INFO: renamed from: y */
    private Typeface f17287y;

    /* JADX INFO: renamed from: z */
    private Typeface f17288z;

    /* JADX INFO: renamed from: k */
    private int f17260k = 16;

    /* JADX INFO: renamed from: l */
    private int f17262l = 16;

    /* JADX INFO: renamed from: m */
    private float f17264m = 15.0f;

    /* JADX INFO: renamed from: n */
    private float f17266n = 15.0f;

    /* JADX INFO: renamed from: G */
    private TextUtils.TruncateAt f17220G = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: K */
    private boolean f17224K = true;

    /* JADX INFO: renamed from: o0 */
    private int f17269o0 = 1;

    /* JADX INFO: renamed from: p0 */
    private int f17271p0 = 1;

    /* JADX INFO: renamed from: q0 */
    private float f17273q0 = 0.0f;

    /* JADX INFO: renamed from: r0 */
    private float f17275r0 = 1.0f;

    /* JADX INFO: renamed from: s0 */
    private int f17277s0 = C4539o.f17353o;

    /* JADX INFO: renamed from: u0 */
    private int f17281u0 = -1;

    /* JADX INFO: renamed from: v0 */
    private int f17283v0 = -1;

    /* JADX INFO: renamed from: com.google.android.material.internal.b$a */
    class a implements C0421a.a {
        a() {
        }

        @Override // p045F3.C0421a.a
        /* JADX INFO: renamed from: a */
        public void mo1816a(Typeface typeface) {
            C4526b.this.m20667Y(typeface);
        }
    }

    public C4526b(View view) {
        this.f17240a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f17234U = textPaint;
        this.f17235V = new TextPaint(textPaint);
        this.f17254h = new Rect();
        this.f17252g = new Rect();
        this.f17258j = new RectF();
        this.f17248e = m20638e();
        m20657L(view.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: C */
    private Layout.Alignment m20622C() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f17260k, this.f17223J ? 1 : 0) & 7;
        if (absoluteGravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (absoluteGravity != 5) {
            return this.f17223J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.f17223J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    /* JADX INFO: renamed from: D */
    private void m20623D(TextPaint textPaint) {
        textPaint.setTextSize(this.f17266n);
        textPaint.setTypeface(this.f17286x);
        textPaint.setLetterSpacing(this.f17253g0);
    }

    /* JADX INFO: renamed from: E */
    private void m20624E(TextPaint textPaint) {
        textPaint.setTextSize(this.f17264m);
        textPaint.setTypeface(this.f17214A);
        textPaint.setLetterSpacing(this.f17255h0);
    }

    /* JADX INFO: renamed from: F */
    private void m20625F(float f7) {
        if (this.f17244c) {
            this.f17258j.set(f7 < this.f17248e ? this.f17252g : this.f17254h);
            return;
        }
        this.f17258j.left = m20629K(this.f17252g.left, this.f17254h.left, f7, this.f17236W);
        this.f17258j.top = m20629K(this.f17274r, this.f17276s, f7, this.f17236W);
        this.f17258j.right = m20629K(this.f17252g.right, this.f17254h.right, f7, this.f17236W);
        this.f17258j.bottom = m20629K(this.f17252g.bottom, this.f17254h.bottom, f7, this.f17236W);
    }

    /* JADX INFO: renamed from: G */
    private static boolean m20626G(float f7, float f8) {
        return Math.abs(f7 - f8) < 1.0E-5f;
    }

    /* JADX INFO: renamed from: H */
    private boolean m20627H() {
        return this.f17240a.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: J */
    private boolean m20628J(CharSequence charSequence, boolean z7) {
        return (z7 ? AbstractC0869m.f3446d : AbstractC0869m.f3445c).mo4009a(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: K */
    private static float m20629K(float f7, float f8, float f9, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f9 = timeInterpolator.getInterpolation(f9);
        }
        return AbstractC6826a.m29843a(f7, f8, f9);
    }

    /* JADX INFO: renamed from: M */
    private float m20630M(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: P */
    private static boolean m20631P(Rect rect, int i7, int i8, int i9, int i10) {
        return rect.left == i7 && rect.top == i8 && rect.right == i9 && rect.bottom == i10;
    }

    /* JADX INFO: renamed from: V */
    private void m20632V(float f7) {
        this.f17263l0 = f7;
        this.f17240a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: Z */
    private boolean m20633Z(Typeface typeface) {
        C0421a c0421a = this.f17219F;
        if (c0421a != null) {
            c0421a.m1815c();
        }
        if (this.f17288z == typeface) {
            return false;
        }
        this.f17288z = typeface;
        Typeface typefaceM1857b = AbstractC0430j.m1857b(this.f17240a.getContext().getResources().getConfiguration(), typeface);
        this.f17287y = typefaceM1857b;
        if (typefaceM1857b == null) {
            typefaceM1857b = this.f17288z;
        }
        this.f17286x = typefaceM1857b;
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static int m20634a(int i7, int i8, float f7) {
        float f8 = 1.0f - f7;
        return Color.argb(Math.round((Color.alpha(i7) * f8) + (Color.alpha(i8) * f7)), Math.round((Color.red(i7) * f8) + (Color.red(i8) * f7)), Math.round((Color.green(i7) * f8) + (Color.green(i8) * f7)), Math.round((Color.blue(i7) * f8) + (Color.blue(i8) * f7)));
    }

    /* JADX INFO: renamed from: b */
    private void m20635b(boolean z7) {
        float fM20630M;
        m20643i(1.0f, z7);
        if (this.f17222I != null && this.f17259j0 != null) {
            this.f17267n0 = m20650r0() ? TextUtils.ellipsize(this.f17222I, this.f17234U, this.f17259j0.getWidth(), this.f17220G) : this.f17222I;
        }
        CharSequence charSequence = this.f17267n0;
        if (charSequence != null) {
            this.f17261k0 = m20630M(this.f17234U, charSequence);
        } else {
            this.f17261k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f17262l, this.f17223J ? 1 : 0);
        Rect rect = this.f17256i;
        if (rect == null) {
            rect = this.f17254h;
        }
        int i7 = absoluteGravity & 112;
        if (i7 == 48) {
            this.f17276s = rect.top;
        } else if (i7 != 80) {
            this.f17276s = rect.centerY() - ((this.f17234U.descent() - this.f17234U.ascent()) / 2.0f);
        } else {
            this.f17276s = rect.bottom + this.f17234U.ascent();
        }
        int i8 = absoluteGravity & 8388615;
        if (i8 == 1) {
            this.f17280u = rect.centerX() - (this.f17261k0 / 2.0f);
        } else if (i8 != 5) {
            this.f17280u = rect.left;
        } else {
            this.f17280u = rect.right - this.f17261k0;
        }
        if (this.f17261k0 <= this.f17254h.width()) {
            float f7 = this.f17280u;
            float fMax = f7 + Math.max(0.0f, this.f17254h.left - f7);
            this.f17280u = fMax;
            this.f17280u = fMax + Math.min(0.0f, this.f17254h.right - (this.f17261k0 + fMax));
        }
        if (m20678m() <= this.f17254h.height()) {
            float f8 = this.f17276s;
            float fMax2 = f8 + Math.max(0.0f, this.f17254h.top - f8);
            this.f17276s = fMax2;
            this.f17276s = fMax2 + Math.min(0.0f, this.f17254h.bottom - (m20686q() + fMax2));
        }
        m20643i(0.0f, z7);
        StaticLayout staticLayout = this.f17259j0;
        float height = staticLayout != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f17259j0;
        if (staticLayout2 == null || this.f17269o0 <= 1) {
            CharSequence charSequence2 = this.f17222I;
            fM20630M = charSequence2 != null ? m20630M(this.f17234U, charSequence2) : 0.0f;
        } else {
            fM20630M = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f17259j0;
        this.f17272q = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f17260k, this.f17223J ? 1 : 0);
        int i9 = absoluteGravity2 & 112;
        if (i9 == 48) {
            this.f17274r = this.f17252g.top;
        } else if (i9 != 80) {
            this.f17274r = this.f17252g.centerY() - (height / 2.0f);
        } else {
            this.f17274r = (this.f17252g.bottom - height) + (this.f17285w0 ? this.f17234U.descent() : 0.0f);
        }
        int i10 = absoluteGravity2 & 8388615;
        if (i10 == 1) {
            this.f17278t = this.f17252g.centerX() - (fM20630M / 2.0f);
        } else if (i10 != 5) {
            this.f17278t = this.f17252g.left;
        } else {
            this.f17278t = this.f17252g.right - fM20630M;
        }
        m20646k0(this.f17242b);
    }

    /* JADX INFO: renamed from: c */
    private void m20636c() {
        m20641g(this.f17242b);
    }

    /* JADX INFO: renamed from: d */
    private float m20637d(float f7) {
        float f8 = this.f17248e;
        return f7 <= f8 ? AbstractC6826a.m29844b(1.0f, 0.0f, this.f17246d, f8, f7) : AbstractC6826a.m29844b(0.0f, 1.0f, f8, 1.0f, f7);
    }

    /* JADX INFO: renamed from: e */
    private float m20638e() {
        float f7 = this.f17246d;
        return f7 + ((1.0f - f7) * 0.5f);
    }

    /* JADX INFO: renamed from: f */
    private boolean m20639f(CharSequence charSequence) {
        boolean zM20627H = m20627H();
        return this.f17224K ? m20628J(charSequence, zM20627H) : zM20627H;
    }

    /* JADX INFO: renamed from: f0 */
    private void m20640f0(float f7) {
        this.f17265m0 = f7;
        this.f17240a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: g */
    private void m20641g(float f7) {
        float f8;
        m20625F(f7);
        if (!this.f17244c) {
            this.f17282v = m20629K(this.f17278t, this.f17280u, f7, this.f17236W);
            this.f17284w = m20629K(this.f17274r, this.f17276s, f7, this.f17236W);
            m20646k0(f7);
            f8 = f7;
        } else if (f7 < this.f17248e) {
            this.f17282v = this.f17278t;
            this.f17284w = this.f17274r;
            m20646k0(0.0f);
            f8 = 0.0f;
        } else {
            this.f17282v = this.f17280u;
            this.f17284w = this.f17276s - Math.max(0, this.f17250f);
            m20646k0(1.0f);
            f8 = 1.0f;
        }
        TimeInterpolator timeInterpolator = AbstractC6826a.f27405b;
        m20632V(1.0f - m20629K(0.0f, 1.0f, 1.0f - f7, timeInterpolator));
        m20640f0(m20629K(1.0f, 0.0f, f7, timeInterpolator));
        if (this.f17270p != this.f17268o) {
            this.f17234U.setColor(m20634a(m20653v(), m20688t(), f8));
        } else {
            this.f17234U.setColor(m20688t());
        }
        float f9 = this.f17253g0;
        float f10 = this.f17255h0;
        if (f9 != f10) {
            this.f17234U.setLetterSpacing(m20629K(f10, f9, f7, timeInterpolator));
        } else {
            this.f17234U.setLetterSpacing(f9);
        }
        this.f17227N = m20629K(this.f17245c0, this.f17238Y, f7, null);
        this.f17228O = m20629K(this.f17247d0, this.f17239Z, f7, null);
        this.f17229P = m20629K(this.f17249e0, this.f17241a0, f7, null);
        int iM20634a = m20634a(m20652u(this.f17251f0), m20652u(this.f17243b0), f7);
        this.f17230Q = iM20634a;
        this.f17234U.setShadowLayer(this.f17227N, this.f17228O, this.f17229P, iM20634a);
        if (this.f17244c) {
            this.f17234U.setAlpha((int) (m20637d(f7) * this.f17234U.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f17234U;
                textPaint.setShadowLayer(this.f17227N, this.f17228O, this.f17229P, AbstractC7539a.m33170a(this.f17230Q, textPaint.getAlpha()));
            }
        }
        this.f17240a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: h */
    private void m20642h(float f7) {
        m20643i(f7, false);
    }

    /* JADX INFO: renamed from: i */
    private void m20643i(float f7, boolean z7) {
        Typeface typeface;
        float f8;
        float f9;
        if (this.f17221H == null) {
            return;
        }
        float fWidth = this.f17254h.width();
        float fWidth2 = this.f17252g.width();
        if (m20626G(f7, 1.0f)) {
            f8 = m20650r0() ? this.f17266n : this.f17264m;
            f9 = m20650r0() ? this.f17253g0 : this.f17255h0;
            this.f17225L = m20650r0() ? 1.0f : m20629K(this.f17264m, this.f17266n, f7, this.f17237X) / this.f17264m;
            if (!m20650r0()) {
                fWidth = fWidth2;
            }
            typeface = this.f17286x;
            fWidth2 = fWidth;
        } else {
            float f10 = this.f17264m;
            float f11 = this.f17255h0;
            typeface = this.f17214A;
            if (m20626G(f7, 0.0f)) {
                this.f17225L = 1.0f;
            } else {
                this.f17225L = m20629K(this.f17264m, this.f17266n, f7, this.f17237X) / this.f17264m;
            }
            float f12 = this.f17266n / this.f17264m;
            float f13 = fWidth2 * f12;
            if (!z7 && !this.f17244c && f13 > fWidth && m20650r0()) {
                fWidth2 = Math.min(fWidth / f12, fWidth2);
            }
            f8 = f10;
            f9 = f11;
        }
        int i7 = f7 < 0.5f ? this.f17269o0 : this.f17271p0;
        boolean z8 = false;
        if (fWidth2 > 0.0f) {
            boolean z9 = this.f17226M != f8;
            boolean z10 = this.f17257i0 != f9;
            boolean z11 = this.f17217D != typeface;
            StaticLayout staticLayout = this.f17259j0;
            boolean z12 = z9 || z10 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z11 || (this.f17231R != i7) || this.f17233T;
            this.f17226M = f8;
            this.f17257i0 = f9;
            this.f17217D = typeface;
            this.f17233T = false;
            this.f17231R = i7;
            this.f17234U.setLinearText(this.f17225L != 1.0f);
            z8 = z12;
        }
        if (this.f17222I == null || z8) {
            this.f17234U.setTextSize(this.f17226M);
            this.f17234U.setTypeface(this.f17217D);
            this.f17234U.setLetterSpacing(this.f17257i0);
            this.f17223J = m20639f(this.f17221H);
            StaticLayout staticLayoutM20645j = m20645j(m20648q0() ? i7 : 1, this.f17234U, this.f17221H, fWidth2 * (m20650r0() ? 1.0f : this.f17225L), this.f17223J);
            this.f17259j0 = staticLayoutM20645j;
            this.f17222I = staticLayoutM20645j.getText();
        }
    }

    /* JADX INFO: renamed from: i0 */
    private boolean m20644i0(Typeface typeface) {
        C0421a c0421a = this.f17218E;
        if (c0421a != null) {
            c0421a.m1815c();
        }
        if (this.f17216C == typeface) {
            return false;
        }
        this.f17216C = typeface;
        Typeface typefaceM1857b = AbstractC0430j.m1857b(this.f17240a.getContext().getResources().getConfiguration(), typeface);
        this.f17215B = typefaceM1857b;
        if (typefaceM1857b == null) {
            typefaceM1857b = this.f17216C;
        }
        this.f17214A = typefaceM1857b;
        return true;
    }

    /* JADX INFO: renamed from: j */
    private StaticLayout m20645j(int i7, TextPaint textPaint, CharSequence charSequence, float f7, boolean z7) {
        return (StaticLayout) AbstractC0910g.m4139g(C4539o.m20785b(charSequence, textPaint, (int) f7).m20788d(this.f17220G).m20791g(z7).m20787c(i7 == 1 ? Layout.Alignment.ALIGN_NORMAL : m20622C()).m20790f(false).m20793i(i7).m20792h(this.f17273q0, this.f17275r0).m20789e(this.f17277s0).m20794j(this.f17279t0).m20786a());
    }

    /* JADX INFO: renamed from: k0 */
    private void m20646k0(float f7) {
        m20642h(f7);
        this.f17240a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: l */
    private void m20647l(Canvas canvas, float f7, float f8) {
        int alpha = this.f17234U.getAlpha();
        canvas.translate(f7, f8);
        if (!this.f17244c) {
            this.f17234U.setAlpha((int) (this.f17265m0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f17234U;
                textPaint.setShadowLayer(this.f17227N, this.f17228O, this.f17229P, AbstractC7539a.m33170a(this.f17230Q, textPaint.getAlpha()));
            }
            this.f17259j0.draw(canvas);
        }
        if (!this.f17244c) {
            this.f17234U.setAlpha((int) (this.f17263l0 * alpha));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            TextPaint textPaint2 = this.f17234U;
            textPaint2.setShadowLayer(this.f17227N, this.f17228O, this.f17229P, AbstractC7539a.m33170a(this.f17230Q, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f17259j0.getLineBaseline(0);
        CharSequence charSequence = this.f17267n0;
        float f9 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f9, this.f17234U);
        if (i7 >= 31) {
            this.f17234U.setShadowLayer(this.f17227N, this.f17228O, this.f17229P, this.f17230Q);
        }
        if (this.f17244c) {
            return;
        }
        String strTrim = this.f17267n0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f17234U.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f17259j0.getLineEnd(0), str.length()), 0.0f, f9, (Paint) this.f17234U);
    }

    /* JADX INFO: renamed from: q0 */
    private boolean m20648q0() {
        if (this.f17269o0 > 1 || this.f17271p0 > 1) {
            return !this.f17223J || this.f17244c;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    private float m20649r(int i7, int i8) {
        if (i8 == 17 || (i8 & 7) == 1) {
            return (i7 / 2.0f) - (this.f17261k0 / 2.0f);
        }
        if ((i8 & 8388613) == 8388613 || (i8 & 5) == 5) {
            return this.f17223J ? this.f17254h.left : this.f17254h.right - this.f17261k0;
        }
        return this.f17223J ? this.f17254h.right - this.f17261k0 : this.f17254h.left;
    }

    /* JADX INFO: renamed from: r0 */
    private boolean m20650r0() {
        return this.f17271p0 == 1;
    }

    /* JADX INFO: renamed from: s */
    private float m20651s(RectF rectF, int i7, int i8) {
        if (i8 == 17 || (i8 & 7) == 1) {
            return (i7 / 2.0f) + (this.f17261k0 / 2.0f);
        }
        if ((i8 & 8388613) == 8388613 || (i8 & 5) == 5) {
            return this.f17223J ? rectF.left + this.f17261k0 : this.f17254h.right;
        }
        return this.f17223J ? this.f17254h.right : rectF.left + this.f17261k0;
    }

    /* JADX INFO: renamed from: u */
    private int m20652u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f17232S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: v */
    private int m20653v() {
        return m20652u(this.f17268o);
    }

    /* JADX INFO: renamed from: A */
    public float m20654A() {
        m20624E(this.f17235V);
        return -this.f17235V.ascent();
    }

    /* JADX INFO: renamed from: B */
    public float m20655B() {
        return this.f17242b;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m20656I() {
        ColorStateList colorStateList = this.f17270p;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f17268o;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    /* JADX INFO: renamed from: L */
    public void m20657L(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f17288z;
            if (typeface != null) {
                this.f17287y = AbstractC0430j.m1857b(configuration, typeface);
            }
            Typeface typeface2 = this.f17216C;
            if (typeface2 != null) {
                this.f17215B = AbstractC0430j.m1857b(configuration, typeface2);
            }
            Typeface typeface3 = this.f17287y;
            if (typeface3 == null) {
                typeface3 = this.f17288z;
            }
            this.f17286x = typeface3;
            Typeface typeface4 = this.f17215B;
            if (typeface4 == null) {
                typeface4 = this.f17216C;
            }
            this.f17214A = typeface4;
            m20659O(true);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m20658N() {
        m20659O(false);
    }

    /* JADX INFO: renamed from: O */
    public void m20659O(boolean z7) {
        if ((this.f17240a.getHeight() <= 0 || this.f17240a.getWidth() <= 0) && !z7) {
            return;
        }
        m20635b(z7);
        m20636c();
    }

    /* JADX INFO: renamed from: Q */
    public void m20660Q(ColorStateList colorStateList) {
        if (this.f17270p == colorStateList && this.f17268o == colorStateList) {
            return;
        }
        this.f17270p = colorStateList;
        this.f17268o = colorStateList;
        m20658N();
    }

    /* JADX INFO: renamed from: R */
    public void m20661R(int i7, int i8, int i9, int i10) {
        if (m20631P(this.f17254h, i7, i8, i9, i10)) {
            return;
        }
        this.f17254h.set(i7, i8, i9, i10);
        this.f17233T = true;
    }

    /* JADX INFO: renamed from: S */
    public void m20662S(Rect rect) {
        m20661R(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: T */
    public void m20663T(int i7) {
        if (i7 != this.f17271p0) {
            this.f17271p0 = i7;
            m20658N();
        }
    }

    /* JADX INFO: renamed from: U */
    public void m20664U(int i7) {
        C0424d c0424d = new C0424d(this.f17240a.getContext(), i7);
        if (c0424d.m1845j() != null) {
            this.f17270p = c0424d.m1845j();
        }
        if (c0424d.m1846k() != 0.0f) {
            this.f17266n = c0424d.m1846k();
        }
        ColorStateList colorStateList = c0424d.f1671c;
        if (colorStateList != null) {
            this.f17243b0 = colorStateList;
        }
        this.f17239Z = c0424d.f1677i;
        this.f17241a0 = c0424d.f1678j;
        this.f17238Y = c0424d.f1679k;
        this.f17253g0 = c0424d.f1681m;
        C0421a c0421a = this.f17219F;
        if (c0421a != null) {
            c0421a.m1815c();
        }
        this.f17219F = new C0421a(new a(), c0424d.m1841e());
        c0424d.m1843g(this.f17240a.getContext(), this.f17219F);
        m20658N();
    }

    /* JADX INFO: renamed from: W */
    public void m20665W(ColorStateList colorStateList) {
        if (this.f17270p != colorStateList) {
            this.f17270p = colorStateList;
            m20658N();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m20666X(int i7) {
        if (this.f17262l != i7) {
            this.f17262l = i7;
            m20658N();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m20667Y(Typeface typeface) {
        if (m20633Z(typeface)) {
            m20658N();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m20668a0(int i7, int i8, int i9, int i10) {
        m20669b0(i7, i8, i9, i10, true);
    }

    /* JADX INFO: renamed from: b0 */
    public void m20669b0(int i7, int i8, int i9, int i10, boolean z7) {
        if (m20631P(this.f17252g, i7, i8, i9, i10) && z7 == this.f17285w0) {
            return;
        }
        this.f17252g.set(i7, i8, i9, i10);
        this.f17233T = true;
        this.f17285w0 = z7;
    }

    /* JADX INFO: renamed from: c0 */
    public void m20670c0(Rect rect) {
        m20668a0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: d0 */
    public void m20671d0(float f7) {
        if (this.f17255h0 != f7) {
            this.f17255h0 = f7;
            m20658N();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m20672e0(int i7) {
        if (i7 != this.f17269o0) {
            this.f17269o0 = i7;
            m20658N();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m20673g0(int i7) {
        if (this.f17260k != i7) {
            this.f17260k = i7;
            m20658N();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m20674h0(float f7) {
        if (this.f17264m != f7) {
            this.f17264m = f7;
            m20658N();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m20675j0(float f7) {
        float fM2540a = AbstractC0577a.m2540a(f7, 0.0f, 1.0f);
        if (fM2540a != this.f17242b) {
            this.f17242b = fM2540a;
            m20636c();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m20676k(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f17222I == null || this.f17258j.width() <= 0.0f || this.f17258j.height() <= 0.0f) {
            return;
        }
        this.f17234U.setTextSize(this.f17226M);
        float f7 = this.f17282v;
        float f8 = this.f17284w;
        float f9 = this.f17225L;
        if (f9 != 1.0f && !this.f17244c) {
            canvas.scale(f9, f9, f7, f8);
        }
        if (m20648q0() && m20650r0() && (!this.f17244c || this.f17242b > this.f17248e)) {
            m20647l(canvas, this.f17282v - this.f17259j0.getLineStart(0), f8);
        } else {
            canvas.translate(f7, f8);
            this.f17259j0.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: l0 */
    public void m20677l0(TimeInterpolator timeInterpolator) {
        this.f17236W = timeInterpolator;
        m20658N();
    }

    /* JADX INFO: renamed from: m */
    public float m20678m() {
        m20623D(this.f17235V);
        return (-this.f17235V.ascent()) + this.f17235V.descent();
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m20679m0(int[] iArr) {
        this.f17232S = iArr;
        if (!m20656I()) {
            return false;
        }
        m20658N();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public float m20680n() {
        m20623D(this.f17235V);
        return -this.f17235V.ascent();
    }

    /* JADX INFO: renamed from: n0 */
    public void m20681n0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f17221H, charSequence)) {
            this.f17221H = charSequence;
            this.f17222I = null;
            m20658N();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m20682o(RectF rectF, int i7, int i8) {
        this.f17223J = m20639f(this.f17221H);
        rectF.left = Math.max(m20649r(i7, i8), this.f17254h.left);
        rectF.top = this.f17254h.top;
        rectF.right = Math.min(m20651s(rectF, i7, i8), this.f17254h.right);
        rectF.bottom = this.f17254h.top + m20686q();
        if (this.f17259j0 == null || m20650r0()) {
            return;
        }
        StaticLayout staticLayout = this.f17259j0;
        float lineWidth = staticLayout.getLineWidth(staticLayout.getLineCount() - 1) * (this.f17266n / this.f17264m);
        if (this.f17223J) {
            rectF.left = rectF.right - lineWidth;
        } else {
            rectF.right = rectF.left + lineWidth;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m20683o0(TimeInterpolator timeInterpolator) {
        this.f17237X = timeInterpolator;
        m20658N();
    }

    /* JADX INFO: renamed from: p */
    public ColorStateList m20684p() {
        return this.f17270p;
    }

    /* JADX INFO: renamed from: p0 */
    public void m20685p0(Typeface typeface) {
        boolean zM20633Z = m20633Z(typeface);
        boolean zM20644i0 = m20644i0(typeface);
        if (zM20633Z || zM20644i0) {
            m20658N();
        }
    }

    /* JADX INFO: renamed from: q */
    public float m20686q() {
        int i7 = this.f17281u0;
        return i7 != -1 ? i7 : m20680n();
    }

    /* JADX INFO: renamed from: s0 */
    public void m20687s0(int i7) {
        m20623D(this.f17235V);
        float f7 = i7;
        this.f17281u0 = m20645j(this.f17271p0, this.f17235V, this.f17221H, f7 * (this.f17266n / this.f17264m), this.f17223J).getHeight();
        m20624E(this.f17235V);
        this.f17283v0 = m20645j(this.f17269o0, this.f17235V, this.f17221H, f7, this.f17223J).getHeight();
    }

    /* JADX INFO: renamed from: t */
    public int m20688t() {
        return m20652u(this.f17270p);
    }

    /* JADX INFO: renamed from: w */
    public int m20689w() {
        return this.f17272q;
    }

    /* JADX INFO: renamed from: x */
    public int m20690x() {
        return this.f17269o0;
    }

    /* JADX INFO: renamed from: y */
    public float m20691y() {
        m20624E(this.f17235V);
        return (-this.f17235V.ascent()) + this.f17235V.descent();
    }

    /* JADX INFO: renamed from: z */
    public float m20692z() {
        int i7 = this.f17283v0;
        return i7 != -1 ? i7 : m20654A();
    }
}
