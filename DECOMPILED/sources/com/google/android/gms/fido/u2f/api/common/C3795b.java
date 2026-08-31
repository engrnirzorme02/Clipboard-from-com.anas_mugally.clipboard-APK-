package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p177X2.AbstractC1946b;
import p267i3.C5694a;
import p267i3.C5698e;

/* JADX INFO: renamed from: com.google.android.gms.fido.u2f.api.common.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3795b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        Integer numM8005G = null;
        Double dM7999A = null;
        Uri uri = null;
        byte[] bArrM8020g = null;
        ArrayList arrayListM8034u = null;
        C5694a c5694a = null;
        String strM8030q = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 2:
                    numM8005G = AbstractC1946b.m8005G(parcel, iM8002D);
                    break;
                case 3:
                    dM7999A = AbstractC1946b.m7999A(parcel, iM8002D);
                    break;
                case 4:
                    uri = (Uri) AbstractC1946b.m8029p(parcel, iM8002D, Uri.CREATOR);
                    break;
                case 5:
                    bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
                    break;
                case 6:
                    arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, C5698e.CREATOR);
                    break;
                case 7:
                    c5694a = (C5694a) AbstractC1946b.m8029p(parcel, iM8002D, C5694a.CREATOR);
                    break;
                case 8:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new SignRequestParams(numM8005G, dM7999A, uri, bArrM8020g, arrayListM8034u, c5694a, strM8030q);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new SignRequestParams[i7];
    }
}
