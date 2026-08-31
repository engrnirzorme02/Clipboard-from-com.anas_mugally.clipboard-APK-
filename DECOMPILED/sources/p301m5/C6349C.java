package p301m5;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: m5.C */
/* JADX INFO: loaded from: classes.dex */
public final class C6349C {

    /* JADX INFO: renamed from: a */
    private final String f24209a;

    /* JADX INFO: renamed from: b */
    private final int f24210b;

    /* JADX INFO: renamed from: c */
    private final int f24211c;

    /* JADX INFO: renamed from: d */
    private final boolean f24212d;

    public C6349C(String processName, int i7, int i8, boolean z7) {
        AbstractC6118n.m27187e(processName, "processName");
        this.f24209a = processName;
        this.f24210b = i7;
        this.f24211c = i8;
        this.f24212d = z7;
    }

    /* JADX INFO: renamed from: a */
    public final int m27371a() {
        return this.f24211c;
    }

    /* JADX INFO: renamed from: b */
    public final int m27372b() {
        return this.f24210b;
    }

    /* JADX INFO: renamed from: c */
    public final String m27373c() {
        return this.f24209a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m27374d() {
        return this.f24212d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6349C)) {
            return false;
        }
        C6349C c6349c = (C6349C) obj;
        return AbstractC6118n.m27183a(this.f24209a, c6349c.f24209a) && this.f24210b == c6349c.f24210b && this.f24211c == c6349c.f24211c && this.f24212d == c6349c.f24212d;
    }

    public int hashCode() {
        return (((((this.f24209a.hashCode() * 31) + Integer.hashCode(this.f24210b)) * 31) + Integer.hashCode(this.f24211c)) * 31) + Boolean.hashCode(this.f24212d);
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f24209a + ", pid=" + this.f24210b + ", importance=" + this.f24211c + ", isDefaultProcess=" + this.f24212d + ')';
    }
}
