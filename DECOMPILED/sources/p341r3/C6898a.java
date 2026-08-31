package p341r3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.C4541q;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p045F3.AbstractC0423c;
import p045F3.C0424d;
import p069I3.C0622i;
import p069I3.C0627n;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6750k;
import p325p3.AbstractC6751l;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: r3.a */
/* JADX INFO: loaded from: classes2.dex */
public class C6898a extends Drawable implements C4541q.b {

    /* JADX INFO: renamed from: y */
    private static final int f27658y = AbstractC6751l.f26553r;

    /* JADX INFO: renamed from: z */
    private static final int f27659z = AbstractC6742c.f26244b;

    /* JADX INFO: renamed from: a */
    private final WeakReference f27660a;

    /* JADX INFO: renamed from: b */
    private final C0622i f27661b;

    /* JADX INFO: renamed from: c */
    private final C4541q f27662c;

    /* JADX INFO: renamed from: d */
    private final Rect f27663d;

    /* JADX INFO: renamed from: e */
    private final C6899b f27664e;

    /* JADX INFO: renamed from: f */
    private float f27665f;

    /* JADX INFO: renamed from: r */
    private float f27666r;

    /* JADX INFO: renamed from: s */
    private int f27667s;

    /* JADX INFO: renamed from: t */
    private float f27668t;

    /* JADX INFO: renamed from: u */
    private float f27669u;

    /* JADX INFO: renamed from: v */
    private float f27670v;

    /* JADX INFO: renamed from: w */
    private WeakReference f27671w;

    /* JADX INFO: renamed from: x */
    private WeakReference f27672x;

    private C6898a(Context context, int i7, int i8, int i9, C6899b.a aVar) {
        this.f27660a = new WeakReference(context);
        AbstractC4543s.m20812c(context);
        this.f27663d = new Rect();
        C4541q c4541q = new C4541q(this);
        this.f27662c = c4541q;
        c4541q.m20803g().setTextAlign(Paint.Align.CENTER);
        C6899b c6899b = new C6899b(context, i7, i8, i9, aVar);
        this.f27664e = c6899b;
        this.f27661b = new C0622i(C0627n.m2755b(context, m30143y() ? c6899b.m30173m() : c6899b.m30169i(), m30143y() ? c6899b.m30172l() : c6899b.m30168h()).m2802m());
        m30122K();
    }

    /* JADX INFO: renamed from: B */
    private void m30113B() {
        this.f27662c.m20803g().setAlpha(getAlpha());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: C */
    private void m30114C() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f27664e.m30165e());
        if (this.f27661b.m2697D() != colorStateListValueOf) {
            this.f27661b.m2718g0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: D */
    private void m30115D() {
        this.f27662c.m20807l(true);
        m30117F();
        m30124N();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: E */
    private void m30116E() {
        WeakReference weakReference = this.f27671w;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f27671w.get();
        WeakReference weakReference2 = this.f27672x;
        m30145M(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    /* JADX INFO: renamed from: F */
    private void m30117F() {
        Context context = (Context) this.f27660a.get();
        if (context == null) {
            return;
        }
        this.f27661b.setShapeAppearanceModel(C0627n.m2755b(context, m30143y() ? this.f27664e.m30173m() : this.f27664e.m30169i(), m30143y() ? this.f27664e.m30172l() : this.f27664e.m30168h()).m2802m());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: G */
    private void m30118G() {
        C0424d c0424d;
        Context context = (Context) this.f27660a.get();
        if (context == null || this.f27662c.m20801e() == (c0424d = new C0424d(context, this.f27664e.m30186z()))) {
            return;
        }
        this.f27662c.m20806k(c0424d, context);
        m30119H();
        m30124N();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: H */
    private void m30119H() {
        this.f27662c.m20803g().setColor(this.f27664e.m30170j());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: I */
    private void m30120I() {
        m30125O();
        this.f27662c.m20807l(true);
        m30124N();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: J */
    private void m30121J() {
        setVisible(this.f27664e.m30160F(), false);
    }

    /* JADX INFO: renamed from: K */
    private void m30122K() {
        m30117F();
        m30118G();
        m30120I();
        m30115D();
        m30113B();
        m30114C();
        m30119H();
        m30116E();
        m30124N();
        m30121J();
    }

    /* JADX INFO: renamed from: L */
    private static void m30123L(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* JADX INFO: renamed from: N */
    private void m30124N() {
        Context context = (Context) this.f27660a.get();
        WeakReference weakReference = this.f27671w;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f27663d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f27672x;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        m30128d(rect2, view);
        AbstractC6900c.m30252d(this.f27663d, this.f27665f, this.f27666r, this.f27669u, this.f27670v);
        float f7 = this.f27668t;
        if (f7 != -1.0f) {
            this.f27661b.m2714c0(f7);
        }
        if (rect.equals(this.f27663d)) {
            return;
        }
        this.f27661b.setBounds(this.f27663d);
    }

    /* JADX INFO: renamed from: O */
    private void m30125O() {
        if (m30148m() != -2) {
            this.f27667s = ((int) Math.pow(10.0d, ((double) m30148m()) - 1.0d)) - 1;
        } else {
            this.f27667s = m30149n();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m30126b(View view) {
        ViewParent viewParentM30147j = m30147j();
        if (viewParentM30147j == null) {
            viewParentM30147j = view.getParent();
        }
        if ((viewParentM30147j instanceof View) && (viewParentM30147j.getParent() instanceof View)) {
            m30127c(view, (View) viewParentM30147j.getParent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    private void m30127c(View view, View view2) {
        float y7;
        float x7;
        ViewParent parent;
        boolean z7;
        FrameLayout frameLayoutM30147j = m30147j();
        if (frameLayoutM30147j == null) {
            float y8 = view.getY();
            x7 = view.getX();
            parent = view.getParent();
            y7 = y8;
        } else {
            y7 = 0.0f;
            x7 = 0.0f;
            parent = frameLayoutM30147j;
        }
        while (true) {
            z7 = parent instanceof View;
            if (!z7 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y7 += view3.getY();
            x7 += view3.getX();
            parent = parent.getParent();
        }
        if (z7) {
            float fM30140v = m30140v(y7);
            float fM30134l = m30134l(x7);
            View view4 = (View) parent;
            float fM30132h = m30132h(view4.getHeight(), y7);
            float fM30137r = m30137r(view4.getWidth(), x7);
            if (fM30140v < 0.0f) {
                this.f27666r += Math.abs(fM30140v);
            }
            if (fM30134l < 0.0f) {
                this.f27665f += Math.abs(fM30134l);
            }
            if (fM30132h > 0.0f) {
                this.f27666r -= Math.abs(fM30132h);
            }
            if (fM30137r > 0.0f) {
                this.f27665f -= Math.abs(fM30137r);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m30128d(Rect rect, View view) {
        float f7;
        float f8;
        float f9 = m30143y() ? this.f27664e.f27676d : this.f27664e.f27675c;
        this.f27668t = f9;
        if (f9 != -1.0f) {
            this.f27669u = f9;
            this.f27670v = f9;
        } else {
            this.f27669u = Math.round((m30143y() ? this.f27664e.f27679g : this.f27664e.f27677e) / 2.0f);
            this.f27670v = Math.round((m30143y() ? this.f27664e.f27680h : this.f27664e.f27678f) / 2.0f);
        }
        if (m30143y()) {
            String strM30131g = m30131g();
            this.f27669u = Math.max(this.f27669u, (this.f27662c.m20804h(strM30131g) / 2.0f) + this.f27664e.m30167g());
            float fMax = Math.max(this.f27670v, (this.f27662c.m20802f(strM30131g) / 2.0f) + this.f27664e.m30171k());
            this.f27670v = fMax;
            this.f27669u = Math.max(this.f27669u, fMax);
        }
        int iM30142x = m30142x();
        int iM30166f = this.f27664e.m30166f();
        if (iM30166f == 8388691 || iM30166f == 8388693) {
            this.f27666r = rect.bottom - iM30142x;
        } else {
            this.f27666r = rect.top + iM30142x;
        }
        int iM30141w = m30141w();
        int iM30166f2 = this.f27664e.m30166f();
        if (iM30166f2 == 8388659 || iM30166f2 == 8388691) {
            if (this.f27664e.f27684l == 0) {
                f7 = view.getLayoutDirection() == 0 ? (rect.left + this.f27669u) - ((this.f27670v * 2.0f) - iM30141w) : (rect.right - this.f27669u) + ((this.f27670v * 2.0f) - iM30141w);
            } else {
                f7 = view.getLayoutDirection() == 0 ? (rect.left - this.f27669u) + iM30141w : (rect.right + this.f27669u) - iM30141w;
            }
            this.f27665f = f7;
        } else {
            if (this.f27664e.f27684l == 0) {
                f8 = view.getLayoutDirection() == 0 ? (rect.right + this.f27669u) - iM30141w : (rect.left - this.f27669u) + iM30141w;
            } else {
                f8 = view.getLayoutDirection() == 0 ? (rect.right - this.f27669u) + ((this.f27670v * 2.0f) - iM30141w) : (rect.left + this.f27669u) - ((this.f27670v * 2.0f) - iM30141w);
            }
            this.f27665f = f8;
        }
        if (this.f27664e.m30159E()) {
            m30126b(view);
        } else {
            m30127c(view, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C6898a m30129e(Context context) {
        return new C6898a(context, 0, f27659z, f27658y, null);
    }

    /* JADX INFO: renamed from: f */
    private void m30130f(Canvas canvas) {
        String strM30131g = m30131g();
        if (strM30131g != null) {
            Rect rect = new Rect();
            this.f27662c.m20803g().getTextBounds(strM30131g, 0, strM30131g.length(), rect);
            float fExactCenterY = this.f27666r - rect.exactCenterY();
            canvas.drawText(strM30131g, this.f27665f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f27662c.m20803g());
        }
    }

    /* JADX INFO: renamed from: g */
    private String m30131g() {
        if (m30144A()) {
            return m30138t();
        }
        if (m30152z()) {
            return m30135p();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private float m30132h(float f7, float f8) {
        return ((this.f27666r + this.f27670v) - f7) + f8;
    }

    /* JADX INFO: renamed from: k */
    private CharSequence m30133k() {
        return this.f27664e.m30176p();
    }

    /* JADX INFO: renamed from: l */
    private float m30134l(float f7) {
        return (this.f27665f - this.f27669u) + f7;
    }

    /* JADX INFO: renamed from: p */
    private String m30135p() {
        if (this.f27667s == -2 || m30150o() <= this.f27667s) {
            return NumberFormat.getInstance(this.f27664e.m30184x()).format(m30150o());
        }
        Context context = (Context) this.f27660a.get();
        return context == null ? "" : String.format(this.f27664e.m30184x(), context.getString(AbstractC6750k.f26519s), Integer.valueOf(this.f27667s), "+");
    }

    /* JADX INFO: renamed from: q */
    private String m30136q() {
        Context context;
        if (this.f27664e.m30177q() == 0 || (context = (Context) this.f27660a.get()) == null) {
            return null;
        }
        return (this.f27667s == -2 || m30150o() <= this.f27667s) ? context.getResources().getQuantityString(this.f27664e.m30177q(), m30150o(), Integer.valueOf(m30150o())) : context.getString(this.f27664e.m30174n(), Integer.valueOf(this.f27667s));
    }

    /* JADX INFO: renamed from: r */
    private float m30137r(float f7, float f8) {
        return ((this.f27665f + this.f27669u) - f7) + f8;
    }

    /* JADX INFO: renamed from: t */
    private String m30138t() {
        String strM30151s = m30151s();
        int iM30148m = m30148m();
        if (iM30148m == -2 || strM30151s == null || strM30151s.length() <= iM30148m) {
            return strM30151s;
        }
        Context context = (Context) this.f27660a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(AbstractC6750k.f26509i), strM30151s.substring(0, iM30148m - 1), "…");
    }

    /* JADX INFO: renamed from: u */
    private CharSequence m30139u() {
        CharSequence charSequenceM30175o = this.f27664e.m30175o();
        return charSequenceM30175o != null ? charSequenceM30175o : m30151s();
    }

    /* JADX INFO: renamed from: v */
    private float m30140v(float f7) {
        return (this.f27666r - this.f27670v) + f7;
    }

    /* JADX INFO: renamed from: w */
    private int m30141w() {
        int iM30178r = m30143y() ? this.f27664e.m30178r() : this.f27664e.m30179s();
        if (this.f27664e.f27683k == 1) {
            iM30178r += m30143y() ? this.f27664e.f27682j : this.f27664e.f27681i;
        }
        return iM30178r + this.f27664e.m30162b();
    }

    /* JADX INFO: renamed from: x */
    private int m30142x() {
        int iM30156B = this.f27664e.m30156B();
        if (m30143y()) {
            iM30156B = this.f27664e.m30155A();
            Context context = (Context) this.f27660a.get();
            if (context != null) {
                iM30156B = AbstractC6826a.m29845c(iM30156B, iM30156B - this.f27664e.m30180t(), AbstractC6826a.m29844b(0.0f, 1.0f, 0.3f, 1.0f, AbstractC0423c.m1829e(context) - 1.0f));
            }
        }
        if (this.f27664e.f27683k == 0) {
            iM30156B -= Math.round(this.f27670v);
        }
        return iM30156B + this.f27664e.m30163c();
    }

    /* JADX INFO: renamed from: y */
    private boolean m30143y() {
        return m30144A() || m30152z();
    }

    /* JADX INFO: renamed from: A */
    public boolean m30144A() {
        return this.f27664e.m30158D();
    }

    /* JADX INFO: renamed from: M */
    public void m30145M(View view, FrameLayout frameLayout) {
        this.f27671w = new WeakReference(view);
        this.f27672x = new WeakReference(frameLayout);
        m30123L(view);
        m30124N();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.C4541q.b
    /* JADX INFO: renamed from: a */
    public void mo4068a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f27661b.draw(canvas);
        if (m30143y()) {
            m30130f(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f27664e.m30164d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f27663d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f27663d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: i */
    public CharSequence m30146i() {
        if (!isVisible()) {
            return null;
        }
        if (m30144A()) {
            return m30139u();
        }
        return m30152z() ? m30136q() : m30133k();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public FrameLayout m30147j() {
        WeakReference weakReference = this.f27672x;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public int m30148m() {
        return this.f27664e.m30181u();
    }

    /* JADX INFO: renamed from: n */
    public int m30149n() {
        return this.f27664e.m30182v();
    }

    /* JADX INFO: renamed from: o */
    public int m30150o() {
        if (this.f27664e.m30157C()) {
            return this.f27664e.m30183w();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C4541q.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* JADX INFO: renamed from: s */
    public String m30151s() {
        return this.f27664e.m30185y();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f27664e.m30161H(i7);
        m30113B();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX INFO: renamed from: z */
    public boolean m30152z() {
        return !this.f27664e.m30158D() && this.f27664e.m30157C();
    }
}
