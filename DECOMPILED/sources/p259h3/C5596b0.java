package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: h3.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5596b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        byte[] bArrM8020g = null;
        Double dM7999A = null;
        String strM8030q = null;
        ArrayList arrayListM8034u = null;
        Integer numM8005G = null;
        C5563E c5563e = null;
        String strM8030q2 = null;
        C5599d c5599d = null;
        Long lM8007I = null;
        String strM8030q3 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 2:
                    bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
                    break;
                case 3:
                    dM7999A = AbstractC1946b.m7999A(parcel, iM8002D);
                    break;
                case 4:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 5:
                    arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, C5635v.CREATOR);
                    break;
                case 6:
                    numM8005G = AbstractC1946b.m8005G(parcel, iM8002D);
                    break;
                case 7:
                    c5563e = (C5563E) AbstractC1946b.m8029p(parcel, iM8002D, C5563E.CREATOR);
                    break;
                case 8:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 9:
                    c5599d = (C5599d) AbstractC1946b.m8029p(parcel, iM8002D, C5599d.CREATOR);
                    break;
                case 10:
                    lM8007I = AbstractC1946b.m8007I(parcel, iM8002D);
                    break;
                case 11:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 12:
                    resultReceiver = (ResultReceiver) AbstractC1946b.m8029p(parcel, iM8002D, ResultReceiver.CREATOR);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C5639x(bArrM8020g, dM7999A, strM8030q, arrayListM8034u, numM8005G, c5563e, strM8030q2, c5599d, lM8007I, strM8030q3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5639x[i7];
    }
}
