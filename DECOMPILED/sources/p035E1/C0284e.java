package p035E1;

import java.io.File;
import p019C1.C0132h;
import p019C1.InterfaceC0128d;
import p051G1.InterfaceC0470a;

/* JADX INFO: renamed from: E1.e */
/* JADX INFO: loaded from: classes.dex */
class C0284e implements InterfaceC0470a.b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0128d f1072a;

    /* JADX INFO: renamed from: b */
    private final Object f1073b;

    /* JADX INFO: renamed from: c */
    private final C0132h f1074c;

    C0284e(InterfaceC0128d interfaceC0128d, Object obj, C0132h c0132h) {
        this.f1072a = interfaceC0128d;
        this.f1073b = obj;
        this.f1074c = c0132h;
    }

    @Override // p051G1.InterfaceC0470a.b
    /* JADX INFO: renamed from: a */
    public boolean mo1315a(File file) {
        return this.f1072a.mo589a(this.f1073b, file, this.f1074c);
    }
}
