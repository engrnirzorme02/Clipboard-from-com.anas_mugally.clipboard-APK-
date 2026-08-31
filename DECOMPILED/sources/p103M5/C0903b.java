package p103M5;

import p087K5.C0756e;

/* JADX INFO: renamed from: M5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0903b {

    /* JADX INFO: renamed from: a */
    private final C0902a f3542a;

    /* JADX INFO: renamed from: b */
    private final C0756e f3543b;

    /* JADX INFO: renamed from: M5.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private C0902a f3544a;

        /* JADX INFO: renamed from: b */
        private C0756e.b f3545b = new C0756e.b();

        /* JADX INFO: renamed from: c */
        public C0903b m4122c() {
            if (this.f3544a != null) {
                return new C0903b(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* JADX INFO: renamed from: d */
        public b m4123d(String str, String str2) {
            this.f3545b.m3558f(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m4124e(C0902a c0902a) {
            if (c0902a == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f3544a = c0902a;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public C0756e m4118a() {
        return this.f3543b;
    }

    /* JADX INFO: renamed from: b */
    public C0902a m4119b() {
        return this.f3542a;
    }

    public String toString() {
        return "Request{url=" + this.f3542a + '}';
    }

    private C0903b(b bVar) {
        this.f3542a = bVar.f3544a;
        this.f3543b = bVar.f3545b.m3556c();
    }
}
