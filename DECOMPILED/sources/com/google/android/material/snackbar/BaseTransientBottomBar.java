package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.AbstractC2263x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.AbstractC4546v;
import com.google.android.material.internal.AbstractC4548x;
import java.util.List;
import p029D3.AbstractC0196h;
import p041F.AbstractC0400a;
import p045F3.AbstractC0423c;
import p069I3.C0622i;
import p069I3.C0627n;
import p093L3.AbstractC0842a;
import p111O.AbstractC1030Z;
import p111O.C0982A0;
import p111O.C1032a;
import p111O.InterfaceC0993G;
import p118P.C1170s;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6748i;
import p325p3.AbstractC6752m;
import p333q3.AbstractC6826a;
import p397y3.AbstractC7539a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTransientBottomBar {

    /* JADX INFO: renamed from: a */
    private final int f17731a;

    /* JADX INFO: renamed from: b */
    private final int f17732b;

    /* JADX INFO: renamed from: c */
    private final int f17733c;

    /* JADX INFO: renamed from: d */
    private final TimeInterpolator f17734d;

    /* JADX INFO: renamed from: e */
    private final TimeInterpolator f17735e;

    /* JADX INFO: renamed from: f */
    private final TimeInterpolator f17736f;

    /* JADX INFO: renamed from: g */
    private final ViewGroup f17737g;

    /* JADX INFO: renamed from: h */
    private final Context f17738h;

    /* JADX INFO: renamed from: i */
    protected final C4603r f17739i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC4604a f17740j;

    /* JADX INFO: renamed from: k */
    private int f17741k;

    /* JADX INFO: renamed from: l */
    private boolean f17742l;

    /* JADX INFO: renamed from: o */
    private int f17745o;

    /* JADX INFO: renamed from: p */
    private int f17746p;

    /* JADX INFO: renamed from: q */
    private int f17747q;

    /* JADX INFO: renamed from: r */
    private int f17748r;

    /* JADX INFO: renamed from: s */
    private int f17749s;

    /* JADX INFO: renamed from: t */
    private int f17750t;

    /* JADX INFO: renamed from: u */
    private boolean f17751u;

    /* JADX INFO: renamed from: v */
    private List f17752v;

    /* JADX INFO: renamed from: w */
    private Behavior f17753w;

    /* JADX INFO: renamed from: x */
    private final AccessibilityManager f17754x;

    /* JADX INFO: renamed from: z */
    private static final TimeInterpolator f17730z = AbstractC6826a.f27405b;

    /* JADX INFO: renamed from: A */
    private static final TimeInterpolator f17725A = AbstractC6826a.f27404a;

    /* JADX INFO: renamed from: B */
    private static final TimeInterpolator f17726B = AbstractC6826a.f27407d;

    /* JADX INFO: renamed from: D */
    private static final int[] f17728D = {AbstractC6742c.f26247c0};

    /* JADX INFO: renamed from: E */
    private static final String f17729E = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: C */
    static final Handler f17727C = new Handler(Looper.getMainLooper(), new C4593h());

    /* JADX INFO: renamed from: m */
    private boolean f17743m = false;

    /* JADX INFO: renamed from: n */
    private final Runnable f17744n = new RunnableC4594i();

    /* JADX INFO: renamed from: y */
    C4606c.b f17755y = new C4597l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: w */
        private final C4602q f17756w = new C4602q(this);

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: U */
        public void m21266U(BaseTransientBottomBar baseTransientBottomBar) {
            this.f17756w.m21271c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* JADX INFO: renamed from: J */
        public boolean mo19576J(View view) {
            return this.f17756w.m21269a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: o */
        public boolean mo10510o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f17756w.m21270b(coordinatorLayout, view, motionEvent);
            return super.mo10510o(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    class C4586a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f17757a;

        C4586a(int i7) {
            this.f17757a = i7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m21255N(this.f17757a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    class C4587b implements ValueAnimator.AnimatorUpdateListener {
        C4587b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f17739i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    class C4588c implements ValueAnimator.AnimatorUpdateListener {
        C4588c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f17739i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f17739i.setScaleY(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    class C4589d extends AnimatorListenerAdapter {
        C4589d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m21256O();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f17740j.mo21289a(BaseTransientBottomBar.this.f17733c - BaseTransientBottomBar.this.f17731a, BaseTransientBottomBar.this.f17731a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    class C4590e implements ValueAnimator.AnimatorUpdateListener {
        C4590e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f17739i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    class C4591f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f17763a;

        C4591f(int i7) {
            this.f17763a = i7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m21255N(this.f17763a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f17740j.mo21290b(0, BaseTransientBottomBar.this.f17732b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    class C4592g implements ValueAnimator.AnimatorUpdateListener {
        C4592g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f17739i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    class C4593h implements Handler.Callback {
        C4593h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == 0) {
                ((BaseTransientBottomBar) message.obj).m21260V();
                return true;
            }
            if (i7 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).m21250H(message.arg1);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    class RunnableC4594i implements Runnable {
        RunnableC4594i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f17739i == null || baseTransientBottomBar.f17738h == null) {
                return;
            }
            int iHeight = (AbstractC4548x.m20840a(BaseTransientBottomBar.this.f17738h).height() - BaseTransientBottomBar.this.m21213F()) + ((int) BaseTransientBottomBar.this.f17739i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f17749s) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f17750t = baseTransientBottomBar2.f17749s;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f17739i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f17729E, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f17750t = baseTransientBottomBar3.f17749s;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f17749s - iHeight;
            BaseTransientBottomBar.this.f17739i.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    class C4595j implements InterfaceC0993G {
        C4595j() {
        }

        @Override // p111O.InterfaceC0993G
        /* JADX INFO: renamed from: a */
        public C0982A0 mo4369a(View view, C0982A0 c0982a0) {
            BaseTransientBottomBar.this.f17745o = c0982a0.m4275i();
            BaseTransientBottomBar.this.f17746p = c0982a0.m4276j();
            BaseTransientBottomBar.this.f17747q = c0982a0.m4277k();
            BaseTransientBottomBar.this.m21225b0();
            return c0982a0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    class C4596k extends C1032a {
        C4596k() {
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            c1170s.m5051a(1048576);
            c1170s.m5077r0(true);
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: j */
        public boolean mo4588j(View view, int i7, Bundle bundle) {
            if (i7 != 1048576) {
                return super.mo4588j(view, i7, bundle);
            }
            BaseTransientBottomBar.this.mo21262w();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    class C4597l implements C4606c.b {
        C4597l() {
        }

        @Override // com.google.android.material.snackbar.C4606c.b
        /* JADX INFO: renamed from: b */
        public void mo21267b() {
            Handler handler = BaseTransientBottomBar.f17727C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C4606c.b
        /* JADX INFO: renamed from: c */
        public void mo21268c(int i7) {
            Handler handler = BaseTransientBottomBar.f17727C;
            handler.sendMessage(handler.obtainMessage(1, i7, 0, BaseTransientBottomBar.this));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    class RunnableC4598m implements Runnable {
        RunnableC4598m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.m21255N(3);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    class C4599n implements SwipeDismissBehavior.InterfaceC4411c {
        C4599n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC4411c
        /* JADX INFO: renamed from: a */
        public void mo19582a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.m21263x(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC4411c
        /* JADX INFO: renamed from: b */
        public void mo19583b(int i7) {
            if (i7 == 0) {
                C4606c.m21293c().m21304k(BaseTransientBottomBar.this.f17755y);
            } else if (i7 == 1 || i7 == 2) {
                C4606c.m21293c().m21303j(BaseTransientBottomBar.this.f17755y);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    class RunnableC4600o implements Runnable {
        RunnableC4600o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4603r c4603r = BaseTransientBottomBar.this.f17739i;
            if (c4603r == null) {
                return;
            }
            if (c4603r.getParent() != null) {
                BaseTransientBottomBar.this.f17739i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f17739i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.m21219X();
            } else {
                BaseTransientBottomBar.this.m21221Z();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    class C4601p extends AnimatorListenerAdapter {
        C4601p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m21256O();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    public static class C4602q {

        /* JADX INFO: renamed from: a */
        private C4606c.b f17774a;

        public C4602q(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.m19579Q(0.1f);
            swipeDismissBehavior.m19577O(0.6f);
            swipeDismissBehavior.m19580R(0);
        }

        /* JADX INFO: renamed from: a */
        public boolean m21269a(View view) {
            return view instanceof C4603r;
        }

        /* JADX INFO: renamed from: b */
        public void m21270b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.m10473F(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    C4606c.m21293c().m21303j(this.f17774a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                C4606c.m21293c().m21304k(this.f17774a);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m21271c(BaseTransientBottomBar baseTransientBottomBar) {
            this.f17774a = baseTransientBottomBar.f17755y;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    protected static class C4603r extends FrameLayout {

        /* JADX INFO: renamed from: w */
        private static final View.OnTouchListener f17775w = new a();

        /* JADX INFO: renamed from: a */
        private BaseTransientBottomBar f17776a;

        /* JADX INFO: renamed from: b */
        C0627n f17777b;

        /* JADX INFO: renamed from: c */
        private int f17778c;

        /* JADX INFO: renamed from: d */
        private final float f17779d;

        /* JADX INFO: renamed from: e */
        private final float f17780e;

        /* JADX INFO: renamed from: f */
        private final int f17781f;

        /* JADX INFO: renamed from: r */
        private final int f17782r;

        /* JADX INFO: renamed from: s */
        private ColorStateList f17783s;

        /* JADX INFO: renamed from: t */
        private PorterDuff.Mode f17784t;

        /* JADX INFO: renamed from: u */
        private Rect f17785u;

        /* JADX INFO: renamed from: v */
        private boolean f17786v;

        /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r$a */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected C4603r(Context context, AttributeSet attributeSet) {
            super(AbstractC0842a.m3884d(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC6752m.f27061t7);
            int i7 = AbstractC6752m.f26570A7;
            if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(i7, 0));
            }
            this.f17778c = typedArrayObtainStyledAttributes.getInt(AbstractC6752m.f27094w7, 0);
            if (typedArrayObtainStyledAttributes.hasValue(AbstractC6752m.f26592C7) || typedArrayObtainStyledAttributes.hasValue(AbstractC6752m.f26603D7)) {
                this.f17777b = C0627n.m2758e(context2, attributeSet, 0, 0).m2802m();
            }
            this.f17779d = typedArrayObtainStyledAttributes.getFloat(AbstractC6752m.f27105x7, 1.0f);
            setBackgroundTintList(AbstractC0423c.m1825a(context2, typedArrayObtainStyledAttributes, AbstractC6752m.f27116y7));
            setBackgroundTintMode(AbstractC4546v.m20835j(typedArrayObtainStyledAttributes.getInt(AbstractC6752m.f27127z7, -1), PorterDuff.Mode.SRC_IN));
            this.f17780e = typedArrayObtainStyledAttributes.getFloat(AbstractC6752m.f27083v7, 1.0f);
            this.f17781f = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6752m.f27072u7, -1);
            this.f17782r = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6752m.f26581B7, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f17775w);
            setFocusable(true);
            if (getBackground() == null) {
                setBackground(m21274d());
            }
        }

        /* JADX INFO: renamed from: d */
        private Drawable m21274d() {
            int iM33180k = AbstractC7539a.m33180k(this, AbstractC6742c.f26262k, AbstractC6742c.f26256h, getBackgroundOverlayColorAlpha());
            C0627n c0627n = this.f17777b;
            Drawable drawableM21244v = c0627n != null ? BaseTransientBottomBar.m21244v(iM33180k, c0627n) : BaseTransientBottomBar.m21243u(iM33180k, getResources());
            if (this.f17783s == null) {
                return AbstractC0400a.m1712r(drawableM21244v);
            }
            Drawable drawableM1712r = AbstractC0400a.m1712r(drawableM21244v);
            drawableM1712r.setTintList(this.f17783s);
            return drawableM1712r;
        }

        /* JADX INFO: renamed from: e */
        private void m21275e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f17785u = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.f17776a = baseTransientBottomBar;
        }

        /* JADX INFO: renamed from: c */
        void m21276c(ViewGroup viewGroup) {
            this.f17786v = true;
            viewGroup.addView(this);
            this.f17786v = false;
        }

        float getActionTextColorAlpha() {
            return this.f17780e;
        }

        int getAnimationMode() {
            return this.f17778c;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f17779d;
        }

        int getMaxInlineActionWidth() {
            return this.f17782r;
        }

        int getMaxWidth() {
            return this.f17781f;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f17776a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m21252K();
            }
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f17776a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m21253L();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
            super.onLayout(z7, i7, i8, i9, i10);
            BaseTransientBottomBar baseTransientBottomBar = this.f17776a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m21254M();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i7, int i8) {
            super.onMeasure(i7, i8);
            if (this.f17781f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i9 = this.f17781f;
                if (measuredWidth > i9) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i8);
                }
            }
        }

        void setAnimationMode(int i7) {
            this.f17778c = i7;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f17783s != null) {
                drawable = AbstractC0400a.m1712r(drawable.mutate());
                drawable.setTintList(this.f17783s);
                drawable.setTintMode(this.f17784t);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f17783s = colorStateList;
            if (getBackground() != null) {
                Drawable drawableM1712r = AbstractC0400a.m1712r(getBackground().mutate());
                drawableM1712r.setTintList(colorStateList);
                drawableM1712r.setTintMode(this.f17784t);
                if (drawableM1712r != getBackground()) {
                    super.setBackgroundDrawable(drawableM1712r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f17784t = mode;
            if (getBackground() != null) {
                Drawable drawableM1712r = AbstractC0400a.m1712r(getBackground().mutate());
                drawableM1712r.setTintMode(mode);
                if (drawableM1712r != getBackground()) {
                    super.setBackgroundDrawable(drawableM1712r);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f17786v || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            m21275e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar baseTransientBottomBar = this.f17776a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m21225b0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f17775w);
            super.setOnClickListener(onClickListener);
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, InterfaceC4604a interfaceC4604a) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (interfaceC4604a == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f17737g = viewGroup;
        this.f17740j = interfaceC4604a;
        this.f17738h = context;
        AbstractC4543s.m20810a(context);
        C4603r c4603r = (C4603r) LayoutInflater.from(context).inflate(m21248D(), viewGroup, false);
        this.f17739i = c4603r;
        c4603r.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.m21291c(c4603r.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(c4603r.getMaxInlineActionWidth());
        }
        c4603r.addView(view);
        c4603r.setAccessibilityLiveRegion(1);
        c4603r.setImportantForAccessibility(1);
        c4603r.setFitsSystemWindows(true);
        AbstractC1030Z.m4494t0(c4603r, new C4595j());
        AbstractC1030Z.m4474j0(c4603r, new C4596k());
        this.f17754x = (AccessibilityManager) context.getSystemService("accessibility");
        int i7 = AbstractC6742c.f26224I;
        this.f17733c = AbstractC0196h.m978f(context, i7, 250);
        this.f17731a = AbstractC0196h.m978f(context, i7, 150);
        this.f17732b = AbstractC0196h.m978f(context, AbstractC6742c.f26225J, 75);
        int i8 = AbstractC6742c.f26234S;
        this.f17734d = AbstractC0196h.m979g(context, i8, f17725A);
        this.f17736f = AbstractC0196h.m979g(context, i8, f17726B);
        this.f17735e = AbstractC0196h.m979g(context, i8, f17730z);
    }

    /* JADX INFO: renamed from: C */
    private ValueAnimator m21211C(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f17736f);
        valueAnimatorOfFloat.addUpdateListener(new C4588c());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: E */
    private int m21212E() {
        int height = this.f17739i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f17739i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public int m21213F() {
        int[] iArr = new int[2];
        this.f17739i.getLocationInWindow(iArr);
        return iArr[1] + this.f17739i.getHeight();
    }

    /* JADX INFO: renamed from: J */
    private boolean m21214J() {
        ViewGroup.LayoutParams layoutParams = this.f17739i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C2426f) && (((CoordinatorLayout.C2426f) layoutParams).m10530f() instanceof SwipeDismissBehavior);
    }

    /* JADX INFO: renamed from: P */
    private void m21215P() {
        this.f17748r = m21242t();
        m21225b0();
    }

    /* JADX INFO: renamed from: R */
    private void m21216R(CoordinatorLayout.C2426f c2426f) {
        SwipeDismissBehavior swipeDismissBehaviorM21247B = this.f17753w;
        if (swipeDismissBehaviorM21247B == null) {
            swipeDismissBehaviorM21247B = m21247B();
        }
        if (swipeDismissBehaviorM21247B instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorM21247B).m21266U(this);
        }
        swipeDismissBehaviorM21247B.m19578P(new C4599n());
        c2426f.m10538o(swipeDismissBehaviorM21247B);
        if (m21264z() == null) {
            c2426f.f9261g = 80;
        }
    }

    /* JADX INFO: renamed from: T */
    private boolean m21217T() {
        return this.f17749s > 0 && !this.f17742l && m21214J();
    }

    /* JADX INFO: renamed from: W */
    private void m21218W() {
        if (m21258S()) {
            m21261r();
            return;
        }
        if (this.f17739i.getParent() != null) {
            this.f17739i.setVisibility(0);
        }
        m21256O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public void m21219X() {
        ValueAnimator valueAnimatorM21245y = m21245y(0.0f, 1.0f);
        ValueAnimator valueAnimatorM21211C = m21211C(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorM21245y, valueAnimatorM21211C);
        animatorSet.setDuration(this.f17731a);
        animatorSet.addListener(new C4601p());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: Y */
    private void m21220Y(int i7) {
        ValueAnimator valueAnimatorM21245y = m21245y(1.0f, 0.0f);
        valueAnimatorM21245y.setDuration(this.f17732b);
        valueAnimatorM21245y.addListener(new C4586a(i7));
        valueAnimatorM21245y.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public void m21221Z() {
        int iM21212E = m21212E();
        this.f17739i.setTranslationY(iM21212E);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iM21212E, 0);
        valueAnimator.setInterpolator(this.f17735e);
        valueAnimator.setDuration(this.f17733c);
        valueAnimator.addListener(new C4589d());
        valueAnimator.addUpdateListener(new C4590e());
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: a0 */
    private void m21223a0(int i7) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m21212E());
        valueAnimator.setInterpolator(this.f17735e);
        valueAnimator.setDuration(this.f17733c);
        valueAnimator.addListener(new C4591f(i7));
        valueAnimator.addUpdateListener(new C4592g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public void m21225b0() {
        ViewGroup.LayoutParams layoutParams = this.f17739i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(f17729E, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f17739i.f17785u == null) {
            Log.w(f17729E, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f17739i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i7 = this.f17739i.f17785u.bottom + (m21264z() != null ? this.f17748r : this.f17745o);
        int i8 = this.f17739i.f17785u.left + this.f17746p;
        int i9 = this.f17739i.f17785u.right + this.f17747q;
        int i10 = this.f17739i.f17785u.top;
        boolean z7 = (marginLayoutParams.bottomMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9 && marginLayoutParams.topMargin == i10) ? false : true;
        if (z7) {
            marginLayoutParams.bottomMargin = i7;
            marginLayoutParams.leftMargin = i8;
            marginLayoutParams.rightMargin = i9;
            marginLayoutParams.topMargin = i10;
            this.f17739i.requestLayout();
        }
        if ((z7 || this.f17750t != this.f17749s) && Build.VERSION.SDK_INT >= 29 && m21217T()) {
            this.f17739i.removeCallbacks(this.f17744n);
            this.f17739i.post(this.f17744n);
        }
    }

    /* JADX INFO: renamed from: s */
    private void m21241s(int i7) {
        if (this.f17739i.getAnimationMode() == 1) {
            m21220Y(i7);
        } else {
            m21223a0(i7);
        }
    }

    /* JADX INFO: renamed from: t */
    private int m21242t() {
        if (m21264z() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        m21264z().getLocationOnScreen(iArr);
        int i7 = iArr[1];
        int[] iArr2 = new int[2];
        this.f17737g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f17737g.getHeight()) - i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static GradientDrawable m21243u(int i7, Resources resources) {
        float dimension = resources.getDimension(AbstractC6744e.f26381y0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i7);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static C0622i m21244v(int i7, C0627n c0627n) {
        C0622i c0622i = new C0622i(c0627n);
        c0622i.m2718g0(ColorStateList.valueOf(i7));
        return c0622i;
    }

    /* JADX INFO: renamed from: y */
    private ValueAnimator m21245y(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f17734d);
        valueAnimatorOfFloat.addUpdateListener(new C4587b());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: A */
    public int mo21246A() {
        return this.f17741k;
    }

    /* JADX INFO: renamed from: B */
    protected SwipeDismissBehavior m21247B() {
        return new Behavior();
    }

    /* JADX INFO: renamed from: D */
    protected int m21248D() {
        return m21249G() ? AbstractC6748i.f26447A : AbstractC6748i.f26453b;
    }

    /* JADX INFO: renamed from: G */
    protected boolean m21249G() {
        TypedArray typedArrayObtainStyledAttributes = this.f17738h.obtainStyledAttributes(f17728D);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* JADX INFO: renamed from: H */
    final void m21250H(int i7) {
        if (m21258S() && this.f17739i.getVisibility() == 0) {
            m21241s(i7);
        } else {
            m21255N(i7);
        }
    }

    /* JADX INFO: renamed from: I */
    public boolean m21251I() {
        return C4606c.m21293c().m21300e(this.f17755y);
    }

    /* JADX INFO: renamed from: K */
    void m21252K() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f17739i.getRootWindowInsets()) == null) {
            return;
        }
        this.f17749s = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        m21225b0();
    }

    /* JADX INFO: renamed from: L */
    void m21253L() {
        if (m21251I()) {
            f17727C.post(new RunnableC4598m());
        }
    }

    /* JADX INFO: renamed from: M */
    void m21254M() {
        if (this.f17751u) {
            m21218W();
            this.f17751u = false;
        }
    }

    /* JADX INFO: renamed from: N */
    void m21255N(int i7) {
        int size;
        C4606c.m21293c().m21301h(this.f17755y);
        List list = this.f17752v;
        if (list != null && (size = list.size() - 1) >= 0) {
            AbstractC2263x.m9328a(this.f17752v.get(size));
            throw null;
        }
        ViewParent parent = this.f17739i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f17739i);
        }
    }

    /* JADX INFO: renamed from: O */
    void m21256O() {
        int size;
        C4606c.m21293c().m21302i(this.f17755y);
        List list = this.f17752v;
        if (list == null || (size = list.size() - 1) < 0) {
            return;
        }
        AbstractC2263x.m9328a(this.f17752v.get(size));
        throw null;
    }

    /* JADX INFO: renamed from: Q */
    public BaseTransientBottomBar m21257Q(int i7) {
        this.f17741k = i7;
        return this;
    }

    /* JADX INFO: renamed from: S */
    boolean m21258S() {
        AccessibilityManager accessibilityManager = this.f17754x;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX INFO: renamed from: U */
    public void mo21259U() {
        C4606c.m21293c().m21305m(mo21246A(), this.f17755y);
    }

    /* JADX INFO: renamed from: V */
    final void m21260V() {
        if (this.f17739i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f17739i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C2426f) {
                m21216R((CoordinatorLayout.C2426f) layoutParams);
            }
            this.f17739i.m21276c(this.f17737g);
            m21215P();
            this.f17739i.setVisibility(4);
        }
        if (this.f17739i.isLaidOut()) {
            m21218W();
        } else {
            this.f17751u = true;
        }
    }

    /* JADX INFO: renamed from: r */
    void m21261r() {
        this.f17739i.post(new RunnableC4600o());
    }

    /* JADX INFO: renamed from: w */
    public void mo21262w() {
        m21263x(3);
    }

    /* JADX INFO: renamed from: x */
    protected void m21263x(int i7) {
        C4606c.m21293c().m21298b(this.f17755y, i7);
    }

    /* JADX INFO: renamed from: z */
    public View m21264z() {
        return null;
    }
}
