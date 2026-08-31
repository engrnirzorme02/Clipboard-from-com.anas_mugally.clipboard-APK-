package p259h3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.l */
/* JADX INFO: loaded from: classes.dex */
public class C5615l extends AbstractC5619n {
    public static final Parcelable.Creator<C5615l> CREATOR = new C5558B0();

    /* JADX INFO: renamed from: a */
    private final C5633u f21528a;

    /* JADX INFO: renamed from: b */
    private final Uri f21529b;

    /* JADX INFO: renamed from: c */
    private final byte[] f21530c;

    C5615l(C5633u c5633u, Uri uri, byte[] bArr) {
        this.f21528a = (C5633u) AbstractC3718s.m18083l(c5633u);
        m25053W(uri);
        this.f21529b = uri;
        m25054X(bArr);
        this.f21530c = bArr;
    }

    /* JADX INFO: renamed from: W */
    private static Uri m25053W(Uri uri) {
        AbstractC3718s.m18083l(uri);
        AbstractC3718s.m18073b(uri.getScheme() != null, "origin scheme must be non-empty");
        AbstractC3718s.m18073b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    /* JADX INFO: renamed from: X */
    private static byte[] m25054X(byte[] bArr) {
        boolean z7 = true;
        if (bArr != null && bArr.length != 32) {
            z7 = false;
        }
        AbstractC3718s.m18073b(z7, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    /* JADX INFO: renamed from: T */
    public byte[] m25055T() {
        return this.f21530c;
    }

    /* JADX INFO: renamed from: U */
    public Uri m25056U() {
        return this.f21529b;
    }

    /* JADX INFO: renamed from: V */
    public C5633u m25057V() {
        return this.f21528a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5615l)) {
            return false;
        }
        C5615l c5615l = (C5615l) obj;
        return AbstractC3714q.m18053b(this.f21528a, c5615l.f21528a) && AbstractC3714q.m18053b(this.f21529b, c5615l.f21529b);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21528a, this.f21529b);
    }

    public final String toString() {
        byte[] bArr = this.f21530c;
        Uri uri = this.f21529b;
        return "BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=" + String.valueOf(this.f21528a) + ", \n origin=" + String.valueOf(uri) + ", \n clientDataHash=" + AbstractC3748c.m18157e(bArr) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 2, m25057V(), i7, false);
        AbstractC1947c.m8042C(parcel, 3, m25056U(), i7, false);
        AbstractC1947c.m8063k(parcel, 4, m25055T(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
