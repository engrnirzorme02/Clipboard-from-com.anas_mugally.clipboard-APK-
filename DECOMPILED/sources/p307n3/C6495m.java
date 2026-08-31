package p307n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3675T;
import p170W2.C1837b;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: n3.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C6495m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        C1837b c1837b = null;
        int iM8004F = 0;
        C3675T c3675t = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w == 2) {
                c1837b = (C1837b) AbstractC1946b.m8029p(parcel, iM8002D, C1837b.CREATOR);
            } else if (iM8036w != 3) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                c3675t = (C3675T) AbstractC1946b.m8029p(parcel, iM8002D, C3675T.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C6494l(iM8004F, c1837b, c3675t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6494l[i7];
    }
}
