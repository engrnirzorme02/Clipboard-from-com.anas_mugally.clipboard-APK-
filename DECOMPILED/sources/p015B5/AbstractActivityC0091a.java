package p015B5;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextSwitcher;
import androidx.appcompat.app.AbstractActivityC2242c;
import androidx.appcompat.app.AbstractC2263x;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2436b;
import androidx.lifecycle.InterfaceC2657s;
import com.heinrichreimersoftware.materialintro.view.FadeableViewPager;
import com.heinrichreimersoftware.materialintro.view.InkPageIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p007A5.AbstractC0028a;
import p007A5.AbstractC0029b;
import p007A5.AbstractC0030c;
import p007A5.AbstractC0031d;
import p007A5.AbstractC0032e;
import p007A5.AbstractC0033f;
import p007A5.AbstractC0035h;
import p023C5.C0151f;
import p023C5.InterfaceC0146a;
import p023C5.InterfaceC0150e;
import p031D5.AbstractC0218a;
import p031D5.AbstractC0219b;
import p033E.AbstractC0246a;
import p041F.AbstractC0400a;
import p047F5.InterfaceC0434b;
import p104N.C0906c;
import p111O.AbstractC1030Z;
import p223d.AbstractC5158A;
import p255h.AbstractC5520a;

/* JADX INFO: renamed from: B5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0091a extends AbstractActivityC2242c {

    /* JADX INFO: renamed from: p0 */
    public static final Interpolator f480p0 = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: P */
    private ConstraintLayout f482P;

    /* JADX INFO: renamed from: Q */
    private FadeableViewPager f483Q;

    /* JADX INFO: renamed from: R */
    private InkPageIndicator f484R;

    /* JADX INFO: renamed from: S */
    private TextSwitcher f485S;

    /* JADX INFO: renamed from: T */
    private ImageButton f486T;

    /* JADX INFO: renamed from: U */
    private ImageButton f487U;

    /* JADX INFO: renamed from: W */
    private C0151f f489W;

    /* JADX INFO: renamed from: l0 */
    private int f504l0;

    /* JADX INFO: renamed from: m0 */
    private long f505m0;

    /* JADX INFO: renamed from: n0 */
    private Interpolator f506n0;

    /* JADX INFO: renamed from: o0 */
    private long f507o0;

    /* JADX INFO: renamed from: O */
    private boolean f481O = false;

    /* JADX INFO: renamed from: V */
    private final ArgbEvaluator f488V = new ArgbEvaluator();

    /* JADX INFO: renamed from: X */
    private h f490X = new h(this, null);

    /* JADX INFO: renamed from: Y */
    private int f491Y = 0;

    /* JADX INFO: renamed from: Z */
    private float f492Z = 0.0f;

    /* JADX INFO: renamed from: a0 */
    private boolean f493a0 = false;

    /* JADX INFO: renamed from: b0 */
    private boolean f494b0 = false;

    /* JADX INFO: renamed from: c0 */
    private int f495c0 = 2;

    /* JADX INFO: renamed from: d0 */
    private int f496d0 = 2;

    /* JADX INFO: renamed from: e0 */
    private int f497e0 = 1;

    /* JADX INFO: renamed from: f0 */
    private List f498f0 = new ArrayList();

    /* JADX INFO: renamed from: g0 */
    private CharSequence f499g0 = null;

    /* JADX INFO: renamed from: h0 */
    private int f500h0 = 0;

    /* JADX INFO: renamed from: i0 */
    private View.OnClickListener f501i0 = null;

    /* JADX INFO: renamed from: j0 */
    private Handler f502j0 = new Handler();

    /* JADX INFO: renamed from: k0 */
    private Runnable f503k0 = null;

    /* JADX INFO: renamed from: B5.a$a */
    class a extends AbstractC5158A {
        a(boolean z7) {
            super(z7);
        }

        @Override // p223d.AbstractC5158A
        /* JADX INFO: renamed from: d */
        public void mo363d() {
            if (AbstractActivityC0091a.this.f491Y > 0) {
                AbstractActivityC0091a.this.m346E1();
                return;
            }
            Intent intentM345C1 = AbstractActivityC0091a.this.m345C1(0);
            if (intentM345C1 != null) {
                AbstractActivityC0091a.this.setResult(0, intentM345C1);
            } else {
                AbstractActivityC0091a.this.setResult(0);
            }
            m23915j(false);
            AbstractActivityC0091a.this.mo12238b().m23939s();
        }
    }

    /* JADX INFO: renamed from: B5.a$b */
    class b implements View.OnLayoutChangeListener {
        b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            AbstractActivityC0091a.this.m326X1();
            view.removeOnLayoutChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: B5.a$c */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractActivityC0091a.this.m362z1();
        }
    }

    /* JADX INFO: renamed from: B5.a$d */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractActivityC0091a.this.m312D1();
        }
    }

    /* JADX INFO: renamed from: B5.a$e */
    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f512a;

        e(int i7) {
            this.f512a = i7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (AbstractActivityC0091a.this.f483Q.m14377z()) {
                AbstractActivityC0091a.this.f483Q.m14370p();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (AbstractActivityC0091a.this.f483Q.m14377z()) {
                AbstractActivityC0091a.this.f483Q.m14370p();
            }
            AbstractActivityC0091a.this.f483Q.setCurrentItem(this.f512a);
        }
    }

    /* JADX INFO: renamed from: B5.a$f */
    class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x004b  */
        /* JADX WARN: Code duplicated, block: B:9:0x0047  */
        /* JADX INFO: renamed from: a */
        private boolean m364a(float f7) {
            double d7;
            float scrollX = AbstractActivityC0091a.this.f483Q.getScrollX();
            int width = AbstractActivityC0091a.this.f483Q.getWidth();
            int currentItem = AbstractActivityC0091a.this.f483Q.getCurrentItem();
            float f8 = currentItem;
            if (f7 > f8) {
                double d8 = f7;
                if (Math.floor(d8) != currentItem && f7 % 1.0f != 0.0f) {
                    AbstractActivityC0091a.this.f483Q.m14358Q((int) Math.floor(d8), false);
                } else if (f7 < f8) {
                    d7 = f7;
                    if (Math.ceil(d7) != currentItem && f7 % 1.0f != 0.0f) {
                        AbstractActivityC0091a.this.f483Q.m14358Q((int) Math.ceil(d7), false);
                    }
                }
            } else if (f7 < f8) {
                d7 = f7;
                if (Math.ceil(d7) != currentItem) {
                    AbstractActivityC0091a.this.f483Q.m14358Q((int) Math.ceil(d7), false);
                }
            }
            if (!AbstractActivityC0091a.this.f483Q.m14377z() && !AbstractActivityC0091a.this.f483Q.m14366e()) {
                return false;
            }
            AbstractActivityC0091a.this.f483Q.m14372r(scrollX - (width * f7));
            return true;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            m364a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: B5.a$g */
    private class g implements View.OnClickListener {
        private g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractActivityC0091a abstractActivityC0091a = AbstractActivityC0091a.this;
            abstractActivityC0091a.m359v1(abstractActivityC0091a.m356s1());
        }

        /* synthetic */ g(AbstractActivityC0091a abstractActivityC0091a, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: B5.a$h */
    private class h extends FadeableViewPager.C5144e {
        private h() {
        }

        @Override // androidx.viewpager.widget.AbstractC2870b.j
        /* JADX INFO: renamed from: a */
        public void mo365a(int i7, float f7, int i8) {
            float f8 = i7 + f7;
            AbstractActivityC0091a.this.f491Y = (int) Math.floor(f8);
            AbstractActivityC0091a.this.f492Z = ((f8 % 1.0f) + 1.0f) % 1.0f;
            if (AbstractActivityC0091a.this.m340o1()) {
                return;
            }
            if (Math.abs(f7) < 0.1f) {
                AbstractActivityC0091a.this.m361y1();
            }
            AbstractActivityC0091a.this.m321S1();
            AbstractActivityC0091a.this.m326X1();
        }

        @Override // androidx.viewpager.widget.AbstractC2870b.j
        /* JADX INFO: renamed from: c */
        public void mo366c(int i7) {
            AbstractActivityC0091a.this.f491Y = i7;
            AbstractActivityC0091a.this.m327Y1();
            AbstractActivityC0091a.this.m361y1();
        }

        /* synthetic */ h(AbstractActivityC0091a abstractActivityC0091a, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public void m312D1() {
        int i7 = this.f496d0;
        if (i7 == 2) {
            m359v1(m356s1());
        } else if (i7 == 1) {
            m346E1();
        }
    }

    /* JADX INFO: renamed from: K1 */
    private void m313K1(boolean z7) {
        m314L1(4100, z7);
    }

    /* JADX INFO: renamed from: L1 */
    private void m314L1(int i7, boolean z7) {
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        getWindow().getDecorView().setSystemUiVisibility(z7 ? i7 | systemUiVisibility : (~i7) & systemUiVisibility);
    }

    /* JADX INFO: renamed from: M1 */
    private void m315M1(int i7) {
        if (this.f483Q.m14377z()) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f483Q.getCurrentItem(), i7);
        valueAnimatorOfFloat.addListener(new e(i7));
        valueAnimatorOfFloat.addUpdateListener(new f());
        int iAbs = Math.abs(i7 - this.f483Q.getCurrentItem());
        valueAnimatorOfFloat.setInterpolator(this.f506n0);
        valueAnimatorOfFloat.setDuration(m337k1(iAbs));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: N1 */
    private void m316N1() {
        int iM1182k;
        int iM1182k2;
        int color;
        int color2;
        if (this.f491Y == m356s1()) {
            iM1182k = 0;
            iM1182k2 = 0;
            color = 0;
            color2 = 0;
        } else {
            int color3 = AbstractC2436b.getColor(this, m354p1(this.f491Y));
            int color4 = AbstractC2436b.getColor(this, m354p1(Math.min(this.f491Y + 1, m356s1() - 1)));
            iM1182k = AbstractC0246a.m1182k(color3, 255);
            iM1182k2 = AbstractC0246a.m1182k(color4, 255);
            try {
                color = AbstractC2436b.getColor(this, m355q1(this.f491Y));
            } catch (Resources.NotFoundException unused) {
                color = AbstractC2436b.getColor(this, AbstractC0029b.f156c);
            }
            try {
                color2 = AbstractC2436b.getColor(this, m355q1(Math.min(this.f491Y + 1, m356s1() - 1)));
            } catch (Resources.NotFoundException unused2) {
                color2 = AbstractC2436b.getColor(this, AbstractC0029b.f156c);
            }
        }
        if (this.f491Y + this.f492Z >= this.f489W.mo684c() - 1) {
            iM1182k2 = AbstractC0246a.m1182k(iM1182k, 0);
            color2 = AbstractC0246a.m1182k(color, 0);
        }
        int iIntValue = ((Integer) this.f488V.evaluate(this.f492Z, Integer.valueOf(iM1182k), Integer.valueOf(iM1182k2))).intValue();
        int iIntValue2 = ((Integer) this.f488V.evaluate(this.f492Z, Integer.valueOf(color), Integer.valueOf(color2))).intValue();
        this.f482P.setBackgroundColor(iIntValue);
        float[] fArr = new float[3];
        Color.colorToHSV(iIntValue2, fArr);
        fArr[2] = (float) (((double) fArr[2]) * 0.95d);
        int iHSVToColor = Color.HSVToColor(fArr);
        this.f484R.setPageIndicatorColor(iHSVToColor);
        AbstractC1030Z.m4482n0(this.f487U, ColorStateList.valueOf(iHSVToColor));
        AbstractC1030Z.m4482n0(this.f486T, ColorStateList.valueOf(iHSVToColor));
        int color5 = this.f497e0 == 2 ? AbstractC2436b.getColor(this, R.color.white) : iHSVToColor;
        AbstractC1030Z.m4482n0(this.f485S.getChildAt(0), ColorStateList.valueOf(color5));
        AbstractC1030Z.m4482n0(this.f485S.getChildAt(1), ColorStateList.valueOf(color5));
        int color6 = AbstractC0246a.m1175d(iIntValue2) > 0.4d ? AbstractC2436b.getColor(this, AbstractC0029b.f155b) : AbstractC2436b.getColor(this, AbstractC0029b.f154a);
        this.f484R.setCurrentPageIndicatorColor(color6);
        AbstractC0400a.m1708n(this.f487U.getDrawable(), color6);
        AbstractC0400a.m1708n(this.f486T.getDrawable(), color6);
        if (this.f497e0 != 2) {
            iHSVToColor = color6;
        }
        ((Button) this.f485S.getChildAt(0)).setTextColor(iHSVToColor);
        ((Button) this.f485S.getChildAt(1)).setTextColor(iHSVToColor);
        getWindow().setStatusBarColor(iIntValue2);
        if (this.f491Y == this.f489W.mo684c()) {
            getWindow().setNavigationBarColor(0);
        } else if (this.f491Y + this.f492Z >= this.f489W.mo684c() - 1) {
            TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.navigationBarColor});
            int color7 = typedArrayObtainStyledAttributes.getColor(0, -16777216);
            typedArrayObtainStyledAttributes.recycle();
            getWindow().setNavigationBarColor(((Integer) this.f488V.evaluate(this.f492Z, Integer.valueOf(color7), 0)).intValue());
        }
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        getWindow().getDecorView().setSystemUiVisibility(AbstractC0246a.m1175d(iIntValue2) > 0.4d ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    /* JADX INFO: renamed from: O1 */
    private void m317O1() {
        if (this.f491Y + this.f492Z < this.f489W.mo684c() - 1) {
            this.f482P.setAlpha(1.0f);
        } else {
            this.f482P.setAlpha(1.0f - (this.f492Z * 0.5f));
        }
    }

    /* JADX INFO: renamed from: P1 */
    private void m318P1() {
        if (this.f496d0 == 2) {
            this.f486T.setImageResource(AbstractC0031d.f167e);
        } else {
            this.f486T.setImageResource(AbstractC0031d.f166d);
        }
    }

    /* JADX INFO: renamed from: Q1 */
    private void m319Q1() {
        float f7 = this.f491Y + this.f492Z;
        float dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC0030c.f162b);
        if (f7 < 1.0f && this.f496d0 == 1) {
            this.f486T.setTranslationY((1.0f - this.f492Z) * dimensionPixelSize);
            return;
        }
        if (f7 < this.f489W.mo684c() - 2) {
            this.f486T.setTranslationY(0.0f);
            this.f486T.setTranslationX(0.0f);
            return;
        }
        if (f7 < this.f489W.mo684c() - 1) {
            if (this.f496d0 == 2) {
                this.f486T.setTranslationX(this.f492Z * (getResources().getConfiguration().getLayoutDirection() == 1 ? 1 : -1) * this.f483Q.getWidth());
                return;
            } else {
                this.f486T.setTranslationX(0.0f);
                return;
            }
        }
        if (this.f496d0 != 2) {
            this.f486T.setTranslationY(this.f492Z * dimensionPixelSize);
        } else {
            this.f486T.setTranslationX((getResources().getConfiguration().getLayoutDirection() == 1 ? 1 : -1) * this.f483Q.getWidth());
        }
    }

    /* JADX INFO: renamed from: R1 */
    private void m320R1() {
        float f7 = this.f491Y + this.f492Z;
        float dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC0030c.f162b);
        if (f7 < this.f489W.mo684c()) {
            C0906c c0906cM341r1 = m341r1(this.f491Y);
            C0906c c0906cM341r2 = this.f492Z == 0.0f ? null : m341r1(this.f491Y + 1);
            if (c0906cM341r1 == null) {
                if (c0906cM341r2 == null) {
                    this.f485S.setVisibility(8);
                } else {
                    this.f485S.setVisibility(0);
                    if (!((Button) this.f485S.getCurrentView()).getText().equals(c0906cM341r2.f3546a)) {
                        this.f485S.setText((CharSequence) c0906cM341r2.f3546a);
                    }
                    this.f485S.getChildAt(0).setOnClickListener((View.OnClickListener) c0906cM341r2.f3547b);
                    this.f485S.getChildAt(1).setOnClickListener((View.OnClickListener) c0906cM341r2.f3547b);
                    this.f485S.setAlpha(this.f492Z);
                    this.f485S.setScaleX(this.f492Z);
                    this.f485S.setScaleY(this.f492Z);
                    ViewGroup.LayoutParams layoutParams = this.f485S.getLayoutParams();
                    layoutParams.height = Math.round(getResources().getDimensionPixelSize(AbstractC0030c.f161a) * f480p0.getInterpolation(this.f492Z));
                    this.f485S.setLayoutParams(layoutParams);
                }
            } else if (c0906cM341r2 == null) {
                this.f485S.setVisibility(0);
                if (!((Button) this.f485S.getCurrentView()).getText().equals(c0906cM341r1.f3546a)) {
                    this.f485S.setText((CharSequence) c0906cM341r1.f3546a);
                }
                this.f485S.getChildAt(0).setOnClickListener((View.OnClickListener) c0906cM341r1.f3547b);
                this.f485S.getChildAt(1).setOnClickListener((View.OnClickListener) c0906cM341r1.f3547b);
                this.f485S.setAlpha(1.0f - this.f492Z);
                this.f485S.setScaleX(1.0f - this.f492Z);
                this.f485S.setScaleY(1.0f - this.f492Z);
                ViewGroup.LayoutParams layoutParams2 = this.f485S.getLayoutParams();
                layoutParams2.height = Math.round(getResources().getDimensionPixelSize(AbstractC0030c.f161a) * f480p0.getInterpolation(1.0f - this.f492Z));
                this.f485S.setLayoutParams(layoutParams2);
            } else {
                this.f485S.setVisibility(0);
                ViewGroup.LayoutParams layoutParams3 = this.f485S.getLayoutParams();
                layoutParams3.height = getResources().getDimensionPixelSize(AbstractC0030c.f161a);
                this.f485S.setLayoutParams(layoutParams3);
                if (this.f492Z >= 0.5f) {
                    if (!((Button) this.f485S.getCurrentView()).getText().equals(c0906cM341r2.f3546a)) {
                        this.f485S.setText((CharSequence) c0906cM341r2.f3546a);
                    }
                    this.f485S.getChildAt(0).setOnClickListener((View.OnClickListener) c0906cM341r2.f3547b);
                    this.f485S.getChildAt(1).setOnClickListener((View.OnClickListener) c0906cM341r2.f3547b);
                } else {
                    if (!((Button) this.f485S.getCurrentView()).getText().equals(c0906cM341r1.f3546a)) {
                        this.f485S.setText((CharSequence) c0906cM341r1.f3546a);
                    }
                    this.f485S.getChildAt(0).setOnClickListener((View.OnClickListener) c0906cM341r1.f3547b);
                    this.f485S.getChildAt(1).setOnClickListener((View.OnClickListener) c0906cM341r1.f3547b);
                }
            }
        }
        if (f7 < this.f489W.mo684c() - 1) {
            this.f485S.setTranslationY(0.0f);
        } else {
            this.f485S.setTranslationY(this.f492Z * dimensionPixelSize);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX INFO: renamed from: S1 */
    public void m321S1() {
        float f7;
        float f8 = this.f491Y + this.f492Z;
        if (this.f495c0 != 2) {
            f7 = 0.0f;
        } else if (f8 >= this.f489W.mo684c() - 1) {
            f7 = 1.0f;
        } else if (f8 >= this.f489W.mo684c() - 2) {
            f7 = this.f492Z;
        } else {
            f7 = 0.0f;
        }
        if (f7 <= 0.0f) {
            this.f487U.setImageResource(AbstractC0031d.f164b);
            this.f487U.getDrawable().setAlpha(255);
            return;
        }
        this.f487U.setImageResource(AbstractC0031d.f165c);
        if (this.f487U.getDrawable() == null || !(this.f487U.getDrawable() instanceof LayerDrawable)) {
            this.f487U.setImageResource(f7 > 0.0f ? AbstractC0031d.f163a : AbstractC0031d.f164b);
            return;
        }
        LayerDrawable layerDrawable = (LayerDrawable) this.f487U.getDrawable();
        layerDrawable.getDrawable(0).setAlpha((int) ((1.0f - f7) * 255.0f));
        layerDrawable.getDrawable(1).setAlpha((int) (f7 * 255.0f));
    }

    /* JADX INFO: renamed from: T1 */
    private void m322T1() {
        float f7 = this.f491Y + this.f492Z;
        float dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC0030c.f162b);
        if (f7 < this.f489W.mo684c() - 2) {
            this.f487U.setTranslationY(0.0f);
            return;
        }
        if (f7 < this.f489W.mo684c() - 1) {
            if (this.f495c0 == 2) {
                this.f487U.setTranslationY(0.0f);
                return;
            } else {
                this.f487U.setTranslationY(this.f492Z * dimensionPixelSize);
                return;
            }
        }
        if (f7 >= this.f489W.mo684c() - 1) {
            if (this.f495c0 == 2) {
                this.f487U.setTranslationY(this.f492Z * dimensionPixelSize);
            } else {
                this.f487U.setTranslationY(-dimensionPixelSize);
            }
        }
    }

    /* JADX INFO: renamed from: U1 */
    private void m323U1() {
        C0151f c0151f = this.f489W;
        if (c0151f == null || this.f491Y + this.f492Z <= c0151f.mo684c() - 1) {
            m313K1(this.f493a0);
        } else {
            m313K1(false);
        }
    }

    /* JADX INFO: renamed from: V1 */
    private void m324V1() {
        float f7 = this.f491Y + this.f492Z;
        float dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC0030c.f162b);
        if (f7 < this.f489W.mo684c() - 1) {
            this.f484R.setTranslationY(0.0f);
        } else {
            this.f484R.setTranslationY(this.f492Z * dimensionPixelSize);
        }
    }

    /* JADX INFO: renamed from: W1 */
    private void m325W1() {
        if (this.f491Y == m356s1()) {
            return;
        }
        InterfaceC2657s interfaceC2657sMo641e = m357t1(this.f491Y).mo641e();
        InterfaceC2657s interfaceC2657sMo641e2 = this.f491Y < m356s1() + (-1) ? m357t1(this.f491Y + 1).mo641e() : null;
        if (interfaceC2657sMo641e instanceof InterfaceC0434b) {
            ((InterfaceC0434b) interfaceC2657sMo641e).mo1870e(this.f492Z);
        }
        if (interfaceC2657sMo641e2 instanceof InterfaceC0434b) {
            ((InterfaceC0434b) interfaceC2657sMo641e2).mo1870e(this.f492Z - 1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public void m326X1() {
        m316N1();
        m320R1();
        m319Q1();
        m322T1();
        m324V1();
        m325W1();
        m323U1();
        m317O1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public void m327Y1() {
        int color;
        String string = getTitle().toString();
        Drawable drawableLoadIcon = getApplicationInfo().loadIcon(getPackageManager());
        Bitmap bitmap = drawableLoadIcon instanceof BitmapDrawable ? ((BitmapDrawable) drawableLoadIcon).getBitmap() : null;
        if (this.f491Y < m356s1()) {
            try {
                color = AbstractC2436b.getColor(this, m355q1(this.f491Y));
            } catch (Resources.NotFoundException unused) {
                color = AbstractC2436b.getColor(this, m354p1(this.f491Y));
            }
        } else {
            TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(new TypedValue().data, new int[]{AbstractC5520a.f20985w});
            int color2 = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            color = color2;
        }
        setTaskDescription(new ActivityManager.TaskDescription(string, bitmap, AbstractC0246a.m1182k(color, 255)));
    }

    /* JADX INFO: renamed from: k1 */
    private long m337k1(int i7) {
        double d7 = i7;
        return Math.round((this.f507o0 * (d7 + Math.sqrt(d7))) / 2.0d);
    }

    /* JADX INFO: renamed from: l1 */
    private boolean m338l1(int i7, boolean z7) {
        if (i7 <= 0) {
            return false;
        }
        if (i7 >= m356s1()) {
            return true;
        }
        boolean zMo643g = m357t1(i7).mo643g();
        if (!zMo643g && z7) {
            Iterator it = this.f498f0.iterator();
            if (it.hasNext()) {
                AbstractC2263x.m9328a(it.next());
                throw null;
            }
        }
        return zMo643g;
    }

    /* JADX INFO: renamed from: m1 */
    private boolean m339m1(int i7, boolean z7) {
        if (i7 >= m356s1()) {
            return false;
        }
        if (i7 < 0) {
            return true;
        }
        if (this.f495c0 == 1 && i7 >= m356s1() - 1) {
            return false;
        }
        boolean zMo642f = m357t1(i7).mo642f();
        if (!zMo642f && z7) {
            Iterator it = this.f498f0.iterator();
            if (it.hasNext()) {
                AbstractC2263x.m9328a(it.next());
                throw null;
            }
        }
        return zMo642f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public boolean m340o1() {
        if (this.f492Z != 0.0f || this.f491Y != this.f489W.mo684c()) {
            return false;
        }
        Intent intentM345C1 = m345C1(-1);
        if (intentM345C1 != null) {
            setResult(-1, intentM345C1);
        } else {
            setResult(-1);
        }
        m344B1();
        finish();
        overridePendingTransition(0, 0);
        return true;
    }

    /* JADX INFO: renamed from: r1 */
    private C0906c m341r1(int i7) {
        if (i7 < m356s1() && (m357t1(i7) instanceof InterfaceC0146a)) {
            InterfaceC0146a interfaceC0146a = (InterfaceC0146a) m357t1(i7);
            if (interfaceC0146a.mo631b() != null && (interfaceC0146a.mo633i() != null || interfaceC0146a.mo632h() != 0)) {
                return interfaceC0146a.mo633i() != null ? C0906c.m4129a(interfaceC0146a.mo633i(), interfaceC0146a.mo631b()) : C0906c.m4129a(getString(interfaceC0146a.mo632h()), interfaceC0146a.mo631b());
            }
        }
        a aVar = null;
        if (!this.f494b0) {
            return null;
        }
        int i8 = this.f500h0;
        if (i8 != 0) {
            return C0906c.m4129a(getString(i8), new g(this, aVar));
        }
        return !TextUtils.isEmpty(this.f499g0) ? C0906c.m4129a(this.f499g0, new g(this, aVar)) : C0906c.m4129a(getString(AbstractC0035h.f184c), new g(this, aVar));
    }

    /* JADX INFO: renamed from: w1 */
    private void m342w1() {
        this.f482P = (ConstraintLayout) findViewById(AbstractC0032e.f172e);
        this.f483Q = (FadeableViewPager) findViewById(AbstractC0032e.f174g);
        this.f484R = (InkPageIndicator) findViewById(AbstractC0032e.f175h);
        this.f485S = (TextSwitcher) findViewById(AbstractC0032e.f169b);
        this.f486T = (ImageButton) findViewById(AbstractC0032e.f168a);
        this.f487U = (ImageButton) findViewById(AbstractC0032e.f170c);
        TextSwitcher textSwitcher = this.f485S;
        if (textSwitcher != null) {
            textSwitcher.setInAnimation(this, AbstractC0028a.f151a);
            this.f485S.setOutAnimation(this, AbstractC0028a.f152b);
        }
        C0151f c0151f = new C0151f(m12232H0());
        this.f489W = c0151f;
        this.f483Q.setAdapter(c0151f);
        this.f483Q.mo14364c(this.f490X);
        this.f483Q.m14358Q(this.f491Y, false);
        this.f484R.setViewPager(this.f483Q);
        m348G1();
        m347F1();
        AbstractC0219b.m1104b(this.f487U);
        AbstractC0219b.m1104b(this.f486T);
    }

    /* JADX INFO: renamed from: A1 */
    public void m343A1() {
        if (this.f481O) {
            int i7 = this.f491Y;
            this.f483Q.setAdapter(this.f489W);
            this.f483Q.setCurrentItem(i7);
            if (m340o1()) {
                return;
            }
            m327Y1();
            m318P1();
            m321S1();
            m326X1();
            m361y1();
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m344B1() {
    }

    /* JADX INFO: renamed from: C1 */
    public Intent m345C1(int i7) {
        return null;
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m346E1() {
        return m359v1(this.f483Q.getCurrentItem() - 1);
    }

    /* JADX INFO: renamed from: F1 */
    public void m347F1() {
        this.f486T.setOnClickListener(new d());
    }

    /* JADX INFO: renamed from: G1 */
    public void m348G1() {
        this.f487U.setOnClickListener(new c());
    }

    /* JADX INFO: renamed from: H1 */
    public void m349H1(int i7) {
        this.f496d0 = i7;
        if (i7 == 1) {
            AbstractC0219b.m1105c(this.f486T, AbstractC0035h.f182a);
        } else if (i7 == 2) {
            AbstractC0219b.m1105c(this.f486T, AbstractC0035h.f183b);
        }
        m318P1();
        m319Q1();
    }

    /* JADX INFO: renamed from: I1 */
    public void m350I1(boolean z7) {
        this.f486T.setVisibility(z7 ? 0 : 4);
    }

    /* JADX INFO: renamed from: J1 */
    public void m351J1(boolean z7) {
        this.f487U.setVisibility(z7 ? 0 : 4);
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m352j1(InterfaceC0150e interfaceC0150e) {
        boolean zM688t = this.f489W.m688t(interfaceC0150e);
        if (zM688t) {
            m343A1();
        }
        return zM688t;
    }

    /* JADX INFO: renamed from: n1 */
    public void m353n1() {
        this.f502j0.removeCallbacks(this.f503k0);
        this.f503k0 = null;
        this.f504l0 = 0;
        this.f505m0 = 0L;
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f506n0 = AnimationUtils.loadInterpolator(this, R.interpolator.accelerate_decelerate);
        this.f507o0 = getResources().getInteger(R.integer.config_shortAnimTime);
        if (bundle != null) {
            if (bundle.containsKey("com.heinrichreimersoftware.materialintro.app.IntroActivity.KEY_CURRENT_ITEM")) {
                this.f491Y = bundle.getInt("com.heinrichreimersoftware.materialintro.app.IntroActivity.KEY_CURRENT_ITEM", this.f491Y);
            }
            if (bundle.containsKey("com.heinrichreimersoftware.materialintro.app.IntroActivity.KEY_FULLSCREEN")) {
                this.f493a0 = bundle.getBoolean("com.heinrichreimersoftware.materialintro.app.IntroActivity.KEY_FULLSCREEN", this.f493a0);
            }
            if (bundle.containsKey("com.heinrichreimersoftware.materialintro.app.IntroActivity.KEY_BUTTON_CTA_VISIBLE")) {
                this.f494b0 = bundle.getBoolean("com.heinrichreimersoftware.materialintro.app.IntroActivity.KEY_BUTTON_CTA_VISIBLE", this.f494b0);
            }
        }
        if (this.f493a0) {
            m314L1(1280, true);
            m323U1();
        }
        getWindow().setSoftInputMode(16);
        setContentView(AbstractC0033f.f178a);
        m342w1();
        mo12238b().m23936o(this, new a(true));
    }

    @Override // androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onDestroy() {
        if (m360x1()) {
            m353n1();
        }
        this.f481O = false;
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AbstractActivityC2242c, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.f481O = true;
        m327Y1();
        m321S1();
        m318P1();
        m326X1();
        this.f482P.addOnLayoutChangeListener(new b());
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        m320R1();
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onResume() {
        super.onResume();
        m323U1();
    }

    @Override // p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("com.heinrichreimersoftware.materialintro.app.IntroActivity.KEY_CURRENT_ITEM", this.f483Q.getCurrentItem());
        bundle.putBoolean("com.heinrichreimersoftware.materialintro.app.IntroActivity.KEY_FULLSCREEN", this.f493a0);
        bundle.putBoolean("com.heinrichreimersoftware.materialintro.app.IntroActivity.KEY_BUTTON_CTA_VISIBLE", this.f494b0);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        if (m360x1()) {
            m353n1();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public int m354p1(int i7) {
        return this.f489W.m689u(i7);
    }

    /* JADX INFO: renamed from: q1 */
    public int m355q1(int i7) {
        return this.f489W.m690v(i7);
    }

    /* JADX INFO: renamed from: s1 */
    public int m356s1() {
        C0151f c0151f = this.f489W;
        if (c0151f == null) {
            return 0;
        }
        return c0151f.mo684c();
    }

    /* JADX INFO: renamed from: t1 */
    public InterfaceC0150e m357t1(int i7) {
        return this.f489W.m691w(i7);
    }

    /* JADX INFO: renamed from: u1 */
    public List m358u1() {
        return this.f489W.m692x();
    }

    /* JADX INFO: renamed from: v1 */
    public boolean m359v1(int i7) {
        int i8;
        int currentItem = this.f483Q.getCurrentItem();
        if (currentItem >= this.f489W.mo684c()) {
            m340o1();
        }
        boolean z7 = false;
        int iMax = Math.max(0, Math.min(i7, m356s1()));
        if (iMax > currentItem) {
            i8 = currentItem;
            while (i8 < iMax && m339m1(i8, true)) {
                i8++;
            }
        } else {
            if (iMax >= currentItem) {
                return true;
            }
            i8 = currentItem;
            while (i8 > iMax && m338l1(i8, true)) {
                i8--;
            }
        }
        if (i8 != iMax) {
            if (iMax > currentItem) {
                AbstractC0218a.m1101a(this, this.f487U);
            } else if (iMax < currentItem) {
                AbstractC0218a.m1101a(this, this.f486T);
            }
            z7 = true;
        }
        m315M1(i8);
        return !z7;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m360x1() {
        return this.f503k0 != null;
    }

    /* JADX INFO: renamed from: y1 */
    public void m361y1() {
        if (this.f491Y < m356s1()) {
            this.f483Q.setSwipeLeftEnabled(m339m1(this.f491Y, false));
            this.f483Q.setSwipeRightEnabled(m338l1(this.f491Y, false));
        }
    }

    /* JADX INFO: renamed from: z1 */
    public boolean m362z1() {
        return m359v1(this.f483Q.getCurrentItem() + 1);
    }
}
