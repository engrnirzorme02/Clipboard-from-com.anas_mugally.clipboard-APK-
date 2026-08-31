package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* JADX INFO: renamed from: com.google.android.gms.dynamic.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3772a extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.dynamic.a$a */
    public static abstract class a extends zzb implements InterfaceC3772a {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* JADX INFO: renamed from: L0 */
        public static InterfaceC3772a m18219L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3772a ? (InterfaceC3772a) iInterfaceQueryLocalInterface : new C3775d(iBinder);
        }
    }
}
