package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AbstractC2358i0;
import androidx.core.widget.AbstractC2458i;
import androidx.viewpager.widget.AbstractC2869a;
import androidx.viewpager.widget.AbstractC2870b;
import com.google.android.gms.common.api.C3553a;
import com.google.android.material.drawable.AbstractC4498d;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.AbstractC4546v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p029D3.AbstractC0196h;
import p041F.AbstractC0400a;
import p045F3.AbstractC0423c;
import p053G3.AbstractC0481a;
import p069I3.AbstractC0623j;
import p069I3.C0622i;
import p093L3.AbstractC0842a;
import p104N.C0908e;
import p104N.C0909f;
import p104N.InterfaceC0907d;
import p111O.AbstractC1030Z;
import p111O.C1001K;
import p118P.C1170s;
import p255h.AbstractC5529j;
import p263i.AbstractC5659a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6748i;
import p325p3.AbstractC6750k;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p333q3.AbstractC6826a;
import p341r3.AbstractC6900c;
import p341r3.C6898a;

/* JADX INFO: loaded from: classes2.dex */
@AbstractC2870b.e
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: l0 */
    private static final int f17806l0 = AbstractC6751l.f26547l;

    /* JADX INFO: renamed from: m0 */
    private static final InterfaceC0907d f17807m0 = new C0909f(16);

    /* JADX INFO: renamed from: A */
    private int f17808A;

    /* JADX INFO: renamed from: B */
    PorterDuff.Mode f17809B;

    /* JADX INFO: renamed from: C */
    float f17810C;

    /* JADX INFO: renamed from: D */
    float f17811D;

    /* JADX INFO: renamed from: E */
    float f17812E;

    /* JADX INFO: renamed from: F */
    final int f17813F;

    /* JADX INFO: renamed from: G */
    int f17814G;

    /* JADX INFO: renamed from: H */
    private final int f17815H;

    /* JADX INFO: renamed from: I */
    private final int f17816I;

    /* JADX INFO: renamed from: J */
    private final int f17817J;

    /* JADX INFO: renamed from: K */
    private int f17818K;

    /* JADX INFO: renamed from: L */
    int f17819L;

    /* JADX INFO: renamed from: M */
    int f17820M;

    /* JADX INFO: renamed from: N */
    int f17821N;

    /* JADX INFO: renamed from: O */
    int f17822O;

    /* JADX INFO: renamed from: P */
    boolean f17823P;

    /* JADX INFO: renamed from: Q */
    boolean f17824Q;

    /* JADX INFO: renamed from: R */
    int f17825R;

    /* JADX INFO: renamed from: S */
    int f17826S;

    /* JADX INFO: renamed from: T */
    boolean f17827T;

    /* JADX INFO: renamed from: U */
    private C4619c f17828U;

    /* JADX INFO: renamed from: V */
    private final TimeInterpolator f17829V;

    /* JADX INFO: renamed from: W */
    private InterfaceC4609c f17830W;

    /* JADX INFO: renamed from: a */
    int f17831a;

    /* JADX INFO: renamed from: a0 */
    private final ArrayList f17832a0;

    /* JADX INFO: renamed from: b */
    private final ArrayList f17833b;

    /* JADX INFO: renamed from: b0 */
    private InterfaceC4609c f17834b0;

    /* JADX INFO: renamed from: c */
    private C4613g f17835c;

    /* JADX INFO: renamed from: c0 */
    private ValueAnimator f17836c0;

    /* JADX INFO: renamed from: d */
    final C4612f f17837d;

    /* JADX INFO: renamed from: d0 */
    AbstractC2870b f17838d0;

    /* JADX INFO: renamed from: e */
    int f17839e;

    /* JADX INFO: renamed from: e0 */
    private AbstractC2869a f17840e0;

    /* JADX INFO: renamed from: f */
    int f17841f;

    /* JADX INFO: renamed from: f0 */
    private DataSetObserver f17842f0;

    /* JADX INFO: renamed from: g0 */
    private C4614h f17843g0;

    /* JADX INFO: renamed from: h0 */
    private C4608b f17844h0;

    /* JADX INFO: renamed from: i0 */
    private boolean f17845i0;

    /* JADX INFO: renamed from: j0 */
    private int f17846j0;

    /* JADX INFO: renamed from: k0 */
    private final InterfaceC0907d f17847k0;

    /* JADX INFO: renamed from: r */
    int f17848r;

    /* JADX INFO: renamed from: s */
    int f17849s;

    /* JADX INFO: renamed from: t */
    private final int f17850t;

    /* JADX INFO: renamed from: u */
    private final int f17851u;

    /* JADX INFO: renamed from: v */
    private int f17852v;

    /* JADX INFO: renamed from: w */
    ColorStateList f17853w;

    /* JADX INFO: renamed from: x */
    ColorStateList f17854x;

    /* JADX INFO: renamed from: y */
    ColorStateList f17855y;

    /* JADX INFO: renamed from: z */
    Drawable f17856z;

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$a */
    class C4607a implements ValueAnimator.AnimatorUpdateListener {
        C4607a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$b */
    private class C4608b implements AbstractC2870b.i {

        /* JADX INFO: renamed from: a */
        private boolean f17858a;

        C4608b() {
        }

        @Override // androidx.viewpager.widget.AbstractC2870b.i
        /* JADX INFO: renamed from: a */
        public void mo14380a(AbstractC2870b abstractC2870b, AbstractC2869a abstractC2869a, AbstractC2869a abstractC2869a2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f17838d0 == abstractC2870b) {
                tabLayout.m21340K(abstractC2869a2, this.f17858a);
            }
        }

        /* JADX INFO: renamed from: b */
        void m21353b(boolean z7) {
            this.f17858a = z7;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface InterfaceC4609c {
        /* JADX INFO: renamed from: a */
        void mo21354a(C4613g c4613g);

        /* JADX INFO: renamed from: b */
        void mo21355b(C4613g c4613g);

        /* JADX INFO: renamed from: c */
        void mo21356c(C4613g c4613g);
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface InterfaceC4610d extends InterfaceC4609c {
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$e */
    private class C4611e extends DataSetObserver {
        C4611e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.m21334D();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.m21334D();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$f */
    class C4612f extends LinearLayout {

        /* JADX INFO: renamed from: a */
        ValueAnimator f17861a;

        /* JADX INFO: renamed from: b */
        private int f17862b;

        /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$f$a */
        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ View f17864a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ View f17865b;

            a(View view, View view2) {
                this.f17864a = view;
                this.f17865b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4612f.this.m21362j(this.f17864a, this.f17865b, valueAnimator.getAnimatedFraction());
            }
        }

        C4612f(Context context) {
            super(context);
            this.f17862b = -1;
            setWillNotDraw(false);
        }

        /* JADX INFO: renamed from: e */
        private void m21359e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f17831a == -1) {
                tabLayout.f17831a = tabLayout.getSelectedTabPosition();
            }
            m21360f(TabLayout.this.f17831a);
        }

        /* JADX INFO: renamed from: f */
        private void m21360f(int i7) {
            if (TabLayout.this.f17846j0 == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i7);
                C4619c c4619c = TabLayout.this.f17828U;
                TabLayout tabLayout = TabLayout.this;
                c4619c.m21409c(tabLayout, childAt, tabLayout.f17856z);
                TabLayout.this.f17831a = i7;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public void m21361g() {
            m21360f(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public void m21362j(View view, View view2, float f7) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f17856z;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f17856z.getBounds().bottom);
            } else {
                C4619c c4619c = TabLayout.this.f17828U;
                TabLayout tabLayout = TabLayout.this;
                c4619c.mo21406d(tabLayout, view, view2, f7, tabLayout.f17856z);
            }
            postInvalidateOnAnimation();
        }

        /* JADX INFO: renamed from: k */
        private void m21363k(boolean z7, int i7, int i8) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f17831a == i7) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i7);
            if (childAt2 == null) {
                m21361g();
                return;
            }
            TabLayout.this.f17831a = i7;
            a aVar = new a(childAt, childAt2);
            if (!z7) {
                this.f17861a.removeAllUpdateListeners();
                this.f17861a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17861a = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.f17829V);
            valueAnimator.setDuration(i8);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        /* JADX INFO: renamed from: c */
        void m21364c(int i7, int i8) {
            ValueAnimator valueAnimator = this.f17861a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f17831a != i7) {
                this.f17861a.cancel();
            }
            m21363k(true, i7, i8);
        }

        /* JADX INFO: renamed from: d */
        boolean m21365d() {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                if (getChildAt(i7).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f17856z.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f17856z.getIntrinsicHeight();
            }
            int i7 = TabLayout.this.f17821N;
            if (i7 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i7 != 1) {
                height = 0;
                if (i7 != 2) {
                    iHeight = i7 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.f17856z.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f17856z.getBounds();
                TabLayout.this.f17856z.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f17856z.draw(canvas);
            }
            super.draw(canvas);
        }

        /* JADX INFO: renamed from: h */
        void m21366h(int i7, float f7) {
            TabLayout.this.f17831a = Math.round(i7 + f7);
            ValueAnimator valueAnimator = this.f17861a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f17861a.cancel();
            }
            m21362j(getChildAt(i7), getChildAt(i7 + 1), f7);
        }

        /* JADX INFO: renamed from: i */
        void m21367i(int i7) {
            Rect bounds = TabLayout.this.f17856z.getBounds();
            TabLayout.this.f17856z.setBounds(bounds.left, 0, bounds.right, i7);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
            super.onLayout(z7, i7, i8, i9, i10);
            ValueAnimator valueAnimator = this.f17861a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m21359e();
            } else {
                m21363k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i7, int i8) {
            super.onMeasure(i7, i8);
            if (View.MeasureSpec.getMode(i7) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z7 = true;
            if (tabLayout.f17819L == 1 || tabLayout.f17822O == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) AbstractC4546v.m20828c(getContext(), 16)) * 2)) {
                    boolean z8 = false;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i10).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z8 = true;
                        }
                    }
                    z7 = z8;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f17819L = 0;
                    tabLayout2.m21345S(false);
                }
                if (z7) {
                    super.onMeasure(i7, i8);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i7) {
            super.onRtlPropertiesChanged(i7);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C4613g {

        /* JADX INFO: renamed from: a */
        private Object f17867a;

        /* JADX INFO: renamed from: b */
        private Drawable f17868b;

        /* JADX INFO: renamed from: c */
        private CharSequence f17869c;

        /* JADX INFO: renamed from: d */
        private CharSequence f17870d;

        /* JADX INFO: renamed from: f */
        private View f17872f;

        /* JADX INFO: renamed from: h */
        public TabLayout f17874h;

        /* JADX INFO: renamed from: i */
        public C4615i f17875i;

        /* JADX INFO: renamed from: e */
        private int f17871e = -1;

        /* JADX INFO: renamed from: g */
        private int f17873g = 1;

        /* JADX INFO: renamed from: j */
        private int f17876j = -1;

        /* JADX INFO: renamed from: e */
        public View m21372e() {
            return this.f17872f;
        }

        /* JADX INFO: renamed from: f */
        public Drawable m21373f() {
            return this.f17868b;
        }

        /* JADX INFO: renamed from: g */
        public int m21374g() {
            return this.f17871e;
        }

        /* JADX INFO: renamed from: h */
        public int m21375h() {
            return this.f17873g;
        }

        /* JADX INFO: renamed from: i */
        public CharSequence m21376i() {
            return this.f17869c;
        }

        /* JADX INFO: renamed from: j */
        public boolean m21377j() {
            TabLayout tabLayout = this.f17874h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f17871e;
        }

        /* JADX INFO: renamed from: k */
        void m21378k() {
            this.f17874h = null;
            this.f17875i = null;
            this.f17867a = null;
            this.f17868b = null;
            this.f17876j = -1;
            this.f17869c = null;
            this.f17870d = null;
            this.f17871e = -1;
            this.f17872f = null;
        }

        /* JADX INFO: renamed from: l */
        public void m21379l() {
            TabLayout tabLayout = this.f17874h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m21338I(this);
        }

        /* JADX INFO: renamed from: m */
        void m21380m(int i7) {
            this.f17871e = i7;
        }

        /* JADX INFO: renamed from: n */
        public C4613g m21381n(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f17870d) && !TextUtils.isEmpty(charSequence)) {
                this.f17875i.setContentDescription(charSequence);
            }
            this.f17869c = charSequence;
            m21382o();
            return this;
        }

        /* JADX INFO: renamed from: o */
        void m21382o() {
            C4615i c4615i = this.f17875i;
            if (c4615i != null) {
                c4615i.m21401p();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C4614h implements AbstractC2870b.j {

        /* JADX INFO: renamed from: a */
        private final WeakReference f17877a;

        /* JADX INFO: renamed from: b */
        private int f17878b;

        /* JADX INFO: renamed from: c */
        private int f17879c;

        public C4614h(TabLayout tabLayout) {
            this.f17877a = new WeakReference(tabLayout);
        }

        @Override // androidx.viewpager.widget.AbstractC2870b.j
        /* JADX INFO: renamed from: a */
        public void mo365a(int i7, float f7, int i8) {
            TabLayout tabLayout = (TabLayout) this.f17877a.get();
            if (tabLayout != null) {
                int i9 = this.f17879c;
                boolean z7 = true;
                if (i9 == 2 && this.f17878b != 1) {
                    z7 = false;
                }
                if (i9 == 2 && this.f17878b == 0) {
                    z7 = false;
                }
                tabLayout.m21343N(i7, f7, z7, z7, false);
            }
        }

        @Override // androidx.viewpager.widget.AbstractC2870b.j
        /* JADX INFO: renamed from: b */
        public void mo14381b(int i7) {
            this.f17878b = this.f17879c;
            this.f17879c = i7;
            TabLayout tabLayout = (TabLayout) this.f17877a.get();
            if (tabLayout != null) {
                tabLayout.m21346T(this.f17879c);
            }
        }

        @Override // androidx.viewpager.widget.AbstractC2870b.j
        /* JADX INFO: renamed from: c */
        public void mo366c(int i7) {
            TabLayout tabLayout = (TabLayout) this.f17877a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i7 || i7 >= tabLayout.getTabCount()) {
                return;
            }
            int i8 = this.f17879c;
            tabLayout.m21339J(tabLayout.m21352z(i7), i8 == 0 || (i8 == 2 && this.f17878b == 0));
        }

        /* JADX INFO: renamed from: d */
        void m21383d() {
            this.f17879c = 0;
            this.f17878b = 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$i */
    public final class C4615i extends LinearLayout {

        /* JADX INFO: renamed from: a */
        private C4613g f17880a;

        /* JADX INFO: renamed from: b */
        private TextView f17881b;

        /* JADX INFO: renamed from: c */
        private ImageView f17882c;

        /* JADX INFO: renamed from: d */
        private View f17883d;

        /* JADX INFO: renamed from: e */
        private C6898a f17884e;

        /* JADX INFO: renamed from: f */
        private View f17885f;

        /* JADX INFO: renamed from: r */
        private TextView f17886r;

        /* JADX INFO: renamed from: s */
        private ImageView f17887s;

        /* JADX INFO: renamed from: t */
        private Drawable f17888t;

        /* JADX INFO: renamed from: u */
        private int f17889u;

        /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$i$a */
        class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ View f17891a;

            a(View view) {
                this.f17891a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                if (this.f17891a.getVisibility() == 0) {
                    C4615i.this.m21397o(this.f17891a);
                }
            }
        }

        public C4615i(Context context) {
            super(context);
            this.f17889u = 2;
            m21398q(context);
            setPaddingRelative(TabLayout.this.f17839e, TabLayout.this.f17841f, TabLayout.this.f17848r, TabLayout.this.f17849s);
            setGravity(17);
            setOrientation(!TabLayout.this.f17823P ? 1 : 0);
            setClickable(true);
            AbstractC1030Z.m4496u0(this, C1001K.m4378b(getContext(), 1002));
        }

        /* JADX INFO: renamed from: d */
        private void m21387d(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        /* JADX INFO: renamed from: e */
        private float m21388e(Layout layout, int i7, float f7) {
            return layout.getLineWidth(i7) * (f7 / layout.getPaint().getTextSize());
        }

        /* JADX INFO: renamed from: f */
        private void m21389f(boolean z7) {
            setClipChildren(z7);
            setClipToPadding(z7);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z7);
                viewGroup.setClipToPadding(z7);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public void m21390g(Canvas canvas) {
            Drawable drawable = this.f17888t;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f17888t.draw(canvas);
            }
        }

        private C6898a getBadge() {
            return this.f17884e;
        }

        private C6898a getOrCreateBadge() {
            if (this.f17884e == null) {
                this.f17884e = C6898a.m30129e(getContext());
            }
            m21396n();
            C6898a c6898a = this.f17884e;
            if (c6898a != null) {
                return c6898a;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* JADX INFO: renamed from: h */
        private boolean m21391h() {
            return this.f17884e != null;
        }

        /* JADX INFO: renamed from: i */
        private void m21392i() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(AbstractC6748i.f26455d, (ViewGroup) this, false);
            this.f17882c = imageView;
            addView(imageView, 0);
        }

        /* JADX INFO: renamed from: j */
        private void m21393j() {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(AbstractC6748i.f26456e, (ViewGroup) this, false);
            this.f17881b = textView;
            addView(textView);
        }

        /* JADX INFO: renamed from: l */
        private void m21394l(View view) {
            if (m21391h() && view != null) {
                m21389f(false);
                AbstractC6900c.m30249a(this.f17884e, view, null);
                this.f17883d = view;
            }
        }

        /* JADX INFO: renamed from: m */
        private void m21395m() {
            if (m21391h()) {
                m21389f(true);
                View view = this.f17883d;
                if (view != null) {
                    AbstractC6900c.m30250b(this.f17884e, view);
                    this.f17883d = null;
                }
            }
        }

        /* JADX INFO: renamed from: n */
        private void m21396n() {
            C4613g c4613g;
            C4613g c4613g2;
            if (m21391h()) {
                if (this.f17885f != null) {
                    m21395m();
                    return;
                }
                if (this.f17882c != null && (c4613g2 = this.f17880a) != null && c4613g2.m21373f() != null) {
                    View view = this.f17883d;
                    ImageView imageView = this.f17882c;
                    if (view == imageView) {
                        m21397o(imageView);
                        return;
                    } else {
                        m21395m();
                        m21394l(this.f17882c);
                        return;
                    }
                }
                if (this.f17881b == null || (c4613g = this.f17880a) == null || c4613g.m21375h() != 1) {
                    m21395m();
                    return;
                }
                View view2 = this.f17883d;
                TextView textView = this.f17881b;
                if (view2 == textView) {
                    m21397o(textView);
                } else {
                    m21395m();
                    m21394l(this.f17881b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o */
        public void m21397o(View view) {
            if (m21391h() && view == this.f17883d) {
                AbstractC6900c.m30251c(this.f17884e, view, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public void m21398q(Context context) {
            GradientDrawable gradientDrawable;
            int i7 = TabLayout.this.f17813F;
            if (i7 != 0) {
                Drawable drawableM25175b = AbstractC5659a.m25175b(context, i7);
                this.f17888t = drawableM25175b;
                if (drawableM25175b != null && drawableM25175b.isStateful()) {
                    this.f17888t.setState(getDrawableState());
                }
            } else {
                this.f17888t = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (TabLayout.this.f17855y != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListM2062a = AbstractC0481a.m2062a(TabLayout.this.f17855y);
                boolean z7 = TabLayout.this.f17827T;
                if (z7) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListM2062a, gradientDrawable, z7 ? null : gradientDrawable3);
            }
            setBackground(rippleDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0060  */
        /* JADX INFO: renamed from: t */
        private void m21399t(TextView textView, ImageView imageView, boolean z7) {
            boolean z8;
            C4613g c4613g = this.f17880a;
            Drawable drawableMutate = (c4613g == null || c4613g.m21373f() == null) ? null : AbstractC0400a.m1712r(this.f17880a.m21373f()).mutate();
            if (drawableMutate != null) {
                drawableMutate.setTintList(TabLayout.this.f17854x);
                PorterDuff.Mode mode = TabLayout.this.f17809B;
                if (mode != null) {
                    drawableMutate.setTintMode(mode);
                }
            }
            C4613g c4613g2 = this.f17880a;
            CharSequence charSequenceM21376i = c4613g2 != null ? c4613g2.m21376i() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceM21376i);
            if (textView != null) {
                if (!zIsEmpty) {
                    z8 = this.f17880a.f17873g == 1;
                }
                textView.setText(!zIsEmpty ? charSequenceM21376i : null);
                textView.setVisibility(z8 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z8 = false;
            }
            if (z7 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iM20828c = (z8 && imageView.getVisibility() == 0) ? (int) AbstractC4546v.m20828c(getContext(), 8) : 0;
                if (TabLayout.this.f17823P) {
                    if (iM20828c != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iM20828c);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iM20828c != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iM20828c;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C4613g c4613g3 = this.f17880a;
            CharSequence charSequence = c4613g3 != null ? c4613g3.f17870d : null;
            if (zIsEmpty) {
                charSequenceM21376i = charSequence;
            }
            AbstractC2358i0.m10085a(this, charSequenceM21376i);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f17888t;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f17888t.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f17881b, this.f17882c, this.f17885f};
            int iMax = 0;
            int iMin = 0;
            boolean z7 = false;
            for (int i7 = 0; i7 < 3; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z7 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z7 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z7 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f17881b, this.f17882c, this.f17885f};
            int iMax = 0;
            int iMin = 0;
            boolean z7 = false;
            for (int i7 = 0; i7 < 3; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z7 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z7 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z7 = true;
                }
            }
            return iMax - iMin;
        }

        public C4613g getTab() {
            return this.f17880a;
        }

        /* JADX INFO: renamed from: k */
        void m21400k() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C1170s c1170sM4998R0 = C1170s.m4998R0(accessibilityNodeInfo);
            C6898a c6898a = this.f17884e;
            if (c6898a != null && c6898a.isVisible()) {
                c1170sM4998R0.m5076q0(this.f17884e.m30146i());
            }
            c1170sM4998R0.m5074p0(C1170s.g.m5112a(0, 1, this.f17880a.m21374g(), 1, false, isSelected()));
            if (isSelected()) {
                c1170sM4998R0.m5071n0(false);
                c1170sM4998R0.m5058f0(C1170s.a.f4113i);
            }
            c1170sM4998R0.m5020F0(getResources().getString(AbstractC6750k.f26508h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i7, int i8) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i7);
            int mode = View.MeasureSpec.getMode(i7);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i7 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f17814G, Integer.MIN_VALUE);
            }
            super.onMeasure(i7, i8);
            if (this.f17881b != null) {
                float f7 = TabLayout.this.f17810C;
                if (isSelected() && TabLayout.this.f17852v != -1) {
                    f7 = TabLayout.this.f17811D;
                }
                int i9 = this.f17889u;
                ImageView imageView = this.f17882c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f17881b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f7 = TabLayout.this.f17812E;
                    }
                } else {
                    i9 = 1;
                }
                float textSize = this.f17881b.getTextSize();
                int lineCount = this.f17881b.getLineCount();
                int maxLines = this.f17881b.getMaxLines();
                if (f7 != textSize || (maxLines >= 0 && i9 != maxLines)) {
                    if (TabLayout.this.f17822O != 1 || f7 <= textSize || lineCount != 1 || ((layout = this.f17881b.getLayout()) != null && m21388e(layout, 0, f7) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f17881b.setTextSize(0, f7);
                        this.f17881b.setMaxLines(i9);
                        super.onMeasure(i7, i8);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: p */
        final void m21401p() {
            m21403s();
            C4613g c4613g = this.f17880a;
            setSelected(c4613g != null && c4613g.m21377j());
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f17880a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f17880a.m21379l();
            return true;
        }

        /* JADX INFO: renamed from: r */
        final void m21402r() {
            setOrientation(!TabLayout.this.f17823P ? 1 : 0);
            TextView textView = this.f17886r;
            if (textView == null && this.f17887s == null) {
                m21399t(this.f17881b, this.f17882c, true);
            } else {
                m21399t(textView, this.f17887s, false);
            }
        }

        /* JADX INFO: renamed from: s */
        final void m21403s() {
            ViewParent parent;
            C4613g c4613g = this.f17880a;
            View viewM21372e = c4613g != null ? c4613g.m21372e() : null;
            if (viewM21372e != null) {
                ViewParent parent2 = viewM21372e.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewM21372e);
                    }
                    View view = this.f17885f;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f17885f);
                    }
                    addView(viewM21372e);
                }
                this.f17885f = viewM21372e;
                TextView textView = this.f17881b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f17882c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f17882c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewM21372e.findViewById(R.id.text1);
                this.f17886r = textView2;
                if (textView2 != null) {
                    this.f17889u = textView2.getMaxLines();
                }
                this.f17887s = (ImageView) viewM21372e.findViewById(R.id.icon);
            } else {
                View view2 = this.f17885f;
                if (view2 != null) {
                    removeView(view2);
                    this.f17885f = null;
                }
                this.f17886r = null;
                this.f17887s = null;
            }
            if (this.f17885f == null) {
                if (this.f17882c == null) {
                    m21392i();
                }
                if (this.f17881b == null) {
                    m21393j();
                    this.f17889u = this.f17881b.getMaxLines();
                }
                AbstractC2458i.m10762m(this.f17881b, TabLayout.this.f17850t);
                if (!isSelected() || TabLayout.this.f17852v == -1) {
                    AbstractC2458i.m10762m(this.f17881b, TabLayout.this.f17851u);
                } else {
                    AbstractC2458i.m10762m(this.f17881b, TabLayout.this.f17852v);
                }
                ColorStateList colorStateList = TabLayout.this.f17853w;
                if (colorStateList != null) {
                    this.f17881b.setTextColor(colorStateList);
                }
                m21399t(this.f17881b, this.f17882c, true);
                m21396n();
                m21387d(this.f17882c);
                m21387d(this.f17881b);
            } else {
                TextView textView3 = this.f17886r;
                if (textView3 != null || this.f17887s != null) {
                    m21399t(textView3, this.f17887s, false);
                }
            }
            if (c4613g == null || TextUtils.isEmpty(c4613g.f17870d)) {
                return;
            }
            setContentDescription(c4613g.f17870d);
        }

        @Override // android.view.View
        public void setSelected(boolean z7) {
            isSelected();
            super.setSelected(z7);
            TextView textView = this.f17881b;
            if (textView != null) {
                textView.setSelected(z7);
            }
            ImageView imageView = this.f17882c;
            if (imageView != null) {
                imageView.setSelected(z7);
            }
            View view = this.f17885f;
            if (view != null) {
                view.setSelected(z7);
            }
        }

        void setTab(C4613g c4613g) {
            if (c4613g != this.f17880a) {
                this.f17880a = c4613g;
                m21401p();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$j */
    public static class C4616j implements InterfaceC4610d {

        /* JADX INFO: renamed from: a */
        private final AbstractC2870b f17893a;

        public C4616j(AbstractC2870b abstractC2870b) {
            this.f17893a = abstractC2870b;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC4609c
        /* JADX INFO: renamed from: a */
        public void mo21354a(C4613g c4613g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC4609c
        /* JADX INFO: renamed from: b */
        public void mo21355b(C4613g c4613g) {
            this.f17893a.setCurrentItem(c4613g.m21374g());
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC4609c
        /* JADX INFO: renamed from: c */
        public void mo21356c(C4613g c4613g) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26267m0);
    }

    /* JADX INFO: renamed from: A */
    private boolean m21307A() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    /* JADX INFO: renamed from: H */
    private void m21308H(int i7) {
        C4615i c4615i = (C4615i) this.f17837d.getChildAt(i7);
        this.f17837d.removeViewAt(i7);
        if (c4615i != null) {
            c4615i.m21400k();
            this.f17847k0.mo4130a(c4615i);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: P */
    private void m21309P(AbstractC2870b abstractC2870b, boolean z7, boolean z8) {
        AbstractC2870b abstractC2870b2 = this.f17838d0;
        if (abstractC2870b2 != null) {
            C4614h c4614h = this.f17843g0;
            if (c4614h != null) {
                abstractC2870b2.mo14357M(c4614h);
            }
            C4608b c4608b = this.f17844h0;
            if (c4608b != null) {
                this.f17838d0.m14356L(c4608b);
            }
        }
        InterfaceC4609c interfaceC4609c = this.f17834b0;
        if (interfaceC4609c != null) {
            m21337G(interfaceC4609c);
            this.f17834b0 = null;
        }
        if (abstractC2870b != null) {
            this.f17838d0 = abstractC2870b;
            if (this.f17843g0 == null) {
                this.f17843g0 = new C4614h(this);
            }
            this.f17843g0.m21383d();
            abstractC2870b.mo14364c(this.f17843g0);
            C4616j c4616j = new C4616j(abstractC2870b);
            this.f17834b0 = c4616j;
            m21347g(c4616j);
            AbstractC2869a adapter = abstractC2870b.getAdapter();
            if (adapter != null) {
                m21340K(adapter, z7);
            }
            if (this.f17844h0 == null) {
                this.f17844h0 = new C4608b();
            }
            this.f17844h0.m21353b(z7);
            abstractC2870b.m14363b(this.f17844h0);
            m21341L(abstractC2870b.getCurrentItem(), 0.0f, true);
        } else {
            this.f17838d0 = null;
            m21340K(null, false);
        }
        this.f17845i0 = z8;
    }

    /* JADX INFO: renamed from: Q */
    private void m21310Q() {
        int size = this.f17833b.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C4613g) this.f17833b.get(i7)).m21382o();
        }
    }

    /* JADX INFO: renamed from: R */
    private void m21311R(LinearLayout.LayoutParams layoutParams) {
        if (this.f17822O == 1 && this.f17819L == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private int getDefaultHeight() {
        int size = this.f17833b.size();
        for (int i7 = 0; i7 < size; i7++) {
            C4613g c4613g = (C4613g) this.f17833b.get(i7);
            if (c4613g != null && c4613g.m21373f() != null && !TextUtils.isEmpty(c4613g.m21376i())) {
                return !this.f17823P ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i7 = this.f17815H;
        if (i7 != -1) {
            return i7;
        }
        int i8 = this.f17822O;
        if (i8 == 0 || i8 == 2) {
            return this.f17817J;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f17837d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* JADX INFO: renamed from: k */
    private void m21318k(C4613g c4613g) {
        C4615i c4615i = c4613g.f17875i;
        c4615i.setSelected(false);
        c4615i.setActivated(false);
        this.f17837d.addView(c4615i, c4613g.m21374g(), m21326s());
    }

    /* JADX INFO: renamed from: l */
    private void m21319l(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* JADX INFO: renamed from: m */
    private void m21320m(int i7) {
        if (i7 == -1) {
            return;
        }
        if (getWindowToken() == null || !isLaidOut() || this.f17837d.m21365d()) {
            m21341L(i7, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iM21323p = m21323p(i7, 0.0f);
        if (scrollX != iM21323p) {
            m21331y();
            this.f17836c0.setIntValues(scrollX, iM21323p);
            this.f17836c0.start();
        }
        this.f17837d.m21364c(i7, this.f17820M);
    }

    /* JADX INFO: renamed from: n */
    private void m21321n(int i7) {
        if (i7 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i7 == 1) {
            this.f17837d.setGravity(1);
            return;
        } else if (i7 != 2) {
            return;
        }
        this.f17837d.setGravity(8388611);
    }

    /* JADX INFO: renamed from: o */
    private void m21322o() {
        int i7 = this.f17822O;
        this.f17837d.setPaddingRelative((i7 == 0 || i7 == 2) ? Math.max(0, this.f17818K - this.f17839e) : 0, 0, 0, 0);
        int i8 = this.f17822O;
        if (i8 == 0) {
            m21321n(this.f17819L);
        } else if (i8 == 1 || i8 == 2) {
            if (this.f17819L == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f17837d.setGravity(1);
        }
        m21345S(true);
    }

    /* JADX INFO: renamed from: p */
    private int m21323p(int i7, float f7) {
        View childAt;
        int i8 = this.f17822O;
        if ((i8 != 0 && i8 != 2) || (childAt = this.f17837d.getChildAt(i7)) == null) {
            return 0;
        }
        int i9 = i7 + 1;
        View childAt2 = i9 < this.f17837d.getChildCount() ? this.f17837d.getChildAt(i9) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i10 = (int) ((width + width2) * 0.5f * f7);
        return getLayoutDirection() == 0 ? left + i10 : left - i10;
    }

    /* JADX INFO: renamed from: q */
    private void m21324q(C4613g c4613g, int i7) {
        c4613g.m21380m(i7);
        this.f17833b.add(i7, c4613g);
        int size = this.f17833b.size();
        int i8 = -1;
        for (int i9 = i7 + 1; i9 < size; i9++) {
            if (((C4613g) this.f17833b.get(i9)).m21374g() == this.f17831a) {
                i8 = i9;
            }
            ((C4613g) this.f17833b.get(i9)).m21380m(i9);
        }
        this.f17831a = i8;
    }

    /* JADX INFO: renamed from: r */
    private static ColorStateList m21325r(int i7, int i8) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i8, i7});
    }

    /* JADX INFO: renamed from: s */
    private LinearLayout.LayoutParams m21326s() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m21311R(layoutParams);
        return layoutParams;
    }

    private void setSelectedTabView(int i7) {
        int childCount = this.f17837d.getChildCount();
        if (i7 < childCount) {
            int i8 = 0;
            while (i8 < childCount) {
                View childAt = this.f17837d.getChildAt(i8);
                if ((i8 != i7 || childAt.isSelected()) && (i8 == i7 || !childAt.isSelected())) {
                    childAt.setSelected(i8 == i7);
                    childAt.setActivated(i8 == i7);
                } else {
                    childAt.setSelected(i8 == i7);
                    childAt.setActivated(i8 == i7);
                    if (childAt instanceof C4615i) {
                        ((C4615i) childAt).m21403s();
                    }
                }
                i8++;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private C4615i m21327u(C4613g c4613g) {
        InterfaceC0907d interfaceC0907d = this.f17847k0;
        C4615i c4615i = interfaceC0907d != null ? (C4615i) interfaceC0907d.mo4131b() : null;
        if (c4615i == null) {
            c4615i = new C4615i(getContext());
        }
        c4615i.setTab(c4613g);
        c4615i.setFocusable(true);
        c4615i.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c4613g.f17870d)) {
            c4615i.setContentDescription(c4613g.f17869c);
            return c4615i;
        }
        c4615i.setContentDescription(c4613g.f17870d);
        return c4615i;
    }

    /* JADX INFO: renamed from: v */
    private void m21328v(C4613g c4613g) {
        for (int size = this.f17832a0.size() - 1; size >= 0; size--) {
            ((InterfaceC4609c) this.f17832a0.get(size)).mo21354a(c4613g);
        }
    }

    /* JADX INFO: renamed from: w */
    private void m21329w(C4613g c4613g) {
        for (int size = this.f17832a0.size() - 1; size >= 0; size--) {
            ((InterfaceC4609c) this.f17832a0.get(size)).mo21355b(c4613g);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m21330x(C4613g c4613g) {
        for (int size = this.f17832a0.size() - 1; size >= 0; size--) {
            ((InterfaceC4609c) this.f17832a0.get(size)).mo21356c(c4613g);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m21331y() {
        if (this.f17836c0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17836c0 = valueAnimator;
            valueAnimator.setInterpolator(this.f17829V);
            this.f17836c0.setDuration(this.f17820M);
            this.f17836c0.addUpdateListener(new C4607a());
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m21332B() {
        return this.f17824Q;
    }

    /* JADX INFO: renamed from: C */
    public C4613g m21333C() {
        C4613g c4613gM21351t = m21351t();
        c4613gM21351t.f17874h = this;
        c4613gM21351t.f17875i = m21327u(c4613gM21351t);
        if (c4613gM21351t.f17876j != -1) {
            c4613gM21351t.f17875i.setId(c4613gM21351t.f17876j);
        }
        return c4613gM21351t;
    }

    /* JADX INFO: renamed from: D */
    void m21334D() {
        int currentItem;
        m21336F();
        AbstractC2869a abstractC2869a = this.f17840e0;
        if (abstractC2869a != null) {
            int iMo684c = abstractC2869a.mo684c();
            for (int i7 = 0; i7 < iMo684c; i7++) {
                m21350j(m21333C().m21381n(this.f17840e0.mo14320e(i7)), false);
            }
            AbstractC2870b abstractC2870b = this.f17838d0;
            if (abstractC2870b == null || iMo684c <= 0 || (currentItem = abstractC2870b.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m21338I(m21352z(currentItem));
        }
    }

    /* JADX INFO: renamed from: E */
    protected boolean m21335E(C4613g c4613g) {
        return f17807m0.mo4130a(c4613g);
    }

    /* JADX INFO: renamed from: F */
    public void m21336F() {
        for (int childCount = this.f17837d.getChildCount() - 1; childCount >= 0; childCount--) {
            m21308H(childCount);
        }
        Iterator it = this.f17833b.iterator();
        while (it.hasNext()) {
            C4613g c4613g = (C4613g) it.next();
            it.remove();
            c4613g.m21378k();
            m21335E(c4613g);
        }
        this.f17835c = null;
    }

    /* JADX INFO: renamed from: G */
    public void m21337G(InterfaceC4609c interfaceC4609c) {
        this.f17832a0.remove(interfaceC4609c);
    }

    /* JADX INFO: renamed from: I */
    public void m21338I(C4613g c4613g) {
        m21339J(c4613g, true);
    }

    /* JADX INFO: renamed from: J */
    public void m21339J(C4613g c4613g, boolean z7) {
        C4613g c4613g2 = this.f17835c;
        if (c4613g2 == c4613g) {
            if (c4613g2 != null) {
                m21328v(c4613g);
                m21320m(c4613g.m21374g());
                return;
            }
            return;
        }
        int iM21374g = c4613g != null ? c4613g.m21374g() : -1;
        if (z7) {
            if ((c4613g2 == null || c4613g2.m21374g() == -1) && iM21374g != -1) {
                m21341L(iM21374g, 0.0f, true);
            } else {
                m21320m(iM21374g);
            }
            if (iM21374g != -1) {
                setSelectedTabView(iM21374g);
            }
        }
        this.f17835c = c4613g;
        if (c4613g2 != null && c4613g2.f17874h != null) {
            m21330x(c4613g2);
        }
        if (c4613g != null) {
            m21329w(c4613g);
        }
    }

    /* JADX INFO: renamed from: K */
    void m21340K(AbstractC2869a abstractC2869a, boolean z7) {
        DataSetObserver dataSetObserver;
        AbstractC2869a abstractC2869a2 = this.f17840e0;
        if (abstractC2869a2 != null && (dataSetObserver = this.f17842f0) != null) {
            abstractC2869a2.mo14330p(dataSetObserver);
        }
        this.f17840e0 = abstractC2869a;
        if (z7 && abstractC2869a != null) {
            if (this.f17842f0 == null) {
                this.f17842f0 = new C4611e();
            }
            abstractC2869a.mo14324j(this.f17842f0);
        }
        m21334D();
    }

    /* JADX INFO: renamed from: L */
    public void m21341L(int i7, float f7, boolean z7) {
        m21342M(i7, f7, z7, true);
    }

    /* JADX INFO: renamed from: M */
    public void m21342M(int i7, float f7, boolean z7, boolean z8) {
        m21343N(i7, f7, z7, z8, true);
    }

    /* JADX INFO: renamed from: N */
    void m21343N(int i7, float f7, boolean z7, boolean z8, boolean z9) {
        int iRound = Math.round(i7 + f7);
        if (iRound < 0 || iRound >= this.f17837d.getChildCount()) {
            return;
        }
        if (z8) {
            this.f17837d.m21366h(i7, f7);
        }
        ValueAnimator valueAnimator = this.f17836c0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f17836c0.cancel();
        }
        int iM21323p = m21323p(i7, f7);
        int scrollX = getScrollX();
        boolean z10 = (i7 < getSelectedTabPosition() && iM21323p >= scrollX) || (i7 > getSelectedTabPosition() && iM21323p <= scrollX) || i7 == getSelectedTabPosition();
        if (getLayoutDirection() == 1) {
            z10 = (i7 < getSelectedTabPosition() && iM21323p <= scrollX) || (i7 > getSelectedTabPosition() && iM21323p >= scrollX) || i7 == getSelectedTabPosition();
        }
        if (z10 || this.f17846j0 == 1 || z9) {
            if (i7 < 0) {
                iM21323p = 0;
            }
            scrollTo(iM21323p, 0);
        }
        if (z7) {
            setSelectedTabView(iRound);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m21344O(AbstractC2870b abstractC2870b, boolean z7) {
        m21309P(abstractC2870b, z7, false);
    }

    /* JADX INFO: renamed from: S */
    void m21345S(boolean z7) {
        for (int i7 = 0; i7 < this.f17837d.getChildCount(); i7++) {
            View childAt = this.f17837d.getChildAt(i7);
            childAt.setMinimumWidth(getTabMinWidth());
            m21311R((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z7) {
                childAt.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    void m21346T(int i7) {
        this.f17846j0 = i7;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m21319l(view);
    }

    /* JADX INFO: renamed from: g */
    public void m21347g(InterfaceC4609c interfaceC4609c) {
        if (this.f17832a0.contains(interfaceC4609c)) {
            return;
        }
        this.f17832a0.add(interfaceC4609c);
    }

    public int getSelectedTabPosition() {
        C4613g c4613g = this.f17835c;
        if (c4613g != null) {
            return c4613g.m21374g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f17833b.size();
    }

    public int getTabGravity() {
        return this.f17819L;
    }

    public ColorStateList getTabIconTint() {
        return this.f17854x;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f17826S;
    }

    public int getTabIndicatorGravity() {
        return this.f17821N;
    }

    int getTabMaxWidth() {
        return this.f17814G;
    }

    public int getTabMode() {
        return this.f17822O;
    }

    public ColorStateList getTabRippleColor() {
        return this.f17855y;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f17856z;
    }

    public ColorStateList getTabTextColors() {
        return this.f17853w;
    }

    /* JADX INFO: renamed from: h */
    public void m21348h(InterfaceC4610d interfaceC4610d) {
        m21347g(interfaceC4610d);
    }

    /* JADX INFO: renamed from: i */
    public void m21349i(C4613g c4613g, int i7, boolean z7) {
        if (c4613g.f17874h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        m21324q(c4613g, i7);
        m21318k(c4613g);
        if (z7) {
            c4613g.m21379l();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m21350j(C4613g c4613g, boolean z7) {
        m21349i(c4613g, this.f17833b.size(), z7);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0623j.m2750e(this);
        if (this.f17838d0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof AbstractC2870b) {
                m21309P((AbstractC2870b) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f17845i0) {
            setupWithViewPager(null);
            this.f17845i0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i7 = 0; i7 < this.f17837d.getChildCount(); i7++) {
            View childAt = this.f17837d.getChildAt(i7);
            if (childAt instanceof C4615i) {
                ((C4615i) childAt).m21390g(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1170s.m4998R0(accessibilityNodeInfo).m5072o0(C1170s.f.m5111b(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return m21307A() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        int iRound = Math.round(AbstractC4546v.m20828c(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i8);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i8 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i8) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i7);
        if (View.MeasureSpec.getMode(i7) != 0) {
            int iM20828c = this.f17816I;
            if (iM20828c <= 0) {
                iM20828c = (int) (size - AbstractC4546v.m20828c(getContext(), 56));
            }
            this.f17814G = iM20828c;
        }
        super.onMeasure(i7, i8);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i9 = this.f17822O;
            if (i9 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i9 != 1) {
                if (i9 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i8, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || m21307A()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        AbstractC0623j.m2749d(this, f7);
    }

    public void setInlineLabel(boolean z7) {
        if (this.f17823P != z7) {
            this.f17823P = z7;
            for (int i7 = 0; i7 < this.f17837d.getChildCount(); i7++) {
                View childAt = this.f17837d.getChildAt(i7);
                if (childAt instanceof C4615i) {
                    ((C4615i) childAt).m21402r();
                }
            }
            m21322o();
        }
    }

    public void setInlineLabelResource(int i7) {
        setInlineLabel(getResources().getBoolean(i7));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC4610d interfaceC4610d) {
        setOnTabSelectedListener((InterfaceC4609c) interfaceC4610d);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m21331y();
        this.f17836c0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = AbstractC0400a.m1712r(drawable).mutate();
        this.f17856z = drawableMutate;
        AbstractC4498d.m20442n(drawableMutate, this.f17808A);
        int intrinsicHeight = this.f17825R;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f17856z.getIntrinsicHeight();
        }
        this.f17837d.m21367i(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i7) {
        this.f17808A = i7;
        AbstractC4498d.m20442n(this.f17856z, i7);
        m21345S(false);
    }

    public void setSelectedTabIndicatorGravity(int i7) {
        if (this.f17821N != i7) {
            this.f17821N = i7;
            this.f17837d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i7) {
        this.f17825R = i7;
        this.f17837d.m21367i(i7);
    }

    public void setTabGravity(int i7) {
        if (this.f17819L != i7) {
            this.f17819L = i7;
            m21322o();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f17854x != colorStateList) {
            this.f17854x = colorStateList;
            m21310Q();
        }
    }

    public void setTabIconTintResource(int i7) {
        setTabIconTint(AbstractC5659a.m25174a(getContext(), i7));
    }

    public void setTabIndicatorAnimationMode(int i7) {
        this.f17826S = i7;
        if (i7 == 0) {
            this.f17828U = new C4619c();
            return;
        }
        if (i7 == 1) {
            this.f17828U = new C4617a();
        } else {
            if (i7 == 2) {
                this.f17828U = new C4618b();
                return;
            }
            throw new IllegalArgumentException(i7 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z7) {
        this.f17824Q = z7;
        this.f17837d.m21361g();
        this.f17837d.postInvalidateOnAnimation();
    }

    public void setTabMode(int i7) {
        if (i7 != this.f17822O) {
            this.f17822O = i7;
            m21322o();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f17855y != colorStateList) {
            this.f17855y = colorStateList;
            for (int i7 = 0; i7 < this.f17837d.getChildCount(); i7++) {
                View childAt = this.f17837d.getChildAt(i7);
                if (childAt instanceof C4615i) {
                    ((C4615i) childAt).m21398q(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i7) {
        setTabRippleColor(AbstractC5659a.m25174a(getContext(), i7));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f17853w != colorStateList) {
            this.f17853w = colorStateList;
            m21310Q();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC2869a abstractC2869a) {
        m21340K(abstractC2869a, false);
    }

    public void setUnboundedRipple(boolean z7) {
        if (this.f17827T != z7) {
            this.f17827T = z7;
            for (int i7 = 0; i7 < this.f17837d.getChildCount(); i7++) {
                View childAt = this.f17837d.getChildAt(i7);
                if (childAt instanceof C4615i) {
                    ((C4615i) childAt).m21398q(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i7) {
        setUnboundedRipple(getResources().getBoolean(i7));
    }

    public void setupWithViewPager(AbstractC2870b abstractC2870b) {
        m21344O(abstractC2870b, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: renamed from: t */
    protected C4613g m21351t() {
        C4613g c4613g = (C4613g) f17807m0.mo4131b();
        return c4613g == null ? new C4613g() : c4613g;
    }

    /* JADX INFO: renamed from: z */
    public C4613g m21352z(int i7) {
        if (i7 < 0 || i7 >= getTabCount()) {
            return null;
        }
        return (C4613g) this.f17833b.get(i7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17806l0;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        this.f17831a = -1;
        this.f17833b = new ArrayList();
        this.f17852v = -1;
        this.f17808A = 0;
        this.f17814G = C3553a.e.API_PRIORITY_OTHER;
        this.f17825R = -1;
        this.f17832a0 = new ArrayList();
        this.f17847k0 = new C0908e(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C4612f c4612f = new C4612f(context2);
        this.f17837d = c4612f;
        super.addView(c4612f, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = AbstractC6752m.f26658I7;
        int i9 = AbstractC6752m.f26930h8;
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context2, attributeSet, iArr, i7, i8, i9);
        ColorStateList colorStateListM20435g = AbstractC4498d.m20435g(getBackground());
        if (colorStateListM20435g != null) {
            C0622i c0622i = new C0622i();
            c0622i.m2718g0(colorStateListM20435g);
            c0622i.m2710U(context2);
            c0622i.m2717f0(getElevation());
            setBackground(c0622i);
        }
        setSelectedTabIndicator(AbstractC0423c.m1828d(context2, typedArrayM20818i, AbstractC6752m.f26724O7));
        setSelectedTabIndicatorColor(typedArrayM20818i.getColor(AbstractC6752m.f26757R7, 0));
        c4612f.m21367i(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26790U7, -1));
        setSelectedTabIndicatorGravity(typedArrayM20818i.getInt(AbstractC6752m.f26779T7, 0));
        setTabIndicatorAnimationMode(typedArrayM20818i.getInt(AbstractC6752m.f26746Q7, 0));
        setTabIndicatorFullWidth(typedArrayM20818i.getBoolean(AbstractC6752m.f26768S7, true));
        int dimensionPixelSize = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26842Z7, 0);
        this.f17849s = dimensionPixelSize;
        this.f17848r = dimensionPixelSize;
        this.f17841f = dimensionPixelSize;
        this.f17839e = dimensionPixelSize;
        this.f17839e = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26875c8, dimensionPixelSize);
        this.f17841f = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26886d8, this.f17841f);
        this.f17848r = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26864b8, this.f17848r);
        this.f17849s = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26853a8, this.f17849s);
        if (AbstractC4543s.m20816g(context2)) {
            this.f17850t = AbstractC6742c.f26273p0;
        } else {
            this.f17850t = AbstractC6742c.f26269n0;
        }
        int resourceId = typedArrayM20818i.getResourceId(i9, AbstractC6751l.f26539d);
        this.f17851u = resourceId;
        int[] iArr2 = AbstractC5529j.f21122B2;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            int i10 = AbstractC5529j.f21127C2;
            this.f17810C = typedArrayObtainStyledAttributes.getDimensionPixelSize(i10, 0);
            int i11 = AbstractC5529j.f21142F2;
            this.f17853w = AbstractC0423c.m1825a(context2, typedArrayObtainStyledAttributes, i11);
            typedArrayObtainStyledAttributes.recycle();
            int i12 = AbstractC6752m.f26908f8;
            if (typedArrayM20818i.hasValue(i12)) {
                this.f17852v = typedArrayM20818i.getResourceId(i12, resourceId);
            }
            int i13 = this.f17852v;
            if (i13 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i13, iArr2);
                try {
                    this.f17811D = typedArrayObtainStyledAttributes2.getDimensionPixelSize(i10, (int) this.f17810C);
                    ColorStateList colorStateListM1825a = AbstractC0423c.m1825a(context2, typedArrayObtainStyledAttributes2, i11);
                    if (colorStateListM1825a != null) {
                        this.f17853w = m21325r(this.f17853w.getDefaultColor(), colorStateListM1825a.getColorForState(new int[]{R.attr.state_selected}, colorStateListM1825a.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            int i14 = AbstractC6752m.f26941i8;
            if (typedArrayM20818i.hasValue(i14)) {
                this.f17853w = AbstractC0423c.m1825a(context2, typedArrayM20818i, i14);
            }
            int i15 = AbstractC6752m.f26919g8;
            if (typedArrayM20818i.hasValue(i15)) {
                this.f17853w = m21325r(this.f17853w.getDefaultColor(), typedArrayM20818i.getColor(i15, 0));
            }
            this.f17854x = AbstractC0423c.m1825a(context2, typedArrayM20818i, AbstractC6752m.f26702M7);
            this.f17809B = AbstractC4546v.m20835j(typedArrayM20818i.getInt(AbstractC6752m.f26713N7, -1), null);
            this.f17855y = AbstractC0423c.m1825a(context2, typedArrayM20818i, AbstractC6752m.f26897e8);
            this.f17820M = typedArrayM20818i.getInt(AbstractC6752m.f26735P7, 300);
            this.f17829V = AbstractC0196h.m979g(context2, AbstractC6742c.f26234S, AbstractC6826a.f27405b);
            this.f17815H = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26822X7, -1);
            this.f17816I = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26812W7, -1);
            this.f17813F = typedArrayM20818i.getResourceId(AbstractC6752m.f26669J7, 0);
            this.f17818K = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26680K7, 0);
            this.f17822O = typedArrayM20818i.getInt(AbstractC6752m.f26832Y7, 1);
            this.f17819L = typedArrayM20818i.getInt(AbstractC6752m.f26691L7, 0);
            this.f17823P = typedArrayM20818i.getBoolean(AbstractC6752m.f26801V7, false);
            this.f17827T = typedArrayM20818i.getBoolean(AbstractC6752m.f26952j8, false);
            typedArrayM20818i.recycle();
            Resources resources = getResources();
            this.f17812E = resources.getDimensionPixelSize(AbstractC6744e.f26350j);
            this.f17817J = resources.getDimensionPixelSize(AbstractC6744e.f26348i);
            m21322o();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i7) {
        m21319l(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC4609c interfaceC4609c) {
        InterfaceC4609c interfaceC4609c2 = this.f17830W;
        if (interfaceC4609c2 != null) {
            m21337G(interfaceC4609c2);
        }
        this.f17830W = interfaceC4609c;
        if (interfaceC4609c != null) {
            m21347g(interfaceC4609c);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m21319l(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        m21319l(view);
    }

    public void setSelectedTabIndicator(int i7) {
        if (i7 != 0) {
            setSelectedTabIndicator(AbstractC5659a.m25175b(getContext(), i7));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
