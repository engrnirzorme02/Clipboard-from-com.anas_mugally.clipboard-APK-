package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.location.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C3974m extends AbstractC1945a implements InterfaceC3643m {
    public static final Parcelable.Creator<C3974m> CREATOR = new C3947L();

    /* JADX INFO: renamed from: a */
    private final Status f15040a;

    /* JADX INFO: renamed from: b */
    private final C3975n f15041b;

    public C3974m(Status status, C3975n c3975n) {
        this.f15040a = status;
        this.f15041b = c3975n;
    }

    /* JADX INFO: renamed from: T */
    public C3975n m18397T() {
        return this.f15041b;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3643m
    public Status getStatus() {
        return this.f15040a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, getStatus(), i7, false);
        AbstractC1947c.m8042C(parcel, 2, m18397T(), i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
