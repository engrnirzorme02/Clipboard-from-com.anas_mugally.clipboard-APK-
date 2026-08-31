package p107N2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: N2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0955h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        HashSet hashSet = new HashSet();
        int iM8004F = 0;
        C0956i c0956i = null;
        String strM8030q = null;
        String strM8030q2 = null;
        String strM8030q3 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                hashSet.add(1);
            } else if (iM8036w == 2) {
                c0956i = (C0956i) AbstractC1946b.m8029p(parcel, iM8002D, C0956i.CREATOR);
                hashSet.add(2);
            } else if (iM8036w == 3) {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                hashSet.add(3);
            } else if (iM8036w == 4) {
                strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                hashSet.add(4);
            } else if (iM8036w != 5) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == iM8011M) {
            return new C0954g(hashSet, iM8004F, c0956i, strM8030q, strM8030q2, strM8030q3);
        }
        throw new AbstractC1946b.a("Overread allowed size end=" + iM8011M, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0954g[i7];
    }
}
