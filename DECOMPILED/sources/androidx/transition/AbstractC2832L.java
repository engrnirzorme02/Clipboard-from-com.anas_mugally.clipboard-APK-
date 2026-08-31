package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2832L extends AbstractC2843k {

    /* JADX INFO: renamed from: Y */
    private static final String[] f11422Y = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: X */
    private int f11423X = 3;

    /* JADX INFO: renamed from: androidx.transition.L$a */
    private static class a extends AnimatorListenerAdapter implements AbstractC2843k.f {

        /* JADX INFO: renamed from: a */
        private final View f11424a;

        /* JADX INFO: renamed from: b */
        private final int f11425b;

        /* JADX INFO: renamed from: c */
        private final ViewGroup f11426c;

        /* JADX INFO: renamed from: d */
        private final boolean f11427d;

        /* JADX INFO: renamed from: e */
        private boolean f11428e;

        /* JADX INFO: renamed from: f */
        boolean f11429f = false;

        a(View view, int i7, boolean z7) {
            this.f11424a = view;
            this.f11425b = i7;
            this.f11426c = (ViewGroup) view.getParent();
            this.f11427d = z7;
            m14095i(true);
        }

        /* JADX INFO: renamed from: h */
        private void m14094h() {
            if (!this.f11429f) {
                AbstractC2857y.m14217f(this.f11424a, this.f11425b);
                ViewGroup viewGroup = this.f11426c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m14095i(false);
        }

        /* JADX INFO: renamed from: i */
        private void m14095i(boolean z7) {
            ViewGroup viewGroup;
            if (!this.f11427d || this.f11428e == z7 || (viewGroup = this.f11426c) == null) {
                return;
            }
            this.f11428e = z7;
            AbstractC2856x.m14209b(viewGroup, z7);
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: a */
        public void mo14096a(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: b */
        public void mo14097b(AbstractC2843k abstractC2843k) {
            m14095i(false);
            if (this.f11429f) {
                return;
            }
            AbstractC2857y.m14217f(this.f11424a, this.f11425b);
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: d */
        public void mo14098d(AbstractC2843k abstractC2843k) {
            abstractC2843k.mo14152T(this);
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: e */
        public void mo14099e(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: g */
        public void mo14100g(AbstractC2843k abstractC2843k) {
            m14095i(true);
            if (this.f11429f) {
                return;
            }
            AbstractC2857y.m14217f(this.f11424a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11429f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m14094h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z7) {
            if (z7) {
                return;
            }
            m14094h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z7) {
            if (z7) {
                AbstractC2857y.m14217f(this.f11424a, 0);
                ViewGroup viewGroup = this.f11426c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.L$b */
    private class b extends AnimatorListenerAdapter implements AbstractC2843k.f {

        /* JADX INFO: renamed from: a */
        private final ViewGroup f11430a;

        /* JADX INFO: renamed from: b */
        private final View f11431b;

        /* JADX INFO: renamed from: c */
        private final View f11432c;

        /* JADX INFO: renamed from: d */
        private boolean f11433d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f11430a = viewGroup;
            this.f11431b = view;
            this.f11432c = view2;
        }

        /* JADX INFO: renamed from: h */
        private void m14101h() {
            this.f11432c.setTag(AbstractC2840h.f11495a, null);
            this.f11430a.getOverlay().remove(this.f11431b);
            this.f11433d = false;
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: a */
        public void mo14096a(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: b */
        public void mo14097b(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: d */
        public void mo14098d(AbstractC2843k abstractC2843k) {
            abstractC2843k.mo14152T(this);
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: e */
        public void mo14099e(AbstractC2843k abstractC2843k) {
            if (this.f11433d) {
                m14101h();
            }
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: g */
        public void mo14100g(AbstractC2843k abstractC2843k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m14101h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f11430a.getOverlay().remove(this.f11431b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f11431b.getParent() == null) {
                this.f11430a.getOverlay().add(this.f11431b);
            } else {
                AbstractC2832L.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z7) {
            if (z7) {
                this.f11432c.setTag(AbstractC2840h.f11495a, this.f11431b);
                this.f11430a.getOverlay().add(this.f11431b);
                this.f11433d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z7) {
            if (z7) {
                return;
            }
            m14101h();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.L$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        boolean f11435a;

        /* JADX INFO: renamed from: b */
        boolean f11436b;

        /* JADX INFO: renamed from: c */
        int f11437c;

        /* JADX INFO: renamed from: d */
        int f11438d;

        /* JADX INFO: renamed from: e */
        ViewGroup f11439e;

        /* JADX INFO: renamed from: f */
        ViewGroup f11440f;

        c() {
        }
    }

    /* JADX INFO: renamed from: g0 */
    private void m14082g0(C2854v c2854v) {
        c2854v.f11568a.put("android:visibility:visibility", Integer.valueOf(c2854v.f11569b.getVisibility()));
        c2854v.f11568a.put("android:visibility:parent", c2854v.f11569b.getParent());
        int[] iArr = new int[2];
        c2854v.f11569b.getLocationOnScreen(iArr);
        c2854v.f11568a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: h0 */
    private c m14083h0(C2854v c2854v, C2854v c2854v2) {
        c cVar = new c();
        cVar.f11435a = false;
        cVar.f11436b = false;
        if (c2854v == null || !c2854v.f11568a.containsKey("android:visibility:visibility")) {
            cVar.f11437c = -1;
            cVar.f11439e = null;
        } else {
            cVar.f11437c = ((Integer) c2854v.f11568a.get("android:visibility:visibility")).intValue();
            cVar.f11439e = (ViewGroup) c2854v.f11568a.get("android:visibility:parent");
        }
        if (c2854v2 == null || !c2854v2.f11568a.containsKey("android:visibility:visibility")) {
            cVar.f11438d = -1;
            cVar.f11440f = null;
        } else {
            cVar.f11438d = ((Integer) c2854v2.f11568a.get("android:visibility:visibility")).intValue();
            cVar.f11440f = (ViewGroup) c2854v2.f11568a.get("android:visibility:parent");
        }
        if (c2854v != null && c2854v2 != null) {
            int i7 = cVar.f11437c;
            int i8 = cVar.f11438d;
            if (i7 != i8 || cVar.f11439e != cVar.f11440f) {
                if (i7 != i8) {
                    if (i7 == 0) {
                        cVar.f11436b = false;
                        cVar.f11435a = true;
                        return cVar;
                    }
                    if (i8 == 0) {
                        cVar.f11436b = true;
                        cVar.f11435a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f11440f == null) {
                        cVar.f11436b = false;
                        cVar.f11435a = true;
                        return cVar;
                    }
                    if (cVar.f11439e == null) {
                        cVar.f11436b = true;
                        cVar.f11435a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (c2854v == null && cVar.f11438d == 0) {
                cVar.f11436b = true;
                cVar.f11435a = true;
                return cVar;
            }
            if (c2854v2 == null && cVar.f11437c == 0) {
                cVar.f11436b = false;
                cVar.f11435a = true;
            }
        }
        return cVar;
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: F */
    public String[] mo14084F() {
        return f11422Y;
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: H */
    public boolean mo14085H(C2854v c2854v, C2854v c2854v2) {
        if (c2854v == null && c2854v2 == null) {
            return false;
        }
        if (c2854v != null && c2854v2 != null && c2854v2.f11568a.containsKey("android:visibility:visibility") != c2854v.f11568a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarM14083h0 = m14083h0(c2854v, c2854v2);
        return cVarM14083h0.f11435a && (cVarM14083h0.f11437c == 0 || cVarM14083h0.f11438d == 0);
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: f */
    public void mo14086f(C2854v c2854v) {
        m14082g0(c2854v);
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: i */
    public void mo14087i(C2854v c2854v) {
        m14082g0(c2854v);
    }

    /* JADX INFO: renamed from: i0 */
    public abstract Animator mo14088i0(ViewGroup viewGroup, View view, C2854v c2854v, C2854v c2854v2);

    /* JADX INFO: renamed from: j0 */
    public Animator m14089j0(ViewGroup viewGroup, C2854v c2854v, int i7, C2854v c2854v2, int i8) {
        if ((this.f11423X & 1) != 1 || c2854v2 == null) {
            return null;
        }
        if (c2854v == null) {
            View view = (View) c2854v2.f11569b.getParent();
            if (m14083h0(m14176u(view, false), m14147G(view, false)).f11435a) {
                return null;
            }
        }
        return mo14088i0(viewGroup, c2854v2.f11569b, c2854v, c2854v2);
    }

    /* JADX INFO: renamed from: k0 */
    public abstract Animator mo14090k0(ViewGroup viewGroup, View view, C2854v c2854v, C2854v c2854v2);

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    /* JADX INFO: renamed from: l0 */
    public Animator m14091l0(ViewGroup viewGroup, C2854v c2854v, int i7, C2854v c2854v2, int i8) {
        View view;
        boolean z7;
        View view2;
        boolean z8;
        if ((this.f11423X & 2) != 2 || c2854v == null) {
            return null;
        }
        View view3 = c2854v.f11569b;
        View viewM14204a = c2854v2 != null ? c2854v2.f11569b : null;
        int i9 = AbstractC2840h.f11495a;
        View view4 = (View) view3.getTag(i9);
        if (view4 != null) {
            view2 = null;
            z8 = true;
        } else {
            if (viewM14204a == null || viewM14204a.getParent() == null) {
                if (viewM14204a != null) {
                    view = null;
                    z7 = false;
                } else {
                    viewM14204a = null;
                    view = null;
                    z7 = true;
                }
            } else if (i8 == 4 || view3 == viewM14204a) {
                view = viewM14204a;
                z7 = false;
                viewM14204a = null;
            } else {
                viewM14204a = null;
                view = null;
                z7 = true;
            }
            if (z7) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (m14083h0(m14147G(view5, true), m14176u(view5, true)).f11435a) {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.f11511H) {
                            }
                        } else {
                            viewM14204a = AbstractC2853u.m14204a(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewM14204a;
                    view2 = view6;
                    z8 = false;
                }
                view2 = view;
                z8 = false;
                view4 = view3;
            } else {
                View view7 = view;
                view4 = viewM14204a;
                view2 = view7;
                z8 = false;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            AbstractC2857y.m14217f(view2, 0);
            Animator animatorMo14090k0 = mo14090k0(viewGroup, view2, c2854v, c2854v2);
            if (animatorMo14090k0 == null) {
                AbstractC2857y.m14217f(view2, visibility);
                return animatorMo14090k0;
            }
            a aVar = new a(view2, i8, true);
            animatorMo14090k0.addListener(aVar);
            m14180y().mo14158a(aVar);
            return animatorMo14090k0;
        }
        if (!z8) {
            int[] iArr = (int[]) c2854v.f11568a.get("android:visibility:screenLocation");
            int i10 = iArr[0];
            int i11 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i10 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i11 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorMo14090k1 = mo14090k0(viewGroup, view4, c2854v, c2854v2);
        if (!z8) {
            if (animatorMo14090k1 == null) {
                viewGroup.getOverlay().remove(view4);
                return animatorMo14090k1;
            }
            view3.setTag(i9, view4);
            b bVar = new b(viewGroup, view4, view3);
            animatorMo14090k1.addListener(bVar);
            animatorMo14090k1.addPauseListener(bVar);
            m14180y().mo14158a(bVar);
        }
        return animatorMo14090k1;
    }

    /* JADX INFO: renamed from: m0 */
    public void m14092m0(int i7) {
        if ((i7 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f11423X = i7;
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: o */
    public Animator mo14093o(ViewGroup viewGroup, C2854v c2854v, C2854v c2854v2) {
        c cVarM14083h0 = m14083h0(c2854v, c2854v2);
        if (!cVarM14083h0.f11435a) {
            return null;
        }
        if (cVarM14083h0.f11439e == null && cVarM14083h0.f11440f == null) {
            return null;
        }
        return cVarM14083h0.f11436b ? m14089j0(viewGroup, c2854v, cVarM14083h0.f11437c, c2854v2, cVarM14083h0.f11438d) : m14091l0(viewGroup, c2854v, cVarM14083h0.f11437c, c2854v2, cVarM14083h0.f11438d);
    }
}
