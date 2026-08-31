package androidx.privacysandbox.ads.adservices.topics;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2700b {

    /* JADX INFO: renamed from: a */
    private final String f10645a;

    /* JADX INFO: renamed from: b */
    private final boolean f10646b;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private String f10647a = "";

        /* JADX INFO: renamed from: b */
        private boolean f10648b = true;

        /* JADX INFO: renamed from: a */
        public final C2700b m12810a() {
            return new C2700b(this.f10647a, this.f10648b);
        }

        /* JADX INFO: renamed from: b */
        public final a m12811b(String adsSdkName) {
            AbstractC6118n.m27187e(adsSdkName, "adsSdkName");
            if (adsSdkName.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set");
            }
            this.f10647a = adsSdkName;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m12812c(boolean z7) {
            this.f10648b = z7;
            return this;
        }
    }

    public C2700b(String adsSdkName, boolean z7) {
        AbstractC6118n.m27187e(adsSdkName, "adsSdkName");
        this.f10645a = adsSdkName;
        this.f10646b = z7;
    }

    /* JADX INFO: renamed from: a */
    public final String m12808a() {
        return this.f10645a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12809b() {
        return this.f10646b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2700b)) {
            return false;
        }
        C2700b c2700b = (C2700b) obj;
        return AbstractC6118n.m27183a(this.f10645a, c2700b.f10645a) && this.f10646b == c2700b.f10646b;
    }

    public int hashCode() {
        return (this.f10645a.hashCode() * 31) + Boolean.hashCode(this.f10646b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f10645a + ", shouldRecordObservation=" + this.f10646b;
    }
}
