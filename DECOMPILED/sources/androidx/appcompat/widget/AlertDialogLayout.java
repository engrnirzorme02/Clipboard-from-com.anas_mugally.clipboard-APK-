package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p111O.AbstractC1030Z;
import p111O.AbstractC1074t;
import p255h.AbstractC5525f;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC2319Q {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: A */
    private void m9678A(View view, int i7, int i8, int i9, int i10) {
        view.layout(i7, i8, i9 + i7, i10 + i8);
    }

    /* JADX INFO: renamed from: B */
    private static int m9679B(View view) {
        int iM4425A = AbstractC1030Z.m4425A(view);
        if (iM4425A > 0) {
            return iM4425A;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m9679B(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: C */
    private boolean m9680C(int i7, int i8) {
        int iCombineMeasuredStates;
        int iM9679B;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == AbstractC5525f.f21052E) {
                    view = childAt;
                } else if (id == AbstractC5525f.f21063k) {
                    view2 = childAt;
                } else {
                    if ((id != AbstractC5525f.f21065m && id != AbstractC5525f.f21067o) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i7);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i7, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i7, 0);
            iM9679B = m9679B(view2);
            measuredHeight = view2.getMeasuredHeight() - iM9679B;
            paddingTop += iM9679B;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM9679B = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i7, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i10 = size - paddingTop;
        if (view2 != null) {
            int i11 = paddingTop - iM9679B;
            int iMin = Math.min(i10, measuredHeight);
            if (iMin > 0) {
                i10 -= iMin;
                iM9679B += iMin;
            }
            view2.measure(i7, View.MeasureSpec.makeMeasureSpec(iM9679B, 1073741824));
            paddingTop = i11 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i10 > 0) {
            view3.measure(i7, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i10, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i7, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i8, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        m9681l(childCount, i8);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    /* JADX INFO: renamed from: l */
    private void m9681l(int i7, int i8) {
        int i9;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i10 = 0;
        while (i10 < i7) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                AbstractC2319Q.a aVar = (AbstractC2319Q.a) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i11 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = childAt.getMeasuredHeight();
                    i9 = i8;
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i9, 0);
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

    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    @Override // androidx.appcompat.widget.AbstractC2319Q, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int paddingLeft = getPaddingLeft();
        int i14 = i9 - i7;
        int paddingRight = i14 - getPaddingRight();
        int paddingRight2 = (i14 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i15 = gravity & 112;
        int i16 = gravity & 8388615;
        int paddingTop = i15 != 16 ? i15 != 80 ? getPaddingTop() : ((getPaddingTop() + i10) - i8) - measuredHeight : getPaddingTop() + (((i10 - i8) - measuredHeight) / 2);
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                AbstractC2319Q.a aVar = (AbstractC2319Q.a) childAt.getLayoutParams();
                int i18 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i18 < 0) {
                    i18 = i16;
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
                    if (m9818t(i17)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i20 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    m9678A(childAt, i19, i20, measuredWidth, measuredHeight2);
                    paddingTop = i20 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                } else {
                    i11 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i12 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i13 = i11 - i12;
                int i110 = i13;
                if (m9818t(i17)) {
                    paddingTop += intrinsicHeight;
                }
                int i21 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                m9678A(childAt, i110, i21, measuredWidth, measuredHeight2);
                paddingTop = i21 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.AbstractC2319Q, android.view.View
    protected void onMeasure(int i7, int i8) {
        if (m9680C(i7, i8)) {
            return;
        }
        super.onMeasure(i7, i8);
    }
}
