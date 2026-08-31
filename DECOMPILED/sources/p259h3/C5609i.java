package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.i */
/* JADX INFO: loaded from: classes.dex */
public class C5609i extends AbstractC5611j {
    public static final Parcelable.Creator<C5609i> CREATOR = new C5644z0();

    /* JADX INFO: renamed from: a */
    private final EnumC5625q f21521a;

    /* JADX INFO: renamed from: b */
    private final String f21522b;

    /* JADX INFO: renamed from: c */
    private final int f21523c;

    C5609i(int i7, String str, int i8) {
        try {
            this.f21521a = EnumC5625q.m25065d(i7);
            this.f21522b = str;
            this.f21523c = i8;
        } catch (EnumC5625q.a e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* JADX INFO: renamed from: T */
    public int m25046T() {
        return this.f21521a.m25066c();
    }

    /* JADX INFO: renamed from: U */
    public String m25047U() {
        return this.f21522b;
    }

    /* JADX INFO: renamed from: V */
    public final JSONObject m25048V() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", this.f21521a.m25066c());
            String str = this.f21522b;
            if (str == null) {
                return jSONObject;
            }
            jSONObject.put("message", str);
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e7);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5609i)) {
            return false;
        }
        C5609i c5609i = (C5609i) obj;
        return AbstractC3714q.m18053b(this.f21521a, c5609i.f21521a) && AbstractC3714q.m18053b(this.f21522b, c5609i.f21522b) && AbstractC3714q.m18053b(Integer.valueOf(this.f21523c), Integer.valueOf(c5609i.f21523c));
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21521a, this.f21522b, Integer.valueOf(this.f21523c));
    }

    public String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzbiVarZza.zza("errorCode", this.f21521a.m25066c());
        String str = this.f21522b;
        if (str != null) {
            zzbiVarZza.zzb("errorMessage", str);
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 2, m25046T());
        AbstractC1947c.m8044E(parcel, 3, m25047U(), false);
        AbstractC1947c.m8072t(parcel, 4, this.f21523c);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
