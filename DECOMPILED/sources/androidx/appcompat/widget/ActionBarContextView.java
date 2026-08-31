package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.AbstractC2266b;
import androidx.appcompat.view.menu.C2280e;
import p111O.AbstractC1030Z;
import p111O.C1053i0;
import p255h.AbstractC5520a;
import p255h.AbstractC5525f;
import p255h.AbstractC5526g;
import p255h.AbstractC5529j;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC2341a {

    /* JADX INFO: renamed from: A */
    private TextView f7804A;

    /* JADX INFO: renamed from: B */
    private int f7805B;

    /* JADX INFO: renamed from: C */
    private int f7806C;

    /* JADX INFO: renamed from: D */
    private boolean f7807D;

    /* JADX INFO: renamed from: E */
    private int f7808E;

    /* JADX INFO: renamed from: t */
    private CharSequence f7809t;

    /* JADX INFO: renamed from: u */
    private CharSequence f7810u;

    /* JADX INFO: renamed from: v */
    private View f7811v;

    /* JADX INFO: renamed from: w */
    private View f7812w;

    /* JADX INFO: renamed from: x */
    private View f7813x;

    /* JADX INFO: renamed from: y */
    private LinearLayout f7814y;

    /* JADX INFO: renamed from: z */
    private TextView f7815z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class ViewOnClickListenerC2291a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC2266b f7816a;

        ViewOnClickListenerC2291a(AbstractC2266b abstractC2266b) {
            this.f7816a = abstractC2266b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f7816a.mo9352c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i */
    private void m9630i() {
        if (this.f7814y == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC5526g.f21079a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f7814y = linearLayout;
            this.f7815z = (TextView) linearLayout.findViewById(AbstractC5525f.f21057e);
            this.f7804A = (TextView) this.f7814y.findViewById(AbstractC5525f.f21056d);
            if (this.f7805B != 0) {
                this.f7815z.setTextAppearance(getContext(), this.f7805B);
            }
            if (this.f7806C != 0) {
                this.f7804A.setTextAppearance(getContext(), this.f7806C);
            }
        }
        this.f7815z.setText(this.f7809t);
        this.f7804A.setText(this.f7810u);
        boolean zIsEmpty = TextUtils.isEmpty(this.f7809t);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f7810u);
        this.f7804A.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f7814y.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f7814y.getParent() == null) {
            addView(this.f7814y);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC2341a
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ C1053i0 mo9631f(int i7, long j7) {
        return super.mo9631f(i7, j7);
    }

    /* JADX INFO: renamed from: g */
    public void m9632g() {
        if (this.f7811v == null) {
            m9635k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC2341a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC2341a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f7810u;
    }

    public CharSequence getTitle() {
        return this.f7809t;
    }

    /* JADX INFO: renamed from: h */
    public void m9633h(AbstractC2266b abstractC2266b) {
        View view = this.f7811v;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f7808E, (ViewGroup) this, false);
            this.f7811v = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f7811v);
        }
        View viewFindViewById = this.f7811v.findViewById(AbstractC5525f.f21061i);
        this.f7812w = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC2291a(abstractC2266b));
        C2280e c2280e = (C2280e) abstractC2266b.mo9354e();
        C2345c c2345c = this.f8166d;
        if (c2345c != null) {
            c2345c.m10008A();
        }
        C2345c c2345c2 = new C2345c(getContext());
        this.f8166d = c2345c2;
        c2345c2.m10018L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2280e.m9518c(this.f8166d, this.f8164b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f8166d.mo9443q(this);
        this.f8165c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f8165c, layoutParams);
    }

    /* JADX INFO: renamed from: j */
    public boolean m9634j() {
        return this.f7807D;
    }

    /* JADX INFO: renamed from: k */
    public void m9635k() {
        removeAllViews();
        this.f7813x = null;
        this.f8165c = null;
        this.f8166d = null;
        View view = this.f7812w;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m9636l() {
        C2345c c2345c = this.f8166d;
        if (c2345c != null) {
            return c2345c.m10019M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2345c c2345c = this.f8166d;
        if (c2345c != null) {
            c2345c.m10010D();
            this.f8166d.m10011E();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC2341a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        boolean zM10112b = AbstractC2362k0.m10112b(this);
        int paddingRight = zM10112b ? (i9 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        View view = this.f7811v;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7811v.getLayoutParams();
            int i11 = zM10112b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i12 = zM10112b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iM9992d = AbstractC2341a.m9992d(paddingRight, i11, zM10112b);
            paddingRight = AbstractC2341a.m9992d(iM9992d + m9994e(this.f7811v, iM9992d, paddingTop, paddingTop2, zM10112b), i12, zM10112b);
        }
        int iM9994e = paddingRight;
        LinearLayout linearLayout = this.f7814y;
        if (linearLayout != null && this.f7813x == null && linearLayout.getVisibility() != 8) {
            iM9994e += m9994e(this.f7814y, iM9994e, paddingTop, paddingTop2, zM10112b);
        }
        View view2 = this.f7813x;
        if (view2 != null) {
            m9994e(view2, iM9994e, paddingTop, paddingTop2, zM10112b);
        }
        int paddingLeft = zM10112b ? getPaddingLeft() : (i9 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f8165c;
        if (actionMenuView != null) {
            m9994e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM10112b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i8) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i7);
        int size2 = this.f8167e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i8);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f7811v;
        if (view != null) {
            int iM9993c = m9993c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7811v.getLayoutParams();
            paddingLeft = iM9993c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f8165c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m9993c(this.f8165c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f7814y;
        if (linearLayout != null && this.f7813x == null) {
            if (this.f7807D) {
                this.f7814y.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f7814y.getMeasuredWidth();
                boolean z7 = measuredWidth <= paddingLeft;
                if (z7) {
                    paddingLeft -= measuredWidth;
                }
                this.f7814y.setVisibility(z7 ? 0 : 8);
            } else {
                paddingLeft = m9993c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f7813x;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i9 = layoutParams.width;
            int i10 = i9 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i9 >= 0) {
                paddingLeft = Math.min(i9, paddingLeft);
            }
            int i11 = layoutParams.height;
            int i12 = i11 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i11 >= 0) {
                iMin = Math.min(i11, iMin);
            }
            this.f7813x.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i10), View.MeasureSpec.makeMeasureSpec(iMin, i12));
        }
        if (this.f8167e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i13) {
                i13 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i13);
    }

    @Override // androidx.appcompat.widget.AbstractC2341a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC2341a
    public void setContentHeight(int i7) {
        this.f8167e = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f7813x;
        if (view2 != null) {
            removeView(view2);
        }
        this.f7813x = view;
        if (view != null && (linearLayout = this.f7814y) != null) {
            removeView(linearLayout);
            this.f7814y = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f7810u = charSequence;
        m9630i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f7809t = charSequence;
        m9630i();
        AbstractC1030Z.m4478l0(this, charSequence);
    }

    public void setTitleOptional(boolean z7) {
        if (z7 != this.f7807D) {
            requestLayout();
        }
        this.f7807D = z7;
    }

    @Override // androidx.appcompat.widget.AbstractC2341a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i7) {
        super.setVisibility(i7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20969g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        C2348d0 c2348d0M10025v = C2348d0.m10025v(context, attributeSet, AbstractC5529j.f21345y, i7, 0);
        setBackground(c2348d0M10025v.m10032g(AbstractC5529j.f21350z));
        this.f7805B = c2348d0M10025v.m10039n(AbstractC5529j.f21129D, 0);
        this.f7806C = c2348d0M10025v.m10039n(AbstractC5529j.f21124C, 0);
        this.f8167e = c2348d0M10025v.m10038m(AbstractC5529j.f21119B, 0);
        this.f7808E = c2348d0M10025v.m10039n(AbstractC5529j.f21114A, AbstractC5526g.f21082d);
        c2348d0M10025v.m10046x();
    }
}
