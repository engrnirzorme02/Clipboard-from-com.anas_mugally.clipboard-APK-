package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.Map;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbto extends AbstractC1945a {
    public static final Parcelable.Creator<zzbto> CREATOR = new zzbtp();
    public final View zza;
    public final Map zzb;

    public zzbto(IBinder iBinder, IBinder iBinder2) {
        this.zza = (View) BinderC3773b.m18220M0(InterfaceC3772a.a.m18219L0(iBinder));
        this.zzb = (Map) BinderC3773b.m18220M0(InterfaceC3772a.a.m18219L0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        View view = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8071s(parcel, 1, BinderC3773b.m18221N0(view).asBinder(), false);
        AbstractC1947c.m8071s(parcel, 2, BinderC3773b.m18221N0(this.zzb).asBinder(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
