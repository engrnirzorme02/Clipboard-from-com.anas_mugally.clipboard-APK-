package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3547c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        String strM8030q2 = null;
        String strM8030q3 = null;
        String strM8030q4 = null;
        Uri uri = null;
        String strM8030q5 = null;
        String strM8030q6 = null;
        ArrayList arrayListM8034u = null;
        String strM8030q7 = null;
        String strM8030q8 = null;
        long jM8006H = 0;
        int iM8004F = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 2:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 4:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 5:
                    strM8030q4 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 6:
                    uri = (Uri) AbstractC1946b.m8029p(parcel, iM8002D, Uri.CREATOR);
                    break;
                case 7:
                    strM8030q5 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 8:
                    jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 9:
                    strM8030q6 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 10:
                    arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, Scope.CREATOR);
                    break;
                case 11:
                    strM8030q7 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 12:
                    strM8030q8 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new GoogleSignInAccount(iM8004F, strM8030q, strM8030q2, strM8030q3, strM8030q4, uri, strM8030q5, jM8006H, strM8030q6, arrayListM8034u, strM8030q7, strM8030q8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new GoogleSignInAccount[i7];
    }
}
