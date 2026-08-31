package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;

/* JADX INFO: renamed from: com.google.android.gms.location.B */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3937B extends zzb implements InterfaceC3938C {
    public AbstractBinderC3937B() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static InterfaceC3938C zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3938C ? (InterfaceC3938C) iInterfaceQueryLocalInterface : new C3936A(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        zzd((Location) zzc.zzb(parcel, Location.CREATOR));
        return true;
    }
}
