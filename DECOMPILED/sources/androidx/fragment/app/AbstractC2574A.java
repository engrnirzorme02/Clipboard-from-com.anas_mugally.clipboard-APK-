package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p081K.C0713e;
import p111O.AbstractC1030Z;
import p111O.ViewTreeObserverOnPreDrawListenerC0999J;

/* JADX INFO: renamed from: androidx.fragment.app.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2574A {

    /* JADX INFO: renamed from: androidx.fragment.app.A$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f9999a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ArrayList f10000b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ArrayList f10001c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ArrayList f10002d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ArrayList f10003e;

        a(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f9999a = i7;
            this.f10000b = arrayList;
            this.f10001c = arrayList2;
            this.f10002d = arrayList3;
            this.f10003e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i7 = 0; i7 < this.f9999a; i7++) {
                AbstractC1030Z.m4504y0((View) this.f10000b.get(i7), (String) this.f10001c.get(i7));
                AbstractC1030Z.m4504y0((View) this.f10002d.get(i7), (String) this.f10003e.get(i7));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    protected static void m11934d(List list, View view) {
        int size = list.size();
        if (m11935g(list, view, size)) {
            return;
        }
        if (AbstractC1030Z.m4435G(view) != null) {
            list.add(view);
        }
        for (int i7 = size; i7 < list.size(); i7++) {
            View view2 = (View) list.get(i7);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    if (!m11935g(list, childAt, size) && AbstractC1030Z.m4435G(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m11935g(List list, View view, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (list.get(i8) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    protected static boolean m11936i(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo11937a(Object obj, View view);

    /* JADX INFO: renamed from: b */
    public abstract void mo11938b(Object obj, ArrayList arrayList);

    /* JADX INFO: renamed from: c */
    public abstract void mo11939c(ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo11940e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract Object mo11941f(Object obj);

    /* JADX INFO: renamed from: h */
    protected void m11942h(View view, Rect rect) {
        if (AbstractC1030Z.m4443O(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract Object mo11943j(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: k */
    public abstract Object mo11944k(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: l */
    ArrayList m11945l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            arrayList2.add(AbstractC1030Z.m4435G(view));
            AbstractC1030Z.m4504y0(view, null);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo11946m(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: n */
    public abstract void mo11947n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    /* JADX INFO: renamed from: o */
    public abstract void mo11948o(Object obj, Rect rect);

    /* JADX INFO: renamed from: p */
    public abstract void mo11949p(Object obj, View view);

    /* JADX INFO: renamed from: q */
    public abstract void mo11950q(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Object obj, C0713e c0713e, Runnable runnable);

    /* JADX INFO: renamed from: r */
    void m11951r(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) arrayList.get(i7);
            String strM4435G = AbstractC1030Z.m4435G(view2);
            arrayList4.add(strM4435G);
            if (strM4435G != null) {
                AbstractC1030Z.m4504y0(view2, null);
                String str = (String) map.get(strM4435G);
                for (int i8 = 0; i8 < size; i8++) {
                    if (str.equals(arrayList3.get(i8))) {
                        AbstractC1030Z.m4504y0((View) arrayList2.get(i8), strM4435G);
                        break;
                    }
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0999J.m4375a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo11952s(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: t */
    public abstract void mo11953t(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* JADX INFO: renamed from: u */
    public abstract Object mo11954u(Object obj);
}
