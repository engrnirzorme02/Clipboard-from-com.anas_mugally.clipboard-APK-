package p091L1;

import android.content.res.Resources;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p035E1.InterfaceC0301v;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: L1.a */
/* JADX INFO: loaded from: classes.dex */
public class C0806a implements InterfaceC0134j {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0134j f3232a;

    /* JADX INFO: renamed from: b */
    private final Resources f3233b;

    public C0806a(Resources resources, InterfaceC0134j interfaceC0134j) {
        this.f3233b = (Resources) AbstractC2022k.m8408e(resources);
        this.f3232a = (InterfaceC0134j) AbstractC2022k.m8408e(interfaceC0134j);
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: a */
    public InterfaceC0301v mo605a(Object obj, int i7, int i8, C0132h c0132h) {
        return C0799T.m3741f(this.f3233b, this.f3232a.mo605a(obj, i7, i8, c0132h));
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: b */
    public boolean mo606b(Object obj, C0132h c0132h) {
        return this.f3232a.mo606b(obj, c0132h);
    }
}
