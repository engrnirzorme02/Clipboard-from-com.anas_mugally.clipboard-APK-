package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C2371t;
import androidx.core.widget.AbstractC2452c;
import com.google.android.material.internal.AbstractC4543s;
import p045F3.AbstractC0423c;
import p093L3.AbstractC0842a;
import p255h.AbstractC5520a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p397y3.AbstractC7539a;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialRadioButton extends C2371t {

    /* JADX INFO: renamed from: r */
    private static final int f17562r = AbstractC6751l.f26560y;

    /* JADX INFO: renamed from: s */
    private static final int[][] f17563s = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    private ColorStateList f17564e;

    /* JADX INFO: renamed from: f */
    private boolean f17565f;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20955F);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f17564e == null) {
            int iM33173d = AbstractC7539a.m33173d(this, AbstractC5520a.f20981s);
            int iM33173d2 = AbstractC7539a.m33173d(this, AbstractC6742c.f26256h);
            int iM33173d3 = AbstractC7539a.m33173d(this, AbstractC6742c.f26262k);
            int[][] iArr = f17563s;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = AbstractC7539a.m33179j(iM33173d3, iM33173d, 1.0f);
            iArr2[1] = AbstractC7539a.m33179j(iM33173d3, iM33173d2, 0.54f);
            iArr2[2] = AbstractC7539a.m33179j(iM33173d3, iM33173d2, 0.38f);
            iArr2[3] = AbstractC7539a.m33179j(iM33173d3, iM33173d2, 0.38f);
            this.f17564e = new ColorStateList(iArr, iArr2);
        }
        return this.f17564e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17565f && AbstractC2452c.m10719b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z7) {
        this.f17565f = z7;
        if (z7) {
            AbstractC2452c.m10721d(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC2452c.m10721d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17562r;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        Context context2 = getContext();
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context2, attributeSet, AbstractC6752m.f26644H4, i7, i8, new int[0]);
        int i9 = AbstractC6752m.f26655I4;
        if (typedArrayM20818i.hasValue(i9)) {
            AbstractC2452c.m10721d(this, AbstractC0423c.m1825a(context2, typedArrayM20818i, i9));
        }
        this.f17565f = typedArrayM20818i.getBoolean(AbstractC6752m.f26666J4, false);
        typedArrayM20818i.recycle();
    }
}
