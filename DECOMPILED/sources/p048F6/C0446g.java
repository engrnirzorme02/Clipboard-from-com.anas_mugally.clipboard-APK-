package p048F6;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: F6.g */
/* JADX INFO: loaded from: classes.dex */
public class C0446g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0451l f1719a;

    /* JADX INFO: renamed from: b */
    private boolean f1720b;

    public C0446g(InterfaceC0451l writer) {
        AbstractC6118n.m27187e(writer, "writer");
        this.f1719a = writer;
        this.f1720b = true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1933a() {
        return this.f1720b;
    }

    /* JADX INFO: renamed from: b */
    public void mo1934b() {
        this.f1720b = true;
    }

    /* JADX INFO: renamed from: c */
    public void mo1935c() {
        this.f1720b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo1936d() {
        this.f1720b = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m1937e(char c7) {
        this.f1719a.mo1952a(c7);
    }

    /* JADX INFO: renamed from: f */
    public void m1938f(double d7) {
        this.f1719a.mo1955d(String.valueOf(d7));
    }

    /* JADX INFO: renamed from: g */
    public void m1939g(int i7) {
        this.f1719a.mo1954c(i7);
    }

    /* JADX INFO: renamed from: h */
    public void m1940h(long j7) {
        this.f1719a.mo1954c(j7);
    }

    /* JADX INFO: renamed from: i */
    public final void m1941i(String v7) {
        AbstractC6118n.m27187e(v7, "v");
        this.f1719a.mo1955d(v7);
    }

    /* JADX INFO: renamed from: j */
    public void m1942j(boolean z7) {
        this.f1719a.mo1955d(String.valueOf(z7));
    }

    /* JADX INFO: renamed from: k */
    public void m1943k(String value) {
        AbstractC6118n.m27187e(value, "value");
        this.f1719a.mo1953b(value);
    }

    /* JADX INFO: renamed from: l */
    protected final void m1944l(boolean z7) {
        this.f1720b = z7;
    }

    /* JADX INFO: renamed from: m */
    public void mo1945m() {
    }

    /* JADX INFO: renamed from: n */
    public void mo1946n() {
    }
}
