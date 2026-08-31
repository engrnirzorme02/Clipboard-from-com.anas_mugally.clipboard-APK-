package p085K3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C2400k;
import p146T.AbstractC1446a;

/* JADX INFO: renamed from: K3.a */
/* JADX INFO: loaded from: classes2.dex */
public class C0744a extends AbstractC1446a {
    public static final Parcelable.Creator<C0744a> CREATOR = new a();

    /* JADX INFO: renamed from: c */
    public final C2400k f2924c;

    /* JADX INFO: renamed from: K3.a$a */
    class a implements Parcelable.ClassLoaderCreator {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0744a createFromParcel(Parcel parcel) {
            return new C0744a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0744a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C0744a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0744a[] newArray(int i7) {
            return new C0744a[i7];
        }
    }

    /* synthetic */ C0744a(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f2924c + "}";
    }

    @Override // p146T.AbstractC1446a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        int size = this.f2924c.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i8 = 0; i8 < size; i8++) {
            strArr[i8] = (String) this.f2924c.m10300f(i8);
            bundleArr[i8] = (Bundle) this.f2924c.m10301k(i8);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C0744a(Parcelable parcelable) {
        super(parcelable);
        this.f2924c = new C2400k();
    }

    private C0744a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i7 = parcel.readInt();
        String[] strArr = new String[i7];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i7];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f2924c = new C2400k(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            this.f2924c.put(strArr[i8], bundleArr[i8]);
        }
    }
}
