package p164V3;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.C3724v;
import com.google.android.gms.common.util.AbstractC3765t;

/* JADX INFO: renamed from: V3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1771p {

    /* JADX INFO: renamed from: a */
    private final String f5809a;

    /* JADX INFO: renamed from: b */
    private final String f5810b;

    /* JADX INFO: renamed from: c */
    private final String f5811c;

    /* JADX INFO: renamed from: d */
    private final String f5812d;

    /* JADX INFO: renamed from: e */
    private final String f5813e;

    /* JADX INFO: renamed from: f */
    private final String f5814f;

    /* JADX INFO: renamed from: g */
    private final String f5815g;

    /* JADX INFO: renamed from: V3.p$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private String f5816a;

        /* JADX INFO: renamed from: b */
        private String f5817b;

        /* JADX INFO: renamed from: c */
        private String f5818c;

        /* JADX INFO: renamed from: d */
        private String f5819d;

        /* JADX INFO: renamed from: e */
        private String f5820e;

        /* JADX INFO: renamed from: f */
        private String f5821f;

        /* JADX INFO: renamed from: g */
        private String f5822g;

        /* JADX INFO: renamed from: a */
        public C1771p m7427a() {
            return new C1771p(this.f5817b, this.f5816a, this.f5818c, this.f5819d, this.f5820e, this.f5821f, this.f5822g);
        }

        /* JADX INFO: renamed from: b */
        public b m7428b(String str) {
            this.f5816a = AbstractC3718s.m18078g(str, "ApiKey must be set.");
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m7429c(String str) {
            this.f5817b = AbstractC3718s.m18078g(str, "ApplicationId must be set.");
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m7430d(String str) {
            this.f5818c = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m7431e(String str) {
            this.f5822g = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m7432f(String str) {
            this.f5821f = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1771p m7421a(Context context) {
        C3724v c3724v = new C3724v(context);
        String strM18102a = c3724v.m18102a("google_app_id");
        if (TextUtils.isEmpty(strM18102a)) {
            return null;
        }
        return new C1771p(strM18102a, c3724v.m18102a("google_api_key"), c3724v.m18102a("firebase_database_url"), c3724v.m18102a("ga_trackingId"), c3724v.m18102a("gcm_defaultSenderId"), c3724v.m18102a("google_storage_bucket"), c3724v.m18102a("project_id"));
    }

    /* JADX INFO: renamed from: b */
    public String m7422b() {
        return this.f5809a;
    }

    /* JADX INFO: renamed from: c */
    public String m7423c() {
        return this.f5810b;
    }

    /* JADX INFO: renamed from: d */
    public String m7424d() {
        return this.f5811c;
    }

    /* JADX INFO: renamed from: e */
    public String m7425e() {
        return this.f5813e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1771p)) {
            return false;
        }
        C1771p c1771p = (C1771p) obj;
        return AbstractC3714q.m18053b(this.f5810b, c1771p.f5810b) && AbstractC3714q.m18053b(this.f5809a, c1771p.f5809a) && AbstractC3714q.m18053b(this.f5811c, c1771p.f5811c) && AbstractC3714q.m18053b(this.f5812d, c1771p.f5812d) && AbstractC3714q.m18053b(this.f5813e, c1771p.f5813e) && AbstractC3714q.m18053b(this.f5814f, c1771p.f5814f) && AbstractC3714q.m18053b(this.f5815g, c1771p.f5815g);
    }

    /* JADX INFO: renamed from: f */
    public String m7426f() {
        return this.f5815g;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f5810b, this.f5809a, this.f5811c, this.f5812d, this.f5813e, this.f5814f, this.f5815g);
    }

    public String toString() {
        return AbstractC3714q.m18055d(this).m18056a("applicationId", this.f5810b).m18056a("apiKey", this.f5809a).m18056a("databaseUrl", this.f5811c).m18056a("gcmSenderId", this.f5813e).m18056a("storageBucket", this.f5814f).m18056a("projectId", this.f5815g).toString();
    }

    private C1771p(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC3718s.m18087p(!AbstractC3765t.m18209b(str), "ApplicationId must be set.");
        this.f5810b = str;
        this.f5809a = str2;
        this.f5811c = str3;
        this.f5812d = str4;
        this.f5813e = str5;
        this.f5814f = str6;
        this.f5815g = str7;
    }
}
