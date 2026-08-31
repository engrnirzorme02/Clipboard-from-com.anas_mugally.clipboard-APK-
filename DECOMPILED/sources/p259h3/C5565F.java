package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.F */
/* JADX INFO: loaded from: classes.dex */
public class C5565F extends AbstractC1945a {
    public static final Parcelable.Creator<C5565F> CREATOR = new C5616l0();

    /* JADX INFO: renamed from: a */
    private final boolean f21447a;

    public C5565F(boolean z7) {
        this.f21447a = z7;
    }

    /* JADX INFO: renamed from: T */
    public boolean m24998T() {
        return this.f21447a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5565F) && this.f21447a == ((C5565F) obj).f21447a;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Boolean.valueOf(this.f21447a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 1, m24998T());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
