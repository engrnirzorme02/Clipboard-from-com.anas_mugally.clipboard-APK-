package p111O;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: O.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1007N {

    /* JADX INFO: renamed from: a */
    private final c f3793a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O.N$a */
    static class a extends c {

        /* JADX INFO: renamed from: a */
        private final View f3794a;

        a(View view) {
            this.f3794a = view;
        }

        @Override // p111O.C1007N.c
        /* JADX INFO: renamed from: a */
        void mo4392a() {
            View view = this.f3794a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f3794a.getWindowToken(), 0);
            }
        }

        @Override // p111O.C1007N.c
        /* JADX INFO: renamed from: b */
        void mo4393b() {
            final View viewFindViewById = this.f3794a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f3794a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: O.M
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O.N$c */
    private static class c {
        c() {
        }

        /* JADX INFO: renamed from: a */
        abstract void mo4392a();

        /* JADX INFO: renamed from: b */
        abstract void mo4393b();
    }

    public C1007N(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3793a = new b(view);
        } else {
            this.f3793a = new a(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4389a() {
        this.f3793a.mo4392a();
    }

    /* JADX INFO: renamed from: b */
    public void m4390b() {
        this.f3793a.mo4393b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O.N$b */
    static class b extends a {

        /* JADX INFO: renamed from: b */
        private View f3795b;

        /* JADX INFO: renamed from: c */
        private WindowInsetsController f3796c;

        b(View view) {
            super(view);
            this.f3795b = view;
        }

        @Override // p111O.C1007N.a, p111O.C1007N.c
        /* JADX INFO: renamed from: a */
        void mo4392a() {
            View view;
            WindowInsetsController windowInsetsController = this.f3796c;
            if (windowInsetsController == null) {
                View view2 = this.f3795b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.mo4392a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: O.V
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i7) {
                    atomicBoolean.set((i7 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f3795b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f3795b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // p111O.C1007N.a, p111O.C1007N.c
        /* JADX INFO: renamed from: b */
        void mo4393b() {
            View view = this.f3795b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f3796c;
            if (windowInsetsController == null) {
                View view2 = this.f3795b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.mo4393b();
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f3796c = windowInsetsController;
        }
    }

    C1007N(WindowInsetsController windowInsetsController) {
        this.f3793a = new b(windowInsetsController);
    }
}
