package p114O2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: O2.k */
/* JADX INFO: loaded from: classes.dex */
public class C1128k extends AbstractC1945a {
    public static final Parcelable.Creator<C1128k> CREATOR = new C1114C();

    /* JADX INFO: renamed from: a */
    private final PendingIntent f4060a;

    public C1128k(PendingIntent pendingIntent) {
        this.f4060a = (PendingIntent) AbstractC3718s.m18083l(pendingIntent);
    }

    /* JADX INFO: renamed from: T */
    public PendingIntent m4955T() {
        return this.f4060a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1128k) {
            return AbstractC3714q.m18053b(this.f4060a, ((C1128k) obj).f4060a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f4060a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, m4955T(), i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
