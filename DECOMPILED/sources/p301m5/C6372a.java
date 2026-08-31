package p301m5;

import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: m5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6372a {

    /* JADX INFO: renamed from: a */
    private final String f24323a;

    /* JADX INFO: renamed from: b */
    private final String f24324b;

    /* JADX INFO: renamed from: c */
    private final String f24325c;

    /* JADX INFO: renamed from: d */
    private final String f24326d;

    /* JADX INFO: renamed from: e */
    private final C6349C f24327e;

    /* JADX INFO: renamed from: f */
    private final List f24328f;

    public C6372a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, C6349C currentProcessDetails, List appProcessDetails) {
        AbstractC6118n.m27187e(packageName, "packageName");
        AbstractC6118n.m27187e(versionName, "versionName");
        AbstractC6118n.m27187e(appBuildVersion, "appBuildVersion");
        AbstractC6118n.m27187e(deviceManufacturer, "deviceManufacturer");
        AbstractC6118n.m27187e(currentProcessDetails, "currentProcessDetails");
        AbstractC6118n.m27187e(appProcessDetails, "appProcessDetails");
        this.f24323a = packageName;
        this.f24324b = versionName;
        this.f24325c = appBuildVersion;
        this.f24326d = deviceManufacturer;
        this.f24327e = currentProcessDetails;
        this.f24328f = appProcessDetails;
    }

    /* JADX INFO: renamed from: a */
    public final String m27471a() {
        return this.f24325c;
    }

    /* JADX INFO: renamed from: b */
    public final List m27472b() {
        return this.f24328f;
    }

    /* JADX INFO: renamed from: c */
    public final C6349C m27473c() {
        return this.f24327e;
    }

    /* JADX INFO: renamed from: d */
    public final String m27474d() {
        return this.f24326d;
    }

    /* JADX INFO: renamed from: e */
    public final String m27475e() {
        return this.f24323a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6372a)) {
            return false;
        }
        C6372a c6372a = (C6372a) obj;
        return AbstractC6118n.m27183a(this.f24323a, c6372a.f24323a) && AbstractC6118n.m27183a(this.f24324b, c6372a.f24324b) && AbstractC6118n.m27183a(this.f24325c, c6372a.f24325c) && AbstractC6118n.m27183a(this.f24326d, c6372a.f24326d) && AbstractC6118n.m27183a(this.f24327e, c6372a.f24327e) && AbstractC6118n.m27183a(this.f24328f, c6372a.f24328f);
    }

    /* JADX INFO: renamed from: f */
    public final String m27476f() {
        return this.f24324b;
    }

    public int hashCode() {
        return (((((((((this.f24323a.hashCode() * 31) + this.f24324b.hashCode()) * 31) + this.f24325c.hashCode()) * 31) + this.f24326d.hashCode()) * 31) + this.f24327e.hashCode()) * 31) + this.f24328f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f24323a + ", versionName=" + this.f24324b + ", appBuildVersion=" + this.f24325c + ", deviceManufacturer=" + this.f24326d + ", currentProcessDetails=" + this.f24327e + ", appProcessDetails=" + this.f24328f + ')';
    }
}
