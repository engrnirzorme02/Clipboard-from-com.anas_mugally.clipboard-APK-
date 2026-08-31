package p063H5;

import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0512G {

    /* JADX INFO: renamed from: a */
    public static final C0531a.c f1929a = C0531a.c.m2319a("internal:io.grpc.config-selector");

    /* JADX INFO: renamed from: H5.G$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final C0554l0 f1930a;

        /* JADX INFO: renamed from: b */
        private final Object f1931b;

        /* JADX INFO: renamed from: H5.G$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private Object f1932a;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a */
            public b m2156a() {
                AbstractC1209m.m5309u(this.f1932a != null, "config is not set");
                return new b(C0554l0.f2098e, this.f1932a, null);
            }

            /* JADX INFO: renamed from: b */
            public a m2157b(Object obj) {
                this.f1932a = AbstractC1209m.m5303o(obj, "config");
                return this;
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: d */
        public static a m2152d() {
            return new a();
        }

        /* JADX INFO: renamed from: a */
        public Object m2153a() {
            return this.f1931b;
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC0545h m2154b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public C0554l0 m2155c() {
            return this.f1930a;
        }

        private b(C0554l0 c0554l0, Object obj, InterfaceC0545h interfaceC0545h) {
            this.f1930a = (C0554l0) AbstractC1209m.m5303o(c0554l0, "status");
            this.f1931b = obj;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract b mo2151a(AbstractC0523S.g gVar);
}
