package p374v4;

/* JADX INFO: renamed from: v4.x */
/* JADX INFO: loaded from: classes.dex */
public final class C7259x {

    /* JADX INFO: renamed from: a */
    private final long f29043a;

    public C7259x(long j7) {
        this.f29043a = j7;
    }

    /* JADX INFO: renamed from: a */
    public long m32185a() {
        return this.f29043a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C7259x.class == obj.getClass() && this.f29043a == ((C7259x) obj).f29043a;
    }

    public int hashCode() {
        long j7 = this.f29043a;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public String toString() {
        return "Tag{tagNumber=" + this.f29043a + '}';
    }
}
