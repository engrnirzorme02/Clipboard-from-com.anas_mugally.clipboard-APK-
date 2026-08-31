package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: renamed from: androidx.transition.b */
/* JADX INFO: loaded from: classes.dex */
public class C2834b extends AbstractC2843k {

    /* JADX INFO: renamed from: Y */
    private static final String[] f11441Y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: Z */
    private static final Property f11442Z = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: a0 */
    private static final Property f11443a0 = new b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: b0 */
    private static final Property f11444b0 = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: c0 */
    private static final Property f11445c0 = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: d0 */
    private static final Property f11446d0 = new e(PointF.class, "position");

    /* JADX INFO: renamed from: e0 */
    private static final C2841i f11447e0 = new C2841i();

    /* JADX INFO: renamed from: X */
    private boolean f11448X = false;

    /* JADX INFO: renamed from: androidx.transition.b$a */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.m14116c(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$b */
    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.m14115a(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$c */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC2857y.m14215d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$d */
    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC2857y.m14215d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$e */
    class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            AbstractC2857y.m14215d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$f */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ i f11449a;
        private final i mViewBounds;

        f(i iVar) {
            this.f11449a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$g */
    private static class g extends AnimatorListenerAdapter implements AbstractC2843k.f {

        /* JADX INFO: renamed from: a */
        private final View f11451a;

        /* JADX INFO: renamed from: b */
        private final Rect f11452b;

        /* JADX INFO: renamed from: c */
        private final boolean f11453c;

        /* JADX INFO: renamed from: d */
        private final Rect f11454d;

        /* JADX INFO: renamed from: e */
        private final boolean f11455e;

        /* JADX INFO: renamed from: f */
        private final int f11456f;

        /* JADX INFO: renamed from: g */
        private final int f11457g;

        /* JADX INFO: renamed from: h */
        private final int f11458h;

        /* JADX INFO: renamed from: i */
        private final int f11459i;

        /* JADX INFO: renamed from: j */
        private final int f11460j;

        /* JADX INFO: renamed from: k */
        private final int f11461k;

        /* JADX INFO: renamed from: l */
        private final int f11462l;

        /* JADX INFO: renamed from: m */
        private final int f11463m;

        /* JADX INFO: renamed from: n */
        private boolean f11464n;

        g(View view, Rect rect, boolean z7, Rect rect2, boolean z8, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            this.f11451a = view;
            this.f11452b = rect;
            this.f11453c = z7;
            this.f11454d = rect2;
            this.f11455e = z8;
            this.f11456f = i7;
            this.f11457g = i8;
            this.f11458h = i9;
            this.f11459i = i10;
            this.f11460j = i11;
            this.f11461k = i12;
            this.f11462l = i13;
            this.f11463m = i14;
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: a */
        public void mo14096a(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: b */
        public void mo14097b(AbstractC2843k abstractC2843k) {
            this.f11451a.setTag(AbstractC2840h.f11496b, this.f11451a.getClipBounds());
            this.f11451a.setClipBounds(this.f11455e ? null : this.f11454d);
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: d */
        public void mo14098d(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: e */
        public void mo14099e(AbstractC2843k abstractC2843k) {
            this.f11464n = true;
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: g */
        public void mo14100g(AbstractC2843k abstractC2843k) {
            View view = this.f11451a;
            int i7 = AbstractC2840h.f11496b;
            Rect rect = (Rect) view.getTag(i7);
            this.f11451a.setTag(i7, null);
            this.f11451a.setClipBounds(rect);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z7) {
            if (this.f11464n) {
                return;
            }
            Rect rect = null;
            if (z7) {
                if (!this.f11453c) {
                    rect = this.f11452b;
                }
            } else if (!this.f11455e) {
                rect = this.f11454d;
            }
            this.f11451a.setClipBounds(rect);
            if (z7) {
                AbstractC2857y.m14215d(this.f11451a, this.f11456f, this.f11457g, this.f11458h, this.f11459i);
            } else {
                AbstractC2857y.m14215d(this.f11451a, this.f11460j, this.f11461k, this.f11462l, this.f11463m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z7) {
            int iMax = Math.max(this.f11458h - this.f11456f, this.f11462l - this.f11460j);
            int iMax2 = Math.max(this.f11459i - this.f11457g, this.f11463m - this.f11461k);
            int i7 = z7 ? this.f11460j : this.f11456f;
            int i8 = z7 ? this.f11461k : this.f11457g;
            AbstractC2857y.m14215d(this.f11451a, i7, i8, iMax + i7, iMax2 + i8);
            this.f11451a.setClipBounds(z7 ? this.f11454d : this.f11452b);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$h */
    private static class h extends AbstractC2849q {

        /* JADX INFO: renamed from: a */
        boolean f11465a = false;

        /* JADX INFO: renamed from: b */
        final ViewGroup f11466b;

        h(ViewGroup viewGroup) {
            this.f11466b = viewGroup;
        }

        @Override // androidx.transition.AbstractC2849q, androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: b */
        public void mo14097b(AbstractC2843k abstractC2843k) {
            AbstractC2856x.m14209b(this.f11466b, false);
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: d */
        public void mo14098d(AbstractC2843k abstractC2843k) {
            if (!this.f11465a) {
                AbstractC2856x.m14209b(this.f11466b, false);
            }
            abstractC2843k.mo14152T(this);
        }

        @Override // androidx.transition.AbstractC2849q, androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: e */
        public void mo14099e(AbstractC2843k abstractC2843k) {
            AbstractC2856x.m14209b(this.f11466b, false);
            this.f11465a = true;
        }

        @Override // androidx.transition.AbstractC2849q, androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: g */
        public void mo14100g(AbstractC2843k abstractC2843k) {
            AbstractC2856x.m14209b(this.f11466b, true);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$i */
    private static class i {

        /* JADX INFO: renamed from: a */
        private int f11467a;

        /* JADX INFO: renamed from: b */
        private int f11468b;

        /* JADX INFO: renamed from: c */
        private int f11469c;

        /* JADX INFO: renamed from: d */
        private int f11470d;

        /* JADX INFO: renamed from: e */
        private final View f11471e;

        /* JADX INFO: renamed from: f */
        private int f11472f;

        /* JADX INFO: renamed from: g */
        private int f11473g;

        i(View view) {
            this.f11471e = view;
        }

        /* JADX INFO: renamed from: b */
        private void m14114b() {
            AbstractC2857y.m14215d(this.f11471e, this.f11467a, this.f11468b, this.f11469c, this.f11470d);
            this.f11472f = 0;
            this.f11473g = 0;
        }

        /* JADX INFO: renamed from: a */
        void m14115a(PointF pointF) {
            this.f11469c = Math.round(pointF.x);
            this.f11470d = Math.round(pointF.y);
            int i7 = this.f11473g + 1;
            this.f11473g = i7;
            if (this.f11472f == i7) {
                m14114b();
            }
        }

        /* JADX INFO: renamed from: c */
        void m14116c(PointF pointF) {
            this.f11467a = Math.round(pointF.x);
            this.f11468b = Math.round(pointF.y);
            int i7 = this.f11472f + 1;
            this.f11472f = i7;
            if (i7 == this.f11473g) {
                m14114b();
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    private void m14103g0(C2854v c2854v) {
        View view = c2854v.f11569b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c2854v.f11568a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c2854v.f11568a.put("android:changeBounds:parent", c2854v.f11569b.getParent());
        if (this.f11448X) {
            c2854v.f11568a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: F */
    public String[] mo14084F() {
        return f11441Y;
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: f */
    public void mo14086f(C2854v c2854v) {
        m14103g0(c2854v);
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: i */
    public void mo14087i(C2854v c2854v) {
        Rect rect;
        m14103g0(c2854v);
        if (!this.f11448X || (rect = (Rect) c2854v.f11569b.getTag(AbstractC2840h.f11496b)) == null) {
            return;
        }
        c2854v.f11568a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: o */
    public Animator mo14093o(ViewGroup viewGroup, C2854v c2854v, C2854v c2854v2) {
        int i7;
        int i8;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorM14206c;
        if (c2854v == null || c2854v2 == null) {
            return null;
        }
        Map map = c2854v.f11568a;
        Map map2 = c2854v2.f11568a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = c2854v2.f11569b;
        Rect rect2 = (Rect) c2854v.f11568a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) c2854v2.f11568a.get("android:changeBounds:bounds");
        int i9 = rect2.left;
        int i10 = rect3.left;
        int i11 = rect2.top;
        int i12 = rect3.top;
        int i13 = rect2.right;
        int i14 = rect3.right;
        int i15 = rect2.bottom;
        int i16 = rect3.bottom;
        int i17 = i13 - i9;
        int i18 = i15 - i11;
        int i19 = i14 - i10;
        int i20 = i16 - i12;
        Rect rect4 = (Rect) c2854v.f11568a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) c2854v2.f11568a.get("android:changeBounds:clip");
        if ((i17 == 0 || i18 == 0) && (i19 == 0 || i20 == 0)) {
            i7 = 0;
        } else {
            i7 = (i9 == i10 && i11 == i12) ? 0 : 1;
            if (i13 != i14 || i15 != i16) {
                i7++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i7++;
        }
        if (i7 <= 0) {
            return null;
        }
        if (this.f11448X) {
            AbstractC2857y.m14215d(view, i9, i11, Math.max(i17, i19) + i9, i11 + Math.max(i18, i20));
            ObjectAnimator objectAnimatorM14124a = (i9 == i10 && i11 == i12) ? null : AbstractC2838f.m14124a(view, f11446d0, m14178w().mo14126a(i9, i11, i10, i12));
            boolean z7 = rect4 == null;
            if (z7) {
                i8 = 0;
                rect = new Rect(0, 0, i17, i18);
            } else {
                i8 = 0;
                rect = rect4;
            }
            boolean z8 = rect5 == null ? 1 : i8;
            Rect rect6 = z8 != 0 ? new Rect(i8, i8, i19, i20) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f11447e0, rect, rect6);
                g gVar = new g(view, rect, z7, rect6, z8, i9, i11, i13, i15, i10, i12, i14, i16);
                objectAnimatorOfObject.addListener(gVar);
                mo14158a(gVar);
            }
            animatorM14206c = AbstractC2853u.m14206c(objectAnimatorM14124a, objectAnimatorOfObject);
        } else {
            AbstractC2857y.m14215d(view, i9, i11, i13, i15);
            if (i7 != 2) {
                animatorM14206c = (i9 == i10 && i11 == i12) ? AbstractC2838f.m14124a(view, f11444b0, m14178w().mo14126a(i13, i15, i14, i16)) : AbstractC2838f.m14124a(view, f11445c0, m14178w().mo14126a(i9, i11, i10, i12));
            } else if (i17 == i19 && i18 == i20) {
                animatorM14206c = AbstractC2838f.m14124a(view, f11446d0, m14178w().mo14126a(i9, i11, i10, i12));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorM14124a2 = AbstractC2838f.m14124a(iVar, f11442Z, m14178w().mo14126a(i9, i11, i10, i12));
                ObjectAnimator objectAnimatorM14124a3 = AbstractC2838f.m14124a(iVar, f11443a0, m14178w().mo14126a(i13, i15, i14, i16));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorM14124a2, objectAnimatorM14124a3);
                animatorSet.addListener(new f(iVar));
                animatorM14206c = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC2856x.m14209b(viewGroup4, true);
            m14180y().mo14158a(new h(viewGroup4));
        }
        return animatorM14206c;
    }
}
