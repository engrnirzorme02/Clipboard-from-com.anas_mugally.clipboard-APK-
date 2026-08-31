package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.g */
/* JADX INFO: loaded from: classes.dex */
public class C5605g extends AbstractC5611j {
    public static final Parcelable.Creator<C5605g> CREATOR = new C5640x0();

    /* JADX INFO: renamed from: a */
    private final zzgx f21511a;

    /* JADX INFO: renamed from: b */
    private final zzgx f21512b;

    /* JADX INFO: renamed from: c */
    private final zzgx f21513c;

    /* JADX INFO: renamed from: d */
    private final zzgx f21514d;

    /* JADX INFO: renamed from: e */
    private final zzgx f21515e;

    C5605g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = (byte[]) AbstractC3718s.m18083l(bArr);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzgxVarZzl = zzgx.zzl(bArr6, 0, bArr6.length);
        byte[] bArr7 = (byte[]) AbstractC3718s.m18083l(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr7, 0, bArr7.length);
        byte[] bArr8 = (byte[]) AbstractC3718s.m18083l(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr8, 0, bArr8.length);
        byte[] bArr9 = (byte[]) AbstractC3718s.m18083l(bArr4);
        zzgx zzgxVarZzl4 = zzgx.zzl(bArr9, 0, bArr9.length);
        zzgx zzgxVarZzl5 = bArr5 == null ? null : zzgx.zzl(bArr5, 0, bArr5.length);
        this.f21511a = (zzgx) AbstractC3718s.m18083l(zzgxVarZzl);
        this.f21512b = (zzgx) AbstractC3718s.m18083l(zzgxVarZzl2);
        this.f21513c = (zzgx) AbstractC3718s.m18083l(zzgxVarZzl3);
        this.f21514d = (zzgx) AbstractC3718s.m18083l(zzgxVarZzl4);
        this.f21515e = zzgxVarZzl5;
    }

    /* JADX INFO: renamed from: T */
    public byte[] m25035T() {
        return this.f21513c.zzm();
    }

    /* JADX INFO: renamed from: U */
    public byte[] m25036U() {
        return this.f21512b.zzm();
    }

    /* JADX INFO: renamed from: V */
    public byte[] m25037V() {
        return this.f21511a.zzm();
    }

    /* JADX INFO: renamed from: W */
    public byte[] m25038W() {
        return this.f21514d.zzm();
    }

    /* JADX INFO: renamed from: X */
    public byte[] m25039X() {
        zzgx zzgxVar = this.f21515e;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    /* JADX INFO: renamed from: Y */
    public final JSONObject m25040Y() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", AbstractC3748c.m18157e(m25036U()));
            jSONObject.put("authenticatorData", AbstractC3748c.m18157e(m25035T()));
            jSONObject.put("signature", AbstractC3748c.m18157e(m25038W()));
            if (this.f21515e == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", AbstractC3748c.m18157e(m25039X()));
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e7);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5605g)) {
            return false;
        }
        C5605g c5605g = (C5605g) obj;
        return AbstractC3714q.m18053b(this.f21511a, c5605g.f21511a) && AbstractC3714q.m18053b(this.f21512b, c5605g.f21512b) && AbstractC3714q.m18053b(this.f21513c, c5605g.f21513c) && AbstractC3714q.m18053b(this.f21514d, c5605g.f21514d) && AbstractC3714q.m18053b(this.f21515e, c5605g.f21515e);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(AbstractC3714q.m18054c(this.f21511a)), Integer.valueOf(AbstractC3714q.m18054c(this.f21512b)), Integer.valueOf(AbstractC3714q.m18054c(this.f21513c)), Integer.valueOf(AbstractC3714q.m18054c(this.f21514d)), Integer.valueOf(AbstractC3714q.m18054c(this.f21515e)));
    }

    public String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] bArrM25037V = m25037V();
        zzbiVarZza.zzb("keyHandle", zzgfVarZzf.zzg(bArrM25037V, 0, bArrM25037V.length));
        zzgf zzgfVarZzf2 = zzgf.zzf();
        byte[] bArrM25036U = m25036U();
        zzbiVarZza.zzb("clientDataJSON", zzgfVarZzf2.zzg(bArrM25036U, 0, bArrM25036U.length));
        zzgf zzgfVarZzf3 = zzgf.zzf();
        byte[] bArrM25035T = m25035T();
        zzbiVarZza.zzb("authenticatorData", zzgfVarZzf3.zzg(bArrM25035T, 0, bArrM25035T.length));
        zzgf zzgfVarZzf4 = zzgf.zzf();
        byte[] bArrM25038W = m25038W();
        zzbiVarZza.zzb("signature", zzgfVarZzf4.zzg(bArrM25038W, 0, bArrM25038W.length));
        byte[] bArrM25039X = m25039X();
        if (bArrM25039X != null) {
            zzbiVarZza.zzb("userHandle", zzgf.zzf().zzg(bArrM25039X, 0, bArrM25039X.length));
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8063k(parcel, 2, m25037V(), false);
        AbstractC1947c.m8063k(parcel, 3, m25036U(), false);
        AbstractC1947c.m8063k(parcel, 4, m25035T(), false);
        AbstractC1947c.m8063k(parcel, 5, m25038W(), false);
        AbstractC1947c.m8063k(parcel, 6, m25039X(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
