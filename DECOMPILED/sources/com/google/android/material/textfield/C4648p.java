package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import p029D3.AbstractC0196h;
import p118P.C1170s;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6745f;
import p325p3.AbstractC6750k;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: com.google.android.material.textfield.p */
/* JADX INFO: loaded from: classes2.dex */
class C4648p extends AbstractC4651s {

    /* JADX INFO: renamed from: e */
    private final int f18028e;

    /* JADX INFO: renamed from: f */
    private final int f18029f;

    /* JADX INFO: renamed from: g */
    private final TimeInterpolator f18030g;

    /* JADX INFO: renamed from: h */
    private AutoCompleteTextView f18031h;

    /* JADX INFO: renamed from: i */
    private final View.OnClickListener f18032i;

    /* JADX INFO: renamed from: j */
    private final View.OnFocusChangeListener f18033j;

    /* JADX INFO: renamed from: k */
    private final AccessibilityManager.TouchExplorationStateChangeListener f18034k;

    /* JADX INFO: renamed from: l */
    private boolean f18035l;

    /* JADX INFO: renamed from: m */
    private boolean f18036m;

    /* JADX INFO: renamed from: n */
    private boolean f18037n;

    /* JADX INFO: renamed from: o */
    private long f18038o;

    /* JADX INFO: renamed from: p */
    private AccessibilityManager f18039p;

    /* JADX INFO: renamed from: q */
    private ValueAnimator f18040q;

    /* JADX INFO: renamed from: r */
    private ValueAnimator f18041r;

    /* JADX INFO: renamed from: com.google.android.material.textfield.p$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4648p.this.m21638r();
            C4648p.this.f18041r.start();
        }
    }

    C4648p(C4650r c4650r) {
        super(c4650r);
        this.f18032i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18024a.m21540J();
            }
        };
        this.f18033j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z7) {
                C4648p.m21545y(this.f18025a, view, z7);
            }
        };
        this.f18034k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z7) {
                C4648p.m21543w(this.f18026a, z7);
            }
        };
        this.f18038o = Long.MAX_VALUE;
        Context context = c4650r.getContext();
        int i7 = AbstractC6742c.f26230O;
        this.f18029f = AbstractC0196h.m978f(context, i7, 67);
        this.f18028e = AbstractC0196h.m978f(c4650r.getContext(), i7, 50);
        this.f18030g = AbstractC0196h.m979g(c4650r.getContext(), AbstractC6742c.f26235T, AbstractC6826a.f27404a);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m21531A(C4648p c4648p) {
        c4648p.m21541K();
        c4648p.m21538H(false);
    }

    /* JADX INFO: renamed from: D */
    private static AutoCompleteTextView m21534D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* JADX INFO: renamed from: E */
    private ValueAnimator m21535E(int i7, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f18030g);
        valueAnimatorOfFloat.setDuration(i7);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4648p.m21544x(this.f18021a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: F */
    private void m21536F() {
        this.f18041r = m21535E(this.f18029f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorM21535E = m21535E(this.f18028e, 1.0f, 0.0f);
        this.f18040q = valueAnimatorM21535E;
        valueAnimatorM21535E.addListener(new a());
    }

    /* JADX INFO: renamed from: G */
    private boolean m21537G() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f18038o;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    /* JADX INFO: renamed from: H */
    private void m21538H(boolean z7) {
        if (this.f18037n != z7) {
            this.f18037n = z7;
            this.f18041r.cancel();
            this.f18040q.start();
        }
    }

    /* JADX INFO: renamed from: I */
    private void m21539I() {
        this.f18031h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C4648p.m21546z(this.f18022a, view, motionEvent);
            }
        });
        this.f18031h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C4648p.m21531A(this.f18023a);
            }
        });
        this.f18031h.setThreshold(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public void m21540J() {
        if (this.f18031h == null) {
            return;
        }
        if (m21537G()) {
            this.f18036m = false;
        }
        if (this.f18036m) {
            this.f18036m = false;
            return;
        }
        m21538H(!this.f18037n);
        if (!this.f18037n) {
            this.f18031h.dismissDropDown();
        } else {
            this.f18031h.requestFocus();
            this.f18031h.showDropDown();
        }
    }

    /* JADX INFO: renamed from: K */
    private void m21541K() {
        this.f18036m = true;
        this.f18038o = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m21542v(C4648p c4648p) {
        boolean zIsPopupShowing = c4648p.f18031h.isPopupShowing();
        c4648p.m21538H(zIsPopupShowing);
        c4648p.f18036m = zIsPopupShowing;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m21543w(C4648p c4648p, boolean z7) {
        AutoCompleteTextView autoCompleteTextView = c4648p.f18031h;
        if (autoCompleteTextView == null || AbstractC4649q.m21556a(autoCompleteTextView)) {
            return;
        }
        c4648p.f18076d.setImportantForAccessibility(z7 ? 2 : 1);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m21544x(C4648p c4648p, ValueAnimator valueAnimator) {
        c4648p.getClass();
        c4648p.f18076d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m21545y(C4648p c4648p, View view, boolean z7) {
        c4648p.f18035l = z7;
        c4648p.m21638r();
        if (z7) {
            return;
        }
        c4648p.m21538H(false);
        c4648p.f18036m = false;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m21546z(C4648p c4648p, View view, MotionEvent motionEvent) {
        c4648p.getClass();
        if (motionEvent.getAction() == 1) {
            if (c4648p.m21537G()) {
                c4648p.f18036m = false;
            }
            c4648p.m21540J();
            c4648p.m21541K();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: a */
    public void mo21513a(Editable editable) {
        if (this.f18039p.isTouchExplorationEnabled() && AbstractC4649q.m21556a(this.f18031h) && !this.f18076d.hasFocus()) {
            this.f18031h.dismissDropDown();
        }
        this.f18031h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                C4648p.m21542v(this.f18027a);
            }
        });
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: c */
    int mo21514c() {
        return AbstractC6750k.f26507g;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: d */
    int mo21515d() {
        return AbstractC6745f.f26390g;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: e */
    View.OnFocusChangeListener mo21516e() {
        return this.f18033j;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: f */
    View.OnClickListener mo21517f() {
        return this.f18032i;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: h */
    public AccessibilityManager.TouchExplorationStateChangeListener mo21547h() {
        return this.f18034k;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: i */
    boolean mo21548i(int i7) {
        return i7 != 0;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: j */
    boolean mo21549j() {
        return true;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: k */
    boolean mo21550k() {
        return this.f18035l;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: l */
    boolean mo21551l() {
        return true;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: m */
    boolean mo21552m() {
        return this.f18037n;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: n */
    public void mo21519n(EditText editText) {
        this.f18031h = m21534D(editText);
        m21539I();
        this.f18073a.setErrorIconDrawable((Drawable) null);
        if (!AbstractC4649q.m21556a(editText) && this.f18039p.isTouchExplorationEnabled()) {
            this.f18076d.setImportantForAccessibility(2);
        }
        this.f18073a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: o */
    public void mo21553o(View view, C1170s c1170s) {
        if (!AbstractC4649q.m21556a(this.f18031h)) {
            c1170s.m5069m0(Spinner.class.getName());
        }
        if (c1170s.m5048X()) {
            c1170s.m5088x0(null);
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: p */
    public void mo21554p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f18039p.isEnabled() || AbstractC4649q.m21556a(this.f18031h)) {
            return;
        }
        boolean z7 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f18037n && !this.f18031h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z7) {
            m21540J();
            m21541K();
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: s */
    void mo21521s() {
        m21536F();
        this.f18039p = (AccessibilityManager) this.f18075c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: t */
    boolean mo21555t() {
        return true;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: u */
    void mo21522u() {
        AutoCompleteTextView autoCompleteTextView = this.f18031h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f18031h.setOnDismissListener(null);
        }
    }
}
