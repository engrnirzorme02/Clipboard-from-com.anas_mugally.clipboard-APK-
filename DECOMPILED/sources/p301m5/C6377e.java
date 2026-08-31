package p301m5;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: m5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6377e {

    /* JADX INFO: renamed from: a */
    private final EnumC6376d f24381a;

    /* JADX INFO: renamed from: b */
    private final EnumC6376d f24382b;

    /* JADX INFO: renamed from: c */
    private final double f24383c;

    public C6377e(EnumC6376d performance, EnumC6376d crashlytics, double d7) {
        AbstractC6118n.m27187e(performance, "performance");
        AbstractC6118n.m27187e(crashlytics, "crashlytics");
        this.f24381a = performance;
        this.f24382b = crashlytics;
        this.f24383c = d7;
    }

    /* JADX INFO: renamed from: a */
    public final EnumC6376d m27490a() {
        return this.f24382b;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC6376d m27491b() {
        return this.f24381a;
    }

    /* JADX INFO: renamed from: c */
    public final double m27492c() {
        return this.f24383c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6377e)) {
            return false;
        }
        C6377e c6377e = (C6377e) obj;
        return this.f24381a == c6377e.f24381a && this.f24382b == c6377e.f24382b && Double.compare(this.f24383c, c6377e.f24383c) == 0;
    }

    public int hashCode() {
        return (((this.f24381a.hashCode() * 31) + this.f24382b.hashCode()) * 31) + Double.hashCode(this.f24383c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f24381a + ", crashlytics=" + this.f24382b + ", sessionSamplingRate=" + this.f24383c + ')';
    }
}
