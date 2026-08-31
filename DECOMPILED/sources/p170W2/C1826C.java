package p170W2;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: W2.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1826C extends AbstractC1945a {
    public static final Parcelable.Creator<C1826C> CREATOR = new C1827D();

    /* JADX INFO: renamed from: a */
    private final String f5950a;

    /* JADX INFO: renamed from: b */
    private final boolean f5951b;

    /* JADX INFO: renamed from: c */
    private final boolean f5952c;

    /* JADX INFO: renamed from: d */
    private final Context f5953d;

    /* JADX INFO: renamed from: e */
    private final boolean f5954e;

    /* JADX INFO: renamed from: f */
    private final boolean f5955f;

    C1826C(String str, boolean z7, boolean z8, IBinder iBinder, boolean z9, boolean z10) {
        this.f5950a = str;
        this.f5951b = z7;
        this.f5952c = z8;
        this.f5953d = (Context) BinderC3773b.m18220M0(InterfaceC3772a.a.m18219L0(iBinder));
        this.f5954e = z9;
        this.f5955f = z10;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, com.google.android.gms.dynamic.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f5950a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractC1947c.m8059g(parcel, 2, this.f5951b);
        AbstractC1947c.m8059g(parcel, 3, this.f5952c);
        AbstractC1947c.m8071s(parcel, 4, BinderC3773b.m18221N0(this.f5953d), false);
        AbstractC1947c.m8059g(parcel, 5, this.f5954e);
        AbstractC1947c.m8059g(parcel, 6, this.f5955f);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
