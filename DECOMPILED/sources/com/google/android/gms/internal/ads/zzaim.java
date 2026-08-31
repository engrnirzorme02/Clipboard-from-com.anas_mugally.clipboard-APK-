package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaim implements zzacu, zzadv {
    public static final /* synthetic */ int zza = 0;
    private int zzA;
    private long zzB;
    private int zzC;
    private zzago zzD;
    private final zzajt zzb;
    private final int zzc;
    private final zzef zzd;
    private final zzef zze;
    private final zzef zzf;
    private final zzef zzg;
    private final ArrayDeque zzh;
    private final zzaiq zzi;
    private final List zzj;
    private zzgjz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzef zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private long zzw;
    private zzacx zzx;
    private zzail[] zzy;
    private long[][] zzz;

    static {
        int i7 = zzaij.zza;
    }

    @Deprecated
    public zzaim() {
        this(zzajt.zza, 16);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /* JADX WARN: Failed to calculate best type for var: r10v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v8 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    private final void zzk(long r30) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaim.zzk(long):void");
    }

    private static long zzl(zzaiv zzaivVar, long j7, long j8) {
        int iZzm = zzm(zzaivVar, j7);
        return iZzm == -1 ? j8 : Math.min(zzaivVar.zzc[iZzm], j8);
    }

    private static int zzm(zzaiv zzaivVar, long j7) {
        int iZza = zzaivVar.zza(j7);
        return iZza == -1 ? zzaivVar.zzb(j7) : iZza;
    }

    private static int zzn(int i7) {
        if (i7 != 1751476579) {
            return i7 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j7) {
        long j8;
        long j9;
        long jZzl;
        long j10;
        int iZzb;
        long j11 = j7;
        zzail[] zzailVarArr = this.zzy;
        if (zzailVarArr.length == 0) {
            zzadw zzadwVar = zzadw.zza;
            return new zzadt(zzadwVar, zzadwVar);
        }
        int i7 = this.zzA;
        if (i7 != -1) {
            zzaiv zzaivVar = zzailVarArr[i7].zzb;
            int iZzm = zzm(zzaivVar, j11);
            if (iZzm == -1) {
                zzadw zzadwVar2 = zzadw.zza;
                return new zzadt(zzadwVar2, zzadwVar2);
            }
            long[] jArr = zzaivVar.zzf;
            long j12 = jArr[iZzm];
            long[] jArr2 = zzaivVar.zzc;
            j8 = jArr2[iZzm];
            if (j12 >= j11 || iZzm >= zzaivVar.zzb - 1 || (iZzb = zzaivVar.zzb(j11)) == -1 || iZzb == iZzm) {
                j10 = -9223372036854775807L;
                jZzl = -1;
            } else {
                j10 = jArr[iZzb];
                jZzl = jArr2[iZzb];
            }
            j9 = j10;
            j11 = j12;
        } else {
            j8 = Long.MAX_VALUE;
            j9 = -9223372036854775807L;
            jZzl = -1;
        }
        int i8 = 0;
        while (true) {
            zzail[] zzailVarArr2 = this.zzy;
            if (i8 >= zzailVarArr2.length) {
                break;
            }
            if (i8 != this.zzA) {
                zzaiv zzaivVar2 = zzailVarArr2[i8].zzb;
                long jZzl2 = zzl(zzaivVar2, j11, j8);
                if (j9 != -9223372036854775807L) {
                    jZzl = zzl(zzaivVar2, j9, jZzl);
                }
                j8 = jZzl2;
            }
            i8++;
        }
        zzadw zzadwVar3 = new zzadw(j11, j8);
        return j9 == -9223372036854775807L ? new zzadt(zzadwVar3, zzadwVar3) : new zzadt(zzadwVar3, new zzadw(j9, jZzl));
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) {
        zzadz zzadzVarZzb = zzair.zzb(zzacvVar, (this.zzc & 2) != 0);
        this.zzk = zzadzVarZzb != null ? zzgjz.zzj(zzadzVarZzb) : zzgjz.zzi();
        return zzadzVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        if ((this.zzc & 16) == 0) {
            zzacxVar = new zzajw(zzacxVar, this.zzb);
        }
        this.zzx = zzacxVar;
    }

    /* JADX WARN: Code duplicated, block: B:316:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r38v0, types: [com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzi] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v29 */
    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws zzas {
        int i7;
        long j7;
        long j8;
        long j9;
        zzaeb zzaebVar;
        int i8;
        int i9;
        int i10;
        int iZzb;
        ?? r11;
        boolean z7;
        while (true) {
            ?? r7 = 1;
            while (true) {
                i7 = this.zzl;
                j7 = 0;
                if (i7 != 0) {
                    break;
                }
                if (this.zzo == 0) {
                    zzef zzefVar = this.zzg;
                    if (!zzacvVar.zzb(zzefVar.zzi(), 0, 8, r7)) {
                        if (this.zzC != 2 || (this.zzc & 2) == 0) {
                            return -1;
                        }
                        zzaeb zzaebVarZzu = this.zzx.zzu(0, 4);
                        zzago zzagoVar = this.zzD;
                        zzao zzaoVar = zzagoVar == null ? null : new zzao(-9223372036854775807L, zzagoVar);
                        zzs zzsVar = new zzs();
                        zzsVar.zzk(zzaoVar);
                        zzaebVarZzu.zzu(zzsVar.zzM());
                        this.zzx.zzv();
                        this.zzx.zzw(new zzadu(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.zzo = 8;
                    zzefVar.zzh(0);
                    this.zzn = zzefVar.zzz();
                    this.zzm = zzefVar.zzB();
                }
                long j10 = this.zzn;
                if (j10 == 1) {
                    zzef zzefVar2 = this.zzg;
                    zzacvVar.zzc(zzefVar2.zzi(), 8, 8);
                    this.zzo += 8;
                    this.zzn = zzefVar2.zzJ();
                } else if (j10 == 0) {
                    long jZzo = zzacvVar.zzo();
                    if (jZzo == -1) {
                        zzet zzetVar = (zzet) this.zzh.peek();
                        jZzo = zzetVar != null ? zzetVar.zza : -1L;
                    }
                    if (jZzo != -1) {
                        this.zzn = (jZzo - zzacvVar.zzn()) + ((long) this.zzo);
                    }
                }
                long j11 = this.zzn;
                int i11 = this.zzo;
                if (j11 < i11) {
                    throw zzas.zzc("Atom size less than header length (unsupported).");
                }
                int i12 = this.zzm;
                if (i12 == 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1701082227 || i12 == 1835365473 || i12 == 1635284069) {
                    r7 = 1;
                    r7 = 1;
                    long jZzn = zzacvVar.zzn();
                    long j12 = this.zzn;
                    long j13 = jZzn + j12;
                    long j14 = this.zzo;
                    if (j12 != j14 && this.zzm == 1835365473) {
                        zzef zzefVar3 = this.zzf;
                        zzefVar3.zza(8);
                        zzacvVar.zzi(zzefVar3.zzi(), 0, 8);
                        zzahy.zzf(zzefVar3);
                        zzacvVar.zzf(zzefVar3.zzg());
                        zzacvVar.zzl();
                    }
                    long j15 = j13 - j14;
                    this.zzh.push(new zzet(this.zzm, j15));
                    if (this.zzn == this.zzo) {
                        zzk(j15);
                    } else {
                        zzj();
                    }
                } else if (i12 == 1835296868 || i12 == 1836476516 || i12 == 1751411826 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1937011571 || i12 == 1668576371 || i12 == 1701606260 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1953196132 || i12 == 1718909296 || i12 == 1969517665 || i12 == 1801812339 || i12 == 1768715124) {
                    zzghc.zzh(i11 == 8);
                    zzghc.zzh(this.zzn <= 2147483647L);
                    zzef zzefVar4 = new zzef((int) this.zzn);
                    System.arraycopy(this.zzg.zzi(), 0, zzefVar4.zzi(), 0, 8);
                    this.zzp = zzefVar4;
                    r7 = 1;
                    this.zzl = 1;
                } else {
                    long jZzn2 = zzacvVar.zzn();
                    long j16 = this.zzo;
                    long j17 = jZzn2 - j16;
                    if (this.zzm == 1836086884) {
                        this.zzD = new zzago(0L, j17, -9223372036854775807L, j17 + j16, this.zzn - j16);
                    }
                    this.zzp = null;
                    r7 = 1;
                    this.zzl = 1;
                }
            }
            if (i7 != r7) {
                if (i7 != 2) {
                    this.zzi.zzb(zzacvVar, zzadsVar, this.zzj);
                    if (zzadsVar.zza == 0) {
                        zzj();
                    }
                    return r7;
                }
                long jZzn3 = zzacvVar.zzn();
                int i13 = this.zzq;
                if (i13 == -1) {
                    ?? r21 = r7;
                    ?? r28 = r21 == true ? 1 : 0;
                    int i14 = -1;
                    int i15 = -1;
                    long j18 = Long.MAX_VALUE;
                    long j19 = Long.MAX_VALUE;
                    long j20 = Long.MAX_VALUE;
                    int i16 = 0;
                    j9 = 262144;
                    ?? r22 = r21;
                    while (true) {
                        zzail[] zzailVarArr = this.zzy;
                        j8 = j7;
                        if (i16 >= zzailVarArr.length) {
                            break;
                        }
                        zzail zzailVar = zzailVarArr[i16];
                        int i17 = zzailVar.zze;
                        zzaiv zzaivVar = zzailVar.zzb;
                        if (i17 != zzaivVar.zzb) {
                            long j21 = zzaivVar.zzc[i17];
                            long[][] jArr = this.zzz;
                            jArr.getClass();
                            long j22 = jArr[i16][i17];
                            long j23 = j21 - jZzn3;
                            ?? r10 = (j23 < j8 || j23 >= 262144) ? r7 : 0;
                            if (r10 == 0) {
                                if (r28 == 0) {
                                    r11 = 0;
                                } else {
                                    r28 = r10;
                                    i15 = i16;
                                    j20 = j23;
                                    j19 = j22;
                                }
                                if (j22 < j18) {
                                    r22 = r10;
                                    i14 = i16;
                                    j18 = j22;
                                }
                            } else {
                                r11 = r28;
                            }
                            if (r10 != r11 || j23 >= j20) {
                                r28 = r11;
                            } else {
                                r28 = r10;
                                i15 = i16;
                                j20 = j23;
                                j19 = j22;
                            }
                            if (j22 < j18) {
                                r22 = r10;
                                i14 = i16;
                                j18 = j22;
                            }
                        }
                        i16 += r7;
                        j7 = j8;
                        r22 = r22;
                        r28 = r28;
                    }
                    i13 = (j18 == Long.MAX_VALUE || r22 == 0 || j19 < j18 + 10485760) ? i15 : i14;
                    this.zzq = i13;
                    if (i13 == -1) {
                        return -1;
                    }
                } else {
                    j8 = 0;
                    j9 = 262144;
                }
                zzail zzailVar2 = this.zzy[i13];
                zzaeb zzaebVar2 = zzailVar2.zzc;
                int i18 = zzailVar2.zze;
                zzaiv zzaivVar2 = zzailVar2.zzb;
                zzaeb zzaebVar3 = zzaebVar2;
                long j24 = zzaivVar2.zzc[i18] + this.zzw;
                int[] iArr = zzaivVar2.zzd;
                int i19 = iArr[i18];
                boolean z8 = false;
                zzaec zzaecVar = zzailVar2.zzd;
                int i20 = 4;
                long j25 = (j24 - jZzn3) + ((long) this.zzr);
                if (j25 < j8 || j25 >= j9) {
                    zzadsVar.zza = j24;
                    return 1;
                }
                zzais zzaisVar = zzailVar2.zza;
                if (zzaisVar.zzh == 1) {
                    j25 += 8;
                    i19 -= 8;
                }
                int i21 = i19;
                zzacvVar.zzf((int) j25);
                zzu zzuVar = zzaisVar.zzg;
                String str = zzuVar.zzo;
                if (!Objects.equals(str, "video/avc")) {
                    Objects.equals(str, "video/hevc");
                }
                this.zzu = true;
                int i22 = zzaisVar.zzk;
                if (i22 == 0) {
                    zzaebVar = zzaebVar3;
                    if ("audio/ac4".equals(str)) {
                        if (this.zzs == 0) {
                            zzef zzefVar5 = this.zzf;
                            zzaby.zzc(i21, zzefVar5);
                            i8 = 7;
                            zzaebVar.zzz(zzefVar5, 7);
                            this.zzs += 7;
                        } else {
                            i8 = 7;
                        }
                        i21 += i8;
                    } else if (zzailVar2.zzf != null && Objects.equals(str, "audio/mpeg")) {
                        zzu zzuVarZzM = zzailVar2.zzf;
                        zzef zzefVar6 = this.zzf;
                        zzefVar6.zza(4);
                        zzacvVar.zzi(zzefVar6.zzi(), 0, 4);
                        zzacvVar.zzl();
                        zzado zzadoVar = new zzado();
                        if (zzadoVar.zza(zzefVar6.zzB()) && !Objects.equals(zzuVarZzM.zzo, zzadoVar.zzb)) {
                            zzs zzsVarZza = zzuVarZzM.zza();
                            String str2 = zzadoVar.zzb;
                            str2.getClass();
                            zzsVarZza.zzm(str2);
                            zzuVarZzM = zzsVarZza.zzM();
                        }
                        zzaebVar.zzu(zzuVarZzM);
                        zzailVar2.zzf = null;
                    } else if (zzaecVar != null) {
                        zzaecVar.zzb(zzacvVar);
                    }
                    while (true) {
                        int i23 = this.zzs;
                        if (i23 >= i21) {
                            break;
                        }
                        int iZzy = zzaebVar.zzy(zzacvVar, i21 - i23, false);
                        this.zzr += iZzy;
                        this.zzs += iZzy;
                        this.zzt -= iZzy;
                    }
                } else {
                    zzef zzefVar7 = this.zze;
                    byte[] bArrZzi = zzefVar7.zzi();
                    bArrZzi[0] = 0;
                    bArrZzi[1] = 0;
                    bArrZzi[2] = 0;
                    int i24 = 4 - i22;
                    i21 += i24;
                    while (this.zzs < i21) {
                        int i25 = this.zzt;
                        if (i25 == 0) {
                            if (this.zzu || zzfl.zzb(zzuVar) + i22 > iArr[i18] - this.zzr) {
                                i10 = i22;
                                iZzb = z8;
                            } else {
                                iZzb = zzfl.zzb(zzuVar);
                                i10 = i22 + iZzb;
                            }
                            zzacvVar.zzc(bArrZzi, i24, i10);
                            this.zzr += i10;
                            int i26 = z8;
                            zzefVar7.zzh(i26);
                            int iZzB = zzefVar7.zzB();
                            if (iZzB < 0) {
                                throw zzas.zzb("Invalid NAL length", null);
                            }
                            this.zzt = iZzB - iZzb;
                            zzef zzefVar8 = this.zzd;
                            zzefVar8.zzh(i26);
                            i9 = i22;
                            zzaeb zzaebVar4 = zzaebVar3;
                            int i27 = i20;
                            zzaebVar4.zzz(zzefVar8, i27);
                            this.zzs += i27;
                            if (iZzb > 0) {
                                zzaebVar4.zzz(zzefVar7, iZzb);
                                this.zzs += iZzb;
                                if (zzfl.zzc(bArrZzi, i27, iZzb, zzuVar)) {
                                    this.zzu = true;
                                }
                                zzaebVar3 = zzaebVar4;
                            } else {
                                i20 = i27;
                                zzaebVar3 = zzaebVar4;
                                i22 = i9;
                            }
                            z8 = false;
                        } else {
                            i9 = i22;
                            int iZzy2 = zzaebVar3.zzy(zzacvVar, i25, z8);
                            this.zzr += iZzy2;
                            this.zzs += iZzy2;
                            this.zzt -= iZzy2;
                        }
                        i22 = i9;
                        i20 = 4;
                        z8 = false;
                    }
                    zzaebVar = zzaebVar3;
                }
                int i28 = i21;
                long j26 = zzaivVar2.zzf[i18];
                int i29 = zzaivVar2.zzg[i18];
                if (!this.zzu) {
                    i29 |= 67108864;
                }
                if (zzaecVar != null) {
                    zzaeb zzaebVar5 = zzaebVar;
                    zzaecVar.zzc(zzaebVar5, j26, i29, i28, 0, null);
                    if (i18 + 1 == zzaivVar2.zzb) {
                        zzaecVar.zzd(zzaebVar5, null);
                    }
                } else {
                    zzaebVar.zzx(j26, i29, i28, 0, null);
                }
                zzailVar2.zze++;
                this.zzq = -1;
                this.zzr = 0;
                this.zzs = 0;
                this.zzt = 0;
                this.zzu = false;
                return 0;
            }
            long j27 = this.zzn - ((long) this.zzo);
            long jZzn4 = zzacvVar.zzn() + j27;
            zzef zzefVar9 = this.zzp;
            if (zzefVar9 != null) {
                zzacvVar.zzc(zzefVar9.zzi(), this.zzo, (int) j27);
                if (this.zzm == 1718909296) {
                    this.zzv = true;
                    zzefVar9.zzh(8);
                    int iZzn = zzn(zzefVar9.zzB());
                    if (iZzn == 0) {
                        zzefVar9.zzk(4);
                        do {
                            if (zzefVar9.zzd() <= 0) {
                                iZzn = 0;
                                break;
                            }
                            iZzn = zzn(zzefVar9.zzB());
                        } while (iZzn == 0);
                    }
                    this.zzC = iZzn;
                } else {
                    ArrayDeque arrayDeque = this.zzh;
                    if (!arrayDeque.isEmpty()) {
                        ((zzet) arrayDeque.peek()).zza(new zzeu(this.zzm, zzefVar9));
                    }
                }
            } else {
                if (!this.zzv && this.zzm == 1835295092) {
                    this.zzC = 1;
                }
                if (j27 < 262144) {
                    zzacvVar.zzf((int) j27);
                } else {
                    zzadsVar.zza = zzacvVar.zzn() + j27;
                    z7 = true;
                }
                zzk(jZzn4);
                if (!z7 && this.zzl != 2) {
                    return 1;
                }
            }
            z7 = false;
            zzk(jZzn4);
            if (!z7) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j7 == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzail zzailVar : this.zzy) {
            zzaiv zzaivVar = zzailVar.zzb;
            int iZza = zzaivVar.zza(j8);
            if (iZza == -1) {
                iZza = zzaivVar.zzb(j8);
            }
            zzailVar.zze = iZza;
            zzaec zzaecVar = zzailVar.zzd;
            if (zzaecVar != null) {
                zzaecVar.zza();
            }
        }
    }

    public zzaim(zzajt zzajtVar, int i7) {
        this.zzb = zzajtVar;
        this.zzc = i7;
        this.zzk = zzgjz.zzi();
        this.zzl = (i7 & 4) != 0 ? 3 : 0;
        this.zzi = new zzaiq();
        this.zzj = new ArrayList();
        this.zzg = new zzef(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzef(zzfl.zza);
        this.zze = new zzef(6);
        this.zzf = new zzef();
        this.zzq = -1;
        this.zzx = zzacx.zza;
        this.zzy = new zzail[0];
    }
}
