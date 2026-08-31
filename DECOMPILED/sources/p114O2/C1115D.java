package p114O2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;
import p259h3.C5631t;

/* JADX INFO: renamed from: O2.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1115D implements Parcelable.Creator {
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
        String strM8030q7 = null;
        C5631t c5631t = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 2:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 4:
                    strM8030q4 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 5:
                    uri = (Uri) AbstractC1946b.m8029p(parcel, iM8002D, Uri.CREATOR);
                    break;
                case 6:
                    strM8030q5 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 7:
                    strM8030q6 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 8:
                    strM8030q7 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 9:
                    c5631t = (C5631t) AbstractC1946b.m8029p(parcel, iM8002D, C5631t.CREATOR);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C1130m(strM8030q, strM8030q2, strM8030q3, strM8030q4, uri, strM8030q5, strM8030q6, strM8030q7, c5631t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1130m[i7];
    }
}
