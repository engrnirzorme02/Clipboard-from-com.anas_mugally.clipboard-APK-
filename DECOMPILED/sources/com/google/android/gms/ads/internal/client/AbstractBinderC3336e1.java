package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3336e1 extends zzaya implements InterfaceC3340f1 {
    public AbstractBinderC3336e1() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static InterfaceC3340f1 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3340f1 ? (InterfaceC3340f1) iInterfaceQueryLocalInterface : new C3332d1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        InterfaceC3352i1 c3344g1;
        switch (i7) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZza = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzg(zZza);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzh = zzh();
                parcel2.writeNoException();
                int i9 = zzayb.zza;
                parcel2.writeInt(zZzh ? 1 : 0);
                return true;
            case 5:
                int iZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeInt(iZzi);
                return true;
            case 6:
                float fZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzj);
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c3344g1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    c3344g1 = iInterfaceQueryLocalInterface instanceof InterfaceC3352i1 ? (InterfaceC3352i1) iInterfaceQueryLocalInterface : new C3344g1(strongBinder);
                }
                zzayb.zzh(parcel);
                zzl(c3344g1);
                parcel2.writeNoException();
                return true;
            case 9:
                float fZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzm);
                return true;
            case 10:
                boolean zZzn = zzn();
                parcel2.writeNoException();
                int i10 = zzayb.zza;
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                InterfaceC3352i1 interfaceC3352i1Zzo = zzo();
                parcel2.writeNoException();
                zzayb.zze(parcel2, interfaceC3352i1Zzo);
                return true;
            case 12:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                int i11 = zzayb.zza;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 13:
                zzq();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
