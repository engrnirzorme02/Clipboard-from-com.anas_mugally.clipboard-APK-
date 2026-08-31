package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.w */
/* JADX INFO: loaded from: classes.dex */
public class C5637w extends AbstractC1945a {
    public static final Parcelable.Creator<C5637w> CREATOR = new C5594a0();

    /* JADX INFO: renamed from: a */
    private final EnumC5643z f21601a;

    /* JADX INFO: renamed from: b */
    private final C5621o f21602b;

    public C5637w(String str, int i7) {
        AbstractC3718s.m18083l(str);
        try {
            this.f21601a = EnumC5643z.m25126c(str);
            AbstractC3718s.m18083l(Integer.valueOf(i7));
            try {
                this.f21602b = C5621o.m25063a(i7);
            } catch (C5621o.a e7) {
                throw new IllegalArgumentException(e7);
            }
        } catch (EnumC5643z.a e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    /* JADX INFO: renamed from: T */
    public int m25104T() {
        return this.f21602b.m25064b();
    }

    /* JADX INFO: renamed from: U */
    public String m25105U() {
        return this.f21601a.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5637w)) {
            return false;
        }
        C5637w c5637w = (C5637w) obj;
        return this.f21601a.equals(c5637w.f21601a) && this.f21602b.equals(c5637w.f21602b);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21601a, this.f21602b);
    }

    public final String toString() {
        C5621o c5621o = this.f21602b;
        return "PublicKeyCredentialParameters{\n type=" + String.valueOf(this.f21601a) + ", \n algorithm=" + String.valueOf(c5621o) + "\n }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, m25105U(), false);
        AbstractC1947c.m8075w(parcel, 3, Integer.valueOf(m25104T()), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
