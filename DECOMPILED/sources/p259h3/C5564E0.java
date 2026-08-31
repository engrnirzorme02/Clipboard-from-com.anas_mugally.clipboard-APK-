package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.fido.zzgx;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5564E0 extends AbstractC1945a {
    public static final Parcelable.Creator<C5564E0> CREATOR = new C5566F0();

    /* JADX INFO: renamed from: a */
    private final long f21443a;

    /* JADX INFO: renamed from: b */
    private final zzgx f21444b;

    /* JADX INFO: renamed from: c */
    private final zzgx f21445c;

    /* JADX INFO: renamed from: d */
    private final zzgx f21446d;

    C5564E0(long j7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = (byte[]) AbstractC3718s.m18083l(bArr);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzgxVarZzl = zzgx.zzl(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) AbstractC3718s.m18083l(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) AbstractC3718s.m18083l(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr6, 0, bArr6.length);
        this.f21443a = j7;
        this.f21444b = (zzgx) AbstractC3718s.m18083l(zzgxVarZzl);
        this.f21445c = (zzgx) AbstractC3718s.m18083l(zzgxVarZzl2);
        this.f21446d = (zzgx) AbstractC3718s.m18083l(zzgxVarZzl3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5564E0)) {
            return false;
        }
        C5564E0 c5564e0 = (C5564E0) obj;
        return this.f21443a == c5564e0.f21443a && AbstractC3714q.m18053b(this.f21444b, c5564e0.f21444b) && AbstractC3714q.m18053b(this.f21445c, c5564e0.f21445c) && AbstractC3714q.m18053b(this.f21446d, c5564e0.f21446d);
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(Long.valueOf(this.f21443a), this.f21444b, this.f21445c, this.f21446d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        long j7 = this.f21443a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8076x(parcel, 1, j7);
        AbstractC1947c.m8063k(parcel, 2, this.f21444b.zzm(), false);
        AbstractC1947c.m8063k(parcel, 3, this.f21445c.zzm(), false);
        AbstractC1947c.m8063k(parcel, 4, this.f21446d.zzm(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
