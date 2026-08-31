package p120P1;

import p011B1.InterfaceC0055a;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p035E1.InterfaceC0301v;
import p043F1.InterfaceC0406d;
import p091L1.C0814g;

/* JADX INFO: renamed from: P1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1191h implements InterfaceC0134j {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0406d f4265a;

    public C1191h(InterfaceC0406d interfaceC0406d) {
        this.f4265a = interfaceC0406d;
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0301v mo605a(InterfaceC0055a interfaceC0055a, int i7, int i8, C0132h c0132h) {
        return C0814g.m3805f(interfaceC0055a.mo208b(), this.f4265a);
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo606b(InterfaceC0055a interfaceC0055a, C0132h c0132h) {
        return true;
    }
}
