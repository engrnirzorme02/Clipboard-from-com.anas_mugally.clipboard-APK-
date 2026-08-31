package com.google.firebase.firestore;

import p137R4.C1343K;
import p158U4.C1696t;
import p186Y4.AbstractC2051s;

/* JADX INFO: renamed from: com.google.firebase.firestore.b */
/* JADX INFO: loaded from: classes.dex */
public class C4916b extends AbstractC4937w {
    C4916b(C1696t c1696t, FirebaseFirestore firebaseFirestore) {
        super(C1343K.m5744b(c1696t), firebaseFirestore);
        if (c1696t.m7063v() % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + c1696t.mo7057h() + " has " + c1696t.m7063v());
    }

    /* JADX INFO: renamed from: a */
    public C4923i m22152a(String str) {
        AbstractC2051s.m8521b(str, "Provided document path must not be null.");
        return C4923i.m22161i((C1696t) this.f18729a.m5760l().m7055c(C1696t.m7147A(str)), this.f18730b);
    }
}
