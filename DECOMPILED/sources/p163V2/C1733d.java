package p163V2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: V2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1733d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            if (AbstractC1946b.m8036w(iM8002D) != 1) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                intent = (Intent) AbstractC1946b.m8029p(parcel, iM8002D, Intent.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C1730a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1730a[i7];
    }
}
