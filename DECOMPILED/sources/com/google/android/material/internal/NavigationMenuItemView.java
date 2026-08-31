package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C2282g;
import androidx.appcompat.view.menu.InterfaceC2286k;
import androidx.appcompat.widget.AbstractC2319Q;
import androidx.appcompat.widget.AbstractC2358i0;
import androidx.core.widget.AbstractC2458i;
import p025D.AbstractC0165h;
import p041F.AbstractC0400a;
import p111O.AbstractC1030Z;
import p111O.C1032a;
import p118P.C1170s;
import p255h.AbstractC5520a;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6745f;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6748i;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationMenuItemView extends AbstractC4531g implements InterfaceC2286k.a {

    /* JADX INFO: renamed from: R */
    private static final int[] f17194R = {R.attr.state_checked};

    /* JADX INFO: renamed from: G */
    private int f17195G;

    /* JADX INFO: renamed from: H */
    private boolean f17196H;

    /* JADX INFO: renamed from: I */
    boolean f17197I;

    /* JADX INFO: renamed from: J */
    boolean f17198J;

    /* JADX INFO: renamed from: K */
    private final CheckedTextView f17199K;

    /* JADX INFO: renamed from: L */
    private FrameLayout f17200L;

    /* JADX INFO: renamed from: M */
    private C2282g f17201M;

    /* JADX INFO: renamed from: N */
    private ColorStateList f17202N;

    /* JADX INFO: renamed from: O */
    private boolean f17203O;

    /* JADX INFO: renamed from: P */
    private Drawable f17204P;

    /* JADX INFO: renamed from: Q */
    private final C1032a f17205Q;

    /* JADX INFO: renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C4524a extends C1032a {
        C4524a() {
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            c1170s.m5065k0(NavigationMenuItemView.this.f17197I);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: B */
    private void m20597B() {
        if (m20599F()) {
            this.f17199K.setVisibility(8);
            FrameLayout frameLayout = this.f17200L;
            if (frameLayout != null) {
                AbstractC2319Q.a aVar = (AbstractC2319Q.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f17200L.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f17199K.setVisibility(0);
        FrameLayout frameLayout2 = this.f17200L;
        if (frameLayout2 != null) {
            AbstractC2319Q.a aVar2 = (AbstractC2319Q.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f17200L.setLayoutParams(aVar2);
        }
    }

    /* JADX INFO: renamed from: C */
    private StateListDrawable m20598C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC5520a.f20982t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f17194R, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* JADX INFO: renamed from: F */
    private boolean m20599F() {
        return this.f17201M.getTitle() == null && this.f17201M.getIcon() == null && this.f17201M.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f17200L == null) {
                this.f17200L = (FrameLayout) ((ViewStub) findViewById(AbstractC6746g.f26424g)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f17200L.removeAllViews();
            this.f17200L.addView(view);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m20600D(C2282g c2282g, boolean z7) {
        this.f17198J = z7;
        mo9417e(c2282g, 0);
    }

    /* JADX INFO: renamed from: E */
    public void m20601E() {
        FrameLayout frameLayout = this.f17200L;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f17199K.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2286k.a
    /* JADX INFO: renamed from: d */
    public boolean mo9416d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2286k.a
    /* JADX INFO: renamed from: e */
    public void mo9417e(C2282g c2282g, int i7) {
        this.f17201M = c2282g;
        if (c2282g.getItemId() > 0) {
            setId(c2282g.getItemId());
        }
        setVisibility(c2282g.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            setBackground(m20598C());
        }
        setCheckable(c2282g.isCheckable());
        setChecked(c2282g.isChecked());
        setEnabled(c2282g.isEnabled());
        setTitle(c2282g.getTitle());
        setIcon(c2282g.getIcon());
        setActionView(c2282g.getActionView());
        setContentDescription(c2282g.getContentDescription());
        AbstractC2358i0.m10085a(this, c2282g.getTooltipText());
        m20597B();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2286k.a
    public C2282g getItemData() {
        return this.f17201M;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        C2282g c2282g = this.f17201M;
        if (c2282g != null && c2282g.isCheckable() && this.f17201M.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17194R);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z7) {
        refreshDrawableState();
        if (this.f17197I != z7) {
            this.f17197I = z7;
            this.f17205Q.mo4589l(this.f17199K, 2048);
        }
    }

    public void setChecked(boolean z7) {
        refreshDrawableState();
        this.f17199K.setChecked(z7);
        CheckedTextView checkedTextView = this.f17199K;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z7 && this.f17198J) ? 1 : 0);
    }

    public void setHorizontalPadding(int i7) {
        setPadding(i7, getPaddingTop(), i7, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f17203O) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AbstractC0400a.m1712r(drawable).mutate();
                drawable.setTintList(this.f17202N);
            }
            int i7 = this.f17195G;
            drawable.setBounds(0, 0, i7, i7);
        } else if (this.f17196H) {
            if (this.f17204P == null) {
                Drawable drawableM813e = AbstractC0165h.m813e(getResources(), AbstractC6745f.f26392i, getContext().getTheme());
                this.f17204P = drawableM813e;
                if (drawableM813e != null) {
                    int i8 = this.f17195G;
                    drawableM813e.setBounds(0, 0, i8, i8);
                }
            }
            drawable = this.f17204P;
        }
        this.f17199K.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i7) {
        this.f17199K.setCompoundDrawablePadding(i7);
    }

    public void setIconSize(int i7) {
        this.f17195G = i7;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f17202N = colorStateList;
        this.f17203O = colorStateList != null;
        C2282g c2282g = this.f17201M;
        if (c2282g != null) {
            setIcon(c2282g.getIcon());
        }
    }

    public void setMaxLines(int i7) {
        this.f17199K.setMaxLines(i7);
    }

    public void setNeedsEmptyIcon(boolean z7) {
        this.f17196H = z7;
    }

    public void setTextAppearance(int i7) {
        AbstractC2458i.m10762m(this.f17199K, i7);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f17199K.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f17199K.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17198J = true;
        C4524a c4524a = new C4524a();
        this.f17205Q = c4524a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(AbstractC6748i.f26462k, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(AbstractC6744e.f26340e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(AbstractC6746g.f26425h);
        this.f17199K = checkedTextView;
        AbstractC1030Z.m4474j0(checkedTextView, c4524a);
    }
}
