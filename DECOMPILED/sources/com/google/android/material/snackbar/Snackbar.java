package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6748i;

/* JADX INFO: loaded from: classes2.dex */
public class Snackbar extends BaseTransientBottomBar {

    /* JADX INFO: renamed from: H */
    private static final int[] f17787H;

    /* JADX INFO: renamed from: I */
    private static final int[] f17788I;

    /* JADX INFO: renamed from: F */
    private final AccessibilityManager f17789F;

    /* JADX INFO: renamed from: G */
    private boolean f17790G;

    public static final class SnackbarLayout extends BaseTransientBottomBar.C4603r {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C4603r, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i7, int i8) {
            super.onMeasure(i7, i8);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C4603r, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C4603r, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C4603r, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C4603r, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C4603r, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C4603r, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        int i7 = AbstractC6742c.f26245b0;
        f17787H = new int[]{i7};
        f17788I = new int[]{i7, AbstractC6742c.f26249d0};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, InterfaceC4604a interfaceC4604a) {
        super(context, viewGroup, view, interfaceC4604a);
        this.f17789F = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m21277c0(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        snackbar.getClass();
        onClickListener.onClick(view);
        snackbar.m21263x(1);
    }

    /* JADX INFO: renamed from: d0 */
    private static ViewGroup m21278d0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: e0 */
    private Button m21279e0() {
        return m21280f0().getActionView();
    }

    /* JADX INFO: renamed from: f0 */
    private SnackbarContentLayout m21280f0() {
        return (SnackbarContentLayout) this.f17739i.getChildAt(0);
    }

    /* JADX INFO: renamed from: g0 */
    private TextView m21281g0() {
        return m21280f0().getMessageView();
    }

    /* JADX INFO: renamed from: h0 */
    private static boolean m21282h0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f17788I);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: i0 */
    public static Snackbar m21283i0(View view, CharSequence charSequence, int i7) {
        return m21284j0(null, view, charSequence, i7);
    }

    /* JADX INFO: renamed from: j0 */
    private static Snackbar m21284j0(Context context, View view, CharSequence charSequence, int i7) {
        ViewGroup viewGroupM21278d0 = m21278d0(view);
        if (viewGroupM21278d0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupM21278d0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(m21282h0(context) ? AbstractC6748i.f26448B : AbstractC6748i.f26454c, viewGroupM21278d0, false);
        Snackbar snackbar = new Snackbar(context, viewGroupM21278d0, snackbarContentLayout, snackbarContentLayout);
        snackbar.m21286l0(charSequence);
        snackbar.m21257Q(i7);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* JADX INFO: renamed from: A */
    public int mo21246A() {
        int iMo21246A = super.mo21246A();
        if (iMo21246A == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f17789F.getRecommendedTimeoutMillis(iMo21246A, (this.f17790G ? 4 : 0) | 3);
        }
        if (this.f17790G && this.f17789F.isTouchExplorationEnabled()) {
            return -2;
        }
        return iMo21246A;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* JADX INFO: renamed from: U */
    public void mo21259U() {
        super.mo21259U();
    }

    /* JADX INFO: renamed from: k0 */
    public Snackbar m21285k0(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button buttonM21279e0 = m21279e0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            buttonM21279e0.setVisibility(8);
            buttonM21279e0.setOnClickListener(null);
            this.f17790G = false;
            return this;
        }
        this.f17790G = true;
        buttonM21279e0.setVisibility(0);
        buttonM21279e0.setText(charSequence);
        buttonM21279e0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Snackbar.m21277c0(this.f17795a, onClickListener, view);
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: l0 */
    public Snackbar m21286l0(CharSequence charSequence) {
        m21281g0().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* JADX INFO: renamed from: w */
    public void mo21262w() {
        super.mo21262w();
    }
}
