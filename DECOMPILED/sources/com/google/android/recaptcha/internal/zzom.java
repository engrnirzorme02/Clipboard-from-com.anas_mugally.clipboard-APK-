package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzom implements zzow {
    private final zzoi zza;
    private final zzpl zzb;
    private final boolean zzc;
    private final zzmp zzd;

    private zzom(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        this.zzb = zzplVar;
        this.zzc = zzoiVar instanceof zzna;
        this.zzd = zzmpVar;
        this.zza = zzoiVar;
    }

    static zzom zzc(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        return new zzom(zzplVar, zzmpVar, zzoiVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int iZzb = ((zznd) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzna) obj).zzb.zzb() : iZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int iHashCode = ((zznd) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        zzoi zzoiVar = this.zza;
        return zzoiVar instanceof zznd ? ((zznd) zzoiVar).zzv() : zzoiVar.zzad().zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzoy.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzoy.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) {
        boolean zZzO;
        zzpl zzplVar = this.zzb;
        Object objZza = zzplVar.zza(obj);
        ((zzna) obj).zzi();
        while (zzovVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzovVar.zzd();
                int iZzj = 0;
                if (iZzd != 11) {
                    if ((iZzd & 7) != 2) {
                        zZzO = zzovVar.zzO();
                    } else {
                        if (zzmoVar.zza(this.zza, iZzd >>> 3) != null) {
                            throw null;
                        }
                        zZzO = zzplVar.zzk(objZza, zzovVar, 0);
                    }
                    if (!zZzO) {
                        break;
                    }
                } else {
                    zznc zzncVarZza = null;
                    zzle zzleVarZzp = null;
                    while (zzovVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzovVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzovVar.zzj();
                            zzncVarZza = zzmoVar.zza(this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (zzncVarZza != null) {
                                throw null;
                            }
                            zzleVarZzp = zzovVar.zzp();
                        } else if (!zzovVar.zzO()) {
                            break;
                        }
                    }
                    if (zzovVar.zzd() != 12) {
                        throw new zznn("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzleVarZzp == null) {
                        continue;
                    } else {
                        if (zzncVarZza != null) {
                            throw null;
                        }
                        zzplVar.zzg(objZza, iZzj, zzleVarZzp);
                    }
                }
            } catch (Throwable th) {
                zzplVar.zzj(obj, objZza);
                throw th;
            }
        }
        zzplVar.zzj(obj, objZza);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:59:0x008b A[EDGE_INSN: B:59:0x008b->B:34:0x008b BREAK  A[LOOP:1: B:18:0x004f->B:62:0x004f], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i7, int i8, zzkt zzktVar) throws zznn {
        int iZzi;
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVarZzf = zzndVar.zzc;
        if (zzpmVarZzf == zzpm.zzc()) {
            zzpmVarZzf = zzpm.zzf();
            zzndVar.zzc = zzpmVarZzf;
        }
        zzpm zzpmVar = zzpmVarZzf;
        ((zzna) obj).zzi();
        zznc zzncVarZza = null;
        while (i7 < i8) {
            int iZzi2 = zzku.zzi(bArr, i7, zzktVar);
            int i9 = zzktVar.zza;
            if (i9 == 11) {
                byte[] bArr2 = bArr;
                int i10 = i8;
                zzkt zzktVar2 = zzktVar;
                int i11 = 0;
                zzle zzleVar = null;
                while (true) {
                    if (iZzi2 >= i10) {
                        iZzi = iZzi2;
                        break;
                    }
                    iZzi = zzku.zzi(bArr2, iZzi2, zzktVar2);
                    int i12 = zzktVar2.zza;
                    int i13 = i12 >>> 3;
                    int i14 = i12 & 7;
                    if (i13 == 2) {
                        if (i14 != 0) {
                            if (i12 != 12) {
                                break;
                                break;
                            }
                            iZzi2 = zzku.zzo(i12, bArr2, iZzi, i10, zzktVar2);
                        } else {
                            iZzi2 = zzku.zzi(bArr2, iZzi, zzktVar2);
                            i11 = zzktVar2.zza;
                            zzncVarZza = zzktVar2.zzd.zza(this.zza, i11);
                        }
                    } else {
                        if (i13 == 3) {
                            if (zzncVarZza != null) {
                                int i15 = zzos.zza;
                                throw null;
                            }
                            if (i14 == 2) {
                                iZzi2 = zzku.zza(bArr2, iZzi, zzktVar2);
                                zzleVar = (zzle) zzktVar2.zzc;
                            }
                        }
                        if (i12 != 12) {
                            break;
                        } else {
                            iZzi2 = zzku.zzo(i12, bArr2, iZzi, i10, zzktVar2);
                        }
                    }
                }
                if (zzleVar != null) {
                    zzpmVar.zzj((i11 << 3) | 2, zzleVar);
                }
                i7 = iZzi;
                bArr = bArr2;
                i8 = i10;
                zzktVar = zzktVar2;
            } else if ((i9 & 7) == 2) {
                zzncVarZza = zzktVar.zzd.zza(this.zza, i9 >>> 3);
                if (zzncVarZza != null) {
                    int i16 = zzos.zza;
                    throw null;
                }
                i7 = zzku.zzh(i9, bArr, iZzi2, i8, zzpmVar, zzktVar);
            } else {
                i7 = zzku.zzo(i9, bArr, iZzi2, i8, zzktVar);
            }
        }
        if (i7 != i8) {
            throw new zznn("Failed to parse the message.");
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzj(Object obj, zzpy zzpyVar) {
        Iterator itZzf = ((zzna) obj).zzb.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzms zzmsVar = (zzms) entry.getKey();
            if (zzmsVar.zze() != zzpx.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzmsVar.zzg();
            zzmsVar.zzf();
            if (entry instanceof zznp) {
                zzpyVar.zzw(zzmsVar.zza(), ((zznp) entry).zza().zzb());
            } else {
                zzpyVar.zzw(zzmsVar.zza(), entry.getValue());
            }
        }
        ((zznd) obj).zzc.zzk(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        return ((zzna) obj).zzb.zzk();
    }
}
