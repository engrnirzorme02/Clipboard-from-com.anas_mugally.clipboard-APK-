package p111O;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: O.J */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0999J implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    private final View f3786a;

    /* JADX INFO: renamed from: b */
    private ViewTreeObserver f3787b;

    /* JADX INFO: renamed from: c */
    private final Runnable f3788c;

    private ViewTreeObserverOnPreDrawListenerC0999J(View view, Runnable runnable) {
        this.f3786a = view;
        this.f3787b = view.getViewTreeObserver();
        this.f3788c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC0999J m4375a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0999J viewTreeObserverOnPreDrawListenerC0999J = new ViewTreeObserverOnPreDrawListenerC0999J(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0999J);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0999J);
        return viewTreeObserverOnPreDrawListenerC0999J;
    }

    /* JADX INFO: renamed from: b */
    public void m4376b() {
        if (this.f3787b.isAlive()) {
            this.f3787b.removeOnPreDrawListener(this);
        } else {
            this.f3786a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3786a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m4376b();
        this.f3788c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f3787b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m4376b();
    }
}
