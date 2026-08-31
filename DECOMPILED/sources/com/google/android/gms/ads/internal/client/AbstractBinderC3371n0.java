package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.n0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3371n0 extends zzaya implements InterfaceC3375o0 {
    public AbstractBinderC3371n0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static InterfaceC3375o0 zzd(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3375o0 ? (InterfaceC3375o0) iInterfaceQueryLocalInterface : new C3367m0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        zzayb.zzh(parcel);
        zzb(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
