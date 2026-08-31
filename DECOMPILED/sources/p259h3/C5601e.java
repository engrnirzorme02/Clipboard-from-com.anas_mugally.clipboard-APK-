package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.e */
/* JADX INFO: loaded from: classes.dex */
public class C5601e extends AbstractC1945a {
    public static final Parcelable.Creator<C5601e> CREATOR = new C5626q0();

    /* JADX INFO: renamed from: a */
    private final C5569H f21505a;

    /* JADX INFO: renamed from: b */
    private final C5632t0 f21506b;

    /* JADX INFO: renamed from: c */
    private final C5603f f21507c;

    /* JADX INFO: renamed from: d */
    private final C5636v0 f21508d;

    /* JADX INFO: renamed from: e */
    private final String f21509e;

    C5601e(C5569H c5569h, C5632t0 c5632t0, C5603f c5603f, C5636v0 c5636v0, String str) {
        this.f21505a = c5569h;
        this.f21506b = c5632t0;
        this.f21507c = c5603f;
        this.f21508d = c5636v0;
        this.f21509e = str;
    }

    /* JADX INFO: renamed from: T */
    public C5603f m25030T() {
        return this.f21507c;
    }

    /* JADX INFO: renamed from: U */
    public C5569H m25031U() {
        return this.f21505a;
    }

    /* JADX INFO: renamed from: V */
    public final JSONObject m25032V() {
        try {
            JSONObject jSONObject = new JSONObject();
            C5603f c5603f = this.f21507c;
            if (c5603f != null) {
                jSONObject.put("credProps", c5603f.m25034U());
            }
            C5569H c5569h = this.f21505a;
            if (c5569h != null) {
                jSONObject.put("uvm", c5569h.m25001U());
            }
            C5636v0 c5636v0 = this.f21508d;
            if (c5636v0 != null) {
                jSONObject.put("prf", c5636v0.m25102T());
            }
            String str = this.f21509e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e7);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5601e)) {
            return false;
        }
        C5601e c5601e = (C5601e) obj;
        return AbstractC3714q.m18053b(this.f21505a, c5601e.f21505a) && AbstractC3714q.m18053b(this.f21506b, c5601e.f21506b) && AbstractC3714q.m18053b(this.f21507c, c5601e.f21507c) && AbstractC3714q.m18053b(this.f21508d, c5601e.f21508d) && AbstractC3714q.m18053b(this.f21509e, c5601e.f21509e);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21505a, this.f21506b, this.f21507c, this.f21508d, this.f21509e);
    }

    public final String toString() {
        return "AuthenticationExtensionsClientOutputs{" + m25032V().toString() + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, m25031U(), i7, false);
        AbstractC1947c.m8042C(parcel, 2, this.f21506b, i7, false);
        AbstractC1947c.m8042C(parcel, 3, m25030T(), i7, false);
        AbstractC1947c.m8042C(parcel, 4, this.f21508d, i7, false);
        AbstractC1947c.m8044E(parcel, 5, this.f21509e, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
