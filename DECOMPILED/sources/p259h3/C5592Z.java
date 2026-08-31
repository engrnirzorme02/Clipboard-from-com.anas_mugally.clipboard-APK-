package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: h3.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C5592Z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        byte[] bArrM8020g = null;
        ArrayList arrayListM8034u = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 2) {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w == 3) {
                bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
            } else if (iM8036w != 4) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, Transport.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C5635v(strM8030q, bArrM8020g, arrayListM8034u);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5635v[i7];
    }
}
