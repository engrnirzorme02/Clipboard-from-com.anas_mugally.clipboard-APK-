package p142S2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: S2.a */
/* JADX INFO: loaded from: classes.dex */
public class C1390a extends AbstractC1945a {
    public static final Parcelable.Creator<C1390a> CREATOR = new C1393d();

    /* JADX INFO: renamed from: a */
    final int f4893a;

    /* JADX INFO: renamed from: b */
    private int f4894b;

    /* JADX INFO: renamed from: c */
    private Bundle f4895c;

    C1390a(int i7, int i8, Bundle bundle) {
        this.f4893a = i7;
        this.f4894b = i8;
        this.f4895c = bundle;
    }

    /* JADX INFO: renamed from: T */
    public int m5966T() {
        return this.f4894b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f4893a);
        AbstractC1947c.m8072t(parcel, 2, m5966T());
        AbstractC1947c.m8062j(parcel, 3, this.f4895c, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
