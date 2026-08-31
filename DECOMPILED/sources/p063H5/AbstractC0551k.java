package p063H5;

import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0551k extends AbstractC0560o0 {

    /* JADX INFO: renamed from: a */
    public static final C0535c.c f2088a = C0535c.c.m2365b("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED");

    /* JADX INFO: renamed from: H5.k$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC0551k mo2432a(b bVar, C0530Z c0530z);
    }

    /* JADX INFO: renamed from: H5.k$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final C0535c f2089a;

        /* JADX INFO: renamed from: b */
        private final int f2090b;

        /* JADX INFO: renamed from: c */
        private final boolean f2091c;

        /* JADX INFO: renamed from: H5.k$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private C0535c f2092a = C0535c.f2023k;

            /* JADX INFO: renamed from: b */
            private int f2093b;

            /* JADX INFO: renamed from: c */
            private boolean f2094c;

            a() {
            }

            /* JADX INFO: renamed from: a */
            public b m2434a() {
                return new b(this.f2092a, this.f2093b, this.f2094c);
            }

            /* JADX INFO: renamed from: b */
            public a m2435b(C0535c c0535c) {
                this.f2092a = (C0535c) AbstractC1209m.m5303o(c0535c, "callOptions cannot be null");
                return this;
            }

            /* JADX INFO: renamed from: c */
            public a m2436c(boolean z7) {
                this.f2094c = z7;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public a m2437d(int i7) {
                this.f2093b = i7;
                return this;
            }
        }

        b(C0535c c0535c, int i7, boolean z7) {
            this.f2089a = (C0535c) AbstractC1209m.m5303o(c0535c, "callOptions");
            this.f2090b = i7;
            this.f2091c = z7;
        }

        /* JADX INFO: renamed from: a */
        public static a m2433a() {
            return new a();
        }

        public String toString() {
            return AbstractC1203g.m5267b(this).m5277d("callOptions", this.f2089a).m5275b("previousAttempts", this.f2090b).m5278e("isTransparentRetry", this.f2091c).toString();
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo2427j() {
    }

    /* JADX INFO: renamed from: k */
    public void mo2428k() {
    }

    /* JADX INFO: renamed from: l */
    public void mo2429l(C0530Z c0530z) {
    }

    /* JADX INFO: renamed from: m */
    public void mo2430m() {
    }

    /* JADX INFO: renamed from: n */
    public void mo2431n(C0531a c0531a, C0530Z c0530z) {
    }
}
