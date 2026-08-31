package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzc;
import p403z1.AbstractC7576r;

/* JADX INFO: renamed from: com.android.billingclient.api.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3178d {

    /* JADX INFO: renamed from: a */
    private int f13567a;

    /* JADX INFO: renamed from: b */
    private int f13568b;

    /* JADX INFO: renamed from: c */
    private String f13569c;

    /* JADX INFO: renamed from: com.android.billingclient.api.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private int f13570a;

        /* JADX INFO: renamed from: b */
        private int f13571b = 0;

        /* JADX INFO: renamed from: c */
        private String f13572c = "";

        /* synthetic */ a(AbstractC7576r abstractC7576r) {
        }

        /* JADX INFO: renamed from: a */
        public C3178d m16930a() {
            C3178d c3178d = new C3178d();
            c3178d.f13567a = this.f13570a;
            c3178d.f13568b = this.f13571b;
            c3178d.f13569c = this.f13572c;
            return c3178d;
        }

        /* JADX INFO: renamed from: b */
        public a m16931b(String str) {
            this.f13572c = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m16932c(int i7) {
            this.f13571b = i7;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m16933d(int i7) {
            this.f13570a = i7;
            return this;
        }
    }

    /* JADX INFO: renamed from: d */
    public static a m16923d() {
        return new a(null);
    }

    /* JADX INFO: renamed from: a */
    public String m16927a() {
        return this.f13569c;
    }

    /* JADX INFO: renamed from: b */
    public int m16928b() {
        return this.f13568b;
    }

    /* JADX INFO: renamed from: c */
    public int m16929c() {
        return this.f13567a;
    }

    public String toString() {
        return "Response Code: " + zzc.zzk(this.f13567a) + ", Debug Message: " + this.f13569c;
    }
}
