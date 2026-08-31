package p307n3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: renamed from: n3.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C6489g extends zaa implements IInterface {
    C6489g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* JADX INFO: renamed from: L0 */
    public final void m27652L0(C6492j c6492j, InterfaceC6488f interfaceC6488f) {
        Parcel parcelZaa = zaa();
        zac.zac(parcelZaa, c6492j);
        zac.zad(parcelZaa, interfaceC6488f);
        zac(12, parcelZaa);
    }
}
