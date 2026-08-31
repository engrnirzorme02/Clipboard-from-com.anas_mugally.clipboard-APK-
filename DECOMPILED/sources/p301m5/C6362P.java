package p301m5;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: m5.P */
/* JADX INFO: loaded from: classes.dex */
public final class C6362P {

    /* JADX INFO: renamed from: a */
    private final String f24260a;

    /* JADX INFO: renamed from: b */
    private final String f24261b;

    /* JADX INFO: renamed from: c */
    private final int f24262c;

    /* JADX INFO: renamed from: d */
    private final long f24263d;

    /* JADX INFO: renamed from: e */
    private final C6377e f24264e;

    /* JADX INFO: renamed from: f */
    private final String f24265f;

    /* JADX INFO: renamed from: g */
    private final String f24266g;

    public C6362P(String sessionId, String firstSessionId, int i7, long j7, C6377e dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        AbstractC6118n.m27187e(sessionId, "sessionId");
        AbstractC6118n.m27187e(firstSessionId, "firstSessionId");
        AbstractC6118n.m27187e(dataCollectionStatus, "dataCollectionStatus");
        AbstractC6118n.m27187e(firebaseInstallationId, "firebaseInstallationId");
        AbstractC6118n.m27187e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f24260a = sessionId;
        this.f24261b = firstSessionId;
        this.f24262c = i7;
        this.f24263d = j7;
        this.f24264e = dataCollectionStatus;
        this.f24265f = firebaseInstallationId;
        this.f24266g = firebaseAuthenticationToken;
    }

    /* JADX INFO: renamed from: a */
    public final C6377e m27424a() {
        return this.f24264e;
    }

    /* JADX INFO: renamed from: b */
    public final long m27425b() {
        return this.f24263d;
    }

    /* JADX INFO: renamed from: c */
    public final String m27426c() {
        return this.f24266g;
    }

    /* JADX INFO: renamed from: d */
    public final String m27427d() {
        return this.f24265f;
    }

    /* JADX INFO: renamed from: e */
    public final String m27428e() {
        return this.f24261b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6362P)) {
            return false;
        }
        C6362P c6362p = (C6362P) obj;
        return AbstractC6118n.m27183a(this.f24260a, c6362p.f24260a) && AbstractC6118n.m27183a(this.f24261b, c6362p.f24261b) && this.f24262c == c6362p.f24262c && this.f24263d == c6362p.f24263d && AbstractC6118n.m27183a(this.f24264e, c6362p.f24264e) && AbstractC6118n.m27183a(this.f24265f, c6362p.f24265f) && AbstractC6118n.m27183a(this.f24266g, c6362p.f24266g);
    }

    /* JADX INFO: renamed from: f */
    public final String m27429f() {
        return this.f24260a;
    }

    /* JADX INFO: renamed from: g */
    public final int m27430g() {
        return this.f24262c;
    }

    public int hashCode() {
        return (((((((((((this.f24260a.hashCode() * 31) + this.f24261b.hashCode()) * 31) + Integer.hashCode(this.f24262c)) * 31) + Long.hashCode(this.f24263d)) * 31) + this.f24264e.hashCode()) * 31) + this.f24265f.hashCode()) * 31) + this.f24266g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f24260a + ", firstSessionId=" + this.f24261b + ", sessionIndex=" + this.f24262c + ", eventTimestampUs=" + this.f24263d + ", dataCollectionStatus=" + this.f24264e + ", firebaseInstallationId=" + this.f24265f + ", firebaseAuthenticationToken=" + this.f24266g + ')';
    }
}
