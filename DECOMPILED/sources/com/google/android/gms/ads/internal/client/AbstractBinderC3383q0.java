package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbye;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3383q0 extends zzaya implements InterfaceC3387r0 {
    public AbstractBinderC3383q0() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3369m2 c3369m2 = (C3369m2) zzayb.zzb(parcel, C3369m2.CREATOR);
                String string = parcel.readString();
                zzbox zzboxVarZzf = zzbow.zzf(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzayb.zzh(parcel);
                InterfaceC3312Y interfaceC3312YMo17169H = mo17169H(interfaceC3772aM18219L0, c3369m2, string, zzboxVarZzf, i9);
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3312YMo17169H);
                return true;
            case 2:
                InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3369m2 c3369m3 = (C3369m2) zzayb.zzb(parcel, C3369m2.CREATOR);
                String string2 = parcel.readString();
                zzbox zzboxVarZzf2 = zzbow.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzayb.zzh(parcel);
                InterfaceC3312Y interfaceC3312YMo17182z = mo17182z(interfaceC3772aM18219L1, c3369m3, string2, zzboxVarZzf2, i10);
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3312YMo17182z);
                return true;
            case 3:
                InterfaceC3772a interfaceC3772aM18219L2 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbox zzboxVarZzf3 = zzbow.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzayb.zzh(parcel);
                InterfaceC3300U interfaceC3300UMo17175j = mo17175j(interfaceC3772aM18219L2, string3, zzboxVarZzf3, i11);
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3300UMo17175j);
                return true;
            case 4:
                InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 5:
                InterfaceC3772a interfaceC3772aM18219L3 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                InterfaceC3772a interfaceC3772aM18219L4 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzbga zzbgaVarMo17172c = mo17172c(interfaceC3772aM18219L3, interfaceC3772aM18219L4);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbgaVarMo17172c);
                return true;
            case 6:
                InterfaceC3772a interfaceC3772aM18219L5 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzbox zzboxVarZzf4 = zzbow.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbvk zzbvkVarMo17180t = mo17180t(interfaceC3772aM18219L5, zzboxVarZzf4, i12);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbvkVarMo17180t);
                return true;
            case 7:
                InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 8:
                InterfaceC3772a interfaceC3772aM18219L6 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzbsw zzbswVarZzg = zzg(interfaceC3772aM18219L6);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbswVarZzg);
                return true;
            case 9:
                InterfaceC3772a interfaceC3772aM18219L7 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzayb.zzh(parcel);
                InterfaceC3248C0 interfaceC3248C0Mo17181v0 = mo17181v0(interfaceC3772aM18219L7, i13);
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3248C0Mo17181v0);
                return true;
            case 10:
                InterfaceC3772a interfaceC3772aM18219L8 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3369m2 c3369m4 = (C3369m2) zzayb.zzb(parcel, C3369m2.CREATOR);
                String string4 = parcel.readString();
                int i14 = parcel.readInt();
                zzayb.zzh(parcel);
                InterfaceC3312Y interfaceC3312YMo17178p0 = mo17178p0(interfaceC3772aM18219L8, c3369m4, string4, i14);
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3312YMo17178p0);
                return true;
            case 11:
                InterfaceC3772a interfaceC3772aM18219L9 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                InterfaceC3772a interfaceC3772aM18219L10 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                InterfaceC3772a interfaceC3772aM18219L11 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzbgg zzbggVarMo17173c0 = mo17173c0(interfaceC3772aM18219L9, interfaceC3772aM18219L10, interfaceC3772aM18219L11);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbggVarMo17173c0);
                return true;
            case 12:
                InterfaceC3772a interfaceC3772aM18219L12 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbox zzboxVarZzf5 = zzbow.zzf(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbwa zzbwaVarMo17174f = mo17174f(interfaceC3772aM18219L12, string5, zzboxVarZzf5, i15);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbwaVarMo17174f);
                return true;
            case 13:
                InterfaceC3772a interfaceC3772aM18219L13 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                C3369m2 c3369m5 = (C3369m2) zzayb.zzb(parcel, C3369m2.CREATOR);
                String string6 = parcel.readString();
                zzbox zzboxVarZzf6 = zzbow.zzf(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                zzayb.zzh(parcel);
                InterfaceC3312Y interfaceC3312YMo17177n = mo17177n(interfaceC3772aM18219L13, c3369m5, string6, zzboxVarZzf6, i16);
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3312YMo17177n);
                return true;
            case 14:
                InterfaceC3772a interfaceC3772aM18219L14 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzbox zzboxVarZzf7 = zzbow.zzf(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbye zzbyeVarMo17176m = mo17176m(interfaceC3772aM18219L14, zzboxVarZzf7, i17);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbyeVarMo17176m);
                return true;
            case 15:
                InterfaceC3772a interfaceC3772aM18219L15 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzbox zzboxVarZzf8 = zzbow.zzf(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbsp zzbspVarMo17171b = mo17171b(interfaceC3772aM18219L15, zzboxVarZzf8, i18);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbspVarMo17171b);
                return true;
            case 16:
                InterfaceC3772a interfaceC3772aM18219L16 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzbox zzboxVarZzf9 = zzbow.zzf(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                zzbkl zzbklVarZzc = zzbkk.zzc(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzbko zzbkoVarMo17179q0 = mo17179q0(interfaceC3772aM18219L16, zzboxVarZzf9, i19, zzbklVarZzc);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbkoVarMo17179q0);
                return true;
            case 17:
                InterfaceC3772a interfaceC3772aM18219L17 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzbox zzboxVarZzf10 = zzbow.zzf(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                zzayb.zzh(parcel);
                InterfaceC3310X0 interfaceC3310X0Mo17170K0 = mo17170K0(interfaceC3772aM18219L17, zzboxVarZzf10, i20);
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3310X0Mo17170K0);
                return true;
            case 18:
                InterfaceC3772a interfaceC3772aM18219L18 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzbox zzboxVarZzf11 = zzbow.zzf(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                zzayb.zzh(parcel);
                InterfaceC3359k0 interfaceC3359k0Mo17168E0 = mo17168E0(interfaceC3772aM18219L18, zzboxVarZzf11, i21);
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3359k0Mo17168E0);
                return true;
            default:
                return false;
        }
    }
}
