package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
final class zzaky {
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;
    private String zzl;
    private Layout.Alignment zzo;
    private Layout.Alignment zzp;
    private zzakr zzr;
    private String zzt;
    private String zzu;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    public final Layout.Alignment zzA() {
        return this.zzp;
    }

    public final zzaky zzB(Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final boolean zzC() {
        return this.zzq == 1;
    }

    public final zzaky zzD(boolean z7) {
        this.zzq = z7 ? 1 : 0;
        return this;
    }

    public final zzakr zzE() {
        return this.zzr;
    }

    public final zzaky zzF(zzakr zzakrVar) {
        this.zzr = zzakrVar;
        return this;
    }

    public final zzaky zzG(float f7) {
        this.zzk = f7;
        return this;
    }

    public final zzaky zzH(int i7) {
        this.zzj = i7;
        return this;
    }

    public final int zzI() {
        return this.zzj;
    }

    public final float zzJ() {
        return this.zzk;
    }

    public final zzaky zzK(String str) {
        this.zzt = str;
        return this;
    }

    public final String zzL() {
        return this.zzt;
    }

    public final zzaky zzM(String str) {
        this.zzu = str;
        return this;
    }

    public final String zzN() {
        return this.zzu;
    }

    public final int zza() {
        int i7 = this.zzh;
        if (i7 == -1 && this.zzi == -1) {
            return -1;
        }
        return (i7 == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
    }

    public final boolean zzb() {
        return this.zzf == 1;
    }

    public final zzaky zzc(boolean z7) {
        this.zzf = z7 ? 1 : 0;
        return this;
    }

    public final boolean zzd() {
        return this.zzg == 1;
    }

    public final zzaky zze(boolean z7) {
        this.zzg = z7 ? 1 : 0;
        return this;
    }

    public final zzaky zzf(boolean z7) {
        this.zzh = z7 ? 1 : 0;
        return this;
    }

    public final zzaky zzg(boolean z7) {
        this.zzi = z7 ? 1 : 0;
        return this;
    }

    public final String zzh() {
        return this.zza;
    }

    public final zzaky zzi(String str) {
        this.zza = str;
        return this;
    }

    public final int zzj() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final zzaky zzk(int i7) {
        this.zzb = i7;
        this.zzc = true;
        return this;
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final int zzm() {
        if (this.zze) {
            return this.zzd;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final zzaky zzn(int i7) {
        this.zzd = i7;
        this.zze = true;
        return this;
    }

    public final boolean zzo() {
        return this.zze;
    }

    public final zzaky zzp(float f7) {
        this.zzs = f7;
        return this;
    }

    public final float zzq() {
        return this.zzs;
    }

    public final zzaky zzr(zzaky zzakyVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzakyVar != null) {
            if (!this.zzc && zzakyVar.zzc) {
                zzk(zzakyVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzakyVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzakyVar.zzi;
            }
            if (this.zza == null && (str = zzakyVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzakyVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzakyVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzakyVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzakyVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzakyVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzakyVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzakyVar.zzj;
                this.zzk = zzakyVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzakyVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzakyVar.zzs;
            }
            if (this.zzt == null) {
                this.zzt = zzakyVar.zzt;
            }
            if (this.zzu == null) {
                this.zzu = zzakyVar.zzu;
            }
            if (!this.zze && zzakyVar.zze) {
                zzn(zzakyVar.zzd);
            }
            if (this.zzm == -1 && (i7 = zzakyVar.zzm) != -1) {
                this.zzm = i7;
            }
        }
        return this;
    }

    public final zzaky zzs(String str) {
        this.zzl = str;
        return this;
    }

    public final String zzt() {
        return this.zzl;
    }

    public final zzaky zzu(int i7) {
        this.zzm = i7;
        return this;
    }

    public final int zzv() {
        return this.zzm;
    }

    public final zzaky zzw(int i7) {
        this.zzn = i7;
        return this;
    }

    public final int zzx() {
        return this.zzn;
    }

    public final Layout.Alignment zzy() {
        return this.zzo;
    }

    public final zzaky zzz(Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}
