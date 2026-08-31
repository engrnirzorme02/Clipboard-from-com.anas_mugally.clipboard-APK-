package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2718t {

    /* JADX INFO: renamed from: a */
    private final long f10653a;

    /* JADX INFO: renamed from: b */
    private final long f10654b;

    /* JADX INFO: renamed from: c */
    private final int f10655c;

    public C2718t(long j7, long j8, int i7) {
        this.f10653a = j7;
        this.f10654b = j8;
        this.f10655c = i7;
    }

    /* JADX INFO: renamed from: a */
    public final long m12832a() {
        return this.f10654b;
    }

    /* JADX INFO: renamed from: b */
    public final long m12833b() {
        return this.f10653a;
    }

    /* JADX INFO: renamed from: c */
    public final int m12834c() {
        return this.f10655c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2718t)) {
            return false;
        }
        C2718t c2718t = (C2718t) obj;
        return this.f10653a == c2718t.f10653a && this.f10654b == c2718t.f10654b && this.f10655c == c2718t.f10655c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f10653a) * 31) + Long.hashCode(this.f10654b)) * 31) + Integer.hashCode(this.f10655c);
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f10653a + ", ModelVersion=" + this.f10654b + ", TopicCode=" + this.f10655c + " }");
    }
}
