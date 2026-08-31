package p075J1;

import com.bumptech.glide.load.data.C3225j;
import p019C1.C0131g;
import p019C1.C0132h;
import p067I1.C0588h;
import p067I1.C0593m;
import p067I1.C0598r;
import p067I1.InterfaceC0594n;
import p067I1.InterfaceC0595o;

/* JADX INFO: renamed from: J1.a */
/* JADX INFO: loaded from: classes.dex */
public class C0672a implements InterfaceC0594n {

    /* JADX INFO: renamed from: b */
    public static final C0131g f2612b = C0131g.m595f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a */
    private final C0593m f2613a;

    /* JADX INFO: renamed from: J1.a$a */
    public static class a implements InterfaceC0595o {

        /* JADX INFO: renamed from: a */
        private final C0593m f2614a = new C0593m(500);

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0672a(this.f2614a);
        }
    }

    public C0672a(C0593m c0593m) {
        this.f2613a = c0593m;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(C0588h c0588h, int i7, int i8, C0132h c0132h) {
        C0593m c0593m = this.f2613a;
        if (c0593m != null) {
            C0588h c0588h2 = (C0588h) c0593m.m2609a(c0588h, 0, 0);
            if (c0588h2 == null) {
                this.f2613a.m2610b(c0588h, 0, 0, c0588h);
            } else {
                c0588h = c0588h2;
            }
        }
        return new InterfaceC0594n.a(c0588h, new C3225j(c0588h, ((Integer) c0132h.m600c(f2612b)).intValue()));
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(C0588h c0588h) {
        return true;
    }
}
