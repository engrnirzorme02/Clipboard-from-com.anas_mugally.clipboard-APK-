package p192Z3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C4827K;
import com.google.firebase.auth.C4830N;
import com.google.firebase.auth.C4861j0;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: Z3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2136n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        ArrayList arrayListM8034u = null;
        C2135m c2135m = null;
        String strM8030q = null;
        C4861j0 c4861j0 = null;
        C2126h c2126h = null;
        ArrayList arrayListM8034u2 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, C4827K.CREATOR);
                    break;
                case 2:
                    c2135m = (C2135m) AbstractC1946b.m8029p(parcel, iM8002D, C2135m.CREATOR);
                    break;
                case 3:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 4:
                    c4861j0 = (C4861j0) AbstractC1946b.m8029p(parcel, iM8002D, C4861j0.CREATOR);
                    break;
                case 5:
                    c2126h = (C2126h) AbstractC1946b.m8029p(parcel, iM8002D, C2126h.CREATOR);
                    break;
                case 6:
                    arrayListM8034u2 = AbstractC1946b.m8034u(parcel, iM8002D, C4830N.CREATOR);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C2134l(arrayListM8034u, c2135m, strM8030q, c4861j0, c2126h, arrayListM8034u2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2134l[i7];
    }
}
