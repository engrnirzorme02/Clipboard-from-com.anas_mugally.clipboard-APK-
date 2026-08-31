package com.google.firebase.firestore;

import com.google.protobuf.AbstractC5104i;
import p186Y4.AbstractC2032B;
import p186Y4.AbstractC2051s;

/* JADX INFO: renamed from: com.google.firebase.firestore.a */
/* JADX INFO: loaded from: classes.dex */
public class C4915a implements Comparable {

    /* JADX INFO: renamed from: a */
    private final AbstractC5104i f18658a;

    private C4915a(AbstractC5104i abstractC5104i) {
        this.f18658a = abstractC5104i;
    }

    /* JADX INFO: renamed from: d */
    public static C4915a m22150d(AbstractC5104i abstractC5104i) {
        AbstractC2051s.m8521b(abstractC5104i, "Provided ByteString must not be null.");
        return new C4915a(abstractC5104i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4915a c4915a) {
        return AbstractC2032B.m8444i(this.f18658a, c4915a.f18658a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4915a) && this.f18658a.equals(((C4915a) obj).f18658a);
    }

    public int hashCode() {
        return this.f18658a.hashCode();
    }

    public String toString() {
        return "Blob { bytes=" + AbstractC2032B.m8455t(this.f18658a) + " }";
    }
}
