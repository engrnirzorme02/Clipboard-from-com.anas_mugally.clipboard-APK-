package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.k */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3702k extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.k$a */
    public static abstract class a extends zzb implements InterfaceC3702k {
        /* JADX INFO: renamed from: L0 */
        public static InterfaceC3702k m18048L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3702k ? (InterfaceC3702k) iInterfaceQueryLocalInterface : new C3731y0(iBinder);
        }
    }

    Account zzb();
}
