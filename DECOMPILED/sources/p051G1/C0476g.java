package p051G1;

import p019C1.InterfaceC0130f;
import p035E1.InterfaceC0301v;
import p183Y1.C2019h;

/* JADX INFO: renamed from: G1.g */
/* JADX INFO: loaded from: classes.dex */
public class C0476g extends C2019h implements InterfaceC0477h {

    /* JADX INFO: renamed from: e */
    private InterfaceC0477h.a f1779e;

    public C0476g(long j7) {
        super(j7);
    }

    @Override // p051G1.InterfaceC0477h
    /* JADX INFO: renamed from: a */
    public void mo2041a(int i7) {
        if (i7 >= 40) {
            m8395b();
        } else if (i7 >= 20 || i7 == 15) {
            m8400m(m8397h() / 2);
        }
    }

    @Override // p051G1.InterfaceC0477h
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC0301v mo2042c(InterfaceC0130f interfaceC0130f) {
        return (InterfaceC0301v) super.m8399l(interfaceC0130f);
    }

    @Override // p051G1.InterfaceC0477h
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC0301v mo2043d(InterfaceC0130f interfaceC0130f, InterfaceC0301v interfaceC0301v) {
        return (InterfaceC0301v) super.m8398k(interfaceC0130f, interfaceC0301v);
    }

    @Override // p051G1.InterfaceC0477h
    /* JADX INFO: renamed from: e */
    public void mo2044e(InterfaceC0477h.a aVar) {
        this.f1779e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p183Y1.C2019h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo2045i(InterfaceC0301v interfaceC0301v) {
        return interfaceC0301v == null ? super.mo2045i(null) : interfaceC0301v.mo1437c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p183Y1.C2019h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo2046j(InterfaceC0130f interfaceC0130f, InterfaceC0301v interfaceC0301v) {
        InterfaceC0477h.a aVar = this.f1779e;
        if (aVar == null || interfaceC0301v == null) {
            return;
        }
        aVar.mo1402b(interfaceC0301v);
    }
}
