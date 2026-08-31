package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import p404z2.InterfaceC7601r;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.e2 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class C3337e2 implements InterfaceC7601r {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ C3337e2 f13929a = new C3337e2();

    private /* synthetic */ C3337e2() {
    }

    @Override // p404z2.InterfaceC7601r
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof C3315Z ? (C3315Z) iInterfaceQueryLocalInterface : new C3315Z(iBinder);
    }
}
