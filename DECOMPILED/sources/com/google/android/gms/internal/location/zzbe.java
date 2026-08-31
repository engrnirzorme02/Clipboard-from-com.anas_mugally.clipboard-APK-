package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.location.InterfaceC3967f;
import java.util.Locale;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbe extends AbstractC1945a implements InterfaceC3967f {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    private final String zza;
    private final long zzb;
    private final short zzc;
    private final double zzd;
    private final double zze;
    private final float zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;

    public zzbe(String str, int i7, short s7, double d7, double d8, float f7, long j7, int i8, int i9) {
        if (str == null || str.length() > 100) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "requestId is null or too long: ".concat(strValueOf) : new String("requestId is null or too long: "));
        }
        if (f7 <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f7);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d7 > 90.0d || d7 < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d7);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d8 > 180.0d || d8 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d8);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i7);
            throw new IllegalArgumentException(sb4.toString());
        }
        this.zzc = s7;
        this.zza = str;
        this.zzd = d7;
        this.zze = d8;
        this.zzf = f7;
        this.zzb = j7;
        this.zzg = i10;
        this.zzh = i8;
        this.zzi = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzf == zzbeVar.zzf && this.zzd == zzbeVar.zzd && this.zze == zzbeVar.zze && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zzd);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.zzf)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        short s7 = this.zzc;
        if (s7 != -1) {
            str = s7 != 1 ? "UNKNOWN" : "CIRCLE";
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / zzbbn.zzq.zzf), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.zza, false);
        AbstractC1947c.m8076x(parcel, 2, this.zzb);
        AbstractC1947c.m8043D(parcel, 3, this.zzc);
        AbstractC1947c.m8065m(parcel, 4, this.zzd);
        AbstractC1947c.m8065m(parcel, 5, this.zze);
        AbstractC1947c.m8068p(parcel, 6, this.zzf);
        AbstractC1947c.m8072t(parcel, 7, this.zzg);
        AbstractC1947c.m8072t(parcel, 8, this.zzh);
        AbstractC1947c.m8072t(parcel, 9, this.zzi);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
