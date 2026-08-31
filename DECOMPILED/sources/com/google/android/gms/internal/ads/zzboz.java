package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzboz extends zzaya implements zzbpa {
    public zzboz() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbpd zzbpbVar;
        zzbpd zzbpbVar2;
        zzbpd zzbpbVar3;
        zzbpd zzbpbVar4;
        zzbpd zzbpbVar5;
        zzbpd zzbpbVar6;
        zzbpd zzbpbVar7;
        zzbpd zzbpbVar8;
        zzbpd zzbpbVar9 = null;
        switch (i7) {
            case 1:
                InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3369m2 c3369m2 = (C3369m2) zzayb.zzb(parcel, C3369m2.CREATOR);
                C3349h2 c3349h2 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbpbVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpbVar = iInterfaceQueryLocalInterface instanceof zzbpd ? (zzbpd) iInterfaceQueryLocalInterface : new zzbpb(strongBinder);
                }
                zzayb.zzh(parcel);
                zze(interfaceC3772aM18219L0, c3369m2, c3349h2, string, zzbpbVar);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC3772a interfaceC3772aZzf = zzf();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3772aZzf);
                return true;
            case 3:
                InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3349h2 c3349h3 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbpbVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpbVar2 = iInterfaceQueryLocalInterface2 instanceof zzbpd ? (zzbpd) iInterfaceQueryLocalInterface2 : new zzbpb(strongBinder2);
                }
                zzayb.zzh(parcel);
                zzg(interfaceC3772aM18219L1, c3349h3, string2, zzbpbVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC3772a interfaceC3772aM18219L2 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3369m2 c3369m3 = (C3369m2) zzayb.zzb(parcel, C3369m2.CREATOR);
                C3349h2 c3349h4 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    zzbpbVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpbVar3 = iInterfaceQueryLocalInterface3 instanceof zzbpd ? (zzbpd) iInterfaceQueryLocalInterface3 : new zzbpb(strongBinder3);
                }
                zzayb.zzh(parcel);
                zzj(interfaceC3772aM18219L2, c3369m3, c3349h4, string3, string4, zzbpbVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC3772a interfaceC3772aM18219L3 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3349h2 c3349h5 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    zzbpbVar4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpbVar4 = iInterfaceQueryLocalInterface4 instanceof zzbpd ? (zzbpd) iInterfaceQueryLocalInterface4 : new zzbpb(strongBinder4);
                }
                zzayb.zzh(parcel);
                zzk(interfaceC3772aM18219L3, c3349h5, string5, string6, zzbpbVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC3772a interfaceC3772aM18219L4 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3349h2 c3349h6 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                String string7 = parcel.readString();
                zzbvs zzbvsVarZzb = zzbvr.zzb(parcel.readStrongBinder());
                String string8 = parcel.readString();
                zzayb.zzh(parcel);
                zzn(interfaceC3772aM18219L4, c3349h6, string7, zzbvsVarZzb, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                C3349h2 c3349h7 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                String string9 = parcel.readString();
                zzayb.zzh(parcel);
                zzo(c3349h7, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i9 = zzayb.zza;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 14:
                InterfaceC3772a interfaceC3772aM18219L5 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3349h2 c3349h8 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    zzbpbVar5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpbVar5 = iInterfaceQueryLocalInterface5 instanceof zzbpd ? (zzbpd) iInterfaceQueryLocalInterface5 : new zzbpb(strongBinder5);
                }
                zzbfl zzbflVar = (zzbfl) zzayb.zzb(parcel, zzbfl.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                zzayb.zzh(parcel);
                zzr(interfaceC3772aM18219L5, c3349h8, string10, string11, zzbpbVar5, zzbflVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 17:
                Bundle bundleZzs = zzs();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzs);
                return true;
            case 18:
                Bundle bundleZzt = zzt();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzt);
                return true;
            case 19:
                Bundle bundleZzu = zzu();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzu);
                return true;
            case 20:
                C3349h2 c3349h9 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzayb.zzh(parcel);
                zzv(c3349h9, string12, string13);
                parcel2.writeNoException();
                return true;
            case zzbbn.zzt.zzm /* 21 */:
                InterfaceC3772a interfaceC3772aM18219L6 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzw(interfaceC3772aM18219L6);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i10 = zzayb.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                InterfaceC3772a interfaceC3772aM18219L7 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzbvs zzbvsVarZzb2 = zzbvr.zzb(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                zzayb.zzh(parcel);
                zzy(interfaceC3772aM18219L7, zzbvsVarZzb2, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbgq zzbgqVarZzz = zzz();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbgqVarZzz);
                return true;
            case 25:
                boolean zZza = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzA(zZza);
                parcel2.writeNoException();
                return true;
            case 26:
                InterfaceC3340f1 interfaceC3340f1ZzB = zzB();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3340f1ZzB);
                return true;
            case 27:
                zzbpm zzbpmVarZzC = zzC();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbpmVarZzC);
                return true;
            case 28:
                InterfaceC3772a interfaceC3772aM18219L8 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3349h2 c3349h10 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    zzbpbVar6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpbVar6 = iInterfaceQueryLocalInterface6 instanceof zzbpd ? (zzbpd) iInterfaceQueryLocalInterface6 : new zzbpb(strongBinder6);
                }
                zzayb.zzh(parcel);
                zzD(interfaceC3772aM18219L8, c3349h10, string14, zzbpbVar6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                InterfaceC3772a interfaceC3772aM18219L9 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzE(interfaceC3772aM18219L9);
                parcel2.writeNoException();
                return true;
            case 31:
                InterfaceC3772a interfaceC3772aM18219L10 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzblo zzbloVarZzb = zzbln.zzb(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzblu.CREATOR);
                zzayb.zzh(parcel);
                zzF(interfaceC3772aM18219L10, zzbloVarZzb, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                InterfaceC3772a interfaceC3772aM18219L11 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3349h2 c3349h11 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    zzbpbVar7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpbVar7 = iInterfaceQueryLocalInterface7 instanceof zzbpd ? (zzbpd) iInterfaceQueryLocalInterface7 : new zzbpb(strongBinder7);
                }
                zzayb.zzh(parcel);
                zzG(interfaceC3772aM18219L11, c3349h11, string15, zzbpbVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbrl zzbrlVarZzH = zzH();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, zzbrlVarZzH);
                return true;
            case 34:
                zzbrl zzbrlVarZzI = zzI();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, zzbrlVarZzI);
                return true;
            case 35:
                InterfaceC3772a interfaceC3772aM18219L12 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3369m2 c3369m4 = (C3369m2) zzayb.zzb(parcel, C3369m2.CREATOR);
                C3349h2 c3349h12 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    zzbpbVar8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpbVar8 = iInterfaceQueryLocalInterface8 instanceof zzbpd ? (zzbpd) iInterfaceQueryLocalInterface8 : new zzbpb(strongBinder8);
                }
                zzayb.zzh(parcel);
                zzJ(interfaceC3772aM18219L12, c3369m4, c3349h12, string16, string17, zzbpbVar8);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbpg zzbpgVarZzK = zzK();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbpgVarZzK);
                return true;
            case 37:
                InterfaceC3772a interfaceC3772aM18219L13 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzL(interfaceC3772aM18219L13);
                parcel2.writeNoException();
                return true;
            case 38:
                InterfaceC3772a interfaceC3772aM18219L14 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3349h2 c3349h13 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpbVar9 = iInterfaceQueryLocalInterface9 instanceof zzbpd ? (zzbpd) iInterfaceQueryLocalInterface9 : new zzbpb(strongBinder9);
                }
                zzayb.zzh(parcel);
                zzM(interfaceC3772aM18219L14, c3349h13, string18, zzbpbVar9);
                parcel2.writeNoException();
                return true;
            case 39:
                InterfaceC3772a interfaceC3772aM18219L15 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzN(interfaceC3772aM18219L15);
                parcel2.writeNoException();
                return true;
        }
    }
}
