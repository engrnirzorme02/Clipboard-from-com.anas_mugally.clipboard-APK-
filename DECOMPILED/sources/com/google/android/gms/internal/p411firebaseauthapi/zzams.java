package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzams<T> implements zzanb<T> {
    private final zzamm zza;
    private final zzanu<?, ?> zzb;
    private final boolean zzc;
    private final zzakw<?> zzd;

    private zzams(zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamm zzammVar) {
        this.zzb = zzanuVar;
        this.zzc = zzakwVar.zza(zzammVar);
        this.zzd = zzakwVar;
        this.zza = zzammVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final int zza(T t7) {
        zzanu<?, ?> zzanuVar = this.zzb;
        int iZzb = zzanuVar.zzb(zzanuVar.zzd(t7));
        return this.zzc ? iZzb + this.zzd.zza(t7).zza() : iZzb;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final int zzb(T t7) {
        int iHashCode = this.zzb.zzd(t7).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t7).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final void zzd(T t7) {
        this.zzb.zzf(t7);
        this.zzd.zzc(t7);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final boolean zze(T t7) {
        return this.zzd.zza(t7).zzg();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final boolean zzb(T t7, T t8) {
        if (!this.zzb.zzd(t7).equals(this.zzb.zzd(t8))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t7).equals(this.zzd.zza(t8));
        }
        return true;
    }

    static <T> zzams<T> zza(zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamm zzammVar) {
        return new zzams<>(zzanuVar, zzakwVar, zzammVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final T zza() {
        zzamm zzammVar = this.zza;
        if (zzammVar instanceof zzalf) {
            return (T) ((zzalf) zzammVar).zzo();
        }
        return (T) zzammVar.zzq().zzf();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final void zza(T t7, T t8) {
        zzand.zza(this.zzb, t7, t8);
        if (this.zzc) {
            zzand.zza(this.zzd, t7, t8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[LOOP:0: B:47:0x000c->B:55:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final void zza(T t7, zzanc zzancVar, zzaku zzakuVar) {
        boolean zZzt;
        zzanu<?, ?> zzanuVar = this.zzb;
        zzakw<?> zzakwVar = this.zzd;
        Object objZzc = zzanuVar.zzc(t7);
        zzakx<T> zzakxVarZzb = zzakwVar.zzb(t7);
        while (zzancVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzancVar.zzd();
                int iZzj = 0;
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZza = zzakwVar.zza(zzakuVar, this.zza, iZzd >>> 3);
                        if (objZza != null) {
                            zzakwVar.zza(zzancVar, objZza, zzakuVar, zzakxVarZzb);
                        } else {
                            zZzt = zzanuVar.zza(objZzc, zzancVar, 0);
                        }
                    } else {
                        zZzt = zzancVar.zzt();
                    }
                    if (!zZzt) {
                        zzanuVar.zzb(t7, objZzc);
                        return;
                    }
                } else {
                    Object objZza2 = null;
                    zzajv zzajvVarZzp = null;
                    while (zzancVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzancVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzancVar.zzj();
                            objZza2 = zzakwVar.zza(zzakuVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZza2 != null) {
                                zzakwVar.zza(zzancVar, objZza2, zzakuVar, zzakxVarZzb);
                            } else {
                                zzajvVarZzp = zzancVar.zzp();
                            }
                        } else if (iZzd2 == 12 || !zzancVar.zzt()) {
                            break;
                        }
                    }
                    if (zzancVar.zzd() != 12) {
                        throw zzall.zzb();
                    }
                    if (zzajvVarZzp != null) {
                        if (objZza2 != null) {
                            zzakwVar.zza(zzajvVarZzp, objZza2, zzakuVar, zzakxVarZzb);
                        } else {
                            zzanuVar.zza(objZzc, iZzj, zzajvVarZzp);
                        }
                    }
                }
                zZzt = true;
                if (!zZzt) {
                    zzanuVar.zzb(t7, objZzc);
                    return;
                }
            } catch (Throwable th) {
                zzanuVar.zzb(t7, objZzc);
                throw th;
            }
        }
        zzanuVar.zzb(t7, objZzc);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1 A[EDGE_INSN: B:58:0x00a1->B:35:0x00a1 BREAK  A[LOOP:1: B:18:0x0059->B:63:0x0059], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final void zza(T t7, byte[] bArr, int i7, int i8, zzaju zzajuVar) throws zzall {
        int iZzc;
        zzalf zzalfVar = (zzalf) t7;
        zzanx zzanxVarZzd = zzalfVar.zzb;
        if (zzanxVarZzd == zzanx.zzc()) {
            zzanxVarZzd = zzanx.zzd();
            zzalfVar.zzb = zzanxVarZzd;
        }
        zzanx zzanxVar = zzanxVarZzd;
        ((zzalf.zzd) t7).zza();
        zzalf.zzf zzfVar = null;
        while (i7 < i8) {
            int iZzc2 = zzajr.zzc(bArr, i7, zzajuVar);
            int i9 = zzajuVar.zza;
            if (i9 == 11) {
                byte[] bArr2 = bArr;
                int i10 = i8;
                zzaju zzajuVar2 = zzajuVar;
                int i11 = 0;
                zzajv zzajvVar = null;
                while (true) {
                    if (iZzc2 >= i10) {
                        iZzc = iZzc2;
                        break;
                    }
                    iZzc = zzajr.zzc(bArr2, iZzc2, zzajuVar2);
                    int i12 = zzajuVar2.zza;
                    int i13 = i12 >>> 3;
                    int i14 = i12 & 7;
                    if (i13 == 2) {
                        if (i14 != 0) {
                            if (i12 != 12) {
                                break;
                                break;
                            }
                            iZzc2 = zzajr.zza(i12, bArr2, iZzc, i10, zzajuVar2);
                        } else {
                            iZzc2 = zzajr.zzc(bArr2, iZzc, zzajuVar2);
                            i11 = zzajuVar2.zza;
                            zzfVar = (zzalf.zzf) this.zzd.zza(zzajuVar2.zzd, this.zza, i11);
                        }
                    } else {
                        if (i13 == 3) {
                            if (zzfVar != null) {
                                zzamx.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i14 == 2) {
                                iZzc2 = zzajr.zza(bArr2, iZzc, zzajuVar2);
                                zzajvVar = (zzajv) zzajuVar2.zzc;
                            }
                        }
                        if (i12 != 12) {
                            break;
                        } else {
                            iZzc2 = zzajr.zza(i12, bArr2, iZzc, i10, zzajuVar2);
                        }
                    }
                }
                if (zzajvVar != null) {
                    zzanxVar.zza((i11 << 3) | 2, zzajvVar);
                }
                i7 = iZzc;
                bArr = bArr2;
                i8 = i10;
                zzajuVar = zzajuVar2;
            } else if ((i9 & 7) == 2) {
                zzfVar = (zzalf.zzf) this.zzd.zza(zzajuVar.zzd, this.zza, i9 >>> 3);
                if (zzfVar == null) {
                    i7 = zzajr.zza(i9, bArr, iZzc2, i8, zzanxVar, zzajuVar);
                } else {
                    zzamx.zza();
                    throw new NoSuchMethodError();
                }
            } else {
                i7 = zzajr.zza(i9, bArr, iZzc2, i8, zzajuVar);
            }
        }
        if (i7 != i8) {
            throw zzall.zzg();
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final void zza(T t7, zzaol zzaolVar) {
        Iterator itZzd = this.zzd.zza(t7).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zzakz zzakzVar = (zzakz) entry.getKey();
            if (zzakzVar.zzc() == zzaoj.MESSAGE && !zzakzVar.zze() && !zzakzVar.zzd()) {
                if (entry instanceof zzalp) {
                    zzaolVar.zza(zzakzVar.zza(), (Object) ((zzalp) entry).zza().zzb());
                } else {
                    zzaolVar.zza(zzakzVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzanu<?, ?> zzanuVar = this.zzb;
        zzanuVar.zza(zzanuVar.zzd(t7), zzaolVar);
    }
}
