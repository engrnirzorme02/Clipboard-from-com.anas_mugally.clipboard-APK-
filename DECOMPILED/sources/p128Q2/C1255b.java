package p128Q2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbbn;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: Q2.b */
/* JADX INFO: loaded from: classes.dex */
public class C1255b extends AbstractC1945a {
    public static final Parcelable.Creator<C1255b> CREATOR = new C1257d();

    /* JADX INFO: renamed from: r */
    public static final int f4482r = 0;

    /* JADX INFO: renamed from: s */
    public static final int f4483s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f4484t = 2;

    /* JADX INFO: renamed from: u */
    public static final int f4485u = 3;

    /* JADX INFO: renamed from: v */
    public static final int f4486v = 4;

    /* JADX INFO: renamed from: w */
    public static final int f4487w = 5;

    /* JADX INFO: renamed from: x */
    public static final int f4488x = 6;

    /* JADX INFO: renamed from: y */
    public static final int f4489y = 7;

    /* JADX INFO: renamed from: z */
    public static final int f4490z = 7;

    /* JADX INFO: renamed from: a */
    public final String f4491a;

    /* JADX INFO: renamed from: b */
    public final int f4492b;

    /* JADX INFO: renamed from: c */
    public final long f4493c;

    /* JADX INFO: renamed from: d */
    public final byte[] f4494d;

    /* JADX INFO: renamed from: e */
    final int f4495e;

    /* JADX INFO: renamed from: f */
    final Bundle f4496f;

    C1255b(int i7, String str, int i8, long j7, byte[] bArr, Bundle bundle) {
        this.f4495e = i7;
        this.f4491a = str;
        this.f4492b = i8;
        this.f4493c = j7;
        this.f4494d = bArr;
        this.f4496f = bundle;
    }

    public String toString() {
        return "ProxyRequest[ url: " + this.f4491a + ", method: " + this.f4492b + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.f4491a, false);
        AbstractC1947c.m8072t(parcel, 2, this.f4492b);
        AbstractC1947c.m8076x(parcel, 3, this.f4493c);
        AbstractC1947c.m8063k(parcel, 4, this.f4494d, false);
        AbstractC1947c.m8062j(parcel, 5, this.f4496f, false);
        AbstractC1947c.m8072t(parcel, zzbbn.zzq.zzf, this.f4495e);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
