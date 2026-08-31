package p101M3;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.C4541q;
import p033E.AbstractC0246a;
import p045F3.AbstractC0423c;
import p045F3.C0424d;
import p069I3.C0620g;
import p069I3.C0621h;
import p069I3.C0622i;
import p069I3.C0624k;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p333q3.AbstractC6826a;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: M3.a */
/* JADX INFO: loaded from: classes2.dex */
public class C0895a extends C0622i implements C4541q.b {

    /* JADX INFO: renamed from: m0 */
    private static final int f3496m0 = AbstractC6751l.f26535I;

    /* JADX INFO: renamed from: n0 */
    private static final int f3497n0 = AbstractC6742c.f26277r0;

    /* JADX INFO: renamed from: U */
    private CharSequence f3498U;

    /* JADX INFO: renamed from: V */
    private final Context f3499V;

    /* JADX INFO: renamed from: W */
    private final Paint.FontMetrics f3500W;

    /* JADX INFO: renamed from: X */
    private final C4541q f3501X;

    /* JADX INFO: renamed from: Y */
    private final View.OnLayoutChangeListener f3502Y;

    /* JADX INFO: renamed from: Z */
    private final Rect f3503Z;

    /* JADX INFO: renamed from: a0 */
    private int f3504a0;

    /* JADX INFO: renamed from: b0 */
    private int f3505b0;

    /* JADX INFO: renamed from: c0 */
    private int f3506c0;

    /* JADX INFO: renamed from: d0 */
    private int f3507d0;

    /* JADX INFO: renamed from: e0 */
    private boolean f3508e0;

    /* JADX INFO: renamed from: f0 */
    private int f3509f0;

    /* JADX INFO: renamed from: g0 */
    private int f3510g0;

    /* JADX INFO: renamed from: h0 */
    private float f3511h0;

    /* JADX INFO: renamed from: i0 */
    private float f3512i0;

    /* JADX INFO: renamed from: j0 */
    private float f3513j0;

    /* JADX INFO: renamed from: k0 */
    private float f3514k0;

    /* JADX INFO: renamed from: l0 */
    private float f3515l0;

    /* JADX INFO: renamed from: M3.a$a */
    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            C0895a.this.m4060O0(view);
        }
    }

    private C0895a(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f3500W = new Paint.FontMetrics();
        C4541q c4541q = new C4541q(this);
        this.f3501X = c4541q;
        this.f3502Y = new a();
        this.f3503Z = new Rect();
        this.f3511h0 = 1.0f;
        this.f3512i0 = 1.0f;
        this.f3513j0 = 0.5f;
        this.f3514k0 = 0.5f;
        this.f3515l0 = 1.0f;
        this.f3499V = context;
        c4541q.m20803g().density = context.getResources().getDisplayMetrics().density;
        c4541q.m20803g().setTextAlign(Paint.Align.CENTER);
    }

    /* JADX INFO: renamed from: A0 */
    private float m4052A0() {
        int i7;
        if (((this.f3503Z.right - getBounds().right) - this.f3510g0) - this.f3507d0 < 0) {
            i7 = ((this.f3503Z.right - getBounds().right) - this.f3510g0) - this.f3507d0;
        } else {
            if (((this.f3503Z.left - getBounds().left) - this.f3510g0) + this.f3507d0 <= 0) {
                return 0.0f;
            }
            i7 = ((this.f3503Z.left - getBounds().left) - this.f3510g0) + this.f3507d0;
        }
        return i7;
    }

    /* JADX INFO: renamed from: B0 */
    private float m4053B0() {
        this.f3501X.m20803g().getFontMetrics(this.f3500W);
        Paint.FontMetrics fontMetrics = this.f3500W;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX INFO: renamed from: C0 */
    private float m4054C0(Rect rect) {
        return rect.centerY() - m4053B0();
    }

    /* JADX INFO: renamed from: D0 */
    public static C0895a m4055D0(Context context, AttributeSet attributeSet, int i7, int i8) {
        C0895a c0895a = new C0895a(context, attributeSet, i7, i8);
        c0895a.m4059I0(attributeSet, i7, i8);
        return c0895a;
    }

    /* JADX INFO: renamed from: E0 */
    private C0620g m4056E0() {
        float f7 = -m4052A0();
        float fWidth = (float) ((((double) getBounds().width()) - (((double) this.f3509f0) * Math.sqrt(2.0d))) / 2.0d);
        return new C0624k(new C0621h(this.f3509f0), Math.min(Math.max(f7, -fWidth), fWidth));
    }

    /* JADX INFO: renamed from: G0 */
    private void m4057G0(Canvas canvas) {
        if (this.f3498U == null) {
            return;
        }
        Rect bounds = getBounds();
        int iM4054C0 = (int) m4054C0(bounds);
        if (this.f3501X.m20801e() != null) {
            this.f3501X.m20803g().drawableState = getState();
            this.f3501X.m20809n(this.f3499V);
            this.f3501X.m20803g().setAlpha((int) (this.f3515l0 * 255.0f));
        }
        CharSequence charSequence = this.f3498U;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), iM4054C0, this.f3501X.m20803g());
    }

    /* JADX INFO: renamed from: H0 */
    private float m4058H0() {
        CharSequence charSequence = this.f3498U;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f3501X.m20804h(charSequence.toString());
    }

    /* JADX INFO: renamed from: I0 */
    private void m4059I0(AttributeSet attributeSet, int i7, int i8) {
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(this.f3499V, attributeSet, AbstractC6752m.f26704M9, i7, i8, new int[0]);
        this.f3509f0 = this.f3499V.getResources().getDimensionPixelSize(AbstractC6744e.f26309D0);
        boolean z7 = typedArrayM20818i.getBoolean(AbstractC6752m.f26803V9, true);
        this.f3508e0 = z7;
        if (z7) {
            setShapeAppearanceModel(m2703J().m2776w().m2807s(m4056E0()).m2802m());
        } else {
            this.f3509f0 = 0;
        }
        m4066M0(typedArrayM20818i.getText(AbstractC6752m.f26781T9));
        C0424d c0424dM1831g = AbstractC0423c.m1831g(this.f3499V, typedArrayM20818i, AbstractC6752m.f26715N9);
        if (c0424dM1831g != null) {
            int i9 = AbstractC6752m.f26726O9;
            if (typedArrayM20818i.hasValue(i9)) {
                c0424dM1831g.m1847n(AbstractC0423c.m1825a(this.f3499V, typedArrayM20818i, i9));
            }
        }
        m4067N0(c0424dM1831g);
        m2718g0(ColorStateList.valueOf(typedArrayM20818i.getColor(AbstractC6752m.f26792U9, AbstractC7539a.m33178i(AbstractC0246a.m1182k(AbstractC7539a.m33172c(this.f3499V, R.attr.colorBackground, C0895a.class.getCanonicalName()), 229), AbstractC0246a.m1182k(AbstractC7539a.m33172c(this.f3499V, AbstractC6742c.f26254g, C0895a.class.getCanonicalName()), 153)))));
        m2731r0(ColorStateList.valueOf(AbstractC7539a.m33172c(this.f3499V, AbstractC6742c.f26262k, C0895a.class.getCanonicalName())));
        this.f3504a0 = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26737P9, 0);
        this.f3505b0 = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26759R9, 0);
        this.f3506c0 = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26770S9, 0);
        this.f3507d0 = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26748Q9, 0);
        typedArrayM20818i.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public void m4060O0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f3510g0 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f3503Z);
    }

    /* JADX INFO: renamed from: F0 */
    public void m4062F0(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.f3502Y);
    }

    /* JADX INFO: renamed from: J0 */
    public void m4063J0(float f7, float f8) {
        this.f3513j0 = f7;
        this.f3514k0 = f8;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: K0 */
    public void m4064K0(View view) {
        if (view == null) {
            return;
        }
        m4060O0(view);
        view.addOnLayoutChangeListener(this.f3502Y);
    }

    /* JADX INFO: renamed from: L0 */
    public void m4065L0(float f7) {
        this.f3511h0 = f7;
        this.f3512i0 = f7;
        this.f3515l0 = AbstractC6826a.m29844b(0.0f, 1.0f, 0.19f, 1.0f, f7);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: M0 */
    public void m4066M0(CharSequence charSequence) {
        if (TextUtils.equals(this.f3498U, charSequence)) {
            return;
        }
        this.f3498U = charSequence;
        this.f3501X.m20808m(true);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: N0 */
    public void m4067N0(C0424d c0424d) {
        this.f3501X.m20806k(c0424d, this.f3499V);
    }

    @Override // com.google.android.material.internal.C4541q.b
    /* JADX INFO: renamed from: a */
    public void mo4068a() {
        invalidateSelf();
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float fM4052A0 = m4052A0();
        float f7 = (float) (-((((double) this.f3509f0) * Math.sqrt(2.0d)) - ((double) this.f3509f0)));
        canvas.scale(this.f3511h0, this.f3512i0, getBounds().left + (getBounds().width() * this.f3513j0), getBounds().top + (getBounds().height() * this.f3514k0));
        canvas.translate(fM4052A0, f7);
        super.draw(canvas);
        m4057G0(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f3501X.m20803g().getTextSize(), this.f3506c0);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f3504a0 * 2) + m4058H0(), this.f3505b0);
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f3508e0) {
            setShapeAppearanceModel(m2703J().m2776w().m2807s(m4056E0()).m2802m());
        }
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
