package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractC1945a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C3654x();

    /* JADX INFO: renamed from: a */
    final int f14510a;

    /* JADX INFO: renamed from: b */
    private final String f14511b;

    Scope(int i7, String str) {
        AbstractC3718s.m18078g(str, "scopeUri must not be null or empty");
        this.f14510a = i7;
        this.f14511b = str;
    }

    /* JADX INFO: renamed from: T */
    public String m17742T() {
        return this.f14511b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f14511b.equals(((Scope) obj).f14511b);
        }
        return false;
    }

    public int hashCode() {
        return this.f14511b.hashCode();
    }

    public String toString() {
        return this.f14511b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14510a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8044E(parcel, 2, m17742T(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
