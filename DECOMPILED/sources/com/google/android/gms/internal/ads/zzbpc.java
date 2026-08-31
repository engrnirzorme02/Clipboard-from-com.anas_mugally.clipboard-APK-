package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbpc extends zzaya implements zzbpd {
    public zzbpc() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbpd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbpd ? (zzbpd) iInterfaceQueryLocalInterface : new zzbpb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i9 = parcel.readInt();
                zzayb.zzh(parcel);
                zzg(i9);
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z7 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata") instanceof zzbph;
                }
                zzayb.zzh(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzayb.zzh(parcel);
                zzl(string, string2);
                break;
            case 10:
                zzbgp.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzayb.zzh(parcel);
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                zzayb.zzh(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                zzbvt zzbvtVar = (zzbvt) zzayb.zzb(parcel, zzbvt.CREATOR);
                zzayb.zzh(parcel);
                zzp(zzbvtVar);
                break;
            case 15:
                zzq();
                break;
            case 16:
                zzbvx zzbvxVarZzb = zzbvw.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzr(zzbvxVarZzb);
                break;
            case 17:
                int i10 = parcel.readInt();
                zzayb.zzh(parcel);
                zzs(i10);
                break;
            case 18:
                zzt();
                break;
            case 19:
                zzayb.zzh(parcel);
                break;
            case 20:
                zzu();
                break;
            case zzbbn.zzt.zzm /* 21 */:
                String string3 = parcel.readString();
                zzayb.zzh(parcel);
                zzv(string3);
                break;
            case 22:
                int i11 = parcel.readInt();
                String string4 = parcel.readString();
                zzayb.zzh(parcel);
                zzw(i11, string4);
                break;
            case 23:
                C3324b1 c3324b1 = (C3324b1) zzayb.zzb(parcel, C3324b1.CREATOR);
                zzayb.zzh(parcel);
                zzx(c3324b1);
                break;
            case 24:
                C3324b1 c3324b2 = (C3324b1) zzayb.zzb(parcel, C3324b1.CREATOR);
                zzayb.zzh(parcel);
                zzy(c3324b2);
                break;
            case 25:
                zzz();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
