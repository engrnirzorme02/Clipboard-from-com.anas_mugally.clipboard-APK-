package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4771a implements IInterface {

    /* JADX INFO: renamed from: a */
    private final IBinder f18375a;

    /* JADX INFO: renamed from: b */
    private final String f18376b;

    protected AbstractC4771a(IBinder iBinder, String str) {
        this.f18375a = iBinder;
        this.f18376b = str;
    }

    /* JADX INFO: renamed from: L0 */
    protected final Parcel m21896L0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f18376b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: M0 */
    protected final void m21897M0(int i7, Parcel parcel) {
        try {
            this.f18375a.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18375a;
    }
}
