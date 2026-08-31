package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.AbstractC2418i;
import androidx.constraintlayout.widget.AbstractC2420k;
import p385x.AbstractC7377l;
import p385x.C7370e;
import p385x.C7372g;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC2420k {

    /* JADX INFO: renamed from: w */
    private C7372g f8516w;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC2420k, androidx.constraintlayout.widget.AbstractC2412c
    /* JADX INFO: renamed from: i */
    protected void mo10351i(AttributeSet attributeSet) {
        super.mo10351i(attributeSet);
        this.f8516w = new C7372g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2418i.f8975V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == AbstractC2418i.f8983W0) {
                    this.f8516w.m32640E2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC2418i.f8991X0) {
                    this.f8516w.m32690J1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC2418i.f9074h1) {
                    this.f8516w.m32695O1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC2418i.f9082i1) {
                    this.f8516w.m32692L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC2418i.f8999Y0) {
                    this.f8516w.m32693M1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC2418i.f9007Z0) {
                    this.f8516w.m32696P1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC2418i.f9016a1) {
                    this.f8516w.m32694N1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC2418i.f9025b1) {
                    this.f8516w.m32691K1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC2418i.f8864H1) {
                    this.f8516w.m32645J2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC2418i.f9202x1) {
                    this.f8516w.m32653y2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC2418i.f8856G1) {
                    this.f8516w.m32644I2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC2418i.f9154r1) {
                    this.f8516w.m32647s2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC2418i.f9218z1) {
                    this.f8516w.m32635A2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC2418i.f9170t1) {
                    this.f8516w.m32649u2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC2418i.f8816B1) {
                    this.f8516w.m32637C2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC2418i.f9186v1) {
                    this.f8516w.m32651w2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC2418i.f9146q1) {
                    this.f8516w.m32646r2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC2418i.f9210y1) {
                    this.f8516w.m32654z2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC2418i.f9162s1) {
                    this.f8516w.m32648t2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC2418i.f8808A1) {
                    this.f8516w.m32636B2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC2418i.f8840E1) {
                    this.f8516w.m32642G2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC2418i.f9178u1) {
                    this.f8516w.m32650v2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == AbstractC2418i.f8832D1) {
                    this.f8516w.m32641F2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == AbstractC2418i.f9194w1) {
                    this.f8516w.m32652x2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC2418i.f8848F1) {
                    this.f8516w.m32643H2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC2418i.f8824C1) {
                    this.f8516w.m32639D2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f8650d = this.f8516w;
        m10399o();
    }

    @Override // androidx.constraintlayout.widget.AbstractC2412c
    /* JADX INFO: renamed from: j */
    public void mo10352j(C7370e c7370e, boolean z7) {
        this.f8516w.m32697u1(z7);
    }

    @Override // androidx.constraintlayout.widget.AbstractC2412c, android.view.View
    protected void onMeasure(int i7, int i8) {
        mo10353p(this.f8516w, i7, i8);
    }

    @Override // androidx.constraintlayout.widget.AbstractC2420k
    /* JADX INFO: renamed from: p */
    public void mo10353p(AbstractC7377l abstractC7377l, int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (abstractC7377l == null) {
            setMeasuredDimension(0, 0);
        } else {
            abstractC7377l.mo32638D1(mode, size, mode2, size2);
            setMeasuredDimension(abstractC7377l.m32701y1(), abstractC7377l.m32700x1());
        }
    }

    public void setFirstHorizontalBias(float f7) {
        this.f8516w.m32646r2(f7);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i7) {
        this.f8516w.m32647s2(i7);
        requestLayout();
    }

    public void setFirstVerticalBias(float f7) {
        this.f8516w.m32648t2(f7);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i7) {
        this.f8516w.m32649u2(i7);
        requestLayout();
    }

    public void setHorizontalAlign(int i7) {
        this.f8516w.m32650v2(i7);
        requestLayout();
    }

    public void setHorizontalBias(float f7) {
        this.f8516w.m32651w2(f7);
        requestLayout();
    }

    public void setHorizontalGap(int i7) {
        this.f8516w.m32652x2(i7);
        requestLayout();
    }

    public void setHorizontalStyle(int i7) {
        this.f8516w.m32653y2(i7);
        requestLayout();
    }

    public void setLastHorizontalBias(float f7) {
        this.f8516w.m32654z2(f7);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i7) {
        this.f8516w.m32635A2(i7);
        requestLayout();
    }

    public void setLastVerticalBias(float f7) {
        this.f8516w.m32636B2(f7);
        requestLayout();
    }

    public void setLastVerticalStyle(int i7) {
        this.f8516w.m32637C2(i7);
        requestLayout();
    }

    public void setMaxElementsWrap(int i7) {
        this.f8516w.m32639D2(i7);
        requestLayout();
    }

    public void setOrientation(int i7) {
        this.f8516w.m32640E2(i7);
        requestLayout();
    }

    public void setPadding(int i7) {
        this.f8516w.m32690J1(i7);
        requestLayout();
    }

    public void setPaddingBottom(int i7) {
        this.f8516w.m32691K1(i7);
        requestLayout();
    }

    public void setPaddingLeft(int i7) {
        this.f8516w.m32693M1(i7);
        requestLayout();
    }

    public void setPaddingRight(int i7) {
        this.f8516w.m32694N1(i7);
        requestLayout();
    }

    public void setPaddingTop(int i7) {
        this.f8516w.m32696P1(i7);
        requestLayout();
    }

    public void setVerticalAlign(int i7) {
        this.f8516w.m32641F2(i7);
        requestLayout();
    }

    public void setVerticalBias(float f7) {
        this.f8516w.m32642G2(f7);
        requestLayout();
    }

    public void setVerticalGap(int i7) {
        this.f8516w.m32643H2(i7);
        requestLayout();
    }

    public void setVerticalStyle(int i7) {
        this.f8516w.m32644I2(i7);
        requestLayout();
    }

    public void setWrapMode(int i7) {
        this.f8516w.m32645J2(i7);
        requestLayout();
    }
}
