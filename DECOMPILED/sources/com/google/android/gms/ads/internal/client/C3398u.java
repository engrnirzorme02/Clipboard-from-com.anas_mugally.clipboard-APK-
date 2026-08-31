package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import p404z2.InterfaceC7601r;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.u */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class C3398u implements InterfaceC7601r {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ C3398u f14094a = new C3398u();

    private /* synthetic */ C3398u() {
    }

    @Override // p404z2.InterfaceC7601r
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof C3251D0 ? (C3251D0) iInterfaceQueryLocalInterface : new C3251D0(iBinder);
    }
}
