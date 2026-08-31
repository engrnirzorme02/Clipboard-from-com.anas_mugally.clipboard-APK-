package p403z1;

/* JADX INFO: renamed from: z1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7567i {

    /* JADX INFO: renamed from: a */
    private final String f30219a;

    /* JADX INFO: renamed from: z1.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private String f30220a;

        /* synthetic */ a(AbstractC7582x abstractC7582x) {
        }

        /* JADX INFO: renamed from: a */
        public C7567i m33266a() {
            if (this.f30220a != null) {
                return new C7567i(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        /* JADX INFO: renamed from: b */
        public a m33267b(String str) {
            this.f30220a = str;
            return this;
        }
    }

    /* synthetic */ C7567i(a aVar, AbstractC7582x abstractC7582x) {
        this.f30219a = aVar.f30220a;
    }

    /* JADX INFO: renamed from: a */
    public static a m33263a() {
        return new a(null);
    }

    /* JADX INFO: renamed from: b */
    public final String m33264b() {
        return this.f30219a;
    }
}
