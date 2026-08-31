package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C2303B;
import androidx.appcompat.widget.C2348d0;
import androidx.core.widget.AbstractC2458i;
import com.google.android.material.internal.AbstractC4546v;
import com.google.android.material.internal.CheckableImageButton;
import p045F3.AbstractC0423c;
import p118P.C1170s;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6748i;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: com.google.android.material.textfield.z */
/* JADX INFO: loaded from: classes2.dex */
class C4658z extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private final TextInputLayout f18127a;

    /* JADX INFO: renamed from: b */
    private final TextView f18128b;

    /* JADX INFO: renamed from: c */
    private CharSequence f18129c;

    /* JADX INFO: renamed from: d */
    private final CheckableImageButton f18130d;

    /* JADX INFO: renamed from: e */
    private ColorStateList f18131e;

    /* JADX INFO: renamed from: f */
    private PorterDuff.Mode f18132f;

    /* JADX INFO: renamed from: r */
    private int f18133r;

    /* JADX INFO: renamed from: s */
    private ImageView.ScaleType f18134s;

    /* JADX INFO: renamed from: t */
    private View.OnLongClickListener f18135t;

    /* JADX INFO: renamed from: u */
    private boolean f18136u;

    C4658z(TextInputLayout textInputLayout, C2348d0 c2348d0) {
        super(textInputLayout.getContext());
        this.f18127a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(AbstractC6748i.f26464m, (ViewGroup) this, false);
        this.f18130d = checkableImageButton;
        AbstractC4652t.m21643e(checkableImageButton);
        C2303B c2303b = new C2303B(getContext());
        this.f18128b = c2303b;
        m21715j(c2348d0);
        m21714i(c2348d0);
        addView(checkableImageButton);
        addView(c2303b);
    }

    /* JADX INFO: renamed from: C */
    private void m21713C() {
        int i7 = (this.f18129c == null || this.f18136u) ? 8 : 0;
        setVisibility((this.f18130d.getVisibility() == 0 || i7 == 0) ? 0 : 8);
        this.f18128b.setVisibility(i7);
        this.f18127a.m21495q0();
    }

    /* JADX INFO: renamed from: i */
    private void m21714i(C2348d0 c2348d0) {
        this.f18128b.setVisibility(8);
        this.f18128b.setId(AbstractC6746g.f26414V);
        this.f18128b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f18128b.setAccessibilityLiveRegion(1);
        m21730o(c2348d0.m10039n(AbstractC6752m.f27096w9, 0));
        int i7 = AbstractC6752m.f27107x9;
        if (c2348d0.m10044s(i7)) {
            m21731p(c2348d0.m10028c(i7));
        }
        m21729n(c2348d0.m10041p(AbstractC6752m.f27085v9));
    }

    /* JADX INFO: renamed from: j */
    private void m21715j(C2348d0 c2348d0) {
        if (AbstractC0423c.m1832h(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.f18130d.getLayoutParams()).setMarginEnd(0);
        }
        m21736u(null);
        m21737v(null);
        int i7 = AbstractC6752m.f26605D9;
        if (c2348d0.m10044s(i7)) {
            this.f18131e = AbstractC0423c.m1826b(getContext(), c2348d0, i7);
        }
        int i8 = AbstractC6752m.f26616E9;
        if (c2348d0.m10044s(i8)) {
            this.f18132f = AbstractC4546v.m20835j(c2348d0.m10036k(i8, -1), null);
        }
        int i9 = AbstractC6752m.f26572A9;
        if (c2348d0.m10044s(i9)) {
            m21734s(c2348d0.m10032g(i9));
            int i10 = AbstractC6752m.f27129z9;
            if (c2348d0.m10044s(i10)) {
                m21733r(c2348d0.m10041p(i10));
            }
            m21732q(c2348d0.m10026a(AbstractC6752m.f27118y9, true));
        }
        m21735t(c2348d0.m10031f(AbstractC6752m.f26583B9, getResources().getDimensionPixelSize(AbstractC6744e.f26361o0)));
        int i11 = AbstractC6752m.f26594C9;
        if (c2348d0.m10044s(i11)) {
            m21738w(AbstractC4652t.m21640b(c2348d0.m10036k(i11, -1)));
        }
    }

    /* JADX INFO: renamed from: A */
    void m21716A(C1170s c1170s) {
        if (this.f18128b.getVisibility() != 0) {
            c1170s.m5037O0(this.f18130d);
        } else {
            c1170s.m5090y0(this.f18128b);
            c1170s.m5037O0(this.f18128b);
        }
    }

    /* JADX INFO: renamed from: B */
    void m21717B() {
        EditText editText = this.f18127a.f17961e;
        if (editText == null) {
            return;
        }
        this.f18128b.setPaddingRelative(m21726k() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(AbstractC6744e.f26321P), editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: renamed from: a */
    CharSequence m21718a() {
        return this.f18129c;
    }

    /* JADX INFO: renamed from: b */
    ColorStateList m21719b() {
        return this.f18128b.getTextColors();
    }

    /* JADX INFO: renamed from: c */
    int m21720c() {
        return getPaddingStart() + this.f18128b.getPaddingStart() + (m21726k() ? this.f18130d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f18130d.getLayoutParams()).getMarginEnd() : 0);
    }

    /* JADX INFO: renamed from: d */
    TextView m21721d() {
        return this.f18128b;
    }

    /* JADX INFO: renamed from: e */
    CharSequence m21722e() {
        return this.f18130d.getContentDescription();
    }

    /* JADX INFO: renamed from: f */
    Drawable m21723f() {
        return this.f18130d.getDrawable();
    }

    /* JADX INFO: renamed from: g */
    int m21724g() {
        return this.f18133r;
    }

    /* JADX INFO: renamed from: h */
    ImageView.ScaleType m21725h() {
        return this.f18134s;
    }

    /* JADX INFO: renamed from: k */
    boolean m21726k() {
        return this.f18130d.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: l */
    void m21727l(boolean z7) {
        this.f18136u = z7;
        m21713C();
    }

    /* JADX INFO: renamed from: m */
    void m21728m() {
        AbstractC4652t.m21642d(this.f18127a, this.f18130d, this.f18131e);
    }

    /* JADX INFO: renamed from: n */
    void m21729n(CharSequence charSequence) {
        this.f18129c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f18128b.setText(charSequence);
        m21713C();
    }

    /* JADX INFO: renamed from: o */
    void m21730o(int i7) {
        AbstractC2458i.m10762m(this.f18128b, i7);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        m21717B();
    }

    /* JADX INFO: renamed from: p */
    void m21731p(ColorStateList colorStateList) {
        this.f18128b.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: q */
    void m21732q(boolean z7) {
        this.f18130d.setCheckable(z7);
    }

    /* JADX INFO: renamed from: r */
    void m21733r(CharSequence charSequence) {
        if (m21722e() != charSequence) {
            this.f18130d.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: s */
    void m21734s(Drawable drawable) {
        this.f18130d.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC4652t.m21639a(this.f18127a, this.f18130d, this.f18131e, this.f18132f);
            m21741z(true);
            m21728m();
        } else {
            m21741z(false);
            m21736u(null);
            m21737v(null);
            m21733r(null);
        }
    }

    /* JADX INFO: renamed from: t */
    void m21735t(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i7 != this.f18133r) {
            this.f18133r = i7;
            AbstractC4652t.m21645g(this.f18130d, i7);
        }
    }

    /* JADX INFO: renamed from: u */
    void m21736u(View.OnClickListener onClickListener) {
        AbstractC4652t.m21646h(this.f18130d, onClickListener, this.f18135t);
    }

    /* JADX INFO: renamed from: v */
    void m21737v(View.OnLongClickListener onLongClickListener) {
        this.f18135t = onLongClickListener;
        AbstractC4652t.m21647i(this.f18130d, onLongClickListener);
    }

    /* JADX INFO: renamed from: w */
    void m21738w(ImageView.ScaleType scaleType) {
        this.f18134s = scaleType;
        AbstractC4652t.m21648j(this.f18130d, scaleType);
    }

    /* JADX INFO: renamed from: x */
    void m21739x(ColorStateList colorStateList) {
        if (this.f18131e != colorStateList) {
            this.f18131e = colorStateList;
            AbstractC4652t.m21639a(this.f18127a, this.f18130d, colorStateList, this.f18132f);
        }
    }

    /* JADX INFO: renamed from: y */
    void m21740y(PorterDuff.Mode mode) {
        if (this.f18132f != mode) {
            this.f18132f = mode;
            AbstractC4652t.m21639a(this.f18127a, this.f18130d, this.f18131e, mode);
        }
    }

    /* JADX INFO: renamed from: z */
    void m21741z(boolean z7) {
        if (m21726k() != z7) {
            this.f18130d.setVisibility(z7 ? 0 : 8);
            m21717B();
            m21713C();
        }
    }
}
