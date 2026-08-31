package com.google.firebase.firestore;

import p137R4.C1379z;
import p186Y4.C2037e;
import p186Y4.InterfaceC2047o;

/* JADX INFO: renamed from: com.google.firebase.firestore.p */
/* JADX INFO: loaded from: classes.dex */
final class C4930p {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2047o f18715a;

    /* JADX INFO: renamed from: b */
    private C1379z f18716b;

    /* JADX INFO: renamed from: c */
    private C2037e f18717c = new C2037e();

    C4930p(InterfaceC2047o interfaceC2047o) {
        this.f18715a = interfaceC2047o;
    }

    /* JADX INFO: renamed from: a */
    synchronized Object m22187a(InterfaceC2047o interfaceC2047o) {
        m22188b();
        return interfaceC2047o.apply(this.f18716b);
    }

    /* JADX INFO: renamed from: b */
    synchronized void m22188b() {
        if (!m22189c()) {
            this.f18716b = (C1379z) this.f18715a.apply(this.f18717c);
        }
    }

    /* JADX INFO: renamed from: c */
    boolean m22189c() {
        return this.f18716b != null;
    }
}
