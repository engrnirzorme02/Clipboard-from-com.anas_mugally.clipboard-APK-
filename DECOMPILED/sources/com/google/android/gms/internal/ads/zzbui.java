package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbui extends zzaya implements zzbuj {
    public zzbui() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbun zzbulVar = null;
        zzbuo zzbuoVar = null;
        zzbun zzbulVar2 = null;
        zzbun zzbulVar3 = null;
        zzbun zzbulVar4 = null;
        switch (i7) {
            case 1:
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zzd(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z7 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener") instanceof zzbuk;
                }
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbuv zzbuvVar = (zzbuv) zzayb.zzb(parcel, zzbuv.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbulVar = iInterfaceQueryLocalInterface instanceof zzbun ? (zzbun) iInterfaceQueryLocalInterface : new zzbul(strongBinder2);
                }
                zzayb.zzh(parcel);
                zze(zzbuvVar, zzbulVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbuv zzbuvVar2 = (zzbuv) zzayb.zzb(parcel, zzbuv.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbulVar4 = iInterfaceQueryLocalInterface2 instanceof zzbun ? (zzbun) iInterfaceQueryLocalInterface2 : new zzbul(strongBinder3);
                }
                zzayb.zzh(parcel);
                zzf(zzbuvVar2, zzbulVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbuv zzbuvVar3 = (zzbuv) zzayb.zzb(parcel, zzbuv.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbulVar3 = iInterfaceQueryLocalInterface3 instanceof zzbun ? (zzbun) iInterfaceQueryLocalInterface3 : new zzbul(strongBinder4);
                }
                zzayb.zzh(parcel);
                zzg(zzbuvVar3, zzbulVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbulVar2 = iInterfaceQueryLocalInterface4 instanceof zzbun ? (zzbun) iInterfaceQueryLocalInterface4 : new zzbul(strongBinder5);
                }
                zzayb.zzh(parcel);
                zzh(string, zzbulVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbuf zzbufVar = (zzbuf) zzayb.zzb(parcel, zzbuf.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbuoVar = iInterfaceQueryLocalInterface5 instanceof zzbuo ? (zzbuo) iInterfaceQueryLocalInterface5 : new zzbuo(strongBinder6);
                }
                zzayb.zzh(parcel);
                zzi(zzbufVar, zzbuoVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
