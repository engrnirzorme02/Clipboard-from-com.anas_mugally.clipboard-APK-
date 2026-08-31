package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbaq extends AbstractC1945a {
    public static final Parcelable.Creator<zzbaq> CREATOR = new zzbar();
    private ParcelFileDescriptor zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    public zzbaq() {
        this(null, false, false, 0L, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 2, zzc(), i7, false);
        AbstractC1947c.m8059g(parcel, 3, zzd());
        AbstractC1947c.m8059g(parcel, 4, zze());
        AbstractC1947c.m8076x(parcel, 5, zzf());
        AbstractC1947c.m8059g(parcel, 6, zzg());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final synchronized boolean zza() {
        return this.zza != null;
    }

    public final synchronized InputStream zzb() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    final synchronized ParcelFileDescriptor zzc() {
        return this.zza;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        return this.zzc;
    }

    public final synchronized long zzf() {
        return this.zzd;
    }

    public final synchronized boolean zzg() {
        return this.zze;
    }

    public zzbaq(ParcelFileDescriptor parcelFileDescriptor, boolean z7, boolean z8, long j7, boolean z9) {
        this.zza = parcelFileDescriptor;
        this.zzb = z7;
        this.zzc = z8;
        this.zzd = j7;
        this.zze = z9;
    }
}
