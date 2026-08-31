package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.C3553a;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzakl implements zzanc {
    private final zzakh zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzakl(zzakh zzakhVar) {
        zzakh zzakhVar2 = (zzakh) zzalh.zza(zzakhVar, "input");
        this.zza = zzakhVar2;
        zzakhVar2.zzc = this;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final double zza() throws zzalo {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final float zzb() throws zzalo {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final int zzc() {
        int i7 = this.zzd;
        if (i7 != 0) {
            this.zzb = i7;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i8 = this.zzb;
        return (i8 == 0 || i8 == this.zzc) ? C3553a.e.API_PRIORITY_OTHER : i8 >>> 3;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final int zze() throws zzalo {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final int zzf() throws zzalo {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final int zzg() throws zzalo {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final int zzh() throws zzalo {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final int zzi() throws zzalo {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final int zzj() throws zzalo {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final long zzk() throws zzalo {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final long zzl() throws zzalo {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final long zzm() throws zzalo {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final long zzn() throws zzalo {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final long zzo() throws zzalo {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final zzajv zzp() throws zzalo {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final String zzq() throws zzalo {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final String zzr() throws zzalo {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final boolean zzs() throws zzalo {
        zzb(0);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final boolean zzt() {
        int i7;
        if (this.zza.zzw() || (i7 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zze(i7);
    }

    private final <T> void zzd(T t7, zzanb<T> zzanbVar, zzaku zzakuVar) throws zzall {
        int iZzj = this.zza.zzj();
        this.zza.zzt();
        int iZzb = this.zza.zzb(iZzj);
        this.zza.zza++;
        zzanbVar.zza(t7, this, zzakuVar);
        this.zza.zzc(0);
        zzakh zzakhVar = this.zza;
        zzakhVar.zza--;
        zzakhVar.zzd(iZzb);
    }

    public static zzakl zza(zzakh zzakhVar) {
        zzakl zzaklVar = zzakhVar.zzc;
        return zzaklVar != null ? zzaklVar : new zzakl(zzakhVar);
    }

    private final <T> T zzb(zzanb<T> zzanbVar, zzaku zzakuVar) throws zzall {
        T tZza = zzanbVar.zza();
        zzd(tZza, zzanbVar, zzakuVar);
        zzanbVar.zzd(tZza);
        return tZza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zze(List<Integer> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzaliVar.zzc(this.zza.zze());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i7 == 5) {
                do {
                    zzaliVar.zzc(this.zza.zze());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Integer.valueOf(this.zza.zze()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i8 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzf(List<Long> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i7 = this.zzb & 7;
            if (i7 == 1) {
                do {
                    zzalxVar.zza(this.zza.zzk());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzalxVar.zza(this.zza.zzk());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzk()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Long.valueOf(this.zza.zzk()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzg(List<Float> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzald) {
            zzald zzaldVar = (zzald) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzaldVar.zza(this.zza.zzb());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i7 == 5) {
                do {
                    zzaldVar.zza(this.zza.zzb());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Float.valueOf(this.zza.zzb()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i8 == 5) {
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzh(List<Integer> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzaliVar.zzc(this.zza.zzf());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaliVar.zzc(this.zza.zzf());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzi(List<Long> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzalxVar.zza(this.zza.zzl());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalxVar.zza(this.zza.zzl());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzl()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzl()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzj(List<Integer> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzaliVar.zzc(this.zza.zzg());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i7 == 5) {
                do {
                    zzaliVar.zzc(this.zza.zzg());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i8 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzk(List<Long> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i7 = this.zzb & 7;
            if (i7 == 1) {
                do {
                    zzalxVar.zza(this.zza.zzn());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzalxVar.zza(this.zza.zzn());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Long.valueOf(this.zza.zzn()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzl(List<Integer> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzaliVar.zzc(this.zza.zzh());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaliVar.zzc(this.zza.zzh());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzm(List<Long> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzalxVar.zza(this.zza.zzo());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalxVar.zza(this.zza.zzo());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzn(List<String> list) throws zzalo {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzo(List<String> list) throws zzalo {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzp(List<Integer> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzaliVar.zzc(this.zza.zzj());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaliVar.zzc(this.zza.zzj());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzq(List<Long> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzalxVar.zza(this.zza.zzp());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalxVar.zza(this.zza.zzp());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzall.zza();
    }

    private final Object zza(zzaog zzaogVar, Class<?> cls, zzaku zzakuVar) throws zzalo {
        switch (zzako.zza[zzaogVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzamx.zza().zza((Class) cls), zzakuVar);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final <T> void zzc(T t7, zzanb<T> zzanbVar, zzaku zzakuVar) {
        int i7 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzanbVar.zza(t7, this, zzakuVar);
            if (this.zzb == this.zzc) {
                this.zzc = i7;
                return;
            }
            throw zzall.zzg();
        } catch (Throwable th) {
            this.zzc = i7;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final <T> void zzb(T t7, zzanb<T> zzanbVar, zzaku zzakuVar) throws zzall {
        zzb(2);
        zzd(t7, zzanbVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzb(List<zzajv> list) throws zzalo {
        int iZzi;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzd(List<Integer> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzaliVar.zzc(this.zza.zzd());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaliVar.zzc(this.zza.zzd());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzall.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final <T> void zzb(List<T> list, zzanb<T> zzanbVar, zzaku zzakuVar) throws zzalo {
        int iZzi;
        int i7 = this.zzb;
        if ((i7 & 7) == 2) {
            do {
                list.add(zzb(zzanbVar, zzakuVar));
                if (this.zza.zzw() || this.zzd != 0) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == i7);
            this.zzd = iZzi;
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zzc(List<Double> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzaks) {
            zzaks zzaksVar = (zzaks) list;
            int i7 = this.zzb & 7;
            if (i7 == 1) {
                do {
                    zzaksVar.zza(this.zza.zza());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzaksVar.zza(this.zza.zza());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 1) {
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Double.valueOf(this.zza.zza()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzall.zza();
    }

    private final void zzb(int i7) throws zzalo {
        if ((this.zzb & 7) != i7) {
            throw zzall.zza();
        }
    }

    private final <T> T zza(zzanb<T> zzanbVar, zzaku zzakuVar) {
        T tZza = zzanbVar.zza();
        zzc(tZza, zzanbVar, zzakuVar);
        zzanbVar.zzd(tZza);
        return tZza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final <T> void zza(T t7, zzanb<T> zzanbVar, zzaku zzakuVar) throws zzalo {
        zzb(3);
        zzc(t7, zzanbVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final void zza(List<Boolean> list) throws zzall {
        int iZzi;
        int iZzi2;
        if (list instanceof zzajt) {
            zzajt zzajtVar = (zzajt) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzajtVar.zza(this.zza.zzx());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajtVar.zza(this.zza.zzx());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzall.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Boolean.valueOf(this.zza.zzx()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Boolean.valueOf(this.zza.zzx()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzall.zza();
    }

    private static void zzd(int i7) throws zzall {
        if ((i7 & 7) != 0) {
            throw zzall.zzg();
        }
    }

    private static void zzc(int i7) throws zzall {
        if ((i7 & 3) != 0) {
            throw zzall.zzg();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    @Deprecated
    public final <T> void zza(List<T> list, zzanb<T> zzanbVar, zzaku zzakuVar) throws zzalo {
        int iZzi;
        int i7 = this.zzb;
        if ((i7 & 7) == 3) {
            do {
                list.add(zza(zzanbVar, zzakuVar));
                if (this.zza.zzw() || this.zzd != 0) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == i7);
            this.zzd = iZzi;
            return;
        }
        throw zzall.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanc
    public final <K, V> void zza(Map<K, V> map, zzamd<K, V> zzamdVar, zzaku zzakuVar) throws zzalo {
        zzb(2);
        int iZzb = this.zza.zzb(this.zza.zzj());
        Object objZza = zzamdVar.zzb;
        Object objZza2 = zzamdVar.zzd;
        while (true) {
            try {
                int iZzc = zzc();
                if (iZzc == Integer.MAX_VALUE || this.zza.zzw()) {
                    break;
                }
                if (iZzc == 1) {
                    objZza = zza(zzamdVar.zza, (Class<?>) null, (zzaku) null);
                } else if (iZzc != 2) {
                    try {
                        if (!zzt()) {
                            throw new zzall("Unable to parse map entry.");
                        }
                    } catch (zzalo e7) {
                        if (!zzt()) {
                            throw new zzall("Unable to parse map entry.", e7);
                        }
                    }
                } else {
                    objZza2 = zza(zzamdVar.zzc, zzamdVar.zzd.getClass(), zzakuVar);
                }
            } catch (Throwable th) {
                this.zza.zzd(iZzb);
                throw th;
            }
        }
        map.put(objZza, objZza2);
        this.zza.zzd(iZzb);
    }

    private final void zza(List<String> list, boolean z7) throws zzalo {
        int iZzi;
        int iZzi2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzalt) && !z7) {
                zzalt zzaltVar = (zzalt) list;
                do {
                    zzaltVar.zza(zzp());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            do {
                list.add(z7 ? zzr() : zzq());
                if (this.zza.zzw()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzall.zza();
    }

    private final void zza(int i7) throws zzall {
        if (this.zza.zzc() != i7) {
            throw zzall.zzj();
        }
    }
}
