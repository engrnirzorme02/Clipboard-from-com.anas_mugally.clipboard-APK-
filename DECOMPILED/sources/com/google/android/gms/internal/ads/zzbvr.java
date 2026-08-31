package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbvr extends zzaya implements zzbvs {
    public zzbvr() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbvs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof zzbvs ? (zzbvs) iInterfaceQueryLocalInterface : new zzbvq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zze(interfaceC3772aM18219L0);
                break;
            case 2:
                InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzayb.zzh(parcel);
                zzf(interfaceC3772aM18219L1, i9);
                break;
            case 3:
                InterfaceC3772a interfaceC3772aM18219L2 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzg(interfaceC3772aM18219L2);
                break;
            case 4:
                InterfaceC3772a interfaceC3772aM18219L3 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzh(interfaceC3772aM18219L3);
                break;
            case 5:
                InterfaceC3772a interfaceC3772aM18219L4 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzi(interfaceC3772aM18219L4);
                break;
            case 6:
                InterfaceC3772a interfaceC3772aM18219L5 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzj(interfaceC3772aM18219L5);
                break;
            case 7:
                InterfaceC3772a interfaceC3772aM18219L6 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzbvt zzbvtVar = (zzbvt) zzayb.zzb(parcel, zzbvt.CREATOR);
                zzayb.zzh(parcel);
                zzk(interfaceC3772aM18219L6, zzbvtVar);
                break;
            case 8:
                InterfaceC3772a interfaceC3772aM18219L7 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzl(interfaceC3772aM18219L7);
                break;
            case 9:
                InterfaceC3772a interfaceC3772aM18219L8 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzayb.zzh(parcel);
                zzm(interfaceC3772aM18219L8, i10);
                break;
            case 10:
                InterfaceC3772a interfaceC3772aM18219L9 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzn(interfaceC3772aM18219L9);
                break;
            case 11:
                InterfaceC3772a interfaceC3772aM18219L10 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzo(interfaceC3772aM18219L10);
                break;
            case 12:
                zzayb.zzh(parcel);
                break;
            case 13:
                InterfaceC3772a interfaceC3772aM18219L11 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzp(interfaceC3772aM18219L11);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
