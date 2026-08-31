package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.f */
/* JADX INFO: loaded from: classes.dex */
public class C5603f extends AbstractC1945a {
    public static final Parcelable.Creator<C5603f> CREATOR = new C5630s0();

    /* JADX INFO: renamed from: a */
    private final boolean f21510a;

    public C5603f(boolean z7) {
        this.f21510a = z7;
    }

    /* JADX INFO: renamed from: T */
    public boolean m25033T() {
        return this.f21510a;
    }

    /* JADX INFO: renamed from: U */
    public final JSONObject m25034U() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rk", this.f21510a);
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e7);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5603f) && this.f21510a == ((C5603f) obj).f21510a;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Boolean.valueOf(this.f21510a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 1, m25033T());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
