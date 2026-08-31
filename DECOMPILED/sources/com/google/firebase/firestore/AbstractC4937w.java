package com.google.firebase.firestore;

import p137R4.C1343K;
import p186Y4.AbstractC2051s;

/* JADX INFO: renamed from: com.google.firebase.firestore.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4937w {

    /* JADX INFO: renamed from: a */
    final C1343K f18729a;

    /* JADX INFO: renamed from: b */
    final FirebaseFirestore f18730b;

    AbstractC4937w(C1343K c1343k, FirebaseFirestore firebaseFirestore) {
        this.f18729a = (C1343K) AbstractC2051s.m8520a(c1343k);
        this.f18730b = (FirebaseFirestore) AbstractC2051s.m8520a(firebaseFirestore);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4937w)) {
            return false;
        }
        AbstractC4937w abstractC4937w = (AbstractC4937w) obj;
        return this.f18729a.equals(abstractC4937w.f18729a) && this.f18730b.equals(abstractC4937w.f18730b);
    }

    public int hashCode() {
        return (this.f18729a.hashCode() * 31) + this.f18730b.hashCode();
    }
}
