package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbkp extends zzaxz implements zzbkr {
    zzbkp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    public final zzbko zze(InterfaceC3772a interfaceC3772a, zzbox zzboxVar, int i7, zzbkl zzbklVar) {
        zzbko zzbkmVar;
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzboxVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzayb.zze(parcelZza, zzbklVar);
        Parcel parcelZzde = zzde(1, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbkmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbkmVar = iInterfaceQueryLocalInterface instanceof zzbko ? (zzbko) iInterfaceQueryLocalInterface : new zzbkm(strongBinder);
        }
        parcelZzde.recycle();
        return zzbkmVar;
    }
}
