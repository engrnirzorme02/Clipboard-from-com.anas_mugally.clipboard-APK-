package p307n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3675T;
import p170W2.C1837b;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: n3.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C6494l extends AbstractC1945a {
    public static final Parcelable.Creator<C6494l> CREATOR = new C6495m();

    /* JADX INFO: renamed from: a */
    final int f24555a;

    /* JADX INFO: renamed from: b */
    private final C1837b f24556b;

    /* JADX INFO: renamed from: c */
    private final C3675T f24557c;

    C6494l(int i7, C1837b c1837b, C3675T c3675t) {
        this.f24555a = i7;
        this.f24556b = c1837b;
        this.f24557c = c3675t;
    }

    /* JADX INFO: renamed from: T */
    public final C1837b m27653T() {
        return this.f24556b;
    }

    /* JADX INFO: renamed from: U */
    public final C3675T m27654U() {
        return this.f24557c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f24555a);
        AbstractC1947c.m8042C(parcel, 2, this.f24556b, i7, false);
        AbstractC1947c.m8042C(parcel, 3, this.f24557c, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
