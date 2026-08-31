package p276j4;

/* JADX INFO: renamed from: j4.u */
/* JADX INFO: loaded from: classes.dex */
final class C5890u extends AbstractC5868F.e.d.c {

    /* JADX INFO: renamed from: a */
    private final Double f23418a;

    /* JADX INFO: renamed from: b */
    private final int f23419b;

    /* JADX INFO: renamed from: c */
    private final boolean f23420c;

    /* JADX INFO: renamed from: d */
    private final int f23421d;

    /* JADX INFO: renamed from: e */
    private final long f23422e;

    /* JADX INFO: renamed from: f */
    private final long f23423f;

    /* JADX INFO: renamed from: j4.u$b */
    static final class b extends AbstractC5868F.e.d.c.a {

        /* JADX INFO: renamed from: a */
        private Double f23424a;

        /* JADX INFO: renamed from: b */
        private int f23425b;

        /* JADX INFO: renamed from: c */
        private boolean f23426c;

        /* JADX INFO: renamed from: d */
        private int f23427d;

        /* JADX INFO: renamed from: e */
        private long f23428e;

        /* JADX INFO: renamed from: f */
        private long f23429f;

        /* JADX INFO: renamed from: g */
        private byte f23430g;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.d.c.a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d.c mo26564a() {
            if (this.f23430g == 31) {
                return new C5890u(this.f23424a, this.f23425b, this.f23426c, this.f23427d, this.f23428e, this.f23429f);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f23430g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f23430g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f23430g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f23430g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f23430g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.d.c.a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.c.a mo26565b(Double d7) {
            this.f23424a = d7;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.c.a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.d.c.a mo26566c(int i7) {
            this.f23425b = i7;
            this.f23430g = (byte) (this.f23430g | 1);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.c.a
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.d.c.a mo26567d(long j7) {
            this.f23429f = j7;
            this.f23430g = (byte) (this.f23430g | 16);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.c.a
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.e.d.c.a mo26568e(int i7) {
            this.f23427d = i7;
            this.f23430g = (byte) (this.f23430g | 4);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.c.a
        /* JADX INFO: renamed from: f */
        public AbstractC5868F.e.d.c.a mo26569f(boolean z7) {
            this.f23426c = z7;
            this.f23430g = (byte) (this.f23430g | 2);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.c.a
        /* JADX INFO: renamed from: g */
        public AbstractC5868F.e.d.c.a mo26570g(long j7) {
            this.f23428e = j7;
            this.f23430g = (byte) (this.f23430g | 8);
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d.c
    /* JADX INFO: renamed from: b */
    public Double mo26558b() {
        return this.f23418a;
    }

    @Override // p276j4.AbstractC5868F.e.d.c
    /* JADX INFO: renamed from: c */
    public int mo26559c() {
        return this.f23419b;
    }

    @Override // p276j4.AbstractC5868F.e.d.c
    /* JADX INFO: renamed from: d */
    public long mo26560d() {
        return this.f23423f;
    }

    @Override // p276j4.AbstractC5868F.e.d.c
    /* JADX INFO: renamed from: e */
    public int mo26561e() {
        return this.f23421d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d.c) {
            AbstractC5868F.e.d.c cVar = (AbstractC5868F.e.d.c) obj;
            Double d7 = this.f23418a;
            if (d7 != null ? d7.equals(cVar.mo26558b()) : cVar.mo26558b() == null) {
                if (this.f23419b == cVar.mo26559c() && this.f23420c == cVar.mo26563g() && this.f23421d == cVar.mo26561e() && this.f23422e == cVar.mo26562f() && this.f23423f == cVar.mo26560d()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p276j4.AbstractC5868F.e.d.c
    /* JADX INFO: renamed from: f */
    public long mo26562f() {
        return this.f23422e;
    }

    @Override // p276j4.AbstractC5868F.e.d.c
    /* JADX INFO: renamed from: g */
    public boolean mo26563g() {
        return this.f23420c;
    }

    public int hashCode() {
        Double d7 = this.f23418a;
        int iHashCode = ((((((((d7 == null ? 0 : d7.hashCode()) ^ 1000003) * 1000003) ^ this.f23419b) * 1000003) ^ (this.f23420c ? 1231 : 1237)) * 1000003) ^ this.f23421d) * 1000003;
        long j7 = this.f23422e;
        long j8 = this.f23423f;
        return ((iHashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f23418a + ", batteryVelocity=" + this.f23419b + ", proximityOn=" + this.f23420c + ", orientation=" + this.f23421d + ", ramUsed=" + this.f23422e + ", diskUsed=" + this.f23423f + "}";
    }

    private C5890u(Double d7, int i7, boolean z7, int i8, long j7, long j8) {
        this.f23418a = d7;
        this.f23419b = i7;
        this.f23420c = z7;
        this.f23421d = i8;
        this.f23422e = j7;
        this.f23423f = j8;
    }
}
