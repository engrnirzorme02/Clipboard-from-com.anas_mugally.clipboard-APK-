package p267i3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: i3.c */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5696c implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");

    public static final Parcelable.Creator<EnumC5696c> CREATOR = new Parcelable.Creator() { // from class: i3.i
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC5696c.m25259c(parcel.readString());
            } catch (EnumC5696c.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC5696c[i7];
        }
    };

    /* JADX INFO: renamed from: a */
    private final String f21755a;

    /* JADX INFO: renamed from: i3.c$a */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Protocol version %s not supported", str));
        }
    }

    EnumC5696c(String str) {
        this.f21755a = str;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC5696c m25259c(String str) throws a {
        if (str == null) {
            return UNKNOWN;
        }
        for (EnumC5696c enumC5696c : values()) {
            if (str.equals(enumC5696c.f21755a)) {
                return enumC5696c;
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
        return this.f21755a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f21755a);
    }
}
