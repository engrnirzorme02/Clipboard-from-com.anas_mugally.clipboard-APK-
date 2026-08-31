package p259h3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: h3.z */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5643z implements Parcelable {
    PUBLIC_KEY("public-key");

    public static final Parcelable.Creator<EnumC5643z> CREATOR = new Parcelable.Creator() { // from class: h3.d0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC5643z.m25126c(parcel.readString());
            } catch (EnumC5643z.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC5643z[i7];
        }
    };

    /* JADX INFO: renamed from: a */
    private final String f21628a = "public-key";

    /* JADX INFO: renamed from: h3.z$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    EnumC5643z(String str) {
    }

    /* JADX INFO: renamed from: c */
    public static EnumC5643z m25126c(String str) throws a {
        for (EnumC5643z enumC5643z : values()) {
            if (str.equals(enumC5643z.f21628a)) {
                return enumC5643z;
            }
        }
        throw new a(String.format("PublicKeyCredentialType %s not supported", str));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f21628a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f21628a);
    }
}
