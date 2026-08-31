package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.material.datepicker.k */
/* JADX INFO: loaded from: classes2.dex */
public class C4479k implements C4469a.c {
    public static final Parcelable.Creator<C4479k> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    private final long f16889a;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.k$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4479k createFromParcel(Parcel parcel) {
            return new C4479k(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4479k[] newArray(int i7) {
            return new C4479k[i7];
        }
    }

    /* synthetic */ C4479k(long j7, a aVar) {
        this(j7);
    }

    /* JADX INFO: renamed from: a */
    public static C4479k m20303a(long j7) {
        return new C4479k(j7);
    }

    @Override // com.google.android.material.datepicker.C4469a.c
    /* JADX INFO: renamed from: D */
    public boolean mo20258D(long j7) {
        return j7 >= this.f16889a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4479k) && this.f16889a == ((C4479k) obj).f16889a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f16889a)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f16889a);
    }

    private C4479k(long j7) {
        this.f16889a = j7;
    }
}
