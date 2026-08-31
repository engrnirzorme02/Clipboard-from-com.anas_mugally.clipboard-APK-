package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.Y */
/* JADX INFO: loaded from: classes.dex */
final class C3680Y implements InterfaceC3708n {

    /* JADX INFO: renamed from: a */
    private final IBinder f14742a;

    C3680Y(IBinder iBinder) {
        this.f14742a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14742a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3708n
    /* JADX INFO: renamed from: r */
    public final void mo17994r(InterfaceC3706m interfaceC3706m, C3694g c3694g) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC3706m != null ? interfaceC3706m.asBinder() : null);
            if (c3694g != null) {
                parcelObtain.writeInt(1);
                C3713p0.m18051a(c3694g, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f14742a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
