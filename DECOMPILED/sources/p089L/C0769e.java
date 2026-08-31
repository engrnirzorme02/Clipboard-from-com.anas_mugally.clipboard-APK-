package p089L;

import android.util.Base64;
import java.util.List;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: L.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0769e {

    /* JADX INFO: renamed from: a */
    private final String f3120a;

    /* JADX INFO: renamed from: b */
    private final String f3121b;

    /* JADX INFO: renamed from: c */
    private final String f3122c;

    /* JADX INFO: renamed from: d */
    private final List f3123d;

    /* JADX INFO: renamed from: e */
    private final int f3124e;

    /* JADX INFO: renamed from: f */
    private final String f3125f;

    /* JADX INFO: renamed from: g */
    private final String f3126g;

    /* JADX INFO: renamed from: h */
    private final String f3127h;

    public C0769e(String str, String str2, String str3, List list) {
        this(str, str2, str3, list, null, null);
    }

    /* JADX INFO: renamed from: a */
    private String m3612a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    /* JADX INFO: renamed from: b */
    public List m3613b() {
        return this.f3123d;
    }

    /* JADX INFO: renamed from: c */
    public int m3614c() {
        return this.f3124e;
    }

    /* JADX INFO: renamed from: d */
    String m3615d() {
        return this.f3127h;
    }

    /* JADX INFO: renamed from: e */
    public String m3616e() {
        return this.f3120a;
    }

    /* JADX INFO: renamed from: f */
    public String m3617f() {
        return this.f3121b;
    }

    /* JADX INFO: renamed from: g */
    public String m3618g() {
        return this.f3122c;
    }

    /* JADX INFO: renamed from: h */
    public String m3619h() {
        return this.f3125f;
    }

    /* JADX INFO: renamed from: i */
    public String m3620i() {
        return this.f3126g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f3120a + ", mProviderPackage: " + this.f3121b + ", mQuery: " + this.f3122c + ", mSystemFont: " + this.f3125f + ", mVariationSettings: " + this.f3126g + ", mCertificates:");
        for (int i7 = 0; i7 < this.f3123d.size(); i7++) {
            sb.append(" [");
            List list = (List) this.f3123d.get(i7);
            for (int i8 = 0; i8 < list.size(); i8++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i8), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f3124e);
        return sb.toString();
    }

    public C0769e(String str, String str2, String str3, List list, String str4, String str5) {
        this.f3120a = (String) AbstractC0910g.m4139g(str);
        this.f3121b = (String) AbstractC0910g.m4139g(str2);
        this.f3122c = (String) AbstractC0910g.m4139g(str3);
        this.f3123d = (List) AbstractC0910g.m4139g(list);
        this.f3124e = 0;
        this.f3125f = str4;
        this.f3126g = str5;
        this.f3127h = m3612a(str, str2, str3, str4, str5);
    }
}
