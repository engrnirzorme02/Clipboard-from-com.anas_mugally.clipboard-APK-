package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdz extends zzcaj {
    private final zzcbe zzc;
    private zzcea zzd;
    private Uri zze;
    private zzcai zzf;
    private boolean zzg;
    private int zzh;

    public zzcdz(Context context, zzcbe zzcbeVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcbeVar;
        zzcbeVar.zza(this);
    }

    private final boolean zzu() {
        int i7 = this.zzh;
        return (i7 == 1 || i7 == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i7) {
        if (i7 == 4) {
            this.zzc.zze();
            this.zzb.zzd();
        } else if (this.zzh == 4) {
            this.zzc.zzf();
            this.zzb.zze();
        }
        this.zzh = i7;
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzcdz.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final String zza() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzb(zzcai zzcaiVar) {
        this.zzf = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzc(String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.zze = uri;
            this.zzd = new zzcea(uri.toString());
            zzv(3);
            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzd() {
        AbstractC3490o0.m17545k("AdImmersivePlayerView stop");
        zzcea zzceaVar = this.zzd;
        if (zzceaVar != null) {
            zzceaVar.zzd();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zze() {
        AbstractC3490o0.m17545k("AdImmersivePlayerView play");
        if (zzu()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zza();
            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzf() {
        AbstractC3490o0.m17545k("AdImmersivePlayerView pause");
        if (zzu() && this.zzd.zza()) {
            this.zzd.zzc();
            zzv(5);
            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzg() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzi(int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i7);
        AbstractC3490o0.m17545k(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzj(float f7, float f8) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzk() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzl() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzm() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzo() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzp() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj, com.google.android.gms.internal.ads.zzcbg
    public final void zzq() {
        if (this.zzd != null) {
            this.zzb.zzc();
        }
    }

    final /* synthetic */ void zzr() {
        zzcai zzcaiVar = this.zzf;
        if (zzcaiVar != null) {
            zzcaiVar.zzb();
        }
    }

    final /* synthetic */ void zzs() {
        zzcai zzcaiVar = this.zzf;
        if (zzcaiVar != null) {
            if (!this.zzg) {
                zzcaiVar.zzk();
                this.zzg = true;
            }
            this.zzf.zzc();
        }
    }

    final /* synthetic */ void zzt() {
        zzcai zzcaiVar = this.zzf;
        if (zzcaiVar != null) {
            zzcaiVar.zzd();
        }
    }
}
