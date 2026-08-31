package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.collection.C2390a;
import androidx.collection.C2397h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p111O.AbstractC1030Z;

/* JADX INFO: renamed from: androidx.transition.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2843k implements Cloneable {

    /* JADX INFO: renamed from: T */
    private static final Animator[] f11500T = new Animator[0];

    /* JADX INFO: renamed from: U */
    private static final int[] f11501U = {2, 1, 3, 4};

    /* JADX INFO: renamed from: V */
    private static final AbstractC2839g f11502V = new a();

    /* JADX INFO: renamed from: W */
    private static ThreadLocal f11503W = new ThreadLocal();

    /* JADX INFO: renamed from: E */
    private ArrayList f11508E;

    /* JADX INFO: renamed from: F */
    private ArrayList f11509F;

    /* JADX INFO: renamed from: G */
    private f[] f11510G;

    /* JADX INFO: renamed from: Q */
    private e f11520Q;

    /* JADX INFO: renamed from: R */
    private C2390a f11521R;

    /* JADX INFO: renamed from: a */
    private String f11523a = getClass().getName();

    /* JADX INFO: renamed from: b */
    private long f11524b = -1;

    /* JADX INFO: renamed from: c */
    long f11525c = -1;

    /* JADX INFO: renamed from: d */
    private TimeInterpolator f11526d = null;

    /* JADX INFO: renamed from: e */
    ArrayList f11527e = new ArrayList();

    /* JADX INFO: renamed from: f */
    ArrayList f11528f = new ArrayList();

    /* JADX INFO: renamed from: r */
    private ArrayList f11529r = null;

    /* JADX INFO: renamed from: s */
    private ArrayList f11530s = null;

    /* JADX INFO: renamed from: t */
    private ArrayList f11531t = null;

    /* JADX INFO: renamed from: u */
    private ArrayList f11532u = null;

    /* JADX INFO: renamed from: v */
    private ArrayList f11533v = null;

    /* JADX INFO: renamed from: w */
    private ArrayList f11534w = null;

    /* JADX INFO: renamed from: x */
    private ArrayList f11535x = null;

    /* JADX INFO: renamed from: y */
    private ArrayList f11536y = null;

    /* JADX INFO: renamed from: z */
    private ArrayList f11537z = null;

    /* JADX INFO: renamed from: A */
    private C2855w f11504A = new C2855w();

    /* JADX INFO: renamed from: B */
    private C2855w f11505B = new C2855w();

    /* JADX INFO: renamed from: C */
    C2852t f11506C = null;

    /* JADX INFO: renamed from: D */
    private int[] f11507D = f11501U;

    /* JADX INFO: renamed from: H */
    boolean f11511H = false;

    /* JADX INFO: renamed from: I */
    ArrayList f11512I = new ArrayList();

    /* JADX INFO: renamed from: J */
    private Animator[] f11513J = f11500T;

    /* JADX INFO: renamed from: K */
    int f11514K = 0;

    /* JADX INFO: renamed from: L */
    private boolean f11515L = false;

    /* JADX INFO: renamed from: M */
    boolean f11516M = false;

    /* JADX INFO: renamed from: N */
    private AbstractC2843k f11517N = null;

    /* JADX INFO: renamed from: O */
    private ArrayList f11518O = null;

    /* JADX INFO: renamed from: P */
    ArrayList f11519P = new ArrayList();

    /* JADX INFO: renamed from: S */
    private AbstractC2839g f11522S = f11502V;

    /* JADX INFO: renamed from: androidx.transition.k$a */
    class a extends AbstractC2839g {
        a() {
        }

        @Override // androidx.transition.AbstractC2839g
        /* JADX INFO: renamed from: a */
        public Path mo14126a(float f7, float f8, float f9, float f10) {
            Path path = new Path();
            path.moveTo(f7, f8);
            path.lineTo(f9, f10);
            return path;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$b */
    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2390a f11538a;

        b(C2390a c2390a) {
            this.f11538a = c2390a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11538a.remove(animator);
            AbstractC2843k.this.f11512I.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC2843k.this.f11512I.add(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC2843k.this.m14172q();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$d */
    private static class d {

        /* JADX INFO: renamed from: a */
        View f11541a;

        /* JADX INFO: renamed from: b */
        String f11542b;

        /* JADX INFO: renamed from: c */
        C2854v f11543c;

        /* JADX INFO: renamed from: d */
        WindowId f11544d;

        /* JADX INFO: renamed from: e */
        AbstractC2843k f11545e;

        /* JADX INFO: renamed from: f */
        Animator f11546f;

        d(View view, String str, AbstractC2843k abstractC2843k, WindowId windowId, C2854v c2854v, Animator animator) {
            this.f11541a = view;
            this.f11542b = str;
            this.f11543c = c2854v;
            this.f11544d = windowId;
            this.f11545e = abstractC2843k;
            this.f11546f = animator;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$e */
    public static abstract class e {
    }

    /* JADX INFO: renamed from: androidx.transition.k$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo14096a(AbstractC2843k abstractC2843k);

        /* JADX INFO: renamed from: b */
        void mo14097b(AbstractC2843k abstractC2843k);

        /* JADX INFO: renamed from: c */
        default void m14181c(AbstractC2843k abstractC2843k, boolean z7) {
            mo14098d(abstractC2843k);
        }

        /* JADX INFO: renamed from: d */
        void mo14098d(AbstractC2843k abstractC2843k);

        /* JADX INFO: renamed from: e */
        void mo14099e(AbstractC2843k abstractC2843k);

        /* JADX INFO: renamed from: f */
        default void mo14119f(AbstractC2843k abstractC2843k, boolean z7) {
            mo14096a(abstractC2843k);
        }

        /* JADX INFO: renamed from: g */
        void mo14100g(AbstractC2843k abstractC2843k);
    }

    /* JADX INFO: renamed from: androidx.transition.k$g */
    interface g {

        /* JADX INFO: renamed from: a */
        public static final g f11547a = new g() { // from class: androidx.transition.l
            @Override // androidx.transition.AbstractC2843k.g
            /* JADX INFO: renamed from: a */
            public final void mo14185a(AbstractC2843k.f fVar, AbstractC2843k abstractC2843k, boolean z7) {
                fVar.mo14119f(abstractC2843k, z7);
            }
        };

        /* JADX INFO: renamed from: b */
        public static final g f11548b = new g() { // from class: androidx.transition.m
            @Override // androidx.transition.AbstractC2843k.g
            /* JADX INFO: renamed from: a */
            public final void mo14185a(AbstractC2843k.f fVar, AbstractC2843k abstractC2843k, boolean z7) {
                fVar.m14181c(abstractC2843k, z7);
            }
        };

        /* JADX INFO: renamed from: c */
        public static final g f11549c = new g() { // from class: androidx.transition.n
            @Override // androidx.transition.AbstractC2843k.g
            /* JADX INFO: renamed from: a */
            public final void mo14185a(AbstractC2843k.f fVar, AbstractC2843k abstractC2843k, boolean z7) {
                fVar.mo14099e(abstractC2843k);
            }
        };

        /* JADX INFO: renamed from: d */
        public static final g f11550d = new g() { // from class: androidx.transition.o
            @Override // androidx.transition.AbstractC2843k.g
            /* JADX INFO: renamed from: a */
            public final void mo14185a(AbstractC2843k.f fVar, AbstractC2843k abstractC2843k, boolean z7) {
                fVar.mo14097b(abstractC2843k);
            }
        };

        /* JADX INFO: renamed from: e */
        public static final g f11551e = new g() { // from class: androidx.transition.p
            @Override // androidx.transition.AbstractC2843k.g
            /* JADX INFO: renamed from: a */
            public final void mo14185a(AbstractC2843k.f fVar, AbstractC2843k abstractC2843k, boolean z7) {
                fVar.mo14100g(abstractC2843k);
            }
        };

        /* JADX INFO: renamed from: a */
        void mo14185a(f fVar, AbstractC2843k abstractC2843k, boolean z7);
    }

    /* JADX INFO: renamed from: J */
    private static boolean m14130J(C2854v c2854v, C2854v c2854v2, String str) {
        Object obj = c2854v.f11568a.get(str);
        Object obj2 = c2854v2.f11568a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: K */
    private void m14131K(C2390a c2390a, C2390a c2390a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) sparseArray.valueAt(i7);
            if (view2 != null && m14148I(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i7))) != null && m14148I(view)) {
                C2854v c2854v = (C2854v) c2390a.get(view2);
                C2854v c2854v2 = (C2854v) c2390a2.get(view);
                if (c2854v != null && c2854v2 != null) {
                    this.f11508E.add(c2854v);
                    this.f11509F.add(c2854v2);
                    c2390a.remove(view2);
                    c2390a2.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    private void m14132L(C2390a c2390a, C2390a c2390a2) {
        C2854v c2854v;
        for (int size = c2390a.size() - 1; size >= 0; size--) {
            View view = (View) c2390a.m10300f(size);
            if (view != null && m14148I(view) && (c2854v = (C2854v) c2390a2.remove(view)) != null && m14148I(c2854v.f11569b)) {
                this.f11508E.add((C2854v) c2390a.mo8381h(size));
                this.f11509F.add(c2854v);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    private void m14133M(C2390a c2390a, C2390a c2390a2, C2397h c2397h, C2397h c2397h2) {
        View view;
        int iM10291k = c2397h.m10291k();
        for (int i7 = 0; i7 < iM10291k; i7++) {
            View view2 = (View) c2397h.m10292l(i7);
            if (view2 != null && m14148I(view2) && (view = (View) c2397h2.m10284d(c2397h.m10287g(i7))) != null && m14148I(view)) {
                C2854v c2854v = (C2854v) c2390a.get(view2);
                C2854v c2854v2 = (C2854v) c2390a2.get(view);
                if (c2854v != null && c2854v2 != null) {
                    this.f11508E.add(c2854v);
                    this.f11509F.add(c2854v2);
                    c2390a.remove(view2);
                    c2390a2.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: N */
    private void m14134N(C2390a c2390a, C2390a c2390a2, C2390a c2390a3, C2390a c2390a4) {
        View view;
        int size = c2390a3.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) c2390a3.m10301k(i7);
            if (view2 != null && m14148I(view2) && (view = (View) c2390a4.get(c2390a3.m10300f(i7))) != null && m14148I(view)) {
                C2854v c2854v = (C2854v) c2390a.get(view2);
                C2854v c2854v2 = (C2854v) c2390a2.get(view);
                if (c2854v != null && c2854v2 != null) {
                    this.f11508E.add(c2854v);
                    this.f11509F.add(c2854v2);
                    c2390a.remove(view2);
                    c2390a2.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    private void m14135O(C2855w c2855w, C2855w c2855w2) {
        C2390a c2390a = new C2390a(c2855w.f11571a);
        C2390a c2390a2 = new C2390a(c2855w2.f11571a);
        int i7 = 0;
        while (true) {
            int[] iArr = this.f11507D;
            if (i7 >= iArr.length) {
                m14138c(c2390a, c2390a2);
                return;
            }
            int i8 = iArr[i7];
            if (i8 == 1) {
                m14132L(c2390a, c2390a2);
            } else if (i8 == 2) {
                m14134N(c2390a, c2390a2, c2855w.f11574d, c2855w2.f11574d);
            } else if (i8 == 3) {
                m14131K(c2390a, c2390a2, c2855w.f11572b, c2855w2.f11572b);
            } else if (i8 == 4) {
                m14133M(c2390a, c2390a2, c2855w.f11573c, c2855w2.f11573c);
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: P */
    private void m14136P(AbstractC2843k abstractC2843k, g gVar, boolean z7) {
        AbstractC2843k abstractC2843k2 = this.f11517N;
        if (abstractC2843k2 != null) {
            abstractC2843k2.m14136P(abstractC2843k, gVar, z7);
        }
        ArrayList arrayList = this.f11518O;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f11518O.size();
        f[] fVarArr = this.f11510G;
        if (fVarArr == null) {
            fVarArr = new f[size];
        }
        this.f11510G = null;
        f[] fVarArr2 = (f[]) this.f11518O.toArray(fVarArr);
        for (int i7 = 0; i7 < size; i7++) {
            gVar.mo14185a(fVarArr2[i7], abstractC2843k, z7);
            fVarArr2[i7] = null;
        }
        this.f11510G = fVarArr2;
    }

    /* JADX INFO: renamed from: W */
    private void m14137W(Animator animator, C2390a c2390a) {
        if (animator != null) {
            animator.addListener(new b(c2390a));
            m14164e(animator);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m14138c(C2390a c2390a, C2390a c2390a2) {
        for (int i7 = 0; i7 < c2390a.size(); i7++) {
            C2854v c2854v = (C2854v) c2390a.m10301k(i7);
            if (m14148I(c2854v.f11569b)) {
                this.f11508E.add(c2854v);
                this.f11509F.add(null);
            }
        }
        for (int i8 = 0; i8 < c2390a2.size(); i8++) {
            C2854v c2854v2 = (C2854v) c2390a2.m10301k(i8);
            if (m14148I(c2854v2.f11569b)) {
                this.f11509F.add(c2854v2);
                this.f11508E.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m14139d(C2855w c2855w, View view, C2854v c2854v) {
        c2855w.f11571a.put(view, c2854v);
        int id = view.getId();
        if (id >= 0) {
            if (c2855w.f11572b.indexOfKey(id) >= 0) {
                c2855w.f11572b.put(id, null);
            } else {
                c2855w.f11572b.put(id, view);
            }
        }
        String strM4435G = AbstractC1030Z.m4435G(view);
        if (strM4435G != null) {
            if (c2855w.f11574d.containsKey(strM4435G)) {
                c2855w.f11574d.put(strM4435G, null);
            } else {
                c2855w.f11574d.put(strM4435G, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c2855w.f11573c.m10285e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c2855w.f11573c.m10288h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c2855w.f11573c.m10284d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c2855w.f11573c.m10288h(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m14140g(View view, boolean z7) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f11531t;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f11532u;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f11533v;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (((Class) this.f11533v.get(i7)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C2854v c2854v = new C2854v(view);
                    if (z7) {
                        mo14087i(c2854v);
                    } else {
                        mo14086f(c2854v);
                    }
                    c2854v.f11570c.add(this);
                    mo14167h(c2854v);
                    if (z7) {
                        m14139d(this.f11504A, view, c2854v);
                    } else {
                        m14139d(this.f11505B, view, c2854v);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f11535x;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f11536y;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f11537z;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    if (((Class) this.f11537z.get(i8)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                                m14140g(viewGroup.getChildAt(i9), z7);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    private static C2390a m14141z() {
        C2390a c2390a = (C2390a) f11503W.get();
        if (c2390a != null) {
            return c2390a;
        }
        C2390a c2390a2 = new C2390a();
        f11503W.set(c2390a2);
        return c2390a2;
    }

    /* JADX INFO: renamed from: A */
    public long m14142A() {
        return this.f11524b;
    }

    /* JADX INFO: renamed from: B */
    public List m14143B() {
        return this.f11527e;
    }

    /* JADX INFO: renamed from: C */
    public List m14144C() {
        return this.f11529r;
    }

    /* JADX INFO: renamed from: D */
    public List m14145D() {
        return this.f11530s;
    }

    /* JADX INFO: renamed from: E */
    public List m14146E() {
        return this.f11528f;
    }

    /* JADX INFO: renamed from: F */
    public String[] mo14084F() {
        return null;
    }

    /* JADX INFO: renamed from: G */
    public C2854v m14147G(View view, boolean z7) {
        C2852t c2852t = this.f11506C;
        if (c2852t != null) {
            return c2852t.m14147G(view, z7);
        }
        return (C2854v) (z7 ? this.f11504A : this.f11505B).f11571a.get(view);
    }

    /* JADX INFO: renamed from: H */
    public boolean mo14085H(C2854v c2854v, C2854v c2854v2) {
        if (c2854v != null && c2854v2 != null) {
            String[] strArrMo14084F = mo14084F();
            if (strArrMo14084F != null) {
                for (String str : strArrMo14084F) {
                    if (m14130J(c2854v, c2854v2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c2854v.f11568a.keySet().iterator();
                while (it.hasNext()) {
                    if (m14130J(c2854v, c2854v2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    boolean m14148I(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f11531t;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f11532u;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f11533v;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((Class) this.f11533v.get(i7)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f11534w != null && AbstractC1030Z.m4435G(view) != null && this.f11534w.contains(AbstractC1030Z.m4435G(view))) {
            return false;
        }
        if ((this.f11527e.size() == 0 && this.f11528f.size() == 0 && (((arrayList = this.f11530s) == null || arrayList.isEmpty()) && ((arrayList2 = this.f11529r) == null || arrayList2.isEmpty()))) || this.f11527e.contains(Integer.valueOf(id)) || this.f11528f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f11529r;
        if (arrayList6 != null && arrayList6.contains(AbstractC1030Z.m4435G(view))) {
            return true;
        }
        if (this.f11530s != null) {
            for (int i8 = 0; i8 < this.f11530s.size(); i8++) {
                if (((Class) this.f11530s.get(i8)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    void m14149Q(g gVar, boolean z7) {
        m14136P(this, gVar, z7);
    }

    /* JADX INFO: renamed from: R */
    public void mo14150R(View view) {
        if (this.f11516M) {
            return;
        }
        int size = this.f11512I.size();
        Animator[] animatorArr = (Animator[]) this.f11512I.toArray(this.f11513J);
        this.f11513J = f11500T;
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animator = animatorArr[i7];
            animatorArr[i7] = null;
            animator.pause();
        }
        this.f11513J = animatorArr;
        m14149Q(g.f11550d, false);
        this.f11515L = true;
    }

    /* JADX INFO: renamed from: S */
    void m14151S(ViewGroup viewGroup) {
        d dVar;
        this.f11508E = new ArrayList();
        this.f11509F = new ArrayList();
        m14135O(this.f11504A, this.f11505B);
        C2390a c2390aM14141z = m14141z();
        int size = c2390aM14141z.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animator = (Animator) c2390aM14141z.m10300f(i7);
            if (animator != null && (dVar = (d) c2390aM14141z.get(animator)) != null && dVar.f11541a != null && windowId.equals(dVar.f11544d)) {
                C2854v c2854v = dVar.f11543c;
                View view = dVar.f11541a;
                C2854v c2854vM14147G = m14147G(view, true);
                C2854v c2854vM14176u = m14176u(view, true);
                if (c2854vM14147G == null && c2854vM14176u == null) {
                    c2854vM14176u = (C2854v) this.f11505B.f11571a.get(view);
                }
                if ((c2854vM14147G != null || c2854vM14176u != null) && dVar.f11545e.mo14085H(c2854v, c2854vM14176u)) {
                    dVar.f11545e.m14180y().getClass();
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c2390aM14141z.remove(animator);
                    }
                }
            }
        }
        mo14171p(viewGroup, this.f11504A, this.f11505B, this.f11508E, this.f11509F);
        mo14155X();
    }

    /* JADX INFO: renamed from: T */
    public AbstractC2843k mo14152T(f fVar) {
        AbstractC2843k abstractC2843k;
        ArrayList arrayList = this.f11518O;
        if (arrayList != null) {
            if (!arrayList.remove(fVar) && (abstractC2843k = this.f11517N) != null) {
                abstractC2843k.mo14152T(fVar);
            }
            if (this.f11518O.size() == 0) {
                this.f11518O = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: U */
    public AbstractC2843k mo14153U(View view) {
        this.f11528f.remove(view);
        return this;
    }

    /* JADX INFO: renamed from: V */
    public void mo14154V(View view) {
        if (this.f11515L) {
            if (!this.f11516M) {
                int size = this.f11512I.size();
                Animator[] animatorArr = (Animator[]) this.f11512I.toArray(this.f11513J);
                this.f11513J = f11500T;
                for (int i7 = size - 1; i7 >= 0; i7--) {
                    Animator animator = animatorArr[i7];
                    animatorArr[i7] = null;
                    animator.resume();
                }
                this.f11513J = animatorArr;
                m14149Q(g.f11551e, false);
            }
            this.f11515L = false;
        }
    }

    /* JADX INFO: renamed from: X */
    protected void mo14155X() {
        m14165e0();
        C2390a c2390aM14141z = m14141z();
        for (Animator animator : this.f11519P) {
            if (c2390aM14141z.containsKey(animator)) {
                m14165e0();
                m14137W(animator, c2390aM14141z);
            }
        }
        this.f11519P.clear();
        m14172q();
    }

    /* JADX INFO: renamed from: Y */
    public AbstractC2843k mo14156Y(long j7) {
        this.f11525c = j7;
        return this;
    }

    /* JADX INFO: renamed from: Z */
    public void mo14157Z(e eVar) {
        this.f11520Q = eVar;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC2843k mo14158a(f fVar) {
        if (this.f11518O == null) {
            this.f11518O = new ArrayList();
        }
        this.f11518O.add(fVar);
        return this;
    }

    /* JADX INFO: renamed from: a0 */
    public AbstractC2843k mo14159a0(TimeInterpolator timeInterpolator) {
        this.f11526d = timeInterpolator;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC2843k mo14160b(View view) {
        this.f11528f.add(view);
        return this;
    }

    /* JADX INFO: renamed from: b0 */
    public void mo14161b0(AbstractC2839g abstractC2839g) {
        if (abstractC2839g == null) {
            this.f11522S = f11502V;
        } else {
            this.f11522S = abstractC2839g;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void mo14162c0(AbstractC2851s abstractC2851s) {
    }

    protected void cancel() {
        int size = this.f11512I.size();
        Animator[] animatorArr = (Animator[]) this.f11512I.toArray(this.f11513J);
        this.f11513J = f11500T;
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animator = animatorArr[i7];
            animatorArr[i7] = null;
            animator.cancel();
        }
        this.f11513J = animatorArr;
        m14149Q(g.f11549c, false);
    }

    /* JADX INFO: renamed from: d0 */
    public AbstractC2843k mo14163d0(long j7) {
        this.f11524b = j7;
        return this;
    }

    /* JADX INFO: renamed from: e */
    protected void m14164e(Animator animator) {
        if (animator == null) {
            m14172q();
            return;
        }
        if (m14173r() >= 0) {
            animator.setDuration(m14173r());
        }
        if (m14142A() >= 0) {
            animator.setStartDelay(m14142A() + animator.getStartDelay());
        }
        if (m14175t() != null) {
            animator.setInterpolator(m14175t());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* JADX INFO: renamed from: e0 */
    protected void m14165e0() {
        if (this.f11514K == 0) {
            m14149Q(g.f11547a, false);
            this.f11516M = false;
        }
        this.f11514K++;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo14086f(C2854v c2854v);

    /* JADX INFO: renamed from: f0 */
    String mo14166f0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f11525c != -1) {
            sb.append("dur(");
            sb.append(this.f11525c);
            sb.append(") ");
        }
        if (this.f11524b != -1) {
            sb.append("dly(");
            sb.append(this.f11524b);
            sb.append(") ");
        }
        if (this.f11526d != null) {
            sb.append("interp(");
            sb.append(this.f11526d);
            sb.append(") ");
        }
        if (this.f11527e.size() > 0 || this.f11528f.size() > 0) {
            sb.append("tgts(");
            if (this.f11527e.size() > 0) {
                for (int i7 = 0; i7 < this.f11527e.size(); i7++) {
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f11527e.get(i7));
                }
            }
            if (this.f11528f.size() > 0) {
                for (int i8 = 0; i8 < this.f11528f.size(); i8++) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f11528f.get(i8));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    void mo14167h(C2854v c2854v) {
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo14087i(C2854v c2854v);

    /* JADX INFO: renamed from: j */
    void m14168j(ViewGroup viewGroup, boolean z7) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C2390a c2390a;
        m14169k(z7);
        if ((this.f11527e.size() > 0 || this.f11528f.size() > 0) && (((arrayList = this.f11529r) == null || arrayList.isEmpty()) && ((arrayList2 = this.f11530s) == null || arrayList2.isEmpty()))) {
            for (int i7 = 0; i7 < this.f11527e.size(); i7++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f11527e.get(i7)).intValue());
                if (viewFindViewById != null) {
                    C2854v c2854v = new C2854v(viewFindViewById);
                    if (z7) {
                        mo14087i(c2854v);
                    } else {
                        mo14086f(c2854v);
                    }
                    c2854v.f11570c.add(this);
                    mo14167h(c2854v);
                    if (z7) {
                        m14139d(this.f11504A, viewFindViewById, c2854v);
                    } else {
                        m14139d(this.f11505B, viewFindViewById, c2854v);
                    }
                }
            }
            for (int i8 = 0; i8 < this.f11528f.size(); i8++) {
                View view = (View) this.f11528f.get(i8);
                C2854v c2854v2 = new C2854v(view);
                if (z7) {
                    mo14087i(c2854v2);
                } else {
                    mo14086f(c2854v2);
                }
                c2854v2.f11570c.add(this);
                mo14167h(c2854v2);
                if (z7) {
                    m14139d(this.f11504A, view, c2854v2);
                } else {
                    m14139d(this.f11505B, view, c2854v2);
                }
            }
        } else {
            m14140g(viewGroup, z7);
        }
        if (z7 || (c2390a = this.f11521R) == null) {
            return;
        }
        int size = c2390a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            arrayList3.add((View) this.f11504A.f11574d.remove((String) this.f11521R.m10300f(i9)));
        }
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) arrayList3.get(i10);
            if (view2 != null) {
                this.f11504A.f11574d.put((String) this.f11521R.m10301k(i10), view2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    void m14169k(boolean z7) {
        if (z7) {
            this.f11504A.f11571a.clear();
            this.f11504A.f11572b.clear();
            this.f11504A.f11573c.m10281a();
        } else {
            this.f11505B.f11571a.clear();
            this.f11505B.f11572b.clear();
            this.f11505B.f11573c.m10281a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: l */
    public AbstractC2843k clone() {
        try {
            AbstractC2843k abstractC2843k = (AbstractC2843k) super.clone();
            abstractC2843k.f11519P = new ArrayList();
            abstractC2843k.f11504A = new C2855w();
            abstractC2843k.f11505B = new C2855w();
            abstractC2843k.f11508E = null;
            abstractC2843k.f11509F = null;
            abstractC2843k.f11517N = this;
            abstractC2843k.f11518O = null;
            return abstractC2843k;
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: o */
    public Animator mo14093o(ViewGroup viewGroup, C2854v c2854v, C2854v c2854v2) {
        return null;
    }

    /* JADX INFO: renamed from: p */
    void mo14171p(ViewGroup viewGroup, C2855w c2855w, C2855w c2855w2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        C2854v c2854v;
        View view2;
        Animator animator2;
        C2390a c2390aM14141z = m14141z();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m14180y().getClass();
        for (int i7 = 0; i7 < size; i7++) {
            C2854v c2854v2 = (C2854v) arrayList.get(i7);
            C2854v c2854v3 = (C2854v) arrayList2.get(i7);
            if (c2854v2 != null && !c2854v2.f11570c.contains(this)) {
                c2854v2 = null;
            }
            if (c2854v3 != null && !c2854v3.f11570c.contains(this)) {
                c2854v3 = null;
            }
            if ((c2854v2 != null || c2854v3 != null) && (c2854v2 == null || c2854v3 == null || mo14085H(c2854v2, c2854v3))) {
                Animator animatorMo14093o = mo14093o(viewGroup, c2854v2, c2854v3);
                if (animatorMo14093o != null) {
                    if (c2854v3 != null) {
                        View view3 = c2854v3.f11569b;
                        String[] strArrMo14084F = mo14084F();
                        if (strArrMo14084F != null && strArrMo14084F.length > 0) {
                            c2854v = new C2854v(view3);
                            C2854v c2854v4 = (C2854v) c2855w2.f11571a.get(view3);
                            if (c2854v4 != null) {
                                int i8 = 0;
                                while (i8 < strArrMo14084F.length) {
                                    Map map = c2854v.f11568a;
                                    String[] strArr = strArrMo14084F;
                                    String str = strArr[i8];
                                    map.put(str, c2854v4.f11568a.get(str));
                                    i8++;
                                    strArrMo14084F = strArr;
                                }
                            }
                            int size2 = c2390aM14141z.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size2) {
                                    view2 = view3;
                                    animator2 = animatorMo14093o;
                                    break;
                                }
                                d dVar = (d) c2390aM14141z.get((Animator) c2390aM14141z.m10300f(i9));
                                if (dVar.f11543c != null && dVar.f11541a == view3) {
                                    view2 = view3;
                                    if (dVar.f11542b.equals(m14177v()) && dVar.f11543c.equals(c2854v)) {
                                        animator2 = null;
                                        break;
                                    }
                                } else {
                                    view2 = view3;
                                }
                                i9++;
                                view3 = view2;
                            }
                        } else {
                            view2 = view3;
                            animator2 = animatorMo14093o;
                            c2854v = null;
                        }
                        animator = animator2;
                        view = view2;
                    } else {
                        view = c2854v2.f11569b;
                        animator = animatorMo14093o;
                        c2854v = null;
                    }
                    if (animator != null) {
                        c2390aM14141z.put(animator, new d(view, m14177v(), this, viewGroup.getWindowId(), c2854v, animator));
                        this.f11519P.add(animator);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
                d dVar2 = (d) c2390aM14141z.get((Animator) this.f11519P.get(sparseIntArray.keyAt(i10)));
                dVar2.f11546f.setStartDelay((((long) sparseIntArray.valueAt(i10)) - Long.MAX_VALUE) + dVar2.f11546f.getStartDelay());
            }
        }
    }

    /* JADX INFO: renamed from: q */
    protected void m14172q() {
        int i7 = this.f11514K - 1;
        this.f11514K = i7;
        if (i7 == 0) {
            m14149Q(g.f11548b, false);
            for (int i8 = 0; i8 < this.f11504A.f11573c.m10291k(); i8++) {
                View view = (View) this.f11504A.f11573c.m10292l(i8);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i9 = 0; i9 < this.f11505B.f11573c.m10291k(); i9++) {
                View view2 = (View) this.f11505B.f11573c.m10292l(i9);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f11516M = true;
        }
    }

    /* JADX INFO: renamed from: r */
    public long m14173r() {
        return this.f11525c;
    }

    /* JADX INFO: renamed from: s */
    public e m14174s() {
        return this.f11520Q;
    }

    /* JADX INFO: renamed from: t */
    public TimeInterpolator m14175t() {
        return this.f11526d;
    }

    public String toString() {
        return mo14166f0("");
    }

    /* JADX INFO: renamed from: u */
    C2854v m14176u(View view, boolean z7) {
        C2852t c2852t = this.f11506C;
        if (c2852t != null) {
            return c2852t.m14176u(view, z7);
        }
        ArrayList arrayList = z7 ? this.f11508E : this.f11509F;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            }
            C2854v c2854v = (C2854v) arrayList.get(i7);
            if (c2854v == null) {
                return null;
            }
            if (c2854v.f11569b == view) {
                break;
            }
            i7++;
        }
        if (i7 >= 0) {
            return (C2854v) (z7 ? this.f11509F : this.f11508E).get(i7);
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public String m14177v() {
        return this.f11523a;
    }

    /* JADX INFO: renamed from: w */
    public AbstractC2839g m14178w() {
        return this.f11522S;
    }

    /* JADX INFO: renamed from: x */
    public AbstractC2851s m14179x() {
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC2843k m14180y() {
        C2852t c2852t = this.f11506C;
        return c2852t != null ? c2852t.m14180y() : this;
    }
}
