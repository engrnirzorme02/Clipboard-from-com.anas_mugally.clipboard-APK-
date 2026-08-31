package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.fido.zzbk;
import java.util.Arrays;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.E */
/* JADX INFO: loaded from: classes.dex */
public class C5563E extends AbstractC1945a {
    public static final Parcelable.Creator<C5563E> CREATOR = new C5612j0();

    /* JADX INFO: renamed from: c */
    public static final C5563E f21434c = new C5563E(a.SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: d */
    public static final C5563E f21435d = new C5563E(a.NOT_SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: a */
    private final a f21436a;

    /* JADX INFO: renamed from: b */
    private final String f21437b;

    /* JADX INFO: renamed from: h3.E$a */
    public enum a implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<a> CREATOR = new C5610i0();

        /* JADX INFO: renamed from: a */
        private final String f21442a;

        a(String str) {
            this.f21442a = str;
        }

        /* JADX INFO: renamed from: c */
        public static a m24997c(String str) throws b {
            for (a aVar : values()) {
                if (str.equals(aVar.f21442a)) {
                    return aVar;
                }
            }
            throw new b(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f21442a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f21442a);
        }
    }

    /* JADX INFO: renamed from: h3.E$b */
    public static class b extends Exception {
        public b(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    C5563E(String str, String str2) {
        AbstractC3718s.m18083l(str);
        try {
            this.f21436a = a.m24997c(str);
            this.f21437b = str2;
        } catch (b e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* JADX INFO: renamed from: T */
    public String m24995T() {
        return this.f21437b;
    }

    /* JADX INFO: renamed from: U */
    public String m24996U() {
        return this.f21436a.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5563E)) {
            return false;
        }
        C5563E c5563e = (C5563E) obj;
        return zzbk.zza(this.f21436a, c5563e.f21436a) && zzbk.zza(this.f21437b, c5563e.f21437b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21436a, this.f21437b});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, m24996U(), false);
        AbstractC1947c.m8044E(parcel, 3, m24995T(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
