package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C2303B;
import androidx.core.widget.AbstractC2458i;
import java.util.ArrayList;
import java.util.List;
import p029D3.AbstractC0196h;
import p045F3.AbstractC0423c;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6746g;
import p333q3.AbstractC6826a;
import p333q3.AbstractC6827b;

/* JADX INFO: renamed from: com.google.android.material.textfield.u */
/* JADX INFO: loaded from: classes2.dex */
final class C4653u {

    /* JADX INFO: renamed from: A */
    private ColorStateList f18077A;

    /* JADX INFO: renamed from: B */
    private Typeface f18078B;

    /* JADX INFO: renamed from: a */
    private final int f18079a;

    /* JADX INFO: renamed from: b */
    private final int f18080b;

    /* JADX INFO: renamed from: c */
    private final int f18081c;

    /* JADX INFO: renamed from: d */
    private final TimeInterpolator f18082d;

    /* JADX INFO: renamed from: e */
    private final TimeInterpolator f18083e;

    /* JADX INFO: renamed from: f */
    private final TimeInterpolator f18084f;

    /* JADX INFO: renamed from: g */
    private final Context f18085g;

    /* JADX INFO: renamed from: h */
    private final TextInputLayout f18086h;

    /* JADX INFO: renamed from: i */
    private LinearLayout f18087i;

    /* JADX INFO: renamed from: j */
    private int f18088j;

    /* JADX INFO: renamed from: k */
    private FrameLayout f18089k;

    /* JADX INFO: renamed from: l */
    private Animator f18090l;

    /* JADX INFO: renamed from: m */
    private final float f18091m;

    /* JADX INFO: renamed from: n */
    private int f18092n;

    /* JADX INFO: renamed from: o */
    private int f18093o;

    /* JADX INFO: renamed from: p */
    private CharSequence f18094p;

    /* JADX INFO: renamed from: q */
    private boolean f18095q;

    /* JADX INFO: renamed from: r */
    private TextView f18096r;

    /* JADX INFO: renamed from: s */
    private CharSequence f18097s;

    /* JADX INFO: renamed from: t */
    private int f18098t;

    /* JADX INFO: renamed from: u */
    private int f18099u;

    /* JADX INFO: renamed from: v */
    private ColorStateList f18100v;

    /* JADX INFO: renamed from: w */
    private CharSequence f18101w;

    /* JADX INFO: renamed from: x */
    private boolean f18102x;

    /* JADX INFO: renamed from: y */
    private TextView f18103y;

    /* JADX INFO: renamed from: z */
    private int f18104z;

    /* JADX INFO: renamed from: com.google.android.material.textfield.u$a */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f18105a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TextView f18106b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f18107c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ TextView f18108d;

        a(int i7, TextView textView, int i8, TextView textView2) {
            this.f18105a = i7;
            this.f18106b = textView;
            this.f18107c = i8;
            this.f18108d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4653u.this.f18092n = this.f18105a;
            C4653u.this.f18090l = null;
            TextView textView = this.f18106b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f18107c == 1 && C4653u.this.f18096r != null) {
                    C4653u.this.f18096r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f18108d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f18108d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f18108d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f18108d.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.u$b */
    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = C4653u.this.f18086h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public C4653u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f18085g = context;
        this.f18086h = textInputLayout;
        this.f18091m = context.getResources().getDimensionPixelSize(AbstractC6744e.f26352k);
        int i7 = AbstractC6742c.f26231P;
        this.f18079a = AbstractC0196h.m978f(context, i7, 217);
        this.f18080b = AbstractC0196h.m978f(context, AbstractC6742c.f26227L, 167);
        this.f18081c = AbstractC0196h.m978f(context, i7, 167);
        int i8 = AbstractC6742c.f26233R;
        this.f18082d = AbstractC0196h.m979g(context, i8, AbstractC6826a.f27407d);
        TimeInterpolator timeInterpolator = AbstractC6826a.f27404a;
        this.f18083e = AbstractC0196h.m979g(context, i8, timeInterpolator);
        this.f18084f = AbstractC0196h.m979g(context, AbstractC6742c.f26235T, timeInterpolator);
    }

    /* JADX INFO: renamed from: D */
    private void m21649D(int i7, int i8) {
        TextView textViewM21662m;
        TextView textViewM21662m2;
        if (i7 == i8) {
            return;
        }
        if (i8 != 0 && (textViewM21662m2 = m21662m(i8)) != null) {
            textViewM21662m2.setVisibility(0);
            textViewM21662m2.setAlpha(1.0f);
        }
        if (i7 != 0 && (textViewM21662m = m21662m(i7)) != null) {
            textViewM21662m.setVisibility(4);
            if (i7 == 1) {
                textViewM21662m.setText((CharSequence) null);
            }
        }
        this.f18092n = i8;
    }

    /* JADX INFO: renamed from: M */
    private void m21650M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* JADX INFO: renamed from: O */
    private void m21651O(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: P */
    private boolean m21652P(TextView textView, CharSequence charSequence) {
        if (this.f18086h.isLaidOut() && this.f18086h.isEnabled()) {
            return (this.f18093o == this.f18092n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    private void m21653S(int i7, int i8, boolean z7) {
        C4653u c4653u;
        if (i7 == i8) {
            return;
        }
        if (z7) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f18090l = animatorSet;
            ArrayList arrayList = new ArrayList();
            c4653u = this;
            c4653u.m21659i(arrayList, this.f18102x, this.f18103y, 2, i7, i8);
            c4653u.m21659i(arrayList, c4653u.f18095q, c4653u.f18096r, 1, i7, i8);
            AbstractC6827b.m29846a(animatorSet, arrayList);
            animatorSet.addListener(c4653u.new a(i8, m21662m(i7), i7, m21662m(i8)));
            animatorSet.start();
        } else {
            c4653u = this;
            m21649D(i7, i8);
        }
        c4653u.f18086h.m21496r0();
        c4653u.f18086h.m21498x0(z7);
        c4653u.f18086h.m21482D0();
    }

    /* JADX INFO: renamed from: g */
    private boolean m21658g() {
        return (this.f18087i == null || this.f18086h.getEditText() == null) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    private void m21659i(List list, boolean z7, TextView textView, int i7, int i8, int i9) {
        if (textView == null || !z7) {
            return;
        }
        if (i7 == i9 || i7 == i8) {
            ObjectAnimator objectAnimatorM21660j = m21660j(textView, i9 == i7);
            if (i7 == i9 && i8 != 0) {
                objectAnimatorM21660j.setStartDelay(this.f18081c);
            }
            list.add(objectAnimatorM21660j);
            if (i9 != i7 || i8 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorM21661k = m21661k(textView);
            objectAnimatorM21661k.setStartDelay(this.f18081c);
            list.add(objectAnimatorM21661k);
        }
    }

    /* JADX INFO: renamed from: j */
    private ObjectAnimator m21660j(TextView textView, boolean z7) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z7 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z7 ? this.f18080b : this.f18081c);
        objectAnimatorOfFloat.setInterpolator(z7 ? this.f18083e : this.f18084f);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: k */
    private ObjectAnimator m21661k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f18091m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f18079a);
        objectAnimatorOfFloat.setInterpolator(this.f18082d);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: m */
    private TextView m21662m(int i7) {
        if (i7 == 1) {
            return this.f18096r;
        }
        if (i7 != 2) {
            return null;
        }
        return this.f18103y;
    }

    /* JADX INFO: renamed from: v */
    private int m21663v(boolean z7, int i7, int i8) {
        return z7 ? this.f18085g.getResources().getDimensionPixelSize(i7) : i8;
    }

    /* JADX INFO: renamed from: y */
    private boolean m21664y(int i7) {
        return (i7 != 1 || this.f18096r == null || TextUtils.isEmpty(this.f18094p)) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    boolean m21665A() {
        return this.f18095q;
    }

    /* JADX INFO: renamed from: B */
    boolean m21666B() {
        return this.f18102x;
    }

    /* JADX INFO: renamed from: C */
    void m21667C(TextView textView, int i7) {
        FrameLayout frameLayout;
        if (this.f18087i == null) {
            return;
        }
        if (!m21693z(i7) || (frameLayout = this.f18089k) == null) {
            this.f18087i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i8 = this.f18088j - 1;
        this.f18088j = i8;
        m21651O(this.f18087i, i8);
    }

    /* JADX INFO: renamed from: E */
    void m21668E(int i7) {
        this.f18098t = i7;
        TextView textView = this.f18096r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i7);
        }
    }

    /* JADX INFO: renamed from: F */
    void m21669F(CharSequence charSequence) {
        this.f18097s = charSequence;
        TextView textView = this.f18096r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: G */
    void m21670G(boolean z7) {
        if (this.f18095q == z7) {
            return;
        }
        m21681h();
        if (z7) {
            C2303B c2303b = new C2303B(this.f18085g);
            this.f18096r = c2303b;
            c2303b.setId(AbstractC6746g.f26411S);
            this.f18096r.setTextAlignment(5);
            Typeface typeface = this.f18078B;
            if (typeface != null) {
                this.f18096r.setTypeface(typeface);
            }
            m21671H(this.f18099u);
            m21672I(this.f18100v);
            m21669F(this.f18097s);
            m21668E(this.f18098t);
            this.f18096r.setVisibility(4);
            m21679e(this.f18096r, 0);
        } else {
            m21691w();
            m21667C(this.f18096r, 0);
            this.f18096r = null;
            this.f18086h.m21496r0();
            this.f18086h.m21482D0();
        }
        this.f18095q = z7;
    }

    /* JADX INFO: renamed from: H */
    void m21671H(int i7) {
        this.f18099u = i7;
        TextView textView = this.f18096r;
        if (textView != null) {
            this.f18086h.m21490d0(textView, i7);
        }
    }

    /* JADX INFO: renamed from: I */
    void m21672I(ColorStateList colorStateList) {
        this.f18100v = colorStateList;
        TextView textView = this.f18096r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: J */
    void m21673J(int i7) {
        this.f18104z = i7;
        TextView textView = this.f18103y;
        if (textView != null) {
            AbstractC2458i.m10762m(textView, i7);
        }
    }

    /* JADX INFO: renamed from: K */
    void m21674K(boolean z7) {
        if (this.f18102x == z7) {
            return;
        }
        m21681h();
        if (z7) {
            C2303B c2303b = new C2303B(this.f18085g);
            this.f18103y = c2303b;
            c2303b.setId(AbstractC6746g.f26412T);
            this.f18103y.setTextAlignment(5);
            Typeface typeface = this.f18078B;
            if (typeface != null) {
                this.f18103y.setTypeface(typeface);
            }
            this.f18103y.setVisibility(4);
            this.f18103y.setAccessibilityLiveRegion(1);
            m21673J(this.f18104z);
            m21675L(this.f18077A);
            m21679e(this.f18103y, 1);
            this.f18103y.setAccessibilityDelegate(new b());
        } else {
            m21692x();
            m21667C(this.f18103y, 1);
            this.f18103y = null;
            this.f18086h.m21496r0();
            this.f18086h.m21482D0();
        }
        this.f18102x = z7;
    }

    /* JADX INFO: renamed from: L */
    void m21675L(ColorStateList colorStateList) {
        this.f18077A = colorStateList;
        TextView textView = this.f18103y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: N */
    void m21676N(Typeface typeface) {
        if (typeface != this.f18078B) {
            this.f18078B = typeface;
            m21650M(this.f18096r, typeface);
            m21650M(this.f18103y, typeface);
        }
    }

    /* JADX INFO: renamed from: Q */
    void m21677Q(CharSequence charSequence) {
        m21681h();
        this.f18094p = charSequence;
        this.f18096r.setText(charSequence);
        int i7 = this.f18092n;
        if (i7 != 1) {
            this.f18093o = 1;
        }
        m21653S(i7, this.f18093o, m21652P(this.f18096r, charSequence));
    }

    /* JADX INFO: renamed from: R */
    void m21678R(CharSequence charSequence) {
        m21681h();
        this.f18101w = charSequence;
        this.f18103y.setText(charSequence);
        int i7 = this.f18092n;
        if (i7 != 2) {
            this.f18093o = 2;
        }
        m21653S(i7, this.f18093o, m21652P(this.f18103y, charSequence));
    }

    /* JADX INFO: renamed from: e */
    void m21679e(TextView textView, int i7) {
        if (this.f18087i == null && this.f18089k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f18085g);
            this.f18087i = linearLayout;
            linearLayout.setOrientation(0);
            this.f18086h.addView(this.f18087i, -1, -2);
            this.f18089k = new FrameLayout(this.f18085g);
            this.f18087i.addView(this.f18089k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f18086h.getEditText() != null) {
                m21680f();
            }
        }
        if (m21693z(i7)) {
            this.f18089k.setVisibility(0);
            this.f18089k.addView(textView);
        } else {
            this.f18087i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f18087i.setVisibility(0);
        this.f18088j++;
    }

    /* JADX INFO: renamed from: f */
    void m21680f() {
        if (m21658g()) {
            EditText editText = this.f18086h.getEditText();
            boolean zM1832h = AbstractC0423c.m1832h(this.f18085g);
            LinearLayout linearLayout = this.f18087i;
            int i7 = AbstractC6744e.f26319N;
            linearLayout.setPaddingRelative(m21663v(zM1832h, i7, editText.getPaddingStart()), m21663v(zM1832h, AbstractC6744e.f26320O, this.f18085g.getResources().getDimensionPixelSize(AbstractC6744e.f26318M)), m21663v(zM1832h, i7, editText.getPaddingEnd()), 0);
        }
    }

    /* JADX INFO: renamed from: h */
    void m21681h() {
        Animator animator = this.f18090l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: l */
    boolean m21682l() {
        return m21664y(this.f18093o);
    }

    /* JADX INFO: renamed from: n */
    int m21683n() {
        return this.f18098t;
    }

    /* JADX INFO: renamed from: o */
    CharSequence m21684o() {
        return this.f18097s;
    }

    /* JADX INFO: renamed from: p */
    CharSequence m21685p() {
        return this.f18094p;
    }

    /* JADX INFO: renamed from: q */
    int m21686q() {
        TextView textView = this.f18096r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    ColorStateList m21687r() {
        TextView textView = this.f18096r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    CharSequence m21688s() {
        return this.f18101w;
    }

    /* JADX INFO: renamed from: t */
    View m21689t() {
        return this.f18103y;
    }

    /* JADX INFO: renamed from: u */
    int m21690u() {
        TextView textView = this.f18103y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: renamed from: w */
    void m21691w() {
        this.f18094p = null;
        m21681h();
        if (this.f18092n == 1) {
            if (!this.f18102x || TextUtils.isEmpty(this.f18101w)) {
                this.f18093o = 0;
            } else {
                this.f18093o = 2;
            }
        }
        m21653S(this.f18092n, this.f18093o, m21652P(this.f18096r, ""));
    }

    /* JADX INFO: renamed from: x */
    void m21692x() {
        m21681h();
        int i7 = this.f18092n;
        if (i7 == 2) {
            this.f18093o = 0;
        }
        m21653S(i7, this.f18093o, m21652P(this.f18103y, ""));
    }

    /* JADX INFO: renamed from: z */
    boolean m21693z(int i7) {
        return i7 == 0 || i7 == 1;
    }
}
