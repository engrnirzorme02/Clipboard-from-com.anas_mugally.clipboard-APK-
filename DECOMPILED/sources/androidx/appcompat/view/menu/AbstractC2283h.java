package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import p295m.InterfaceC6318e;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: androidx.appcompat.view.menu.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2283h implements InterfaceC6318e, InterfaceC2285j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    private Rect f7734a;

    AbstractC2283h() {
    }

    /* JADX INFO: renamed from: A */
    protected static C2279d m9570A(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C2279d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C2279d) listAdapter;
    }

    /* JADX INFO: renamed from: q */
    protected static int m9571q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i7) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i8 = 0;
        int i9 = 0;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = listAdapter.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i10, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i7) {
                return i7;
            }
            if (measuredWidth > i8) {
                i8 = measuredWidth;
            }
        }
        return i8;
    }

    /* JADX INFO: renamed from: z */
    protected static boolean m9572z(C2280e c2280e) {
        int size = c2280e.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = c2280e.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: f */
    public boolean mo9434f(C2280e c2280e, C2282g c2282g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: g */
    public boolean mo9435g(C2280e c2280e, C2282g c2282g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: i */
    public void mo9437i(Context context, C2280e c2280e) {
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo9459n(C2280e c2280e);

    /* JADX INFO: renamed from: o */
    protected boolean mo9460o() {
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m9570A(listAdapter).f7665a.m9505P((MenuItem) listAdapter.getItem(i7), this, mo9460o() ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public Rect m9573p() {
        return this.f7734a;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo9461r(View view);

    /* JADX INFO: renamed from: s */
    public void m9574s(Rect rect) {
        this.f7734a = rect;
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo9462t(boolean z7);

    /* JADX INFO: renamed from: u */
    public abstract void mo9463u(int i7);

    /* JADX INFO: renamed from: v */
    public abstract void mo9464v(int i7);

    /* JADX INFO: renamed from: w */
    public abstract void mo9465w(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: x */
    public abstract void mo9466x(boolean z7);

    /* JADX INFO: renamed from: y */
    public abstract void mo9467y(int i7);
}
