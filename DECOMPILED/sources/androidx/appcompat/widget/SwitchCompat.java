package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.AbstractC2458i;
import androidx.emoji2.text.C2558f;
import com.google.android.gms.internal.ads.zzbbn;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p041F.AbstractC0400a;
import p111O.AbstractC1030Z;
import p255h.AbstractC5520a;
import p255h.AbstractC5527h;
import p255h.AbstractC5529j;
import p263i.AbstractC5659a;
import p287l.C6131a;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: g0 */
    private static final Property f8021g0 = new C2322a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: h0 */
    private static final int[] f8022h0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    private CharSequence f8023A;

    /* JADX INFO: renamed from: B */
    private CharSequence f8024B;

    /* JADX INFO: renamed from: C */
    private CharSequence f8025C;

    /* JADX INFO: renamed from: D */
    private boolean f8026D;

    /* JADX INFO: renamed from: E */
    private int f8027E;

    /* JADX INFO: renamed from: F */
    private int f8028F;

    /* JADX INFO: renamed from: G */
    private float f8029G;

    /* JADX INFO: renamed from: H */
    private float f8030H;

    /* JADX INFO: renamed from: I */
    private VelocityTracker f8031I;

    /* JADX INFO: renamed from: J */
    private int f8032J;

    /* JADX INFO: renamed from: K */
    float f8033K;

    /* JADX INFO: renamed from: L */
    private int f8034L;

    /* JADX INFO: renamed from: M */
    private int f8035M;

    /* JADX INFO: renamed from: N */
    private int f8036N;

    /* JADX INFO: renamed from: O */
    private int f8037O;

    /* JADX INFO: renamed from: P */
    private int f8038P;

    /* JADX INFO: renamed from: Q */
    private int f8039Q;

    /* JADX INFO: renamed from: R */
    private int f8040R;

    /* JADX INFO: renamed from: S */
    private boolean f8041S;

    /* JADX INFO: renamed from: T */
    private final TextPaint f8042T;

    /* JADX INFO: renamed from: U */
    private ColorStateList f8043U;

    /* JADX INFO: renamed from: V */
    private Layout f8044V;

    /* JADX INFO: renamed from: W */
    private Layout f8045W;

    /* JADX INFO: renamed from: a */
    private Drawable f8046a;

    /* JADX INFO: renamed from: a0 */
    private TransformationMethod f8047a0;

    /* JADX INFO: renamed from: b */
    private ColorStateList f8048b;

    /* JADX INFO: renamed from: b0 */
    ObjectAnimator f8049b0;

    /* JADX INFO: renamed from: c */
    private PorterDuff.Mode f8050c;

    /* JADX INFO: renamed from: c0 */
    private final C2289A f8051c0;

    /* JADX INFO: renamed from: d */
    private boolean f8052d;

    /* JADX INFO: renamed from: d0 */
    private C2364m f8053d0;

    /* JADX INFO: renamed from: e */
    private boolean f8054e;

    /* JADX INFO: renamed from: e0 */
    private C2323b f8055e0;

    /* JADX INFO: renamed from: f */
    private Drawable f8056f;

    /* JADX INFO: renamed from: f0 */
    private final Rect f8057f0;

    /* JADX INFO: renamed from: r */
    private ColorStateList f8058r;

    /* JADX INFO: renamed from: s */
    private PorterDuff.Mode f8059s;

    /* JADX INFO: renamed from: t */
    private boolean f8060t;

    /* JADX INFO: renamed from: u */
    private boolean f8061u;

    /* JADX INFO: renamed from: v */
    private int f8062v;

    /* JADX INFO: renamed from: w */
    private int f8063w;

    /* JADX INFO: renamed from: x */
    private int f8064x;

    /* JADX INFO: renamed from: y */
    private boolean f8065y;

    /* JADX INFO: renamed from: z */
    private CharSequence f8066z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.SwitchCompat$a */
    class C2322a extends Property {
        C2322a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f8033K);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f7) {
            switchCompat.setThumbPosition(f7.floatValue());
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SwitchCompat$b */
    static class C2323b extends C2558f.f {

        /* JADX INFO: renamed from: a */
        private final Reference f8067a;

        C2323b(SwitchCompat switchCompat) {
            this.f8067a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.C2558f.f
        /* JADX INFO: renamed from: a */
        public void mo9883a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.f8067a.get();
            if (switchCompat != null) {
                switchCompat.m9878j();
            }
        }

        @Override // androidx.emoji2.text.C2558f.f
        /* JADX INFO: renamed from: b */
        public void mo9884b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f8067a.get();
            if (switchCompat != null) {
                switchCompat.m9878j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20959J);
    }

    /* JADX INFO: renamed from: a */
    private void m9864a(boolean z7) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f8021g0, z7 ? 1.0f : 0.0f);
        this.f8049b0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f8049b0.setAutoCancel(true);
        this.f8049b0.start();
    }

    /* JADX INFO: renamed from: b */
    private void m9865b() {
        Drawable drawable = this.f8046a;
        if (drawable != null) {
            if (this.f8052d || this.f8054e) {
                Drawable drawableMutate = AbstractC0400a.m1712r(drawable).mutate();
                this.f8046a = drawableMutate;
                if (this.f8052d) {
                    AbstractC0400a.m1709o(drawableMutate, this.f8048b);
                }
                if (this.f8054e) {
                    AbstractC0400a.m1710p(this.f8046a, this.f8050c);
                }
                if (this.f8046a.isStateful()) {
                    this.f8046a.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m9866c() {
        Drawable drawable = this.f8056f;
        if (drawable != null) {
            if (this.f8060t || this.f8061u) {
                Drawable drawableMutate = AbstractC0400a.m1712r(drawable).mutate();
                this.f8056f = drawableMutate;
                if (this.f8060t) {
                    AbstractC0400a.m1709o(drawableMutate, this.f8058r);
                }
                if (this.f8061u) {
                    AbstractC0400a.m1710p(this.f8056f, this.f8059s);
                }
                if (this.f8056f.isStateful()) {
                    this.f8056f.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m9867d() {
        ObjectAnimator objectAnimator = this.f8049b0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m9868e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: f */
    private static float m9869f(float f7, float f8, float f9) {
        if (f7 < f8) {
            return f8;
        }
        return f7 > f9 ? f9 : f7;
    }

    /* JADX INFO: renamed from: g */
    private CharSequence m9870g(CharSequence charSequence) {
        TransformationMethod transformationMethodM10125f = getEmojiTextViewHelper().m10125f(this.f8047a0);
        return transformationMethodM10125f != null ? transformationMethodM10125f.getTransformation(charSequence, this) : charSequence;
    }

    private C2364m getEmojiTextViewHelper() {
        if (this.f8053d0 == null) {
            this.f8053d0 = new C2364m(this);
        }
        return this.f8053d0;
    }

    private boolean getTargetCheckedState() {
        return this.f8033K > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((AbstractC2362k0.m10112b(this) ? 1.0f - this.f8033K : this.f8033K) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f8056f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f8057f0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f8046a;
        Rect rectM9770d = drawable2 != null ? AbstractC2315M.m9770d(drawable2) : AbstractC2315M.f7923c;
        return ((((this.f8034L - this.f8036N) - rect.left) - rect.right) - rectM9770d.left) - rectM9770d.right;
    }

    /* JADX INFO: renamed from: h */
    private boolean m9871h(float f7, float f8) {
        if (this.f8046a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f8046a.getPadding(this.f8057f0);
        int i7 = this.f8038P;
        int i8 = this.f8028F;
        int i9 = i7 - i8;
        int i10 = (this.f8037O + thumbOffset) - i8;
        int i11 = this.f8036N + i10;
        Rect rect = this.f8057f0;
        return f7 > ((float) i10) && f7 < ((float) (((i11 + rect.left) + rect.right) + i8)) && f8 > ((float) i9) && f8 < ((float) (this.f8040R + i8));
    }

    /* JADX INFO: renamed from: i */
    private Layout m9872i(CharSequence charSequence) {
        TextPaint textPaint = this.f8042T;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* JADX INFO: renamed from: k */
    private void m9873k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f8024B;
            if (string == null) {
                string = getResources().getString(AbstractC5527h.f21097b);
            }
            AbstractC1030Z.m4502x0(this, string);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m9874l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f8066z;
            if (string == null) {
                string = getResources().getString(AbstractC5527h.f21098c);
            }
            AbstractC1030Z.m4502x0(this, string);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m9875o(int i7, int i8) {
        Typeface typeface;
        if (i7 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i7 != 2) {
            typeface = i7 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        m9880n(typeface, i8);
    }

    /* JADX INFO: renamed from: p */
    private void m9876p() {
        if (this.f8055e0 == null && this.f8053d0.m10121b() && C2558f.m11755i()) {
            C2558f c2558fM11751c = C2558f.m11751c();
            int iM11759e = c2558fM11751c.m11759e();
            if (iM11759e == 3 || iM11759e == 0) {
                C2323b c2323b = new C2323b(this);
                this.f8055e0 = c2323b;
                c2558fM11751c.m11768t(c2323b);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m9877q(MotionEvent motionEvent) {
        this.f8027E = 0;
        boolean targetCheckedState = true;
        boolean z7 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z7) {
            this.f8031I.computeCurrentVelocity(zzbbn.zzq.zzf);
            float xVelocity = this.f8031I.getXVelocity();
            if (Math.abs(xVelocity) <= this.f8032J) {
                targetCheckedState = getTargetCheckedState();
            } else if (!AbstractC2362k0.m10112b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        m9868e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f8024B = charSequence;
        this.f8025C = m9870g(charSequence);
        this.f8045W = null;
        if (this.f8026D) {
            m9876p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f8066z = charSequence;
        this.f8023A = m9870g(charSequence);
        this.f8044V = null;
        if (this.f8026D) {
            m9876p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i7;
        int i8;
        Rect rect = this.f8057f0;
        int i9 = this.f8037O;
        int i10 = this.f8038P;
        int i11 = this.f8039Q;
        int i12 = this.f8040R;
        int thumbOffset = getThumbOffset() + i9;
        Drawable drawable = this.f8046a;
        Rect rectM9770d = drawable != null ? AbstractC2315M.m9770d(drawable) : AbstractC2315M.f7923c;
        Drawable drawable2 = this.f8056f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i13 = rect.left;
            thumbOffset += i13;
            if (rectM9770d != null) {
                int i14 = rectM9770d.left;
                if (i14 > i13) {
                    i9 += i14 - i13;
                }
                int i15 = rectM9770d.top;
                int i16 = rect.top;
                i7 = i15 > i16 ? (i15 - i16) + i10 : i10;
                int i17 = rectM9770d.right;
                int i18 = rect.right;
                if (i17 > i18) {
                    i11 -= i17 - i18;
                }
                int i19 = rectM9770d.bottom;
                int i20 = rect.bottom;
                if (i19 > i20) {
                    i8 = i12 - (i19 - i20);
                }
                this.f8056f.setBounds(i9, i7, i11, i8);
            } else {
                i7 = i10;
            }
            i8 = i12;
            this.f8056f.setBounds(i9, i7, i11, i8);
        }
        Drawable drawable3 = this.f8046a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i21 = thumbOffset - rect.left;
            int i22 = thumbOffset + this.f8036N + rect.right;
            this.f8046a.setBounds(i21, i10, i22, i12);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC0400a.m1706l(background, i21, i10, i22, i12);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f7, float f8) {
        super.drawableHotspotChanged(f7, f8);
        Drawable drawable = this.f8046a;
        if (drawable != null) {
            AbstractC0400a.m1705k(drawable, f7, f8);
        }
        Drawable drawable2 = this.f8056f;
        if (drawable2 != null) {
            AbstractC0400a.m1705k(drawable2, f7, f8);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8046a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f8056f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!AbstractC2362k0.m10112b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f8034L;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f8064x : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (AbstractC2362k0.m10112b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f8034L;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f8064x : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC2458i.m10764o(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f8026D;
    }

    public boolean getSplitTrack() {
        return this.f8065y;
    }

    public int getSwitchMinWidth() {
        return this.f8063w;
    }

    public int getSwitchPadding() {
        return this.f8064x;
    }

    public CharSequence getTextOff() {
        return this.f8024B;
    }

    public CharSequence getTextOn() {
        return this.f8066z;
    }

    public Drawable getThumbDrawable() {
        return this.f8046a;
    }

    protected final float getThumbPosition() {
        return this.f8033K;
    }

    public int getThumbTextPadding() {
        return this.f8062v;
    }

    public ColorStateList getThumbTintList() {
        return this.f8048b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f8050c;
    }

    public Drawable getTrackDrawable() {
        return this.f8056f;
    }

    public ColorStateList getTrackTintList() {
        return this.f8058r;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f8059s;
    }

    /* JADX INFO: renamed from: j */
    void m9878j() {
        setTextOnInternal(this.f8066z);
        setTextOffInternal(this.f8024B);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8046a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f8056f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f8049b0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f8049b0.end();
        this.f8049b0 = null;
    }

    /* JADX INFO: renamed from: m */
    public void m9879m(Context context, int i7) {
        C2348d0 c2348d0M10023t = C2348d0.m10023t(context, i7, AbstractC5529j.f21122B2);
        ColorStateList colorStateListM10028c = c2348d0M10023t.m10028c(AbstractC5529j.f21142F2);
        if (colorStateListM10028c != null) {
            this.f8043U = colorStateListM10028c;
        } else {
            this.f8043U = getTextColors();
        }
        int iM10031f = c2348d0M10023t.m10031f(AbstractC5529j.f21127C2, 0);
        if (iM10031f != 0) {
            float f7 = iM10031f;
            if (f7 != this.f8042T.getTextSize()) {
                this.f8042T.setTextSize(f7);
                requestLayout();
            }
        }
        m9875o(c2348d0M10023t.m10036k(AbstractC5529j.f21132D2, -1), c2348d0M10023t.m10036k(AbstractC5529j.f21137E2, -1));
        if (c2348d0M10023t.m10026a(AbstractC5529j.f21188Q2, false)) {
            this.f8047a0 = new C6131a(getContext());
        } else {
            this.f8047a0 = null;
        }
        setTextOnInternal(this.f8066z);
        setTextOffInternal(this.f8024B);
        c2348d0M10023t.m10046x();
    }

    /* JADX INFO: renamed from: n */
    public void m9880n(Typeface typeface, int i7) {
        if (i7 <= 0) {
            this.f8042T.setFakeBoldText(false);
            this.f8042T.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i7) : Typeface.create(typeface, i7);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i8 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i7;
            this.f8042T.setFakeBoldText((i8 & 1) != 0);
            this.f8042T.setTextSkewX((i8 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f8022h0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f8057f0;
        Drawable drawable = this.f8056f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i7 = this.f8038P;
        int i8 = this.f8040R;
        int i9 = i7 + rect.top;
        int i10 = i8 - rect.bottom;
        Drawable drawable2 = this.f8046a;
        if (drawable != null) {
            if (!this.f8065y || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM9770d = AbstractC2315M.m9770d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM9770d.left;
                rect.right -= rectM9770d.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f8044V : this.f8045W;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f8043U;
            if (colorStateList != null) {
                this.f8042T.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f8042T.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i9 + i10) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f8066z : this.f8024B;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int iMax;
        int width;
        int paddingLeft;
        int i11;
        int paddingTop;
        int height;
        super.onLayout(z7, i7, i8, i9, i10);
        int iMax2 = 0;
        if (this.f8046a != null) {
            Rect rect = this.f8057f0;
            Drawable drawable = this.f8056f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM9770d = AbstractC2315M.m9770d(this.f8046a);
            iMax = Math.max(0, rectM9770d.left - rect.left);
            iMax2 = Math.max(0, rectM9770d.right - rect.right);
        } else {
            iMax = 0;
        }
        if (AbstractC2362k0.m10112b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f8034L + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f8034L) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i11 = this.f8035M;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f8035M;
            }
            this.f8037O = paddingLeft;
            this.f8038P = paddingTop;
            this.f8040R = height;
            this.f8039Q = width;
        }
        int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
        i11 = this.f8035M;
        paddingTop = paddingTop2 - (i11 / 2);
        height = i11 + paddingTop;
        this.f8037O = paddingLeft;
        this.f8038P = paddingTop;
        this.f8040R = height;
        this.f8039Q = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f8026D) {
            if (this.f8044V == null) {
                this.f8044V = m9872i(this.f8023A);
            }
            if (this.f8045W == null) {
                this.f8045W = m9872i(this.f8025C);
            }
        }
        Rect rect = this.f8057f0;
        Drawable drawable = this.f8046a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f8046a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f8046a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f8036N = Math.max(this.f8026D ? Math.max(this.f8044V.getWidth(), this.f8045W.getWidth()) + (this.f8062v * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f8056f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f8056f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f8046a;
        if (drawable3 != null) {
            Rect rectM9770d = AbstractC2315M.m9770d(drawable3);
            iMax = Math.max(iMax, rectM9770d.left);
            iMax2 = Math.max(iMax2, rectM9770d.right);
        }
        int iMax3 = this.f8041S ? Math.max(this.f8063w, (this.f8036N * 2) + iMax + iMax2) : this.f8063w;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f8034L = iMax3;
        this.f8035M = iMax4;
        super.onMeasure(i7, i8);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f8066z : this.f8024B;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f7;
        this.f8031I.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            if (isEnabled() && m9871h(x7, y7)) {
                this.f8027E = 1;
                this.f8029G = x7;
                this.f8030H = y7;
            }
        } else if (actionMasked == 1) {
            if (this.f8027E == 2) {
                m9877q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f8027E = 0;
            this.f8031I.clear();
        } else if (actionMasked == 2) {
            int i7 = this.f8027E;
            if (i7 == 1) {
                float x8 = motionEvent.getX();
                float y8 = motionEvent.getY();
                if (Math.abs(x8 - this.f8029G) > this.f8028F || Math.abs(y8 - this.f8030H) > this.f8028F) {
                    this.f8027E = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f8029G = x8;
                    this.f8030H = y8;
                    return true;
                }
            } else if (i7 == 2) {
                float x9 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f8 = x9 - this.f8029G;
                if (thumbScrollRange != 0) {
                    f7 = f8 / thumbScrollRange;
                } else {
                    f7 = f8 > 0.0f ? 1.0f : -1.0f;
                }
                if (AbstractC2362k0.m10112b(this)) {
                    f7 = -f7;
                }
                float fM9869f = m9869f(this.f8033K + f7, 0.0f, 1.0f);
                if (fM9869f != this.f8033K) {
                    this.f8029G = x9;
                    setThumbPosition(fM9869f);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f8027E == 2) {
                m9877q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f8027E = 0;
            this.f8031I.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().m10123d(z7);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z7) {
        super.setChecked(z7);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            m9874l();
        } else {
            m9873k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            m9864a(zIsChecked);
        } else {
            m9867d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC2458i.m10765p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().m10124e(z7);
        setTextOnInternal(this.f8066z);
        setTextOffInternal(this.f8024B);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z7) {
        this.f8041S = z7;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m10120a(inputFilterArr));
    }

    public void setShowText(boolean z7) {
        if (this.f8026D != z7) {
            this.f8026D = z7;
            requestLayout();
            if (z7) {
                m9876p();
            }
        }
    }

    public void setSplitTrack(boolean z7) {
        this.f8065y = z7;
        invalidate();
    }

    public void setSwitchMinWidth(int i7) {
        this.f8063w = i7;
        requestLayout();
    }

    public void setSwitchPadding(int i7) {
        this.f8064x = i7;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f8042T.getTypeface() == null || this.f8042T.getTypeface().equals(typeface)) && (this.f8042T.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f8042T.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        m9873k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            m9874l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8046a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8046a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f7) {
        this.f8033K = f7;
        invalidate();
    }

    public void setThumbResource(int i7) {
        setThumbDrawable(AbstractC5659a.m25175b(getContext(), i7));
    }

    public void setThumbTextPadding(int i7) {
        this.f8062v = i7;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f8048b = colorStateList;
        this.f8052d = true;
        m9865b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f8050c = mode;
        this.f8054e = true;
        m9865b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8056f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8056f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i7) {
        setTrackDrawable(AbstractC5659a.m25175b(getContext(), i7));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f8058r = colorStateList;
        this.f8060t = true;
        m9866c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f8059s = mode;
        this.f8061u = true;
        m9866c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8046a || drawable == this.f8056f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8048b = null;
        this.f8050c = null;
        this.f8052d = false;
        this.f8054e = false;
        this.f8058r = null;
        this.f8059s = null;
        this.f8060t = false;
        this.f8061u = false;
        this.f8031I = VelocityTracker.obtain();
        this.f8041S = true;
        this.f8057f0 = new Rect();
        AbstractC2340Z.m9984a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f8042T = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC5529j.f21288m2;
        C2348d0 c2348d0M10025v = C2348d0.m10025v(context, attributeSet, iArr, i7, 0);
        AbstractC1030Z.m4470h0(this, context, iArr, attributeSet, c2348d0M10025v.m10043r(), i7, 0);
        Drawable drawableM10032g = c2348d0M10025v.m10032g(AbstractC5529j.f21303p2);
        this.f8046a = drawableM10032g;
        if (drawableM10032g != null) {
            drawableM10032g.setCallback(this);
        }
        Drawable drawableM10032g2 = c2348d0M10025v.m10032g(AbstractC5529j.f21348y2);
        this.f8056f = drawableM10032g2;
        if (drawableM10032g2 != null) {
            drawableM10032g2.setCallback(this);
        }
        setTextOnInternal(c2348d0M10025v.m10041p(AbstractC5529j.f21293n2));
        setTextOffInternal(c2348d0M10025v.m10041p(AbstractC5529j.f21298o2));
        this.f8026D = c2348d0M10025v.m10026a(AbstractC5529j.f21308q2, true);
        this.f8062v = c2348d0M10025v.m10031f(AbstractC5529j.f21333v2, 0);
        this.f8063w = c2348d0M10025v.m10031f(AbstractC5529j.f21318s2, 0);
        this.f8064x = c2348d0M10025v.m10031f(AbstractC5529j.f21323t2, 0);
        this.f8065y = c2348d0M10025v.m10026a(AbstractC5529j.f21313r2, false);
        ColorStateList colorStateListM10028c = c2348d0M10025v.m10028c(AbstractC5529j.f21338w2);
        if (colorStateListM10028c != null) {
            this.f8048b = colorStateListM10028c;
            this.f8052d = true;
        }
        PorterDuff.Mode modeM9771e = AbstractC2315M.m9771e(c2348d0M10025v.m10036k(AbstractC5529j.f21343x2, -1), null);
        if (this.f8050c != modeM9771e) {
            this.f8050c = modeM9771e;
            this.f8054e = true;
        }
        if (this.f8052d || this.f8054e) {
            m9865b();
        }
        ColorStateList colorStateListM10028c2 = c2348d0M10025v.m10028c(AbstractC5529j.f21353z2);
        if (colorStateListM10028c2 != null) {
            this.f8058r = colorStateListM10028c2;
            this.f8060t = true;
        }
        PorterDuff.Mode modeM9771e2 = AbstractC2315M.m9771e(c2348d0M10025v.m10036k(AbstractC5529j.f21117A2, -1), null);
        if (this.f8059s != modeM9771e2) {
            this.f8059s = modeM9771e2;
            this.f8061u = true;
        }
        if (this.f8060t || this.f8061u) {
            m9866c();
        }
        int iM10039n = c2348d0M10025v.m10039n(AbstractC5529j.f21328u2, 0);
        if (iM10039n != 0) {
            m9879m(context, iM10039n);
        }
        C2289A c2289a = new C2289A(this);
        this.f8051c0 = c2289a;
        c2289a.m9608m(attributeSet, i7);
        c2348d0M10025v.m10046x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8028F = viewConfiguration.getScaledTouchSlop();
        this.f8032J = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m10122c(attributeSet, i7);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
