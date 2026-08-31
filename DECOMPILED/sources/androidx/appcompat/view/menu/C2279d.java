package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.d */
/* JADX INFO: loaded from: classes.dex */
public class C2279d extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    C2280e f7665a;

    /* JADX INFO: renamed from: b */
    private int f7666b = -1;

    /* JADX INFO: renamed from: c */
    private boolean f7667c;

    /* JADX INFO: renamed from: d */
    private final boolean f7668d;

    /* JADX INFO: renamed from: e */
    private final LayoutInflater f7669e;

    /* JADX INFO: renamed from: f */
    private final int f7670f;

    public C2279d(C2280e c2280e, LayoutInflater layoutInflater, boolean z7, int i7) {
        this.f7668d = z7;
        this.f7669e = layoutInflater;
        this.f7665a = c2280e;
        this.f7670f = i7;
        m9477a();
    }

    /* JADX INFO: renamed from: a */
    void m9477a() {
        C2282g c2282gM9539x = this.f7665a.m9539x();
        if (c2282gM9539x != null) {
            ArrayList arrayListM9492B = this.f7665a.m9492B();
            int size = arrayListM9492B.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((C2282g) arrayListM9492B.get(i7)) == c2282gM9539x) {
                    this.f7666b = i7;
                    return;
                }
            }
        }
        this.f7666b = -1;
    }

    /* JADX INFO: renamed from: b */
    public C2280e m9478b() {
        return this.f7665a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C2282g getItem(int i7) {
        ArrayList arrayListM9492B = this.f7668d ? this.f7665a.m9492B() : this.f7665a.m9496G();
        int i8 = this.f7666b;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (C2282g) arrayListM9492B.get(i7);
    }

    /* JADX INFO: renamed from: d */
    public void m9480d(boolean z7) {
        this.f7667c = z7;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayListM9492B = this.f7668d ? this.f7665a.m9492B() : this.f7665a.m9496G();
        return this.f7666b < 0 ? arrayListM9492B.size() : arrayListM9492B.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f7669e.inflate(this.f7670f, viewGroup, false);
        }
        int groupId = getItem(i7).getGroupId();
        int i8 = i7 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f7665a.mo9498I() && groupId != (i8 >= 0 ? getItem(i8).getGroupId() : groupId));
        InterfaceC2286k.a aVar = (InterfaceC2286k.a) view;
        if (this.f7667c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo9417e(getItem(i7), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m9477a();
        super.notifyDataSetChanged();
    }
}
