package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractBinderC3298T0;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbaa extends zzaya implements zzbab {
    public zzbaa() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbab zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return iInterfaceQueryLocalInterface instanceof zzbab ? (zzbab) iInterfaceQueryLocalInterface : new zzazz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbai zzbagVar;
        switch (i7) {
            case 2:
                InterfaceC3312Y interfaceC3312YZze = zze();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3312YZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z7 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback") instanceof zzbaf;
                }
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbagVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbagVar = iInterfaceQueryLocalInterface instanceof zzbai ? (zzbai) iInterfaceQueryLocalInterface : new zzbag(strongBinder2);
                }
                zzayb.zzh(parcel);
                zzf(interfaceC3772aM18219L0, zzbagVar);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC3328c1 interfaceC3328c1Zzg = zzg();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3328c1Zzg);
                return true;
            case 6:
                boolean zZza = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzh(zZza);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC3301U0 interfaceC3301U0M17216L0 = AbstractBinderC3298T0.m17216L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzi(interfaceC3301U0M17216L0);
                parcel2.writeNoException();
                return true;
            case 8:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 9:
                long jZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeLong(jZzk);
                return true;
            case 10:
                long j7 = parcel.readLong();
                zzayb.zzh(parcel);
                zzl(j7);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
