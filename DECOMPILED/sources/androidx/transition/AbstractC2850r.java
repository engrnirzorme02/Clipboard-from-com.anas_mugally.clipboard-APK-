package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.C2390a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.transition.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2850r {

    /* JADX INFO: renamed from: a */
    private static AbstractC2843k f11552a = new C2833a();

    /* JADX INFO: renamed from: b */
    private static ThreadLocal f11553b = new ThreadLocal();

    /* JADX INFO: renamed from: c */
    static ArrayList f11554c = new ArrayList();

    /* JADX INFO: renamed from: androidx.transition.r$a */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        AbstractC2843k f11555a;

        /* JADX INFO: renamed from: b */
        ViewGroup f11556b;

        /* JADX INFO: renamed from: androidx.transition.r$a$a, reason: collision with other inner class name */
        class C7675a extends AbstractC2849q {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C2390a f11557a;

            C7675a(C2390a c2390a) {
                this.f11557a = c2390a;
            }

            @Override // androidx.transition.AbstractC2843k.f
            /* JADX INFO: renamed from: d */
            public void mo14098d(AbstractC2843k abstractC2843k) {
                ((ArrayList) this.f11557a.get(a.this.f11556b)).remove(abstractC2843k);
                abstractC2843k.mo14152T(this);
            }
        }

        a(AbstractC2843k abstractC2843k, ViewGroup viewGroup) {
            this.f11555a = abstractC2843k;
            this.f11556b = viewGroup;
        }

        /* JADX INFO: renamed from: a */
        private void m14190a() {
            this.f11556b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f11556b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m14190a();
            if (!AbstractC2850r.f11554c.remove(this.f11556b)) {
                return true;
            }
            C2390a c2390aM14187b = AbstractC2850r.m14187b();
            ArrayList arrayList = (ArrayList) c2390aM14187b.get(this.f11556b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c2390aM14187b.put(this.f11556b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f11555a);
            this.f11555a.mo14158a(new C7675a(c2390aM14187b));
            this.f11555a.m14168j(this.f11556b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC2843k) it.next()).mo14154V(this.f11556b);
                }
            }
            this.f11555a.m14151S(this.f11556b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m14190a();
            AbstractC2850r.f11554c.remove(this.f11556b);
            ArrayList arrayList = (ArrayList) AbstractC2850r.m14187b().get(this.f11556b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC2843k) it.next()).mo14154V(this.f11556b);
                }
            }
            this.f11555a.m14169k(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14186a(ViewGroup viewGroup, AbstractC2843k abstractC2843k) {
        if (f11554c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f11554c.add(viewGroup);
        if (abstractC2843k == null) {
            abstractC2843k = f11552a;
        }
        AbstractC2843k abstractC2843kClone = abstractC2843k.clone();
        m14189d(viewGroup, abstractC2843kClone);
        AbstractC2842j.m14129b(viewGroup, null);
        m14188c(viewGroup, abstractC2843kClone);
    }

    /* JADX INFO: renamed from: b */
    static C2390a m14187b() {
        C2390a c2390a;
        WeakReference weakReference = (WeakReference) f11553b.get();
        if (weakReference != null && (c2390a = (C2390a) weakReference.get()) != null) {
            return c2390a;
        }
        C2390a c2390a2 = new C2390a();
        f11553b.set(new WeakReference(c2390a2));
        return c2390a2;
    }

    /* JADX INFO: renamed from: c */
    private static void m14188c(ViewGroup viewGroup, AbstractC2843k abstractC2843k) {
        if (abstractC2843k == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC2843k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* JADX INFO: renamed from: d */
    private static void m14189d(ViewGroup viewGroup, AbstractC2843k abstractC2843k) {
        ArrayList arrayList = (ArrayList) m14187b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC2843k) it.next()).mo14150R(viewGroup);
            }
        }
        if (abstractC2843k != null) {
            abstractC2843k.m14168j(viewGroup, true);
        }
        AbstractC2842j.m14128a(viewGroup);
    }
}
