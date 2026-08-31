package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p177X2.AbstractC1946b;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbuw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        int iM8004F = 0;
        Bundle bundleM8019f = null;
        C7584a c7584a = null;
        ApplicationInfo applicationInfo = null;
        String strM8030q = null;
        ArrayList arrayListM8032s = null;
        PackageInfo packageInfo = null;
        String strM8030q2 = null;
        String strM8030q3 = null;
        zzfey zzfeyVar = null;
        String strM8030q4 = null;
        Bundle bundleM8019f2 = null;
        Bundle bundleM8019f3 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    bundleM8019f = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 2:
                    c7584a = (C7584a) AbstractC1946b.m8029p(parcel, iM8002D, C7584a.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) AbstractC1946b.m8029p(parcel, iM8002D, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 5:
                    arrayListM8032s = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 6:
                    packageInfo = (PackageInfo) AbstractC1946b.m8029p(parcel, iM8002D, PackageInfo.CREATOR);
                    break;
                case 7:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 8:
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
                case 9:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 10:
                    zzfeyVar = (zzfey) AbstractC1946b.m8029p(parcel, iM8002D, zzfey.CREATOR);
                    break;
                case 11:
                    strM8030q4 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 12:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 13:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 14:
                    bundleM8019f2 = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 15:
                    bundleM8019f3 = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 16:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzbuv(bundleM8019f, c7584a, applicationInfo, strM8030q, arrayListM8032s, packageInfo, strM8030q2, strM8030q3, zzfeyVar, strM8030q4, zM8037x, zM8037x2, bundleM8019f2, bundleM8019f3, iM8004F);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbuv[i7];
    }
}
