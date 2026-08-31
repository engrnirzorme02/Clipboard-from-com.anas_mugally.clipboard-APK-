package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.a1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3320a1 extends zzaya implements InterfaceC3328c1 {
    public AbstractBinderC3320a1() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static InterfaceC3328c1 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3328c1 ? (InterfaceC3328c1) iInterfaceQueryLocalInterface : new C3316Z0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 2:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 3:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 4:
                C3385q2 c3385q2Zzh = zzh();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, c3385q2Zzh);
                return true;
            case 5:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzi);
                return true;
            case 6:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            default:
                return false;
        }
    }
}
