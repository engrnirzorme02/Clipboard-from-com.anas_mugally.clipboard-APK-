package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a */
/* JADX INFO: loaded from: classes2.dex */
class C4516a {

    /* JADX INFO: renamed from: a */
    private Animator f17101a;

    C4516a() {
    }

    /* JADX INFO: renamed from: a */
    public void m20515a() {
        Animator animator = this.f17101a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m20516b() {
        this.f17101a = null;
    }

    /* JADX INFO: renamed from: c */
    public void m20517c(Animator animator) {
        m20515a();
        this.f17101a = animator;
    }
}
