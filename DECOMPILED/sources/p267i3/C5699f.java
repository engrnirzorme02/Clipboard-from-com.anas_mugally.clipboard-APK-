package p267i3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: i3.f */
/* JADX INFO: loaded from: classes.dex */
final class C5699f implements Parcelable.Creator {
    C5699f() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C5694a.m25250W(parcel.readInt());
        } catch (C5694a.b e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5694a.a[i7];
    }
}
