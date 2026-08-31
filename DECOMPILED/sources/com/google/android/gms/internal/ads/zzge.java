package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzge {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzak.zzb("media3.datasource");
    }

    /* synthetic */ zzge(Uri uri, long j7, int i7, byte[] bArr, Map map, long j8, long j9, String str, int i8, Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j8, j9, null, i8, null);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        long j7 = this.zze;
        int length2 = String.valueOf(j7).length();
        long j8 = this.zzf;
        int length3 = String.valueOf(j8).length();
        int i7 = this.zzg;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i7).length() + 1);
        sb.append("DataSpec[");
        sb.append("GET");
        sb.append(" ");
        sb.append(string);
        sb.append(", ");
        sb.append(j7);
        sb.append(", ");
        sb.append(j8);
        sb.append(", null, ");
        sb.append(i7);
        sb.append("]");
        return sb.toString();
    }

    public final boolean zza(int i7) {
        return (this.zzg & i7) == i7;
    }

    public final zzgd zzb() {
        return new zzgd(this, null);
    }

    private zzge(Uri uri, long j7, int i7, byte[] bArr, Map map, long j8, long j9, String str, int i8, Object obj) {
        boolean z7 = false;
        boolean z8 = j8 >= 0;
        zzghc.zza(z8);
        zzghc.zza(z8);
        if (j9 > 0) {
            z7 = true;
        } else if (j9 == -1) {
            j9 = -1;
            z7 = true;
        }
        zzghc.zza(z7);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j8;
        this.zzf = j9;
        this.zzg = i8;
    }

    @Deprecated
    public zzge(Uri uri, long j7, long j8, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j7, j8, null, 0, null);
    }
}
