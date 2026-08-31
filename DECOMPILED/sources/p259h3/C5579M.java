package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: h3.M */
/* JADX INFO: loaded from: classes.dex */
public final class C5579M implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        long jM8006H = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            if (AbstractC1946b.m8036w(iM8002D) != 1) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C5577L(jM8006H);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5577L[i7];
    }
}
