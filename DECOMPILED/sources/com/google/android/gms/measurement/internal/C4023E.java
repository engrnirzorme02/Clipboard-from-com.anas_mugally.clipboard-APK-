package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.E */
/* JADX INFO: loaded from: classes2.dex */
public final class C4023E extends AbstractC1945a implements Iterable {
    public static final Parcelable.Creator<C4023E> CREATOR = new C4031F();

    /* JADX INFO: renamed from: a */
    private final Bundle f15166a;

    C4023E(Bundle bundle) {
        this.f15166a = bundle;
    }

    /* JADX INFO: renamed from: T */
    final Object m18479T(String str) {
        return this.f15166a.get(str);
    }

    /* JADX INFO: renamed from: U */
    final Long m18480U(String str) {
        return Long.valueOf(this.f15166a.getLong(str));
    }

    /* JADX INFO: renamed from: V */
    final Double m18481V(String str) {
        return Double.valueOf(this.f15166a.getDouble("value"));
    }

    /* JADX INFO: renamed from: W */
    final String m18482W(String str) {
        return this.f15166a.getString(str);
    }

    /* JADX INFO: renamed from: X */
    public final int m18483X() {
        return this.f15166a.size();
    }

    /* JADX INFO: renamed from: Y */
    public final Bundle m18484Y() {
        return new Bundle(this.f15166a);
    }

    /* JADX INFO: renamed from: Z */
    final /* synthetic */ Bundle m18485Z() {
        return this.f15166a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C4015D(this);
    }

    public final String toString() {
        return this.f15166a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8062j(parcel, 2, m18484Y(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
