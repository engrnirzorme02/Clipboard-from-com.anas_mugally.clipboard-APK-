package p276j4;

import java.util.List;

/* JADX INFO: renamed from: j4.c */
/* JADX INFO: loaded from: classes.dex */
final class C5872c extends AbstractC5868F.a {

    /* JADX INFO: renamed from: a */
    private final int f23233a;

    /* JADX INFO: renamed from: b */
    private final String f23234b;

    /* JADX INFO: renamed from: c */
    private final int f23235c;

    /* JADX INFO: renamed from: d */
    private final int f23236d;

    /* JADX INFO: renamed from: e */
    private final long f23237e;

    /* JADX INFO: renamed from: f */
    private final long f23238f;

    /* JADX INFO: renamed from: g */
    private final long f23239g;

    /* JADX INFO: renamed from: h */
    private final String f23240h;

    /* JADX INFO: renamed from: i */
    private final List f23241i;

    /* JADX INFO: renamed from: j4.c$b */
    static final class b extends AbstractC5868F.a.b {

        /* JADX INFO: renamed from: a */
        private int f23242a;

        /* JADX INFO: renamed from: b */
        private String f23243b;

        /* JADX INFO: renamed from: c */
        private int f23244c;

        /* JADX INFO: renamed from: d */
        private int f23245d;

        /* JADX INFO: renamed from: e */
        private long f23246e;

        /* JADX INFO: renamed from: f */
        private long f23247f;

        /* JADX INFO: renamed from: g */
        private long f23248g;

        /* JADX INFO: renamed from: h */
        private String f23249h;

        /* JADX INFO: renamed from: i */
        private List f23250i;

        /* JADX INFO: renamed from: j */
        private byte f23251j;

        b() {
        }

        @Override // p276j4.AbstractC5868F.a.b
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.a mo26343a() {
            String str;
            if (this.f23251j == 63 && (str = this.f23243b) != null) {
                return new C5872c(this.f23242a, str, this.f23244c, this.f23245d, this.f23246e, this.f23247f, this.f23248g, this.f23249h, this.f23250i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f23251j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f23243b == null) {
                sb.append(" processName");
            }
            if ((this.f23251j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f23251j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f23251j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f23251j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.f23251j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.a.b
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.a.b mo26344b(List list) {
            this.f23250i = list;
            return this;
        }

        @Override // p276j4.AbstractC5868F.a.b
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.a.b mo26345c(int i7) {
            this.f23245d = i7;
            this.f23251j = (byte) (this.f23251j | 4);
            return this;
        }

        @Override // p276j4.AbstractC5868F.a.b
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.a.b mo26346d(int i7) {
            this.f23242a = i7;
            this.f23251j = (byte) (this.f23251j | 1);
            return this;
        }

        @Override // p276j4.AbstractC5868F.a.b
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.a.b mo26347e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f23243b = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.a.b
        /* JADX INFO: renamed from: f */
        public AbstractC5868F.a.b mo26348f(long j7) {
            this.f23246e = j7;
            this.f23251j = (byte) (this.f23251j | 8);
            return this;
        }

        @Override // p276j4.AbstractC5868F.a.b
        /* JADX INFO: renamed from: g */
        public AbstractC5868F.a.b mo26349g(int i7) {
            this.f23244c = i7;
            this.f23251j = (byte) (this.f23251j | 2);
            return this;
        }

        @Override // p276j4.AbstractC5868F.a.b
        /* JADX INFO: renamed from: h */
        public AbstractC5868F.a.b mo26350h(long j7) {
            this.f23247f = j7;
            this.f23251j = (byte) (this.f23251j | 16);
            return this;
        }

        @Override // p276j4.AbstractC5868F.a.b
        /* JADX INFO: renamed from: i */
        public AbstractC5868F.a.b mo26351i(long j7) {
            this.f23248g = j7;
            this.f23251j = (byte) (this.f23251j | 32);
            return this;
        }

        @Override // p276j4.AbstractC5868F.a.b
        /* JADX INFO: renamed from: j */
        public AbstractC5868F.a.b mo26352j(String str) {
            this.f23249h = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.a
    /* JADX INFO: renamed from: b */
    public List mo26326b() {
        return this.f23241i;
    }

    @Override // p276j4.AbstractC5868F.a
    /* JADX INFO: renamed from: c */
    public int mo26327c() {
        return this.f23236d;
    }

    @Override // p276j4.AbstractC5868F.a
    /* JADX INFO: renamed from: d */
    public int mo26328d() {
        return this.f23233a;
    }

    @Override // p276j4.AbstractC5868F.a
    /* JADX INFO: renamed from: e */
    public String mo26329e() {
        return this.f23234b;
    }

    public boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.a) {
            AbstractC5868F.a aVar = (AbstractC5868F.a) obj;
            if (this.f23233a == aVar.mo26328d() && this.f23234b.equals(aVar.mo26329e()) && this.f23235c == aVar.mo26331g() && this.f23236d == aVar.mo26327c() && this.f23237e == aVar.mo26330f() && this.f23238f == aVar.mo26332h() && this.f23239g == aVar.mo26333i() && ((str = this.f23240h) != null ? str.equals(aVar.mo26334j()) : aVar.mo26334j() == null) && ((list = this.f23241i) != null ? list.equals(aVar.mo26326b()) : aVar.mo26326b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // p276j4.AbstractC5868F.a
    /* JADX INFO: renamed from: f */
    public long mo26330f() {
        return this.f23237e;
    }

    @Override // p276j4.AbstractC5868F.a
    /* JADX INFO: renamed from: g */
    public int mo26331g() {
        return this.f23235c;
    }

    @Override // p276j4.AbstractC5868F.a
    /* JADX INFO: renamed from: h */
    public long mo26332h() {
        return this.f23238f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f23233a ^ 1000003) * 1000003) ^ this.f23234b.hashCode()) * 1000003) ^ this.f23235c) * 1000003) ^ this.f23236d) * 1000003;
        long j7 = this.f23237e;
        int i7 = (iHashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f23238f;
        int i8 = (i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f23239g;
        int i9 = (i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str = this.f23240h;
        int iHashCode2 = (i9 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f23241i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // p276j4.AbstractC5868F.a
    /* JADX INFO: renamed from: i */
    public long mo26333i() {
        return this.f23239g;
    }

    @Override // p276j4.AbstractC5868F.a
    /* JADX INFO: renamed from: j */
    public String mo26334j() {
        return this.f23240h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f23233a + ", processName=" + this.f23234b + ", reasonCode=" + this.f23235c + ", importance=" + this.f23236d + ", pss=" + this.f23237e + ", rss=" + this.f23238f + ", timestamp=" + this.f23239g + ", traceFile=" + this.f23240h + ", buildIdMappingForArch=" + this.f23241i + "}";
    }

    private C5872c(int i7, String str, int i8, int i9, long j7, long j8, long j9, String str2, List list) {
        this.f23233a = i7;
        this.f23234b = str;
        this.f23235c = i8;
        this.f23236d = i9;
        this.f23237e = j7;
        this.f23238f = j8;
        this.f23239g = j9;
        this.f23240h = str2;
        this.f23241i = list;
    }
}
