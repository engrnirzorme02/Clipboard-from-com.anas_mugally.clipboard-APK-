package p137R4;

import p158U4.C1687k;

/* JADX INFO: renamed from: R4.E */
/* JADX INFO: loaded from: classes.dex */
public class C1337E {

    /* JADX INFO: renamed from: a */
    private final a f4662a;

    /* JADX INFO: renamed from: b */
    private final C1687k f4663b;

    /* JADX INFO: renamed from: R4.E$a */
    public enum a {
        ADDED,
        REMOVED
    }

    public C1337E(a aVar, C1687k c1687k) {
        this.f4662a = aVar;
        this.f4663b = c1687k;
    }

    /* JADX INFO: renamed from: a */
    public C1687k m5719a() {
        return this.f4663b;
    }

    /* JADX INFO: renamed from: b */
    public a m5720b() {
        return this.f4662a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1337E)) {
            return false;
        }
        C1337E c1337e = (C1337E) obj;
        return this.f4662a.equals(c1337e.m5720b()) && this.f4663b.equals(c1337e.m5719a());
    }

    public int hashCode() {
        return ((2077 + this.f4662a.hashCode()) * 31) + this.f4663b.hashCode();
    }
}
