package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.location.P */
/* JADX INFO: loaded from: classes2.dex */
public final class C3951P extends AbstractC1945a {
    public static final Parcelable.Creator<C3951P> CREATOR = new C3952Q();

    /* JADX INFO: renamed from: a */
    private final List f14994a;

    /* JADX INFO: renamed from: b */
    private final PendingIntent f14995b;

    /* JADX INFO: renamed from: c */
    private final String f14996c;

    C3951P(List list, PendingIntent pendingIntent, String str) {
        this.f14994a = list == null ? zzbs.zzi() : zzbs.zzj(list);
        this.f14995b = pendingIntent;
        this.f14996c = str;
    }

    /* JADX INFO: renamed from: T */
    public static C3951P m18387T(List list) {
        AbstractC3718s.m18084m(list, "geofence can't be null.");
        AbstractC3718s.m18073b(!list.isEmpty(), "Geofences must contains at least one id.");
        return new C3951P(list, null, "");
    }

    /* JADX INFO: renamed from: U */
    public static C3951P m18388U(PendingIntent pendingIntent) {
        AbstractC3718s.m18084m(pendingIntent, "PendingIntent can not be null.");
        return new C3951P(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8046G(parcel, 1, this.f14994a, false);
        AbstractC1947c.m8042C(parcel, 2, this.f14995b, i7, false);
        AbstractC1947c.m8044E(parcel, 3, this.f14996c, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
