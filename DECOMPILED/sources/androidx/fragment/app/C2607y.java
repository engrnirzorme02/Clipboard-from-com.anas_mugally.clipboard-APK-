package androidx.fragment.app;

import android.view.View;
import androidx.collection.C2390a;
import androidx.transition.C2837e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.fragment.app.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2607y {

    /* JADX INFO: renamed from: a */
    public static final C2607y f10368a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC2574A f10369b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC2574A f10370c;

    static {
        C2607y c2607y = new C2607y();
        f10368a = c2607y;
        f10369b = new C2608z();
        f10370c = c2607y.m12515b();
    }

    private C2607y() {
    }

    /* JADX INFO: renamed from: a */
    public static final void m12514a(AbstractComponentCallbacksC2591i inFragment, AbstractComponentCallbacksC2591i outFragment, boolean z7, C2390a sharedElements, boolean z8) {
        AbstractC6118n.m27187e(inFragment, "inFragment");
        AbstractC6118n.m27187e(outFragment, "outFragment");
        AbstractC6118n.m27187e(sharedElements, "sharedElements");
        if (z7) {
            outFragment.m12212y();
        } else {
            inFragment.m12212y();
        }
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC2574A m12515b() {
        try {
            AbstractC6118n.m27185c(C2837e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (AbstractC2574A) C2837e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m12516c(C2390a c2390a, C2390a namedViews) {
        AbstractC6118n.m27187e(c2390a, "<this>");
        AbstractC6118n.m27187e(namedViews, "namedViews");
        int size = c2390a.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey((String) c2390a.m10301k(size))) {
                c2390a.mo8381h(size);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m12517d(List views, int i7) {
        AbstractC6118n.m27187e(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i7);
        }
    }
}
