package com.google.firebase.firestore;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.firebase.firestore.B */
/* JADX INFO: loaded from: classes.dex */
public class C4913B {

    /* JADX INFO: renamed from: a */
    private final double[] f18645a;

    C4913B(double[] dArr) {
        this.f18645a = dArr == null ? new double[0] : (double[]) dArr.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f18645a, ((C4913B) obj).f18645a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f18645a);
    }
}
