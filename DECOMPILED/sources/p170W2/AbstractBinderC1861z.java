package p170W2;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: W2.z */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractBinderC1861z extends AbstractBinderC1859x {

    /* JADX INFO: renamed from: c */
    private static final WeakReference f6012c = new WeakReference(null);

    /* JADX INFO: renamed from: b */
    private WeakReference f6013b;

    AbstractBinderC1861z(byte[] bArr) {
        super(bArr);
        this.f6013b = f6012c;
    }

    @Override // p170W2.AbstractBinderC1859x
    /* JADX INFO: renamed from: N0 */
    final byte[] mo7653N0() {
        byte[] bArrMo7651O0;
        synchronized (this) {
            try {
                bArrMo7651O0 = (byte[]) this.f6013b.get();
                if (bArrMo7651O0 == null) {
                    bArrMo7651O0 = mo7651O0();
                    this.f6013b = new WeakReference(bArrMo7651O0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrMo7651O0;
    }

    /* JADX INFO: renamed from: O0 */
    protected abstract byte[] mo7651O0();
}
