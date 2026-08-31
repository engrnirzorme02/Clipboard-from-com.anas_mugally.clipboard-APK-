package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: h3.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5642y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        byte[] bArrM8020g = null;
        byte[] bArrM8020g2 = null;
        byte[] bArrM8020g3 = null;
        String[] strArrM8031r = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 2) {
                bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
            } else if (iM8036w == 3) {
                bArrM8020g2 = AbstractC1946b.m8020g(parcel, iM8002D);
            } else if (iM8036w == 4) {
                bArrM8020g3 = AbstractC1946b.m8020g(parcel, iM8002D);
            } else if (iM8036w != 5) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                strArrM8031r = AbstractC1946b.m8031r(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C5607h(bArrM8020g, bArrM8020g2, bArrM8020g3, strArrM8031r);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5607h[i7];
    }
}
