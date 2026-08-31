package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.internal.fido.zzgx;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.A */
/* JADX INFO: loaded from: classes.dex */
public class C5555A extends AbstractC1945a {
    public static final Parcelable.Creator<C5555A> CREATOR = new C5602e0();

    /* JADX INFO: renamed from: a */
    private final zzgx f21415a;

    /* JADX INFO: renamed from: b */
    private final String f21416b;

    /* JADX INFO: renamed from: c */
    private final String f21417c;

    /* JADX INFO: renamed from: d */
    private final String f21418d;

    public C5555A(zzgx zzgxVar, String str, String str2, String str3) {
        this.f21415a = (zzgx) AbstractC3718s.m18083l(zzgxVar);
        this.f21416b = (String) AbstractC3718s.m18083l(str);
        this.f21417c = str2;
        this.f21418d = (String) AbstractC3718s.m18083l(str3);
    }

    /* JADX INFO: renamed from: T */
    public String m24989T() {
        return this.f21418d;
    }

    /* JADX INFO: renamed from: U */
    public String m24990U() {
        return this.f21417c;
    }

    /* JADX INFO: renamed from: V */
    public byte[] m24991V() {
        return this.f21415a.zzm();
    }

    /* JADX INFO: renamed from: W */
    public String m24992W() {
        return this.f21416b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5555A)) {
            return false;
        }
        C5555A c5555a = (C5555A) obj;
        return AbstractC3714q.m18053b(this.f21415a, c5555a.f21415a) && AbstractC3714q.m18053b(this.f21416b, c5555a.f21416b) && AbstractC3714q.m18053b(this.f21417c, c5555a.f21417c) && AbstractC3714q.m18053b(this.f21418d, c5555a.f21418d);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21415a, this.f21416b, this.f21417c, this.f21418d);
    }

    public final String toString() {
        return "PublicKeyCredentialUserEntity{\n id=" + AbstractC3748c.m18157e(this.f21415a.zzm()) + ", \n name='" + this.f21416b + "', \n icon='" + this.f21417c + "', \n displayName='" + this.f21418d + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8063k(parcel, 2, m24991V(), false);
        AbstractC1947c.m8044E(parcel, 3, m24992W(), false);
        AbstractC1947c.m8044E(parcel, 4, m24990U(), false);
        AbstractC1947c.m8044E(parcel, 5, m24989T(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5555A(byte[] bArr, String str, String str2, String str3) {
        byte[] bArr2 = (byte[]) AbstractC3718s.m18083l(bArr);
        zzgx zzgxVar = zzgx.zzb;
        this(zzgx.zzl(bArr2, 0, bArr2.length), str, str2, str3);
    }
}
