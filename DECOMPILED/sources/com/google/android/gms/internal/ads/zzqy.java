package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzqy implements zzqf {
    final /* synthetic */ zzrc zza;

    /* synthetic */ zzqy(zzrc zzrcVar, byte[] bArr) {
        Objects.requireNonNull(zzrcVar);
        this.zza = zzrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zza(long j7) {
        zzrc zzrcVar = this.zza;
        if (zzrcVar.zzI() != null) {
            ((zzrf) zzrcVar.zzI()).zza.zzav().zzd(j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zzb(long j7, long j8, long j9, long j10) {
        zzrc zzrcVar = this.zza;
        long jZzF = zzrcVar.zzF();
        long jZzG = zzrcVar.zzG();
        int length = String.valueOf(j7).length();
        int length2 = String.valueOf(j8).length();
        int length3 = String.valueOf(j9).length();
        int length4 = String.valueOf(j10).length();
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 2 + length3 + 2 + length4 + 2 + String.valueOf(jZzF).length() + 2 + String.valueOf(jZzG).length());
        sb.append("Spurious audio timestamp (frame position mismatch): ");
        sb.append(j7);
        sb.append(", ");
        sb.append(j8);
        sb.append(", ");
        sb.append(j9);
        sb.append(", ");
        sb.append(j10);
        sb.append(", ");
        sb.append(jZzF);
        sb.append(", ");
        sb.append(jZzG);
        zzds.zzc("DefaultAudioSink", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zzc(long j7, long j8, long j9, long j10) {
        zzrc zzrcVar = this.zza;
        long jZzF = zzrcVar.zzF();
        long jZzG = zzrcVar.zzG();
        int length = String.valueOf(j7).length();
        int length2 = String.valueOf(j8).length();
        int length3 = String.valueOf(j9).length();
        int length4 = String.valueOf(j10).length();
        StringBuilder sb = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + length4 + 2 + String.valueOf(jZzF).length() + 2 + String.valueOf(jZzG).length());
        sb.append("Spurious audio timestamp (system clock mismatch): ");
        sb.append(j7);
        sb.append(", ");
        sb.append(j8);
        sb.append(", ");
        sb.append(j9);
        sb.append(", ");
        sb.append(j10);
        sb.append(", ");
        sb.append(jZzF);
        sb.append(", ");
        sb.append(jZzG);
        zzds.zzc("DefaultAudioSink", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zzd(long j7) {
        StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 41);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j7);
        zzds.zzc("DefaultAudioSink", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zze(int i7, long j7) {
        zzrc zzrcVar = this.zza;
        if (zzrcVar.zzI() != null) {
            ((zzrf) zzrcVar.zzI()).zza.zzav().zze(i7, j7, SystemClock.elapsedRealtime() - zzrcVar.zzM());
        }
    }
}
