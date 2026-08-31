package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzbt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p403z1.AbstractC7581w;

/* JADX INFO: renamed from: com.android.billingclient.api.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3181g {

    /* JADX INFO: renamed from: a */
    private final zzbt f13628a;

    /* JADX INFO: renamed from: com.android.billingclient.api.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private zzbt f13629a;

        /* synthetic */ a(AbstractC7581w abstractC7581w) {
        }

        /* JADX INFO: renamed from: a */
        public C3181g m16963a() {
            if (this.f13629a != null) {
                return new C3181g(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        /* JADX INFO: renamed from: b */
        public a m16964b(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!"play_pass_subs".equals(bVar.m16967c())) {
                    hashSet.add(bVar.m16967c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f13629a = zzbt.zzj(list);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.g$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final String f13630a;

        /* JADX INFO: renamed from: b */
        private final String f13631b;

        /* JADX INFO: renamed from: com.android.billingclient.api.g$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private String f13632a;

            /* JADX INFO: renamed from: b */
            private String f13633b;

            /* synthetic */ a(AbstractC7581w abstractC7581w) {
            }

            /* JADX INFO: renamed from: a */
            public b m16970a() {
                if ("first_party".equals(this.f13633b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f13632a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f13633b != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            /* JADX INFO: renamed from: b */
            public a m16971b(String str) {
                this.f13632a = str;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public a m16972c(String str) {
                this.f13633b = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, AbstractC7581w abstractC7581w) {
            this.f13630a = aVar.f13632a;
            this.f13631b = aVar.f13633b;
        }

        /* JADX INFO: renamed from: a */
        public static a m16965a() {
            return new a(null);
        }

        /* JADX INFO: renamed from: b */
        public final String m16966b() {
            return this.f13630a;
        }

        /* JADX INFO: renamed from: c */
        public final String m16967c() {
            return this.f13631b;
        }
    }

    /* synthetic */ C3181g(a aVar, AbstractC7581w abstractC7581w) {
        this.f13628a = aVar.f13629a;
    }

    /* JADX INFO: renamed from: a */
    public static a m16959a() {
        return new a(null);
    }

    /* JADX INFO: renamed from: b */
    public final zzbt m16960b() {
        return this.f13628a;
    }

    /* JADX INFO: renamed from: c */
    public final String m16961c() {
        return ((b) this.f13628a.get(0)).m16967c();
    }
}
