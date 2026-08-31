package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.AbstractC4528d;
import com.google.android.material.internal.AbstractC4543s;
import java.util.Iterator;
import java.util.List;
import p069I3.C0627n;
import p093L3.AbstractC0842a;
import p325p3.AbstractC6741b;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p333q3.C6831f;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC2422b {

    /* JADX INFO: renamed from: q0 */
    private static final int f17039q0 = AbstractC6751l.f26561z;

    /* JADX INFO: renamed from: r0 */
    static final Property f17040r0 = new C4505f(Float.class, "width");

    /* JADX INFO: renamed from: s0 */
    static final Property f17041s0 = new C4506g(Float.class, "height");

    /* JADX INFO: renamed from: t0 */
    static final Property f17042t0 = new C4507h(Float.class, "paddingStart");

    /* JADX INFO: renamed from: u0 */
    static final Property f17043u0 = new C4508i(Float.class, "paddingEnd");

    /* JADX INFO: renamed from: V */
    private int f17044V;

    /* JADX INFO: renamed from: W */
    private boolean f17045W;

    /* JADX INFO: renamed from: a0 */
    private final C4516a f17046a0;

    /* JADX INFO: renamed from: b0 */
    private final InterfaceC4521f f17047b0;

    /* JADX INFO: renamed from: c0 */
    private final InterfaceC4521f f17048c0;

    /* JADX INFO: renamed from: d0 */
    private final InterfaceC4521f f17049d0;

    /* JADX INFO: renamed from: e0 */
    private final InterfaceC4521f f17050e0;

    /* JADX INFO: renamed from: f0 */
    private final int f17051f0;

    /* JADX INFO: renamed from: g0 */
    private int f17052g0;

    /* JADX INFO: renamed from: h0 */
    private int f17053h0;

    /* JADX INFO: renamed from: i0 */
    private final CoordinatorLayout.AbstractC2423c f17054i0;

    /* JADX INFO: renamed from: j0 */
    private boolean f17055j0;

    /* JADX INFO: renamed from: k0 */
    private boolean f17056k0;

    /* JADX INFO: renamed from: l0 */
    private boolean f17057l0;

    /* JADX INFO: renamed from: m0 */
    protected ColorStateList f17058m0;

    /* JADX INFO: renamed from: n0 */
    private int f17059n0;

    /* JADX INFO: renamed from: o0 */
    private int f17060o0;

    /* JADX INFO: renamed from: p0 */
    private final int f17061p0;

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C4500a implements InterfaceC4513n {
        C4500a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        /* JADX INFO: renamed from: a */
        public int mo20480a() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        /* JADX INFO: renamed from: b */
        public int mo20481b() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    class C4501b implements InterfaceC4513n {
        C4501b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        /* JADX INFO: renamed from: a */
        public int mo20480a() {
            return ExtendedFloatingActionButton.this.f17053h0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        /* JADX INFO: renamed from: b */
        public int mo20481b() {
            return ExtendedFloatingActionButton.this.f17052g0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        public int getWidth() {
            return ((ExtendedFloatingActionButton.this.getMeasuredWidth() - ExtendedFloatingActionButton.this.getPaddingStart()) - ExtendedFloatingActionButton.this.getPaddingEnd()) + ExtendedFloatingActionButton.this.f17052g0 + ExtendedFloatingActionButton.this.f17053h0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    class C4502c implements InterfaceC4513n {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC4513n f17067a;

        C4502c(InterfaceC4513n interfaceC4513n) {
            this.f17067a = interfaceC4513n;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        /* JADX INFO: renamed from: a */
        public int mo20480a() {
            return ExtendedFloatingActionButton.this.f17053h0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        /* JADX INFO: renamed from: b */
        public int mo20481b() {
            return ExtendedFloatingActionButton.this.f17052g0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        public int getHeight() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (ExtendedFloatingActionButton.this.f17060o0 != -1) {
                return (ExtendedFloatingActionButton.this.f17060o0 == 0 || ExtendedFloatingActionButton.this.f17060o0 == -2) ? this.f17067a.getHeight() : ExtendedFloatingActionButton.this.f17060o0;
            }
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f17067a.getHeight();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.height != -2) {
                return (view.getHeight() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingTop() + view.getPaddingBottom());
            }
            return this.f17067a.getHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.f17060o0 == 0 ? -2 : ExtendedFloatingActionButton.this.f17060o0);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        public int getWidth() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f17067a.getWidth();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.width != -2) {
                return (view.getWidth() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingLeft() + view.getPaddingRight());
            }
            return this.f17067a.getWidth();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    class C4503d implements InterfaceC4513n {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC4513n f17069a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC4513n f17070b;

        C4503d(InterfaceC4513n interfaceC4513n, InterfaceC4513n interfaceC4513n2) {
            this.f17069a = interfaceC4513n;
            this.f17070b = interfaceC4513n2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        /* JADX INFO: renamed from: a */
        public int mo20480a() {
            return ExtendedFloatingActionButton.this.f17053h0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        /* JADX INFO: renamed from: b */
        public int mo20481b() {
            return ExtendedFloatingActionButton.this.f17052g0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        public int getHeight() {
            if (ExtendedFloatingActionButton.this.f17060o0 == -1) {
                return this.f17069a.getHeight();
            }
            return (ExtendedFloatingActionButton.this.f17060o0 == 0 || ExtendedFloatingActionButton.this.f17060o0 == -2) ? this.f17070b.getHeight() : ExtendedFloatingActionButton.this.f17060o0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.f17059n0 == 0 ? -2 : ExtendedFloatingActionButton.this.f17059n0, ExtendedFloatingActionButton.this.f17060o0 != 0 ? ExtendedFloatingActionButton.this.f17060o0 : -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC4513n
        public int getWidth() {
            if (ExtendedFloatingActionButton.this.f17059n0 == -1) {
                return this.f17069a.getWidth();
            }
            return (ExtendedFloatingActionButton.this.f17059n0 == 0 || ExtendedFloatingActionButton.this.f17059n0 == -2) ? this.f17070b.getWidth() : ExtendedFloatingActionButton.this.f17059n0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    class C4504e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        private boolean f17072a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC4521f f17073b;

        C4504e(InterfaceC4521f interfaceC4521f, AbstractC4511l abstractC4511l) {
            this.f17073b = interfaceC4521f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f17072a = true;
            this.f17073b.mo20496a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17073b.mo20493g();
            if (this.f17072a) {
                return;
            }
            this.f17073b.mo20495j(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f17073b.onAnimationStart(animator);
            this.f17072a = false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    class C4505f extends Property {
        C4505f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f7) {
            view.getLayoutParams().width = f7.intValue();
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    class C4506g extends Property {
        C4506g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f7) {
            view.getLayoutParams().height = f7.intValue();
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    class C4507h extends Property {
        C4507h(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f7) {
            view.setPaddingRelative(f7.intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    class C4508i extends Property {
        C4508i(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f7) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f7.intValue(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    class C4509j extends AbstractC4517b {

        /* JADX INFO: renamed from: g */
        private final InterfaceC4513n f17075g;

        /* JADX INFO: renamed from: h */
        private final boolean f17076h;

        C4509j(C4516a c4516a, InterfaceC4513n interfaceC4513n, boolean z7) {
            super(ExtendedFloatingActionButton.this, c4516a);
            this.f17075g = interfaceC4513n;
            this.f17076h = z7;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: b */
        public int mo20490b() {
            return this.f17076h ? AbstractC6741b.f26209b : AbstractC6741b.f26208a;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: c */
        public void mo20491c() {
            ExtendedFloatingActionButton.this.f17055j0 = this.f17076h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.f17076h) {
                ExtendedFloatingActionButton.this.f17059n0 = layoutParams.width;
                ExtendedFloatingActionButton.this.f17060o0 = layoutParams.height;
            }
            layoutParams.width = this.f17075g.getLayoutParams().width;
            layoutParams.height = this.f17075g.getLayoutParams().height;
            if (this.f17076h) {
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                extendedFloatingActionButton.m20470Q(extendedFloatingActionButton.f17058m0);
            } else if (ExtendedFloatingActionButton.this.getText() != null && ExtendedFloatingActionButton.this.getText() != "") {
                ExtendedFloatingActionButton.this.m20470Q(ColorStateList.valueOf(0));
            }
            ExtendedFloatingActionButton.this.setPaddingRelative(this.f17075g.mo20481b(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f17075g.mo20480a(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: f */
        public boolean mo20492f() {
            return this.f17076h == ExtendedFloatingActionButton.this.f17055j0 || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC4517b, com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: g */
        public void mo20493g() {
            super.mo20493g();
            ExtendedFloatingActionButton.this.f17056k0 = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f17075g.getLayoutParams().width;
            layoutParams.height = this.f17075g.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC4517b, com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: h */
        public AnimatorSet mo20494h() {
            C6831f c6831fM20523m = m20523m();
            if (c6831fM20523m.m29859i("width")) {
                PropertyValuesHolder[] propertyValuesHolderArrM29857g = c6831fM20523m.m29857g("width");
                propertyValuesHolderArrM29857g[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f17075g.getWidth());
                c6831fM20523m.m29861k("width", propertyValuesHolderArrM29857g);
            }
            if (c6831fM20523m.m29859i("height")) {
                PropertyValuesHolder[] propertyValuesHolderArrM29857g2 = c6831fM20523m.m29857g("height");
                propertyValuesHolderArrM29857g2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f17075g.getHeight());
                c6831fM20523m.m29861k("height", propertyValuesHolderArrM29857g2);
            }
            if (c6831fM20523m.m29859i("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrM29857g3 = c6831fM20523m.m29857g("paddingStart");
                propertyValuesHolderArrM29857g3[0].setFloatValues(ExtendedFloatingActionButton.this.getPaddingStart(), this.f17075g.mo20481b());
                c6831fM20523m.m29861k("paddingStart", propertyValuesHolderArrM29857g3);
            }
            if (c6831fM20523m.m29859i("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrM29857g4 = c6831fM20523m.m29857g("paddingEnd");
                propertyValuesHolderArrM29857g4[0].setFloatValues(ExtendedFloatingActionButton.this.getPaddingEnd(), this.f17075g.mo20480a());
                c6831fM20523m.m29861k("paddingEnd", propertyValuesHolderArrM29857g4);
            }
            if (c6831fM20523m.m29859i("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrM29857g5 = c6831fM20523m.m29857g("labelOpacity");
                boolean z7 = this.f17076h;
                propertyValuesHolderArrM29857g5[0].setFloatValues(z7 ? 0.0f : 1.0f, z7 ? 1.0f : 0.0f);
                c6831fM20523m.m29861k("labelOpacity", propertyValuesHolderArrM29857g5);
            }
            return super.m20522l(c6831fM20523m);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: j */
        public void mo20495j(AbstractC4511l abstractC4511l) {
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC4517b, com.google.android.material.floatingactionbutton.InterfaceC4521f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.f17055j0 = this.f17076h;
            ExtendedFloatingActionButton.this.f17056k0 = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    class C4510k extends AbstractC4517b {

        /* JADX INFO: renamed from: g */
        private boolean f17078g;

        public C4510k(C4516a c4516a) {
            super(ExtendedFloatingActionButton.this, c4516a);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC4517b, com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: a */
        public void mo20496a() {
            super.mo20496a();
            this.f17078g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: b */
        public int mo20490b() {
            return AbstractC6741b.f26210c;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: c */
        public void mo20491c() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: f */
        public boolean mo20492f() {
            return ExtendedFloatingActionButton.this.m20454J();
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC4517b, com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: g */
        public void mo20493g() {
            super.mo20493g();
            ExtendedFloatingActionButton.this.f17044V = 0;
            if (this.f17078g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: j */
        public void mo20495j(AbstractC4511l abstractC4511l) {
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC4517b, com.google.android.material.floatingactionbutton.InterfaceC4521f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f17078g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f17044V = 1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l */
    public static abstract class AbstractC4511l {
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$m */
    class C4512m extends AbstractC4517b {
        public C4512m(C4516a c4516a) {
            super(ExtendedFloatingActionButton.this, c4516a);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: b */
        public int mo20490b() {
            return AbstractC6741b.f26211d;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: c */
        public void mo20491c() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: f */
        public boolean mo20492f() {
            return ExtendedFloatingActionButton.this.m20455K();
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC4517b, com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: g */
        public void mo20493g() {
            super.mo20493g();
            ExtendedFloatingActionButton.this.f17044V = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
        /* JADX INFO: renamed from: j */
        public void mo20495j(AbstractC4511l abstractC4511l) {
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC4517b, com.google.android.material.floatingactionbutton.InterfaceC4521f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f17044V = 2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n */
    interface InterfaceC4513n {
        /* JADX INFO: renamed from: a */
        int mo20480a();

        /* JADX INFO: renamed from: b */
        int mo20481b();

        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26274q);
    }

    /* JADX INFO: renamed from: H */
    private InterfaceC4513n m20453H(int i7) {
        C4501b c4501b = new C4501b();
        C4502c c4502c = new C4502c(c4501b);
        C4503d c4503d = new C4503d(c4502c, c4501b);
        if (i7 != 1) {
            return i7 != 2 ? c4503d : c4502c;
        }
        return c4501b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public boolean m20454J() {
        if (getVisibility() == 0) {
            return this.f17044V == 1;
        }
        return this.f17044V != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public boolean m20455K() {
        if (getVisibility() != 0) {
            return this.f17044V == 2;
        }
        return this.f17044V != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public void m20456L(int i7, AbstractC4511l abstractC4511l) {
        InterfaceC4521f interfaceC4521f;
        if (i7 == 0) {
            interfaceC4521f = this.f17049d0;
        } else if (i7 == 1) {
            interfaceC4521f = this.f17050e0;
        } else if (i7 == 2) {
            interfaceC4521f = this.f17047b0;
        } else {
            if (i7 != 3) {
                throw new IllegalStateException("Unknown strategy type: " + i7);
            }
            interfaceC4521f = this.f17048c0;
        }
        if (interfaceC4521f.mo20492f()) {
            return;
        }
        if (!m20458N()) {
            interfaceC4521f.mo20491c();
            interfaceC4521f.mo20495j(abstractC4511l);
            return;
        }
        if (i7 == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.f17059n0 = layoutParams.width;
                this.f17060o0 = layoutParams.height;
            } else {
                this.f17059n0 = getWidth();
                this.f17060o0 = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet animatorSetMo20494h = interfaceC4521f.mo20494h();
        animatorSetMo20494h.addListener(new C4504e(interfaceC4521f, abstractC4511l));
        Iterator it = interfaceC4521f.mo20521i().iterator();
        while (it.hasNext()) {
            animatorSetMo20494h.addListener((Animator.AnimatorListener) it.next());
        }
        animatorSetMo20494h.start();
    }

    /* JADX INFO: renamed from: M */
    private void m20457M() {
        this.f17058m0 = getTextColors();
    }

    /* JADX INFO: renamed from: N */
    private boolean m20458N() {
        if (this.f17045W) {
            return (isLaidOut() || (!m20455K() && this.f17057l0)) && !isInEditMode();
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public void m20466G() {
        m20456L(3, null);
    }

    /* JADX INFO: renamed from: I */
    public void m20467I() {
        m20456L(1, null);
    }

    /* JADX INFO: renamed from: O */
    public void m20468O() {
        m20456L(0, null);
    }

    /* JADX INFO: renamed from: P */
    public void m20469P() {
        m20456L(2, null);
    }

    /* JADX INFO: renamed from: Q */
    protected void m20470Q(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC2422b
    public CoordinatorLayout.AbstractC2423c getBehavior() {
        return this.f17054i0;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i7 = this.f17051f0;
        return i7 < 0 ? (Math.min(getPaddingStart(), getPaddingEnd()) * 2) + getIconSize() : i7;
    }

    public C6831f getExtendMotionSpec() {
        return this.f17048c0.mo20519d();
    }

    public C6831f getHideMotionSpec() {
        return this.f17050e0.mo20519d();
    }

    public C6831f getShowMotionSpec() {
        return this.f17049d0.mo20519d();
    }

    public C6831f getShrinkMotionSpec() {
        return this.f17047b0.mo20519d();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17055j0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f17055j0 = false;
            this.f17047b0.mo20491c();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z7) {
        this.f17057l0 = z7;
    }

    public void setAnimationEnabled(boolean z7) {
        this.f17045W = z7;
    }

    public void setExtendMotionSpec(C6831f c6831f) {
        this.f17048c0.mo20520e(c6831f);
    }

    public void setExtendMotionSpecResource(int i7) {
        setExtendMotionSpec(C6831f.m29854d(getContext(), i7));
    }

    public void setExtended(boolean z7) {
        if (this.f17055j0 == z7) {
            return;
        }
        InterfaceC4521f interfaceC4521f = z7 ? this.f17048c0 : this.f17047b0;
        if (interfaceC4521f.mo20492f()) {
            return;
        }
        interfaceC4521f.mo20491c();
    }

    public void setHideMotionSpec(C6831f c6831f) {
        this.f17050e0.mo20520e(c6831f);
    }

    public void setHideMotionSpecResource(int i7) {
        setHideMotionSpec(C6831f.m29854d(getContext(), i7));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i7, int i8, int i9, int i10) {
        super.setPadding(i7, i8, i9, i10);
        if (!this.f17055j0 || this.f17056k0) {
            return;
        }
        this.f17052g0 = getPaddingStart();
        this.f17053h0 = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i7, int i8, int i9, int i10) {
        super.setPaddingRelative(i7, i8, i9, i10);
        if (!this.f17055j0 || this.f17056k0) {
            return;
        }
        this.f17052g0 = i7;
        this.f17053h0 = i9;
    }

    public void setShowMotionSpec(C6831f c6831f) {
        this.f17049d0.mo20520e(c6831f);
    }

    public void setShowMotionSpecResource(int i7) {
        setShowMotionSpec(C6831f.m29854d(getContext(), i7));
    }

    public void setShrinkMotionSpec(C6831f c6831f) {
        this.f17047b0.mo20520e(c6831f);
    }

    public void setShrinkMotionSpecResource(int i7) {
        setShrinkMotionSpec(C6831f.m29854d(getContext(), i7));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        m20457M();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17039q0;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        this.f17044V = 0;
        this.f17045W = true;
        C4516a c4516a = new C4516a();
        this.f17046a0 = c4516a;
        C4512m c4512m = new C4512m(c4516a);
        this.f17049d0 = c4512m;
        C4510k c4510k = new C4510k(c4516a);
        this.f17050e0 = c4510k;
        this.f17055j0 = true;
        this.f17056k0 = false;
        this.f17057l0 = false;
        Context context2 = getContext();
        this.f17054i0 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context2, attributeSet, AbstractC6752m.f26773T1, i7, i8, new int[0]);
        C6831f c6831fM29853c = C6831f.m29853c(context2, typedArrayM20818i, AbstractC6752m.f26826Y1);
        C6831f c6831fM29853c2 = C6831f.m29853c(context2, typedArrayM20818i, AbstractC6752m.f26816X1);
        C6831f c6831fM29853c3 = C6831f.m29853c(context2, typedArrayM20818i, AbstractC6752m.f26795V1);
        C6831f c6831fM29853c4 = C6831f.m29853c(context2, typedArrayM20818i, AbstractC6752m.f26836Z1);
        this.f17051f0 = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26784U1, -1);
        int i9 = typedArrayM20818i.getInt(AbstractC6752m.f26806W1, 1);
        this.f17061p0 = i9;
        this.f17052g0 = getPaddingStart();
        this.f17053h0 = getPaddingEnd();
        C4516a c4516a2 = new C4516a();
        C4509j c4509j = new C4509j(c4516a2, m20453H(i9), true);
        this.f17048c0 = c4509j;
        C4509j c4509j2 = new C4509j(c4516a2, new C4500a(), false);
        this.f17047b0 = c4509j2;
        c4512m.mo20520e(c6831fM29853c);
        c4510k.mo20520e(c6831fM29853c2);
        c4509j.mo20520e(c6831fM29853c3);
        c4509j2.mo20520e(c6831fM29853c4);
        typedArrayM20818i.recycle();
        setShapeAppearanceModel(C0627n.m2760g(context2, attributeSet, i7, i8, C0627n.f2403m).m2802m());
        m20457M();
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC2423c {

        /* JADX INFO: renamed from: a */
        private Rect f17062a;

        /* JADX INFO: renamed from: b */
        private boolean f17063b;

        /* JADX INFO: renamed from: c */
        private boolean f17064c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f17063b = false;
            this.f17064c = true;
        }

        /* JADX INFO: renamed from: K */
        private static boolean m20471K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C2426f) {
                return ((CoordinatorLayout.C2426f) layoutParams).m10530f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* JADX INFO: renamed from: N */
        private boolean m20472N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f17063b || this.f17064c) && ((CoordinatorLayout.C2426f) extendedFloatingActionButton.getLayoutParams()).m10529e() == view.getId();
        }

        /* JADX INFO: renamed from: P */
        private boolean m20473P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m20472N(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f17062a == null) {
                this.f17062a = new Rect();
            }
            Rect rect = this.f17062a;
            AbstractC4528d.m20694a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                m20479O(extendedFloatingActionButton);
                return true;
            }
            m20475I(extendedFloatingActionButton);
            return true;
        }

        /* JADX INFO: renamed from: Q */
        private boolean m20474Q(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m20472N(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C2426f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                m20479O(extendedFloatingActionButton);
                return true;
            }
            m20475I(extendedFloatingActionButton);
            return true;
        }

        /* JADX INFO: renamed from: I */
        protected void m20475I(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m20456L(this.f17064c ? 3 : 0, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean mo10501f(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo10501f(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean mo10507l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m20473P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!m20471K(view)) {
                return false;
            }
            m20474Q(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean mo10511p(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i7) {
            List listM10488v = coordinatorLayout.m10488v(extendedFloatingActionButton);
            int size = listM10488v.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) listM10488v.get(i8);
                if (!(view instanceof AppBarLayout)) {
                    if (m20471K(view) && m20474Q(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m20473P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m10476Q(extendedFloatingActionButton, i7);
            return true;
        }

        /* JADX INFO: renamed from: O */
        protected void m20479O(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m20456L(this.f17064c ? 2 : 1, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: k */
        public void mo10506k(CoordinatorLayout.C2426f c2426f) {
            if (c2426f.f9262h == 0) {
                c2426f.f9262h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6752m.f26847a2);
            this.f17063b = typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f26858b2, false);
            this.f17064c = typedArrayObtainStyledAttributes.getBoolean(AbstractC6752m.f26869c2, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m20457M();
    }
}
