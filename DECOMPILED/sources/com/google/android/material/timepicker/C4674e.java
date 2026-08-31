package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.material.timepicker.e */
/* JADX INFO: loaded from: classes2.dex */
class C4674e implements Parcelable {
    public static final Parcelable.Creator<C4674e> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    private final C4671b f18197a;

    /* JADX INFO: renamed from: b */
    private final C4671b f18198b;

    /* JADX INFO: renamed from: c */
    final int f18199c;

    /* JADX INFO: renamed from: d */
    int f18200d;

    /* JADX INFO: renamed from: e */
    int f18201e;

    /* JADX INFO: renamed from: f */
    int f18202f;

    /* JADX INFO: renamed from: r */
    int f18203r;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.e$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4674e createFromParcel(Parcel parcel) {
            return new C4674e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4674e[] newArray(int i7) {
            return new C4674e[i7];
        }
    }

    public C4674e(int i7, int i8, int i9, int i10) {
        this.f18200d = i7;
        this.f18201e = i8;
        this.f18202f = i9;
        this.f18199c = i10;
        this.f18203r = m21795c(i7);
        this.f18197a = new C4671b(59);
        this.f18198b = new C4671b(i10 == 1 ? 23 : 12);
    }

    /* JADX INFO: renamed from: a */
    public static String m21793a(Resources resources, CharSequence charSequence) {
        return m21794b(resources, charSequence, "%02d");
    }

    /* JADX INFO: renamed from: b */
    public static String m21794b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m21795c(int i7) {
        return i7 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4674e)) {
            return false;
        }
        C4674e c4674e = (C4674e) obj;
        return this.f18200d == c4674e.f18200d && this.f18201e == c4674e.f18201e && this.f18199c == c4674e.f18199c && this.f18202f == c4674e.f18202f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18199c), Integer.valueOf(this.f18200d), Integer.valueOf(this.f18201e), Integer.valueOf(this.f18202f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f18200d);
        parcel.writeInt(this.f18201e);
        parcel.writeInt(this.f18202f);
        parcel.writeInt(this.f18199c);
    }

    protected C4674e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
