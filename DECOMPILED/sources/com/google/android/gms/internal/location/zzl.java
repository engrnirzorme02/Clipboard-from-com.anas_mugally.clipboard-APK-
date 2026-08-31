package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.AbstractBinderC3982u;
import com.google.android.gms.location.InterfaceC3983v;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl extends AbstractC1945a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    final int zza;
    final zzj zzb;
    final InterfaceC3983v zzc;
    final zzai zzd;

    zzl(int i7, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        this.zza = i7;
        this.zzb = zzjVar;
        zzai zzagVar = null;
        this.zzc = iBinder == null ? null : AbstractBinderC3982u.zzb(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder2);
        }
        this.zzd = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.zza);
        AbstractC1947c.m8042C(parcel, 2, this.zzb, i7, false);
        InterfaceC3983v interfaceC3983v = this.zzc;
        AbstractC1947c.m8071s(parcel, 3, interfaceC3983v == null ? null : interfaceC3983v.asBinder(), false);
        zzai zzaiVar = this.zzd;
        AbstractC1947c.m8071s(parcel, 4, zzaiVar != null ? zzaiVar.asBinder() : null, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
