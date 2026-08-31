package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.internal.fido.zzia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.x */
/* JADX INFO: loaded from: classes.dex */
public class C5639x extends AbstractC5559C {
    public static final Parcelable.Creator<C5639x> CREATOR = new C5596b0();

    /* JADX INFO: renamed from: a */
    private final byte[] f21603a;

    /* JADX INFO: renamed from: b */
    private final Double f21604b;

    /* JADX INFO: renamed from: c */
    private final String f21605c;

    /* JADX INFO: renamed from: d */
    private final List f21606d;

    /* JADX INFO: renamed from: e */
    private final Integer f21607e;

    /* JADX INFO: renamed from: f */
    private final C5563E f21608f;

    /* JADX INFO: renamed from: r */
    private final EnumC5567G f21609r;

    /* JADX INFO: renamed from: s */
    private final C5599d f21610s;

    /* JADX INFO: renamed from: t */
    private final Long f21611t;

    /* JADX INFO: renamed from: u */
    private ResultReceiver f21612u;

    /* JADX INFO: renamed from: h3.x$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private byte[] f21613a;

        /* JADX INFO: renamed from: b */
        private Double f21614b;

        /* JADX INFO: renamed from: c */
        private String f21615c;

        /* JADX INFO: renamed from: d */
        private List f21616d;

        /* JADX INFO: renamed from: e */
        private Integer f21617e;

        /* JADX INFO: renamed from: f */
        private C5563E f21618f;

        /* JADX INFO: renamed from: g */
        private EnumC5567G f21619g;

        /* JADX INFO: renamed from: h */
        private C5599d f21620h;

        /* JADX INFO: renamed from: i */
        private Long f21621i;

        /* JADX INFO: renamed from: j */
        private ResultReceiver f21622j;

        /* JADX INFO: renamed from: a */
        public C5639x m25113a() {
            byte[] bArr = this.f21613a;
            Double d7 = this.f21614b;
            String str = this.f21615c;
            List list = this.f21616d;
            Integer num = this.f21617e;
            C5563E c5563e = this.f21618f;
            EnumC5567G enumC5567G = this.f21619g;
            return new C5639x(bArr, d7, str, list, num, c5563e, enumC5567G == null ? null : enumC5567G.toString(), this.f21620h, this.f21621i, null, this.f21622j);
        }

        /* JADX INFO: renamed from: b */
        public a m25114b(List list) {
            this.f21616d = list;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m25115c(C5599d c5599d) {
            this.f21620h = c5599d;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m25116d(byte[] bArr) {
            this.f21613a = (byte[]) AbstractC3718s.m18083l(bArr);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m25117e(Integer num) {
            this.f21617e = num;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m25118f(String str) {
            this.f21615c = (String) AbstractC3718s.m18083l(str);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m25119g(Double d7) {
            this.f21614b = d7;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m25120h(C5563E c5563e) {
            this.f21618f = c5563e;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public final a m25121i(Long l7) {
            this.f21621i = l7;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public final a m25122j(EnumC5567G enumC5567G) {
            this.f21619g = enumC5567G;
            return this;
        }
    }

    C5639x(byte[] bArr, Double d7, String str, List list, Integer num, C5563E c5563e, String str2, C5599d c5599d, Long l7, String str3, ResultReceiver resultReceiver) {
        this.f21612u = resultReceiver;
        if (str3 == null || !zzia.zzc()) {
            this.f21603a = (byte[]) AbstractC3718s.m18083l(bArr);
            this.f21604b = d7;
            this.f21605c = (String) AbstractC3718s.m18083l(str);
            this.f21606d = list;
            this.f21607e = num;
            this.f21608f = c5563e;
            this.f21611t = l7;
            if (str2 != null) {
                try {
                    this.f21609r = EnumC5567G.m24999c(str2);
                } catch (C5620n0 e7) {
                    throw new IllegalArgumentException(e7);
                }
            } else {
                this.f21609r = null;
            }
            this.f21610s = c5599d;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            a aVar = new a();
            aVar.m25116d(AbstractC3748c.m18154b(jSONObject.getString("challenge")));
            if (jSONObject.has("timeout")) {
                aVar.m25119g(Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d));
            } else if (jSONObject.has("timeoutSeconds")) {
                aVar.m25119g(Double.valueOf(jSONObject.getDouble("timeoutSeconds")));
            }
            aVar.m25118f(jSONObject.getString("rpId"));
            JSONArray jSONArray = jSONObject.has("allowList") ? jSONObject.getJSONArray("allowList") : jSONObject.has("allowCredentials") ? jSONObject.getJSONArray("allowCredentials") : null;
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    arrayList.add(C5635v.m25098W(jSONArray.getJSONObject(i7)));
                }
                aVar.m25114b(arrayList);
            }
            if (jSONObject.has("requestId")) {
                aVar.m25117e(Integer.valueOf(jSONObject.getInt("requestId")));
            }
            if (jSONObject.has("tokenBinding")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("tokenBinding");
                aVar.m25120h(new C5563E(jSONObject2.getString("status"), jSONObject2.has("id") ? jSONObject2.getString("id") : null));
            }
            if (jSONObject.has("userVerification")) {
                aVar.m25122j(EnumC5567G.m24999c(jSONObject.getString("userVerification")));
            }
            if (jSONObject.has("authenticationExtensions")) {
                aVar.m25115c(C5599d.m25015V(jSONObject.getJSONObject("authenticationExtensions")));
            } else if (jSONObject.has("extensions")) {
                aVar.m25115c(C5599d.m25015V(jSONObject.getJSONObject("extensions")));
            }
            if (jSONObject.has("longRequestId")) {
                aVar.m25121i(Long.valueOf(jSONObject.getLong("longRequestId")));
            }
            C5639x c5639xM25113a = aVar.m25113a();
            this.f21603a = c5639xM25113a.f21603a;
            this.f21604b = c5639xM25113a.f21604b;
            this.f21605c = c5639xM25113a.f21605c;
            this.f21606d = c5639xM25113a.f21606d;
            this.f21607e = c5639xM25113a.f21607e;
            this.f21608f = c5639xM25113a.f21608f;
            this.f21609r = c5639xM25113a.f21609r;
            this.f21610s = c5639xM25113a.f21610s;
            this.f21611t = c5639xM25113a.f21611t;
        } catch (C5620n0 e8) {
            e = e8;
            throw new IllegalArgumentException(e);
        } catch (JSONException e9) {
            e = e9;
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: T */
    public List m25106T() {
        return this.f21606d;
    }

    /* JADX INFO: renamed from: U */
    public C5599d m25107U() {
        return this.f21610s;
    }

    /* JADX INFO: renamed from: V */
    public byte[] m25108V() {
        return this.f21603a;
    }

    /* JADX INFO: renamed from: W */
    public Integer m25109W() {
        return this.f21607e;
    }

    /* JADX INFO: renamed from: X */
    public String m25110X() {
        return this.f21605c;
    }

    /* JADX INFO: renamed from: Y */
    public Double m25111Y() {
        return this.f21604b;
    }

    /* JADX INFO: renamed from: Z */
    public C5563E m25112Z() {
        return this.f21608f;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof C5639x)) {
            return false;
        }
        C5639x c5639x = (C5639x) obj;
        return Arrays.equals(this.f21603a, c5639x.f21603a) && AbstractC3714q.m18053b(this.f21604b, c5639x.f21604b) && AbstractC3714q.m18053b(this.f21605c, c5639x.f21605c) && (((list = this.f21606d) == null && c5639x.f21606d == null) || (list != null && (list2 = c5639x.f21606d) != null && list.containsAll(list2) && c5639x.f21606d.containsAll(this.f21606d))) && AbstractC3714q.m18053b(this.f21607e, c5639x.f21607e) && AbstractC3714q.m18053b(this.f21608f, c5639x.f21608f) && AbstractC3714q.m18053b(this.f21609r, c5639x.f21609r) && AbstractC3714q.m18053b(this.f21610s, c5639x.f21610s) && AbstractC3714q.m18053b(this.f21611t, c5639x.f21611t);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(Arrays.hashCode(this.f21603a)), this.f21604b, this.f21605c, this.f21606d, this.f21607e, this.f21608f, this.f21609r, this.f21610s, this.f21611t);
    }

    public final String toString() {
        C5599d c5599d = this.f21610s;
        EnumC5567G enumC5567G = this.f21609r;
        C5563E c5563e = this.f21608f;
        List list = this.f21606d;
        return "PublicKeyCredentialRequestOptions{\n challenge=" + AbstractC3748c.m18157e(this.f21603a) + ", \n timeoutSeconds=" + this.f21604b + ", \n rpId='" + this.f21605c + "', \n allowList=" + String.valueOf(list) + ", \n requestId=" + this.f21607e + ", \n tokenBinding=" + String.valueOf(c5563e) + ", \n userVerification=" + String.valueOf(enumC5567G) + ", \n authenticationExtensions=" + String.valueOf(c5599d) + ", \n longRequestId=" + this.f21611t + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8063k(parcel, 2, m25108V(), false);
        AbstractC1947c.m8067o(parcel, 3, m25111Y(), false);
        AbstractC1947c.m8044E(parcel, 4, m25110X(), false);
        AbstractC1947c.m8048I(parcel, 5, m25106T(), false);
        AbstractC1947c.m8075w(parcel, 6, m25109W(), false);
        AbstractC1947c.m8042C(parcel, 7, m25112Z(), i7, false);
        EnumC5567G enumC5567G = this.f21609r;
        AbstractC1947c.m8044E(parcel, 8, enumC5567G == null ? null : enumC5567G.toString(), false);
        AbstractC1947c.m8042C(parcel, 9, m25107U(), i7, false);
        AbstractC1947c.m8078z(parcel, 10, this.f21611t, false);
        AbstractC1947c.m8044E(parcel, 11, null, false);
        AbstractC1947c.m8042C(parcel, 12, this.f21612u, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
