package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import p404z2.InterfaceC7601r;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.e */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class C3334e implements InterfaceC7601r {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ C3334e f13928a = new C3334e();

    private /* synthetic */ C3334e() {
    }

    @Override // p404z2.InterfaceC7601r
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
        return iInterfaceQueryLocalInterface instanceof C3313Y0 ? (C3313Y0) iInterfaceQueryLocalInterface : new C3313Y0(iBinder);
    }
}
