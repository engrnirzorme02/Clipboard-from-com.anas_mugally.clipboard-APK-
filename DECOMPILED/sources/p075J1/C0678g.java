package p075J1;

import java.io.InputStream;
import java.net.URL;
import p019C1.C0132h;
import p067I1.C0588h;
import p067I1.C0598r;
import p067I1.InterfaceC0594n;
import p067I1.InterfaceC0595o;

/* JADX INFO: renamed from: J1.g */
/* JADX INFO: loaded from: classes.dex */
public class C0678g implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0594n f2636a;

    /* JADX INFO: renamed from: J1.g$a */
    public static class a implements InterfaceC0595o {
        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0678g(c0598r.m2628d(C0588h.class, InputStream.class));
        }
    }

    public C0678g(InterfaceC0594n interfaceC0594n) {
        this.f2636a = interfaceC0594n;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(URL url, int i7, int i8, C0132h c0132h) {
        return this.f2636a.mo2552a(new C0588h(url), i7, i8, c0132h);
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(URL url) {
        return true;
    }
}
