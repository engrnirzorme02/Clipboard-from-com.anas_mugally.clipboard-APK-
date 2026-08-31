package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5636v0 extends AbstractC1945a {
    public static final Parcelable.Creator<C5636v0> CREATOR = new C5638w0();

    /* JADX INFO: renamed from: a */
    private final boolean f21599a;

    /* JADX INFO: renamed from: b */
    private final zzgx f21600b;

    public C5636v0(boolean z7, zzgx zzgxVar) {
        this.f21599a = z7;
        this.f21600b = zzgxVar;
    }

    /* JADX INFO: renamed from: T */
    public final JSONObject m25102T() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f21599a) {
                jSONObject.put("enabled", true);
            }
            byte[] bArrM25103U = m25103U();
            if (bArrM25103U != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrM25103U, 32), 11));
                if (bArrM25103U.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrM25103U, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e7);
        }
    }

    /* JADX INFO: renamed from: U */
    public final byte[] m25103U() {
        zzgx zzgxVar = this.f21600b;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5636v0)) {
            return false;
        }
        C5636v0 c5636v0 = (C5636v0) obj;
        return this.f21599a == c5636v0.f21599a && AbstractC3714q.m18053b(this.f21600b, c5636v0.f21600b);
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(Boolean.valueOf(this.f21599a), this.f21600b);
    }

    public final String toString() {
        return "AuthenticationExtensionsPrfOutputs{" + m25102T().toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z7 = this.f21599a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 1, z7);
        AbstractC1947c.m8063k(parcel, 2, m25103U(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
