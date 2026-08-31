package p107N2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: N2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0950c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        HashSet hashSet = new HashSet();
        int iM8004F = 0;
        ArrayList arrayListM8034u = null;
        C0952e c0952e = null;
        int iM8004F2 = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                hashSet.add(1);
            } else if (iM8036w == 2) {
                arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, C0954g.CREATOR);
                hashSet.add(2);
            } else if (iM8036w == 3) {
                iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
                hashSet.add(3);
            } else if (iM8036w != 4) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                c0952e = (C0952e) AbstractC1946b.m8029p(parcel, iM8002D, C0952e.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == iM8011M) {
            return new C0949b(hashSet, iM8004F, arrayListM8034u, iM8004F2, c0952e);
        }
        throw new AbstractC1946b.a("Overread allowed size end=" + iM8011M, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0949b[i7];
    }
}
