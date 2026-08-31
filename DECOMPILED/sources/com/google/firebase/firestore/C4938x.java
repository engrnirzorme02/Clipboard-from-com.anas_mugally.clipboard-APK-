package com.google.firebase.firestore;

/* JADX INFO: renamed from: com.google.firebase.firestore.x */
/* JADX INFO: loaded from: classes.dex */
public class C4938x {

    /* JADX INFO: renamed from: a */
    private final boolean f18731a;

    /* JADX INFO: renamed from: b */
    private final boolean f18732b;

    C4938x(boolean z7, boolean z8) {
        this.f18731a = z7;
        this.f18732b = z8;
    }

    /* JADX INFO: renamed from: a */
    public boolean m22193a() {
        return this.f18732b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4938x)) {
            return false;
        }
        C4938x c4938x = (C4938x) obj;
        return this.f18731a == c4938x.f18731a && this.f18732b == c4938x.f18732b;
    }

    public int hashCode() {
        return ((this.f18731a ? 1 : 0) * 31) + (this.f18732b ? 1 : 0);
    }

    public String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.f18731a + ", isFromCache=" + this.f18732b + '}';
    }
}
