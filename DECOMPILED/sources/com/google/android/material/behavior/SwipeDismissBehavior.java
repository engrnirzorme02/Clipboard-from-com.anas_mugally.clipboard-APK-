package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p111O.AbstractC1030Z;
import p118P.C1170s;
import p118P.InterfaceC1173v;
import p153U.C1650c;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC2423c {

    /* JADX INFO: renamed from: a */
    C1650c f16406a;

    /* JADX INFO: renamed from: b */
    InterfaceC4411c f16407b;

    /* JADX INFO: renamed from: c */
    private boolean f16408c;

    /* JADX INFO: renamed from: d */
    private boolean f16409d;

    /* JADX INFO: renamed from: f */
    private boolean f16411f;

    /* JADX INFO: renamed from: e */
    private float f16410e = 0.0f;

    /* JADX INFO: renamed from: r */
    int f16412r = 2;

    /* JADX INFO: renamed from: s */
    float f16413s = 0.5f;

    /* JADX INFO: renamed from: t */
    float f16414t = 0.0f;

    /* JADX INFO: renamed from: u */
    float f16415u = 0.5f;

    /* JADX INFO: renamed from: v */
    private final C1650c.c f16416v = new C4409a();

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C4409a extends C1650c.c {

        /* JADX INFO: renamed from: a */
        private int f16417a;

        /* JADX INFO: renamed from: b */
        private int f16418b = -1;

        C4409a() {
        }

        /* JADX INFO: renamed from: n */
        private boolean m19581n(View view, float f7) {
            if (f7 == 0.0f) {
                return Math.abs(view.getLeft() - this.f16417a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f16413s);
            }
            boolean z7 = view.getLayoutDirection() == 1;
            int i7 = SwipeDismissBehavior.this.f16412r;
            if (i7 == 2) {
                return true;
            }
            if (i7 == 0) {
                if (z7) {
                    return f7 < 0.0f;
                }
                return f7 > 0.0f;
            }
            if (i7 == 1) {
                if (z7) {
                    return f7 > 0.0f;
                }
                if (f7 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: a */
        public int mo6886a(View view, int i7, int i8) {
            int width;
            int width2;
            int width3;
            boolean z7 = view.getLayoutDirection() == 1;
            int i9 = SwipeDismissBehavior.this.f16412r;
            if (i9 == 0) {
                if (z7) {
                    width = this.f16417a - view.getWidth();
                    width2 = this.f16417a;
                } else {
                    width = this.f16417a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i9 != 1) {
                width = this.f16417a - view.getWidth();
                width2 = view.getWidth() + this.f16417a;
            } else if (z7) {
                width = this.f16417a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f16417a - view.getWidth();
                width2 = this.f16417a;
            }
            return SwipeDismissBehavior.m19572L(width, i7, width2);
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: b */
        public int mo6887b(View view, int i7, int i8) {
            return view.getTop();
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: d */
        public int mo6889d(View view) {
            return view.getWidth();
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: i */
        public void mo6894i(View view, int i7) {
            this.f16418b = i7;
            this.f16417a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f16409d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f16409d = false;
            }
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: j */
        public void mo6895j(int i7) {
            InterfaceC4411c interfaceC4411c = SwipeDismissBehavior.this.f16407b;
            if (interfaceC4411c != null) {
                interfaceC4411c.mo19583b(i7);
            }
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: k */
        public void mo6896k(View view, int i7, int i8, int i9, int i10) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f16414t;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f16415u;
            float fAbs = Math.abs(i7 - this.f16417a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m19571K(0.0f, 1.0f - SwipeDismissBehavior.m19574N(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: l */
        public void mo6897l(View view, float f7, float f8) {
            int i7;
            boolean z7;
            InterfaceC4411c interfaceC4411c;
            this.f16418b = -1;
            int width = view.getWidth();
            if (m19581n(view, f7)) {
                if (f7 >= 0.0f) {
                    int left = view.getLeft();
                    int i8 = this.f16417a;
                    if (left < i8) {
                        i7 = this.f16417a - width;
                    } else {
                        i7 = i8 + width;
                    }
                } else {
                    i7 = this.f16417a - width;
                }
                z7 = true;
            } else {
                i7 = this.f16417a;
                z7 = false;
            }
            if (SwipeDismissBehavior.this.f16406a.m6872O(i7, view.getTop())) {
                view.postOnAnimation(new RunnableC4412d(view, z7));
            } else {
                if (!z7 || (interfaceC4411c = SwipeDismissBehavior.this.f16407b) == null) {
                    return;
                }
                interfaceC4411c.mo19582a(view);
            }
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: m */
        public boolean mo6898m(View view, int i7) {
            int i8 = this.f16418b;
            return (i8 == -1 || i8 == i7) && SwipeDismissBehavior.this.mo19576J(view);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    class C4410b implements InterfaceC1173v {
        C4410b() {
        }

        @Override // p118P.InterfaceC1173v
        /* JADX INFO: renamed from: a */
        public boolean mo3201a(View view, InterfaceC1173v.a aVar) {
            if (!SwipeDismissBehavior.this.mo19576J(view)) {
                return false;
            }
            boolean z7 = view.getLayoutDirection() == 1;
            int i7 = SwipeDismissBehavior.this.f16412r;
            AbstractC1030Z.m4448T(view, (!(i7 == 0 && z7) && (i7 != 1 || z7)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            InterfaceC4411c interfaceC4411c = SwipeDismissBehavior.this.f16407b;
            if (interfaceC4411c != null) {
                interfaceC4411c.mo19582a(view);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface InterfaceC4411c {
        /* JADX INFO: renamed from: a */
        void mo19582a(View view);

        /* JADX INFO: renamed from: b */
        void mo19583b(int i7);
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    private class RunnableC4412d implements Runnable {

        /* JADX INFO: renamed from: a */
        private final View f16421a;

        /* JADX INFO: renamed from: b */
        private final boolean f16422b;

        RunnableC4412d(View view, boolean z7) {
            this.f16421a = view;
            this.f16422b = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4411c interfaceC4411c;
            C1650c c1650c = SwipeDismissBehavior.this.f16406a;
            if (c1650c != null && c1650c.m6880m(true)) {
                this.f16421a.postOnAnimation(this);
            } else {
                if (!this.f16422b || (interfaceC4411c = SwipeDismissBehavior.this.f16407b) == null) {
                    return;
                }
                interfaceC4411c.mo19582a(this.f16421a);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    static float m19571K(float f7, float f8, float f9) {
        return Math.min(Math.max(f7, f8), f9);
    }

    /* JADX INFO: renamed from: L */
    static int m19572L(int i7, int i8, int i9) {
        return Math.min(Math.max(i7, i8), i9);
    }

    /* JADX INFO: renamed from: M */
    private void m19573M(ViewGroup viewGroup) {
        if (this.f16406a == null) {
            this.f16406a = this.f16411f ? C1650c.m6855n(viewGroup, this.f16410e, this.f16416v) : C1650c.m6856o(viewGroup, this.f16416v);
        }
    }

    /* JADX INFO: renamed from: N */
    static float m19574N(float f7, float f8, float f9) {
        return (f9 - f7) / (f8 - f7);
    }

    /* JADX INFO: renamed from: S */
    private void m19575S(View view) {
        AbstractC1030Z.m4462d0(view, 1048576);
        if (mo19576J(view)) {
            AbstractC1030Z.m4466f0(view, C1170s.a.f4129y, null, new C4410b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: H */
    public boolean mo10499H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f16406a == null) {
            return false;
        }
        if (this.f16409d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f16406a.m6867F(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public boolean mo19576J(View view) {
        return true;
    }

    /* JADX INFO: renamed from: O */
    public void m19577O(float f7) {
        this.f16415u = m19571K(0.0f, f7, 1.0f);
    }

    /* JADX INFO: renamed from: P */
    public void m19578P(InterfaceC4411c interfaceC4411c) {
        this.f16407b = interfaceC4411c;
    }

    /* JADX INFO: renamed from: Q */
    public void m19579Q(float f7) {
        this.f16414t = m19571K(0.0f, f7, 1.0f);
    }

    /* JADX INFO: renamed from: R */
    public void m19580R(int i7) {
        this.f16412r = i7;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: o */
    public boolean mo10510o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM10473F = this.f16408c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM10473F = coordinatorLayout.m10473F(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f16408c = zM10473F;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f16408c = false;
        }
        if (zM10473F) {
            m19573M(coordinatorLayout);
            if (!this.f16409d && this.f16406a.m6873P(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: p */
    public boolean mo10511p(CoordinatorLayout coordinatorLayout, View view, int i7) {
        boolean zMo10511p = super.mo10511p(coordinatorLayout, view, i7);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            m19575S(view);
        }
        return zMo10511p;
    }
}
