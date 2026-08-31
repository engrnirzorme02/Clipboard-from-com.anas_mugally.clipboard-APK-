package p170W2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: W2.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1827D implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        boolean zM8037x3 = false;
        boolean zM8037x4 = false;
        String strM8030q = null;
        IBinder iBinderM8003E = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 2:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 3:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 4:
                    iBinderM8003E = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                case 5:
                    zM8037x3 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 6:
                    zM8037x4 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C1826C(strM8030q, zM8037x, zM8037x2, iBinderM8003E, zM8037x3, zM8037x4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1826C[i7];
    }
}
