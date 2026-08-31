package p192Z3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C4861j0;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: Z3.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2131j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        C2126h c2126h = null;
        C2129i0 c2129i0 = null;
        C4861j0 c4861j0 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                c2126h = (C2126h) AbstractC1946b.m8029p(parcel, iM8002D, C2126h.CREATOR);
            } else if (iM8036w == 2) {
                c2129i0 = (C2129i0) AbstractC1946b.m8029p(parcel, iM8002D, C2129i0.CREATOR);
            } else if (iM8036w != 3) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                c4861j0 = (C4861j0) AbstractC1946b.m8029p(parcel, iM8002D, C4861j0.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C2133k0(c2126h, c2129i0, c4861j0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2133k0[i7];
    }
}
