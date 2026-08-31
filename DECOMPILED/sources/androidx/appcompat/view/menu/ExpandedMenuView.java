package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.C2348d0;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C2280e.b, InterfaceC2286k, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c */
    private static final int[] f7586c = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a */
    private C2280e f7587a;

    /* JADX INFO: renamed from: b */
    private int f7588b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.C2280e.b
    /* JADX INFO: renamed from: a */
    public boolean mo9422a(C2282g c2282g) {
        return this.f7587a.m9504O(c2282g, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2286k
    /* JADX INFO: renamed from: b */
    public void mo9423b(C2280e c2280e) {
        this.f7587a = c2280e;
    }

    public int getWindowAnimations() {
        return this.f7588b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        mo9422a((C2282g) getAdapter().getItem(i7));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C2348d0 c2348d0M10025v = C2348d0.m10025v(context, attributeSet, f7586c, i7, 0);
        if (c2348d0M10025v.m10044s(0)) {
            setBackgroundDrawable(c2348d0M10025v.m10032g(0));
        }
        if (c2348d0M10025v.m10044s(1)) {
            setDivider(c2348d0M10025v.m10032g(1));
        }
        c2348d0M10025v.m10046x();
    }
}
