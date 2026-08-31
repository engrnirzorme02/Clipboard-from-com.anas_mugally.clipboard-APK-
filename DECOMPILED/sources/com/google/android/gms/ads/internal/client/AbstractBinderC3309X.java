package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbvm;
import com.google.android.gms.internal.ads.zzbvn;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.X */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3309X extends zzaya implements InterfaceC3312Y {
    public AbstractBinderC3309X() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static InterfaceC3312Y zzZ(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3312Y ? (InterfaceC3312Y) iInterfaceQueryLocalInterface : new C3306W(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        InterfaceC3271K c3265i = null;
        InterfaceC3403v0 c3395t0 = null;
        InterfaceC3280N c3274l = null;
        InterfaceC3301U0 c3295s0 = null;
        InterfaceC3331d0 c3319a0 = null;
        C3391s0 c3391s0 = null;
        InterfaceC3262H c3256f = null;
        InterfaceC3375o0 c3367m0 = null;
        switch (i7) {
            case 1:
                InterfaceC3772a interfaceC3772aZzb = zzb();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3772aZzb);
                return true;
            case 2:
                zzc();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzd = zzd();
                parcel2.writeNoException();
                int i9 = zzayb.zza;
                parcel2.writeInt(zZzd ? 1 : 0);
                return true;
            case 4:
                C3349h2 c3349h2 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                zzayb.zzh(parcel);
                boolean zZze = zze(c3349h2);
                parcel2.writeNoException();
                parcel2.writeInt(zZze ? 1 : 0);
                return true;
            case 5:
                zzf();
                parcel2.writeNoException();
                return true;
            case 6:
                zzg();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    c3265i = iInterfaceQueryLocalInterface instanceof InterfaceC3271K ? (InterfaceC3271K) iInterfaceQueryLocalInterface : new C3265I(strongBinder);
                }
                zzayb.zzh(parcel);
                zzdW(c3265i);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    c3367m0 = iInterfaceQueryLocalInterface2 instanceof InterfaceC3375o0 ? (InterfaceC3375o0) iInterfaceQueryLocalInterface2 : new C3367m0(strongBinder2);
                }
                zzayb.zzh(parcel);
                zzi(c3367m0);
                parcel2.writeNoException();
                return true;
            case 9:
                zzl();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzm();
                parcel2.writeNoException();
                return true;
            case 12:
                C3369m2 c3369m2Zzn = zzn();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, c3369m2Zzn);
                return true;
            case 13:
                C3369m2 c3369m2 = (C3369m2) zzayb.zzb(parcel, C3369m2.CREATOR);
                zzayb.zzh(parcel);
                zzo(c3369m2);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbtf zzbtfVarZzb = zzbte.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzp(zzbtfVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbti zzbtiVarZzb = zzbth.zzb(parcel.readStrongBinder());
                String string = parcel.readString();
                zzayb.zzh(parcel);
                zzq(zzbtiVarZzb, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 19:
                zzbdd zzbddVarZzb = zzbdc.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzx(zzbddVarZzb);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    c3256f = iInterfaceQueryLocalInterface3 instanceof InterfaceC3262H ? (InterfaceC3262H) iInterfaceQueryLocalInterface3 : new C3256F(strongBinder3);
                }
                zzayb.zzh(parcel);
                zzy(c3256f);
                parcel2.writeNoException();
                return true;
            case zzbbn.zzt.zzm /* 21 */:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c3391s0 = iInterfaceQueryLocalInterface4 instanceof C3391s0 ? (C3391s0) iInterfaceQueryLocalInterface4 : new C3391s0(strongBinder4);
                }
                zzayb.zzh(parcel);
                zzY(c3391s0);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZza = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzz(zZza);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                int i10 = zzayb.zza;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case 24:
                zzbvn zzbvnVarZzb = zzbvm.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzC(zzbvnVarZzb);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                zzayb.zzh(parcel);
                zzD(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                InterfaceC3340f1 interfaceC3340f1ZzF = zzF();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3340f1ZzF);
                return true;
            case 29:
                C3321a2 c3321a2 = (C3321a2) zzayb.zzb(parcel, C3321a2.CREATOR);
                zzayb.zzh(parcel);
                zzG(c3321a2);
                parcel2.writeNoException();
                return true;
            case 30:
                C3356j1 c3356j1 = (C3356j1) zzayb.zzb(parcel, C3356j1.CREATOR);
                zzayb.zzh(parcel);
                zzH(c3356j1);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 32:
                InterfaceC3375o0 interfaceC3375o0Zzv = zzv();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3375o0Zzv);
                return true;
            case 33:
                InterfaceC3271K interfaceC3271KZzw = zzw();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3271KZzw);
                return true;
            case 34:
                boolean zZza2 = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzK(zZza2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    c3319a0 = iInterfaceQueryLocalInterface5 instanceof InterfaceC3331d0 ? (InterfaceC3331d0) iInterfaceQueryLocalInterface5 : new C3319a0(strongBinder5);
                }
                zzayb.zzh(parcel);
                zzj(c3319a0);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzk);
                return true;
            case 38:
                String string3 = parcel.readString();
                zzayb.zzh(parcel);
                zzE(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                C3393s2 c3393s2 = (C3393s2) zzayb.zzb(parcel, C3393s2.CREATOR);
                zzayb.zzh(parcel);
                zzI(c3393s2);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbae zzbaeVarZze = zzbad.zze(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzJ(zzbaeVarZze);
                parcel2.writeNoException();
                return true;
            case 41:
                InterfaceC3328c1 interfaceC3328c1Zzt = zzt();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3328c1Zzt);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    c3295s0 = iInterfaceQueryLocalInterface6 instanceof InterfaceC3301U0 ? (InterfaceC3301U0) iInterfaceQueryLocalInterface6 : new C3295S0(strongBinder6);
                }
                zzayb.zzh(parcel);
                zzP(c3295s0);
                parcel2.writeNoException();
                return true;
            case 43:
                C3349h2 c3349h3 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    c3274l = iInterfaceQueryLocalInterface7 instanceof InterfaceC3280N ? (InterfaceC3280N) iInterfaceQueryLocalInterface7 : new C3274L(strongBinder7);
                }
                zzayb.zzh(parcel);
                zzQ(c3349h3, c3274l);
                parcel2.writeNoException();
                return true;
            case 44:
                InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzR(interfaceC3772aM18219L0);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    c3395t0 = iInterfaceQueryLocalInterface8 instanceof InterfaceC3403v0 ? (InterfaceC3403v0) iInterfaceQueryLocalInterface8 : new C3395t0(strongBinder8);
                }
                zzayb.zzh(parcel);
                zzS(c3395t0);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i11 = zzayb.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 47:
                long jZzU = zzU();
                parcel2.writeNoException();
                parcel2.writeLong(jZzU);
                return true;
            case 48:
                long j7 = parcel.readLong();
                zzayb.zzh(parcel);
                zzT(j7);
                parcel2.writeNoException();
                return true;
        }
    }
}
