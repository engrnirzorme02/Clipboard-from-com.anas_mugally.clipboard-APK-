package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: h3.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5628r0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        C5627r c5627r = null;
        C5568G0 c5568g0 = null;
        C5565F c5565f = null;
        C5580M0 c5580m0 = null;
        C5577L c5577l = null;
        C5581N c5581n = null;
        C5572I0 c5572i0 = null;
        C5584Q c5584q = null;
        C5629s c5629s = null;
        C5588V c5588v = null;
        C5606g0 c5606g0 = null;
        C5586T c5586t = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 2:
                    c5627r = (C5627r) AbstractC1946b.m8029p(parcel, iM8002D, C5627r.CREATOR);
                    break;
                case 3:
                    c5568g0 = (C5568G0) AbstractC1946b.m8029p(parcel, iM8002D, C5568G0.CREATOR);
                    break;
                case 4:
                    c5565f = (C5565F) AbstractC1946b.m8029p(parcel, iM8002D, C5565F.CREATOR);
                    break;
                case 5:
                    c5580m0 = (C5580M0) AbstractC1946b.m8029p(parcel, iM8002D, C5580M0.CREATOR);
                    break;
                case 6:
                    c5577l = (C5577L) AbstractC1946b.m8029p(parcel, iM8002D, C5577L.CREATOR);
                    break;
                case 7:
                    c5581n = (C5581N) AbstractC1946b.m8029p(parcel, iM8002D, C5581N.CREATOR);
                    break;
                case 8:
                    c5572i0 = (C5572I0) AbstractC1946b.m8029p(parcel, iM8002D, C5572I0.CREATOR);
                    break;
                case 9:
                    c5584q = (C5584Q) AbstractC1946b.m8029p(parcel, iM8002D, C5584Q.CREATOR);
                    break;
                case 10:
                    c5629s = (C5629s) AbstractC1946b.m8029p(parcel, iM8002D, C5629s.CREATOR);
                    break;
                case 11:
                    c5588v = (C5588V) AbstractC1946b.m8029p(parcel, iM8002D, C5588V.CREATOR);
                    break;
                case 12:
                    c5606g0 = (C5606g0) AbstractC1946b.m8029p(parcel, iM8002D, C5606g0.CREATOR);
                    break;
                case 13:
                    c5586t = (C5586T) AbstractC1946b.m8029p(parcel, iM8002D, C5586T.CREATOR);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C5599d(c5627r, c5568g0, c5565f, c5580m0, c5577l, c5581n, c5572i0, c5584q, c5629s, c5588v, c5606g0, c5586t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5599d[i7];
    }
}
