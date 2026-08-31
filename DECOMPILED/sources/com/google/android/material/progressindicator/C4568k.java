package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.internal.AbstractC4543s;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C4568k extends AbstractC4559b {

    /* JADX INFO: renamed from: o */
    public int f17553o;

    /* JADX INFO: renamed from: p */
    public int f17554p;

    /* JADX INFO: renamed from: q */
    boolean f17555q;

    /* JADX INFO: renamed from: r */
    public int f17556r;

    /* JADX INFO: renamed from: s */
    public Integer f17557s;

    /* JADX INFO: renamed from: t */
    public int f17558t;

    /* JADX INFO: renamed from: u */
    public float f17559u;

    /* JADX INFO: renamed from: v */
    public boolean f17560v;

    /* JADX INFO: renamed from: w */
    public boolean f17561w;

    public C4568k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26281u);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4559b
    /* JADX INFO: renamed from: g */
    public boolean mo20900g() {
        return super.mo20900g() && m21001i() == m20896a();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4559b
    /* JADX INFO: renamed from: h */
    void mo20901h() {
        super.mo20901h();
        if (this.f17556r < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f17553o == 0) {
            if ((m20896a() > 0 || (this.f17561w && m21001i() > 0)) && this.f17463i == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f17459e.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public int m21001i() {
        if (this.f17561w) {
            return this.f17560v ? (int) (this.f17455a * this.f17559u) : this.f17558t;
        }
        return m20896a();
    }

    public C4568k(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, LinearProgressIndicator.f17434B);
    }

    public C4568k(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context, attributeSet, AbstractC6752m.f26609E2, AbstractC6742c.f26281u, LinearProgressIndicator.f17434B, new int[0]);
        this.f17553o = typedArrayM20818i.getInt(AbstractC6752m.f26620F2, 1);
        this.f17554p = typedArrayM20818i.getInt(AbstractC6752m.f26631G2, 0);
        this.f17556r = Math.min(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26664J2, 0), this.f17455a);
        int i9 = AbstractC6752m.f26653I2;
        if (typedArrayM20818i.hasValue(i9)) {
            this.f17557s = Integer.valueOf(typedArrayM20818i.getDimensionPixelSize(i9, 0));
        }
        TypedValue typedValuePeekValue = typedArrayM20818i.peekValue(AbstractC6752m.f26642H2);
        if (typedValuePeekValue != null) {
            int i10 = typedValuePeekValue.type;
            if (i10 == 5) {
                this.f17558t = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayM20818i.getResources().getDisplayMetrics()), this.f17455a / 2);
                this.f17560v = false;
                this.f17561w = true;
            } else if (i10 == 6) {
                this.f17559u = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f17560v = true;
                this.f17561w = true;
            }
        }
        typedArrayM20818i.recycle();
        mo20901h();
        this.f17555q = this.f17554p == 1;
    }
}
