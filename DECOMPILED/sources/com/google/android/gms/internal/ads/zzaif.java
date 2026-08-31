package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.C3553a;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaif implements zzacu {
    private static final byte[] zza;
    private static final zzu zzb;
    private long zzA;
    private long zzB;
    private zzaie zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzacx zzI;
    private zzaeb[] zzJ;
    private zzaeb[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzajt zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzef zzg;
    private final zzef zzh;
    private final zzef zzi;
    private final byte[] zzj;
    private final zzef zzk;
    private final zzaft zzl;
    private final zzef zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzfp zzp;
    private final zzacj zzq;
    private zzgjz zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzef zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        int i7 = zzaib.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        zzs zzsVar = new zzs();
        zzsVar.zzm("application/x-emsg");
        zzb = zzsVar.zzM();
    }

    @Deprecated
    public zzaif() {
        this(zzajt.zza, 32, null, null, zzgjz.zzi(), null);
    }

    private final void zzb() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:143:0x0420  */
    /* JADX WARN: Code duplicated, block: B:146:0x0435 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x0437  */
    /* JADX WARN: Code duplicated, block: B:148:0x0440  */
    /* JADX WARN: Code duplicated, block: B:151:0x0449  */
    /* JADX WARN: Code duplicated, block: B:152:0x0454  */
    /* JADX WARN: Code duplicated, block: B:155:0x045d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0462  */
    /* JADX WARN: Code duplicated, block: B:157:0x0464 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x0466  */
    /* JADX WARN: Code duplicated, block: B:159:0x046b  */
    /* JADX WARN: Code duplicated, block: B:160:0x046d A[PHI: r33
      0x046d: PHI (r33v4 int) = (r4v53 int), (r33v5 int) binds: [B:156:0x0462, B:159:0x046b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x0471  */
    /* JADX WARN: Code duplicated, block: B:164:0x047c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0495  */
    /* JADX WARN: Code duplicated, block: B:170:0x04a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x04a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:173:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:174:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0277  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zzc(long j7) throws zzas {
        zzao zzaoVar;
        int i7;
        int i8;
        List list;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        zzaie zzaieVar;
        int i15;
        byte[] bArr;
        int i16;
        boolean z7;
        int i17;
        int i18;
        int i19;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        int i20;
        boolean z8;
        int i21;
        long j8;
        long j9;
        int i22;
        int iZzB;
        int iZzB2;
        int iZzB3;
        int iZzB4;
        long jZzt;
        boolean z9;
        long[] jArr2;
        int i23 = 8;
        int i24 = 1;
        while (true) {
            ArrayDeque arrayDeque = this.zzn;
            if (arrayDeque.isEmpty() || ((zzet) arrayDeque.peek()).zza != j7) {
                break;
            }
            zzet zzetVar = (zzet) arrayDeque.pop();
            int i25 = zzetVar.zzd;
            int i26 = 12;
            if (i25 == 1836019574) {
                zzp zzpVarZzm = zzm(zzetVar.zzb);
                zzet zzetVarZzd = zzetVar.zzd(1836475768);
                zzetVarZzd.getClass();
                SparseArray sparseArray = new SparseArray();
                List list2 = zzetVarZzd.zzb;
                int size = list2.size();
                int i27 = 0;
                long jZzz = -9223372036854775807L;
                while (i27 < size) {
                    zzeu zzeuVar = (zzeu) list2.get(i27);
                    int i28 = zzeuVar.zzd;
                    if (i28 == 1953654136) {
                        zzef zzefVar = zzeuVar.zza;
                        zzefVar.zzh(i26);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzefVar.zzB()), new zzahz(zzefVar.zzB() - 1, zzefVar.zzB(), zzefVar.zzB(), zzefVar.zzB()));
                        sparseArray.put(((Integer) pairCreate.first).intValue(), (zzahz) pairCreate.second);
                    } else if (i28 == 1835362404) {
                        zzef zzefVar2 = zzeuVar.zza;
                        zzefVar2.zzh(i23);
                        jZzz = zzahy.zza(zzefVar2.zzB()) == 0 ? zzefVar2.zzz() : zzefVar2.zzJ();
                    }
                    i27 += i24;
                    i26 = 12;
                }
                zzet zzetVarZzd2 = zzetVar.zzd(1835365473);
                zzao zzaoVarZze = zzetVarZzd2 != null ? zzahy.zze(zzetVarZzd2) : null;
                zzadk zzadkVar = new zzadk();
                zzeu zzeuVarZzc = zzetVar.zzc(1969517665);
                if (zzeuVarZzc != null) {
                    zzao zzaoVarZzc = zzahy.zzc(zzeuVarZzc);
                    zzadkVar.zza(zzaoVarZzc);
                    zzaoVar = zzaoVarZzc;
                } else {
                    zzaoVar = null;
                }
                zzeu zzeuVarZzc2 = zzetVar.zzc(1836476516);
                zzeuVarZzc2.getClass();
                zzan[] zzanVarArr = new zzan[i24];
                zzanVarArr[0] = zzahy.zzd(zzeuVarZzc2.zza);
                zzao zzaoVar2 = new zzao(-9223372036854775807L, zzanVarArr);
                List listZzb = zzahy.zzb(zzetVar, zzadkVar, jZzz, zzpVarZzm, (this.zzd & 16) != 0 ? i24 : 0, false, new zzggr(this) { // from class: com.google.android.gms.internal.ads.zzaia
                    @Override // com.google.android.gms.internal.ads.zzggr
                    public final /* synthetic */ Object apply(Object obj) {
                        return (zzais) obj;
                    }
                }, false);
                int size2 = listZzb.size();
                SparseArray sparseArray2 = this.zzf;
                if (sparseArray2.size() == 0) {
                    String strZza = zzaii.zza(listZzb);
                    int i29 = 0;
                    while (i29 < size2) {
                        zzaiv zzaivVar = (zzaiv) listZzb.get(i29);
                        zzais zzaisVar = zzaivVar.zza;
                        zzacx zzacxVar = this.zzI;
                        int i30 = i24;
                        int i31 = zzaisVar.zzb;
                        zzaeb zzaebVarZzu = zzacxVar.zzu(i29, i31);
                        zzao zzaoVar3 = zzaoVar;
                        long j10 = zzaisVar.zze;
                        int i32 = i29;
                        zzu zzuVar = zzaisVar.zzg;
                        List list3 = listZzb;
                        zzs zzsVarZza = zzuVar.zza();
                        zzsVarZza.zzl(strZza);
                        zzaih.zzb(i31, zzadkVar, zzsVarZza);
                        zzaih.zza(i31, zzaoVarZze, zzsVarZza, zzuVar.zzl, zzaoVar3, zzaoVar2);
                        int i33 = zzaisVar.zza;
                        sparseArray2.put(i33, new zzaie(zzaebVarZzu, zzaivVar, zzn(sparseArray, i33), zzsVarZza.zzM()));
                        this.zzA = Math.max(this.zzA, j10);
                        i29 = i32 + 1;
                        zzaoVar = zzaoVar3;
                        i24 = i30;
                        strZza = strZza;
                        listZzb = list3;
                        zzadkVar = zzadkVar;
                    }
                    this.zzI.zzv();
                } else {
                    int i34 = i24;
                    zzghc.zzh(sparseArray2.size() == size2 ? i34 : 0);
                    for (int i35 = 0; i35 < size2; i35++) {
                        zzaiv zzaivVar2 = (zzaiv) listZzb.get(i35);
                        int i36 = zzaivVar2.zza.zza;
                        ((zzaie) sparseArray2.get(i36)).zza(zzaivVar2, zzn(sparseArray, i36));
                    }
                    i24 = i34;
                }
                i23 = 8;
            } else {
                int i37 = i24;
                int i38 = 16;
                int i39 = 4;
                int i40 = 2;
                int i41 = 0;
                if (i25 == 1836019558) {
                    SparseArray sparseArray3 = this.zzf;
                    int i42 = this.zzd;
                    byte[] bArr2 = this.zzj;
                    List list4 = zzetVar.zzc;
                    int size3 = list4.size();
                    int i43 = 0;
                    while (i43 < size3) {
                        zzet zzetVar2 = (zzet) list4.get(i43);
                        if (zzetVar2.zzd == 1953653094) {
                            zzeu zzeuVarZzc3 = zzetVar2.zzc(1952868452);
                            zzeuVarZzc3.getClass();
                            zzef zzefVar3 = zzeuVarZzc3.zza;
                            zzefVar3.zzh(8);
                            int iZzB5 = zzefVar3.zzB();
                            int i44 = zzahy.zza;
                            zzaie zzaieVar2 = (zzaie) sparseArray3.get(zzefVar3.zzB());
                            if (zzaieVar2 == null) {
                                zzaieVar = null;
                            } else {
                                if ((iZzB5 & 1) != 0) {
                                    long jZzJ = zzefVar3.zzJ();
                                    zzaiu zzaiuVar = zzaieVar2.zzb;
                                    zzaiuVar.zzb = jZzJ;
                                    zzaiuVar.zzc = jZzJ;
                                }
                                zzahz zzahzVar = zzaieVar2.zze;
                                zzaieVar2.zzb.zza = new zzahz((iZzB5 & 2) != 0 ? zzefVar3.zzB() - 1 : zzahzVar.zza, (iZzB5 & 8) != 0 ? zzefVar3.zzB() : zzahzVar.zzb, (iZzB5 & 16) != 0 ? zzefVar3.zzB() : zzahzVar.zzc, (iZzB5 & 32) != 0 ? zzefVar3.zzB() : zzahzVar.zzd);
                                zzaieVar = zzaieVar2;
                            }
                            if (zzaieVar == null) {
                                i8 = i42;
                                list = list4;
                                i9 = size3;
                                i10 = i43;
                                i11 = i38;
                                i12 = i39;
                                i13 = i40;
                                i14 = i41;
                            } else {
                                zzaiu zzaiuVar2 = zzaieVar.zzb;
                                long j11 = zzaiuVar2.zzp;
                                boolean z10 = zzaiuVar2.zzq;
                                zzaieVar.zzc();
                                boolean z11 = i37;
                                zzaieVar.zzl(z11);
                                zzeu zzeuVarZzc4 = zzetVar2.zzc(1952867444);
                                if (zzeuVarZzc4 == null || (i42 & 2) != 0) {
                                    zzaiuVar2.zzp = j11;
                                    zzaiuVar2.zzq = z10;
                                } else {
                                    zzef zzefVar4 = zzeuVarZzc4.zza;
                                    zzefVar4.zzh(8);
                                    zzaiuVar2.zzp = zzahy.zza(zzefVar4.zzB()) == z11 ? zzefVar4.zzJ() : zzefVar4.zzz();
                                    zzaiuVar2.zzq = z11;
                                }
                                List list5 = zzetVar2.zzb;
                                int size4 = list5.size();
                                i8 = i42;
                                int i45 = i41;
                                int i46 = i45;
                                int i47 = i46;
                                while (true) {
                                    i15 = 1953658222;
                                    if (i45 >= size4) {
                                        break;
                                    }
                                    List list6 = list4;
                                    zzeu zzeuVar2 = (zzeu) list5.get(i45);
                                    int i48 = size3;
                                    if (zzeuVar2.zzd == 1953658222) {
                                        zzef zzefVar5 = zzeuVar2.zza;
                                        zzefVar5.zzh(12);
                                        int iZzH = zzefVar5.zzH();
                                        if (iZzH > 0) {
                                            i47 += iZzH;
                                            i46++;
                                        }
                                    }
                                    i45++;
                                    size3 = i48;
                                    list4 = list6;
                                }
                                list = list4;
                                i9 = size3;
                                int i49 = i41;
                                zzaieVar.zzh = i49;
                                zzaieVar.zzg = i49;
                                zzaieVar.zzf = i49;
                                zzaiuVar2.zzd = i46;
                                zzaiuVar2.zze = i47;
                                if (zzaiuVar2.zzg.length < i46) {
                                    zzaiuVar2.zzf = new long[i46];
                                    zzaiuVar2.zzg = new int[i46];
                                }
                                if (zzaiuVar2.zzh.length < i47) {
                                    int i50 = (i47 * 125) / 100;
                                    zzaiuVar2.zzh = new int[i50];
                                    zzaiuVar2.zzi = new long[i50];
                                    zzaiuVar2.zzj = new boolean[i50];
                                    zzaiuVar2.zzl = new boolean[i50];
                                }
                                int i51 = 0;
                                int i52 = 0;
                                int i53 = 0;
                                while (i51 < size4) {
                                    long j12 = 0;
                                    zzeu zzeuVar3 = (zzeu) list5.get(i51);
                                    if (zzeuVar3.zzd == i15) {
                                        int i54 = i52 + 1;
                                        zzef zzefVar6 = zzeuVar3.zza;
                                        zzefVar6.zzh(8);
                                        int iZzB6 = zzefVar6.zzB();
                                        zzais zzaisVar2 = zzaieVar.zzd.zza;
                                        int i55 = i52;
                                        zzahz zzahzVar2 = zzaiuVar2.zza;
                                        String str = zzeo.zza;
                                        zzaiuVar2.zzg[i55] = zzefVar6.zzH();
                                        long[] jArr3 = zzaiuVar2.zzf;
                                        int i56 = i53;
                                        long j13 = zzaiuVar2.zzb;
                                        jArr3[i55] = j13;
                                        if ((iZzB6 & 1) != 0) {
                                            jArr3[i55] = j13 + ((long) zzefVar6.zzB());
                                        }
                                        boolean z12 = (iZzB6 & 4) != 0;
                                        int i57 = zzahzVar2.zzd;
                                        int iZzB7 = z12 ? zzefVar6.zzB() : i57;
                                        boolean z13 = z12;
                                        int i58 = iZzB6 & 256;
                                        int i59 = iZzB6 & 512;
                                        int i60 = iZzB6 & 1024;
                                        int i61 = iZzB6 & 2048;
                                        long[] jArr4 = zzaisVar2.zzi;
                                        if (jArr4 != null) {
                                            i17 = i60;
                                            if (jArr4.length == 1 && (jArr2 = zzaisVar2.zzj) != null) {
                                                long j14 = jArr4[0];
                                                if (j14 == 0) {
                                                    i18 = i57;
                                                    i19 = iZzB7;
                                                } else {
                                                    i18 = i57;
                                                    i19 = iZzB7;
                                                    long j15 = zzaisVar2.zzd;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    if (zzeo.zzt(j14, 1000000L, j15, roundingMode) + zzeo.zzt(jArr2[0], 1000000L, zzaisVar2.zzc, roundingMode) >= zzaisVar2.zze) {
                                                    }
                                                }
                                                j12 = jArr2[0];
                                            }
                                            iArr = zzaiuVar2.zzh;
                                            jArr = zzaiuVar2.zzi;
                                            zArr = zzaiuVar2.zzj;
                                            i20 = i18;
                                            if (zzaisVar2.zzb == i40 || (i8 & 1) == 0) {
                                                z8 = false;
                                            } else {
                                                z8 = true;
                                            }
                                            i21 = i56 + zzaiuVar2.zzg[i55];
                                            j8 = zzaisVar2.zzc;
                                            j9 = zzaiuVar2.zzp;
                                            i22 = i56;
                                            while (i22 < i21) {
                                                if (i58 != 0) {
                                                    iZzB = zzefVar6.zzB();
                                                } else {
                                                    iZzB = zzahzVar2.zzb;
                                                }
                                                zzj(iZzB);
                                                if (i59 != 0) {
                                                    iZzB2 = zzefVar6.zzB();
                                                } else {
                                                    iZzB2 = zzahzVar2.zzc;
                                                }
                                                zzj(iZzB2);
                                                if (i17 != 0) {
                                                    iZzB3 = zzefVar6.zzB();
                                                } else if (i22 != 0) {
                                                    iZzB3 = i20;
                                                } else if (z13) {
                                                    iZzB3 = i19;
                                                    i22 = 0;
                                                } else {
                                                    i22 = 0;
                                                    iZzB3 = i20;
                                                }
                                                if (i61 != 0) {
                                                    iZzB4 = zzefVar6.zzB();
                                                } else {
                                                    iZzB4 = 0;
                                                }
                                                zzahz zzahzVar3 = zzahzVar2;
                                                jZzt = zzeo.zzt((((long) iZzB4) + j9) - j12, 1000000L, j8, RoundingMode.DOWN);
                                                jArr[i22] = jZzt;
                                                if (!zzaiuVar2.zzq) {
                                                    jArr[i22] = jZzt + zzaieVar.zzd.zzh;
                                                }
                                                iArr[i22] = iZzB2;
                                                if (((iZzB3 >> 16) & 1) != 0) {
                                                    z9 = false;
                                                } else if (z8) {
                                                    z9 = true;
                                                } else if (i22 == 0) {
                                                    z9 = true;
                                                    i22 = 0;
                                                } else {
                                                    z9 = false;
                                                }
                                                zArr[i22] = z9;
                                                j9 += (long) iZzB;
                                                i22++;
                                                z8 = z8;
                                                zzahzVar2 = zzahzVar3;
                                            }
                                            zzaiuVar2.zzp = j9;
                                            i53 = i21;
                                            i52 = i54;
                                        } else {
                                            i17 = i60;
                                        }
                                        i18 = i57;
                                        i19 = iZzB7;
                                        iArr = zzaiuVar2.zzh;
                                        jArr = zzaiuVar2.zzi;
                                        zArr = zzaiuVar2.zzj;
                                        i20 = i18;
                                        if (zzaisVar2.zzb == i40) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                        i21 = i56 + zzaiuVar2.zzg[i55];
                                        j8 = zzaisVar2.zzc;
                                        j9 = zzaiuVar2.zzp;
                                        i22 = i56;
                                        while (i22 < i21) {
                                            if (i58 != 0) {
                                                iZzB = zzefVar6.zzB();
                                            } else {
                                                iZzB = zzahzVar2.zzb;
                                            }
                                            zzj(iZzB);
                                            if (i59 != 0) {
                                                iZzB2 = zzefVar6.zzB();
                                            } else {
                                                iZzB2 = zzahzVar2.zzc;
                                            }
                                            zzj(iZzB2);
                                            if (i17 != 0) {
                                                iZzB3 = zzefVar6.zzB();
                                            } else if (i22 != 0) {
                                                iZzB3 = i20;
                                            } else if (z13) {
                                                iZzB3 = i19;
                                                i22 = 0;
                                            } else {
                                                i22 = 0;
                                                iZzB3 = i20;
                                            }
                                            if (i61 != 0) {
                                                iZzB4 = zzefVar6.zzB();
                                            } else {
                                                iZzB4 = 0;
                                            }
                                            zzahz zzahzVar4 = zzahzVar2;
                                            jZzt = zzeo.zzt((((long) iZzB4) + j9) - j12, 1000000L, j8, RoundingMode.DOWN);
                                            jArr[i22] = jZzt;
                                            if (!zzaiuVar2.zzq) {
                                                jArr[i22] = jZzt + zzaieVar.zzd.zzh;
                                            }
                                            iArr[i22] = iZzB2;
                                            if (((iZzB3 >> 16) & 1) != 0) {
                                                z9 = false;
                                            } else if (z8) {
                                                z9 = true;
                                            } else if (i22 == 0) {
                                                z9 = true;
                                                i22 = 0;
                                            } else {
                                                z9 = false;
                                            }
                                            zArr[i22] = z9;
                                            j9 += (long) iZzB;
                                            i22++;
                                            z8 = z8;
                                            zzahzVar2 = zzahzVar4;
                                        }
                                        zzaiuVar2.zzp = j9;
                                        i53 = i21;
                                        i52 = i54;
                                    }
                                    i51++;
                                    i43 = i43;
                                    size4 = size4;
                                    i15 = 1953658222;
                                    i40 = 2;
                                }
                                i10 = i43;
                                zzais zzaisVar3 = zzaieVar.zzd.zza;
                                zzahz zzahzVar5 = zzaiuVar2.zza;
                                zzahzVar5.getClass();
                                zzait zzaitVarZza = zzaisVar3.zza(zzahzVar5.zza);
                                zzeu zzeuVarZzc5 = zzetVar2.zzc(1935763834);
                                if (zzeuVarZzc5 != null) {
                                    zzaitVarZza.getClass();
                                    int i62 = zzaitVarZza.zzd;
                                    zzef zzefVar7 = zzeuVarZzc5.zza;
                                    zzefVar7.zzh(8);
                                    if ((zzefVar7.zzB() & 1) == 1) {
                                        zzefVar7.zzk(8);
                                    }
                                    int iZzs = zzefVar7.zzs();
                                    int iZzH2 = zzefVar7.zzH();
                                    int i63 = zzaiuVar2.zze;
                                    if (iZzH2 > i63) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(iZzH2).length() + 56 + String.valueOf(i63).length());
                                        sb.append("Saiz sample count ");
                                        sb.append(iZzH2);
                                        sb.append(" is greater than fragment sample count");
                                        sb.append(i63);
                                        throw zzas.zzb(sb.toString(), null);
                                    }
                                    if (iZzs == 0) {
                                        boolean[] zArr2 = zzaiuVar2.zzl;
                                        i16 = 0;
                                        for (int i64 = 0; i64 < iZzH2; i64++) {
                                            int iZzs2 = zzefVar7.zzs();
                                            i16 += iZzs2;
                                            zArr2[i64] = iZzs2 > i62;
                                        }
                                        z7 = false;
                                    } else {
                                        boolean z14 = iZzs > i62;
                                        i16 = iZzs * iZzH2;
                                        z7 = false;
                                        Arrays.fill(zzaiuVar2.zzl, 0, iZzH2, z14);
                                    }
                                    Arrays.fill(zzaiuVar2.zzl, iZzH2, zzaiuVar2.zze, z7);
                                    if (i16 > 0) {
                                        zzaiuVar2.zza(i16);
                                    }
                                }
                                zzeu zzeuVarZzc6 = zzetVar2.zzc(1935763823);
                                if (zzeuVarZzc6 != null) {
                                    zzef zzefVar8 = zzeuVarZzc6.zza;
                                    zzefVar8.zzh(8);
                                    int iZzB8 = zzefVar8.zzB();
                                    if ((iZzB8 & 1) == 1) {
                                        zzefVar8.zzk(8);
                                    }
                                    int iZzH3 = zzefVar8.zzH();
                                    if (iZzH3 != 1) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzH3).length() + 29);
                                        sb2.append("Unexpected saio entry count: ");
                                        sb2.append(iZzH3);
                                        throw zzas.zzb(sb2.toString(), null);
                                    }
                                    zzaiuVar2.zzc += zzahy.zza(iZzB8) == 0 ? zzefVar8.zzz() : zzefVar8.zzJ();
                                }
                                zzeu zzeuVarZzc7 = zzetVar2.zzc(1936027235);
                                if (zzeuVarZzc7 != null) {
                                    zzk(zzeuVarZzc7.zza, 0, zzaiuVar2);
                                }
                                String str2 = zzaitVarZza != null ? zzaitVarZza.zzb : null;
                                zzef zzefVar9 = null;
                                zzef zzefVar10 = null;
                                for (int i65 = 0; i65 < list5.size(); i65++) {
                                    zzeu zzeuVar4 = (zzeu) list5.get(i65);
                                    zzef zzefVar11 = zzeuVar4.zza;
                                    int i66 = zzeuVar4.zzd;
                                    if (i66 == 1935828848) {
                                        zzefVar11.zzh(12);
                                        if (zzefVar11.zzB() == 1936025959) {
                                            zzefVar9 = zzefVar11;
                                        }
                                    } else if (i66 == 1936158820) {
                                        zzefVar11.zzh(12);
                                        if (zzefVar11.zzB() == 1936025959) {
                                            zzefVar10 = zzefVar11;
                                        }
                                    }
                                }
                                if (zzefVar9 == null || zzefVar10 == null) {
                                    i12 = i39;
                                    i13 = 2;
                                } else {
                                    zzefVar9.zzh(8);
                                    int iZza = zzahy.zza(zzefVar9.zzB());
                                    i12 = i39;
                                    zzefVar9.zzk(i12);
                                    if (iZza == 1) {
                                        zzefVar9.zzk(i12);
                                    }
                                    if (zzefVar9.zzB() != 1) {
                                        throw zzas.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzefVar10.zzh(8);
                                    int iZza2 = zzahy.zza(zzefVar10.zzB());
                                    zzefVar10.zzk(i12);
                                    if (iZza2 != 1) {
                                        i13 = 2;
                                        if (iZza2 >= 2) {
                                            zzefVar10.zzk(i12);
                                        }
                                    } else {
                                        if (zzefVar10.zzz() == 0) {
                                            throw zzas.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                        i13 = 2;
                                    }
                                    if (zzefVar10.zzz() != 1) {
                                        throw zzas.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzefVar10.zzk(1);
                                    int iZzs3 = zzefVar10.zzs();
                                    int i67 = (iZzs3 & 240) >> 4;
                                    int i68 = iZzs3 & 15;
                                    if (zzefVar10.zzs() == 1) {
                                        int iZzs4 = zzefVar10.zzs();
                                        int i69 = i38;
                                        byte[] bArr3 = new byte[i69];
                                        zzefVar10.zzm(bArr3, 0, i69);
                                        if (iZzs4 == 0) {
                                            int iZzs5 = zzefVar10.zzs();
                                            byte[] bArr4 = new byte[iZzs5];
                                            zzefVar10.zzm(bArr4, 0, iZzs5);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        zzaiuVar2.zzk = true;
                                        zzaiuVar2.zzm = new zzait(true, str2, iZzs4, bArr3, i67, i68, bArr);
                                    }
                                }
                                int size5 = list5.size();
                                for (int i70 = 0; i70 < size5; i70++) {
                                    zzeu zzeuVar5 = (zzeu) list5.get(i70);
                                    if (zzeuVar5.zzd == 1970628964) {
                                        zzef zzefVar12 = zzeuVar5.zza;
                                        zzefVar12.zzh(8);
                                        zzefVar12.zzm(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzk(zzefVar12, 16, zzaiuVar2);
                                        }
                                    }
                                }
                                i14 = 0;
                                i11 = 16;
                                i37 = 1;
                            }
                        } else {
                            i8 = i42;
                            list = list4;
                            i9 = size3;
                            i10 = i43;
                            i11 = i38;
                            i12 = i39;
                            i13 = i40;
                            i14 = i41;
                        }
                        i40 = i13;
                        i39 = i12;
                        i41 = i14;
                        i38 = i11;
                        size3 = i9;
                        list4 = list;
                        i43 = i10 + 1;
                        i42 = i8;
                    }
                    int i71 = i41;
                    i7 = 8;
                    zzp zzpVarZzm2 = zzm(zzetVar.zzb);
                    if (zzpVarZzm2 != null) {
                        int size6 = sparseArray3.size();
                        for (int i72 = i71; i72 < size6; i72++) {
                            ((zzaie) sparseArray3.valueAt(i72)).zzb(zzpVarZzm2);
                        }
                    }
                    if (this.zzz != -9223372036854775807L) {
                        int size7 = sparseArray3.size();
                        for (int i73 = i71; i73 < size7; i73++) {
                            zzaie zzaieVar3 = (zzaie) sparseArray3.valueAt(i73);
                            long j16 = this.zzz;
                            int i74 = zzaieVar3.zzf;
                            while (true) {
                                zzaiu zzaiuVar3 = zzaieVar3.zzb;
                                if (i74 >= zzaiuVar3.zze || zzaiuVar3.zzi[i74] > j16) {
                                    break;
                                }
                                if (zzaiuVar3.zzj[i74]) {
                                    zzaieVar3.zzi = i74;
                                }
                                i74++;
                            }
                        }
                        i37 = 1;
                        this.zzz = -9223372036854775807L;
                    } else {
                        i37 = 1;
                    }
                } else {
                    i7 = 8;
                    if (!arrayDeque.isEmpty()) {
                        ((zzet) arrayDeque.peek()).zzb(zzetVar);
                    }
                }
                i23 = i7;
                i24 = i37;
            }
        }
        zzb();
    }

    private static int zzj(int i7) throws zzas {
        if (i7 >= 0) {
            return i7;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i7);
        throw zzas.zzb(sb.toString(), null);
    }

    private static void zzk(zzef zzefVar, int i7, zzaiu zzaiuVar) throws zzas {
        zzefVar.zzh(i7 + 8);
        int iZzB = zzefVar.zzB();
        int i8 = zzahy.zza;
        if ((iZzB & 1) != 0) {
            throw zzas.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z7 = (iZzB & 2) != 0;
        int iZzH = zzefVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzaiuVar.zzl, 0, zzaiuVar.zze, false);
            return;
        }
        int i9 = zzaiuVar.zze;
        if (iZzH != i9) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i9).length());
            sb.append("Senc sample count ");
            sb.append(iZzH);
            sb.append(" is different from fragment sample count");
            sb.append(i9);
            throw zzas.zzb(sb.toString(), null);
        }
        Arrays.fill(zzaiuVar.zzl, 0, iZzH, z7);
        zzaiuVar.zza(zzefVar.zzd());
        zzef zzefVar2 = zzaiuVar.zzn;
        zzefVar.zzm(zzefVar2.zzi(), 0, zzefVar2.zze());
        zzefVar2.zzh(0);
        zzaiuVar.zzo = false;
    }

    private static Pair zzl(zzef zzefVar, long j7) throws zzas {
        long jZzJ;
        long jZzJ2;
        zzef zzefVar2 = zzefVar;
        zzefVar2.zzh(8);
        int iZza = zzahy.zza(zzefVar2.zzB());
        zzefVar2.zzk(4);
        long jZzz = zzefVar2.zzz();
        if (iZza == 0) {
            jZzJ = zzefVar2.zzz();
            jZzJ2 = zzefVar2.zzz();
        } else {
            jZzJ = zzefVar2.zzJ();
            jZzJ2 = zzefVar2.zzJ();
        }
        long j8 = j7 + jZzJ2;
        long jZzt = zzeo.zzt(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
        zzefVar2.zzk(2);
        int iZzt = zzefVar2.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j9 = j8;
        long j10 = jZzt;
        int i7 = 0;
        while (i7 < iZzt) {
            int iZzB = zzefVar2.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzas.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzefVar2.zzz();
            iArr[i7] = iZzB & C3553a.e.API_PRIORITY_OTHER;
            jArr[i7] = j9;
            jArr3[i7] = j10;
            jZzJ += jZzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jZzt2 = zzeo.zzt(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
            jArr4[i7] = jZzt2 - jArr5[i7];
            zzefVar2.zzk(4);
            j9 += (long) iArr[i7];
            i7++;
            zzefVar2 = zzefVar;
            iZzt = iZzt;
            j10 = jZzt2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jZzt), new zzaci(iArr, jArr, jArr2, jArr3));
    }

    private static zzp zzm(List list) {
        int i7;
        UUID[] uuidArr;
        zzaio zzaioVar;
        int size = list.size();
        int i8 = 0;
        ArrayList arrayList = null;
        while (i8 < size) {
            zzeu zzeuVar = (zzeu) list.get(i8);
            if (zzeuVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrZzi = zzeuVar.zza.zzi();
                zzef zzefVar = new zzef(bArrZzi);
                if (zzefVar.zze() < 32) {
                    i7 = i8;
                    zzaioVar = null;
                } else {
                    zzefVar.zzh(0);
                    int iZzd = zzefVar.zzd();
                    int iZzB = zzefVar.zzB();
                    if (iZzB != iZzd) {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 52 + String.valueOf(iZzd).length());
                        sb.append("Advertised atom size (");
                        sb.append(iZzB);
                        sb.append(") does not match buffer size: ");
                        sb.append(iZzd);
                        zzds.zzc("PsshAtomUtil", sb.toString());
                    } else {
                        int iZzB2 = zzefVar.zzB();
                        if (iZzB2 != 1886614376) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB2).length() + 23);
                            sb2.append("Atom type is not pssh: ");
                            sb2.append(iZzB2);
                            zzds.zzc("PsshAtomUtil", sb2.toString());
                        } else {
                            int iZza = zzahy.zza(zzefVar.zzB());
                            if (iZza > 1) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(iZza).length() + 26);
                                sb3.append("Unsupported pssh version: ");
                                sb3.append(iZza);
                                zzds.zzc("PsshAtomUtil", sb3.toString());
                            } else {
                                UUID uuid = new UUID(zzefVar.zzD(), zzefVar.zzD());
                                if (iZza == 1) {
                                    int iZzH = zzefVar.zzH();
                                    uuidArr = new UUID[iZzH];
                                    int i9 = 0;
                                    while (i9 < iZzH) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i10 = i9;
                                        uuidArr2[i10] = new UUID(zzefVar.zzD(), zzefVar.zzD());
                                        i9 = i10 + 1;
                                        i8 = i8;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                i7 = i8;
                                int iZzH2 = zzefVar.zzH();
                                int iZzd2 = zzefVar.zzd();
                                if (iZzH2 != iZzd2) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(iZzH2).length() + 49 + String.valueOf(iZzd2).length());
                                    sb4.append("Atom data size (");
                                    sb4.append(iZzH2);
                                    sb4.append(") does not match the bytes left: ");
                                    sb4.append(iZzd2);
                                    zzds.zzc("PsshAtomUtil", sb4.toString());
                                    zzaioVar = null;
                                } else {
                                    byte[] bArr = new byte[iZzH2];
                                    zzefVar.zzm(bArr, 0, iZzH2);
                                    zzaioVar = new zzaio(uuid, iZza, bArr, uuidArr);
                                }
                            }
                        }
                    }
                    i7 = i8;
                    zzaioVar = null;
                }
                UUID uuid2 = zzaioVar == null ? null : zzaioVar.zza;
                if (uuid2 == null) {
                    zzds.zzc("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzo(uuid2, null, "video/mp4", bArrZzi));
                }
                i8 = i7 + 1;
            } else {
                i7 = i8;
            }
            i8 = i7 + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new zzp(arrayList);
    }

    private static final zzahz zzn(SparseArray sparseArray, int i7) {
        if (sparseArray.size() == 1) {
            return (zzahz) sparseArray.valueAt(0);
        }
        zzahz zzahzVar = (zzahz) sparseArray.get(i7);
        zzahzVar.getClass();
        return zzahzVar;
    }

    final /* synthetic */ void zza(long j7, zzef zzefVar) {
        zzach.zza(j7, zzefVar, this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) {
        zzadz zzadzVarZza = zzair.zza(zzacvVar);
        this.zzr = zzadzVarZza != null ? zzgjz.zzj(zzadzVarZza) : zzgjz.zzi();
        return zzadzVarZza == null;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        int i7;
        int i8 = this.zzd;
        if ((i8 & 32) == 0) {
            zzacxVar = new zzajw(zzacxVar, this.zzc);
        }
        this.zzI = zzacxVar;
        zzb();
        zzaeb[] zzaebVarArr = new zzaeb[2];
        this.zzJ = zzaebVarArr;
        int i9 = 100;
        int i10 = 0;
        if ((i8 & 4) != 0) {
            zzaebVarArr[0] = this.zzI.zzu(100, 5);
            i7 = 1;
            i9 = 101;
        } else {
            i7 = 0;
        }
        zzaeb[] zzaebVarArr2 = (zzaeb[]) zzeo.zzb(this.zzJ, i7);
        this.zzJ = zzaebVarArr2;
        for (zzaeb zzaebVar : zzaebVarArr2) {
            zzaebVar.zzu(zzb);
        }
        List list = this.zze;
        this.zzK = new zzaeb[list.size()];
        while (i10 < this.zzK.length) {
            zzaeb zzaebVarZzu = this.zzI.zzu(i9, 3);
            zzaebVarZzu.zzu((zzu) list.get(i10));
            this.zzK[i10] = zzaebVarZzu;
            i10++;
            i9++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0216  */
    /* JADX WARN: Code duplicated, block: B:115:0x0229  */
    /* JADX WARN: Code duplicated, block: B:121:0x0243  */
    /* JADX WARN: Code duplicated, block: B:126:0x025d  */
    /* JADX WARN: Code duplicated, block: B:128:0x028c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0294  */
    /* JADX WARN: Code duplicated, block: B:131:0x0298  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:149:0x0300  */
    /* JADX WARN: Code duplicated, block: B:151:0x0313  */
    /* JADX WARN: Code duplicated, block: B:154:0x031c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0330  */
    /* JADX WARN: Code duplicated, block: B:401:0x0167 A[EDGE_INSN: B:401:0x0167->B:74:0x0167 BREAK  A[LOOP:4: B:71:0x0156->B:73:0x015c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x032a A[EDGE_INSN: B:402:0x032a->B:155:0x032a BREAK  A[LOOP:5: B:147:0x02f8->B:405:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0167 A[EDGE_INSN: B:406:0x0167->B:74:0x0167 BREAK  A[LOOP:7: B:76:0x017b->B:410:0x017b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0156 A[LOOP:4: B:71:0x0156->B:73:0x015c, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:73:0x015c A[LOOP:4: B:71:0x0156->B:73:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x016b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0183  */
    /* JADX WARN: Code duplicated, block: B:86:0x0193  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws zzas {
        boolean z7;
        int i7;
        String strZzM;
        String strZzM2;
        long jZzt;
        long jZzt2;
        long jZzt3;
        long jZzz;
        zzaie zzaieVar;
        char c7;
        zzais zzaisVar;
        zzaeb zzaebVar;
        long jZzd;
        int i8;
        zzef zzefVar;
        byte[] bArrZzi;
        int i9;
        int i10;
        int iZzb;
        int i11;
        int iZzB;
        zzaie zzaieVar2;
        int iZzy;
        int i12;
        zzfp zzfpVar;
        zzfp zzfpVar2;
        zzfp zzfpVar3;
        zzaie zzaieVar3;
        int iZzg;
        zzait zzaitVarZzj;
        zzaea zzaeaVar;
        ArrayDeque arrayDeque;
        int i13;
        zzaid zzaidVar;
        int i14;
        long j7;
        long j8;
        int i15;
        int i16;
        int i17;
        int iZzi;
        boolean z8;
        loop0: while (true) {
            z7 = true;
            while (true) {
                int i18 = this.zzs;
                i7 = 0;
                if (i18 == 0) {
                    if (this.zzv == 0) {
                        zzef zzefVar2 = this.zzm;
                        if (!zzacvVar.zzb(zzefVar2.zzi(), 0, 8, true)) {
                            if (this.zzM == -1) {
                                this.zzp.zze();
                                return -1;
                            }
                            zzadsVar.zza = 0L;
                            this.zzM = -1L;
                            this.zzI.zzw(this.zzq.zzb());
                            return 1;
                        }
                        this.zzv = 8;
                        zzefVar2.zzh(0);
                        this.zzu = zzefVar2.zzz();
                        this.zzt = zzefVar2.zzB();
                    }
                    long j9 = this.zzu;
                    if (j9 == 1) {
                        zzef zzefVar3 = this.zzm;
                        zzacvVar.zzc(zzefVar3.zzi(), 8, 8);
                        this.zzv += 8;
                        this.zzu = zzefVar3.zzJ();
                    } else if (j9 == 0) {
                        long jZzo = zzacvVar.zzo();
                        if (jZzo == -1) {
                            ArrayDeque arrayDeque2 = this.zzn;
                            jZzo = !arrayDeque2.isEmpty() ? ((zzet) arrayDeque2.peek()).zza : -1L;
                        }
                        if (jZzo != -1) {
                            this.zzu = (jZzo - zzacvVar.zzn()) + ((long) this.zzv);
                        }
                    }
                    long j10 = this.zzu;
                    long j11 = this.zzv;
                    if (j10 < j11) {
                        throw zzas.zzc("Atom size less than header length (unsupported).");
                    }
                    if (this.zzM != -1) {
                        if (this.zzt == 1936286840) {
                            zzef zzefVar4 = this.zzk;
                            zzefVar4.zza((int) j10);
                            System.arraycopy(this.zzm.zzi(), 0, zzefVar4.zzi(), 0, 8);
                            zzacvVar.zzc(zzefVar4.zzi(), 8, (int) (this.zzu - ((long) this.zzv)));
                            this.zzq.zza((zzaci) zzl(new zzeu(1936286840, zzefVar4).zza, zzacvVar.zzm()).second);
                        } else {
                            zzacvVar.zze((int) (j10 - j11), true);
                        }
                        zzb();
                        break;
                    }
                    long jZzn = zzacvVar.zzn() - j11;
                    int i19 = this.zzt;
                    if ((i19 == 1836019558 || i19 == 1835295092) && !this.zzL) {
                        this.zzI.zzw(new zzadu(this.zzA, jZzn));
                        this.zzL = true;
                    }
                    if (this.zzt == 1836019558) {
                        SparseArray sparseArray = this.zzf;
                        int size = sparseArray.size();
                        for (int i20 = 0; i20 < size; i20++) {
                            zzaiu zzaiuVar = ((zzaie) sparseArray.valueAt(i20)).zzb;
                            zzaiuVar.zzc = jZzn;
                            zzaiuVar.zzb = jZzn;
                        }
                    }
                    int i21 = this.zzt;
                    if (i21 == 1835295092) {
                        this.zzC = null;
                        this.zzx = jZzn + this.zzu;
                        this.zzs = 2;
                        break;
                    }
                    if (i21 == 1836019574 || i21 == 1953653099 || i21 == 1835297121 || i21 == 1835626086 || i21 == 1937007212 || i21 == 1836019558 || i21 == 1953653094 || i21 == 1836475768 || i21 == 1701082227 || i21 == 1835365473) {
                        z8 = true;
                        long jZzn2 = zzacvVar.zzn();
                        long j12 = this.zzu;
                        long j13 = jZzn2 + j12;
                        if (j12 != this.zzv && i21 == 1835365473) {
                            zzef zzefVar5 = this.zzk;
                            zzefVar5.zza(8);
                            zzacvVar.zzi(zzefVar5.zzi(), 0, 8);
                            zzahy.zzf(zzefVar5);
                            zzacvVar.zzf(zzefVar5.zzg());
                            zzacvVar.zzl();
                        }
                        long j14 = j13 - 8;
                        this.zzn.push(new zzet(this.zzt, j14));
                        if (this.zzu == this.zzv) {
                            zzc(j14);
                        } else {
                            zzb();
                        }
                    } else if (i21 == 1751411826 || i21 == 1835296868 || i21 == 1836476516 || i21 == 1936286840 || i21 == 1937011556 || i21 == 1937011827 || i21 == 1668576371 || i21 == 1937011555 || i21 == 1937011578 || i21 == 1937013298 || i21 == 1937007471 || i21 == 1668232756 || i21 == 1937011571 || i21 == 1952867444 || i21 == 1952868452 || i21 == 1953196132 || i21 == 1953654136 || i21 == 1953658222 || i21 == 1886614376 || i21 == 1935763834 || i21 == 1935763823 || i21 == 1936027235 || i21 == 1970628964 || i21 == 1935828848 || i21 == 1936158820 || i21 == 1701606260 || i21 == 1835362404 || i21 == 1701671783 || i21 == 1969517665 || i21 == 1801812339 || i21 == 1768715124) {
                        if (this.zzv != 8) {
                            throw zzas.zzc("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.zzu > 2147483647L) {
                            throw zzas.zzc("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        zzef zzefVar6 = new zzef((int) this.zzu);
                        System.arraycopy(this.zzm.zzi(), 0, zzefVar6.zzi(), 0, 8);
                        this.zzw = zzefVar6;
                        z8 = true;
                        this.zzs = 1;
                    } else {
                        if (this.zzu > 2147483647L) {
                            throw zzas.zzc("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.zzw = null;
                        z8 = true;
                        this.zzs = 1;
                    }
                    z7 = z8;
                } else {
                    if (i18 == z7) {
                        long j15 = this.zzu - ((long) this.zzv);
                        zzef zzefVar7 = this.zzw;
                        int i22 = (int) j15;
                        if (zzefVar7 != null) {
                            zzacvVar.zzc(zzefVar7.zzi(), 8, i22);
                            zzeu zzeuVar = new zzeu(this.zzt, zzefVar7);
                            ArrayDeque arrayDeque3 = this.zzn;
                            if (arrayDeque3.isEmpty()) {
                                int i23 = zzeuVar.zzd;
                                if (i23 == 1936286840) {
                                    Pair pairZzl = zzl(zzeuVar.zza, zzacvVar.zzn());
                                    this.zzq.zza((zzaci) pairZzl.second);
                                    if (!this.zzL) {
                                        this.zzB = ((Long) pairZzl.first).longValue();
                                        this.zzI.zzw((zzadv) pairZzl.second);
                                        this.zzL = true;
                                    }
                                } else if (i23 == 1701671783) {
                                    zzef zzefVar8 = zzeuVar.zza;
                                    if (this.zzJ.length != 0) {
                                        zzefVar8.zzh(8);
                                        int iZza = zzahy.zza(zzefVar8.zzB());
                                        if (iZza == 0) {
                                            strZzM = zzefVar8.zzM((char) 0);
                                            strZzM.getClass();
                                            strZzM2 = zzefVar8.zzM((char) 0);
                                            strZzM2.getClass();
                                            long jZzz2 = zzefVar8.zzz();
                                            long jZzz3 = zzefVar8.zzz();
                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                            jZzt = zzeo.zzt(jZzz3, 1000000L, jZzz2, roundingMode);
                                            long j16 = this.zzB;
                                            jZzt2 = j16 != -9223372036854775807L ? j16 + jZzt : -9223372036854775807L;
                                            jZzt3 = zzeo.zzt(zzefVar8.zzz(), 1000L, jZzz2, roundingMode);
                                            jZzz = zzefVar8.zzz();
                                        } else if (iZza != 1) {
                                            StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 35);
                                            sb.append("Skipping unsupported emsg version: ");
                                            sb.append(iZza);
                                            zzds.zzc("FragmentedMp4Extractor", sb.toString());
                                        } else {
                                            long jZzz4 = zzefVar8.zzz();
                                            long jZzJ = zzefVar8.zzJ();
                                            RoundingMode roundingMode2 = RoundingMode.DOWN;
                                            jZzt2 = zzeo.zzt(jZzJ, 1000000L, jZzz4, roundingMode2);
                                            long jZzt4 = zzeo.zzt(zzefVar8.zzz(), 1000L, jZzz4, roundingMode2);
                                            long jZzz5 = zzefVar8.zzz();
                                            strZzM = zzefVar8.zzM((char) 0);
                                            strZzM.getClass();
                                            strZzM2 = zzefVar8.zzM((char) 0);
                                            strZzM2.getClass();
                                            jZzt3 = jZzt4;
                                            jZzz = jZzz5;
                                            jZzt = -9223372036854775807L;
                                        }
                                        String str = strZzM;
                                        String str2 = strZzM2;
                                        long j17 = jZzt2;
                                        byte[] bArr = new byte[zzefVar8.zzd()];
                                        zzefVar8.zzm(bArr, 0, zzefVar8.zzd());
                                        zzef zzefVar9 = new zzef(this.zzl.zza(new zzafs(str, str2, jZzt3, jZzz, bArr)));
                                        int iZzd = zzefVar9.zzd();
                                        for (zzaeb zzaebVar2 : this.zzJ) {
                                            zzefVar9.zzh(0);
                                            zzaebVar2.zzz(zzefVar9, iZzd);
                                        }
                                        if (j17 == -9223372036854775807L) {
                                            this.zzo.addLast(new zzaid(jZzt, true, iZzd));
                                            this.zzy += iZzd;
                                        } else {
                                            ArrayDeque arrayDeque4 = this.zzo;
                                            if (arrayDeque4.isEmpty()) {
                                                for (zzaeb zzaebVar3 : this.zzJ) {
                                                    zzaebVar3.zzx(j17, 1, iZzd, 0, null);
                                                }
                                            } else {
                                                arrayDeque4.addLast(new zzaid(j17, false, iZzd));
                                                this.zzy += iZzd;
                                            }
                                        }
                                    }
                                }
                            } else {
                                ((zzet) arrayDeque3.peek()).zza(zzeuVar);
                            }
                        } else {
                            zzacvVar.zzf(i22);
                        }
                        zzc(zzacvVar.zzn());
                        break;
                    }
                    long j18 = Long.MAX_VALUE;
                    if (i18 == 2) {
                        SparseArray sparseArray2 = this.zzf;
                        int size2 = sparseArray2.size();
                        zzaie zzaieVar4 = null;
                        for (int i24 = 0; i24 < size2; i24++) {
                            zzaiu zzaiuVar2 = ((zzaie) sparseArray2.valueAt(i24)).zzb;
                            if (zzaiuVar2.zzo) {
                                long j19 = zzaiuVar2.zzc;
                                if (j19 < j18) {
                                    zzaieVar4 = (zzaie) sparseArray2.valueAt(i24);
                                    j18 = j19;
                                }
                            }
                        }
                        if (zzaieVar4 == null) {
                            this.zzs = 3;
                            break;
                        }
                        int iZzn = (int) (j18 - zzacvVar.zzn());
                        if (iZzn < 0) {
                            throw zzas.zzb("Offset to encryption data was negative.", null);
                        }
                        zzacvVar.zzf(iZzn);
                        zzaiu zzaiuVar3 = zzaieVar4.zzb;
                        zzef zzefVar10 = zzaiuVar3.zzn;
                        zzacvVar.zzc(zzefVar10.zzi(), 0, zzefVar10.zze());
                        zzefVar10.zzh(0);
                        zzaiuVar3.zzo = false;
                        break;
                    }
                    zzaieVar = this.zzC;
                    if (zzaieVar != null) {
                        c7 = 6;
                        break loop0;
                    }
                    SparseArray sparseArray3 = this.zzf;
                    int size3 = sparseArray3.size();
                    long j20 = Long.MAX_VALUE;
                    zzaie zzaieVar5 = null;
                    for (int i25 = 0; i25 < size3; i25 += z7 ? 1 : 0) {
                        zzaie zzaieVar6 = (zzaie) sparseArray3.valueAt(i25);
                        if (zzaieVar6.zzk() || zzaieVar6.zzf != zzaieVar6.zzd.zzb) {
                            if (!zzaieVar6.zzk() || zzaieVar6.zzh != zzaieVar6.zzb.zzd) {
                                long jZze = zzaieVar6.zze();
                                if (jZze < j20) {
                                    j20 = jZze;
                                    zzaieVar5 = zzaieVar6;
                                }
                            }
                        }
                    }
                    c7 = 6;
                    if (zzaieVar5 != null) {
                        int iZze = (int) (zzaieVar5.zze() - zzacvVar.zzn());
                        if (iZze < 0) {
                            zzds.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZze = 0;
                        }
                        zzacvVar.zzf(iZze);
                        this.zzC = zzaieVar5;
                        zzaieVar = zzaieVar5;
                        break loop0;
                    }
                    int iZzn2 = (int) (this.zzx - zzacvVar.zzn());
                    if (iZzn2 < 0) {
                        throw zzas.zzb("Offset to end of mdat was negative.", null);
                    }
                    zzacvVar.zzf(iZzn2);
                    zzb();
                }
            }
        }
        if (this.zzs == 3) {
            this.zzD = zzaieVar.zzf();
            String str3 = zzaieVar.zzd.zza.zzg.zzo;
            if (!Objects.equals(str3, "video/avc")) {
                Objects.equals(str3, "video/hevc");
            }
            this.zzG = z7;
            if (zzaieVar.zzf < zzaieVar.zzi) {
                zzacvVar.zzf(this.zzD);
                zzait zzaitVarZzj2 = zzaieVar.zzj();
                if (zzaitVarZzj2 != null) {
                    zzaiu zzaiuVar4 = zzaieVar.zzb;
                    zzef zzefVar11 = zzaiuVar4.zzn;
                    int i26 = zzaitVarZzj2.zzd;
                    if (i26 != 0) {
                        zzefVar11.zzk(i26);
                    }
                    if (zzaiuVar4.zzb(zzaieVar.zzf)) {
                        zzefVar11.zzk(zzefVar11.zzt() * 6);
                    }
                }
                if (!zzaieVar.zzh()) {
                    this.zzC = null;
                }
                i13 = 3;
            } else {
                if (zzaieVar.zzd.zza.zzh == z7) {
                    this.zzD -= 8;
                    zzacvVar.zzf(8);
                }
                if ("audio/ac4".equals(zzaieVar.zzd.zza.zzg.zzo)) {
                    this.zzE = zzaieVar.zzi(this.zzD, 7);
                    int i27 = this.zzD;
                    zzef zzefVar12 = this.zzk;
                    zzaby.zzc(i27, zzefVar12);
                    zzaieVar.zza.zzz(zzefVar12, 7);
                    iZzi = this.zzE + 7;
                    this.zzE = iZzi;
                } else {
                    iZzi = zzaieVar.zzi(this.zzD, 0);
                    this.zzE = iZzi;
                }
                this.zzD += iZzi;
                this.zzs = 4;
                this.zzF = 0;
                zzaisVar = zzaieVar.zzd.zza;
                zzaebVar = zzaieVar.zza;
                jZzd = zzaieVar.zzd();
                i8 = zzaisVar.zzk;
                if (i8 == 0) {
                    zzefVar = this.zzh;
                    bArrZzi = zzefVar.zzi();
                    bArrZzi[0] = 0;
                    bArrZzi[z7 ? 1 : 0] = 0;
                    bArrZzi[2] = 0;
                    i9 = 4 - i8;
                    while (true) {
                        boolean z9 = z7;
                        if (this.zzE < this.zzD) {
                            break;
                        }
                        i10 = this.zzF;
                        if (i10 == 0) {
                            if (this.zzK.length <= 0 || !this.zzG) {
                                iZzb = zzfl.zzb(zzaisVar.zzg);
                                if (i8 + iZzb > this.zzD - this.zzE) {
                                    i11 = 0;
                                } else {
                                    i11 = iZzb;
                                }
                            } else {
                                i11 = i7;
                            }
                            zzacvVar.zzc(bArrZzi, i9, i8 + i11);
                            zzefVar.zzh(0);
                            iZzB = zzefVar.zzB();
                            if (iZzB >= 0) {
                                throw zzas.zzb("Invalid NAL length", null);
                            }
                            this.zzF = iZzB - i11;
                            zzef zzefVar13 = this.zzg;
                            zzefVar13.zzh(0);
                            zzaebVar.zzz(zzefVar13, 4);
                            this.zzE += 4;
                            this.zzD += i9;
                            if (this.zzK.length > 0 || i11 <= 0) {
                                zzaieVar = zzaieVar;
                                i9 = i9;
                                c7 = c7;
                            } else {
                                zzu zzuVar = zzaisVar.zzg;
                                byte b7 = bArrZzi[4];
                                byte[] bArr2 = zzfl.zza;
                                String str4 = zzuVar.zzo;
                                zzaieVar = zzaieVar;
                                if (Objects.equals(str4, "video/avc") || zzar.zze(zzuVar.zzk, "video/avc")) {
                                    i9 = i9;
                                    c7 = c7;
                                    if ((b7 & 31) != c7) {
                                    }
                                    this.zzH = z;
                                    zzaebVar.zzz(zzefVar, i11);
                                    this.zzE += i11;
                                    if (i11 > 0 || this.zzG || !zzfl.zzc(bArrZzi, 4, i11, zzaisVar.zzg)) {
                                        z7 = true;
                                    } else {
                                        z7 = z9 ? 1 : 0;
                                        this.zzG = z7;
                                    }
                                    i7 = 0;
                                } else {
                                    i9 = i9;
                                    c7 = c7;
                                }
                                boolean z10 = ((Objects.equals(str4, "video/hevc") || zzar.zze(zzuVar.zzk, "video/hevc")) && ((b7 & 126) >> 1) == 39) ? z9 ? 1 : 0 : false;
                                this.zzH = z10;
                                zzaebVar.zzz(zzefVar, i11);
                                this.zzE += i11;
                                if (i11 > 0) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                                i7 = 0;
                            }
                            this.zzH = z10;
                            zzaebVar.zzz(zzefVar, i11);
                            this.zzE += i11;
                            if (i11 > 0) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            i7 = 0;
                        } else {
                            zzaieVar2 = zzaieVar;
                            int i28 = i9;
                            if (this.zzH) {
                                zzef zzefVar14 = this.zzi;
                                zzefVar14.zza(i10);
                                zzacvVar.zzc(zzefVar14.zzi(), 0, this.zzF);
                                zzaebVar.zzz(zzefVar14, this.zzF);
                                iZzy = this.zzF;
                                int iZza2 = zzfl.zza(zzefVar14.zzi(), zzefVar14.zze());
                                zzefVar14.zzh(0);
                                zzefVar14.zzf(iZza2);
                                i12 = zzaisVar.zzg.zzq;
                                if (i12 == -1) {
                                    zzfpVar3 = this.zzp;
                                    if (zzfpVar3.zzb() != 0) {
                                        zzfpVar3.zza(0);
                                    }
                                } else {
                                    zzfpVar = this.zzp;
                                    if (zzfpVar.zzb() != i12) {
                                        zzfpVar.zza(i12);
                                    }
                                }
                                zzfpVar2 = this.zzp;
                                zzfpVar2.zzc(jZzd, zzefVar14);
                                if ((zzaieVar2.zzg() & 4) != 0) {
                                    zzfpVar2.zze();
                                }
                            } else {
                                iZzy = zzaebVar.zzy(zzacvVar, i10, false);
                            }
                            this.zzE += iZzy;
                            this.zzF -= iZzy;
                            zzaieVar = zzaieVar2;
                            i9 = i28;
                            z7 = true;
                            i7 = 0;
                            c7 = 6;
                        }
                    }
                } else {
                    while (true) {
                        i16 = this.zzE;
                        i17 = this.zzD;
                        if (i16 < i17) {
                            break;
                        }
                        this.zzE += zzaebVar.zzy(zzacvVar, i17 - i16, false);
                    }
                }
                zzaieVar3 = zzaieVar;
                iZzg = zzaieVar3.zzg();
                if (!this.zzG) {
                    iZzg |= 67108864;
                }
                int i29 = iZzg;
                zzaitVarZzj = zzaieVar3.zzj();
                if (zzaitVarZzj != null) {
                    zzaeaVar = zzaitVarZzj.zzc;
                } else {
                    zzaeaVar = null;
                }
                zzaebVar.zzx(jZzd, i29, this.zzD, 0, zzaeaVar);
                while (true) {
                    arrayDeque = this.zzo;
                    if (!arrayDeque.isEmpty()) {
                        break;
                    }
                    zzaidVar = (zzaid) arrayDeque.removeFirst();
                    int i30 = this.zzy;
                    i14 = zzaidVar.zzc;
                    this.zzy = i30 - i14;
                    j7 = zzaidVar.zza;
                    if (zzaidVar.zzb) {
                        j7 += jZzd;
                    }
                    j8 = j7;
                    for (zzaeb zzaebVar4 : this.zzJ) {
                        zzaebVar4.zzx(j8, 1, i14, this.zzy, null);
                    }
                }
                if (!zzaieVar3.zzh()) {
                    this.zzC = null;
                }
                i13 = 3;
            }
        } else {
            zzaisVar = zzaieVar.zzd.zza;
            zzaebVar = zzaieVar.zza;
            jZzd = zzaieVar.zzd();
            i8 = zzaisVar.zzk;
            if (i8 == 0) {
                zzefVar = this.zzh;
                bArrZzi = zzefVar.zzi();
                bArrZzi[0] = 0;
                bArrZzi[z7 ? 1 : 0] = 0;
                bArrZzi[2] = 0;
                i9 = 4 - i8;
                while (true) {
                    boolean z11 = z7;
                    if (this.zzE < this.zzD) {
                        break;
                        break;
                    }
                    i10 = this.zzF;
                    if (i10 == 0) {
                        if (this.zzK.length <= 0) {
                            iZzb = zzfl.zzb(zzaisVar.zzg);
                            if (i8 + iZzb > this.zzD - this.zzE) {
                                i11 = 0;
                            } else {
                                i11 = iZzb;
                            }
                        } else {
                            iZzb = zzfl.zzb(zzaisVar.zzg);
                            if (i8 + iZzb > this.zzD - this.zzE) {
                                i11 = 0;
                            } else {
                                i11 = iZzb;
                            }
                        }
                        zzacvVar.zzc(bArrZzi, i9, i8 + i11);
                        zzefVar.zzh(0);
                        iZzB = zzefVar.zzB();
                        if (iZzB >= 0) {
                            throw zzas.zzb("Invalid NAL length", null);
                        }
                        this.zzF = iZzB - i11;
                        zzef zzefVar15 = this.zzg;
                        zzefVar15.zzh(0);
                        zzaebVar.zzz(zzefVar15, 4);
                        this.zzE += 4;
                        this.zzD += i9;
                        if (this.zzK.length > 0) {
                            zzaieVar = zzaieVar;
                            i9 = i9;
                            c7 = c7;
                        } else {
                            zzaieVar = zzaieVar;
                            i9 = i9;
                            c7 = c7;
                        }
                        this.zzH = z10;
                        zzaebVar.zzz(zzefVar, i11);
                        this.zzE += i11;
                        if (i11 > 0) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        i7 = 0;
                    } else {
                        zzaieVar2 = zzaieVar;
                        int i210 = i9;
                        if (this.zzH) {
                            zzef zzefVar16 = this.zzi;
                            zzefVar16.zza(i10);
                            zzacvVar.zzc(zzefVar16.zzi(), 0, this.zzF);
                            zzaebVar.zzz(zzefVar16, this.zzF);
                            iZzy = this.zzF;
                            int iZza3 = zzfl.zza(zzefVar16.zzi(), zzefVar16.zze());
                            zzefVar16.zzh(0);
                            zzefVar16.zzf(iZza3);
                            i12 = zzaisVar.zzg.zzq;
                            if (i12 == -1) {
                                zzfpVar3 = this.zzp;
                                if (zzfpVar3.zzb() != 0) {
                                    zzfpVar3.zza(0);
                                }
                            } else {
                                zzfpVar = this.zzp;
                                if (zzfpVar.zzb() != i12) {
                                    zzfpVar.zza(i12);
                                }
                            }
                            zzfpVar2 = this.zzp;
                            zzfpVar2.zzc(jZzd, zzefVar16);
                            if ((zzaieVar2.zzg() & 4) != 0) {
                                zzfpVar2.zze();
                            }
                        } else {
                            iZzy = zzaebVar.zzy(zzacvVar, i10, false);
                        }
                        this.zzE += iZzy;
                        this.zzF -= iZzy;
                        zzaieVar = zzaieVar2;
                        i9 = i210;
                        z7 = true;
                        i7 = 0;
                        c7 = 6;
                    }
                }
            } else {
                while (true) {
                    i16 = this.zzE;
                    i17 = this.zzD;
                    if (i16 < i17) {
                        break;
                        break;
                    }
                    this.zzE += zzaebVar.zzy(zzacvVar, i17 - i16, false);
                }
            }
            zzaieVar3 = zzaieVar;
            iZzg = zzaieVar3.zzg();
            if (!this.zzG) {
                iZzg |= 67108864;
            }
            int i211 = iZzg;
            zzaitVarZzj = zzaieVar3.zzj();
            if (zzaitVarZzj != null) {
                zzaeaVar = zzaitVarZzj.zzc;
            } else {
                zzaeaVar = null;
            }
            zzaebVar.zzx(jZzd, i211, this.zzD, 0, zzaeaVar);
            while (true) {
                arrayDeque = this.zzo;
                if (!arrayDeque.isEmpty()) {
                    break;
                    break;
                }
                zzaidVar = (zzaid) arrayDeque.removeFirst();
                int i31 = this.zzy;
                i14 = zzaidVar.zzc;
                this.zzy = i31 - i14;
                j7 = zzaidVar.zza;
                if (zzaidVar.zzb) {
                    j7 += jZzd;
                }
                j8 = j7;
                while (i15 < r2) {
                    zzaebVar4.zzx(j8, 1, i14, this.zzy, null);
                }
            }
            if (!zzaieVar3.zzh()) {
                this.zzC = null;
            }
            i13 = 3;
        }
        this.zzs = i13;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((zzaie) sparseArray.valueAt(i7)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j8;
        this.zzn.clear();
        zzb();
    }

    public zzaif(zzajt zzajtVar, int i7, zzel zzelVar, zzais zzaisVar, List list, zzaeb zzaebVar) {
        this.zzc = zzajtVar;
        this.zzd = i7;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzaft();
        this.zzm = new zzef(16);
        this.zzg = new zzef(zzfl.zza);
        this.zzh = new zzef(6);
        this.zzi = new zzef();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzef(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzgjz.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzacx.zza;
        this.zzJ = new zzaeb[0];
        this.zzK = new zzaeb[0];
        this.zzp = new zzfp(new zzfo() { // from class: com.google.android.gms.internal.ads.zzaic
            @Override // com.google.android.gms.internal.ads.zzfo
            public final /* synthetic */ void zza(long j7, zzef zzefVar) {
                this.zza.zza(j7, zzefVar);
            }
        });
        this.zzq = new zzacj();
        this.zzM = -1L;
    }
}
