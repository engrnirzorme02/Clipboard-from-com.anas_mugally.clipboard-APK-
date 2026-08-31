package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.k */
/* JADX INFO: loaded from: classes.dex */
public class C5613k extends AbstractC1945a {
    public static final Parcelable.Creator<C5613k> CREATOR = new C5556A0();

    /* JADX INFO: renamed from: a */
    private final EnumC5595b f21524a;

    /* JADX INFO: renamed from: b */
    private final Boolean f21525b;

    /* JADX INFO: renamed from: c */
    private final EnumC5567G f21526c;

    /* JADX INFO: renamed from: d */
    private final EnumC5561D f21527d;

    C5613k(String str, Boolean bool, String str2, String str3) {
        EnumC5595b enumC5595bM25013c;
        EnumC5561D enumC5561DM24994c = null;
        if (str == null) {
            enumC5595bM25013c = null;
        } else {
            try {
                enumC5595bM25013c = EnumC5595b.m25013c(str);
            } catch (EnumC5561D.a | EnumC5595b.a | C5620n0 e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        this.f21524a = enumC5595bM25013c;
        this.f21525b = bool;
        this.f21526c = str2 == null ? null : EnumC5567G.m24999c(str2);
        if (str3 != null) {
            enumC5561DM24994c = EnumC5561D.m24994c(str3);
        }
        this.f21527d = enumC5561DM24994c;
    }

    /* JADX INFO: renamed from: T */
    public String m25049T() {
        EnumC5595b enumC5595b = this.f21524a;
        if (enumC5595b == null) {
            return null;
        }
        return enumC5595b.toString();
    }

    /* JADX INFO: renamed from: U */
    public Boolean m25050U() {
        return this.f21525b;
    }

    /* JADX INFO: renamed from: V */
    public EnumC5561D m25051V() {
        EnumC5561D enumC5561D = this.f21527d;
        if (enumC5561D != null) {
            return enumC5561D;
        }
        Boolean bool = this.f21525b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return EnumC5561D.RESIDENT_KEY_REQUIRED;
    }

    /* JADX INFO: renamed from: W */
    public String m25052W() {
        EnumC5561D enumC5561DM25051V = m25051V();
        if (enumC5561DM25051V == null) {
            return null;
        }
        return enumC5561DM25051V.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5613k)) {
            return false;
        }
        C5613k c5613k = (C5613k) obj;
        return AbstractC3714q.m18053b(this.f21524a, c5613k.f21524a) && AbstractC3714q.m18053b(this.f21525b, c5613k.f21525b) && AbstractC3714q.m18053b(this.f21526c, c5613k.f21526c) && AbstractC3714q.m18053b(m25051V(), c5613k.m25051V());
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21524a, this.f21525b, this.f21526c, m25051V());
    }

    public final String toString() {
        EnumC5561D enumC5561D = this.f21527d;
        EnumC5567G enumC5567G = this.f21526c;
        return "AuthenticatorSelectionCriteria{\n attachment=" + String.valueOf(this.f21524a) + ", \n requireResidentKey=" + this.f21525b + ", \n requireUserVerification=" + String.valueOf(enumC5567G) + ", \n residentKeyRequirement=" + String.valueOf(enumC5561D) + "\n }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, m25049T(), false);
        AbstractC1947c.m8061i(parcel, 3, m25050U(), false);
        EnumC5567G enumC5567G = this.f21526c;
        AbstractC1947c.m8044E(parcel, 4, enumC5567G == null ? null : enumC5567G.toString(), false);
        AbstractC1947c.m8044E(parcel, 5, m25052W(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
