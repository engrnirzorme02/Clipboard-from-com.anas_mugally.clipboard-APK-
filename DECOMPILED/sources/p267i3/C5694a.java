package p267i3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: i3.a */
/* JADX INFO: loaded from: classes.dex */
public class C5694a extends AbstractC1945a {
    public static final Parcelable.Creator<C5694a> CREATOR = new C5700g();

    /* JADX INFO: renamed from: d */
    public static final C5694a f21736d = new C5694a();

    /* JADX INFO: renamed from: e */
    public static final C5694a f21737e = new C5694a("unavailable");

    /* JADX INFO: renamed from: f */
    public static final C5694a f21738f = new C5694a("unused");

    /* JADX INFO: renamed from: a */
    private final a f21739a;

    /* JADX INFO: renamed from: b */
    private final String f21740b;

    /* JADX INFO: renamed from: c */
    private final String f21741c;

    /* JADX INFO: renamed from: i3.a$a */
    public enum a implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator<a> CREATOR = new C5699f();

        /* JADX INFO: renamed from: a */
        private final int f21746a;

        a(int i7) {
            this.f21746a = i7;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f21746a);
        }
    }

    /* JADX INFO: renamed from: i3.a$b */
    public static class b extends Exception {
        public b(int i7) {
            super(String.format("ChannelIdValueType %s not supported", Integer.valueOf(i7)));
        }
    }

    private C5694a() {
        this.f21739a = a.ABSENT;
        this.f21741c = null;
        this.f21740b = null;
    }

    /* JADX INFO: renamed from: W */
    public static a m25250W(int i7) throws b {
        for (a aVar : a.values()) {
            if (i7 == aVar.f21746a) {
                return aVar;
            }
        }
        throw new b(i7);
    }

    /* JADX INFO: renamed from: T */
    public String m25251T() {
        return this.f21741c;
    }

    /* JADX INFO: renamed from: U */
    public String m25252U() {
        return this.f21740b;
    }

    /* JADX INFO: renamed from: V */
    public int m25253V() {
        return this.f21739a.f21746a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5694a)) {
            return false;
        }
        C5694a c5694a = (C5694a) obj;
        if (!this.f21739a.equals(c5694a.f21739a)) {
            return false;
        }
        int iOrdinal = this.f21739a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.f21740b.equals(c5694a.f21740b);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.f21741c.equals(c5694a.f21741c);
    }

    public int hashCode() {
        int i7;
        int iHashCode;
        int iHashCode2 = this.f21739a.hashCode() + 31;
        int iOrdinal = this.f21739a.ordinal();
        if (iOrdinal == 1) {
            i7 = iHashCode2 * 31;
            iHashCode = this.f21740b.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i7 = iHashCode2 * 31;
            iHashCode = this.f21741c.hashCode();
        }
        return i7 + iHashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 2, m25253V());
        AbstractC1947c.m8044E(parcel, 3, m25252U(), false);
        AbstractC1947c.m8044E(parcel, 4, m25251T(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    C5694a(int i7, String str, String str2) {
        try {
            this.f21739a = m25250W(i7);
            this.f21740b = str;
            this.f21741c = str2;
        } catch (b e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    private C5694a(String str) {
        this.f21740b = (String) AbstractC3718s.m18083l(str);
        this.f21739a = a.STRING;
        this.f21741c = null;
    }
}
