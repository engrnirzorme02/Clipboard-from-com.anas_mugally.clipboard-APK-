package com.google.firebase.installations;

/* JADX INFO: renamed from: com.google.firebase.installations.a */
/* JADX INFO: loaded from: classes.dex */
final class C4941a extends AbstractC4947g {

    /* JADX INFO: renamed from: a */
    private final String f18738a;

    /* JADX INFO: renamed from: b */
    private final long f18739b;

    /* JADX INFO: renamed from: c */
    private final long f18740c;

    /* JADX INFO: renamed from: com.google.firebase.installations.a$b */
    static final class b extends AbstractC4947g.a {

        /* JADX INFO: renamed from: a */
        private String f18741a;

        /* JADX INFO: renamed from: b */
        private Long f18742b;

        /* JADX INFO: renamed from: c */
        private Long f18743c;

        b() {
        }

        @Override // com.google.firebase.installations.AbstractC4947g.a
        /* JADX INFO: renamed from: a */
        public AbstractC4947g mo22200a() {
            String str = "";
            if (this.f18741a == null) {
                str = " token";
            }
            if (this.f18742b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f18743c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C4941a(this.f18741a, this.f18742b.longValue(), this.f18743c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.AbstractC4947g.a
        /* JADX INFO: renamed from: b */
        public AbstractC4947g.a mo22201b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f18741a = str;
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC4947g.a
        /* JADX INFO: renamed from: c */
        public AbstractC4947g.a mo22202c(long j7) {
            this.f18743c = Long.valueOf(j7);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC4947g.a
        /* JADX INFO: renamed from: d */
        public AbstractC4947g.a mo22203d(long j7) {
            this.f18742b = Long.valueOf(j7);
            return this;
        }
    }

    @Override // com.google.firebase.installations.AbstractC4947g
    /* JADX INFO: renamed from: b */
    public String mo22197b() {
        return this.f18738a;
    }

    @Override // com.google.firebase.installations.AbstractC4947g
    /* JADX INFO: renamed from: c */
    public long mo22198c() {
        return this.f18740c;
    }

    @Override // com.google.firebase.installations.AbstractC4947g
    /* JADX INFO: renamed from: d */
    public long mo22199d() {
        return this.f18739b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4947g) {
            AbstractC4947g abstractC4947g = (AbstractC4947g) obj;
            if (this.f18738a.equals(abstractC4947g.mo22197b()) && this.f18739b == abstractC4947g.mo22199d() && this.f18740c == abstractC4947g.mo22198c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f18738a.hashCode() ^ 1000003) * 1000003;
        long j7 = this.f18739b;
        long j8 = this.f18740c;
        return ((iHashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f18738a + ", tokenExpirationTimestamp=" + this.f18739b + ", tokenCreationTimestamp=" + this.f18740c + "}";
    }

    private C4941a(String str, long j7, long j8) {
        this.f18738a = str;
        this.f18739b = j7;
        this.f18740c = j8;
    }
}
