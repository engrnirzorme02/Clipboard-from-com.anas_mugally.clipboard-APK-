package p229d5;

/* JADX INFO: renamed from: d5.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5244d {

    /* JADX INFO: renamed from: a */
    public static AbstractC5244d f19997a = m24229a().mo24207a();

    /* JADX INFO: renamed from: d5.d$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC5244d mo24207a();

        /* JADX INFO: renamed from: b */
        public abstract a mo24208b(String str);

        /* JADX INFO: renamed from: c */
        public abstract a mo24209c(long j7);

        /* JADX INFO: renamed from: d */
        public abstract a mo24210d(String str);

        /* JADX INFO: renamed from: e */
        public abstract a mo24211e(String str);

        /* JADX INFO: renamed from: f */
        public abstract a mo24212f(String str);

        /* JADX INFO: renamed from: g */
        public abstract a mo24213g(C5243c.a aVar);

        /* JADX INFO: renamed from: h */
        public abstract a mo24214h(long j7);
    }

    /* JADX INFO: renamed from: a */
    public static a m24229a() {
        return new C5241a.b().mo24214h(0L).mo24213g(C5243c.a.ATTEMPT_MIGRATION).mo24209c(0L);
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo24199b();

    /* JADX INFO: renamed from: c */
    public abstract long mo24200c();

    /* JADX INFO: renamed from: d */
    public abstract String mo24201d();

    /* JADX INFO: renamed from: e */
    public abstract String mo24202e();

    /* JADX INFO: renamed from: f */
    public abstract String mo24203f();

    /* JADX INFO: renamed from: g */
    public abstract C5243c.a mo24204g();

    /* JADX INFO: renamed from: h */
    public abstract long mo24205h();

    /* JADX INFO: renamed from: i */
    public boolean m24230i() {
        return mo24204g() == C5243c.a.REGISTER_ERROR;
    }

    /* JADX INFO: renamed from: j */
    public boolean m24231j() {
        return mo24204g() == C5243c.a.NOT_GENERATED || mo24204g() == C5243c.a.ATTEMPT_MIGRATION;
    }

    /* JADX INFO: renamed from: k */
    public boolean m24232k() {
        return mo24204g() == C5243c.a.REGISTERED;
    }

    /* JADX INFO: renamed from: l */
    public boolean m24233l() {
        return mo24204g() == C5243c.a.UNREGISTERED;
    }

    /* JADX INFO: renamed from: m */
    public boolean m24234m() {
        return mo24204g() == C5243c.a.ATTEMPT_MIGRATION;
    }

    /* JADX INFO: renamed from: n */
    public abstract a mo24206n();

    /* JADX INFO: renamed from: o */
    public AbstractC5244d m24235o(String str, long j7, long j8) {
        return mo24206n().mo24208b(str).mo24209c(j7).mo24214h(j8).mo24207a();
    }

    /* JADX INFO: renamed from: p */
    public AbstractC5244d m24236p() {
        return mo24206n().mo24208b(null).mo24207a();
    }

    /* JADX INFO: renamed from: q */
    public AbstractC5244d m24237q(String str) {
        return mo24206n().mo24211e(str).mo24213g(C5243c.a.REGISTER_ERROR).mo24207a();
    }

    /* JADX INFO: renamed from: r */
    public AbstractC5244d m24238r() {
        return mo24206n().mo24213g(C5243c.a.NOT_GENERATED).mo24207a();
    }

    /* JADX INFO: renamed from: s */
    public AbstractC5244d m24239s(String str, String str2, long j7, String str3, long j8) {
        return mo24206n().mo24210d(str).mo24213g(C5243c.a.REGISTERED).mo24208b(str3).mo24212f(str2).mo24209c(j8).mo24214h(j7).mo24207a();
    }

    /* JADX INFO: renamed from: t */
    public AbstractC5244d m24240t(String str) {
        return mo24206n().mo24210d(str).mo24213g(C5243c.a.UNREGISTERED).mo24207a();
    }
}
