package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.AbstractC2436b;
import com.google.android.material.internal.AbstractC4543s;
import p045F3.AbstractC0423c;
import p069I3.C0622i;
import p093L3.AbstractC0842a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: f */
    private static final int f17033f = AbstractC6751l.f26530D;

    /* JADX INFO: renamed from: a */
    private final C0622i f17034a;

    /* JADX INFO: renamed from: b */
    private int f17035b;

    /* JADX INFO: renamed from: c */
    private int f17036c;

    /* JADX INFO: renamed from: d */
    private int f17037d;

    /* JADX INFO: renamed from: e */
    private int f17038e;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26219D);
    }

    public int getDividerColor() {
        return this.f17036c;
    }

    public int getDividerInsetEnd() {
        return this.f17038e;
    }

    public int getDividerInsetStart() {
        return this.f17037d;
    }

    public int getDividerThickness() {
        return this.f17035b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i7;
        super.onDraw(canvas);
        boolean z7 = getLayoutDirection() == 1;
        int i8 = z7 ? this.f17038e : this.f17037d;
        if (z7) {
            width = getWidth();
            i7 = this.f17037d;
        } else {
            width = getWidth();
            i7 = this.f17038e;
        }
        this.f17034a.setBounds(i8, 0, width - i7, getBottom() - getTop());
        this.f17034a.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i8);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i9 = this.f17035b;
            if (i9 > 0 && measuredHeight != i9) {
                measuredHeight = i9;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i7) {
        if (this.f17036c != i7) {
            this.f17036c = i7;
            this.f17034a.m2718g0(ColorStateList.valueOf(i7));
            invalidate();
        }
    }

    public void setDividerColorResource(int i7) {
        setDividerColor(AbstractC2436b.getColor(getContext(), i7));
    }

    public void setDividerInsetEnd(int i7) {
        this.f17038e = i7;
    }

    public void setDividerInsetEndResource(int i7) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i7));
    }

    public void setDividerInsetStart(int i7) {
        this.f17037d = i7;
    }

    public void setDividerInsetStartResource(int i7) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i7));
    }

    public void setDividerThickness(int i7) {
        if (this.f17035b != i7) {
            this.f17035b = i7;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i7) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i7));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17033f;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        Context context2 = getContext();
        this.f17034a = new C0622i();
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context2, attributeSet, AbstractC6752m.f26589C4, i7, i8, new int[0]);
        this.f17035b = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26633G4, getResources().getDimensionPixelSize(AbstractC6744e.f26311F));
        this.f17037d = typedArrayM20818i.getDimensionPixelOffset(AbstractC6752m.f26622F4, 0);
        this.f17038e = typedArrayM20818i.getDimensionPixelOffset(AbstractC6752m.f26611E4, 0);
        setDividerColor(AbstractC0423c.m1825a(context2, typedArrayM20818i, AbstractC6752m.f26600D4).getDefaultColor());
        typedArrayM20818i.recycle();
    }
}
