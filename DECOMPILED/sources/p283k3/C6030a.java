package p283k3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: k3.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6030a extends AbstractC1945a {
    public static final Parcelable.Creator<C6030a> CREATOR = new C6031b();

    /* JADX INFO: renamed from: a */
    public final Bundle f23808a;

    public C6030a(Bundle bundle) {
        this.f23808a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Bundle bundle = this.f23808a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8062j(parcel, 1, bundle, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
