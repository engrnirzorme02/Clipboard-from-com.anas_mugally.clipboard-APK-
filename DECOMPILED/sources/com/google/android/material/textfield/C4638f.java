package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import p029D3.AbstractC0196h;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6745f;
import p325p3.AbstractC6750k;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: com.google.android.material.textfield.f */
/* JADX INFO: loaded from: classes2.dex */
class C4638f extends AbstractC4651s {

    /* JADX INFO: renamed from: e */
    private final int f18008e;

    /* JADX INFO: renamed from: f */
    private final int f18009f;

    /* JADX INFO: renamed from: g */
    private final TimeInterpolator f18010g;

    /* JADX INFO: renamed from: h */
    private final TimeInterpolator f18011h;

    /* JADX INFO: renamed from: i */
    private EditText f18012i;

    /* JADX INFO: renamed from: j */
    private final View.OnClickListener f18013j;

    /* JADX INFO: renamed from: k */
    private final View.OnFocusChangeListener f18014k;

    /* JADX INFO: renamed from: l */
    private AnimatorSet f18015l;

    /* JADX INFO: renamed from: m */
    private ValueAnimator f18016m;

    /* JADX INFO: renamed from: com.google.android.material.textfield.f$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4638f.this.f18074b.m21600a0(true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.f$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4638f.this.f18074b.m21600a0(false);
        }
    }

    C4638f(C4650r c4650r) {
        super(c4650r);
        this.f18013j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4638f.m21508v(this.f18003a, view);
            }
        };
        this.f18014k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z7) {
                C4638f c4638f = this.f18004a;
                c4638f.m21503A(c4638f.m21507E());
            }
        };
        Context context = c4650r.getContext();
        int i7 = AbstractC6742c.f26230O;
        this.f18008e = AbstractC0196h.m978f(context, i7, 100);
        this.f18009f = AbstractC0196h.m978f(c4650r.getContext(), i7, 150);
        this.f18010g = AbstractC0196h.m979g(c4650r.getContext(), AbstractC6742c.f26235T, AbstractC6826a.f27404a);
        this.f18011h = AbstractC0196h.m979g(c4650r.getContext(), AbstractC6742c.f26234S, AbstractC6826a.f27407d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public void m21503A(boolean z7) {
        boolean z8 = this.f18074b.m21580F() == z7;
        if (z7 && !this.f18015l.isRunning()) {
            this.f18016m.cancel();
            this.f18015l.start();
            if (z8) {
                this.f18015l.end();
                return;
            }
            return;
        }
        if (z7) {
            return;
        }
        this.f18015l.cancel();
        this.f18016m.start();
        if (z8) {
            this.f18016m.end();
        }
    }

    /* JADX INFO: renamed from: B */
    private ValueAnimator m21504B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f18010g);
        valueAnimatorOfFloat.setDuration(this.f18008e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4638f.m21510x(this.f18005a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: C */
    private ValueAnimator m21505C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f18011h);
        valueAnimatorOfFloat.setDuration(this.f18009f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4638f.m21511y(this.f18007a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: D */
    private void m21506D() {
        ValueAnimator valueAnimatorM21505C = m21505C();
        ValueAnimator valueAnimatorM21504B = m21504B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f18015l = animatorSet;
        animatorSet.playTogether(valueAnimatorM21505C, valueAnimatorM21504B);
        this.f18015l.addListener(new a());
        ValueAnimator valueAnimatorM21504B2 = m21504B(1.0f, 0.0f);
        this.f18016m = valueAnimatorM21504B2;
        valueAnimatorM21504B2.addListener(new b());
    }

    /* JADX INFO: renamed from: E */
    private boolean m21507E() {
        EditText editText = this.f18012i;
        if (editText != null) {
            return (editText.hasFocus() || this.f18076d.hasFocus()) && this.f18012i.getText().length() > 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m21508v(C4638f c4638f, View view) {
        EditText editText = c4638f.f18012i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        c4638f.m21638r();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m21510x(C4638f c4638f, ValueAnimator valueAnimator) {
        c4638f.getClass();
        c4638f.f18076d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m21511y(C4638f c4638f, ValueAnimator valueAnimator) {
        c4638f.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c4638f.f18076d.setScaleX(fFloatValue);
        c4638f.f18076d.setScaleY(fFloatValue);
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: a */
    void mo21513a(Editable editable) {
        if (this.f18074b.m21629w() != null) {
            return;
        }
        m21503A(m21507E());
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: c */
    int mo21514c() {
        return AbstractC6750k.f26505e;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: d */
    int mo21515d() {
        return AbstractC6745f.f26391h;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: e */
    View.OnFocusChangeListener mo21516e() {
        return this.f18014k;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: f */
    View.OnClickListener mo21517f() {
        return this.f18013j;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: g */
    View.OnFocusChangeListener mo21518g() {
        return this.f18014k;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: n */
    public void mo21519n(EditText editText) {
        this.f18012i = editText;
        this.f18073a.setEndIconVisible(m21507E());
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: q */
    void mo21520q(boolean z7) {
        if (this.f18074b.m21629w() == null) {
            return;
        }
        m21503A(z7);
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: s */
    void mo21521s() {
        m21506D();
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: u */
    void mo21522u() {
        EditText editText = this.f18012i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18006a.m21503A(true);
                }
            });
        }
    }
}
