package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import p404z2.InterfaceC7601r;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.q */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class C3382q implements InterfaceC7601r {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ C3382q f14074a = new C3382q();

    private /* synthetic */ C3382q() {
    }

    @Override // p404z2.InterfaceC7601r
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof C3303V ? (C3303V) iInterfaceQueryLocalInterface : new C3303V(iBinder);
    }
}
