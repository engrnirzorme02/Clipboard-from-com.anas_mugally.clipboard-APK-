package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.appcompat.app.AbstractC2263x;
import androidx.collection.C2390a;
import androidx.fragment.app.C2588f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p081K.C0713e;
import p111O.AbstractC1030Z;
import p111O.AbstractC1045e0;
import p111O.ViewTreeObserverOnPreDrawListenerC0999J;
import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: androidx.fragment.app.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2588f extends AbstractC2579F {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.fragment.app.f$a */
    static final class a extends b {

        /* JADX INFO: renamed from: c */
        private final boolean f10075c;

        /* JADX INFO: renamed from: d */
        private boolean f10076d;

        /* JADX INFO: renamed from: e */
        private AbstractC2593k.a f10077e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC2579F.c operation, C0713e signal, boolean z7) {
            super(operation, signal);
            AbstractC6118n.m27187e(operation, "operation");
            AbstractC6118n.m27187e(signal, "signal");
            this.f10075c = z7;
        }

        /* JADX INFO: renamed from: e */
        public final AbstractC2593k.a m12059e(Context context) {
            AbstractC6118n.m27187e(context, "context");
            if (this.f10076d) {
                return this.f10077e;
            }
            AbstractC2593k.a aVarM12247b = AbstractC2593k.m12247b(context, m12061b().m11997h(), m12061b().m11996g() == AbstractC2579F.c.b.VISIBLE, this.f10075c);
            this.f10077e = aVarM12247b;
            this.f10076d = true;
            return aVarM12247b;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final AbstractC2579F.c f10078a;

        /* JADX INFO: renamed from: b */
        private final C0713e f10079b;

        public b(AbstractC2579F.c operation, C0713e signal) {
            AbstractC6118n.m27187e(operation, "operation");
            AbstractC6118n.m27187e(signal, "signal");
            this.f10078a = operation;
            this.f10079b = signal;
        }

        /* JADX INFO: renamed from: a */
        public final void m12060a() {
            this.f10078a.m11995f(this.f10079b);
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC2579F.c m12061b() {
            return this.f10078a;
        }

        /* JADX INFO: renamed from: c */
        public final C0713e m12062c() {
            return this.f10079b;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m12063d() {
            AbstractC2579F.c.b.a aVar = AbstractC2579F.c.b.f10035a;
            View view = this.f10078a.m11997h().f10138T;
            AbstractC6118n.m27186d(view, "operation.fragment.mView");
            AbstractC2579F.c.b bVarM12007a = aVar.m12007a(view);
            AbstractC2579F.c.b bVarM11996g = this.f10078a.m11996g();
            if (bVarM12007a == bVarM11996g) {
                return true;
            }
            AbstractC2579F.c.b bVar = AbstractC2579F.c.b.VISIBLE;
            return (bVarM12007a == bVar || bVarM11996g == bVar) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.fragment.app.f$c */
    static final class c extends b {

        /* JADX INFO: renamed from: c */
        private final Object f10080c;

        /* JADX INFO: renamed from: d */
        private final boolean f10081d;

        /* JADX INFO: renamed from: e */
        private final Object f10082e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC2579F.c operation, C0713e signal, boolean z7, boolean z8) {
            Object objM12148S;
            super(operation, signal);
            AbstractC6118n.m27187e(operation, "operation");
            AbstractC6118n.m27187e(signal, "signal");
            AbstractC2579F.c.b bVarM11996g = operation.m11996g();
            AbstractC2579F.c.b bVar = AbstractC2579F.c.b.VISIBLE;
            if (bVarM11996g == bVar) {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM11997h = operation.m11997h();
                objM12148S = z7 ? abstractComponentCallbacksC2591iM11997h.m12146Q() : abstractComponentCallbacksC2591iM11997h.m12209x();
            } else {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM11997h2 = operation.m11997h();
                objM12148S = z7 ? abstractComponentCallbacksC2591iM11997h2.m12148S() : abstractComponentCallbacksC2591iM11997h2.m12110B();
            }
            this.f10080c = objM12148S;
            this.f10081d = operation.m11996g() == bVar ? z7 ? operation.m11997h().m12190o() : operation.m11997h().m12187n() : true;
            this.f10082e = z8 ? z7 ? operation.m11997h().m12150U() : operation.m11997h().m12149T() : null;
        }

        /* JADX INFO: renamed from: f */
        private final AbstractC2574A m12064f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC2574A abstractC2574A = C2607y.f10369b;
            if (abstractC2574A != null && abstractC2574A.mo11940e(obj)) {
                return abstractC2574A;
            }
            AbstractC2574A abstractC2574A2 = C2607y.f10370c;
            if (abstractC2574A2 != null && abstractC2574A2.mo11940e(obj)) {
                return abstractC2574A2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m12061b().m11997h() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* JADX INFO: renamed from: e */
        public final AbstractC2574A m12065e() {
            AbstractC2574A abstractC2574AM12064f = m12064f(this.f10080c);
            AbstractC2574A abstractC2574AM12064f2 = m12064f(this.f10082e);
            if (abstractC2574AM12064f == null || abstractC2574AM12064f2 == null || abstractC2574AM12064f == abstractC2574AM12064f2) {
                return abstractC2574AM12064f == null ? abstractC2574AM12064f2 : abstractC2574AM12064f;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m12061b().m11997h() + " returned Transition " + this.f10080c + " which uses a different Transition  type than its shared element transition " + this.f10082e).toString());
        }

        /* JADX INFO: renamed from: g */
        public final Object m12066g() {
            return this.f10082e;
        }

        /* JADX INFO: renamed from: h */
        public final Object m12067h() {
            return this.f10080c;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m12068i() {
            return this.f10082e != null;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m12069j() {
            return this.f10081d;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$d */
    static final class d extends AbstractC6119o implements InterfaceC5367l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Collection f10083a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Collection collection) {
            super(1);
            this.f10083a = collection;
        }

        @Override // p238e6.InterfaceC5367l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            AbstractC6118n.m27187e(entry, "entry");
            return Boolean.valueOf(AbstractC1638q.m6564D(this.f10083a, AbstractC1030Z.m4435G((View) entry.getValue())));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$e */
    public static final class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f10085b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f10086c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC2579F.c f10087d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ a f10088e;

        e(View view, boolean z7, AbstractC2579F.c cVar, a aVar) {
            this.f10085b = view;
            this.f10086c = z7;
            this.f10087d = cVar;
            this.f10088e = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator anim) {
            AbstractC6118n.m27187e(anim, "anim");
            C2588f.this.m11984q().endViewTransition(this.f10085b);
            if (this.f10086c) {
                AbstractC2579F.c.b bVarM11996g = this.f10087d.m11996g();
                View viewToAnimate = this.f10085b;
                AbstractC6118n.m27186d(viewToAnimate, "viewToAnimate");
                bVarM11996g.m12006d(viewToAnimate);
            }
            this.f10088e.m12060a();
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f10087d + " has ended.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$f */
    public static final class f implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC2579F.c f10089a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C2588f f10090b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f10091c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ a f10092d;

        f(AbstractC2579F.c cVar, C2588f c2588f, View view, a aVar) {
            this.f10089a = cVar;
            this.f10090b = c2588f;
            this.f10091c = view;
            this.f10092d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m12072b(C2588f this$0, View view, a animationInfo) {
            AbstractC6118n.m27187e(this$0, "this$0");
            AbstractC6118n.m27187e(animationInfo, "$animationInfo");
            this$0.m11984q().endViewTransition(view);
            animationInfo.m12060a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC6118n.m27187e(animation, "animation");
            ViewGroup viewGroupM11984q = this.f10090b.m11984q();
            final C2588f c2588f = this.f10090b;
            final View view = this.f10091c;
            final a aVar = this.f10092d;
            viewGroupM11984q.post(new Runnable() { // from class: androidx.fragment.app.g
                @Override // java.lang.Runnable
                public final void run() {
                    C2588f.f.m12072b(c2588f, view, aVar);
                }
            });
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f10089a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC6118n.m27187e(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC6118n.m27187e(animation, "animation");
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f10089a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2588f(ViewGroup container) {
        super(container);
        AbstractC6118n.m27187e(container, "container");
    }

    /* JADX INFO: renamed from: D */
    private final void m12041D(AbstractC2579F.c cVar) {
        View view = cVar.m11997h().f10138T;
        AbstractC2579F.c.b bVarM11996g = cVar.m11996g();
        AbstractC6118n.m27186d(view, "view");
        bVarM11996g.m12006d(view);
    }

    /* JADX INFO: renamed from: E */
    private final void m12042E(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (AbstractC1045e0.m4659c(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View child = viewGroup.getChildAt(i7);
            if (child.getVisibility() == 0) {
                AbstractC6118n.m27186d(child, "child");
                m12042E(arrayList, child);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m12043F(List awaitingContainerChanges, AbstractC2579F.c operation, C2588f this$0) {
        AbstractC6118n.m27187e(awaitingContainerChanges, "$awaitingContainerChanges");
        AbstractC6118n.m27187e(operation, "$operation");
        AbstractC6118n.m27187e(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.m12041D(operation);
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m12044G(Map map, View view) {
        String strM4435G = AbstractC1030Z.m4435G(view);
        if (strM4435G != null) {
            map.put(strM4435G, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View child = viewGroup.getChildAt(i7);
                if (child.getVisibility() == 0) {
                    AbstractC6118n.m27186d(child, "child");
                    m12044G(map, child);
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    private final void m12045H(C2390a c2390a, Collection collection) {
        Set entries = c2390a.entrySet();
        AbstractC6118n.m27186d(entries, "entries");
        AbstractC1638q.m6778B(entries, new d(collection));
    }

    /* JADX INFO: renamed from: I */
    private final void m12046I(List list, List list2, boolean z7, Map map) {
        Context context = m11984q().getContext();
        ArrayList<a> arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.m12063d()) {
                aVar.m12060a();
            } else {
                AbstractC6118n.m27186d(context, "context");
                AbstractC2593k.a aVarM12059e = aVar.m12059e(context);
                if (aVarM12059e == null) {
                    aVar.m12060a();
                } else {
                    final Animator animator = aVarM12059e.f10217b;
                    if (animator == null) {
                        arrayList.add(aVar);
                    } else {
                        final AbstractC2579F.c cVarM12061b = aVar.m12061b();
                        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM11997h = cVarM12061b.m11997h();
                        if (AbstractC6118n.m27183a(map.get(cVarM12061b), Boolean.TRUE)) {
                            if (AbstractC2599q.m12289I0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC2591iM11997h + " as this Fragment was involved in a Transition.");
                            }
                            aVar.m12060a();
                        } else {
                            boolean z9 = cVarM12061b.m11996g() == AbstractC2579F.c.b.GONE;
                            if (z9) {
                                list2.remove(cVarM12061b);
                            }
                            View view = abstractComponentCallbacksC2591iM11997h.f10138T;
                            m11984q().startViewTransition(view);
                            animator.addListener(new e(view, z9, cVarM12061b, aVar));
                            animator.setTarget(view);
                            animator.start();
                            if (AbstractC2599q.m12289I0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + cVarM12061b + " has started.");
                            }
                            aVar.m12062c().m3462c(new C0713e.a() { // from class: h0.b
                                @Override // p081K.C0713e.a
                                /* JADX INFO: renamed from: a */
                                public final void mo3463a() {
                                    C2588f.m12047J(animator, cVarM12061b);
                                }
                            });
                            z8 = true;
                        }
                    }
                }
            }
        }
        for (final a aVar2 : arrayList) {
            final AbstractC2579F.c cVarM12061b2 = aVar2.m12061b();
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM11997h2 = cVarM12061b2.m11997h();
            if (z7) {
                if (AbstractC2599q.m12289I0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC2591iM11997h2 + " as Animations cannot run alongside Transitions.");
                }
                aVar2.m12060a();
            } else if (z8) {
                if (AbstractC2599q.m12289I0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC2591iM11997h2 + " as Animations cannot run alongside Animators.");
                }
                aVar2.m12060a();
            } else {
                final View view2 = abstractComponentCallbacksC2591iM11997h2.f10138T;
                AbstractC6118n.m27186d(context, "context");
                AbstractC2593k.a aVarM12059e2 = aVar2.m12059e(context);
                if (aVarM12059e2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation = aVarM12059e2.f10216a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (cVarM12061b2.m11996g() != AbstractC2579F.c.b.REMOVED) {
                    view2.startAnimation(animation);
                    aVar2.m12060a();
                } else {
                    m11984q().startViewTransition(view2);
                    AbstractC2593k.b bVar = new AbstractC2593k.b(animation, m11984q(), view2);
                    bVar.setAnimationListener(new f(cVarM12061b2, this, view2, aVar2));
                    view2.startAnimation(bVar);
                    if (AbstractC2599q.m12289I0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + cVarM12061b2 + " has started.");
                    }
                }
                aVar2.m12062c().m3462c(new C0713e.a() { // from class: androidx.fragment.app.d
                    @Override // p081K.C0713e.a
                    /* JADX INFO: renamed from: a */
                    public final void mo3463a() {
                        C2588f.m12048K(view2, this, aVar2, cVarM12061b2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final void m12047J(Animator animator, AbstractC2579F.c operation) {
        AbstractC6118n.m27187e(operation, "$operation");
        animator.end();
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m12048K(View view, C2588f this$0, a animationInfo, AbstractC2579F.c operation) {
        AbstractC6118n.m27187e(this$0, "this$0");
        AbstractC6118n.m27187e(animationInfo, "$animationInfo");
        AbstractC6118n.m27187e(operation, "$operation");
        view.clearAnimation();
        this$0.m11984q().endViewTransition(view);
        animationInfo.m12060a();
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
        }
    }

    /* JADX INFO: renamed from: L */
    private final Map m12049L(List list, List list2, final boolean z7, final AbstractC2579F.c cVar, AbstractC2579F.c cVar2) {
        Object obj;
        View view;
        String str;
        String str2;
        Object obj2;
        String str3;
        Object obj3;
        boolean z8;
        View view2;
        Object obj4;
        ArrayList arrayList;
        Object obj5;
        AbstractC2579F.c cVar3;
        C1435m c1435mM6083a;
        final View view3;
        C2588f c2588f = this;
        final AbstractC2579F.c cVar4 = cVar2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : list) {
            if (!((c) obj6).m12063d()) {
                arrayList2.add(obj6);
            }
        }
        ArrayList<c> arrayList3 = new ArrayList();
        for (Object obj7 : arrayList2) {
            if (((c) obj7).m12065e() != null) {
                arrayList3.add(obj7);
            }
        }
        final AbstractC2574A abstractC2574A = null;
        for (c cVar5 : arrayList3) {
            AbstractC2574A abstractC2574AM12065e = cVar5.m12065e();
            if (abstractC2574A != null && abstractC2574AM12065e != abstractC2574A) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cVar5.m12061b().m11997h() + " returned Transition " + cVar5.m12067h() + " which uses a different Transition type than other Fragments.").toString());
            }
            abstractC2574A = abstractC2574AM12065e;
        }
        if (abstractC2574A == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar6 = (c) it.next();
                linkedHashMap.put(cVar6.m12061b(), Boolean.FALSE);
                cVar6.m12060a();
            }
            return linkedHashMap;
        }
        View view4 = new View(c2588f.m11984q().getContext());
        final Rect rect = new Rect();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C2390a c2390a = new C2390a();
        Iterator it2 = list.iterator();
        Object obj8 = null;
        View view5 = null;
        boolean z9 = false;
        while (true) {
            obj = obj8;
            view = view5;
            str = "FragmentManager";
            if (!it2.hasNext()) {
                break;
            }
            c cVar7 = (c) it2.next();
            if (!cVar7.m12068i() || cVar == null || cVar4 == null) {
                view4 = view4;
                arrayList4 = arrayList4;
                linkedHashMap = linkedHashMap;
                arrayList5 = arrayList5;
                obj8 = obj;
                view5 = view;
                c2390a = c2390a;
            } else {
                Object objMo11954u = abstractC2574A.mo11954u(abstractC2574A.mo11941f(cVar7.m12066g()));
                ArrayList arrayListM12151V = cVar4.m11997h().m12151V();
                AbstractC6118n.m27186d(arrayListM12151V, "lastIn.fragment.sharedElementSourceNames");
                ArrayList arrayListM12151V2 = cVar.m11997h().m12151V();
                AbstractC6118n.m27186d(arrayListM12151V2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList arrayListM12152W = cVar.m11997h().m12152W();
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                AbstractC6118n.m27186d(arrayListM12152W, "firstOut.fragment.sharedElementTargetNames");
                int size = arrayListM12152W.size();
                View view6 = view4;
                int i7 = 0;
                while (i7 < size) {
                    int i8 = size;
                    int iIndexOf = arrayListM12151V.indexOf(arrayListM12152W.get(i7));
                    ArrayList arrayList6 = arrayListM12152W;
                    if (iIndexOf != -1) {
                        arrayListM12151V.set(iIndexOf, arrayListM12151V2.get(i7));
                    }
                    i7++;
                    size = i8;
                    arrayListM12152W = arrayList6;
                }
                ArrayList arrayListM12152W2 = cVar4.m11997h().m12152W();
                AbstractC6118n.m27186d(arrayListM12152W2, "lastIn.fragment.sharedElementTargetNames");
                if (z7) {
                    cVar.m11997h().m12212y();
                    cVar4.m11997h().m12112C();
                    c1435mM6083a = AbstractC1440r.m6083a(null, null);
                } else {
                    cVar.m11997h().m12112C();
                    cVar4.m11997h().m12212y();
                    c1435mM6083a = AbstractC1440r.m6083a(null, null);
                }
                AbstractC2263x.m9328a(c1435mM6083a.m6068a());
                AbstractC2263x.m9328a(c1435mM6083a.m6069b());
                int i9 = 0;
                for (int size2 = arrayListM12151V.size(); i9 < size2; size2 = size2) {
                    c2390a.put((String) arrayListM12151V.get(i9), (String) arrayListM12152W2.get(i9));
                    i9++;
                }
                if (AbstractC2599q.m12289I0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator it3 = arrayListM12152W2.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v("FragmentManager", "Name: " + ((String) it3.next()));
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator it4 = arrayListM12151V.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v("FragmentManager", "Name: " + ((String) it4.next()));
                    }
                }
                C2390a c2390a2 = new C2390a();
                View view7 = cVar.m11997h().f10138T;
                AbstractC6118n.m27186d(view7, "firstOut.fragment.mView");
                c2588f.m12044G(c2390a2, view7);
                c2390a2.m10257o(arrayListM12151V);
                c2390a.m10257o(c2390a2.keySet());
                final C2390a c2390a3 = new C2390a();
                View view8 = cVar4.m11997h().f10138T;
                AbstractC6118n.m27186d(view8, "lastIn.fragment.mView");
                c2588f.m12044G(c2390a3, view8);
                c2390a3.m10257o(arrayListM12152W2);
                c2390a3.m10257o(c2390a.values());
                C2607y.m12516c(c2390a, c2390a3);
                Set setKeySet = c2390a.keySet();
                AbstractC6118n.m27186d(setKeySet, "sharedElementNameMapping.keys");
                c2588f.m12045H(c2390a2, setKeySet);
                Collection collectionValues = c2390a.values();
                AbstractC6118n.m27186d(collectionValues, "sharedElementNameMapping.values");
                c2588f.m12045H(c2390a3, collectionValues);
                if (c2390a.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    view5 = view;
                    linkedHashMap = linkedHashMap2;
                    view4 = view6;
                    obj8 = null;
                } else {
                    C2390a c2390a4 = c2390a;
                    C2607y.m12514a(cVar4.m11997h(), cVar.m11997h(), z7, c2390a2, true);
                    ViewTreeObserverOnPreDrawListenerC0999J.m4375a(c2588f.m11984q(), new Runnable() { // from class: h0.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2588f.m12053P(cVar4, cVar, z7, c2390a3);
                        }
                    });
                    arrayList4.addAll(c2390a2.values());
                    if (!arrayListM12151V.isEmpty()) {
                        View view9 = (View) c2390a2.get((String) arrayListM12151V.get(0));
                        abstractC2574A.mo11949p(objMo11954u, view9);
                        view = view9;
                    }
                    arrayList5.addAll(c2390a3.values());
                    if (!arrayListM12152W2.isEmpty() && (view3 = (View) c2390a3.get((String) arrayListM12152W2.get(0))) != null) {
                        ViewTreeObserverOnPreDrawListenerC0999J.m4375a(c2588f.m11984q(), new Runnable() { // from class: h0.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                C2588f.m12050M(abstractC2574A, view3, rect);
                            }
                        });
                        z9 = true;
                    }
                    abstractC2574A.mo11952s(objMo11954u, view6, arrayList4);
                    ArrayList arrayList7 = arrayList5;
                    abstractC2574A.mo11947n(objMo11954u, null, null, null, null, objMo11954u, arrayList7);
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap2.put(cVar, bool);
                    linkedHashMap2.put(cVar4, bool);
                    view4 = view6;
                    obj8 = objMo11954u;
                    linkedHashMap = linkedHashMap2;
                    arrayList5 = arrayList7;
                    view5 = view;
                    c2390a = c2390a4;
                    arrayList4 = arrayList4;
                }
            }
        }
        ArrayList arrayList8 = arrayList4;
        C2390a c2390a5 = c2390a;
        ArrayList arrayList9 = arrayList5;
        boolean z10 = true;
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        View view10 = view4;
        boolean z11 = false;
        ArrayList arrayList10 = new ArrayList();
        Iterator it5 = list.iterator();
        Object objMo11944k = null;
        Object objMo11944k2 = null;
        while (it5.hasNext()) {
            c cVar8 = (c) it5.next();
            if (cVar8.m12063d()) {
                linkedHashMap3.put(cVar8.m12061b(), Boolean.FALSE);
                cVar8.m12060a();
            } else {
                Object objMo11941f = abstractC2574A.mo11941f(cVar8.m12067h());
                AbstractC2579F.c cVarM12061b = cVar8.m12061b();
                boolean z12 = (obj == null || !(cVarM12061b == cVar || cVarM12061b == cVar4)) ? z11 : true;
                if (objMo11941f != null) {
                    LinkedHashMap linkedHashMap4 = linkedHashMap3;
                    final ArrayList arrayList11 = new ArrayList();
                    View view11 = cVarM12061b.m11997h().f10138T;
                    ArrayList arrayList12 = arrayList8;
                    AbstractC6118n.m27186d(view11, "operation.fragment.mView");
                    c2588f.m12042E(arrayList11, view11);
                    if (z12) {
                        if (cVarM12061b == cVar) {
                            arrayList11.removeAll(AbstractC1638q.m6598l0(arrayList12));
                        } else {
                            arrayList11.removeAll(AbstractC1638q.m6598l0(arrayList9));
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        abstractC2574A.mo11937a(objMo11941f, view10);
                        obj3 = objMo11944k;
                        obj2 = objMo11941f;
                        obj5 = objMo11944k2;
                        cVar3 = cVarM12061b;
                        str3 = str;
                        view = view;
                        linkedHashMap3 = linkedHashMap4;
                        z8 = true;
                        view2 = view10;
                        obj4 = obj;
                        arrayList = arrayList9;
                    } else {
                        abstractC2574A.mo11938b(objMo11941f, arrayList11);
                        Object obj9 = objMo11944k;
                        obj2 = objMo11941f;
                        str3 = str;
                        view = view;
                        linkedHashMap3 = linkedHashMap4;
                        obj3 = obj9;
                        z8 = true;
                        view2 = view10;
                        obj4 = obj;
                        arrayList = arrayList9;
                        obj5 = objMo11944k2;
                        abstractC2574A.mo11947n(obj2, objMo11941f, arrayList11, null, null, null, null);
                        if (cVarM12061b.m11996g() == AbstractC2579F.c.b.GONE) {
                            cVar3 = cVarM12061b;
                            list2.remove(cVar3);
                            ArrayList arrayList13 = new ArrayList(arrayList11);
                            arrayList13.remove(cVar3.m11997h().f10138T);
                            abstractC2574A.mo11946m(obj2, cVar3.m11997h().f10138T, arrayList13);
                            ViewTreeObserverOnPreDrawListenerC0999J.m4375a(m11984q(), new Runnable() { // from class: h0.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2588f.m12051N(arrayList11);
                                }
                            });
                        } else {
                            cVar3 = cVarM12061b;
                        }
                    }
                    if (cVar3.m11996g() == AbstractC2579F.c.b.VISIBLE) {
                        arrayList10.addAll(arrayList11);
                        if (z9) {
                            abstractC2574A.mo11948o(obj2, rect);
                        }
                    } else {
                        abstractC2574A.mo11949p(obj2, view);
                    }
                    linkedHashMap3.put(cVar3, Boolean.TRUE);
                    if (cVar8.m12069j()) {
                        objMo11944k = abstractC2574A.mo11944k(obj3, obj2, null);
                        objMo11944k2 = obj5;
                    } else {
                        objMo11944k2 = abstractC2574A.mo11944k(obj5, obj2, null);
                        objMo11944k = obj3;
                    }
                    arrayList9 = arrayList;
                    z10 = z8;
                    arrayList8 = arrayList12;
                    str = str3;
                    z11 = false;
                    c2588f = this;
                    cVar4 = cVar2;
                    obj = obj4;
                    view10 = view2;
                } else if (!z12) {
                    linkedHashMap3.put(cVarM12061b, Boolean.FALSE);
                    cVar8.m12060a();
                }
            }
            z10 = true;
        }
        ArrayList arrayList14 = arrayList8;
        boolean z13 = z10;
        LinkedHashMap linkedHashMap5 = linkedHashMap3;
        String str4 = str;
        Object obj10 = obj;
        ArrayList arrayList15 = arrayList9;
        Object objMo11943j = abstractC2574A.mo11943j(objMo11944k, objMo11944k2, obj10);
        if (objMo11943j == null) {
            return linkedHashMap5;
        }
        ArrayList<c> arrayList16 = new ArrayList();
        for (Object obj11 : list) {
            if (!((c) obj11).m12063d()) {
                arrayList16.add(obj11);
            }
        }
        for (final c cVar9 : arrayList16) {
            Object objM12067h = cVar9.m12067h();
            final AbstractC2579F.c cVarM12061b2 = cVar9.m12061b();
            boolean z14 = (obj10 == null || !(cVarM12061b2 == cVar || cVarM12061b2 == cVar2)) ? false : z13;
            if (objM12067h == null && !z14) {
                str2 = str4;
            } else if (AbstractC1030Z.m4444P(m11984q())) {
                str2 = str4;
                abstractC2574A.mo11950q(cVar9.m12061b().m11997h(), objMo11943j, cVar9.m12062c(), new Runnable() { // from class: androidx.fragment.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2588f.m12052O(cVar9, cVarM12061b2);
                    }
                });
            } else {
                if (AbstractC2599q.m12289I0(2)) {
                    str2 = str4;
                    Log.v(str2, "SpecialEffectsController: Container " + m11984q() + " has not been laid out. Completing operation " + cVarM12061b2);
                } else {
                    str2 = str4;
                }
                cVar9.m12060a();
            }
            str4 = str2;
        }
        String str5 = str4;
        if (!AbstractC1030Z.m4444P(m11984q())) {
            return linkedHashMap5;
        }
        C2607y.m12517d(arrayList10, 4);
        ArrayList arrayListM11945l = abstractC2574A.m11945l(arrayList15);
        if (AbstractC2599q.m12289I0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            for (Object sharedElementFirstOutViews : arrayList14) {
                AbstractC6118n.m27186d(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view12 = (View) sharedElementFirstOutViews;
                Log.v(str5, "View: " + view12 + " Name: " + AbstractC1030Z.m4435G(view12));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            for (Object sharedElementLastInViews : arrayList15) {
                AbstractC6118n.m27186d(sharedElementLastInViews, "sharedElementLastInViews");
                View view13 = (View) sharedElementLastInViews;
                Log.v(str5, "View: " + view13 + " Name: " + AbstractC1030Z.m4435G(view13));
            }
        }
        abstractC2574A.mo11939c(m11984q(), objMo11943j);
        abstractC2574A.m11951r(m11984q(), arrayList14, arrayList15, arrayListM11945l, c2390a5);
        C2607y.m12517d(arrayList10, 0);
        abstractC2574A.mo11953t(obj10, arrayList14, arrayList15);
        return linkedHashMap5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final void m12050M(AbstractC2574A impl, View view, Rect lastInEpicenterRect) {
        AbstractC6118n.m27187e(impl, "$impl");
        AbstractC6118n.m27187e(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.m11942h(view, lastInEpicenterRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final void m12051N(ArrayList transitioningViews) {
        AbstractC6118n.m27187e(transitioningViews, "$transitioningViews");
        C2607y.m12517d(transitioningViews, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final void m12052O(c transitionInfo, AbstractC2579F.c operation) {
        AbstractC6118n.m27187e(transitionInfo, "$transitionInfo");
        AbstractC6118n.m27187e(operation, "$operation");
        transitionInfo.m12060a();
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final void m12053P(AbstractC2579F.c cVar, AbstractC2579F.c cVar2, boolean z7, C2390a lastInViews) {
        AbstractC6118n.m27187e(lastInViews, "$lastInViews");
        C2607y.m12514a(cVar.m11997h(), cVar2.m11997h(), z7, lastInViews, false);
    }

    /* JADX INFO: renamed from: Q */
    private final void m12054Q(List list) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM11997h = ((AbstractC2579F.c) AbstractC1638q.m6579S(list)).m11997h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2579F.c cVar = (AbstractC2579F.c) it.next();
            cVar.m11997h().f10141W.f10191c = abstractComponentCallbacksC2591iM11997h.f10141W.f10191c;
            cVar.m11997h().f10141W.f10192d = abstractComponentCallbacksC2591iM11997h.f10141W.f10192d;
            cVar.m11997h().f10141W.f10193e = abstractComponentCallbacksC2591iM11997h.f10141W.f10193e;
            cVar.m11997h().f10141W.f10194f = abstractComponentCallbacksC2591iM11997h.f10141W.f10194f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00cf  */
    @Override // androidx.fragment.app.AbstractC2579F
    /* JADX INFO: renamed from: j */
    public void mo11979j(List operations, boolean z7) {
        Object obj;
        Object next;
        AbstractC6118n.m27187e(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AbstractC2579F.c cVar = (AbstractC2579F.c) next;
            AbstractC2579F.c.b.a aVar = AbstractC2579F.c.b.f10035a;
            View view = cVar.m11997h().f10138T;
            AbstractC6118n.m27186d(view, "operation.fragment.mView");
            AbstractC2579F.c.b bVarM12007a = aVar.m12007a(view);
            AbstractC2579F.c.b bVar = AbstractC2579F.c.b.VISIBLE;
            if (bVarM12007a == bVar && cVar.m11996g() != bVar) {
                break;
            }
        }
        AbstractC2579F.c cVar2 = (AbstractC2579F.c) next;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            AbstractC2579F.c cVar3 = (AbstractC2579F.c) objPrevious;
            AbstractC2579F.c.b.a aVar2 = AbstractC2579F.c.b.f10035a;
            View view2 = cVar3.m11997h().f10138T;
            AbstractC6118n.m27186d(view2, "operation.fragment.mView");
            AbstractC2579F.c.b bVarM12007a2 = aVar2.m12007a(view2);
            AbstractC2579F.c.b bVar2 = AbstractC2579F.c.b.VISIBLE;
            if (bVarM12007a2 != bVar2 && cVar3.m11996g() == bVar2) {
                obj = objPrevious;
                break;
            }
        }
        AbstractC2579F.c cVar4 = (AbstractC2579F.c) obj;
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "Executing operations from " + cVar2 + " to " + cVar4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final List listJ0 = AbstractC1638q.m6596j0(operations);
        m12054Q(operations);
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            final AbstractC2579F.c cVar5 = (AbstractC2579F.c) it2.next();
            C0713e c0713e = new C0713e();
            cVar5.m12001l(c0713e);
            arrayList.add(new a(cVar5, c0713e, z7));
            C0713e c0713e2 = new C0713e();
            cVar5.m12001l(c0713e2);
            boolean z8 = false;
            if (z7) {
                if (cVar5 == cVar2) {
                    z8 = true;
                }
            } else if (cVar5 == cVar4) {
                z8 = true;
            }
            arrayList2.add(new c(cVar5, c0713e2, z7, z8));
            cVar5.m11993c(new Runnable() { // from class: h0.a
                @Override // java.lang.Runnable
                public final void run() {
                    C2588f.m12043F(listJ0, cVar5, this);
                }
            });
        }
        Map mapM12049L = m12049L(arrayList2, listJ0, z7, cVar2, cVar4);
        m12046I(arrayList, listJ0, mapM12049L.containsValue(Boolean.TRUE), mapM12049L);
        Iterator it3 = listJ0.iterator();
        while (it3.hasNext()) {
            m12041D((AbstractC2579F.c) it3.next());
        }
        listJ0.clear();
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + cVar2 + " to " + cVar4);
        }
    }
}
