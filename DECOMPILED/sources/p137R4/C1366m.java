package p137R4;

import p158U4.InterfaceC1684h;

/* JADX INFO: renamed from: R4.m */
/* JADX INFO: loaded from: classes.dex */
public class C1366m {

    /* JADX INFO: renamed from: a */
    private final a f4805a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1684h f4806b;

    /* JADX INFO: renamed from: R4.m$a */
    public enum a {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    private C1366m(a aVar, InterfaceC1684h interfaceC1684h) {
        this.f4805a = aVar;
        this.f4806b = interfaceC1684h;
    }

    /* JADX INFO: renamed from: a */
    public static C1366m m5904a(a aVar, InterfaceC1684h interfaceC1684h) {
        return new C1366m(aVar, interfaceC1684h);
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC1684h m5905b() {
        return this.f4806b;
    }

    /* JADX INFO: renamed from: c */
    public a m5906c() {
        return this.f4805a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1366m)) {
            return false;
        }
        C1366m c1366m = (C1366m) obj;
        return this.f4805a.equals(c1366m.f4805a) && this.f4806b.equals(c1366m.f4806b);
    }

    public int hashCode() {
        return ((((1891 + this.f4805a.hashCode()) * 31) + this.f4806b.getKey().hashCode()) * 31) + this.f4806b.getData().hashCode();
    }

    public String toString() {
        return "DocumentViewChange(" + this.f4806b + "," + this.f4805a + ")";
    }
}
