package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: h3.X */
/* JADX INFO: loaded from: classes.dex */
public final class C5590X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        C5641y c5641y = null;
        C5555A c5555a = null;
        byte[] bArrM8020g = null;
        ArrayList arrayListM8034u = null;
        Double dM7999A = null;
        ArrayList arrayListM8034u2 = null;
        C5613k c5613k = null;
        Integer numM8005G = null;
        C5563E c5563e = null;
        String strM8030q = null;
        C5599d c5599d = null;
        String strM8030q2 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 2:
                    c5641y = (C5641y) AbstractC1946b.m8029p(parcel, iM8002D, C5641y.CREATOR);
                    break;
                case 3:
                    c5555a = (C5555A) AbstractC1946b.m8029p(parcel, iM8002D, C5555A.CREATOR);
                    break;
                case 4:
                    bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
                    break;
                case 5:
                    arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, C5637w.CREATOR);
                    break;
                case 6:
                    dM7999A = AbstractC1946b.m7999A(parcel, iM8002D);
                    break;
                case 7:
                    arrayListM8034u2 = AbstractC1946b.m8034u(parcel, iM8002D, C5635v.CREATOR);
                    break;
                case 8:
                    c5613k = (C5613k) AbstractC1946b.m8029p(parcel, iM8002D, C5613k.CREATOR);
                    break;
                case 9:
                    numM8005G = AbstractC1946b.m8005G(parcel, iM8002D);
                    break;
                case 10:
                    c5563e = (C5563E) AbstractC1946b.m8029p(parcel, iM8002D, C5563E.CREATOR);
                    break;
                case 11:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 12:
                    c5599d = (C5599d) AbstractC1946b.m8029p(parcel, iM8002D, C5599d.CREATOR);
                    break;
                case 13:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 14:
                    resultReceiver = (ResultReceiver) AbstractC1946b.m8029p(parcel, iM8002D, ResultReceiver.CREATOR);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C5633u(c5641y, c5555a, bArrM8020g, arrayListM8034u, dM7999A, arrayListM8034u2, c5613k, numM8005G, c5563e, strM8030q, c5599d, strM8030q2, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5633u[i7];
    }
}
