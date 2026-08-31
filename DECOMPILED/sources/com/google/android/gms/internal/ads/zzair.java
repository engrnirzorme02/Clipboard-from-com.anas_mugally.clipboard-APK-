package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzair {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzadz zza(zzacv zzacvVar) {
        return zzc(zzacvVar, true, false);
    }

    public static zzadz zzb(zzacv zzacvVar, boolean z7) {
        return zzc(zzacvVar, false, z7);
    }

    /* JADX WARN: Code duplicated, block: B:87:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0152  */
    /* JADX WARN: Code duplicated, block: B:91:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0158  */
    /* JADX WARN: Code duplicated, block: B:94:0x015b  */
    /* JADX WARN: Code duplicated, block: B:96:0x015e A[RETURN] */
    private static zzadz zzc(zzacv zzacvVar, boolean z7, boolean z8) {
        zzadz zzadzVar;
        int i7;
        long j7;
        int i8;
        int[] iArr;
        long jZzo = zzacvVar.zzo();
        long j8 = -1;
        long j9 = 4096;
        if (jZzo != -1 && jZzo <= 4096) {
            j9 = jZzo;
        }
        zzef zzefVar = new zzef(64);
        int i9 = (int) j9;
        int i10 = 0;
        int i11 = 0;
        boolean z9 = false;
        while (true) {
            if (i11 < i9) {
                zzefVar.zza(8);
                boolean z10 = true;
                if (zzacvVar.zzh(zzefVar.zzi(), i10, 8, true)) {
                    long jZzz = zzefVar.zzz();
                    int iZzB = zzefVar.zzB();
                    if (jZzz == 1) {
                        j8 = j8;
                        zzacvVar.zzi(zzefVar.zzi(), 8, 8);
                        i7 = 16;
                        zzefVar.zzf(16);
                        jZzz = zzefVar.zzD();
                    } else {
                        j8 = j8;
                        if (jZzz == 0) {
                            long jZzo2 = zzacvVar.zzo();
                            if (jZzo2 != j8) {
                                jZzz = (jZzo2 - zzacvVar.zzm()) + 8;
                            }
                        }
                        i7 = 8;
                    }
                    long j10 = jZzz;
                    zzadzVar = null;
                    long j11 = i7;
                    if (j10 < j11) {
                        return new zzahm(iZzB, j10, i7);
                    }
                    i11 += i7;
                    if (iZzB == 1836019574) {
                        i9 += (int) j10;
                        if (jZzo != -1 && i9 > jZzo) {
                            i9 = (int) jZzo;
                        }
                        i10 = 0;
                    } else {
                        if (iZzB == 1953653099 || iZzB == 1835297121 || iZzB == 1835626086) {
                            j7 = jZzo;
                            i8 = 0;
                        } else if (iZzB == 1836019558 || iZzB == 1836475768) {
                            i10 = 1;
                        } else {
                            z9 |= !(iZzB != 1835295092);
                            if (iZzB == 1937007212) {
                                if (j10 <= 1000000) {
                                    iZzB = 1937007212;
                                }
                                i10 = 0;
                            }
                            j7 = jZzo;
                            if ((((long) i11) + j10) - j11 >= i9) {
                                i10 = 0;
                            } else {
                                int i12 = (int) (j10 - j11);
                                i11 += i12;
                                if (iZzB != 1718909296) {
                                    i8 = 0;
                                    if (i12 != 0) {
                                        zzacvVar.zzk(i12);
                                    }
                                } else {
                                    if (i12 < 8) {
                                        return new zzahm(1718909296, i12, 8);
                                    }
                                    zzefVar.zza(i12);
                                    i8 = 0;
                                    zzacvVar.zzi(zzefVar.zzi(), 0, i12);
                                    int iZzB2 = zzefVar.zzB();
                                    boolean zZzd = zzd(iZzB2, z8) | z9;
                                    zzefVar.zzk(4);
                                    int iZzd = zzefVar.zzd() / 4;
                                    if (!zZzd && iZzd > 0) {
                                        iArr = new int[iZzd];
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= iZzd) {
                                                z10 = zZzd;
                                                break;
                                            }
                                            int iZzB3 = zzefVar.zzB();
                                            iArr[i13] = iZzB3;
                                            if (zzd(iZzB3, z8)) {
                                                break;
                                            }
                                            i13++;
                                        }
                                    } else {
                                        z10 = zZzd;
                                        iArr = null;
                                    }
                                    if (!z10) {
                                        return new zzaiw(iZzB2, iArr);
                                    }
                                    z9 = z10;
                                }
                            }
                        }
                        i10 = i8;
                        jZzo = j7;
                    }
                }
                if (!z9) {
                    return zzain.zza;
                }
                if (z7 != i10) {
                    return i10 != 0 ? zzaig.zza : zzaig.zzb;
                }
                return zzadzVar;
            }
            zzadzVar = null;
            if (!z9) {
                return zzain.zza;
            }
            if (z7 != i10) {
                if (i10 != 0) {
                }
            }
            return zzadzVar;
        }
    }

    private static boolean zzd(int i7, boolean z7) {
        if ((i7 >>> 8) == 3368816) {
            return true;
        }
        if (i7 == 1751476579) {
            if (z7) {
                return true;
            }
            i7 = 1751476579;
        }
        int[] iArr = zza;
        for (int i8 = 0; i8 < 29; i8++) {
            if (iArr[i8] == i7) {
                return true;
            }
        }
        return false;
    }
}
