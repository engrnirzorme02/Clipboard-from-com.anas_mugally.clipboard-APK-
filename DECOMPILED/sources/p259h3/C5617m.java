package p259h3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.m */
/* JADX INFO: loaded from: classes.dex */
public class C5617m extends AbstractC5619n {
    public static final Parcelable.Creator<C5617m> CREATOR = new C5560C0();

    /* JADX INFO: renamed from: a */
    private final C5639x f21531a;

    /* JADX INFO: renamed from: b */
    private final Uri f21532b;

    /* JADX INFO: renamed from: c */
    private final byte[] f21533c;

    C5617m(C5639x c5639x, Uri uri, byte[] bArr) {
        this.f21531a = (C5639x) AbstractC3718s.m18083l(c5639x);
        m25058W(uri);
        this.f21532b = uri;
        m25059X(bArr);
        this.f21533c = bArr;
    }

    /* JADX INFO: renamed from: W */
    private static Uri m25058W(Uri uri) {
        AbstractC3718s.m18083l(uri);
        AbstractC3718s.m18073b(uri.getScheme() != null, "origin scheme must be non-empty");
        AbstractC3718s.m18073b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    /* JADX INFO: renamed from: X */
    private static byte[] m25059X(byte[] bArr) {
        boolean z7 = true;
        if (bArr != null && bArr.length != 32) {
            z7 = false;
        }
        AbstractC3718s.m18073b(z7, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    /* JADX INFO: renamed from: T */
    public byte[] m25060T() {
        return this.f21533c;
    }

    /* JADX INFO: renamed from: U */
    public Uri m25061U() {
        return this.f21532b;
    }

    /* JADX INFO: renamed from: V */
    public C5639x m25062V() {
        return this.f21531a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5617m)) {
            return false;
        }
        C5617m c5617m = (C5617m) obj;
        return AbstractC3714q.m18053b(this.f21531a, c5617m.f21531a) && AbstractC3714q.m18053b(this.f21532b, c5617m.f21532b);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21531a, this.f21532b);
    }

    public final String toString() {
        byte[] bArr = this.f21533c;
        Uri uri = this.f21532b;
        return "BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=" + String.valueOf(this.f21531a) + ", \n origin=" + String.valueOf(uri) + ", \n clientDataHash=" + AbstractC3748c.m18157e(bArr) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 2, m25062V(), i7, false);
        AbstractC1947c.m8042C(parcel, 3, m25061U(), i7, false);
        AbstractC1947c.m8063k(parcel, 4, m25060T(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
