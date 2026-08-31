package p259h3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: h3.D */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5561D implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<EnumC5561D> CREATOR = new Parcelable.Creator() { // from class: h3.f0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            try {
                return EnumC5561D.m24994c(string);
            } catch (EnumC5561D.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC5561D[i7];
        }
    };

    /* JADX INFO: renamed from: a */
    private final String f21433a;

    /* JADX INFO: renamed from: h3.D$a */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Resident key requirement %s not supported", str));
        }
    }

    EnumC5561D(String str) {
        this.f21433a = str;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC5561D m24994c(String str) throws a {
        for (EnumC5561D enumC5561D : values()) {
            if (str.equals(enumC5561D.f21433a)) {
                return enumC5561D;
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
        return this.f21433a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f21433a);
    }
}
