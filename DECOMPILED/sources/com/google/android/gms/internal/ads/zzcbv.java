package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcbv extends zzcaj implements TextureView.SurfaceTextureListener, zzcat {
    private final zzcbd zzc;
    private final zzcbe zzd;
    private final zzcbc zze;
    private final zzdsm zzf;
    private zzcai zzg;
    private Surface zzh;
    private zzcau zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcbb zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcbv(Context context, zzcbe zzcbeVar, zzcbd zzcbdVar, boolean z7, boolean z8, zzcbc zzcbcVar, zzdsm zzdsmVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzcbdVar;
        this.zzd = zzcbeVar;
        this.zzo = z7;
        this.zze = zzcbcVar;
        zzcbeVar.zza(this);
        this.zzf = zzdsmVar;
    }

    private final boolean zzT() {
        zzcau zzcauVar = this.zzi;
        return (zzcauVar == null || !zzcauVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    private final void zzV(boolean z7, Integer num) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null && !z7) {
            zzcauVar.zzn(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z7) {
            if (!zzT()) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcauVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzccq zzccqVarZzr = this.zzc.zzr(this.zzj);
            if (zzccqVarZzr instanceof zzccz) {
                zzcau zzcauVarZza = ((zzccz) zzccqVarZzr).zza();
                this.zzi = zzcauVarZza;
                zzcauVarZza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i8 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzccqVarZzr instanceof zzccw)) {
                    String strValueOf = String.valueOf(this.zzj);
                    int i9 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("Stream cache miss: ".concat(strValueOf));
                    return;
                }
                zzccw zzccwVar = (zzccw) zzccqVarZzr;
                String strZzF = zzF();
                ByteBuffer byteBufferZzu = zzccwVar.zzu();
                boolean zZzt = zzccwVar.zzt();
                String strZzs = zzccwVar.zzs();
                if (strZzs == null) {
                    int i10 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("Stream cache URL is null.");
                    return;
                } else {
                    zzcau zzcauVarZzE = zzE(num);
                    this.zzi = zzcauVarZzE;
                    zzcauVarZzE.zzr(new Uri[]{Uri.parse(strZzs)}, strZzF, byteBufferZzu, zZzt);
                }
            }
        } else {
            this.zzi = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i11 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i11 >= strArr.length) {
                    break;
                }
                uriArr[i11] = Uri.parse(strArr[i11]);
                i11++;
            }
            this.zzi.zzq(uriArr, strZzF2);
        }
        this.zzi.zzs(this);
        zzX(this.zzh, false);
        if (this.zzi.zzB()) {
            int iZzC = this.zzi.zzC();
            this.zzm = iZzC;
            if (iZzC == 3) {
                zzY();
            }
        }
    }

    private final void zzW() {
        if (this.zzi != null) {
            zzX(null, true);
            zzcau zzcauVar = this.zzi;
            if (zzcauVar != null) {
                zzcauVar.zzs(null);
                this.zzi.zzt();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzX(Surface surface, boolean z7) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcauVar.zzu(surface, z7);
        } catch (IOException e7) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("", e7);
        }
    }

    private final void zzY() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private static String zzZ(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i7, int i8) {
        float f7 = i8 > 0 ? i7 / i8 : 1.0f;
        if (this.zzt != f7) {
            this.zzt = f7;
            requestLayout();
        }
    }

    private final void zzac() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzM(true);
        }
    }

    private final void zzad() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzM(false);
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    protected final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f7 = this.zzt;
        if (f7 != 0.0f && this.zzn == null) {
            float f8 = measuredWidth;
            float f9 = f8 / measuredHeight;
            if (f7 > f9) {
                measuredHeight = (int) (f8 / f7);
            }
            if (f7 < f9) {
                measuredWidth = (int) (measuredHeight * f7);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcbb zzcbbVar = this.zzn;
        if (zzcbbVar != null) {
            zzcbbVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        zzdsm zzdsmVar;
        if (this.zzo) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoc)).booleanValue() && (zzdsmVar = this.zzf) != null) {
                zzdsl zzdslVarZza = zzdsmVar.zza();
                zzdslVarZza.zzc("action", "svp_aepv");
                zzdslVarZza.zzd();
            }
            zzcbb zzcbbVar = new zzcbb(getContext());
            this.zzn = zzcbbVar;
            zzcbbVar.zzb(surfaceTexture, i7, i8);
            zzcbb zzcbbVar2 = this.zzn;
            zzcbbVar2.start();
            SurfaceTexture surfaceTextureZze = zzcbbVar2.zze();
            if (surfaceTextureZze != null) {
                surfaceTexture = surfaceTextureZze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false, null);
        } else {
            zzX(surface, true);
            if (!this.zze.zza) {
                zzac();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i7, i8);
        } else {
            zzaa();
        }
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzcbb zzcbbVar = this.zzn;
        if (zzcbbVar != null) {
            zzcbbVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzad();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzX(null, true);
        }
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i7, final int i8) {
        zzcbb zzcbbVar = this.zzn;
        if (zzcbbVar != null) {
            zzcbbVar.zzc(i7, i8);
        }
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzN(i7, i8);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i7);
        AbstractC3490o0.m17545k(sb.toString());
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzP(i7);
            }
        });
        super.onWindowVisibilityChanged(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzA(int i7) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzy(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzB(int i7) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzz(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzC(int i7) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzA(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzD() {
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        });
    }

    final zzcau zzE(Integer num) {
        zzcbc zzcbcVar = this.zze;
        zzcbd zzcbdVar = this.zzc;
        zzcds zzcdsVar = new zzcds(zzcbdVar.getContext(), zzcbcVar, zzcbdVar, num);
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e("ExoPlayerAdapter initialized.");
        return zzcdsVar;
    }

    final String zzF() {
        zzcbd zzcbdVar = this.zzc;
        return C7351t.m32349g().m17439O(zzcbdVar.getContext(), zzcbdVar.zzs().f30226a);
    }

    final /* synthetic */ void zzG() {
        float fZzc = this.zzb.zzc();
        zzcau zzcauVar = this.zzi;
        if (zzcauVar == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcauVar.zzv(fZzc, false);
        } catch (IOException e7) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("", e7);
        }
    }

    final /* synthetic */ void zzH() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzb();
        }
    }

    final /* synthetic */ void zzI() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zze();
        }
    }

    final /* synthetic */ void zzJ(String str) {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void zzK() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzc();
        }
    }

    final /* synthetic */ void zzL() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzd();
        }
    }

    final /* synthetic */ void zzM() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zza();
        }
    }

    final /* synthetic */ void zzN(int i7, int i8) {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzj(i7, i8);
        }
    }

    final /* synthetic */ void zzO() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzh();
        }
    }

    final /* synthetic */ void zzP(int i7) {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.onWindowVisibilityChanged(i7);
        }
    }

    final /* synthetic */ void zzQ(boolean z7, long j7) {
        this.zzc.zzu(z7, j7);
    }

    final /* synthetic */ void zzR(String str) {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void zzS() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzb(zzcai zzcaiVar) {
        this.zzg = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzc(String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        zzcbe zzcbeVar = this.zzd;
        zzcbeVar.zzf();
        this.zzb.zze();
        zzcbeVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zze() {
        if (!zzU()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzac();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzi(int i7) {
        if (zzU()) {
            this.zzi.zzx(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzj(float f7, float f8) {
        zzcbb zzcbbVar = this.zzn;
        if (zzcbbVar != null) {
            zzcbbVar.zzf(f7, f8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzm() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzn() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzo() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzp() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj, com.google.android.gms.internal.ads.zzcbg
    public final void zzq() {
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzr(final boolean z7, final long j7) {
        if (this.zzc != null) {
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzQ(z7, j7);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzs(int i7) {
        if (this.zzm != i7) {
            this.zzm = i7;
            if (i7 == 3) {
                zzY();
                return;
            }
            if (i7 != 4) {
                return;
            }
            if (this.zze.zza) {
                zzad();
            }
            this.zzd.zzf();
            this.zzb.zze();
            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzt(int i7, int i8) {
        this.zzr = i7;
        this.zzs = i8;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzu(String str, Exception exc) {
        final String strZzZ = zzZ(str, exc);
        String strConcat = "ExoPlayerAdapter error: ".concat(strZzZ);
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f(strConcat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(strZzZ);
            }
        });
        C7351t.m32354l().zzh(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzv(String str, Exception exc) {
        final String strZzZ = zzZ("onLoadException", exc);
        String strConcat = "ExoPlayerAdapter exception: ".concat(strZzZ);
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f(strConcat);
        C7351t.m32354l().zzh(exc, "AdExoPlayerView.onException");
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzR(strZzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final Integer zzw() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzx(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z7 = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z7 = true;
        }
        this.zzj = str;
        zzV(z7, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzy(int i7) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzF(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzz(int i7) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzG(i7);
        }
    }
}
