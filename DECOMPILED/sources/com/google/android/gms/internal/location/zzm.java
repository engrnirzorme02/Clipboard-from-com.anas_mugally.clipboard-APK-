package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        zzj zzjVar = null;
        int iM8004F = 1;
        IBinder iBinderM8003E = null;
        IBinder iBinderM8003E2 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w == 2) {
                zzjVar = (zzj) AbstractC1946b.m8029p(parcel, iM8002D, zzj.CREATOR);
            } else if (iM8036w == 3) {
                iBinderM8003E = AbstractC1946b.m8003E(parcel, iM8002D);
            } else if (iM8036w != 4) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                iBinderM8003E2 = AbstractC1946b.m8003E(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzl(iM8004F, zzjVar, iBinderM8003E, iBinderM8003E2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl[] newArray(int i7) {
        return new zzl[i7];
    }
}
