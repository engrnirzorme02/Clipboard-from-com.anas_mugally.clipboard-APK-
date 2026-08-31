package com.google.firebase.firestore;

/* JADX INFO: renamed from: com.google.firebase.firestore.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4929o {

    /* JADX INFO: renamed from: a */
    private final String f18706a;

    /* JADX INFO: renamed from: b */
    private final boolean f18707b;

    /* JADX INFO: renamed from: c */
    private final boolean f18708c;

    /* JADX INFO: renamed from: d */
    private final long f18709d;

    /* JADX INFO: renamed from: com.google.firebase.firestore.o$b */
    public static final class b {

        /* JADX INFO: renamed from: e */
        private boolean f18714e = false;

        /* JADX INFO: renamed from: a */
        private String f18710a = "firestore.googleapis.com";

        /* JADX INFO: renamed from: b */
        private boolean f18711b = true;

        /* JADX INFO: renamed from: c */
        private boolean f18712c = true;

        /* JADX INFO: renamed from: d */
        private long f18713d = 104857600;

        /* JADX INFO: renamed from: a */
        static /* synthetic */ InterfaceC4936v m22181a(b bVar) {
            bVar.getClass();
            return null;
        }

        /* JADX INFO: renamed from: f */
        public C4929o m22186f() {
            if (this.f18711b || !this.f18710a.equals("firestore.googleapis.com")) {
                return new C4929o(this);
            }
            throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC4936v m22176a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public long m22177b() {
        return this.f18709d;
    }

    /* JADX INFO: renamed from: c */
    public String m22178c() {
        return this.f18706a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m22179d() {
        return this.f18708c;
    }

    /* JADX INFO: renamed from: e */
    public boolean m22180e() {
        return this.f18707b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4929o.class != obj.getClass()) {
            return false;
        }
        C4929o c4929o = (C4929o) obj;
        return this.f18707b == c4929o.f18707b && this.f18708c == c4929o.f18708c && this.f18709d == c4929o.f18709d && this.f18706a.equals(c4929o.f18706a);
    }

    public int hashCode() {
        int iHashCode = ((((this.f18706a.hashCode() * 31) + (this.f18707b ? 1 : 0)) * 31) + (this.f18708c ? 1 : 0)) * 31;
        long j7 = this.f18709d;
        return (iHashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31;
    }

    public String toString() {
        if (("FirebaseFirestoreSettings{host=" + this.f18706a + ", sslEnabled=" + this.f18707b + ", persistenceEnabled=" + this.f18708c + ", cacheSizeBytes=" + this.f18709d + ", cacheSettings=" + ((Object) null)) == null) {
            return "null";
        }
        throw null;
    }

    private C4929o(b bVar) {
        this.f18706a = bVar.f18710a;
        this.f18707b = bVar.f18711b;
        this.f18708c = bVar.f18712c;
        this.f18709d = bVar.f18713d;
        b.m22181a(bVar);
    }
}
