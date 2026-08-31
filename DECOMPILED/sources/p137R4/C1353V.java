package p137R4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p158U4.C1689m;
import p158U4.InterfaceC1684h;
import p350s4.C7011e;

/* JADX INFO: renamed from: R4.V */
/* JADX INFO: loaded from: classes.dex */
public class C1353V {

    /* JADX INFO: renamed from: a */
    private final C1343K f4748a;

    /* JADX INFO: renamed from: b */
    private final C1689m f4749b;

    /* JADX INFO: renamed from: c */
    private final C1689m f4750c;

    /* JADX INFO: renamed from: d */
    private final List f4751d;

    /* JADX INFO: renamed from: e */
    private final boolean f4752e;

    /* JADX INFO: renamed from: f */
    private final C7011e f4753f;

    /* JADX INFO: renamed from: g */
    private final boolean f4754g;

    /* JADX INFO: renamed from: h */
    private boolean f4755h;

    /* JADX INFO: renamed from: i */
    private boolean f4756i;

    /* JADX INFO: renamed from: R4.V$a */
    public enum a {
        NONE,
        LOCAL,
        SYNCED
    }

    public C1353V(C1343K c1343k, C1689m c1689m, C1689m c1689m2, List list, boolean z7, C7011e c7011e, boolean z8, boolean z9, boolean z10) {
        this.f4748a = c1343k;
        this.f4749b = c1689m;
        this.f4750c = c1689m2;
        this.f4751d = list;
        this.f4752e = z7;
        this.f4753f = c7011e;
        this.f4754g = z8;
        this.f4755h = z9;
        this.f4756i = z10;
    }

    /* JADX INFO: renamed from: c */
    public static C1353V m5848c(C1343K c1343k, C1689m c1689m, C7011e c7011e, boolean z7, boolean z8, boolean z9) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c1689m.iterator();
        while (it.hasNext()) {
            arrayList.add(C1366m.m5904a(C1366m.a.ADDED, (InterfaceC1684h) it.next()));
        }
        return new C1353V(c1343k, c1689m, C1689m.m7098e(c1343k.m5751c()), arrayList, z7, c7011e, true, z8, z9);
    }

    /* JADX INFO: renamed from: a */
    public boolean m5849a() {
        return this.f4754g;
    }

    /* JADX INFO: renamed from: b */
    public boolean m5850b() {
        return this.f4755h;
    }

    /* JADX INFO: renamed from: d */
    public List m5851d() {
        return this.f4751d;
    }

    /* JADX INFO: renamed from: e */
    public C1689m m5852e() {
        return this.f4749b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1353V)) {
            return false;
        }
        C1353V c1353v = (C1353V) obj;
        if (this.f4752e == c1353v.f4752e && this.f4754g == c1353v.f4754g && this.f4755h == c1353v.f4755h && this.f4748a.equals(c1353v.f4748a) && this.f4753f.equals(c1353v.f4753f) && this.f4749b.equals(c1353v.f4749b) && this.f4750c.equals(c1353v.f4750c) && this.f4756i == c1353v.f4756i) {
            return this.f4751d.equals(c1353v.f4751d);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public C7011e m5853f() {
        return this.f4753f;
    }

    /* JADX INFO: renamed from: g */
    public C1689m m5854g() {
        return this.f4750c;
    }

    /* JADX INFO: renamed from: h */
    public C1343K m5855h() {
        return this.f4748a;
    }

    public int hashCode() {
        return (((((((((((((((this.f4748a.hashCode() * 31) + this.f4749b.hashCode()) * 31) + this.f4750c.hashCode()) * 31) + this.f4751d.hashCode()) * 31) + this.f4753f.hashCode()) * 31) + (this.f4752e ? 1 : 0)) * 31) + (this.f4754g ? 1 : 0)) * 31) + (this.f4755h ? 1 : 0)) * 31) + (this.f4756i ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public boolean m5856i() {
        return this.f4756i;
    }

    /* JADX INFO: renamed from: j */
    public boolean m5857j() {
        return !this.f4753f.isEmpty();
    }

    /* JADX INFO: renamed from: k */
    public boolean m5858k() {
        return this.f4752e;
    }

    public String toString() {
        return "ViewSnapshot(" + this.f4748a + ", " + this.f4749b + ", " + this.f4750c + ", " + this.f4751d + ", isFromCache=" + this.f4752e + ", mutatedKeys=" + this.f4753f.size() + ", didSyncStateChange=" + this.f4754g + ", excludesMetadataChanges=" + this.f4755h + ", hasCachedResults=" + this.f4756i + ")";
    }
}
