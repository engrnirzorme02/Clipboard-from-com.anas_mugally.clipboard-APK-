package p267i3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: i3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5701h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        byte[] bArrM8020g = null;
        ArrayList arrayListM8034u = null;
        int iM8004F = 0;
        String strM8030q = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w == 2) {
                bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
            } else if (iM8036w == 3) {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w != 4) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, Transport.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C5695b(iM8004F, bArrM8020g, strM8030q, arrayListM8034u);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5695b[i7];
    }
}
