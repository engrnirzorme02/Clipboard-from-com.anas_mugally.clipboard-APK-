package p128Q2;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbbn;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: Q2.c */
/* JADX INFO: loaded from: classes.dex */
public class C1256c extends AbstractC1945a {
    public static final Parcelable.Creator<C1256c> CREATOR = new C1258e();

    /* JADX INFO: renamed from: a */
    public final int f4497a;

    /* JADX INFO: renamed from: b */
    public final PendingIntent f4498b;

    /* JADX INFO: renamed from: c */
    public final int f4499c;

    /* JADX INFO: renamed from: d */
    public final byte[] f4500d;

    /* JADX INFO: renamed from: e */
    final int f4501e;

    /* JADX INFO: renamed from: f */
    final Bundle f4502f;

    C1256c(int i7, int i8, PendingIntent pendingIntent, int i9, Bundle bundle, byte[] bArr) {
        this.f4501e = i7;
        this.f4497a = i8;
        this.f4499c = i9;
        this.f4502f = bundle;
        this.f4500d = bArr;
        this.f4498b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f4497a);
        AbstractC1947c.m8042C(parcel, 2, this.f4498b, i7, false);
        AbstractC1947c.m8072t(parcel, 3, this.f4499c);
        AbstractC1947c.m8062j(parcel, 4, this.f4502f, false);
        AbstractC1947c.m8063k(parcel, 5, this.f4500d, false);
        AbstractC1947c.m8072t(parcel, zzbbn.zzq.zzf, this.f4501e);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
