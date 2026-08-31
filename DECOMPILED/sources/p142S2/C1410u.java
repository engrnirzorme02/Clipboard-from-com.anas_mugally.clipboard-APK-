package p142S2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p409authapi.zba;
import com.google.android.gms.internal.p409authapi.zbc;

/* JADX INFO: renamed from: S2.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1410u extends zba implements IInterface {
    C1410u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* JADX INFO: renamed from: L0 */
    public final void m5999L0(InterfaceC1409t interfaceC1409t, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, interfaceC1409t);
        zbc.zbb(parcelZba, googleSignInOptions);
        zbb(102, parcelZba);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m6000M0(InterfaceC1409t interfaceC1409t, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, interfaceC1409t);
        zbc.zbb(parcelZba, googleSignInOptions);
        zbb(103, parcelZba);
    }
}
