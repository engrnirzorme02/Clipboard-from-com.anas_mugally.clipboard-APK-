package com.heinrichreimersoftware.materialintro.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.AbstractC2869a;
import androidx.viewpager.widget.AbstractC2870b;
import p039E5.AbstractC0391a;

/* JADX INFO: loaded from: classes.dex */
public class FadeableViewPager extends AbstractC0391a {

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.FadeableViewPager$b */
    public interface InterfaceC5141b extends AbstractC2870b.j {
    }

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.FadeableViewPager$c */
    private class C5142c implements AbstractC2870b.j {

        /* JADX INFO: renamed from: a */
        private final AbstractC2870b.j f19658a;

        @Override // androidx.viewpager.widget.AbstractC2870b.j
        /* JADX INFO: renamed from: a */
        public void mo365a(int i7, float f7, int i8) {
            int iMo684c = (this.f19658a instanceof InterfaceC5141b ? FadeableViewPager.super.getAdapter() : FadeableViewPager.this.getAdapter()).mo684c();
            AbstractC2870b.j jVar = this.f19658a;
            int iMin = Math.min(i7, iMo684c - 1);
            if (i7 >= iMo684c) {
                f7 = 0.0f;
            }
            if (i7 >= iMo684c) {
                i8 = 0;
            }
            jVar.mo365a(iMin, f7, i8);
        }

        @Override // androidx.viewpager.widget.AbstractC2870b.j
        /* JADX INFO: renamed from: b */
        public void mo14381b(int i7) {
            this.f19658a.mo14381b(i7);
        }

        @Override // androidx.viewpager.widget.AbstractC2870b.j
        /* JADX INFO: renamed from: c */
        public void mo366c(int i7) {
            this.f19658a.mo366c(Math.min(i7, (this.f19658a instanceof InterfaceC5141b ? FadeableViewPager.super.getAdapter() : FadeableViewPager.this.getAdapter()).mo684c() - 1));
        }

        private C5142c(AbstractC2870b.j jVar) {
            this.f19658a = jVar;
        }
    }

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.FadeableViewPager$d */
    private class C5143d extends AbstractC2869a {

        /* JADX INFO: renamed from: c */
        private final AbstractC2869a f19660c;

        /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.FadeableViewPager$d$a */
        class a extends DataSetObserver {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ FadeableViewPager f19662a;

            a(FadeableViewPager fadeableViewPager) {
                this.f19662a = fadeableViewPager;
            }

            @Override // android.database.DataSetObserver
            public void onChanged() {
                C5143d.this.m14323i();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                C5143d.this.m14323i();
            }
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: a */
        public void mo683a(ViewGroup viewGroup, int i7, Object obj) {
            if (i7 < this.f19660c.mo684c()) {
                this.f19660c.mo683a(viewGroup, i7, obj);
            }
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: b */
        public void mo14319b(ViewGroup viewGroup) {
            this.f19660c.mo14319b(viewGroup);
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: c */
        public int mo684c() {
            return this.f19660c.mo684c() + 1;
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: d */
        public int mo685d(Object obj) {
            int iMo685d = this.f19660c.mo685d(obj);
            if (iMo685d < this.f19660c.mo684c()) {
                return iMo685d;
            }
            return -2;
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: e */
        public CharSequence mo14320e(int i7) {
            if (i7 < this.f19660c.mo684c()) {
                return this.f19660c.mo14320e(i7);
            }
            return null;
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: f */
        public float mo14321f(int i7) {
            if (i7 < this.f19660c.mo684c()) {
                return this.f19660c.mo14321f(i7);
            }
            return 1.0f;
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: g */
        public Object mo686g(ViewGroup viewGroup, int i7) {
            if (i7 < this.f19660c.mo684c()) {
                return this.f19660c.mo686g(viewGroup, i7);
            }
            return null;
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: h */
        public boolean mo14322h(View view, Object obj) {
            return obj != null && this.f19660c.mo14322h(view, obj);
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: j */
        public void mo14324j(DataSetObserver dataSetObserver) {
            this.f19660c.mo14324j(dataSetObserver);
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: k */
        public void mo14325k(Parcelable parcelable, ClassLoader classLoader) {
            this.f19660c.mo14325k(parcelable, classLoader);
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: l */
        public Parcelable mo14326l() {
            return this.f19660c.mo14326l();
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: m */
        public void mo14327m(ViewGroup viewGroup, int i7, Object obj) {
            if (i7 < this.f19660c.mo684c()) {
                this.f19660c.mo14327m(viewGroup, i7, obj);
            }
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: o */
        public void mo14329o(ViewGroup viewGroup) {
            this.f19660c.mo14329o(viewGroup);
        }

        @Override // androidx.viewpager.widget.AbstractC2869a
        /* JADX INFO: renamed from: p */
        public void mo14330p(DataSetObserver dataSetObserver) {
            this.f19660c.mo14330p(dataSetObserver);
        }

        /* JADX INFO: renamed from: q */
        public AbstractC2869a m23872q() {
            return this.f19660c;
        }

        private C5143d(AbstractC2869a abstractC2869a) {
            this.f19660c = abstractC2869a;
            abstractC2869a.mo14324j(new a(FadeableViewPager.this));
        }
    }

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.FadeableViewPager$e */
    public static class C5144e implements InterfaceC5141b {
        @Override // androidx.viewpager.widget.AbstractC2870b.j
        /* JADX INFO: renamed from: b */
        public void mo14381b(int i7) {
        }
    }

    public FadeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.AbstractC2870b
    /* JADX INFO: renamed from: M */
    public void mo14357M(AbstractC2870b.j jVar) {
        super.mo14357M(new C5142c(jVar));
    }

    @Override // androidx.viewpager.widget.AbstractC2870b
    /* JADX INFO: renamed from: c */
    public void mo14364c(AbstractC2870b.j jVar) {
        super.mo14364c(new C5142c(jVar));
    }

    @Override // androidx.viewpager.widget.AbstractC2870b
    public AbstractC2869a getAdapter() {
        C5143d c5143d = (C5143d) super.getAdapter();
        if (c5143d == null) {
            return null;
        }
        return c5143d.m23872q();
    }

    @Override // androidx.viewpager.widget.AbstractC2870b
    public void setAdapter(AbstractC2869a abstractC2869a) {
        super.setAdapter(new C5143d(abstractC2869a));
    }

    @Override // androidx.viewpager.widget.AbstractC2870b
    @Deprecated
    public void setOnPageChangeListener(AbstractC2870b.j jVar) {
        super.setOnPageChangeListener(new C5142c(jVar));
    }
}
