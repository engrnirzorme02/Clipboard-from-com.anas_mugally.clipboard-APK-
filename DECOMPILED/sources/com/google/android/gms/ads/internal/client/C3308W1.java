package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.W1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3308W1 extends AbstractC1945a {
    public static final Parcelable.Creator<C3308W1> CREATOR = new C3311X1();

    /* JADX INFO: renamed from: a */
    public final String f13907a;

    C3308W1(String str) {
        this.f13907a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f13907a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 15, str, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
