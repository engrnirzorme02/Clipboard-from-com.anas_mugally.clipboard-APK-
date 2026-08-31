package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3356j1;
import com.google.android.gms.ads.internal.client.C3369m2;
import java.util.ArrayList;
import p177X2.AbstractC1946b;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbuc implements Parcelable.Creator {
    public static final zzbub zza(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        Bundle bundleM8019f = null;
        C3349h2 c3349h2 = null;
        C3369m2 c3369m2 = null;
        String strM8030q = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strM8030q2 = null;
        String strM8030q3 = null;
        String strM8030q4 = null;
        C7584a c7584a = null;
        Bundle bundleM8019f2 = null;
        ArrayList arrayListM8032s = null;
        Bundle bundleM8019f3 = null;
        String strM8030q5 = null;
        String strM8030q6 = null;
        ArrayList arrayListM8032s2 = null;
        String strM8030q7 = null;
        zzbfl zzbflVar = null;
        ArrayList arrayListM8032s3 = null;
        String strM8030q8 = null;
        String strM8030q9 = null;
        String strM8030q10 = null;
        Bundle bundleM8019f4 = null;
        String strM8030q11 = null;
        C3356j1 c3356j1 = null;
        Bundle bundleM8019f5 = null;
        String strM8030q12 = null;
        String strM8030q13 = null;
        String strM8030q14 = null;
        ArrayList arrayListM8025l = null;
        String strM8030q15 = null;
        ArrayList arrayListM8032s4 = null;
        ArrayList arrayListM8032s5 = null;
        String strM8030q16 = null;
        zzblw zzblwVar = null;
        String strM8030q17 = null;
        Bundle bundleM8019f6 = null;
        int iM8004F = 0;
        int iM8004F2 = 0;
        boolean zM8037x = false;
        int iM8004F3 = 0;
        int iM8004F4 = 0;
        boolean zM8037x2 = false;
        int iM8004F5 = 0;
        int iM8004F6 = 0;
        boolean zM8037x3 = false;
        boolean zM8037x4 = false;
        int iM8004F7 = 0;
        boolean zM8037x5 = false;
        boolean zM8037x6 = false;
        int iM8004F8 = 0;
        boolean zM8037x7 = false;
        boolean zM8037x8 = false;
        boolean zM8037x9 = false;
        float fM8000B = 0.0f;
        float fM8000B2 = 0.0f;
        long jM8006H = 0;
        long jM8006H2 = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 2:
                    bundleM8019f = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 3:
                    c3349h2 = (C3349h2) AbstractC1946b.m8029p(parcel, iM8002D, C3349h2.CREATOR);
                    break;
                case 4:
                    c3369m2 = (C3369m2) AbstractC1946b.m8029p(parcel, iM8002D, C3369m2.CREATOR);
                    break;
                case 5:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) AbstractC1946b.m8029p(parcel, iM8002D, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) AbstractC1946b.m8029p(parcel, iM8002D, PackageInfo.CREATOR);
                    break;
                case 8:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 9:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 10:
                    strM8030q4 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 11:
                    c7584a = (C7584a) AbstractC1946b.m8029p(parcel, iM8002D, C7584a.CREATOR);
                    break;
                case 12:
                    bundleM8019f2 = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 13:
                    iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 14:
                    arrayListM8032s = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 15:
                    bundleM8019f3 = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 16:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
                case 18:
                    iM8004F3 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 19:
                    iM8004F4 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 20:
                    fM8000B = AbstractC1946b.m8000B(parcel, iM8002D);
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    strM8030q5 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 25:
                    jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 26:
                    strM8030q6 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 27:
                    arrayListM8032s2 = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 28:
                    strM8030q7 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 29:
                    zzbflVar = (zzbfl) AbstractC1946b.m8029p(parcel, iM8002D, zzbfl.CREATOR);
                    break;
                case 30:
                    arrayListM8032s3 = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 31:
                    jM8006H2 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 33:
                    strM8030q8 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 34:
                    fM8000B2 = AbstractC1946b.m8000B(parcel, iM8002D);
                    break;
                case 35:
                    iM8004F5 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 36:
                    iM8004F6 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 37:
                    zM8037x3 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 39:
                    strM8030q9 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 40:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 41:
                    strM8030q10 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 42:
                    zM8037x4 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 43:
                    iM8004F7 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 44:
                    bundleM8019f4 = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 45:
                    strM8030q11 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 46:
                    c3356j1 = (C3356j1) AbstractC1946b.m8029p(parcel, iM8002D, C3356j1.CREATOR);
                    break;
                case 47:
                    zM8037x5 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 48:
                    bundleM8019f5 = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 49:
                    strM8030q12 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 50:
                    strM8030q13 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 51:
                    strM8030q14 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 52:
                    zM8037x6 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 53:
                    arrayListM8025l = AbstractC1946b.m8025l(parcel, iM8002D);
                    break;
                case 54:
                    strM8030q15 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 55:
                    arrayListM8032s4 = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 56:
                    iM8004F8 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 57:
                    zM8037x7 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 58:
                    zM8037x8 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 59:
                    zM8037x9 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 60:
                    arrayListM8032s5 = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 61:
                    strM8030q16 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 63:
                    zzblwVar = (zzblw) AbstractC1946b.m8029p(parcel, iM8002D, zzblw.CREATOR);
                    break;
                case 64:
                    strM8030q17 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 65:
                    bundleM8019f6 = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzbub(iM8004F, bundleM8019f, c3349h2, c3369m2, strM8030q, applicationInfo, packageInfo, strM8030q2, strM8030q3, strM8030q4, c7584a, bundleM8019f2, iM8004F2, arrayListM8032s, bundleM8019f3, zM8037x, iM8004F3, iM8004F4, fM8000B, strM8030q5, jM8006H, strM8030q6, arrayListM8032s2, strM8030q7, zzbflVar, arrayListM8032s3, jM8006H2, strM8030q8, fM8000B2, zM8037x2, iM8004F5, iM8004F6, zM8037x3, strM8030q9, strM8030q10, zM8037x4, iM8004F7, bundleM8019f4, strM8030q11, c3356j1, zM8037x5, bundleM8019f5, strM8030q12, strM8030q13, strM8030q14, zM8037x6, arrayListM8025l, strM8030q15, arrayListM8032s4, iM8004F8, zM8037x7, zM8037x8, zM8037x9, arrayListM8032s5, strM8030q16, zzblwVar, strM8030q17, bundleM8019f6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbub[i7];
    }
}
