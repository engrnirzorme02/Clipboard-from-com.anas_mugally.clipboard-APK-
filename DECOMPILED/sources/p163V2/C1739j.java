package p163V2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: V2.j */
/* JADX INFO: loaded from: classes.dex */
final class C1739j implements Parcelable.Creator {
    C1739j() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C1741l(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1741l[i7];
    }
}
