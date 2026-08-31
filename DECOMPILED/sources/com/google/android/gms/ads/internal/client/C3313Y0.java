package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbox;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3313Y0 extends zzaxz implements IInterface {
    C3313Y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    /* JADX INFO: renamed from: L0 */
    public final InterfaceC3310X0 m17217L0(InterfaceC3772a interfaceC3772a, zzbox zzboxVar, int i7) {
        InterfaceC3310X0 c3304v0;
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzboxVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(1, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3304v0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c3304v0 = iInterfaceQueryLocalInterface instanceof InterfaceC3310X0 ? (InterfaceC3310X0) iInterfaceQueryLocalInterface : new C3304V0(strongBinder);
        }
        parcelZzde.recycle();
        return c3304v0;
    }
}
