package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Arrays;
import p045F3.AbstractC0423c;
import p111O.AbstractC1030Z;
import p111O.C1032a;
import p118P.C1170s;
import p263i.AbstractC5659a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6743d;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6748i;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;

/* JADX INFO: loaded from: classes2.dex */
class ClockFaceView extends AbstractC4673d implements ClockHandView.InterfaceC4664b {

    /* JADX INFO: renamed from: N */
    private final ClockHandView f18143N;

    /* JADX INFO: renamed from: O */
    private final Rect f18144O;

    /* JADX INFO: renamed from: P */
    private final RectF f18145P;

    /* JADX INFO: renamed from: Q */
    private final Rect f18146Q;

    /* JADX INFO: renamed from: R */
    private final SparseArray f18147R;

    /* JADX INFO: renamed from: S */
    private final C1032a f18148S;

    /* JADX INFO: renamed from: T */
    private final int[] f18149T;

    /* JADX INFO: renamed from: U */
    private final float[] f18150U;

    /* JADX INFO: renamed from: V */
    private final int f18151V;

    /* JADX INFO: renamed from: W */
    private final int f18152W;

    /* JADX INFO: renamed from: a0 */
    private final int f18153a0;

    /* JADX INFO: renamed from: b0 */
    private final int f18154b0;

    /* JADX INFO: renamed from: c0 */
    private String[] f18155c0;

    /* JADX INFO: renamed from: d0 */
    private float f18156d0;

    /* JADX INFO: renamed from: e0 */
    private final ColorStateList f18157e0;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    class ViewTreeObserverOnPreDrawListenerC4661a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC4661a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo21761H(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f18143N.m21777i()) - ClockFaceView.this.f18151V);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    class C4662b extends C1032a {
        C4662b() {
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            int iIntValue = ((Integer) view.getTag(AbstractC6746g.f26435r)).intValue();
            if (iIntValue > 0) {
                c1170s.m5037O0((View) ClockFaceView.this.f18147R.get(iIntValue - 1));
            }
            c1170s.m5074p0(C1170s.g.m5112a(0, 1, iIntValue, 1, false, view.isSelected()));
            c1170s.m5071n0(true);
            c1170s.m5052b(C1170s.a.f4113i);
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: j */
        public boolean mo4588j(View view, int i7, Bundle bundle) {
            if (i7 != 16) {
                return super.mo4588j(view, i7, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f18144O);
            float fCenterX = ClockFaceView.this.f18144O.centerX();
            float fCenterY = ClockFaceView.this.f18144O.centerY();
            ClockFaceView.this.f18143N.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f18143N.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26218C);
    }

    /* JADX INFO: renamed from: P */
    private void m21756P() {
        RectF rectFM21775e = this.f18143N.m21775e();
        TextView textViewM21758R = m21758R(rectFM21775e);
        for (int i7 = 0; i7 < this.f18147R.size(); i7++) {
            TextView textView = (TextView) this.f18147R.get(i7);
            if (textView != null) {
                textView.setSelected(textView == textViewM21758R);
                textView.getPaint().setShader(m21757Q(rectFM21775e, textView));
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    private RadialGradient m21757Q(RectF rectF, TextView textView) {
        textView.getHitRect(this.f18144O);
        this.f18145P.set(this.f18144O);
        textView.getLineBounds(0, this.f18146Q);
        RectF rectF2 = this.f18145P;
        Rect rect = this.f18146Q;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f18145P)) {
            return new RadialGradient(rectF.centerX() - this.f18145P.left, rectF.centerY() - this.f18145P.top, rectF.width() * 0.5f, this.f18149T, this.f18150U, Shader.TileMode.CLAMP);
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    private TextView m21758R(RectF rectF) {
        float f7 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i7 = 0; i7 < this.f18147R.size(); i7++) {
            TextView textView2 = (TextView) this.f18147R.get(i7);
            if (textView2 != null) {
                textView2.getHitRect(this.f18144O);
                this.f18145P.set(this.f18144O);
                this.f18145P.union(rectF);
                float fWidth = this.f18145P.width() * this.f18145P.height();
                if (fWidth < f7) {
                    textView = textView2;
                    f7 = fWidth;
                }
            }
        }
        return textView;
    }

    /* JADX INFO: renamed from: S */
    private static float m21759S(float f7, float f8, float f9) {
        return Math.max(Math.max(f7, f8), f9);
    }

    /* JADX INFO: renamed from: U */
    private void m21760U(int i7) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f18147R.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < Math.max(this.f18155c0.length, size); i8++) {
            TextView textView = (TextView) this.f18147R.get(i8);
            if (i8 >= this.f18155c0.length) {
                removeView(textView);
                this.f18147R.remove(i8);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(AbstractC6748i.f26465n, (ViewGroup) this, false);
                    this.f18147R.put(i8, textView);
                    addView(textView);
                }
                textView.setText(this.f18155c0[i8]);
                textView.setTag(AbstractC6746g.f26435r, Integer.valueOf(i8));
                int i9 = (i8 / 12) + 1;
                textView.setTag(AbstractC6746g.f26430m, Integer.valueOf(i9));
                if (i9 > 1) {
                    z7 = true;
                }
                AbstractC1030Z.m4474j0(textView, this.f18148S);
                textView.setTextColor(this.f18157e0);
                if (i7 != 0) {
                    textView.setContentDescription(getResources().getString(i7, this.f18155c0[i8]));
                }
            }
        }
        this.f18143N.m21781q(z7);
    }

    @Override // com.google.android.material.timepicker.AbstractC4673d
    /* JADX INFO: renamed from: H */
    public void mo21761H(int i7) {
        if (i7 != m21792G()) {
            super.mo21761H(i7);
            this.f18143N.m21778m(m21792G());
        }
    }

    @Override // com.google.android.material.timepicker.AbstractC4673d
    /* JADX INFO: renamed from: J */
    protected void mo21762J() {
        super.mo21762J();
        for (int i7 = 0; i7 < this.f18147R.size(); i7++) {
            ((TextView) this.f18147R.get(i7)).setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m21763T(String[] strArr, int i7) {
        this.f18155c0 = strArr;
        m21760U(i7);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC4664b
    /* JADX INFO: renamed from: a */
    public void mo21764a(float f7, boolean z7) {
        if (Math.abs(this.f18156d0 - f7) > 0.001f) {
            this.f18156d0 = f7;
            m21756P();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1170s.m4998R0(accessibilityNodeInfo).m5072o0(C1170s.f.m5111b(1, this.f18155c0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        m21756P();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iM21759S = (int) (this.f18154b0 / m21759S(this.f18152W / displayMetrics.heightPixels, this.f18153a0 / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iM21759S, 1073741824);
        setMeasuredDimension(iM21759S, iM21759S);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f18144O = new Rect();
        this.f18145P = new RectF();
        this.f18146Q = new Rect();
        this.f18147R = new SparseArray();
        this.f18150U = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6752m.f26663J1, i7, AbstractC6751l.f26533G);
        Resources resources = getResources();
        ColorStateList colorStateListM1825a = AbstractC0423c.m1825a(context, typedArrayObtainStyledAttributes, AbstractC6752m.f26685L1);
        this.f18157e0 = colorStateListM1825a;
        LayoutInflater.from(context).inflate(AbstractC6748i.f26466o, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(AbstractC6746g.f26429l);
        this.f18143N = clockHandView;
        this.f18151V = resources.getDimensionPixelSize(AbstractC6744e.f26306C);
        int colorForState = colorStateListM1825a.getColorForState(new int[]{R.attr.state_selected}, colorStateListM1825a.getDefaultColor());
        this.f18149T = new int[]{colorForState, colorForState, colorStateListM1825a.getDefaultColor()};
        clockHandView.m21774b(this);
        int defaultColor = AbstractC5659a.m25174a(context, AbstractC6743d.f26297k).getDefaultColor();
        ColorStateList colorStateListM1825a2 = AbstractC0423c.m1825a(context, typedArrayObtainStyledAttributes, AbstractC6752m.f26674K1);
        setBackgroundColor(colorStateListM1825a2 != null ? colorStateListM1825a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC4661a());
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.f18148S = new C4662b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m21763T(strArr, 0);
        this.f18152W = resources.getDimensionPixelSize(AbstractC6744e.f26322Q);
        this.f18153a0 = resources.getDimensionPixelSize(AbstractC6744e.f26323R);
        this.f18154b0 = resources.getDimensionPixelSize(AbstractC6744e.f26310E);
    }
}
