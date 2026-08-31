package p269i5;

import p109N4.InterfaceC0972c;

/* JADX INFO: renamed from: i5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5719a {

    /* JADX INFO: renamed from: p */
    private static final C5719a f21831p = new a().m25382a();

    /* JADX INFO: renamed from: a */
    private final long f21832a;

    /* JADX INFO: renamed from: b */
    private final String f21833b;

    /* JADX INFO: renamed from: c */
    private final String f21834c;

    /* JADX INFO: renamed from: d */
    private final c f21835d;

    /* JADX INFO: renamed from: e */
    private final d f21836e;

    /* JADX INFO: renamed from: f */
    private final String f21837f;

    /* JADX INFO: renamed from: g */
    private final String f21838g;

    /* JADX INFO: renamed from: h */
    private final int f21839h;

    /* JADX INFO: renamed from: i */
    private final int f21840i;

    /* JADX INFO: renamed from: j */
    private final String f21841j;

    /* JADX INFO: renamed from: k */
    private final long f21842k;

    /* JADX INFO: renamed from: l */
    private final b f21843l;

    /* JADX INFO: renamed from: m */
    private final String f21844m;

    /* JADX INFO: renamed from: n */
    private final long f21845n;

    /* JADX INFO: renamed from: o */
    private final String f21846o;

    /* JADX INFO: renamed from: i5.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private long f21847a = 0;

        /* JADX INFO: renamed from: b */
        private String f21848b = "";

        /* JADX INFO: renamed from: c */
        private String f21849c = "";

        /* JADX INFO: renamed from: d */
        private c f21850d = c.UNKNOWN;

        /* JADX INFO: renamed from: e */
        private d f21851e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f */
        private String f21852f = "";

        /* JADX INFO: renamed from: g */
        private String f21853g = "";

        /* JADX INFO: renamed from: h */
        private int f21854h = 0;

        /* JADX INFO: renamed from: i */
        private int f21855i = 0;

        /* JADX INFO: renamed from: j */
        private String f21856j = "";

        /* JADX INFO: renamed from: k */
        private long f21857k = 0;

        /* JADX INFO: renamed from: l */
        private b f21858l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m */
        private String f21859m = "";

        /* JADX INFO: renamed from: n */
        private long f21860n = 0;

        /* JADX INFO: renamed from: o */
        private String f21861o = "";

        a() {
        }

        /* JADX INFO: renamed from: a */
        public C5719a m25382a() {
            return new C5719a(this.f21847a, this.f21848b, this.f21849c, this.f21850d, this.f21851e, this.f21852f, this.f21853g, this.f21854h, this.f21855i, this.f21856j, this.f21857k, this.f21858l, this.f21859m, this.f21860n, this.f21861o);
        }

        /* JADX INFO: renamed from: b */
        public a m25383b(String str) {
            this.f21859m = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m25384c(String str) {
            this.f21853g = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m25385d(String str) {
            this.f21861o = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m25386e(b bVar) {
            this.f21858l = bVar;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m25387f(String str) {
            this.f21849c = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m25388g(String str) {
            this.f21848b = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m25389h(c cVar) {
            this.f21850d = cVar;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m25390i(String str) {
            this.f21852f = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a m25391j(int i7) {
            this.f21854h = i7;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a m25392k(long j7) {
            this.f21847a = j7;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public a m25393l(d dVar) {
            this.f21851e = dVar;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public a m25394m(String str) {
            this.f21856j = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public a m25395n(int i7) {
            this.f21855i = i7;
            return this;
        }
    }

    /* JADX INFO: renamed from: i5.a$b */
    public enum b implements InterfaceC0972c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: a */
        private final int f21866a;

        b(int i7) {
            this.f21866a = i7;
        }

        @Override // p109N4.InterfaceC0972c
        /* JADX INFO: renamed from: a */
        public int mo4226a() {
            return this.f21866a;
        }
    }

    /* JADX INFO: renamed from: i5.a$c */
    public enum c implements InterfaceC0972c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: a */
        private final int f21872a;

        c(int i7) {
            this.f21872a = i7;
        }

        @Override // p109N4.InterfaceC0972c
        /* JADX INFO: renamed from: a */
        public int mo4226a() {
            return this.f21872a;
        }
    }

    /* JADX INFO: renamed from: i5.a$d */
    public enum d implements InterfaceC0972c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: a */
        private final int f21878a;

        d(int i7) {
            this.f21878a = i7;
        }

        @Override // p109N4.InterfaceC0972c
        /* JADX INFO: renamed from: a */
        public int mo4226a() {
            return this.f21878a;
        }
    }

    C5719a(long j7, String str, String str2, c cVar, d dVar, String str3, String str4, int i7, int i8, String str5, long j8, b bVar, String str6, long j9, String str7) {
        this.f21832a = j7;
        this.f21833b = str;
        this.f21834c = str2;
        this.f21835d = cVar;
        this.f21836e = dVar;
        this.f21837f = str3;
        this.f21838g = str4;
        this.f21839h = i7;
        this.f21840i = i8;
        this.f21841j = str5;
        this.f21842k = j8;
        this.f21843l = bVar;
        this.f21844m = str6;
        this.f21845n = j9;
        this.f21846o = str7;
    }

    /* JADX INFO: renamed from: p */
    public static a m25366p() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public String m25367a() {
        return this.f21844m;
    }

    /* JADX INFO: renamed from: b */
    public long m25368b() {
        return this.f21842k;
    }

    /* JADX INFO: renamed from: c */
    public long m25369c() {
        return this.f21845n;
    }

    /* JADX INFO: renamed from: d */
    public String m25370d() {
        return this.f21838g;
    }

    /* JADX INFO: renamed from: e */
    public String m25371e() {
        return this.f21846o;
    }

    /* JADX INFO: renamed from: f */
    public b m25372f() {
        return this.f21843l;
    }

    /* JADX INFO: renamed from: g */
    public String m25373g() {
        return this.f21834c;
    }

    /* JADX INFO: renamed from: h */
    public String m25374h() {
        return this.f21833b;
    }

    /* JADX INFO: renamed from: i */
    public c m25375i() {
        return this.f21835d;
    }

    /* JADX INFO: renamed from: j */
    public String m25376j() {
        return this.f21837f;
    }

    /* JADX INFO: renamed from: k */
    public int m25377k() {
        return this.f21839h;
    }

    /* JADX INFO: renamed from: l */
    public long m25378l() {
        return this.f21832a;
    }

    /* JADX INFO: renamed from: m */
    public d m25379m() {
        return this.f21836e;
    }

    /* JADX INFO: renamed from: n */
    public String m25380n() {
        return this.f21841j;
    }

    /* JADX INFO: renamed from: o */
    public int m25381o() {
        return this.f21840i;
    }
}
