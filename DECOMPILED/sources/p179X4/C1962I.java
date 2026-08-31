package p179X4;

import p137R4.AbstractC1363j;
import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: X4.I */
/* JADX INFO: loaded from: classes.dex */
public class C1962I {

    /* JADX INFO: renamed from: a */
    private C1957D f6457a;

    /* JADX INFO: renamed from: b */
    private C1964K f6458b;

    /* JADX INFO: renamed from: c */
    private C1998u f6459c;

    /* JADX INFO: renamed from: d */
    private C1992o f6460d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1991n f6461e;

    /* JADX INFO: renamed from: a */
    protected InterfaceC1991n m8112a(AbstractC1363j.a aVar) {
        return new C1987j(aVar.f4786a);
    }

    /* JADX INFO: renamed from: b */
    protected C1992o m8113b(AbstractC1363j.a aVar) {
        return new C1992o(aVar.f4787b, m8121j(), m8119h());
    }

    /* JADX INFO: renamed from: c */
    protected C1998u m8114c(AbstractC1363j.a aVar) {
        return new C1998u(aVar.f4787b, aVar.f4791f, aVar.f4792g, aVar.f4788c.m5900a(), aVar.f4793h, m8120i());
    }

    /* JADX INFO: renamed from: d */
    protected C1957D m8115d(AbstractC1363j.a aVar) {
        return new C1957D(aVar.f4787b, aVar.f4786a, aVar.f4788c, new C1996s(aVar.f4791f, aVar.f4792g));
    }

    /* JADX INFO: renamed from: e */
    protected C1964K m8116e(AbstractC1363j.a aVar) {
        return new C1964K(aVar.f4788c.m5900a());
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC1991n m8117f() {
        return (InterfaceC1991n) AbstractC2034b.m8461e(this.f6461e, "connectivityMonitor not initialized yet", new Object[0]);
    }

    /* JADX INFO: renamed from: g */
    public C1992o m8118g() {
        return (C1992o) AbstractC2034b.m8461e(this.f6460d, "datastore not initialized yet", new Object[0]);
    }

    /* JADX INFO: renamed from: h */
    public C1998u m8119h() {
        return (C1998u) AbstractC2034b.m8461e(this.f6459c, "firestoreChannel not initialized yet", new Object[0]);
    }

    /* JADX INFO: renamed from: i */
    public C1957D m8120i() {
        return (C1957D) AbstractC2034b.m8461e(this.f6457a, "grpcCallProvider not initialized yet", new Object[0]);
    }

    /* JADX INFO: renamed from: j */
    public C1964K m8121j() {
        return (C1964K) AbstractC2034b.m8461e(this.f6458b, "remoteSerializer not initialized yet", new Object[0]);
    }

    /* JADX INFO: renamed from: k */
    public void m8122k(AbstractC1363j.a aVar) {
        this.f6458b = m8116e(aVar);
        this.f6457a = m8115d(aVar);
        this.f6459c = m8114c(aVar);
        this.f6460d = m8113b(aVar);
        this.f6461e = m8112a(aVar);
    }
}
