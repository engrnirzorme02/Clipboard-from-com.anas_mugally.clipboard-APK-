package com.google.firebase.firestore;

import p186Y4.AbstractC2032B;

/* JADX INFO: renamed from: com.google.firebase.firestore.s */
/* JADX INFO: loaded from: classes.dex */
public class C4933s implements Comparable {

    /* JADX INFO: renamed from: a */
    private final double f18724a;

    /* JADX INFO: renamed from: b */
    private final double f18725b;

    public C4933s(double d7, double d8) {
        if (Double.isNaN(d7) || d7 < -90.0d || d7 > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        }
        if (Double.isNaN(d8) || d8 < -180.0d || d8 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        this.f18724a = d7;
        this.f18725b = d8;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4933s c4933s) {
        int iM8445j = AbstractC2032B.m8445j(this.f18724a, c4933s.f18724a);
        return iM8445j == 0 ? AbstractC2032B.m8445j(this.f18725b, c4933s.f18725b) : iM8445j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4933s)) {
            return false;
        }
        C4933s c4933s = (C4933s) obj;
        return this.f18724a == c4933s.f18724a && this.f18725b == c4933s.f18725b;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f18724a);
        int i7 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f18725b);
        return (i7 * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public String toString() {
        return "GeoPoint { latitude=" + this.f18724a + ", longitude=" + this.f18725b + " }";
    }
}
