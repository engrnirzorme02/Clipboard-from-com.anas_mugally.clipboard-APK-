package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzia;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.t */
/* JADX INFO: loaded from: classes.dex */
public class C5631t extends AbstractC1945a {
    public static final Parcelable.Creator<C5631t> CREATOR = new C5591Y();

    /* JADX INFO: renamed from: a */
    private final String f21560a;

    /* JADX INFO: renamed from: b */
    private final String f21561b;

    /* JADX INFO: renamed from: c */
    private final zzgx f21562c;

    /* JADX INFO: renamed from: d */
    private final C5607h f21563d;

    /* JADX INFO: renamed from: e */
    private final C5605g f21564e;

    /* JADX INFO: renamed from: f */
    private final C5609i f21565f;

    /* JADX INFO: renamed from: r */
    private final C5601e f21566r;

    /* JADX INFO: renamed from: s */
    private final String f21567s;

    /* JADX INFO: renamed from: t */
    private String f21568t;

    private C5631t(String str, String str2, zzgx zzgxVar, C5607h c5607h, C5605g c5605g, C5609i c5609i, C5601e c5601e, String str3, String str4) {
        boolean z7 = false;
        AbstractC3718s.m18073b((c5607h != null && c5605g == null && c5609i == null) || (c5607h == null && c5605g != null && c5609i == null) || (c5607h == null && c5605g == null && c5609i != null), "Must provide a response object.");
        if (c5609i != null || (str != null && zzgxVar != null)) {
            z7 = true;
        }
        AbstractC3718s.m18073b(z7, "Must provide id and rawId if not an error response.");
        this.f21560a = str;
        this.f21561b = str2;
        this.f21562c = zzgxVar;
        this.f21563d = c5607h;
        this.f21564e = c5605g;
        this.f21565f = c5609i;
        this.f21566r = c5601e;
        this.f21567s = str3;
        this.f21568t = null;
    }

    /* JADX INFO: renamed from: T */
    public String m25069T() {
        return this.f21567s;
    }

    /* JADX INFO: renamed from: U */
    public C5601e m25070U() {
        return this.f21566r;
    }

    /* JADX INFO: renamed from: V */
    public String m25071V() {
        return this.f21560a;
    }

    /* JADX INFO: renamed from: W */
    public byte[] m25072W() {
        zzgx zzgxVar = this.f21562c;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    /* JADX INFO: renamed from: X */
    public String m25073X() {
        return this.f21561b;
    }

    /* JADX INFO: renamed from: Y */
    public final JSONObject m25074Y() {
        JSONObject jSONObjectM25048V;
        try {
            JSONObject jSONObject = new JSONObject();
            zzgx zzgxVar = this.f21562c;
            if (zzgxVar != null && zzgxVar.zzm().length > 0) {
                jSONObject.put("rawId", AbstractC3748c.m18157e(this.f21562c.zzm()));
            }
            String str = this.f21567s;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.f21561b;
            if (str2 != null && this.f21565f == null) {
                jSONObject.put("type", str2);
            }
            String str3 = this.f21560a;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = "response";
            C5605g c5605g = this.f21564e;
            boolean z7 = true;
            if (c5605g != null) {
                jSONObjectM25048V = c5605g.m25040Y();
            } else {
                C5607h c5607h = this.f21563d;
                if (c5607h != null) {
                    jSONObjectM25048V = c5607h.m25045X();
                } else {
                    C5609i c5609i = this.f21565f;
                    z7 = false;
                    if (c5609i != null) {
                        jSONObjectM25048V = c5609i.m25048V();
                        str4 = "error";
                    } else {
                        jSONObjectM25048V = null;
                    }
                }
            }
            if (jSONObjectM25048V != null) {
                jSONObject.put(str4, jSONObjectM25048V);
            }
            C5601e c5601e = this.f21566r;
            if (c5601e != null) {
                jSONObject.put("clientExtensionResults", c5601e.m25032V());
                return jSONObject;
            }
            if (z7) {
                jSONObject.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e7);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5631t)) {
            return false;
        }
        C5631t c5631t = (C5631t) obj;
        return AbstractC3714q.m18053b(this.f21560a, c5631t.f21560a) && AbstractC3714q.m18053b(this.f21561b, c5631t.f21561b) && AbstractC3714q.m18053b(this.f21562c, c5631t.f21562c) && AbstractC3714q.m18053b(this.f21563d, c5631t.f21563d) && AbstractC3714q.m18053b(this.f21564e, c5631t.f21564e) && AbstractC3714q.m18053b(this.f21565f, c5631t.f21565f) && AbstractC3714q.m18053b(this.f21566r, c5631t.f21566r) && AbstractC3714q.m18053b(this.f21567s, c5631t.f21567s);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21560a, this.f21561b, this.f21562c, this.f21564e, this.f21563d, this.f21565f, this.f21566r, this.f21567s);
    }

    public final String toString() {
        zzgx zzgxVar = this.f21562c;
        byte[] bArrZzm = zzgxVar == null ? null : zzgxVar.zzm();
        String str = this.f21561b;
        String str2 = this.f21560a;
        C5607h c5607h = this.f21563d;
        C5605g c5605g = this.f21564e;
        C5609i c5609i = this.f21565f;
        C5601e c5601e = this.f21566r;
        String str3 = this.f21567s;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + AbstractC3748c.m18157e(bArrZzm) + ", \n registerResponse=" + String.valueOf(c5607h) + ", \n signResponse=" + String.valueOf(c5605g) + ", \n errorResponse=" + String.valueOf(c5609i) + ", \n extensionsClientOutputs=" + String.valueOf(c5601e) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        if (zzia.zzc()) {
            this.f21568t = m25074Y().toString();
        }
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, m25071V(), false);
        AbstractC1947c.m8044E(parcel, 2, m25073X(), false);
        AbstractC1947c.m8063k(parcel, 3, m25072W(), false);
        AbstractC1947c.m8042C(parcel, 4, this.f21563d, i7, false);
        AbstractC1947c.m8042C(parcel, 5, this.f21564e, i7, false);
        AbstractC1947c.m8042C(parcel, 6, this.f21565f, i7, false);
        AbstractC1947c.m8042C(parcel, 7, m25070U(), i7, false);
        AbstractC1947c.m8044E(parcel, 8, m25069T(), false);
        AbstractC1947c.m8044E(parcel, 9, this.f21568t, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
        this.f21568t = null;
    }

    C5631t(String str, String str2, byte[] bArr, C5607h c5607h, C5605g c5605g, C5609i c5609i, C5601e c5601e, String str3, String str4) {
        this(str, str2, bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length), c5607h, c5605g, c5609i, c5601e, str3, str4);
    }
}
