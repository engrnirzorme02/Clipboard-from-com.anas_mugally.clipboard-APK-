package p301m5;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: m5.I */
/* JADX INFO: loaded from: classes.dex */
public final class C6355I {

    /* JADX INFO: renamed from: a */
    private final EnumC6382j f24226a;

    /* JADX INFO: renamed from: b */
    private final C6362P f24227b;

    /* JADX INFO: renamed from: c */
    private final C6374b f24228c;

    public C6355I(EnumC6382j eventType, C6362P sessionData, C6374b applicationInfo) {
        AbstractC6118n.m27187e(eventType, "eventType");
        AbstractC6118n.m27187e(sessionData, "sessionData");
        AbstractC6118n.m27187e(applicationInfo, "applicationInfo");
        this.f24226a = eventType;
        this.f24227b = sessionData;
        this.f24228c = applicationInfo;
    }

    /* JADX INFO: renamed from: a */
    public final C6374b m27399a() {
        return this.f24228c;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC6382j m27400b() {
        return this.f24226a;
    }

    /* JADX INFO: renamed from: c */
    public final C6362P m27401c() {
        return this.f24227b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6355I)) {
            return false;
        }
        C6355I c6355i = (C6355I) obj;
        return this.f24226a == c6355i.f24226a && AbstractC6118n.m27183a(this.f24227b, c6355i.f24227b) && AbstractC6118n.m27183a(this.f24228c, c6355i.f24228c);
    }

    public int hashCode() {
        return (((this.f24226a.hashCode() * 31) + this.f24227b.hashCode()) * 31) + this.f24228c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f24226a + ", sessionData=" + this.f24227b + ", applicationInfo=" + this.f24228c + ')';
    }
}
