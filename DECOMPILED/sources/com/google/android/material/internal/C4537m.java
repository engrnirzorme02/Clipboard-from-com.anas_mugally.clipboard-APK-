package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: com.google.android.material.internal.m */
/* JADX INFO: loaded from: classes2.dex */
public class C4537m extends SparseArray implements Parcelable {
    public static final Parcelable.Creator<C4537m> CREATOR = new a();

    /* JADX INFO: renamed from: com.google.android.material.internal.m$a */
    class a implements Parcelable.ClassLoaderCreator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4537m createFromParcel(Parcel parcel) {
            return new C4537m(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4537m createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C4537m(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C4537m[] newArray(int i7) {
            return new C4537m[i7];
        }
    }

    public C4537m() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr[i8] = keyAt(i8);
            parcelableArr[i8] = (Parcelable) valueAt(i8);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i7);
    }

    public C4537m(Parcel parcel, ClassLoader classLoader) {
        int i7 = parcel.readInt();
        int[] iArr = new int[i7];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i8 = 0; i8 < i7; i8++) {
            put(iArr[i8], parcelableArray[i8]);
        }
    }
}
