package p170W2;

import java.util.Arrays;

/* JADX INFO: renamed from: W2.y */
/* JADX INFO: loaded from: classes.dex */
final class BinderC1860y extends AbstractBinderC1859x {

    /* JADX INFO: renamed from: b */
    private final byte[] f6011b;

    BinderC1860y(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f6011b = bArr;
    }

    @Override // p170W2.AbstractBinderC1859x
    /* JADX INFO: renamed from: N0 */
    final byte[] mo7653N0() {
        return this.f6011b;
    }
}
