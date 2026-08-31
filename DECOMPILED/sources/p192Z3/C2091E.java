package p192Z3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C4827K;
import com.google.firebase.auth.C4830N;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: Z3.E */
/* JADX INFO: loaded from: classes.dex */
public final class C2091E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        ArrayList arrayListM8034u = null;
        ArrayList arrayListM8034u2 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, C4827K.CREATOR);
            } else if (iM8036w != 2) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                arrayListM8034u2 = AbstractC1946b.m8034u(parcel, iM8002D, C4830N.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C2088B(arrayListM8034u, arrayListM8034u2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2088B[i7];
    }
}
