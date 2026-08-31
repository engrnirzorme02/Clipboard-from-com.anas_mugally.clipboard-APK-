package p208b2;

import java.util.List;

/* JADX INFO: renamed from: b2.d */
/* JADX INFO: loaded from: classes.dex */
final class C2938d extends AbstractC2948n {

    /* JADX INFO: renamed from: a */
    private final List f12132a;

    C2938d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f12132a = list;
    }

    @Override // p208b2.AbstractC2948n
    /* JADX INFO: renamed from: c */
    public List mo14722c() {
        return this.f12132a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2948n) {
            return this.f12132a.equals(((AbstractC2948n) obj).mo14722c());
        }
        return false;
    }

    public int hashCode() {
        return this.f12132a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f12132a + "}";
    }
}
