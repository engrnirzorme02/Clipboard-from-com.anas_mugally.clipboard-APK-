package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.io.IOException;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccz extends zzccq implements zzcat {
    public static final /* synthetic */ int zzd = 0;
    private zzcau zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcci zzi;
    private long zzj;
    private long zzk;

    public zzccz(zzcbd zzcbdVar, zzcbc zzcbcVar) {
        super(zzcbdVar);
        zzcds zzcdsVar = new zzcds(zzcbdVar.getContext(), zzcbcVar, (zzcbd) this.zzc.get(), null);
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e("ExoPlayerAdapter initialized.");
        this.zze = zzcdsVar;
        zzcdsVar.zzs(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(C7590g.m33285o(str)));
    }

    private final void zzd(long j7) {
        C3431F0.f14180l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        }, j7);
    }

    private static String zzx(String str, Exception exc) {
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

    @Override // com.google.android.gms.internal.ads.zzccq, com.google.android.gms.common.api.InterfaceC3641k
    public final void release() {
        zzcau zzcauVar = this.zze;
        if (zzcauVar != null) {
            zzcauVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzD() {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f("Precache onRenderedFirstFrame");
    }

    public final zzcau zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzcau zzcauVar = this.zze;
        this.zze = null;
        return zzcauVar;
    }

    final /* synthetic */ void zzb() {
        long j7;
        long j8;
        long j9;
        String strZzc = zzc(this.zzf);
        try {
            long jLongValue = ((Long) C3250D.m17200c().zzd(zzbci.zzQ)).longValue() * 1000;
            long jIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zzu)).intValue();
            boolean zBooleanValue = ((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue();
            synchronized (this) {
                try {
                    if (C7351t.m32357o().mo18159a() - this.zzj > jLongValue) {
                        StringBuilder sb = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                        sb.append("Timeout reached. Limit: ");
                        sb.append(jLongValue);
                        sb.append(" ms");
                        throw new IOException(sb.toString());
                    }
                    if (this.zzg) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.zzh) {
                        if (!this.zze.zzB()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jZzH = this.zze.zzH();
                        if (jZzH > 0) {
                            long jZzN = this.zze.zzN();
                            if (jZzN != this.zzk) {
                                boolean z7 = jZzN > 0;
                                j8 = jZzH;
                                j9 = jZzN;
                                j7 = jIntValue;
                                zzm(this.zzf, strZzc, j9, j8, z7, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzcau.zzP(), zzcau.zzQ());
                                this.zzk = j9;
                            } else {
                                j7 = jIntValue;
                                j8 = jZzH;
                                j9 = jZzN;
                            }
                            if (j9 >= j8) {
                                zzp(this.zzf, strZzc, j8);
                            } else if (this.zze.zzO() >= j7 && j9 > 0) {
                            }
                        }
                        zzd(((Long) C3250D.m17200c().zzd(zzbci.zzR)).longValue());
                        return;
                    }
                    C7351t.m32344b().zzd(this.zzi);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e7) {
            String str = this.zzf;
            String message = e7.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb2.append("Failed to preload url ");
            sb2.append(str);
            sb2.append(" Exception: ");
            sb2.append(message);
            String string = sb2.toString();
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f(string);
            C7351t.m32354l().zzh(e7, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(this.zzf, strZzc, "error", zzx("error", e7));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zzf(String str, String[] strArr) {
        long j7;
        long j8;
        long j9;
        long j10;
        this.zzf = str;
        String strZzc = zzc(str);
        String str2 = " ms";
        String str3 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i7 = 0; i7 < strArr.length; i7++) {
                uriArr[i7] = Uri.parse(strArr[i7]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcbd zzcbdVar = (zzcbd) this.zzc.get();
            if (zzcbdVar != null) {
                zzcbdVar.zzt(strZzc, this);
            }
            InterfaceC3750e interfaceC3750eM32357o = C7351t.m32357o();
            long jMo18159a = interfaceC3750eM32357o.mo18159a();
            long jLongValue = ((Long) C3250D.m17200c().zzd(zzbci.zzR)).longValue();
            long jLongValue2 = ((Long) C3250D.m17200c().zzd(zzbci.zzQ)).longValue() * 1000;
            long jIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zzu)).intValue();
            boolean zBooleanValue = ((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue();
            long j11 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (interfaceC3750eM32357o.mo18159a() - jMo18159a > jLongValue2) {
                            long j12 = jLongValue2;
                            StringBuilder sb = new StringBuilder(String.valueOf(j12).length() + 27);
                            sb.append(str3);
                            sb.append(j12);
                            sb.append(str2);
                            throw new IOException(sb.toString());
                        }
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzB()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzH = this.zze.zzH();
                            if (jZzH > 0) {
                                long jZzN = this.zze.zzN();
                                if (jZzN != j11) {
                                    long j13 = jLongValue;
                                    j9 = jZzH;
                                    j8 = j13;
                                    j10 = jZzN;
                                    zzm(str, strZzc, j10, j9, jZzN > 0, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzcau.zzP(), zzcau.zzQ());
                                    j11 = j10;
                                } else {
                                    j8 = jLongValue;
                                    j9 = jZzH;
                                    j10 = jZzN;
                                }
                                if (j10 >= j9) {
                                    zzp(str, strZzc, j9);
                                } else if (this.zze.zzO() < jIntValue || j10 <= 0) {
                                    j7 = j8;
                                }
                            } else {
                                str2 = str2;
                                str3 = str3;
                                jLongValue2 = jLongValue2;
                                jIntValue = jIntValue;
                                j7 = jLongValue;
                            }
                            try {
                                wait(j7);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        }
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
                jLongValue = j7;
                str2 = str2;
                jLongValue2 = jLongValue2;
                jIntValue = jIntValue;
                str3 = str3;
                interfaceC3750eM32357o = interfaceC3750eM32357o;
            }
        } catch (Exception e7) {
            String message = e7.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb2.append("Failed to preload url ");
            sb2.append(str);
            sb2.append(" Exception: ");
            sb2.append(message);
            String string = sb2.toString();
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f(string);
            C7351t.m32354l().zzh(e7, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e7));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zzg(String str, String[] strArr, zzcci zzcciVar) {
        this.zzf = str;
        this.zzi = zzcciVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i7 = 0; i7 < strArr.length; i7++) {
                uriArr[i7] = Uri.parse(strArr[i7]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcbd zzcbdVar = (zzcbd) this.zzc.get();
            if (zzcbdVar != null) {
                zzcbdVar.zzt(strZzc, this);
            }
            this.zzj = C7351t.m32357o().mo18159a();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e7) {
            String message = e7.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            String string = sb.toString();
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f(string);
            C7351t.m32354l().zzh(e7, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e7));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzh(int i7) {
        this.zze.zzG(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzi(int i7) {
        this.zze.zzF(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzj(int i7) {
        this.zze.zzy(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzk(int i7) {
        this.zze.zzz(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzr(final boolean z7, final long j7) {
        final zzcbd zzcbdVar = (zzcbd) this.zzc.get();
        if (zzcbdVar != null) {
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcbdVar.zzu(z7, j7);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzs(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzt(int i7, int i8) {
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzu(String str, Exception exc) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33332g("Precache error", exc);
        C7351t.m32354l().zzh(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzv(String str, Exception exc) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33332g("Precache exception", exc);
        C7351t.m32354l().zzh(exc, "VideoStreamExoPlayerCache.onException");
    }
}
