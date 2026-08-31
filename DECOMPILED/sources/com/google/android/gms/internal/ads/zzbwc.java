package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbwc extends zzaya implements zzbwd {
    public zzbwc() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbvx zzbvvVar;
        switch (i7) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbvvVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzbvvVar = iInterfaceQueryLocalInterface instanceof zzbvx ? (zzbvx) iInterfaceQueryLocalInterface : new zzbvv(strongBinder);
                }
                zzayb.zzh(parcel);
                zzg(zzbvvVar);
                break;
            case 4:
                int i9 = parcel.readInt();
                zzayb.zzh(parcel);
                zzh(i9);
                break;
            case 5:
                C3324b1 c3324b1 = (C3324b1) zzayb.zzb(parcel, C3324b1.CREATOR);
                zzayb.zzh(parcel);
                zzi(c3324b1);
                break;
            case 6:
                zzj();
                break;
            case 7:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
