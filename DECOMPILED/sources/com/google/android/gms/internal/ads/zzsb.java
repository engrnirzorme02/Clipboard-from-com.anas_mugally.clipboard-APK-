package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class zzsb implements zzsq {
    private final MediaCodec zza;
    private final zzsg zzb;
    private final zzsr zzc;
    private final zzsm zzd;
    private boolean zze;
    private int zzf = 0;

    /* synthetic */ zzsb(MediaCodec mediaCodec, HandlerThread handlerThread, zzsr zzsrVar, zzsm zzsmVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = new zzsg(handlerThread);
        this.zzc = zzsrVar;
        this.zzd = zzsmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzt(int i7, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i7 == 1) {
            sb.append("Audio");
        } else if (i7 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i7);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zza(int i7, int i8, int i9, long j7, int i10) {
        this.zzc.zzb(i7, 0, i9, j7, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzb(int i7, int i8, zzhd zzhdVar, long j7, int i9) {
        this.zzc.zzc(i7, 0, zzhdVar, j7, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzc(int i7, boolean z7) {
        this.zza.releaseOutputBuffer(i7, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzd(int i7, long j7) {
        this.zza.releaseOutputBuffer(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final int zze() {
        this.zzc.zzg();
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzg();
        return this.zzb.zzd(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final MediaFormat zzg() {
        return this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final ByteBuffer zzh(int i7) {
        return this.zza.getInputBuffer(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final ByteBuffer zzi(int i7) {
        return this.zza.getOutputBuffer(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzj() {
        this.zzc.zze();
        MediaCodec mediaCodec = this.zza;
        mediaCodec.flush();
        this.zzb.zzf();
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzk() {
        zzsm zzsmVar;
        zzsm zzsmVar2;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzf();
                    this.zzb.zzb();
                }
                this.zzf = 2;
            } finally {
                if (!this.zze) {
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30 && i7 < 33) {
                        this.zza.stop();
                    }
                    if (i7 >= 35 && (zzsmVar2 = this.zzd) != null) {
                        zzsmVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
            }
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (zzsmVar = this.zzd) != null) {
                zzsmVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final boolean zzl(zzsp zzspVar) {
        this.zzb.zzg(zzspVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzm(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzn() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzo(Bundle bundle) {
        this.zzc.zzd(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzp(int i7) {
        this.zza.setVideoScalingMode(i7);
    }

    final /* synthetic */ void zzq(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        zzsm zzsmVar;
        zzsg zzsgVar = this.zzb;
        MediaCodec mediaCodec = this.zza;
        zzsgVar.zza(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i7);
        Trace.endSection();
        this.zzc.zza();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zzsmVar = this.zzd) != null) {
            zzsmVar.zzb(mediaCodec);
        }
        this.zzf = 1;
    }
}
