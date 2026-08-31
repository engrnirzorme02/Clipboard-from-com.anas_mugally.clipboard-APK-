package p190Z1;

/* JADX INFO: renamed from: Z1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2085c {

    /* JADX INFO: renamed from: Z1.c$b */
    private static class b extends AbstractC2085c {

        /* JADX INFO: renamed from: a */
        private volatile boolean f6873a;

        b() {
            super();
        }

        @Override // p190Z1.AbstractC2085c
        /* JADX INFO: renamed from: b */
        public void mo8611b(boolean z7) {
            this.f6873a = z7;
        }

        @Override // p190Z1.AbstractC2085c
        /* JADX INFO: renamed from: c */
        public void mo8612c() {
            if (this.f6873a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC2085c m8610a() {
        return new b();
    }

    /* JADX INFO: renamed from: b */
    abstract void mo8611b(boolean z7);

    /* JADX INFO: renamed from: c */
    public abstract void mo8612c();

    private AbstractC2085c() {
    }
}
