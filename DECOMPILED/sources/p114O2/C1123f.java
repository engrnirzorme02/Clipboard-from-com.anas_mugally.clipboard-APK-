package p114O2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: O2.f */
/* JADX INFO: loaded from: classes.dex */
public class C1123f extends AbstractC1945a {
    public static final Parcelable.Creator<C1123f> CREATOR = new C1138u();

    /* JADX INFO: renamed from: a */
    private final int f4038a;

    C1123f(int i7) {
        this.f4038a = i7;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1123f) {
            return AbstractC3714q.m18053b(Integer.valueOf(this.f4038a), Integer.valueOf(((C1123f) obj).f4038a));
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(this.f4038a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f4038a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
