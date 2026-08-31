package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C2414e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p069I3.C0622i;
import p069I3.C0625l;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6748i;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: com.google.android.material.timepicker.d */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4673d extends ConstraintLayout {

    /* JADX INFO: renamed from: K */
    private final Runnable f18194K;

    /* JADX INFO: renamed from: L */
    private int f18195L;

    /* JADX INFO: renamed from: M */
    private C0622i f18196M;

    public AbstractC4673d(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        LayoutInflater.from(context).inflate(AbstractC6748i.f26467p, this);
        setBackground(m21788E());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6752m.f26873c6, i7, 0);
        this.f18195L = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6752m.f26884d6, 0);
        this.f18194K = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f18193a.mo21762J();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: D */
    private void m21787D(List list, C2414e c2414e, int i7) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            c2414e.m10419g(((View) it.next()).getId(), AbstractC6746g.f26420c, i7, size);
            size += 360.0f / list.size();
        }
    }

    /* JADX INFO: renamed from: E */
    private Drawable m21788E() {
        C0622i c0622i = new C0622i();
        this.f18196M = c0622i;
        c0622i.m2715d0(new C0625l(0.5f));
        this.f18196M.m2718g0(ColorStateList.valueOf(-1));
        return this.f18196M;
    }

    /* JADX INFO: renamed from: I */
    private static boolean m21789I(View view) {
        return "skip".equals(view.getTag());
    }

    /* JADX INFO: renamed from: K */
    private void m21790K() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f18194K);
            handler.post(this.f18194K);
        }
    }

    /* JADX INFO: renamed from: F */
    int m21791F(int i7) {
        return i7 == 2 ? Math.round(this.f18195L * 0.66f) : this.f18195L;
    }

    /* JADX INFO: renamed from: G */
    public int m21792G() {
        return this.f18195L;
    }

    /* JADX INFO: renamed from: H */
    public void mo21761H(int i7) {
        this.f18195L = i7;
        mo21762J();
    }

    /* JADX INFO: renamed from: J */
    protected void mo21762J() {
        C2414e c2414e = new C2414e();
        c2414e.m10418f(this);
        HashMap map = new HashMap();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getId() != AbstractC6746g.f26420c && !m21789I(childAt)) {
                int i8 = (Integer) childAt.getTag(AbstractC6746g.f26430m);
                if (i8 == null) {
                    i8 = 1;
                }
                if (!map.containsKey(i8)) {
                    map.put(i8, new ArrayList());
                }
                ((List) map.get(i8)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            m21787D((List) entry.getValue(), c2414e, m21791F(((Integer) entry.getKey()).intValue()));
        }
        c2414e.m10415c(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        m21790K();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        mo21762J();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m21790K();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.f18196M.m2718g0(ColorStateList.valueOf(i7));
    }
}
