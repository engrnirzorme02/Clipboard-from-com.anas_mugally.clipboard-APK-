package p091L1;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p035E1.InterfaceC0301v;
import p043F1.InterfaceC0406d;
import p106N1.C0946l;

/* JADX INFO: renamed from: L1.W */
/* JADX INFO: loaded from: classes.dex */
public class C0802W implements InterfaceC0134j {

    /* JADX INFO: renamed from: a */
    private final C0946l f3220a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0406d f3221b;

    public C0802W(C0946l c0946l, InterfaceC0406d interfaceC0406d) {
        this.f3220a = c0946l;
        this.f3221b = interfaceC0406d;
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0301v mo605a(Uri uri, int i7, int i8, C0132h c0132h) {
        InterfaceC0301v interfaceC0301vMo605a = this.f3220a.mo605a(uri, i7, i8, c0132h);
        if (interfaceC0301vMo605a == null) {
            return null;
        }
        return AbstractC0825r.m3871a(this.f3221b, (Drawable) interfaceC0301vMo605a.get(), i7, i8);
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo606b(Uri uri, C0132h c0132h) {
        return "android.resource".equals(uri.getScheme());
    }
}
