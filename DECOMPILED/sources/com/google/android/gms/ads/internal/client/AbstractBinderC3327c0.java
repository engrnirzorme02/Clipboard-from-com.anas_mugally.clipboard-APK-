package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzaya;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3327c0 extends zzaya implements InterfaceC3331d0 {
    /* JADX INFO: renamed from: L0 */
    public static InterfaceC3331d0 m17222L0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3331d0 ? (InterfaceC3331d0) iInterfaceQueryLocalInterface : new C3319a0(iBinder);
    }
}
