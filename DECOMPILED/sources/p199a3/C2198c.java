package p199a3;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: a3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2198c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        C2196a c2196a = null;
        int iM8004F = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w != 2) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                c2196a = (C2196a) AbstractC1946b.m8029p(parcel, iM8002D, C2196a.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C2197b(iM8004F, c2196a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2197b[i7];
    }
}
