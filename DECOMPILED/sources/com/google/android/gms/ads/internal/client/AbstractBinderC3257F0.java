package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.F0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3257F0 extends zzaya implements InterfaceC3260G0 {
    public AbstractBinderC3257F0() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    /* JADX INFO: renamed from: L0 */
    public static InterfaceC3260G0 m17206L0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3260G0 ? (InterfaceC3260G0) iInterfaceQueryLocalInterface : new C3254E0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        zze();
        parcel2.writeNoException();
        return true;
    }
}
