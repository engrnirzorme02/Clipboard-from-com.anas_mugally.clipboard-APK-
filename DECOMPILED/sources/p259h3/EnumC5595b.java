package p259h3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: h3.b */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5595b implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<EnumC5595b> CREATOR = new Parcelable.Creator() { // from class: h3.J
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC5595b.m25013c(parcel.readString());
            } catch (EnumC5595b.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC5595b[i7];
        }
    };

    /* JADX INFO: renamed from: a */
    private final String f21475a;

    /* JADX INFO: renamed from: h3.b$a */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attachment %s not supported", str));
        }
    }

    EnumC5595b(String str) {
        this.f21475a = str;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC5595b m25013c(String str) throws a {
        for (EnumC5595b enumC5595b : values()) {
            if (str.equals(enumC5595b.f21475a)) {
                return enumC5595b;
            }
        }
        throw new a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f21475a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f21475a);
    }
}
