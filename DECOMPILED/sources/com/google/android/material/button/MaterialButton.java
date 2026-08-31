package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.app.AbstractC2263x;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.AbstractC4546v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p029D3.AbstractC0196h;
import p041F.AbstractC0400a;
import p045F3.AbstractC0423c;
import p069I3.AbstractC0623j;
import p069I3.C0622i;
import p069I3.C0627n;
import p069I3.C0635v;
import p069I3.C0636w;
import p069I3.InterfaceC0630q;
import p093L3.AbstractC0842a;
import p146T.AbstractC1446a;
import p224d0.AbstractC5205i;
import p224d0.C5207k;
import p224d0.C5208l;
import p263i.AbstractC5659a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC0630q {

    /* JADX INFO: renamed from: Q */
    private static final int[] f16544Q = {R.attr.state_checkable};

    /* JADX INFO: renamed from: R */
    private static final int[] f16545R = {R.attr.state_checked};

    /* JADX INFO: renamed from: S */
    private static final int f16546S = AbstractC6751l.f26555t;

    /* JADX INFO: renamed from: T */
    private static final int f16547T = AbstractC6742c.f26220E;

    /* JADX INFO: renamed from: U */
    private static final AbstractC5205i f16548U = new C4430a("widthIncrease");

    /* JADX INFO: renamed from: A */
    private boolean f16549A;

    /* JADX INFO: renamed from: B */
    private int f16550B;

    /* JADX INFO: renamed from: C */
    private int f16551C;

    /* JADX INFO: renamed from: D */
    private float f16552D;

    /* JADX INFO: renamed from: E */
    private int f16553E;

    /* JADX INFO: renamed from: F */
    private int f16554F;

    /* JADX INFO: renamed from: G */
    private LinearLayout.LayoutParams f16555G;

    /* JADX INFO: renamed from: H */
    private boolean f16556H;

    /* JADX INFO: renamed from: I */
    private int f16557I;

    /* JADX INFO: renamed from: J */
    private boolean f16558J;

    /* JADX INFO: renamed from: K */
    int f16559K;

    /* JADX INFO: renamed from: L */
    C0636w f16560L;

    /* JADX INFO: renamed from: M */
    int f16561M;

    /* JADX INFO: renamed from: N */
    private float f16562N;

    /* JADX INFO: renamed from: O */
    private float f16563O;

    /* JADX INFO: renamed from: P */
    private C5207k f16564P;

    /* JADX INFO: renamed from: d */
    private final C4439e f16565d;

    /* JADX INFO: renamed from: e */
    private final LinkedHashSet f16566e;

    /* JADX INFO: renamed from: f */
    private InterfaceC4431b f16567f;

    /* JADX INFO: renamed from: r */
    private PorterDuff.Mode f16568r;

    /* JADX INFO: renamed from: s */
    private ColorStateList f16569s;

    /* JADX INFO: renamed from: t */
    private Drawable f16570t;

    /* JADX INFO: renamed from: u */
    private String f16571u;

    /* JADX INFO: renamed from: v */
    private int f16572v;

    /* JADX INFO: renamed from: w */
    private int f16573w;

    /* JADX INFO: renamed from: x */
    private int f16574x;

    /* JADX INFO: renamed from: y */
    private int f16575y;

    /* JADX INFO: renamed from: z */
    private boolean f16576z;

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$a */
    class C4430a extends AbstractC5205i {
        C4430a(String str) {
            super(str);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(MaterialButton materialButton, float f7) {
            materialButton.setDisplayedWidthIncrease(f7);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$b */
    interface InterfaceC4431b {
        /* JADX INFO: renamed from: a */
        void mo19733a(MaterialButton materialButton, boolean z7);
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$c */
    static class C4432c extends AbstractC1446a {
        public static final Parcelable.Creator<C4432c> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        boolean f16577c;

        /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$c$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C4432c createFromParcel(Parcel parcel) {
                return new C4432c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C4432c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4432c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C4432c[] newArray(int i7) {
                return new C4432c[i7];
            }
        }

        public C4432c(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: renamed from: b */
        private void m19734b(Parcel parcel) {
            this.f16577c = parcel.readInt() == 1;
        }

        @Override // p146T.AbstractC1446a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f16577c ? 1 : 0);
        }

        public C4432c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m19734b(parcel);
        }
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19712a(MaterialButton materialButton) {
        materialButton.f16557I = materialButton.getOpticalCenterShift();
        materialButton.m19728s();
        materialButton.invalidate();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m19713b(MaterialButton materialButton, float f7) {
        int i7 = (int) (f7 * 0.11f);
        if (materialButton.f16557I != i7) {
            materialButton.f16557I = i7;
            materialButton.m19728s();
            materialButton.invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    private C5208l m19716e() {
        return AbstractC0196h.m980h(getContext(), AbstractC6742c.f26237V, AbstractC6751l.f26537b);
    }

    /* JADX INFO: renamed from: f */
    private void m19717f() {
        C5207k c5207k = new C5207k(this, f16548U);
        this.f16564P = c5207k;
        c5207k.m24083q(m19716e());
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f16562N;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        C0622i c0622iM19790g;
        if (this.f16556H && this.f16558J && (c0622iM19790g = this.f16565d.m19790g()) != null) {
            return (int) (c0622iM19790g.m2695B() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i7 = 0; i7 < lineCount; i7++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i7));
        }
        return (int) Math.ceil(fMax);
    }

    /* JADX INFO: renamed from: h */
    private boolean m19718h() {
        int i7 = this.f16550B;
        return i7 == 3 || i7 == 4;
    }

    /* JADX INFO: renamed from: i */
    private boolean m19719i() {
        int i7 = this.f16550B;
        return i7 == 1 || i7 == 2;
    }

    /* JADX INFO: renamed from: j */
    private boolean m19720j() {
        int i7 = this.f16550B;
        return i7 == 16 || i7 == 32;
    }

    /* JADX INFO: renamed from: k */
    private boolean m19721k() {
        return (getParent() instanceof AbstractC4438d) && ((AbstractC4438d) getParent()).getOrientation() == 0;
    }

    /* JADX INFO: renamed from: l */
    private boolean m19722l() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: m */
    private boolean m19723m() {
        C4439e c4439e = this.f16565d;
        return (c4439e == null || c4439e.m19798q()) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    private void m19724n(boolean z7) {
        if (this.f16560L == null) {
            return;
        }
        if (this.f16564P == null) {
            m19717f();
        }
        if (this.f16558J) {
            this.f16564P.m24080m(Math.min(this.f16561M, this.f16560L.m2935e(getDrawableState()).f2507a.m2936a(getWidth())));
            if (z7) {
                this.f16564P.m24084r();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private void m19725p() {
        if (m19719i()) {
            setCompoundDrawablesRelative(this.f16570t, null, null, null);
        } else if (m19718h()) {
            setCompoundDrawablesRelative(null, null, this.f16570t, null);
        } else if (m19720j()) {
            setCompoundDrawablesRelative(null, this.f16570t, null, null);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m19726q(boolean z7) {
        Drawable drawable = this.f16570t;
        if (drawable != null) {
            Drawable drawableMutate = AbstractC0400a.m1712r(drawable).mutate();
            this.f16570t = drawableMutate;
            drawableMutate.setTintList(this.f16569s);
            PorterDuff.Mode mode = this.f16568r;
            if (mode != null) {
                this.f16570t.setTintMode(mode);
            }
            int intrinsicWidth = this.f16572v;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f16570t.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f16572v;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f16570t.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f16570t;
            int i7 = this.f16573w;
            int i8 = this.f16574x;
            drawable2.setBounds(i7, i8, intrinsicWidth + i7, intrinsicHeight + i8);
            this.f16570t.setVisible(true, z7);
        }
        if (z7) {
            m19725p();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!m19719i() || drawable3 == this.f16570t) && ((!m19718h() || drawable5 == this.f16570t) && (!m19720j() || drawable4 == this.f16570t))) {
            return;
        }
        m19725p();
    }

    /* JADX INFO: renamed from: r */
    private void m19727r(int i7, int i8) {
        if (this.f16570t == null || getLayout() == null) {
            return;
        }
        if (!m19719i() && !m19718h()) {
            if (m19720j()) {
                this.f16573w = 0;
                if (this.f16550B == 16) {
                    this.f16574x = 0;
                    m19726q(false);
                    return;
                }
                int intrinsicHeight = this.f16572v;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f16570t.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i8 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f16575y) - getPaddingBottom()) / 2);
                if (this.f16574x != iMax) {
                    this.f16574x = iMax;
                    m19726q(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f16574x = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i9 = this.f16550B;
        if (i9 == 1 || i9 == 3 || ((i9 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i9 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f16573w = 0;
            m19726q(false);
            return;
        }
        int intrinsicWidth = this.f16572v;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f16570t.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i7 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f16575y) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (m19722l() != (this.f16550B == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f16573w != textLayoutWidth) {
            this.f16573w = textLayoutWidth;
            m19726q(false);
        }
    }

    /* JADX INFO: renamed from: s */
    private void m19728s() {
        int i7 = (int) (this.f16562N - this.f16563O);
        int i8 = (i7 / 2) + this.f16557I;
        getLayoutParams().width = (int) (this.f16552D + i7);
        setPaddingRelative(this.f16553E + i8, getPaddingTop(), (this.f16554F + i7) - i8, getPaddingBottom());
    }

    private void setCheckedInternal(boolean z7) {
        if (!m19729g() || this.f16576z == z7) {
            return;
        }
        this.f16576z = z7;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).m19749w(this, this.f16576z);
        }
        if (this.f16549A) {
            return;
        }
        this.f16549A = true;
        Iterator it = this.f16566e.iterator();
        if (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            throw null;
        }
        this.f16549A = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f7) {
        if (this.f16562N != f7) {
            this.f16562N = f7;
            m19728s();
            invalidate();
            if (getParent() instanceof AbstractC4438d) {
                ((AbstractC4438d) getParent()).m19764k(this, (int) this.f16562N);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m19729g() {
        C4439e c4439e = this.f16565d;
        return c4439e != null && c4439e.m19799r();
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f16571u)) {
            return (m19729g() ? CompoundButton.class : Button.class).getName();
        }
        return this.f16571u;
    }

    int getAllowedWidthDecrease() {
        return this.f16559K;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m19723m()) {
            return this.f16565d.m19785b();
        }
        return 0;
    }

    public C5208l getCornerSpringForce() {
        return this.f16565d.m19786c();
    }

    public Drawable getIcon() {
        return this.f16570t;
    }

    public int getIconGravity() {
        return this.f16550B;
    }

    public int getIconPadding() {
        return this.f16575y;
    }

    public int getIconSize() {
        return this.f16572v;
    }

    public ColorStateList getIconTint() {
        return this.f16569s;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f16568r;
    }

    public int getInsetBottom() {
        return this.f16565d.m19787d();
    }

    public int getInsetTop() {
        return this.f16565d.m19788e();
    }

    public ColorStateList getRippleColor() {
        if (m19723m()) {
            return this.f16565d.m19791i();
        }
        return null;
    }

    public C0627n getShapeAppearanceModel() {
        if (m19723m()) {
            return this.f16565d.m19792j();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public C0635v getStateListShapeAppearanceModel() {
        if (m19723m()) {
            return this.f16565d.m19793k();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m19723m()) {
            return this.f16565d.m19794l();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m19723m()) {
            return this.f16565d.m19795m();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return m19723m() ? this.f16565d.m19796n() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m19723m() ? this.f16565d.m19797o() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f16576z;
    }

    /* JADX INFO: renamed from: o */
    void m19730o() {
        LinearLayout.LayoutParams layoutParams = this.f16555G;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.f16555G = null;
            this.f16552D = -1.0f;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m19723m()) {
            AbstractC0623j.m2751f(this, this.f16565d.m19790g());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (m19729g()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16544Q);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16545R);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m19729g());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int i11;
        super.onLayout(z7, i7, i8, i9, i10);
        m19727r(getMeasuredWidth(), getMeasuredHeight());
        int i12 = getResources().getConfiguration().orientation;
        if (this.f16551C != i12) {
            this.f16551C = i12;
            this.f16552D = -1.0f;
        }
        if (this.f16552D == -1.0f) {
            this.f16552D = getMeasuredWidth();
            if (this.f16555G == null && (getParent() instanceof AbstractC4438d) && ((AbstractC4438d) getParent()).getButtonSizeChange() != null) {
                this.f16555G = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f16555G);
                layoutParams.width = (int) this.f16552D;
                setLayoutParams(layoutParams);
            }
        }
        if (this.f16559K == -1) {
            if (this.f16570t == null) {
                i11 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f16572v;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f16570t.getIntrinsicWidth();
                }
                i11 = iconPadding + intrinsicWidth;
            }
            this.f16559K = (getMeasuredWidth() - getTextLayoutWidth()) - i11;
        }
        if (this.f16553E == -1) {
            this.f16553E = getPaddingStart();
        }
        if (this.f16554F == -1) {
            this.f16554F = getPaddingEnd();
        }
        this.f16558J = m19721k();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4432c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4432c c4432c = (C4432c) parcelable;
        super.onRestoreInstanceState(c4432c.m6085a());
        setChecked(c4432c.f16577c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        C4432c c4432c = new C4432c(super.onSaveInstanceState());
        c4432c.f16577c = this.f16576z;
        return c4432c;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        m19727r(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.f16565d.m19800s()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f16570t != null) {
            if (this.f16570t.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f16571u = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (m19723m()) {
            this.f16565d.m19802u(i7);
        } else {
            super.setBackgroundColor(i7);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m19723m()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f16565d.m19803v();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i7) {
        setBackgroundDrawable(i7 != 0 ? AbstractC5659a.m25175b(getContext(), i7) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z7) {
        if (m19723m()) {
            this.f16565d.m19804w(z7);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z7) {
        setCheckedInternal(z7);
    }

    public void setCornerRadius(int i7) {
        if (m19723m()) {
            this.f16565d.m19805x(i7);
        }
    }

    public void setCornerRadiusResource(int i7) {
        if (m19723m()) {
            setCornerRadius(getResources().getDimensionPixelSize(i7));
        }
    }

    public void setCornerSpringForce(C5208l c5208l) {
        this.f16565d.m19807z(c5208l);
    }

    void setDisplayedWidthDecrease(int i7) {
        this.f16563O = Math.min(i7, this.f16559K);
        m19728s();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        if (m19723m()) {
            this.f16565d.m19790g().m2717f0(f7);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f16570t != drawable) {
            this.f16570t = drawable;
            m19726q(true);
            m19727r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i7) {
        if (this.f16550B != i7) {
            this.f16550B = i7;
            m19727r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i7) {
        if (this.f16575y != i7) {
            this.f16575y = i7;
            setCompoundDrawablePadding(i7);
        }
    }

    public void setIconResource(int i7) {
        setIcon(i7 != 0 ? AbstractC5659a.m25175b(getContext(), i7) : null);
    }

    public void setIconSize(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f16572v != i7) {
            this.f16572v = i7;
            m19726q(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f16569s != colorStateList) {
            this.f16569s = colorStateList;
            m19726q(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f16568r != mode) {
            this.f16568r = mode;
            m19726q(false);
        }
    }

    public void setIconTintResource(int i7) {
        setIconTint(AbstractC5659a.m25174a(getContext(), i7));
    }

    public void setInsetBottom(int i7) {
        this.f16565d.m19774A(i7);
    }

    public void setInsetTop(int i7) {
        this.f16565d.m19775B(i7);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(InterfaceC4431b interfaceC4431b) {
        this.f16567f = interfaceC4431b;
    }

    public void setOpticalCenterEnabled(boolean z7) {
        if (this.f16556H != z7) {
            this.f16556H = z7;
            if (z7) {
                this.f16565d.m19806y(new C0622i.d() { // from class: com.google.android.material.button.a
                    @Override // p069I3.C0622i.d
                    /* JADX INFO: renamed from: a */
                    public final void mo2741a(float f7) {
                        MaterialButton.m19713b(this.f16586a, f7);
                    }
                });
            } else {
                this.f16565d.m19806y(null);
            }
            post(new Runnable() { // from class: com.google.android.material.button.b
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialButton.m19712a(this.f16587a);
                }
            });
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z7) {
        InterfaceC4431b interfaceC4431b = this.f16567f;
        if (interfaceC4431b != null) {
            interfaceC4431b.mo19733a(this, z7);
        }
        super.setPressed(z7);
        m19724n(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m19723m()) {
            this.f16565d.m19776C(colorStateList);
        }
    }

    public void setRippleColorResource(int i7) {
        if (m19723m()) {
            setRippleColor(AbstractC5659a.m25174a(getContext(), i7));
        }
    }

    @Override // p069I3.InterfaceC0630q
    public void setShapeAppearanceModel(C0627n c0627n) {
        if (!m19723m()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f16565d.m19777D(c0627n);
    }

    void setShouldDrawSurfaceColorStroke(boolean z7) {
        if (m19723m()) {
            this.f16565d.m19778E(z7);
        }
    }

    void setSizeChange(C0636w c0636w) {
        if (this.f16560L != c0636w) {
            this.f16560L = c0636w;
            m19724n(true);
        }
    }

    public void setStateListShapeAppearanceModel(C0635v c0635v) {
        if (!m19723m()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        if (this.f16565d.m19786c() == null && c0635v.m2912f()) {
            this.f16565d.m19807z(m19716e());
        }
        this.f16565d.m19779F(c0635v);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m19723m()) {
            this.f16565d.m19780G(colorStateList);
        }
    }

    public void setStrokeColorResource(int i7) {
        if (m19723m()) {
            setStrokeColor(AbstractC5659a.m25174a(getContext(), i7));
        }
    }

    public void setStrokeWidth(int i7) {
        if (m19723m()) {
            this.f16565d.m19781H(i7);
        }
    }

    public void setStrokeWidthResource(int i7) {
        if (m19723m()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i7));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m19723m()) {
            this.f16565d.m19782I(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m19723m()) {
            this.f16565d.m19783J(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i7) {
        super.setTextAlignment(i7);
        m19727r(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z7) {
        this.f16565d.m19784K(z7);
    }

    @Override // android.widget.TextView
    public void setWidth(int i7) {
        this.f16552D = -1.0f;
        super.setWidth(i7);
    }

    void setWidthChangeMax(int i7) {
        if (this.f16561M != i7) {
            this.f16561M = i7;
            m19724n(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f16576z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26283w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i7) {
        C0627n c0627nM2802m;
        int i8 = f16546S;
        super(AbstractC0842a.m3885e(context, attributeSet, i7, i8, new int[]{f16547T}), attributeSet, i7);
        this.f16566e = new LinkedHashSet();
        this.f16576z = false;
        this.f16549A = false;
        this.f16551C = -1;
        this.f16552D = -1.0f;
        this.f16553E = -1;
        this.f16554F = -1;
        this.f16559K = -1;
        Context context2 = getContext();
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context2, attributeSet, AbstractC6752m.f26848a3, i7, i8, new int[0]);
        this.f16575y = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f27002o3, 0);
        this.f16568r = AbstractC4546v.m20835j(typedArrayM20818i.getInt(AbstractC6752m.f27035r3, -1), PorterDuff.Mode.SRC_IN);
        this.f16569s = AbstractC0423c.m1825a(getContext(), typedArrayM20818i, AbstractC6752m.f27024q3);
        this.f16570t = AbstractC0423c.m1828d(getContext(), typedArrayM20818i, AbstractC6752m.f26980m3);
        this.f16550B = typedArrayM20818i.getInteger(AbstractC6752m.f26991n3, 1);
        this.f16572v = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f27013p3, 0);
        C0635v c0635vM2906b = C0635v.m2906b(context2, typedArrayM20818i, AbstractC6752m.f27068u3);
        if (c0635vM2906b != null) {
            c0627nM2802m = c0635vM2906b.m2910c(true);
        } else {
            c0627nM2802m = C0627n.m2758e(context2, attributeSet, i7, i8).m2802m();
        }
        boolean z7 = typedArrayM20818i.getBoolean(AbstractC6752m.f27046s3, false);
        C4439e c4439e = new C4439e(this, c0627nM2802m);
        this.f16565d = c4439e;
        c4439e.m19801t(typedArrayM20818i);
        setCheckedInternal(typedArrayM20818i.getBoolean(AbstractC6752m.f26870c3, false));
        if (c0635vM2906b != null) {
            c4439e.m19807z(m19716e());
            c4439e.m19779F(c0635vM2906b);
        }
        setOpticalCenterEnabled(z7);
        typedArrayM20818i.recycle();
        setCompoundDrawablePadding(this.f16575y);
        m19726q(this.f16570t != null);
    }
}
