package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbwa;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.j0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3355j0 extends zzaya implements InterfaceC3359k0 {
    public AbstractBinderC3355j0() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        InterfaceC3339f0 c3335e0 = null;
        InterfaceC3347h0 c3343g0 = null;
        switch (i7) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C3296S1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    c3335e0 = iInterfaceQueryLocalInterface instanceof InterfaceC3339f0 ? (InterfaceC3339f0) iInterfaceQueryLocalInterface : new C3335e0(strongBinder);
                }
                zzayb.zzh(parcel);
                zze(arrayListCreateTypedArrayList, c3335e0);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                zzayb.zzh(parcel);
                boolean zZzf = zzf(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzf ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                zzayb.zzh(parcel);
                zzbwa zzbwaVarZzg = zzg(string2);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbwaVarZzg);
                return true;
            case 4:
                String string3 = parcel.readString();
                zzayb.zzh(parcel);
                boolean zZzh = zzh(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzh ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                zzayb.zzh(parcel);
                zzbab zzbabVarZzi = zzi(string4);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbabVarZzi);
                return true;
            case 6:
                String string5 = parcel.readString();
                zzayb.zzh(parcel);
                boolean zZzj = zzj(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzj ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                zzayb.zzh(parcel);
                InterfaceC3312Y interfaceC3312YZzk = zzk(string6);
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3312YZzk);
                return true;
            case 8:
                zzbow.zzf(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                C3296S1 c3296s1 = (C3296S1) zzayb.zzb(parcel, C3296S1.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    c3343g0 = iInterfaceQueryLocalInterface2 instanceof InterfaceC3347h0 ? (InterfaceC3347h0) iInterfaceQueryLocalInterface2 : new C3343g0(strongBinder2);
                }
                zzayb.zzh(parcel);
                boolean zZzm = zzm(string7, c3296s1, c3343g0);
                parcel2.writeNoException();
                parcel2.writeInt(zZzm ? 1 : 0);
                return true;
            case 10:
                int i9 = parcel.readInt();
                String string8 = parcel.readString();
                zzayb.zzh(parcel);
                boolean zZzn = zzn(i9, string8);
                parcel2.writeNoException();
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                zzayb.zzh(parcel);
                InterfaceC3312Y interfaceC3312YZzo = zzo(string9);
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3312YZzo);
                return true;
            case 12:
                String string10 = parcel.readString();
                zzayb.zzh(parcel);
                zzbab zzbabVarZzp = zzp(string10);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbabVarZzp);
                return true;
            case 13:
                String string11 = parcel.readString();
                zzayb.zzh(parcel);
                zzbwa zzbwaVarZzq = zzq(string11);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbwaVarZzq);
                return true;
            case 14:
                int i10 = parcel.readInt();
                String string12 = parcel.readString();
                zzayb.zzh(parcel);
                C3296S1 c3296s1Zzr = zzr(i10, string12);
                parcel2.writeNoException();
                zzayb.zzd(parcel2, c3296s1Zzr);
                return true;
            case 15:
                int i11 = parcel.readInt();
                zzayb.zzh(parcel);
                Bundle bundleZzs = zzs(i11);
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzs);
                return true;
            case 16:
                int i12 = parcel.readInt();
                String string13 = parcel.readString();
                zzayb.zzh(parcel);
                int iZzt = zzt(i12, string13);
                parcel2.writeNoException();
                parcel2.writeInt(iZzt);
                return true;
            case 17:
                int i13 = parcel.readInt();
                String string14 = parcel.readString();
                zzayb.zzh(parcel);
                boolean zZzu = zzu(i13, string14);
                parcel2.writeNoException();
                parcel2.writeInt(zZzu ? 1 : 0);
                return true;
            case 18:
                int i14 = parcel.readInt();
                zzayb.zzh(parcel);
                zzv(i14);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
