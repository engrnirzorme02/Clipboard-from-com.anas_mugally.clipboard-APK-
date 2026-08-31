package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: loaded from: classes.dex */
class C2585c implements Parcelable {
    public static final Parcelable.Creator<C2585c> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    final List f10067a;

    /* JADX INFO: renamed from: b */
    final List f10068b;

    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2585c createFromParcel(Parcel parcel) {
            return new C2585c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2585c[] newArray(int i7) {
            return new C2585c[i7];
        }
    }

    C2585c(Parcel parcel) {
        this.f10067a = parcel.createStringArrayList();
        this.f10068b = parcel.createTypedArrayList(C2584b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f10067a);
        parcel.writeTypedList(this.f10068b);
    }
}
