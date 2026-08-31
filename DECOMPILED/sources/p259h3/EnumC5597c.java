package p259h3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: h3.c */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5597c implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<EnumC5597c> CREATOR = new Parcelable.Creator() { // from class: h3.k0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC5597c.m25014c(parcel.readString());
            } catch (EnumC5597c.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC5597c[i7];
        }
    };

    /* JADX INFO: renamed from: a */
    private final String f21480a;

    /* JADX INFO: renamed from: h3.c$a */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attestation conveyance preference %s not supported", str));
        }
    }

    EnumC5597c(String str) {
        this.f21480a = str;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC5597c m25014c(String str) throws a {
        for (EnumC5597c enumC5597c : values()) {
            if (str.equals(enumC5597c.f21480a)) {
                return enumC5597c;
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
        return this.f21480a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f21480a);
    }
}
