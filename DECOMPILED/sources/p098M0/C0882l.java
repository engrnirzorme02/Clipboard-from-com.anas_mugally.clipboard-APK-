package p098M0;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: M0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0882l {

    /* JADX INFO: renamed from: a */
    private final Executor f3470a;

    /* JADX INFO: renamed from: b */
    private final boolean f3471b;

    /* JADX INFO: renamed from: M0.l$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final Executor f3472a;

        /* JADX INFO: renamed from: b */
        private boolean f3473b = true;

        public b(Executor executor) {
            this.f3472a = executor;
        }

        /* JADX INFO: renamed from: a */
        public C0882l m4038a() {
            return new C0882l(this.f3472a, this.f3473b);
        }

        /* JADX INFO: renamed from: b */
        public b m4039b(boolean z7) {
            this.f3473b = z7;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public Executor m4036a() {
        return this.f3470a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m4037b() {
        return this.f3471b;
    }

    private C0882l(Executor executor, boolean z7) {
        this.f3470a = executor;
        this.f3471b = z7;
    }
}
