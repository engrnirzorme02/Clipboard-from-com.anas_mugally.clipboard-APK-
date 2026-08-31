package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzot implements zzmg, zzou {
    private boolean zzA;
    private final Context zza;
    private final zzov zzc;
    private final PlaybackSession zzd;
    private String zzj;
    private PlaybackMetrics.Builder zzk;
    private int zzl;
    private zzat zzo;
    private zzos zzp;
    private zzos zzq;
    private zzos zzr;
    private zzu zzs;
    private zzu zzt;
    private zzu zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzcv.zza();
    private final zzbd zzf = new zzbd();
    private final zzbc zzg = new zzbc();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzot(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzom zzomVar = new zzom(zzom.zza);
        this.zzc = zzomVar;
        zzomVar.zza(this);
    }

    private final void zzA(int i7, long j7, zzu zzuVar, int i8) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = AbstractC3900s0.m18364a(i7).setTimeSinceCreatedMillis(j7 - this.zze);
        if (zzuVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i8 != 1 ? 1 : 2);
            String str = zzuVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzuVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzuVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i9 = zzuVar.zzj;
            if (i9 != -1) {
                timeSinceCreatedMillis.setBitrate(i9);
            }
            int i10 = zzuVar.zzv;
            if (i10 != -1) {
                timeSinceCreatedMillis.setWidth(i10);
            }
            int i11 = zzuVar.zzw;
            if (i11 != -1) {
                timeSinceCreatedMillis.setHeight(i11);
            }
            int i12 = zzuVar.zzG;
            if (i12 != -1) {
                timeSinceCreatedMillis.setChannelCount(i12);
            }
            int i13 = zzuVar.zzH;
            if (i13 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i13);
            }
            String str4 = zzuVar.zzd;
            if (str4 != null) {
                String str5 = zzeo.zza;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f7 = zzuVar.zzz;
            if (f7 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f7);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzop
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(trackChangeEventBuild);
            }
        });
    }

    private final void zzB(zzbe zzbeVar, zzup zzupVar) {
        int iZze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzupVar == null || (iZze = zzbeVar.zze(zzupVar.zza)) == -1) {
            return;
        }
        zzbc zzbcVar = this.zzg;
        int i7 = 0;
        zzbeVar.zzd(iZze, zzbcVar, false);
        zzbd zzbdVar = this.zzf;
        zzbeVar.zzb(zzbcVar.zzc, zzbdVar, 0L);
        zzaf zzafVar = zzbdVar.zzd.zzb;
        if (zzafVar != null) {
            int iZzG = zzeo.zzG(zzafVar.zza);
            if (iZzG == 0) {
                i7 = 3;
            } else if (iZzG != 1) {
                i7 = iZzG != 2 ? 1 : 4;
            } else {
                i7 = 5;
            }
        }
        builder.setStreamType(i7);
        long j7 = zzbdVar.zzm;
        if (j7 != -9223372036854775807L && !zzbdVar.zzk && !zzbdVar.zzi && !zzbdVar.zzb()) {
            builder.setMediaDurationMillis(zzeo.zzp(j7));
        }
        builder.setPlaybackType(true != zzbdVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l7 = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l7 == null ? 0L : l7.longValue());
            Long l8 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l8 == null ? 0L : l8.longValue());
            this.zzk.setStreamSource((l8 == null || l8.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(playbackMetricsBuild);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    private static int zzD(int i7) {
        switch (zzeo.zzF(i7)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static zzot zza(Context context) {
        MediaMetricsManager mediaMetricsManagerM18371a = AbstractC3907w.m18371a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerM18371a == null) {
            return null;
        }
        return new zzot(context, mediaMetricsManagerM18371a.createPlaybackSession());
    }

    private final boolean zzw(zzos zzosVar) {
        if (zzosVar != null) {
            return zzosVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j7, zzu zzuVar, int i7) {
        if (Objects.equals(this.zzs, zzuVar)) {
            return;
        }
        int i8 = this.zzs == null ? 1 : 0;
        this.zzs = zzuVar;
        zzA(1, j7, zzuVar, i8);
    }

    private final void zzy(long j7, zzu zzuVar, int i7) {
        if (Objects.equals(this.zzt, zzuVar)) {
            return;
        }
        int i8 = this.zzt == null ? 1 : 0;
        this.zzt = zzuVar;
        zzA(0, j7, zzuVar, i8);
    }

    private final void zzz(long j7, zzu zzuVar, int i7) {
        if (Objects.equals(this.zzu, zzuVar)) {
            return;
        }
        int i8 = this.zzu == null ? 1 : 0;
        this.zzu = zzuVar;
        zzA(2, j7, zzuVar, i8);
    }

    public final LogSessionId zzb() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzou
    public final void zzc(zzme zzmeVar, String str) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar == null || !zzupVar.zzb()) {
            zzC();
            this.zzj = str;
            this.zzk = AbstractC3887n0.m18351a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            zzB(zzmeVar.zzb, zzupVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzou
    public final void zzd(zzme zzmeVar, String str, boolean z7) {
        zzup zzupVar = zzmeVar.zzd;
        if ((zzupVar == null || !zzupVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdj(zzme zzmeVar, zzaz zzazVar, zzaz zzazVar2, int i7) {
        if (i7 == 1) {
            this.zzv = true;
            i7 = 1;
        }
        this.zzl = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdk(zzme zzmeVar, zzul zzulVar) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar == null) {
            return;
        }
        zzu zzuVar = zzulVar.zzb;
        zzuVar.getClass();
        zzos zzosVar = new zzos(zzuVar, 0, this.zzc.zzb(zzmeVar.zzb, zzupVar));
        int i7 = zzulVar.zza;
        if (i7 != 0) {
            if (i7 == 1) {
                this.zzq = zzosVar;
                return;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                this.zzr = zzosVar;
                return;
            }
        }
        this.zzp = zzosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdl(zzme zzmeVar, int i7, long j7, long j8) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar != null) {
            String strZzb = this.zzc.zzb(zzmeVar.zzb, zzupVar);
            HashMap map = this.zzi;
            Long l7 = (Long) map.get(strZzb);
            HashMap map2 = this.zzh;
            Long l8 = (Long) map2.get(strZzb);
            map.put(strZzb, Long.valueOf((l7 == null ? 0L : l7.longValue()) + j7));
            map2.put(strZzb, Long.valueOf((l8 != null ? l8.longValue() : 0L) + ((long) i7)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdm(zzme zzmeVar, zzhr zzhrVar) {
        this.zzx += zzhrVar.zzg;
        this.zzy += zzhrVar.zze;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016c  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:146:0x020a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0210  */
    /* JADX WARN: Code duplicated, block: B:149:0x0216  */
    /* JADX WARN: Code duplicated, block: B:151:0x021a  */
    /* JADX WARN: Code duplicated, block: B:152:0x021d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0221  */
    /* JADX WARN: Code duplicated, block: B:155:0x0229  */
    /* JADX WARN: Code duplicated, block: B:157:0x022d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0235  */
    /* JADX WARN: Code duplicated, block: B:160:0x0239  */
    /* JADX WARN: Code duplicated, block: B:161:0x0245  */
    /* JADX WARN: Code duplicated, block: B:171:0x0292  */
    /* JADX WARN: Code duplicated, block: B:173:0x0297  */
    /* JADX WARN: Code duplicated, block: B:175:0x029c  */
    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdn(zzba zzbaVar, zzmf zzmfVar) {
        int i7;
        int i8;
        int iZzD;
        int i9;
        int errorCode;
        int iZzR;
        zzp zzpVar;
        int i10;
        int i11;
        if (zzmfVar.zzc() == 0) {
            return;
        }
        for (int i12 = 0; i12 < zzmfVar.zzc(); i12++) {
            int iZzd = zzmfVar.zzd(i12);
            zzme zzmeVarZza = zzmfVar.zza(iZzd);
            if (iZzd == 0) {
                this.zzc.zzd(zzmeVarZza);
            } else if (iZzd == 11) {
                this.zzc.zze(zzmeVarZza, this.zzl);
            } else {
                this.zzc.zzc(zzmeVarZza);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzmfVar.zzb(0)) {
            zzme zzmeVarZza2 = zzmfVar.zza(0);
            if (this.zzk != null) {
                zzB(zzmeVarZza2.zzb, zzmeVarZza2.zzd);
            }
        }
        if (zzmfVar.zzb(2) && this.zzk != null) {
            zzgjz zzgjzVarZza = zzbaVar.zzn().zza();
            int size = zzgjzVarZza.size();
            int i13 = 0;
            loop1: while (true) {
                if (i13 >= size) {
                    zzpVar = null;
                    break;
                }
                zzbl zzblVar = (zzbl) zzgjzVarZza.get(i13);
                int i14 = 0;
                while (true) {
                    i11 = i13 + 1;
                    if (i14 < zzblVar.zza) {
                        if (zzblVar.zzc(i14) && (zzpVar = zzblVar.zza(i14).zzs) != null) {
                            break loop1;
                        } else {
                            i14++;
                        }
                    }
                }
                i13 = i11;
            }
            if (zzpVar != null) {
                PlaybackMetrics.Builder builder = this.zzk;
                String str = zzeo.zza;
                PlaybackMetrics.Builder builderM18357a = AbstractC3893p0.m18357a(builder);
                int i15 = 0;
                while (true) {
                    if (i15 >= zzpVar.zzb) {
                        i10 = 1;
                        break;
                    }
                    UUID uuid = zzpVar.zza(i15).zza;
                    if (uuid.equals(zzf.zzd)) {
                        i10 = 3;
                        break;
                    } else if (uuid.equals(zzf.zze)) {
                        i10 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzf.zzc)) {
                            i10 = 6;
                            break;
                        }
                        i15++;
                    }
                }
                builderM18357a.setDrmType(i10);
            }
        }
        if (zzmfVar.zzb(1011)) {
            this.zzz++;
        }
        zzat zzatVar = this.zzo;
        if (zzatVar != null) {
            Context context = this.zza;
            int i16 = zzatVar.zza;
            if (i16 == 1001) {
                i9 = 20;
            } else {
                zzhz zzhzVar = (zzhz) zzatVar;
                boolean z7 = zzhzVar.zzc == 1;
                int i17 = zzhzVar.zzg;
                Throwable cause = zzatVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzgr) {
                        iZzR = ((zzgr) cause).zzc;
                        i9 = 5;
                    } else if ((cause instanceof zzgq) || (cause instanceof zzas)) {
                        iZzR = 0;
                        i9 = 11;
                    } else {
                        boolean z8 = cause instanceof zzgp;
                        if (z8 || (cause instanceof zzgz)) {
                            if (zzed.zza(context).zzc() == 1) {
                                iZzR = 0;
                                i9 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    iZzR = 0;
                                    i9 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    iZzR = 0;
                                    i9 = 7;
                                } else if (z8 && ((zzgp) cause).zzb == 1) {
                                    iZzR = 0;
                                    i9 = 4;
                                } else {
                                    iZzR = 0;
                                    i9 = 8;
                                }
                            }
                        } else if (i16 == 1002) {
                            i9 = 21;
                        } else if (cause instanceof zzrm) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzeo.zzR(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iZzD = zzD(errorCode);
                                int i18 = iZzD;
                                iZzR = errorCode;
                                i9 = i18;
                            } else if (cause3 instanceof MediaDrmResetException) {
                                i9 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i9 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i9 = 29;
                            } else if (cause3 instanceof zzrx) {
                                iZzR = 0;
                                i9 = 23;
                            } else {
                                i9 = cause3 instanceof zzrl ? 28 : 30;
                            }
                        } else if ((cause instanceof zzgm) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i9 = 32;
                            } else {
                                iZzR = 0;
                                i9 = 31;
                            }
                        } else {
                            iZzR = 0;
                            i9 = 9;
                        }
                    }
                } else if (z7) {
                    i9 = 35;
                    if (i17 != 0 && i17 != 1) {
                        if (!z7 && i17 == 3) {
                            i9 = 15;
                        } else if (!z7 && i17 == 2) {
                            iZzR = 0;
                            i9 = 23;
                        } else if (cause instanceof zzsw) {
                            iZzR = zzeo.zzR(((zzsw) cause).zzd);
                            i9 = 13;
                        } else {
                            iZzD = 14;
                            if (cause instanceof zzss) {
                                errorCode = ((zzss) cause).zza;
                            } else if (cause instanceof OutOfMemoryError) {
                                i9 = 14;
                            } else if (cause instanceof zzpy) {
                                errorCode = ((zzpy) cause).zza;
                                iZzD = 17;
                            } else if (cause instanceof zzqb) {
                                errorCode = ((zzqb) cause).zza;
                                iZzD = 18;
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                iZzD = zzD(errorCode);
                            } else {
                                i9 = 22;
                            }
                            int i19 = iZzD;
                            iZzR = errorCode;
                            i9 = i19;
                        }
                    }
                } else if (!z7) {
                    if (!z7) {
                    }
                    if (cause instanceof zzsw) {
                        iZzR = zzeo.zzR(((zzsw) cause).zzd);
                        i9 = 13;
                    } else {
                        iZzD = 14;
                        if (cause instanceof zzss) {
                            errorCode = ((zzss) cause).zza;
                        } else if (cause instanceof OutOfMemoryError) {
                            i9 = 14;
                        } else if (cause instanceof zzpy) {
                            errorCode = ((zzpy) cause).zza;
                            iZzD = 17;
                        } else if (cause instanceof zzqb) {
                            errorCode = ((zzqb) cause).zza;
                            iZzD = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            iZzD = zzD(errorCode);
                        } else {
                            i9 = 22;
                        }
                        int i110 = iZzD;
                        iZzR = errorCode;
                        i9 = i110;
                    }
                } else {
                    if (!z7) {
                    }
                    if (cause instanceof zzsw) {
                        iZzR = zzeo.zzR(((zzsw) cause).zzd);
                        i9 = 13;
                    } else {
                        iZzD = 14;
                        if (cause instanceof zzss) {
                            errorCode = ((zzss) cause).zza;
                        } else if (cause instanceof OutOfMemoryError) {
                            i9 = 14;
                        } else if (cause instanceof zzpy) {
                            errorCode = ((zzpy) cause).zza;
                            iZzD = 17;
                        } else if (cause instanceof zzqb) {
                            errorCode = ((zzqb) cause).zza;
                            iZzD = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            iZzD = zzD(errorCode);
                        } else {
                            i9 = 22;
                        }
                        int i111 = iZzD;
                        iZzR = errorCode;
                        i9 = i111;
                    }
                }
                final PlaybackErrorEvent playbackErrorEventBuild = AbstractC3890o0.m18354a().setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).setErrorCode(i9).setSubErrorCode(iZzR).setException(zzatVar).build();
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzr(playbackErrorEventBuild);
                    }
                });
                this.zzA = true;
                this.zzo = null;
            }
            iZzR = 0;
            final PlaybackErrorEvent playbackErrorEventBuild2 = AbstractC3890o0.m18354a().setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).setErrorCode(i9).setSubErrorCode(iZzR).setException(zzatVar).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(playbackErrorEventBuild2);
                }
            });
            this.zzA = true;
            this.zzo = null;
        }
        if (zzmfVar.zzb(2)) {
            zzbm zzbmVarZzn = zzbaVar.zzn();
            boolean zZzb = zzbmVarZzn.zzb(2);
            boolean zZzb2 = zzbmVarZzn.zzb(1);
            boolean zZzb3 = zzbmVarZzn.zzb(3);
            if (zZzb || zZzb2) {
                if (!zZzb) {
                    zzx(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzy(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzz(jElapsedRealtime, null, 0);
                }
            } else if (zZzb3) {
                zZzb3 = true;
                if (!zZzb) {
                    zzx(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzy(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzz(jElapsedRealtime, null, 0);
                }
            }
        }
        if (zzw(this.zzp)) {
            zzu zzuVar = this.zzp.zza;
            if (zzuVar.zzw != -1) {
                zzx(jElapsedRealtime, zzuVar, 0);
                this.zzp = null;
            }
        }
        if (zzw(this.zzq)) {
            zzy(jElapsedRealtime, this.zzq.zza, 0);
            this.zzq = null;
        }
        if (zzw(this.zzr)) {
            zzz(jElapsedRealtime, this.zzr.zza, 0);
            this.zzr = null;
        }
        switch (zzed.zza(this.zza).zzc()) {
            case 0:
                i7 = 0;
                break;
            case 1:
                i7 = 9;
                break;
            case 2:
                i7 = 2;
                break;
            case 3:
                i7 = 4;
                break;
            case 4:
                i7 = 5;
                break;
            case 5:
                i7 = 6;
                break;
            case 6:
            case 8:
            default:
                i7 = 1;
                break;
            case 7:
                i7 = 3;
                break;
            case 9:
                i7 = 8;
                break;
            case 10:
                i7 = 7;
                break;
        }
        if (i7 != this.zzn) {
            this.zzn = i7;
            final NetworkEvent networkEventBuild = AbstractC3896q0.m18360a().setNetworkType(i7).setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzon
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(networkEventBuild);
                }
            });
        }
        if (zzbaVar.zzg() != 2) {
            this.zzv = false;
        }
        if (((zzlv) zzbaVar).zzG() == null) {
            this.zzw = false;
        } else if (zzmfVar.zzb(10)) {
            this.zzw = true;
        }
        int iZzg = zzbaVar.zzg();
        if (this.zzv) {
            i8 = 5;
        } else if (this.zzw) {
            i8 = 13;
        } else {
            i8 = 4;
            if (iZzg == 4) {
                i8 = 11;
            } else if (iZzg == 2) {
                int i20 = this.zzm;
                if (i20 == 0 || i20 == 2 || i20 == 12) {
                    i8 = 2;
                } else if (zzbaVar.zzj()) {
                    i8 = zzbaVar.zzh() != 0 ? 10 : 6;
                } else {
                    i8 = 7;
                }
            } else if (iZzg != 3) {
                i8 = (iZzg != 1 || this.zzm == 0) ? this.zzm : 12;
            } else if (zzbaVar.zzj()) {
                i8 = zzbaVar.zzh() != 0 ? 9 : 3;
            }
        }
        if (this.zzm != i8) {
            this.zzm = i8;
            this.zzA = true;
            final PlaybackStateEvent playbackStateEventBuild = AbstractC3898r0.m18362a().setState(this.zzm).setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(playbackStateEventBuild);
                }
            });
        }
        if (zzmfVar.zzb(1028)) {
            this.zzc.zzg(zzmfVar.zza(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzg(zzme zzmeVar, zzat zzatVar) {
        this.zzo = zzatVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzh(zzme zzmeVar, zzug zzugVar, zzul zzulVar, IOException iOException, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzp(zzme zzmeVar, zzbu zzbuVar) {
        zzos zzosVar = this.zzp;
        if (zzosVar != null) {
            zzu zzuVar = zzosVar.zza;
            if (zzuVar.zzw == -1) {
                zzs zzsVarZza = zzuVar.zza();
                zzsVarZza.zzt(zzbuVar.zzb);
                zzsVarZza.zzu(zzbuVar.zzc);
                this.zzp = new zzos(zzsVarZza.zzM(), 0, zzosVar.zzc);
            }
        }
    }

    final /* synthetic */ void zzr(PlaybackErrorEvent playbackErrorEvent) {
        this.zzd.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    final /* synthetic */ void zzs(NetworkEvent networkEvent) {
        this.zzd.reportNetworkEvent(networkEvent);
    }

    final /* synthetic */ void zzt(PlaybackStateEvent playbackStateEvent) {
        this.zzd.reportPlaybackStateEvent(playbackStateEvent);
    }

    final /* synthetic */ void zzu(TrackChangeEvent trackChangeEvent) {
        this.zzd.reportTrackChangeEvent(trackChangeEvent);
    }

    final /* synthetic */ void zzv(PlaybackMetrics playbackMetrics) {
        this.zzd.reportPlaybackMetrics(playbackMetrics);
    }
}
