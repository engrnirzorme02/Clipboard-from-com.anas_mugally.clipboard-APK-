package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgj;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzhm;
import com.google.android.gms.internal.fido.zzho;
import com.google.android.gms.internal.fido.zzhp;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.h */
/* JADX INFO: loaded from: classes.dex */
public class C5607h extends AbstractC5611j {
    public static final Parcelable.Creator<C5607h> CREATOR = new C5642y0();

    /* JADX INFO: renamed from: a */
    private final zzgx f21517a;

    /* JADX INFO: renamed from: b */
    private final zzgx f21518b;

    /* JADX INFO: renamed from: c */
    private final zzgx f21519c;

    /* JADX INFO: renamed from: d */
    private final String[] f21520d;

    C5607h(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        byte[] bArr4 = (byte[]) AbstractC3718s.m18083l(bArr);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzgxVarZzl = zzgx.zzl(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) AbstractC3718s.m18083l(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) AbstractC3718s.m18083l(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr6, 0, bArr6.length);
        this.f21517a = (zzgx) AbstractC3718s.m18083l(zzgxVarZzl);
        this.f21518b = (zzgx) AbstractC3718s.m18083l(zzgxVarZzl2);
        this.f21519c = (zzgx) AbstractC3718s.m18083l(zzgxVarZzl3);
        this.f21520d = (String[]) AbstractC3718s.m18083l(strArr);
    }

    /* JADX INFO: renamed from: T */
    public byte[] m25041T() {
        return this.f21519c.zzm();
    }

    /* JADX INFO: renamed from: U */
    public byte[] m25042U() {
        return this.f21518b.zzm();
    }

    /* JADX INFO: renamed from: V */
    public byte[] m25043V() {
        return this.f21517a.zzm();
    }

    /* JADX INFO: renamed from: W */
    public String[] m25044W() {
        return this.f21520d;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0110  */
    /* JADX WARN: Code duplicated, block: B:41:0x0125 A[Catch: JSONException -> 0x0019, zzho -> 0x018e, TRY_LEAVE, TryCatch #1 {zzho -> 0x018e, blocks: (B:33:0x00f4, B:39:0x0113, B:41:0x0125, B:46:0x0139, B:49:0x015b, B:51:0x0171, B:53:0x0177, B:56:0x0191, B:57:0x0196, B:58:0x0197, B:59:0x019c, B:64:0x01a7, B:66:0x01b7, B:68:0x01c5, B:69:0x01d8, B:70:0x01dd, B:71:0x01de, B:72:0x01e3, B:77:0x0202, B:78:0x0207), top: B:108:0x00f4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x019d  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x0202 A[Catch: JSONException -> 0x0019, zzho -> 0x018e, TRY_ENTER, TryCatch #1 {zzho -> 0x018e, blocks: (B:33:0x00f4, B:39:0x0113, B:41:0x0125, B:46:0x0139, B:49:0x015b, B:51:0x0171, B:53:0x0177, B:56:0x0191, B:57:0x0196, B:58:0x0197, B:59:0x019c, B:64:0x01a7, B:66:0x01b7, B:68:0x01c5, B:69:0x01d8, B:70:0x01dd, B:71:0x01de, B:72:0x01e3, B:77:0x0202, B:78:0x0207), top: B:108:0x00f4, outer: #3 }] */
    /* JADX INFO: renamed from: X */
    public final JSONObject m25045X() {
        zzhp zzhpVar;
        byte[] bArrZza;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f21518b != null) {
                jSONObject.put("clientDataJSON", AbstractC3748c.m18157e(m25042U()));
            }
            if (this.f21519c != null) {
                jSONObject.put("attestationObject", AbstractC3748c.m18157e(m25041T()));
            }
            JSONArray jSONArray = new JSONArray();
            int i7 = 0;
            while (true) {
                String[] strArr = this.f21520d;
                if (i7 >= strArr.length) {
                    break;
                }
                if (strArr[i7].equals(Transport.HYBRID.toString())) {
                    jSONArray.put(i7, "hybrid");
                } else {
                    jSONArray.put(i7, this.f21520d[i7]);
                }
                i7++;
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    zzhp zzhpVar2 = (zzhp) zzhp.zzj(m25041T()).zzh().zzc().get(zzhp.zzi("authData"));
                    if (zzhpVar2 == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    zzgx zzgxVarZzc = zzhpVar2.zze().zzc();
                    ByteBuffer byteBufferZzi = zzgxVarZzc.zzi();
                    try {
                        byteBufferZzi.position(byteBufferZzi.position() + 32);
                        if ((byteBufferZzi.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        byteBufferZzi.position(byteBufferZzi.position() + 4);
                        byteBufferZzi.position(byteBufferZzi.position() + 16);
                        byteBufferZzi.position(byteBufferZzi.position() + byteBufferZzi.getShort());
                        try {
                            zzhm zzhmVarZzh = zzhp.zzk(zzgxVarZzc.zzg(byteBufferZzi.position(), zzgxVarZzc.zzd()).zzh()).zzh();
                            zzhp zzhpVar3 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(3L));
                            zzhp zzhpVar4 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(1L));
                            if (zzhpVar3 == null || zzhpVar4 == null) {
                                throw new IllegalArgumentException("COSE key missing required fields");
                            }
                            try {
                                long jZzc = zzhpVar3.zzf().zzc();
                                long jZzc2 = zzhpVar4.zzf().zzc();
                                if (jZzc2 == 1) {
                                    zzhpVar = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-1L));
                                    if (zzhpVar != null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    long jZzc3 = zzhpVar.zzf().zzc();
                                    if (jZzc2 != 2 && jZzc3 == 1) {
                                        zzhp zzhpVar5 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-2L));
                                        zzhp zzhpVar6 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-3L));
                                        if (zzhpVar5 == null || zzhpVar6 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        zzgx zzgxVarZzc2 = zzhpVar5.zze().zzc();
                                        zzgx zzgxVarZzc3 = zzhpVar6.zze().zzc();
                                        if (zzgxVarZzc2.zzd() != 32 || zzgxVarZzc3.zzd() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        bArrZza = zzgj.zza(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), zzgxVarZzc2.zzm(), zzgxVarZzc3.zzm());
                                    } else if (jZzc2 == 1 || jZzc3 != 6) {
                                        bArrZza = null;
                                    } else {
                                        zzhp zzhpVar7 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-2L));
                                        if (zzhpVar7 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        zzgx zzgxVarZzc4 = zzhpVar7.zze().zzc();
                                        if (zzgxVarZzc4.zzd() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        bArrZza = zzgj.zza(Base64.decode("MCowBQYDK2VwAyEA", 0), zzgxVarZzc4.zzm());
                                    }
                                } else if (jZzc2 == 2) {
                                    jZzc2 = 2;
                                    zzhpVar = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-1L));
                                    if (zzhpVar != null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    long jZzc4 = zzhpVar.zzf().zzc();
                                    if (jZzc2 != 2) {
                                        if (jZzc2 == 1) {
                                            bArrZza = null;
                                        } else {
                                            bArrZza = null;
                                        }
                                    } else if (jZzc2 == 1) {
                                        bArrZza = null;
                                    } else {
                                        bArrZza = null;
                                    }
                                } else {
                                    bArrZza = null;
                                }
                                jSONObject.put("authenticatorData", AbstractC3748c.m18157e(zzgxVarZzc.zzm()));
                                jSONObject.put("publicKeyAlgorithm", jZzc);
                                if (bArrZza != null) {
                                    jSONObject.put("publicKey", AbstractC3748c.m18157e(bArrZza));
                                }
                                return jSONObject;
                            } catch (zzho e7) {
                                throw new IllegalArgumentException("COSE key ill-formed", e7);
                            }
                        } catch (zzhj e8) {
                            e = e8;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        } catch (zzho e9) {
                            e = e9;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e10) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e10);
                    }
                } catch (zzho e11) {
                    throw new IllegalArgumentException("authData value has wrong type", e11);
                }
            } catch (zzhj e12) {
                e = e12;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (zzho e13) {
                e = e13;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e14) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e14);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5607h)) {
            return false;
        }
        C5607h c5607h = (C5607h) obj;
        return AbstractC3714q.m18053b(this.f21517a, c5607h.f21517a) && AbstractC3714q.m18053b(this.f21518b, c5607h.f21518b) && AbstractC3714q.m18053b(this.f21519c, c5607h.f21519c);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(AbstractC3714q.m18054c(this.f21517a)), Integer.valueOf(AbstractC3714q.m18054c(this.f21518b)), Integer.valueOf(AbstractC3714q.m18054c(this.f21519c)));
    }

    public String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] bArrM25043V = m25043V();
        zzbiVarZza.zzb("keyHandle", zzgfVarZzf.zzg(bArrM25043V, 0, bArrM25043V.length));
        zzgf zzgfVarZzf2 = zzgf.zzf();
        byte[] bArrM25042U = m25042U();
        zzbiVarZza.zzb("clientDataJSON", zzgfVarZzf2.zzg(bArrM25042U, 0, bArrM25042U.length));
        zzgf zzgfVarZzf3 = zzgf.zzf();
        byte[] bArrM25041T = m25041T();
        zzbiVarZza.zzb("attestationObject", zzgfVarZzf3.zzg(bArrM25041T, 0, bArrM25041T.length));
        zzbiVarZza.zzb("transports", Arrays.toString(this.f21520d));
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8063k(parcel, 2, m25043V(), false);
        AbstractC1947c.m8063k(parcel, 3, m25042U(), false);
        AbstractC1947c.m8063k(parcel, 4, m25041T(), false);
        AbstractC1947c.m8045F(parcel, 5, m25044W(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
