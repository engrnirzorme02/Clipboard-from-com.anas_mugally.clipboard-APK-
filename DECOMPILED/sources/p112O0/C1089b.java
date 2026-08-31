package p112O0;

/* JADX INFO: renamed from: O0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1089b {

    /* JADX INFO: renamed from: i */
    public static final C1089b f3923i = new a().m4828a();

    /* JADX INFO: renamed from: a */
    private EnumC1098k f3924a;

    /* JADX INFO: renamed from: b */
    private boolean f3925b;

    /* JADX INFO: renamed from: c */
    private boolean f3926c;

    /* JADX INFO: renamed from: d */
    private boolean f3927d;

    /* JADX INFO: renamed from: e */
    private boolean f3928e;

    /* JADX INFO: renamed from: f */
    private long f3929f;

    /* JADX INFO: renamed from: g */
    private long f3930g;

    /* JADX INFO: renamed from: h */
    private C1090c f3931h;

    /* JADX INFO: renamed from: O0.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        boolean f3932a = false;

        /* JADX INFO: renamed from: b */
        boolean f3933b = false;

        /* JADX INFO: renamed from: c */
        EnumC1098k f3934c = EnumC1098k.NOT_REQUIRED;

        /* JADX INFO: renamed from: d */
        boolean f3935d = false;

        /* JADX INFO: renamed from: e */
        boolean f3936e = false;

        /* JADX INFO: renamed from: f */
        long f3937f = -1;

        /* JADX INFO: renamed from: g */
        long f3938g = -1;

        /* JADX INFO: renamed from: h */
        C1090c f3939h = new C1090c();

        /* JADX INFO: renamed from: a */
        public C1089b m4828a() {
            return new C1089b(this);
        }

        /* JADX INFO: renamed from: b */
        public a m4829b(EnumC1098k enumC1098k) {
            this.f3934c = enumC1098k;
            return this;
        }
    }

    public C1089b() {
        this.f3924a = EnumC1098k.NOT_REQUIRED;
        this.f3929f = -1L;
        this.f3930g = -1L;
        this.f3931h = new C1090c();
    }

    /* JADX INFO: renamed from: a */
    public C1090c m4811a() {
        return this.f3931h;
    }

    /* JADX INFO: renamed from: b */
    public EnumC1098k m4812b() {
        return this.f3924a;
    }

    /* JADX INFO: renamed from: c */
    public long m4813c() {
        return this.f3929f;
    }

    /* JADX INFO: renamed from: d */
    public long m4814d() {
        return this.f3930g;
    }

    /* JADX INFO: renamed from: e */
    public boolean m4815e() {
        return this.f3931h.m4832c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1089b.class != obj.getClass()) {
            return false;
        }
        C1089b c1089b = (C1089b) obj;
        if (this.f3925b == c1089b.f3925b && this.f3926c == c1089b.f3926c && this.f3927d == c1089b.f3927d && this.f3928e == c1089b.f3928e && this.f3929f == c1089b.f3929f && this.f3930g == c1089b.f3930g && this.f3924a == c1089b.f3924a) {
            return this.f3931h.equals(c1089b.f3931h);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m4816f() {
        return this.f3927d;
    }

    /* JADX INFO: renamed from: g */
    public boolean m4817g() {
        return this.f3925b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m4818h() {
        return this.f3926c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f3924a.hashCode() * 31) + (this.f3925b ? 1 : 0)) * 31) + (this.f3926c ? 1 : 0)) * 31) + (this.f3927d ? 1 : 0)) * 31) + (this.f3928e ? 1 : 0)) * 31;
        long j7 = this.f3929f;
        int i7 = (iHashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f3930g;
        return ((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f3931h.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public boolean m4819i() {
        return this.f3928e;
    }

    /* JADX INFO: renamed from: j */
    public void m4820j(C1090c c1090c) {
        this.f3931h = c1090c;
    }

    /* JADX INFO: renamed from: k */
    public void m4821k(EnumC1098k enumC1098k) {
        this.f3924a = enumC1098k;
    }

    /* JADX INFO: renamed from: l */
    public void m4822l(boolean z7) {
        this.f3927d = z7;
    }

    /* JADX INFO: renamed from: m */
    public void m4823m(boolean z7) {
        this.f3925b = z7;
    }

    /* JADX INFO: renamed from: n */
    public void m4824n(boolean z7) {
        this.f3926c = z7;
    }

    /* JADX INFO: renamed from: o */
    public void m4825o(boolean z7) {
        this.f3928e = z7;
    }

    /* JADX INFO: renamed from: p */
    public void m4826p(long j7) {
        this.f3929f = j7;
    }

    /* JADX INFO: renamed from: q */
    public void m4827q(long j7) {
        this.f3930g = j7;
    }

    C1089b(a aVar) {
        this.f3924a = EnumC1098k.NOT_REQUIRED;
        this.f3929f = -1L;
        this.f3930g = -1L;
        this.f3931h = new C1090c();
        this.f3925b = aVar.f3932a;
        this.f3926c = aVar.f3933b;
        this.f3924a = aVar.f3934c;
        this.f3927d = aVar.f3935d;
        this.f3928e = aVar.f3936e;
        this.f3931h = aVar.f3939h;
        this.f3929f = aVar.f3937f;
        this.f3930g = aVar.f3938g;
    }

    public C1089b(C1089b c1089b) {
        this.f3924a = EnumC1098k.NOT_REQUIRED;
        this.f3929f = -1L;
        this.f3930g = -1L;
        this.f3931h = new C1090c();
        this.f3925b = c1089b.f3925b;
        this.f3926c = c1089b.f3926c;
        this.f3924a = c1089b.f3924a;
        this.f3927d = c1089b.f3927d;
        this.f3928e = c1089b.f3928e;
        this.f3931h = c1089b.f3931h;
    }
}
