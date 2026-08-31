package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p170W2.C1837b;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractC1945a implements InterfaceC3643m, ReflectedParcelable {

    /* JADX INFO: renamed from: a */
    private final int f14520a;

    /* JADX INFO: renamed from: b */
    private final String f14521b;

    /* JADX INFO: renamed from: c */
    private final PendingIntent f14522c;

    /* JADX INFO: renamed from: d */
    private final C1837b f14523d;

    /* JADX INFO: renamed from: e */
    public static final Status f14512e = new Status(-1);

    /* JADX INFO: renamed from: f */
    public static final Status f14513f = new Status(0);

    /* JADX INFO: renamed from: r */
    public static final Status f14514r = new Status(14);

    /* JADX INFO: renamed from: s */
    public static final Status f14515s = new Status(8);

    /* JADX INFO: renamed from: t */
    public static final Status f14516t = new Status(15);

    /* JADX INFO: renamed from: u */
    public static final Status f14517u = new Status(16);

    /* JADX INFO: renamed from: w */
    public static final Status f14519w = new Status(17);

    /* JADX INFO: renamed from: v */
    public static final Status f14518v = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new C3655y();

    Status(int i7, String str, PendingIntent pendingIntent, C1837b c1837b) {
        this.f14520a = i7;
        this.f14521b = str;
        this.f14522c = pendingIntent;
        this.f14523d = c1837b;
    }

    /* JADX INFO: renamed from: T */
    public C1837b m17743T() {
        return this.f14523d;
    }

    /* JADX INFO: renamed from: U */
    public int m17744U() {
        return this.f14520a;
    }

    /* JADX INFO: renamed from: V */
    public String m17745V() {
        return this.f14521b;
    }

    /* JADX INFO: renamed from: W */
    public boolean m17746W() {
        return this.f14522c != null;
    }

    /* JADX INFO: renamed from: X */
    public boolean m17747X() {
        return this.f14520a <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f14520a == status.f14520a && AbstractC3714q.m18053b(this.f14521b, status.f14521b) && AbstractC3714q.m18053b(this.f14522c, status.f14522c) && AbstractC3714q.m18053b(this.f14523d, status.f14523d);
    }

    @Override // com.google.android.gms.common.api.InterfaceC3643m
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(this.f14520a), this.f14521b, this.f14522c, this.f14523d);
    }

    public String toString() {
        AbstractC3714q.a aVarM18055d = AbstractC3714q.m18055d(this);
        aVarM18055d.m18056a("statusCode", zza());
        aVarM18055d.m18056a("resolution", this.f14522c);
        return aVarM18055d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, m17744U());
        AbstractC1947c.m8044E(parcel, 2, m17745V(), false);
        AbstractC1947c.m8042C(parcel, 3, this.f14522c, i7, false);
        AbstractC1947c.m8042C(parcel, 4, m17743T(), i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final String zza() {
        String str = this.f14521b;
        return str != null ? str : AbstractC3556d.m17756a(this.f14520a);
    }

    public Status(int i7) {
        this(i7, (String) null);
    }

    public Status(C1837b c1837b, String str) {
        this(c1837b, str, 17);
    }

    public Status(int i7, String str) {
        this(i7, str, (PendingIntent) null);
    }

    public Status(C1837b c1837b, String str, int i7) {
        this(i7, str, c1837b.m7598V(), c1837b);
    }

    public Status(int i7, String str, PendingIntent pendingIntent) {
        this(i7, str, pendingIntent, null);
    }
}
