package p267i3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.AbstractC3718s;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: i3.e */
/* JADX INFO: loaded from: classes.dex */
public class C5698e extends AbstractC1945a {
    public static final Parcelable.Creator<C5698e> CREATOR = new C5704k();

    /* JADX INFO: renamed from: a */
    private final C5695b f21760a;

    /* JADX INFO: renamed from: b */
    private final String f21761b;

    /* JADX INFO: renamed from: c */
    String f21762c;

    public C5698e(C5695b c5695b, String str, String str2) {
        this.f21760a = (C5695b) AbstractC3718s.m18083l(c5695b);
        this.f21762c = str;
        this.f21761b = str2;
    }

    /* JADX INFO: renamed from: T */
    public String m25263T() {
        return this.f21761b;
    }

    /* JADX INFO: renamed from: U */
    public String m25264U() {
        return this.f21762c;
    }

    /* JADX INFO: renamed from: V */
    public C5695b m25265V() {
        return this.f21760a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5698e)) {
            return false;
        }
        C5698e c5698e = (C5698e) obj;
        String str = this.f21762c;
        if (str == null) {
            if (c5698e.f21762c != null) {
                return false;
            }
        } else if (!str.equals(c5698e.f21762c)) {
            return false;
        }
        if (!this.f21760a.equals(c5698e.f21760a)) {
            return false;
        }
        String str2 = this.f21761b;
        if (str2 == null) {
            if (c5698e.f21761b != null) {
                return false;
            }
        } else if (!str2.equals(c5698e.f21761b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f21762c;
        int iHashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.f21760a.hashCode();
        String str2 = this.f21761b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f21760a.m25255T(), 11));
            if (this.f21760a.m25256U() != EnumC5696c.UNKNOWN) {
                jSONObject.put("version", this.f21760a.m25256U().toString());
            }
            if (this.f21760a.m25257V() != null) {
                jSONObject.put("transports", this.f21760a.m25257V().toString());
            }
            String str = this.f21762c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f21761b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 2, m25265V(), i7, false);
        AbstractC1947c.m8044E(parcel, 3, m25264U(), false);
        AbstractC1947c.m8044E(parcel, 4, m25263T(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
