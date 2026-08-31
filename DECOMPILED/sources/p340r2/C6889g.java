package p340r2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.AbstractBinderC3371n0;
import com.google.android.gms.ads.internal.client.InterfaceC3375o0;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: r2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6889g extends AbstractC1945a {
    public static final Parcelable.Creator<C6889g> CREATOR = new C6896n();

    /* JADX INFO: renamed from: a */
    private final boolean f27654a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC3375o0 f27655b;

    /* JADX INFO: renamed from: c */
    private final IBinder f27656c;

    C6889g(boolean z7, IBinder iBinder, IBinder iBinder2) {
        this.f27654a = z7;
        this.f27655b = iBinder != null ? AbstractBinderC3371n0.zzd(iBinder) : null;
        this.f27656c = iBinder2;
    }

    /* JADX INFO: renamed from: T */
    public final InterfaceC3375o0 m30112T() {
        return this.f27655b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 1, this.f27654a);
        InterfaceC3375o0 interfaceC3375o0 = this.f27655b;
        AbstractC1947c.m8071s(parcel, 2, interfaceC3375o0 == null ? null : interfaceC3375o0.asBinder(), false);
        AbstractC1947c.m8071s(parcel, 3, this.f27656c, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final boolean zza() {
        return this.f27654a;
    }
}
