package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4792v extends AbstractBinderC4786p implements InterfaceC4793w {
    /* JADX INFO: renamed from: L0 */
    public static InterfaceC4793w m21941L0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4793w ? (InterfaceC4793w) iInterfaceQueryLocalInterface : new C4791u(iBinder);
    }
}
