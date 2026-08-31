package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmf;
import p340r2.C6883a;
import p340r2.C6889g;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3297T extends zzaya implements InterfaceC3300U {
    public AbstractBinderC3297T() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        InterfaceC3271K c3265i = null;
        C3391s0 c3391s0 = null;
        switch (i7) {
            case 1:
                InterfaceC3289Q interfaceC3289QZze = zze();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3289QZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    c3265i = iInterfaceQueryLocalInterface instanceof InterfaceC3271K ? (InterfaceC3271K) iInterfaceQueryLocalInterface : new C3265I(strongBinder);
                }
                zzayb.zzh(parcel);
                zzf(c3265i);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbgu zzbguVarZzb = zzbgt.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzg(zzbguVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbgx zzbgxVarZzb = zzbgw.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzh(zzbgxVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbhd zzbhdVarZzb = zzbhc.zzb(parcel.readStrongBinder());
                zzbha zzbhaVarZzb = zzbgz.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzi(string, zzbhdVarZzb, zzbhaVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbfl zzbflVar = (zzbfl) zzayb.zzb(parcel, zzbfl.CREATOR);
                zzayb.zzh(parcel);
                zzj(zzbflVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c3391s0 = iInterfaceQueryLocalInterface2 instanceof C3391s0 ? (C3391s0) iInterfaceQueryLocalInterface2 : new C3391s0(strongBinder2);
                }
                zzayb.zzh(parcel);
                zzq(c3391s0);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbhh zzbhhVarZzb = zzbhg.zzb(parcel.readStrongBinder());
                C3369m2 c3369m2 = (C3369m2) zzayb.zzb(parcel, C3369m2.CREATOR);
                zzayb.zzh(parcel);
                zzk(zzbhhVarZzb, c3369m2);
                parcel2.writeNoException();
                return true;
            case 9:
                C6889g c6889g = (C6889g) zzayb.zzb(parcel, C6889g.CREATOR);
                zzayb.zzh(parcel);
                zzl(c6889g);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbhk zzbhkVarZzb = zzbhj.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzm(zzbhkVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzblw zzblwVar = (zzblw) zzayb.zzb(parcel, zzblw.CREATOR);
                zzayb.zzh(parcel);
                zzn(zzblwVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbmf zzbmfVarZzb = zzbme.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzo(zzbmfVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                C6883a c6883a = (C6883a) zzayb.zzb(parcel, C6883a.CREATOR);
                zzayb.zzh(parcel);
                zzp(c6883a);
                parcel2.writeNoException();
                return true;
        }
    }
}
