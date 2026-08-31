package p314o2;

import com.google.android.gms.ads.internal.client.C3321a2;

/* JADX INFO: renamed from: o2.z */
/* JADX INFO: loaded from: classes.dex */
public final class C6574z {

    /* JADX INFO: renamed from: a */
    private final boolean f24790a;

    /* JADX INFO: renamed from: b */
    private final boolean f24791b;

    /* JADX INFO: renamed from: c */
    private final boolean f24792c;

    /* JADX INFO: renamed from: o2.z$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private boolean f24793a = true;

        /* JADX INFO: renamed from: b */
        private boolean f24794b = false;

        /* JADX INFO: renamed from: c */
        private boolean f24795c = false;

        /* JADX INFO: renamed from: a */
        public C6574z m27874a() {
            return new C6574z(this, null);
        }

        /* JADX INFO: renamed from: b */
        public a m27875b(boolean z7) {
            this.f24795c = z7;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m27876c(boolean z7) {
            this.f24794b = z7;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m27877d(boolean z7) {
            this.f24793a = z7;
            return this;
        }

        /* JADX INFO: renamed from: e */
        final /* synthetic */ boolean m27878e() {
            return this.f24793a;
        }

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean m27879f() {
            return this.f24794b;
        }

        /* JADX INFO: renamed from: g */
        final /* synthetic */ boolean m27880g() {
            return this.f24795c;
        }
    }

    public C6574z(C3321a2 c3321a2) {
        this.f24790a = c3321a2.f13910a;
        this.f24791b = c3321a2.f13911b;
        this.f24792c = c3321a2.f13912c;
    }

    /* JADX INFO: renamed from: a */
    public boolean m27871a() {
        return this.f24792c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m27872b() {
        return this.f24791b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m27873c() {
        return this.f24790a;
    }

    /* synthetic */ C6574z(a aVar, byte[] bArr) {
        this.f24790a = aVar.m27878e();
        this.f24791b = aVar.m27879f();
        this.f24792c = aVar.m27880g();
    }
}
