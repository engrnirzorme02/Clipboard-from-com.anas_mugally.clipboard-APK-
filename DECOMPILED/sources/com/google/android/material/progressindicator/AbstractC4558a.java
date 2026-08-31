package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.vectordrawable.graphics.drawable.AbstractC2860b;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.material.internal.AbstractC4543s;
import java.util.Arrays;
import p037E3.C0379a;
import p093L3.AbstractC0842a;
import p255h.AbstractC5520a;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4558a extends ProgressBar {

    /* JADX INFO: renamed from: A */
    static final int f17435A = AbstractC6751l.f26531E;

    /* JADX INFO: renamed from: a */
    AbstractC4559b f17436a;

    /* JADX INFO: renamed from: b */
    private int f17437b;

    /* JADX INFO: renamed from: c */
    private boolean f17438c;

    /* JADX INFO: renamed from: d */
    private boolean f17439d;

    /* JADX INFO: renamed from: e */
    private final int f17440e;

    /* JADX INFO: renamed from: f */
    private final int f17441f;

    /* JADX INFO: renamed from: r */
    private long f17442r;

    /* JADX INFO: renamed from: s */
    C0379a f17443s;

    /* JADX INFO: renamed from: t */
    private boolean f17444t;

    /* JADX INFO: renamed from: u */
    private int f17445u;

    /* JADX INFO: renamed from: v */
    boolean f17446v;

    /* JADX INFO: renamed from: w */
    private final Runnable f17447w;

    /* JADX INFO: renamed from: x */
    private final Runnable f17448x;

    /* JADX INFO: renamed from: y */
    private final AbstractC2860b f17449y;

    /* JADX INFO: renamed from: z */
    private final AbstractC2860b f17450z;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.a$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4558a.this.m20886k();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.a$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4558a.this.m20885j();
            AbstractC4558a.this.f17442r = -1L;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.a$c */
    class c extends AbstractC2860b {
        c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC2860b
        /* JADX INFO: renamed from: b */
        public void mo14226b(Drawable drawable) {
            AbstractC4558a.this.setIndeterminate(false);
            AbstractC4558a abstractC4558a = AbstractC4558a.this;
            abstractC4558a.mo20876p(abstractC4558a.f17437b, AbstractC4558a.this.f17438c);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.a$d */
    class d extends AbstractC2860b {
        d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC2860b
        /* JADX INFO: renamed from: b */
        public void mo14226b(Drawable drawable) {
            super.mo14226b(drawable);
            if (AbstractC4558a.this.f17444t) {
                return;
            }
            AbstractC4558a abstractC4558a = AbstractC4558a.this;
            abstractC4558a.setVisibility(abstractC4558a.f17445u);
        }
    }

    protected AbstractC4558a(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(AbstractC0842a.m3884d(context, attributeSet, i7, f17435A), attributeSet, i7);
        this.f17442r = -1L;
        this.f17444t = false;
        this.f17445u = 4;
        this.f17447w = new a();
        this.f17448x = new b();
        this.f17449y = new c();
        this.f17450z = new d();
        Context context2 = getContext();
        this.f17436a = mo20875i(context2, attributeSet);
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context2, attributeSet, AbstractC6752m.f26760S, i7, i8, new int[0]);
        this.f17440e = typedArrayM20818i.getInt(AbstractC6752m.f26834Z, -1);
        this.f17441f = Math.min(typedArrayM20818i.getInt(AbstractC6752m.f26814X, -1), zzbbn.zzq.zzf);
        typedArrayM20818i.recycle();
        this.f17443s = new C0379a();
        this.f17439d = true;
    }

    private AbstractC4562e getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().m20967x();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().m20914C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m20885j() {
        ((AbstractC4561d) getCurrentDrawable()).mo20922s(false, false, true);
        if (m20887m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m20886k() {
        if (this.f17441f > 0) {
            this.f17442r = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* JADX INFO: renamed from: m */
    private boolean m20887m() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    private void m20888n() {
        m20892o();
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo20921o(this.f17450z);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo20921o(this.f17450z);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m20889q() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo20924u(this.f17450z);
            getIndeterminateDrawable().m20966w().mo20962h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo20924u(this.f17450z);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f17436a.f17462h;
    }

    public int[] getIndicatorColor() {
        return this.f17436a.f17459e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f17436a.f17463i;
    }

    public int getShowAnimationBehavior() {
        return this.f17436a.f17461g;
    }

    public int getTrackColor() {
        return this.f17436a.f17460f;
    }

    public int getTrackCornerRadius() {
        return this.f17436a.f17456b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f17436a.f17457c;
    }

    public int getTrackThickness() {
        return this.f17436a.f17455a;
    }

    public int getWaveAmplitude() {
        return this.f17436a.f17466l;
    }

    public int getWaveSpeed() {
        return this.f17436a.f17467m;
    }

    public int getWavelengthDeterminate() {
        return this.f17436a.f17464j;
    }

    public int getWavelengthIndeterminate() {
        return this.f17436a.f17465k;
    }

    /* JADX INFO: renamed from: h */
    protected void m20890h(boolean z7) {
        if (this.f17439d) {
            ((AbstractC4561d) getCurrentDrawable()).mo20922s(m20893r(), false, z7);
        }
    }

    /* JADX INFO: renamed from: i */
    abstract AbstractC4559b mo20875i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: l */
    boolean m20891l() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    void m20892o() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().m20966w().mo20958d(this.f17449y);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m20888n();
        if (m20893r()) {
            m20886k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f17448x);
        removeCallbacks(this.f17447w);
        ((AbstractC4561d) getCurrentDrawable()).mo20918j();
        m20889q();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        getCurrentDrawingDelegate().mo20949g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i7, int i8) {
        try {
            AbstractC4562e currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.mo20948f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i7) : currentDrawingDelegate.mo20948f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.mo20947e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i8) : currentDrawingDelegate.mo20947e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        m20890h(i7 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        m20890h(false);
    }

    /* JADX INFO: renamed from: p */
    public void mo20876p(int i7, boolean z7) {
        if (!isIndeterminate()) {
            super.setProgress(i7);
            if (getProgressDrawable() == null || z7) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f17437b = i7;
            this.f17438c = z7;
            this.f17444t = true;
            if (!getIndeterminateDrawable().isVisible() || this.f17443s.m1613a(getContext().getContentResolver()) == 0.0f) {
                this.f17449y.mo14226b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().m20966w().mo20960f();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    boolean m20893r() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && m20891l();
    }

    public void setAnimatorDurationScaleProvider(C0379a c0379a) {
        this.f17443s = c0379a;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f17485c = c0379a;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f17485c = c0379a;
        }
    }

    public void setHideAnimationBehavior(int i7) {
        this.f17436a.f17462h = i7;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z7) {
        try {
            if (z7 == isIndeterminate()) {
                return;
            }
            AbstractC4561d abstractC4561d = (AbstractC4561d) getCurrentDrawable();
            if (abstractC4561d != null) {
                abstractC4561d.mo20918j();
            }
            super.setIndeterminate(z7);
            AbstractC4561d abstractC4561d2 = (AbstractC4561d) getCurrentDrawable();
            if (abstractC4561d2 != null) {
                abstractC4561d2.mo20922s(m20893r(), false, false);
            }
            if ((abstractC4561d2 instanceof C4564g) && m20893r()) {
                ((C4564g) abstractC4561d2).m20966w().mo20961g();
            }
            this.f17444t = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        if (abstractC4559b.f17468n != f7) {
            abstractC4559b.f17468n = f7;
            getIndeterminateDrawable().m20966w().mo20957c();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof C4564g) {
            ((AbstractC4561d) drawable).mo20918j();
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.f17446v) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{AbstractC7539a.m33171b(getContext(), AbstractC5520a.f20985w, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f17436a.f17459e = iArr;
        getIndeterminateDrawable().m20966w().mo20957c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        if (abstractC4559b.f17463i != i7) {
            abstractC4559b.f17463i = i7;
            abstractC4559b.mo20901h();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i7) {
        if (isIndeterminate()) {
            return;
        }
        mo20876p(i7, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (!(drawable instanceof C4560c)) {
            if (this.f17446v) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            C4560c c4560c = (C4560c) drawable;
            c4560c.mo20918j();
            super.setProgressDrawable(c4560c);
            c4560c.m20917K(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i7) {
        this.f17436a.f17461g = i7;
        invalidate();
    }

    public void setTrackColor(int i7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        if (abstractC4559b.f17460f != i7) {
            abstractC4559b.f17460f = i7;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        if (abstractC4559b.f17456b != i7) {
            abstractC4559b.f17456b = Math.min(i7, abstractC4559b.f17455a / 2);
            this.f17436a.f17458d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        if (abstractC4559b.f17457c != f7) {
            abstractC4559b.f17457c = Math.min(f7, 0.5f);
            this.f17436a.f17458d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        if (abstractC4559b.f17455a != i7) {
            abstractC4559b.f17455a = i7;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i7) {
        if (i7 != 0 && i7 != 4 && i7 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f17445u = i7;
    }

    public void setWaveAmplitude(int i7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        if (abstractC4559b.f17466l != i7) {
            abstractC4559b.f17466l = Math.abs(i7);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i7) {
        this.f17436a.f17467m = i7;
        getProgressDrawable().m20916I(this.f17436a.f17467m != 0);
    }

    public void setWavelength(int i7) {
        setWavelengthDeterminate(i7);
        setWavelengthIndeterminate(i7);
    }

    public void setWavelengthDeterminate(int i7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        if (abstractC4559b.f17464j != i7) {
            abstractC4559b.f17464j = Math.abs(i7);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        if (abstractC4559b.f17465k != i7) {
            abstractC4559b.f17465k = Math.abs(i7);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public C4564g getIndeterminateDrawable() {
        return (C4564g) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public C4560c getProgressDrawable() {
        return (C4560c) super.getProgressDrawable();
    }
}
