package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzann implements zzacu {
    private final int zza;
    private final List zzb;
    private final zzef zzc;
    private final SparseIntArray zzd;
    private final zzanq zze;
    private final zzajt zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzanj zzj;
    private zzani zzk;
    private zzacx zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        int i7 = zzanm.zza;
    }

    @Deprecated
    public zzann() {
        this(1, 1, zzajt.zza, new zzel(0L), new zzama(0), 112800);
    }

    final /* synthetic */ List zza() {
        return this.zzb;
    }

    final /* synthetic */ zzanq zzb() {
        return this.zze;
    }

    final /* synthetic */ SparseArray zzc() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws EOFException, InterruptedIOException {
        byte[] bArrZzi = this.zzc.zzi();
        zzacl zzaclVar = (zzacl) zzacvVar;
        zzaclVar.zzh(bArrZzi, 0, 940, false);
        for (int i7 = 0; i7 < 188; i7++) {
            int i8 = 0;
            while (true) {
                if (i8 >= 5) {
                    zzaclVar.zze(i7, false);
                    return true;
                }
                if (bArrZzi[(i8 * 188) + i7] != 71) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        if (this.zza == 0) {
            zzacxVar = new zzajw(zzacxVar, this.zzf);
        }
        this.zzl = zzacxVar;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x019c  */
    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) {
        long j7;
        long jZzo = zzacvVar.zzo();
        long j8 = -1;
        if (this.zzn) {
            if (jZzo != -1) {
                zzanj zzanjVar = this.zzj;
                if (!zzanjVar.zza()) {
                    return zzanjVar.zzb(zzacvVar, zzadsVar, this.zzr);
                }
            }
            if (this.zzo) {
                j7 = 0;
            } else {
                this.zzo = true;
                zzanj zzanjVar2 = this.zzj;
                if (zzanjVar2.zzc() != -9223372036854775807L) {
                    j7 = 0;
                    zzani zzaniVar = new zzani(zzanjVar2.zzd(), zzanjVar2.zzc(), jZzo, this.zzr, 112800);
                    this.zzk = zzaniVar;
                    this.zzl.zzw(zzaniVar.zza());
                } else {
                    j7 = 0;
                    this.zzl.zzw(new zzadu(zzanjVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                this.zzp = false;
                zzh(j7, j7);
                if (zzacvVar.zzn() != j7) {
                    zzadsVar.zza = j7;
                    return 1;
                }
            }
            zzani zzaniVar2 = this.zzk;
            if (zzaniVar2 != null && zzaniVar2.zzc()) {
                return zzaniVar2.zzd(zzacvVar, zzadsVar);
            }
        } else {
            j8 = -1;
        }
        zzef zzefVar = this.zzc;
        byte[] bArrZzi = zzefVar.zzi();
        if (9400 - zzefVar.zzg() < 188) {
            int iZzd = zzefVar.zzd();
            if (iZzd > 0) {
                System.arraycopy(bArrZzi, zzefVar.zzg(), bArrZzi, 0, iZzd);
            }
            zzefVar.zzb(bArrZzi, iZzd);
        }
        while (zzefVar.zzd() < 188) {
            int iZze = zzefVar.zze();
            int iZza = zzacvVar.zza(bArrZzi, iZze, 9400 - iZze);
            if (iZza == -1) {
                int i7 = 0;
                while (true) {
                    SparseArray sparseArray = this.zzg;
                    if (i7 >= sparseArray.size()) {
                        return -1;
                    }
                    zzans zzansVar = (zzans) sparseArray.valueAt(i7);
                    if (zzansVar instanceof zzamw) {
                        zzamw zzamwVar = (zzamw) zzansVar;
                        if (zzamwVar.zzd(false)) {
                            zzamwVar.zzc(new zzef(), 1);
                        }
                    }
                    i7++;
                }
            } else {
                zzefVar.zzf(iZze + iZza);
            }
        }
        int iZzg = zzefVar.zzg();
        int iZze2 = zzefVar.zze();
        int iZza2 = zzant.zza(zzefVar.zzi(), iZzg, iZze2);
        zzefVar.zzh(iZza2);
        int i8 = iZza2 + 188;
        if (i8 > iZze2) {
            this.zzq += iZza2 - iZzg;
        } else {
            this.zzq = 0;
        }
        int iZze3 = zzefVar.zze();
        if (i8 > iZze3) {
            return 0;
        }
        int iZzB = zzefVar.zzB();
        if ((8388608 & iZzB) != 0) {
            zzefVar.zzh(i8);
            return 0;
        }
        int i9 = (4194304 & iZzB) != 0 ? 1 : 0;
        int i10 = iZzB & 32;
        int i11 = (iZzB >> 8) & 8191;
        zzans zzansVar2 = (iZzB & 16) != 0 ? (zzans) this.zzg.get(i11) : null;
        if (zzansVar2 == null) {
            zzefVar.zzh(i8);
            return 0;
        }
        int i12 = iZzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i13 = sparseIntArray.get(i11, i12 - 1);
        sparseIntArray.put(i11, i12);
        if (i13 == i12) {
            zzefVar.zzh(i8);
            return 0;
        }
        if (i12 != ((i13 + 1) & 15)) {
            zzansVar2.zzb();
        }
        if (i10 != 0) {
            int iZzs = zzefVar.zzs();
            i9 |= (zzefVar.zzs() & 64) != 0 ? 2 : 0;
            zzefVar.zzk(iZzs - 1);
        }
        boolean z7 = this.zzn;
        if (z7 || !this.zzi.get(i11, false)) {
            zzefVar.zzf(i8);
            zzansVar2.zzc(zzefVar, i9);
            zzefVar.zzf(iZze3);
            if (!z7) {
                if (this.zzn && jZzo != j8) {
                    this.zzp = true;
                }
            }
        } else if (this.zzn) {
            this.zzp = true;
        }
        zzefVar.zzh(i8);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        zzani zzaniVar;
        List list = this.zzb;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            zzel zzelVar = (zzel) list.get(i7);
            if (zzelVar.zzc() != -9223372036854775807L) {
                long jZza = zzelVar.zza();
                if (jZza != -9223372036854775807L && jZza != 0 && jZza != j8) {
                    zzelVar.zzd(j8);
                }
            } else {
                zzelVar.zzd(j8);
            }
        }
        if (j8 != 0 && (zzaniVar = this.zzk) != null) {
            zzaniVar.zzb(j8);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        int i8 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i8 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((zzans) sparseArray.valueAt(i8)).zzb();
                i8++;
            }
        }
    }

    final /* synthetic */ SparseBooleanArray zzj() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzi;
    }

    final /* synthetic */ zzacx zzl() {
        return this.zzl;
    }

    final /* synthetic */ int zzm() {
        return this.zzm;
    }

    final /* synthetic */ void zzn(int i7) {
        this.zzm = i7;
    }

    final /* synthetic */ void zzo(boolean z7) {
        this.zzn = true;
    }

    final /* synthetic */ void zzp(int i7) {
        this.zzr = i7;
    }

    public zzann(int i7, int i8, zzajt zzajtVar, zzel zzelVar, zzanq zzanqVar, int i9) {
        this.zze = zzanqVar;
        this.zza = i8;
        this.zzf = zzajtVar;
        this.zzb = Collections.singletonList(zzelVar);
        this.zzc = new zzef(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzanj(112800);
        this.zzl = zzacx.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzanqVar.zza();
        int size = sparseArrayZza.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.zzg.put(sparseArrayZza.keyAt(i10), (zzans) sparseArrayZza.valueAt(i10));
        }
        this.zzg.put(0, new zzane(new zzank(this)));
    }
}
