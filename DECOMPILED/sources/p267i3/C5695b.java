package p267i3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.util.AbstractC3748c;
import java.util.Arrays;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: i3.b */
/* JADX INFO: loaded from: classes.dex */
public class C5695b extends AbstractC1945a {
    public static final Parcelable.Creator<C5695b> CREATOR = new C5701h();

    /* JADX INFO: renamed from: a */
    private final int f21747a;

    /* JADX INFO: renamed from: b */
    private final byte[] f21748b;

    /* JADX INFO: renamed from: c */
    private final EnumC5696c f21749c;

    /* JADX INFO: renamed from: d */
    private final List f21750d;

    C5695b(int i7, byte[] bArr, String str, List list) {
        this.f21747a = i7;
        this.f21748b = bArr;
        try {
            this.f21749c = EnumC5696c.m25259c(str);
            this.f21750d = list;
        } catch (EnumC5696c.a e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* JADX INFO: renamed from: T */
    public byte[] m25255T() {
        return this.f21748b;
    }

    /* JADX INFO: renamed from: U */
    public EnumC5696c m25256U() {
        return this.f21749c;
    }

    /* JADX INFO: renamed from: V */
    public List m25257V() {
        return this.f21750d;
    }

    /* JADX INFO: renamed from: W */
    public int m25258W() {
        return this.f21747a;
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5695b)) {
            return false;
        }
        C5695b c5695b = (C5695b) obj;
        if (!Arrays.equals(this.f21748b, c5695b.f21748b) || !this.f21749c.equals(c5695b.f21749c)) {
            return false;
        }
        List list2 = this.f21750d;
        if (list2 == null && c5695b.f21750d == null) {
            return true;
        }
        return list2 != null && (list = c5695b.f21750d) != null && list2.containsAll(list) && c5695b.f21750d.containsAll(this.f21750d);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(Arrays.hashCode(this.f21748b)), this.f21749c, this.f21750d);
    }

    public String toString() {
        List list = this.f21750d;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", AbstractC3748c.m18155c(this.f21748b), this.f21749c, list == null ? "null" : list.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, m25258W());
        AbstractC1947c.m8063k(parcel, 2, m25255T(), false);
        AbstractC1947c.m8044E(parcel, 3, this.f21749c.toString(), false);
        AbstractC1947c.m8048I(parcel, 4, m25257V(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
