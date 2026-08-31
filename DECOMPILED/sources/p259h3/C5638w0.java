package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: h3.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5638w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        byte[] bArrM8020g = null;
        boolean zM8037x = false;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
            } else if (iM8036w != 2) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C5636v0(zM8037x, bArrM8020g != null ? zzgx.zzl(bArrM8020g, 0, bArrM8020g.length) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5636v0[i7];
    }
}
