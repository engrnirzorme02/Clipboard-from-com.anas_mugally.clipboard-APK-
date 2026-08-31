package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.Q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3290Q0 extends zzaya implements InterfaceC3292R0 {
    public AbstractBinderC3290Q0() {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    /* JADX INFO: renamed from: L0 */
    public static InterfaceC3292R0 m17214L0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3292R0 ? (InterfaceC3292R0) iInterfaceQueryLocalInterface : new C3287P0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        zze();
        parcel2.writeNoException();
        return true;
    }
}
