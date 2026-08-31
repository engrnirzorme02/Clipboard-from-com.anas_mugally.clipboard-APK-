package com.google.firebase.auth;

import androidx.appcompat.app.AbstractC2263x;
import java.util.Iterator;
import p192Z3.InterfaceC2112a;
import p253g5.C5518b;

/* JADX INFO: renamed from: com.google.firebase.auth.o0 */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC4871o0 implements Runnable {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ FirebaseAuth f18546a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ C5518b f18547b;

    RunnableC4871o0(FirebaseAuth firebaseAuth, C5518b c5518b) {
        this.f18546a = firebaseAuth;
        this.f18547b = c5518b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f18546a.f18442d.iterator();
        while (it.hasNext()) {
            ((InterfaceC2112a) it.next()).mo5343a(this.f18547b);
        }
        Iterator it2 = this.f18546a.f18440b.iterator();
        if (it2.hasNext()) {
            AbstractC2263x.m9328a(it2.next());
            throw null;
        }
    }
}
