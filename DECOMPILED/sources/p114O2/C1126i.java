package p114O2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: O2.i */
/* JADX INFO: loaded from: classes.dex */
public class C1126i extends AbstractC1945a {
    public static final Parcelable.Creator<C1126i> CREATOR = new C1112A();

    /* JADX INFO: renamed from: a */
    private final PendingIntent f4053a;

    public C1126i(PendingIntent pendingIntent) {
        this.f4053a = pendingIntent;
    }

    /* JADX INFO: renamed from: T */
    public PendingIntent m4947T() {
        return this.f4053a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1126i) {
            return AbstractC3714q.m18053b(this.f4053a, ((C1126i) obj).f4053a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f4053a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, m4947T(), i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
