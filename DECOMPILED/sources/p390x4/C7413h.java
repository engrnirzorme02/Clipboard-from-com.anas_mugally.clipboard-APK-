package p390x4;

import p006A4.C0024i;

/* JADX INFO: renamed from: x4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7413h {

    /* JADX INFO: renamed from: a */
    public final long f29668a;

    /* JADX INFO: renamed from: b */
    public final C0024i f29669b;

    /* JADX INFO: renamed from: c */
    public final long f29670c;

    /* JADX INFO: renamed from: d */
    public final boolean f29671d;

    /* JADX INFO: renamed from: e */
    public final boolean f29672e;

    public C7413h(long j7, C0024i c0024i, long j8, boolean z7, boolean z8) {
        this.f29668a = j7;
        if (c0024i.m140g() && !c0024i.m139f()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.f29669b = c0024i;
        this.f29670c = j8;
        this.f29671d = z7;
        this.f29672e = z8;
    }

    /* JADX INFO: renamed from: a */
    public C7413h m32760a(boolean z7) {
        return new C7413h(this.f29668a, this.f29669b, this.f29670c, this.f29671d, z7);
    }

    /* JADX INFO: renamed from: b */
    public C7413h m32761b() {
        return new C7413h(this.f29668a, this.f29669b, this.f29670c, true, this.f29672e);
    }

    /* JADX INFO: renamed from: c */
    public C7413h m32762c(long j7) {
        return new C7413h(this.f29668a, this.f29669b, j7, this.f29671d, this.f29672e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == C7413h.class) {
            C7413h c7413h = (C7413h) obj;
            if (this.f29668a == c7413h.f29668a && this.f29669b.equals(c7413h.f29669b) && this.f29670c == c7413h.f29670c && this.f29671d == c7413h.f29671d && this.f29672e == c7413h.f29672e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((Long.valueOf(this.f29668a).hashCode() * 31) + this.f29669b.hashCode()) * 31) + Long.valueOf(this.f29670c).hashCode()) * 31) + Boolean.valueOf(this.f29671d).hashCode()) * 31) + Boolean.valueOf(this.f29672e).hashCode();
    }

    public String toString() {
        return "TrackedQuery{id=" + this.f29668a + ", querySpec=" + this.f29669b + ", lastUse=" + this.f29670c + ", complete=" + this.f29671d + ", active=" + this.f29672e + "}";
    }
}
