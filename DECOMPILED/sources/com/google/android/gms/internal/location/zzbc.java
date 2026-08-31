package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.AbstractBinderC3937B;
import com.google.android.gms.location.AbstractBinderC3985x;
import com.google.android.gms.location.InterfaceC3938C;
import com.google.android.gms.location.InterfaceC3987z;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbc extends AbstractC1945a {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    final int zza;
    final zzba zzb;
    final InterfaceC3938C zzc;
    final PendingIntent zzd;
    final InterfaceC3987z zze;
    final zzai zzf;

    zzbc(int i7, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.zza = i7;
        this.zzb = zzbaVar;
        zzai zzagVar = null;
        this.zzc = iBinder == null ? null : AbstractBinderC3937B.zzb(iBinder);
        this.zzd = pendingIntent;
        this.zze = iBinder2 == null ? null : AbstractBinderC3985x.zzb(iBinder2);
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder3);
        }
        this.zzf = zzagVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, com.google.android.gms.location.C] */
    public static zzbc zza(InterfaceC3938C interfaceC3938C, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, interfaceC3938C, null, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzbc zzb(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        return new zzbc(1, zzbaVar, null, pendingIntent, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, com.google.android.gms.location.z] */
    public static zzbc zzc(InterfaceC3987z interfaceC3987z, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, null, null, interfaceC3987z, zzaiVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.zza);
        AbstractC1947c.m8042C(parcel, 2, this.zzb, i7, false);
        InterfaceC3938C interfaceC3938C = this.zzc;
        AbstractC1947c.m8071s(parcel, 3, interfaceC3938C == null ? null : interfaceC3938C.asBinder(), false);
        AbstractC1947c.m8042C(parcel, 4, this.zzd, i7, false);
        InterfaceC3987z interfaceC3987z = this.zze;
        AbstractC1947c.m8071s(parcel, 5, interfaceC3987z == null ? null : interfaceC3987z.asBinder(), false);
        zzai zzaiVar = this.zzf;
        AbstractC1947c.m8071s(parcel, 6, zzaiVar != null ? zzaiVar.asBinder() : null, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
