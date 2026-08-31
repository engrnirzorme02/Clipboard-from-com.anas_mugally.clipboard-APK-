package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C2280e;
import androidx.appcompat.view.menu.C2282g;
import androidx.appcompat.view.menu.InterfaceC2285j;
import androidx.appcompat.view.menu.InterfaceC2286k;
import androidx.appcompat.view.menu.SubMenuC2288m;
import androidx.core.widget.AbstractC2458i;
import androidx.recyclerview.widget.C2795n;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p111O.AbstractC1030Z;
import p111O.C0982A0;
import p111O.C1032a;
import p118P.C1170s;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6748i;

/* JADX INFO: renamed from: com.google.android.material.internal.k */
/* JADX INFO: loaded from: classes2.dex */
public class C4535k implements InterfaceC2285j {

    /* JADX INFO: renamed from: A */
    int f17302A;

    /* JADX INFO: renamed from: B */
    int f17303B;

    /* JADX INFO: renamed from: C */
    int f17304C;

    /* JADX INFO: renamed from: D */
    int f17305D;

    /* JADX INFO: renamed from: E */
    int f17306E;

    /* JADX INFO: renamed from: F */
    int f17307F;

    /* JADX INFO: renamed from: G */
    int f17308G;

    /* JADX INFO: renamed from: H */
    int f17309H;

    /* JADX INFO: renamed from: I */
    boolean f17310I;

    /* JADX INFO: renamed from: K */
    private int f17312K;

    /* JADX INFO: renamed from: L */
    private int f17313L;

    /* JADX INFO: renamed from: M */
    int f17314M;

    /* JADX INFO: renamed from: a */
    private NavigationMenuView f17317a;

    /* JADX INFO: renamed from: b */
    LinearLayout f17318b;

    /* JADX INFO: renamed from: c */
    private InterfaceC2285j.a f17319c;

    /* JADX INFO: renamed from: d */
    C2280e f17320d;

    /* JADX INFO: renamed from: e */
    private int f17321e;

    /* JADX INFO: renamed from: f */
    c f17322f;

    /* JADX INFO: renamed from: r */
    LayoutInflater f17323r;

    /* JADX INFO: renamed from: t */
    ColorStateList f17325t;

    /* JADX INFO: renamed from: w */
    ColorStateList f17328w;

    /* JADX INFO: renamed from: x */
    ColorStateList f17329x;

    /* JADX INFO: renamed from: y */
    Drawable f17330y;

    /* JADX INFO: renamed from: z */
    RippleDrawable f17331z;

    /* JADX INFO: renamed from: s */
    int f17324s = 0;

    /* JADX INFO: renamed from: u */
    int f17326u = 0;

    /* JADX INFO: renamed from: v */
    boolean f17327v = true;

    /* JADX INFO: renamed from: J */
    boolean f17311J = true;

    /* JADX INFO: renamed from: N */
    private int f17315N = -1;

    /* JADX INFO: renamed from: O */
    final View.OnClickListener f17316O = new a();

    /* JADX INFO: renamed from: com.google.android.material.internal.k$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z7 = true;
            C4535k.this.m20741Z(true);
            C2282g itemData = ((NavigationMenuItemView) view).getItemData();
            C4535k c4535k = C4535k.this;
            boolean zM9505P = c4535k.f17320d.m9505P(itemData, c4535k, 0);
            if (itemData != null && itemData.isCheckable() && zM9505P) {
                C4535k.this.f17322f.m20775Q(itemData);
            } else {
                z7 = false;
            }
            C4535k.this.m20741Z(false);
            if (z7) {
                C4535k.this.mo9433d(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.k$b */
    private static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.k$c */
    private class c extends RecyclerView.AbstractC2757h {

        /* JADX INFO: renamed from: d */
        private final ArrayList f17333d = new ArrayList();

        /* JADX INFO: renamed from: e */
        private C2282g f17334e;

        /* JADX INFO: renamed from: f */
        private boolean f17335f;

        /* JADX INFO: renamed from: com.google.android.material.internal.k$c$a */
        class a extends C1032a {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ int f17337d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ boolean f17338e;

            a(int i7, boolean z7) {
                this.f17337d = i7;
                this.f17338e = z7;
            }

            @Override // p111O.C1032a
            /* JADX INFO: renamed from: g */
            public void mo4585g(View view, C1170s c1170s) {
                super.mo4585g(view, c1170s);
                c1170s.m5074p0(C1170s.g.m5112a(c.this.m20761F(this.f17337d), 1, 1, 1, this.f17338e, view.isSelected()));
            }
        }

        c() {
            m20763N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: F */
        public int m20761F(int i7) {
            int i8 = i7;
            for (int i9 = 0; i9 < i7; i9++) {
                if (C4535k.this.f17322f.mo8549i(i9) == 2 || C4535k.this.f17322f.mo8549i(i9) == 3) {
                    i8--;
                }
            }
            return i8;
        }

        /* JADX INFO: renamed from: G */
        private void m20762G(int i7, int i8) {
            while (i7 < i8) {
                ((g) this.f17333d.get(i7)).f17343b = true;
                i7++;
            }
        }

        /* JADX INFO: renamed from: N */
        private void m20763N() {
            if (this.f17335f) {
                return;
            }
            this.f17335f = true;
            this.f17333d.clear();
            this.f17333d.add(new d());
            int size = C4535k.this.f17320d.m9496G().size();
            int i7 = -1;
            boolean z7 = false;
            int size2 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                C2282g c2282g = (C2282g) C4535k.this.f17320d.m9496G().get(i8);
                if (c2282g.isChecked()) {
                    m20775Q(c2282g);
                }
                if (c2282g.isCheckable()) {
                    c2282g.m9563t(false);
                }
                if (c2282g.hasSubMenu()) {
                    SubMenu subMenu = c2282g.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i8 != 0) {
                            this.f17333d.add(new f(C4535k.this.f17314M, 0));
                        }
                        this.f17333d.add(new g(c2282g));
                        int size3 = this.f17333d.size();
                        int size4 = subMenu.size();
                        boolean z8 = false;
                        for (int i9 = 0; i9 < size4; i9++) {
                            C2282g c2282g2 = (C2282g) subMenu.getItem(i9);
                            if (c2282g2.isVisible()) {
                                if (!z8 && c2282g2.getIcon() != null) {
                                    z8 = true;
                                }
                                if (c2282g2.isCheckable()) {
                                    c2282g2.m9563t(false);
                                }
                                if (c2282g2.isChecked()) {
                                    m20775Q(c2282g2);
                                }
                                this.f17333d.add(new g(c2282g2));
                            }
                        }
                        if (z8) {
                            m20762G(size3, this.f17333d.size());
                        }
                    }
                } else {
                    int groupId = c2282g.getGroupId();
                    if (groupId != i7) {
                        size2 = this.f17333d.size();
                        z7 = c2282g.getIcon() != null;
                        if (i8 != 0) {
                            size2++;
                            ArrayList arrayList = this.f17333d;
                            int i10 = C4535k.this.f17314M;
                            arrayList.add(new f(i10, i10));
                        }
                    } else if (!z7 && c2282g.getIcon() != null) {
                        m20762G(size2, this.f17333d.size());
                        z7 = true;
                    }
                    g gVar = new g(c2282g);
                    gVar.f17343b = z7;
                    this.f17333d.add(gVar);
                    i7 = groupId;
                }
            }
            this.f17335f = false;
        }

        /* JADX INFO: renamed from: P */
        private void m20764P(View view, int i7, boolean z7) {
            AbstractC1030Z.m4474j0(view, new a(i7, z7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: T */
        public void m20765T() {
            for (int i7 = 0; i7 < this.f17333d.size(); i7++) {
                if (this.f17333d.get(i7) instanceof f) {
                    m13323m(i7);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: U */
        public void m20766U() {
            for (int i7 = 0; i7 < this.f17333d.size(); i7++) {
                if ((this.f17333d.get(i7) instanceof g) && mo8549i(i7) == 1) {
                    m13323m(i7);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: V */
        public void m20767V() {
            for (int i7 = 0; i7 < this.f17333d.size(); i7++) {
                if ((this.f17333d.get(i7) instanceof g) && mo8549i(i7) == 0) {
                    m13323m(i7);
                }
            }
        }

        /* JADX INFO: renamed from: H */
        public Bundle m20768H() {
            Bundle bundle = new Bundle();
            C2282g c2282g = this.f17334e;
            if (c2282g != null) {
                bundle.putInt("android:menu:checked", c2282g.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f17333d.size();
            for (int i7 = 0; i7 < size; i7++) {
                e eVar = (e) this.f17333d.get(i7);
                if (eVar instanceof g) {
                    C2282g c2282gM20780a = ((g) eVar).m20780a();
                    View actionView = c2282gM20780a != null ? c2282gM20780a.getActionView() : null;
                    if (actionView != null) {
                        C4537m c4537m = new C4537m();
                        actionView.saveHierarchyState(c4537m);
                        sparseArray.put(c2282gM20780a.getItemId(), c4537m);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* JADX INFO: renamed from: I */
        public C2282g m20769I() {
            return this.f17334e;
        }

        /* JADX INFO: renamed from: J */
        int m20770J() {
            int i7 = 0;
            for (int i8 = 0; i8 < C4535k.this.f17322f.mo8548g(); i8++) {
                int iMo8549i = C4535k.this.f17322f.mo8549i(i8);
                if (iMo8549i == 0 || iMo8549i == 1) {
                    i7++;
                }
            }
            return i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void mo3682q(l lVar, int i7) {
            int iMo8549i = mo8549i(i7);
            if (iMo8549i != 0) {
                if (iMo8549i != 1) {
                    if (iMo8549i != 2) {
                        return;
                    }
                    f fVar = (f) this.f17333d.get(i7);
                    lVar.f10894a.setPaddingRelative(C4535k.this.f17306E, fVar.m20779b(), C4535k.this.f17307F, fVar.m20778a());
                    return;
                }
                TextView textView = (TextView) lVar.f10894a;
                textView.setText(((g) this.f17333d.get(i7)).m20780a().getTitle());
                AbstractC2458i.m10762m(textView, C4535k.this.f17324s);
                textView.setPaddingRelative(C4535k.this.f17308G, textView.getPaddingTop(), C4535k.this.f17309H, textView.getPaddingBottom());
                ColorStateList colorStateList = C4535k.this.f17325t;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                m20764P(textView, i7, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f10894a;
            navigationMenuItemView.setIconTintList(C4535k.this.f17329x);
            navigationMenuItemView.setTextAppearance(C4535k.this.f17326u);
            ColorStateList colorStateList2 = C4535k.this.f17328w;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = C4535k.this.f17330y;
            navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = C4535k.this.f17331z;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.f17333d.get(i7);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f17343b);
            C4535k c4535k = C4535k.this;
            int i8 = c4535k.f17302A;
            int i9 = c4535k.f17303B;
            navigationMenuItemView.setPadding(i8, i9, i8, i9);
            navigationMenuItemView.setIconPadding(C4535k.this.f17304C);
            C4535k c4535k2 = C4535k.this;
            if (c4535k2.f17310I) {
                navigationMenuItemView.setIconSize(c4535k2.f17305D);
            }
            navigationMenuItemView.setMaxLines(C4535k.this.f17312K);
            navigationMenuItemView.m20600D(gVar.m20780a(), C4535k.this.f17327v);
            m20764P(navigationMenuItemView, i7, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public l mo3683s(ViewGroup viewGroup, int i7) {
            if (i7 == 0) {
                C4535k c4535k = C4535k.this;
                return new i(c4535k.f17323r, viewGroup, c4535k.f17316O);
            }
            if (i7 == 1) {
                return new k(C4535k.this.f17323r, viewGroup);
            }
            if (i7 == 2) {
                return new j(C4535k.this.f17323r, viewGroup);
            }
            if (i7 != 3) {
                return null;
            }
            return new b(C4535k.this.f17318b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public void mo3687x(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.f10894a).m20601E();
            }
        }

        /* JADX INFO: renamed from: O */
        public void m20774O(Bundle bundle) {
            C2282g c2282gM20780a;
            View actionView;
            C4537m c4537m;
            C2282g c2282gM20780a2;
            int i7 = bundle.getInt("android:menu:checked", 0);
            if (i7 != 0) {
                this.f17335f = true;
                int size = this.f17333d.size();
                for (int i8 = 0; i8 < size; i8++) {
                    e eVar = (e) this.f17333d.get(i8);
                    if ((eVar instanceof g) && (c2282gM20780a2 = ((g) eVar).m20780a()) != null && c2282gM20780a2.getItemId() == i7) {
                        m20775Q(c2282gM20780a2);
                        break;
                    }
                }
                this.f17335f = false;
                m20763N();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f17333d.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    e eVar2 = (e) this.f17333d.get(i9);
                    if ((eVar2 instanceof g) && (c2282gM20780a = ((g) eVar2).m20780a()) != null && (actionView = c2282gM20780a.getActionView()) != null && (c4537m = (C4537m) sparseParcelableArray.get(c2282gM20780a.getItemId())) != null) {
                        actionView.restoreHierarchyState(c4537m);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: Q */
        public void m20775Q(C2282g c2282g) {
            if (this.f17334e == c2282g || !c2282g.isCheckable()) {
                return;
            }
            C2282g c2282g2 = this.f17334e;
            if (c2282g2 != null) {
                c2282g2.setChecked(false);
            }
            this.f17334e = c2282g;
            c2282g.setChecked(true);
        }

        /* JADX INFO: renamed from: R */
        public void m20776R(boolean z7) {
            this.f17335f = z7;
        }

        /* JADX INFO: renamed from: S */
        public void m20777S() {
            int size = this.f17333d.size();
            m20763N();
            m13322l();
            if (size == this.f17333d.size()) {
                m13325o(0, this.f17333d.size());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: g */
        public int mo8548g() {
            return this.f17333d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: h */
        public long mo3680h(int i7) {
            return i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: i */
        public int mo8549i(int i7) {
            e eVar = (e) this.f17333d.get(i7);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).m20780a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.k$d */
    private static class d implements e {
        d() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.k$e */
    private interface e {
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.k$f */
    private static class f implements e {

        /* JADX INFO: renamed from: a */
        private final int f17340a;

        /* JADX INFO: renamed from: b */
        private final int f17341b;

        public f(int i7, int i8) {
            this.f17340a = i7;
            this.f17341b = i8;
        }

        /* JADX INFO: renamed from: a */
        public int m20778a() {
            return this.f17341b;
        }

        /* JADX INFO: renamed from: b */
        public int m20779b() {
            return this.f17340a;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.k$g */
    private static class g implements e {

        /* JADX INFO: renamed from: a */
        private final C2282g f17342a;

        /* JADX INFO: renamed from: b */
        boolean f17343b;

        g(C2282g c2282g) {
            this.f17342a = c2282g;
        }

        /* JADX INFO: renamed from: a */
        public C2282g m20780a() {
            return this.f17342a;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.k$h */
    private class h extends C2795n {
        h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.C2795n, p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            c1170s.m5072o0(C1170s.f.m5110a(C4535k.this.f17322f.m20770J(), 1, false));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.k$i */
    private static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(AbstractC6748i.f26457f, viewGroup, false));
            this.f10894a.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.k$j */
    private static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(AbstractC6748i.f26459h, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.k$k */
    private static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(AbstractC6748i.f26460i, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.k$l */
    private static abstract class l extends RecyclerView.AbstractC2749E {
        public l(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: C */
    private boolean m20711C() {
        return m20747q() > 0;
    }

    /* JADX INFO: renamed from: a0 */
    private void m20713a0() {
        c cVar = this.f17322f;
        if (cVar != null) {
            cVar.m20765T();
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m20714b0() {
        c cVar = this.f17322f;
        if (cVar != null) {
            cVar.m20766U();
        }
    }

    /* JADX INFO: renamed from: c0 */
    private void m20715c0() {
        c cVar = this.f17322f;
        if (cVar != null) {
            cVar.m20767V();
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m20716d0() {
        int i7 = (m20711C() || !this.f17311J) ? 0 : this.f17313L;
        NavigationMenuView navigationMenuView = this.f17317a;
        navigationMenuView.setPadding(0, i7, 0, navigationMenuView.getPaddingBottom());
    }

    /* JADX INFO: renamed from: A */
    public int m20717A() {
        return this.f17309H;
    }

    /* JADX INFO: renamed from: B */
    public int m20718B() {
        return this.f17308G;
    }

    /* JADX INFO: renamed from: D */
    public View m20719D(int i7) {
        View viewInflate = this.f17323r.inflate(i7, (ViewGroup) this.f17318b, false);
        m20742b(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: E */
    public void m20720E(boolean z7) {
        if (this.f17311J != z7) {
            this.f17311J = z7;
            m20716d0();
        }
    }

    /* JADX INFO: renamed from: F */
    public void m20721F(C2282g c2282g) {
        this.f17322f.m20775Q(c2282g);
    }

    /* JADX INFO: renamed from: G */
    public void m20722G(int i7) {
        this.f17307F = i7;
        m20713a0();
    }

    /* JADX INFO: renamed from: H */
    public void m20723H(int i7) {
        this.f17306E = i7;
        m20713a0();
    }

    /* JADX INFO: renamed from: I */
    public void m20724I(int i7) {
        this.f17321e = i7;
    }

    /* JADX INFO: renamed from: J */
    public void m20725J(Drawable drawable) {
        this.f17330y = drawable;
        m20715c0();
    }

    /* JADX INFO: renamed from: K */
    public void m20726K(RippleDrawable rippleDrawable) {
        this.f17331z = rippleDrawable;
        m20715c0();
    }

    /* JADX INFO: renamed from: L */
    public void m20727L(int i7) {
        this.f17302A = i7;
        m20715c0();
    }

    /* JADX INFO: renamed from: M */
    public void m20728M(int i7) {
        this.f17304C = i7;
        m20715c0();
    }

    /* JADX INFO: renamed from: N */
    public void m20729N(int i7) {
        if (this.f17305D != i7) {
            this.f17305D = i7;
            this.f17310I = true;
            m20715c0();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m20730O(ColorStateList colorStateList) {
        this.f17329x = colorStateList;
        m20715c0();
    }

    /* JADX INFO: renamed from: P */
    public void m20731P(int i7) {
        this.f17312K = i7;
        m20715c0();
    }

    /* JADX INFO: renamed from: Q */
    public void m20732Q(int i7) {
        this.f17326u = i7;
        m20715c0();
    }

    /* JADX INFO: renamed from: R */
    public void m20733R(boolean z7) {
        this.f17327v = z7;
        m20715c0();
    }

    /* JADX INFO: renamed from: S */
    public void m20734S(ColorStateList colorStateList) {
        this.f17328w = colorStateList;
        m20715c0();
    }

    /* JADX INFO: renamed from: T */
    public void m20735T(int i7) {
        this.f17303B = i7;
        m20715c0();
    }

    /* JADX INFO: renamed from: U */
    public void m20736U(int i7) {
        this.f17315N = i7;
        NavigationMenuView navigationMenuView = this.f17317a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i7);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m20737V(ColorStateList colorStateList) {
        this.f17325t = colorStateList;
        m20714b0();
    }

    /* JADX INFO: renamed from: W */
    public void m20738W(int i7) {
        this.f17309H = i7;
        m20714b0();
    }

    /* JADX INFO: renamed from: X */
    public void m20739X(int i7) {
        this.f17308G = i7;
        m20714b0();
    }

    /* JADX INFO: renamed from: Y */
    public void m20740Y(int i7) {
        this.f17324s = i7;
        m20714b0();
    }

    /* JADX INFO: renamed from: Z */
    public void m20741Z(boolean z7) {
        c cVar = this.f17322f;
        if (cVar != null) {
            cVar.m20776R(z7);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m20742b(View view) {
        this.f17318b.addView(view);
        NavigationMenuView navigationMenuView = this.f17317a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: c */
    public void mo9432c(C2280e c2280e, boolean z7) {
        InterfaceC2285j.a aVar = this.f17319c;
        if (aVar != null) {
            aVar.mo9249c(c2280e, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: d */
    public void mo9433d(boolean z7) {
        c cVar = this.f17322f;
        if (cVar != null) {
            cVar.m20777S();
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
        return this.f17321e;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: i */
    public void mo9437i(Context context, C2280e c2280e) {
        this.f17323r = LayoutInflater.from(context);
        this.f17320d = c2280e;
        this.f17314M = context.getResources().getDimensionPixelOffset(AbstractC6744e.f26342f);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: j */
    public void mo9456j(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f17317a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f17322f.m20774O(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f17318b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m20743k(C0982A0 c0982a0) {
        int iM4278l = c0982a0.m4278l();
        if (this.f17313L != iM4278l) {
            this.f17313L = iM4278l;
            m20716d0();
        }
        NavigationMenuView navigationMenuView = this.f17317a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c0982a0.m4275i());
        AbstractC1030Z.m4467g(this.f17318b, c0982a0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: l */
    public boolean mo9439l(SubMenuC2288m subMenuC2288m) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: m */
    public Parcelable mo9458m() {
        Bundle bundle = new Bundle();
        if (this.f17317a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f17317a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f17322f;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.m20768H());
        }
        if (this.f17318b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f17318b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: n */
    public C2282g m20744n() {
        return this.f17322f.m20769I();
    }

    /* JADX INFO: renamed from: o */
    public int m20745o() {
        return this.f17307F;
    }

    /* JADX INFO: renamed from: p */
    public int m20746p() {
        return this.f17306E;
    }

    /* JADX INFO: renamed from: q */
    public int m20747q() {
        return this.f17318b.getChildCount();
    }

    /* JADX INFO: renamed from: r */
    public View m20748r(int i7) {
        return this.f17318b.getChildAt(i7);
    }

    /* JADX INFO: renamed from: s */
    public Drawable m20749s() {
        return this.f17330y;
    }

    /* JADX INFO: renamed from: t */
    public int m20750t() {
        return this.f17302A;
    }

    /* JADX INFO: renamed from: u */
    public int m20751u() {
        return this.f17304C;
    }

    /* JADX INFO: renamed from: v */
    public int m20752v() {
        return this.f17312K;
    }

    /* JADX INFO: renamed from: w */
    public ColorStateList m20753w() {
        return this.f17328w;
    }

    /* JADX INFO: renamed from: x */
    public ColorStateList m20754x() {
        return this.f17329x;
    }

    /* JADX INFO: renamed from: y */
    public int m20755y() {
        return this.f17303B;
    }

    /* JADX INFO: renamed from: z */
    public InterfaceC2286k m20756z(ViewGroup viewGroup) {
        if (this.f17317a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f17323r.inflate(AbstractC6748i.f26461j, viewGroup, false);
            this.f17317a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f17317a));
            if (this.f17322f == null) {
                c cVar = new c();
                this.f17322f = cVar;
                cVar.m13329z(true);
            }
            int i7 = this.f17315N;
            if (i7 != -1) {
                this.f17317a.setOverScrollMode(i7);
            }
            LinearLayout linearLayout = (LinearLayout) this.f17323r.inflate(AbstractC6748i.f26458g, (ViewGroup) this.f17317a, false);
            this.f17318b = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            this.f17317a.setAdapter(this.f17322f);
        }
        return this.f17317a;
    }
}
