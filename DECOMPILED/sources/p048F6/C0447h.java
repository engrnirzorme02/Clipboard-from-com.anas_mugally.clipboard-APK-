package p048F6;

import kotlin.jvm.internal.AbstractC6118n;
import p040E6.AbstractC0393b;

/* JADX INFO: renamed from: F6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0447h extends C0446g {

    /* JADX INFO: renamed from: c */
    private final AbstractC0393b f1721c;

    /* JADX INFO: renamed from: d */
    private int f1722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0447h(InterfaceC0451l writer, AbstractC0393b json) {
        super(writer);
        AbstractC6118n.m27187e(writer, "writer");
        AbstractC6118n.m27187e(json, "json");
        this.f1721c = json;
    }

    @Override // p048F6.C0446g
    /* JADX INFO: renamed from: b */
    public void mo1934b() {
        m1944l(true);
        this.f1722d++;
    }

    @Override // p048F6.C0446g
    /* JADX INFO: renamed from: c */
    public void mo1935c() {
        m1944l(false);
        m1941i("\n");
        int i7 = this.f1722d;
        for (int i8 = 0; i8 < i7; i8++) {
            m1941i(this.f1721c.m1673c().m1689n());
        }
    }

    @Override // p048F6.C0446g
    /* JADX INFO: renamed from: d */
    public void mo1936d() {
        if (m1933a()) {
            m1944l(false);
        } else {
            mo1935c();
        }
    }

    @Override // p048F6.C0446g
    /* JADX INFO: renamed from: m */
    public void mo1945m() {
        m1937e(' ');
    }

    @Override // p048F6.C0446g
    /* JADX INFO: renamed from: n */
    public void mo1946n() {
        this.f1722d--;
    }
}
