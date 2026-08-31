package p006A4;

import com.google.firebase.database.C4904a;
import p374v4.AbstractC7243h;
import p374v4.C7245j;

/* JADX INFO: renamed from: A4.d */
/* JADX INFO: loaded from: classes.dex */
public class C0019d implements InterfaceC0020e {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0020e.a f102a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7243h f103b;

    /* JADX INFO: renamed from: c */
    private final C4904a f104c;

    /* JADX INFO: renamed from: d */
    private final String f105d;

    public C0019d(InterfaceC0020e.a aVar, AbstractC7243h abstractC7243h, C4904a c4904a, String str) {
        this.f102a = aVar;
        this.f103b = abstractC7243h;
        this.f104c = c4904a;
        this.f105d = str;
    }

    @Override // p006A4.InterfaceC0020e
    /* JADX INFO: renamed from: a */
    public void mo90a() {
        this.f103b.mo31897c(this);
    }

    /* JADX INFO: renamed from: b */
    public C7245j m105b() {
        C7245j c7245jM22125b = this.f104c.m22103d().m22125b();
        return this.f102a == InterfaceC0020e.a.VALUE ? c7245jM22125b : c7245jM22125b.m31995A();
    }

    /* JADX INFO: renamed from: c */
    public C4904a m106c() {
        return this.f104c;
    }

    @Override // p006A4.InterfaceC0020e
    public String toString() {
        if (this.f102a == InterfaceC0020e.a.VALUE) {
            return m105b() + ": " + this.f102a + ": " + this.f104c.m22105f(true);
        }
        return m105b() + ": " + this.f102a + ": { " + this.f104c.m22102c() + ": " + this.f104c.m22105f(true) + " }";
    }
}
