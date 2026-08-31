package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaaz {
    private final zzzx zza = new zzzx();
    private final zzaax zzb;
    private final zzaay zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzaaz(Context context) {
        DisplayManager displayManager;
        zzaax zzaaxVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new zzaax(this, displayManager);
        this.zzb = zzaaxVar;
        this.zzc = zzaaxVar != null ? zzaay.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    private final void zzk() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzl() {
        if (Build.VERSION.SDK_INT < 30 || this.zze == null) {
            return;
        }
        zzzx zzzxVar = this.zza;
        float fZzg = zzzxVar.zzc() ? zzzxVar.zzg() : this.zzf;
        float f7 = this.zzg;
        if (fZzg != f7) {
            if (fZzg != -1.0f && f7 != -1.0f) {
                float f8 = 1.0f;
                if (zzzxVar.zzc() && zzzxVar.zze() >= 5000000000L) {
                    f8 = 0.02f;
                }
                if (Math.abs(fZzg - this.zzg) < f8) {
                    return;
                }
            } else if (fZzg == -1.0f && zzzxVar.zzd() < 30) {
                return;
            }
            this.zzg = fZzg;
            zzm(false);
        }
    }

    private final void zzm(boolean z7) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f7 = 0.0f;
        if (this.zzd) {
            float f8 = this.zzg;
            if (f8 != -1.0f) {
                f7 = this.zzi * f8;
            }
        }
        if (z7 || this.zzh != f7) {
            this.zzh = f7;
            zzaaw.zza(surface, f7);
        }
    }

    private final void zzn() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzaaw.zza(surface, 0.0f);
    }

    public final void zza(int i7) {
        if (this.zzj == i7) {
            return;
        }
        this.zzj = i7;
        zzm(true);
    }

    public final void zzb() {
        this.zzd = true;
        zzk();
        zzaax zzaaxVar = this.zzb;
        if (zzaaxVar != null) {
            zzaay zzaayVar = this.zzc;
            zzaayVar.getClass();
            zzaayVar.zzb();
            zzaaxVar.zza();
        }
        zzm(false);
    }

    public final void zzc(Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzn();
        this.zze = surface;
        zzm(true);
    }

    public final void zzd() {
        zzk();
    }

    public final void zze(float f7) {
        this.zzi = f7;
        zzk();
        zzm(false);
    }

    public final void zzf(float f7) {
        this.zzf = f7;
        this.zza.zza();
        zzl();
    }

    public final void zzg(long j7) {
        long j8 = this.zzn;
        if (j8 != -1) {
            this.zzp = j8;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zzb(j7 * 1000);
        zzl();
    }

    public final void zzh() {
        this.zzd = false;
        zzaax zzaaxVar = this.zzb;
        if (zzaaxVar != null) {
            zzaaxVar.zzb();
            zzaay zzaayVar = this.zzc;
            zzaayVar.getClass();
            zzaayVar.zzc();
        }
        zzn();
    }

    public final long zzi(long j7) {
        long j8;
        if (this.zzp != -1) {
            zzzx zzzxVar = this.zza;
            if (zzzxVar.zzc()) {
                long jZzf = this.zzq + ((long) ((zzzxVar.zzf() * (this.zzm - this.zzp)) / this.zzi));
                if (Math.abs(j7 - jZzf) > 20000000) {
                    zzk();
                } else {
                    j7 = jZzf;
                }
            }
        }
        this.zzn = this.zzm;
        this.zzo = j7;
        zzaay zzaayVar = this.zzc;
        if (zzaayVar != null && this.zzk != -9223372036854775807L) {
            long j9 = zzaayVar.zza;
            if (j9 != -9223372036854775807L) {
                long j10 = this.zzk;
                long j11 = j9 + (((j7 - j9) / j10) * j10);
                if (j7 <= j11) {
                    j8 = j11 - j10;
                } else {
                    long j12 = j10 + j11;
                    j8 = j11;
                    j11 = j12;
                }
                long j13 = this.zzl;
                if (j11 - j7 >= j7 - j8) {
                    j11 = j8;
                }
                return j11 - j13;
            }
        }
        return j7;
    }

    final /* synthetic */ void zzj(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.zzk = refreshRate;
            this.zzl = (refreshRate * 80) / 100;
        } else {
            zzds.zzc("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.zzk = -9223372036854775807L;
            this.zzl = -9223372036854775807L;
        }
    }
}
