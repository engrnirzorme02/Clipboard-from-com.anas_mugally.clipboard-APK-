package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzh;
import java.util.List;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.v */
/* JADX INFO: loaded from: classes.dex */
public class C5635v extends AbstractC1945a {

    /* JADX INFO: renamed from: a */
    private final EnumC5643z f21596a;

    /* JADX INFO: renamed from: b */
    private final zzgx f21597b;

    /* JADX INFO: renamed from: c */
    private final List f21598c;

    /* JADX INFO: renamed from: d */
    private static final zzcf f21595d = zzcf.zzm(zzh.zza, zzh.zzb);
    public static final Parcelable.Creator<C5635v> CREATOR = new C5592Z();

    public C5635v(String str, zzgx zzgxVar, List list) {
        AbstractC3718s.m18083l(str);
        try {
            this.f21596a = EnumC5643z.m25126c(str);
            this.f21597b = (zzgx) AbstractC3718s.m18083l(zzgxVar);
            this.f21598c = list;
        } catch (EnumC5643z.a e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* JADX INFO: renamed from: W */
    public static C5635v m25098W(JSONObject jSONObject) {
        return new C5635v(jSONObject.getString("type"), Base64.decode(jSONObject.getString("id"), 11), jSONObject.has("transports") ? Transport.m18245d(jSONObject.getJSONArray("transports")) : null);
    }

    /* JADX INFO: renamed from: T */
    public byte[] m25099T() {
        return this.f21597b.zzm();
    }

    /* JADX INFO: renamed from: U */
    public List m25100U() {
        return this.f21598c;
    }

    /* JADX INFO: renamed from: V */
    public String m25101V() {
        return this.f21596a.toString();
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof C5635v)) {
            return false;
        }
        C5635v c5635v = (C5635v) obj;
        if (!this.f21596a.equals(c5635v.f21596a) || !AbstractC3714q.m18053b(this.f21597b, c5635v.f21597b)) {
            return false;
        }
        List list2 = this.f21598c;
        if (list2 == null && c5635v.f21598c == null) {
            return true;
        }
        return list2 != null && (list = c5635v.f21598c) != null && list2.containsAll(list) && c5635v.f21598c.containsAll(this.f21598c);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21596a, this.f21597b, this.f21598c);
    }

    public final String toString() {
        return "PublicKeyCredentialDescriptor{\n type=" + String.valueOf(this.f21596a) + ", \n id=" + AbstractC3748c.m18157e(m25099T()) + ", \n transports=" + String.valueOf(this.f21598c) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, m25101V(), false);
        AbstractC1947c.m8063k(parcel, 3, m25099T(), false);
        AbstractC1947c.m8048I(parcel, 4, m25100U(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5635v(String str, byte[] bArr, List list) {
        this(str, zzgx.zzl(bArr, 0, bArr.length), list);
        zzgx zzgxVar = zzgx.zzb;
    }
}
