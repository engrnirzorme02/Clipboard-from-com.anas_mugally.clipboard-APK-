package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.internal.AbstractC4546v;
import java.util.Calendar;
import p104N.C0906c;
import p111O.AbstractC1030Z;
import p111O.C1032a;
import p118P.C1170s;
import p325p3.AbstractC6746g;

/* JADX INFO: loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    private final Calendar f16844a;

    /* JADX INFO: renamed from: b */
    private final boolean f16845b;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C4468a extends C1032a {
        C4468a() {
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            c1170s.m5072o0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: a */
    private void m20234a(int i7, Rect rect) {
        if (i7 == 33) {
            setSelection(getAdapter().m20401m());
        } else if (i7 == 130) {
            setSelection(getAdapter().m20394b());
        } else {
            super.onFocusChanged(true, i7, rect);
        }
    }

    /* JADX INFO: renamed from: c */
    private View m20235c(int i7) {
        return getChildAt(i7 - getFirstVisiblePosition());
    }

    /* JADX INFO: renamed from: d */
    private static int m20236d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* JADX INFO: renamed from: e */
    private static boolean m20237e(Long l7, Long l8, Long l9, Long l10) {
        return l7 == null || l8 == null || l9 == null || l10 == null || l9.longValue() > l8.longValue() || l10.longValue() < l7.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4490v getAdapter() {
        return (C4490v) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int iM20393a;
        int iM20236d;
        int iM20393a2;
        int iM20236d2;
        int width;
        int i7;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C4490v adapter = materialCalendarGridView.getAdapter();
        InterfaceC4477i interfaceC4477i = adapter.f17004b;
        C4471c c4471c = adapter.f17006d;
        int iMax = Math.max(adapter.m20394b(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(adapter.m20401m(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        for (C0906c c0906c : interfaceC4477i.mo20282k()) {
            Object obj = c0906c.f3546a;
            if (obj == null) {
                materialCalendarGridView = this;
            } else if (c0906c.f3547b != null) {
                Long l7 = (Long) obj;
                long jLongValue = l7.longValue();
                Long l8 = (Long) c0906c.f3547b;
                long jLongValue2 = l8.longValue();
                if (!m20237e(item, item2, l7, l8)) {
                    boolean zM20834i = AbstractC4546v.m20834i(materialCalendarGridView);
                    if (jLongValue < item.longValue()) {
                        iM20236d = adapter.m20398h(iMax) ? 0 : !zM20834i ? materialCalendarGridView.m20235c(iMax - 1).getRight() : materialCalendarGridView.m20235c(iMax - 1).getLeft();
                        iM20393a = iMax;
                    } else {
                        materialCalendarGridView.f16844a.setTimeInMillis(jLongValue);
                        iM20393a = adapter.m20393a(materialCalendarGridView.f16844a.get(5));
                        iM20236d = m20236d(materialCalendarGridView.m20235c(iM20393a));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iM20236d2 = adapter.m20399i(iMin) ? materialCalendarGridView.getWidth() : !zM20834i ? materialCalendarGridView.m20235c(iMin).getRight() : materialCalendarGridView.m20235c(iMin).getLeft();
                        iM20393a2 = iMin;
                    } else {
                        materialCalendarGridView.f16844a.setTimeInMillis(jLongValue2);
                        iM20393a2 = adapter.m20393a(materialCalendarGridView.f16844a.get(5));
                        iM20236d2 = m20236d(materialCalendarGridView.m20235c(iM20393a2));
                    }
                    int itemId = (int) adapter.getItemId(iM20393a);
                    int i8 = iMax;
                    int i9 = iMin;
                    int itemId2 = (int) adapter.getItemId(iM20393a2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                        View viewM20235c = materialCalendarGridView.m20235c(numColumns);
                        int top = viewM20235c.getTop() + c4471c.f16867a.m20261c();
                        C4490v c4490v = adapter;
                        int bottom = viewM20235c.getBottom() - c4471c.f16867a.m20260b();
                        if (zM20834i) {
                            int i10 = iM20393a2 > numColumns2 ? 0 : iM20236d2;
                            width = numColumns > iM20393a ? getWidth() : iM20236d;
                            i7 = i10;
                        } else {
                            i7 = numColumns > iM20393a ? 0 : iM20236d;
                            width = iM20393a2 > numColumns2 ? getWidth() : iM20236d2;
                        }
                        canvas.drawRect(i7, top, width, bottom, c4471c.f16874h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = c4490v;
                    }
                    materialCalendarGridView = this;
                    iMax = i8;
                    iMin = i9;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z7, int i7, Rect rect) {
        if (z7) {
            m20234a(i7, rect);
        } else {
            super.onFocusChanged(false, i7, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (!super.onKeyDown(i7, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= getAdapter().m20394b() && selectedItemPosition <= getAdapter().m20401m())) {
            return true;
        }
        if (19 != i7) {
            return false;
        }
        setSelection(getAdapter().m20394b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i7, int i8) {
        if (!this.f16845b) {
            super.onMeasure(i7, i8);
            return;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i7) {
        if (i7 < getAdapter().m20394b()) {
            super.setSelection(getAdapter().m20394b());
        } else {
            super.setSelection(i7);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f16844a = AbstractC4466C.m20223m();
        if (C4486r.m20354v2(getContext())) {
            setNextFocusLeftId(AbstractC6746g.f26418a);
            setNextFocusRightId(AbstractC6746g.f26421d);
        }
        this.f16845b = C4486r.m20356x2(getContext());
        AbstractC1030Z.m4474j0(this, new C4468a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C4490v)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C4490v.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
