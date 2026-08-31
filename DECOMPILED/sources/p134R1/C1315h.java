package p134R1;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p091L1.C0796P;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: R1.h */
/* JADX INFO: loaded from: classes.dex */
final class C1315h implements InterfaceC1316i {

    /* JADX INFO: renamed from: a */
    final Set f4600a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    volatile boolean f4601b;

    /* JADX INFO: renamed from: R1.h$a */
    class a implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f4602a;

        /* JADX INFO: renamed from: R1.h$a$a, reason: collision with other inner class name */
        class RunnableC7646a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f4604a;

            RunnableC7646a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f4604a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0796P.m3726b().m3732h();
                C1315h.this.f4601b = true;
                C1315h.m5658b(a.this.f4602a, this.f4604a);
                C1315h.this.f4600a.clear();
            }
        }

        a(View view) {
            this.f4602a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AbstractC2023l.m8431v(new RunnableC7646a(this));
        }
    }

    C1315h() {
    }

    /* JADX INFO: renamed from: b */
    static void m5658b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // p134R1.InterfaceC1316i
    /* JADX INFO: renamed from: a */
    public void mo5656a(Activity activity) {
        if (!this.f4601b && this.f4600a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
