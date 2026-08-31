package com.google.android.gms.internal.p411firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaiy implements Parcelable.Creator<zzaiz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiz createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            AbstractC1946b.m8036w(iM8002D);
            AbstractC1946b.m8010L(parcel, iM8002D);
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzaiz();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiz[] newArray(int i7) {
        return new zzaiz[i7];
    }
}
