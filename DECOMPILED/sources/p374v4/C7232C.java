package p374v4;

import com.google.firebase.database.AbstractC4908e;
import p006A4.C0018c;
import p006A4.C0019d;
import p006A4.C0024i;
import p006A4.InterfaceC0020e;
import p334q4.C6834a;
import p334q4.InterfaceC6841h;

/* JADX INFO: renamed from: v4.C */
/* JADX INFO: loaded from: classes.dex */
public class C7232C extends AbstractC7243h {

    /* JADX INFO: renamed from: c */
    private final C7247l f28821c;

    /* JADX INFO: renamed from: d */
    private final C0024i f28822d;

    public C7232C(C7247l c7247l, InterfaceC6841h interfaceC6841h, C0024i c0024i) {
        this.f28821c = c7247l;
        this.f28822d = c0024i;
    }

    @Override // p374v4.AbstractC7243h
    /* JADX INFO: renamed from: a */
    public C0019d mo31895a(C0018c c0018c, C0024i c0024i) {
        return new C0019d(InterfaceC0020e.a.VALUE, this, AbstractC4908e.m22119a(AbstractC4908e.m22121c(this.f28821c, c0024i.m138e()), c0018c.m103k()), null);
    }

    @Override // p374v4.AbstractC7243h
    /* JADX INFO: renamed from: b */
    public void mo31896b(C6834a c6834a) {
        throw null;
    }

    @Override // p374v4.AbstractC7243h
    /* JADX INFO: renamed from: c */
    public void mo31897c(C0019d c0019d) {
        if (m31988f()) {
            return;
        }
        c0019d.m106c();
        throw null;
    }

    @Override // p374v4.AbstractC7243h
    /* JADX INFO: renamed from: d */
    public C0024i mo31898d() {
        return this.f28822d;
    }

    @Override // p374v4.AbstractC7243h
    /* JADX INFO: renamed from: e */
    public boolean mo31899e(AbstractC7243h abstractC7243h) {
        if (!(abstractC7243h instanceof C7232C)) {
            return false;
        }
        ((C7232C) abstractC7243h).getClass();
        throw null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7232C)) {
            return false;
        }
        ((C7232C) obj).getClass();
        throw null;
    }

    @Override // p374v4.AbstractC7243h
    /* JADX INFO: renamed from: g */
    public boolean mo31900g(InterfaceC0020e.a aVar) {
        return aVar == InterfaceC0020e.a.VALUE;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "ValueEventRegistration";
    }
}
