package p276j4;

/* JADX INFO: renamed from: j4.k */
/* JADX INFO: loaded from: classes.dex */
final class C5880k extends AbstractC5868F.e.c {

    /* JADX INFO: renamed from: a */
    private final int f23307a;

    /* JADX INFO: renamed from: b */
    private final String f23308b;

    /* JADX INFO: renamed from: c */
    private final int f23309c;

    /* JADX INFO: renamed from: d */
    private final long f23310d;

    /* JADX INFO: renamed from: e */
    private final long f23311e;

    /* JADX INFO: renamed from: f */
    private final boolean f23312f;

    /* JADX INFO: renamed from: g */
    private final int f23313g;

    /* JADX INFO: renamed from: h */
    private final String f23314h;

    /* JADX INFO: renamed from: i */
    private final String f23315i;

    /* JADX INFO: renamed from: j4.k$b */
    static final class b extends AbstractC5868F.e.c.a {

        /* JADX INFO: renamed from: a */
        private int f23316a;

        /* JADX INFO: renamed from: b */
        private String f23317b;

        /* JADX INFO: renamed from: c */
        private int f23318c;

        /* JADX INFO: renamed from: d */
        private long f23319d;

        /* JADX INFO: renamed from: e */
        private long f23320e;

        /* JADX INFO: renamed from: f */
        private boolean f23321f;

        /* JADX INFO: renamed from: g */
        private int f23322g;

        /* JADX INFO: renamed from: h */
        private String f23323h;

        /* JADX INFO: renamed from: i */
        private String f23324i;

        /* JADX INFO: renamed from: j */
        private byte f23325j;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.c.a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.c mo26441a() {
            String str;
            String str2;
            String str3;
            if (this.f23325j == 63 && (str = this.f23317b) != null && (str2 = this.f23323h) != null && (str3 = this.f23324i) != null) {
                return new C5880k(this.f23316a, str, this.f23318c, this.f23319d, this.f23320e, this.f23321f, this.f23322g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f23325j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f23317b == null) {
                sb.append(" model");
            }
            if ((this.f23325j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.f23325j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.f23325j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.f23325j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.f23325j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f23323h == null) {
                sb.append(" manufacturer");
            }
            if (this.f23324i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.c.a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.c.a mo26442b(int i7) {
            this.f23316a = i7;
            this.f23325j = (byte) (this.f23325j | 1);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.c.a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.c.a mo26443c(int i7) {
            this.f23318c = i7;
            this.f23325j = (byte) (this.f23325j | 2);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.c.a
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.c.a mo26444d(long j7) {
            this.f23320e = j7;
            this.f23325j = (byte) (this.f23325j | 8);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.c.a
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.e.c.a mo26445e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f23323h = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.c.a
        /* JADX INFO: renamed from: f */
        public AbstractC5868F.e.c.a mo26446f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f23317b = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.c.a
        /* JADX INFO: renamed from: g */
        public AbstractC5868F.e.c.a mo26447g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f23324i = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.c.a
        /* JADX INFO: renamed from: h */
        public AbstractC5868F.e.c.a mo26448h(long j7) {
            this.f23319d = j7;
            this.f23325j = (byte) (this.f23325j | 4);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.c.a
        /* JADX INFO: renamed from: i */
        public AbstractC5868F.e.c.a mo26449i(boolean z7) {
            this.f23321f = z7;
            this.f23325j = (byte) (this.f23325j | 16);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.c.a
        /* JADX INFO: renamed from: j */
        public AbstractC5868F.e.c.a mo26450j(int i7) {
            this.f23322g = i7;
            this.f23325j = (byte) (this.f23325j | 32);
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.c
    /* JADX INFO: renamed from: b */
    public int mo26432b() {
        return this.f23307a;
    }

    @Override // p276j4.AbstractC5868F.e.c
    /* JADX INFO: renamed from: c */
    public int mo26433c() {
        return this.f23309c;
    }

    @Override // p276j4.AbstractC5868F.e.c
    /* JADX INFO: renamed from: d */
    public long mo26434d() {
        return this.f23311e;
    }

    @Override // p276j4.AbstractC5868F.e.c
    /* JADX INFO: renamed from: e */
    public String mo26435e() {
        return this.f23314h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.c) {
            AbstractC5868F.e.c cVar = (AbstractC5868F.e.c) obj;
            if (this.f23307a == cVar.mo26432b() && this.f23308b.equals(cVar.mo26436f()) && this.f23309c == cVar.mo26433c() && this.f23310d == cVar.mo26438h() && this.f23311e == cVar.mo26434d() && this.f23312f == cVar.mo26440j() && this.f23313g == cVar.mo26439i() && this.f23314h.equals(cVar.mo26435e()) && this.f23315i.equals(cVar.mo26437g())) {
                return true;
            }
        }
        return false;
    }

    @Override // p276j4.AbstractC5868F.e.c
    /* JADX INFO: renamed from: f */
    public String mo26436f() {
        return this.f23308b;
    }

    @Override // p276j4.AbstractC5868F.e.c
    /* JADX INFO: renamed from: g */
    public String mo26437g() {
        return this.f23315i;
    }

    @Override // p276j4.AbstractC5868F.e.c
    /* JADX INFO: renamed from: h */
    public long mo26438h() {
        return this.f23310d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f23307a ^ 1000003) * 1000003) ^ this.f23308b.hashCode()) * 1000003) ^ this.f23309c) * 1000003;
        long j7 = this.f23310d;
        int i7 = (iHashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f23311e;
        return ((((((((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ (this.f23312f ? 1231 : 1237)) * 1000003) ^ this.f23313g) * 1000003) ^ this.f23314h.hashCode()) * 1000003) ^ this.f23315i.hashCode();
    }

    @Override // p276j4.AbstractC5868F.e.c
    /* JADX INFO: renamed from: i */
    public int mo26439i() {
        return this.f23313g;
    }

    @Override // p276j4.AbstractC5868F.e.c
    /* JADX INFO: renamed from: j */
    public boolean mo26440j() {
        return this.f23312f;
    }

    public String toString() {
        return "Device{arch=" + this.f23307a + ", model=" + this.f23308b + ", cores=" + this.f23309c + ", ram=" + this.f23310d + ", diskSpace=" + this.f23311e + ", simulator=" + this.f23312f + ", state=" + this.f23313g + ", manufacturer=" + this.f23314h + ", modelClass=" + this.f23315i + "}";
    }

    private C5880k(int i7, String str, int i8, long j7, long j8, boolean z7, int i9, String str2, String str3) {
        this.f23307a = i7;
        this.f23308b = str;
        this.f23309c = i8;
        this.f23310d = j7;
        this.f23311e = j8;
        this.f23312f = z7;
        this.f23313g = i9;
        this.f23314h = str2;
        this.f23315i = str3;
    }
}
