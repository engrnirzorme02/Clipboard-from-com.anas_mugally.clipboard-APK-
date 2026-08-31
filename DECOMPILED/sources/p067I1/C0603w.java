package p067I1;

import com.bumptech.glide.EnumC3207g;
import com.bumptech.glide.load.data.InterfaceC3219d;
import p019C1.C0132h;
import p019C1.EnumC0125a;
import p176X1.C1944d;

/* JADX INFO: renamed from: I1.w */
/* JADX INFO: loaded from: classes.dex */
public class C0603w implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private static final C0603w f2310a = new C0603w();

    /* JADX INFO: renamed from: I1.w$a */
    public static class a implements InterfaceC0595o {

        /* JADX INFO: renamed from: a */
        private static final a f2311a = new a();

        /* JADX INFO: renamed from: a */
        public static a m2649a() {
            return f2311a;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return C0603w.m2648c();
        }
    }

    /* JADX INFO: renamed from: I1.w$b */
    private static class b implements InterfaceC3219d {

        /* JADX INFO: renamed from: a */
        private final Object f2312a;

        b(Object obj) {
            this.f2312a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: a */
        public Class mo930a() {
            return this.f2312a.getClass();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: b */
        public void mo931b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: d */
        public EnumC0125a mo932d() {
            return EnumC0125a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: e */
        public void mo933e(EnumC3207g enumC3207g, InterfaceC3219d.a aVar) {
            aVar.mo1314f(this.f2312a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C0603w m2648c() {
        return f2310a;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: a */
    public InterfaceC0594n.a mo2552a(Object obj, int i7, int i8, C0132h c0132h) {
        return new InterfaceC0594n.a(new C1944d(obj), new b(obj));
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: b */
    public boolean mo2553b(Object obj) {
        return true;
    }
}
