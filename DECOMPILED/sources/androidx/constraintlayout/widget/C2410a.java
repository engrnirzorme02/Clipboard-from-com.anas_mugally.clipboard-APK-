package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p385x.C7366a;
import p385x.C7370e;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.a */
/* JADX INFO: loaded from: classes.dex */
public class C2410a extends AbstractC2412c {

    /* JADX INFO: renamed from: u */
    private int f8627u;

    /* JADX INFO: renamed from: v */
    private int f8628v;

    /* JADX INFO: renamed from: w */
    private C7366a f8629w;

    public C2410a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX INFO: renamed from: p */
    private void m10381p(C7370e c7370e, int i7, boolean z7) {
        this.f8628v = i7;
        if (z7) {
            int i8 = this.f8627u;
            if (i8 == 5) {
                this.f8628v = 1;
            } else if (i8 == 6) {
                this.f8628v = 0;
            }
        } else {
            int i9 = this.f8627u;
            if (i9 == 5) {
                this.f8628v = 0;
            } else if (i9 == 6) {
                this.f8628v = 1;
            }
        }
        if (c7370e instanceof C7366a) {
            ((C7366a) c7370e).m32419B1(this.f8628v);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f8629w.m32426v1();
    }

    public int getMargin() {
        return this.f8629w.m32428x1();
    }

    public int getType() {
        return this.f8627u;
    }

    @Override // androidx.constraintlayout.widget.AbstractC2412c
    /* JADX INFO: renamed from: i */
    protected void mo10351i(AttributeSet attributeSet) {
        super.mo10351i(attributeSet);
        this.f8629w = new C7366a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2418i.f8975V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == AbstractC2418i.f9106l1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC2418i.f9098k1) {
                    this.f8629w.m32418A1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == AbstractC2418i.f9114m1) {
                    this.f8629w.m32420C1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f8650d = this.f8629w;
        m10399o();
    }

    @Override // androidx.constraintlayout.widget.AbstractC2412c
    /* JADX INFO: renamed from: j */
    public void mo10352j(C7370e c7370e, boolean z7) {
        m10381p(c7370e, this.f8627u, z7);
    }

    public void setAllowsGoneWidget(boolean z7) {
        this.f8629w.m32418A1(z7);
    }

    public void setDpMargin(int i7) {
        this.f8629w.m32420C1((int) ((i7 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i7) {
        this.f8629w.m32420C1(i7);
    }

    public void setType(int i7) {
        this.f8627u = i7;
    }
}
