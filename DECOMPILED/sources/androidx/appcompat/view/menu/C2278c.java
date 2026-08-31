package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import p255h.AbstractC5526g;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.c */
/* JADX INFO: loaded from: classes.dex */
public class C2278c implements InterfaceC2285j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    Context f7653a;

    /* JADX INFO: renamed from: b */
    LayoutInflater f7654b;

    /* JADX INFO: renamed from: c */
    C2280e f7655c;

    /* JADX INFO: renamed from: d */
    ExpandedMenuView f7656d;

    /* JADX INFO: renamed from: e */
    int f7657e;

    /* JADX INFO: renamed from: f */
    int f7658f;

    /* JADX INFO: renamed from: r */
    int f7659r;

    /* JADX INFO: renamed from: s */
    private InterfaceC2285j.a f7660s;

    /* JADX INFO: renamed from: t */
    a f7661t;

    /* JADX INFO: renamed from: u */
    private int f7662u;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.c$a */
    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        private int f7663a = -1;

        public a() {
            m9475a();
        }

        /* JADX INFO: renamed from: a */
        void m9475a() {
            C2282g c2282gM9539x = C2278c.this.f7655c.m9539x();
            if (c2282gM9539x != null) {
                ArrayList arrayListM9492B = C2278c.this.f7655c.m9492B();
                int size = arrayListM9492B.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (((C2282g) arrayListM9492B.get(i7)) == c2282gM9539x) {
                        this.f7663a = i7;
                        return;
                    }
                }
            }
            this.f7663a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2282g getItem(int i7) {
            ArrayList arrayListM9492B = C2278c.this.f7655c.m9492B();
            int i8 = i7 + C2278c.this.f7657e;
            int i9 = this.f7663a;
            if (i9 >= 0 && i8 >= i9) {
                i8++;
            }
            return (C2282g) arrayListM9492B.get(i8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C2278c.this.f7655c.m9492B().size() - C2278c.this.f7657e;
            return this.f7663a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            if (view == null) {
                C2278c c2278c = C2278c.this;
                view = c2278c.f7654b.inflate(c2278c.f7659r, viewGroup, false);
            }
            ((InterfaceC2286k.a) view).mo9417e(getItem(i7), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m9475a();
            super.notifyDataSetChanged();
        }
    }

    public C2278c(Context context, int i7) {
        this(i7, 0);
        this.f7653a = context;
        this.f7654b = LayoutInflater.from(context);
    }

    /* JADX INFO: renamed from: a */
    public ListAdapter m9471a() {
        if (this.f7661t == null) {
            this.f7661t = new a();
        }
        return this.f7661t;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC2286k m9472b(ViewGroup viewGroup) {
        if (this.f7656d == null) {
            this.f7656d = (ExpandedMenuView) this.f7654b.inflate(AbstractC5526g.f21085g, viewGroup, false);
            if (this.f7661t == null) {
                this.f7661t = new a();
            }
            this.f7656d.setAdapter((ListAdapter) this.f7661t);
            this.f7656d.setOnItemClickListener(this);
        }
        return this.f7656d;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: c */
    public void mo9432c(C2280e c2280e, boolean z7) {
        InterfaceC2285j.a aVar = this.f7660s;
        if (aVar != null) {
            aVar.mo9249c(c2280e, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: d */
    public void mo9433d(boolean z7) {
        a aVar = this.f7661t;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: e */
    public boolean mo9455e() {
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
        return this.f7662u;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: h */
    public void mo9436h(InterfaceC2285j.a aVar) {
        this.f7660s = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: i */
    public void mo9437i(Context context, C2280e c2280e) {
        if (this.f7658f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f7658f);
            this.f7653a = contextThemeWrapper;
            this.f7654b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f7653a != null) {
            this.f7653a = context;
            if (this.f7654b == null) {
                this.f7654b = LayoutInflater.from(context);
            }
        }
        this.f7655c = c2280e;
        a aVar = this.f7661t;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: j */
    public void mo9456j(Parcelable parcelable) {
        m9473k((Bundle) parcelable);
    }

    /* JADX INFO: renamed from: k */
    public void m9473k(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f7656d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: l */
    public boolean mo9439l(SubMenuC2288m subMenuC2288m) {
        if (!subMenuC2288m.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC2281f(subMenuC2288m).m9543b(null);
        InterfaceC2285j.a aVar = this.f7660s;
        if (aVar == null) {
            return true;
        }
        aVar.mo9250d(subMenuC2288m);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: m */
    public Parcelable mo9458m() {
        if (this.f7656d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m9474n(bundle);
        return bundle;
    }

    /* JADX INFO: renamed from: n */
    public void m9474n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f7656d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        this.f7655c.m9505P(this.f7661t.getItem(i7), this, 0);
    }

    public C2278c(int i7, int i8) {
        this.f7659r = i7;
        this.f7658f = i8;
    }
}
