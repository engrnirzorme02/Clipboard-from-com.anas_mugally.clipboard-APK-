package p114O2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: O2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1118a extends AbstractC1945a {
    public static final Parcelable.Creator<C1118a> CREATOR = new C1133p();

    /* JADX INFO: renamed from: a */
    private final String f3985a;

    /* JADX INFO: renamed from: b */
    private final String f3986b;

    /* JADX INFO: renamed from: c */
    private final String f3987c;

    /* JADX INFO: renamed from: d */
    private final List f3988d;

    /* JADX INFO: renamed from: e */
    private final GoogleSignInAccount f3989e;

    /* JADX INFO: renamed from: f */
    private final PendingIntent f3990f;

    public C1118a(String str, String str2, String str3, List list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f3985a = str;
        this.f3986b = str2;
        this.f3987c = str3;
        this.f3988d = (List) AbstractC3718s.m18083l(list);
        this.f3990f = pendingIntent;
        this.f3989e = googleSignInAccount;
    }

    /* JADX INFO: renamed from: T */
    public String m4879T() {
        return this.f3986b;
    }

    /* JADX INFO: renamed from: U */
    public List m4880U() {
        return this.f3988d;
    }

    /* JADX INFO: renamed from: V */
    public PendingIntent m4881V() {
        return this.f3990f;
    }

    /* JADX INFO: renamed from: W */
    public String m4882W() {
        return this.f3985a;
    }

    /* JADX INFO: renamed from: X */
    public GoogleSignInAccount m4883X() {
        return this.f3989e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1118a)) {
            return false;
        }
        C1118a c1118a = (C1118a) obj;
        return AbstractC3714q.m18053b(this.f3985a, c1118a.f3985a) && AbstractC3714q.m18053b(this.f3986b, c1118a.f3986b) && AbstractC3714q.m18053b(this.f3987c, c1118a.f3987c) && AbstractC3714q.m18053b(this.f3988d, c1118a.f3988d) && AbstractC3714q.m18053b(this.f3990f, c1118a.f3990f) && AbstractC3714q.m18053b(this.f3989e, c1118a.f3989e);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f3985a, this.f3986b, this.f3987c, this.f3988d, this.f3990f, this.f3989e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, m4882W(), false);
        AbstractC1947c.m8044E(parcel, 2, m4879T(), false);
        AbstractC1947c.m8044E(parcel, 3, this.f3987c, false);
        AbstractC1947c.m8046G(parcel, 4, m4880U(), false);
        AbstractC1947c.m8042C(parcel, 5, m4883X(), i7, false);
        AbstractC1947c.m8042C(parcel, 6, m4881V(), i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
