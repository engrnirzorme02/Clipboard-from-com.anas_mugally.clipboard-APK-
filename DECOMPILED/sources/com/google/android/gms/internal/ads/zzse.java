package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.lifecycle.AbstractC2636b;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzse implements zzsr {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzde zzg;
    private boolean zzh;

    public zzse(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzde zzdeVar = new zzde(zzdb.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdeVar;
        this.zzf = new AtomicReference();
    }

    private static zzsd zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zzsd();
                }
                return (zzsd) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    private static byte[] zzk(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zzsc(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzb(int i7, int i8, int i9, long j7, int i10) {
        zzg();
        zzsd zzsdVarZzi = zzi();
        zzsdVarZzi.zza(i7, 0, i9, j7, i10);
        Handler handler = this.zze;
        String str = zzeo.zza;
        handler.obtainMessage(1, zzsdVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzc(int i7, int i8, zzhd zzhdVar, long j7, int i9) {
        zzg();
        zzsd zzsdVarZzi = zzi();
        zzsdVarZzi.zza(i7, 0, 0, j7, i9);
        MediaCodec.CryptoInfo cryptoInfo = zzsdVarZzi.zzd;
        cryptoInfo.numSubSamples = zzhdVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzhdVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzhdVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzk = zzk(zzhdVar.zzb, cryptoInfo.key);
        bArrZzk.getClass();
        cryptoInfo.key = bArrZzk;
        byte[] bArrZzk2 = zzk(zzhdVar.zza, cryptoInfo.iv);
        bArrZzk2.getClass();
        cryptoInfo.iv = bArrZzk2;
        cryptoInfo.mode = zzhdVar.zzc;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzhdVar.zzg, zzhdVar.zzh));
        Handler handler = this.zze;
        String str = zzeo.zza;
        handler.obtainMessage(2, zzsdVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzeo.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                zzde zzdeVar = this.zzg;
                zzdeVar.zzb();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                zzdeVar.zzc();
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ void zzh(Message message) {
        zzsd zzsdVar;
        ArrayDeque arrayDeque;
        int i7 = message.what;
        zzsd zzsdVar2 = null;
        if (i7 != 1) {
            if (i7 == 2) {
                zzsdVar = (zzsd) message.obj;
                int i8 = zzsdVar.zza;
                MediaCodec.CryptoInfo cryptoInfo = zzsdVar.zzd;
                long j7 = zzsdVar.zze;
                int i9 = zzsdVar.zzf;
                try {
                    synchronized (zzb) {
                        this.zzc.queueSecureInputBuffer(i8, 0, cryptoInfo, j7, i9);
                    }
                } catch (RuntimeException e7) {
                    AbstractC2636b.m12603a(this.zzf, null, e7);
                }
            } else if (i7 == 3) {
                this.zzg.zza();
            } else if (i7 != 4) {
                AbstractC2636b.m12603a(this.zzf, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    this.zzc.setParameters((Bundle) message.obj);
                } catch (RuntimeException e8) {
                    AbstractC2636b.m12603a(this.zzf, null, e8);
                }
            }
            if (zzsdVar2 != null) {
                arrayDeque = zza;
                synchronized (arrayDeque) {
                    arrayDeque.add(zzsdVar2);
                }
            }
        }
        zzsdVar = (zzsd) message.obj;
        try {
            this.zzc.queueInputBuffer(zzsdVar.zza, 0, zzsdVar.zzc, zzsdVar.zze, zzsdVar.zzf);
        } catch (RuntimeException e9) {
            AbstractC2636b.m12603a(this.zzf, null, e9);
        }
        zzsdVar2 = zzsdVar;
        if (zzsdVar2 != null) {
            arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzsdVar2);
            }
        }
    }
}
