package p242f2;

/* JADX INFO: renamed from: f2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5433e {

    /* JADX INFO: renamed from: c */
    private static final C5433e f20691c = new a().m24633a();

    /* JADX INFO: renamed from: a */
    private final long f20692a;

    /* JADX INFO: renamed from: b */
    private final long f20693b;

    /* JADX INFO: renamed from: f2.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private long f20694a = 0;

        /* JADX INFO: renamed from: b */
        private long f20695b = 0;

        a() {
        }

        /* JADX INFO: renamed from: a */
        public C5433e m24633a() {
            return new C5433e(this.f20694a, this.f20695b);
        }

        /* JADX INFO: renamed from: b */
        public a m24634b(long j7) {
            this.f20694a = j7;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m24635c(long j7) {
            this.f20695b = j7;
            return this;
        }
    }

    C5433e(long j7, long j8) {
        this.f20692a = j7;
        this.f20693b = j8;
    }

    /* JADX INFO: renamed from: c */
    public static a m24630c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public long m24631a() {
        return this.f20692a;
    }

    /* JADX INFO: renamed from: b */
    public long m24632b() {
        return this.f20693b;
    }
}
