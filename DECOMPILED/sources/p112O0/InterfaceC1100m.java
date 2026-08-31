package p112O0;

/* JADX INFO: renamed from: O0.m */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1100m {

    /* JADX INFO: renamed from: a */
    public static final b.c f3962a;

    /* JADX INFO: renamed from: b */
    public static final b.C7638b f3963b;

    /* JADX INFO: renamed from: O0.m$b */
    public static abstract class b {

        /* JADX INFO: renamed from: O0.m$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            private final Throwable f3964a;

            public a(Throwable th) {
                this.f3964a = th;
            }

            /* JADX INFO: renamed from: a */
            public Throwable m4857a() {
                return this.f3964a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f3964a.getMessage());
            }
        }

        /* JADX INFO: renamed from: O0.m$b$b, reason: collision with other inner class name */
        public static final class C7638b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C7638b() {
            }
        }

        /* JADX INFO: renamed from: O0.m$b$c */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f3962a = new b.c();
        f3963b = new b.C7638b();
    }
}
