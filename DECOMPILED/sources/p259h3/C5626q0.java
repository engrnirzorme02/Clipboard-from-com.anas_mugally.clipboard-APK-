package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: h3.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5626q0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        C5569H c5569h = null;
        C5632t0 c5632t0 = null;
        C5603f c5603f = null;
        C5636v0 c5636v0 = null;
        String strM8030q = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                c5569h = (C5569H) AbstractC1946b.m8029p(parcel, iM8002D, C5569H.CREATOR);
            } else if (iM8036w == 2) {
                c5632t0 = (C5632t0) AbstractC1946b.m8029p(parcel, iM8002D, C5632t0.CREATOR);
            } else if (iM8036w == 3) {
                c5603f = (C5603f) AbstractC1946b.m8029p(parcel, iM8002D, C5603f.CREATOR);
            } else if (iM8036w == 4) {
                c5636v0 = (C5636v0) AbstractC1946b.m8029p(parcel, iM8002D, C5636v0.CREATOR);
            } else if (iM8036w != 5) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C5601e(c5569h, c5632t0, c5603f, c5636v0, strM8030q);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5601e[i7];
    }
}
