package p242f2;

import p109N4.InterfaceC0972c;

/* JADX INFO: renamed from: f2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5431c {

    /* JADX INFO: renamed from: c */
    private static final C5431c f20672c = new a().m24621a();

    /* JADX INFO: renamed from: a */
    private final long f20673a;

    /* JADX INFO: renamed from: b */
    private final b f20674b;

    /* JADX INFO: renamed from: f2.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private long f20675a = 0;

        /* JADX INFO: renamed from: b */
        private b f20676b = b.REASON_UNKNOWN;

        a() {
        }

        /* JADX INFO: renamed from: a */
        public C5431c m24621a() {
            return new C5431c(this.f20675a, this.f20676b);
        }

        /* JADX INFO: renamed from: b */
        public a m24622b(long j7) {
            this.f20675a = j7;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m24623c(b bVar) {
            this.f20676b = bVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: f2.c$b */
    public enum b implements InterfaceC0972c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a */
        private final int f20685a;

        b(int i7) {
            this.f20685a = i7;
        }

        @Override // p109N4.InterfaceC0972c
        /* JADX INFO: renamed from: a */
        public int mo4226a() {
            return this.f20685a;
        }
    }

    C5431c(long j7, b bVar) {
        this.f20673a = j7;
        this.f20674b = bVar;
    }

    /* JADX INFO: renamed from: c */
    public static a m24618c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public long m24619a() {
        return this.f20673a;
    }

    /* JADX INFO: renamed from: b */
    public b m24620b() {
        return this.f20674b;
    }
}
