package p283k3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: k3.K */
/* JADX INFO: loaded from: classes2.dex */
public final class C6028K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        ArrayList arrayListM8025l = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            if (AbstractC1946b.m8036w(iM8002D) != 1) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                arrayListM8025l = AbstractC1946b.m8025l(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C6027J(arrayListM8025l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6027J[i7];
    }
}
