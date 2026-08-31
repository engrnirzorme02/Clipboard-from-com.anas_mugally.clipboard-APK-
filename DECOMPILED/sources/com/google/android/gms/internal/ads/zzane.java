package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzane implements zzans {
    private final zzand zza;
    private final zzef zzb = new zzef(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzane(zzand zzandVar) {
        this.zza = zzandVar;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zza(zzel zzelVar, zzacx zzacxVar, zzanr zzanrVar) {
        this.zza.zza(zzelVar, zzacxVar, zzanrVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zzc(zzef zzefVar, int i7) {
        int iZzg;
        int i8 = i7 & 1;
        if (i8 != 0) {
            iZzg = zzefVar.zzg() + zzefVar.zzs();
        } else {
            iZzg = -1;
        }
        if (this.zzf) {
            if (i8 == 0) {
                return;
            }
            this.zzf = false;
            zzefVar.zzh(iZzg);
            this.zzd = 0;
        }
        while (zzefVar.zzd() > 0) {
            int i9 = this.zzd;
            if (i9 < 3) {
                if (i9 == 0) {
                    int iZzs = zzefVar.zzs();
                    zzefVar.zzh(zzefVar.zzg() - 1);
                    if (iZzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzefVar.zzd(), 3 - this.zzd);
                zzef zzefVar2 = this.zzb;
                zzefVar.zzm(zzefVar2.zzi(), this.zzd, iMin);
                int i10 = this.zzd + iMin;
                this.zzd = i10;
                if (i10 == 3) {
                    zzefVar2.zzh(0);
                    zzefVar2.zzf(3);
                    zzefVar2.zzk(1);
                    int iZzs2 = zzefVar2.zzs();
                    boolean z7 = (iZzs2 & 128) != 0;
                    int iZzs3 = zzefVar2.zzs();
                    this.zze = z7;
                    this.zzc = (((iZzs2 & 15) << 8) | iZzs3) + 3;
                    int iZzj = zzefVar2.zzj();
                    int i11 = this.zzc;
                    if (iZzj < i11) {
                        int iZzj2 = zzefVar2.zzj();
                        zzefVar2.zzc(Math.min(4098, Math.max(i11, iZzj2 + iZzj2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzefVar.zzd(), this.zzc - this.zzd);
                zzef zzefVar3 = this.zzb;
                zzefVar.zzm(zzefVar3.zzi(), this.zzd, iMin2);
                int i12 = this.zzd + iMin2;
                this.zzd = i12;
                int i13 = this.zzc;
                if (i12 != i13) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzefVar3.zzf(i13);
                    } else {
                        if (zzeo.zzH(zzefVar3.zzi(), 0, i13, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzefVar3.zzf(this.zzc - 4);
                    }
                    zzefVar3.zzh(0);
                    this.zza.zzb(zzefVar3);
                    this.zzd = 0;
                }
            }
        }
    }
}
