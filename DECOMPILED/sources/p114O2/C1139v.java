package p114O2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: O2.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1139v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        String strM8030q2 = null;
        String strM8030q3 = null;
        String strM8030q4 = null;
        ArrayList arrayListM8034u = null;
        boolean zM8037x = false;
        int iM8004F = 0;
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
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 6:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 7:
                    arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, C1121d.CREATOR);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C1124g(strM8030q, strM8030q2, strM8030q3, strM8030q4, zM8037x, iM8004F, arrayListM8034u);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1124g[i7];
    }
}
