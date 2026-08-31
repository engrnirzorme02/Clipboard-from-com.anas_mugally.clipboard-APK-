package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.s */
/* JADX INFO: loaded from: classes.dex */
final class C2601s implements Parcelable {
    public static final Parcelable.Creator<C2601s> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    ArrayList f10298a;

    /* JADX INFO: renamed from: b */
    ArrayList f10299b;

    /* JADX INFO: renamed from: c */
    C2584b[] f10300c;

    /* JADX INFO: renamed from: d */
    int f10301d;

    /* JADX INFO: renamed from: e */
    String f10302e;

    /* JADX INFO: renamed from: f */
    ArrayList f10303f;

    /* JADX INFO: renamed from: r */
    ArrayList f10304r;

    /* JADX INFO: renamed from: s */
    ArrayList f10305s;

    /* JADX INFO: renamed from: androidx.fragment.app.s$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2601s createFromParcel(Parcel parcel) {
            return new C2601s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2601s[] newArray(int i7) {
            return new C2601s[i7];
        }
    }

    public C2601s() {
        this.f10302e = null;
        this.f10303f = new ArrayList();
        this.f10304r = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f10298a);
        parcel.writeStringList(this.f10299b);
        parcel.writeTypedArray(this.f10300c, i7);
        parcel.writeInt(this.f10301d);
        parcel.writeString(this.f10302e);
        parcel.writeStringList(this.f10303f);
        parcel.writeTypedList(this.f10304r);
        parcel.writeTypedList(this.f10305s);
    }

    public C2601s(Parcel parcel) {
        this.f10302e = null;
        this.f10303f = new ArrayList();
        this.f10304r = new ArrayList();
        this.f10298a = parcel.createStringArrayList();
        this.f10299b = parcel.createStringArrayList();
        this.f10300c = (C2584b[]) parcel.createTypedArray(C2584b.CREATOR);
        this.f10301d = parcel.readInt();
        this.f10302e = parcel.readString();
        this.f10303f = parcel.createStringArrayList();
        this.f10304r = parcel.createTypedArrayList(C2585c.CREATOR);
        this.f10305s = parcel.createTypedArrayList(AbstractC2599q.l.CREATOR);
    }
}
