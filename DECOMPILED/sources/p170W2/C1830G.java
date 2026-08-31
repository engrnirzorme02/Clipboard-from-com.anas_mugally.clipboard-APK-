package p170W2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC3657A0;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: W2.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1830G extends AbstractC1945a {
    public static final Parcelable.Creator<C1830G> CREATOR = new C1831H();

    /* JADX INFO: renamed from: a */
    private final String f5960a;

    /* JADX INFO: renamed from: b */
    private final AbstractBinderC1859x f5961b;

    /* JADX INFO: renamed from: c */
    private final boolean f5962c;

    /* JADX INFO: renamed from: d */
    private final boolean f5963d;

    C1830G(String str, AbstractBinderC1859x abstractBinderC1859x, boolean z7, boolean z8) {
        this.f5960a = str;
        this.f5961b = abstractBinderC1859x;
        this.f5962c = z7;
        this.f5963d = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f5960a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractBinderC1859x abstractBinderC1859x = this.f5961b;
        if (abstractBinderC1859x == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC1859x = null;
        }
        AbstractC1947c.m8071s(parcel, 2, abstractBinderC1859x, false);
        AbstractC1947c.m8059g(parcel, 3, this.f5962c);
        AbstractC1947c.m8059g(parcel, 4, this.f5963d);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    C1830G(String str, IBinder iBinder, boolean z7, boolean z8) {
        this.f5960a = str;
        BinderC1860y binderC1860y = null;
        if (iBinder != null) {
            try {
                InterfaceC3772a interfaceC3772aZzd = AbstractBinderC3657A0.m17973L0(iBinder).zzd();
                byte[] bArr = interfaceC3772aZzd == null ? null : (byte[]) BinderC3773b.m18220M0(interfaceC3772aZzd);
                if (bArr != null) {
                    binderC1860y = new BinderC1860y(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e7) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e7);
            }
        }
        this.f5961b = binderC1860y;
        this.f5962c = z7;
        this.f5963d = z8;
    }
}
