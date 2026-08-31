package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.common.api.C3553a;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.AbstractC4546v;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import p069I3.C0614a;
import p069I3.C0627n;
import p069I3.C0634u;
import p069I3.C0635v;
import p069I3.C0636w;
import p069I3.InterfaceC0617d;
import p093L3.AbstractC0842a;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: com.google.android.material.button.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4438d extends LinearLayout {

    /* JADX INFO: renamed from: v */
    private static final int f16589v = AbstractC6751l.f26551p;

    /* JADX INFO: renamed from: a */
    private final List f16590a;

    /* JADX INFO: renamed from: b */
    private final List f16591b;

    /* JADX INFO: renamed from: c */
    private final b f16592c;

    /* JADX INFO: renamed from: d */
    private final Comparator f16593d;

    /* JADX INFO: renamed from: e */
    private Integer[] f16594e;

    /* JADX INFO: renamed from: f */
    C0634u f16595f;

    /* JADX INFO: renamed from: r */
    private C0635v f16596r;

    /* JADX INFO: renamed from: s */
    private int f16597s;

    /* JADX INFO: renamed from: t */
    private C0636w f16598t;

    /* JADX INFO: renamed from: u */
    private boolean f16599u;

    /* JADX INFO: renamed from: com.google.android.material.button.d$b */
    private class b implements MaterialButton.InterfaceC4431b {
        private b() {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC4431b
        /* JADX INFO: renamed from: a */
        public void mo19733a(MaterialButton materialButton, boolean z7) {
            AbstractC4438d.this.invalidate();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC4438d(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f16589v;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        this.f16590a = new ArrayList();
        this.f16591b = new ArrayList();
        this.f16592c = new b();
        this.f16593d = new Comparator() { // from class: com.google.android.material.button.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4438d.m19751a(this.f16588a, (MaterialButton) obj, (MaterialButton) obj2);
            }
        };
        this.f16599u = true;
        Context context2 = getContext();
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context2, attributeSet, AbstractC6752m.f27112y3, i7, i8, new int[0]);
        int i9 = AbstractC6752m.f26577B3;
        if (typedArrayM20818i.hasValue(i9)) {
            this.f16598t = C0636w.m2929b(context2, typedArrayM20818i, i9);
        }
        int i10 = AbstractC6752m.f26599D3;
        if (typedArrayM20818i.hasValue(i10)) {
            C0635v c0635vM2906b = C0635v.m2906b(context2, typedArrayM20818i, i10);
            this.f16596r = c0635vM2906b;
            if (c0635vM2906b == null) {
                this.f16596r = new C0635v.b(C0627n.m2755b(context2, typedArrayM20818i.getResourceId(i10, 0), typedArrayM20818i.getResourceId(AbstractC6752m.f26610E3, 0)).m2802m()).m2926j();
            }
        }
        int i11 = AbstractC6752m.f26588C3;
        if (typedArrayM20818i.hasValue(i11)) {
            this.f16595f = C0634u.m2898c(context2, typedArrayM20818i, i11, new C0614a(0.0f));
        }
        this.f16597s = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26566A3, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM20818i.getBoolean(AbstractC6752m.f27123z3, true));
        typedArrayM20818i.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m19751a(AbstractC4438d abstractC4438d, MaterialButton materialButton, MaterialButton materialButton2) {
        abstractC4438d.getClass();
        int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(abstractC4438d.indexOfChild(materialButton), abstractC4438d.indexOfChild(materialButton2));
    }

    /* JADX INFO: renamed from: b */
    private void m19752b() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i7 = firstVisibleChildIndex + 1; i7 < getChildCount(); i7++) {
            MaterialButton materialButtonM19763f = m19763f(i7);
            MaterialButton materialButtonM19763f2 = m19763f(i7 - 1);
            if (this.f16597s <= 0) {
                iMin = Math.min(materialButtonM19763f.getStrokeWidth(), materialButtonM19763f2.getStrokeWidth());
                materialButtonM19763f.setShouldDrawSurfaceColorStroke(true);
                materialButtonM19763f2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButtonM19763f.setShouldDrawSurfaceColorStroke(false);
                materialButtonM19763f2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsM19762d = m19762d(materialButtonM19763f);
            if (getOrientation() == 0) {
                layoutParamsM19762d.setMarginEnd(0);
                layoutParamsM19762d.setMarginStart(this.f16597s - iMin);
                layoutParamsM19762d.topMargin = 0;
            } else {
                layoutParamsM19762d.bottomMargin = 0;
                layoutParamsM19762d.topMargin = this.f16597s - iMin;
                layoutParamsM19762d.setMarginStart(0);
            }
            materialButtonM19763f.setLayoutParams(layoutParamsM19762d);
        }
        m19760m(firstVisibleChildIndex);
    }

    /* JADX INFO: renamed from: c */
    private void m19753c() {
        if (this.f16598t == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = C3553a.e.API_PRIORITY_OTHER;
        for (int i7 = firstVisibleChildIndex; i7 <= lastVisibleChildIndex; i7++) {
            if (m19758j(i7)) {
                int iM19754e = m19754e(i7);
                if (i7 != firstVisibleChildIndex && i7 != lastVisibleChildIndex) {
                    iM19754e /= 2;
                }
                iMin = Math.min(iMin, iM19754e);
            }
        }
        int i8 = firstVisibleChildIndex;
        while (i8 <= lastVisibleChildIndex) {
            if (m19758j(i8)) {
                m19763f(i8).setSizeChange(this.f16598t);
                m19763f(i8).setWidthChangeMax((i8 == firstVisibleChildIndex || i8 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i8++;
        }
    }

    /* JADX INFO: renamed from: e */
    private int m19754e(int i7) {
        if (!m19758j(i7) || this.f16598t == null) {
            return 0;
        }
        int iMax = Math.max(0, this.f16598t.m2934c(m19763f(i7).getWidth()));
        MaterialButton materialButtonM19757i = m19757i(i7);
        int allowedWidthDecrease = materialButtonM19757i == null ? 0 : materialButtonM19757i.getAllowedWidthDecrease();
        MaterialButton materialButtonM19755g = m19755g(i7);
        return Math.min(iMax, allowedWidthDecrease + (materialButtonM19755g != null ? materialButtonM19755g.getAllowedWidthDecrease() : 0));
    }

    /* JADX INFO: renamed from: g */
    private MaterialButton m19755g(int i7) {
        int childCount = getChildCount();
        do {
            i7++;
            if (i7 >= childCount) {
                return null;
            }
        } while (!m19758j(i7));
        return m19763f(i7);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (m19758j(i7)) {
                return i7;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m19758j(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    private C0635v.b m19756h(boolean z7, boolean z8, int i7) {
        C0635v c0635v = this.f16596r;
        if (c0635v == null || (!z7 && !z8)) {
            c0635v = (C0635v) this.f16591b.get(i7);
        }
        return c0635v == null ? new C0635v.b((C0627n) this.f16590a.get(i7)) : c0635v.m2913i();
    }

    /* JADX INFO: renamed from: i */
    private MaterialButton m19757i(int i7) {
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (m19758j(i8)) {
                return m19763f(i8);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    private boolean m19758j(int i7) {
        return getChildAt(i7).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: l */
    private void m19759l() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            m19763f(i7).m19730o();
        }
    }

    /* JADX INFO: renamed from: m */
    private void m19760m(int i7) {
        if (getChildCount() == 0 || i7 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m19763f(i7).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m19761n() {
        TreeMap treeMap = new TreeMap(this.f16593d);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            treeMap.put(m19763f(i7), Integer.valueOf(i7));
        }
        this.f16594e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        m19759l();
        this.f16599u = true;
        super.addView(view, i7, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f16592c);
        this.f16590a.add(materialButton.getShapeAppearanceModel());
        this.f16591b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    /* JADX INFO: renamed from: d */
    LinearLayout.LayoutParams m19762d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m19761n();
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: f */
    MaterialButton m19763f(int i7) {
        return (MaterialButton) getChildAt(i7);
    }

    public C0636w getButtonSizeChange() {
        return this.f16598t;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i7, int i8) {
        Integer[] numArr = this.f16594e;
        if (numArr != null && i8 < numArr.length) {
            return numArr[i8].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i8;
    }

    public InterfaceC0617d getInnerCornerSize() {
        return this.f16595f.m2903e();
    }

    public C0634u getInnerCornerSizeStateList() {
        return this.f16595f;
    }

    public C0627n getShapeAppearance() {
        C0635v c0635v = this.f16596r;
        if (c0635v == null) {
            return null;
        }
        return c0635v.m2910c(true);
    }

    public int getSpacing() {
        return this.f16597s;
    }

    public C0635v getStateListShapeAppearance() {
        return this.f16596r;
    }

    /* JADX INFO: renamed from: k */
    void m19764k(MaterialButton materialButton, int i7) {
        int iIndexOfChild = indexOfChild(materialButton);
        if (iIndexOfChild < 0) {
            return;
        }
        MaterialButton materialButtonM19757i = m19757i(iIndexOfChild);
        MaterialButton materialButtonM19755g = m19755g(iIndexOfChild);
        if (materialButtonM19757i == null && materialButtonM19755g == null) {
            return;
        }
        if (materialButtonM19757i == null) {
            materialButtonM19755g.setDisplayedWidthDecrease(i7);
        }
        if (materialButtonM19755g == null) {
            materialButtonM19757i.setDisplayedWidthDecrease(i7);
        }
        if (materialButtonM19757i == null || materialButtonM19755g == null) {
            return;
        }
        materialButtonM19757i.setDisplayedWidthDecrease(i7 / 2);
        materialButtonM19755g.setDisplayedWidthDecrease((i7 + 1) / 2);
    }

    /* JADX INFO: renamed from: o */
    void m19765o() {
        int iM2909h;
        if (!(this.f16595f == null && this.f16596r == null) && this.f16599u) {
            this.f16599u = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i7 = 0;
            while (i7 < childCount) {
                MaterialButton materialButtonM19763f = m19763f(i7);
                if (materialButtonM19763f.getVisibility() != 8) {
                    boolean z7 = i7 == firstVisibleChildIndex;
                    boolean z8 = i7 == lastVisibleChildIndex;
                    C0635v.b bVarM19756h = m19756h(z7, z8, i7);
                    boolean z9 = getOrientation() == 0;
                    boolean zM20834i = AbstractC4546v.m20834i(this);
                    if (z9) {
                        iM2909h = z7 ? 5 : 0;
                        if (z8) {
                            iM2909h |= 10;
                        }
                        if (zM20834i) {
                            iM2909h = C0635v.m2909h(iM2909h);
                        }
                    } else {
                        iM2909h = z7 ? 3 : 0;
                        if (z8) {
                            iM2909h |= 12;
                        }
                    }
                    C0635v c0635vM2926j = bVarM19756h.m2927n(this.f16595f, ~iM2909h).m2926j();
                    if (c0635vM2926j.m2912f()) {
                        materialButtonM19763f.setStateListShapeAppearanceModel(c0635vM2926j);
                    } else {
                        materialButtonM19763f.setShapeAppearanceModel(c0635vM2926j.m2910c(true));
                    }
                }
                i7++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        if (z7) {
            m19759l();
            m19753c();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        m19765o();
        m19752b();
        super.onMeasure(i7, i8);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f16590a.remove(iIndexOfChild);
            this.f16591b.remove(iIndexOfChild);
        }
        this.f16599u = true;
        m19765o();
        m19759l();
        m19752b();
    }

    public void setButtonSizeChange(C0636w c0636w) {
        if (this.f16598t != c0636w) {
            this.f16598t = c0636w;
            m19753c();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            m19763f(i7).setEnabled(z7);
        }
    }

    public void setInnerCornerSize(InterfaceC0617d interfaceC0617d) {
        this.f16595f = C0634u.m2897b(interfaceC0617d);
        this.f16599u = true;
        m19765o();
        invalidate();
    }

    public void setInnerCornerSizeStateList(C0634u c0634u) {
        this.f16595f = c0634u;
        this.f16599u = true;
        m19765o();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i7) {
        if (getOrientation() != i7) {
            this.f16599u = true;
        }
        super.setOrientation(i7);
    }

    public void setShapeAppearance(C0627n c0627n) {
        this.f16596r = new C0635v.b(c0627n).m2926j();
        this.f16599u = true;
        m19765o();
        invalidate();
    }

    public void setSpacing(int i7) {
        this.f16597s = i7;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(C0635v c0635v) {
        this.f16596r = c0635v;
        this.f16599u = true;
        m19765o();
        invalidate();
    }
}
