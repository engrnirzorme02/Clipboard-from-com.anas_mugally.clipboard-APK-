package p259h3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: h3.i0 */
/* JADX INFO: loaded from: classes.dex */
final class C5610i0 implements Parcelable.Creator {
    C5610i0() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C5563E.a.m24997c(parcel.readString());
        } catch (C5563E.b e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5563E.a[i7];
    }
}
