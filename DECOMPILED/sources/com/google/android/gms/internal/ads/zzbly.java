package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbly extends zzaya implements zzblz {
    public zzbly() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbmc zzbmaVar;
        if (i7 == 3) {
            InterfaceC3340f1 interfaceC3340f1Zzb = zzb();
            parcel2.writeNoException();
            zzayb.zze(parcel2, interfaceC3340f1Zzb);
            return true;
        }
        if (i7 == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i7 == 5) {
            InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbmaVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbmaVar = iInterfaceQueryLocalInterface instanceof zzbmc ? (zzbmc) iInterfaceQueryLocalInterface : new zzbma(strongBinder);
            }
            zzayb.zzh(parcel);
            zzd(interfaceC3772aM18219L0, zzbmaVar);
            parcel2.writeNoException();
            return true;
        }
        if (i7 == 6) {
            InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
            zzayb.zzh(parcel);
            zze(interfaceC3772aM18219L1);
            parcel2.writeNoException();
            return true;
        }
        if (i7 != 7) {
            return false;
        }
        zzbft zzbftVarZzf = zzf();
        parcel2.writeNoException();
        zzayb.zze(parcel2, zzbftVarZzf);
        return true;
    }
}
