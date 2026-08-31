package com.google.android.play.integrity.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.p */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4786p extends Binder implements IInterface {
    protected AbstractBinderC4786p(String str) {
        attachInterface(this, str);
    }

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo21888a(int i7, Parcel parcel, Parcel parcel2, int i8);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i7, parcel, parcel2, i8)) {
            return true;
        }
        return mo21888a(i7, parcel, parcel2, i8);
    }
}
