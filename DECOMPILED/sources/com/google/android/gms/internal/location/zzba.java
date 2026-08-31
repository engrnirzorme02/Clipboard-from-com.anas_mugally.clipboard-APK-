package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.C3688d;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzba extends AbstractC1945a {
    final LocationRequest zzb;
    final List<C3688d> zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final String zzh;
    final boolean zzi;
    boolean zzj;
    String zzk;
    long zzl;
    static final List<C3688d> zza = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    zzba(LocationRequest locationRequest, List<C3688d> list, String str, boolean z7, boolean z8, boolean z9, String str2, boolean z10, boolean z11, String str3, long j7) {
        this.zzb = locationRequest;
        this.zzc = list;
        this.zzd = str;
        this.zze = z7;
        this.zzf = z8;
        this.zzg = z9;
        this.zzh = str2;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = str3;
        this.zzl = j7;
    }

    public static zzba zza(String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, zza, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (AbstractC3714q.m18053b(this.zzb, zzbaVar.zzb) && AbstractC3714q.m18053b(this.zzc, zzbaVar.zzc) && AbstractC3714q.m18053b(this.zzd, zzbaVar.zzd) && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && AbstractC3714q.m18053b(this.zzh, zzbaVar.zzh) && this.zzi == zzbaVar.zzi && this.zzj == zzbaVar.zzj && AbstractC3714q.m18053b(this.zzk, zzbaVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        if (this.zzd != null) {
            sb.append(" tag=");
            sb.append(this.zzd);
        }
        if (this.zzh != null) {
            sb.append(" moduleId=");
            sb.append(this.zzh);
        }
        if (this.zzk != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.zzk);
        }
        sb.append(" hideAppOps=");
        sb.append(this.zze);
        sb.append(" clients=");
        sb.append(this.zzc);
        sb.append(" forceCoarseLocation=");
        sb.append(this.zzf);
        if (this.zzg) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.zzi) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.zzj) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, this.zzb, i7, false);
        AbstractC1947c.m8048I(parcel, 5, this.zzc, false);
        AbstractC1947c.m8044E(parcel, 6, this.zzd, false);
        AbstractC1947c.m8059g(parcel, 7, this.zze);
        AbstractC1947c.m8059g(parcel, 8, this.zzf);
        AbstractC1947c.m8059g(parcel, 9, this.zzg);
        AbstractC1947c.m8044E(parcel, 10, this.zzh, false);
        AbstractC1947c.m8059g(parcel, 11, this.zzi);
        AbstractC1947c.m8059g(parcel, 12, this.zzj);
        AbstractC1947c.m8044E(parcel, 13, this.zzk, false);
        AbstractC1947c.m8076x(parcel, 14, this.zzl);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final zzba zzb(long j7) {
        if (this.zzb.m18385U() <= this.zzb.m18384T()) {
            this.zzl = 10000L;
            return this;
        }
        long jM18384T = this.zzb.m18384T();
        long jM18385U = this.zzb.m18385U();
        StringBuilder sb = new StringBuilder(120);
        sb.append("could not set max age when location batching is requested, interval=");
        sb.append(jM18384T);
        sb.append("maxWaitTime=");
        sb.append(jM18385U);
        throw new IllegalArgumentException(sb.toString());
    }

    public final zzba zzc(String str) {
        this.zzk = str;
        return this;
    }

    public final zzba zzd(boolean z7) {
        this.zzj = true;
        return this;
    }
}
