package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3179e {

    /* JADX INFO: renamed from: a */
    private final boolean f13573a;

    /* JADX INFO: renamed from: b */
    private final boolean f13574b;

    /* JADX INFO: renamed from: com.android.billingclient.api.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private boolean f13575a;

        /* JADX INFO: renamed from: b */
        private boolean f13576b;

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public C3179e m16937a() {
            if (!this.f13575a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new C3179e(true, this.f13576b);
        }

        /* JADX INFO: renamed from: b */
        public a m16938b() {
            this.f13575a = true;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m16939c() {
            this.f13576b = true;
            return this;
        }
    }

    private C3179e(boolean z7, boolean z8) {
        this.f13573a = z7;
        this.f13574b = z8;
    }

    /* JADX INFO: renamed from: c */
    public static a m16934c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    boolean m16935a() {
        return this.f13573a;
    }

    /* JADX INFO: renamed from: b */
    boolean m16936b() {
        return this.f13574b;
    }
}
