package p170W2;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC3657A0;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.InterfaceC3678W;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: renamed from: W2.x */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractBinderC1859x extends AbstractBinderC3657A0 {

    /* JADX INFO: renamed from: a */
    private final int f6010a;

    protected AbstractBinderC1859x(byte[] bArr) {
        AbstractC3718s.m18072a(bArr.length == 25);
        this.f6010a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: M0 */
    protected static byte[] m7652M0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    /* JADX INFO: renamed from: N0 */
    abstract byte[] mo7653N0();

    public final boolean equals(Object obj) {
        InterfaceC3772a interfaceC3772aZzd;
        if (obj != null && (obj instanceof InterfaceC3678W)) {
            try {
                InterfaceC3678W interfaceC3678W = (InterfaceC3678W) obj;
                if (interfaceC3678W.zzc() == this.f6010a && (interfaceC3772aZzd = interfaceC3678W.zzd()) != null) {
                    return Arrays.equals(mo7653N0(), (byte[]) BinderC3773b.m18220M0(interfaceC3772aZzd));
                }
                return false;
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6010a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3678W
    public final int zzc() {
        return this.f6010a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3678W
    public final InterfaceC3772a zzd() {
        return BinderC3773b.m18221N0(mo7653N0());
    }
}
