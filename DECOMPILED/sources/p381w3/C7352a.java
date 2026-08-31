package p381w3;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.app.AbstractC2263x;
import androidx.appcompat.widget.C2348d0;
import androidx.appcompat.widget.C2351f;
import androidx.core.widget.AbstractC2452c;
import androidx.vectordrawable.graphics.drawable.AbstractC2860b;
import androidx.vectordrawable.graphics.drawable.C2861c;
import com.google.android.material.drawable.AbstractC4498d;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.AbstractC4546v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p045F3.AbstractC0423c;
import p093L3.AbstractC0842a;
import p255h.AbstractC5520a;
import p263i.AbstractC5659a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6745f;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6750k;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: w3.a */
/* JADX INFO: loaded from: classes2.dex */
public class C7352a extends C2351f {

    /* JADX INFO: renamed from: J */
    private static final int f29275J = AbstractC6751l.f26559x;

    /* JADX INFO: renamed from: K */
    private static final int[] f29276K = {AbstractC6742c.f26259i0};

    /* JADX INFO: renamed from: L */
    private static final int[] f29277L;

    /* JADX INFO: renamed from: M */
    private static final int[][] f29278M;

    /* JADX INFO: renamed from: N */
    private static final int f29279N;

    /* JADX INFO: renamed from: A */
    ColorStateList f29280A;

    /* JADX INFO: renamed from: B */
    private PorterDuff.Mode f29281B;

    /* JADX INFO: renamed from: C */
    private int f29282C;

    /* JADX INFO: renamed from: D */
    private int[] f29283D;

    /* JADX INFO: renamed from: E */
    private boolean f29284E;

    /* JADX INFO: renamed from: F */
    private CharSequence f29285F;

    /* JADX INFO: renamed from: G */
    private CompoundButton.OnCheckedChangeListener f29286G;

    /* JADX INFO: renamed from: H */
    private final C2861c f29287H;

    /* JADX INFO: renamed from: I */
    private final AbstractC2860b f29288I;

    /* JADX INFO: renamed from: e */
    private final LinkedHashSet f29289e;

    /* JADX INFO: renamed from: f */
    private final LinkedHashSet f29290f;

    /* JADX INFO: renamed from: r */
    private ColorStateList f29291r;

    /* JADX INFO: renamed from: s */
    private boolean f29292s;

    /* JADX INFO: renamed from: t */
    private boolean f29293t;

    /* JADX INFO: renamed from: u */
    private boolean f29294u;

    /* JADX INFO: renamed from: v */
    private CharSequence f29295v;

    /* JADX INFO: renamed from: w */
    private Drawable f29296w;

    /* JADX INFO: renamed from: x */
    private Drawable f29297x;

    /* JADX INFO: renamed from: y */
    private boolean f29298y;

    /* JADX INFO: renamed from: z */
    ColorStateList f29299z;

    /* JADX INFO: renamed from: w3.a$a */
    class a extends AbstractC2860b {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC2860b
        /* JADX INFO: renamed from: b */
        public void mo14226b(Drawable drawable) {
            super.mo14226b(drawable);
            ColorStateList colorStateList = C7352a.this.f29299z;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC2860b
        /* JADX INFO: renamed from: c */
        public void mo14227c(Drawable drawable) {
            super.mo14227c(drawable);
            C7352a c7352a = C7352a.this;
            ColorStateList colorStateList = c7352a.f29299z;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(c7352a.f29283D, C7352a.this.f29299z.getDefaultColor()));
            }
        }
    }

    /* JADX INFO: renamed from: w3.a$b */
    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        int f29301a;

        /* JADX INFO: renamed from: w3.a$b$a */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i7) {
                return new b[i7];
            }
        }

        /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        /* JADX INFO: renamed from: a */
        private String m32376a() {
            int i7 = this.f29301a;
            if (i7 != 1) {
                return i7 != 2 ? "unchecked" : "indeterminate";
            }
            return "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + m32376a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeValue(Integer.valueOf(this.f29301a));
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f29301a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i7 = AbstractC6742c.f26257h0;
        f29277L = new int[]{i7};
        f29278M = new int[][]{new int[]{R.attr.state_enabled, i7}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f29279N = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public C7352a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20977o);
    }

    /* JADX INFO: renamed from: c */
    private boolean m32370c(C2348d0 c2348d0) {
        return c2348d0.m10039n(AbstractC6752m.f27036r4, 0) == f29279N && c2348d0.m10039n(AbstractC6752m.f27047s4, 0) == 0;
    }

    /* JADX INFO: renamed from: e */
    private void m32371e() {
        this.f29296w = AbstractC4498d.m20432d(this.f29296w, this.f29299z, AbstractC2452c.m10720c(this));
        this.f29297x = AbstractC4498d.m20432d(this.f29297x, this.f29280A, this.f29281B);
        m32373g();
        m32374h();
        super.setButtonDrawable(AbstractC4498d.m20429a(this.f29296w, this.f29297x));
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: f */
    private void m32372f() {
        if (Build.VERSION.SDK_INT < 30 || this.f29285F != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    /* JADX INFO: renamed from: g */
    private void m32373g() {
        C2861c c2861c;
        if (this.f29298y) {
            C2861c c2861c2 = this.f29287H;
            if (c2861c2 != null) {
                c2861c2.m14234f(this.f29288I);
                this.f29287H.m14233b(this.f29288I);
            }
            Drawable drawable = this.f29296w;
            if (!(drawable instanceof AnimatedStateListDrawable) || (c2861c = this.f29287H) == null) {
                return;
            }
            int i7 = AbstractC6746g.f26419b;
            int i8 = AbstractC6746g.f26417Y;
            ((AnimatedStateListDrawable) drawable).addTransition(i7, i8, c2861c, false);
            ((AnimatedStateListDrawable) this.f29296w).addTransition(AbstractC6746g.f26427j, i8, this.f29287H, false);
        }
    }

    private String getButtonStateDescription() {
        int i7 = this.f29282C;
        if (i7 == 1) {
            return getResources().getString(AbstractC6750k.f26514n);
        }
        return i7 == 0 ? getResources().getString(AbstractC6750k.f26516p) : getResources().getString(AbstractC6750k.f26515o);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f29291r == null) {
            int[][] iArr = f29278M;
            int[] iArr2 = new int[iArr.length];
            int iM33173d = AbstractC7539a.m33173d(this, AbstractC5520a.f20981s);
            int iM33173d2 = AbstractC7539a.m33173d(this, AbstractC5520a.f20984v);
            int iM33173d3 = AbstractC7539a.m33173d(this, AbstractC6742c.f26262k);
            int iM33173d4 = AbstractC7539a.m33173d(this, AbstractC6742c.f26256h);
            iArr2[0] = AbstractC7539a.m33179j(iM33173d3, iM33173d2, 1.0f);
            iArr2[1] = AbstractC7539a.m33179j(iM33173d3, iM33173d, 1.0f);
            iArr2[2] = AbstractC7539a.m33179j(iM33173d3, iM33173d4, 0.54f);
            iArr2[3] = AbstractC7539a.m33179j(iM33173d3, iM33173d4, 0.38f);
            iArr2[4] = AbstractC7539a.m33179j(iM33173d3, iM33173d4, 0.38f);
            this.f29291r = new ColorStateList(iArr, iArr2);
        }
        return this.f29291r;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f29299z;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX INFO: renamed from: h */
    private void m32374h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f29296w;
        if (drawable != null && (colorStateList2 = this.f29299z) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.f29297x;
        if (drawable2 == null || (colorStateList = this.f29280A) == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public boolean m32375d() {
        return this.f29294u;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f29296w;
    }

    public Drawable getButtonIconDrawable() {
        return this.f29297x;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f29280A;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f29281B;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f29299z;
    }

    public int getCheckedState() {
        return this.f29282C;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f29295v;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f29282C == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29292s && this.f29299z == null && this.f29280A == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f29276K);
        }
        if (m32375d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f29277L);
        }
        this.f29283D = AbstractC4498d.m20434f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableM10718a;
        if (!this.f29293t || !TextUtils.isEmpty(getText()) || (drawableM10718a = AbstractC2452c.m10718a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM10718a.getIntrinsicWidth()) / 2) * (AbstractC4546v.m20834i(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM10718a.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && m32375d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f29295v));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f29301a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f29301a = getCheckedState();
        return bVar;
    }

    @Override // androidx.appcompat.widget.C2351f, android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(AbstractC5659a.m25175b(getContext(), i7));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f29297x = drawable;
        m32371e();
    }

    public void setButtonIconDrawableResource(int i7) {
        setButtonIconDrawable(AbstractC5659a.m25175b(getContext(), i7));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f29280A == colorStateList) {
            return;
        }
        this.f29280A = colorStateList;
        m32371e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f29281B == mode) {
            return;
        }
        this.f29281B = mode;
        m32371e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f29299z == colorStateList) {
            return;
        }
        this.f29299z = colorStateList;
        m32371e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m32371e();
    }

    public void setCenterIfNoTextEnabled(boolean z7) {
        this.f29293t = z7;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z7) {
        setCheckedState(z7 ? 1 : 0);
    }

    public void setCheckedState(int i7) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f29282C != i7) {
            this.f29282C = i7;
            super.setChecked(i7 == 1);
            refreshDrawableState();
            m32372f();
            if (this.f29284E) {
                return;
            }
            this.f29284E = true;
            LinkedHashSet linkedHashSet = this.f29290f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    AbstractC2263x.m9328a(it.next());
                    throw null;
                }
            }
            if (this.f29282C != 2 && (onCheckedChangeListener = this.f29286G) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f29284E = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f29295v = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i7) {
        setErrorAccessibilityLabel(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setErrorShown(boolean z7) {
        if (this.f29294u == z7) {
            return;
        }
        this.f29294u = z7;
        refreshDrawableState();
        Iterator it = this.f29289e.iterator();
        if (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f29286G = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f29285F = charSequence;
        if (charSequence == null) {
            m32372f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z7) {
        this.f29292s = z7;
        if (z7) {
            AbstractC2452c.m10721d(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC2452c.m10721d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7352a(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f29275J;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        this.f29289e = new LinkedHashSet();
        this.f29290f = new LinkedHashSet();
        this.f29287H = C2861c.m14228a(getContext(), AbstractC6745f.f26388e);
        this.f29288I = new a();
        Context context2 = getContext();
        this.f29296w = AbstractC2452c.m10718a(this);
        this.f29299z = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C2348d0 c2348d0M20819j = AbstractC4543s.m20819j(context2, attributeSet, AbstractC6752m.f27025q4, i7, i8, new int[0]);
        this.f29297x = c2348d0M20819j.m10032g(AbstractC6752m.f27058t4);
        if (this.f29296w != null && AbstractC4543s.m20816g(context2) && m32370c(c2348d0M20819j)) {
            super.setButtonDrawable((Drawable) null);
            this.f29296w = AbstractC5659a.m25175b(context2, AbstractC6745f.f26387d);
            this.f29298y = true;
            if (this.f29297x == null) {
                this.f29297x = AbstractC5659a.m25175b(context2, AbstractC6745f.f26389f);
            }
        }
        this.f29280A = AbstractC0423c.m1826b(context2, c2348d0M20819j, AbstractC6752m.f27069u4);
        this.f29281B = AbstractC4546v.m20835j(c2348d0M20819j.m10036k(AbstractC6752m.f27080v4, -1), PorterDuff.Mode.SRC_IN);
        this.f29292s = c2348d0M20819j.m10026a(AbstractC6752m.f26567A4, false);
        this.f29293t = c2348d0M20819j.m10026a(AbstractC6752m.f27091w4, true);
        this.f29294u = c2348d0M20819j.m10026a(AbstractC6752m.f27124z4, false);
        this.f29295v = c2348d0M20819j.m10041p(AbstractC6752m.f27113y4);
        int i9 = AbstractC6752m.f27102x4;
        if (c2348d0M20819j.m10044s(i9)) {
            setCheckedState(c2348d0M20819j.m10036k(i9, 0));
        }
        c2348d0M20819j.m10046x();
        m32371e();
    }

    @Override // androidx.appcompat.widget.C2351f, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f29296w = drawable;
        this.f29298y = false;
        m32371e();
    }
}
