package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.C3553a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzlj implements zzov {
    private final zzli zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzlj(zzli zzliVar) {
        byte[] bArr = zznl.zzb;
        this.zza = zzliVar;
        zzliVar.zzc = this;
    }

    private final void zzP(Object obj, zzow zzowVar, zzmo zzmoVar) {
        int i7 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzowVar.zzh(obj, this, zzmoVar);
            if (this.zzb != this.zzc) {
                throw new zznn("Failed to parse the message.");
            }
            this.zzc = i7;
        } catch (Throwable th) {
            this.zzc = i7;
            throw th;
        }
    }

    private final void zzQ(Object obj, zzow zzowVar, zzmo zzmoVar) throws zznn {
        zzli zzliVar = this.zza;
        int iZzn = zzliVar.zzn();
        if (zzliVar.zza >= zzliVar.zzb) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iZze = zzliVar.zze(iZzn);
        this.zza.zza++;
        zzowVar.zzh(obj, this, zzmoVar);
        this.zza.zzz(0);
        zzli zzliVar2 = this.zza;
        zzliVar2.zza--;
        zzliVar2.zzA(iZze);
    }

    private final void zzR(int i7) throws zznn {
        if (this.zza.zzd() != i7) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzS(int i7) throws zznm {
        if ((this.zzb & 7) != i7) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzT(int i7) throws zznn {
        if ((i7 & 3) != 0) {
            throw new zznn("Failed to parse the message.");
        }
    }

    private static final void zzU(int i7) throws zznn {
        if ((i7 & 7) != 0) {
            throw new zznn("Failed to parse the message.");
        }
    }

    public static zzlj zzq(zzli zzliVar) {
        zzlj zzljVar = zzliVar.zzc;
        return zzljVar != null ? zzljVar : new zzlj(zzliVar);
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzA(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                int iZzn = this.zza.zzn();
                zzU(iZzn);
                int iZzd = iZzn + this.zza.zzd();
                do {
                    zznxVar.zzg(this.zza.zzo());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zznxVar.zzg(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                int iZzn2 = this.zza.zzn();
                zzU(iZzn2);
                int iZzd2 = iZzn2 + this.zza.zzd();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzB(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zzmv) {
            zzmv zzmvVar = (zzmv) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int iZzn = this.zza.zzn();
                zzT(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzmvVar.zzf(this.zza.zzc());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i7 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            do {
                zzmvVar.zzf(this.zza.zzc());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int iZzn2 = this.zza.zzn();
                zzT(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i8 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    @Deprecated
    public final void zzC(List list, zzow zzowVar, zzmo zzmoVar) throws zznm {
        int iZzm;
        int i7 = this.zzb;
        if ((i7 & 7) != 3) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = zzowVar.zze();
            zzP(objZze, zzowVar, zzmoVar);
            zzowVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i7);
        this.zzd = iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzD(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int iZzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zzneVar.zzh(this.zza.zzh());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzneVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int iZzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzE(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int iZzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zznxVar.zzg(this.zza.zzp());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zznxVar.zzg(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int iZzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzF(List list, zzow zzowVar, zzmo zzmoVar) throws zznn {
        int iZzm;
        int i7 = this.zzb;
        if ((i7 & 7) != 2) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = zzowVar.zze();
            zzQ(objZze, zzowVar, zzmoVar);
            zzowVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i7);
        this.zzd = iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzG(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int iZzn = this.zza.zzn();
                zzT(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzneVar.zzh(this.zza.zzk());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i7 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            do {
                zzneVar.zzh(this.zza.zzk());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int iZzn2 = this.zza.zzn();
                zzT(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i8 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzH(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                int iZzn = this.zza.zzn();
                zzU(iZzn);
                int iZzd = iZzn + this.zza.zzd();
                do {
                    zznxVar.zzg(this.zza.zzt());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zznxVar.zzg(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                int iZzn2 = this.zza.zzn();
                zzU(iZzn2);
                int iZzd2 = iZzn2 + this.zza.zzd();
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzI(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int iZzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zzneVar.zzh(this.zza.zzl());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzneVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int iZzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzJ(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int iZzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zznxVar.zzg(this.zza.zzu());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zznxVar.zzg(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int iZzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    public final void zzK(List list, boolean z7) throws zznm {
        int iZzm;
        int iZzm2;
        if ((this.zzb & 7) != 2) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zznu) && !z7) {
            zznu zznuVar = (zznu) list;
            do {
                zzp();
                zznuVar.zzb();
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            do {
                list.add(z7 ? zzs() : zzr());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzL(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int iZzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zzneVar.zzh(this.zza.zzn());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzneVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int iZzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzM(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int iZzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zznxVar.zzg(this.zza.zzv());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zznxVar.zzg(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int iZzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final boolean zzN() throws zznm {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final boolean zzO() {
        int i7;
        if (this.zza.zzC() || (i7 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i7);
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final double zza() throws zznm {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final float zzb() throws zznm {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzc() {
        int iZzm = this.zzd;
        if (iZzm != 0) {
            this.zzb = iZzm;
            this.zzd = 0;
        } else {
            iZzm = this.zza.zzm();
            this.zzb = iZzm;
        }
        return (iZzm == 0 || iZzm == this.zzc) ? C3553a.e.API_PRIORITY_OTHER : iZzm >>> 3;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zze() throws zznm {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzf() throws zznm {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzg() throws zznm {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzh() throws zznm {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzi() throws zznm {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzj() throws zznm {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final long zzk() throws zznm {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final long zzl() throws zznm {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final long zzm() throws zznm {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final long zzn() throws zznm {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final long zzo() throws zznm {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final zzle zzp() throws zznm {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final String zzr() throws zznm {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final String zzs() throws zznm {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzt(Object obj, zzow zzowVar, zzmo zzmoVar) throws zznm {
        zzS(3);
        zzP(obj, zzowVar, zzmoVar);
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzu(Object obj, zzow zzowVar, zzmo zzmoVar) throws zznn {
        zzS(2);
        zzQ(obj, zzowVar, zzmoVar);
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzv(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zzkv) {
            zzkv zzkvVar = (zzkv) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int iZzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zzkvVar.zze(this.zza.zzD());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzkvVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int iZzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzw(List list) throws zznm {
        int iZzm;
        if ((this.zzb & 7) != 2) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == this.zzb);
        this.zzd = iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzx(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zzmi) {
            zzmi zzmiVar = (zzmi) list;
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                int iZzn = this.zza.zzn();
                zzU(iZzn);
                int iZzd = iZzn + this.zza.zzd();
                do {
                    zzmiVar.zzf(this.zza.zzb());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzmiVar.zzf(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                int iZzn2 = this.zza.zzn();
                zzU(iZzn2);
                int iZzd2 = iZzn2 + this.zza.zzd();
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzy(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int iZzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zzneVar.zzh(this.zza.zzf());
                } while (this.zza.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzneVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int iZzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzz(List list) throws zznn {
        int iZzm;
        int iZzm2;
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int iZzn = this.zza.zzn();
                zzT(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzneVar.zzh(this.zza.zzg());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i7 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            do {
                zzneVar.zzh(this.zza.zzg());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int iZzn2 = this.zza.zzn();
                zzT(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i8 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }
}
