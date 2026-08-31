package p208b2;

/* JADX INFO: renamed from: b2.l */
/* JADX INFO: loaded from: classes.dex */
final class C2946l extends AbstractC2956v {

    /* JADX INFO: renamed from: a */
    private final long f12181a;

    C2946l(long j7) {
        this.f12181a = j7;
    }

    @Override // p208b2.AbstractC2956v
    /* JADX INFO: renamed from: c */
    public long mo14778c() {
        return this.f12181a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC2956v) && this.f12181a == ((AbstractC2956v) obj).mo14778c();
    }

    public int hashCode() {
        long j7 = this.f12181a;
        return ((int) (j7 ^ (j7 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f12181a + "}";
    }
}
