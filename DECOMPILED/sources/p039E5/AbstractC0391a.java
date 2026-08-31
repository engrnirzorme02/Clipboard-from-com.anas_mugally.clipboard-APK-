package p039E5;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.AbstractC2870b;

/* JADX INFO: renamed from: E5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0391a extends AbstractC2870b {

    /* JADX INFO: renamed from: A0 */
    private boolean f1583A0;

    /* JADX INFO: renamed from: v0 */
    private int f1584v0;

    /* JADX INFO: renamed from: w0 */
    private float f1585w0;

    /* JADX INFO: renamed from: x0 */
    private boolean f1586x0;

    /* JADX INFO: renamed from: y0 */
    private boolean f1587y0;

    /* JADX INFO: renamed from: z0 */
    private boolean f1588z0;

    public AbstractC0391a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1584v0 = -1;
        this.f1586x0 = true;
        this.f1587y0 = true;
        this.f1588z0 = false;
        this.f1583A0 = false;
    }

    /* JADX INFO: renamed from: V */
    private boolean m1669V(MotionEvent motionEvent) {
        boolean z7;
        int action = motionEvent.getAction();
        int i7 = action & 255;
        if (i7 == 0) {
            this.f1585w0 = motionEvent.getX();
            this.f1584v0 = motionEvent.getPointerId(0);
        } else {
            if (i7 != 1) {
                if (i7 == 2) {
                    float x7 = motionEvent.getX(motionEvent.findPointerIndex(this.f1584v0));
                    float f7 = x7 - this.f1585w0;
                    if (f7 > 0.0f) {
                        if (!this.f1586x0 && Math.abs(f7) > 0.0f) {
                            this.f1583A0 = true;
                        }
                        if (this.f1583A0) {
                            z7 = false;
                        } else {
                            if (Math.abs(f7) > 0.0f) {
                                this.f1588z0 = false;
                            }
                            z7 = true;
                        }
                    } else {
                        if (f7 < 0.0f) {
                            if (!this.f1587y0 && Math.abs(f7) > 0.0f) {
                                this.f1588z0 = true;
                            }
                            if (!this.f1588z0) {
                                if (Math.abs(f7) > 0.0f) {
                                    this.f1583A0 = false;
                                }
                                z7 = true;
                            }
                        }
                        z7 = false;
                    }
                    this.f1585w0 = x7;
                    invalidate();
                } else if (i7 == 3) {
                    this.f1584v0 = -1;
                    this.f1588z0 = false;
                    this.f1583A0 = false;
                } else if (i7 == 6) {
                    int i8 = (action & 65280) >> 8;
                    if (motionEvent.getPointerId(i8) == this.f1584v0) {
                        int i9 = i8 == 0 ? 1 : 0;
                        this.f1585w0 = motionEvent.getX(i9);
                        this.f1584v0 = motionEvent.getPointerId(i9);
                    }
                }
                return (this.f1588z0 && !this.f1583A0) || z7;
            }
            this.f1584v0 = -1;
            this.f1588z0 = false;
            this.f1583A0 = false;
        }
        z7 = false;
        if (this.f1588z0) {
        }
    }

    @Override // androidx.viewpager.widget.AbstractC2870b, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return m1669V(motionEvent) && super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // androidx.viewpager.widget.AbstractC2870b, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f1586x0 = bundle.getBoolean("SWIPE_RIGHT_ENABLED", true);
            this.f1587y0 = bundle.getBoolean("SWIPE_LEFT_ENABLED", true);
            parcelable = bundle.getParcelable("SUPER");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.viewpager.widget.AbstractC2870b, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle(4);
        bundle.putParcelable("SUPER", super.onSaveInstanceState());
        bundle.putBoolean("SWIPE_RIGHT_ENABLED", this.f1586x0);
        bundle.putBoolean("SWIPE_LEFT_ENABLED", this.f1587y0);
        return bundle;
    }

    @Override // androidx.viewpager.widget.AbstractC2870b, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return m1669V(motionEvent) && super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
        }
    }

    public void setSwipeLeftEnabled(boolean z7) {
        this.f1587y0 = z7;
    }

    public void setSwipeRightEnabled(boolean z7) {
        this.f1586x0 = z7;
    }
}
