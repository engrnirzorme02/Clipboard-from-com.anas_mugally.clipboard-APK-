package p111O;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: O.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1053i0 {

    /* JADX INFO: renamed from: a */
    private final WeakReference f3862a;

    /* JADX INFO: renamed from: O.i0$a */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1055j0 f3863a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f3864b;

        a(InterfaceC1055j0 interfaceC1055j0, View view) {
            this.f3863a = interfaceC1055j0;
            this.f3864b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3863a.mo4695a(this.f3864b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3863a.mo4696b(this.f3864b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3863a.mo4697c(this.f3864b);
        }
    }

    C1053i0(View view) {
        this.f3862a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: h */
    private void m4683h(View view, InterfaceC1055j0 interfaceC1055j0) {
        if (interfaceC1055j0 != null) {
            view.animate().setListener(new a(interfaceC1055j0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public C1053i0 m4684b(float f7) {
        View view = (View) this.f3862a.get();
        if (view != null) {
            view.animate().alpha(f7);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m4685c() {
        View view = (View) this.f3862a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public long m4686d() {
        View view = (View) this.f3862a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public C1053i0 m4687e(long j7) {
        View view = (View) this.f3862a.get();
        if (view != null) {
            view.animate().setDuration(j7);
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C1053i0 m4688f(Interpolator interpolator) {
        View view = (View) this.f3862a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C1053i0 m4689g(InterfaceC1055j0 interfaceC1055j0) {
        View view = (View) this.f3862a.get();
        if (view != null) {
            m4683h(view, interfaceC1055j0);
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C1053i0 m4690i(long j7) {
        View view = (View) this.f3862a.get();
        if (view != null) {
            view.animate().setStartDelay(j7);
        }
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C1053i0 m4691j(final InterfaceC1059l0 interfaceC1059l0) {
        final View view = (View) this.f3862a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC1059l0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: O.h0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC1059l0.mo4700a(view);
                }
            } : null);
        }
        return this;
    }

    /* JADX INFO: renamed from: k */
    public void m4692k() {
        View view = (View) this.f3862a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* JADX INFO: renamed from: l */
    public C1053i0 m4693l(float f7) {
        View view = (View) this.f3862a.get();
        if (view != null) {
            view.animate().translationY(f7);
        }
        return this;
    }
}
