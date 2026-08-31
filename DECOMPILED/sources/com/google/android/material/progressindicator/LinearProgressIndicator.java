package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import java.util.Objects;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6751l;

/* JADX INFO: loaded from: classes2.dex */
public class LinearProgressIndicator extends AbstractC4558a {

    /* JADX INFO: renamed from: B */
    public static final int f17434B = AbstractC6751l.f26527A;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26281u);
    }

    /* JADX INFO: renamed from: t */
    private void m20874t() {
        C4565h c4565h = new C4565h((C4568k) this.f17436a);
        setIndeterminateDrawable(C4564g.m20963v(getContext(), (C4568k) this.f17436a, c4565h));
        setProgressDrawable(C4560c.m20902A(getContext(), (C4568k) this.f17436a, c4565h));
    }

    public int getIndeterminateAnimationType() {
        return ((C4568k) this.f17436a).f17553o;
    }

    public int getIndicatorDirection() {
        return ((C4568k) this.f17436a).f17554p;
    }

    public int getTrackInnerCornerRadius() {
        return ((C4568k) this.f17436a).f17558t;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((C4568k) this.f17436a).f17557s;
    }

    public int getTrackStopIndicatorSize() {
        return ((C4568k) this.f17436a).f17556r;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4558a, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        AbstractC4559b abstractC4559b = this.f17436a;
        C4568k c4568k = (C4568k) abstractC4559b;
        boolean z8 = true;
        if (((C4568k) abstractC4559b).f17554p != 1 && ((getLayoutDirection() != 1 || ((C4568k) this.f17436a).f17554p != 2) && (getLayoutDirection() != 0 || ((C4568k) this.f17436a).f17554p != 3))) {
            z8 = false;
        }
        c4568k.f17555q = z8;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        int paddingLeft = i7 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i8 - (getPaddingTop() + getPaddingBottom());
        C4564g indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        C4560c progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4558a
    /* JADX INFO: renamed from: p */
    public void mo20876p(int i7, boolean z7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        if (abstractC4559b != null && ((C4568k) abstractC4559b).f17553o == 0 && isIndeterminate()) {
            return;
        }
        super.mo20876p(i7, z7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC4558a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C4568k mo20875i(Context context, AttributeSet attributeSet) {
        return new C4568k(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i7) {
        if (((C4568k) this.f17436a).f17553o == i7) {
            return;
        }
        if (m20893r() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        AbstractC4559b abstractC4559b = this.f17436a;
        ((C4568k) abstractC4559b).f17553o = i7;
        ((C4568k) abstractC4559b).mo20901h();
        if (i7 == 0) {
            getIndeterminateDrawable().m20968z(new C4566i((C4568k) this.f17436a));
        } else {
            getIndeterminateDrawable().m20968z(new C4567j(getContext(), (C4568k) this.f17436a));
        }
        m20892o();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4558a
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((C4568k) this.f17436a).mo20901h();
    }

    public void setIndicatorDirection(int i7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        ((C4568k) abstractC4559b).f17554p = i7;
        C4568k c4568k = (C4568k) abstractC4559b;
        boolean z7 = true;
        if (i7 != 1 && ((getLayoutDirection() != 1 || ((C4568k) this.f17436a).f17554p != 2) && (getLayoutDirection() != 0 || i7 != 3))) {
            z7 = false;
        }
        c4568k.f17555q = z7;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4558a
    public void setTrackCornerRadius(int i7) {
        super.setTrackCornerRadius(i7);
        ((C4568k) this.f17436a).mo20901h();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        if (((C4568k) abstractC4559b).f17558t != i7) {
            ((C4568k) abstractC4559b).f17558t = Math.round(Math.min(i7, ((C4568k) abstractC4559b).f17455a / 2.0f));
            AbstractC4559b abstractC4559b2 = this.f17436a;
            ((C4568k) abstractC4559b2).f17560v = false;
            ((C4568k) abstractC4559b2).f17561w = true;
            ((C4568k) abstractC4559b2).mo20901h();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        if (((C4568k) abstractC4559b).f17559u != f7) {
            ((C4568k) abstractC4559b).f17559u = Math.min(f7, 0.5f);
            AbstractC4559b abstractC4559b2 = this.f17436a;
            ((C4568k) abstractC4559b2).f17560v = true;
            ((C4568k) abstractC4559b2).f17561w = true;
            ((C4568k) abstractC4559b2).mo20901h();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        if (Objects.equals(((C4568k) this.f17436a).f17557s, num)) {
            return;
        }
        ((C4568k) this.f17436a).f17557s = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i7) {
        AbstractC4559b abstractC4559b = this.f17436a;
        if (((C4568k) abstractC4559b).f17556r != i7) {
            ((C4568k) abstractC4559b).f17556r = Math.min(i7, ((C4568k) abstractC4559b).f17455a);
            ((C4568k) this.f17436a).mo20901h();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, f17434B);
        m20874t();
        this.f17446v = true;
    }
}
