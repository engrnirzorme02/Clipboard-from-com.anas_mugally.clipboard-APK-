package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcah extends zzcaj implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzcbd zzd;
    private final zzcbe zze;
    private final boolean zzf;
    private final zzdsm zzg;
    private int zzh;
    private int zzi;
    private MediaPlayer zzj;
    private Uri zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzcbb zzo;
    private final boolean zzp;
    private int zzq;
    private zzcai zzr;
    private boolean zzs;
    private Integer zzt;

    static {
        HashMap map = new HashMap();
        zzc = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcah(Context context, zzcbd zzcbdVar, boolean z7, boolean z8, zzcbc zzcbcVar, zzcbe zzcbeVar, zzdsm zzdsmVar) {
        super(context);
        this.zzh = 0;
        this.zzi = 0;
        this.zzs = false;
        this.zzt = null;
        this.zzd = zzcbdVar;
        this.zze = zzcbeVar;
        this.zzp = z7;
        this.zzf = z8;
        zzcbeVar.zza(this);
        this.zzg = zzdsmVar;
    }

    private final void zzD() {
        zzdsm zzdsmVar;
        AbstractC3490o0.m17545k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzk == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            C7351t.m32368z();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzj = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzj.setOnCompletionListener(this);
            this.zzj.setOnErrorListener(this);
            this.zzj.setOnInfoListener(this);
            this.zzj.setOnPreparedListener(this);
            this.zzj.setOnVideoSizeChangedListener(this);
            this.zzn = 0;
            if (this.zzp) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoc)).booleanValue() && (zzdsmVar = this.zzg) != null) {
                    zzdsl zzdslVarZza = zzdsmVar.zza();
                    zzdslVarZza.zzc("action", "svp_ampv");
                    zzdslVarZza.zzd();
                }
                zzcbb zzcbbVar = new zzcbb(getContext());
                this.zzo = zzcbbVar;
                zzcbbVar.zzb(surfaceTexture, getWidth(), getHeight());
                zzcbb zzcbbVar2 = this.zzo;
                zzcbbVar2.start();
                SurfaceTexture surfaceTextureZze = zzcbbVar2.zze();
                if (surfaceTextureZze != null) {
                    surfaceTexture = surfaceTextureZze;
                } else {
                    this.zzo.zzd();
                    this.zzo = null;
                }
            }
            this.zzj.setDataSource(getContext(), this.zzk);
            C7351t.m32339A();
            this.zzj.setSurface(new Surface(surfaceTexture));
            this.zzj.setAudioStreamType(3);
            this.zzj.setScreenOnWhilePlaying(true);
            this.zzj.prepareAsync();
            zzH(1);
        } catch (IOException e7) {
            e = e7;
            AbstractC7599p.m33332g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        } catch (IllegalArgumentException e8) {
            e = e8;
            AbstractC7599p.m33332g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        } catch (IllegalStateException e9) {
            e = e9;
            AbstractC7599p.m33332g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        }
    }

    private final void zzE(boolean z7) {
        AbstractC3490o0.m17545k("AdMediaPlayerView release");
        zzcbb zzcbbVar = this.zzo;
        if (zzcbbVar != null) {
            zzcbbVar.zzd();
            this.zzo = null;
        }
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzj.release();
            this.zzj = null;
            zzH(0);
            if (z7) {
                this.zzi = 0;
            }
        }
    }

    private final boolean zzF() {
        int i7;
        return (this.zzj == null || (i7 = this.zzh) == -1 || i7 == 0 || i7 == 1) ? false : true;
    }

    private final void zzG(float f7) {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f7, f7);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void zzH(int i7) {
        if (i7 == 3) {
            this.zze.zze();
            this.zzb.zzd();
        } else if (this.zzh == 3) {
            this.zze.zzf();
            this.zzb.zze();
        }
        this.zzh = i7;
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i7) {
        this.zzn = i7;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        AbstractC3490o0.m17545k("AdMediaPlayerView completion");
        zzH(5);
        this.zzi = 5;
        C3431F0.f14180l.post(new zzbzz(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i7, int i8) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i7));
        String str2 = (String) map.get(Integer.valueOf(i8));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        String string = sb.toString();
        int i9 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f(string);
        zzH(-1);
        this.zzi = -1;
        C3431F0.f14180l.post(new zzcaa(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i7, int i8) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i7));
        String str2 = (String) map.get(Integer.valueOf(i8));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        AbstractC3490o0.m17545k(sb.toString());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    @Override // android.view.View
    protected final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int defaultSize = View.getDefaultSize(this.zzl, i7);
        int defaultSize2 = View.getDefaultSize(this.zzm, i8);
        if (this.zzl > 0 && this.zzm > 0 && this.zzo == null) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            int size2 = View.MeasureSpec.getSize(i8);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i12 = (this.zzm * size) / this.zzl;
                    if (mode2 == Integer.MIN_VALUE || i12 <= size2) {
                        defaultSize2 = i12;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i11 = (this.zzl * size2) / this.zzm;
                        if (mode != Integer.MIN_VALUE && i11 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i9 = this.zzl;
                        i10 = this.zzm;
                        if (mode2 == Integer.MIN_VALUE || i10 <= size2) {
                            i11 = i9;
                            size2 = i10;
                        } else {
                            i11 = (size2 * i9) / i10;
                        }
                        if (mode == Integer.MIN_VALUE && i11 > size) {
                            defaultSize2 = (i10 * size) / i9;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i11;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i13 = this.zzl;
                int i14 = i13 * size2;
                int i15 = this.zzm;
                int i16 = size * i15;
                if (i14 < i16) {
                    defaultSize = i14 / i15;
                } else {
                    if (i14 > i16) {
                        defaultSize2 = i16 / i13;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i12 = (this.zzm * size) / this.zzl;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i12;
                    defaultSize = size;
                } else {
                    if (mode2 == 1073741824) {
                        i11 = (this.zzl * size2) / this.zzm;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i9 = this.zzl;
                        i10 = this.zzm;
                        if (mode2 == Integer.MIN_VALUE) {
                            i11 = i9;
                            size2 = i10;
                        } else {
                            i11 = i9;
                            size2 = i10;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i10 * size) / i9;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i11;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzcbb zzcbbVar = this.zzo;
        if (zzcbbVar != null) {
            zzcbbVar.zzc(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        AbstractC3490o0.m17545k("AdMediaPlayerView prepared");
        zzH(2);
        this.zze.zzb();
        C3431F0.f14180l.post(new zzbzy(this, mediaPlayer));
        this.zzl = mediaPlayer.getVideoWidth();
        this.zzm = mediaPlayer.getVideoHeight();
        int i7 = this.zzq;
        if (i7 != 0) {
            zzi(i7);
        }
        if (this.zzf && zzF() && this.zzj.getCurrentPosition() > 0 && this.zzi != 3) {
            AbstractC3490o0.m17545k("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            this.zzj.start();
            int currentPosition = this.zzj.getCurrentPosition();
            long jMo18159a = C7351t.m32357o().mo18159a();
            while (zzF() && this.zzj.getCurrentPosition() == currentPosition && C7351t.m32357o().mo18159a() - jMo18159a <= 250) {
            }
            this.zzj.pause();
            zzq();
        }
        int i8 = this.zzl;
        int i9 = this.zzm;
        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 40 + String.valueOf(i9).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i8);
        sb.append(" x ");
        sb.append(i9);
        AbstractC7599p.m33330e(sb.toString());
        if (this.zzi == 3) {
            zze();
        }
        zzq();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        AbstractC3490o0.m17545k("AdMediaPlayerView surface created");
        zzD();
        C3431F0.f14180l.post(new zzcab(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AbstractC3490o0.m17545k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null && this.zzq == 0) {
            this.zzq = mediaPlayer.getCurrentPosition();
        }
        zzcbb zzcbbVar = this.zzo;
        if (zzcbbVar != null) {
            zzcbbVar.zzd();
        }
        C3431F0.f14180l.post(new zzcad(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        AbstractC3490o0.m17545k("AdMediaPlayerView surface changed");
        int i9 = this.zzi;
        boolean z7 = false;
        if (this.zzl == i7 && this.zzm == i8) {
            z7 = true;
        }
        if (this.zzj != null && i9 == 3 && z7) {
            int i10 = this.zzq;
            if (i10 != 0) {
                zzi(i10);
            }
            zze();
        }
        zzcbb zzcbbVar = this.zzo;
        if (zzcbbVar != null) {
            zzcbbVar.zzc(i7, i8);
        }
        C3431F0.f14180l.post(new zzcac(this, i7, i8));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzr);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i7, int i8) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 35 + String.valueOf(i8).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i7);
        sb.append(" x ");
        sb.append(i8);
        AbstractC3490o0.m17545k(sb.toString());
        this.zzl = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzm = videoHeight;
        if (this.zzl == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i7);
        AbstractC3490o0.m17545k(sb.toString());
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcag
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(i7);
            }
        });
        super.onWindowVisibilityChanged(i7);
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzcah.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final String zza() {
        return "MediaPlayer".concat(true != this.zzp ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzb(zzcai zzcaiVar) {
        this.zzr = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzc(String str) {
        Uri uri = Uri.parse(str);
        zzbat zzbatVarZza = zzbat.zza(uri);
        if (zzbatVarZza == null || zzbatVarZza.zza != null) {
            if (zzbatVarZza != null) {
                uri = Uri.parse(zzbatVarZza.zza);
            }
            this.zzk = uri;
            this.zzq = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzd() {
        AbstractC3490o0.m17545k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzj.release();
            this.zzj = null;
            zzH(0);
            this.zzi = 0;
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zze() {
        AbstractC3490o0.m17545k("AdMediaPlayerView play");
        if (zzF()) {
            this.zzj.start();
            zzH(3);
            this.zza.zza();
            C3431F0.f14180l.post(new zzcae(this));
        }
        this.zzi = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzf() {
        AbstractC3490o0.m17545k("AdMediaPlayerView pause");
        if (zzF() && this.zzj.isPlaying()) {
            this.zzj.pause();
            zzH(4);
            C3431F0.f14180l.post(new zzcaf(this));
        }
        this.zzi = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzg() {
        if (zzF()) {
            return this.zzj.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzh() {
        if (zzF()) {
            return this.zzj.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzi(int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i7);
        AbstractC3490o0.m17545k(sb.toString());
        if (!zzF()) {
            this.zzq = i7;
        } else {
            this.zzj.seekTo(i7);
            this.zzq = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzj(float f7, float f8) {
        zzcbb zzcbbVar = this.zzo;
        if (zzcbbVar != null) {
            zzcbbVar.zzf(f7, f8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzk() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzl() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzm() {
        if (this.zzt != null) {
            return (zzo() * ((long) this.zzn)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzo() {
        if (this.zzt != null) {
            return ((long) zzg()) * ((long) this.zzt.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzp() {
        if (zzF()) {
            return this.zzj.getMetrics().getInt("android.media.mediaplayer.dropped");
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj, com.google.android.gms.internal.ads.zzcbg
    public final void zzq() {
        zzG(this.zzb.zzc());
    }

    final /* synthetic */ void zzr(int i7) {
        zzcai zzcaiVar = this.zzr;
        if (zzcaiVar != null) {
            zzcaiVar.onWindowVisibilityChanged(i7);
        }
    }

    final /* synthetic */ void zzs(MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue() || this.zzd == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    this.zzt = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    int integer = format2.getInteger("width");
                                    int integer2 = format2.getInteger("height");
                                    StringBuilder sb = new StringBuilder(String.valueOf(integer).length() + 1 + String.valueOf(integer2).length());
                                    sb.append(integer);
                                    sb.append("x");
                                    sb.append(integer2);
                                    map.put("resolution", sb.toString());
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                this.zzd.zze("onMetadataEvent", map);
            }
        } catch (RuntimeException e7) {
            C7351t.m32354l().zzg(e7, "AdMediaPlayerView.reportMetadata");
        }
    }

    final /* synthetic */ zzcai zzt() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzu() {
        return this.zzs;
    }

    final /* synthetic */ void zzv(boolean z7) {
        this.zzs = true;
    }
}
