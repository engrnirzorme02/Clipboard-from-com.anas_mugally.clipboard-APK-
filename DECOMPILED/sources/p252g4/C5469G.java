package p252g4;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: g4.G */
/* JADX INFO: loaded from: classes.dex */
public final class C5469G {

    /* JADX INFO: renamed from: a */
    private final String f20796a;

    /* JADX INFO: renamed from: b */
    private final String f20797b;

    public C5469G(String str, String str2) {
        this.f20796a = str;
        this.f20797b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m24696a() {
        return this.f20797b;
    }

    /* JADX INFO: renamed from: b */
    public final String m24697b() {
        return this.f20796a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5469G)) {
            return false;
        }
        C5469G c5469g = (C5469G) obj;
        return AbstractC6118n.m27183a(this.f20796a, c5469g.f20796a) && AbstractC6118n.m27183a(this.f20797b, c5469g.f20797b);
    }

    public int hashCode() {
        String str = this.f20796a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20797b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f20796a + ", authToken=" + this.f20797b + ')';
    }
}
