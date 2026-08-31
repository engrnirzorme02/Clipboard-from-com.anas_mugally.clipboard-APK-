package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractBinderC3327c0;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.internal.client.InterfaceC3331d0;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbvj extends zzaya implements zzbvk {
    public zzbvj() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzbvo zzbvoVar = (zzbvo) zzayb.zzb(parcel, zzbvo.CREATOR);
            zzayb.zzh(parcel);
            zzb(zzbvoVar);
            parcel2.writeNoException();
        } else if (i7 != 2) {
            zzbvn zzbvlVar = null;
            zzbvi zzbviVar = null;
            if (i7 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzbvlVar = iInterfaceQueryLocalInterface instanceof zzbvn ? (zzbvn) iInterfaceQueryLocalInterface : new zzbvl(strongBinder);
                }
                zzayb.zzh(parcel);
                zzd(zzbvlVar);
                parcel2.writeNoException();
            } else if (i7 != 34) {
                switch (i7) {
                    case 5:
                        boolean zZze = zze();
                        parcel2.writeNoException();
                        int i9 = zzayb.zza;
                        parcel2.writeInt(zZze ? 1 : 0);
                        break;
                    case 6:
                        zzf();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                        zzayb.zzh(parcel);
                        zzi(interfaceC3772aM18219L0);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                        zzayb.zzh(parcel);
                        zzj(interfaceC3772aM18219L1);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        InterfaceC3772a interfaceC3772aM18219L2 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                        zzayb.zzh(parcel);
                        zzk(interfaceC3772aM18219L2);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzl = zzl();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzl);
                        break;
                    case 13:
                        String string = parcel.readString();
                        zzayb.zzh(parcel);
                        zzm(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        InterfaceC3331d0 interfaceC3331d0M17222L0 = AbstractBinderC3327c0.m17222L0(parcel.readStrongBinder());
                        zzayb.zzh(parcel);
                        zzn(interfaceC3331d0M17222L0);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzo = zzo();
                        parcel2.writeNoException();
                        zzayb.zzd(parcel2, bundleZzo);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzbviVar = iInterfaceQueryLocalInterface2 instanceof zzbvi ? (zzbvi) iInterfaceQueryLocalInterface2 : new zzbvi(strongBinder2);
                        }
                        zzayb.zzh(parcel);
                        zzu(zzbviVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zzayb.zzh(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        InterfaceC3772a interfaceC3772aM18219L3 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                        zzayb.zzh(parcel);
                        zzp(interfaceC3772aM18219L3);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        zzayb.zzh(parcel);
                        zzq(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        int i10 = zzayb.zza;
                        parcel2.writeInt(zZzs ? 1 : 0);
                        break;
                    case zzbbn.zzt.zzm /* 21 */:
                        InterfaceC3328c1 interfaceC3328c1Zzt = zzt();
                        parcel2.writeNoException();
                        zzayb.zze(parcel2, interfaceC3328c1Zzt);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zZza = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzr(zZza);
                parcel2.writeNoException();
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}
