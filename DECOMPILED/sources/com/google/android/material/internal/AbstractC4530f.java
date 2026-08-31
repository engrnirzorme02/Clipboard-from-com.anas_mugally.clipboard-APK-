package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.C3553a;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: com.google.android.material.internal.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4530f extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private int f17292a;

    /* JADX INFO: renamed from: b */
    private int f17293b;

    /* JADX INFO: renamed from: c */
    private boolean f17294c;

    /* JADX INFO: renamed from: d */
    private int f17295d;

    public AbstractC4530f(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17294c = false;
        m20704d(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private static int m20703a(int i7, int i8, int i9) {
        if (i8 != Integer.MIN_VALUE) {
            return i8 != 1073741824 ? i9 : i7;
        }
        return Math.min(i9, i7);
    }

    /* JADX INFO: renamed from: d */
    private void m20704d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC6752m.f27089w2, 0, 0);
        this.f17292a = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6752m.f27111y2, 0);
        this.f17293b = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6752m.f27100x2, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public int m20705b(View view) {
        Object tag = view.getTag(AbstractC6746g.f26404L);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo20062c() {
        return this.f17294c;
    }

    protected int getItemSpacing() {
        return this.f17293b;
    }

    protected int getLineSpacing() {
        return this.f17292a;
    }

    protected int getRowCount() {
        return this.f17295d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.f17295d = 0;
            return;
        }
        boolean z8 = true;
        this.f17295d = 1;
        boolean z9 = getLayoutDirection() == 1;
        int paddingRight = z9 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z9 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i11 = 0;
        int measuredWidth = paddingRight;
        int i12 = paddingTop;
        while (i11 < getChildCount()) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(AbstractC6746g.f26404L, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = measuredWidth + marginStart + childAt.getMeasuredWidth();
                int i13 = i9 - i7;
                int i14 = i13 - paddingLeft;
                if (!this.f17294c && measuredWidth2 > i14) {
                    measuredWidth2 = paddingRight + marginStart + childAt.getMeasuredWidth();
                    i12 = paddingTop + this.f17292a;
                    this.f17295d++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(AbstractC6746g.f26404L, Integer.valueOf(this.f17295d - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                if (z9) {
                    childAt.layout(i13 - measuredWidth2, i12, (i13 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i12, measuredWidth2, measuredHeight);
                }
                measuredWidth += marginStart + marginEnd + childAt.getMeasuredWidth() + this.f17293b;
                paddingTop = measuredHeight;
            }
            i11++;
            z8 = z8;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        int i11 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : C3553a.e.API_PRIORITY_OTHER;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i11 - getPaddingRight();
        int i12 = paddingTop;
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i7, i8);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i9 = marginLayoutParams.leftMargin;
                    i10 = marginLayoutParams.rightMargin;
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                int i15 = paddingLeft2;
                if (paddingLeft2 + i9 + childAt.getMeasuredWidth() <= paddingRight || mo20062c()) {
                    paddingLeft = i15;
                } else {
                    paddingLeft = getPaddingLeft();
                    i12 = this.f17292a + paddingTop;
                }
                int measuredWidth = paddingLeft + i9 + childAt.getMeasuredWidth();
                int measuredHeight = i12 + childAt.getMeasuredHeight();
                if (measuredWidth > i13) {
                    i13 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i9 + i10 + childAt.getMeasuredWidth() + this.f17293b;
                if (i14 == getChildCount() - 1) {
                    i13 += i10;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m20703a(size, mode, i13 + getPaddingRight()), m20703a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i7) {
        this.f17293b = i7;
    }

    protected void setLineSpacing(int i7) {
        this.f17292a = i7;
    }

    public void setSingleLine(boolean z7) {
        this.f17294c = z7;
    }
}
