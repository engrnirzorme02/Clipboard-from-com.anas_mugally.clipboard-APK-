package p091L1;

import p019C1.C0131g;

/* JADX INFO: renamed from: L1.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0823p {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0823p f3264a = new a();

    /* JADX INFO: renamed from: b */
    public static final AbstractC0823p f3265b = new b();

    /* JADX INFO: renamed from: c */
    public static final AbstractC0823p f3266c = new e();

    /* JADX INFO: renamed from: d */
    public static final AbstractC0823p f3267d = new c();

    /* JADX INFO: renamed from: e */
    public static final AbstractC0823p f3268e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC0823p f3269f;

    /* JADX INFO: renamed from: g */
    public static final AbstractC0823p f3270g;

    /* JADX INFO: renamed from: h */
    public static final C0131g f3271h;

    /* JADX INFO: renamed from: i */
    static final boolean f3272i;

    /* JADX INFO: renamed from: L1.p$a */
    private static class a extends AbstractC0823p {
        a() {
        }

        @Override // p091L1.AbstractC0823p
        /* JADX INFO: renamed from: a */
        public g mo3842a(int i7, int i8, int i9, int i10) {
            return g.QUALITY;
        }

        @Override // p091L1.AbstractC0823p
        /* JADX INFO: renamed from: b */
        public float mo3843b(int i7, int i8, int i9, int i10) {
            int iMin = Math.min(i8 / i10, i7 / i9);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    /* JADX INFO: renamed from: L1.p$b */
    private static class b extends AbstractC0823p {
        b() {
        }

        @Override // p091L1.AbstractC0823p
        /* JADX INFO: renamed from: a */
        public g mo3842a(int i7, int i8, int i9, int i10) {
            return g.MEMORY;
        }

        @Override // p091L1.AbstractC0823p
        /* JADX INFO: renamed from: b */
        public float mo3843b(int i7, int i8, int i9, int i10) {
            int iCeil = (int) Math.ceil(Math.max(i8 / i10, i7 / i9));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    /* JADX INFO: renamed from: L1.p$c */
    private static class c extends AbstractC0823p {
        c() {
        }

        @Override // p091L1.AbstractC0823p
        /* JADX INFO: renamed from: a */
        public g mo3842a(int i7, int i8, int i9, int i10) {
            return mo3843b(i7, i8, i9, i10) == 1.0f ? g.QUALITY : AbstractC0823p.f3266c.mo3842a(i7, i8, i9, i10);
        }

        @Override // p091L1.AbstractC0823p
        /* JADX INFO: renamed from: b */
        public float mo3843b(int i7, int i8, int i9, int i10) {
            return Math.min(1.0f, AbstractC0823p.f3266c.mo3843b(i7, i8, i9, i10));
        }
    }

    /* JADX INFO: renamed from: L1.p$d */
    private static class d extends AbstractC0823p {
        d() {
        }

        @Override // p091L1.AbstractC0823p
        /* JADX INFO: renamed from: a */
        public g mo3842a(int i7, int i8, int i9, int i10) {
            return g.QUALITY;
        }

        @Override // p091L1.AbstractC0823p
        /* JADX INFO: renamed from: b */
        public float mo3843b(int i7, int i8, int i9, int i10) {
            return Math.max(i9 / i7, i10 / i8);
        }
    }

    /* JADX INFO: renamed from: L1.p$e */
    private static class e extends AbstractC0823p {
        e() {
        }

        @Override // p091L1.AbstractC0823p
        /* JADX INFO: renamed from: a */
        public g mo3842a(int i7, int i8, int i9, int i10) {
            return AbstractC0823p.f3272i ? g.QUALITY : g.MEMORY;
        }

        @Override // p091L1.AbstractC0823p
        /* JADX INFO: renamed from: b */
        public float mo3843b(int i7, int i8, int i9, int i10) {
            if (AbstractC0823p.f3272i) {
                return Math.min(i9 / i7, i10 / i8);
            }
            int iMax = Math.max(i8 / i10, i7 / i9);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    /* JADX INFO: renamed from: L1.p$f */
    private static class f extends AbstractC0823p {
        f() {
        }

        @Override // p091L1.AbstractC0823p
        /* JADX INFO: renamed from: a */
        public g mo3842a(int i7, int i8, int i9, int i10) {
            return g.QUALITY;
        }

        @Override // p091L1.AbstractC0823p
        /* JADX INFO: renamed from: b */
        public float mo3843b(int i7, int i8, int i9, int i10) {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: L1.p$g */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f3268e = dVar;
        f3269f = new f();
        f3270g = dVar;
        f3271h = C0131g.m595f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f3272i = true;
    }

    /* JADX INFO: renamed from: a */
    public abstract g mo3842a(int i7, int i8, int i9, int i10);

    /* JADX INFO: renamed from: b */
    public abstract float mo3843b(int i7, int i8, int i9, int i10);
}
