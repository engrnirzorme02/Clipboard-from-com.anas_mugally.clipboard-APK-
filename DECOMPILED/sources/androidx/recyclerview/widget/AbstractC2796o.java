package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.o */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2796o {
    /* JADX INFO: renamed from: a */
    static int m13875a(RecyclerView.C2746B c2746b, AbstractC2793l abstractC2793l, View view, View view2, RecyclerView.AbstractC2765p abstractC2765p, boolean z7) {
        if (abstractC2765p.m13407P() == 0 || c2746b.m13239b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            return Math.abs(abstractC2765p.m13445m0(view) - abstractC2765p.m13445m0(view2)) + 1;
        }
        return Math.min(abstractC2793l.mo13854n(), abstractC2793l.mo13844d(view2) - abstractC2793l.mo13847g(view));
    }

    /* JADX INFO: renamed from: b */
    static int m13876b(RecyclerView.C2746B c2746b, AbstractC2793l abstractC2793l, View view, View view2, RecyclerView.AbstractC2765p abstractC2765p, boolean z7, boolean z8) {
        if (abstractC2765p.m13407P() == 0 || c2746b.m13239b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z8 ? Math.max(0, (c2746b.m13239b() - Math.max(abstractC2765p.m13445m0(view), abstractC2765p.m13445m0(view2))) - 1) : Math.max(0, Math.min(abstractC2765p.m13445m0(view), abstractC2765p.m13445m0(view2)));
        if (z7) {
            return Math.round((iMax * (Math.abs(abstractC2793l.mo13844d(view2) - abstractC2793l.mo13847g(view)) / (Math.abs(abstractC2765p.m13445m0(view) - abstractC2765p.m13445m0(view2)) + 1))) + (abstractC2793l.mo13853m() - abstractC2793l.mo13847g(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: c */
    static int m13877c(RecyclerView.C2746B c2746b, AbstractC2793l abstractC2793l, View view, View view2, RecyclerView.AbstractC2765p abstractC2765p, boolean z7) {
        if (abstractC2765p.m13407P() == 0 || c2746b.m13239b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            return c2746b.m13239b();
        }
        return (int) (((abstractC2793l.mo13844d(view2) - abstractC2793l.mo13847g(view)) / (Math.abs(abstractC2765p.m13445m0(view) - abstractC2765p.m13445m0(view2)) + 1)) * c2746b.m13239b());
    }
}
