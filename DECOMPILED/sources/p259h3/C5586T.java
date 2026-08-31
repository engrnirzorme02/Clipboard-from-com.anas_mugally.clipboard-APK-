package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhp;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.T */
/* JADX INFO: loaded from: classes.dex */
public final class C5586T extends AbstractC1945a {
    public static final Parcelable.Creator<C5586T> CREATOR = new C5587U();

    /* JADX INFO: renamed from: e */
    static final zzhp f21462e = zzhp.zzg(1);

    /* JADX INFO: renamed from: f */
    static final zzhp f21463f = zzhp.zzg(2);

    /* JADX INFO: renamed from: r */
    static final zzhp f21464r = zzhp.zzg(3);

    /* JADX INFO: renamed from: s */
    static final zzhp f21465s = zzhp.zzg(4);

    /* JADX INFO: renamed from: a */
    private final zzgx f21466a;

    /* JADX INFO: renamed from: b */
    private final zzgx f21467b;

    /* JADX INFO: renamed from: c */
    private final zzgx f21468c;

    /* JADX INFO: renamed from: d */
    private final int f21469d;

    C5586T(zzgx zzgxVar, zzgx zzgxVar2, zzgx zzgxVar3, int i7) {
        this.f21466a = zzgxVar;
        this.f21467b = zzgxVar2;
        this.f21468c = zzgxVar3;
        this.f21469d = i7;
    }

    /* JADX INFO: renamed from: T */
    public final byte[] m25005T() {
        zzgx zzgxVar = this.f21466a;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    /* JADX INFO: renamed from: U */
    public final byte[] m25006U() {
        zzgx zzgxVar = this.f21468c;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    /* JADX INFO: renamed from: V */
    public final byte[] m25007V() {
        zzgx zzgxVar = this.f21467b;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5586T)) {
            return false;
        }
        C5586T c5586t = (C5586T) obj;
        return AbstractC3714q.m18053b(this.f21466a, c5586t.f21466a) && AbstractC3714q.m18053b(this.f21467b, c5586t.f21467b) && AbstractC3714q.m18053b(this.f21468c, c5586t.f21468c) && this.f21469d == c5586t.f21469d;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(this.f21466a, this.f21467b, this.f21468c, Integer.valueOf(this.f21469d));
    }

    public final String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + AbstractC3748c.m18157e(m25005T()) + ", saltEnc=" + AbstractC3748c.m18157e(m25007V()) + ", saltAuth=" + AbstractC3748c.m18157e(m25006U()) + ", getPinUvAuthProtocol=" + this.f21469d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8063k(parcel, 1, m25005T(), false);
        AbstractC1947c.m8063k(parcel, 2, m25007V(), false);
        AbstractC1947c.m8063k(parcel, 3, m25006U(), false);
        AbstractC1947c.m8072t(parcel, 4, this.f21469d);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
