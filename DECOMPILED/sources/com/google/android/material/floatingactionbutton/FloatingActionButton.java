package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.C2359j;
import androidx.appcompat.widget.C2367p;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.AbstractC4528d;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.AbstractC4546v;
import com.google.android.material.internal.AbstractC4547w;
import java.util.List;
import p013B3.C0085b;
import p013B3.InterfaceC0084a;
import p041F.AbstractC0400a;
import p045F3.AbstractC0423c;
import p061H3.InterfaceC0500b;
import p069I3.C0627n;
import p069I3.InterfaceC0630q;
import p085K3.C0744a;
import p093L3.AbstractC0842a;
import p104N.AbstractC0910g;
import p111O.AbstractC1030Z;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p333q3.C6831f;

/* JADX INFO: loaded from: classes2.dex */
public class FloatingActionButton extends AbstractC4547w implements InterfaceC0084a, InterfaceC0630q, CoordinatorLayout.InterfaceC2422b {

    /* JADX INFO: renamed from: C */
    private static final int f17081C = AbstractC6751l.f26544i;

    /* JADX INFO: renamed from: A */
    private final C0085b f17082A;

    /* JADX INFO: renamed from: B */
    private C4520e f17083B;

    /* JADX INFO: renamed from: b */
    private ColorStateList f17084b;

    /* JADX INFO: renamed from: c */
    private PorterDuff.Mode f17085c;

    /* JADX INFO: renamed from: d */
    private ColorStateList f17086d;

    /* JADX INFO: renamed from: e */
    private PorterDuff.Mode f17087e;

    /* JADX INFO: renamed from: f */
    private ColorStateList f17088f;

    /* JADX INFO: renamed from: r */
    private int f17089r;

    /* JADX INFO: renamed from: s */
    private int f17090s;

    /* JADX INFO: renamed from: t */
    private int f17091t;

    /* JADX INFO: renamed from: u */
    private int f17092u;

    /* JADX INFO: renamed from: v */
    private int f17093v;

    /* JADX INFO: renamed from: w */
    boolean f17094w;

    /* JADX INFO: renamed from: x */
    final Rect f17095x;

    /* JADX INFO: renamed from: y */
    private final Rect f17096y;

    /* JADX INFO: renamed from: z */
    private final C2367p f17097z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo10501f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo10501f(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: M */
        public /* bridge */ /* synthetic */ boolean mo10507l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo10507l(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: N */
        public /* bridge */ /* synthetic */ boolean mo10511p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i7) {
            return super.mo10511p(coordinatorLayout, floatingActionButton, i7);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: k */
        public /* bridge */ /* synthetic */ void mo10506k(CoordinatorLayout.C2426f c2426f) {
            super.mo10506k(c2426f);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class AbstractC4514a {
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    private class C4515b implements InterfaceC0500b {
        C4515b() {
        }

        @Override // p061H3.InterfaceC0500b
        /* JADX INFO: renamed from: a */
        public void mo2114a(int i7, int i8, int i9, int i10) {
            FloatingActionButton.this.f17095x.set(i7, i8, i9, i10);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i7 + floatingActionButton.f17092u, i8 + FloatingActionButton.this.f17092u, i9 + FloatingActionButton.this.f17092u, i10 + FloatingActionButton.this.f17092u);
        }

        @Override // p061H3.InterfaceC0500b
        /* JADX INFO: renamed from: d */
        public void mo2115d(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // p061H3.InterfaceC0500b
        /* JADX INFO: renamed from: e */
        public boolean mo2116e() {
            return FloatingActionButton.this.f17094w;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26276r);
    }

    /* JADX INFO: renamed from: f */
    private int m20499f(int i7) {
        int i8 = this.f17091t;
        if (i8 != 0) {
            return i8;
        }
        Resources resources = getResources();
        if (i7 != -1) {
            return i7 != 1 ? resources.getDimensionPixelSize(AbstractC6744e.f26338d) : resources.getDimensionPixelSize(AbstractC6744e.f26336c);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m20499f(1) : m20499f(0);
    }

    /* JADX INFO: renamed from: g */
    private void m20500g(Rect rect) {
        m20504e(rect);
        int i7 = -this.f17083B.m20580u();
        rect.inset(i7, i7);
    }

    private C4520e getImpl() {
        if (this.f17083B == null) {
            this.f17083B = new C4520e(this, new C4515b());
        }
        return this.f17083B;
    }

    /* JADX INFO: renamed from: i */
    private void m20501i(Rect rect) {
        int i7 = rect.left;
        Rect rect2 = this.f17095x;
        rect.left = i7 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* JADX INFO: renamed from: j */
    private void m20502j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f17086d;
        if (colorStateList == null) {
            AbstractC0400a.m1697c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f17087e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C2359j.m10089e(colorForState, mode));
    }

    /* JADX INFO: renamed from: l */
    private C4520e.g m20503l(AbstractC4514a abstractC4514a) {
        return null;
    }

    @Override // p013B3.InterfaceC0084a
    /* JADX INFO: renamed from: a */
    public boolean mo291a() {
        return this.f17082A.m294c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
    }

    /* JADX INFO: renamed from: e */
    public void m20504e(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m20501i(rect);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f17084b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f17085c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC2422b
    public CoordinatorLayout.AbstractC2423c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m20572m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m20575p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m20577r();
    }

    public Drawable getContentBackground() {
        return getImpl().m20571l();
    }

    public int getCustomSize() {
        return this.f17091t;
    }

    public int getExpandedComponentIdHint() {
        return this.f17082A.m293b();
    }

    public C6831f getHideMotionSpec() {
        return getImpl().m20574o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f17088f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f17088f;
    }

    public C0627n getShapeAppearanceModel() {
        return (C0627n) AbstractC0910g.m4139g(getImpl().m20578s());
    }

    public C6831f getShowMotionSpec() {
        return getImpl().m20579t();
    }

    public int getSize() {
        return this.f17090s;
    }

    int getSizeDimension() {
        return m20499f(this.f17090s);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f17086d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f17087e;
    }

    public boolean getUseCompatPadding() {
        return this.f17094w;
    }

    /* JADX INFO: renamed from: h */
    void m20505h(AbstractC4514a abstractC4514a, boolean z7) {
        getImpl().m20581v(m20503l(abstractC4514a), z7);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    /* JADX INFO: renamed from: k */
    void m20506k(AbstractC4514a abstractC4514a, boolean z7) {
        getImpl().m20565X(m20503l(abstractC4514a), z7);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m20543A();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m20545C();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i7, int i8) {
        int sizeDimension = getSizeDimension();
        this.f17092u = (sizeDimension - this.f17093v) / 2;
        getImpl().m20567Z();
        int iMin = Math.min(View.resolveSize(sizeDimension, i7), View.resolveSize(sizeDimension, i8));
        Rect rect = this.f17095x;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0744a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0744a c0744a = (C0744a) parcelable;
        super.onRestoreInstanceState(c0744a.m6085a());
        this.f17082A.m295d((Bundle) AbstractC0910g.m4139g((Bundle) c0744a.f2924c.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        C0744a c0744a = new C0744a(parcelableOnSaveInstanceState);
        c0744a.f2924c.put("expandableWidgetHelper", this.f17082A.m296e());
        return c0744a;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m20500g(this.f17096y);
            if (!this.f17096y.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f17084b != colorStateList) {
            this.f17084b = colorStateList;
            getImpl().m20550H(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f17085c != mode) {
            this.f17085c = mode;
            getImpl().m20551I(mode);
        }
    }

    public void setCompatElevation(float f7) {
        getImpl().m20552J(f7);
    }

    public void setCompatElevationResource(int i7) {
        setCompatElevation(getResources().getDimension(i7));
    }

    public void setCompatHoveredFocusedTranslationZ(float f7) {
        getImpl().m20555M(f7);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i7) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i7));
    }

    public void setCompatPressedTranslationZ(float f7) {
        getImpl().m20559Q(f7);
    }

    public void setCompatPressedTranslationZResource(int i7) {
        setCompatPressedTranslationZ(getResources().getDimension(i7));
    }

    public void setCustomSize(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i7 != this.f17091t) {
            this.f17091t = i7;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        getImpl().m20568a0(f7);
    }

    public void setEnsureMinTouchTargetSize(boolean z7) {
        if (z7 != getImpl().m20573n()) {
            getImpl().m20553K(z7);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i7) {
        this.f17082A.m297f(i7);
    }

    public void setHideMotionSpec(C6831f c6831f) {
        getImpl().m20554L(c6831f);
    }

    public void setHideMotionSpecResource(int i7) {
        setHideMotionSpec(C6831f.m29854d(getContext(), i7));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().m20566Y();
            if (this.f17086d != null) {
                m20502j();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        this.f17097z.m10136i(i7);
        m20502j();
    }

    public void setMaxImageSize(int i7) {
        this.f17093v = i7;
        getImpl().m20557O(i7);
    }

    public void setRippleColor(int i7) {
        setRippleColor(ColorStateList.valueOf(i7));
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        super.setScaleX(f7);
        getImpl().m20548F();
    }

    @Override // android.view.View
    public void setScaleY(float f7) {
        super.setScaleY(f7);
        getImpl().m20548F();
    }

    public void setShadowPaddingEnabled(boolean z7) {
        getImpl().m20561S(z7);
    }

    @Override // p069I3.InterfaceC0630q
    public void setShapeAppearanceModel(C0627n c0627n) {
        getImpl().m20562T(c0627n);
    }

    public void setShowMotionSpec(C6831f c6831f) {
        getImpl().m20563U(c6831f);
    }

    public void setShowMotionSpecResource(int i7) {
        setShowMotionSpec(C6831f.m29854d(getContext(), i7));
    }

    public void setSize(int i7) {
        this.f17091t = 0;
        if (i7 != this.f17090s) {
            this.f17090s = i7;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f17086d != colorStateList) {
            this.f17086d = colorStateList;
            m20502j();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f17087e != mode) {
            this.f17087e = mode;
            m20502j();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        getImpl().m20549G();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        getImpl().m20549G();
    }

    @Override // android.view.View
    public void setTranslationZ(float f7) {
        super.setTranslationZ(f7);
        getImpl().m20549G();
    }

    public void setUseCompatPadding(boolean z7) {
        if (this.f17094w != z7) {
            this.f17094w = z7;
            getImpl().m20544B();
        }
    }

    @Override // com.google.android.material.internal.AbstractC4547w, android.widget.ImageView, android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC2423c {

        /* JADX INFO: renamed from: a */
        private Rect f17098a;

        /* JADX INFO: renamed from: b */
        private boolean f17099b;

        public BaseBehavior() {
            this.f17099b = true;
        }

        /* JADX INFO: renamed from: J */
        private boolean m20507J(View view, FloatingActionButton floatingActionButton) {
            return (this.f17099b && ((CoordinatorLayout.C2426f) floatingActionButton.getLayoutParams()).m10529e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) ? false : true;
        }

        /* JADX INFO: renamed from: K */
        private static boolean m20508K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C2426f) {
                return ((CoordinatorLayout.C2426f) layoutParams).m10530f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* JADX INFO: renamed from: L */
        private void m20509L(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i7;
            Rect rect = floatingActionButton.f17095x;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.C2426f c2426f = (CoordinatorLayout.C2426f) floatingActionButton.getLayoutParams();
            int i8 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c2426f).rightMargin) {
                i7 = rect.right;
            } else {
                i7 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c2426f).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin) {
                i8 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c2426f).topMargin) {
                i8 = -rect.top;
            }
            if (i8 != 0) {
                AbstractC1030Z.m4449U(floatingActionButton, i8);
            }
            if (i7 != 0) {
                AbstractC1030Z.m4448T(floatingActionButton, i7);
            }
        }

        /* JADX INFO: renamed from: O */
        private boolean m20510O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (m20507J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f17098a == null) {
                this.f17098a = new Rect();
            }
            Rect rect = this.f17098a;
            AbstractC4528d.m20694a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m20505h(null, false);
                return true;
            }
            floatingActionButton.m20506k(null, false);
            return true;
        }

        /* JADX INFO: renamed from: P */
        private boolean m20511P(View view, FloatingActionButton floatingActionButton) {
            if (m20507J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C2426f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m20505h(null, false);
                return true;
            }
            floatingActionButton.m20506k(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean mo10501f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f17095x;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean mo10507l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m20510O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!m20508K(view)) {
                return false;
            }
            m20511P(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean mo10511p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i7) {
            List listM10488v = coordinatorLayout.m10488v(floatingActionButton);
            int size = listM10488v.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) listM10488v.get(i8);
                if (!(view instanceof AppBarLayout)) {
                    if (m20508K(view) && m20511P(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m20510O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m10476Q(floatingActionButton, i7);
            m20509L(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: k */
        public void mo10506k(CoordinatorLayout.C2426f c2426f) {
            if (c2426f.f9262h == 0) {
                c2426f.f9262h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6752m.f27056t2);
            this.f17099b = typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f27067u2, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17081C;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        this.f17095x = new Rect();
        this.f17096y = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context2, attributeSet, AbstractC6752m.f26880d2, i7, i8, new int[0]);
        this.f17084b = AbstractC0423c.m1825a(context2, typedArrayM20818i, AbstractC6752m.f26902f2);
        this.f17085c = AbstractC4546v.m20835j(typedArrayM20818i.getInt(AbstractC6752m.f26913g2, -1), null);
        this.f17088f = AbstractC0423c.m1825a(context2, typedArrayM20818i, AbstractC6752m.f27023q2);
        this.f17090s = typedArrayM20818i.getInt(AbstractC6752m.f26968l2, -1);
        this.f17091t = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26957k2, 0);
        this.f17089r = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26924h2, 0);
        float dimension = typedArrayM20818i.getDimension(AbstractC6752m.f26935i2, 0.0f);
        float dimension2 = typedArrayM20818i.getDimension(AbstractC6752m.f26990n2, 0.0f);
        float dimension3 = typedArrayM20818i.getDimension(AbstractC6752m.f27012p2, 0.0f);
        this.f17094w = typedArrayM20818i.getBoolean(AbstractC6752m.f27045s2, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC6744e.f26359n0);
        setMaxImageSize(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f27001o2, 0));
        C6831f c6831fM29853c = C6831f.m29853c(context2, typedArrayM20818i, AbstractC6752m.f27034r2);
        C6831f c6831fM29853c2 = C6831f.m29853c(context2, typedArrayM20818i, AbstractC6752m.f26979m2);
        C0627n c0627nM2802m = C0627n.m2760g(context2, attributeSet, i7, i8, C0627n.f2403m).m2802m();
        boolean z7 = typedArrayM20818i.getBoolean(AbstractC6752m.f26946j2, false);
        setEnabled(typedArrayM20818i.getBoolean(AbstractC6752m.f26891e2, true));
        typedArrayM20818i.recycle();
        C2367p c2367p = new C2367p(this);
        this.f17097z = c2367p;
        c2367p.m10134g(attributeSet, i7);
        this.f17082A = new C0085b(this);
        getImpl().m20562T(c0627nM2802m);
        getImpl().m20583x(this.f17084b, this.f17085c, this.f17088f, this.f17089r);
        getImpl().m20558P(dimensionPixelSize);
        getImpl().m20552J(dimension);
        getImpl().m20555M(dimension2);
        getImpl().m20559Q(dimension3);
        getImpl().m20563U(c6831fM29853c);
        getImpl().m20554L(c6831fM29853c2);
        getImpl().m20553K(z7);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f17088f != colorStateList) {
            this.f17088f = colorStateList;
            getImpl().m20560R(this.f17088f);
        }
    }
}
