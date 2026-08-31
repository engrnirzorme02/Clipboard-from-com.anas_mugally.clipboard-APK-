package p006A4;

import p334q4.C6834a;
import p374v4.AbstractC7243h;
import p374v4.C7245j;

/* JADX INFO: renamed from: A4.b */
/* JADX INFO: loaded from: classes.dex */
public class C0017b implements InterfaceC0020e {

    /* JADX INFO: renamed from: a */
    private final C7245j f94a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7243h f95b;

    /* JADX INFO: renamed from: c */
    private final C6834a f96c;

    public C0017b(AbstractC7243h abstractC7243h, C6834a c6834a, C7245j c7245j) {
        this.f95b = abstractC7243h;
        this.f94a = c7245j;
        this.f96c = c6834a;
    }

    @Override // p006A4.InterfaceC0020e
    /* JADX INFO: renamed from: a */
    public void mo90a() {
        this.f95b.mo31896b(this.f96c);
    }

    /* JADX INFO: renamed from: b */
    public C7245j m91b() {
        return this.f94a;
    }

    @Override // p006A4.InterfaceC0020e
    public String toString() {
        return m91b() + ":CANCEL";
    }
}
