package p267i3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: i3.d */
/* JADX INFO: loaded from: classes.dex */
public class C5697d extends AbstractC1945a {
    public static final Parcelable.Creator<C5697d> CREATOR = new C5703j();

    /* JADX INFO: renamed from: a */
    private final int f21756a;

    /* JADX INFO: renamed from: b */
    private final EnumC5696c f21757b;

    /* JADX INFO: renamed from: c */
    private final byte[] f21758c;

    /* JADX INFO: renamed from: d */
    private final String f21759d;

    C5697d(int i7, String str, byte[] bArr, String str2) {
        this.f21756a = i7;
        try {
            this.f21757b = EnumC5696c.m25259c(str);
            this.f21758c = bArr;
            this.f21759d = str2;
        } catch (EnumC5696c.a e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* JADX INFO: renamed from: T */
    public String m25260T() {
        return this.f21759d;
    }

    /* JADX INFO: renamed from: U */
    public byte[] m25261U() {
        return this.f21758c;
    }

    /* JADX INFO: renamed from: V */
    public int m25262V() {
        return this.f21756a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5697d)) {
            return false;
        }
        C5697d c5697d = (C5697d) obj;
        if (!Arrays.equals(this.f21758c, c5697d.f21758c) || this.f21757b != c5697d.f21757b) {
            return false;
        }
        String str = this.f21759d;
        if (str == null) {
            if (c5697d.f21759d != null) {
                return false;
            }
        } else if (!str.equals(c5697d.f21759d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.f21758c) + 31) * 31) + this.f21757b.hashCode();
        String str = this.f21759d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, m25262V());
        AbstractC1947c.m8044E(parcel, 2, this.f21757b.toString(), false);
        AbstractC1947c.m8063k(parcel, 3, m25261U(), false);
        AbstractC1947c.m8044E(parcel, 4, m25260T(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
