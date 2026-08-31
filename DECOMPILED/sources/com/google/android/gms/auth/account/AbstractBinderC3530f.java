package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zzb;

/* JADX INFO: renamed from: com.google.android.gms.auth.account.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3530f extends zzb implements InterfaceC3531g {
    /* JADX INFO: renamed from: L0 */
    public static InterfaceC3531g m17639L0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3531g ? (InterfaceC3531g) iInterfaceQueryLocalInterface : new C3529e(iBinder);
    }
}
