package p259h3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: h3.G */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5567G implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<EnumC5567G> CREATOR = new Parcelable.Creator() { // from class: h3.m0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC5567G.m24999c(parcel.readString());
            } catch (C5620n0 e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC5567G[i7];
        }
    };

    /* JADX INFO: renamed from: a */
    private final String f21452a;

    EnumC5567G(String str) {
        this.f21452a = str;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC5567G m24999c(String str) throws C5620n0 {
        for (EnumC5567G enumC5567G : values()) {
            if (str.equals(enumC5567G.f21452a)) {
                return enumC5567G;
            }
        }
        throw new C5620n0(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f21452a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f21452a);
    }
}
