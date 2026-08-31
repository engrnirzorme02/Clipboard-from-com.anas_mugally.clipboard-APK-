package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbqv extends zzaya implements zzbqw {
    public zzbqv() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbqw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbqw ? (zzbqw) iInterfaceQueryLocalInterface : new zzbqu(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.zzbqv, com.google.android.gms.internal.ads.zzbqw] */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.google.android.gms.internal.ads.zzbqt] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.zzbqq] */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.google.android.gms.internal.ads.zzbqt] */
    /* JADX WARN: Type inference failed for: r5v21, types: [com.google.android.gms.internal.ads.zzbqk] */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.google.android.gms.internal.ads.zzbqq] */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.google.android.gms.internal.ads.zzbqh] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zzbqk] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.google.android.gms.internal.ads.zzbqn] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.gms.internal.ads.zzbqz] */
    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        IInterface zzbqfVar = null;
        if (i7 == 1) {
            InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzayb.zzb(parcel, creator);
            Bundle bundle2 = (Bundle) zzayb.zzb(parcel, creator);
            C3369m2 c3369m2 = (C3369m2) zzayb.zzb(parcel, C3369m2.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbqfVar = iInterfaceQueryLocalInterface instanceof zzbqz ? (zzbqz) iInterfaceQueryLocalInterface : new zzbqx(strongBinder);
            }
            zzayb.zzh(parcel);
            zze(interfaceC3772aM18219L0, string, bundle, bundle2, c3369m2, zzbqfVar);
            parcel2.writeNoException();
        } else if (i7 == 2) {
            zzbrl zzbrlVarZzf = zzf();
            parcel2.writeNoException();
            zzayb.zzd(parcel2, zzbrlVarZzf);
        } else if (i7 == 3) {
            zzbrl zzbrlVarZzg = zzg();
            parcel2.writeNoException();
            zzayb.zzd(parcel2, zzbrlVarZzg);
        } else if (i7 == 5) {
            InterfaceC3340f1 interfaceC3340f1Zzh = zzh();
            parcel2.writeNoException();
            zzayb.zze(parcel2, interfaceC3340f1Zzh);
        } else if (i7 == 10) {
            InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
            zzayb.zzh(parcel);
            parcel2.writeNoException();
        } else if (i7 != 11) {
            switch (i7) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    C3349h2 c3349h2 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                    InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface2 instanceof zzbqk ? (zzbqk) iInterfaceQueryLocalInterface2 : new zzbqi(strongBinder2);
                    }
                    ?? r7 = zzbqfVar;
                    zzbpd zzbpdVarZzb = zzbpc.zzb(parcel.readStrongBinder());
                    C3369m2 c3369m3 = (C3369m2) zzayb.zzb(parcel, C3369m2.CREATOR);
                    zzayb.zzh(parcel);
                    zzi(string2, string3, c3349h2, interfaceC3772aM18219L1, r7, zzbpdVarZzb, c3369m3);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    C3349h2 c3349h3 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                    InterfaceC3772a interfaceC3772aM18219L2 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface3 instanceof zzbqn ? (zzbqn) iInterfaceQueryLocalInterface3 : new zzbql(strongBinder3);
                    }
                    zzbpd zzbpdVarZzb2 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzj(string4, string5, c3349h3, interfaceC3772aM18219L2, zzbqfVar, zzbpdVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    InterfaceC3772a interfaceC3772aM18219L3 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    boolean zZzk = zzk(interfaceC3772aM18219L3);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzk ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    C3349h2 c3349h4 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                    InterfaceC3772a interfaceC3772aM18219L4 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface4 instanceof zzbqt ? (zzbqt) iInterfaceQueryLocalInterface4 : new zzbqr(strongBinder4);
                    }
                    zzbpd zzbpdVarZzb3 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzl(string6, string7, c3349h4, interfaceC3772aM18219L4, zzbqfVar, zzbpdVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    InterfaceC3772a interfaceC3772aM18219L5 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    boolean zZzm = zzm(interfaceC3772aM18219L5);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzm ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    C3349h2 c3349h5 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                    InterfaceC3772a interfaceC3772aM18219L6 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface5 instanceof zzbqq ? (zzbqq) iInterfaceQueryLocalInterface5 : new zzbqo(strongBinder5);
                    }
                    zzbpd zzbpdVarZzb4 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzn(string8, string9, c3349h5, interfaceC3772aM18219L6, zzbqfVar, zzbpdVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    zzayb.zzh(parcel);
                    zzo(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    C3349h2 c3349h6 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                    InterfaceC3772a interfaceC3772aM18219L7 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface6 instanceof zzbqt ? (zzbqt) iInterfaceQueryLocalInterface6 : new zzbqr(strongBinder6);
                    }
                    zzbpd zzbpdVarZzb5 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzp(string11, string12, c3349h6, interfaceC3772aM18219L7, zzbqfVar, zzbpdVarZzb5);
                    parcel2.writeNoException();
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    C3349h2 c3349h7 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                    InterfaceC3772a interfaceC3772aM18219L8 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface7 instanceof zzbqk ? (zzbqk) iInterfaceQueryLocalInterface7 : new zzbqi(strongBinder7);
                    }
                    ?? r8 = zzbqfVar;
                    zzbpd zzbpdVarZzb6 = zzbpc.zzb(parcel.readStrongBinder());
                    C3369m2 c3369m4 = (C3369m2) zzayb.zzb(parcel, C3369m2.CREATOR);
                    zzayb.zzh(parcel);
                    zzq(string13, string14, c3349h7, interfaceC3772aM18219L8, r8, zzbpdVarZzb6, c3369m4);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    C3349h2 c3349h8 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                    InterfaceC3772a interfaceC3772aM18219L9 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface8 instanceof zzbqq ? (zzbqq) iInterfaceQueryLocalInterface8 : new zzbqo(strongBinder8);
                    }
                    zzbpd zzbpdVarZzb7 = zzbpc.zzb(parcel.readStrongBinder());
                    zzbfl zzbflVar = (zzbfl) zzayb.zzb(parcel, zzbfl.CREATOR);
                    zzayb.zzh(parcel);
                    zzr(string15, string16, c3349h8, interfaceC3772aM18219L9, zzbqfVar, zzbpdVarZzb7, zzbflVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    C3349h2 c3349h9 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
                    InterfaceC3772a interfaceC3772aM18219L10 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface9 instanceof zzbqh ? (zzbqh) iInterfaceQueryLocalInterface9 : new zzbqf(strongBinder9);
                    }
                    zzbpd zzbpdVarZzb8 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzs(string17, string18, c3349h9, interfaceC3772aM18219L10, zzbqfVar, zzbpdVarZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    InterfaceC3772a interfaceC3772aM18219L11 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    boolean zZzt = zzt(interfaceC3772aM18219L11);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzt ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzayb.zzh(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
