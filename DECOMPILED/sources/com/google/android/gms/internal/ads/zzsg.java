package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.C2394e;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
final class zzsg extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;
    private zzsp zzo;
    private final Object zza = new Object();
    private final C2394e zzd = new C2394e();
    private final C2394e zze = new C2394e();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    zzsg(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    private final void zzi() {
        ArrayDeque arrayDeque = this.zzg;
        if (!arrayDeque.isEmpty()) {
            this.zzi = (MediaFormat) arrayDeque.getLast();
        }
        this.zzd.m10278b();
        this.zze.m10278b();
        this.zzf.clear();
        arrayDeque.clear();
    }

    private final boolean zzj() {
        return this.zzl > 0 || this.zzm;
    }

    private final void zzk(MediaFormat mediaFormat) {
        this.zze.m10277a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzl() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        synchronized (this.zza) {
            try {
                this.zzd.m10277a(i7);
                zzsp zzspVar = this.zzo;
                if (zzspVar != null) {
                    zzsz zzszVar = ((zzsx) zzspVar).zza;
                    if (zzszVar.zzbc() != null) {
                        zzszVar.zzbc().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                MediaFormat mediaFormat = this.zzi;
                if (mediaFormat != null) {
                    zzk(mediaFormat);
                    this.zzi = null;
                }
                this.zze.m10277a(i7);
                this.zzf.add(bufferInfo);
                zzsp zzspVar = this.zzo;
                if (zzspVar != null) {
                    zzsz zzszVar = ((zzsx) zzspVar).zza;
                    if (zzszVar.zzbc() != null) {
                        zzszVar.zzbc().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzk(mediaFormat);
            this.zzi = null;
        }
    }

    public final void zza(MediaCodec mediaCodec) {
        zzghc.zzh(this.zzc == null);
        HandlerThread handlerThread = this.zzb;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzb() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzi();
        }
    }

    public final int zzc() {
        synchronized (this.zza) {
            try {
                zzl();
                int iM10280e = -1;
                if (zzj()) {
                    return -1;
                }
                C2394e c2394e = this.zzd;
                if (!c2394e.m10279d()) {
                    iM10280e = c2394e.m10280e();
                }
                return iM10280e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zzd(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                zzl();
                if (zzj()) {
                    return -1;
                }
                C2394e c2394e = this.zze;
                if (c2394e.m10279d()) {
                    return -1;
                }
                int iM10280e = c2394e.m10280e();
                if (iM10280e >= 0) {
                    if (this.zzh == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iM10280e == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    iM10280e = -2;
                }
                return iM10280e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat zze() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            try {
                mediaFormat = this.zzh;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void zzf() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            String str = zzeo.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    public final void zzg(zzsp zzspVar) {
        synchronized (this.zza) {
            this.zzo = zzspVar;
        }
    }

    final /* synthetic */ void zzh() {
        Object obj = this.zza;
        synchronized (obj) {
            try {
                if (this.zzm) {
                    return;
                }
                long j7 = this.zzl - 1;
                this.zzl = j7;
                if (j7 > 0) {
                    return;
                }
                if (j7 >= 0) {
                    zzi();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (obj) {
                    this.zzn = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
