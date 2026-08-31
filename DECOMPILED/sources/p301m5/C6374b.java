package p301m5;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: m5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6374b {

    /* JADX INFO: renamed from: a */
    private final String f24330a;

    /* JADX INFO: renamed from: b */
    private final String f24331b;

    /* JADX INFO: renamed from: c */
    private final String f24332c;

    /* JADX INFO: renamed from: d */
    private final String f24333d;

    /* JADX INFO: renamed from: e */
    private final EnumC6393u f24334e;

    /* JADX INFO: renamed from: f */
    private final C6372a f24335f;

    public C6374b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, EnumC6393u logEnvironment, C6372a androidAppInfo) {
        AbstractC6118n.m27187e(appId, "appId");
        AbstractC6118n.m27187e(deviceModel, "deviceModel");
        AbstractC6118n.m27187e(sessionSdkVersion, "sessionSdkVersion");
        AbstractC6118n.m27187e(osVersion, "osVersion");
        AbstractC6118n.m27187e(logEnvironment, "logEnvironment");
        AbstractC6118n.m27187e(androidAppInfo, "androidAppInfo");
        this.f24330a = appId;
        this.f24331b = deviceModel;
        this.f24332c = sessionSdkVersion;
        this.f24333d = osVersion;
        this.f24334e = logEnvironment;
        this.f24335f = androidAppInfo;
    }

    /* JADX INFO: renamed from: a */
    public final C6372a m27477a() {
        return this.f24335f;
    }

    /* JADX INFO: renamed from: b */
    public final String m27478b() {
        return this.f24330a;
    }

    /* JADX INFO: renamed from: c */
    public final String m27479c() {
        return this.f24331b;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC6393u m27480d() {
        return this.f24334e;
    }

    /* JADX INFO: renamed from: e */
    public final String m27481e() {
        return this.f24333d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6374b)) {
            return false;
        }
        C6374b c6374b = (C6374b) obj;
        return AbstractC6118n.m27183a(this.f24330a, c6374b.f24330a) && AbstractC6118n.m27183a(this.f24331b, c6374b.f24331b) && AbstractC6118n.m27183a(this.f24332c, c6374b.f24332c) && AbstractC6118n.m27183a(this.f24333d, c6374b.f24333d) && this.f24334e == c6374b.f24334e && AbstractC6118n.m27183a(this.f24335f, c6374b.f24335f);
    }

    /* JADX INFO: renamed from: f */
    public final String m27482f() {
        return this.f24332c;
    }

    public int hashCode() {
        return (((((((((this.f24330a.hashCode() * 31) + this.f24331b.hashCode()) * 31) + this.f24332c.hashCode()) * 31) + this.f24333d.hashCode()) * 31) + this.f24334e.hashCode()) * 31) + this.f24335f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f24330a + ", deviceModel=" + this.f24331b + ", sessionSdkVersion=" + this.f24332c + ", osVersion=" + this.f24333d + ", logEnvironment=" + this.f24334e + ", androidAppInfo=" + this.f24335f + ')';
    }
}
