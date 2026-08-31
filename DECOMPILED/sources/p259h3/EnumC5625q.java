package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: renamed from: h3.q */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5625q implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<EnumC5625q> CREATOR = new Parcelable.Creator() { // from class: h3.K0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC5625q.m25065d(parcel.readInt());
            } catch (EnumC5625q.a e7) {
                throw new IllegalArgumentException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC5625q[i7];
        }
    };

    /* JADX INFO: renamed from: a */
    private final int f21557a;

    /* JADX INFO: renamed from: h3.q$a */
    public static class a extends Exception {
        public a(int i7) {
            super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i7)));
        }
    }

    EnumC5625q(int i7) {
        this.f21557a = i7;
    }

    /* JADX INFO: renamed from: d */
    public static EnumC5625q m25065d(int i7) throws a {
        for (EnumC5625q enumC5625q : values()) {
            if (i7 == enumC5625q.f21557a) {
                return enumC5625q;
            }
        }
        throw new a(i7);
    }

    /* JADX INFO: renamed from: c */
    public int m25066c() {
        return this.f21557a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f21557a);
    }
}
