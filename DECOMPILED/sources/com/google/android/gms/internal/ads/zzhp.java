package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzhp {
    private final zzght zza;
    private final Handler zzb;
    private zzho zzc;
    private zzc zzd;
    private int zzf;
    private zzby zzh;
    private float zzg = 1.0f;
    private int zze = 0;

    public zzhp(final Context context, Looper looper, zzho zzhoVar) {
        this.zza = zzghx.zza(new zzght() { // from class: com.google.android.gms.internal.ads.zzhn
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return zzca.zza(context);
            }
        });
        this.zzc = zzhoVar;
        this.zzb = new Handler(looper);
    }

    private final void zzf() {
        int i7 = this.zze;
        if (i7 == 1 || i7 == 0 || this.zzh == null) {
            return;
        }
        zzca.zzc((AudioManager) this.zza.zza(), this.zzh);
    }

    private final void zzg(int i7) {
        if (this.zze == i7) {
            return;
        }
        this.zze = i7;
        float f7 = i7 == 4 ? 0.2f : 1.0f;
        if (this.zzg != f7) {
            this.zzg = f7;
            zzho zzhoVar = this.zzc;
            if (zzhoVar != null) {
                zzhoVar.zza(f7);
            }
        }
    }

    private final void zzh(int i7) {
        zzho zzhoVar = this.zzc;
        if (zzhoVar != null) {
            zzhoVar.zzb(i7);
        }
    }

    public final float zza() {
        return this.zzg;
    }

    public final void zzb(zzc zzcVar) {
        if (Objects.equals(this.zzd, zzcVar)) {
            return;
        }
        this.zzd = zzcVar;
        this.zzf = zzcVar == null ? 0 : 1;
    }

    public final int zzc(boolean z7, int i7) {
        if (i7 == 1 || this.zzf != 1) {
            zzf();
            zzg(0);
            return 1;
        }
        if (!z7) {
            int i8 = this.zze;
            if (i8 != 1) {
                return i8 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.zze == 2) {
            return 1;
        }
        if (this.zzh == null) {
            zzbv zzbvVar = new zzbv(1);
            zzc zzcVar = this.zzd;
            zzcVar.getClass();
            zzbvVar.zzb(zzcVar);
            zzbvVar.zza(new AudioManager.OnAudioFocusChangeListener() { // from class: com.google.android.gms.internal.ads.zzhm
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final /* synthetic */ void onAudioFocusChange(int i9) {
                    this.zza.zze(i9);
                }
            }, this.zzb);
            this.zzh = zzbvVar.zzc();
        }
        if (zzca.zzb((AudioManager) this.zza.zza(), this.zzh) == 1) {
            zzg(2);
            return 1;
        }
        zzg(1);
        return -1;
    }

    public final void zzd() {
        this.zzc = null;
        zzf();
        zzg(0);
    }

    final /* synthetic */ void zze(int i7) {
        if (i7 == -3 || i7 == -2) {
            if (i7 != -2) {
                zzg(4);
                return;
            } else {
                zzh(0);
                zzg(3);
                return;
            }
        }
        if (i7 == -1) {
            zzh(-1);
            zzf();
            zzg(1);
        } else if (i7 == 1) {
            zzg(2);
            zzh(1);
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 27);
            sb.append("Unknown focus change type: ");
            sb.append(i7);
            zzds.zzc("AudioFocusManager", sb.toString());
        }
    }
}
