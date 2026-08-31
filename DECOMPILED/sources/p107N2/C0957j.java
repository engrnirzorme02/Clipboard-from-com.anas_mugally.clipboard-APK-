package p107N2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: N2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0957j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        HashSet hashSet = new HashSet();
        int iM8004F = 0;
        String strM8030q = null;
        byte[] bArrM8020g = null;
        PendingIntent pendingIntent = null;
        C0948a c0948a = null;
        int iM8004F2 = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    hashSet.add(1);
                    break;
                case 2:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    hashSet.add(2);
                    break;
                case 3:
                    iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
                    hashSet.add(3);
                    break;
                case 4:
                    bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) AbstractC1946b.m8029p(parcel, iM8002D, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    c0948a = (C0948a) AbstractC1946b.m8029p(parcel, iM8002D, C0948a.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        if (parcel.dataPosition() == iM8011M) {
            return new C0956i(hashSet, iM8004F, strM8030q, iM8004F2, bArrM8020g, pendingIntent, c0948a);
        }
        throw new AbstractC1946b.a("Overread allowed size end=" + iM8011M, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0956i[i7];
    }
}
