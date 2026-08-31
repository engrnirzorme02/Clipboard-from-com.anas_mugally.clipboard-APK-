package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p385x.AbstractC7377l;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2420k extends AbstractC2412c {

    /* JADX INFO: renamed from: u */
    private boolean f9226u;

    /* JADX INFO: renamed from: v */
    private boolean f9227v;

    public AbstractC2420k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC2412c
    /* JADX INFO: renamed from: f */
    protected void mo10394f(ConstraintLayout constraintLayout) {
        m10393e(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.AbstractC2412c
    /* JADX INFO: renamed from: i */
    protected void mo10351i(AttributeSet attributeSet) {
        super.mo10351i(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2418i.f8975V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == AbstractC2418i.f9034c1) {
                    this.f9226u = true;
                } else if (index == AbstractC2418i.f9090j1) {
                    this.f9227v = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC2412c, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9226u || this.f9227v) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i7 = 0; i7 < this.f8648b; i7++) {
                    View viewM10369q = constraintLayout.m10369q(this.f8647a[i7]);
                    if (viewM10369q != null) {
                        if (this.f9226u) {
                            viewM10369q.setVisibility(visibility);
                        }
                        if (this.f9227v && elevation > 0.0f) {
                            viewM10369q.setTranslationZ(viewM10369q.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo10353p(AbstractC7377l abstractC7377l, int i7, int i8);

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        m10392d();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        m10392d();
    }
}
