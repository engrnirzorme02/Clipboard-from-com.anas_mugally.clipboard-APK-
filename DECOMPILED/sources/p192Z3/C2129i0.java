package p192Z3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.firebase.auth.InterfaceC4852f;
import java.util.Map;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: Z3.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2129i0 implements InterfaceC4852f {
    public static final Parcelable.Creator<C2129i0> CREATOR = new C2127h0();

    /* JADX INFO: renamed from: a */
    private final String f6960a;

    /* JADX INFO: renamed from: b */
    private final String f6961b;

    /* JADX INFO: renamed from: c */
    private Map f6962c;

    /* JADX INFO: renamed from: d */
    private boolean f6963d;

    public C2129i0(boolean z7) {
        this.f6963d = z7;
        this.f6961b = null;
        this.f6960a = null;
        this.f6962c = null;
    }

    /* JADX INFO: renamed from: a */
    public final String m8729a() {
        return this.f6960a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8730b() {
        return this.f6963d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, m8729a(), false);
        AbstractC1947c.m8044E(parcel, 2, this.f6961b, false);
        AbstractC1947c.m8059g(parcel, 3, m8730b());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public C2129i0(String str, String str2, boolean z7) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        this.f6960a = str;
        this.f6961b = str2;
        this.f6962c = AbstractC2148z.m8753d(str2);
        this.f6963d = z7;
    }
}
