package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;

/* JADX INFO: renamed from: com.google.android.gms.location.u */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3982u extends zzb implements InterfaceC3983v {
    public static InterfaceC3983v zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3983v ? (InterfaceC3983v) iInterfaceQueryLocalInterface : new C3981t(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        throw null;
    }
}
