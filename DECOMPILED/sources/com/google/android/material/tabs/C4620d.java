package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.material.tabs.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C4620d {

    /* JADX INFO: renamed from: a */
    private final TabLayout f17894a;

    /* JADX INFO: renamed from: b */
    private final ViewPager2 f17895b;

    /* JADX INFO: renamed from: c */
    private final boolean f17896c;

    /* JADX INFO: renamed from: d */
    private final boolean f17897d;

    /* JADX INFO: renamed from: e */
    private final b f17898e;

    /* JADX INFO: renamed from: f */
    private RecyclerView.AbstractC2757h f17899f;

    /* JADX INFO: renamed from: g */
    private boolean f17900g;

    /* JADX INFO: renamed from: h */
    private c f17901h;

    /* JADX INFO: renamed from: i */
    private TabLayout.InterfaceC4610d f17902i;

    /* JADX INFO: renamed from: j */
    private RecyclerView.AbstractC2759j f17903j;

    /* JADX INFO: renamed from: com.google.android.material.tabs.d$a */
    private class a extends RecyclerView.AbstractC2759j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2759j
        /* JADX INFO: renamed from: a */
        public void mo3689a() {
            C4620d.this.m21411b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2759j
        /* JADX INFO: renamed from: b */
        public void mo3690b(int i7, int i8, Object obj) {
            C4620d.this.m21411b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2759j
        /* JADX INFO: renamed from: c */
        public void mo3691c(int i7, int i8, int i9) {
            C4620d.this.m21411b();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo21412a(TabLayout.C4613g c4613g, int i7);
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.d$c */
    private static class c extends ViewPager2.AbstractC2879i {

        /* JADX INFO: renamed from: a */
        private final WeakReference f17905a;

        /* JADX INFO: renamed from: b */
        private int f17906b;

        /* JADX INFO: renamed from: c */
        private int f17907c;

        c(TabLayout tabLayout) {
            this.f17905a = new WeakReference(tabLayout);
            m21413d();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2879i
        /* JADX INFO: renamed from: a */
        public void mo3696a(int i7) {
            this.f17906b = this.f17907c;
            this.f17907c = i7;
            TabLayout tabLayout = (TabLayout) this.f17905a.get();
            if (tabLayout != null) {
                tabLayout.m21346T(this.f17907c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2879i
        /* JADX INFO: renamed from: b */
        public void mo14420b(int i7, float f7, int i8) {
            TabLayout tabLayout = (TabLayout) this.f17905a.get();
            if (tabLayout != null) {
                int i9 = this.f17907c;
                boolean z7 = true;
                if (i9 == 2 && this.f17906b != 1) {
                    z7 = false;
                }
                if (i9 == 2 && this.f17906b == 0) {
                    z7 = false;
                }
                tabLayout.m21343N(i7, f7, z7, z7, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2879i
        /* JADX INFO: renamed from: c */
        public void mo3697c(int i7) {
            TabLayout tabLayout = (TabLayout) this.f17905a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i7 || i7 >= tabLayout.getTabCount()) {
                return;
            }
            int i8 = this.f17907c;
            tabLayout.m21339J(tabLayout.m21352z(i7), i8 == 0 || (i8 == 2 && this.f17906b == 0));
        }

        /* JADX INFO: renamed from: d */
        void m21413d() {
            this.f17907c = 0;
            this.f17906b = 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.d$d */
    private static class d implements TabLayout.InterfaceC4610d {

        /* JADX INFO: renamed from: a */
        private final ViewPager2 f17908a;

        /* JADX INFO: renamed from: b */
        private final boolean f17909b;

        d(ViewPager2 viewPager2, boolean z7) {
            this.f17908a = viewPager2;
            this.f17909b = z7;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC4609c
        /* JADX INFO: renamed from: a */
        public void mo21354a(TabLayout.C4613g c4613g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC4609c
        /* JADX INFO: renamed from: b */
        public void mo21355b(TabLayout.C4613g c4613g) {
            this.f17908a.m14397j(c4613g.m21374g(), this.f17909b);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC4609c
        /* JADX INFO: renamed from: c */
        public void mo21356c(TabLayout.C4613g c4613g) {
        }
    }

    public C4620d(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    /* JADX INFO: renamed from: a */
    public void m21410a() {
        if (this.f17900g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.AbstractC2757h adapter = this.f17895b.getAdapter();
        this.f17899f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f17900g = true;
        c cVar = new c(this.f17894a);
        this.f17901h = cVar;
        this.f17895b.m14395g(cVar);
        d dVar = new d(this.f17895b, this.f17897d);
        this.f17902i = dVar;
        this.f17894a.m21348h(dVar);
        if (this.f17896c) {
            a aVar = new a();
            this.f17903j = aVar;
            this.f17899f.m13328y(aVar);
        }
        m21411b();
        this.f17894a.m21341L(this.f17895b.getCurrentItem(), 0.0f, true);
    }

    /* JADX INFO: renamed from: b */
    void m21411b() {
        this.f17894a.m21336F();
        RecyclerView.AbstractC2757h abstractC2757h = this.f17899f;
        if (abstractC2757h != null) {
            int iMo8548g = abstractC2757h.mo8548g();
            for (int i7 = 0; i7 < iMo8548g; i7++) {
                TabLayout.C4613g c4613gM21333C = this.f17894a.m21333C();
                this.f17898e.mo21412a(c4613gM21333C, i7);
                this.f17894a.m21350j(c4613gM21333C, false);
            }
            if (iMo8548g > 0) {
                int iMin = Math.min(this.f17895b.getCurrentItem(), this.f17894a.getTabCount() - 1);
                if (iMin != this.f17894a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f17894a;
                    tabLayout.m21338I(tabLayout.m21352z(iMin));
                }
            }
        }
    }

    public C4620d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z7, b bVar) {
        this(tabLayout, viewPager2, z7, true, bVar);
    }

    public C4620d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z7, boolean z8, b bVar) {
        this.f17894a = tabLayout;
        this.f17895b = viewPager2;
        this.f17896c = z7;
        this.f17897d = z8;
        this.f17898e = bVar;
    }
}
