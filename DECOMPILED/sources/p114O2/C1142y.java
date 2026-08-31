package p114O2;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: O2.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1142y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        byte[] bArrM8020g = null;
        boolean zM8037x = false;
        String strM8030q = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
            } else if (iM8036w == 2) {
                bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
            } else if (iM8036w != 3) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C1119b.d(zM8037x, bArrM8020g, strM8030q);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1119b.d[i7];
    }
}
