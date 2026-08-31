package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.J0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3269J0 extends zzaya implements InterfaceC3272K0 {
    public AbstractBinderC3269J0() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* JADX INFO: renamed from: L0 */
    public static InterfaceC3272K0 m17210L0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3272K0 ? (InterfaceC3272K0) iInterfaceQueryLocalInterface : new C3266I0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else {
            if (i7 != 2) {
                return false;
            }
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        }
        return true;
    }
}
