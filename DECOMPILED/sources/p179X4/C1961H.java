package p179X4;

import java.util.Locale;
import p063H5.C0554l0;
import p137R4.EnumC1341I;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2049q;
import p186Y4.C2037e;

/* JADX INFO: renamed from: X4.H */
/* JADX INFO: loaded from: classes.dex */
class C1961H {

    /* JADX INFO: renamed from: b */
    private int f6452b;

    /* JADX INFO: renamed from: c */
    private C2037e.b f6453c;

    /* JADX INFO: renamed from: e */
    private final C2037e f6455e;

    /* JADX INFO: renamed from: f */
    private final a f6456f;

    /* JADX INFO: renamed from: a */
    private EnumC1341I f6451a = EnumC1341I.UNKNOWN;

    /* JADX INFO: renamed from: d */
    private boolean f6454d = true;

    /* JADX INFO: renamed from: X4.H$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo8111a(EnumC1341I enumC1341I);
    }

    C1961H(C2037e c2037e, a aVar) {
        this.f6455e = c2037e;
        this.f6456f = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8103a(C1961H c1961h) {
        c1961h.f6453c = null;
        AbstractC2034b.m8460d(c1961h.f6451a == EnumC1341I.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        c1961h.m8105f(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", 10));
        c1961h.m8106g(EnumC1341I.OFFLINE);
    }

    /* JADX INFO: renamed from: b */
    private void m8104b() {
        C2037e.b bVar = this.f6453c;
        if (bVar != null) {
            bVar.m8481c();
            this.f6453c = null;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m8105f(String str) {
        String str2 = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", str);
        if (!this.f6454d) {
            AbstractC2049q.m8502a("OnlineStateTracker", "%s", str2);
        } else {
            AbstractC2049q.m8505d("OnlineStateTracker", "%s", str2);
            this.f6454d = false;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m8106g(EnumC1341I enumC1341I) {
        if (enumC1341I != this.f6451a) {
            this.f6451a = enumC1341I;
            this.f6456f.mo8111a(enumC1341I);
        }
    }

    /* JADX INFO: renamed from: c */
    EnumC1341I m8107c() {
        return this.f6451a;
    }

    /* JADX INFO: renamed from: d */
    void m8108d(C0554l0 c0554l0) {
        if (this.f6451a == EnumC1341I.ONLINE) {
            m8106g(EnumC1341I.UNKNOWN);
            AbstractC2034b.m8460d(this.f6452b == 0, "watchStreamFailures must be 0", new Object[0]);
            AbstractC2034b.m8460d(this.f6453c == null, "onlineStateTimer must be null", new Object[0]);
            return;
        }
        int i7 = this.f6452b + 1;
        this.f6452b = i7;
        if (i7 >= 1) {
            m8104b();
            m8105f(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", 1, c0554l0));
            m8106g(EnumC1341I.OFFLINE);
        }
    }

    /* JADX INFO: renamed from: e */
    void m8109e() {
        if (this.f6452b == 0) {
            m8106g(EnumC1341I.UNKNOWN);
            AbstractC2034b.m8460d(this.f6453c == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.f6453c = this.f6455e.m8470h(C2037e.d.ONLINE_STATE_TIMEOUT, 10000L, new Runnable() { // from class: X4.G
                @Override // java.lang.Runnable
                public final void run() {
                    C1961H.m8103a(this.f6450a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    void m8110h(EnumC1341I enumC1341I) {
        m8104b();
        this.f6452b = 0;
        if (enumC1341I == EnumC1341I.ONLINE) {
            this.f6454d = false;
        }
        m8106g(enumC1341I);
    }
}
