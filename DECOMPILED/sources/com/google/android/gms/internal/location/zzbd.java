package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbd implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        int iM8004F = 1;
        zzba zzbaVar = null;
        IBinder iBinderM8003E = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderM8003E2 = null;
        IBinder iBinderM8003E3 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 2:
                    zzbaVar = (zzba) AbstractC1946b.m8029p(parcel, iM8002D, zzba.CREATOR);
                    break;
                case 3:
                    iBinderM8003E = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) AbstractC1946b.m8029p(parcel, iM8002D, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderM8003E2 = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                case 6:
                    iBinderM8003E3 = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzbc(iM8004F, zzbaVar, iBinderM8003E, pendingIntent, iBinderM8003E2, iBinderM8003E3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i7) {
        return new zzbc[i7];
    }
}
