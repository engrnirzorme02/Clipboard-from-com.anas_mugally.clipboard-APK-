package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.common.api.u */
/* JADX INFO: loaded from: classes.dex */
final class C3651u implements Parcelable.Creator {

    /* JADX INFO: renamed from: b */
    private static final C3651u f14713b = new C3651u(new C3652v());

    /* JADX INFO: renamed from: a */
    private final Parcelable.Creator f14714a;

    private C3651u(Parcelable.Creator creator) {
        this.f14714a = creator;
    }

    /* JADX INFO: renamed from: a */
    public static C3651u m17971a() {
        return f14713b;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return C3652v.m17972a(parcel);
        }
        parcel.setDataPosition(iDataPosition - 4);
        return C3555c.m17752U();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i7) {
        return new C3555c[i7];
    }
}
