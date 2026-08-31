package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrc implements zzqc {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private zzqs zzA;
    private zzau zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private float zzL;
    private ByteBuffer zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private int zzT;
    private boolean zzU;
    private zzd zzV;
    private AudioDeviceInfo zzW;
    private long zzX;
    private boolean zzY;
    private boolean zzZ;
    private Looper zzaa;
    private long zzab;
    private long zzac;
    private Handler zzad;
    private Context zzae;
    private boolean zzaf;
    private final zzqm zzag;
    private final zzqi zzah;
    private final Context zzd;
    private final zzqh zze;
    private final zzrk zzf;
    private final zzcj zzg;
    private final zzrj zzh;
    private final zzgjz zzi;
    private final zzqg zzj;
    private final ArrayDeque zzk;
    private zzrb zzl;
    private final zzqx zzm;
    private final zzqx zzn;
    private final int zzo;
    private zzox zzp;
    private zzpz zzq;
    private zzql zzr;
    private zzql zzs;
    private zzcb zzt;
    private AudioTrack zzu;
    private zzoz zzv;
    private zzpe zzw;
    private zzqw zzx;
    private zzc zzy;
    private zzqs zzz;

    /* synthetic */ zzrc(zzqk zzqkVar, byte[] bArr) {
        int deviceId;
        Context applicationContext = zzqkVar.zzb() == null ? null : zzqkVar.zzb().getApplicationContext();
        this.zzd = applicationContext;
        this.zzy = zzc.zza;
        this.zzv = applicationContext != null ? null : zzqkVar.zzc();
        this.zzag = zzqkVar.zzd();
        zzqi zzqiVarZze = zzqkVar.zze();
        zzqiVarZze.getClass();
        this.zzah = zzqiVarZze;
        this.zzj = new zzqg(new zzqy(this, null));
        zzqh zzqhVar = new zzqh();
        this.zze = zzqhVar;
        zzrk zzrkVar = new zzrk();
        this.zzf = zzrkVar;
        this.zzg = new zzcj();
        this.zzh = new zzrj();
        this.zzi = zzgjz.zzk(zzrkVar, zzqhVar);
        this.zzL = 1.0f;
        this.zzT = 0;
        this.zzV = new zzd(0, 0.0f);
        zzau zzauVar = zzau.zza;
        this.zzA = new zzqs(zzauVar, 0L, 0L, null);
        this.zzB = zzauVar;
        this.zzC = false;
        this.zzk = new ArrayDeque();
        this.zzm = new zzqx();
        this.zzn = new zzqx();
        int i7 = -1;
        if (Build.VERSION.SDK_INT >= 34 && zzqkVar.zzb() != null && (deviceId = zzqkVar.zzb().getDeviceId()) != 0 && deviceId != -1) {
            i7 = deviceId;
        }
        this.zzo = i7;
        this.zzaf = true;
    }

    static /* synthetic */ void zzE(AudioTrack audioTrack, final zzpz zzpzVar, Handler handler, final zzpw zzpwVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzpzVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpzVar.zzc(zzpwVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i7 = zzc - 1;
                    zzc = i7;
                    if (i7 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (zzpzVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpzVar.zzc(zzpwVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i8 = zzc - 1;
                    zzc = i8;
                    if (i8 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    static /* synthetic */ boolean zzH() {
        boolean z7;
        synchronized (zza) {
            z7 = zzc > 0;
        }
        return z7;
    }

    private final void zzN() {
        zzcb zzcbVar = this.zzs.zzi;
        this.zzt = zzcbVar;
        zzcbVar.zzb(zzcd.zza);
    }

    private final AudioTrack zzO(zzql zzqlVar) throws zzpy {
        Context context;
        try {
            int i7 = this.zzT;
            int i8 = this.zzo;
            Context context2 = null;
            if (i8 != -1 && (context = this.zzd) != null && Build.VERSION.SDK_INT >= 34) {
                if (this.zzae == null) {
                    this.zzae = context.createDeviceContext(i8);
                }
                context2 = this.zzae;
                i7 = 0;
            }
            return zzaf(zzqlVar.zza(), this.zzy, i7, zzqlVar.zza, context2);
        } catch (zzpy e7) {
            zzpz zzpzVar = this.zzq;
            if (zzpzVar != null) {
                zzpzVar.zzb(e7);
            }
            throw e7;
        }
    }

    private final void zzP(long j7) throws zzqb {
        zzS(j7);
        if (this.zzO != null) {
            return;
        }
        if (!this.zzt.zzc()) {
            ByteBuffer byteBuffer = this.zzM;
            if (byteBuffer != null) {
                zzR(byteBuffer);
                zzS(j7);
                return;
            }
            return;
        }
        while (!this.zzt.zzg()) {
            do {
                ByteBuffer byteBufferZze = this.zzt.zze();
                if (byteBufferZze.hasRemaining()) {
                    zzR(byteBufferZze);
                    zzS(j7);
                } else {
                    ByteBuffer byteBuffer2 = this.zzM;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzt.zzd(this.zzM);
                    }
                }
            } while (this.zzO == null);
            return;
        }
    }

    private final boolean zzQ() throws zzqb {
        if (!this.zzt.zzc()) {
            zzS(Long.MIN_VALUE);
            return this.zzO == null;
        }
        this.zzt.zzf();
        zzP(Long.MIN_VALUE);
        if (!this.zzt.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzO;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0145  */
    /* JADX WARN: Code duplicated, block: B:49:0x0149  */
    /* JADX WARN: Code duplicated, block: B:51:0x014d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0151  */
    /* JADX WARN: Code duplicated, block: B:55:0x0155  */
    /* JADX WARN: Code duplicated, block: B:57:0x0159  */
    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Code duplicated, block: B:61:0x018a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0197  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x004b A[SYNTHETIC] */
    private final void zzR(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        zzghc.zzh(this.zzO == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzs.zzc == 0) {
                int iZzs = (int) zzeo.zzs(zzeo.zzq(20L), this.zzs.zze);
                long jZzG = zzG();
                long j7 = iZzs;
                if (jZzG < j7) {
                    zzql zzqlVar = this.zzs;
                    int i18 = zzqlVar.zzg;
                    int i19 = zzqlVar.zzd;
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i20 = (int) jZzG;
                    while (byteBuffer.hasRemaining() && i20 < iZzs) {
                        if (i18 != 2) {
                            if (i18 == 3) {
                                i9 = (byteBuffer.get() & 255) << 24;
                            } else if (i18 != 4) {
                                if (i18 != 21) {
                                    if (i18 == 22) {
                                        i14 = byteBuffer.get() & 255;
                                        i15 = (byteBuffer.get() & 255) << 8;
                                        i16 = (byteBuffer.get() & 255) << 16;
                                        i17 = (byteBuffer.get() & 255) << 24;
                                    } else if (i18 == 268435456) {
                                        i7 = (byteBuffer.get() & 255) << 24;
                                        i8 = (byteBuffer.get() & 255) << 16;
                                    } else if (i18 == 1342177280) {
                                        i11 = (byteBuffer.get() & 255) << 24;
                                        i12 = (byteBuffer.get() & 255) << 16;
                                        i13 = (byteBuffer.get() & 255) << 8;
                                    } else {
                                        if (i18 != 1610612736) {
                                            throw new IllegalStateException();
                                        }
                                        i14 = (byteBuffer.get() & 255) << 24;
                                        i15 = (byteBuffer.get() & 255) << 16;
                                        i16 = (byteBuffer.get() & 255) << 8;
                                        i17 = byteBuffer.get() & 255;
                                    }
                                    i9 = i14 | i15 | i16 | i17;
                                } else {
                                    i11 = (byteBuffer.get() & 255) << 8;
                                    i12 = (byteBuffer.get() & 255) << 16;
                                    i13 = (byteBuffer.get() & 255) << 24;
                                }
                                i9 = i11 | i12 | i13;
                            } else {
                                float fMax = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                i9 = (int) (fMax < 0.0f ? (-fMax) * (-2.1474836E9f) : fMax * 2.1474836E9f);
                            }
                            i10 = (int) ((((long) i9) * ((long) i20)) / j7);
                            if (i18 != 2) {
                                byteBufferOrder.put((byte) (i10 >> 16));
                                byteBufferOrder.put((byte) (i10 >> 24));
                            } else if (i18 != 3) {
                                byteBufferOrder.put((byte) (i10 >> 24));
                            } else if (i18 != 4) {
                                if (i18 != 21) {
                                    byteBufferOrder.put((byte) (i10 >> 8));
                                    byteBufferOrder.put((byte) (i10 >> 16));
                                    byteBufferOrder.put((byte) (i10 >> 24));
                                } else if (i18 != 22) {
                                    byteBufferOrder.put((byte) i10);
                                    byteBufferOrder.put((byte) (i10 >> 8));
                                    byteBufferOrder.put((byte) (i10 >> 16));
                                    byteBufferOrder.put((byte) (i10 >> 24));
                                } else if (i18 != 268435456) {
                                    byteBufferOrder.put((byte) (i10 >> 24));
                                    byteBufferOrder.put((byte) (i10 >> 16));
                                } else if (i18 != 1342177280) {
                                    byteBufferOrder.put((byte) (i10 >> 24));
                                    byteBufferOrder.put((byte) (i10 >> 16));
                                    byteBufferOrder.put((byte) (i10 >> 8));
                                } else {
                                    if (i18 == 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i10 >> 24));
                                    byteBufferOrder.put((byte) (i10 >> 16));
                                    byteBufferOrder.put((byte) (i10 >> 8));
                                    byteBufferOrder.put((byte) i10);
                                }
                            } else if (i10 < 0) {
                                byteBufferOrder.putFloat((-i10) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i10 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i19) {
                                i20++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i7 = (byteBuffer.get() & 255) << 16;
                            i8 = (byteBuffer.get() & 255) << 24;
                        }
                        i9 = i7 | i8;
                        i10 = (int) ((((long) i9) * ((long) i20)) / j7);
                        if (i18 != 2) {
                            byteBufferOrder.put((byte) (i10 >> 16));
                            byteBufferOrder.put((byte) (i10 >> 24));
                        } else if (i18 != 3) {
                            byteBufferOrder.put((byte) (i10 >> 24));
                        } else if (i18 != 4) {
                            if (i18 != 21) {
                                byteBufferOrder.put((byte) (i10 >> 8));
                                byteBufferOrder.put((byte) (i10 >> 16));
                                byteBufferOrder.put((byte) (i10 >> 24));
                            } else if (i18 != 22) {
                                byteBufferOrder.put((byte) i10);
                                byteBufferOrder.put((byte) (i10 >> 8));
                                byteBufferOrder.put((byte) (i10 >> 16));
                                byteBufferOrder.put((byte) (i10 >> 24));
                            } else if (i18 != 268435456) {
                                byteBufferOrder.put((byte) (i10 >> 24));
                                byteBufferOrder.put((byte) (i10 >> 16));
                            } else if (i18 != 1342177280) {
                                byteBufferOrder.put((byte) (i10 >> 24));
                                byteBufferOrder.put((byte) (i10 >> 16));
                                byteBufferOrder.put((byte) (i10 >> 8));
                            } else {
                                if (i18 == 1610612736) {
                                    throw new IllegalStateException();
                                }
                                byteBufferOrder.put((byte) (i10 >> 24));
                                byteBufferOrder.put((byte) (i10 >> 16));
                                byteBufferOrder.put((byte) (i10 >> 8));
                                byteBufferOrder.put((byte) i10);
                            }
                        } else if (i10 < 0) {
                            byteBufferOrder.putFloat((-i10) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i10 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i19) {
                            i20++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.zzO = byteBuffer2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    private final void zzS(long j7) throws zzqb {
        zzpz zzpzVar;
        if (this.zzO == null) {
            return;
        }
        zzqx zzqxVar = this.zzn;
        if (zzqxVar.zzb()) {
            return;
        }
        int iRemaining = this.zzO.remaining();
        boolean z7 = true;
        int iWrite = this.zzu.write(this.zzO, iRemaining, 1);
        this.zzX = SystemClock.elapsedRealtime();
        if (iWrite >= 0) {
            zzqxVar.zzc();
            if (zzac(this.zzu)) {
                if (this.zzG > 0) {
                    this.zzZ = false;
                }
                if (this.zzS && (zzpzVar = this.zzq) != null && iWrite < iRemaining) {
                }
            }
            int i7 = this.zzs.zzc;
            if (i7 == 0) {
                this.zzF += (long) iWrite;
            }
            if (iWrite == iRemaining) {
                if (i7 != 0) {
                    zzghc.zzh(this.zzO == this.zzM);
                    this.zzG += ((long) this.zzH) * ((long) this.zzN);
                }
                this.zzO = null;
                return;
            }
            return;
        }
        if (iWrite != -6 && iWrite != -32) {
            z7 = false;
        } else if (zzG() <= 0) {
            if (zzac(this.zzu)) {
                zzT();
            } else {
                z7 = false;
            }
        }
        zzqb zzqbVar = new zzqb(iWrite, this.zzs.zza, z7);
        zzpz zzpzVar2 = this.zzq;
        if (zzpzVar2 != null) {
            zzpzVar2.zzb(zzqbVar);
        }
        if (!zzqbVar.zzb || this.zzd == null) {
            zzqxVar.zza(zzqbVar);
            return;
        }
        zzoz zzozVar = zzoz.zza;
        this.zzv = zzozVar;
        this.zzw.zza(zzozVar);
        throw zzqbVar;
    }

    private final void zzT() {
        if (this.zzs.zzc == 1) {
            this.zzY = true;
        }
    }

    private final void zzU() {
        if (zzY()) {
            this.zzu.setVolume(this.zzL);
        }
    }

    private final void zzV(zzau zzauVar) {
        zzqs zzqsVar = new zzqs(zzauVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzY()) {
            this.zzz = zzqsVar;
        } else {
            this.zzA = zzqsVar;
        }
    }

    private final void zzW(long j7) {
        zzau zzauVar;
        boolean z7;
        if (zzX()) {
            zzqm zzqmVar = this.zzag;
            zzauVar = this.zzB;
            zzqmVar.zzb(zzauVar);
        } else {
            zzauVar = zzau.zza;
        }
        zzau zzauVar2 = zzauVar;
        this.zzB = zzauVar2;
        if (zzX()) {
            zzqm zzqmVar2 = this.zzag;
            z7 = this.zzC;
            zzqmVar2.zzc(z7);
        } else {
            z7 = false;
        }
        this.zzC = z7;
        this.zzk.add(new zzqs(zzauVar2, Math.max(0L, j7), zzeo.zzr(zzG(), this.zzs.zze), null));
        zzN();
        zzpz zzpzVar = this.zzq;
        if (zzpzVar != null) {
            ((zzrf) zzpzVar).zza.zzav().zzh(this.zzC);
        }
    }

    private final boolean zzX() {
        zzql zzqlVar = this.zzs;
        if (zzqlVar.zzc != 0) {
            return false;
        }
        int i7 = zzqlVar.zza.zzI;
        return true;
    }

    private final boolean zzY() {
        return this.zzu != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
    public final long zzF() {
        zzql zzqlVar = this.zzs;
        return zzqlVar.zzc == 0 ? this.zzD / ((long) zzqlVar.zzb) : this.zzE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaa, reason: merged with bridge method [inline-methods] */
    public final long zzG() {
        zzql zzqlVar = this.zzs;
        if (zzqlVar.zzc != 0) {
            return this.zzG;
        }
        long j7 = this.zzF;
        long j8 = zzqlVar.zzd;
        String str = zzeo.zza;
        return ((j7 + j8) - 1) / j8;
    }

    private final void zzab() {
        Context context;
        Looper looperMyLooper = Looper.myLooper();
        boolean z7 = true;
        if (this.zzw != null && this.zzaa != looperMyLooper) {
            z7 = false;
        }
        zzghc.zzj(z7, "DefaultAudioSink accessed on multiple threads: %s and %s", zzae(this.zzaa), zzae(looperMyLooper));
        if (this.zzw == null && (context = this.zzd) != null) {
            this.zzaa = looperMyLooper;
            zzpe zzpeVar = new zzpe(context, new zzpd() { // from class: com.google.android.gms.internal.ads.zzqn
                @Override // com.google.android.gms.internal.ads.zzpd
                public final /* synthetic */ void zza(zzoz zzozVar) {
                    this.zza.zzC(zzozVar);
                }
            }, this.zzy, this.zzW);
            this.zzw = zzpeVar;
            this.zzv = zzpeVar.zzd();
        }
        this.zzv.getClass();
    }

    private static boolean zzac(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final void zzad() {
        if (this.zzQ) {
            return;
        }
        this.zzQ = true;
        this.zzj.zzg(zzG());
        if (zzac(this.zzu)) {
            this.zzR = false;
        }
        this.zzu.stop();
    }

    private static String zzae(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    private static final AudioTrack zzaf(zzpw zzpwVar, zzc zzcVar, int i7, zzu zzuVar, Context context) throws zzpy {
        Exception exc;
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzcVar.zza()).setAudioFormat(zzeo.zzC(zzpwVar.zzb, zzpwVar.zzc, zzpwVar.zza)).setTransferMode(1).setBufferSizeInBytes(zzpwVar.zze).setSessionId(i7);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 29) {
                try {
                    sessionId.setOffloadedPlayback(zzpwVar.zzd);
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    exc = e;
                    throw new zzpy(0, zzpwVar.zzb, zzpwVar.zzc, zzpwVar.zza, zzpwVar.zze, zzuVar, zzpwVar.zzd, exc);
                } catch (UnsupportedOperationException e8) {
                    e = e8;
                    exc = e;
                    throw new zzpy(0, zzpwVar.zzb, zzpwVar.zzc, zzpwVar.zza, zzpwVar.zze, zzuVar, zzpwVar.zzd, exc);
                }
            }
            if (i8 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            int state = audioTrackBuild.getState();
            if (state == 1) {
                return audioTrackBuild;
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new zzpy(state, zzpwVar.zzb, zzpwVar.zzc, zzpwVar.zza, zzpwVar.zze, zzuVar, zzpwVar.zzd, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e9) {
            exc = e9;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzA() {
        zzz();
        zzgjz zzgjzVar = this.zzi;
        int size = zzgjzVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((zzcf) zzgjzVar.get(i7)).zzj();
        }
        this.zzg.zzj();
        this.zzh.zzj();
        zzcb zzcbVar = this.zzt;
        if (zzcbVar != null) {
            zzcbVar.zzh();
        }
        this.zzS = false;
        this.zzY = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzB() {
        zzpe zzpeVar = this.zzw;
        if (zzpeVar != null) {
            zzpeVar.zze();
        }
    }

    public final void zzC(zzoz zzozVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zzaa;
        zzghc.zzj(looper == looperMyLooper, "Current looper (%s) is not the playback looper (%s)", zzae(looperMyLooper), zzae(this.zzaa));
        zzoz zzozVar2 = this.zzv;
        if (zzozVar2 == null || zzozVar.equals(zzozVar2)) {
            return;
        }
        this.zzv = zzozVar;
        zzpz zzpzVar = this.zzq;
        if (zzpzVar != null) {
            ((zzrf) zzpzVar).zza.zzR();
        }
    }

    final /* synthetic */ void zzD() {
        if (this.zzac >= 300000) {
            ((zzrf) this.zzq).zza.zzax(true);
            this.zzac = 0L;
        }
    }

    final /* synthetic */ zzpz zzI() {
        return this.zzq;
    }

    final /* synthetic */ AudioTrack zzJ() {
        return this.zzu;
    }

    final /* synthetic */ void zzK(boolean z7) {
        this.zzR = true;
    }

    final /* synthetic */ boolean zzL() {
        return this.zzS;
    }

    final /* synthetic */ long zzM() {
        return this.zzX;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zza(zzpz zzpzVar) {
        this.zzq = zzpzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzb(zzox zzoxVar) {
        this.zzp = zzoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzc(zzdb zzdbVar) {
        this.zzj.zzk(zzdbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzd(zzu zzuVar) {
        return zze(zzuVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final int zze(zzu zzuVar) {
        zzab();
        if (!"audio/raw".equals(zzuVar.zzo)) {
            return this.zzv.zzd(zzuVar, this.zzy) != null ? 2 : 0;
        }
        int i7 = zzuVar.zzI;
        if (zzeo.zzA(i7)) {
            return i7 != 2 ? 1 : 2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 22);
        sb.append("Invalid PCM encoding: ");
        sb.append(i7);
        zzds.zzc("DefaultAudioSink", sb.toString());
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final zzpg zzf(zzu zzuVar) {
        return this.zzY ? zzpg.zza : this.zzah.zza(zzuVar, this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final long zzg(boolean z7) {
        ArrayDeque arrayDeque;
        long j7;
        if (!zzY() || this.zzJ) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzj.zzb(), zzeo.zzr(zzG(), this.zzs.zze));
        while (true) {
            arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || jMin < ((zzqs) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzA = (zzqs) arrayDeque.remove();
        }
        zzqs zzqsVar = this.zzA;
        long j8 = jMin - zzqsVar.zzc;
        long jZzv = zzeo.zzv(j8, zzqsVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long jZzd = this.zzag.zzd(j8);
            zzqs zzqsVar2 = this.zzA;
            j7 = zzqsVar2.zzb + jZzd;
            zzqsVar2.zzd = jZzd - jZzv;
        } else {
            zzqs zzqsVar3 = this.zzA;
            j7 = zzqsVar3.zzb + jZzv + zzqsVar3.zzd;
        }
        long jZze = this.zzag.zze();
        long jZzr = j7 + zzeo.zzr(jZze, this.zzs.zze);
        long j9 = this.zzab;
        if (jZze > j9) {
            long jZzr2 = zzeo.zzr(jZze - j9, this.zzs.zze);
            this.zzab = jZze;
            this.zzac += jZzr2;
            if (this.zzad == null) {
                this.zzad = new Handler(Looper.myLooper());
            }
            this.zzad.removeCallbacksAndMessages(null);
            this.zzad.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzD();
                }
            }, 100L);
        }
        return jZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzh(zzu zzuVar, int i7, int[] iArr) throws zzpx {
        zzcb zzcbVar;
        int i8;
        int i9;
        int iZzE;
        int iIntValue;
        int i10;
        int i11;
        zzab();
        if ("audio/raw".equals(zzuVar.zzo)) {
            int i12 = zzuVar.zzI;
            zzghc.zza(zzeo.zzA(i12));
            int i13 = zzuVar.zzG;
            iZzE = zzeo.zzE(i12) * i13;
            zzgjw zzgjwVar = new zzgjw();
            zzgjwVar.zzh(this.zzi);
            zzgjwVar.zzf(this.zzg);
            zzgjwVar.zzg(this.zzag.zza());
            zzcbVar = new zzcb(zzgjwVar.zzi());
            if (zzcbVar.equals(this.zzt)) {
                zzcbVar = this.zzt;
            }
            this.zzf.zzq(zzuVar.zzJ, zzuVar.zzK);
            this.zze.zzq(iArr);
            try {
                zzcc zzccVarZza = zzcbVar.zza(new zzcc(zzuVar.zzH, i13, i12));
                int i14 = zzccVarZza.zzd;
                i8 = zzccVarZza.zzb;
                int i15 = zzccVarZza.zzc;
                int iZzB = zzeo.zzB(i15);
                int iZzE2 = zzeo.zzE(i14) * i15;
                i9 = 0;
                iIntValue = iZzB;
                i10 = i14;
                i11 = iZzE2;
            } catch (zzce e7) {
                throw new zzpx(e7, zzuVar);
            }
        } else {
            zzcbVar = new zzcb(zzgjz.zzi());
            i8 = zzuVar.zzH;
            zzpg zzpgVar = zzpg.zza;
            Pair pairZzd = this.zzv.zzd(zzuVar, this.zzy);
            if (pairZzd == null) {
                throw new zzpx("Unable to configure passthrough for: ".concat(String.valueOf(zzuVar)), zzuVar);
            }
            int iIntValue2 = ((Integer) pairZzd.first).intValue();
            i9 = 2;
            iZzE = -1;
            iIntValue = ((Integer) pairZzd.second).intValue();
            i10 = iIntValue2;
            i11 = -1;
        }
        int i16 = i8;
        if (i10 == 0) {
            String strValueOf = String.valueOf(zzuVar);
            StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 37 + strValueOf.length());
            sb.append("Invalid output encoding (mode=");
            sb.append(i9);
            sb.append(") for: ");
            sb.append(strValueOf);
            throw new zzpx(sb.toString(), zzuVar);
        }
        if (iIntValue == 0) {
            String strValueOf2 = String.valueOf(zzuVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(i9).length() + 43 + strValueOf2.length());
            sb2.append("Invalid output channel config (mode=");
            sb2.append(i9);
            sb2.append(") for: ");
            sb2.append(strValueOf2);
            throw new zzpx(sb2.toString(), zzuVar);
        }
        int i17 = zzuVar.zzj;
        if ("audio/vnd.dts.hd;profile=lbr".equals(zzuVar.zzo) && i17 == -1) {
            i17 = 768000;
        }
        int i18 = i17;
        int minBufferSize = AudioTrack.getMinBufferSize(i16, iIntValue, i10);
        zzghc.zzh(minBufferSize != -2);
        int i19 = i11 != -1 ? i11 : 1;
        int i20 = i10;
        int iZzb = zzre.zzb(minBufferSize, i20, i9, i19, i16, i18);
        int i21 = i19;
        int iMax = (((Math.max(minBufferSize, iZzb) + i21) - 1) / i21) * i21;
        this.zzY = false;
        zzql zzqlVar = new zzql(zzuVar, iZzE, i9, i11, i16, iIntValue, i20, iMax, zzcbVar, false, false, false);
        if (zzY()) {
            this.zzr = zzqlVar;
        } else {
            this.zzs = zzqlVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzi() {
        this.zzS = true;
        if (zzY()) {
            this.zzj.zzc();
            if (!this.zzQ || zzac(this.zzu)) {
                this.zzu.play();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzj() {
        this.zzI = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:133:0x028f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0294  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x02c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:151:0x0304  */
    /* JADX WARN: Code duplicated, block: B:153:0x0320  */
    /* JADX WARN: Code duplicated, block: B:215:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzk(ByteBuffer byteBuffer, long j7, int i7) throws zzpy, zzqb {
        AudioTrack audioTrackZzO;
        zzox zzoxVar;
        boolean z7;
        int iZzb;
        int iPosition;
        byte b7;
        int i8;
        int i9;
        byte b8;
        int i10;
        int i11;
        ByteBuffer byteBuffer2 = this.zzM;
        zzghc.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzr != null) {
            if (!zzQ()) {
                return false;
            }
            zzql zzqlVar = this.zzr;
            zzql zzqlVar2 = this.zzs;
            if (zzqlVar2.zzc == zzqlVar.zzc && zzqlVar2.zzg == zzqlVar.zzg && zzqlVar2.zze == zzqlVar.zze && zzqlVar2.zzf == zzqlVar.zzf && zzqlVar2.zzd == zzqlVar.zzd) {
                this.zzs = zzqlVar;
                this.zzr = null;
                AudioTrack audioTrack = this.zzu;
                if (audioTrack != null && zzac(audioTrack)) {
                    boolean z8 = this.zzs.zzk;
                }
            } else {
                zzad();
                if (zzn()) {
                    return false;
                }
                zzz();
            }
            zzW(j7);
        }
        if (!zzY()) {
            try {
                if (this.zzm.zzb()) {
                    return false;
                }
                try {
                    zzql zzqlVar3 = this.zzs;
                    if (zzqlVar3 == null) {
                        throw null;
                    }
                    audioTrackZzO = zzO(zzqlVar3);
                    this.zzu = audioTrackZzO;
                    if (zzac(audioTrackZzO)) {
                        AudioTrack audioTrack2 = this.zzu;
                        if (this.zzl == null) {
                            this.zzl = new zzrb(this);
                        }
                        this.zzl.zza(audioTrack2);
                        boolean z9 = this.zzs.zzk;
                    }
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 31 && (zzoxVar = this.zzp) != null) {
                        AudioTrack audioTrack3 = this.zzu;
                        LogSessionId logSessionIdZza = zzoxVar.zza();
                        if (!logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                            audioTrack3.setLogSessionId(logSessionIdZza);
                        }
                    }
                    zzqg zzqgVar = this.zzj;
                    AudioTrack audioTrack4 = this.zzu;
                    zzql zzqlVar4 = this.zzs;
                    zzqgVar.zza(audioTrack4, zzqlVar4.zzg, zzqlVar4.zzd, zzqlVar4.zzh, this.zzaf);
                    zzU();
                    int i13 = this.zzV.zza;
                    AudioDeviceInfo audioDeviceInfo = this.zzW;
                    if (audioDeviceInfo != null) {
                        this.zzu.setPreferredDevice(audioDeviceInfo);
                        zzpe zzpeVar = this.zzw;
                        if (zzpeVar != null) {
                            zzpeVar.zzc(this.zzW);
                        }
                    }
                    zzpe zzpeVar2 = this.zzw;
                    if (zzpeVar2 != null) {
                        this.zzx = new zzqw(this.zzu, zzpeVar2);
                    }
                    this.zzJ = true;
                    int audioSessionId = this.zzu.getAudioSessionId();
                    int i14 = this.zzT;
                    this.zzT = audioSessionId;
                    zzpz zzpzVar = this.zzq;
                    if (zzpzVar != null) {
                        ((zzrf) zzpzVar).zza.zzav().zzk(this.zzs.zza());
                        if (audioSessionId != i14) {
                            this.zzU = true;
                            zzpz zzpzVar2 = this.zzq;
                            int i15 = this.zzT;
                            if (i12 >= 35) {
                                zzrg zzrgVar = ((zzrf) zzpzVar2).zza;
                                if (zzrgVar.zzaw() != null) {
                                    zzrgVar.zzaw().zza(i15);
                                }
                            }
                            ((zzrf) zzpzVar2).zza.zzav().zzm(i15);
                        }
                    }
                } catch (zzpy e7) {
                    zzql zzqlVar5 = this.zzs;
                    if (zzqlVar5.zzh > 1000000) {
                        zzql zzqlVar6 = new zzql(zzqlVar5.zza, zzqlVar5.zzb, zzqlVar5.zzc, zzqlVar5.zzd, zzqlVar5.zze, zzqlVar5.zzf, zzqlVar5.zzg, 1000000, zzqlVar5.zzi, false, false, false);
                        try {
                            audioTrackZzO = zzO(zzqlVar6);
                            this.zzs = zzqlVar6;
                        } catch (zzpy e8) {
                            e7.addSuppressed(e8);
                            zzT();
                            throw e7;
                        }
                    }
                    zzT();
                    throw e7;
                }
            } catch (zzpy e9) {
                if (e9.zzb) {
                    throw e9;
                }
                this.zzm.zza(e9);
                return false;
            }
        }
        this.zzm.zzc();
        if (this.zzJ) {
            this.zzK = Math.max(0L, j7);
            this.zzI = false;
            this.zzJ = false;
            zzW(j7);
            if (this.zzS) {
                zzi();
            }
        }
        zzqg zzqgVar2 = this.zzj;
        zzqgVar2.zze(zzG());
        if (this.zzM == null) {
            zzghc.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zzql zzqlVar7 = this.zzs;
            if (zzqlVar7.zzc != 0 && this.zzH == 0) {
                int i16 = zzqlVar7.zzg;
                if (i16 == 20) {
                    z7 = true;
                    iZzb = zzadr.zzb(byteBuffer);
                } else if (i16 != 30) {
                    switch (i16) {
                        case 5:
                        case 6:
                            iZzb = zzabv.zze(byteBuffer);
                            z7 = true;
                            break;
                        case 7:
                        case 8:
                            int i17 = zzact.zza;
                            if (byteBuffer.getInt(0) == -233094848) {
                                z7 = true;
                                iZzb = 1024;
                            } else {
                                if (byteBuffer.getInt(0) == -398277519) {
                                    iZzb = 1024;
                                } else if (byteBuffer.getInt(0) != 622876772) {
                                    iPosition = byteBuffer.position();
                                    b7 = byteBuffer.get(iPosition);
                                    if (b7 != -2) {
                                        if (b7 != -1) {
                                            if (b7 != 31) {
                                                i9 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                                i10 = byteBuffer.get(iPosition + 5) & 252;
                                            } else {
                                                i9 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                                b8 = byteBuffer.get(iPosition + 6);
                                            }
                                            i8 = (i10 >> 2) | i9;
                                            z7 = true;
                                        } else {
                                            i9 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                            b8 = byteBuffer.get(iPosition + 7);
                                        }
                                        i10 = b8 & 60;
                                        i8 = (i10 >> 2) | i9;
                                        z7 = true;
                                    } else {
                                        z7 = true;
                                        i8 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                                    }
                                    iZzb = (i8 + 1) * 32;
                                } else {
                                    iZzb = 4096;
                                }
                                z7 = true;
                            }
                            break;
                        case 9:
                            iZzb = zzadp.zzb(zzeo.zzK(byteBuffer, byteBuffer.position()));
                            if (iZzb == -1) {
                                throw new IllegalArgumentException();
                            }
                            z7 = true;
                            break;
                        case 10:
                            iZzb = 1024;
                            z7 = true;
                            break;
                        case 11:
                        case 12:
                            iZzb = 2048;
                            z7 = true;
                            break;
                        default:
                            switch (i16) {
                                case 14:
                                    int i18 = zzabv.zza;
                                    int iPosition2 = byteBuffer.position();
                                    int iLimit = byteBuffer.limit() - 10;
                                    int i19 = iPosition2;
                                    while (true) {
                                        if (i19 > iLimit) {
                                            i11 = -1;
                                        } else if ((zzeo.zzK(byteBuffer, i19 + 4) & (-2)) == -126718022) {
                                            i11 = i19 - iPosition2;
                                        } else {
                                            i19++;
                                        }
                                    }
                                    if (i11 != -1) {
                                        iZzb = (40 << ((byteBuffer.get((byteBuffer.position() + i11) + ((byteBuffer.get((byteBuffer.position() + i11) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                    } else {
                                        iZzb = 0;
                                    }
                                    break;
                                case 15:
                                    iZzb = 512;
                                    break;
                                case 16:
                                    iZzb = 1024;
                                    break;
                                case 17:
                                    int i20 = zzaby.zza;
                                    byte[] bArr = new byte[16];
                                    int iPosition3 = byteBuffer.position();
                                    byteBuffer.get(bArr);
                                    byteBuffer.position(iPosition3);
                                    iZzb = zzaby.zzb(new zzee(bArr, 16)).zzc;
                                    break;
                                case 18:
                                    iZzb = zzabv.zze(byteBuffer);
                                    break;
                                default:
                                    StringBuilder sb = new StringBuilder(String.valueOf(i16).length() + 27);
                                    sb.append("Unexpected audio encoding: ");
                                    sb.append(i16);
                                    throw new IllegalStateException(sb.toString());
                            }
                            z7 = true;
                            break;
                    }
                } else {
                    int i110 = zzact.zza;
                    if (byteBuffer.getInt(0) == -233094848) {
                        if (byteBuffer.getInt(0) == -398277519) {
                            iZzb = 1024;
                        } else if (byteBuffer.getInt(0) != 622876772) {
                            iZzb = 4096;
                        } else {
                            iPosition = byteBuffer.position();
                            b7 = byteBuffer.get(iPosition);
                            if (b7 != -2) {
                                if (b7 != -1) {
                                    if (b7 != 31) {
                                        i9 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                        i10 = byteBuffer.get(iPosition + 5) & 252;
                                    } else {
                                        i9 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                        b8 = byteBuffer.get(iPosition + 6);
                                    }
                                    i8 = (i10 >> 2) | i9;
                                    z7 = true;
                                } else {
                                    i9 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                    b8 = byteBuffer.get(iPosition + 7);
                                }
                                i10 = b8 & 60;
                                i8 = (i10 >> 2) | i9;
                                z7 = true;
                            } else {
                                z7 = true;
                                i8 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                            }
                            iZzb = (i8 + 1) * 32;
                        }
                        z7 = true;
                    } else {
                        z7 = true;
                        iZzb = 1024;
                    }
                }
                this.zzH = iZzb;
                if (iZzb == 0) {
                    return z7;
                }
            }
            if (this.zzz != null) {
                if (!zzQ()) {
                    return false;
                }
                zzW(j7);
                this.zzz = null;
            }
            long jZzr = this.zzK + zzeo.zzr(zzF() - this.zzf.zzs(), this.zzs.zza.zzH);
            if (!this.zzI && Math.abs(jZzr - j7) > 200000) {
                zzpz zzpzVar3 = this.zzq;
                if (zzpzVar3 != null) {
                    zzpzVar3.zzb(new zzqa(j7, jZzr));
                }
                this.zzI = true;
            }
            if (this.zzI) {
                if (!zzQ()) {
                    return false;
                }
                long j8 = j7 - jZzr;
                this.zzK += j8;
                this.zzI = false;
                zzW(j7);
                zzpz zzpzVar4 = this.zzq;
                if (zzpzVar4 != null && j8 != 0) {
                    ((zzrf) zzpzVar4).zza.zzan();
                }
            }
            if (this.zzs.zzc == 0) {
                this.zzD += (long) byteBuffer.remaining();
            } else {
                this.zzE += ((long) this.zzH) * ((long) i7);
            }
            this.zzM = byteBuffer;
            this.zzN = i7;
        }
        zzP(j7);
        if (!this.zzM.hasRemaining()) {
            this.zzM = null;
            this.zzN = 0;
            return true;
        }
        if (!zzqgVar2.zzf(zzG())) {
            return false;
        }
        zzds.zzc("DefaultAudioSink", "Resetting stalled audio track");
        zzz();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzl() {
        if (!this.zzP && zzY() && zzQ()) {
            zzad();
            this.zzP = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzm() {
        if (zzY()) {
            return this.zzP && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzn() {
        if (zzY()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.zzu.isOffloadedPlayback() && this.zzR) && this.zzj.zzh(zzG());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzo(zzau zzauVar) {
        float f7 = zzauVar.zzb;
        String str = zzeo.zza;
        this.zzB = new zzau(Math.max(0.1f, Math.min(f7, 8.0f)), Math.max(0.1f, Math.min(zzauVar.zzc, 8.0f)));
        zzV(zzauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final zzau zzp() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzq(boolean z7) {
        this.zzC = z7;
        zzV(this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzr(zzc zzcVar) {
        if (this.zzy.equals(zzcVar)) {
            return;
        }
        this.zzy = zzcVar;
        zzpe zzpeVar = this.zzw;
        if (zzpeVar != null) {
            zzpeVar.zzb(zzcVar);
        }
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzs(int i7) {
        if (this.zzU) {
            if (this.zzT != i7) {
                return;
            } else {
                this.zzU = false;
            }
        }
        if (this.zzT != i7) {
            this.zzT = i7;
            zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzt(zzd zzdVar) {
        if (this.zzV.equals(zzdVar)) {
            return;
        }
        if (this.zzu != null) {
            int i7 = this.zzV.zza;
        }
        this.zzV = zzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        this.zzW = audioDeviceInfo;
        zzpe zzpeVar = this.zzw;
        if (zzpeVar != null) {
            zzpeVar.zzc(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            audioTrack.setPreferredDevice(this.zzW);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final long zzv() {
        if (!zzY()) {
            return -9223372036854775807L;
        }
        zzql zzqlVar = this.zzs;
        if (zzqlVar.zzc == 0) {
            return zzeo.zzr(this.zzu.getBufferSizeInFrames(), zzqlVar.zze);
        }
        long bufferSizeInFrames = this.zzu.getBufferSizeInFrames();
        int iZzf = zzacy.zzf(this.zzs.zzg);
        zzghc.zzh(iZzf != -2147483647);
        return zzeo.zzt(bufferSizeInFrames, 1000000L, iZzf, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzw(int i7, int i8) {
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzac(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzx(float f7) {
        if (this.zzL != f7) {
            this.zzL = f7;
            zzU();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzy() {
        this.zzS = false;
        if (zzY()) {
            this.zzj.zzi();
            if (!this.zzQ || zzac(this.zzu)) {
                this.zzu.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzz() {
        if (zzY()) {
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzZ = false;
            this.zzH = 0;
            this.zzA = new zzqs(this.zzB, 0L, 0L, null);
            this.zzK = 0L;
            this.zzz = null;
            this.zzk.clear();
            this.zzM = null;
            this.zzN = 0;
            this.zzO = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzR = false;
            this.zzf.zzr();
            zzN();
            zzqg zzqgVar = this.zzj;
            if (zzqgVar.zzd()) {
                this.zzu.pause();
            }
            if (zzac(this.zzu)) {
                zzrb zzrbVar = this.zzl;
                zzrbVar.getClass();
                zzrbVar.zzb(this.zzu);
            }
            final zzpw zzpwVarZza = this.zzs.zza();
            zzql zzqlVar = this.zzr;
            if (zzqlVar != null) {
                this.zzs = zzqlVar;
                this.zzr = null;
            }
            zzqgVar.zzj();
            zzqw zzqwVar = this.zzx;
            if (zzqwVar != null) {
                zzqwVar.zza();
                this.zzx = null;
            }
            final AudioTrack audioTrack = this.zzu;
            final zzpz zzpzVar = this.zzq;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                try {
                    if (zzb == null) {
                        zzb = zzeo.zzg("ExoPlayer:AudioTrackReleaseThread");
                    }
                    zzc++;
                    zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqo
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzrc.zzE(audioTrack, zzpzVar, handler, zzpwVarZza);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.zzu = null;
        }
        this.zzn.zzc();
        this.zzm.zzc();
        this.zzab = 0L;
        this.zzac = 0L;
        Handler handler2 = this.zzad;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }
}
