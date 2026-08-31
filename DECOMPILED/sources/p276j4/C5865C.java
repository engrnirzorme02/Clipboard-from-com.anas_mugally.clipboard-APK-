package p276j4;

import p228d4.C5234f;

/* JADX INFO: renamed from: j4.C */
/* JADX INFO: loaded from: classes.dex */
final class C5865C extends AbstractC5869G.a {

    /* JADX INFO: renamed from: a */
    private final String f23042a;

    /* JADX INFO: renamed from: b */
    private final String f23043b;

    /* JADX INFO: renamed from: c */
    private final String f23044c;

    /* JADX INFO: renamed from: d */
    private final String f23045d;

    /* JADX INFO: renamed from: e */
    private final int f23046e;

    /* JADX INFO: renamed from: f */
    private final C5234f f23047f;

    C5865C(String str, String str2, String str3, String str4, int i7, C5234f c5234f) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f23042a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f23043b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f23044c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f23045d = str4;
        this.f23046e = i7;
        if (c5234f == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f23047f = c5234f;
    }

    @Override // p276j4.AbstractC5869G.a
    /* JADX INFO: renamed from: a */
    public String mo26285a() {
        return this.f23042a;
    }

    @Override // p276j4.AbstractC5869G.a
    /* JADX INFO: renamed from: c */
    public int mo26286c() {
        return this.f23046e;
    }

    @Override // p276j4.AbstractC5869G.a
    /* JADX INFO: renamed from: d */
    public C5234f mo26287d() {
        return this.f23047f;
    }

    @Override // p276j4.AbstractC5869G.a
    /* JADX INFO: renamed from: e */
    public String mo26288e() {
        return this.f23045d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5869G.a) {
            AbstractC5869G.a aVar = (AbstractC5869G.a) obj;
            if (this.f23042a.equals(aVar.mo26285a()) && this.f23043b.equals(aVar.mo26289f()) && this.f23044c.equals(aVar.mo26290g()) && this.f23045d.equals(aVar.mo26288e()) && this.f23046e == aVar.mo26286c() && this.f23047f.equals(aVar.mo26287d())) {
                return true;
            }
        }
        return false;
    }

    @Override // p276j4.AbstractC5869G.a
    /* JADX INFO: renamed from: f */
    public String mo26289f() {
        return this.f23043b;
    }

    @Override // p276j4.AbstractC5869G.a
    /* JADX INFO: renamed from: g */
    public String mo26290g() {
        return this.f23044c;
    }

    public int hashCode() {
        return ((((((((((this.f23042a.hashCode() ^ 1000003) * 1000003) ^ this.f23043b.hashCode()) * 1000003) ^ this.f23044c.hashCode()) * 1000003) ^ this.f23045d.hashCode()) * 1000003) ^ this.f23046e) * 1000003) ^ this.f23047f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f23042a + ", versionCode=" + this.f23043b + ", versionName=" + this.f23044c + ", installUuid=" + this.f23045d + ", deliveryMechanism=" + this.f23046e + ", developmentPlatformProvider=" + this.f23047f + "}";
    }
}
