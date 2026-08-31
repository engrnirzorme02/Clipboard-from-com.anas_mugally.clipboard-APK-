package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbfz extends zzaya implements zzbga {
    public zzbfz() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbga zzdK(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof zzbga ? (zzbga) iInterfaceQueryLocalInterface : new zzbfy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbft zzbfrVar;
        switch (i7) {
            case 1:
                String string = parcel.readString();
                InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzb(string, interfaceC3772aM18219L0);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                zzayb.zzh(parcel);
                InterfaceC3772a interfaceC3772aZzc = zzc(string2);
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3772aZzc);
                return true;
            case 3:
                InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzd(interfaceC3772aM18219L1);
                parcel2.writeNoException();
                return true;
            case 4:
                zze();
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                parcel.readInt();
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC3772a interfaceC3772aM18219L2 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzg(interfaceC3772aM18219L2);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC3772a interfaceC3772aM18219L3 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzdH(interfaceC3772aM18219L3);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbfrVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbfrVar = iInterfaceQueryLocalInterface instanceof zzbft ? (zzbft) iInterfaceQueryLocalInterface : new zzbfr(strongBinder);
                }
                zzayb.zzh(parcel);
                zzdI(zzbfrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC3772a interfaceC3772aM18219L4 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzdG(interfaceC3772aM18219L4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
