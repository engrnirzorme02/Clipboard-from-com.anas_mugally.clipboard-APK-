package p259h3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: h3.D0 */
/* JADX INFO: loaded from: classes.dex */
final class C5562D0 implements Parcelable.Creator {
    C5562D0() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C5621o.m25063a(parcel.readInt());
        } catch (C5621o.a e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5621o[i7];
    }
}
