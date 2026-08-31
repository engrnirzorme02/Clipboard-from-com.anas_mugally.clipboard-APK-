package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: h3.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C5591Y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        String strM8030q2 = null;
        byte[] bArrM8020g = null;
        C5607h c5607h = null;
        C5605g c5605g = null;
        C5609i c5609i = null;
        C5601e c5601e = null;
        String strM8030q3 = null;
        String strM8030q4 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 2:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
                    break;
                case 4:
                    c5607h = (C5607h) AbstractC1946b.m8029p(parcel, iM8002D, C5607h.CREATOR);
                    break;
                case 5:
                    c5605g = (C5605g) AbstractC1946b.m8029p(parcel, iM8002D, C5605g.CREATOR);
                    break;
                case 6:
                    c5609i = (C5609i) AbstractC1946b.m8029p(parcel, iM8002D, C5609i.CREATOR);
                    break;
                case 7:
                    c5601e = (C5601e) AbstractC1946b.m8029p(parcel, iM8002D, C5601e.CREATOR);
                    break;
                case 8:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 9:
                    strM8030q4 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C5631t(strM8030q, strM8030q2, bArrM8020g, c5607h, c5605g, c5609i, c5601e, strM8030q3, strM8030q4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5631t[i7];
    }
}
