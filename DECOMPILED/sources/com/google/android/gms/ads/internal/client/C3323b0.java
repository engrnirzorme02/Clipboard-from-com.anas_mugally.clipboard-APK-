package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3323b0 extends AbstractC1945a {
    public static final Parcelable.Creator<C3323b0> CREATOR = new C3242A0();

    /* JADX INFO: renamed from: a */
    public final String f13916a;

    /* JADX INFO: renamed from: b */
    public final String f13917b;

    public C3323b0(String str, String str2) {
        this.f13916a = str;
        this.f13917b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f13916a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractC1947c.m8044E(parcel, 2, this.f13917b, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
