package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzami implements zzamd {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzanv zzb;
    private zzamh zzg;
    private long zzh;
    private String zzi;
    private zzaeb zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzamg zze = new zzamg(128);
    private long zzl = -9223372036854775807L;
    private final zzamu zzf = new zzamu(178, 128);
    private final zzef zzc = new zzef();

    zzami(zzanv zzanvVar, String str) {
        this.zzb = zzanvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        zzfl.zzi(this.zzd);
        this.zze.zza();
        zzamh zzamhVar = this.zzg;
        if (zzamhVar != null) {
            zzamhVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzi = zzanrVar.zzc();
        zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 2);
        this.zzj = zzaebVarZzu;
        this.zzg = new zzamh(zzaebVarZzu);
        this.zzb.zza(zzacxVar, zzanrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j7, int i7) {
        this.zzl = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        int i7;
        int i8 = 3;
        this.zzg.getClass();
        this.zzj.getClass();
        int iZzg = zzefVar.zzg();
        int iZze = zzefVar.zze();
        byte[] bArrZzi = zzefVar.zzi();
        this.zzh += (long) zzefVar.zzd();
        this.zzj.zzz(zzefVar, zzefVar.zzd());
        while (true) {
            int iZzh = zzfl.zzh(bArrZzi, iZzg, iZze, this.zzd);
            if (iZzh == iZze) {
                break;
            }
            int i9 = iZzh + 3;
            int i10 = zzefVar.zzi()[i9] & 255;
            int i11 = iZzh - iZzg;
            if (!this.zzk) {
                if (i11 > 0) {
                    this.zze.zzc(bArrZzi, iZzg, iZzh);
                }
                int i12 = i11 < 0 ? -i11 : 0;
                zzamg zzamgVar = this.zze;
                if (zzamgVar.zzb(i10, i12)) {
                    zzaeb zzaebVar = this.zzj;
                    int i13 = zzamgVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzamgVar.zzc, zzamgVar.zza);
                    zzee zzeeVar = new zzee(bArrCopyOf, bArrCopyOf.length);
                    zzeeVar.zzo(i13);
                    zzeeVar.zzo(4);
                    zzeeVar.zzg();
                    zzeeVar.zzh(8);
                    if (zzeeVar.zzi()) {
                        zzeeVar.zzh(4);
                        zzeeVar.zzh(i8);
                    }
                    int iZzj = zzeeVar.zzj(4);
                    float f7 = 1.0f;
                    if (iZzj == 15) {
                        int iZzj2 = zzeeVar.zzj(8);
                        int iZzj3 = zzeeVar.zzj(8);
                        if (iZzj3 == 0) {
                            zzds.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f7 = iZzj2 / iZzj3;
                        }
                    } else if (iZzj < 7) {
                        f7 = zza[iZzj];
                    } else {
                        zzds.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f8 = f7;
                    if (zzeeVar.zzi()) {
                        zzeeVar.zzh(2);
                        zzeeVar.zzh(1);
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(15);
                            zzeeVar.zzg();
                            zzeeVar.zzh(15);
                            zzeeVar.zzg();
                            zzeeVar.zzh(15);
                            zzeeVar.zzg();
                            zzeeVar.zzh(3);
                            zzeeVar.zzh(11);
                            zzeeVar.zzg();
                            zzeeVar.zzh(15);
                            zzeeVar.zzg();
                        }
                    }
                    if (zzeeVar.zzj(2) != 0) {
                        zzds.zzc("H263Reader", "Unhandled video object layer shape");
                    }
                    zzeeVar.zzg();
                    int iZzj4 = zzeeVar.zzj(16);
                    zzeeVar.zzg();
                    if (zzeeVar.zzi()) {
                        if (iZzj4 == 0) {
                            zzds.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i14 = iZzj4 - 1;
                            int i15 = 0;
                            while (i14 > 0) {
                                i14 >>= 1;
                                i15++;
                            }
                            zzeeVar.zzh(i15);
                        }
                    }
                    zzeeVar.zzg();
                    int iZzj5 = zzeeVar.zzj(13);
                    zzeeVar.zzg();
                    int iZzj6 = zzeeVar.zzj(13);
                    zzeeVar.zzg();
                    zzeeVar.zzg();
                    zzs zzsVar = new zzs();
                    zzsVar.zza(str);
                    zzsVar.zzl("video/mp2t");
                    zzsVar.zzm("video/mp4v-es");
                    zzsVar.zzt(iZzj5);
                    zzsVar.zzu(iZzj6);
                    zzsVar.zzz(f8);
                    zzsVar.zzp(Collections.singletonList(bArrCopyOf));
                    zzaebVar.zzu(zzsVar.zzM());
                    this.zzk = true;
                }
            }
            this.zzg.zzc(bArrZzi, iZzg, iZzh);
            zzamu zzamuVar = this.zzf;
            if (i11 > 0) {
                zzamuVar.zzd(bArrZzi, iZzg, iZzh);
                i7 = 0;
            } else {
                i7 = -i11;
            }
            if (zzamuVar.zze(i7)) {
                int iZza = zzfl.zza(zzamuVar.zza, zzamuVar.zzb);
                zzef zzefVar2 = this.zzc;
                String str2 = zzeo.zza;
                zzefVar2.zzb(zzamuVar.zza, iZza);
                this.zzb.zzb(this.zzl, zzefVar2);
            }
            if (i10 == 178) {
                if (zzefVar.zzi()[iZzh + 2] == 1) {
                    zzamuVar.zzc(178);
                }
                i10 = 178;
            }
            int i16 = iZze - iZzh;
            this.zzg.zzd(this.zzh - ((long) i16), i16, this.zzk);
            this.zzg.zzb(i10, this.zzl);
            iZzg = i9;
            i8 = 3;
        }
        if (!this.zzk) {
            this.zze.zzc(bArrZzi, iZzg, iZze);
        }
        this.zzg.zzc(bArrZzi, iZzg, iZze);
        this.zzf.zzd(bArrZzi, iZzg, iZze);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z7) {
        zzamh zzamhVar = this.zzg;
        zzamhVar.getClass();
        if (z7) {
            zzamhVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
