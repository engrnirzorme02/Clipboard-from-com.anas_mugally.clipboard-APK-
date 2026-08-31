package p192Z3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p411firebaseauthapi.zzahv;
import com.google.firebase.auth.C4843a0;
import com.google.firebase.auth.C4861j0;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: Z3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2124g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        zzahv zzahvVar = null;
        C2118d c2118d = null;
        String strM8030q = null;
        String strM8030q2 = null;
        ArrayList arrayListM8034u = null;
        ArrayList arrayListM8032s = null;
        String strM8030q3 = null;
        Boolean boolM8038y = null;
        C2130j c2130j = null;
        C4861j0 c4861j0 = null;
        C2088B c2088b = null;
        ArrayList arrayListM8034u2 = null;
        boolean zM8037x = false;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    zzahvVar = (zzahv) AbstractC1946b.m8029p(parcel, iM8002D, zzahv.CREATOR);
                    break;
                case 2:
                    c2118d = (C2118d) AbstractC1946b.m8029p(parcel, iM8002D, C2118d.CREATOR);
                    break;
                case 3:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 4:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 5:
                    arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, C2118d.CREATOR);
                    break;
                case 6:
                    arrayListM8032s = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 7:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 8:
                    boolM8038y = AbstractC1946b.m8038y(parcel, iM8002D);
                    break;
                case 9:
                    c2130j = (C2130j) AbstractC1946b.m8029p(parcel, iM8002D, C2130j.CREATOR);
                    break;
                case 10:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 11:
                    c4861j0 = (C4861j0) AbstractC1946b.m8029p(parcel, iM8002D, C4861j0.CREATOR);
                    break;
                case 12:
                    c2088b = (C2088B) AbstractC1946b.m8029p(parcel, iM8002D, C2088B.CREATOR);
                    break;
                case 13:
                    arrayListM8034u2 = AbstractC1946b.m8034u(parcel, iM8002D, C4843a0.CREATOR);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C2126h(zzahvVar, c2118d, strM8030q, strM8030q2, arrayListM8034u, arrayListM8032s, strM8030q3, boolM8038y, c2130j, zM8037x, c4861j0, c2088b, arrayListM8034u2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2126h[i7];
    }
}
