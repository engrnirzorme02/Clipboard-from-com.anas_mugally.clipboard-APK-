package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.A */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4757A extends AbstractBinderC4786p implements InterfaceC4758B {
    /* JADX INFO: renamed from: L0 */
    public static InterfaceC4758B m21885L0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4758B ? (InterfaceC4758B) iInterfaceQueryLocalInterface : new C4796z(iBinder);
    }
}
