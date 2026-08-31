package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractBinderC3290Q0;
import com.google.android.gms.ads.internal.client.AbstractBinderC3298T0;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.InterfaceC3292R0;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbvz extends zzaya implements zzbwa {
    public zzbvz() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbwa zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzbwa ? (zzbwa) iInterfaceQueryLocalInterface : new zzbvy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbwh zzbwfVar = null;
        zzbwh zzbwfVar2 = null;
        zzbwi zzbwiVar = null;
        zzbwd zzbwbVar = null;
        switch (i7) {
            case 1:
                C3349h2 c3349h2 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwfVar = iInterfaceQueryLocalInterface instanceof zzbwh ? (zzbwh) iInterfaceQueryLocalInterface : new zzbwf(strongBinder);
                }
                zzayb.zzh(parcel);
                zzc(c3349h2, zzbwfVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbwbVar = iInterfaceQueryLocalInterface2 instanceof zzbwd ? (zzbwd) iInterfaceQueryLocalInterface2 : new zzbwb(strongBinder2);
                }
                zzayb.zzh(parcel);
                zze(zzbwbVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzi = zzi();
                parcel2.writeNoException();
                int i9 = zzayb.zza;
                parcel2.writeInt(zZzi ? 1 : 0);
                return true;
            case 4:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 5:
                InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzb(interfaceC3772aM18219L0);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbwiVar = iInterfaceQueryLocalInterface3 instanceof zzbwi ? (zzbwi) iInterfaceQueryLocalInterface3 : new zzbwi(strongBinder3);
                }
                zzayb.zzh(parcel);
                zzs(zzbwiVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbwo zzbwoVar = (zzbwo) zzayb.zzb(parcel, zzbwo.CREATOR);
                zzayb.zzh(parcel);
                zzh(zzbwoVar);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC3292R0 interfaceC3292R0M17214L0 = AbstractBinderC3290Q0.m17214L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzf(interfaceC3292R0M17214L0);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzg);
                return true;
            case 10:
                InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                boolean zZza = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzk(interfaceC3772aM18219L1, zZza);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbvx zzbvxVarZzl = zzl();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbvxVarZzl);
                return true;
            case 12:
                InterfaceC3328c1 interfaceC3328c1Zzm = zzm();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3328c1Zzm);
                return true;
            case 13:
                InterfaceC3301U0 interfaceC3301U0M17216L0 = AbstractBinderC3298T0.m17216L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzo(interfaceC3301U0M17216L0);
                parcel2.writeNoException();
                return true;
            case 14:
                C3349h2 c3349h3 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwfVar2 = iInterfaceQueryLocalInterface4 instanceof zzbwh ? (zzbwh) iInterfaceQueryLocalInterface4 : new zzbwf(strongBinder4);
                }
                zzayb.zzh(parcel);
                zzd(c3349h3, zzbwfVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZza2 = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzp(zZza2);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 17:
                long jZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeLong(jZzq);
                return true;
            case 18:
                long j7 = parcel.readLong();
                zzayb.zzh(parcel);
                zzr(j7);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
