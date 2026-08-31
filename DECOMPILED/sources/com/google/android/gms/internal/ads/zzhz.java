package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhz extends zzat {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzu zzf;
    public final int zzg;
    public final zzup zzh;
    final boolean zzi;

    private zzhz(int i7, Throwable th, int i8) {
        this(i7, th, null, i8, null, -1, null, 4, null, false);
    }

    public static zzhz zza(IOException iOException, int i7) {
        return new zzhz(0, iOException, i7);
    }

    public static zzhz zzb(Throwable th, String str, int i7, zzu zzuVar, int i8, zzup zzupVar, boolean z7, int i9) {
        if (zzuVar == null) {
            i8 = 4;
        }
        return new zzhz(1, th, null, i9, str, i7, zzuVar, i8, zzupVar, z7);
    }

    public static zzhz zzc(RuntimeException runtimeException, int i7) {
        return new zzhz(2, runtimeException, i7);
    }

    final zzhz zzd(zzup zzupVar) {
        String message = getMessage();
        String str = zzeo.zza;
        return new zzhz(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzupVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzhz(int i7, Throwable th, String str, int i8, String str2, int i9, zzu zzuVar, int i10, zzup zzupVar, boolean z7) {
        String str3;
        int i11;
        String string;
        String str4;
        if (i7 == 0) {
            str3 = str2;
            i11 = i9;
            string = "Source error";
        } else if (i7 != 1) {
            string = "Unexpected runtime error";
            str3 = str2;
            i11 = i9;
        } else {
            String strValueOf = String.valueOf(zzuVar);
            String str5 = zzeo.zza;
            if (i10 == 0) {
                str4 = "NO";
            } else if (i10 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i10 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i10 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(i9).length() + 9 + strValueOf.length() + 19 + str4.length());
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i11 = i9;
            sb.append(i11);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(str4);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), th, i8, i7, str3, i11, zzuVar, i10, zzupVar, SystemClock.elapsedRealtime(), z7);
    }

    private zzhz(String str, Throwable th, int i7, int i8, String str2, int i9, zzu zzuVar, int i10, zzup zzupVar, long j7, boolean z7) {
        boolean z8;
        super(str, th, i7, Bundle.EMPTY, j7);
        if (!z7) {
            z8 = true;
        } else if (i8 == 1) {
            i8 = 1;
            z8 = true;
        } else {
            z8 = false;
        }
        zzghc.zza(z8);
        zzghc.zza(th != null);
        this.zzc = i8;
        this.zzd = str2;
        this.zze = i9;
        this.zzf = zzuVar;
        this.zzg = i10;
        this.zzh = zzupVar;
        this.zzi = z7;
    }
}
