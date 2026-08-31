package p340r2;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: r2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6883a extends AbstractC1945a {
    public static final Parcelable.Creator<C6883a> CREATOR = new C6892j();

    /* JADX INFO: renamed from: a */
    private final boolean f27639a;

    C6883a(boolean z7) {
        this.f27639a = z7;
    }

    /* JADX INFO: renamed from: T */
    public boolean m30089T() {
        return this.f27639a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 1, m30089T());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
