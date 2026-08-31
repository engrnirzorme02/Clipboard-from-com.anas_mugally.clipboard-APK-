package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3683a0 extends zzb implements InterfaceC3685b0 {
    /* JADX INFO: renamed from: L0 */
    public static InterfaceC3685b0 m17999L0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3685b0 ? (InterfaceC3685b0) iInterfaceQueryLocalInterface : new C3681Z(iBinder);
    }
}
