package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p074J0.InterfaceC0671a;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C2866a();

    /* JADX INFO: renamed from: a */
    private final InterfaceC0671a f11678a;

    /* JADX INFO: renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C2866a implements Parcelable.Creator {
        C2866a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i7) {
            return new ParcelImpl[i7];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f11678a = new C2868b(parcel).m14313u();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        new C2868b(parcel).m14294L(this.f11678a);
    }
}
