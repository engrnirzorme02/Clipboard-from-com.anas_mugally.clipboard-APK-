package p114O2;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: O2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1134q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        boolean zM8037x = false;
        int iM8004F = 0;
        boolean zM8037x2 = false;
        C1119b.e eVar = null;
        C1119b.b bVar = null;
        String strM8030q = null;
        C1119b.d dVar = null;
        C1119b.c cVar = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    eVar = (C1119b.e) AbstractC1946b.m8029p(parcel, iM8002D, C1119b.e.CREATOR);
                    break;
                case 2:
                    bVar = (C1119b.b) AbstractC1946b.m8029p(parcel, iM8002D, C1119b.b.CREATOR);
                    break;
                case 3:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 4:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 5:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 6:
                    dVar = (C1119b.d) AbstractC1946b.m8029p(parcel, iM8002D, C1119b.d.CREATOR);
                    break;
                case 7:
                    cVar = (C1119b.c) AbstractC1946b.m8029p(parcel, iM8002D, C1119b.c.CREATOR);
                    break;
                case 8:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C1119b(eVar, bVar, strM8030q, zM8037x, iM8004F, dVar, cVar, zM8037x2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1119b[i7];
    }
}
