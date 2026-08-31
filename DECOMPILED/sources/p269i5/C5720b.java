package p269i5;

import com.google.firebase.messaging.AbstractC4959I;

/* JADX INFO: renamed from: i5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5720b {

    /* JADX INFO: renamed from: b */
    private static final C5720b f21879b = new a().m25402a();

    /* JADX INFO: renamed from: a */
    private final C5719a f21880a;

    /* JADX INFO: renamed from: i5.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private C5719a f21881a = null;

        a() {
        }

        /* JADX INFO: renamed from: a */
        public C5720b m25402a() {
            return new C5720b(this.f21881a);
        }

        /* JADX INFO: renamed from: b */
        public a m25403b(C5719a c5719a) {
            this.f21881a = c5719a;
            return this;
        }
    }

    C5720b(C5719a c5719a) {
        this.f21880a = c5719a;
    }

    /* JADX INFO: renamed from: b */
    public static a m25399b() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public C5719a m25400a() {
        return this.f21880a;
    }

    /* JADX INFO: renamed from: c */
    public byte[] m25401c() {
        return AbstractC4959I.m22375a(this);
    }
}
