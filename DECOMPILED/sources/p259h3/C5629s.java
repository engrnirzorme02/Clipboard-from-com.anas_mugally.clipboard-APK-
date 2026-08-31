package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.s */
/* JADX INFO: loaded from: classes.dex */
public class C5629s extends AbstractC1945a {
    public static final Parcelable.Creator<C5629s> CREATOR = new C5583P();

    /* JADX INFO: renamed from: a */
    private final boolean f21559a;

    public C5629s(boolean z7) {
        this.f21559a = z7;
    }

    /* JADX INFO: renamed from: T */
    public boolean m25068T() {
        return this.f21559a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5629s) && this.f21559a == ((C5629s) obj).m25068T();
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Boolean.valueOf(this.f21559a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 1, m25068T());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
