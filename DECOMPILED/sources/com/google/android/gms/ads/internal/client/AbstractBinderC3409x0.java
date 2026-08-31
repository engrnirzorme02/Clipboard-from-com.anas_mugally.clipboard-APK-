package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbox;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.x0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3409x0 extends zzaya implements InterfaceC3412y0 {
    public AbstractBinderC3409x0() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static InterfaceC3412y0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3412y0 ? (InterfaceC3412y0) iInterfaceQueryLocalInterface : new C3406w0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            C3249C1 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzayb.zzd(parcel2, liteSdkVersion);
        } else {
            if (i7 != 2) {
                return false;
            }
            zzbox adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzayb.zze(parcel2, adapterCreator);
        }
        return true;
    }
}
