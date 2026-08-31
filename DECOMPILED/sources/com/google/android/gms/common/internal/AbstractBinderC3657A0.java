package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.A0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3657A0 extends zzb implements InterfaceC3678W {
    public AbstractBinderC3657A0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* JADX INFO: renamed from: L0 */
    public static InterfaceC3678W m17973L0(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3678W ? (InterfaceC3678W) iInterfaceQueryLocalInterface : new C3733z0(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            InterfaceC3772a interfaceC3772aZzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, interfaceC3772aZzd);
        } else {
            if (i7 != 2) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }
}
