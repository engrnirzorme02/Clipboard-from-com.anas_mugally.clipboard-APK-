package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import p314o2.InterfaceC6564p;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3275L0 implements InterfaceC6564p {

    /* JADX INFO: renamed from: a */
    private final String f13895a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC3272K0 f13896b;

    public C3275L0(InterfaceC3272K0 interfaceC3272K0) {
        String strZze;
        this.f13896b = interfaceC3272K0;
        try {
            strZze = interfaceC3272K0.zze();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            strZze = null;
        }
        this.f13895a = strZze;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3272K0 m17212a() {
        return this.f13896b;
    }

    public final String toString() {
        return this.f13895a;
    }
}
