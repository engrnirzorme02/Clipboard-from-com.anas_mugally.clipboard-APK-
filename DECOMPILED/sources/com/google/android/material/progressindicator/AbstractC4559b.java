package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.internal.AbstractC4543s;
import p045F3.AbstractC0423c;
import p255h.AbstractC5520a;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6752m;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4559b {

    /* JADX INFO: renamed from: a */
    public int f17455a;

    /* JADX INFO: renamed from: b */
    public int f17456b;

    /* JADX INFO: renamed from: c */
    public float f17457c;

    /* JADX INFO: renamed from: d */
    public boolean f17458d;

    /* JADX INFO: renamed from: e */
    public int[] f17459e = new int[0];

    /* JADX INFO: renamed from: f */
    public int f17460f;

    /* JADX INFO: renamed from: g */
    public int f17461g;

    /* JADX INFO: renamed from: h */
    public int f17462h;

    /* JADX INFO: renamed from: i */
    public int f17463i;

    /* JADX INFO: renamed from: j */
    public int f17464j;

    /* JADX INFO: renamed from: k */
    public int f17465k;

    /* JADX INFO: renamed from: l */
    public int f17466l;

    /* JADX INFO: renamed from: m */
    public int f17467m;

    /* JADX INFO: renamed from: n */
    public float f17468n;

    protected AbstractC4559b(Context context, AttributeSet attributeSet, int i7, int i8) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(AbstractC6744e.f26363p0);
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context, attributeSet, AbstractC6752m.f26760S, i7, i8, new int[0]);
        this.f17455a = AbstractC0423c.m1827c(context, typedArrayM20818i, AbstractC6752m.f26867c0, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayM20818i.peekValue(AbstractC6752m.f26856b0);
        if (typedValuePeekValue != null) {
            int i9 = typedValuePeekValue.type;
            if (i9 == 5) {
                this.f17456b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayM20818i.getResources().getDisplayMetrics()), this.f17455a / 2);
                this.f17458d = false;
            } else if (i9 == 6) {
                this.f17457c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f17458d = true;
            }
        }
        this.f17461g = typedArrayM20818i.getInt(AbstractC6752m.f26824Y, 0);
        this.f17462h = typedArrayM20818i.getInt(AbstractC6752m.f26771T, 0);
        this.f17463i = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26804W, 0);
        int iAbs = Math.abs(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26900f0, 0));
        this.f17464j = Math.abs(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26911g0, iAbs));
        this.f17465k = Math.abs(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26922h0, iAbs));
        this.f17466l = Math.abs(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26878d0, 0));
        this.f17467m = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26889e0, 0);
        this.f17468n = typedArrayM20818i.getFloat(AbstractC6752m.f26782U, 1.0f);
        m20894e(context, typedArrayM20818i);
        m20895f(context, typedArrayM20818i);
        typedArrayM20818i.recycle();
    }

    /* JADX INFO: renamed from: e */
    private void m20894e(Context context, TypedArray typedArray) {
        int i7 = AbstractC6752m.f26793V;
        if (!typedArray.hasValue(i7)) {
            this.f17459e = new int[]{AbstractC7539a.m33171b(context, AbstractC5520a.f20985w, -1)};
            return;
        }
        if (typedArray.peekValue(i7).type != 1) {
            this.f17459e = new int[]{typedArray.getColor(i7, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i7, -1));
        this.f17459e = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    /* JADX INFO: renamed from: f */
    private void m20895f(Context context, TypedArray typedArray) {
        int i7 = AbstractC6752m.f26845a0;
        if (typedArray.hasValue(i7)) {
            this.f17460f = typedArray.getColor(i7, -1);
            return;
        }
        this.f17460f = this.f17459e[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f7 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f17460f = AbstractC7539a.m33170a(this.f17460f, (int) (f7 * 255.0f));
    }

    /* JADX INFO: renamed from: a */
    public int m20896a() {
        return this.f17458d ? (int) (this.f17455a * this.f17457c) : this.f17456b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m20897b(boolean z7) {
        if (this.f17466l <= 0) {
            return false;
        }
        if (z7 || this.f17465k <= 0) {
            return z7 && this.f17464j > 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m20898c() {
        return this.f17462h != 0;
    }

    /* JADX INFO: renamed from: d */
    public boolean m20899d() {
        return this.f17461g != 0;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo20900g() {
        return this.f17458d && this.f17457c == 0.5f;
    }

    /* JADX INFO: renamed from: h */
    void mo20901h() {
        if (this.f17463i < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
