package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhv implements zzkj {
    public static final zzgjz zza = zzgjz.zzn("file", "content", "data", "android.resource", "rawresource", "asset");
    private final zzbd zzb;
    private final zzbc zzc;
    private final zzyv zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final HashMap zzn;
    private long zzo;

    public zzhv() {
        zzyv zzyvVar = new zzyv(true, 65536);
        zzo(zzbbn.zzq.zzf, 0, "bufferForPlaybackMs", "0");
        zzo(zzbbn.zzq.zzf, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        zzo(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzo(zzbbn.zzq.zzf, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        zzo(50000, zzbbn.zzq.zzf, "minBufferMs", "bufferForPlaybackMs");
        zzo(zzbbn.zzq.zzf, zzbbn.zzq.zzf, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzo(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzo(zzbbn.zzq.zzf, zzbbn.zzq.zzf, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzo(50000, 50000, "maxBufferMs", "minBufferMs");
        zzo(50000, zzbbn.zzq.zzf, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzo(0, 0, "backBufferDurationMs", "0");
        this.zzb = new zzbd();
        this.zzc = new zzbc();
        this.zzd = zzyvVar;
        this.zze = zzeo.zzq(50000L);
        this.zzf = zzeo.zzq(1000L);
        this.zzg = zzeo.zzq(50000L);
        this.zzh = zzeo.zzq(50000L);
        this.zzi = zzeo.zzq(1000L);
        this.zzj = zzeo.zzq(1000L);
        this.zzk = zzeo.zzq(2000L);
        this.zzl = zzeo.zzq(1000L);
        this.zzm = zzeo.zzq(0L);
        this.zzn = new HashMap();
        this.zzo = -1L;
    }

    private final void zzl(zzox zzoxVar) {
        if (this.zzn.remove(zzoxVar) != null) {
            zzm();
        }
    }

    private final void zzm() {
        if (this.zzn.isEmpty()) {
            this.zzd.zza();
        } else {
            this.zzd.zzb(zzj());
        }
    }

    private final boolean zzn(zzki zzkiVar) {
        zzbe zzbeVar = zzkiVar.zzb;
        zzaf zzafVar = zzbeVar.zzb(zzbeVar.zzo(zzkiVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzafVar == null) {
            return false;
        }
        String scheme = zzafVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzo(int i7, int i8, String str, String str2) {
        if (i7 < i8) {
            throw new IllegalArgumentException(zzghs.zzd("%s cannot be less than %s", str, str2));
        }
    }

    private static final boolean zzp(boolean z7) {
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zza(zzox zzoxVar) {
        long id = Thread.currentThread().getId();
        long j7 = this.zzo;
        boolean z7 = true;
        if (j7 != -1 && j7 != id) {
            z7 = false;
        }
        zzghc.zzi(z7, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzo = id;
        HashMap map = this.zzn;
        if (!map.containsKey(zzoxVar)) {
            map.put(zzoxVar, new zzhu(null));
        }
        zzhu zzhuVar = (zzhu) map.get(zzoxVar);
        zzhuVar.getClass();
        zzhuVar.zzb = 13107200;
        zzhuVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzb(zzki zzkiVar, zzwq zzwqVar, zzyf[] zzyfVarArr) {
        zzhu zzhuVar = (zzhu) this.zzn.get(zzkiVar.zza);
        zzhuVar.getClass();
        boolean zZzn = zzn(zzkiVar);
        int length = zzyfVarArr.length;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = 13107200;
            if (i7 >= length) {
                zzhuVar.zzb = Math.max(13107200, i8);
                zzm();
                return;
            }
            zzyf zzyfVar = zzyfVarArr[i7];
            if (zzyfVar != null) {
                switch (zzyfVar.zza().zzc) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                        i9 = 144310272;
                        break;
                    case 2:
                        i9 = !zZzn ? 131072000 : 19660800;
                        break;
                    case 3:
                    case 5:
                    default:
                        i9 = 131072;
                        break;
                    case 4:
                        i9 = 26214400;
                        break;
                }
                i8 += i9;
            }
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzc(zzox zzoxVar) {
        zzl(zzoxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzd(zzox zzoxVar) {
        zzl(zzoxVar);
        if (this.zzn.isEmpty()) {
            this.zzo = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final long zze(zzox zzoxVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzf(zzox zzoxVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzg(zzki zzkiVar) {
        zzhu zzhuVar = (zzhu) this.zzn.get(zzkiVar.zza);
        zzhuVar.getClass();
        boolean zZzn = zzn(zzkiVar);
        int iZzg = this.zzd.zzg();
        int iZzj = zzj();
        long jMin = zZzn ? this.zzf : this.zze;
        long j7 = zZzn ? this.zzh : this.zzg;
        float f7 = zzkiVar.zzf;
        if (f7 > 1.0f) {
            jMin = Math.min(zzeo.zzv(jMin, f7), j7);
        }
        long j8 = zzkiVar.zze;
        if (j8 < Math.max(jMin, 500000L)) {
            boolean z7 = zzp(zZzn) || iZzg < iZzj;
            zzhuVar.zza = z7;
            if (!z7 && j8 < 500000) {
                zzds.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j8 >= j7 || iZzg >= iZzj) {
            zzhuVar.zza = false;
        }
        return zzhuVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzh(zzki zzkiVar) {
        long jMin;
        boolean z7;
        boolean z8 = zzkiVar.zzg;
        long j7 = zzkiVar.zze;
        float f7 = zzkiVar.zzf;
        boolean zZzn = zzn(zzkiVar);
        long jZzw = zzeo.zzw(j7, f7);
        if (z8) {
            if (zZzn) {
                jMin = this.zzl;
                z7 = true;
            } else {
                jMin = this.zzk;
                z7 = false;
            }
        } else if (zZzn) {
            jMin = this.zzj;
            z7 = true;
        } else {
            jMin = this.zzi;
            z7 = false;
        }
        long j8 = zzkiVar.zzh;
        if (j8 != -9223372036854775807L) {
            jMin = Math.min(j8 / 2, jMin);
        }
        if (jMin <= 0 || jZzw >= jMin) {
            return true;
        }
        return !zzp(z7) && this.zzd.zzg() >= zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzi(zzbe zzbeVar, zzup zzupVar, long j7) {
        Iterator it = this.zzn.values().iterator();
        while (it.hasNext()) {
            if (((zzhu) it.next()).zza) {
                return false;
            }
        }
        return true;
    }

    final int zzj() {
        Iterator it = this.zzn.values().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((zzhu) it.next()).zzb;
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final zzyv zzk() {
        return this.zzd;
    }
}
