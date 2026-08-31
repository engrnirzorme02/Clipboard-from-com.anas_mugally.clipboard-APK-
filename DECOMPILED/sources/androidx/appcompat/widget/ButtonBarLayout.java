package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p111O.AbstractC1030Z;
import p255h.AbstractC5525f;
import p255h.AbstractC5529j;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private boolean f7892a;

    /* JADX INFO: renamed from: b */
    private boolean f7893b;

    /* JADX INFO: renamed from: c */
    private int f7894c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7894c = -1;
        int[] iArr = AbstractC5529j.f21174N0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC1030Z.m4470h0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f7892a = typedArrayObtainStyledAttributes.getBoolean(AbstractC5529j.f21178O0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f7892a);
        }
    }

    /* JADX INFO: renamed from: a */
    private int m9709a(int i7) {
        int childCount = getChildCount();
        while (i7 < childCount) {
            if (getChildAt(i7).getVisibility() == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    private boolean m9710b() {
        return this.f7893b;
    }

    private void setStacked(boolean z7) {
        if (this.f7893b != z7) {
            if (!z7 || this.f7892a) {
                this.f7893b = z7;
                setOrientation(z7 ? 1 : 0);
                setGravity(z7 ? 8388613 : 80);
                View viewFindViewById = findViewById(AbstractC5525f.f21075w);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z7 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        int iMakeMeasureSpec;
        boolean z7;
        int size = View.MeasureSpec.getSize(i7);
        int paddingBottom = 0;
        if (this.f7892a) {
            if (size > this.f7894c && m9710b()) {
                setStacked(false);
            }
            this.f7894c = size;
        }
        if (m9710b() || View.MeasureSpec.getMode(i7) != 1073741824) {
            iMakeMeasureSpec = i7;
            z7 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z7 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i8);
        if (this.f7892a && !m9710b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z7 = true;
        }
        if (z7) {
            super.onMeasure(i7, i8);
        }
        int iM9709a = m9709a(0);
        if (iM9709a >= 0) {
            View childAt = getChildAt(iM9709a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (m9710b()) {
                int iM9709a2 = m9709a(iM9709a + 1);
                if (iM9709a2 >= 0) {
                    paddingTop += getChildAt(iM9709a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (AbstractC1030Z.m4425A(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i8 == 0) {
                super.onMeasure(i7, i8);
            }
        }
    }

    public void setAllowStacking(boolean z7) {
        if (this.f7892a != z7) {
            this.f7892a = z7;
            if (!z7 && m9710b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
