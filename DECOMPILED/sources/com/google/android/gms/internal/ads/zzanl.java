package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzanl implements zzand {
    final /* synthetic */ zzann zza;
    private final zzee zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzanl(zzann zzannVar, int i7) {
        Objects.requireNonNull(zzannVar);
        this.zza = zzannVar;
        this.zzb = new zzee(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void zza(zzel zzelVar, zzacx zzacxVar, zzanr zzanrVar) {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:32:0x0102  */
    @Override // com.google.android.gms.internal.ads.zzand
    public final void zzb(zzef zzefVar) {
        int i7;
        if (zzefVar.zzs() != 2) {
            return;
        }
        zzann zzannVar = this.zza;
        zzel zzelVar = (zzel) zzannVar.zza().get(0);
        if ((zzefVar.zzs() & 128) != 0) {
            zzefVar.zzk(1);
            int iZzt = zzefVar.zzt();
            int i8 = 3;
            zzefVar.zzk(3);
            zzee zzeeVar = this.zzb;
            zzefVar.zzl(zzeeVar, 2);
            zzeeVar.zzh(3);
            int i9 = 13;
            zzannVar.zzp(zzeeVar.zzj(13));
            zzefVar.zzl(zzeeVar, 2);
            int i10 = 4;
            zzeeVar.zzh(4);
            int i11 = 12;
            zzefVar.zzk(zzeeVar.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZzd = zzefVar.zzd();
            while (iZzd > 0) {
                int i12 = 5;
                zzefVar.zzl(zzeeVar, 5);
                int iZzj = zzeeVar.zzj(8);
                zzeeVar.zzh(i8);
                int iZzj2 = zzeeVar.zzj(i9);
                zzeeVar.zzh(i10);
                int iZzj3 = zzeeVar.zzj(i11);
                int iZzg = zzefVar.zzg();
                int i13 = iZzg + iZzj3;
                String str = null;
                ArrayList arrayList = null;
                int i14 = -1;
                int iZzs = 0;
                while (zzefVar.zzg() < i13) {
                    int iZzs2 = zzefVar.zzs();
                    int iZzg2 = zzefVar.zzg() + zzefVar.zzs();
                    if (iZzg2 > i13) {
                        break;
                    }
                    if (iZzs2 == i12) {
                        long jZzz = zzefVar.zzz();
                        if (jZzz == 1094921523) {
                            zzannVar = zzannVar;
                            i14 = 129;
                        } else if (jZzz == 1161904947) {
                            zzannVar = zzannVar;
                            zzeeVar = zzeeVar;
                            iZzd = iZzd;
                            i14 = 135;
                            iZzg2 = iZzg2;
                        } else if (jZzz == 1094921524) {
                            zzannVar = zzannVar;
                            i14 = 172;
                        } else if (jZzz == 1212503619) {
                            i7 = 36;
                            i14 = i7;
                        }
                    } else if (iZzs2 == 106) {
                        zzannVar = zzannVar;
                        i14 = 129;
                    } else if (iZzs2 == 122) {
                        zzannVar = zzannVar;
                        zzeeVar = zzeeVar;
                        iZzd = iZzd;
                        i14 = 135;
                        iZzg2 = iZzg2;
                    } else {
                        if (iZzs2 == 127) {
                            int iZzs3 = zzefVar.zzs();
                            if (iZzs3 == 21) {
                                zzannVar = zzannVar;
                                i14 = 172;
                            } else if (iZzs3 == 14) {
                                i7 = 136;
                            } else if (iZzs3 == 33) {
                                i7 = 139;
                            }
                        } else if (iZzs2 == 123) {
                            i7 = 138;
                        } else if (iZzs2 == 10) {
                            String strTrim = zzefVar.zzK(3, StandardCharsets.UTF_8).trim();
                            iZzs = zzefVar.zzs();
                            str = strTrim;
                        } else if (iZzs2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (zzefVar.zzg() < iZzg2) {
                                int i15 = iZzg2;
                                String strTrim2 = zzefVar.zzK(3, StandardCharsets.UTF_8).trim();
                                int iZzs4 = zzefVar.zzs();
                                int i16 = iZzd;
                                byte[] bArr = new byte[4];
                                zzefVar.zzm(bArr, 0, 4);
                                arrayList2.add(new zzano(strTrim2, iZzs4, bArr));
                                iZzd = i16;
                                iZzg2 = i15;
                                zzeeVar = zzeeVar;
                                zzannVar = zzannVar;
                            }
                            zzannVar = zzannVar;
                            iZzg2 = iZzg2;
                            zzeeVar = zzeeVar;
                            iZzd = iZzd;
                            arrayList = arrayList2;
                            i14 = 89;
                        } else {
                            zzannVar = zzannVar;
                            iZzg2 = iZzg2;
                            zzeeVar = zzeeVar;
                            iZzd = iZzd;
                            if (iZzs2 == 111) {
                                i14 = 257;
                            }
                        }
                        i14 = i7;
                    }
                    zzefVar.zzk(iZzg2 - zzefVar.zzg());
                    iZzd = iZzd;
                    zzeeVar = zzeeVar;
                    zzannVar = zzannVar;
                    i12 = 5;
                }
                zzann zzannVar2 = zzannVar;
                zzee zzeeVar2 = zzeeVar;
                int i17 = iZzd;
                zzefVar.zzh(i13);
                zzanp zzanpVar = new zzanp(i14, str, iZzs, arrayList, Arrays.copyOfRange(zzefVar.zzi(), iZzg, i13));
                if (iZzj == 6 || iZzj == 5) {
                    iZzj = zzanpVar.zza;
                }
                iZzd = i17 - (iZzj3 + 5);
                if (!zzannVar2.zzj().get(iZzj2)) {
                    zzans zzansVarZzb = zzannVar2.zzb().zzb(iZzj, zzanpVar);
                    sparseIntArray.put(iZzj2, iZzj2);
                    sparseArray.put(iZzj2, zzansVarZzb);
                }
                i10 = 4;
                zzeeVar = zzeeVar2;
                zzannVar = zzannVar2;
                i8 = 3;
                i9 = 13;
                i11 = 12;
            }
            zzann zzannVar3 = zzannVar;
            int size = sparseIntArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                int iKeyAt = sparseIntArray.keyAt(i18);
                int iValueAt = sparseIntArray.valueAt(i18);
                zzannVar3.zzj().put(iKeyAt, true);
                zzannVar3.zzk().put(iValueAt, true);
                zzans zzansVar = (zzans) sparseArray.valueAt(i18);
                if (zzansVar != null) {
                    zzansVar.zza(zzelVar, zzannVar3.zzl(), new zzanr(iZzt, iKeyAt, 8192));
                    zzannVar3.zzc().put(iValueAt, zzansVar);
                }
            }
            zzannVar3.zzc().remove(this.zze);
            zzannVar3.zzn(0);
            if (zzannVar3.zzm() == 0) {
                zzannVar3.zzl().zzv();
                zzannVar3.zzo(true);
            }
        }
    }
}
