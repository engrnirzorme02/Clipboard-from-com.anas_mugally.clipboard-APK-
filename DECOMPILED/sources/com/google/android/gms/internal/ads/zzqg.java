package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class zzqg {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private zzdb zzG;
    boolean zza;
    private final zzqf zzb;
    private final long[] zzc;
    private AudioTrack zzd;
    private int zze;
    private zzqe zzf;
    private int zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private Method zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzqg(zzqf zzqfVar) {
        this.zzb = zzqfVar;
        try {
            this.zzo = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzD = -9223372036854775807L;
        this.zzC = -9223372036854775807L;
        this.zzG = zzdb.zza;
    }

    private final void zzl(long j7) {
        if (this.zza) {
            long j8 = this.zzk;
            if (j8 == -9223372036854775807L || j7 < j8) {
                return;
            }
            long jZza = this.zzG.zza() - zzeo.zzp(zzeo.zzw(j7 - j8, this.zzi));
            this.zzk = -9223372036854775807L;
            this.zzb.zza(jZza);
        }
    }

    private final long zzm(long j7) {
        long jZzv;
        if (this.zzx == 0) {
            jZzv = this.zzy != -9223372036854775807L ? zzeo.zzr(zzq(), this.zzg) : zzo();
        } else {
            jZzv = zzeo.zzv(j7 + this.zzm, this.zzi);
        }
        long jMax = Math.max(0L, jZzv - this.zzp);
        return this.zzy != -9223372036854775807L ? Math.min(zzeo.zzr(this.zzB, this.zzg), jMax) : jMax;
    }

    private final void zzn() {
        this.zzm = 0L;
        this.zzx = 0;
        this.zzw = 0;
        this.zzn = 0L;
        this.zzC = -9223372036854775807L;
        this.zzD = -9223372036854775807L;
        this.zzj = false;
    }

    private final long zzo() {
        return zzeo.zzr(zzp(), this.zzg);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    private final long zzp() {
        if (this.zzy != -9223372036854775807L) {
            return Math.min(this.zzB, zzq());
        }
        long jZzb = this.zzG.zzb();
        if (jZzb - this.zzt >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    if (this.zzu > playbackHeadPosition) {
                        this.zzv++;
                    }
                    this.zzu = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.zzu <= 0 || playState != 3) {
                    this.zzz = -9223372036854775807L;
                    if (this.zzu > playbackHeadPosition) {
                        this.zzv++;
                    }
                    this.zzu = playbackHeadPosition;
                } else if (this.zzz == -9223372036854775807L) {
                    this.zzz = jZzb;
                }
            }
            this.zzt = jZzb;
        }
        return this.zzu + this.zzF + (this.zzv << 32);
    }

    private final long zzq() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzA;
        }
        return this.zzA + zzeo.zzs(zzeo.zzv(zzeo.zzq(this.zzG.zzb()) - this.zzy, this.zzi), this.zzg);
    }

    public final void zza(AudioTrack audioTrack, int i7, int i8, int i9, boolean z7) {
        this.zzd = audioTrack;
        this.zze = i9;
        this.zzf = new zzqe(audioTrack, this.zzb);
        this.zzg = audioTrack.getSampleRate();
        boolean zZzA = zzeo.zzA(i7);
        this.zzr = zZzA;
        this.zzh = zZzA ? zzeo.zzr(i9 / i8, this.zzg) : -9223372036854775807L;
        this.zzu = 0L;
        this.zzv = 0L;
        this.zzE = false;
        this.zzF = 0L;
        this.zzq = false;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzs = 0L;
        this.zzp = 0L;
        this.zzi = 1.0f;
        this.zzl = 0;
        this.zzk = -9223372036854775807L;
        this.zza = z7;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    public final long zzb() {
        long j7;
        Method method;
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        long j8 = 1000;
        if (audioTrack.getPlayState() == 3) {
            long jZzc = this.zzG.zzc() / 1000;
            if (jZzc - this.zzn >= 30000) {
                long jZzo = zzo();
                if (jZzo != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzw] = zzeo.zzw(jZzo, this.zzi) - jZzc;
                    this.zzw = (this.zzw + 1) % 10;
                    int i7 = this.zzx;
                    if (i7 < 10) {
                        this.zzx = i7 + 1;
                    }
                    this.zzn = jZzc;
                    this.zzm = 0L;
                    int i8 = 0;
                    while (true) {
                        int i9 = this.zzx;
                        if (i8 >= i9) {
                            break;
                        }
                        this.zzm += jArr[i8] / ((long) i9);
                        i8++;
                        j8 = j8;
                    }
                } else {
                    j7 = 1000;
                }
            }
            j7 = j8;
            if (this.zzr && (method = this.zzo) != null && jZzc - this.zzs >= 500000) {
                try {
                    AudioTrack audioTrack2 = this.zzd;
                    if (audioTrack2 == null) {
                        throw null;
                    }
                    Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                    String str = zzeo.zza;
                    long jIntValue = (((long) num.intValue()) * j7) - this.zzh;
                    this.zzp = jIntValue;
                    long jMax = Math.max(jIntValue, 0L);
                    this.zzp = jMax;
                    if (jMax > 5000000) {
                        this.zzb.zzd(jMax);
                        this.zzp = 0L;
                    }
                    this.zzs = jZzc;
                } catch (Exception unused) {
                    this.zzo = null;
                }
            }
            zzqe zzqeVar = this.zzf;
            zzqeVar.getClass();
            zzqeVar.zza(jZzc, this.zzi, zzm(jZzc));
        } else {
            j7 = 1000;
        }
        long jZzc2 = this.zzG.zzc() / j7;
        zzqe zzqeVar2 = this.zzf;
        zzqeVar2.getClass();
        boolean zZzb = zzqeVar2.zzb();
        long jZze = zZzb ? zzqeVar2.zze(jZzc2, this.zzi) : zzm(jZzc2);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zZzb || !zzqeVar2.zzc()) {
                zzl(jZze);
            }
            long j9 = this.zzD;
            if (j9 != -9223372036854775807L) {
                long j10 = jZze - this.zzC;
                long jZzv = zzeo.zzv(jZzc2 - j9, this.zzi);
                long j11 = this.zzC + jZzv;
                long jAbs = Math.abs(j11 - jZze);
                if (j10 != 0 && jAbs < 1000000) {
                    long j12 = (jZzv * 10) / 100;
                    jZze = Math.max(j11 - j12, Math.min(jZze, j11 + j12));
                }
            }
            if (!this.zza && !this.zzj) {
                long j13 = this.zzC;
                if (j13 != -9223372036854775807L && jZze > j13) {
                    this.zzj = true;
                    String str2 = zzeo.zza;
                    this.zzb.zza(this.zzG.zza() - zzeo.zzp(zzeo.zzw(zzeo.zzp(jZze - j13), this.zzi)));
                }
            }
            this.zzD = jZzc2;
            this.zzC = jZze;
        } else if (playState == 1) {
            zzl(jZze);
            return jZze;
        }
        return jZze;
    }

    public final void zzc() {
        if (this.zzy != -9223372036854775807L) {
            this.zzy = zzeo.zzq(this.zzG.zzb());
        }
        this.zzk = zzo();
        zzqe zzqeVar = this.zzf;
        zzqeVar.getClass();
        zzqeVar.zzd();
    }

    public final boolean zzd() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zze(long j7) {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        audioTrack.getPlayState();
        AudioTrack audioTrack2 = this.zzd;
        audioTrack2.getClass();
        int underrunCount = audioTrack2.getUnderrunCount();
        boolean z7 = underrunCount > this.zzl;
        this.zzl = underrunCount;
        if (z7) {
            this.zzb.zze(this.zze, zzeo.zzp(this.zzh));
        }
        return true;
    }

    public final boolean zzf(long j7) {
        return this.zzz != -9223372036854775807L && j7 > 0 && this.zzG.zzb() - this.zzz >= 200;
    }

    public final void zzg(long j7) {
        this.zzA = zzp();
        this.zzy = zzeo.zzq(this.zzG.zzb());
        this.zzB = j7;
    }

    public final boolean zzh(long j7) {
        return j7 > zzeo.zzs(zzb(), this.zzg);
    }

    public final void zzi() {
        zzn();
        if (this.zzy == -9223372036854775807L) {
            zzqe zzqeVar = this.zzf;
            zzqeVar.getClass();
            zzqeVar.zzd();
        }
        this.zzA = zzp();
    }

    public final void zzj() {
        zzn();
        this.zzd = null;
        this.zzf = null;
    }

    public final void zzk(zzdb zzdbVar) {
        this.zzG = zzdbVar;
    }
}
