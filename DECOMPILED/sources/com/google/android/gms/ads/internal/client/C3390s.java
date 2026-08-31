package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import p404z2.InterfaceC7601r;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.s */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class C3390s implements InterfaceC7601r {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ C3390s f14087a = new C3390s();

    private /* synthetic */ C3390s() {
    }

    @Override // p404z2.InterfaceC7601r
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return iInterfaceQueryLocalInterface instanceof C3363l0 ? (C3363l0) iInterfaceQueryLocalInterface : new C3363l0(iBinder);
    }
}
