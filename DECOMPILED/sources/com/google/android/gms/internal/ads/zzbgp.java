package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbgp extends zzaya implements zzbgq {
    public zzbgp() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbgq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof zzbgq ? (zzbgq) iInterfaceQueryLocalInterface : new zzbgo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                String string = parcel.readString();
                zzayb.zzh(parcel);
                String strZze = zze(string);
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 2:
                String string2 = parcel.readString();
                zzayb.zzh(parcel);
                zzbfw zzbfwVarZzf = zzf(string2);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbfwVarZzf);
                return true;
            case 3:
                List<String> listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzg);
                return true;
            case 4:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzayb.zzh(parcel);
                zzi(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC3340f1 interfaceC3340f1Zzk = zzk();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3340f1Zzk);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC3772a interfaceC3772aZzm = zzm();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3772aZzm);
                return true;
            case 10:
                InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                boolean zZzn = zzn(interfaceC3772aM18219L0);
                parcel2.writeNoException();
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 12:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i9 = zzayb.zza;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 13:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                int i10 = zzayb.zza;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 14:
                InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzq(interfaceC3772aM18219L1);
                parcel2.writeNoException();
                return true;
            case 15:
                zzr();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbft zzbftVarZzs = zzs();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbftVarZzs);
                return true;
            case 17:
                InterfaceC3772a interfaceC3772aM18219L2 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                boolean zZzt = zzt(interfaceC3772aM18219L2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
