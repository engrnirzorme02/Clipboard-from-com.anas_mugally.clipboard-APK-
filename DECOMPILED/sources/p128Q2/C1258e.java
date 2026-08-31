package p128Q2;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: Q2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1258e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundleM8019f = null;
        byte[] bArrM8020g = null;
        int iM8004F = 0;
        int iM8004F2 = 0;
        int iM8004F3 = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w == 2) {
                pendingIntent = (PendingIntent) AbstractC1946b.m8029p(parcel, iM8002D, PendingIntent.CREATOR);
            } else if (iM8036w == 3) {
                iM8004F3 = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w == 4) {
                bundleM8019f = AbstractC1946b.m8019f(parcel, iM8002D);
            } else if (iM8036w == 5) {
                bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
            } else if (iM8036w != 1000) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C1256c(iM8004F, iM8004F2, pendingIntent, iM8004F3, bundleM8019f, bArrM8020g);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1256c[i7];
    }
}
