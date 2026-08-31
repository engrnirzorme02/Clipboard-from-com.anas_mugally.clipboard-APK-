package p371v1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.AbstractC2436b;
import com.anas_mugally.clipboard.R;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6128x;
import p111O.AbstractC1030Z;
import p145S5.C1435m;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: v1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7210k {

    /* JADX INFO: renamed from: a */
    private final Context f28747a;

    /* JADX INFO: renamed from: b */
    private PopupWindow f28748b;

    /* JADX INFO: renamed from: v1.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final Drawable f28749a;

        /* JADX INFO: renamed from: b */
        private final String f28750b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC5356a f28751c;

        public a(Drawable drawable, String contentDescription, InterfaceC5356a onClick) {
            AbstractC6118n.m27187e(contentDescription, "contentDescription");
            AbstractC6118n.m27187e(onClick, "onClick");
            this.f28749a = drawable;
            this.f28750b = contentDescription;
            this.f28751c = onClick;
        }

        /* JADX INFO: renamed from: a */
        public final String m31827a() {
            return this.f28750b;
        }

        /* JADX INFO: renamed from: b */
        public final Drawable m31828b() {
            return this.f28749a;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC5356a m31829c() {
            return this.f28751c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6118n.m27183a(this.f28749a, aVar.f28749a) && AbstractC6118n.m27183a(this.f28750b, aVar.f28750b) && AbstractC6118n.m27183a(this.f28751c, aVar.f28751c);
        }

        public int hashCode() {
            Drawable drawable = this.f28749a;
            return ((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f28750b.hashCode()) * 31) + this.f28751c.hashCode();
        }

        public String toString() {
            return "AdditionalAction(icon=" + this.f28749a + ", contentDescription=" + this.f28750b + ", onClick=" + this.f28751c + ')';
        }
    }

    /* JADX INFO: renamed from: v1.k$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void m31832a(d dVar);

        void onDismiss();
    }

    /* JADX INFO: renamed from: v1.k$e */
    public static final class e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5356a f28759a;

        e(InterfaceC5356a interfaceC5356a) {
            this.f28759a = interfaceC5356a;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            AbstractC6118n.m27187e(animation, "animation");
            this.f28759a.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AbstractC6118n.m27187e(animation, "animation");
            this.f28759a.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            AbstractC6118n.m27187e(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AbstractC6118n.m27187e(animation, "animation");
        }
    }

    public C7210k(Context context) {
        AbstractC6118n.m27187e(context, "context");
        this.f28747a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C1444v m31784A(C7210k c7210k, a aVar) {
        c7210k.m31824B();
        aVar.m31829c().invoke();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: C */
    private final float m31785C(float f7) {
        return f7 * this.f28747a.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: D */
    private final int m31786D() {
        return AbstractC2436b.getColor(this.f28747a, R.color.my_background);
    }

    /* JADX INFO: renamed from: E */
    private final int m31787E() {
        return Color.parseColor(m31793K() ? "#33FFFFFF" : "#33000000");
    }

    /* JADX INFO: renamed from: F */
    private final int m31788F() {
        return Color.parseColor(m31793K() ? "#33FFFFFF" : "#33000000");
    }

    /* JADX INFO: renamed from: G */
    private final int m31789G() {
        return ((Number) m31791I().m6069b()).intValue();
    }

    /* JADX INFO: renamed from: H */
    private final int m31790H() {
        return Color.parseColor(m31793K() ? "#1AFFFFFF" : "#1A000000");
    }

    /* JADX INFO: renamed from: I */
    private final C1435m m31791I() {
        Object systemService = this.f28747a.getSystemService("window");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return new C1435m(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }

    /* JADX INFO: renamed from: J */
    private final int m31792J() {
        return this.f28747a.getColor(R.color.colorTextView);
    }

    /* JADX INFO: renamed from: K */
    private final boolean m31793K() {
        return (this.f28747a.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: L */
    private final void m31794L(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        AbstractC1030Z.m4506z0(view, 0.0f);
        view.clearAnimation();
    }

    /* JADX INFO: renamed from: M */
    private final void m31795M(LinearLayout linearLayout, boolean z7) {
        if (z7) {
            linearLayout.setBackgroundResource(R.drawable.ai_background);
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(m31786D());
            gradientDrawable.setCornerRadius(m31785C(16.0f));
            gradientDrawable.setStroke((int) m31785C(1.0f), m31787E());
            linearLayout.setBackground(gradientDrawable);
        }
        AbstractC1030Z.m4486p0(linearLayout, m31785C(12.0f));
        int iM31785C = (int) m31785C(8.0f);
        linearLayout.setPadding(iM31785C, iM31785C, iM31785C, iM31785C);
        linearLayout.setMinimumWidth((int) m31785C(120.0f));
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m31796O(C7210k c7210k, View view, List list, c cVar, List list2, boolean z7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            cVar = null;
        }
        c cVar2 = cVar;
        if ((i7 & 8) != 0) {
            list2 = AbstractC1638q.m6765j();
        }
        List list3 = list2;
        if ((i7 & 16) != 0) {
            z7 = false;
        }
        c7210k.m31825N(view, list, cVar2, list3, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final void m31797P(C7210k c7210k, c cVar) {
        c7210k.f28748b = null;
        if (cVar != null) {
            cVar.onDismiss();
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m31798Q(PopupWindow popupWindow, View view, View view2, int i7) {
        int height;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i8 = iArr[1];
        int i9 = iArr[0];
        int i10 = this.f28747a.getResources().getDisplayMetrics().heightPixels;
        view2.measure(View.MeasureSpec.makeMeasureSpec(this.f28747a.getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
        int measuredHeight = view2.getMeasuredHeight();
        view2.getMeasuredWidth();
        if (measuredHeight <= i10 - (view.getHeight() + i8)) {
            height = i8 + view.getHeight();
        } else {
            height = measuredHeight <= i8 ? i8 - measuredHeight : (i10 - measuredHeight) / 2;
        }
        popupWindow.showAtLocation(view, 0, i9, height);
        m31811m(view2);
    }

    /* JADX INFO: renamed from: j */
    private final void m31808j(View view, InterfaceC5356a interfaceC5356a) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.95f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", 0.95f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.95f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 0.95f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat3);
        animatorSet.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat4).after(objectAnimatorOfFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new e(interfaceC5356a));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: k */
    private final void m31809k(View view, boolean z7) {
        float f7 = z7 ? 0.96f : 1.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), f7);
        objectAnimatorOfFloat.setDuration(50L);
        objectAnimatorOfFloat.start();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), f7);
        objectAnimatorOfFloat2.setDuration(50L);
        objectAnimatorOfFloat2.start();
    }

    /* JADX INFO: renamed from: l */
    private final void m31810l(LinearLayout linearLayout) {
        int childCount = linearLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = linearLayout.getChildAt(i7);
            childAt.setAlpha(0.0f);
            childAt.setTranslationX(m31785C(30.0f));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "alpha", 0.0f, 1.0f);
            long j7 = ((long) i7) * 50;
            objectAnimatorOfFloat.setStartDelay(j7);
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat.start();
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt, "translationX", m31785C(30.0f), 0.0f);
            objectAnimatorOfFloat2.setStartDelay(j7);
            objectAnimatorOfFloat2.setDuration(125L);
            objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat2.start();
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m31811m(View view) {
        LinearLayout linearLayout;
        view.setAlpha(0.0f);
        view.setScaleX(0.3f);
        view.setScaleY(0.3f);
        view.setTranslationY(-m31785C(20.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(view, "scaleX", 0.3f, 1.0f), ObjectAnimator.ofFloat(view, "scaleY", 0.3f, 1.0f), ObjectAnimator.ofFloat(view, "translationY", -m31785C(20.0f), 0.0f));
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(new OvershootInterpolator(0.8f));
        animatorSet.start();
        if (view instanceof MaterialCardView) {
            View childAt = ((MaterialCardView) view).getChildAt(0);
            ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
            View childAt2 = scrollView != null ? scrollView.getChildAt(0) : null;
            linearLayout = childAt2 instanceof LinearLayout ? (LinearLayout) childAt2 : null;
            if (linearLayout != null) {
                m31810l(linearLayout);
                return;
            }
            return;
        }
        if (!(view instanceof ScrollView)) {
            if (view instanceof LinearLayout) {
                m31810l((LinearLayout) view);
            }
        } else {
            View childAt3 = ((ScrollView) view).getChildAt(0);
            linearLayout = childAt3 instanceof LinearLayout ? (LinearLayout) childAt3 : null;
            if (linearLayout != null) {
                m31810l(linearLayout);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private final View m31812o() {
        View view = new View(this.f28747a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) m31785C(1.0f));
        int iM31785C = (int) m31785C(8.0f);
        layoutParams.setMargins(iM31785C, iM31785C, iM31785C, iM31785C);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(m31788F());
        return view;
    }

    /* JADX INFO: renamed from: p */
    private final LinearLayout m31813p() {
        LinearLayout linearLayout = new LinearLayout(this.f28747a);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    /* JADX INFO: renamed from: q */
    private final Drawable m31814q() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(m31785C(8.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(m31790H());
        gradientDrawable2.setCornerRadius(m31785C(8.0f));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: renamed from: r */
    private final ScrollView m31815r() {
        final int iM31789G = m31789G();
        final ScrollView scrollView = new ScrollView(this.f28747a);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        scrollView.setScrollbarFadingEnabled(true);
        scrollView.setScrollBarStyle(0);
        scrollView.setVerticalScrollBarEnabled(true);
        scrollView.setOverScrollMode(1);
        scrollView.setSmoothScrollingEnabled(true);
        scrollView.post(new Runnable() { // from class: v1.c
            @Override // java.lang.Runnable
            public final void run() {
                C7210k.m31816s(scrollView, iM31789G);
            }
        });
        return scrollView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m31816s(ScrollView scrollView, int i7) {
        ViewGroup.LayoutParams layoutParams = scrollView.getLayoutParams();
        if (scrollView.getMeasuredHeight() > i7) {
            layoutParams.height = i7;
            scrollView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: t */
    private final LinearLayout m31817t(final d dVar, int i7, final c cVar) {
        final C7210k c7210k;
        final LinearLayout linearLayout = new LinearLayout(this.f28747a);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setMinimumHeight((int) m31785C(48.0f));
        int iM31785C = (int) m31785C(5.0f);
        linearLayout.setPadding(iM31785C, 0, iM31785C, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        final C6128x c6128x = new C6128x();
        final C6128x c6128x2 = new C6128x();
        linearLayout.setBackground(m31814q());
        linearLayout.setOnClickListener(new View.OnClickListener(this, linearLayout, dVar, cVar) { // from class: v1.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C7210k f28727b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ LinearLayout f28728c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C7210k.d f28729d;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7210k.m31821x(this.f28726a, this.f28727b, this.f28728c, this.f28729d, null, view);
            }
        });
        if (dVar.m31836d() != null) {
            c7210k = this;
            linearLayout.setOnLongClickListener(new View.OnLongClickListener(c7210k, linearLayout, dVar, cVar) { // from class: v1.e

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C7210k f28731b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ LinearLayout f28732c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C7210k.d f28733d;

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return C7210k.m31818u(this.f28730a, this.f28731b, this.f28732c, this.f28733d, null, view);
                }
            });
        } else {
            c7210k = this;
        }
        linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: v1.f
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C7210k.m31820w(c6128x, c6128x2, this, view, motionEvent);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(c7210k.f28747a);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (dVar.m31834b() != null) {
            ImageView imageView = new ImageView(c7210k.f28747a);
            imageView.setImageDrawable(dVar.m31834b().m31830a());
            if (dVar.m31834b().m31831b()) {
                imageView.setColorFilter(m31792J());
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) m31785C(24.0f), (int) m31785C(24.0f));
            layoutParams2.setMarginEnd((int) m31785C(12.0f));
            imageView.setLayoutParams(layoutParams2);
            linearLayout2.addView(imageView);
        } else {
            View view = new View(c7210k.f28747a);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) m31785C(24.0f), (int) m31785C(24.0f));
            layoutParams3.setMarginEnd((int) m31785C(12.0f));
            view.setLayoutParams(layoutParams3);
            linearLayout2.addView(view);
        }
        TextView textView = new TextView(c7210k.f28747a);
        textView.setText(dVar.m31837e());
        textView.setTextSize(16.0f);
        textView.setTextColor(m31792J());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
        if (!dVar.m31833a().isEmpty()) {
            for (final a aVar : dVar.m31833a()) {
                final ImageView imageView2 = new ImageView(c7210k.f28747a);
                imageView2.setImageDrawable(aVar.m31828b());
                imageView2.setColorFilter(m31792J());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) m31785C(32.0f), (int) m31785C(32.0f));
                layoutParams4.setMargins((int) m31785C(4.0f), 0, (int) m31785C(4.0f), 0);
                imageView2.setLayoutParams(layoutParams4);
                imageView2.setPadding((int) m31785C(4.0f), (int) m31785C(4.0f), (int) m31785C(4.0f), (int) m31785C(4.0f));
                imageView2.setContentDescription(aVar.m31827a());
                imageView2.setBackground(m31814q());
                final C6128x c6128x3 = new C6128x();
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: v1.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C7210k.m31823z(c6128x3, this, imageView2, aVar, view2);
                    }
                });
                linearLayout.addView(imageView2);
            }
        }
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final boolean m31818u(C6128x c6128x, final C7210k c7210k, LinearLayout linearLayout, final d dVar, final c cVar, View view) {
        if (c6128x.f23885a) {
            return false;
        }
        c6128x.f23885a = true;
        c7210k.m31808j(linearLayout, new InterfaceC5356a(dVar, cVar) { // from class: v1.i

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C7210k.d f28744b;

            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C7210k.m31819v(this.f28743a, this.f28744b, null);
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C1444v m31819v(C7210k c7210k, d dVar, c cVar) {
        c7210k.m31824B();
        dVar.m31836d().invoke();
        if (cVar != null) {
            cVar.m31832a(dVar);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final boolean m31820w(C6128x c6128x, C6128x c6128x2, C7210k c7210k, View view, MotionEvent motionEvent) {
        if (c6128x.f23885a) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            c6128x2.f23885a = true;
            AbstractC6118n.m27184b(view);
            c7210k.m31809k(view, true);
        } else if (action != 1) {
            if (action == 3) {
                c6128x2.f23885a = false;
                AbstractC6118n.m27184b(view);
                c7210k.m31794L(view);
            }
        } else if (c6128x2.f23885a) {
            c6128x2.f23885a = false;
            AbstractC6118n.m27184b(view);
            c7210k.m31809k(view, false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m31821x(C6128x c6128x, final C7210k c7210k, LinearLayout linearLayout, final d dVar, final c cVar, View view) {
        if (c6128x.f23885a) {
            return;
        }
        c6128x.f23885a = true;
        c7210k.m31808j(linearLayout, new InterfaceC5356a(dVar, cVar) { // from class: v1.j

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C7210k.d f28746b;

            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C7210k.m31822y(this.f28745a, this.f28746b, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C1444v m31822y(C7210k c7210k, d dVar, c cVar) {
        c7210k.m31824B();
        dVar.m31835c().invoke();
        if (cVar != null) {
            cVar.m31832a(dVar);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m31823z(C6128x c6128x, final C7210k c7210k, ImageView imageView, final a aVar, View view) {
        if (c6128x.f23885a) {
            return;
        }
        c6128x.f23885a = true;
        c7210k.m31808j(imageView, new InterfaceC5356a() { // from class: v1.h
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C7210k.m31784A(this.f28741a, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final void m31824B() {
        PopupWindow popupWindow = this.f28748b;
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        this.f28748b = null;
    }

    /* JADX INFO: renamed from: N */
    public final void m31825N(View anchor, List items, final c cVar, List showDividers, boolean z7) {
        AbstractC6118n.m27187e(anchor, "anchor");
        AbstractC6118n.m27187e(items, "items");
        AbstractC6118n.m27187e(showDividers, "showDividers");
        m31824B();
        if (items.isEmpty()) {
            if (cVar != null) {
                cVar.onDismiss();
                return;
            }
            return;
        }
        try {
            MaterialCardView materialCardView = new MaterialCardView(this.f28747a);
            materialCardView.setRadius(m31785C(16.0f));
            materialCardView.setCardElevation(m31785C(5.0f));
            materialCardView.setCardBackgroundColor(m31786D());
            materialCardView.setUseCompatPadding(true);
            int i7 = 0;
            materialCardView.setPreventCornerOverlap(false);
            ScrollView scrollViewM31815r = m31815r();
            materialCardView.addView(scrollViewM31815r);
            LinearLayout linearLayoutM31813p = m31813p();
            m31795M(linearLayoutM31813p, z7);
            for (Object obj : items) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    AbstractC1638q.m6773r();
                }
                d dVar = (d) obj;
                if (showDividers.contains(Integer.valueOf(i7))) {
                    linearLayoutM31813p.addView(m31812o());
                }
                linearLayoutM31813p.addView(m31817t(dVar, i7, cVar));
                i7 = i8;
            }
            scrollViewM31815r.addView(linearLayoutM31813p);
            PopupWindow popupWindow = new PopupWindow((View) materialCardView, -2, -2, true);
            popupWindow.setElevation(m31785C(24.0f));
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(true);
            popupWindow.setBackgroundDrawable(null);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener(cVar) { // from class: v1.b
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    C7210k.m31797P(this.f28723a, null);
                }
            });
            this.f28748b = popupWindow;
            AbstractC6118n.m27184b(popupWindow);
            m31798Q(popupWindow, anchor, materialCardView, items.size());
        } catch (Exception unused) {
            if (cVar != null) {
                cVar.onDismiss();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m31826n() {
        try {
            m31824B();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: v1.k$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final Drawable f28752a;

        /* JADX INFO: renamed from: b */
        private final boolean f28753b;

        public b(Drawable drawable, boolean z7) {
            this.f28752a = drawable;
            this.f28753b = z7;
        }

        /* JADX INFO: renamed from: a */
        public final Drawable m31830a() {
            return this.f28752a;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m31831b() {
            return this.f28753b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6118n.m27183a(this.f28752a, bVar.f28752a) && this.f28753b == bVar.f28753b;
        }

        public int hashCode() {
            Drawable drawable = this.f28752a;
            return ((drawable == null ? 0 : drawable.hashCode()) * 31) + Boolean.hashCode(this.f28753b);
        }

        public String toString() {
            return "IconItem(icon=" + this.f28752a + ", tintable=" + this.f28753b + ')';
        }

        public /* synthetic */ b(Drawable drawable, boolean z7, int i7, AbstractC6112h abstractC6112h) {
            this(drawable, (i7 & 2) != 0 ? true : z7);
        }
    }

    /* JADX INFO: renamed from: v1.k$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private final CharSequence f28754a;

        /* JADX INFO: renamed from: b */
        private final b f28755b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC5356a f28756c;

        /* JADX INFO: renamed from: d */
        private final InterfaceC5356a f28757d;

        /* JADX INFO: renamed from: e */
        private final List f28758e;

        public d(CharSequence title, b bVar, InterfaceC5356a onClick, InterfaceC5356a interfaceC5356a, List additionalActions) {
            AbstractC6118n.m27187e(title, "title");
            AbstractC6118n.m27187e(onClick, "onClick");
            AbstractC6118n.m27187e(additionalActions, "additionalActions");
            this.f28754a = title;
            this.f28755b = bVar;
            this.f28756c = onClick;
            this.f28757d = interfaceC5356a;
            this.f28758e = additionalActions;
        }

        /* JADX INFO: renamed from: a */
        public final List m31833a() {
            return this.f28758e;
        }

        /* JADX INFO: renamed from: b */
        public final b m31834b() {
            return this.f28755b;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC5356a m31835c() {
            return this.f28756c;
        }

        /* JADX INFO: renamed from: d */
        public final InterfaceC5356a m31836d() {
            return this.f28757d;
        }

        /* JADX INFO: renamed from: e */
        public final CharSequence m31837e() {
            return this.f28754a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC6118n.m27183a(this.f28754a, dVar.f28754a) && AbstractC6118n.m27183a(this.f28755b, dVar.f28755b) && AbstractC6118n.m27183a(this.f28756c, dVar.f28756c) && AbstractC6118n.m27183a(this.f28757d, dVar.f28757d) && AbstractC6118n.m27183a(this.f28758e, dVar.f28758e);
        }

        public int hashCode() {
            int iHashCode = this.f28754a.hashCode() * 31;
            b bVar = this.f28755b;
            int iHashCode2 = (((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f28756c.hashCode()) * 31;
            InterfaceC5356a interfaceC5356a = this.f28757d;
            return ((iHashCode2 + (interfaceC5356a != null ? interfaceC5356a.hashCode() : 0)) * 31) + this.f28758e.hashCode();
        }

        public String toString() {
            return "PopupMenuItem(title=" + ((Object) this.f28754a) + ", IconItem=" + this.f28755b + ", onClick=" + this.f28756c + ", onLongClick=" + this.f28757d + ", additionalActions=" + this.f28758e + ')';
        }

        public /* synthetic */ d(CharSequence charSequence, b bVar, InterfaceC5356a interfaceC5356a, InterfaceC5356a interfaceC5356a2, List list, int i7, AbstractC6112h abstractC6112h) {
            this(charSequence, (i7 & 2) != 0 ? null : bVar, interfaceC5356a, (i7 & 8) != 0 ? null : interfaceC5356a2, (i7 & 16) != 0 ? AbstractC1638q.m6765j() : list);
        }
    }
}
