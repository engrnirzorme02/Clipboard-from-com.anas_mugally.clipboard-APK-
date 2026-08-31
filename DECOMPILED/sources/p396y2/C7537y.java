package p396y2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Objects;

/* JADX INFO: renamed from: y2.y */
/* JADX INFO: loaded from: classes.dex */
final class C7537y extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ViewOnClickListenerC7506A f30172a;

    C7537y(ViewOnClickListenerC7506A viewOnClickListenerC7506A) {
        Objects.requireNonNull(viewOnClickListenerC7506A);
        this.f30172a = viewOnClickListenerC7506A;
    }

    /* JADX INFO: renamed from: a */
    private final void m33169a(boolean z7) {
        ViewOnClickListenerC7506A viewOnClickListenerC7506A = this.f30172a;
        viewOnClickListenerC7506A.setEnabled(z7);
        viewOnClickListenerC7506A.m33138b().setEnabled(z7);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        m33169a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m33169a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        m33169a(false);
    }
}
