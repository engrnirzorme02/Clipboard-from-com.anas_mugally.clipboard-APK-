package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzajd {
    private final zzaje zza = new zzaje();
    private final zzef zzb = new zzef(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzajd() {
    }

    private final int zzf(int i7) {
        int i8;
        int i9 = 0;
        this.zzd = 0;
        do {
            int i10 = this.zzd;
            int i11 = i7 + i10;
            zzaje zzajeVar = this.zza;
            if (i11 >= zzajeVar.zzc) {
                break;
            }
            this.zzd = i10 + 1;
            i8 = zzajeVar.zzf[i11];
            i9 += i8;
        } while (i8 == 255);
        return i9;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final boolean zzb(zzacv zzacvVar) {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i7 = this.zzc;
            if (i7 < 0) {
                zzaje zzajeVar = this.zza;
                if (!zzajeVar.zzb(zzacvVar, -1L) || !zzajeVar.zzc(zzacvVar, true)) {
                    return false;
                }
                int iZzf = zzajeVar.zzd;
                if ((zzajeVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    iZzf += zzf(0);
                    i7 = this.zzd;
                } else {
                    i7 = 0;
                }
                if (!zzacy.zzd(zzacvVar, iZzf)) {
                    return false;
                }
                this.zzc = i7;
            }
            int iZzf2 = zzf(i7);
            int i8 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                zzef zzefVar = this.zzb;
                zzefVar.zzc(zzefVar.zze() + iZzf2);
                if (!zzacy.zzc(zzacvVar, zzefVar.zzi(), zzefVar.zze(), iZzf2)) {
                    return false;
                }
                zzefVar.zzf(zzefVar.zze() + iZzf2);
                this.zze = this.zza.zzf[i8 + (-1)] != 255;
            }
            if (i8 == this.zza.zzc) {
                i8 = -1;
            }
            this.zzc = i8;
        }
    }

    public final zzaje zzc() {
        return this.zza;
    }

    public final zzef zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzef zzefVar = this.zzb;
        if (zzefVar.zzi().length == 65025) {
            return;
        }
        zzefVar.zzb(Arrays.copyOf(zzefVar.zzi(), Math.max(65025, zzefVar.zze())), zzefVar.zze());
    }
}
