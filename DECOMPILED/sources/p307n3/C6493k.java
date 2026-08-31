package p307n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3673Q;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: n3.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C6493k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        C3673Q c3673q = null;
        int iM8004F = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w != 2) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                c3673q = (C3673Q) AbstractC1946b.m8029p(parcel, iM8002D, C3673Q.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C6492j(iM8004F, c3673q);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6492j[i7];
    }
}
