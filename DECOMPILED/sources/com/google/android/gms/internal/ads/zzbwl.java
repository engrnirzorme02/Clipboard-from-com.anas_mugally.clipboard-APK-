package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import p404z2.InterfaceC7601r;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbwl implements InterfaceC7601r {
    static final /* synthetic */ zzbwl zza = new zzbwl();

    private /* synthetic */ zzbwl() {
    }

    @Override // p404z2.InterfaceC7601r
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return iInterfaceQueryLocalInterface instanceof zzbwe ? (zzbwe) iInterfaceQueryLocalInterface : new zzbwe(iBinder);
    }
}
