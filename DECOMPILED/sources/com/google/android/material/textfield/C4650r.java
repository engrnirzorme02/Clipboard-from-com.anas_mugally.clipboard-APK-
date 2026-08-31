package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC2263x;
import androidx.appcompat.widget.C2303B;
import androidx.appcompat.widget.C2348d0;
import androidx.core.widget.AbstractC2458i;
import com.google.android.material.internal.AbstractC4542r;
import com.google.android.material.internal.AbstractC4546v;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p041F.AbstractC0400a;
import p045F3.AbstractC0423c;
import p263i.AbstractC5659a;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6748i;
import p325p3.AbstractC6750k;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: com.google.android.material.textfield.r */
/* JADX INFO: loaded from: classes2.dex */
class C4650r extends LinearLayout {

    /* JADX INFO: renamed from: A */
    private CharSequence f18043A;

    /* JADX INFO: renamed from: B */
    private final TextView f18044B;

    /* JADX INFO: renamed from: C */
    private boolean f18045C;

    /* JADX INFO: renamed from: D */
    private EditText f18046D;

    /* JADX INFO: renamed from: E */
    private final AccessibilityManager f18047E;

    /* JADX INFO: renamed from: F */
    private AccessibilityManager.TouchExplorationStateChangeListener f18048F;

    /* JADX INFO: renamed from: G */
    private final TextWatcher f18049G;

    /* JADX INFO: renamed from: H */
    private final TextInputLayout.InterfaceC4631g f18050H;

    /* JADX INFO: renamed from: a */
    final TextInputLayout f18051a;

    /* JADX INFO: renamed from: b */
    private final FrameLayout f18052b;

    /* JADX INFO: renamed from: c */
    private final CheckableImageButton f18053c;

    /* JADX INFO: renamed from: d */
    private ColorStateList f18054d;

    /* JADX INFO: renamed from: e */
    private PorterDuff.Mode f18055e;

    /* JADX INFO: renamed from: f */
    private View.OnLongClickListener f18056f;

    /* JADX INFO: renamed from: r */
    private final CheckableImageButton f18057r;

    /* JADX INFO: renamed from: s */
    private final d f18058s;

    /* JADX INFO: renamed from: t */
    private int f18059t;

    /* JADX INFO: renamed from: u */
    private final LinkedHashSet f18060u;

    /* JADX INFO: renamed from: v */
    private ColorStateList f18061v;

    /* JADX INFO: renamed from: w */
    private PorterDuff.Mode f18062w;

    /* JADX INFO: renamed from: x */
    private int f18063x;

    /* JADX INFO: renamed from: y */
    private ImageView.ScaleType f18064y;

    /* JADX INFO: renamed from: z */
    private View.OnLongClickListener f18065z;

    /* JADX INFO: renamed from: com.google.android.material.textfield.r$a */
    class a extends AbstractC4542r {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C4650r.this.m21614m().mo21513a(editable);
        }

        @Override // com.google.android.material.internal.AbstractC4542r, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            C4650r.this.m21614m().mo21637b(charSequence, i7, i8, i9);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.r$b */
    class b implements TextInputLayout.InterfaceC4631g {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4631g
        /* JADX INFO: renamed from: a */
        public void mo21499a(TextInputLayout textInputLayout) {
            if (C4650r.this.f18046D == textInputLayout.getEditText()) {
                return;
            }
            if (C4650r.this.f18046D != null) {
                C4650r.this.f18046D.removeTextChangedListener(C4650r.this.f18049G);
                if (C4650r.this.f18046D.getOnFocusChangeListener() == C4650r.this.m21614m().mo21516e()) {
                    C4650r.this.f18046D.setOnFocusChangeListener(null);
                }
            }
            C4650r.this.f18046D = textInputLayout.getEditText();
            if (C4650r.this.f18046D != null) {
                C4650r.this.f18046D.addTextChangedListener(C4650r.this.f18049G);
            }
            C4650r.this.m21614m().mo21519n(C4650r.this.f18046D);
            C4650r c4650r = C4650r.this;
            c4650r.m21568h0(c4650r.m21614m());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.r$c */
    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C4650r.this.m21567g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C4650r.this.m21560M();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.r$d */
    private static class d {

        /* JADX INFO: renamed from: a */
        private final SparseArray f18069a = new SparseArray();

        /* JADX INFO: renamed from: b */
        private final C4650r f18070b;

        /* JADX INFO: renamed from: c */
        private final int f18071c;

        /* JADX INFO: renamed from: d */
        private final int f18072d;

        d(C4650r c4650r, C2348d0 c2348d0) {
            this.f18070b = c4650r;
            this.f18071c = c2348d0.m10039n(AbstractC6752m.f26736P8, 0);
            this.f18072d = c2348d0.m10039n(AbstractC6752m.f27008o9, 0);
        }

        /* JADX INFO: renamed from: b */
        private AbstractC4651s m21635b(int i7) {
            if (i7 == -1) {
                return new C4639g(this.f18070b);
            }
            if (i7 == 0) {
                return new C4655w(this.f18070b);
            }
            if (i7 == 1) {
                return new C4657y(this.f18070b, this.f18072d);
            }
            if (i7 == 2) {
                return new C4638f(this.f18070b);
            }
            if (i7 == 3) {
                return new C4648p(this.f18070b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i7);
        }

        /* JADX INFO: renamed from: c */
        AbstractC4651s m21636c(int i7) {
            AbstractC4651s abstractC4651s = (AbstractC4651s) this.f18069a.get(i7);
            if (abstractC4651s != null) {
                return abstractC4651s;
            }
            AbstractC4651s abstractC4651sM21635b = m21635b(i7);
            this.f18069a.append(i7, abstractC4651sM21635b);
            return abstractC4651sM21635b;
        }
    }

    C4650r(TextInputLayout textInputLayout, C2348d0 c2348d0) {
        super(textInputLayout.getContext());
        this.f18059t = 0;
        this.f18060u = new LinkedHashSet();
        this.f18049G = new a();
        b bVar = new b();
        this.f18050H = bVar;
        this.f18047E = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f18051a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f18052b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM21569i = m21569i(this, layoutInflaterFrom, AbstractC6746g.f26409Q);
        this.f18053c = checkableImageButtonM21569i;
        CheckableImageButton checkableImageButtonM21569i2 = m21569i(frameLayout, layoutInflaterFrom, AbstractC6746g.f26408P);
        this.f18057r = checkableImageButtonM21569i2;
        this.f18058s = new d(this, c2348d0);
        C2303B c2303b = new C2303B(getContext());
        this.f18044B = c2303b;
        m21558C(c2348d0);
        m21557B(c2348d0);
        m21559D(c2348d0);
        frameLayout.addView(checkableImageButtonM21569i2);
        addView(c2303b);
        addView(frameLayout);
        addView(checkableImageButtonM21569i);
        textInputLayout.m21492j(bVar);
        addOnAttachStateChangeListener(new c());
    }

    /* JADX INFO: renamed from: B */
    private void m21557B(C2348d0 c2348d0) {
        int i7 = AbstractC6752m.f27019p9;
        if (!c2348d0.m10044s(i7)) {
            int i8 = AbstractC6752m.f26780T8;
            if (c2348d0.m10044s(i8)) {
                this.f18061v = AbstractC0423c.m1826b(getContext(), c2348d0, i8);
            }
            int i9 = AbstractC6752m.f26791U8;
            if (c2348d0.m10044s(i9)) {
                this.f18062w = AbstractC4546v.m20835j(c2348d0.m10036k(i9, -1), null);
            }
        }
        int i10 = AbstractC6752m.f26758R8;
        if (c2348d0.m10044s(i10)) {
            m21594U(c2348d0.m10036k(i10, 0));
            int i11 = AbstractC6752m.f26725O8;
            if (c2348d0.m10044s(i11)) {
                m21590Q(c2348d0.m10041p(i11));
            }
            m21588O(c2348d0.m10026a(AbstractC6752m.f26714N8, true));
        } else if (c2348d0.m10044s(i7)) {
            int i12 = AbstractC6752m.f27030q9;
            if (c2348d0.m10044s(i12)) {
                this.f18061v = AbstractC0423c.m1826b(getContext(), c2348d0, i12);
            }
            int i13 = AbstractC6752m.f27041r9;
            if (c2348d0.m10044s(i13)) {
                this.f18062w = AbstractC4546v.m20835j(c2348d0.m10036k(i13, -1), null);
            }
            m21594U(c2348d0.m10026a(i7, false) ? 1 : 0);
            m21590Q(c2348d0.m10041p(AbstractC6752m.f26997n9));
        }
        m21593T(c2348d0.m10031f(AbstractC6752m.f26747Q8, getResources().getDimensionPixelSize(AbstractC6744e.f26361o0)));
        int i14 = AbstractC6752m.f26769S8;
        if (c2348d0.m10044s(i14)) {
            m21597X(AbstractC4652t.m21640b(c2348d0.m10036k(i14, -1)));
        }
    }

    /* JADX INFO: renamed from: C */
    private void m21558C(C2348d0 c2348d0) {
        int i7 = AbstractC6752m.f26843Z8;
        if (c2348d0.m10044s(i7)) {
            this.f18054d = AbstractC0423c.m1826b(getContext(), c2348d0, i7);
        }
        int i8 = AbstractC6752m.f26854a9;
        if (c2348d0.m10044s(i8)) {
            this.f18055e = AbstractC4546v.m20835j(c2348d0.m10036k(i8, -1), null);
        }
        int i9 = AbstractC6752m.f26833Y8;
        if (c2348d0.m10044s(i9)) {
            m21602c0(c2348d0.m10032g(i9));
        }
        this.f18053c.setContentDescription(getResources().getText(AbstractC6750k.f26506f));
        this.f18053c.setImportantForAccessibility(2);
        this.f18053c.setClickable(false);
        this.f18053c.setPressable(false);
        this.f18053c.setCheckable(false);
        this.f18053c.setFocusable(false);
    }

    /* JADX INFO: renamed from: D */
    private void m21559D(C2348d0 c2348d0) {
        this.f18044B.setVisibility(8);
        this.f18044B.setId(AbstractC6746g.f26415W);
        this.f18044B.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.f18044B.setAccessibilityLiveRegion(1);
        m21623q0(c2348d0.m10039n(AbstractC6752m.f26638G9, 0));
        int i7 = AbstractC6752m.f26649H9;
        if (c2348d0.m10044s(i7)) {
            m21625r0(c2348d0.m10028c(i7));
        }
        m21621p0(c2348d0.m10041p(AbstractC6752m.f26627F9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m21560M() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f18048F;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.f18047E) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m21567g() {
        if (this.f18048F == null || this.f18047E == null || !isAttachedToWindow()) {
            return;
        }
        this.f18047E.addTouchExplorationStateChangeListener(this.f18048F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public void m21568h0(AbstractC4651s abstractC4651s) {
        if (this.f18046D == null) {
            return;
        }
        if (abstractC4651s.mo21516e() != null) {
            this.f18046D.setOnFocusChangeListener(abstractC4651s.mo21516e());
        }
        if (abstractC4651s.mo21518g() != null) {
            this.f18057r.setOnFocusChangeListener(abstractC4651s.mo21518g());
        }
    }

    /* JADX INFO: renamed from: i */
    private CheckableImageButton m21569i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i7) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(AbstractC6748i.f26463l, viewGroup, false);
        checkableImageButton.setId(i7);
        AbstractC4652t.m21643e(checkableImageButton);
        if (AbstractC0423c.m1832h(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: j */
    private void m21570j(int i7) {
        Iterator it = this.f18060u.iterator();
        if (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            throw null;
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m21571s0(AbstractC4651s abstractC4651s) {
        abstractC4651s.mo21521s();
        this.f18048F = abstractC4651s.mo21547h();
        m21567g();
    }

    /* JADX INFO: renamed from: t */
    private int m21572t(AbstractC4651s abstractC4651s) {
        int i7 = this.f18058s.f18071c;
        return i7 == 0 ? abstractC4651s.mo21515d() : i7;
    }

    /* JADX INFO: renamed from: t0 */
    private void m21573t0(AbstractC4651s abstractC4651s) {
        m21560M();
        this.f18048F = null;
        abstractC4651s.mo21522u();
    }

    /* JADX INFO: renamed from: u0 */
    private void m21574u0(boolean z7) {
        if (!z7 || m21616n() == null) {
            AbstractC4652t.m21639a(this.f18051a, this.f18057r, this.f18061v, this.f18062w);
            return;
        }
        Drawable drawableMutate = AbstractC0400a.m1712r(m21616n()).mutate();
        drawableMutate.setTint(this.f18051a.getErrorCurrentTextColors());
        this.f18057r.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: v0 */
    private void m21575v0() {
        this.f18052b.setVisibility((this.f18057r.getVisibility() != 0 || m21581G()) ? 8 : 0);
        setVisibility((m21580F() || m21581G() || ((this.f18043A == null || this.f18045C) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: w0 */
    private void m21576w0() {
        this.f18053c.setVisibility(m21626s() != null && this.f18051a.m21485P() && this.f18051a.m21491e0() ? 0 : 8);
        m21575v0();
        m21631x0();
        if (m21578A()) {
            return;
        }
        this.f18051a.m21495q0();
    }

    /* JADX INFO: renamed from: y0 */
    private void m21577y0() {
        int visibility = this.f18044B.getVisibility();
        int i7 = (this.f18043A == null || this.f18045C) ? 8 : 0;
        if (visibility != i7) {
            m21614m().mo21520q(i7 == 0);
        }
        m21575v0();
        this.f18044B.setVisibility(i7);
        this.f18051a.m21495q0();
    }

    /* JADX INFO: renamed from: A */
    boolean m21578A() {
        return this.f18059t != 0;
    }

    /* JADX INFO: renamed from: E */
    boolean m21579E() {
        return m21578A() && this.f18057r.isChecked();
    }

    /* JADX INFO: renamed from: F */
    boolean m21580F() {
        return this.f18052b.getVisibility() == 0 && this.f18057r.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: G */
    boolean m21581G() {
        return this.f18053c.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: H */
    void m21582H(boolean z7) {
        this.f18045C = z7;
        m21577y0();
    }

    /* JADX INFO: renamed from: I */
    void m21583I() {
        m21576w0();
        m21585K();
        m21584J();
        if (m21614m().mo21555t()) {
            m21574u0(this.f18051a.m21491e0());
        }
    }

    /* JADX INFO: renamed from: J */
    void m21584J() {
        AbstractC4652t.m21642d(this.f18051a, this.f18057r, this.f18061v);
    }

    /* JADX INFO: renamed from: K */
    void m21585K() {
        AbstractC4652t.m21642d(this.f18051a, this.f18053c, this.f18054d);
    }

    /* JADX INFO: renamed from: L */
    void m21586L(boolean z7) {
        boolean z8;
        boolean zIsActivated;
        boolean zIsChecked;
        AbstractC4651s abstractC4651sM21614m = m21614m();
        boolean z9 = true;
        if (!abstractC4651sM21614m.mo21551l() || (zIsChecked = this.f18057r.isChecked()) == abstractC4651sM21614m.mo21552m()) {
            z8 = false;
        } else {
            this.f18057r.setChecked(!zIsChecked);
            z8 = true;
        }
        if (!abstractC4651sM21614m.mo21549j() || (zIsActivated = this.f18057r.isActivated()) == abstractC4651sM21614m.mo21550k()) {
            z9 = z8;
        } else {
            m21587N(!zIsActivated);
        }
        if (z7 || z9) {
            m21584J();
        }
    }

    /* JADX INFO: renamed from: N */
    void m21587N(boolean z7) {
        this.f18057r.setActivated(z7);
    }

    /* JADX INFO: renamed from: O */
    void m21588O(boolean z7) {
        this.f18057r.setCheckable(z7);
    }

    /* JADX INFO: renamed from: P */
    void m21589P(int i7) {
        m21590Q(i7 != 0 ? getResources().getText(i7) : null);
    }

    /* JADX INFO: renamed from: Q */
    void m21590Q(CharSequence charSequence) {
        if (m21612l() != charSequence) {
            this.f18057r.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: R */
    void m21591R(int i7) {
        m21592S(i7 != 0 ? AbstractC5659a.m25175b(getContext(), i7) : null);
    }

    /* JADX INFO: renamed from: S */
    void m21592S(Drawable drawable) {
        this.f18057r.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC4652t.m21639a(this.f18051a, this.f18057r, this.f18061v, this.f18062w);
            m21584J();
        }
    }

    /* JADX INFO: renamed from: T */
    void m21593T(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i7 != this.f18063x) {
            this.f18063x = i7;
            AbstractC4652t.m21645g(this.f18057r, i7);
            AbstractC4652t.m21645g(this.f18053c, i7);
        }
    }

    /* JADX INFO: renamed from: U */
    void m21594U(int i7) {
        if (this.f18059t == i7) {
            return;
        }
        m21573t0(m21614m());
        int i8 = this.f18059t;
        this.f18059t = i7;
        m21570j(i8);
        m21600a0(i7 != 0);
        AbstractC4651s abstractC4651sM21614m = m21614m();
        m21591R(m21572t(abstractC4651sM21614m));
        m21589P(abstractC4651sM21614m.mo21514c());
        m21588O(abstractC4651sM21614m.mo21551l());
        if (!abstractC4651sM21614m.mo21548i(this.f18051a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f18051a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i7);
        }
        m21571s0(abstractC4651sM21614m);
        m21595V(abstractC4651sM21614m.mo21517f());
        EditText editText = this.f18046D;
        if (editText != null) {
            abstractC4651sM21614m.mo21519n(editText);
            m21568h0(abstractC4651sM21614m);
        }
        AbstractC4652t.m21639a(this.f18051a, this.f18057r, this.f18061v, this.f18062w);
        m21586L(true);
    }

    /* JADX INFO: renamed from: V */
    void m21595V(View.OnClickListener onClickListener) {
        AbstractC4652t.m21646h(this.f18057r, onClickListener, this.f18065z);
    }

    /* JADX INFO: renamed from: W */
    void m21596W(View.OnLongClickListener onLongClickListener) {
        this.f18065z = onLongClickListener;
        AbstractC4652t.m21647i(this.f18057r, onLongClickListener);
    }

    /* JADX INFO: renamed from: X */
    void m21597X(ImageView.ScaleType scaleType) {
        this.f18064y = scaleType;
        AbstractC4652t.m21648j(this.f18057r, scaleType);
        AbstractC4652t.m21648j(this.f18053c, scaleType);
    }

    /* JADX INFO: renamed from: Y */
    void m21598Y(ColorStateList colorStateList) {
        if (this.f18061v != colorStateList) {
            this.f18061v = colorStateList;
            AbstractC4652t.m21639a(this.f18051a, this.f18057r, colorStateList, this.f18062w);
        }
    }

    /* JADX INFO: renamed from: Z */
    void m21599Z(PorterDuff.Mode mode) {
        if (this.f18062w != mode) {
            this.f18062w = mode;
            AbstractC4652t.m21639a(this.f18051a, this.f18057r, this.f18061v, mode);
        }
    }

    /* JADX INFO: renamed from: a0 */
    void m21600a0(boolean z7) {
        if (m21580F() != z7) {
            this.f18057r.setVisibility(z7 ? 0 : 8);
            m21575v0();
            m21631x0();
            this.f18051a.m21495q0();
        }
    }

    /* JADX INFO: renamed from: b0 */
    void m21601b0(int i7) {
        m21602c0(i7 != 0 ? AbstractC5659a.m25175b(getContext(), i7) : null);
        m21585K();
    }

    /* JADX INFO: renamed from: c0 */
    void m21602c0(Drawable drawable) {
        this.f18053c.setImageDrawable(drawable);
        m21576w0();
        AbstractC4652t.m21639a(this.f18051a, this.f18053c, this.f18054d, this.f18055e);
    }

    /* JADX INFO: renamed from: d0 */
    void m21603d0(View.OnClickListener onClickListener) {
        AbstractC4652t.m21646h(this.f18053c, onClickListener, this.f18056f);
    }

    /* JADX INFO: renamed from: e0 */
    void m21604e0(View.OnLongClickListener onLongClickListener) {
        this.f18056f = onLongClickListener;
        AbstractC4652t.m21647i(this.f18053c, onLongClickListener);
    }

    /* JADX INFO: renamed from: f0 */
    void m21605f0(ColorStateList colorStateList) {
        if (this.f18054d != colorStateList) {
            this.f18054d = colorStateList;
            AbstractC4652t.m21639a(this.f18051a, this.f18053c, colorStateList, this.f18055e);
        }
    }

    /* JADX INFO: renamed from: g0 */
    void m21606g0(PorterDuff.Mode mode) {
        if (this.f18055e != mode) {
            this.f18055e = mode;
            AbstractC4652t.m21639a(this.f18051a, this.f18053c, this.f18054d, mode);
        }
    }

    /* JADX INFO: renamed from: h */
    void m21607h() {
        this.f18057r.performClick();
        this.f18057r.jumpDrawablesToCurrentState();
    }

    /* JADX INFO: renamed from: i0 */
    void m21608i0(int i7) {
        m21609j0(i7 != 0 ? getResources().getText(i7) : null);
    }

    /* JADX INFO: renamed from: j0 */
    void m21609j0(CharSequence charSequence) {
        this.f18057r.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: k */
    CheckableImageButton m21610k() {
        if (m21581G()) {
            return this.f18053c;
        }
        if (m21578A() && m21580F()) {
            return this.f18057r;
        }
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    void m21611k0(int i7) {
        m21613l0(i7 != 0 ? AbstractC5659a.m25175b(getContext(), i7) : null);
    }

    /* JADX INFO: renamed from: l */
    CharSequence m21612l() {
        return this.f18057r.getContentDescription();
    }

    /* JADX INFO: renamed from: l0 */
    void m21613l0(Drawable drawable) {
        this.f18057r.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: m */
    AbstractC4651s m21614m() {
        return this.f18058s.m21636c(this.f18059t);
    }

    /* JADX INFO: renamed from: m0 */
    void m21615m0(boolean z7) {
        if (z7 && this.f18059t != 1) {
            m21594U(1);
        } else {
            if (z7) {
                return;
            }
            m21594U(0);
        }
    }

    /* JADX INFO: renamed from: n */
    Drawable m21616n() {
        return this.f18057r.getDrawable();
    }

    /* JADX INFO: renamed from: n0 */
    void m21617n0(ColorStateList colorStateList) {
        this.f18061v = colorStateList;
        AbstractC4652t.m21639a(this.f18051a, this.f18057r, colorStateList, this.f18062w);
    }

    /* JADX INFO: renamed from: o */
    int m21618o() {
        return this.f18063x;
    }

    /* JADX INFO: renamed from: o0 */
    void m21619o0(PorterDuff.Mode mode) {
        this.f18062w = mode;
        AbstractC4652t.m21639a(this.f18051a, this.f18057r, this.f18061v, mode);
    }

    /* JADX INFO: renamed from: p */
    int m21620p() {
        return this.f18059t;
    }

    /* JADX INFO: renamed from: p0 */
    void m21621p0(CharSequence charSequence) {
        this.f18043A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f18044B.setText(charSequence);
        m21577y0();
    }

    /* JADX INFO: renamed from: q */
    ImageView.ScaleType m21622q() {
        return this.f18064y;
    }

    /* JADX INFO: renamed from: q0 */
    void m21623q0(int i7) {
        AbstractC2458i.m10762m(this.f18044B, i7);
    }

    /* JADX INFO: renamed from: r */
    CheckableImageButton m21624r() {
        return this.f18057r;
    }

    /* JADX INFO: renamed from: r0 */
    void m21625r0(ColorStateList colorStateList) {
        this.f18044B.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: s */
    Drawable m21626s() {
        return this.f18053c.getDrawable();
    }

    /* JADX INFO: renamed from: u */
    CharSequence m21627u() {
        return this.f18057r.getContentDescription();
    }

    /* JADX INFO: renamed from: v */
    Drawable m21628v() {
        return this.f18057r.getDrawable();
    }

    /* JADX INFO: renamed from: w */
    CharSequence m21629w() {
        return this.f18043A;
    }

    /* JADX INFO: renamed from: x */
    ColorStateList m21630x() {
        return this.f18044B.getTextColors();
    }

    /* JADX INFO: renamed from: x0 */
    void m21631x0() {
        if (this.f18051a.f17961e == null) {
            return;
        }
        this.f18044B.setPaddingRelative(getContext().getResources().getDimensionPixelSize(AbstractC6744e.f26321P), this.f18051a.f17961e.getPaddingTop(), (m21580F() || m21581G()) ? 0 : this.f18051a.f17961e.getPaddingEnd(), this.f18051a.f17961e.getPaddingBottom());
    }

    /* JADX INFO: renamed from: y */
    int m21632y() {
        return getPaddingEnd() + this.f18044B.getPaddingEnd() + ((m21580F() || m21581G()) ? this.f18057r.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f18057r.getLayoutParams()).getMarginStart() : 0);
    }

    /* JADX INFO: renamed from: z */
    TextView m21633z() {
        return this.f18044B;
    }
}
