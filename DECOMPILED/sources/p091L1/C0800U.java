package p091L1;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p035E1.InterfaceC0301v;

/* JADX INFO: renamed from: L1.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0800U implements InterfaceC0134j {

    /* JADX INFO: renamed from: a */
    private final C0824q f3213a;

    public C0800U(C0824q c0824q) {
        this.f3213a = c0824q;
    }

    /* JADX INFO: renamed from: e */
    private boolean m3743e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0301v mo605a(ParcelFileDescriptor parcelFileDescriptor, int i7, int i8, C0132h c0132h) {
        return this.f3213a.m3865e(parcelFileDescriptor, i7, i8, c0132h);
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo606b(ParcelFileDescriptor parcelFileDescriptor, C0132h c0132h) {
        return m3743e(parcelFileDescriptor) && this.f3213a.m3868o(parcelFileDescriptor);
    }
}
