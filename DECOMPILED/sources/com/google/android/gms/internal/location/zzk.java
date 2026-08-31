package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3688d;
import com.google.android.gms.location.C3959Y;
import java.util.List;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzk implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        C3959Y c3959y = zzj.zzb;
        List<C3688d> listM8034u = zzj.zza;
        String strM8030q = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                c3959y = (C3959Y) AbstractC1946b.m8029p(parcel, iM8002D, C3959Y.CREATOR);
            } else if (iM8036w == 2) {
                listM8034u = AbstractC1946b.m8034u(parcel, iM8002D, C3688d.CREATOR);
            } else if (iM8036w != 3) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzj(c3959y, listM8034u, strM8030q);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i7) {
        return new zzj[i7];
    }
}
