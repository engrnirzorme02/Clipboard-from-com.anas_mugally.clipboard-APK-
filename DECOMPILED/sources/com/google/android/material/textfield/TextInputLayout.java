package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AbstractC2315M;
import androidx.appcompat.widget.C2303B;
import androidx.appcompat.widget.C2348d0;
import androidx.appcompat.widget.C2359j;
import androidx.core.content.AbstractC2436b;
import androidx.core.widget.AbstractC2458i;
import androidx.transition.AbstractC2850r;
import androidx.transition.C2835c;
import com.google.android.material.internal.AbstractC4528d;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.AbstractC4546v;
import com.google.android.material.internal.C4526b;
import com.google.android.material.internal.C4539o;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.InterfaceC4540p;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p029D3.AbstractC0196h;
import p041F.AbstractC0400a;
import p045F3.AbstractC0423c;
import p069I3.C0622i;
import p069I3.C0627n;
import p093L3.AbstractC0842a;
import p097M.C0857a;
import p111O.AbstractC1030Z;
import p111O.C1032a;
import p118P.C1170s;
import p146T.AbstractC1446a;
import p255h.AbstractC5520a;
import p255h.AbstractC5528i;
import p263i.AbstractC5659a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6743d;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6750k;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p333q3.AbstractC6826a;
import p397y3.AbstractC7539a;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: O0 */
    private static final int f17914O0 = AbstractC6751l.f26549n;

    /* JADX INFO: renamed from: P0 */
    private static final int[][] f17915P0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A */
    private TextView f17916A;

    /* JADX INFO: renamed from: A0 */
    private int f17917A0;

    /* JADX INFO: renamed from: B */
    private int f17918B;

    /* JADX INFO: renamed from: B0 */
    private int f17919B0;

    /* JADX INFO: renamed from: C */
    private int f17920C;

    /* JADX INFO: renamed from: C0 */
    private int f17921C0;

    /* JADX INFO: renamed from: D */
    private CharSequence f17922D;

    /* JADX INFO: renamed from: D0 */
    private int f17923D0;

    /* JADX INFO: renamed from: E */
    private boolean f17924E;

    /* JADX INFO: renamed from: E0 */
    private int f17925E0;

    /* JADX INFO: renamed from: F */
    private TextView f17926F;

    /* JADX INFO: renamed from: F0 */
    int f17927F0;

    /* JADX INFO: renamed from: G */
    private ColorStateList f17928G;

    /* JADX INFO: renamed from: G0 */
    private boolean f17929G0;

    /* JADX INFO: renamed from: H */
    private int f17930H;

    /* JADX INFO: renamed from: H0 */
    final C4526b f17931H0;

    /* JADX INFO: renamed from: I */
    private C2835c f17932I;

    /* JADX INFO: renamed from: I0 */
    private boolean f17933I0;

    /* JADX INFO: renamed from: J */
    private C2835c f17934J;

    /* JADX INFO: renamed from: J0 */
    private boolean f17935J0;

    /* JADX INFO: renamed from: K */
    private ColorStateList f17936K;

    /* JADX INFO: renamed from: K0 */
    private ValueAnimator f17937K0;

    /* JADX INFO: renamed from: L */
    private ColorStateList f17938L;

    /* JADX INFO: renamed from: L0 */
    private boolean f17939L0;

    /* JADX INFO: renamed from: M */
    private ColorStateList f17940M;

    /* JADX INFO: renamed from: M0 */
    private boolean f17941M0;

    /* JADX INFO: renamed from: N */
    private ColorStateList f17942N;

    /* JADX INFO: renamed from: N0 */
    private boolean f17943N0;

    /* JADX INFO: renamed from: O */
    private boolean f17944O;

    /* JADX INFO: renamed from: P */
    private CharSequence f17945P;

    /* JADX INFO: renamed from: Q */
    private boolean f17946Q;

    /* JADX INFO: renamed from: R */
    private C0622i f17947R;

    /* JADX INFO: renamed from: S */
    private C0622i f17948S;

    /* JADX INFO: renamed from: T */
    private StateListDrawable f17949T;

    /* JADX INFO: renamed from: U */
    private boolean f17950U;

    /* JADX INFO: renamed from: V */
    private C0622i f17951V;

    /* JADX INFO: renamed from: W */
    private C0622i f17952W;

    /* JADX INFO: renamed from: a */
    private final FrameLayout f17953a;

    /* JADX INFO: renamed from: a0 */
    private C0627n f17954a0;

    /* JADX INFO: renamed from: b */
    private final C4658z f17955b;

    /* JADX INFO: renamed from: b0 */
    private boolean f17956b0;

    /* JADX INFO: renamed from: c */
    private final C4650r f17957c;

    /* JADX INFO: renamed from: c0 */
    private final int f17958c0;

    /* JADX INFO: renamed from: d */
    private final int f17959d;

    /* JADX INFO: renamed from: d0 */
    private int f17960d0;

    /* JADX INFO: renamed from: e */
    EditText f17961e;

    /* JADX INFO: renamed from: e0 */
    private int f17962e0;

    /* JADX INFO: renamed from: f */
    private CharSequence f17963f;

    /* JADX INFO: renamed from: f0 */
    private int f17964f0;

    /* JADX INFO: renamed from: g0 */
    private int f17965g0;

    /* JADX INFO: renamed from: h0 */
    private int f17966h0;

    /* JADX INFO: renamed from: i0 */
    private int f17967i0;

    /* JADX INFO: renamed from: j0 */
    private int f17968j0;

    /* JADX INFO: renamed from: k0 */
    private final Rect f17969k0;

    /* JADX INFO: renamed from: l0 */
    private final Rect f17970l0;

    /* JADX INFO: renamed from: m0 */
    private final RectF f17971m0;

    /* JADX INFO: renamed from: n0 */
    private Typeface f17972n0;

    /* JADX INFO: renamed from: o0 */
    private Drawable f17973o0;

    /* JADX INFO: renamed from: p0 */
    private int f17974p0;

    /* JADX INFO: renamed from: q0 */
    private final LinkedHashSet f17975q0;

    /* JADX INFO: renamed from: r */
    private int f17976r;

    /* JADX INFO: renamed from: r0 */
    private Drawable f17977r0;

    /* JADX INFO: renamed from: s */
    private int f17978s;

    /* JADX INFO: renamed from: s0 */
    private int f17979s0;

    /* JADX INFO: renamed from: t */
    private int f17980t;

    /* JADX INFO: renamed from: t0 */
    private Drawable f17981t0;

    /* JADX INFO: renamed from: u */
    private int f17982u;

    /* JADX INFO: renamed from: u0 */
    private ColorStateList f17983u0;

    /* JADX INFO: renamed from: v */
    private final C4653u f17984v;

    /* JADX INFO: renamed from: v0 */
    private ColorStateList f17985v0;

    /* JADX INFO: renamed from: w */
    boolean f17986w;

    /* JADX INFO: renamed from: w0 */
    private int f17987w0;

    /* JADX INFO: renamed from: x */
    private int f17988x;

    /* JADX INFO: renamed from: x0 */
    private int f17989x0;

    /* JADX INFO: renamed from: y */
    private boolean f17990y;

    /* JADX INFO: renamed from: y0 */
    private int f17991y0;

    /* JADX INFO: renamed from: z */
    private InterfaceC4630f f17992z;

    /* JADX INFO: renamed from: z0 */
    private ColorStateList f17993z0;

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C4625a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        int f17994a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ EditText f17995b;

        C4625a(EditText editText) {
            this.f17995b = editText;
            this.f17994a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m21498x0(!textInputLayout.f17941M0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f17986w) {
                textInputLayout2.m21494m0(editable);
            }
            if (TextInputLayout.this.f17924E) {
                TextInputLayout.this.m21420B0(editable);
            }
            int lineCount = this.f17995b.getLineCount();
            int i7 = this.f17994a;
            if (lineCount != i7) {
                if (lineCount < i7) {
                    int minimumHeight = this.f17995b.getMinimumHeight();
                    int i8 = TextInputLayout.this.f17927F0;
                    if (minimumHeight != i8) {
                        this.f17995b.setMinimumHeight(i8);
                    }
                }
                this.f17994a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C4626b extends C1032a {
        C4626b() {
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            c1170s.m5039P0(false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class RunnableC4627c implements Runnable {
        RunnableC4627c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f17957c.m21607h();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$d */
    class C4628d implements ValueAnimator.AnimatorUpdateListener {
        C4628d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f17931H0.m20675j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C4629e extends C1032a {

        /* JADX INFO: renamed from: d */
        private final TextInputLayout f18000d;

        public C4629e(TextInputLayout textInputLayout) {
            this.f18000d = textInputLayout;
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            EditText editText = this.f18000d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f18000d.getHint();
            CharSequence error = this.f18000d.getError();
            CharSequence placeholderText = this.f18000d.getPlaceholderText();
            int counterMaxLength = this.f18000d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f18000d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zM21487R = this.f18000d.m21487R();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z7 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f18000d.f17955b.m21716A(c1170s);
            if (!zIsEmpty) {
                c1170s.m5035N0(text);
            } else if (!TextUtils.isEmpty(string)) {
                c1170s.m5035N0(string);
                if (!zM21487R && placeholderText != null) {
                    c1170s.m5035N0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c1170s.m5035N0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                c1170s.m5088x0(string);
                c1170s.m5027J0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            c1170s.m5092z0(counterMaxLength);
            if (z7) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                c1170s.m5081t0(error);
            }
            View viewM21689t = this.f18000d.f17984v.m21689t();
            if (viewM21689t != null) {
                c1170s.m5090y0(viewM21689t);
            }
            this.f18000d.f17957c.m21614m().mo21553o(view, c1170s);
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: h */
        public void mo4586h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4586h(view, accessibilityEvent);
            this.f18000d.f17957c.m21614m().mo21554p(view, accessibilityEvent);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface InterfaceC4630f {
        /* JADX INFO: renamed from: a */
        int mo21415a(Editable editable);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface InterfaceC4631g {
        /* JADX INFO: renamed from: a */
        void mo21499a(TextInputLayout textInputLayout);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$h */
    static class C4632h extends AbstractC1446a {
        public static final Parcelable.Creator<C4632h> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        CharSequence f18001c;

        /* JADX INFO: renamed from: d */
        boolean f18002d;

        /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C4632h createFromParcel(Parcel parcel) {
                return new C4632h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C4632h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4632h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C4632h[] newArray(int i7) {
                return new C4632h[i7];
            }
        }

        C4632h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f18001c) + "}";
        }

        @Override // p146T.AbstractC1446a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            TextUtils.writeToParcel(this.f18001c, parcel, i7);
            parcel.writeInt(this.f18002d ? 1 : 0);
        }

        C4632h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18001c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f18002d = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: A */
    private void m21417A(boolean z7) {
        ValueAnimator valueAnimator = this.f17937K0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f17937K0.cancel();
        }
        if (z7 && this.f17935J0) {
            m21493m(1.0f);
        } else {
            this.f17931H0.m20675j0(1.0f);
        }
        this.f17929G0 = false;
        if (m21421C()) {
            m21437X();
        }
        m21418A0();
        this.f17955b.m21727l(false);
        this.f17957c.m21582H(false);
    }

    /* JADX INFO: renamed from: A0 */
    private void m21418A0() {
        EditText editText = this.f17961e;
        m21420B0(editText == null ? null : editText.getText());
    }

    /* JADX INFO: renamed from: B */
    private C2835c m21419B() {
        C2835c c2835c = new C2835c();
        c2835c.mo14156Y(AbstractC0196h.m978f(getContext(), AbstractC6742c.f26229N, 87));
        c2835c.mo14159a0(AbstractC0196h.m979g(getContext(), AbstractC6742c.f26235T, AbstractC6826a.f27404a));
        return c2835c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public void m21420B0(Editable editable) {
        if (this.f17992z.mo21415a(editable) != 0 || this.f17929G0) {
            m21432M();
        } else {
            m21452h0();
        }
    }

    /* JADX INFO: renamed from: C */
    private boolean m21421C() {
        return this.f17944O && !TextUtils.isEmpty(this.f17945P) && (this.f17947R instanceof AbstractC4640h);
    }

    /* JADX INFO: renamed from: C0 */
    private void m21422C0(boolean z7, boolean z8) {
        int defaultColor = this.f17993z0.getDefaultColor();
        int colorForState = this.f17993z0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f17993z0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z7) {
            this.f17967i0 = colorForState2;
        } else if (z8) {
            this.f17967i0 = colorForState;
        } else {
            this.f17967i0 = defaultColor;
        }
    }

    /* JADX INFO: renamed from: D */
    private void m21423D() {
        Iterator it = this.f17975q0.iterator();
        while (it.hasNext()) {
            ((InterfaceC4631g) it.next()).mo21499a(this);
        }
    }

    /* JADX INFO: renamed from: E */
    private void m21424E(Canvas canvas) {
        C0622i c0622i;
        if (this.f17952W == null || (c0622i = this.f17951V) == null) {
            return;
        }
        c0622i.draw(canvas);
        if (this.f17961e.isFocused()) {
            Rect bounds = this.f17952W.getBounds();
            Rect bounds2 = this.f17951V.getBounds();
            float fM20655B = this.f17931H0.m20655B();
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC6826a.m29845c(iCenterX, bounds2.left, fM20655B);
            bounds.right = AbstractC6826a.m29845c(iCenterX, bounds2.right, fM20655B);
            this.f17952W.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: F */
    private void m21425F(Canvas canvas) {
        if (this.f17944O) {
            this.f17931H0.m20676k(canvas);
        }
    }

    /* JADX INFO: renamed from: G */
    private void m21426G(boolean z7) {
        ValueAnimator valueAnimator = this.f17937K0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f17937K0.cancel();
        }
        if (z7 && this.f17935J0) {
            m21493m(0.0f);
        } else {
            this.f17931H0.m20675j0(0.0f);
        }
        if (m21421C() && ((AbstractC4640h) this.f17947R).m21526C0()) {
            m21480z();
        }
        this.f17929G0 = true;
        m21432M();
        this.f17955b.m21727l(true);
        this.f17957c.m21582H(true);
    }

    /* JADX INFO: renamed from: H */
    private C0622i m21427H(boolean z7) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(AbstractC6744e.f26365q0);
        float f7 = z7 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f17961e;
        float popupElevation = editText instanceof C4654v ? ((C4654v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(AbstractC6744e.f26378x);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(AbstractC6744e.f26357m0);
        C0627n c0627nM2802m = C0627n.m2754a().m2796D(f7).m2800H(f7).m2810v(dimensionPixelOffset).m2814z(dimensionPixelOffset).m2802m();
        EditText editText2 = this.f17961e;
        C0622i c0622iM2685r = C0622i.m2685r(getContext(), popupElevation, editText2 instanceof C4654v ? ((C4654v) editText2).getDropDownBackgroundTintList() : null);
        c0622iM2685r.setShapeAppearanceModel(c0627nM2802m);
        c0622iM2685r.m2721j0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return c0622iM2685r;
    }

    /* JADX INFO: renamed from: I */
    private static Drawable m21428I(C0622i c0622i, int i7, int i8, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC7539a.m33179j(i8, i7, 0.1f), i7}), c0622i, c0622i);
    }

    /* JADX INFO: renamed from: J */
    private int m21429J(int i7, boolean z7) {
        int compoundPaddingLeft;
        if (z7 || getPrefixText() == null) {
            compoundPaddingLeft = (!z7 || getSuffixText() == null) ? this.f17961e.getCompoundPaddingLeft() : this.f17957c.m21632y();
        } else {
            compoundPaddingLeft = this.f17955b.m21720c();
        }
        return i7 + compoundPaddingLeft;
    }

    /* JADX INFO: renamed from: K */
    private int m21430K(int i7, boolean z7) {
        int compoundPaddingRight;
        if (z7 || getSuffixText() == null) {
            compoundPaddingRight = (!z7 || getPrefixText() == null) ? this.f17961e.getCompoundPaddingRight() : this.f17955b.m21720c();
        } else {
            compoundPaddingRight = this.f17957c.m21632y();
        }
        return i7 - compoundPaddingRight;
    }

    /* JADX INFO: renamed from: L */
    private static Drawable m21431L(Context context, C0622i c0622i, int i7, int[][] iArr) {
        int iM33172c = AbstractC7539a.m33172c(context, AbstractC6742c.f26262k, "TextInputLayout");
        C0622i c0622i2 = new C0622i(c0622i.m2703J());
        int iM33179j = AbstractC7539a.m33179j(i7, iM33172c, 0.1f);
        c0622i2.m2718g0(new ColorStateList(iArr, new int[]{iM33179j, 0}));
        c0622i2.setTint(iM33172c);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM33179j, iM33172c});
        C0622i c0622i3 = new C0622i(c0622i.m2703J());
        c0622i3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0622i2, c0622i3), c0622i});
    }

    /* JADX INFO: renamed from: M */
    private void m21432M() {
        TextView textView = this.f17926F;
        if (textView == null || !this.f17924E) {
            return;
        }
        textView.setText((CharSequence) null);
        AbstractC2850r.m14186a(this.f17953a, this.f17934J);
        this.f17926F.setVisibility(4);
    }

    /* JADX INFO: renamed from: S */
    private boolean m21433S() {
        return getHintMaxLines() == 1;
    }

    /* JADX INFO: renamed from: T */
    private boolean m21434T() {
        if (m21491e0()) {
            return true;
        }
        return this.f17916A != null && this.f17990y;
    }

    /* JADX INFO: renamed from: V */
    private boolean m21435V() {
        return this.f17960d0 == 1 && this.f17961e.getMinLines() <= 1;
    }

    /* JADX INFO: renamed from: W */
    private void m21436W() {
        m21466q();
        m21497t0();
        m21482D0();
        m21454i0();
        m21458l();
        if (this.f17960d0 != 0) {
            m21476w0();
        }
        m21444c0();
    }

    /* JADX INFO: renamed from: X */
    private void m21437X() {
        if (m21421C()) {
            RectF rectF = this.f17971m0;
            this.f17931H0.m20682o(rectF, this.f17961e.getWidth(), this.f17961e.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            m21464p(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f17964f0);
            rectF.top = 0.0f;
            ((AbstractC4640h) this.f17947R).m21529F0(rectF);
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m21438Y() {
        if (!m21421C() || this.f17929G0) {
            return;
        }
        m21480z();
        m21437X();
    }

    /* JADX INFO: renamed from: Z */
    private static void m21439Z(ViewGroup viewGroup, boolean z7) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            childAt.setEnabled(z7);
            if (childAt instanceof ViewGroup) {
                m21439Z((ViewGroup) childAt, z7);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m21442b0() {
        TextView textView = this.f17926F;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m21443c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c0 */
    private void m21444c0() {
        EditText editText = this.f17961e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i7 = this.f17960d0;
                if (i7 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i7 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    private boolean m21448f0() {
        return (this.f17957c.m21581G() || ((this.f17957c.m21578A() && m21484O()) || this.f17957c.m21629w() != null)) && this.f17957c.getMeasuredWidth() > 0;
    }

    /* JADX INFO: renamed from: g0 */
    private boolean m21450g0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f17955b.getMeasuredWidth() > 0;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f17961e;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC4649q.m21556a(editText)) {
            return this.f17947R;
        }
        int iM33173d = AbstractC7539a.m33173d(this.f17961e, AbstractC5520a.f20982t);
        int i7 = this.f17960d0;
        if (i7 == 2) {
            return m21431L(getContext(), this.f17947R, iM33173d, f17915P0);
        }
        if (i7 == 1) {
            return m21428I(this.f17947R, this.f17968j0, iM33173d, f17915P0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f17949T == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f17949T = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f17949T.addState(new int[0], m21427H(false));
        }
        return this.f17949T;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f17948S == null) {
            this.f17948S = m21427H(true);
        }
        return this.f17948S;
    }

    /* JADX INFO: renamed from: h0 */
    private void m21452h0() {
        if (this.f17926F == null || !this.f17924E || TextUtils.isEmpty(this.f17922D)) {
            return;
        }
        this.f17926F.setText(this.f17922D);
        AbstractC2850r.m14186a(this.f17953a, this.f17932I);
        this.f17926F.setVisibility(0);
        this.f17926F.bringToFront();
    }

    /* JADX INFO: renamed from: i0 */
    private void m21454i0() {
        if (this.f17960d0 == 1) {
            if (AbstractC0423c.m1833i(getContext())) {
                this.f17962e0 = getResources().getDimensionPixelSize(AbstractC6744e.f26317L);
            } else if (AbstractC0423c.m1832h(getContext())) {
                this.f17962e0 = getResources().getDimensionPixelSize(AbstractC6744e.f26316K);
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    private void m21455j0(Rect rect) {
        C0622i c0622i = this.f17951V;
        if (c0622i != null) {
            int i7 = rect.bottom;
            c0622i.setBounds(rect.left, i7 - this.f17965g0, rect.right, i7);
        }
        C0622i c0622i2 = this.f17952W;
        if (c0622i2 != null) {
            int i8 = rect.bottom;
            c0622i2.setBounds(rect.left, i8 - this.f17966h0, rect.right, i8);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m21456k() {
        TextView textView = this.f17926F;
        if (textView != null) {
            this.f17953a.addView(textView);
            this.f17926F.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: k0 */
    private void m21457k0(int i7) {
        this.f17931H0.m20687s0(i7);
        Rect rect = this.f17969k0;
        AbstractC4528d.m20694a(this, this.f17961e, rect);
        this.f17931H0.m20662S(m21468s(rect));
        m21476w0();
        m21458l();
        m21472u0(i7);
    }

    /* JADX INFO: renamed from: l */
    private void m21458l() {
        if (this.f17961e == null || this.f17960d0 != 1) {
            return;
        }
        if (!m21433S()) {
            EditText editText = this.f17961e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f17931H0.m20686q() + this.f17959d), this.f17961e.getPaddingEnd(), getResources().getDimensionPixelSize(AbstractC6744e.f26312G));
        } else if (AbstractC0423c.m1833i(getContext())) {
            EditText editText2 = this.f17961e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(AbstractC6744e.f26315J), this.f17961e.getPaddingEnd(), getResources().getDimensionPixelSize(AbstractC6744e.f26314I));
        } else if (AbstractC0423c.m1832h(getContext())) {
            EditText editText3 = this.f17961e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(AbstractC6744e.f26313H), this.f17961e.getPaddingEnd(), getResources().getDimensionPixelSize(AbstractC6744e.f26312G));
        }
    }

    /* JADX INFO: renamed from: l0 */
    private void m21459l0() {
        if (this.f17916A != null) {
            EditText editText = this.f17961e;
            m21494m0(editText == null ? null : editText.getText());
        }
    }

    /* JADX INFO: renamed from: n */
    private void m21460n() {
        C0622i c0622i = this.f17947R;
        if (c0622i == null) {
            return;
        }
        C0627n c0627nM2703J = c0622i.m2703J();
        C0627n c0627n = this.f17954a0;
        if (c0627nM2703J != c0627n) {
            this.f17947R.setShapeAppearanceModel(c0627n);
        }
        if (m21477x()) {
            this.f17947R.m2728p0(this.f17964f0, this.f17967i0);
        }
        int iM21467r = m21467r();
        this.f17968j0 = iM21467r;
        this.f17947R.m2718g0(ColorStateList.valueOf(iM21467r));
        m21462o();
        m21497t0();
    }

    /* JADX INFO: renamed from: n0 */
    private static void m21461n0(Context context, TextView textView, int i7, int i8, boolean z7) {
        textView.setContentDescription(context.getString(z7 ? AbstractC6750k.f26503c : AbstractC6750k.f26502b, Integer.valueOf(i7), Integer.valueOf(i8)));
    }

    /* JADX INFO: renamed from: o */
    private void m21462o() {
        if (this.f17951V == null || this.f17952W == null) {
            return;
        }
        if (m21478y()) {
            this.f17951V.m2718g0(this.f17961e.isFocused() ? ColorStateList.valueOf(this.f17987w0) : ColorStateList.valueOf(this.f17967i0));
            this.f17952W.m2718g0(ColorStateList.valueOf(this.f17967i0));
        }
        invalidate();
    }

    /* JADX INFO: renamed from: o0 */
    private void m21463o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f17916A;
        if (textView != null) {
            m21490d0(textView, this.f17990y ? this.f17918B : this.f17920C);
            if (!this.f17990y && (colorStateList2 = this.f17936K) != null) {
                this.f17916A.setTextColor(colorStateList2);
            }
            if (!this.f17990y || (colorStateList = this.f17938L) == null) {
                return;
            }
            this.f17916A.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m21464p(RectF rectF) {
        float f7 = rectF.left;
        int i7 = this.f17958c0;
        rectF.left = f7 - i7;
        rectF.right += i7;
    }

    /* JADX INFO: renamed from: p0 */
    private void m21465p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListM33176g = this.f17940M;
        if (colorStateListM33176g == null) {
            colorStateListM33176g = AbstractC7539a.m33176g(getContext(), AbstractC5520a.f20981s);
        }
        EditText editText = this.f17961e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = AbstractC0400a.m1712r(this.f17961e.getTextCursorDrawable()).mutate();
        if (m21434T() && (colorStateList = this.f17942N) != null) {
            colorStateListM33176g = colorStateList;
        }
        drawableMutate.setTintList(colorStateListM33176g);
    }

    /* JADX INFO: renamed from: q */
    private void m21466q() {
        int i7 = this.f17960d0;
        if (i7 == 0) {
            this.f17947R = null;
            this.f17951V = null;
            this.f17952W = null;
            return;
        }
        if (i7 == 1) {
            this.f17947R = new C0622i(this.f17954a0);
            this.f17951V = new C0622i();
            this.f17952W = new C0622i();
        } else {
            if (i7 != 2) {
                throw new IllegalArgumentException(this.f17960d0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f17944O || (this.f17947R instanceof AbstractC4640h)) {
                this.f17947R = new C0622i(this.f17954a0);
            } else {
                this.f17947R = AbstractC4640h.m21523A0(this.f17954a0);
            }
            this.f17951V = null;
            this.f17952W = null;
        }
    }

    /* JADX INFO: renamed from: r */
    private int m21467r() {
        return this.f17960d0 == 1 ? AbstractC7539a.m33178i(AbstractC7539a.m33174e(this, AbstractC6742c.f26262k, 0), this.f17968j0) : this.f17968j0;
    }

    /* JADX INFO: renamed from: s */
    private Rect m21468s(Rect rect) {
        if (this.f17961e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f17970l0;
        boolean zM20834i = AbstractC4546v.m20834i(this);
        rect2.bottom = rect.bottom;
        int i7 = this.f17960d0;
        if (i7 == 1) {
            rect2.left = m21429J(rect.left, zM20834i);
            rect2.top = rect.top + this.f17962e0;
            rect2.right = m21430K(rect.right, zM20834i);
            return rect2;
        }
        if (i7 != 2) {
            rect2.left = m21429J(rect.left, zM20834i);
            rect2.top = getPaddingTop();
            rect2.right = m21430K(rect.right, zM20834i);
            return rect2;
        }
        rect2.left = rect.left + this.f17961e.getPaddingLeft();
        rect2.top = rect.top - m21475w();
        rect2.right = rect.right - this.f17961e.getPaddingRight();
        return rect2;
    }

    /* JADX INFO: renamed from: s0 */
    private void m21469s0() {
        this.f17961e.setBackground(getEditTextBoxBackground());
    }

    private void setEditText(EditText editText) {
        if (this.f17961e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f17961e = editText;
        int i7 = this.f17976r;
        if (i7 != -1) {
            setMinEms(i7);
        } else {
            setMinWidth(this.f17980t);
        }
        int i8 = this.f17978s;
        if (i8 != -1) {
            setMaxEms(i8);
        } else {
            setMaxWidth(this.f17982u);
        }
        this.f17950U = false;
        m21436W();
        setTextInputAccessibilityDelegate(new C4629e(this));
        this.f17931H0.m20685p0(this.f17961e.getTypeface());
        this.f17931H0.m20674h0(this.f17961e.getTextSize());
        this.f17931H0.m20671d0(this.f17961e.getLetterSpacing());
        int gravity = this.f17961e.getGravity();
        this.f17931H0.m20666X((gravity & (-113)) | 48);
        this.f17931H0.m20673g0(gravity);
        this.f17927F0 = editText.getMinimumHeight();
        this.f17961e.addTextChangedListener(new C4625a(editText));
        if (this.f17983u0 == null) {
            this.f17983u0 = this.f17961e.getHintTextColors();
        }
        if (this.f17944O) {
            if (TextUtils.isEmpty(this.f17945P)) {
                CharSequence hint = this.f17961e.getHint();
                this.f17963f = hint;
                setHint(hint);
                this.f17961e.setHint((CharSequence) null);
            }
            this.f17946Q = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m21465p0();
        }
        if (this.f17916A != null) {
            m21494m0(this.f17961e.getText());
        }
        m21496r0();
        this.f17984v.m21680f();
        this.f17955b.bringToFront();
        this.f17957c.bringToFront();
        m21423D();
        this.f17957c.m21631x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m21479y0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f17945P)) {
            return;
        }
        this.f17945P = charSequence;
        this.f17931H0.m20681n0(charSequence);
        if (this.f17929G0) {
            return;
        }
        m21437X();
    }

    private void setPlaceholderTextEnabled(boolean z7) {
        if (this.f17924E == z7) {
            return;
        }
        if (z7) {
            m21456k();
        } else {
            m21442b0();
            this.f17926F = null;
        }
        this.f17924E = z7;
    }

    /* JADX INFO: renamed from: t */
    private int m21470t(Rect rect, Rect rect2, float f7) {
        return m21435V() ? (int) (rect2.top + f7) : rect.bottom - this.f17961e.getCompoundPaddingBottom();
    }

    /* JADX INFO: renamed from: u */
    private int m21471u(Rect rect, float f7) {
        if (m21435V()) {
            return (int) (rect.centerY() - (f7 / 2.0f));
        }
        return (rect.top + this.f17961e.getCompoundPaddingTop()) - ((this.f17960d0 != 0 || m21433S()) ? 0 : (int) (this.f17931H0.m20654A() / 2.0f));
    }

    /* JADX INFO: renamed from: u0 */
    private void m21472u0(int i7) {
        if (this.f17961e == null) {
            return;
        }
        float fM20692z = this.f17931H0.m20692z();
        float height = 0.0f;
        if (this.f17922D != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.f17926F.getPaint());
            textPaint.setTextSize(this.f17926F.getTextSize());
            textPaint.setTypeface(this.f17926F.getTypeface());
            textPaint.setLetterSpacing(this.f17926F.getLetterSpacing());
            StaticLayout staticLayoutM20786a = C4539o.m20785b(this.f17922D, textPaint, i7).m20791g(getLayoutDirection() == 1).m20790f(true).m20792h(this.f17926F.getLineSpacingExtra(), this.f17926F.getLineSpacingMultiplier()).m20794j(new InterfaceC4540p() { // from class: com.google.android.material.textfield.D
                @Override // com.google.android.material.internal.InterfaceC4540p
                /* JADX INFO: renamed from: a */
                public final void mo20795a(StaticLayout.Builder builder) {
                    builder.setBreakStrategy(this.f17911a.f17926F.getBreakStrategy());
                }
            }).m20786a();
            if (this.f17960d0 == 1) {
                height = this.f17959d + this.f17931H0.m20686q() + this.f17962e0;
            }
            height += staticLayoutM20786a.getHeight();
        }
        float fMax = Math.max(fM20692z, height);
        if (this.f17961e.getMeasuredHeight() < fMax) {
            this.f17961e.setMinimumHeight(Math.round(fMax));
        }
    }

    /* JADX INFO: renamed from: v */
    private Rect m21473v(Rect rect) {
        if (this.f17961e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f17970l0;
        float fM20654A = m21433S() ? this.f17931H0.m20654A() : this.f17931H0.m20691y() * this.f17931H0.m20689w();
        rect2.left = rect.left + this.f17961e.getCompoundPaddingLeft();
        rect2.top = m21471u(rect, fM20654A);
        rect2.right = rect.right - this.f17961e.getCompoundPaddingRight();
        rect2.bottom = m21470t(rect, rect2, fM20654A);
        return rect2;
    }

    /* JADX INFO: renamed from: v0 */
    private boolean m21474v0() {
        int iMax;
        if (this.f17961e == null || this.f17961e.getMeasuredHeight() >= (iMax = Math.max(this.f17957c.getMeasuredHeight(), this.f17955b.getMeasuredHeight()))) {
            return false;
        }
        this.f17961e.setMinimumHeight(iMax);
        return true;
    }

    /* JADX INFO: renamed from: w */
    private int m21475w() {
        if (!this.f17944O) {
            return 0;
        }
        int i7 = this.f17960d0;
        if (i7 == 0) {
            return (int) this.f17931H0.m20686q();
        }
        if (i7 != 2) {
            return 0;
        }
        return m21433S() ? (int) (this.f17931H0.m20686q() / 2.0f) : Math.max(0, (int) (this.f17931H0.m20686q() - (this.f17931H0.m20680n() / 2.0f)));
    }

    /* JADX INFO: renamed from: w0 */
    private void m21476w0() {
        if (this.f17960d0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f17953a.getLayoutParams();
            int iM21475w = m21475w();
            if (iM21475w != layoutParams.topMargin) {
                layoutParams.topMargin = iM21475w;
                this.f17953a.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    private boolean m21477x() {
        return this.f17960d0 == 2 && m21478y();
    }

    /* JADX INFO: renamed from: y */
    private boolean m21478y() {
        return this.f17964f0 > -1 && this.f17967i0 != 0;
    }

    /* JADX INFO: renamed from: y0 */
    private void m21479y0(boolean z7, boolean z8) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f17961e;
        boolean z9 = false;
        boolean z10 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f17961e;
        if (editText2 != null && editText2.hasFocus()) {
            z9 = true;
        }
        ColorStateList colorStateList2 = this.f17983u0;
        if (colorStateList2 != null) {
            this.f17931H0.m20660Q(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f17983u0;
            this.f17931H0.m20660Q(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f17925E0) : this.f17925E0));
        } else if (m21491e0()) {
            this.f17931H0.m20660Q(this.f17984v.m21687r());
        } else if (this.f17990y && (textView = this.f17916A) != null) {
            this.f17931H0.m20660Q(textView.getTextColors());
        } else if (z9 && (colorStateList = this.f17985v0) != null) {
            this.f17931H0.m20665W(colorStateList);
        }
        if (z10 || !this.f17933I0 || (isEnabled() && z9)) {
            if (z8 || this.f17929G0) {
                m21417A(z7);
                return;
            }
            return;
        }
        if (z8 || !this.f17929G0) {
            m21426G(z7);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m21480z() {
        if (m21421C()) {
            ((AbstractC4640h) this.f17947R).m21527D0();
        }
    }

    /* JADX INFO: renamed from: z0 */
    private void m21481z0() {
        EditText editText;
        if (this.f17926F == null || (editText = this.f17961e) == null) {
            return;
        }
        this.f17926F.setGravity(editText.getGravity());
        this.f17926F.setPadding(this.f17961e.getCompoundPaddingLeft(), this.f17961e.getCompoundPaddingTop(), this.f17961e.getCompoundPaddingRight(), this.f17961e.getCompoundPaddingBottom());
    }

    /* JADX INFO: renamed from: D0 */
    void m21482D0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f17947R == null || this.f17960d0 == 0) {
            return;
        }
        boolean z7 = false;
        boolean z8 = isFocused() || ((editText2 = this.f17961e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f17961e) != null && editText.isHovered())) {
            z7 = true;
        }
        if (!isEnabled()) {
            this.f17967i0 = this.f17925E0;
        } else if (m21491e0()) {
            if (this.f17993z0 != null) {
                m21422C0(z8, z7);
            } else {
                this.f17967i0 = getErrorCurrentTextColors();
            }
        } else if (!this.f17990y || (textView = this.f17916A) == null) {
            if (z8) {
                this.f17967i0 = this.f17991y0;
            } else if (z7) {
                this.f17967i0 = this.f17989x0;
            } else {
                this.f17967i0 = this.f17987w0;
            }
        } else if (this.f17993z0 != null) {
            m21422C0(z8, z7);
        } else {
            this.f17967i0 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m21465p0();
        }
        this.f17957c.m21583I();
        m21489a0();
        if (this.f17960d0 == 2) {
            int i7 = this.f17964f0;
            if (z8 && isEnabled()) {
                this.f17964f0 = this.f17966h0;
            } else {
                this.f17964f0 = this.f17965g0;
            }
            if (this.f17964f0 != i7) {
                m21438Y();
            }
        }
        if (this.f17960d0 == 1) {
            if (!isEnabled()) {
                this.f17968j0 = this.f17919B0;
            } else if (z7 && !z8) {
                this.f17968j0 = this.f17923D0;
            } else if (z8) {
                this.f17968j0 = this.f17921C0;
            } else {
                this.f17968j0 = this.f17917A0;
            }
        }
        m21460n();
    }

    /* JADX INFO: renamed from: N */
    public boolean m21483N() {
        return this.f17986w;
    }

    /* JADX INFO: renamed from: O */
    public boolean m21484O() {
        return this.f17957c.m21580F();
    }

    /* JADX INFO: renamed from: P */
    public boolean m21485P() {
        return this.f17984v.m21665A();
    }

    /* JADX INFO: renamed from: Q */
    public boolean m21486Q() {
        return this.f17984v.m21666B();
    }

    /* JADX INFO: renamed from: R */
    final boolean m21487R() {
        return this.f17929G0;
    }

    /* JADX INFO: renamed from: U */
    public boolean m21488U() {
        return this.f17946Q;
    }

    /* JADX INFO: renamed from: a0 */
    public void m21489a0() {
        this.f17955b.m21728m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i7, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f17953a.addView(view, layoutParams2);
        this.f17953a.setLayoutParams(layoutParams);
        m21476w0();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: d0 */
    void m21490d0(TextView textView, int i7) {
        try {
            AbstractC2458i.m10762m(textView, i7);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        AbstractC2458i.m10762m(textView, AbstractC5528i.f21109a);
        textView.setTextColor(AbstractC2436b.getColor(getContext(), AbstractC6743d.f26287a));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i7) {
        EditText editText = this.f17961e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i7);
            return;
        }
        if (this.f17963f != null) {
            boolean z7 = this.f17946Q;
            this.f17946Q = false;
            CharSequence hint = editText.getHint();
            this.f17961e.setHint(this.f17963f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i7);
                return;
            } finally {
                this.f17961e.setHint(hint);
                this.f17946Q = z7;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i7);
        onProvideAutofillVirtualStructure(viewStructure, i7);
        viewStructure.setChildCount(this.f17953a.getChildCount());
        for (int i8 = 0; i8 < this.f17953a.getChildCount(); i8++) {
            View childAt = this.f17953a.getChildAt(i8);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i8);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i7);
            if (childAt == this.f17961e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f17941M0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f17941M0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m21425F(canvas);
        m21424E(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f17939L0) {
            return;
        }
        this.f17939L0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C4526b c4526b = this.f17931H0;
        boolean zM20679m0 = c4526b != null ? c4526b.m20679m0(drawableState) : false;
        if (this.f17961e != null) {
            m21498x0(isLaidOut() && isEnabled());
        }
        m21496r0();
        m21482D0();
        if (zM20679m0) {
            invalidate();
        }
        this.f17939L0 = false;
    }

    /* JADX INFO: renamed from: e0 */
    boolean m21491e0() {
        return this.f17984v.m21682l();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f17961e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + m21475w() : super.getBaseline();
    }

    C0622i getBoxBackground() {
        int i7 = this.f17960d0;
        if (i7 == 1 || i7 == 2) {
            return this.f17947R;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f17968j0;
    }

    public int getBoxBackgroundMode() {
        return this.f17960d0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f17962e0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return AbstractC4546v.m20834i(this) ? this.f17954a0.m2764j().mo2655a(this.f17971m0) : this.f17954a0.m2766l().mo2655a(this.f17971m0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return AbstractC4546v.m20834i(this) ? this.f17954a0.m2766l().mo2655a(this.f17971m0) : this.f17954a0.m2764j().mo2655a(this.f17971m0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return AbstractC4546v.m20834i(this) ? this.f17954a0.m2771r().mo2655a(this.f17971m0) : this.f17954a0.m2773t().mo2655a(this.f17971m0);
    }

    public float getBoxCornerRadiusTopStart() {
        return AbstractC4546v.m20834i(this) ? this.f17954a0.m2773t().mo2655a(this.f17971m0) : this.f17954a0.m2771r().mo2655a(this.f17971m0);
    }

    public int getBoxStrokeColor() {
        return this.f17991y0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f17993z0;
    }

    public int getBoxStrokeWidth() {
        return this.f17965g0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f17966h0;
    }

    public int getCounterMaxLength() {
        return this.f17988x;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f17986w && this.f17990y && (textView = this.f17916A) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f17938L;
    }

    public ColorStateList getCounterTextColor() {
        return this.f17936K;
    }

    public ColorStateList getCursorColor() {
        return this.f17940M;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f17942N;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f17983u0;
    }

    public EditText getEditText() {
        return this.f17961e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f17957c.m21612l();
    }

    public Drawable getEndIconDrawable() {
        return this.f17957c.m21616n();
    }

    public int getEndIconMinSize() {
        return this.f17957c.m21618o();
    }

    public int getEndIconMode() {
        return this.f17957c.m21620p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f17957c.m21622q();
    }

    CheckableImageButton getEndIconView() {
        return this.f17957c.m21624r();
    }

    public CharSequence getError() {
        if (this.f17984v.m21665A()) {
            return this.f17984v.m21685p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f17984v.m21683n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f17984v.m21684o();
    }

    public int getErrorCurrentTextColors() {
        return this.f17984v.m21686q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f17957c.m21626s();
    }

    public CharSequence getHelperText() {
        if (this.f17984v.m21666B()) {
            return this.f17984v.m21688s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f17984v.m21690u();
    }

    public CharSequence getHint() {
        if (this.f17944O) {
            return this.f17945P;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f17931H0.m20686q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f17931H0.m20688t();
    }

    public int getHintMaxLines() {
        return this.f17931H0.m20690x();
    }

    public ColorStateList getHintTextColor() {
        return this.f17985v0;
    }

    public InterfaceC4630f getLengthCounter() {
        return this.f17992z;
    }

    public int getMaxEms() {
        return this.f17978s;
    }

    public int getMaxWidth() {
        return this.f17982u;
    }

    public int getMinEms() {
        return this.f17976r;
    }

    public int getMinWidth() {
        return this.f17980t;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f17957c.m21627u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f17957c.m21628v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f17924E) {
            return this.f17922D;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f17930H;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f17928G;
    }

    public CharSequence getPrefixText() {
        return this.f17955b.m21718a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f17955b.m21719b();
    }

    public TextView getPrefixTextView() {
        return this.f17955b.m21721d();
    }

    public C0627n getShapeAppearanceModel() {
        return this.f17954a0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f17955b.m21722e();
    }

    public Drawable getStartIconDrawable() {
        return this.f17955b.m21723f();
    }

    public int getStartIconMinSize() {
        return this.f17955b.m21724g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f17955b.m21725h();
    }

    public CharSequence getSuffixText() {
        return this.f17957c.m21629w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f17957c.m21630x();
    }

    public TextView getSuffixTextView() {
        return this.f17957c.m21633z();
    }

    public Typeface getTypeface() {
        return this.f17972n0;
    }

    /* JADX INFO: renamed from: j */
    public void m21492j(InterfaceC4631g interfaceC4631g) {
        this.f17975q0.add(interfaceC4631g);
        if (this.f17961e != null) {
            interfaceC4631g.mo21499a(this);
        }
    }

    /* JADX INFO: renamed from: m */
    void m21493m(float f7) {
        if (this.f17931H0.m20655B() == f7) {
            return;
        }
        if (this.f17937K0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17937K0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0196h.m979g(getContext(), AbstractC6742c.f26234S, AbstractC6826a.f27405b));
            this.f17937K0.setDuration(AbstractC0196h.m978f(getContext(), AbstractC6742c.f26227L, 167));
            this.f17937K0.addUpdateListener(new C4628d());
        }
        this.f17937K0.setFloatValues(this.f17931H0.m20655B(), f7);
        this.f17937K0.start();
    }

    /* JADX INFO: renamed from: m0 */
    void m21494m0(Editable editable) {
        int iMo21415a = this.f17992z.mo21415a(editable);
        boolean z7 = this.f17990y;
        int i7 = this.f17988x;
        if (i7 == -1) {
            this.f17916A.setText(String.valueOf(iMo21415a));
            this.f17916A.setContentDescription(null);
            this.f17990y = false;
        } else {
            this.f17990y = iMo21415a > i7;
            m21461n0(getContext(), this.f17916A, iMo21415a, this.f17988x, this.f17990y);
            if (z7 != this.f17990y) {
                m21463o0();
            }
            this.f17916A.setText(C0857a.m3970c().m3977j(getContext().getString(AbstractC6750k.f26504d, Integer.valueOf(iMo21415a), Integer.valueOf(this.f17988x))));
        }
        if (this.f17961e == null || z7 == this.f17990y) {
            return;
        }
        m21498x0(false);
        m21482D0();
        m21496r0();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f17931H0.m20657L(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f17957c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f17943N0 = false;
        boolean zM21474v0 = m21474v0();
        boolean zM21495q0 = m21495q0();
        if (zM21474v0 || zM21495q0) {
            this.f17961e.post(new Runnable() { // from class: com.google.android.material.textfield.B
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17910a.f17961e.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        EditText editText = this.f17961e;
        if (editText != null) {
            Rect rect = this.f17969k0;
            AbstractC4528d.m20694a(this, editText, rect);
            m21455j0(rect);
            if (this.f17944O) {
                this.f17931H0.m20674h0(this.f17961e.getTextSize());
                int gravity = this.f17961e.getGravity();
                this.f17931H0.m20666X((gravity & (-113)) | 48);
                this.f17931H0.m20673g0(gravity);
                this.f17931H0.m20662S(m21468s(rect));
                this.f17931H0.m20670c0(m21473v(rect));
                this.f17931H0.m20658N();
                if (!m21421C() || this.f17929G0) {
                    return;
                }
                m21437X();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (!this.f17943N0) {
            this.f17957c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f17943N0 = true;
        }
        m21481z0();
        this.f17957c.m21631x0();
        if (m21433S()) {
            return;
        }
        m21457k0((this.f17961e.getMeasuredWidth() - this.f17961e.getCompoundPaddingLeft()) - this.f17961e.getCompoundPaddingRight());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4632h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4632h c4632h = (C4632h) parcelable;
        super.onRestoreInstanceState(c4632h.m6085a());
        setError(c4632h.f18001c);
        if (c4632h.f18002d) {
            post(new RunnableC4627c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        boolean z7 = i7 == 1;
        if (z7 != this.f17956b0) {
            float fMo2655a = this.f17954a0.m2771r().mo2655a(this.f17971m0);
            float fMo2655a2 = this.f17954a0.m2773t().mo2655a(this.f17971m0);
            C0627n c0627nM2802m = C0627n.m2754a().m2795C(this.f17954a0.m2772s()).m2799G(this.f17954a0.m2770q()).m2809u(this.f17954a0.m2765k()).m2813y(this.f17954a0.m2763i()).m2796D(fMo2655a2).m2800H(fMo2655a).m2810v(this.f17954a0.m2766l().mo2655a(this.f17971m0)).m2814z(this.f17954a0.m2764j().mo2655a(this.f17971m0)).m2802m();
            this.f17956b0 = z7;
            setShapeAppearanceModel(c0627nM2802m);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C4632h c4632h = new C4632h(super.onSaveInstanceState());
        if (m21491e0()) {
            c4632h.f18001c = getError();
        }
        c4632h.f18002d = this.f17957c.m21579E();
        return c4632h;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX INFO: renamed from: q0 */
    boolean m21495q0() {
        boolean z7;
        if (this.f17961e == null) {
            return false;
        }
        boolean z8 = true;
        if (m21450g0()) {
            int measuredWidth = this.f17955b.getMeasuredWidth() - this.f17961e.getPaddingLeft();
            if (this.f17973o0 == null || this.f17974p0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f17973o0 = colorDrawable;
                this.f17974p0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f17961e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f17973o0;
            if (drawable != drawable2) {
                this.f17961e.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z7 = true;
            } else {
                z7 = false;
            }
        } else if (this.f17973o0 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f17961e.getCompoundDrawablesRelative();
            this.f17961e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
            this.f17973o0 = null;
            z7 = true;
        } else {
            z7 = false;
        }
        if (m21448f0()) {
            int measuredWidth2 = this.f17957c.m21633z().getMeasuredWidth() - this.f17961e.getPaddingRight();
            CheckableImageButton checkableImageButtonM21610k = this.f17957c.m21610k();
            if (checkableImageButtonM21610k != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonM21610k.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButtonM21610k.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.f17961e.getCompoundDrawablesRelative();
            Drawable drawable3 = this.f17977r0;
            if (drawable3 != null && this.f17979s0 != measuredWidth2) {
                this.f17979s0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f17961e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f17977r0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f17977r0 = colorDrawable2;
                this.f17979s0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.f17977r0;
            if (drawable4 != drawable5) {
                this.f17981t0 = drawable4;
                this.f17961e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f17977r0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f17961e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f17977r0) {
                this.f17961e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f17981t0, compoundDrawablesRelative4[3]);
            } else {
                z8 = z7;
            }
            this.f17977r0 = null;
            return z8;
        }
        return z7;
    }

    /* JADX INFO: renamed from: r0 */
    void m21496r0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f17961e;
        if (editText == null || this.f17960d0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (AbstractC2315M.m9767a(background)) {
            background = background.mutate();
        }
        if (m21491e0()) {
            background.setColorFilter(C2359j.m10089e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f17990y && (textView = this.f17916A) != null) {
            background.setColorFilter(C2359j.m10089e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            AbstractC0400a.m1697c(background);
            this.f17961e.refreshDrawableState();
        }
    }

    public void setBoxBackgroundColor(int i7) {
        if (this.f17968j0 != i7) {
            this.f17968j0 = i7;
            this.f17917A0 = i7;
            this.f17921C0 = i7;
            this.f17923D0 = i7;
            m21460n();
        }
    }

    public void setBoxBackgroundColorResource(int i7) {
        setBoxBackgroundColor(AbstractC2436b.getColor(getContext(), i7));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f17917A0 = defaultColor;
        this.f17968j0 = defaultColor;
        this.f17919B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f17921C0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f17923D0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m21460n();
    }

    public void setBoxBackgroundMode(int i7) {
        if (i7 == this.f17960d0) {
            return;
        }
        this.f17960d0 = i7;
        if (this.f17961e != null) {
            m21436W();
        }
    }

    public void setBoxCollapsedPaddingTop(int i7) {
        this.f17962e0 = i7;
    }

    public void setBoxCornerFamily(int i7) {
        this.f17954a0 = this.f17954a0.m2776w().m2794B(i7, this.f17954a0.m2771r()).m2798F(i7, this.f17954a0.m2773t()).m2808t(i7, this.f17954a0.m2764j()).m2812x(i7, this.f17954a0.m2766l()).m2802m();
        m21460n();
    }

    public void setBoxStrokeColor(int i7) {
        if (this.f17991y0 != i7) {
            this.f17991y0 = i7;
            m21482D0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f17987w0 = colorStateList.getDefaultColor();
            this.f17925E0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f17989x0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f17991y0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f17991y0 != colorStateList.getDefaultColor()) {
            this.f17991y0 = colorStateList.getDefaultColor();
        }
        m21482D0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f17993z0 != colorStateList) {
            this.f17993z0 = colorStateList;
            m21482D0();
        }
    }

    public void setBoxStrokeWidth(int i7) {
        this.f17965g0 = i7;
        m21482D0();
    }

    public void setBoxStrokeWidthFocused(int i7) {
        this.f17966h0 = i7;
        m21482D0();
    }

    public void setBoxStrokeWidthFocusedResource(int i7) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i7));
    }

    public void setBoxStrokeWidthResource(int i7) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i7));
    }

    public void setCounterEnabled(boolean z7) {
        if (this.f17986w != z7) {
            if (z7) {
                C2303B c2303b = new C2303B(getContext());
                this.f17916A = c2303b;
                c2303b.setId(AbstractC6746g.f26410R);
                Typeface typeface = this.f17972n0;
                if (typeface != null) {
                    this.f17916A.setTypeface(typeface);
                }
                this.f17916A.setMaxLines(1);
                this.f17984v.m21679e(this.f17916A, 2);
                ((ViewGroup.MarginLayoutParams) this.f17916A.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(AbstractC6744e.f26307C0));
                m21463o0();
                m21459l0();
            } else {
                this.f17984v.m21667C(this.f17916A, 2);
                this.f17916A = null;
            }
            this.f17986w = z7;
        }
    }

    public void setCounterMaxLength(int i7) {
        if (this.f17988x != i7) {
            if (i7 > 0) {
                this.f17988x = i7;
            } else {
                this.f17988x = -1;
            }
            if (this.f17986w) {
                m21459l0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i7) {
        if (this.f17918B != i7) {
            this.f17918B = i7;
            m21463o0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f17938L != colorStateList) {
            this.f17938L = colorStateList;
            m21463o0();
        }
    }

    public void setCounterTextAppearance(int i7) {
        if (this.f17920C != i7) {
            this.f17920C = i7;
            m21463o0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f17936K != colorStateList) {
            this.f17936K = colorStateList;
            m21463o0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f17940M != colorStateList) {
            this.f17940M = colorStateList;
            m21465p0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f17942N != colorStateList) {
            this.f17942N = colorStateList;
            if (m21434T()) {
                m21465p0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f17983u0 = colorStateList;
        this.f17985v0 = colorStateList;
        if (this.f17961e != null) {
            m21498x0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z7) {
        m21439Z(this, z7);
        super.setEnabled(z7);
    }

    public void setEndIconActivated(boolean z7) {
        this.f17957c.m21587N(z7);
    }

    public void setEndIconCheckable(boolean z7) {
        this.f17957c.m21588O(z7);
    }

    public void setEndIconContentDescription(int i7) {
        this.f17957c.m21589P(i7);
    }

    public void setEndIconDrawable(int i7) {
        this.f17957c.m21591R(i7);
    }

    public void setEndIconMinSize(int i7) {
        this.f17957c.m21593T(i7);
    }

    public void setEndIconMode(int i7) {
        this.f17957c.m21594U(i7);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f17957c.m21595V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f17957c.m21596W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f17957c.m21597X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f17957c.m21598Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f17957c.m21599Z(mode);
    }

    public void setEndIconVisible(boolean z7) {
        this.f17957c.m21600a0(z7);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f17984v.m21665A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f17984v.m21691w();
        } else {
            this.f17984v.m21677Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i7) {
        this.f17984v.m21668E(i7);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f17984v.m21669F(charSequence);
    }

    public void setErrorEnabled(boolean z7) {
        this.f17984v.m21670G(z7);
    }

    public void setErrorIconDrawable(int i7) {
        this.f17957c.m21601b0(i7);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f17957c.m21603d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f17957c.m21604e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f17957c.m21605f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f17957c.m21606g0(mode);
    }

    public void setErrorTextAppearance(int i7) {
        this.f17984v.m21671H(i7);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f17984v.m21672I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z7) {
        if (this.f17933I0 != z7) {
            this.f17933I0 = z7;
            m21498x0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m21486Q()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!m21486Q()) {
                setHelperTextEnabled(true);
            }
            this.f17984v.m21678R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f17984v.m21675L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z7) {
        this.f17984v.m21674K(z7);
    }

    public void setHelperTextTextAppearance(int i7) {
        this.f17984v.m21673J(i7);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f17944O) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z7) {
        this.f17935J0 = z7;
    }

    public void setHintEnabled(boolean z7) {
        if (z7 != this.f17944O) {
            this.f17944O = z7;
            if (z7) {
                CharSequence hint = this.f17961e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f17945P)) {
                        setHint(hint);
                    }
                    this.f17961e.setHint((CharSequence) null);
                }
                this.f17946Q = true;
            } else {
                this.f17946Q = false;
                if (!TextUtils.isEmpty(this.f17945P) && TextUtils.isEmpty(this.f17961e.getHint())) {
                    this.f17961e.setHint(this.f17945P);
                }
                setHintInternal(null);
            }
            if (this.f17961e != null) {
                m21476w0();
            }
        }
    }

    public void setHintMaxLines(int i7) {
        this.f17931H0.m20663T(i7);
        this.f17931H0.m20672e0(i7);
        requestLayout();
    }

    public void setHintTextAppearance(int i7) {
        this.f17931H0.m20664U(i7);
        this.f17985v0 = this.f17931H0.m20684p();
        if (this.f17961e != null) {
            m21498x0(false);
            m21476w0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f17985v0 != colorStateList) {
            if (this.f17983u0 == null) {
                this.f17931H0.m20665W(colorStateList);
            }
            this.f17985v0 = colorStateList;
            if (this.f17961e != null) {
                m21498x0(false);
            }
        }
    }

    public void setLengthCounter(InterfaceC4630f interfaceC4630f) {
        this.f17992z = interfaceC4630f;
    }

    public void setMaxEms(int i7) {
        this.f17978s = i7;
        EditText editText = this.f17961e;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMaxEms(i7);
    }

    public void setMaxWidth(int i7) {
        this.f17982u = i7;
        EditText editText = this.f17961e;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMaxWidth(i7);
    }

    public void setMaxWidthResource(int i7) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    public void setMinEms(int i7) {
        this.f17976r = i7;
        EditText editText = this.f17961e;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMinEms(i7);
    }

    public void setMinWidth(int i7) {
        this.f17980t = i7;
        EditText editText = this.f17961e;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMinWidth(i7);
    }

    public void setMinWidthResource(int i7) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i7) {
        this.f17957c.m21608i0(i7);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i7) {
        this.f17957c.m21611k0(i7);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z7) {
        this.f17957c.m21615m0(z7);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f17957c.m21617n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f17957c.m21619o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f17926F == null) {
            C2303B c2303b = new C2303B(getContext());
            this.f17926F = c2303b;
            c2303b.setId(AbstractC6746g.f26413U);
            this.f17926F.setImportantForAccessibility(1);
            this.f17926F.setAccessibilityLiveRegion(1);
            C2835c c2835cM21419B = m21419B();
            this.f17932I = c2835cM21419B;
            c2835cM21419B.mo14163d0(67L);
            this.f17934J = m21419B();
            setPlaceholderTextAppearance(this.f17930H);
            setPlaceholderTextColor(this.f17928G);
            AbstractC1030Z.m4474j0(this.f17926F, new C4626b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f17924E) {
                setPlaceholderTextEnabled(true);
            }
            this.f17922D = charSequence;
        }
        m21418A0();
    }

    public void setPlaceholderTextAppearance(int i7) {
        this.f17930H = i7;
        TextView textView = this.f17926F;
        if (textView != null) {
            AbstractC2458i.m10762m(textView, i7);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f17928G != colorStateList) {
            this.f17928G = colorStateList;
            TextView textView = this.f17926F;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f17955b.m21729n(charSequence);
    }

    public void setPrefixTextAppearance(int i7) {
        this.f17955b.m21730o(i7);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f17955b.m21731p(colorStateList);
    }

    public void setShapeAppearanceModel(C0627n c0627n) {
        C0622i c0622i = this.f17947R;
        if (c0622i == null || c0622i.m2703J() == c0627n) {
            return;
        }
        this.f17954a0 = c0627n;
        m21460n();
    }

    public void setStartIconCheckable(boolean z7) {
        this.f17955b.m21732q(z7);
    }

    public void setStartIconContentDescription(int i7) {
        setStartIconContentDescription(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setStartIconDrawable(int i7) {
        setStartIconDrawable(i7 != 0 ? AbstractC5659a.m25175b(getContext(), i7) : null);
    }

    public void setStartIconMinSize(int i7) {
        this.f17955b.m21735t(i7);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f17955b.m21736u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f17955b.m21737v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f17955b.m21738w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f17955b.m21739x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f17955b.m21740y(mode);
    }

    public void setStartIconVisible(boolean z7) {
        this.f17955b.m21741z(z7);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f17957c.m21621p0(charSequence);
    }

    public void setSuffixTextAppearance(int i7) {
        this.f17957c.m21623q0(i7);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f17957c.m21625r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C4629e c4629e) {
        EditText editText = this.f17961e;
        if (editText != null) {
            AbstractC1030Z.m4474j0(editText, c4629e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f17972n0) {
            this.f17972n0 = typeface;
            this.f17931H0.m20685p0(typeface);
            this.f17984v.m21676N(typeface);
            TextView textView = this.f17916A;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    void m21497t0() {
        EditText editText = this.f17961e;
        if (editText == null || this.f17947R == null) {
            return;
        }
        if ((this.f17950U || editText.getBackground() == null) && this.f17960d0 != 0) {
            m21469s0();
            this.f17950U = true;
        }
    }

    /* JADX INFO: renamed from: x0 */
    void m21498x0(boolean z7) {
        m21479y0(z7, false);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26275q0);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f17957c.m21590Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f17957c.m21592S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f17957c.m21602c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f17957c.m21609j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f17957c.m21613l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f17955b.m21733r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f17955b.m21734s(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17914O0;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        this.f17976r = -1;
        this.f17978s = -1;
        this.f17980t = -1;
        this.f17982u = -1;
        this.f17984v = new C4653u(this);
        this.f17992z = new InterfaceC4630f() { // from class: com.google.android.material.textfield.C
            @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4630f
            /* JADX INFO: renamed from: a */
            public final int mo21415a(Editable editable) {
                return TextInputLayout.m21443c(editable);
            }
        };
        this.f17969k0 = new Rect();
        this.f17970l0 = new Rect();
        this.f17971m0 = new RectF();
        this.f17975q0 = new LinkedHashSet();
        C4526b c4526b = new C4526b(this);
        this.f17931H0 = c4526b;
        this.f17943N0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f17953a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = AbstractC6826a.f27404a;
        c4526b.m20683o0(timeInterpolator);
        c4526b.m20677l0(timeInterpolator);
        c4526b.m20666X(8388659);
        int[] iArr = AbstractC6752m.f26985m8;
        int i9 = AbstractC6752m.f26670J8;
        int i10 = AbstractC6752m.f26648H8;
        int i11 = AbstractC6752m.f26865b9;
        int i12 = AbstractC6752m.f26920g9;
        int i13 = AbstractC6752m.f26975l9;
        C2348d0 c2348d0M20819j = AbstractC4543s.m20819j(context2, attributeSet, iArr, i7, i8, i9, i10, i11, i12, i13);
        C4658z c4658z = new C4658z(this, c2348d0M20819j);
        this.f17955b = c4658z;
        this.f17944O = c2348d0M20819j.m10026a(AbstractC6752m.f26953j9, true);
        setHint(c2348d0M20819j.m10041p(AbstractC6752m.f27040r8));
        this.f17935J0 = c2348d0M20819j.m10026a(AbstractC6752m.f26942i9, true);
        this.f17933I0 = c2348d0M20819j.m10026a(AbstractC6752m.f26887d9, true);
        int i14 = AbstractC6752m.f27062t8;
        if (c2348d0M20819j.m10044s(i14)) {
            setMinEms(c2348d0M20819j.m10036k(i14, -1));
        } else {
            int i15 = AbstractC6752m.f27029q8;
            if (c2348d0M20819j.m10044s(i15)) {
                setMinWidth(c2348d0M20819j.m10031f(i15, -1));
            }
        }
        int i16 = AbstractC6752m.f27051s8;
        if (c2348d0M20819j.m10044s(i16)) {
            setMaxEms(c2348d0M20819j.m10036k(i16, -1));
        } else {
            int i17 = AbstractC6752m.f27018p8;
            if (c2348d0M20819j.m10044s(i17)) {
                setMaxWidth(c2348d0M20819j.m10031f(i17, -1));
            }
        }
        this.f17954a0 = C0627n.m2758e(context2, attributeSet, i7, i8).m2802m();
        this.f17958c0 = context2.getResources().getDimensionPixelOffset(AbstractC6744e.f26383z0);
        this.f17962e0 = c2348d0M20819j.m10030e(AbstractC6752m.f27095w8, 0);
        this.f17959d = getResources().getDimensionPixelSize(AbstractC6744e.f26380y);
        this.f17965g0 = c2348d0M20819j.m10031f(AbstractC6752m.f26604D8, context2.getResources().getDimensionPixelSize(AbstractC6744e.f26303A0));
        this.f17966h0 = c2348d0M20819j.m10031f(AbstractC6752m.f26615E8, context2.getResources().getDimensionPixelSize(AbstractC6744e.f26305B0));
        this.f17964f0 = this.f17965g0;
        float fM10029d = c2348d0M20819j.m10029d(AbstractC6752m.f26571A8, -1.0f);
        float fM10029d2 = c2348d0M20819j.m10029d(AbstractC6752m.f27128z8, -1.0f);
        float fM10029d3 = c2348d0M20819j.m10029d(AbstractC6752m.f27106x8, -1.0f);
        float fM10029d4 = c2348d0M20819j.m10029d(AbstractC6752m.f27117y8, -1.0f);
        C0627n.b bVarM2776w = this.f17954a0.m2776w();
        if (fM10029d >= 0.0f) {
            bVarM2776w.m2796D(fM10029d);
        }
        if (fM10029d2 >= 0.0f) {
            bVarM2776w.m2800H(fM10029d2);
        }
        if (fM10029d3 >= 0.0f) {
            bVarM2776w.m2814z(fM10029d3);
        }
        if (fM10029d4 >= 0.0f) {
            bVarM2776w.m2810v(fM10029d4);
        }
        this.f17954a0 = bVarM2776w.m2802m();
        ColorStateList colorStateListM1826b = AbstractC0423c.m1826b(context2, c2348d0M20819j, AbstractC6752m.f27073u8);
        if (colorStateListM1826b != null) {
            int defaultColor = colorStateListM1826b.getDefaultColor();
            this.f17917A0 = defaultColor;
            this.f17968j0 = defaultColor;
            if (colorStateListM1826b.isStateful()) {
                this.f17919B0 = colorStateListM1826b.getColorForState(new int[]{-16842910}, -1);
                this.f17921C0 = colorStateListM1826b.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f17923D0 = colorStateListM1826b.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f17921C0 = this.f17917A0;
                ColorStateList colorStateListM25174a = AbstractC5659a.m25174a(context2, AbstractC6743d.f26298l);
                this.f17919B0 = colorStateListM25174a.getColorForState(new int[]{-16842910}, -1);
                this.f17923D0 = colorStateListM25174a.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f17968j0 = 0;
            this.f17917A0 = 0;
            this.f17919B0 = 0;
            this.f17921C0 = 0;
            this.f17923D0 = 0;
        }
        int i18 = AbstractC6752m.f27007o8;
        if (c2348d0M20819j.m10044s(i18)) {
            ColorStateList colorStateListM10028c = c2348d0M20819j.m10028c(i18);
            this.f17985v0 = colorStateListM10028c;
            this.f17983u0 = colorStateListM10028c;
        }
        int i19 = AbstractC6752m.f26582B8;
        ColorStateList colorStateListM1826b2 = AbstractC0423c.m1826b(context2, c2348d0M20819j, i19);
        this.f17991y0 = c2348d0M20819j.m10027b(i19, 0);
        this.f17987w0 = AbstractC2436b.getColor(context2, AbstractC6743d.f26299m);
        this.f17925E0 = AbstractC2436b.getColor(context2, AbstractC6743d.f26300n);
        this.f17989x0 = AbstractC2436b.getColor(context2, AbstractC6743d.f26301o);
        if (colorStateListM1826b2 != null) {
            setBoxStrokeColorStateList(colorStateListM1826b2);
        }
        int i20 = AbstractC6752m.f26593C8;
        if (c2348d0M20819j.m10044s(i20)) {
            setBoxStrokeErrorColor(AbstractC0423c.m1826b(context2, c2348d0M20819j, i20));
        }
        if (c2348d0M20819j.m10039n(i13, -1) != -1) {
            setHintTextAppearance(c2348d0M20819j.m10039n(i13, 0));
        }
        this.f17940M = c2348d0M20819j.m10028c(AbstractC6752m.f26692L8);
        this.f17942N = c2348d0M20819j.m10028c(AbstractC6752m.f26703M8);
        int iM10039n = c2348d0M20819j.m10039n(i11, 0);
        CharSequence charSequenceM10041p = c2348d0M20819j.m10041p(AbstractC6752m.f26813W8);
        int iM10036k = c2348d0M20819j.m10036k(AbstractC6752m.f26802V8, 1);
        boolean zM10026a = c2348d0M20819j.m10026a(AbstractC6752m.f26823X8, false);
        int iM10039n2 = c2348d0M20819j.m10039n(i12, 0);
        boolean zM10026a2 = c2348d0M20819j.m10026a(AbstractC6752m.f26909f9, false);
        CharSequence charSequenceM10041p2 = c2348d0M20819j.m10041p(AbstractC6752m.f26898e9);
        int iM10039n3 = c2348d0M20819j.m10039n(AbstractC6752m.f27063t9, 0);
        CharSequence charSequenceM10041p3 = c2348d0M20819j.m10041p(AbstractC6752m.f27052s9);
        boolean zM10026a3 = c2348d0M20819j.m10026a(AbstractC6752m.f26626F8, false);
        setCounterMaxLength(c2348d0M20819j.m10036k(AbstractC6752m.f26637G8, -1));
        this.f17920C = c2348d0M20819j.m10039n(i9, 0);
        this.f17918B = c2348d0M20819j.m10039n(i10, 0);
        setBoxBackgroundMode(c2348d0M20819j.m10036k(AbstractC6752m.f27084v8, 0));
        setErrorContentDescription(charSequenceM10041p);
        setErrorAccessibilityLiveRegion(iM10036k);
        setCounterOverflowTextAppearance(this.f17918B);
        setHelperTextTextAppearance(iM10039n2);
        setErrorTextAppearance(iM10039n);
        setCounterTextAppearance(this.f17920C);
        setPlaceholderText(charSequenceM10041p3);
        setPlaceholderTextAppearance(iM10039n3);
        int i21 = AbstractC6752m.f26876c9;
        if (c2348d0M20819j.m10044s(i21)) {
            setErrorTextColor(c2348d0M20819j.m10028c(i21));
        }
        int i22 = AbstractC6752m.f26931h9;
        if (c2348d0M20819j.m10044s(i22)) {
            setHelperTextColor(c2348d0M20819j.m10028c(i22));
        }
        int i23 = AbstractC6752m.f26986m9;
        if (c2348d0M20819j.m10044s(i23)) {
            setHintTextColor(c2348d0M20819j.m10028c(i23));
        }
        int i24 = AbstractC6752m.f26681K8;
        if (c2348d0M20819j.m10044s(i24)) {
            setCounterTextColor(c2348d0M20819j.m10028c(i24));
        }
        int i25 = AbstractC6752m.f26659I8;
        if (c2348d0M20819j.m10044s(i25)) {
            setCounterOverflowTextColor(c2348d0M20819j.m10028c(i25));
        }
        int i26 = AbstractC6752m.f27074u9;
        if (c2348d0M20819j.m10044s(i26)) {
            setPlaceholderTextColor(c2348d0M20819j.m10028c(i26));
        }
        C4650r c4650r = new C4650r(this, c2348d0M20819j);
        this.f17957c = c4650r;
        boolean zM10026a4 = c2348d0M20819j.m10026a(AbstractC6752m.f26996n8, true);
        setHintMaxLines(c2348d0M20819j.m10036k(AbstractC6752m.f26964k9, 1));
        c2348d0M20819j.m10046x();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(c4658z);
        frameLayout.addView(c4650r);
        addView(frameLayout);
        setEnabled(zM10026a4);
        setHelperTextEnabled(zM10026a2);
        setErrorEnabled(zM10026a);
        setCounterEnabled(zM10026a3);
        setHelperText(charSequenceM10041p2);
    }

    public void setHint(int i7) {
        setHint(i7 != 0 ? getResources().getText(i7) : null);
    }
}
