package p380w2;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: w2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7344m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        boolean zM8037x3 = false;
        int iM8004F = 0;
        boolean zM8037x4 = false;
        boolean zM8037x5 = false;
        boolean zM8037x6 = false;
        float fM8000B = 0.0f;
        String strM8030q = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 2:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 3:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 4:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 5:
                    zM8037x3 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 6:
                    fM8000B = AbstractC1946b.m8000B(parcel, iM8002D);
                    break;
                case 7:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 8:
                    zM8037x4 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 9:
                    zM8037x5 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 10:
                    zM8037x6 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C7343l(zM8037x, zM8037x2, strM8030q, zM8037x3, fM8000B, iM8004F, zM8037x4, zM8037x5, zM8037x6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C7343l[i7];
    }
}
