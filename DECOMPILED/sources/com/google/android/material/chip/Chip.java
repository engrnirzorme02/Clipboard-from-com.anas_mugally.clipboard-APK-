package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C2351f;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.InterfaceC4533i;
import java.util.List;
import p045F3.AbstractC0422b;
import p045F3.AbstractC0426f;
import p045F3.C0424d;
import p053G3.AbstractC0481a;
import p069I3.AbstractC0623j;
import p069I3.C0627n;
import p069I3.InterfaceC0630q;
import p093L3.AbstractC0842a;
import p111O.AbstractC1030Z;
import p118P.C1170s;
import p153U.AbstractC1648a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6750k;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p333q3.C6831f;

/* JADX INFO: loaded from: classes2.dex */
public class Chip extends C2351f implements C4463a.a, InterfaceC0630q, InterfaceC4533i {

    /* JADX INFO: renamed from: I */
    private static final int f16734I = AbstractC6751l.f26558w;

    /* JADX INFO: renamed from: J */
    private static final Rect f16735J = new Rect();

    /* JADX INFO: renamed from: K */
    private static final int[] f16736K = {R.attr.state_selected};

    /* JADX INFO: renamed from: L */
    private static final int[] f16737L = {R.attr.state_checkable};

    /* JADX INFO: renamed from: A */
    private int f16738A;

    /* JADX INFO: renamed from: B */
    private int f16739B;

    /* JADX INFO: renamed from: C */
    private CharSequence f16740C;

    /* JADX INFO: renamed from: D */
    private final C4456c f16741D;

    /* JADX INFO: renamed from: E */
    private boolean f16742E;

    /* JADX INFO: renamed from: F */
    private final Rect f16743F;

    /* JADX INFO: renamed from: G */
    private final RectF f16744G;

    /* JADX INFO: renamed from: H */
    private final AbstractC0426f f16745H;

    /* JADX INFO: renamed from: e */
    private C4463a f16746e;

    /* JADX INFO: renamed from: f */
    private InsetDrawable f16747f;

    /* JADX INFO: renamed from: r */
    private RippleDrawable f16748r;

    /* JADX INFO: renamed from: s */
    private View.OnClickListener f16749s;

    /* JADX INFO: renamed from: t */
    private CompoundButton.OnCheckedChangeListener f16750t;

    /* JADX INFO: renamed from: u */
    private InterfaceC4533i.a f16751u;

    /* JADX INFO: renamed from: v */
    private boolean f16752v;

    /* JADX INFO: renamed from: w */
    private boolean f16753w;

    /* JADX INFO: renamed from: x */
    private boolean f16754x;

    /* JADX INFO: renamed from: y */
    private boolean f16755y;

    /* JADX INFO: renamed from: z */
    private boolean f16756z;

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$a */
    class C4454a extends AbstractC0426f {
        C4454a() {
        }

        @Override // p045F3.AbstractC0426f
        /* JADX INFO: renamed from: a */
        public void mo1813a(int i7) {
        }

        @Override // p045F3.AbstractC0426f
        /* JADX INFO: renamed from: b */
        public void mo1814b(Typeface typeface, boolean z7) {
            Chip chip = Chip.this;
            chip.setText(chip.f16746e.m20164c3() ? Chip.this.f16746e.m20200w1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$b */
    class C4455b extends ViewOutlineProvider {
        C4455b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f16746e != null) {
                Chip.this.f16746e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$c */
    private class C4456c extends AbstractC1648a {
        C4456c(Chip chip) {
            super(chip);
        }

        @Override // p153U.AbstractC1648a
        /* JADX INFO: renamed from: B */
        protected int mo6802B(float f7, float f8) {
            return (Chip.this.m20044n() && Chip.this.getCloseIconTouchBounds().contains(f7, f8)) ? 1 : 0;
        }

        @Override // p153U.AbstractC1648a
        /* JADX INFO: renamed from: C */
        protected void mo6803C(List list) {
            list.add(0);
            if (Chip.this.m20044n() && Chip.this.m20056s() && Chip.this.f16749s != null) {
                list.add(1);
            }
        }

        @Override // p153U.AbstractC1648a
        /* JADX INFO: renamed from: L */
        protected boolean mo6808L(int i7, int i8, Bundle bundle) {
            if (i8 != 16) {
                return false;
            }
            if (i7 == 0) {
                return Chip.this.performClick();
            }
            if (i7 == 1) {
                return Chip.this.m20057t();
            }
            return false;
        }

        @Override // p153U.AbstractC1648a
        /* JADX INFO: renamed from: O */
        protected void mo6811O(C1170s c1170s) {
            c1170s.m5065k0(Chip.this.m20055r());
            c1170s.m5071n0(Chip.this.isClickable());
            c1170s.m5069m0(Chip.this.getAccessibilityClassName());
            c1170s.m5035N0(Chip.this.getText());
        }

        @Override // p153U.AbstractC1648a
        /* JADX INFO: renamed from: P */
        protected void mo6812P(int i7, C1170s c1170s) {
            if (i7 != 1) {
                c1170s.m5076q0("");
                c1170s.m5062i0(Chip.f16735J);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                c1170s.m5076q0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                c1170s.m5076q0(Chip.this.getContext().getString(AbstractC6750k.f26517q, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            c1170s.m5062i0(Chip.this.getCloseIconTouchBoundsInt());
            c1170s.m5052b(C1170s.a.f4113i);
            c1170s.m5079s0(Chip.this.isEnabled());
            c1170s.m5069m0(Button.class.getName());
        }

        @Override // p153U.AbstractC1648a
        /* JADX INFO: renamed from: Q */
        protected void mo6813Q(int i7, boolean z7) {
            if (i7 == 1) {
                Chip.this.f16755y = z7;
            }
            if (Chip.this.f16746e.m20122M1(Chip.this.f16755y)) {
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26252f);
    }

    /* JADX INFO: renamed from: A */
    private void m20030A() {
        C4463a c4463a;
        if (TextUtils.isEmpty(getText()) || (c4463a = this.f16746e) == null) {
            return;
        }
        int iM20150Y0 = (int) (c4463a.m20150Y0() + this.f16746e.m20204y1() + this.f16746e.m20111F0());
        int iM20165d1 = (int) (this.f16746e.m20165d1() + this.f16746e.m20206z1() + this.f16746e.m20103B0());
        if (this.f16747f != null) {
            Rect rect = new Rect();
            this.f16747f.getPadding(rect);
            iM20165d1 += rect.left;
            iM20150Y0 += rect.right;
        }
        setPaddingRelative(iM20165d1, getPaddingTop(), iM20150Y0, getPaddingBottom());
    }

    /* JADX INFO: renamed from: B */
    private void m20031B() {
        TextPaint paint = getPaint();
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            paint.drawableState = c4463a.getState();
        }
        C0424d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m1849p(getContext(), paint, this.f16745H);
        }
    }

    /* JADX INFO: renamed from: C */
    private void m20032C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m20033b(Chip chip, CompoundButton compoundButton, boolean z7) {
        InterfaceC4533i.a aVar = chip.f16751u;
        if (aVar != null) {
            aVar.mo20620a(chip, z7);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f16750t;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f16744G.setEmpty();
        if (m20044n() && this.f16749s != null) {
            this.f16746e.m20185n1(this.f16744G);
        }
        return this.f16744G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f16743F.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f16743F;
    }

    private C0424d getTextAppearance() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20202x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private void m20042k(C4463a c4463a) {
        c4463a.m20113F2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX INFO: renamed from: l */
    private int[] m20043l() {
        ?? IsEnabled = isEnabled();
        int i7 = IsEnabled;
        if (this.f16755y) {
            i7 = IsEnabled + 1;
        }
        int i8 = i7;
        if (this.f16754x) {
            i8 = i7 + 1;
        }
        int i9 = i8;
        if (this.f16753w) {
            i9 = i8 + 1;
        }
        int i10 = i9;
        if (isChecked()) {
            i10 = i9 + 1;
        }
        int[] iArr = new int[i10];
        int i11 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i11 = 1;
        }
        if (this.f16755y) {
            iArr[i11] = 16842908;
            i11++;
        }
        if (this.f16754x) {
            iArr[i11] = 16843623;
            i11++;
        }
        if (this.f16753w) {
            iArr[i11] = 16842919;
            i11++;
        }
        if (isChecked()) {
            iArr[i11] = 16842913;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public boolean m20044n() {
        C4463a c4463a = this.f16746e;
        return (c4463a == null || c4463a.m20171g1() == null) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    private void m20045o(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context, attributeSet, AbstractC6752m.f26684L0, i7, f16734I, new int[0]);
        this.f16756z = typedArrayM20818i.getBoolean(AbstractC6752m.f27033r1, false);
        this.f16739B = (int) Math.ceil(typedArrayM20818i.getDimension(AbstractC6752m.f26901f1, AbstractC0422b.m1821e(context)));
        typedArrayM20818i.recycle();
    }

    /* JADX INFO: renamed from: p */
    private void m20046p() {
        setOutlineProvider(new C4455b());
    }

    /* JADX INFO: renamed from: q */
    private void m20047q(int i7, int i8, int i9, int i10) {
        this.f16747f = new InsetDrawable((Drawable) this.f16746e, i7, i8, i9, i10);
    }

    private void setCloseIconHovered(boolean z7) {
        if (this.f16754x != z7) {
            this.f16754x = z7;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z7) {
        if (this.f16753w != z7) {
            this.f16753w = z7;
            refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: u */
    private void m20048u() {
        if (this.f16747f != null) {
            this.f16747f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m20051y();
        }
    }

    /* JADX INFO: renamed from: w */
    private void m20049w(C4463a c4463a) {
        if (c4463a != null) {
            c4463a.m20113F2(null);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m20050x() {
        if (m20044n() && m20056s() && this.f16749s != null) {
            AbstractC1030Z.m4474j0(this, this.f16741D);
            this.f16742E = true;
        } else {
            AbstractC1030Z.m4474j0(this, null);
            this.f16742E = false;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m20051y() {
        m20052z();
    }

    /* JADX INFO: renamed from: z */
    private void m20052z() {
        this.f16748r = new RippleDrawable(AbstractC0481a.m2065d(this.f16746e.m20196u1()), getBackgroundDrawable(), null);
        this.f16746e.m20161b3(false);
        setBackground(this.f16748r);
        m20030A();
    }

    @Override // com.google.android.material.chip.C4463a.a
    /* JADX INFO: renamed from: a */
    public void mo20053a() {
        m20054m(this.f16739B);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f16742E) {
            return this.f16741D.m6818v(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f16742E) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f16741D.m6819w(keyEvent) || this.f16741D.m6801A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.C2351f, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C4463a c4463a = this.f16746e;
        if ((c4463a == null || !c4463a.m20109E1()) ? false : this.f16746e.m20105B2(m20043l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f16740C)) {
            return this.f16740C;
        }
        if (!m20055r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).m20064i()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f16747f;
        return insetDrawable == null ? this.f16746e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20138U0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20141V0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20144W0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return Math.max(0.0f, c4463a.m20147X0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f16746e;
    }

    public float getChipEndPadding() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20150Y0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20153Z0();
        }
        return null;
    }

    public float getChipIconSize() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20156a1();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20159b1();
        }
        return null;
    }

    public float getChipMinHeight() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20162c1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20165d1();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20167e1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20169f1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20171g1();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20173h1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20175i1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20177j1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20179k1();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20183m1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20189q1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f16742E && (this.f16741D.m6801A() == 1 || this.f16741D.m6820x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C6831f getHideMotionSpec() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20191r1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20192s1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20194t1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20196u1();
        }
        return null;
    }

    public C0627n getShapeAppearanceModel() {
        return this.f16746e.m2703J();
    }

    public C6831f getShowMotionSpec() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20198v1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20204y1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            return c4463a.m20206z1();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m20054m(int i7) {
        this.f16739B = i7;
        if (!m20058v()) {
            if (this.f16747f != null) {
                m20048u();
            } else {
                m20051y();
            }
            return false;
        }
        int iMax = Math.max(0, i7 - this.f16746e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i7 - this.f16746e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f16747f != null) {
                m20048u();
            } else {
                m20051y();
            }
            return false;
        }
        int i8 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i9 = iMax > 0 ? iMax / 2 : 0;
        if (this.f16747f != null) {
            Rect rect = new Rect();
            this.f16747f.getPadding(rect);
            if (rect.top == i9 && rect.bottom == i9 && rect.left == i8 && rect.right == i8) {
                m20051y();
                return true;
            }
        }
        if (getMinHeight() != i7) {
            setMinHeight(i7);
        }
        if (getMinWidth() != i7) {
            setMinWidth(i7);
        }
        m20047q(i8, i9, i8, i9);
        m20051y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0623j.m2751f(this, this.f16746e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16736K);
        }
        if (m20055r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16737L);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z7, int i7, Rect rect) {
        super.onFocusChanged(z7, i7, rect);
        if (this.f16742E) {
            this.f16741D.m6807K(z7, i7, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m20055r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C1170s.m4998R0(accessibilityNodeInfo).m5074p0(C1170s.g.m5112a(chipGroup.m20705b(this), 1, chipGroup.mo20062c() ? chipGroup.m20063g(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i7) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i7);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        if (this.f16738A != i7) {
            this.f16738A = i7;
            m20030A();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f16753w) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z7 = true;
                }
                z7 = false;
            } else {
                if (this.f16753w) {
                    m20057t();
                    z7 = true;
                }
                setCloseIconPressed(false);
            }
            z7 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z7 = true;
        } else {
            z7 = false;
        }
        return z7 || super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: r */
    public boolean m20055r() {
        C4463a c4463a = this.f16746e;
        return c4463a != null && c4463a.m20107D1();
    }

    /* JADX INFO: renamed from: s */
    public boolean m20056s() {
        C4463a c4463a = this.f16746e;
        return c4463a != null && c4463a.m20112F1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f16740C = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f16748r) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C2351f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f16748r) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C2351f, android.view.View
    public void setBackgroundResource(int i7) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20124N1(z7);
        }
    }

    public void setCheckableResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20126O1(i7);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z7) {
        C4463a c4463a = this.f16746e;
        if (c4463a == null) {
            this.f16752v = z7;
        } else if (c4463a.m20107D1()) {
            super.setChecked(z7);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20128P1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z7) {
        setCheckedIconVisible(z7);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i7) {
        setCheckedIconVisible(i7);
    }

    public void setCheckedIconResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20130Q1(i7);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20132R1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20134S1(i7);
        }
    }

    public void setCheckedIconVisible(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20136T1(i7);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20142V1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20145W1(i7);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20148X1(f7);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20151Y1(i7);
        }
    }

    public void setChipDrawable(C4463a c4463a) {
        C4463a c4463a2 = this.f16746e;
        if (c4463a2 != c4463a) {
            m20049w(c4463a2);
            this.f16746e = c4463a;
            c4463a.m20131Q2(false);
            m20042k(this.f16746e);
            m20054m(this.f16739B);
        }
    }

    public void setChipEndPadding(float f7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20154Z1(f7);
        }
    }

    public void setChipEndPaddingResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20157a2(i7);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20160b2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z7) {
        setChipIconVisible(z7);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i7) {
        setChipIconVisible(i7);
    }

    public void setChipIconResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20163c2(i7);
        }
    }

    public void setChipIconSize(float f7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20166d2(f7);
        }
    }

    public void setChipIconSizeResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20168e2(i7);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20170f2(colorStateList);
        }
    }

    public void setChipIconTintResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20172g2(i7);
        }
    }

    public void setChipIconVisible(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20174h2(i7);
        }
    }

    public void setChipMinHeight(float f7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20178j2(f7);
        }
    }

    public void setChipMinHeightResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20180k2(i7);
        }
    }

    public void setChipStartPadding(float f7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20182l2(f7);
        }
    }

    public void setChipStartPaddingResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20184m2(i7);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20186n2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20187o2(i7);
        }
    }

    public void setChipStrokeWidth(float f7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20188p2(f7);
        }
    }

    public void setChipStrokeWidthResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20190q2(i7);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i7) {
        setText(getResources().getString(i7));
    }

    public void setCloseIcon(Drawable drawable) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20193s2(drawable);
        }
        m20050x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20195t2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z7) {
        setCloseIconVisible(z7);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i7) {
        setCloseIconVisible(i7);
    }

    public void setCloseIconEndPadding(float f7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20197u2(f7);
        }
    }

    public void setCloseIconEndPaddingResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20199v2(i7);
        }
    }

    public void setCloseIconResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20201w2(i7);
        }
        m20050x();
    }

    public void setCloseIconSize(float f7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20203x2(f7);
        }
    }

    public void setCloseIconSizeResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20205y2(i7);
        }
    }

    public void setCloseIconStartPadding(float f7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20207z2(f7);
        }
    }

    public void setCloseIconStartPaddingResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20102A2(i7);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20106C2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20108D2(i7);
        }
    }

    public void setCloseIconVisible(int i7) {
        setCloseIconVisible(getResources().getBoolean(i7));
    }

    @Override // androidx.appcompat.widget.C2351f, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.C2351f, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i7, i8, i9, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i7, i8, i9, i10);
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m2717f0(f7);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f16746e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20114G2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z7) {
        this.f16756z = z7;
        m20054m(this.f16739B);
    }

    @Override // android.widget.TextView
    public void setGravity(int i7) {
        if (i7 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i7);
        }
    }

    public void setHideMotionSpec(C6831f c6831f) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20115H2(c6831f);
        }
    }

    public void setHideMotionSpecResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20117I2(i7);
        }
    }

    public void setIconEndPadding(float f7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20118J2(f7);
        }
    }

    public void setIconEndPaddingResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20120K2(i7);
        }
    }

    public void setIconStartPadding(float f7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20121L2(f7);
        }
    }

    public void setIconStartPaddingResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20123M2(i7);
        }
    }

    @Override // com.google.android.material.internal.InterfaceC4533i
    public void setInternalOnCheckedChangeListener(InterfaceC4533i.a aVar) {
        this.f16751u = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i7) {
        if (this.f16746e == null) {
            return;
        }
        super.setLayoutDirection(i7);
    }

    @Override // android.widget.TextView
    public void setLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i7);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i7);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i7) {
        super.setMaxWidth(i7);
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20125N2(i7);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i7);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f16750t = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f16749s = onClickListener;
        m20050x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20127O2(colorStateList);
        }
        if (this.f16746e.m20104B1()) {
            return;
        }
        m20052z();
    }

    public void setRippleColorResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20129P2(i7);
            if (this.f16746e.m20104B1()) {
                return;
            }
            m20052z();
        }
    }

    @Override // p069I3.InterfaceC0630q
    public void setShapeAppearanceModel(C0627n c0627n) {
        this.f16746e.setShapeAppearanceModel(c0627n);
    }

    public void setShowMotionSpec(C6831f c6831f) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20133R2(c6831f);
        }
    }

    public void setShowMotionSpecResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20135S2(i7);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z7) {
        if (!z7) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z7);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C4463a c4463a = this.f16746e;
        if (c4463a == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c4463a.m20164c3() ? null : charSequence, bufferType);
        C4463a c4463a2 = this.f16746e;
        if (c4463a2 != null) {
            c4463a2.m20137T2(charSequence);
        }
    }

    public void setTextAppearance(C0424d c0424d) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20140U2(c0424d);
        }
        m20031B();
    }

    public void setTextAppearanceResource(int i7) {
        setTextAppearance(getContext(), i7);
    }

    public void setTextEndPadding(float f7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20146W2(f7);
        }
    }

    public void setTextEndPaddingResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20149X2(i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i7, float f7) {
        super.setTextSize(i7, f7);
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20152Y2(TypedValue.applyDimension(i7, f7, getResources().getDisplayMetrics()));
        }
        m20031B();
    }

    public void setTextStartPadding(float f7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20155Z2(f7);
        }
    }

    public void setTextStartPaddingResource(int i7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20158a3(i7);
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m20057t() {
        boolean z7 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f16749s;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z7 = true;
        }
        if (this.f16742E) {
            this.f16741D.m6816W(1, 1);
        }
        return z7;
    }

    /* JADX INFO: renamed from: v */
    public boolean m20058v() {
        return this.f16756z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f16734I;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        this.f16743F = new Rect();
        this.f16744G = new RectF();
        this.f16745H = new C4454a();
        Context context2 = getContext();
        m20032C(attributeSet);
        C4463a c4463aM20081K0 = C4463a.m20081K0(context2, attributeSet, i7, i8);
        m20045o(context2, attributeSet, i7);
        setChipDrawable(c4463aM20081K0);
        c4463aM20081K0.m2717f0(getElevation());
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context2, attributeSet, AbstractC6752m.f26684L0, i7, i8, new int[0]);
        boolean zHasValue = typedArrayM20818i.hasValue(AbstractC6752m.f27088w1);
        typedArrayM20818i.recycle();
        this.f16741D = new C4456c(this);
        m20050x();
        if (!zHasValue) {
            m20046p();
        }
        setChecked(this.f16752v);
        setText(c4463aM20081K0.m20200w1());
        setEllipsize(c4463aM20081K0.m20189q1());
        m20031B();
        if (!this.f16746e.m20164c3()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m20030A();
        if (m20058v()) {
            setMinHeight(this.f16739B);
        }
        this.f16738A = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: x3.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                Chip.m20033b(this.f29653a, compoundButton, z7);
            }
        });
    }

    public void setCloseIconVisible(boolean z7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20110E2(z7);
        }
        m20050x();
    }

    public void setCheckedIconVisible(boolean z7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20139U1(z7);
        }
    }

    public void setChipIconVisible(boolean z7) {
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20176i2(z7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20143V2(i7);
        }
        m20031B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i7) {
        super.setTextAppearance(i7);
        C4463a c4463a = this.f16746e;
        if (c4463a != null) {
            c4463a.m20143V2(i7);
        }
        m20031B();
    }
}
