package p114O2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: O2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1140w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        String strM8030q2 = null;
        String strM8030q3 = null;
        ArrayList arrayListM8032s = null;
        ArrayList arrayListM8034u = null;
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        boolean zM8037x3 = false;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 2:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 4:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 5:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 6:
                    arrayListM8032s = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 7:
                    zM8037x3 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 8:
                    arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, C1121d.CREATOR);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C1119b.b(zM8037x, strM8030q, strM8030q2, zM8037x2, strM8030q3, arrayListM8032s, zM8037x3, arrayListM8034u);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1119b.b[i7];
    }
}
