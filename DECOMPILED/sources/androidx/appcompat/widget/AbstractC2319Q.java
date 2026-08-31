package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p111O.AbstractC1030Z;
import p111O.AbstractC1074t;
import p255h.AbstractC5529j;

/* JADX INFO: renamed from: androidx.appcompat.widget.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2319Q extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private boolean f7961a;

    /* JADX INFO: renamed from: b */
    private int f7962b;

    /* JADX INFO: renamed from: c */
    private int f7963c;

    /* JADX INFO: renamed from: d */
    private int f7964d;

    /* JADX INFO: renamed from: e */
    private int f7965e;

    /* JADX INFO: renamed from: f */
    private int f7966f;

    /* JADX INFO: renamed from: r */
    private float f7967r;

    /* JADX INFO: renamed from: s */
    private boolean f7968s;

    /* JADX INFO: renamed from: t */
    private int[] f7969t;

    /* JADX INFO: renamed from: u */
    private int[] f7970u;

    /* JADX INFO: renamed from: v */
    private Drawable f7971v;

    /* JADX INFO: renamed from: w */
    private int f7972w;

    /* JADX INFO: renamed from: x */
    private int f7973x;

    /* JADX INFO: renamed from: y */
    private int f7974y;

    /* JADX INFO: renamed from: z */
    private int f7975z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Q$a */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i7, int i8) {
            super(i7, i8);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public AbstractC2319Q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: A */
    private void m9807A(View view, int i7, int i8, int i9, int i10) {
        view.layout(i7, i8, i9 + i7, i10 + i8);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    /* JADX INFO: renamed from: k */
    private void m9808k(int i7, int i8) {
        int i9;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i10 = 0;
        while (i10 < i7) {
            View viewM9817s = m9817s(i10);
            if (viewM9817s.getVisibility() != 8) {
                a aVar = (a) viewM9817s.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i11 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewM9817s.getMeasuredWidth();
                    i9 = i8;
                    measureChildWithMargins(viewM9817s, i9, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i11;
                } else {
                    i9 = i8;
                }
            } else {
                i9 = i8;
            }
            i10++;
            i8 = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    /* JADX INFO: renamed from: l */
    private void m9809l(int i7, int i8) {
        int i9;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i10 = 0;
        while (i10 < i7) {
            View viewM9817s = m9817s(i10);
            if (viewM9817s.getVisibility() != 8) {
                a aVar = (a) viewM9817s.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i11 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewM9817s.getMeasuredHeight();
                    i9 = i8;
                    measureChildWithMargins(viewM9817s, iMakeMeasureSpec, 0, i9, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i11;
                } else {
                    i9 = i8;
                }
            } else {
                i9 = i8;
            }
            i10++;
            i8 = i9;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* JADX INFO: renamed from: g */
    void m9810g(Canvas canvas) {
        int right;
        int left;
        int i7;
        int virtualChildCount = getVirtualChildCount();
        boolean zM10112b = AbstractC2362k0.m10112b(this);
        for (int i8 = 0; i8 < virtualChildCount; i8++) {
            View viewM9817s = m9817s(i8);
            if (viewM9817s != null && viewM9817s.getVisibility() != 8 && m9818t(i8)) {
                a aVar = (a) viewM9817s.getLayoutParams();
                m9813j(canvas, zM10112b ? viewM9817s.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewM9817s.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f7972w);
            }
        }
        if (m9818t(virtualChildCount)) {
            View viewM9817s2 = m9817s(virtualChildCount - 1);
            if (viewM9817s2 != null) {
                a aVar2 = (a) viewM9817s2.getLayoutParams();
                if (zM10112b) {
                    left = viewM9817s2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i7 = this.f7972w;
                    right = left - i7;
                } else {
                    right = viewM9817s2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zM10112b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i7 = this.f7972w;
                right = left - i7;
            }
            m9813j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f7962b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f7962b;
        if (childCount <= i8) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i8);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f7962b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f7963c;
        if (this.f7964d == 1 && (i7 = this.f7965e & 112) != 48) {
            if (i7 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f7966f) / 2;
            } else if (i7 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f7966f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f7962b;
    }

    public Drawable getDividerDrawable() {
        return this.f7971v;
    }

    public int getDividerPadding() {
        return this.f7975z;
    }

    public int getDividerWidth() {
        return this.f7972w;
    }

    public int getGravity() {
        return this.f7965e;
    }

    public int getOrientation() {
        return this.f7964d;
    }

    public int getShowDividers() {
        return this.f7974y;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f7967r;
    }

    /* JADX INFO: renamed from: h */
    void m9811h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i7 = 0; i7 < virtualChildCount; i7++) {
            View viewM9817s = m9817s(i7);
            if (viewM9817s != null && viewM9817s.getVisibility() != 8 && m9818t(i7)) {
                m9812i(canvas, (viewM9817s.getTop() - ((LinearLayout.LayoutParams) ((a) viewM9817s.getLayoutParams())).topMargin) - this.f7973x);
            }
        }
        if (m9818t(virtualChildCount)) {
            View viewM9817s2 = m9817s(virtualChildCount - 1);
            m9812i(canvas, viewM9817s2 == null ? (getHeight() - getPaddingBottom()) - this.f7973x : viewM9817s2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewM9817s2.getLayoutParams())).bottomMargin);
        }
    }

    /* JADX INFO: renamed from: i */
    void m9812i(Canvas canvas, int i7) {
        this.f7971v.setBounds(getPaddingLeft() + this.f7975z, i7, (getWidth() - getPaddingRight()) - this.f7975z, this.f7973x + i7);
        this.f7971v.draw(canvas);
    }

    /* JADX INFO: renamed from: j */
    void m9813j(Canvas canvas, int i7) {
        this.f7971v.setBounds(i7, getPaddingTop() + this.f7975z, this.f7972w + i7, (getHeight() - getPaddingBottom()) - this.f7975z);
        this.f7971v.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i7 = this.f7964d;
        if (i7 == 0) {
            return new a(-2, -2);
        }
        if (i7 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f7971v == null) {
            return;
        }
        if (this.f7964d == 1) {
            m9811h(canvas);
        } else {
            m9810g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        if (this.f7964d == 1) {
            m9820v(i7, i8, i9, i10);
        } else {
            m9819u(i7, i8, i9, i10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        if (this.f7964d == 1) {
            m9824z(i7, i8);
        } else {
            m9822x(i7, i8);
        }
    }

    /* JADX INFO: renamed from: p */
    int m9814p(View view, int i7) {
        return 0;
    }

    /* JADX INFO: renamed from: q */
    int m9815q(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: r */
    int m9816r(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: s */
    View m9817s(int i7) {
        return getChildAt(i7);
    }

    public void setBaselineAligned(boolean z7) {
        this.f7961a = z7;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f7962b = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f7971v) {
            return;
        }
        this.f7971v = drawable;
        if (drawable != null) {
            this.f7972w = drawable.getIntrinsicWidth();
            this.f7973x = drawable.getIntrinsicHeight();
        } else {
            this.f7972w = 0;
            this.f7973x = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.f7975z = i7;
    }

    public void setGravity(int i7) {
        if (this.f7965e != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f7965e = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i8 = i7 & 8388615;
        int i9 = this.f7965e;
        if ((8388615 & i9) != i8) {
            this.f7965e = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z7) {
        this.f7968s = z7;
    }

    public void setOrientation(int i7) {
        if (this.f7964d != i7) {
            this.f7964d = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.f7974y) {
            requestLayout();
        }
        this.f7974y = i7;
    }

    public void setVerticalGravity(int i7) {
        int i8 = i7 & 112;
        int i9 = this.f7965e;
        if ((i9 & 112) != i8) {
            this.f7965e = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f7) {
        this.f7967r = Math.max(0.0f, f7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    protected boolean m9818t(int i7) {
        if (i7 == 0) {
            return (this.f7974y & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.f7974y & 4) != 0;
        }
        if ((this.f7974y & 2) != 0) {
            for (int i8 = i7 - 1; i8 >= 0; i8--) {
                if (getChildAt(i8).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0103  */
    /* JADX INFO: renamed from: u */
    void m9819u(int i7, int i8, int i9, int i10) {
        int paddingLeft;
        int i11;
        int i12;
        char c7;
        char c8;
        int i13;
        int iM9814p;
        int i14;
        int baseline;
        int i15;
        int i16;
        int i17;
        int measuredHeight;
        int i18;
        boolean zM10112b = AbstractC2362k0.m10112b(this);
        int paddingTop = getPaddingTop();
        int i19 = i10 - i8;
        int paddingBottom = i19 - getPaddingBottom();
        int paddingBottom2 = (i19 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i20 = this.f7965e;
        int i21 = i20 & 112;
        boolean z7 = this.f7961a;
        int[] iArr = this.f7969t;
        int[] iArr2 = this.f7970u;
        int iM4771b = AbstractC1074t.m4771b(8388615 & i20, getLayoutDirection());
        char c9 = 2;
        char c10 = 1;
        if (iM4771b != 1) {
            paddingLeft = iM4771b != 5 ? getPaddingLeft() : ((getPaddingLeft() + i9) - i7) - this.f7966f;
        } else {
            paddingLeft = getPaddingLeft() + (((i9 - i7) - this.f7966f) / 2);
        }
        if (zM10112b) {
            i11 = virtualChildCount - 1;
            i12 = -1;
        } else {
            i11 = 0;
            i12 = 1;
        }
        int i22 = 0;
        while (i22 < virtualChildCount) {
            int i23 = i11 + (i12 * i22);
            int i24 = i22;
            View viewM9817s = m9817s(i23);
            if (viewM9817s == null) {
                paddingLeft += m9823y(i23);
                iM9814p = i24;
                i13 = paddingTop;
                c7 = c9;
                c8 = c10;
            } else {
                c7 = c9;
                c8 = c10;
                if (viewM9817s.getVisibility() != 8) {
                    int measuredWidth = viewM9817s.getMeasuredWidth();
                    int measuredHeight2 = viewM9817s.getMeasuredHeight();
                    a aVar = (a) viewM9817s.getLayoutParams();
                    int i25 = paddingLeft;
                    if (z7) {
                        i14 = measuredHeight2;
                        baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? viewM9817s.getBaseline() : -1;
                        i15 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i15 < 0) {
                            i15 = i21;
                        }
                        i16 = i15 & 112;
                        i13 = paddingTop;
                        if (i16 != 16) {
                            if (i16 != 48) {
                                i17 = i13 + ((LinearLayout.LayoutParams) aVar).topMargin;
                                if (baseline != -1) {
                                    i17 += iArr[c8] - baseline;
                                }
                            } else if (i16 != 80) {
                                i17 = i13;
                            } else {
                                i17 = (paddingBottom - i14) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c7] - (viewM9817s.getMeasuredHeight() - baseline);
                                }
                            }
                            if (m9818t(i23)) {
                                i18 = i25 + this.f7972w;
                            } else {
                                i18 = i25;
                            }
                            int i26 = ((LinearLayout.LayoutParams) aVar).leftMargin + i18;
                            m9807A(viewM9817s, m9815q(viewM9817s) + i26, i17, measuredWidth, i14);
                            int iM9816r = i26 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + m9816r(viewM9817s);
                            iM9814p = m9814p(viewM9817s, i23) + i24;
                            paddingLeft = iM9816r;
                        } else {
                            i17 = i13 + ((paddingBottom2 - i14) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        }
                        i17 -= measuredHeight;
                        if (m9818t(i23)) {
                            i18 = i25 + this.f7972w;
                        } else {
                            i18 = i25;
                        }
                        int i27 = ((LinearLayout.LayoutParams) aVar).leftMargin + i18;
                        m9807A(viewM9817s, m9815q(viewM9817s) + i27, i17, measuredWidth, i14);
                        int iM9816r2 = i27 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + m9816r(viewM9817s);
                        iM9814p = m9814p(viewM9817s, i23) + i24;
                        paddingLeft = iM9816r2;
                    } else {
                        i14 = measuredHeight2;
                    }
                    i15 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i15 < 0) {
                        i15 = i21;
                    }
                    i16 = i15 & 112;
                    i13 = paddingTop;
                    if (i16 != 16) {
                        if (i16 != 48) {
                            i17 = i13 + ((LinearLayout.LayoutParams) aVar).topMargin;
                            if (baseline != -1) {
                                i17 += iArr[c8] - baseline;
                            }
                        } else if (i16 != 80) {
                            i17 = i13;
                        } else {
                            i17 = (paddingBottom - i14) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[c7] - (viewM9817s.getMeasuredHeight() - baseline);
                            }
                        }
                        if (m9818t(i23)) {
                            i18 = i25 + this.f7972w;
                        } else {
                            i18 = i25;
                        }
                        int i28 = ((LinearLayout.LayoutParams) aVar).leftMargin + i18;
                        m9807A(viewM9817s, m9815q(viewM9817s) + i28, i17, measuredWidth, i14);
                        int iM9816r3 = i28 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + m9816r(viewM9817s);
                        iM9814p = m9814p(viewM9817s, i23) + i24;
                        paddingLeft = iM9816r3;
                    } else {
                        i17 = i13 + ((paddingBottom2 - i14) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    }
                    i17 -= measuredHeight;
                    if (m9818t(i23)) {
                        i18 = i25 + this.f7972w;
                    } else {
                        i18 = i25;
                    }
                    int i29 = ((LinearLayout.LayoutParams) aVar).leftMargin + i18;
                    m9807A(viewM9817s, m9815q(viewM9817s) + i29, i17, measuredWidth, i14);
                    int iM9816r4 = i29 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + m9816r(viewM9817s);
                    iM9814p = m9814p(viewM9817s, i23) + i24;
                    paddingLeft = iM9816r4;
                } else {
                    i13 = paddingTop;
                    iM9814p = i24;
                }
            }
            i22 = iM9814p + 1;
            c9 = c7;
            c10 = c8;
            paddingTop = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX INFO: renamed from: v */
    void m9820v(int i7, int i8, int i9, int i10) {
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int paddingLeft = getPaddingLeft();
        int i14 = i9 - i7;
        int paddingRight = i14 - getPaddingRight();
        int paddingRight2 = (i14 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i15 = this.f7965e;
        int i16 = i15 & 112;
        int i17 = i15 & 8388615;
        if (i16 != 16) {
            paddingTop = i16 != 80 ? getPaddingTop() : ((getPaddingTop() + i10) - i8) - this.f7966f;
        } else {
            paddingTop = getPaddingTop() + (((i10 - i8) - this.f7966f) / 2);
        }
        int iM9814p = 0;
        while (iM9814p < virtualChildCount) {
            View viewM9817s = m9817s(iM9814p);
            if (viewM9817s == null) {
                paddingTop += m9823y(iM9814p);
            } else {
                if (viewM9817s.getVisibility() != 8) {
                    int measuredWidth = viewM9817s.getMeasuredWidth();
                    int measuredHeight = viewM9817s.getMeasuredHeight();
                    a aVar = (a) viewM9817s.getLayoutParams();
                    int i18 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i18 < 0) {
                        i18 = i17;
                    }
                    int iM4771b = AbstractC1074t.m4771b(i18, getLayoutDirection()) & 7;
                    if (iM4771b != 1) {
                        if (iM4771b != 5) {
                            i13 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            i11 = paddingRight - measuredWidth;
                            i12 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                        }
                        int i19 = i13;
                        if (m9818t(iM9814p)) {
                            paddingTop += this.f7973x;
                        }
                        int i20 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        m9807A(viewM9817s, i19, i20 + m9815q(viewM9817s), measuredWidth, measuredHeight);
                        paddingTop = i20 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + m9816r(viewM9817s);
                        iM9814p += m9814p(viewM9817s, iM9814p);
                    } else {
                        i11 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i12 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i13 = i11 - i12;
                    int i110 = i13;
                    if (m9818t(iM9814p)) {
                        paddingTop += this.f7973x;
                    }
                    int i21 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    m9807A(viewM9817s, i110, i21 + m9815q(viewM9817s), measuredWidth, measuredHeight);
                    paddingTop = i21 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + m9816r(viewM9817s);
                    iM9814p += m9814p(viewM9817s, iM9814p);
                }
                iM9814p++;
            }
            iM9814p++;
        }
    }

    /* JADX INFO: renamed from: w */
    void m9821w(View view, int i7, int i8, int i9, int i10, int i11) {
        measureChildWithMargins(view, i8, i9, i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:200:0x045e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0182  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01df  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e8  */
    /* JADX INFO: renamed from: x */
    void m9822x(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax;
        int i14;
        int iMax2;
        int i15;
        int baseline;
        int i16;
        int i17;
        byte b7;
        int i18;
        int i19;
        int[] iArr;
        int i20;
        boolean z7;
        int[] iArr2;
        View view;
        int i21;
        boolean z8;
        int i22;
        int measuredHeight;
        int baseline2;
        this.f7966f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        if (this.f7969t == null || this.f7970u == null) {
            this.f7969t = new int[4];
            this.f7970u = new int[4];
        }
        int[] iArr3 = this.f7969t;
        int[] iArr4 = this.f7970u;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z9 = this.f7961a;
        boolean z10 = this.f7968s;
        int i23 = 1073741824;
        boolean z11 = mode == 1073741824;
        boolean z12 = z10;
        int iM9814p = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        boolean z13 = false;
        int iCombineMeasuredStates = 0;
        boolean z14 = false;
        boolean z15 = true;
        float f7 = 0.0f;
        int iMax5 = 0;
        int iMax6 = 0;
        while (true) {
            i9 = iMax3;
            if (iM9814p >= virtualChildCount) {
                break;
            }
            boolean z16 = z9;
            View viewM9817s = m9817s(iM9814p);
            if (viewM9817s == null) {
                this.f7966f += m9823y(iM9814p);
            } else {
                if (viewM9817s.getVisibility() == 8) {
                    iM9814p += m9814p(viewM9817s, iM9814p);
                } else {
                    if (m9818t(iM9814p)) {
                        this.f7966f += this.f7972w;
                    }
                    a aVar = (a) viewM9817s.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) aVar).weight;
                    float f9 = f7 + f8;
                    if (mode == i23 && ((LinearLayout.LayoutParams) aVar).width == 0 && f8 > 0.0f) {
                        if (z11) {
                            this.f7966f += ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                        } else {
                            int i24 = this.f7966f;
                            this.f7966f = Math.max(i24, ((LinearLayout.LayoutParams) aVar).leftMargin + i24 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z16) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewM9817s.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i19 = mode;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            i20 = i9;
                            z7 = z12;
                            view = viewM9817s;
                        } else {
                            i19 = mode;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            z13 = true;
                            i20 = i9;
                            i21 = 1073741824;
                            z7 = z12;
                            view = viewM9817s;
                        }
                        if (mode2 == i21 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                            z8 = true;
                            z14 = true;
                        } else {
                            z8 = false;
                        }
                        i22 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i22;
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        if (!z16 && (baseline2 = view.getBaseline()) != -1) {
                            int i25 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i25 < 0) {
                                i25 = this.f7965e;
                            }
                            int i26 = (((i25 & 112) >> 4) & (-2)) >> 1;
                            iArr[i26] = Math.max(iArr[i26], baseline2);
                            iArr2[i26] = Math.max(iArr2[i26], measuredHeight - baseline2);
                        }
                        iMax3 = Math.max(i20, measuredHeight);
                        if (z15 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                            if (z8) {
                                measuredHeight = i22;
                            }
                            iMax6 = Math.max(iMax6, measuredHeight);
                        } else {
                            if (z8 != 0) {
                                measuredHeight = i22;
                            }
                            iMax5 = Math.max(iMax5, measuredHeight);
                        }
                        iM9814p += m9814p(view, iM9814p);
                        f7 = f9;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar).width != 0 || f8 <= 0.0f) {
                            b7 = -2;
                            i18 = Integer.MIN_VALUE;
                        } else {
                            b7 = -2;
                            ((LinearLayout.LayoutParams) aVar).width = -2;
                            i18 = 0;
                        }
                        i19 = mode;
                        iArr = iArr3;
                        i20 = i9;
                        int i27 = i18;
                        z7 = z12;
                        iArr2 = iArr4;
                        m9821w(viewM9817s, iM9814p, i7, f9 == 0.0f ? this.f7966f : 0, i8, 0);
                        view = viewM9817s;
                        if (i27 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i27;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        if (z11) {
                            this.f7966f += ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + m9816r(view);
                        } else {
                            int i28 = this.f7966f;
                            this.f7966f = Math.max(i28, i28 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + m9816r(view));
                        }
                        if (z7) {
                            iMax4 = Math.max(measuredWidth, iMax4);
                        }
                    }
                    i21 = 1073741824;
                    if (mode2 == i21) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    i22 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i22;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (!z16) {
                    }
                    iMax3 = Math.max(i20, measuredHeight);
                    if (z15) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                        if (z8) {
                            measuredHeight = i22;
                        }
                        iMax6 = Math.max(iMax6, measuredHeight);
                    } else {
                        if (z8 != 0) {
                            measuredHeight = i22;
                        }
                        iMax5 = Math.max(iMax5, measuredHeight);
                    }
                    iM9814p += m9814p(view, iM9814p);
                    f7 = f9;
                }
                iM9814p++;
                z12 = z7;
                iArr4 = iArr2;
                z9 = z16;
                iArr3 = iArr;
                mode = i19;
                i23 = 1073741824;
            }
            i19 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            iMax3 = i9;
            z7 = z12;
            iM9814p++;
            z12 = z7;
            iArr4 = iArr2;
            z9 = z16;
            iArr3 = iArr;
            mode = i19;
            i23 = 1073741824;
        }
        boolean z17 = z9;
        int i29 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i30 = iCombineMeasuredStates;
        boolean z18 = z12;
        if (this.f7966f > 0 && m9818t(virtualChildCount)) {
            this.f7966f += this.f7972w;
        }
        int i31 = iArr5[1];
        int iMax7 = (i31 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i9 : Math.max(i9, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i31, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
        if (z18) {
            i11 = i29;
            if (i11 == Integer.MIN_VALUE || i11 == 0) {
                this.f7966f = 0;
                int iM9814p2 = 0;
                while (iM9814p2 < virtualChildCount) {
                    View viewM9817s2 = m9817s(iM9814p2);
                    if (viewM9817s2 == null) {
                        this.f7966f += m9823y(iM9814p2);
                    } else {
                        if (viewM9817s2.getVisibility() == 8) {
                            iM9814p2 += m9814p(viewM9817s2, iM9814p2);
                        } else {
                            a aVar2 = (a) viewM9817s2.getLayoutParams();
                            if (z11) {
                                this.f7966f += ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax4 + ((LinearLayout.LayoutParams) aVar2).rightMargin + m9816r(viewM9817s2);
                            } else {
                                iMax7 = iMax7;
                                int i32 = this.f7966f;
                                this.f7966f = Math.max(i32, i32 + iMax4 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + m9816r(viewM9817s2));
                            }
                        }
                        iM9814p2++;
                        iMax7 = iMax7;
                        f7 = f7;
                    }
                    iM9814p2++;
                    iMax7 = iMax7;
                    f7 = f7;
                }
            }
            i10 = iMax7;
        } else {
            i10 = iMax7;
            i11 = i29;
        }
        float f10 = f7;
        int paddingLeft = this.f7966f + getPaddingLeft() + getPaddingRight();
        this.f7966f = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i7, 0);
        int i33 = (16777215 & iResolveSizeAndState) - this.f7966f;
        if (z13 || (i33 != 0 && f10 > 0.0f)) {
            float f11 = this.f7967r;
            if (f11 > 0.0f) {
                f10 = f11;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            this.f7966f = 0;
            int iCombineMeasuredStates2 = i30;
            int iMax8 = -1;
            int i34 = 0;
            while (i34 < virtualChildCount) {
                View viewM9817s3 = m9817s(i34);
                if (viewM9817s3 == null || viewM9817s3.getVisibility() == 8) {
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    a aVar3 = (a) viewM9817s3.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f12 > 0.0f) {
                        int i35 = (int) ((i33 * f12) / f10);
                        f10 -= f12;
                        i33 -= i35;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i17 = 1073741824;
                            if (i11 == 1073741824) {
                                if (i35 <= 0) {
                                    i35 = 0;
                                }
                                viewM9817s3.measure(View.MeasureSpec.makeMeasureSpec(i35, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewM9817s3.getMeasuredState() & (-16777216));
                        } else {
                            i17 = 1073741824;
                        }
                        int measuredWidth2 = viewM9817s3.getMeasuredWidth() + i35;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewM9817s3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i17), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewM9817s3.getMeasuredState() & (-16777216));
                    }
                    if (z11) {
                        this.f7966f += viewM9817s3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + m9816r(viewM9817s3);
                    } else {
                        int i36 = this.f7966f;
                        this.f7966f = Math.max(i36, viewM9817s3.getMeasuredWidth() + i36 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + m9816r(viewM9817s3));
                    }
                    boolean z19 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i37 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewM9817s3.getMeasuredHeight() + i37;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z19) {
                        i37 = measuredHeight2;
                    }
                    int iMax9 = Math.max(iMax5, i37);
                    if (z15) {
                        i15 = -1;
                        boolean z20 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z17 && (baseline = viewM9817s3.getBaseline()) != i15) {
                            i16 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i16 < 0) {
                                i16 = this.f7965e;
                            }
                            int i38 = (((i16 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i38] = Math.max(iArr5[i38], baseline);
                            iArr6[i38] = Math.max(iArr6[i38], measuredHeight2 - baseline);
                        }
                        iMax5 = iMax9;
                        z15 = z20;
                    } else {
                        i15 = -1;
                    }
                    if (z17) {
                        i16 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i16 < 0) {
                            i16 = this.f7965e;
                        }
                        int i39 = (((i16 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i39] = Math.max(iArr5[i39], baseline);
                        iArr6[i39] = Math.max(iArr6[i39], measuredHeight2 - baseline);
                    }
                    iMax5 = iMax9;
                    z15 = z20;
                }
                i34++;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i12 = iResolveSizeAndState;
            i13 = -16777216;
            this.f7966f += getPaddingLeft() + getPaddingRight();
            int i40 = iArr5[1];
            iMax = (i40 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i40, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
            i14 = iCombineMeasuredStates2;
            iMax2 = iMax5;
        } else {
            iMax2 = Math.max(iMax5, iMax6);
            if (z18 && i11 != 1073741824) {
                for (int i41 = 0; i41 < virtualChildCount; i41++) {
                    View viewM9817s4 = m9817s(i41);
                    if (viewM9817s4 != null && viewM9817s4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewM9817s4.getLayoutParams())).weight > 0.0f) {
                        viewM9817s4.measure(View.MeasureSpec.makeMeasureSpec(iMax4, 1073741824), View.MeasureSpec.makeMeasureSpec(viewM9817s4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i12 = iResolveSizeAndState;
            i14 = i30;
            iMax = i10;
            i13 = -16777216;
        }
        if (!z15 && mode2 != 1073741824) {
            iMax = iMax2;
        }
        setMeasuredDimension(i12 | (i14 & i13), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, i14 << 16));
        if (z14) {
            m9808k(virtualChildCount, i7);
        }
    }

    /* JADX INFO: renamed from: y */
    int m9823y(int i7) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x015b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0165  */
    /* JADX INFO: renamed from: z */
    void m9824z(int i7, int i8) {
        int i9;
        int iMax;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z7;
        int iMax2;
        View view;
        int iMax3;
        boolean z8;
        int iMax4;
        int i19;
        this.f7966f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int i20 = this.f7962b;
        boolean z9 = this.f7968s;
        int iM9814p = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int iMax5 = 0;
        boolean z10 = false;
        boolean z11 = false;
        float f7 = 0.0f;
        boolean z12 = true;
        while (true) {
            int i25 = 8;
            if (iM9814p >= virtualChildCount) {
                float f8 = f7;
                int i26 = i21;
                int i27 = virtualChildCount;
                int i28 = mode2;
                boolean z13 = z9;
                int i29 = i22;
                int iMax6 = i23;
                int iCombineMeasuredStates = i24;
                if (this.f7966f > 0) {
                    i9 = i27;
                    if (m9818t(i9)) {
                        this.f7966f += this.f7973x;
                    }
                } else {
                    i9 = i27;
                }
                int i30 = i28;
                if (z13 && (i30 == Integer.MIN_VALUE || i30 == 0)) {
                    this.f7966f = 0;
                    int iM9814p2 = 0;
                    while (iM9814p2 < i9) {
                        View viewM9817s = m9817s(iM9814p2);
                        if (viewM9817s == null) {
                            this.f7966f += m9823y(iM9814p2);
                        } else if (viewM9817s.getVisibility() == i25) {
                            iM9814p2 += m9814p(viewM9817s, iM9814p2);
                        } else {
                            a aVar = (a) viewM9817s.getLayoutParams();
                            int i31 = this.f7966f;
                            this.f7966f = Math.max(i31, i31 + i29 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + m9816r(viewM9817s));
                        }
                        iM9814p2++;
                        i25 = 8;
                    }
                }
                int paddingTop = this.f7966f + getPaddingTop() + getPaddingBottom();
                this.f7966f = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i8, 0);
                int i32 = (16777215 & iResolveSizeAndState) - this.f7966f;
                if (z10 || (i32 != 0 && f8 > 0.0f)) {
                    float f9 = this.f7967r;
                    if (f9 <= 0.0f) {
                        f9 = f8;
                    }
                    this.f7966f = 0;
                    float f10 = f9;
                    int i33 = i32;
                    int i34 = 0;
                    while (i34 < i9) {
                        View viewM9817s2 = m9817s(i34);
                        if (viewM9817s2.getVisibility() == 8) {
                            i30 = i30;
                            i34 = i34;
                        } else {
                            a aVar2 = (a) viewM9817s2.getLayoutParams();
                            float f11 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f11 > 0.0f) {
                                int i35 = (int) ((i33 * f11) / f10);
                                f10 -= f11;
                                i33 -= i35;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i11 = 1073741824;
                                    if (i30 == 1073741824) {
                                        viewM9817s2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i35 > 0 ? i35 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewM9817s2.getMeasuredState() & (-256));
                                } else {
                                    i11 = 1073741824;
                                }
                                int measuredHeight = viewM9817s2.getMeasuredHeight() + i35;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewM9817s2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i11));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewM9817s2.getMeasuredState() & (-256));
                            } else {
                                i30 = i30;
                            }
                            int i36 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewM9817s2.getMeasuredWidth() + i36;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i10 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width == -1) {
                                    measuredWidth = i36;
                                }
                            } else {
                                i10 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z14 = z12 && ((LinearLayout.LayoutParams) aVar2).width == i10;
                            int i37 = this.f7966f;
                            this.f7966f = Math.max(i37, i37 + viewM9817s2.getMeasuredHeight() + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + m9816r(viewM9817s2));
                            iMax5 = iMax7;
                            z12 = z14;
                        }
                        i34++;
                        i30 = i30;
                    }
                    this.f7966f += getPaddingTop() + getPaddingBottom();
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i26);
                    if (z13 && i30 != 1073741824) {
                        for (int i38 = 0; i38 < i9; i38++) {
                            View viewM9817s3 = m9817s(i38);
                            if (viewM9817s3 != null && viewM9817s3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewM9817s3.getLayoutParams())).weight > 0.0f) {
                                viewM9817s3.measure(View.MeasureSpec.makeMeasureSpec(viewM9817s3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i29, 1073741824));
                            }
                        }
                    }
                }
                if (!z12 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, iCombineMeasuredStates), iResolveSizeAndState);
                if (z11) {
                    m9809l(i9, i8);
                    return;
                }
                return;
            }
            float f12 = f7;
            View viewM9817s4 = m9817s(iM9814p);
            if (viewM9817s4 == null) {
                this.f7966f += m9823y(iM9814p);
            } else {
                if (viewM9817s4.getVisibility() == 8) {
                    iM9814p += m9814p(viewM9817s4, iM9814p);
                } else {
                    if (m9818t(iM9814p)) {
                        this.f7966f += this.f7973x;
                    }
                    a aVar3 = (a) viewM9817s4.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f14 = f12 + f13;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f13 > 0.0f) {
                        int i39 = this.f7966f;
                        this.f7966f = Math.max(i39, ((LinearLayout.LayoutParams) aVar3).topMargin + i39 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax2 = i21;
                        iMax3 = i22;
                        i15 = virtualChildCount;
                        i16 = mode2;
                        z10 = true;
                        view = viewM9817s4;
                        i18 = i23;
                        i17 = i24;
                        z7 = z9;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f13 <= 0.0f) {
                            i12 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i12 = 0;
                        }
                        if (f14 == 0.0f) {
                            int i40 = i24;
                            i14 = this.f7966f;
                            i13 = i40;
                        } else {
                            i13 = i24;
                            i14 = 0;
                        }
                        int i41 = i22;
                        i15 = virtualChildCount;
                        i16 = mode2;
                        i17 = i13;
                        i18 = i23;
                        z7 = z9;
                        iMax2 = i21;
                        m9821w(viewM9817s4, iM9814p, i7, 0, i8, i14);
                        view = viewM9817s4;
                        if (i12 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i12;
                        }
                        int measuredHeight2 = view.getMeasuredHeight();
                        int i42 = this.f7966f;
                        this.f7966f = Math.max(i42, i42 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + m9816r(view));
                        iMax3 = z7 ? Math.max(measuredHeight2, i41) : i41;
                    }
                    if (i20 >= 0 && i20 == iM9814p + 1) {
                        this.f7963c = this.f7966f;
                    }
                    if (iM9814p < i20 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z8 = false;
                    } else {
                        z8 = true;
                        z11 = true;
                    }
                    int i43 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i43;
                    iMax4 = Math.max(i18, measuredWidth2);
                    int i44 = iMax3;
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i17, view.getMeasuredState());
                    if (z12) {
                        i19 = iCombineMeasuredStates2;
                        z12 = ((LinearLayout.LayoutParams) aVar3).width == -1;
                        if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                            if (!z8) {
                                i43 = measuredWidth2;
                            }
                            iMax2 = Math.max(iMax2, i43);
                        } else {
                            if (!z8) {
                                i43 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i43);
                        }
                        iM9814p += m9814p(view, iM9814p);
                        f7 = f14;
                        i22 = i44;
                        i24 = i19;
                    } else {
                        i19 = iCombineMeasuredStates2;
                    }
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (!z8) {
                            i43 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i43);
                    } else {
                        if (!z8) {
                            i43 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i43);
                    }
                    iM9814p += m9814p(view, iM9814p);
                    f7 = f14;
                    i22 = i44;
                    i24 = i19;
                }
                iM9814p++;
                i23 = iMax4;
                i21 = iMax2;
                z9 = z7;
                mode2 = i16;
                virtualChildCount = i15;
            }
            iMax2 = i21;
            i15 = virtualChildCount;
            i16 = mode2;
            z7 = z9;
            f7 = f12;
            iMax4 = i23;
            iM9814p++;
            i23 = iMax4;
            i21 = iMax2;
            z9 = z7;
            mode2 = i16;
            virtualChildCount = i15;
        }
    }

    public AbstractC2319Q(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f7961a = true;
        this.f7962b = -1;
        this.f7963c = 0;
        this.f7965e = 8388659;
        int[] iArr = AbstractC5529j.f21227a1;
        C2348d0 c2348d0M10025v = C2348d0.m10025v(context, attributeSet, iArr, i7, 0);
        AbstractC1030Z.m4470h0(this, context, iArr, attributeSet, c2348d0M10025v.m10043r(), i7, 0);
        int iM10036k = c2348d0M10025v.m10036k(AbstractC5529j.f21237c1, -1);
        if (iM10036k >= 0) {
            setOrientation(iM10036k);
        }
        int iM10036k2 = c2348d0M10025v.m10036k(AbstractC5529j.f21232b1, -1);
        if (iM10036k2 >= 0) {
            setGravity(iM10036k2);
        }
        boolean zM10026a = c2348d0M10025v.m10026a(AbstractC5529j.f21242d1, true);
        if (!zM10026a) {
            setBaselineAligned(zM10026a);
        }
        this.f7967r = c2348d0M10025v.m10034i(AbstractC5529j.f21252f1, -1.0f);
        this.f7962b = c2348d0M10025v.m10036k(AbstractC5529j.f21247e1, -1);
        this.f7968s = c2348d0M10025v.m10026a(AbstractC5529j.f21267i1, false);
        setDividerDrawable(c2348d0M10025v.m10032g(AbstractC5529j.f21257g1));
        this.f7974y = c2348d0M10025v.m10036k(AbstractC5529j.f21272j1, 0);
        this.f7975z = c2348d0M10025v.m10031f(AbstractC5529j.f21262h1, 0);
        c2348d0M10025v.m10046x();
    }
}
