package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.X */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3679X extends zzb implements InterfaceC3706m {
    public AbstractBinderC3679X() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            int i9 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            mo18041P(i9, strongBinder, bundle);
        } else if (i7 == 2) {
            int i10 = parcel.readInt();
            Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            mo18039A(i10, bundle2);
        } else {
            if (i7 != 3) {
                return false;
            }
            int i11 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            C3707m0 c3707m0 = (C3707m0) zzc.zza(parcel, C3707m0.CREATOR);
            zzc.zzb(parcel);
            mo18040A0(i11, strongBinder2, c3707m0);
        }
        parcel2.writeNoException();
        return true;
    }
}
