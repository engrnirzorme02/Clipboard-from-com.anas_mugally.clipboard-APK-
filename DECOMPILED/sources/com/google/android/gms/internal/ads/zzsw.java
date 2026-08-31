package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsw extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzst zzc;
    public final String zzd;

    public zzsw(zzu zzuVar, Throwable th, boolean z7, int i7) {
        String string = zzuVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 25 + string.length());
        sb.append("Decoder init failed: [");
        sb.append(i7);
        sb.append("], ");
        sb.append(string);
        String string2 = sb.toString();
        String str = zzuVar.zzo;
        int iAbs = Math.abs(i7);
        StringBuilder sb2 = new StringBuilder(String.valueOf(iAbs).length() + 60);
        sb2.append("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_");
        sb2.append(iAbs);
        this(string2, th, str, false, null, sb2.toString(), null);
    }

    final /* synthetic */ zzsw zza(zzsw zzswVar) {
        return new zzsw(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzswVar);
    }

    public zzsw(zzu zzuVar, Throwable th, boolean z7, zzst zzstVar) {
        String str = zzstVar.zza;
        int length = str.length();
        String string = zzuVar.toString();
        StringBuilder sb = new StringBuilder(length + 23 + string.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(string);
        this(sb.toString(), th, zzuVar.zzo, false, zzstVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzsw(String str, Throwable th, String str2, boolean z7, zzst zzstVar, String str3, zzsw zzswVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzstVar;
        this.zzd = str3;
    }
}
