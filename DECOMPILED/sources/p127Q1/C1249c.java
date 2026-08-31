package p127Q1;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p019C1.C0132h;
import p035E1.InterfaceC0301v;
import p043F1.InterfaceC0406d;
import p091L1.C0814g;
import p120P1.C1186c;

/* JADX INFO: renamed from: Q1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1249c implements InterfaceC1251e {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0406d f4474a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1251e f4475b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1251e f4476c;

    public C1249c(InterfaceC0406d interfaceC0406d, InterfaceC1251e interfaceC1251e, InterfaceC1251e interfaceC1251e2) {
        this.f4474a = interfaceC0406d;
        this.f4475b = interfaceC1251e;
        this.f4476c = interfaceC1251e2;
    }

    /* JADX INFO: renamed from: b */
    private static InterfaceC0301v m5497b(InterfaceC0301v interfaceC0301v) {
        return interfaceC0301v;
    }

    @Override // p127Q1.InterfaceC1251e
    /* JADX INFO: renamed from: a */
    public InterfaceC0301v mo5496a(InterfaceC0301v interfaceC0301v, C0132h c0132h) {
        Drawable drawable = (Drawable) interfaceC0301v.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f4475b.mo5496a(C0814g.m3805f(((BitmapDrawable) drawable).getBitmap(), this.f4474a), c0132h);
        }
        if (drawable instanceof C1186c) {
            return this.f4476c.mo5496a(m5497b(interfaceC0301v), c0132h);
        }
        return null;
    }
}
