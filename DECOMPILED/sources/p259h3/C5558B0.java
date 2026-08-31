package p259h3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: h3.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5558B0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        C5633u c5633u = null;
        Uri uri = null;
        byte[] bArrM8020g = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 2) {
                c5633u = (C5633u) AbstractC1946b.m8029p(parcel, iM8002D, C5633u.CREATOR);
            } else if (iM8036w == 3) {
                uri = (Uri) AbstractC1946b.m8029p(parcel, iM8002D, Uri.CREATOR);
            } else if (iM8036w != 4) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C5615l(c5633u, uri, bArrM8020g);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5615l[i7];
    }
}
