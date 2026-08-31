package p091L1;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import p019C1.C0132h;
import p019C1.EnumC0127c;
import p019C1.InterfaceC0135k;
import p035E1.InterfaceC0301v;
import p043F1.InterfaceC0406d;

/* JADX INFO: renamed from: L1.b */
/* JADX INFO: loaded from: classes.dex */
public class C0808b implements InterfaceC0135k {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0406d f3234a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0135k f3235b;

    public C0808b(InterfaceC0406d interfaceC0406d, InterfaceC0135k interfaceC0135k) {
        this.f3234a = interfaceC0406d;
        this.f3235b = interfaceC0135k;
    }

    @Override // p019C1.InterfaceC0135k
    /* JADX INFO: renamed from: b */
    public EnumC0127c mo607b(C0132h c0132h) {
        return this.f3235b.mo607b(c0132h);
    }

    @Override // p019C1.InterfaceC0128d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo589a(InterfaceC0301v interfaceC0301v, File file, C0132h c0132h) {
        return this.f3235b.mo589a(new C0814g(((BitmapDrawable) interfaceC0301v.get()).getBitmap(), this.f3234a), file, c0132h);
    }
}
