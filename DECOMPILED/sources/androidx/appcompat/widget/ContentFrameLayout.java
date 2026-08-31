package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private TypedValue f7908a;

    /* JADX INFO: renamed from: b */
    private TypedValue f7909b;

    /* JADX INFO: renamed from: c */
    private TypedValue f7910c;

    /* JADX INFO: renamed from: d */
    private TypedValue f7911d;

    /* JADX INFO: renamed from: e */
    private TypedValue f7912e;

    /* JADX INFO: renamed from: f */
    private TypedValue f7913f;

    /* JADX INFO: renamed from: r */
    private final Rect f7914r;

    /* JADX INFO: renamed from: s */
    private InterfaceC2305a f7915s;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC2305a {
        /* JADX INFO: renamed from: a */
        void mo9248a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public void m9740a(int i7, int i8, int i9, int i10) {
        this.f7914r.set(i7, i8, i9, i10);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f7912e == null) {
            this.f7912e = new TypedValue();
        }
        return this.f7912e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f7913f == null) {
            this.f7913f = new TypedValue();
        }
        return this.f7913f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f7910c == null) {
            this.f7910c = new TypedValue();
        }
        return this.f7910c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f7911d == null) {
            this.f7911d = new TypedValue();
        }
        return this.f7911d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f7908a == null) {
            this.f7908a = new TypedValue();
        }
        return this.f7908a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f7909b == null) {
            this.f7909b = new TypedValue();
        }
        return this.f7909b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2305a interfaceC2305a = this.f7915s;
        if (interfaceC2305a != null) {
            interfaceC2305a.mo9248a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2305a interfaceC2305a = this.f7915s;
        if (interfaceC2305a != null) {
            interfaceC2305a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        boolean z7;
        int i9;
        int i10;
        float fraction;
        int i11;
        int i12;
        float fraction2;
        int i13;
        int i14;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z8 = true;
        boolean z9 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode != Integer.MIN_VALUE) {
            z7 = false;
        } else {
            TypedValue typedValue = z9 ? this.f7911d : this.f7910c;
            if (typedValue == null || (i13 = typedValue.type) == 0) {
                z7 = false;
            } else {
                if (i13 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i13 == 6) {
                        int i15 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i15, i15);
                    } else {
                        i14 = 0;
                    }
                    if (i14 > 0) {
                        Rect rect = this.f7914r;
                        i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.left + rect.right), View.MeasureSpec.getSize(i7)), 1073741824);
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                }
                i14 = (int) fraction3;
                if (i14 > 0) {
                    Rect rect2 = this.f7914r;
                    i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i7)), 1073741824);
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z9 ? this.f7912e : this.f7913f;
            if (typedValue2 != null && (i11 = typedValue2.type) != 0) {
                if (i11 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i11 == 6) {
                        int i16 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i16, i16);
                    } else {
                        i12 = 0;
                    }
                    if (i12 > 0) {
                        Rect rect3 = this.f7914r;
                        i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i12 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i8)), 1073741824);
                    }
                }
                i12 = (int) fraction2;
                if (i12 > 0) {
                    Rect rect4 = this.f7914r;
                    i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i12 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i8)), 1073741824);
                }
            }
        }
        super.onMeasure(i7, i8);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z7 || mode != Integer.MIN_VALUE) {
            z8 = false;
        } else {
            TypedValue typedValue3 = z9 ? this.f7909b : this.f7908a;
            if (typedValue3 == null || (i9 = typedValue3.type) == 0) {
                z8 = false;
            } else {
                if (i9 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i9 == 6) {
                        int i17 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i17, i17);
                    } else {
                        i10 = 0;
                    }
                    if (i10 > 0) {
                        Rect rect5 = this.f7914r;
                        i10 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i10) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                    } else {
                        z8 = false;
                    }
                }
                i10 = (int) fraction;
                if (i10 > 0) {
                    Rect rect6 = this.f7914r;
                    i10 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i10) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                } else {
                    z8 = false;
                }
            }
        }
        if (z8) {
            super.onMeasure(iMakeMeasureSpec, i8);
        }
    }

    public void setAttachListener(InterfaceC2305a interfaceC2305a) {
        this.f7915s = interfaceC2305a;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f7914r = new Rect();
    }
}
