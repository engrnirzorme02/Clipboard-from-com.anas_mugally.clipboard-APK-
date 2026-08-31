package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.internal.fido.zzbl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.u */
/* JADX INFO: loaded from: classes.dex */
public class C5633u extends AbstractC5559C {
    public static final Parcelable.Creator<C5633u> CREATOR = new C5590X();

    /* JADX INFO: renamed from: a */
    private final C5641y f21571a;

    /* JADX INFO: renamed from: b */
    private final C5555A f21572b;

    /* JADX INFO: renamed from: c */
    private final byte[] f21573c;

    /* JADX INFO: renamed from: d */
    private final List f21574d;

    /* JADX INFO: renamed from: e */
    private final Double f21575e;

    /* JADX INFO: renamed from: f */
    private final List f21576f;

    /* JADX INFO: renamed from: r */
    private final C5613k f21577r;

    /* JADX INFO: renamed from: s */
    private final Integer f21578s;

    /* JADX INFO: renamed from: t */
    private final C5563E f21579t;

    /* JADX INFO: renamed from: u */
    private final EnumC5597c f21580u;

    /* JADX INFO: renamed from: v */
    private final C5599d f21581v;

    /* JADX INFO: renamed from: w */
    private final String f21582w;

    /* JADX INFO: renamed from: x */
    private ResultReceiver f21583x;

    /* JADX INFO: renamed from: h3.u$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private C5641y f21584a;

        /* JADX INFO: renamed from: b */
        private C5555A f21585b;

        /* JADX INFO: renamed from: c */
        private byte[] f21586c;

        /* JADX INFO: renamed from: d */
        private List f21587d;

        /* JADX INFO: renamed from: e */
        private Double f21588e;

        /* JADX INFO: renamed from: f */
        private List f21589f;

        /* JADX INFO: renamed from: g */
        private C5613k f21590g;

        /* JADX INFO: renamed from: h */
        private Integer f21591h;

        /* JADX INFO: renamed from: i */
        private C5563E f21592i;

        /* JADX INFO: renamed from: j */
        private EnumC5597c f21593j;

        /* JADX INFO: renamed from: k */
        private C5599d f21594k;

        /* JADX INFO: renamed from: a */
        public C5633u m25088a() {
            C5641y c5641y = this.f21584a;
            C5555A c5555a = this.f21585b;
            byte[] bArr = this.f21586c;
            List list = this.f21587d;
            Double d7 = this.f21588e;
            List list2 = this.f21589f;
            C5613k c5613k = this.f21590g;
            Integer num = this.f21591h;
            C5563E c5563e = this.f21592i;
            EnumC5597c enumC5597c = this.f21593j;
            return new C5633u(c5641y, c5555a, bArr, list, d7, list2, c5613k, num, c5563e, enumC5597c == null ? null : enumC5597c.toString(), this.f21594k, null, null);
        }

        /* JADX INFO: renamed from: b */
        public a m25089b(EnumC5597c enumC5597c) {
            this.f21593j = enumC5597c;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m25090c(C5599d c5599d) {
            this.f21594k = c5599d;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m25091d(C5613k c5613k) {
            this.f21590g = c5613k;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m25092e(byte[] bArr) {
            this.f21586c = (byte[]) AbstractC3718s.m18083l(bArr);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m25093f(List list) {
            this.f21589f = list;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m25094g(List list) {
            this.f21587d = (List) AbstractC3718s.m18083l(list);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m25095h(C5641y c5641y) {
            this.f21584a = (C5641y) AbstractC3718s.m18083l(c5641y);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m25096i(Double d7) {
            this.f21588e = d7;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a m25097j(C5555A c5555a) {
            this.f21585b = (C5555A) AbstractC3718s.m18083l(c5555a);
            return this;
        }
    }

    C5633u(C5641y c5641y, C5555A c5555a, byte[] bArr, List list, Double d7, List list2, C5613k c5613k, Integer num, C5563E c5563e, String str, C5599d c5599d, String str2, ResultReceiver resultReceiver) {
        this.f21583x = resultReceiver;
        if (str2 != null) {
            try {
                C5633u c5633uM25075f0 = m25075f0(new JSONObject(str2));
                this.f21571a = c5633uM25075f0.f21571a;
                this.f21572b = c5633uM25075f0.f21572b;
                this.f21573c = c5633uM25075f0.f21573c;
                this.f21574d = c5633uM25075f0.f21574d;
                this.f21575e = c5633uM25075f0.f21575e;
                this.f21576f = c5633uM25075f0.f21576f;
                this.f21577r = c5633uM25075f0.f21577r;
                this.f21578s = c5633uM25075f0.f21578s;
                this.f21579t = c5633uM25075f0.f21579t;
                this.f21580u = c5633uM25075f0.f21580u;
                this.f21581v = c5633uM25075f0.f21581v;
                this.f21582w = str2;
                return;
            } catch (JSONException e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        this.f21571a = (C5641y) AbstractC3718s.m18083l(c5641y);
        this.f21572b = (C5555A) AbstractC3718s.m18083l(c5555a);
        this.f21573c = (byte[]) AbstractC3718s.m18083l(bArr);
        this.f21574d = (List) AbstractC3718s.m18083l(list);
        this.f21575e = d7;
        this.f21576f = list2;
        this.f21577r = c5613k;
        this.f21578s = num;
        this.f21579t = c5563e;
        if (str != null) {
            try {
                this.f21580u = EnumC5597c.m25014c(str);
            } catch (EnumC5597c.a e8) {
                throw new IllegalArgumentException(e8);
            }
        } else {
            this.f21580u = null;
        }
        this.f21581v = c5599d;
        this.f21582w = null;
    }

    /* JADX INFO: renamed from: f0 */
    public static C5633u m25075f0(JSONObject jSONObject) throws JSONException {
        zzbl zzblVarZzc;
        a aVar = new a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        Parcelable.Creator<C5641y> creator = C5641y.CREATOR;
        aVar.m25095h(new C5641y(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null));
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        Parcelable.Creator<C5555A> creator2 = C5555A.CREATOR;
        aVar.m25097j(new C5555A(AbstractC3748c.m18154b(jSONObject3.getString("id")), jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName")));
        aVar.m25092e(AbstractC3748c.m18154b(jSONObject.getString("challenge")));
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i7);
            try {
                zzblVarZzc = zzbl.zzd(new C5637w(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                zzblVarZzc = zzbl.zzc();
            }
            if (zzblVarZzc.zzb()) {
                arrayList.add(zzblVarZzc.zza());
            }
        }
        aVar.m25094g(arrayList);
        if (jSONObject.has("timeout")) {
            aVar.m25096i(Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d));
        }
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList2 = new ArrayList();
            for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                arrayList2.add(C5635v.m25098W(jSONArray2.getJSONObject(i8)));
            }
            aVar.m25093f(arrayList2);
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            Parcelable.Creator<C5613k> creator3 = C5613k.CREATOR;
            aVar.m25091d(new C5613k(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null));
        }
        if (jSONObject.has("extensions")) {
            aVar.m25090c(C5599d.m25015V(jSONObject.getJSONObject("extensions")));
        }
        if (jSONObject.has("attestation")) {
            try {
                aVar.m25089b(EnumC5597c.m25014c(jSONObject.getString("attestation")));
            } catch (EnumC5597c.a e7) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e7);
                aVar.m25089b(EnumC5597c.NONE);
            }
        }
        return aVar.m25088a();
    }

    /* JADX INFO: renamed from: T */
    public String m25076T() {
        EnumC5597c enumC5597c = this.f21580u;
        if (enumC5597c == null) {
            return null;
        }
        return enumC5597c.toString();
    }

    /* JADX INFO: renamed from: U */
    public C5599d m25077U() {
        return this.f21581v;
    }

    /* JADX INFO: renamed from: V */
    public C5613k m25078V() {
        return this.f21577r;
    }

    /* JADX INFO: renamed from: W */
    public byte[] m25079W() {
        return this.f21573c;
    }

    /* JADX INFO: renamed from: X */
    public List m25080X() {
        return this.f21576f;
    }

    /* JADX INFO: renamed from: Y */
    public String m25081Y() {
        return this.f21582w;
    }

    /* JADX INFO: renamed from: Z */
    public List m25082Z() {
        return this.f21574d;
    }

    /* JADX INFO: renamed from: a0 */
    public Integer m25083a0() {
        return this.f21578s;
    }

    /* JADX INFO: renamed from: b0 */
    public C5641y m25084b0() {
        return this.f21571a;
    }

    /* JADX INFO: renamed from: c0 */
    public Double m25085c0() {
        return this.f21575e;
    }

    /* JADX INFO: renamed from: d0 */
    public C5563E m25086d0() {
        return this.f21579t;
    }

    /* JADX INFO: renamed from: e0 */
    public C5555A m25087e0() {
        return this.f21572b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof C5633u)) {
            return false;
        }
        C5633u c5633u = (C5633u) obj;
        return AbstractC3714q.m18053b(this.f21571a, c5633u.f21571a) && AbstractC3714q.m18053b(this.f21572b, c5633u.f21572b) && Arrays.equals(this.f21573c, c5633u.f21573c) && AbstractC3714q.m18053b(this.f21575e, c5633u.f21575e) && this.f21574d.containsAll(c5633u.f21574d) && c5633u.f21574d.containsAll(this.f21574d) && (((list = this.f21576f) == null && c5633u.f21576f == null) || (list != null && (list2 = c5633u.f21576f) != null && list.containsAll(list2) && c5633u.f21576f.containsAll(this.f21576f))) && AbstractC3714q.m18053b(this.f21577r, c5633u.f21577r) && AbstractC3714q.m18053b(this.f21578s, c5633u.f21578s) && AbstractC3714q.m18053b(this.f21579t, c5633u.f21579t) && AbstractC3714q.m18053b(this.f21580u, c5633u.f21580u) && AbstractC3714q.m18053b(this.f21581v, c5633u.f21581v) && AbstractC3714q.m18053b(this.f21582w, c5633u.f21582w);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21571a, this.f21572b, Integer.valueOf(Arrays.hashCode(this.f21573c)), this.f21574d, this.f21575e, this.f21576f, this.f21577r, this.f21578s, this.f21579t, this.f21580u, this.f21581v, this.f21582w);
    }

    public final String toString() {
        C5599d c5599d = this.f21581v;
        EnumC5597c enumC5597c = this.f21580u;
        C5563E c5563e = this.f21579t;
        C5613k c5613k = this.f21577r;
        List list = this.f21576f;
        List list2 = this.f21574d;
        byte[] bArr = this.f21573c;
        C5555A c5555a = this.f21572b;
        return "PublicKeyCredentialCreationOptions{\n rp=" + String.valueOf(this.f21571a) + ", \n user=" + String.valueOf(c5555a) + ", \n challenge=" + AbstractC3748c.m18157e(bArr) + ", \n parameters=" + String.valueOf(list2) + ", \n timeoutSeconds=" + this.f21575e + ", \n excludeList=" + String.valueOf(list) + ", \n authenticatorSelection=" + String.valueOf(c5613k) + ", \n requestId=" + this.f21578s + ", \n tokenBinding=" + String.valueOf(c5563e) + ", \n attestationConveyancePreference=" + String.valueOf(enumC5597c) + ", \n authenticationExtensions=" + String.valueOf(c5599d) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 2, m25084b0(), i7, false);
        AbstractC1947c.m8042C(parcel, 3, m25087e0(), i7, false);
        AbstractC1947c.m8063k(parcel, 4, m25079W(), false);
        AbstractC1947c.m8048I(parcel, 5, m25082Z(), false);
        AbstractC1947c.m8067o(parcel, 6, m25085c0(), false);
        AbstractC1947c.m8048I(parcel, 7, m25080X(), false);
        AbstractC1947c.m8042C(parcel, 8, m25078V(), i7, false);
        AbstractC1947c.m8075w(parcel, 9, m25083a0(), false);
        AbstractC1947c.m8042C(parcel, 10, m25086d0(), i7, false);
        AbstractC1947c.m8044E(parcel, 11, m25076T(), false);
        AbstractC1947c.m8042C(parcel, 12, m25077U(), i7, false);
        AbstractC1947c.m8044E(parcel, 13, m25081Y(), false);
        AbstractC1947c.m8042C(parcel, 14, this.f21583x, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
