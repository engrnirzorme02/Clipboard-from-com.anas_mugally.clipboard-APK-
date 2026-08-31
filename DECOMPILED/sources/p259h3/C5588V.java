package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.internal.fido.zzfv;
import com.google.android.gms.internal.fido.zzfx;
import com.google.android.gms.internal.fido.zzgj;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.V */
/* JADX INFO: loaded from: classes.dex */
public final class C5588V extends AbstractC1945a {
    public static final Parcelable.Creator<C5588V> CREATOR = new C5589W();

    /* JADX INFO: renamed from: b */
    private static final byte[] f21470b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: a */
    private final byte[][] f21471a;

    public C5588V(byte[][] bArr) {
        AbstractC3718s.m18072a(bArr != null);
        AbstractC3718s.m18072a(1 == ((bArr.length & 1) ^ 1));
        int i7 = 0;
        while (i7 < bArr.length) {
            AbstractC3718s.m18072a(i7 == 0 || bArr[i7] != null);
            int i8 = i7 + 1;
            AbstractC3718s.m18072a(bArr[i8] != null);
            int length = bArr[i8].length;
            AbstractC3718s.m18072a(length == 32 || length == 64);
            i7 += 2;
        }
        this.f21471a = bArr;
    }

    /* JADX INFO: renamed from: T */
    public static C5588V m25008T(JSONObject jSONObject, boolean z7) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z7) {
                    arrayList.add(m25011W(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(m25012X(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(AbstractC3748c.m18154b(next));
                    if (z7) {
                        arrayList.add(m25011W(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(m25012X(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new C5588V((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    /* JADX INFO: renamed from: U */
    private static JSONObject m25009U(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", AbstractC3748c.m18157e(bArr));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    /* JADX INFO: renamed from: V */
    private static byte[] m25010V(byte[] bArr) {
        zzfv zzfvVarZza = zzfx.zza().zza();
        zzfvVarZza.zza(f21470b);
        zzfvVarZza.zza(bArr);
        return zzfvVarZza.zzc().zzd();
    }

    /* JADX INFO: renamed from: W */
    private static byte[] m25011W(JSONObject jSONObject) throws JSONException {
        byte[] bArrM18154b = AbstractC3748c.m18154b(jSONObject.getString("first"));
        if (bArrM18154b.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrM18154b;
        }
        byte[] bArrM18154b2 = AbstractC3748c.m18154b(jSONObject.getString("second"));
        if (bArrM18154b2.length == 32) {
            return zzgj.zza(bArrM18154b, bArrM18154b2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    /* JADX INFO: renamed from: X */
    private static byte[] m25012X(JSONObject jSONObject) {
        byte[] bArrM25010V = m25010V(AbstractC3748c.m18154b(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrM25010V : zzgj.zza(bArrM25010V, m25010V(AbstractC3748c.m18154b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5588V) {
            return Arrays.deepEquals(this.f21471a, ((C5588V) obj).f21471a);
        }
        return false;
    }

    public final int hashCode() {
        int iM18054c = 0;
        for (byte[] bArr : this.f21471a) {
            if (bArr != null) {
                iM18054c ^= AbstractC3714q.m18054c(bArr);
            }
        }
        return iM18054c;
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i7 = 0;
            JSONObject jSONObject2 = null;
            while (true) {
                byte[][] bArr = this.f21471a;
                if (i7 >= bArr.length) {
                    return "PrfExtension{" + jSONObject.toString() + "}";
                }
                if (bArr[i7] == null) {
                    jSONObject.put("eval", m25009U(bArr[i7 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(AbstractC3748c.m18157e(this.f21471a[i7]), m25009U(this.f21471a[i7 + 1]));
                }
                i7 += 2;
            }
        } catch (JSONException e7) {
            return "PrfExtension{Exception:" + e7.getMessage() + "}";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        byte[][] bArr = this.f21471a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8064l(parcel, 1, bArr, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
