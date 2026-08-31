package com.google.firebase.auth;

import androidx.appcompat.app.AbstractC2263x;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.firebase.auth.q0 */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC4875q0 implements Runnable {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ FirebaseAuth f18549a;

    RunnableC4875q0(FirebaseAuth firebaseAuth) {
        this.f18549a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f18549a.f18441c.iterator();
        if (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            throw null;
        }
    }
}
