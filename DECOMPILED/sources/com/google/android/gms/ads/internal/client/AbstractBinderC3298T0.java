package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.T0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3298T0 extends zzaya implements InterfaceC3301U0 {
    public AbstractBinderC3298T0() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* JADX INFO: renamed from: L0 */
    public static InterfaceC3301U0 m17216L0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3301U0 ? (InterfaceC3301U0) iInterfaceQueryLocalInterface : new C3295S0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            C3377o2 c3377o2 = (C3377o2) zzayb.zzb(parcel, C3377o2.CREATOR);
            zzayb.zzh(parcel);
            mo17215j0(c3377o2);
            parcel2.writeNoException();
        } else {
            if (i7 != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            int i9 = zzayb.zza;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }
}
