package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbpl extends zzaya implements zzbpm {
    public zzbpl() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbpm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof zzbpm ? (zzbpm) iInterfaceQueryLocalInterface : new zzbpk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 2:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 3:
                List listZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(listZzf);
                return true;
            case 4:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 5:
                zzbfw zzbfwVarZzh = zzh();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbfwVarZzh);
                return true;
            case 6:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzk);
                return true;
            case 9:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                InterfaceC3340f1 interfaceC3340f1Zzn = zzn();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3340f1Zzn);
                return true;
            case 12:
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 13:
                InterfaceC3772a interfaceC3772aZzp = zzp();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3772aZzp);
                return true;
            case 14:
                InterfaceC3772a interfaceC3772aZzq = zzq();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3772aZzq);
                return true;
            case 15:
                InterfaceC3772a interfaceC3772aZzr = zzr();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3772aZzr);
                return true;
            case 16:
                Bundle bundleZzs = zzs();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzs);
                return true;
            case 17:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                int i9 = zzayb.zza;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 18:
                boolean zZzu = zzu();
                parcel2.writeNoException();
                int i10 = zzayb.zza;
                parcel2.writeInt(zZzu ? 1 : 0);
                return true;
            case 19:
                zzv();
                parcel2.writeNoException();
                return true;
            case 20:
                InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzw(interfaceC3772aM18219L0);
                parcel2.writeNoException();
                return true;
            case zzbbn.zzt.zzm /* 21 */:
                InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                InterfaceC3772a interfaceC3772aM18219L2 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                InterfaceC3772a interfaceC3772aM18219L3 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzx(interfaceC3772aM18219L1, interfaceC3772aM18219L2, interfaceC3772aM18219L3);
                parcel2.writeNoException();
                return true;
            case 22:
                InterfaceC3772a interfaceC3772aM18219L4 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzy(interfaceC3772aM18219L4);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzz = zzz();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzz);
                return true;
            case 24:
                float fZzA = zzA();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzA);
                return true;
            case 25:
                float fZzB = zzB();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzB);
                return true;
            case 26:
                zzC();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
