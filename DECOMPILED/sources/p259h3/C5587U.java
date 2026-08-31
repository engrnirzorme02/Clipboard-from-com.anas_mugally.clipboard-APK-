package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: h3.U */
/* JADX INFO: loaded from: classes.dex */
public final class C5587U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        int iM8004F = 0;
        byte[] bArrM8020g = null;
        byte[] bArrM8020g2 = null;
        byte[] bArrM8020g3 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
            } else if (iM8036w == 2) {
                bArrM8020g2 = AbstractC1946b.m8020g(parcel, iM8002D);
            } else if (iM8036w == 3) {
                bArrM8020g3 = AbstractC1946b.m8020g(parcel, iM8002D);
            } else if (iM8036w != 4) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C5586T(bArrM8020g == null ? null : zzgx.zzl(bArrM8020g, 0, bArrM8020g.length), bArrM8020g2 == null ? null : zzgx.zzl(bArrM8020g2, 0, bArrM8020g2.length), bArrM8020g3 != null ? zzgx.zzl(bArrM8020g3, 0, bArrM8020g3.length) : null, iM8004F);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5586T[i7];
    }
}
