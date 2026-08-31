package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p388x2.C7403a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbso extends zzaya implements zzbsp {
    public zzbso() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbsp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof zzbsp ? (zzbsp) iInterfaceQueryLocalInterface : new zzbsn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                Intent intent = (Intent) zzayb.zzb(parcel, Intent.CREATOR);
                zzayb.zzh(parcel);
                zze(intent);
                break;
            case 2:
                InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzayb.zzh(parcel);
                zzf(interfaceC3772aM18219L0, string, string2);
                break;
            case 3:
                zzg();
                break;
            case 4:
                InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzh(interfaceC3772aM18219L1);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                InterfaceC3772a interfaceC3772aM18219L2 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzi(strArrCreateStringArray, iArrCreateIntArray, interfaceC3772aM18219L2);
                break;
            case 6:
                InterfaceC3772a interfaceC3772aM18219L3 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C7403a c7403a = (C7403a) zzayb.zzb(parcel, C7403a.CREATOR);
                zzayb.zzh(parcel);
                zzj(interfaceC3772aM18219L3, c7403a);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
