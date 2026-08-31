package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbyd extends zzaya implements zzbye {
    public zzbyd() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbye zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzbye ? (zzbye) iInterfaceQueryLocalInterface : new zzbyc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbyb zzbxzVar = null;
        switch (i7) {
            case 1:
                InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzbyi zzbyiVar = (zzbyi) zzayb.zzb(parcel, zzbyi.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbxzVar = iInterfaceQueryLocalInterface instanceof zzbyb ? (zzbyb) iInterfaceQueryLocalInterface : new zzbxz(strongBinder);
                }
                zzayb.zzh(parcel);
                zze(interfaceC3772aM18219L0, zzbyiVar, zzbxzVar);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzf(interfaceC3772aM18219L1);
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 4:
                InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC3772a interfaceC3772aM18219L2 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzbtl zzbtlVarZzb = zzbtk.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzg(arrayListCreateTypedArrayList, interfaceC3772aM18219L2, zzbtlVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC3772a interfaceC3772aM18219L3 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzbtl zzbtlVarZzb2 = zzbtk.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzh(arrayListCreateTypedArrayList2, interfaceC3772aM18219L3, zzbtlVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbto zzbtoVar = (zzbto) zzayb.zzb(parcel, zzbto.CREATOR);
                zzayb.zzh(parcel);
                zzi(zzbtoVar);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC3772a interfaceC3772aM18219L4 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzj(interfaceC3772aM18219L4);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC3772a interfaceC3772aM18219L5 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzbtl zzbtlVarZzb3 = zzbtk.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzk(arrayListCreateTypedArrayList3, interfaceC3772aM18219L5, zzbtlVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC3772a interfaceC3772aM18219L6 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzbtl zzbtlVarZzb4 = zzbtk.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzl(arrayListCreateTypedArrayList4, interfaceC3772aM18219L6, zzbtlVarZzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC3772a interfaceC3772aM18219L7 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                InterfaceC3772a interfaceC3772aM18219L8 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                String string = parcel.readString();
                InterfaceC3772a interfaceC3772aM18219L9 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                InterfaceC3772a interfaceC3772aZzm = zzm(interfaceC3772aM18219L7, interfaceC3772aM18219L8, string, interfaceC3772aM18219L9);
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3772aZzm);
                return true;
            default:
                return false;
        }
    }
}
