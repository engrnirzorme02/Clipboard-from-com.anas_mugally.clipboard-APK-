package p403z1;

/* JADX INFO: renamed from: z1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7559a {

    /* JADX INFO: renamed from: a */
    private String f30215a;

    /* JADX INFO: renamed from: z1.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private String f30216a;

        /* synthetic */ a(AbstractC7569k abstractC7569k) {
        }

        /* JADX INFO: renamed from: a */
        public C7559a m33260a() {
            String str = this.f30216a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C7559a c7559a = new C7559a(null);
            c7559a.f30215a = str;
            return c7559a;
        }

        /* JADX INFO: renamed from: b */
        public a m33261b(String str) {
            this.f30216a = str;
            return this;
        }
    }

    /* synthetic */ C7559a(AbstractC7569k abstractC7569k) {
    }

    /* JADX INFO: renamed from: b */
    public static a m33257b() {
        return new a(null);
    }

    /* JADX INFO: renamed from: a */
    public String m33259a() {
        return this.f30215a;
    }
}
