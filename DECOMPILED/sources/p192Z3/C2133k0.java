package p192Z3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.firebase.auth.AbstractC4880u;
import com.google.firebase.auth.C4861j0;
import com.google.firebase.auth.InterfaceC4852f;
import java.util.List;
import p177X2.AbstractC1947c;
import p177X2.InterfaceC1948d;

/* JADX INFO: renamed from: Z3.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2133k0 implements InterfaceC1948d {
    public static final Parcelable.Creator<C2133k0> CREATOR = new C2131j0();

    /* JADX INFO: renamed from: a */
    private C2126h f6967a;

    /* JADX INFO: renamed from: b */
    private C2129i0 f6968b;

    /* JADX INFO: renamed from: c */
    private C4861j0 f6969c;

    public C2133k0(C2126h c2126h) {
        C2126h c2126h2 = (C2126h) AbstractC3718s.m18083l(c2126h);
        this.f6967a = c2126h2;
        List listM8727r0 = c2126h2.m8727r0();
        this.f6968b = null;
        for (int i7 = 0; i7 < listM8727r0.size(); i7++) {
            if (!TextUtils.isEmpty(((C2118d) listM8727r0.get(i7)).zza())) {
                this.f6968b = new C2129i0(((C2118d) listM8727r0.get(i7)).mo8702g(), ((C2118d) listM8727r0.get(i7)).zza(), c2126h.m8728s0());
            }
        }
        if (this.f6968b == null) {
            this.f6968b = new C2129i0(c2126h.m8728s0());
        }
        this.f6969c = c2126h.m8725p0();
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC4852f m8736a() {
        return this.f6968b;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC4880u m8737b() {
        return this.f6967a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, m8737b(), i7, false);
        AbstractC1947c.m8042C(parcel, 2, m8736a(), i7, false);
        AbstractC1947c.m8042C(parcel, 3, this.f6969c, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    C2133k0(C2126h c2126h, C2129i0 c2129i0, C4861j0 c4861j0) {
        this.f6967a = c2126h;
        this.f6968b = c2129i0;
        this.f6969c = c4861j0;
    }
}
