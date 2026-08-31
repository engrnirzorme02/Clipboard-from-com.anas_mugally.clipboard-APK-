package p107N2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: N2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0953f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        ArrayList arrayListM8032s = null;
        ArrayList arrayListM8032s2 = null;
        ArrayList arrayListM8032s3 = null;
        ArrayList arrayListM8032s4 = null;
        ArrayList arrayListM8032s5 = null;
        int iM8004F = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 2:
                    arrayListM8032s = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 3:
                    arrayListM8032s2 = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 4:
                    arrayListM8032s3 = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 5:
                    arrayListM8032s4 = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 6:
                    arrayListM8032s5 = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C0952e(iM8004F, arrayListM8032s, arrayListM8032s2, arrayListM8032s3, arrayListM8032s4, arrayListM8032s5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0952e[i7];
    }
}
