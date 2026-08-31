package p242f2;

/* JADX INFO: renamed from: f2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5434f {

    /* JADX INFO: renamed from: c */
    private static final C5434f f20696c = new a().m24639a();

    /* JADX INFO: renamed from: a */
    private final long f20697a;

    /* JADX INFO: renamed from: b */
    private final long f20698b;

    /* JADX INFO: renamed from: f2.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private long f20699a = 0;

        /* JADX INFO: renamed from: b */
        private long f20700b = 0;

        a() {
        }

        /* JADX INFO: renamed from: a */
        public C5434f m24639a() {
            return new C5434f(this.f20699a, this.f20700b);
        }

        /* JADX INFO: renamed from: b */
        public a m24640b(long j7) {
            this.f20700b = j7;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m24641c(long j7) {
            this.f20699a = j7;
            return this;
        }
    }

    C5434f(long j7, long j8) {
        this.f20697a = j7;
        this.f20698b = j8;
    }

    /* JADX INFO: renamed from: c */
    public static a m24636c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public long m24637a() {
        return this.f20698b;
    }

    /* JADX INFO: renamed from: b */
    public long m24638b() {
        return this.f20697a;
    }
}
