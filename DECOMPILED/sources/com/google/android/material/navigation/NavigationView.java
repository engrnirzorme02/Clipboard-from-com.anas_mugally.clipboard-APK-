package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.C2271g;
import androidx.appcompat.view.menu.C2280e;
import androidx.appcompat.view.menu.C2282g;
import androidx.appcompat.widget.C2348d0;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.drawable.AbstractC4498d;
import com.google.android.material.internal.AbstractC4527c;
import com.google.android.material.internal.AbstractC4538n;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.AbstractC4548x;
import com.google.android.material.internal.C4534j;
import com.google.android.material.internal.C4535k;
import java.util.Objects;
import p029D3.C0191c;
import p029D3.C0195g;
import p029D3.InterfaceC0190b;
import p045F3.AbstractC0423c;
import p053G3.AbstractC0481a;
import p069I3.AbstractC0623j;
import p069I3.AbstractC0631r;
import p069I3.C0622i;
import p069I3.C0627n;
import p093L3.AbstractC0842a;
import p111O.C0982A0;
import p146T.AbstractC1446a;
import p223d.C5173c;
import p255h.AbstractC5520a;
import p263i.AbstractC5659a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p333q3.AbstractC6826a;
import p365u3.AbstractC7159a;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationView extends AbstractC4538n implements InterfaceC0190b {

    /* JADX INFO: renamed from: K */
    private static final int[] f17403K = {R.attr.state_checked};

    /* JADX INFO: renamed from: L */
    private static final int[] f17404L = {-16842910};

    /* JADX INFO: renamed from: M */
    private static final int f17405M = AbstractC6751l.f26545j;

    /* JADX INFO: renamed from: A */
    private boolean f17406A;

    /* JADX INFO: renamed from: B */
    private boolean f17407B;

    /* JADX INFO: renamed from: C */
    private boolean f17408C;

    /* JADX INFO: renamed from: D */
    private int f17409D;

    /* JADX INFO: renamed from: E */
    private final boolean f17410E;

    /* JADX INFO: renamed from: F */
    private final int f17411F;

    /* JADX INFO: renamed from: G */
    private final AbstractC0631r f17412G;

    /* JADX INFO: renamed from: H */
    private final C0195g f17413H;

    /* JADX INFO: renamed from: I */
    private final C0191c f17414I;

    /* JADX INFO: renamed from: J */
    private final DrawerLayout.InterfaceC2544e f17415J;

    /* JADX INFO: renamed from: s */
    private final C4534j f17416s;

    /* JADX INFO: renamed from: t */
    private final C4535k f17417t;

    /* JADX INFO: renamed from: u */
    InterfaceC4552d f17418u;

    /* JADX INFO: renamed from: v */
    private final int f17419v;

    /* JADX INFO: renamed from: w */
    private final int[] f17420w;

    /* JADX INFO: renamed from: x */
    private MenuInflater f17421x;

    /* JADX INFO: renamed from: y */
    private ViewTreeObserver.OnGlobalLayoutListener f17422y;

    /* JADX INFO: renamed from: z */
    private boolean f17423z;

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$a */
    class C4549a extends DrawerLayout.AbstractC2547h {
        C4549a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC2544e
        /* JADX INFO: renamed from: a */
        public void mo11710a(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                final C0191c c0191c = navigationView.f17414I;
                Objects.requireNonNull(c0191c);
                view.post(new Runnable() { // from class: com.google.android.material.navigation.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0191c.m952e();
                    }
                });
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC2544e
        /* JADX INFO: renamed from: b */
        public void mo11711b(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.f17414I.m953f();
                NavigationView.this.m20856v();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$b */
    class C4550b implements C2280e.a {
        C4550b() {
        }

        @Override // androidx.appcompat.view.menu.C2280e.a
        /* JADX INFO: renamed from: a */
        public boolean mo9231a(C2280e c2280e, MenuItem menuItem) {
            InterfaceC4552d interfaceC4552d = NavigationView.this.f17418u;
            return interfaceC4552d != null && interfaceC4552d.mo16497f(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C2280e.a
        /* JADX INFO: renamed from: b */
        public void mo9233b(C2280e c2280e) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$c */
    class ViewTreeObserverOnGlobalLayoutListenerC4551c implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC4551c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f17420w);
            boolean z7 = true;
            boolean z8 = NavigationView.this.f17420w[1] == 0;
            NavigationView.this.f17417t.m20720E(z8);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z8 && navigationView2.m20866u());
            boolean z9 = NavigationView.this.getLayoutDirection() == 1;
            boolean z10 = NavigationView.this.f17420w[0] == 0 || NavigationView.this.f17420w[0] + NavigationView.this.getWidth() == 0;
            NavigationView navigationView3 = NavigationView.this;
            navigationView3.setDrawLeftInsetForeground(z10 && (!z9 ? !navigationView3.m20865t() : !navigationView3.m20864s()));
            Activity activityM20693a = AbstractC4527c.m20693a(NavigationView.this.getContext());
            if (activityM20693a != null) {
                Rect rectM20840a = AbstractC4548x.m20840a(activityM20693a);
                boolean z11 = rectM20840a.height() - NavigationView.this.getHeight() == NavigationView.this.f17420w[1];
                boolean z12 = Color.alpha(activityM20693a.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView4 = NavigationView.this;
                navigationView4.setDrawBottomInsetForeground(z11 && z12 && navigationView4.m20863r());
                boolean z13 = rectM20840a.width() == NavigationView.this.f17420w[0] || rectM20840a.width() - NavigationView.this.getWidth() == NavigationView.this.f17420w[0];
                NavigationView navigationView5 = NavigationView.this;
                if (!z13 || (!z9 ? !navigationView5.m20864s() : !navigationView5.m20865t())) {
                    z7 = false;
                }
                navigationView5.setDrawRightInsetForeground(z7);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$d */
    public interface InterfaceC4552d {
        /* JADX INFO: renamed from: f */
        boolean mo16497f(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26238W);
    }

    private MenuInflater getMenuInflater() {
        if (this.f17421x == null) {
            this.f17421x = new C2271g(getContext());
        }
        return this.f17421x;
    }

    /* JADX INFO: renamed from: k */
    private ColorStateList m20852k(int i7) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i7, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM25174a = AbstractC5659a.m25174a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(AbstractC5520a.f20985w, typedValue, true)) {
            return null;
        }
        int i8 = typedValue.data;
        int defaultColor = colorStateListM25174a.getDefaultColor();
        int[] iArr = f17404L;
        return new ColorStateList(new int[][]{iArr, f17403K, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM25174a.getColorForState(iArr, defaultColor), i8, defaultColor});
    }

    /* JADX INFO: renamed from: l */
    private Drawable m20853l(C2348d0 c2348d0) {
        return m20854m(c2348d0, AbstractC0423c.m1826b(getContext(), c2348d0, AbstractC6752m.f26700M5));
    }

    /* JADX INFO: renamed from: m */
    private Drawable m20854m(C2348d0 c2348d0, ColorStateList colorStateList) {
        C0622i c0622i = new C0622i(C0627n.m2755b(getContext(), c2348d0.m10039n(AbstractC6752m.f26678K5, 0), c2348d0.m10039n(AbstractC6752m.f26689L5, 0)).m2802m());
        c0622i.m2718g0(colorStateList);
        return new InsetDrawable((Drawable) c0622i, c2348d0.m10031f(AbstractC6752m.f26733P5, 0), c2348d0.m10031f(AbstractC6752m.f26744Q5, 0), c2348d0.m10031f(AbstractC6752m.f26722O5, 0), c2348d0.m10031f(AbstractC6752m.f26711N5, 0));
    }

    /* JADX INFO: renamed from: o */
    private boolean m20855o(C2348d0 c2348d0) {
        return c2348d0.m10044s(AbstractC6752m.f26678K5) || c2348d0.m10044s(AbstractC6752m.f26689L5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m20856v() {
        if (!this.f17410E || this.f17409D == 0) {
            return;
        }
        this.f17409D = 0;
        m20857w(getWidth(), getHeight());
    }

    /* JADX INFO: renamed from: w */
    private void m20857w(int i7, int i8) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.C2545f)) {
            if ((this.f17409D > 0 || this.f17410E) && (getBackground() instanceof C0622i)) {
                boolean z7 = Gravity.getAbsoluteGravity(((DrawerLayout.C2545f) getLayoutParams()).f9792a, getLayoutDirection()) == 3;
                C0622i c0622i = (C0622i) getBackground();
                C0627n.b bVarM2803o = c0622i.m2703J().m2776w().m2803o(this.f17409D);
                if (z7) {
                    bVarM2803o.m2796D(0.0f);
                    bVarM2803o.m2810v(0.0f);
                } else {
                    bVarM2803o.m2800H(0.0f);
                    bVarM2803o.m2814z(0.0f);
                }
                C0627n c0627nM2802m = bVarM2803o.m2802m();
                c0622i.setShapeAppearanceModel(c0627nM2802m);
                this.f17412G.m2885f(this, c0627nM2802m);
                this.f17412G.m2884e(this, new RectF(0.0f, 0.0f, i7, i8));
                this.f17412G.m2887h(this, true);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    private Pair m20858x() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.C2545f)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.C2545f) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    /* JADX INFO: renamed from: y */
    private void m20859y() {
        this.f17422y = new ViewTreeObserverOnGlobalLayoutListenerC4551c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f17422y);
    }

    @Override // p029D3.InterfaceC0190b
    /* JADX INFO: renamed from: a */
    public void mo944a(C5173c c5173c) {
        this.f17413H.m972l(c5173c, ((DrawerLayout.C2545f) m20858x().second).f9792a);
        if (this.f17410E) {
            this.f17409D = AbstractC6826a.m29845c(0, this.f17411F, this.f17413H.m939a(c5173c.m23958a()));
            m20857w(getWidth(), getHeight());
        }
    }

    @Override // p029D3.InterfaceC0190b
    /* JADX INFO: renamed from: b */
    public void mo945b() {
        Pair pairM20858x = m20858x();
        DrawerLayout drawerLayout = (DrawerLayout) pairM20858x.first;
        C5173c c5173cM941c = this.f17413H.m941c();
        if (c5173cM941c == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.m11692d(this);
            return;
        }
        this.f17413H.m969h(c5173cM941c, ((DrawerLayout.C2545f) pairM20858x.second).f9792a, AbstractC4555b.m20871b(drawerLayout, this), AbstractC4555b.m20872c(drawerLayout));
    }

    @Override // p029D3.InterfaceC0190b
    /* JADX INFO: renamed from: c */
    public void mo946c(C5173c c5173c) {
        m20858x();
        this.f17413H.m970j(c5173c);
    }

    @Override // p029D3.InterfaceC0190b
    /* JADX INFO: renamed from: d */
    public void mo947d() {
        m20858x();
        this.f17413H.m968f();
        m20856v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.f17412G.m2883d(canvas, new AbstractC7159a.a() { // from class: com.google.android.material.navigation.c
            @Override // p365u3.AbstractC7159a.a
            /* JADX INFO: renamed from: a */
            public final void mo20873a(Canvas canvas2) {
                super/*android.view.View*/.dispatchDraw(canvas2);
            }
        });
    }

    @Override // com.google.android.material.internal.AbstractC4538n
    /* JADX INFO: renamed from: e */
    protected void mo20784e(C0982A0 c0982a0) {
        this.f17417t.m20743k(c0982a0);
    }

    C0195g getBackHelper() {
        return this.f17413H;
    }

    public MenuItem getCheckedItem() {
        return this.f17417t.m20744n();
    }

    public int getDividerInsetEnd() {
        return this.f17417t.m20745o();
    }

    public int getDividerInsetStart() {
        return this.f17417t.m20746p();
    }

    public int getHeaderCount() {
        return this.f17417t.m20747q();
    }

    public Drawable getItemBackground() {
        return this.f17417t.m20749s();
    }

    public int getItemHorizontalPadding() {
        return this.f17417t.m20750t();
    }

    public int getItemIconPadding() {
        return this.f17417t.m20751u();
    }

    public ColorStateList getItemIconTintList() {
        return this.f17417t.m20754x();
    }

    public int getItemMaxLines() {
        return this.f17417t.m20752v();
    }

    public ColorStateList getItemTextColor() {
        return this.f17417t.m20753w();
    }

    public int getItemVerticalPadding() {
        return this.f17417t.m20755y();
    }

    public Menu getMenu() {
        return this.f17416s;
    }

    public int getSubheaderInsetEnd() {
        return this.f17417t.m20717A();
    }

    public int getSubheaderInsetStart() {
        return this.f17417t.m20718B();
    }

    /* JADX INFO: renamed from: n */
    public View m20860n(int i7) {
        return this.f17417t.m20748r(i7);
    }

    @Override // com.google.android.material.internal.AbstractC4538n, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0623j.m2750e(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.f17414I.m950b()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.m11684I(this.f17415J);
            drawerLayout.m11689a(this.f17415J);
            if (drawerLayout.m11678A(this)) {
                this.f17414I.m952e();
            }
        }
    }

    @Override // com.google.android.material.internal.AbstractC4538n, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f17422y);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).m11684I(this.f17415J);
        }
        this.f17414I.m953f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), this.f17419v), 1073741824);
        } else if (mode == 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(this.f17419v, 1073741824);
        }
        super.onMeasure(i7, i8);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4553e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4553e c4553e = (C4553e) parcelable;
        super.onRestoreInstanceState(c4553e.m6085a());
        this.f17416s.m9508T(c4553e.f17427c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C4553e c4553e = new C4553e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c4553e.f17427c = bundle;
        this.f17416s.m9510V(bundle);
        return c4553e;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        m20857w(i7, i8);
    }

    /* JADX INFO: renamed from: p */
    public View m20861p(int i7) {
        return this.f17417t.m20719D(i7);
    }

    /* JADX INFO: renamed from: q */
    public void m20862q(int i7) {
        this.f17417t.m20741Z(true);
        getMenuInflater().inflate(i7, this.f17416s);
        this.f17417t.m20741Z(false);
        this.f17417t.mo9433d(false);
    }

    /* JADX INFO: renamed from: r */
    public boolean m20863r() {
        return this.f17406A;
    }

    /* JADX INFO: renamed from: s */
    public boolean m20864s() {
        return this.f17408C;
    }

    public void setBottomInsetScrimEnabled(boolean z7) {
        this.f17406A = z7;
    }

    public void setCheckedItem(int i7) {
        MenuItem menuItemFindItem = this.f17416s.findItem(i7);
        if (menuItemFindItem != null) {
            this.f17417t.m20721F((C2282g) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i7) {
        this.f17417t.m20722G(i7);
    }

    public void setDividerInsetStart(int i7) {
        this.f17417t.m20723H(i7);
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        AbstractC0623j.m2749d(this, f7);
    }

    public void setEndInsetScrimEnabled(boolean z7) {
        this.f17408C = z7;
    }

    public void setForceCompatClippingEnabled(boolean z7) {
        this.f17412G.m2886g(this, z7);
    }

    public void setItemBackground(Drawable drawable) {
        this.f17417t.m20725J(drawable);
    }

    public void setItemBackgroundResource(int i7) {
        setItemBackground(getContext().getDrawable(i7));
    }

    public void setItemHorizontalPadding(int i7) {
        this.f17417t.m20727L(i7);
    }

    public void setItemHorizontalPaddingResource(int i7) {
        this.f17417t.m20727L(getResources().getDimensionPixelSize(i7));
    }

    public void setItemIconPadding(int i7) {
        this.f17417t.m20728M(i7);
    }

    public void setItemIconPaddingResource(int i7) {
        this.f17417t.m20728M(getResources().getDimensionPixelSize(i7));
    }

    public void setItemIconSize(int i7) {
        this.f17417t.m20729N(i7);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f17417t.m20730O(colorStateList);
    }

    public void setItemMaxLines(int i7) {
        this.f17417t.m20731P(i7);
    }

    public void setItemTextAppearance(int i7) {
        this.f17417t.m20732Q(i7);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z7) {
        this.f17417t.m20733R(z7);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f17417t.m20734S(colorStateList);
    }

    public void setItemVerticalPadding(int i7) {
        this.f17417t.m20735T(i7);
    }

    public void setItemVerticalPaddingResource(int i7) {
        this.f17417t.m20735T(getResources().getDimensionPixelSize(i7));
    }

    public void setNavigationItemSelectedListener(InterfaceC4552d interfaceC4552d) {
        this.f17418u = interfaceC4552d;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i7) {
        super.setOverScrollMode(i7);
        C4535k c4535k = this.f17417t;
        if (c4535k != null) {
            c4535k.m20736U(i7);
        }
    }

    public void setStartInsetScrimEnabled(boolean z7) {
        this.f17407B = z7;
    }

    public void setSubheaderInsetEnd(int i7) {
        this.f17417t.m20738W(i7);
    }

    public void setSubheaderInsetStart(int i7) {
        this.f17417t.m20739X(i7);
    }

    public void setTopInsetScrimEnabled(boolean z7) {
        this.f17423z = z7;
    }

    /* JADX INFO: renamed from: t */
    public boolean m20865t() {
        return this.f17407B;
    }

    /* JADX INFO: renamed from: u */
    public boolean m20866u() {
        return this.f17423z;
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$e */
    public static class C4553e extends AbstractC1446a {
        public static final Parcelable.Creator<C4553e> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        public Bundle f17427c;

        /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$e$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C4553e createFromParcel(Parcel parcel) {
                return new C4553e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C4553e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4553e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C4553e[] newArray(int i7) {
                return new C4553e[i7];
            }
        }

        public C4553e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17427c = parcel.readBundle(classLoader);
        }

        @Override // p146T.AbstractC1446a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeBundle(this.f17427c);
        }

        public C4553e(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i7) {
        int i8;
        int i9 = f17405M;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i9), attributeSet, i7);
        C4535k c4535k = new C4535k();
        this.f17417t = c4535k;
        this.f17420w = new int[2];
        this.f17423z = true;
        this.f17406A = true;
        this.f17407B = true;
        this.f17408C = true;
        this.f17409D = 0;
        this.f17412G = AbstractC0631r.m2879a(this);
        this.f17413H = new C0195g(this);
        this.f17414I = new C0191c(this);
        this.f17415J = new C4549a();
        Context context2 = getContext();
        C4534j c4534j = new C4534j(context2);
        this.f17416s = c4534j;
        C2348d0 c2348d0M20819j = AbstractC4543s.m20819j(context2, attributeSet, AbstractC6752m.f27048s5, i7, i9, new int[0]);
        int i10 = AbstractC6752m.f27059t5;
        if (c2348d0M20819j.m10044s(i10)) {
            setBackground(c2348d0M20819j.m10032g(i10));
        }
        int iM10031f = c2348d0M20819j.m10031f(AbstractC6752m.f27125z5, 0);
        this.f17409D = iM10031f;
        this.f17410E = iM10031f == 0;
        this.f17411F = getResources().getDimensionPixelSize(AbstractC6744e.f26382z);
        Drawable background = getBackground();
        ColorStateList colorStateListM20435g = AbstractC4498d.m20435g(background);
        if (background == null || colorStateListM20435g != null) {
            C0622i c0622i = new C0622i(C0627n.m2758e(context2, attributeSet, i7, i9).m2802m());
            if (colorStateListM20435g != null) {
                c0622i.m2718g0(colorStateListM20435g);
            }
            c0622i.m2710U(context2);
            setBackground(c0622i);
        }
        int i11 = AbstractC6752m.f26568A5;
        if (c2348d0M20819j.m10044s(i11)) {
            setElevation(c2348d0M20819j.m10031f(i11, 0));
        }
        setFitsSystemWindows(c2348d0M20819j.m10026a(AbstractC6752m.f27070u5, false));
        this.f17419v = c2348d0M20819j.m10031f(AbstractC6752m.f27081v5, 0);
        int i12 = AbstractC6752m.f26820X5;
        ColorStateList colorStateListM10028c = c2348d0M20819j.m10044s(i12) ? c2348d0M20819j.m10028c(i12) : null;
        int i13 = AbstractC6752m.f26851a6;
        int iM10039n = c2348d0M20819j.m10044s(i13) ? c2348d0M20819j.m10039n(i13, 0) : 0;
        if (iM10039n == 0 && colorStateListM10028c == null) {
            colorStateListM10028c = m20852k(R.attr.textColorSecondary);
        }
        int i14 = AbstractC6752m.f26645H5;
        ColorStateList colorStateListM10028c2 = c2348d0M20819j.m10044s(i14) ? c2348d0M20819j.m10028c(i14) : m20852k(R.attr.textColorSecondary);
        int i15 = AbstractC6752m.f26755R5;
        int iM10039n2 = c2348d0M20819j.m10044s(i15) ? c2348d0M20819j.m10039n(i15, 0) : 0;
        boolean zM10026a = c2348d0M20819j.m10026a(AbstractC6752m.f26766S5, true);
        int i16 = AbstractC6752m.f26634G5;
        if (c2348d0M20819j.m10044s(i16)) {
            setItemIconSize(c2348d0M20819j.m10031f(i16, 0));
        }
        int i17 = AbstractC6752m.f26777T5;
        ColorStateList colorStateListM10028c3 = c2348d0M20819j.m10044s(i17) ? c2348d0M20819j.m10028c(i17) : null;
        if (iM10039n2 == 0 && colorStateListM10028c3 == null) {
            colorStateListM10028c3 = m20852k(R.attr.textColorPrimary);
        }
        Drawable drawableM10032g = c2348d0M20819j.m10032g(AbstractC6752m.f26601D5);
        if (drawableM10032g == null && m20855o(c2348d0M20819j)) {
            drawableM10032g = m20853l(c2348d0M20819j);
            ColorStateList colorStateListM1826b = AbstractC0423c.m1826b(context2, c2348d0M20819j, AbstractC6752m.f26667J5);
            if (colorStateListM1826b != null) {
                c4535k.m20726K(new RippleDrawable(AbstractC0481a.m2065d(colorStateListM1826b), null, m20854m(c2348d0M20819j, null)));
            }
        }
        int i18 = AbstractC6752m.f26612E5;
        if (c2348d0M20819j.m10044s(i18)) {
            i8 = 0;
            setItemHorizontalPadding(c2348d0M20819j.m10031f(i18, 0));
        } else {
            i8 = 0;
        }
        int i19 = AbstractC6752m.f26788U5;
        if (c2348d0M20819j.m10044s(i19)) {
            setItemVerticalPadding(c2348d0M20819j.m10031f(i19, i8));
        }
        setDividerInsetStart(c2348d0M20819j.m10031f(AbstractC6752m.f27114y5, i8));
        setDividerInsetEnd(c2348d0M20819j.m10031f(AbstractC6752m.f27103x5, i8));
        setSubheaderInsetStart(c2348d0M20819j.m10031f(AbstractC6752m.f26840Z5, i8));
        setSubheaderInsetEnd(c2348d0M20819j.m10031f(AbstractC6752m.f26830Y5, i8));
        setTopInsetScrimEnabled(c2348d0M20819j.m10026a(AbstractC6752m.f26862b6, this.f17423z));
        setBottomInsetScrimEnabled(c2348d0M20819j.m10026a(AbstractC6752m.f27092w5, this.f17406A));
        setStartInsetScrimEnabled(c2348d0M20819j.m10026a(AbstractC6752m.f26810W5, this.f17407B));
        setEndInsetScrimEnabled(c2348d0M20819j.m10026a(AbstractC6752m.f26579B5, this.f17408C));
        int iM10031f2 = c2348d0M20819j.m10031f(AbstractC6752m.f26623F5, 0);
        setItemMaxLines(c2348d0M20819j.m10036k(AbstractC6752m.f26656I5, 1));
        c4534j.mo9511W(new C4550b());
        c4535k.m20724I(1);
        c4535k.mo9437i(context2, c4534j);
        if (iM10039n != 0) {
            c4535k.m20740Y(iM10039n);
        }
        c4535k.m20737V(colorStateListM10028c);
        c4535k.m20730O(colorStateListM10028c2);
        c4535k.m20736U(getOverScrollMode());
        if (iM10039n2 != 0) {
            c4535k.m20732Q(iM10039n2);
        }
        c4535k.m20733R(zM10026a);
        c4535k.m20734S(colorStateListM10028c3);
        c4535k.m20725J(drawableM10032g);
        c4535k.m20728M(iM10031f2);
        c4534j.m9517b(c4535k);
        addView((View) c4535k.m20756z(this));
        int i20 = AbstractC6752m.f26799V5;
        if (c2348d0M20819j.m10044s(i20)) {
            m20862q(c2348d0M20819j.m10039n(i20, 0));
        }
        int i21 = AbstractC6752m.f26590C5;
        if (c2348d0M20819j.m10044s(i21)) {
            m20861p(c2348d0M20819j.m10039n(i21, 0));
        }
        c2348d0M20819j.m10046x();
        m20859y();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f17416s.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f17417t.m20721F((C2282g) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
