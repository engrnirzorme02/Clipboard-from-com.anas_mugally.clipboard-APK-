package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.C3553a;
import p255h.AbstractC5525f;
import p255h.AbstractC5529j;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private boolean f7794a;

    /* JADX INFO: renamed from: b */
    private View f7795b;

    /* JADX INFO: renamed from: c */
    private View f7796c;

    /* JADX INFO: renamed from: d */
    private View f7797d;

    /* JADX INFO: renamed from: e */
    Drawable f7798e;

    /* JADX INFO: renamed from: f */
    Drawable f7799f;

    /* JADX INFO: renamed from: r */
    Drawable f7800r;

    /* JADX INFO: renamed from: s */
    boolean f7801s;

    /* JADX INFO: renamed from: t */
    boolean f7802t;

    /* JADX INFO: renamed from: u */
    private int f7803u;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    private static class C2290a {
        /* JADX INFO: renamed from: a */
        public static void m9629a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C2343b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5529j.f21225a);
        this.f7798e = typedArrayObtainStyledAttributes.getDrawable(AbstractC5529j.f21230b);
        this.f7799f = typedArrayObtainStyledAttributes.getDrawable(AbstractC5529j.f21240d);
        this.f7803u = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5529j.f21270j, -1);
        boolean z7 = true;
        if (getId() == AbstractC5525f.f21076x) {
            this.f7801s = true;
            this.f7800r = typedArrayObtainStyledAttributes.getDrawable(AbstractC5529j.f21235c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f7801s ? this.f7798e != null || this.f7799f != null : this.f7800r != null) {
            z7 = false;
        }
        setWillNotDraw(z7);
    }

    /* JADX INFO: renamed from: a */
    private int m9627a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: b */
    private boolean m9628b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7798e;
        if (drawable != null && drawable.isStateful()) {
            this.f7798e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f7799f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f7799f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f7800r;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f7800r.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f7795b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7798e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f7799f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f7800r;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7796c = findViewById(AbstractC5525f.f21053a);
        this.f7797d = findViewById(AbstractC5525f.f21058f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f7794a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        Drawable drawable;
        super.onLayout(z7, i7, i8, i9, i10);
        View view = this.f7795b;
        boolean z8 = true;
        boolean z9 = false;
        boolean z10 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i11 = layoutParams.bottomMargin;
            view.layout(i7, measuredHeight2 - i11, i9, measuredHeight - i11);
        }
        if (this.f7801s) {
            Drawable drawable2 = this.f7800r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z8 = z9;
            }
        } else {
            if (this.f7798e != null) {
                if (this.f7796c.getVisibility() == 0) {
                    this.f7798e.setBounds(this.f7796c.getLeft(), this.f7796c.getTop(), this.f7796c.getRight(), this.f7796c.getBottom());
                } else {
                    View view2 = this.f7797d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f7798e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f7798e.setBounds(this.f7797d.getLeft(), this.f7797d.getTop(), this.f7797d.getRight(), this.f7797d.getBottom());
                    }
                }
                z9 = true;
            }
            this.f7802t = z10;
            if (!z10 || (drawable = this.f7799f) == null) {
                z8 = z9;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z8) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        int iM9627a;
        int i9;
        if (this.f7796c == null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && (i9 = this.f7803u) >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
        if (this.f7796c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        View view = this.f7795b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (m9628b(this.f7796c)) {
            iM9627a = !m9628b(this.f7797d) ? m9627a(this.f7797d) : 0;
        } else {
            iM9627a = m9627a(this.f7796c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iM9627a + m9627a(this.f7795b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i8) : C3553a.e.API_PRIORITY_OTHER));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f7798e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f7798e);
        }
        this.f7798e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f7796c;
            if (view != null) {
                this.f7798e.setBounds(view.getLeft(), this.f7796c.getTop(), this.f7796c.getRight(), this.f7796c.getBottom());
            }
        }
        boolean z7 = false;
        if (!this.f7801s ? !(this.f7798e != null || this.f7799f != null) : this.f7800r == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        C2290a.m9629a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f7800r;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f7800r);
        }
        this.f7800r = drawable;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f7801s && (drawable2 = this.f7800r) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f7801s ? !(this.f7798e != null || this.f7799f != null) : this.f7800r == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        C2290a.m9629a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f7799f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f7799f);
        }
        this.f7799f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f7802t && (drawable2 = this.f7799f) != null) {
                drawable2.setBounds(this.f7795b.getLeft(), this.f7795b.getTop(), this.f7795b.getRight(), this.f7795b.getBottom());
            }
        }
        boolean z7 = false;
        if (!this.f7801s ? !(this.f7798e != null || this.f7799f != null) : this.f7800r == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        C2290a.m9629a(this);
    }

    public void setTabContainer(AbstractC2339Y abstractC2339Y) {
        View view = this.f7795b;
        if (view != null) {
            removeView(view);
        }
        this.f7795b = abstractC2339Y;
    }

    public void setTransitioning(boolean z7) {
        this.f7794a = z7;
        setDescendantFocusability(z7 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z7 = i7 == 0;
        Drawable drawable = this.f7798e;
        if (drawable != null) {
            drawable.setVisible(z7, false);
        }
        Drawable drawable2 = this.f7799f;
        if (drawable2 != null) {
            drawable2.setVisible(z7, false);
        }
        Drawable drawable3 = this.f7800r;
        if (drawable3 != null) {
            drawable3.setVisible(z7, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f7798e && !this.f7801s) {
            return true;
        }
        if (drawable == this.f7799f && this.f7802t) {
            return true;
        }
        return (drawable == this.f7800r && this.f7801s) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }
}
