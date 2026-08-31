package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzeo.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i7) {
        return (i7 >> 24) & 255;
    }

    /* JADX WARN: Code duplicated, block: B:291:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:615:0x0f0a  */
    /* JADX WARN: Code duplicated, block: B:616:0x0f0e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:617:0x0f10  */
    /* JADX WARN: Code duplicated, block: B:619:0x0f1f  */
    /* JADX WARN: Code duplicated, block: B:620:0x0f2b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0181  */
    /* JADX WARN: Code duplicated, block: B:69:0x0186  */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0192  */
    /* JADX WARN: Code duplicated, block: B:75:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:80:0x019d A[PHI: r2
      0x019d: PHI (r2v7 int) = (r2v8 int), (r2v4 int) binds: [B:85:0x01a8, B:74:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    public static List zzb(zzet zzetVar, zzadk zzadkVar, long j7, zzp zzpVar, boolean z7, boolean z8, zzggr zzggrVar, boolean z9) {
        int i7;
        ArrayList arrayList;
        long jZzz;
        int i8;
        char c7;
        char c8;
        long j8;
        long jZzt;
        char c9;
        long jZzt2;
        String str;
        int i9;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        zzet zzetVar2;
        long[] jArr;
        long[] jArr2;
        zzu zzuVarZzM;
        zzais zzaisVar;
        zzes zzesVar;
        zzao zzaoVar;
        zzao zzaoVar2;
        Pair pairZzn;
        boolean z10;
        int i13;
        long j9;
        int i14;
        int i15;
        zzp zzpVarZzb;
        String str2;
        int i16;
        zzahu zzahuVar;
        String str3;
        int i17;
        zzfi zzfiVar;
        zzgjz zzgjzVarZzi;
        int i18;
        int i19;
        boolean z11;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z12;
        boolean z13;
        boolean z14;
        zzgjz zzgjzVarZzi2;
        boolean z15;
        boolean z16;
        zzgjz zzgjzVarZzj;
        String str4;
        long j10;
        char c10;
        char c11;
        int i24;
        char c12;
        String str5 = "application/ttml+xml";
        int i25 = 1835297121;
        int i26 = 10;
        int i27 = 4;
        int i28 = 8;
        ArrayList arrayList3 = new ArrayList();
        int i29 = 0;
        char c13 = 0;
        while (true) {
            List list = zzetVar.zzc;
            if (i29 >= list.size()) {
                return arrayList3;
            }
            zzet zzetVar3 = (zzet) list.get(i29);
            if (zzetVar3.zzd != 1953653099) {
                i9 = i29;
                i24 = i25;
                i10 = i26;
                i12 = i27;
                str5 = str5;
                i11 = i28;
                c12 = c13;
            } else {
                zzeu zzeuVarZzc = zzetVar.zzc(1836476516);
                zzeuVarZzc.getClass();
                zzet zzetVarZzd = zzetVar3.zzd(i25);
                zzetVarZzd.getClass();
                zzeu zzeuVarZzc2 = zzetVarZzd.zzc(1751411826);
                zzeuVarZzc2.getClass();
                int iZzi = zzi(zzeuVarZzc2.zza);
                if (iZzi == 1936684398) {
                    i7 = 1;
                } else if (iZzi == 1986618469) {
                    i7 = 2;
                } else if (iZzi == 1952807028 || iZzi == 1935832172 || iZzi == 1937072756 || iZzi == 1668047728 || iZzi == 1937072752) {
                    i7 = 3;
                } else {
                    i7 = iZzi == 1835365473 ? 5 : -1;
                }
                if (i7 == -1) {
                    arrayList2 = arrayList3;
                    i9 = i29;
                    zzetVar2 = zzetVar3;
                    i10 = i26;
                    i12 = i27;
                    str5 = str5;
                    i11 = i28;
                    zzaisVar = null;
                } else {
                    zzeu zzeuVarZzc3 = zzetVar3.zzc(1953196132);
                    zzeuVarZzc3.getClass();
                    zzef zzefVar = zzeuVarZzc3.zza;
                    zzefVar.zzh(i28);
                    int iZza = zza(zzefVar.zzB());
                    if (iZza != 0) {
                        i28 = 16;
                    }
                    zzefVar.zzk(i28);
                    int i30 = i7;
                    int iZzB = zzefVar.zzB();
                    zzefVar.zzk(i27);
                    int iZzg = zzefVar.zzg();
                    int i31 = c13;
                    while (true) {
                        int i32 = iZza == 0 ? i27 : 8;
                        arrayList = arrayList3;
                        if (i31 >= i32) {
                            zzefVar.zzk(i32);
                        } else {
                            if (zzefVar.zzi()[iZzg + i31] != -1) {
                                jZzz = iZza == 0 ? zzefVar.zzz() : zzefVar.zzJ();
                                if (jZzz != 0) {
                                    break;
                                }
                                break;
                            }
                            i31++;
                            arrayList3 = arrayList;
                        }
                        jZzz = -9223372036854775807L;
                        break;
                    }
                    zzefVar.zzk(i26);
                    int iZzt = zzefVar.zzt();
                    zzefVar.zzk(i27);
                    int iZzB2 = zzefVar.zzB();
                    int iZzB3 = zzefVar.zzB();
                    zzefVar.zzk(i27);
                    int iZzB4 = zzefVar.zzB();
                    int i33 = i26;
                    int iZzB5 = zzefVar.zzB();
                    if (iZzB2 != 0) {
                        if (iZzB2 == 0) {
                            if (iZzB3 == -65536) {
                                if (iZzB4 != 65536) {
                                    if (iZzB4 == -65536) {
                                        if (iZzB5 == 0) {
                                            c8 = c13;
                                        } else {
                                            c8 = 1;
                                        }
                                        iZzB4 = -65536;
                                    }
                                    iZzB3 = -65536;
                                } else if (iZzB5 == 0) {
                                    c8 = c13;
                                } else {
                                    c8 = 1;
                                }
                                if (1 != c8) {
                                    c7 = 270;
                                } else {
                                    iZzB3 = -65536;
                                }
                            }
                            i8 = c13;
                        } else {
                            i8 = iZzB2;
                        }
                        c7 = ((i8 != -65536 || i8 == 65536) && iZzB3 == 0 && iZzB4 == 0 && iZzB5 == -65536) ? (char) 180 : c13;
                    } else if (iZzB3 != 65536) {
                        iZzB2 = c13;
                        if (iZzB2 == 0) {
                            if (iZzB3 == -65536) {
                                if (iZzB4 != 65536) {
                                    if (iZzB4 == -65536) {
                                        if (iZzB5 == 0) {
                                            c8 = c13;
                                        } else {
                                            c8 = 1;
                                        }
                                        iZzB4 = -65536;
                                    }
                                    iZzB3 = -65536;
                                } else if (iZzB5 == 0) {
                                    c8 = c13;
                                } else {
                                    c8 = 1;
                                }
                                if (1 != c8) {
                                    c7 = 270;
                                } else {
                                    iZzB3 = -65536;
                                }
                            }
                            i8 = c13;
                        } else {
                            i8 = iZzB2;
                        }
                        if (i8 != -65536) {
                        }
                    } else {
                        if (iZzB4 == -65536) {
                            if (iZzB5 == 0) {
                                c10 = c13;
                            } else {
                                c10 = 1;
                                c11 = 1;
                            }
                            if (c11 != c10) {
                                c7 = 'Z';
                            } else {
                                iZzB2 = c13;
                                iZzB3 = 65536;
                                if (iZzB2 == 0) {
                                    if (iZzB3 == -65536) {
                                        if (iZzB4 != 65536) {
                                            if (iZzB4 == -65536) {
                                                if (iZzB5 == 0) {
                                                    c8 = c13;
                                                } else {
                                                    c8 = 1;
                                                }
                                                iZzB4 = -65536;
                                            }
                                            iZzB3 = -65536;
                                        } else if (iZzB5 == 0) {
                                            c8 = c13;
                                        } else {
                                            c8 = 1;
                                        }
                                        if (1 != c8) {
                                            c7 = 270;
                                        } else {
                                            iZzB3 = -65536;
                                        }
                                    }
                                    i8 = c13;
                                } else {
                                    i8 = iZzB2;
                                }
                                if (i8 != -65536) {
                                }
                            }
                        } else if (iZzB4 == 65536) {
                            c10 = iZzB5 == 0 ? c13 : (char) 1;
                            iZzB4 = 65536;
                        } else {
                            iZzB3 = 65536;
                            iZzB2 = c13;
                            if (iZzB2 == 0) {
                                if (iZzB3 == -65536) {
                                    if (iZzB4 != 65536) {
                                        if (iZzB4 == -65536) {
                                            if (iZzB5 == 0) {
                                                c8 = c13;
                                            } else {
                                                c8 = 1;
                                            }
                                            iZzB4 = -65536;
                                        }
                                        iZzB3 = -65536;
                                    } else if (iZzB5 == 0) {
                                        c8 = c13;
                                    } else {
                                        c8 = 1;
                                    }
                                    if (1 != c8) {
                                        c7 = 270;
                                    } else {
                                        iZzB3 = -65536;
                                    }
                                }
                                i8 = c13;
                            } else {
                                i8 = iZzB2;
                            }
                            if (i8 != -65536) {
                            }
                        }
                        c11 = 1;
                        if (c11 != c10) {
                            c7 = 'Z';
                        } else {
                            iZzB2 = c13;
                            iZzB3 = 65536;
                            if (iZzB2 == 0) {
                                if (iZzB3 == -65536) {
                                    if (iZzB4 != 65536) {
                                        if (iZzB4 == -65536) {
                                            if (iZzB5 == 0) {
                                                c8 = c13;
                                            } else {
                                                c8 = 1;
                                            }
                                            iZzB4 = -65536;
                                        }
                                        iZzB3 = -65536;
                                    } else if (iZzB5 == 0) {
                                        c8 = c13;
                                    } else {
                                        c8 = 1;
                                    }
                                    if (1 != c8) {
                                        c7 = 270;
                                    } else {
                                        iZzB3 = -65536;
                                    }
                                }
                                i8 = c13;
                            } else {
                                i8 = iZzB2;
                            }
                            if (i8 != -65536) {
                            }
                        }
                    }
                    zzefVar.zzk(16);
                    short sZzv = zzefVar.zzv();
                    zzefVar.zzk(2);
                    short sZzv2 = zzefVar.zzv();
                    long j11 = j7 == -9223372036854775807L ? jZzz : j7;
                    long j12 = zzd(zzeuVarZzc.zza).zzc;
                    if (j11 == -9223372036854775807L) {
                        j8 = j12;
                        jZzt = -9223372036854775807L;
                    } else {
                        j8 = j12;
                        jZzt = zzeo.zzt(j11, 1000000L, j8, RoundingMode.DOWN);
                    }
                    zzet zzetVarZzd2 = zzetVarZzd.zzd(1835626086);
                    zzetVarZzd2.getClass();
                    zzet zzetVarZzd3 = zzetVarZzd2.zzd(1937007212);
                    zzetVarZzd3.getClass();
                    zzeu zzeuVarZzc4 = zzetVarZzd.zzc(1835296868);
                    zzeuVarZzc4.getClass();
                    zzef zzefVar2 = zzeuVarZzc4.zza;
                    zzefVar2.zzh(8);
                    int iZza2 = zza(zzefVar2.zzB());
                    zzefVar2.zzk(iZza2 == 0 ? 8 : 16);
                    long jZzz2 = zzefVar2.zzz();
                    int iZzg2 = zzefVar2.zzg();
                    int i34 = c13;
                    while (true) {
                        int i35 = iZza2 == 0 ? 4 : 8;
                        if (i34 >= i35) {
                            c9 = c7;
                            zzefVar2.zzk(i35);
                            jZzt2 = -9223372036854775807L;
                            break;
                        }
                        c9 = c7;
                        if (zzefVar2.zzi()[iZzg2 + i34] != -1) {
                            long jZzz3 = iZza2 == 0 ? zzefVar2.zzz() : zzefVar2.zzJ();
                            if (jZzz3 != 0) {
                                jZzt2 = zzeo.zzt(jZzz3, 1000000L, jZzz2, RoundingMode.DOWN);
                                break;
                            }
                            jZzt2 = -9223372036854775807L;
                            break;
                        }
                        i34++;
                        c7 = c9;
                        iZza2 = iZza2;
                        str5 = str5;
                    }
                    int iZzt2 = zzefVar2.zzt();
                    int i36 = 3;
                    char[] cArr = new char[3];
                    cArr[c13] = (char) (((iZzt2 >> 10) & 31) + 96);
                    cArr[1] = (char) (((iZzt2 >> 5) & 31) + 96);
                    cArr[2] = (char) ((iZzt2 & 31) + 96);
                    int i37 = c13;
                    while (true) {
                        if (i37 >= i36) {
                            str = new String(cArr);
                            break;
                        }
                        char c14 = cArr[i37];
                        if (c14 < 'a' || c14 > 'z') {
                            str = null;
                            break;
                        }
                        i37++;
                        i36 = 3;
                    }
                    zzeu zzeuVarZzc5 = zzetVarZzd3.zzc(1937011556);
                    if (zzeuVarZzc5 == null) {
                        throw zzas.zzb("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    String strZzc = zzahr.zzc(jZzz2, jZzt2, str);
                    zzef zzefVar3 = zzeuVarZzc5.zza;
                    zzefVar3.zzh(12);
                    int iZzB6 = zzefVar3.zzB();
                    zzahu zzahuVar2 = new zzahu(iZzB6);
                    int i38 = c13;
                    while (i38 < iZzB6) {
                        int iZzg3 = zzefVar3.zzg();
                        int iZzB7 = zzefVar3.zzB();
                        boolean z17 = iZzB7 > 0 ? 1 : c13;
                        int i39 = iZzB7;
                        String str6 = "childAtomSize must be positive";
                        zzacy.zza(z17, "childAtomSize must be positive");
                        int iZzB8 = zzefVar3.zzB();
                        int i40 = i38;
                        int i41 = iZzB6;
                        if (iZzB8 == 1635148593 || iZzB8 == 1635148595 || iZzB8 == 1701733238 || iZzB8 == 1831958048 || iZzB8 == 1836070006 || iZzB8 == 1752589105 || iZzB8 == 1751479857 || iZzB8 == 1932670515 || iZzB8 == 1211250227 || iZzB8 == 1748121139 || iZzB8 == 1987063864 || iZzB8 == 1987063865 || iZzB8 == 1635135537 || iZzB8 == 1685479798 || iZzB8 == 1685479729 || iZzB8 == 1685481573 || iZzB8 == 1685481521) {
                            z10 = true;
                            i13 = 16;
                        } else {
                            if (iZzB8 == 1634760241) {
                                i13 = 16;
                                z10 = true;
                            } else if (iZzB8 == 1836069985 || iZzB8 == 1701733217 || iZzB8 == 1633889587 || iZzB8 == 1700998451 || iZzB8 == 1633889588 || iZzB8 == 1835823201 || iZzB8 == 1685353315 || iZzB8 == 1685353317 || iZzB8 == 1685353320 || iZzB8 == 1685353324 || iZzB8 == 1685353336 || iZzB8 == 1935764850 || iZzB8 == 1935767394 || iZzB8 == 1819304813 || iZzB8 == 1936684916 || iZzB8 == 1953984371 || iZzB8 == 778924082 || iZzB8 == 778924083 || iZzB8 == 1835557169 || iZzB8 == 1835560241 || iZzB8 == 1634492771 || iZzB8 == 1634492791 || iZzB8 == 1970037111 || iZzB8 == 1332770163 || iZzB8 == 1716281667 || iZzB8 == 1767992678 || iZzB8 == 1768973165 || iZzB8 == 1718641517) {
                                short s7 = sZzv;
                                zzo(zzefVar3, iZzB8, iZzg3, i39, iZzB, strZzc, z8, zzpVar, zzahuVar2, i40);
                                iZzg3 = iZzg3;
                                i39 = i39;
                                strZzc = strZzc;
                                i40 = i40;
                                i14 = iZzt;
                                c9 = c9;
                                sZzv = s7;
                                j9 = jZzt2;
                            } else {
                                if (iZzB8 == 1414810956 || iZzB8 == 1954034535 || iZzB8 == 2004251764 || iZzB8 == 1937010800 || iZzB8 == 1664495672 || iZzB8 == 1836070003) {
                                    zzefVar3.zzh(iZzg3 + 16);
                                    if (iZzB8 == 1414810956) {
                                        str = str;
                                        str4 = str5;
                                    } else {
                                        if (iZzB8 == 1954034535) {
                                            int i42 = i39 - 16;
                                            byte[] bArr = new byte[i42];
                                            zzefVar3.zzm(bArr, 0, i42);
                                            zzgjzVarZzj = zzgjz.zzj(bArr);
                                            str4 = "application/x-quicktime-tx3g";
                                            str = str;
                                        } else if (iZzB8 == 2004251764) {
                                            str = str;
                                            str4 = "application/x-mp4-vtt";
                                        } else {
                                            str = str;
                                            if (iZzB8 == 1937010800) {
                                                j10 = 0;
                                                str4 = str5;
                                                zzgjzVarZzj = null;
                                                if (str4 != null) {
                                                    zzs zzsVar = new zzs();
                                                    zzsVar.zzb(iZzB);
                                                    zzsVar.zzm(str4);
                                                    zzsVar.zze(strZzc);
                                                    zzsVar.zzr(j10);
                                                    zzsVar.zzp(zzgjzVarZzj);
                                                    zzahuVar2.zzb = zzsVar.zzM();
                                                }
                                            } else if (iZzB8 == 1664495672) {
                                                zzahuVar2.zzd = 1;
                                                str4 = "application/x-mp4-cea-608";
                                            } else {
                                                int iZzg4 = zzefVar3.zzg();
                                                zzefVar3.zzk(4);
                                                if (zzefVar3.zzB() == 1702061171) {
                                                    zzahp zzahpVarZzp = zzp(zzefVar3, iZzg4);
                                                    if (zzahpVarZzp.zzb() != null && zzahpVarZzp.zzb().length == 64) {
                                                        String strZzj = zzj(zzahpVarZzp.zzb(), sZzv, sZzv2);
                                                        String str7 = zzeo.zza;
                                                        str4 = "application/vobsub";
                                                        zzgjzVarZzj = zzgjz.zzj(strZzj.getBytes(StandardCharsets.UTF_8));
                                                    }
                                                } else {
                                                    zzgjzVarZzj = null;
                                                    str4 = null;
                                                }
                                            }
                                            i14 = iZzt;
                                            j9 = jZzt2;
                                        }
                                        j10 = Long.MAX_VALUE;
                                        if (str4 != null) {
                                            zzs zzsVar2 = new zzs();
                                            zzsVar2.zzb(iZzB);
                                            zzsVar2.zzm(str4);
                                            zzsVar2.zze(strZzc);
                                            zzsVar2.zzr(j10);
                                            zzsVar2.zzp(zzgjzVarZzj);
                                            zzahuVar2.zzb = zzsVar2.zzM();
                                        }
                                    }
                                    zzgjzVarZzj = null;
                                    j10 = Long.MAX_VALUE;
                                    if (str4 != null) {
                                        zzs zzsVar3 = new zzs();
                                        zzsVar3.zzb(iZzB);
                                        zzsVar3.zzm(str4);
                                        zzsVar3.zze(strZzc);
                                        zzsVar3.zzr(j10);
                                        zzsVar3.zzp(zzgjzVarZzj);
                                        zzahuVar2.zzb = zzsVar3.zzM();
                                    }
                                } else {
                                    if (iZzB8 == 1835365492) {
                                        zzefVar3.zzh(iZzg3 + 16);
                                        char c15 = c13;
                                        zzefVar3.zzM(c15);
                                        String strZzM = zzefVar3.zzM(c15);
                                        if (strZzM != null) {
                                            zzs zzsVar4 = new zzs();
                                            zzsVar4.zzb(iZzB);
                                            zzsVar4.zzm(strZzM);
                                            zzahuVar2.zzb = zzsVar4.zzM();
                                        }
                                    } else if (iZzB8 == 1667329389) {
                                        zzs zzsVar5 = new zzs();
                                        zzsVar5.zzb(iZzB);
                                        zzsVar5.zzm("application/x-camera-motion");
                                        zzahuVar2.zzb = zzsVar5.zzM();
                                    }
                                    str = str;
                                }
                                i14 = iZzt;
                                j9 = jZzt2;
                            }
                            zzefVar3.zzh(iZzg3 + i39);
                            i38 = i40 + 1;
                            strZzc = strZzc;
                            c9 = c9;
                            zzahuVar2 = zzahuVar2;
                            str = str;
                            i29 = r44;
                            sZzv2 = sZzv2;
                            sZzv = sZzv;
                            iZzt = i14;
                            jZzt2 = j9;
                            iZzB6 = i41;
                            jZzz2 = jZzz2;
                            arrayList = arrayList;
                            zzetVar3 = r45;
                            c13 = 0;
                            i33 = i33;
                        }
                        zzefVar3.zzh(iZzg3 + 16);
                        zzefVar3.zzk(i13);
                        int iZzt3 = zzefVar3.zzt();
                        int iZzt4 = zzefVar3.zzt();
                        sZzv = sZzv;
                        zzefVar3.zzk(50);
                        int iZzg5 = zzefVar3.zzg();
                        j9 = jZzt2;
                        int iIntValue = 1701733238;
                        if (iZzB8 == 1701733238) {
                            Pair pairZzr = zzr(zzefVar3, iZzg3, i39);
                            if (pairZzr != null) {
                                iIntValue = ((Integer) pairZzr.first).intValue();
                                zzpVarZzb = zzpVar == 0 ? null : zzpVar.zzb(((zzait) pairZzr.second).zzb);
                                zzahuVar2.zza[i40] = (zzait) pairZzr.second;
                            } else {
                                zzpVarZzb = zzpVar;
                            }
                            i15 = iIntValue;
                            zzefVar3.zzh(iZzg5);
                        } else {
                            iZzg3 = iZzg3;
                            i15 = iZzB8;
                            zzpVarZzb = zzpVar;
                        }
                        if (i15 == 1831958048) {
                            str2 = "video/mpeg";
                        } else if (i15 == 1211250227) {
                            str2 = "video/3gpp";
                            i15 = 1211250227;
                        } else {
                            str2 = null;
                        }
                        int i43 = iZzB;
                        String str8 = strZzc;
                        i14 = iZzt;
                        char c16 = c9;
                        int i44 = iZzg5;
                        zzp zzpVar2 = zzpVarZzb;
                        float fZzH = 1.0f;
                        List listZzj = null;
                        int i45 = -1;
                        int i46 = 8;
                        int i47 = 8;
                        int i48 = -1;
                        zzfi zzfiVar2 = null;
                        int i49 = -1;
                        int iZzc = -1;
                        boolean z18 = false;
                        int i50 = -1;
                        int i51 = -1;
                        ByteBuffer byteBufferZzm = null;
                        zzahn zzahnVarZzq = null;
                        zzahp zzahpVar = null;
                        byte[] bArrCopyOfRange = null;
                        int i52 = -1;
                        int i53 = -1;
                        String str9 = null;
                        while (i44 - iZzg3 < i39) {
                            zzefVar3.zzh(i44);
                            int iZzg6 = zzefVar3.zzg();
                            int iZzB9 = zzefVar3.zzB();
                            if (iZzB9 != 0) {
                                i16 = iZzB9;
                            } else {
                                if (zzefVar3.zzg() - iZzg3 == i39) {
                                    break;
                                }
                                i16 = 0;
                            }
                            zzacy.zza(i16 > 0 ? z10 : false, str6);
                            int iZzB10 = zzefVar3.zzB();
                            if (iZzB10 == 1635148611) {
                                int i54 = iZzg6 + 8;
                                zzacy.zza(str2 == null ? z10 : false, null);
                                zzefVar3.zzh(i54);
                                zzabz zzabzVarZza = zzabz.zza(zzefVar3);
                                List list2 = zzabzVarZza.zza;
                                zzahuVar2.zzc = zzabzVarZza.zzb;
                                if (z18) {
                                    z16 = z10;
                                } else {
                                    fZzH = zzabzVarZza.zzk;
                                    z16 = false;
                                }
                                String str10 = zzabzVarZza.zzl;
                                int i55 = zzabzVarZza.zzj;
                                int i56 = zzabzVarZza.zzg;
                                int i57 = zzabzVarZza.zzh;
                                int i58 = zzabzVarZza.zzi;
                                int i59 = zzabzVarZza.zze;
                                i17 = zzabzVarZza.zzf;
                                zzahuVar = zzahuVar2;
                                i15 = i15;
                                str3 = str6;
                                listZzj = list2;
                                str9 = str10;
                                i51 = i55;
                                i45 = i57;
                                zzfiVar = zzfiVar2;
                                i46 = i59;
                                i48 = i56;
                                iZzc = i58;
                                str2 = "video/avc";
                                z18 = z16;
                            } else if (iZzB10 == 1752589123) {
                                int i60 = iZzg6 + 8;
                                zzacy.zza(str2 == null ? z10 : false, null);
                                zzefVar3.zzh(i60);
                                zzadl zzadlVarZza = zzadl.zza(zzefVar3);
                                List list3 = zzadlVarZza.zza;
                                zzahuVar2.zzc = zzadlVarZza.zzb;
                                if (z18) {
                                    z15 = z10;
                                } else {
                                    fZzH = zzadlVarZza.zzl;
                                    z15 = false;
                                }
                                int i61 = zzadlVarZza.zzm;
                                int i62 = zzadlVarZza.zzc;
                                String str11 = zzadlVarZza.zzn;
                                int i63 = zzadlVarZza.zzk;
                                if (i63 == -1) {
                                    i63 = i49;
                                }
                                int i64 = zzadlVarZza.zzd;
                                int i65 = zzadlVarZza.zze;
                                int i66 = zzadlVarZza.zzh;
                                int i67 = zzadlVarZza.zzi;
                                int i68 = zzadlVarZza.zzj;
                                int i69 = zzadlVarZza.zzf;
                                int i70 = zzadlVarZza.zzg;
                                i49 = i63;
                                i48 = i66;
                                str2 = "video/hevc";
                                i52 = i65;
                                zzfiVar = zzadlVarZza.zzo;
                                zzahuVar = zzahuVar2;
                                i15 = i15;
                                str3 = str6;
                                i17 = i70;
                                str9 = str11;
                                i53 = i64;
                                i45 = i67;
                                iZzc = i68;
                                listZzj = list3;
                                z18 = z15;
                                i50 = i62;
                                i46 = i69;
                                i51 = i61;
                            } else if (iZzB10 == 1818785347) {
                                int i71 = iZzg6 + 8;
                                zzacy.zza("video/hevc".equals(str2), "lhvC must follow hvcC atom");
                                if (zzfiVar2 != null) {
                                    z14 = zzfiVar2.zza.size() >= 2 ? z10 : false;
                                } else {
                                    z14 = false;
                                    zzfiVar2 = null;
                                }
                                zzacy.zza(z14, "must have at least two layers");
                                zzefVar3.zzh(i71);
                                zzfiVar2.getClass();
                                zzadl zzadlVarZzb = zzadl.zzb(zzefVar3, zzfiVar2);
                                zzacy.zza(zzahuVar2.zzc == zzadlVarZzb.zzb ? z10 : false, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                int i72 = zzadlVarZzb.zzh;
                                if (i72 != -1) {
                                    zzacy.zza(i48 == i72 ? z10 : false, "colorSpace must be the same for both views");
                                }
                                int i73 = zzadlVarZzb.zzi;
                                if (i73 != -1) {
                                    zzacy.zza(i45 == i73 ? z10 : false, "colorRange must be the same for both views");
                                }
                                int i74 = zzadlVarZzb.zzj;
                                if (i74 != -1) {
                                    zzacy.zza(iZzc == i74 ? z10 : false, "colorTransfer must be the same for both views");
                                }
                                zzacy.zza(i46 == zzadlVarZzb.zzf ? z10 : false, "bitdepthLuma must be the same for both views");
                                zzacy.zza(i47 == zzadlVarZzb.zzg ? z10 : false, "bitdepthChroma must be the same for both views");
                                if (listZzj != null) {
                                    int i75 = zzgjz.zzd;
                                    zzgjw zzgjwVar = new zzgjw();
                                    zzgjwVar.zzh(listZzj);
                                    zzgjwVar.zzh(zzadlVarZzb.zza);
                                    zzgjzVarZzi2 = zzgjwVar.zzi();
                                } else {
                                    zzacy.zza(false, "initializationData must be already set from hvcC atom");
                                    zzgjzVarZzi2 = null;
                                }
                                str9 = zzadlVarZzb.zzn;
                                zzahuVar = zzahuVar2;
                                str3 = str6;
                                str2 = "video/mv-hevc";
                                listZzj = zzgjzVarZzi2;
                                i17 = i47;
                                zzfiVar = zzfiVar2;
                            } else if (iZzB10 == 1986361461) {
                                zzefVar3.zzh(iZzg6 + 8);
                                int iZzg7 = zzefVar3.zzg();
                                zzahuVar = zzahuVar2;
                                zzahq zzahqVar = null;
                                while (iZzg7 - iZzg6 < i16) {
                                    zzefVar3.zzh(iZzg7);
                                    int iZzB11 = zzefVar3.zzB();
                                    zzacy.zza(iZzB11 > 0 ? z10 : false, str6);
                                    int i76 = i47;
                                    if (zzefVar3.zzB() == 1702454643) {
                                        zzefVar3.zzh(iZzg7 + 8);
                                        int iZzg8 = zzefVar3.zzg();
                                        while (true) {
                                            if (iZzg8 - iZzg7 >= iZzB11) {
                                                i23 = iZzB11;
                                                zzahqVar = null;
                                                break;
                                            }
                                            zzefVar3.zzh(iZzg8);
                                            int iZzB12 = zzefVar3.zzB();
                                            zzacy.zza(iZzB12 > 0 ? z10 : false, str6);
                                            i23 = iZzB11;
                                            if (zzefVar3.zzB() == 1937011305) {
                                                zzefVar3.zzk(4);
                                                int iZzs = zzefVar3.zzs();
                                                int i77 = iZzs & 1;
                                                boolean z19 = (iZzs & 2) == 2 ? z10 : false;
                                                if ((iZzs & 8) == 8) {
                                                    z13 = z10;
                                                    z12 = z13;
                                                } else {
                                                    z12 = z10;
                                                    z13 = false;
                                                }
                                                zzahqVar = new zzahq(new zzaht(z12 == i77, z19, z13));
                                                break;
                                            }
                                            iZzg8 += iZzB12;
                                            iZzB11 = i23;
                                            z10 = true;
                                        }
                                    } else {
                                        i23 = iZzB11;
                                    }
                                    iZzg7 += i23;
                                    i47 = i76;
                                    str6 = str6;
                                    z10 = true;
                                }
                                str3 = str6;
                                i17 = i47;
                                zzahx zzahxVar = zzahqVar == null ? null : new zzahx(zzahqVar);
                                if (zzahxVar != null) {
                                    if (zzfiVar2 == null) {
                                        zzfiVar2 = null;
                                    } else if (zzfiVar2.zza.size() >= 2) {
                                        zzacy.zza(zzahxVar.zza(), "both eye views must be marked as available");
                                        zzacy.zza(!zzahxVar.zzb().zza().zzc(), "for MV-HEVC, eye_views_reversed must be set to false");
                                    }
                                    if (i49 == -1) {
                                        zzfiVar = zzfiVar2;
                                        i49 = true != zzahxVar.zzb().zza().zzc() ? 4 : 5;
                                    } else {
                                        i15 = i15;
                                        i45 = i45;
                                        zzfiVar = zzfiVar2;
                                    }
                                }
                                i15 = i15;
                                i45 = i45;
                                i18 = i46;
                                zzfiVar = zzfiVar2;
                                i19 = i49;
                                i46 = i18;
                                i49 = i19;
                            } else {
                                zzahuVar = zzahuVar2;
                                str3 = str6;
                                i17 = i47;
                                if (iZzB10 == 1685480259 || iZzB10 == 1685485123 || iZzB10 == 1685485379) {
                                    i15 = i15;
                                    i45 = i45;
                                    int i78 = i46;
                                    zzfiVar = zzfiVar2;
                                    int i79 = i49;
                                    int i80 = i16 - 8;
                                    int i81 = iZzg6 + 8;
                                    byte[] bArr2 = new byte[i80];
                                    zzefVar3.zzm(bArr2, 0, i80);
                                    if (listZzj != null) {
                                        int i82 = zzgjz.zzd;
                                        zzgjw zzgjwVar2 = new zzgjw();
                                        zzgjwVar2.zzh(listZzj);
                                        zzgjwVar2.zzf(bArr2);
                                        zzgjzVarZzi = zzgjwVar2.zzi();
                                    } else {
                                        zzacy.zza(false, "initializationData must already be set from hvcC or avcC atom");
                                        zzgjzVarZzi = null;
                                    }
                                    zzefVar3.zzh(i81);
                                    zzeq zzeqVarZza = zzeq.zza(zzefVar3);
                                    if (zzeqVarZza != null) {
                                        str9 = zzeqVarZza.zza;
                                        str2 = "video/dolby-vision";
                                    }
                                    listZzj = zzgjzVarZzi;
                                    i46 = i78;
                                    i49 = i79;
                                } else if (iZzB10 == 1987076931) {
                                    int i83 = iZzg6 + 12;
                                    zzacy.zza(str2 == null, null);
                                    zzefVar3.zzh(i83);
                                    byte bZzs = (byte) zzefVar3.zzs();
                                    byte bZzs2 = (byte) zzefVar3.zzs();
                                    int iZzs2 = zzefVar3.zzs();
                                    int i84 = iZzs2 >> 4;
                                    int i85 = iZzs2 >> 1;
                                    String str12 = i15 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    if (str12.equals("video/x-vnd.on2.vp9")) {
                                        int i86 = zzdc.zza;
                                        byte[] bArr3 = new byte[12];
                                        i22 = 1;
                                        bArr3[0] = 1;
                                        bArr3[1] = 1;
                                        bArr3[2] = bZzs;
                                        bArr3[3] = 2;
                                        bArr3[4] = 1;
                                        bArr3[5] = bZzs2;
                                        bArr3[6] = 3;
                                        bArr3[7] = 1;
                                        bArr3[8] = (byte) i84;
                                        bArr3[9] = 4;
                                        bArr3[i33] = 1;
                                        bArr3[11] = (byte) (i85 & 7);
                                        listZzj = zzgjz.zzj(bArr3);
                                    } else {
                                        i22 = 1;
                                    }
                                    int i87 = iZzs2 & 1;
                                    int iZzs3 = zzefVar3.zzs();
                                    int iZzs4 = zzefVar3.zzs();
                                    int iZzb = zzh.zzb(iZzs3);
                                    i15 = i15;
                                    i45 = i22 != i87 ? 2 : 1;
                                    iZzc = zzh.zzc(iZzs4);
                                    i46 = i84;
                                    i17 = i46;
                                    str2 = str12;
                                    zzfiVar = zzfiVar2;
                                    i48 = iZzb;
                                } else {
                                    if (iZzB10 == 1635135811) {
                                        int i88 = i16 - 8;
                                        byte[] bArr4 = new byte[i88];
                                        zzefVar3.zzm(bArr4, 0, i88);
                                        listZzj = zzgjz.zzj(bArr4);
                                        zzefVar3.zzh(iZzg6 + 8);
                                        zzh zzhVarZzk = zzk(zzefVar3);
                                        i20 = zzhVarZzk.zzf;
                                        int i89 = zzhVarZzk.zzg;
                                        i21 = zzhVarZzk.zzb;
                                        int i90 = zzhVarZzk.zzc;
                                        i15 = i15;
                                        iZzc = zzhVarZzk.zzd;
                                        i17 = i89;
                                        i45 = i90;
                                        str2 = "video/av01";
                                        zzfiVar = zzfiVar2;
                                    } else if (iZzB10 == 1668050025) {
                                        if (byteBufferZzm == null) {
                                            byteBufferZzm = zzm();
                                        }
                                        ByteBuffer byteBuffer = byteBufferZzm;
                                        byteBuffer.position(21);
                                        byteBuffer.putShort(zzefVar3.zzv());
                                        byteBuffer.putShort(zzefVar3.zzv());
                                        i15 = i15;
                                        byteBufferZzm = byteBuffer;
                                        i45 = i45;
                                        zzfiVar = zzfiVar2;
                                    } else {
                                        if (iZzB10 == 1835295606) {
                                            if (byteBufferZzm == null) {
                                                byteBufferZzm = zzm();
                                            }
                                            ByteBuffer byteBuffer2 = byteBufferZzm;
                                            short sZzv3 = zzefVar3.zzv();
                                            short sZzv4 = zzefVar3.zzv();
                                            short sZzv5 = zzefVar3.zzv();
                                            short sZzv6 = zzefVar3.zzv();
                                            i15 = i15;
                                            short sZzv7 = zzefVar3.zzv();
                                            zzfiVar = zzfiVar2;
                                            short sZzv8 = zzefVar3.zzv();
                                            i18 = i46;
                                            short sZzv9 = zzefVar3.zzv();
                                            i45 = i45;
                                            short sZzv10 = zzefVar3.zzv();
                                            long jZzz4 = zzefVar3.zzz();
                                            long jZzz5 = zzefVar3.zzz();
                                            i19 = i49;
                                            byteBuffer2.position(1);
                                            byteBuffer2.putShort(sZzv7);
                                            byteBuffer2.putShort(sZzv8);
                                            byteBuffer2.putShort(sZzv3);
                                            byteBuffer2.putShort(sZzv4);
                                            byteBuffer2.putShort(sZzv5);
                                            byteBuffer2.putShort(sZzv6);
                                            byteBuffer2.putShort(sZzv9);
                                            byteBuffer2.putShort(sZzv10);
                                            byteBuffer2.putShort((short) (jZzz4 / 10000));
                                            byteBuffer2.putShort((short) (jZzz5 / 10000));
                                            byteBufferZzm = byteBuffer2;
                                        } else {
                                            i15 = i15;
                                            i45 = i45;
                                            i18 = i46;
                                            zzfiVar = zzfiVar2;
                                            i19 = i49;
                                            if (iZzB10 == 1681012275) {
                                                zzacy.zza(str2 == null, null);
                                                str2 = "video/3gpp";
                                            } else {
                                                if (iZzB10 == 1702061171) {
                                                    zzacy.zza(str2 == null, null);
                                                    zzahp zzahpVarZzp2 = zzp(zzefVar3, iZzg6);
                                                    String strZza = zzahpVarZzp2.zza();
                                                    byte[] bArrZzb = zzahpVarZzp2.zzb();
                                                    if (bArrZzb != null) {
                                                        listZzj = zzgjz.zzj(bArrZzb);
                                                    }
                                                    zzahpVar = zzahpVarZzp2;
                                                    str2 = strZza;
                                                } else if (iZzB10 == 1651798644) {
                                                    zzahnVarZzq = zzq(zzefVar3, iZzg6);
                                                } else if (iZzB10 == 1885434736) {
                                                    zzefVar3.zzh(iZzg6 + 8);
                                                    fZzH = zzefVar3.zzH() / zzefVar3.zzH();
                                                    i46 = i18;
                                                    i49 = i19;
                                                    z18 = true;
                                                } else if (iZzB10 == 1937126244) {
                                                    int i91 = iZzg6 + 8;
                                                    while (true) {
                                                        if (i91 - iZzg6 < i16) {
                                                            zzefVar3.zzh(i91);
                                                            int iZzB13 = zzefVar3.zzB() + i91;
                                                            if (zzefVar3.zzB() == 1886547818) {
                                                                bArrCopyOfRange = Arrays.copyOfRange(zzefVar3.zzi(), i91, iZzB13);
                                                            } else {
                                                                i91 = iZzB13;
                                                            }
                                                        } else {
                                                            i46 = i18;
                                                            i49 = i19;
                                                            bArrCopyOfRange = null;
                                                        }
                                                    }
                                                } else if (iZzB10 == 1936995172) {
                                                    int iZzs5 = zzefVar3.zzs();
                                                    zzefVar3.zzk(3);
                                                    if (iZzs5 == 0) {
                                                        int iZzs6 = zzefVar3.zzs();
                                                        if (iZzs6 == 0) {
                                                            i46 = i18;
                                                            i49 = 0;
                                                        } else if (iZzs6 == 1) {
                                                            i46 = i18;
                                                            i49 = 1;
                                                        } else if (iZzs6 == 2) {
                                                            i46 = i18;
                                                            i49 = 2;
                                                        } else if (iZzs6 == 3) {
                                                            i49 = 3;
                                                            i46 = i18;
                                                        }
                                                    }
                                                    i46 = i18;
                                                    i49 = i19;
                                                } else if (iZzB10 == 1634760259) {
                                                    int i92 = i16 - 12;
                                                    byte[] bArr5 = new byte[i92];
                                                    zzefVar3.zzh(iZzg6 + 12);
                                                    zzefVar3.zzm(bArr5, 0, i92);
                                                    String strZzd = zzdc.zzd(bArr5);
                                                    zzgjz zzgjzVarZzj2 = zzgjz.zzj(bArr5);
                                                    zzh zzhVarZzl = zzl(new zzef(bArr5));
                                                    i20 = zzhVarZzl.zzf;
                                                    int i93 = zzhVarZzl.zzg;
                                                    i21 = zzhVarZzl.zzb;
                                                    int i94 = zzhVarZzl.zzc;
                                                    str9 = strZzd;
                                                    iZzc = zzhVarZzl.zzd;
                                                    listZzj = zzgjzVarZzj2;
                                                    i17 = i93;
                                                    i45 = i94;
                                                    str2 = "video/apv";
                                                    i49 = i19;
                                                } else {
                                                    if (iZzB10 == 1668246642 && i48 == -1) {
                                                        if (iZzc == -1) {
                                                            int iZzB14 = zzefVar3.zzB();
                                                            if (iZzB14 == 1852009592 || iZzB14 == 1852009571) {
                                                                int iZzt5 = zzefVar3.zzt();
                                                                int iZzt6 = zzefVar3.zzt();
                                                                zzefVar3.zzk(2);
                                                                if (i16 != 19) {
                                                                    z11 = false;
                                                                } else if ((zzefVar3.zzs() & 128) != 0) {
                                                                    i16 = 19;
                                                                    z11 = true;
                                                                } else {
                                                                    i16 = 19;
                                                                    z11 = false;
                                                                }
                                                                int iZzb2 = zzh.zzb(iZzt5);
                                                                int i95 = true != z11 ? 2 : 1;
                                                                i48 = iZzb2;
                                                                iZzc = zzh.zzc(iZzt6);
                                                                i45 = i95;
                                                            } else {
                                                                zzds.zzc("BoxParsers", "Unsupported color type: ".concat(zzev.zze(iZzB14)));
                                                                i48 = -1;
                                                                iZzc = -1;
                                                                i46 = i18;
                                                                i49 = i19;
                                                            }
                                                        } else {
                                                            i48 = -1;
                                                        }
                                                    }
                                                    i46 = i18;
                                                    i49 = i19;
                                                }
                                                i46 = i18;
                                                i49 = i19;
                                            }
                                        }
                                        i46 = i18;
                                        i49 = i19;
                                    }
                                    i46 = i20;
                                    i48 = i21;
                                }
                            }
                            i44 += i16;
                            i39 = i39;
                            zzahuVar2 = zzahuVar;
                            i15 = i15;
                            i47 = i17;
                            zzfiVar2 = zzfiVar;
                            str6 = str3;
                            i45 = i45;
                            z10 = true;
                        }
                        zzahu zzahuVar3 = zzahuVar2;
                        int i96 = i45;
                        i39 = i39;
                        int i97 = i46;
                        int i98 = i47;
                        int i99 = i49;
                        if (str2 == null) {
                            strZzc = str8;
                            c9 = c16;
                            iZzB = i43;
                            zzahuVar2 = zzahuVar3;
                        } else {
                            zzs zzsVar6 = new zzs();
                            iZzB = i43;
                            zzsVar6.zzb(iZzB);
                            zzsVar6.zzm(str2);
                            zzsVar6.zzj(str9);
                            zzsVar6.zzt(iZzt3);
                            zzsVar6.zzu(iZzt4);
                            zzsVar6.zzv(i53);
                            zzsVar6.zzw(i52);
                            zzsVar6.zzz(fZzH);
                            c9 = c16;
                            zzsVar6.zzy(c9);
                            zzsVar6.zzA(bArrCopyOfRange);
                            zzsVar6.zzB(i99);
                            zzsVar6.zzp(listZzj);
                            zzsVar6.zzo(i51);
                            zzsVar6.zzD(i50);
                            zzsVar6.zzq(zzpVar2);
                            strZzc = str8;
                            zzsVar6.zze(strZzc);
                            zzg zzgVar = new zzg();
                            zzgVar.zza(i48);
                            zzgVar.zzb(i96);
                            zzgVar.zzc(iZzc);
                            zzgVar.zzd(byteBufferZzm != null ? byteBufferZzm.array() : null);
                            zzgVar.zze(i97);
                            zzgVar.zzf(i98);
                            zzsVar6.zzC(zzgVar.zzg());
                            if (zzahnVarZzq != null) {
                                zzsVar6.zzh(zzgne.zzb(zzahnVarZzq.zza()));
                                zzsVar6.zzi(zzgne.zzb(zzahnVarZzq.zzb()));
                            } else if (zzahpVar != null) {
                                zzsVar6.zzh(zzgne.zzb(zzahpVar.zzc()));
                                zzsVar6.zzi(zzgne.zzb(zzahpVar.zzd()));
                            }
                            zzahuVar2 = zzahuVar3;
                            zzahuVar2.zzb = zzsVar6.zzM();
                        }
                        zzefVar3.zzh(iZzg3 + i39);
                        i38 = i40 + 1;
                        strZzc = strZzc;
                        c9 = c9;
                        zzahuVar2 = zzahuVar2;
                        str = str;
                        i29 = r44;
                        sZzv2 = sZzv2;
                        sZzv = sZzv;
                        iZzt = i14;
                        jZzt2 = j9;
                        iZzB6 = i41;
                        jZzz2 = jZzz2;
                        arrayList = arrayList;
                        zzetVar3 = r45;
                        c13 = 0;
                        i33 = i33;
                    }
                    String str13 = str;
                    i9 = i29;
                    zzet zzetVar4 = zzetVar3;
                    zzahu zzahuVar4 = zzahuVar2;
                    long j13 = jZzz2;
                    arrayList2 = arrayList;
                    i10 = i33;
                    i11 = 8;
                    i12 = 4;
                    int i100 = iZzt;
                    long j14 = jZzt2;
                    if (z7) {
                        zzetVar2 = zzetVar4;
                    } else {
                        zzetVar2 = zzetVar4;
                        zzet zzetVarZzd4 = zzetVar2.zzd(1701082227);
                        if (zzetVarZzd4 != null && (pairZzn = zzn(zzetVarZzd4)) != null) {
                            long[] jArr3 = (long[]) pairZzn.first;
                            jArr2 = (long[]) pairZzn.second;
                            jArr = jArr3;
                        }
                        zzuVarZzM = zzahuVar4.zzb;
                        if (zzuVarZzM == null) {
                            zzaisVar = null;
                        } else {
                            if (i100 != 0) {
                                zzesVar = new zzes(i100);
                                zzs zzsVarZza = zzuVarZzM.zza();
                                zzaoVar = zzuVarZzM.zzl;
                                if (zzaoVar != null) {
                                    zzaoVar2 = zzaoVar.zzd(zzesVar);
                                } else {
                                    zzaoVar2 = new zzao(-9223372036854775807L, zzesVar);
                                }
                                zzsVarZza.zzk(zzaoVar2);
                                zzuVarZzM = zzsVarZza.zzM();
                            }
                            zzaisVar = new zzais(iZzB, i30, zzahr.zza(j13, j14, str13), j8, jZzt, zzahr.zzb(j13, j14, str13), zzuVarZzM, zzahuVar4.zzd, zzahuVar4.zza, zzahuVar4.zzc, jArr, jArr2);
                        }
                    }
                    jArr = null;
                    jArr2 = null;
                    zzuVarZzM = zzahuVar4.zzb;
                    if (zzuVarZzM == null) {
                        zzaisVar = null;
                    } else {
                        if (i100 != 0) {
                            zzesVar = new zzes(i100);
                            zzs zzsVarZza2 = zzuVarZzM.zza();
                            zzaoVar = zzuVarZzM.zzl;
                            if (zzaoVar != null) {
                                zzaoVar2 = zzaoVar.zzd(zzesVar);
                            } else {
                                zzaoVar2 = new zzao(-9223372036854775807L, zzesVar);
                            }
                            zzsVarZza2.zzk(zzaoVar2);
                            zzuVarZzM = zzsVarZza2.zzM();
                        }
                        zzaisVar = new zzais(iZzB, i30, zzahr.zza(j13, j14, str13), j8, jZzt, zzahr.zzb(j13, j14, str13), zzuVarZzM, zzahuVar4.zzd, zzahuVar4.zza, zzahuVar4.zzc, jArr, jArr2);
                    }
                }
                zzais zzaisVar2 = (zzais) zzggrVar.apply(zzaisVar);
                if (zzaisVar2 != null) {
                    i24 = 1835297121;
                    zzet zzetVarZzd5 = zzetVar2.zzd(1835297121);
                    zzetVarZzd5.getClass();
                    zzet zzetVarZzd6 = zzetVarZzd5.zzd(1835626086);
                    zzetVarZzd6.getClass();
                    zzet zzetVarZzd7 = zzetVarZzd6.zzd(1937007212);
                    zzetVarZzd7.getClass();
                    c12 = 0;
                    zzaiv zzaivVarZzg = zzg(zzaisVar2, zzetVarZzd7, zzadkVar, false);
                    arrayList3 = arrayList2;
                    arrayList3.add(zzaivVarZzg);
                } else {
                    arrayList3 = arrayList2;
                    i24 = 1835297121;
                    c12 = 0;
                }
            }
            i25 = i24;
            c13 = c12;
            i26 = i10;
            i28 = i11;
            str5 = str5;
            i27 = i12;
            i29 = i9 + 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    public static zzao zzc(zzeu zzeuVar) {
        int iZzF;
        zzef zzefVar = zzeuVar.zza;
        zzefVar.zzh(8);
        zzao zzaoVar = new zzao(-9223372036854775807L, new zzan[0]);
        while (zzefVar.zzd() >= 8) {
            int iZzg = zzefVar.zzg();
            int iZzB = zzefVar.zzB() + iZzg;
            int iZzB2 = zzefVar.zzB();
            zzao zzaoVar2 = null;
            if (iZzB2 == 1835365473) {
                zzefVar.zzh(iZzg);
                zzefVar.zzk(8);
                zzf(zzefVar);
                while (zzefVar.zzg() < iZzB) {
                    int iZzg2 = zzefVar.zzg();
                    int iZzB3 = zzefVar.zzB() + iZzg2;
                    if (zzefVar.zzB() == 1768715124) {
                        zzefVar.zzh(iZzg2);
                        zzefVar.zzk(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzefVar.zzg() < iZzB3) {
                            zzan zzanVarZzc = zzaih.zzc(zzefVar);
                            if (zzanVarZzc != null) {
                                arrayList.add(zzanVarZzc);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzaoVar2 = new zzao(arrayList);
                            break;
                        }
                        break;
                    }
                    zzefVar.zzh(iZzB3);
                }
                zzaoVar = zzaoVar.zzc(zzaoVar2);
            } else if (iZzB2 == 1936553057) {
                zzefVar.zzh(iZzg);
                zzefVar.zzk(12);
                while (zzefVar.zzg() < iZzB) {
                    int iZzg3 = zzefVar.zzg();
                    int iZzB4 = zzefVar.zzB();
                    if (zzefVar.zzB() == 1935766900) {
                        if (iZzB4 < 16) {
                            break;
                        }
                        zzefVar.zzk(4);
                        int i7 = -1;
                        int i8 = 0;
                        for (int i9 = 0; i9 < 2; i9++) {
                            int iZzs = zzefVar.zzs();
                            int iZzs2 = zzefVar.zzs();
                            if (iZzs == 0) {
                                i7 = iZzs2;
                            } else if (iZzs == 1) {
                                i8 = iZzs2;
                            }
                        }
                        if (i7 == 12) {
                            iZzF = 240;
                        } else if (i7 == 13) {
                            iZzF = 120;
                        } else if (i7 == 21 && zzefVar.zzd() >= 8 && zzefVar.zzg() + 8 <= iZzB) {
                            int iZzB5 = zzefVar.zzB();
                            int iZzB6 = zzefVar.zzB();
                            if (iZzB5 < 12 || iZzB6 != 1936877170) {
                                iZzF = -2147483647;
                            } else {
                                iZzF = zzefVar.zzF();
                            }
                        } else {
                            iZzF = -2147483647;
                        }
                        if (iZzF == -2147483647) {
                            break;
                        }
                        zzaoVar2 = new zzao(-9223372036854775807L, new zzagr(iZzF, i8));
                        break;
                    }
                    zzefVar.zzh(iZzg3 + iZzB4);
                }
                zzaoVar = zzaoVar.zzc(zzaoVar2);
            } else if (iZzB2 == -1451722374) {
                zzaoVar = zzaoVar.zzc(zzh(zzefVar));
            }
            zzefVar.zzh(iZzB);
        }
        return zzaoVar;
    }

    public static zzex zzd(zzef zzefVar) {
        long jZzD;
        long jZzD2;
        zzefVar.zzh(8);
        if (zza(zzefVar.zzB()) == 0) {
            jZzD = zzefVar.zzz();
            jZzD2 = zzefVar.zzz();
        } else {
            jZzD = zzefVar.zzD();
            jZzD2 = zzefVar.zzD();
        }
        return new zzex(jZzD, jZzD2, zzefVar.zzz());
    }

    public static zzao zze(zzet zzetVar) {
        zzer zzerVar;
        zzeu zzeuVarZzc = zzetVar.zzc(1751411826);
        zzeu zzeuVarZzc2 = zzetVar.zzc(1801812339);
        zzeu zzeuVarZzc3 = zzetVar.zzc(1768715124);
        if (zzeuVarZzc != null && zzeuVarZzc2 != null && zzeuVarZzc3 != null && zzi(zzeuVarZzc.zza) == 1835299937) {
            zzef zzefVar = zzeuVarZzc2.zza;
            zzefVar.zzh(12);
            int iZzB = zzefVar.zzB();
            String[] strArr = new String[iZzB];
            for (int i7 = 0; i7 < iZzB; i7++) {
                int iZzB2 = zzefVar.zzB();
                zzefVar.zzk(4);
                strArr[i7] = zzefVar.zzK(iZzB2 - 8, StandardCharsets.UTF_8);
            }
            zzef zzefVar2 = zzeuVarZzc3.zza;
            zzefVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzefVar2.zzd() > 8) {
                int iZzg = zzefVar2.zzg() + zzefVar2.zzB();
                int iZzB3 = zzefVar2.zzB() - 1;
                if (iZzB3 < 0 || iZzB3 >= iZzB) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzB3).length() + 41);
                    sb.append("Skipped metadata with unknown key index: ");
                    sb.append(iZzB3);
                    zzds.zzc("BoxParsers", sb.toString());
                } else {
                    String str = strArr[iZzB3];
                    while (true) {
                        int iZzg2 = zzefVar2.zzg();
                        if (iZzg2 >= iZzg) {
                            zzerVar = null;
                            break;
                        }
                        int iZzB4 = zzefVar2.zzB();
                        if (zzefVar2.zzB() == 1684108385) {
                            int iZzB5 = zzefVar2.zzB();
                            int iZzB6 = zzefVar2.zzB();
                            int i8 = iZzB4 - 16;
                            byte[] bArr = new byte[i8];
                            zzefVar2.zzm(bArr, 0, i8);
                            zzerVar = new zzer(str, bArr, iZzB6, iZzB5);
                            break;
                        }
                        zzefVar2.zzh(iZzg2 + iZzB4);
                    }
                    if (zzerVar != null) {
                        arrayList.add(zzerVar);
                    }
                }
                zzefVar2.zzh(iZzg);
            }
            if (!arrayList.isEmpty()) {
                return new zzao(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzef zzefVar) {
        int iZzg = zzefVar.zzg();
        zzefVar.zzk(4);
        if (zzefVar.zzB() != 1751411826) {
            iZzg += 4;
        }
        zzefVar.zzh(iZzg);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:145:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:150:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:152:0x0407  */
    /* JADX WARN: Code duplicated, block: B:154:0x0413  */
    /* JADX WARN: Code duplicated, block: B:156:0x0417  */
    /* JADX WARN: Code duplicated, block: B:180:0x04c8 A[PHI: r29
      0x04c8: PHI (r29v8 long) = (r29v0 long), (r29v0 long), (r29v10 long), (r29v10 long), (r29v10 long), (r29v10 long) binds: [B:155:0x0415, B:157:0x0419, B:159:0x044f, B:161:0x0455, B:163:0x045b, B:165:0x0462] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:181:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:183:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:193:0x0520  */
    /* JADX WARN: Code duplicated, block: B:194:0x0522  */
    /* JADX WARN: Code duplicated, block: B:198:0x0537  */
    /* JADX WARN: Code duplicated, block: B:200:0x0542  */
    /* JADX WARN: Code duplicated, block: B:203:0x056e  */
    /* JADX WARN: Code duplicated, block: B:207:0x057c  */
    /* JADX WARN: Code duplicated, block: B:210:0x0584  */
    /* JADX WARN: Code duplicated, block: B:214:0x0594  */
    /* JADX WARN: Code duplicated, block: B:216:0x0599  */
    /* JADX WARN: Code duplicated, block: B:220:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:222:0x05ae A[LOOP:8: B:218:0x059d->B:222:0x05ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:226:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:229:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:233:0x05da  */
    /* JADX WARN: Code duplicated, block: B:234:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:237:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:238:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:240:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:242:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:244:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:245:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:247:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:248:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:252:0x0607  */
    /* JADX WARN: Code duplicated, block: B:254:0x0611  */
    /* JADX WARN: Code duplicated, block: B:255:0x0621  */
    /* JADX WARN: Code duplicated, block: B:258:0x062b  */
    /* JADX WARN: Code duplicated, block: B:260:0x064f  */
    /* JADX WARN: Code duplicated, block: B:262:0x0654  */
    /* JADX WARN: Code duplicated, block: B:265:0x0661  */
    /* JADX WARN: Code duplicated, block: B:272:0x069d  */
    /* JADX WARN: Code duplicated, block: B:273:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:291:0x057a A[ADDED_TO_REGION, EDGE_INSN: B:291:0x057a->B:206:0x057a BREAK  A[LOOP:6: B:201:0x056a->B:205:0x0574], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x0592 A[ADDED_TO_REGION, EDGE_INSN: B:293:0x0592->B:213:0x0592 BREAK  A[LOOP:7: B:208:0x057e->B:212:0x058c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x05b1 A[EDGE_INSN: B:295:0x05b1->B:223:0x05b1 BREAK  A[LOOP:8: B:218:0x059d->B:222:0x05ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x05b1 A[EDGE_INSN: B:296:0x05b1->B:223:0x05b1 BREAK  A[LOOP:8: B:218:0x059d->B:222:0x05ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0667 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r34v10 */
    /* JADX WARN: Type inference failed for: r34v11 */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r34v9 */
    public static zzaiv zzg(zzais zzaisVar, zzet zzetVar, zzadk zzadkVar, boolean z7) throws zzas {
        zzahs zzahwVar;
        boolean z8;
        int iZzH;
        int iZzH2;
        int iZzH3;
        int i7;
        int i8;
        int i9;
        zzais zzaisVarZzb;
        int i10;
        int[] iArr;
        int[] iArr2;
        long j7;
        long j8;
        long[] jArr;
        long[] jArr2;
        long j9;
        long j10;
        long jZzt;
        long[] jArr3;
        long[] jArr4;
        long j11;
        int i11;
        long[] jArr5;
        long j12;
        zzais zzaisVar2;
        int length;
        int i12;
        long j13;
        long j14;
        int i13;
        boolean z9;
        long[] jArr6;
        int[] iArr3;
        int[] iArr4;
        int i14;
        int i15;
        boolean z10;
        int i16;
        long[] jArr7;
        int[] iArr5;
        int i17;
        boolean z11;
        boolean z12;
        long[] jArr8;
        int[] iArr6;
        int i18;
        int[] iArr7;
        long[] jArr9;
        int i19;
        boolean z13;
        int i20;
        int i21;
        long j15;
        boolean z14;
        zzais zzaisVarZzb2;
        long j16;
        int i22;
        int i23;
        boolean z15;
        int[] iArr8;
        boolean z16;
        long jZzt2;
        boolean z17;
        long j17;
        long j18;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z18;
        int i28;
        int i29;
        int length2;
        long jZzt3;
        long[] jArr10;
        int[] iArrCopyOf;
        long[] jArr11;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        ?? r34;
        int i36;
        zzais zzaisVarZzb3 = zzaisVar;
        zzeu zzeuVarZzc = zzetVar.zzc(1937011578);
        if (zzeuVarZzc != null) {
            zzahwVar = new zzahv(zzeuVarZzc, zzaisVarZzb3.zzg);
        } else {
            zzeu zzeuVarZzc2 = zzetVar.zzc(1937013298);
            if (zzeuVarZzc2 == null) {
                throw zzas.zzb("Track has no sample table size information", null);
            }
            zzahwVar = new zzahw(zzeuVarZzc2);
        }
        int iZza = zzahwVar.zza();
        if (iZza == 0) {
            return new zzaiv(zzaisVarZzb3, new long[0], new int[0], 0, new long[0], new int[0], 0L, 0);
        }
        if (zzaisVarZzb3.zzb == 2) {
            long j19 = zzaisVarZzb3.zzf;
            if (j19 > 0) {
                zzs zzsVarZza = zzaisVarZzb3.zzg.zza();
                zzsVarZza.zzx(iZza / (j19 / 1000000.0f));
                zzaisVarZzb3 = zzaisVarZzb3.zzb(zzsVarZza.zzM());
            }
        }
        zzeu zzeuVarZzc3 = zzetVar.zzc(1937007471);
        if (zzeuVarZzc3 == null) {
            zzeuVarZzc3 = zzetVar.zzc(1668232756);
            zzeuVarZzc3.getClass();
            z8 = true;
        } else {
            z8 = false;
        }
        zzeu zzeuVarZzc4 = zzetVar.zzc(1937011555);
        zzeuVarZzc4.getClass();
        zzef zzefVar = zzeuVarZzc4.zza;
        zzeu zzeuVarZzc5 = zzetVar.zzc(1937011827);
        zzeuVarZzc5.getClass();
        zzef zzefVar2 = zzeuVarZzc5.zza;
        zzeu zzeuVarZzc6 = zzetVar.zzc(1937011571);
        zzef zzefVar3 = zzeuVarZzc6 != null ? zzeuVarZzc6.zza : null;
        zzeu zzeuVarZzc7 = zzetVar.zzc(1668576371);
        zzef zzefVar4 = zzeuVarZzc7 != null ? zzeuVarZzc7.zza : null;
        zzaho zzahoVar = new zzaho(zzefVar, zzeuVarZzc3.zza, z8);
        zzefVar2.zzh(12);
        int iZzH4 = zzefVar2.zzH() - 1;
        int iZzH5 = zzefVar2.zzH();
        int iZzH6 = zzefVar2.zzH();
        if (zzefVar4 != null) {
            zzefVar4.zzh(12);
            iZzH = zzefVar4.zzH();
        } else {
            iZzH = 0;
        }
        if (zzefVar3 != null) {
            zzefVar3.zzh(12);
            iZzH3 = zzefVar3.zzH();
            if (iZzH3 > 0) {
                iZzH2 = zzefVar3.zzH() - 1;
                i7 = 0;
            } else {
                iZzH2 = -1;
                i7 = 0;
                zzefVar3 = null;
            }
        } else {
            iZzH2 = -1;
            iZzH3 = 0;
            i7 = 0;
        }
        int iZzb = zzahwVar.zzb();
        zzu zzuVar = zzaisVarZzb3.zzg;
        if (iZzb != -1) {
            String str = zzuVar.zzo;
            i8 = 1;
            if (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iZzH4 == 0) {
                if (iZzH == 0 && iZzH3 == 0) {
                    int i37 = zzahoVar.zza;
                    long[] jArr12 = new long[i37];
                    int[] iArr9 = new int[i37];
                    while (zzahoVar.zza()) {
                        int i38 = zzahoVar.zzb;
                        jArr12[i38] = zzahoVar.zzd;
                        iArr9[i38] = zzahoVar.zzc;
                    }
                    long j20 = iZzH6;
                    int i39 = 8192 / iZzb;
                    int i40 = i7;
                    int i41 = i40;
                    while (i40 < i37) {
                        int i42 = iArr9[i40];
                        String str2 = zzeo.zza;
                        i41 += ((i42 + i39) - 1) / i39;
                        i40++;
                    }
                    long[] jArr13 = new long[i41];
                    iArr = new int[i41];
                    long[] jArr14 = new long[i41];
                    iArr2 = new int[i41];
                    int i43 = i7;
                    int i44 = i43;
                    int i45 = i44;
                    i9 = i45;
                    int i46 = i9;
                    while (i45 < i37) {
                        int i47 = iArr9[i45];
                        long j21 = jArr12[i45];
                        int i48 = i46;
                        int i49 = i37;
                        int iMax = i9;
                        int i50 = i48;
                        int i51 = i44;
                        int i52 = i47;
                        while (i52 > 0) {
                            int iMin = Math.min(i39, i52);
                            jArr13[i50] = j21;
                            int i53 = i52;
                            int i54 = iZzb * iMin;
                            iArr[i50] = i54;
                            int i55 = i51 + i54;
                            iMax = Math.max(iMax, i54);
                            jArr14[i50] = ((long) i43) * j20;
                            iArr2[i50] = 1;
                            j21 += (long) iArr[i50];
                            i43 += iMin;
                            i52 = i53 - iMin;
                            i50++;
                            iZzb = iZzb;
                            i51 = i55;
                            i39 = i39;
                        }
                        i45++;
                        int i56 = i50;
                        i9 = iMax;
                        i37 = i49;
                        i46 = i56;
                        i44 = i51;
                    }
                    long j22 = j20 * ((long) i43);
                    j8 = i44;
                    zzaisVarZzb = zzaisVarZzb3;
                    jArr = jArr14;
                    i10 = iZza;
                    jArr2 = jArr13;
                    j7 = j22;
                } else {
                    iZzH4 = i7;
                }
            }
            j9 = zzaisVarZzb.zzf;
            if (j9 > 0) {
                jZzt3 = zzeo.zzt(j8 * 8, 1000000L, j9, RoundingMode.HALF_DOWN);
                if (jZzt3 > 0 && jZzt3 < 2147483647L) {
                    zzs zzsVarZza2 = zzuVar.zza();
                    zzsVarZza2.zzh((int) jZzt3);
                    zzaisVarZzb = zzaisVarZzb.zzb(zzsVarZza2.zzM());
                }
            }
            j10 = zzaisVarZzb.zzc;
            RoundingMode roundingMode = RoundingMode.DOWN;
            jZzt = zzeo.zzt(j7, 1000000L, j10, roundingMode);
            jArr3 = zzaisVarZzb.zzi;
            if (jArr3 == null) {
                zzeo.zzu(jArr, 1000000L, j10);
                return new zzaiv(zzaisVarZzb, jArr2, iArr, i9, jArr, iArr2, jZzt, i10);
            }
            jArr4 = jArr2;
            j11 = j10;
            i11 = i9;
            jArr5 = jArr;
            j12 = j7;
            zzaisVar2 = zzaisVarZzb;
            length = jArr3.length;
            i12 = 1;
            if (length == 1) {
                if (zzaisVar2.zzb == 1 || (length2 = jArr5.length) < 2) {
                    j11 = j11;
                    j11 = j11;
                    j11 = j11;
                    j11 = j11;
                    j13 = j11;
                } else {
                    long[] jArr15 = zzaisVar2.zzj;
                    jArr15.getClass();
                    long j23 = jArr15[i7];
                    long j24 = jArr3[i7];
                    long j25 = zzaisVar2.zzd;
                    long jZzt4 = j23 + zzeo.zzt(j24, j11, j25, roundingMode);
                    int i57 = length2 - 1;
                    int i58 = i7;
                    int iMax2 = Math.max(i58, Math.min(4, i57));
                    int iMax3 = Math.max(i58, Math.min(length2 - 4, i57));
                    if (jArr5[i58] > j23 || j23 >= jArr5[iMax2] || jArr5[iMax3] >= jZzt4 || jZzt4 > 2 + j12) {
                        j11 = j11;
                        j11 = j11;
                        j11 = j11;
                        j11 = j11;
                        j13 = j11;
                    } else {
                        long jMax = Math.max(0L, j12 - jZzt4);
                        long j26 = j23 - jArr5[0];
                        long j27 = zzaisVar2.zzg.zzH;
                        long jZzt5 = zzeo.zzt(j26, j27, j11, roundingMode);
                        long jZzt6 = zzeo.zzt(jMax, j27, j11, roundingMode);
                        j13 = j11;
                        if (jZzt5 != 0) {
                            j11 = j11;
                            if (jZzt5 <= 2147483647L && jZzt6 <= 2147483647L) {
                                zzadkVar.zza = (int) jZzt5;
                                zzadkVar.zzb = (int) jZzt6;
                                zzeo.zzu(jArr5, 1000000L, j13);
                                return new zzaiv(zzaisVar2, jArr4, iArr, i11, jArr5, iArr2, zzeo.zzt(jArr3[0], 1000000L, j25, roundingMode), i10);
                            }
                        } else if (jZzt6 != 0) {
                            j11 = j11;
                            jZzt5 = 0;
                            j11 = j11;
                            if (jZzt5 <= 2147483647L) {
                                zzadkVar.zza = (int) jZzt5;
                                zzadkVar.zzb = (int) jZzt6;
                                zzeo.zzu(jArr5, 1000000L, j13);
                                return new zzaiv(zzaisVar2, jArr4, iArr, i11, jArr5, iArr2, zzeo.zzt(jArr3[0], 1000000L, j25, roundingMode), i10);
                            }
                        }
                        j11 = j11;
                    }
                }
                length = 1;
                i12 = 1;
            } else {
                j12 = j12;
                jArr4 = jArr4;
                iArr2 = iArr2;
                iArr = iArr;
                j13 = j11;
            }
            if (length != i12 && jArr3[0] == 0) {
                long[] jArr16 = zzaisVar2.zzj;
                jArr16.getClass();
                long j28 = jArr16[0];
                int i59 = 0;
                while (i59 < jArr5.length) {
                    long j29 = j13;
                    jArr5[i59] = zzeo.zzt(jArr5[i59] - j28, 1000000L, j29, RoundingMode.DOWN);
                    i59++;
                    j13 = j29;
                }
                return new zzaiv(zzaisVar2, jArr4, iArr, i11, jArr5, iArr2, zzeo.zzt(j12 - j28, 1000000L, j13, RoundingMode.DOWN), i10);
            }
            j14 = j13;
            i13 = zzaisVar2.zzb;
            if (i13 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            jArr6 = zzaisVar2.zzj;
            iArr3 = new int[length];
            iArr4 = new int[length];
            jArr6.getClass();
            i14 = 0;
            i15 = 0;
            z10 = false;
            i16 = 0;
            while (i16 < jArr3.length) {
                int[] iArr10 = iArr;
                int i60 = i11;
                j17 = jArr6[i16];
                if (j17 != -1) {
                    long j30 = j14;
                    long jZzt7 = zzeo.zzt(jArr3[i16], j30, zzaisVar2.zzd, RoundingMode.DOWN);
                    j14 = j30;
                    iArr3[i16] = zzeo.zzm(jArr5, j17, true, true);
                    j18 = j17 + jZzt7;
                    iArr4[i16] = zzeo.zzo(jArr5, j18, z9, false);
                    i24 = iArr3[i16];
                    while (true) {
                        i25 = iArr3[i16];
                        if (i25 >= 0 || (iArr2[i25] & 1) != 0) {
                            break;
                        }
                        iArr3[i16] = i25 - 1;
                    }
                    if (i25 < 0) {
                        iArr3[i16] = i24;
                        while (true) {
                            i26 = iArr3[i16];
                            if (i26 < iArr4[i16] || (iArr2[i26] & 1) != 0) {
                                break;
                            }
                            iArr3[i16] = i26 + 1;
                        }
                    } else {
                        i26 = i25;
                    }
                    if (i13 == 2 && i26 != iArr4[i16]) {
                        while (true) {
                            i28 = iArr4[i16];
                            if (i28 >= jArr5.length - 1) {
                                break;
                            }
                            i29 = i28 + 1;
                            if (jArr5[i29] > j18) {
                                break;
                            }
                            iArr4[i16] = i29;
                        }
                    }
                    int i61 = iArr4[i16];
                    i27 = iArr3[i16];
                    i15 += i61 - i27;
                    if (i14 != i27) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z10 = z18 | z10;
                    i14 = i61;
                }
                i16++;
                i11 = i60;
                iArr = iArr10;
                jArr3 = jArr3;
            }
            jArr7 = jArr3;
            iArr5 = iArr;
            i17 = i11;
            if (i15 != i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | z10;
            if (z12) {
                jArr8 = new long[i15];
            } else {
                jArr8 = jArr4;
            }
            if (z12) {
                iArr6 = new int[i15];
            } else {
                iArr6 = iArr5;
            }
            if (true == z12) {
                i18 = 0;
            } else {
                i18 = i17;
            }
            if (z12) {
                iArr7 = new int[i15];
            } else {
                iArr7 = iArr2;
            }
            jArr9 = new long[i15];
            i19 = i18;
            z13 = false;
            i20 = 0;
            i21 = 0;
            j15 = 0;
            while (i21 < jArr7.length) {
                j16 = jArr6[i21];
                i22 = iArr3[i21];
                i23 = iArr4[i21];
                z15 = z12;
                if (z12) {
                    int i62 = i23 - i22;
                    System.arraycopy(jArr4, i22, jArr8, i20, i62);
                    iArr8 = iArr5;
                    System.arraycopy(iArr8, i22, iArr6, i20, i62);
                    System.arraycopy(iArr2, i22, iArr7, i20, i62);
                } else {
                    iArr8 = iArr5;
                }
                z16 = z13;
                int i63 = i19;
                while (i22 < i23) {
                    int[] iArr11 = iArr8;
                    int[] iArr12 = iArr7;
                    long j31 = zzaisVar2.zzd;
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    long jZzt8 = zzeo.zzt(j15, 1000000L, j31, roundingMode2);
                    jZzt2 = zzeo.zzt(jArr5[i22] - j16, 1000000L, j14, roundingMode2);
                    if (jZzt2 < 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    boolean z19 = (!z17) | z16;
                    jArr9[i20] = jZzt8 + jZzt2;
                    if (!z15 && iArr6[i20] > i63) {
                        i63 = iArr11[i22];
                    }
                    i20++;
                    i22++;
                    iArr7 = iArr12;
                    z16 = z19;
                    iArr8 = iArr11;
                }
                int[] iArr13 = iArr8;
                j15 += jArr7[i21];
                i21++;
                z13 = z16;
                i19 = i63;
                iArr7 = iArr7;
                iArr5 = iArr13;
                z12 = z15;
            }
            z14 = z13;
            int[] iArr14 = iArr7;
            long jZzt9 = zzeo.zzt(j15, 1000000L, zzaisVar2.zzd, RoundingMode.DOWN);
            if (z14) {
                zzs zzsVarZza3 = zzaisVar2.zzg.zza();
                zzsVarZza3.zzs(true);
                zzaisVarZzb2 = zzaisVar2.zzb(zzsVarZza3.zzM());
            } else {
                zzaisVarZzb2 = zzaisVar2;
            }
            return new zzaiv(zzaisVarZzb2, jArr8, iArr6, i19, jArr9, iArr14, jZzt9, jArr8.length);
        }
        i8 = 1;
        long[] jArr17 = new long[iZza];
        int[] iArr15 = new int[iZza];
        long[] jArr18 = new long[iZza];
        zzef zzefVar5 = zzefVar4;
        int[] iArrCopyOf2 = new int[iZza];
        zzef zzefVar6 = zzefVar3;
        zzahs zzahsVar = zzahwVar;
        int i64 = iZzH3;
        int i65 = iZzH4;
        long j32 = 0;
        long j33 = 0;
        int i66 = iZzH;
        int iZzH7 = iZzH2;
        int i67 = i7;
        int iZzB = i67;
        int i68 = iZzB;
        int i69 = i68;
        int iZzH8 = i69;
        long j34 = 0;
        while (true) {
            if (i67 >= iZza) {
                zzaisVarZzb = zzaisVarZzb3;
                jArr10 = jArr17;
                iArrCopyOf = iArr15;
                jArr11 = jArr18;
                break;
            }
            ?? r35 = i8;
            while (true) {
                if (i69 != 0) {
                    zzaisVarZzb = zzaisVarZzb3;
                    i35 = i69;
                    r34 = r35;
                    break;
                }
                boolean zZza = zzahoVar.zza();
                zzaisVarZzb = zzaisVarZzb3;
                if (!zZza) {
                    i35 = i7;
                    r34 = zZza;
                    break;
                }
                j34 = zzahoVar.zzd;
                i69 = zzahoVar.zzc;
                zzaisVarZzb3 = zzaisVarZzb;
                r35 = zZza;
            }
            if (r34 == 0) {
                zzds.zzc("BoxParsers", "Unexpected end of chunk data");
                long[] jArrCopyOf = Arrays.copyOf(jArr17, i67);
                iArrCopyOf = Arrays.copyOf(iArr15, i67);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr18, i67);
                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i67);
                jArr10 = jArrCopyOf;
                jArr11 = jArrCopyOf2;
                iZza = i67;
                break;
            }
            if (zzefVar5 != null) {
                int i70 = i66;
                while (iZzH8 == 0) {
                    if (i70 <= 0) {
                        iZzH8 = i7;
                        break;
                    }
                    i70--;
                    iZzH8 = zzefVar5.zzH();
                    iZzB = zzefVar5.zzB();
                }
                iZzH8--;
                i66 = i70;
            }
            int iZzc = zzahsVar.zzc();
            int[] iArr16 = iArrCopyOf2;
            int i71 = i35;
            long j35 = iZzc;
            j33 += j35;
            if (iZzc > i68) {
                i68 = iZzc;
            }
            jArr17[i67] = j34;
            iArr15[i67] = iZzc;
            jArr18[i67] = j32 + ((long) iZzB);
            iArr16[i67] = zzefVar6 == null ? i8 : i7;
            if (i67 == iZzH7) {
                iArr16[i67] = i8;
            }
            if (zzefVar6 == null || i67 != iZzH7) {
                i36 = i64;
            } else {
                i36 = i64 - 1;
                if (i36 > 0) {
                    iZzH7 = zzefVar6.zzH() - 1;
                }
            }
            j32 += (long) iZzH6;
            iZzH5--;
            if (iZzH5 == 0) {
                if (i65 > 0) {
                    i65--;
                    iZzH5 = zzefVar2.zzH();
                    iZzH6 = zzefVar2.zzB();
                } else {
                    iZzH5 = i7;
                }
            }
            j34 += j35;
            i69 = i71 - 1;
            i67++;
            i64 = i36;
            iArrCopyOf2 = iArr16;
            zzaisVarZzb3 = zzaisVarZzb;
        }
        long j36 = j32 + ((long) iZzB);
        if (zzefVar5 == null) {
            i30 = i8;
            break;
        }
        while (true) {
            if (i66 <= 0) {
                i30 = i8;
                break;
            }
            if (zzefVar5.zzH() != 0) {
                i30 = i7;
                break;
            }
            zzefVar5.zzB();
            i66--;
        }
        if (i64 == 0) {
            if (iZzH5 == 0) {
                if (i69 != 0) {
                    i34 = i7;
                    iZzH5 = i34;
                } else if (i65 != 0) {
                    iArrCopyOf2 = iArrCopyOf2;
                    i30 = i30;
                    i34 = i7;
                    i31 = i34;
                    iZzH5 = i31;
                    i32 = i65;
                    i33 = iZzH8;
                } else if (iZzH8 != 0) {
                    iArrCopyOf2 = iArrCopyOf2;
                    i30 = i30;
                    i34 = i7;
                    i31 = i34;
                    i32 = i31;
                    iZzH5 = i32;
                    i33 = iZzH8;
                } else if (i30 == 0) {
                    iArrCopyOf2 = iArrCopyOf2;
                    i34 = i7;
                    i31 = i34;
                    i32 = i31;
                    i33 = i32;
                    i30 = i33;
                    iZzH5 = i30;
                } else {
                    iArrCopyOf2 = iArrCopyOf2;
                    zzaisVarZzb = zzaisVarZzb;
                }
                iArr2 = iArrCopyOf2;
                iArr = iArrCopyOf;
                i9 = i68;
                jArr = jArr11;
                j8 = j33;
                i10 = iZza;
                j7 = j36;
                jArr2 = jArr10;
                j9 = zzaisVarZzb.zzf;
                if (j9 > 0) {
                    jZzt3 = zzeo.zzt(j8 * 8, 1000000L, j9, RoundingMode.HALF_DOWN);
                    if (jZzt3 > 0) {
                        zzs zzsVarZza4 = zzuVar.zza();
                        zzsVarZza4.zzh((int) jZzt3);
                        zzaisVarZzb = zzaisVarZzb.zzb(zzsVarZza4.zzM());
                    }
                }
                j10 = zzaisVarZzb.zzc;
                RoundingMode roundingMode3 = RoundingMode.DOWN;
                jZzt = zzeo.zzt(j7, 1000000L, j10, roundingMode3);
                jArr3 = zzaisVarZzb.zzi;
                if (jArr3 == null) {
                    zzeo.zzu(jArr, 1000000L, j10);
                    return new zzaiv(zzaisVarZzb, jArr2, iArr, i9, jArr, iArr2, jZzt, i10);
                }
                jArr4 = jArr2;
                j11 = j10;
                i11 = i9;
                jArr5 = jArr;
                j12 = j7;
                zzaisVar2 = zzaisVarZzb;
                length = jArr3.length;
                i12 = 1;
                if (length == 1) {
                    if (zzaisVar2.zzb == 1) {
                        j11 = j11;
                        j11 = j11;
                        j11 = j11;
                        j11 = j11;
                        j13 = j11;
                    } else {
                        j11 = j11;
                        j11 = j11;
                        j11 = j11;
                        j11 = j11;
                        j13 = j11;
                    }
                    length = 1;
                    i12 = 1;
                } else {
                    j12 = j12;
                    jArr4 = jArr4;
                    iArr2 = iArr2;
                    iArr = iArr;
                    j13 = j11;
                }
                if (length != i12) {
                }
                j14 = j13;
                i13 = zzaisVar2.zzb;
                if (i13 == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                jArr6 = zzaisVar2.zzj;
                iArr3 = new int[length];
                iArr4 = new int[length];
                jArr6.getClass();
                i14 = 0;
                i15 = 0;
                z10 = false;
                i16 = 0;
                while (i16 < jArr3.length) {
                    int[] iArr17 = iArr;
                    int i610 = i11;
                    j17 = jArr6[i16];
                    if (j17 != -1) {
                        long j37 = j14;
                        long jZzt10 = zzeo.zzt(jArr3[i16], j37, zzaisVar2.zzd, RoundingMode.DOWN);
                        j14 = j37;
                        iArr3[i16] = zzeo.zzm(jArr5, j17, true, true);
                        j18 = j17 + jZzt10;
                        iArr4[i16] = zzeo.zzo(jArr5, j18, z9, false);
                        i24 = iArr3[i16];
                        while (true) {
                            i25 = iArr3[i16];
                            if (i25 >= 0) {
                                break;
                            }
                            break;
                            break;
                            iArr3[i16] = i25 - 1;
                        }
                        if (i25 < 0) {
                            iArr3[i16] = i24;
                            while (true) {
                                i26 = iArr3[i16];
                                if (i26 < iArr4[i16]) {
                                    break;
                                }
                                break;
                                break;
                                iArr3[i16] = i26 + 1;
                            }
                        } else {
                            i26 = i25;
                        }
                        if (i13 == 2) {
                            while (true) {
                                i28 = iArr4[i16];
                                if (i28 >= jArr5.length - 1) {
                                    break;
                                    break;
                                }
                                i29 = i28 + 1;
                                if (jArr5[i29] > j18) {
                                    break;
                                    break;
                                }
                                iArr4[i16] = i29;
                            }
                        }
                        int i611 = iArr4[i16];
                        i27 = iArr3[i16];
                        i15 += i611 - i27;
                        if (i14 != i27) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z10 = z18 | z10;
                        i14 = i611;
                    }
                    i16++;
                    i11 = i610;
                    iArr = iArr17;
                    jArr3 = jArr3;
                }
                jArr7 = jArr3;
                iArr5 = iArr;
                i17 = i11;
                if (i15 != i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | z10;
                if (z12) {
                    jArr8 = new long[i15];
                } else {
                    jArr8 = jArr4;
                }
                if (z12) {
                    iArr6 = new int[i15];
                } else {
                    iArr6 = iArr5;
                }
                if (true == z12) {
                    i18 = 0;
                } else {
                    i18 = i17;
                }
                if (z12) {
                    iArr7 = new int[i15];
                } else {
                    iArr7 = iArr2;
                }
                jArr9 = new long[i15];
                i19 = i18;
                z13 = false;
                i20 = 0;
                i21 = 0;
                j15 = 0;
                while (i21 < jArr7.length) {
                    j16 = jArr6[i21];
                    i22 = iArr3[i21];
                    i23 = iArr4[i21];
                    z15 = z12;
                    if (z12) {
                        int i612 = i23 - i22;
                        System.arraycopy(jArr4, i22, jArr8, i20, i612);
                        iArr8 = iArr5;
                        System.arraycopy(iArr8, i22, iArr6, i20, i612);
                        System.arraycopy(iArr2, i22, iArr7, i20, i612);
                    } else {
                        iArr8 = iArr5;
                    }
                    z16 = z13;
                    int i613 = i19;
                    while (i22 < i23) {
                        int[] iArr18 = iArr8;
                        int[] iArr19 = iArr7;
                        long j38 = zzaisVar2.zzd;
                        RoundingMode roundingMode4 = RoundingMode.DOWN;
                        long jZzt11 = zzeo.zzt(j15, 1000000L, j38, roundingMode4);
                        jZzt2 = zzeo.zzt(jArr5[i22] - j16, 1000000L, j14, roundingMode4);
                        if (jZzt2 < 0) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        boolean z110 = (!z17) | z16;
                        jArr9[i20] = jZzt11 + jZzt2;
                        if (!z15) {
                        }
                        i20++;
                        i22++;
                        iArr7 = iArr19;
                        z16 = z110;
                        iArr8 = iArr18;
                    }
                    int[] iArr110 = iArr8;
                    j15 += jArr7[i21];
                    i21++;
                    z13 = z16;
                    i19 = i613;
                    iArr7 = iArr7;
                    iArr5 = iArr110;
                    z12 = z15;
                }
                z14 = z13;
                int[] iArr111 = iArr7;
                long jZzt12 = zzeo.zzt(j15, 1000000L, zzaisVar2.zzd, RoundingMode.DOWN);
                if (z14) {
                    zzs zzsVarZza5 = zzaisVar2.zzg.zza();
                    zzsVarZza5.zzs(true);
                    zzaisVarZzb2 = zzaisVar2.zzb(zzsVarZza5.zzM());
                } else {
                    zzaisVarZzb2 = zzaisVar2;
                }
                return new zzaiv(zzaisVarZzb2, jArr8, iArr6, i19, jArr9, iArr111, jZzt12, jArr8.length);
            }
            i34 = i7;
            i31 = i69;
            i32 = i65;
            i33 = iZzH8;
        } else {
            iArrCopyOf2 = iArrCopyOf2;
            i30 = i30;
            i31 = i69;
            i32 = i65;
            i33 = iZzH8;
            i34 = i64;
        }
        int i72 = zzaisVarZzb.zza;
        int length3 = String.valueOf(i72).length() + 66 + String.valueOf(i34).length() + 35 + String.valueOf(iZzH5).length() + 26 + String.valueOf(i31).length() + 33 + String.valueOf(i32).length() + 36;
        int length4 = String.valueOf(i33).length();
        String str3 = i8 != i30 ? ", ctts invalid" : "";
        StringBuilder sb = new StringBuilder(length3 + length4 + str3.length());
        sb.append("Inconsistent stbl box for track ");
        sb.append(i72);
        sb.append(": remainingSynchronizationSamples ");
        sb.append(i34);
        sb.append(", remainingSamplesAtTimestampDelta ");
        sb.append(iZzH5);
        sb.append(", remainingSamplesInChunk ");
        sb.append(i31);
        sb.append(", remainingTimestampDeltaChanges ");
        sb.append(i32);
        sb.append(", remainingSamplesAtTimestampOffset ");
        sb.append(i33);
        sb.append(str3);
        zzds.zzc("BoxParsers", sb.toString());
        iArr2 = iArrCopyOf2;
        iArr = iArrCopyOf;
        i9 = i68;
        jArr = jArr11;
        j8 = j33;
        i10 = iZza;
        j7 = j36;
        jArr2 = jArr10;
        j9 = zzaisVarZzb.zzf;
        if (j9 > 0) {
            jZzt3 = zzeo.zzt(j8 * 8, 1000000L, j9, RoundingMode.HALF_DOWN);
            if (jZzt3 > 0) {
                zzs zzsVarZza6 = zzuVar.zza();
                zzsVarZza6.zzh((int) jZzt3);
                zzaisVarZzb = zzaisVarZzb.zzb(zzsVarZza6.zzM());
            }
        }
        j10 = zzaisVarZzb.zzc;
        RoundingMode roundingMode5 = RoundingMode.DOWN;
        jZzt = zzeo.zzt(j7, 1000000L, j10, roundingMode5);
        jArr3 = zzaisVarZzb.zzi;
        if (jArr3 == null) {
            zzeo.zzu(jArr, 1000000L, j10);
            return new zzaiv(zzaisVarZzb, jArr2, iArr, i9, jArr, iArr2, jZzt, i10);
        }
        jArr4 = jArr2;
        j11 = j10;
        i11 = i9;
        jArr5 = jArr;
        j12 = j7;
        zzaisVar2 = zzaisVarZzb;
        length = jArr3.length;
        i12 = 1;
        if (length == 1) {
            if (zzaisVar2.zzb == 1) {
                j11 = j11;
                j11 = j11;
                j11 = j11;
                j11 = j11;
                j13 = j11;
            } else {
                j11 = j11;
                j11 = j11;
                j11 = j11;
                j11 = j11;
                j13 = j11;
            }
            length = 1;
            i12 = 1;
        } else {
            j12 = j12;
            jArr4 = jArr4;
            iArr2 = iArr2;
            iArr = iArr;
            j13 = j11;
        }
        if (length != i12) {
        }
        j14 = j13;
        i13 = zzaisVar2.zzb;
        if (i13 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        jArr6 = zzaisVar2.zzj;
        iArr3 = new int[length];
        iArr4 = new int[length];
        jArr6.getClass();
        i14 = 0;
        i15 = 0;
        z10 = false;
        i16 = 0;
        while (i16 < jArr3.length) {
            int[] iArr112 = iArr;
            int i614 = i11;
            j17 = jArr6[i16];
            if (j17 != -1) {
                long j39 = j14;
                long jZzt13 = zzeo.zzt(jArr3[i16], j39, zzaisVar2.zzd, RoundingMode.DOWN);
                j14 = j39;
                iArr3[i16] = zzeo.zzm(jArr5, j17, true, true);
                j18 = j17 + jZzt13;
                iArr4[i16] = zzeo.zzo(jArr5, j18, z9, false);
                i24 = iArr3[i16];
                while (true) {
                    i25 = iArr3[i16];
                    if (i25 >= 0) {
                        break;
                        break;
                    }
                    break;
                    break;
                    iArr3[i16] = i25 - 1;
                }
                if (i25 < 0) {
                    iArr3[i16] = i24;
                    while (true) {
                        i26 = iArr3[i16];
                        if (i26 < iArr4[i16]) {
                            break;
                            break;
                        }
                        break;
                        break;
                        iArr3[i16] = i26 + 1;
                    }
                } else {
                    i26 = i25;
                }
                if (i13 == 2) {
                    while (true) {
                        i28 = iArr4[i16];
                        if (i28 >= jArr5.length - 1) {
                            break;
                            break;
                        }
                        i29 = i28 + 1;
                        if (jArr5[i29] > j18) {
                            break;
                            break;
                        }
                        iArr4[i16] = i29;
                    }
                }
                int i615 = iArr4[i16];
                i27 = iArr3[i16];
                i15 += i615 - i27;
                if (i14 != i27) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z10 = z18 | z10;
                i14 = i615;
            }
            i16++;
            i11 = i614;
            iArr = iArr112;
            jArr3 = jArr3;
        }
        jArr7 = jArr3;
        iArr5 = iArr;
        i17 = i11;
        if (i15 != i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        z12 = z11 | z10;
        if (z12) {
            jArr8 = new long[i15];
        } else {
            jArr8 = jArr4;
        }
        if (z12) {
            iArr6 = new int[i15];
        } else {
            iArr6 = iArr5;
        }
        if (true == z12) {
            i18 = 0;
        } else {
            i18 = i17;
        }
        if (z12) {
            iArr7 = new int[i15];
        } else {
            iArr7 = iArr2;
        }
        jArr9 = new long[i15];
        i19 = i18;
        z13 = false;
        i20 = 0;
        i21 = 0;
        j15 = 0;
        while (i21 < jArr7.length) {
            j16 = jArr6[i21];
            i22 = iArr3[i21];
            i23 = iArr4[i21];
            z15 = z12;
            if (z12) {
                int i616 = i23 - i22;
                System.arraycopy(jArr4, i22, jArr8, i20, i616);
                iArr8 = iArr5;
                System.arraycopy(iArr8, i22, iArr6, i20, i616);
                System.arraycopy(iArr2, i22, iArr7, i20, i616);
            } else {
                iArr8 = iArr5;
            }
            z16 = z13;
            int i617 = i19;
            while (i22 < i23) {
                int[] iArr113 = iArr8;
                int[] iArr114 = iArr7;
                long j310 = zzaisVar2.zzd;
                RoundingMode roundingMode6 = RoundingMode.DOWN;
                long jZzt14 = zzeo.zzt(j15, 1000000L, j310, roundingMode6);
                jZzt2 = zzeo.zzt(jArr5[i22] - j16, 1000000L, j14, roundingMode6);
                if (jZzt2 < 0) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                boolean z111 = (!z17) | z16;
                jArr9[i20] = jZzt14 + jZzt2;
                if (!z15) {
                }
                i20++;
                i22++;
                iArr7 = iArr114;
                z16 = z111;
                iArr8 = iArr113;
            }
            int[] iArr115 = iArr8;
            j15 += jArr7[i21];
            i21++;
            z13 = z16;
            i19 = i617;
            iArr7 = iArr7;
            iArr5 = iArr115;
            z12 = z15;
        }
        z14 = z13;
        int[] iArr116 = iArr7;
        long jZzt15 = zzeo.zzt(j15, 1000000L, zzaisVar2.zzd, RoundingMode.DOWN);
        if (z14) {
            zzs zzsVarZza7 = zzaisVar2.zzg.zza();
            zzsVarZza7.zzs(true);
            zzaisVarZzb2 = zzaisVar2.zzb(zzsVarZza7.zzM());
        } else {
            zzaisVarZzb2 = zzaisVar2;
        }
        return new zzaiv(zzaisVarZzb2, jArr8, iArr6, i19, jArr9, iArr116, jZzt15, jArr8.length);
    }

    private static zzao zzh(zzef zzefVar) {
        short sZzv = zzefVar.zzv();
        zzefVar.zzk(2);
        String strZzK = zzefVar.zzK(sZzv, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzK.lastIndexOf(43), strZzK.lastIndexOf(45));
        try {
            return new zzao(-9223372036854775807L, new zzew(Float.parseFloat(strZzK.substring(0, iMax)), Float.parseFloat(strZzK.substring(iMax, strZzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzi(zzef zzefVar) {
        zzefVar.zzh(16);
        return zzefVar.zzB();
    }

    private static String zzj(byte[] bArr, int i7, int i8) {
        zzghc.zzh(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i9 = 0; i9 < bArr.length - 3; i9 += 4) {
            int iZze = zzgne.zze(bArr[i9], bArr[i9 + 1], bArr[i9 + 2], bArr[i9 + 3]);
            String str = zzeo.zza;
            int i10 = ((iZze >> 8) & 255) - 128;
            int i11 = (iZze >> 16) & 255;
            int i12 = (iZze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(i11 + ((i12 * 17790) / 10000), 255)) | (Math.max(0, Math.min(((i10 * 14075) / 10000) + i11, 255)) << 16) | (Math.max(0, Math.min((i11 - ((i12 * 3455) / 10000)) - ((i10 * 7169) / 10000), 255)) << 8))));
        }
        String strZzd = zzggw.zzd(arrayList, ", ");
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 7 + String.valueOf(i8).length() + 10 + strZzd.length() + 1);
        sb.append("size: ");
        sb.append(i7);
        sb.append("x");
        sb.append(i8);
        sb.append("\npalette: ");
        sb.append(strZzd);
        sb.append("\n");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:75:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0178 A[PHI: r3
      0x0178: PHI (r3v5 int) = (r3v4 int), (r3v4 int), (r3v8 int) binds: [B:76:0x016a, B:77:0x016c, B:82:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0187  */
    private static zzh zzk(zzef zzefVar) {
        int i7;
        int iZzj;
        int iZzj2;
        zzg zzgVar = new zzg();
        byte[] bArrZzi = zzefVar.zzi();
        zzee zzeeVar = new zzee(bArrZzi, bArrZzi.length);
        zzeeVar.zzf(zzefVar.zzg() * 8);
        zzeeVar.zzo(1);
        int iZzj3 = zzeeVar.zzj(3);
        zzeeVar.zzh(6);
        boolean zZzi = zzeeVar.zzi();
        boolean zZzi2 = zzeeVar.zzi();
        boolean z7 = false;
        if (iZzj3 != 2) {
            if (iZzj3 <= 2) {
                i7 = true != zZzi ? 8 : 10;
                zzgVar.zze(i7);
                zzgVar.zzf(i7);
            }
        } else if (zZzi) {
            i7 = true == zZzi2 ? 12 : 10;
            zzgVar.zze(i7);
            zzgVar.zzf(i7);
        } else {
            zZzi = false;
            iZzj3 = 2;
            if (iZzj3 <= 2) {
                if (true != zZzi) {
                }
                zzgVar.zze(i7);
                zzgVar.zzf(i7);
            }
        }
        int i8 = 13;
        zzeeVar.zzh(13);
        zzeeVar.zzg();
        int iZzj4 = zzeeVar.zzj(4);
        if (iZzj4 != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzj4).length() + 22);
            sb.append("Unsupported obu_type: ");
            sb.append(iZzj4);
            zzds.zzb("BoxParsers", sb.toString());
            return zzgVar.zzg();
        }
        if (zzeeVar.zzi()) {
            zzds.zzb("BoxParsers", "Unsupported obu_extension_flag");
            return zzgVar.zzg();
        }
        boolean zZzi3 = zzeeVar.zzi();
        zzeeVar.zzg();
        if (zZzi3 && zzeeVar.zzj(8) > 127) {
            zzds.zzb("BoxParsers", "Excessive obu_size");
            return zzgVar.zzg();
        }
        int iZzj5 = zzeeVar.zzj(3);
        zzeeVar.zzg();
        if (zzeeVar.zzi()) {
            zzds.zzb("BoxParsers", "Unsupported reduced_still_picture_header");
            return zzgVar.zzg();
        }
        if (zzeeVar.zzi()) {
            zzds.zzb("BoxParsers", "Unsupported timing_info_present_flag");
            return zzgVar.zzg();
        }
        if (zzeeVar.zzi()) {
            zzds.zzb("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return zzgVar.zzg();
        }
        int iZzj6 = zzeeVar.zzj(5);
        for (int i9 = 0; i9 <= iZzj6; i9++) {
            zzeeVar.zzh(12);
            if (zzeeVar.zzj(5) > 7) {
                zzeeVar.zzg();
            }
        }
        int iZzj7 = zzeeVar.zzj(4);
        int iZzj8 = zzeeVar.zzj(4);
        zzeeVar.zzh(iZzj7 + 1);
        zzeeVar.zzh(iZzj8 + 1);
        if (zzeeVar.zzi()) {
            zzeeVar.zzh(7);
        }
        zzeeVar.zzh(7);
        boolean zZzi4 = zzeeVar.zzi();
        if (zZzi4) {
            zzeeVar.zzh(2);
        }
        if ((zzeeVar.zzi() || zzeeVar.zzj(1) > 0) && !zzeeVar.zzi()) {
            zzeeVar.zzh(1);
        }
        if (zZzi4) {
            zzeeVar.zzh(3);
        }
        zzeeVar.zzh(3);
        boolean zZzi5 = zzeeVar.zzi();
        if (iZzj5 != 2) {
            if (iZzj5 != 1) {
            }
            if (zzeeVar.zzi()) {
                int iZzj9 = zzeeVar.zzj(8);
                iZzj = zzeeVar.zzj(8);
                int iZzj10 = zzeeVar.zzj(8);
                if (!z7 || iZzj9 != 1) {
                    i8 = iZzj;
                    iZzj2 = zzeeVar.zzj(1);
                } else if (iZzj != 13) {
                    iZzj9 = 1;
                    i8 = iZzj;
                    iZzj2 = zzeeVar.zzj(1);
                } else if (iZzj10 == 0) {
                    iZzj2 = 1;
                    iZzj9 = 1;
                } else {
                    iZzj9 = 1;
                    iZzj2 = zzeeVar.zzj(1);
                }
                zzgVar.zza(zzh.zzb(iZzj9));
                zzgVar.zzb(iZzj2 != 1 ? 2 : 1);
                zzgVar.zzc(zzh.zzc(i8));
            }
            return zzgVar.zzg();
        }
        if (zZzi5) {
            zzeeVar.zzg();
        }
        if (zzeeVar.zzi()) {
            z7 = true;
        }
        if (zzeeVar.zzi()) {
            int iZzj11 = zzeeVar.zzj(8);
            iZzj = zzeeVar.zzj(8);
            int iZzj12 = zzeeVar.zzj(8);
            if (!z7) {
                i8 = iZzj;
                iZzj2 = zzeeVar.zzj(1);
            } else {
                i8 = iZzj;
                iZzj2 = zzeeVar.zzj(1);
            }
            zzgVar.zza(zzh.zzb(iZzj11));
            zzgVar.zzb(iZzj2 != 1 ? 2 : 1);
            zzgVar.zzc(zzh.zzc(i8));
        }
        return zzgVar.zzg();
    }

    private static zzh zzl(zzef zzefVar) {
        zzg zzgVar = new zzg();
        byte[] bArrZzi = zzefVar.zzi();
        zzee zzeeVar = new zzee(bArrZzi, bArrZzi.length);
        zzeeVar.zzf(zzefVar.zzg() * 8);
        zzeeVar.zzo(1);
        int iZzj = zzeeVar.zzj(8);
        for (int i7 = 0; i7 < iZzj; i7++) {
            zzeeVar.zzo(1);
            int iZzj2 = zzeeVar.zzj(8);
            for (int i8 = 0; i8 < iZzj2; i8++) {
                zzeeVar.zzh(6);
                boolean zZzi = zzeeVar.zzi();
                zzeeVar.zzg();
                zzeeVar.zzo(11);
                zzeeVar.zzh(4);
                int iZzj3 = zzeeVar.zzj(4) + 8;
                zzgVar.zze(iZzj3);
                zzgVar.zzf(iZzj3);
                zzeeVar.zzo(1);
                if (zZzi) {
                    int iZzj4 = zzeeVar.zzj(8);
                    int iZzj5 = zzeeVar.zzj(8);
                    zzeeVar.zzo(1);
                    boolean zZzi2 = zzeeVar.zzi();
                    zzgVar.zza(zzh.zzb(iZzj4));
                    zzgVar.zzb(true != zZzi2 ? 2 : 1);
                    zzgVar.zzc(zzh.zzc(iZzj5));
                }
            }
        }
        return zzgVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Pair zzn(zzet zzetVar) {
        zzeu zzeuVarZzc = zzetVar.zzc(1701606260);
        if (zzeuVarZzc == null) {
            return null;
        }
        zzef zzefVar = zzeuVarZzc.zza;
        zzefVar.zzh(8);
        int iZza = zza(zzefVar.zzB());
        int iZzH = zzefVar.zzH();
        long[] jArr = new long[iZzH];
        long[] jArr2 = new long[iZzH];
        for (int i7 = 0; i7 < iZzH; i7++) {
            jArr[i7] = iZza == 1 ? zzefVar.zzJ() : zzefVar.zzz();
            jArr2[i7] = iZza == 1 ? zzefVar.zzD() : zzefVar.zzB();
            if (zzefVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzefVar.zzk(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Code duplicated, block: B:134:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:141:0x020d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0223  */
    /* JADX WARN: Code duplicated, block: B:145:0x0233  */
    /* JADX WARN: Code duplicated, block: B:148:0x0250  */
    /* JADX WARN: Code duplicated, block: B:152:0x025d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0268  */
    /* JADX WARN: Code duplicated, block: B:155:0x0270  */
    /* JADX WARN: Code duplicated, block: B:157:0x027b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0282  */
    /* JADX WARN: Code duplicated, block: B:160:0x0289  */
    /* JADX WARN: Code duplicated, block: B:162:0x0299  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:167:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:190:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:191:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:193:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:195:0x030e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0313  */
    /* JADX WARN: Code duplicated, block: B:198:0x0323  */
    /* JADX WARN: Code duplicated, block: B:200:0x0328  */
    /* JADX WARN: Code duplicated, block: B:201:0x0338  */
    /* JADX WARN: Code duplicated, block: B:203:0x033d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x033f  */
    /* JADX WARN: Code duplicated, block: B:208:0x036c  */
    /* JADX WARN: Code duplicated, block: B:250:0x04ba A[PHI: r15
      0x04ba: PHI (r15v9 int) = (r15v10 int), (r15v15 int) binds: [B:252:0x04c6, B:249:0x049b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:251:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:253:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:255:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:257:0x04de  */
    /* JADX WARN: Code duplicated, block: B:260:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:262:0x04f8 A[LOOP:2: B:258:0x04e8->B:262:0x04f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:273:0x0540  */
    /* JADX WARN: Code duplicated, block: B:275:0x054b  */
    /* JADX WARN: Code duplicated, block: B:276:0x0557  */
    /* JADX WARN: Code duplicated, block: B:278:0x055e  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:292:0x034b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0502 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0506 A[EDGE_INSN: B:300:0x0506->B:264:0x0506 BREAK  A[LOOP:2: B:258:0x04e8->B:262:0x04f8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x015e  */
    private static void zzo(zzef zzefVar, int i7, int i8, int i9, int i10, String str, boolean z7, zzp zzpVar, zzahu zzahuVar, int i11) throws zzas {
        int i12;
        int i13;
        int iZzB;
        int iZzH;
        int iRound;
        int i14;
        String str2;
        List listZzj;
        String strZza;
        zzahp zzahpVarZzp;
        zzahn zzahnVarZzq;
        int iZzB2;
        boolean z8;
        int iZzB3;
        int i15;
        String str3;
        boolean z9;
        int iZzg;
        int i16;
        String strZza2;
        byte[] bArrZzb;
        zzef zzefVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        int iZzz;
        int iZzs;
        byte[] bArr;
        int iZzs2;
        String str4;
        byte[] bArr2;
        zzef zzefVar3 = zzefVar;
        int i21 = i7;
        int i22 = i9;
        zzp zzpVarZzb = zzpVar;
        zzefVar3.zzh(i8 + 16);
        if (z7) {
            int iZzt = zzefVar3.zzt();
            zzefVar3.zzk(6);
            i12 = iZzt;
        } else {
            zzefVar3.zzk(8);
            i12 = 0;
        }
        int i23 = 268435456;
        if (i12 == 0 || i12 == 1) {
            i13 = 2;
            int iZzt2 = zzefVar3.zzt();
            zzefVar3.zzk(6);
            int iZzF = zzefVar3.zzF();
            zzefVar3.zzh(zzefVar3.zzg() - 4);
            iZzB = zzefVar3.zzB();
            if (i12 == 1) {
                zzefVar3.zzk(16);
            }
            iZzH = iZzt2;
            iRound = iZzF;
            i14 = -1;
        } else {
            if (i12 != 2) {
                return;
            }
            zzefVar3.zzk(16);
            iRound = (int) Math.round(Double.longBitsToDouble(zzefVar3.zzD()));
            iZzH = zzefVar3.zzH();
            zzefVar3.zzk(4);
            i13 = 2;
            int iZzH2 = zzefVar3.zzH();
            int iZzH3 = zzefVar3.zzH();
            int i24 = iZzH3 & 1;
            int i25 = iZzH3 & 2;
            if (i24 == 0) {
                if (iZzH2 == 8) {
                    i14 = 3;
                } else if (iZzH2 == 16) {
                    i14 = i25 != 0 ? 268435456 : 2;
                } else if (iZzH2 == 24) {
                    i14 = i25 != 0 ? 1342177280 : 21;
                } else if (iZzH2 == 32) {
                    i14 = i25 != 0 ? 1610612736 : 22;
                } else {
                    i14 = -1;
                }
            } else if (iZzH2 == 32) {
                i14 = 4;
            } else {
                i14 = -1;
            }
            zzefVar3.zzk(8);
            iZzB = 0;
        }
        if (i21 == 1767992678) {
            iRound = -1;
            iZzH = -1;
        } else {
            if (i21 == 1935764850) {
                iRound = 8000;
            } else if (i21 == 1935767394) {
                iRound = 16000;
                i21 = 1935767394;
            }
            iZzH = 1;
        }
        int iZzg2 = zzefVar3.zzg();
        int iIntValue = 1701733217;
        if (i21 == 1701733217) {
            Pair pairZzr = zzr(zzefVar3, i8, i22);
            if (pairZzr != null) {
                iIntValue = ((Integer) pairZzr.first).intValue();
                zzpVarZzb = zzpVarZzb == null ? null : zzpVarZzb.zzb(((zzait) pairZzr.second).zzb);
                zzahuVar.zza[i11] = (zzait) pairZzr.second;
            }
            i21 = iIntValue;
            zzefVar3.zzh(iZzg2);
        }
        String str5 = "audio/mhm1";
        if (i21 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i21 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i21 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i21 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i21 == 1685353320 || i21 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i21 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i21 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i21 == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (i21 != 1935767394) {
                if (i21 == 1936684916) {
                    i23 = i13;
                    str2 = "audio/raw";
                } else if (i21 == 1953984371) {
                    str2 = "audio/raw";
                } else if (i21 == 1819304813) {
                    if (i14 == -1) {
                        i23 = i13;
                    } else {
                        i23 = i14;
                    }
                    str2 = "audio/raw";
                } else if (i21 == 778924082 || i21 == 778924083) {
                    str2 = "audio/mpeg";
                } else if (i21 == 1835557169) {
                    str2 = "audio/mha1";
                } else if (i21 == 1835560241) {
                    i23 = i14;
                    str2 = "audio/mhm1";
                } else if (i21 == 1634492771) {
                    str2 = "audio/alac";
                } else if (i21 == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (i21 == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (i21 == 1332770163) {
                    str2 = "audio/opus";
                } else if (i21 == 1716281667) {
                    str2 = "audio/flac";
                } else if (i21 == 1835823201) {
                    str2 = "audio/true-hd";
                } else if (i21 == 1767992678) {
                    str2 = "audio/iamf";
                    i21 = 1767992678;
                } else {
                    i23 = i14;
                    str2 = null;
                }
                int i26 = i23;
                listZzj = null;
                strZza = null;
                zzahpVarZzp = null;
                zzahnVarZzq = null;
                while (iZzg2 - i8 < i22) {
                    zzefVar3.zzh(iZzg2);
                    iZzB2 = zzefVar3.zzB();
                    if (iZzB2 > 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    strZza = strZza;
                    zzacy.zza(z8, "childAtomSize must be positive");
                    iZzB3 = zzefVar3.zzB();
                    i15 = iRound;
                    if (iZzB3 == 1835557187) {
                        zzefVar3.zzh(iZzg2 + 8);
                        zzefVar3.zzk(1);
                        iZzs2 = zzefVar3.zzs();
                        zzefVar3.zzk(1);
                        if (Objects.equals(str2, str5)) {
                            str4 = String.format("mhm1.%02X", Integer.valueOf(iZzs2));
                        } else {
                            str4 = String.format("mha1.%02X", Integer.valueOf(iZzs2));
                        }
                        strZza = str4;
                        int iZzt3 = zzefVar3.zzt();
                        bArr2 = new byte[iZzt3];
                        str3 = str5;
                        z9 = false;
                        zzefVar3.zzm(bArr2, 0, iZzt3);
                        if (listZzj == null) {
                            listZzj = zzgjz.zzj(bArr2);
                        } else {
                            listZzj = zzgjz.zzk(bArr2, (byte[]) listZzj.get(0));
                        }
                    } else {
                        str3 = str5;
                        z9 = false;
                        if (iZzB3 == 1835557200) {
                            zzefVar3.zzh(iZzg2 + 8);
                            iZzs = zzefVar3.zzs();
                            if (iZzs > 0) {
                                bArr = new byte[iZzs];
                                zzefVar3.zzm(bArr, 0, iZzs);
                                if (listZzj == null) {
                                    listZzj = zzgjz.zzj(bArr);
                                    strZza = strZza;
                                } else {
                                    listZzj = zzgjz.zzk((byte[]) listZzj.get(0), bArr);
                                    strZza = strZza;
                                    i21 = i21;
                                }
                            } else {
                                strZza = strZza;
                            }
                        } else {
                            if (iZzB3 == 1702061171) {
                                i15 = i15;
                                iZzg = iZzg2;
                                i16 = -1;
                            } else if (z7 || iZzB3 != 2002876005) {
                                if (iZzB3 == 1651798644) {
                                    zzahnVarZzq = zzq(zzefVar3, iZzg2);
                                } else {
                                    if (iZzB3 == 1684103987) {
                                        zzefVar3.zzh(iZzg2 + 8);
                                        zzahuVar.zzb = zzabv.zza(zzefVar3, Integer.toString(i10), str, zzpVarZzb);
                                    } else if (iZzB3 == 1684366131) {
                                        zzefVar3.zzh(iZzg2 + 8);
                                        zzahuVar.zzb = zzabv.zzb(zzefVar3, Integer.toString(i10), str, zzpVarZzb);
                                    } else if (iZzB3 == 1684103988) {
                                        zzefVar3.zzh(iZzg2 + 8);
                                        zzahuVar.zzb = zzaby.zza(zzefVar3, Integer.toString(i10), str, zzpVarZzb);
                                    } else if (iZzB3 != 1684892784) {
                                        if (iZzB > 0) {
                                            StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 49);
                                            sb.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                            sb.append(iZzB);
                                            throw zzas.zzb(sb.toString(), null);
                                        }
                                        i15 = iZzB;
                                        iZzH = i13;
                                    } else if (iZzB3 != 1684305011 || iZzB3 == 1969517683) {
                                        zzs zzsVar = new zzs();
                                        zzsVar.zzb(i10);
                                        zzsVar.zzm(str2);
                                        zzsVar.zzE(iZzH);
                                        i15 = i15;
                                        zzsVar.zzF(i15);
                                        zzsVar.zzq(zzpVarZzb);
                                        zzsVar.zze(str);
                                        zzahuVar.zzb = zzsVar.zzM();
                                        strZza = strZza;
                                    } else if (iZzB3 == 1682927731) {
                                        int i27 = iZzB2 - 8;
                                        byte[] bArr3 = zzb;
                                        int length = bArr3.length;
                                        byte[] bArrCopyOf = Arrays.copyOf(bArr3, length + i27);
                                        zzefVar3.zzh(iZzg2 + 8);
                                        zzefVar3.zzm(bArrCopyOf, length, i27);
                                        listZzj = zzadr.zza(bArrCopyOf);
                                    } else {
                                        if (iZzB3 == 1684425825) {
                                            byte[] bArr4 = new byte[iZzB2 - 8];
                                            bArr4[0] = 102;
                                            bArr4[1] = 76;
                                            bArr4[i13] = 97;
                                            bArr4[3] = 67;
                                            zzefVar3.zzh(iZzg2 + 12);
                                            zzefVar3.zzm(bArr4, 4, iZzB2 - 12);
                                            listZzj = zzgjz.zzj(bArr4);
                                        } else if (iZzB3 == 1634492771) {
                                            int i28 = iZzB2 - 12;
                                            byte[] bArr5 = new byte[i28];
                                            zzefVar3.zzh(iZzg2 + 12);
                                            zzefVar3.zzm(bArr5, 0, i28);
                                            int i29 = zzdc.zza;
                                            zzef zzefVar4 = new zzef(bArr5);
                                            zzefVar4.zzh(9);
                                            int iZzs3 = zzefVar4.zzs();
                                            zzefVar4.zzh(20);
                                            Pair pairCreate = Pair.create(Integer.valueOf(zzefVar4.zzH()), Integer.valueOf(iZzs3));
                                            int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                            int iIntValue3 = ((Integer) pairCreate.second).intValue();
                                            zzgjz zzgjzVarZzj = zzgjz.zzj(bArr5);
                                            iZzH = iIntValue3;
                                            listZzj = zzgjzVarZzj;
                                            i15 = iIntValue2;
                                        } else {
                                            if (iZzB3 == 1767990114) {
                                                zzefVar3.zzh(iZzg2 + 9);
                                                int iZza = zzgne.zza(zzefVar3.zzP());
                                                byte[] bArr6 = new byte[iZza];
                                                zzefVar3.zzm(bArr6, 0, iZza);
                                                strZza = zzdc.zza(bArr6);
                                                listZzj = zzgjz.zzj(bArr6);
                                            } else if (iZzB3 == 1885564227) {
                                                zzefVar3.zzh(iZzg2 + 12);
                                                ByteOrder byteOrder = (zzefVar3.zzs() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                                int iZzs4 = zzefVar3.zzs();
                                                if (i21 == 1768973165) {
                                                    iZzz = zzeo.zzz(iZzs4, byteOrder);
                                                } else {
                                                    iZzz = (i21 == 1718641517 && iZzs4 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i26;
                                                }
                                                strZza = strZza;
                                                i26 = iZzz;
                                                if (iZzz != -1) {
                                                    str2 = "audio/raw";
                                                }
                                            } else {
                                                i15 = i15;
                                                strZza = strZza;
                                            }
                                            i15 = i15;
                                        }
                                        i21 = i21;
                                    }
                                    strZza = strZza;
                                }
                                strZza = strZza;
                                i21 = i21;
                            } else {
                                iZzg = zzefVar3.zzg();
                                zzacy.zza(iZzg >= iZzg2, null);
                                while (true) {
                                    if (iZzg - iZzg2 >= iZzB2) {
                                        iZzg = -1;
                                        break;
                                    }
                                    zzefVar3.zzh(iZzg);
                                    int iZzB4 = zzefVar3.zzB();
                                    zzacy.zza(iZzB4 > 0, "childAtomSize must be positive");
                                    if (zzefVar3.zzB() == 1702061171) {
                                        break;
                                    } else {
                                        iZzg += iZzB4;
                                    }
                                }
                                i16 = -1;
                            }
                            if (iZzg != i16) {
                                zzahpVarZzp = zzp(zzefVar3, iZzg);
                                strZza2 = zzahpVarZzp.zza();
                                bArrZzb = zzahpVarZzp.zzb();
                                if (bArrZzb != null) {
                                    if ("audio/vorbis".equals(strZza2)) {
                                        zzefVar2 = new zzef(bArrZzb);
                                        i17 = 1;
                                        zzefVar2.zzk(1);
                                        i18 = 0;
                                        while (true) {
                                            if (zzefVar2.zzd() > 0) {
                                                i21 = i21;
                                                i19 = 255;
                                                break;
                                            }
                                            i21 = i21;
                                            i19 = 255;
                                            if (zzefVar2.zzn() == 255) {
                                                break;
                                            }
                                            zzefVar2.zzk(i17);
                                            i18 += 255;
                                            i21 = i21;
                                            i17 = 1;
                                        }
                                        int iZzs5 = i18 + zzefVar2.zzs();
                                        i20 = 0;
                                        while (zzefVar2.zzd() > 0 && zzefVar2.zzn() == i19) {
                                            zzefVar2.zzk(1);
                                            i20 += i19;
                                        }
                                        int iZzs6 = i20 + zzefVar2.zzs();
                                        byte[] bArr7 = new byte[iZzs5];
                                        int iZzg3 = zzefVar2.zzg();
                                        System.arraycopy(bArrZzb, iZzg3, bArr7, 0, iZzs5);
                                        int i30 = iZzg3 + iZzs5 + iZzs6;
                                        int length2 = bArrZzb.length - i30;
                                        byte[] bArr8 = new byte[length2];
                                        System.arraycopy(bArrZzb, i30, bArr8, 0, length2);
                                        listZzj = zzgjz.zzk(bArr7, bArr8);
                                    } else {
                                        i21 = i21;
                                        if ("audio/mp4a-latm".equals(strZza2)) {
                                            zzabs zzabsVarZza = zzabt.zza(bArrZzb);
                                            int i31 = zzabsVarZza.zza;
                                            iZzH = zzabsVarZza.zzb;
                                            strZza = zzabsVarZza.zzc;
                                            i15 = i31;
                                        } else {
                                            strZza = strZza;
                                        }
                                        listZzj = zzgjz.zzj(bArrZzb);
                                    }
                                    str2 = strZza2;
                                } else {
                                    i21 = i21;
                                }
                                strZza = strZza;
                                str2 = strZza2;
                            } else {
                                strZza = strZza;
                            }
                        }
                        iZzg2 += iZzB2;
                        zzefVar3 = zzefVar;
                        i22 = i9;
                        iRound = i15;
                        i21 = i21;
                        str5 = str3;
                    }
                    i21 = i21;
                    iZzg2 += iZzB2;
                    zzefVar3 = zzefVar;
                    i22 = i9;
                    iRound = i15;
                    i21 = i21;
                    str5 = str3;
                }
                int i32 = iRound;
                String str6 = strZza;
                if (zzahuVar.zzb == null || str2 == null) {
                }
                zzs zzsVar2 = new zzs();
                zzsVar2.zzb(i10);
                zzsVar2.zzm(str2);
                zzsVar2.zzj(str6);
                zzsVar2.zzE(iZzH);
                zzsVar2.zzF(i32);
                zzsVar2.zzG(i26);
                zzsVar2.zzp(listZzj);
                zzsVar2.zzq(zzpVarZzb);
                zzsVar2.zze(str);
                if (zzahpVarZzp != null) {
                    zzsVar2.zzh(zzgne.zzb(zzahpVarZzp.zzc()));
                    zzsVar2.zzi(zzgne.zzb(zzahpVarZzp.zzd()));
                } else if (zzahnVarZzq != null) {
                    zzsVar2.zzh(zzgne.zzb(zzahnVarZzq.zza()));
                    zzsVar2.zzi(zzgne.zzb(zzahnVarZzq.zzb()));
                }
                zzahuVar.zzb = zzsVar2.zzM();
                return;
            }
            str2 = "audio/amr-wb";
        }
        i23 = i14;
        int i210 = i23;
        listZzj = null;
        strZza = null;
        zzahpVarZzp = null;
        zzahnVarZzq = null;
        while (iZzg2 - i8 < i22) {
            zzefVar3.zzh(iZzg2);
            iZzB2 = zzefVar3.zzB();
            if (iZzB2 > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            strZza = strZza;
            zzacy.zza(z8, "childAtomSize must be positive");
            iZzB3 = zzefVar3.zzB();
            i15 = iRound;
            if (iZzB3 == 1835557187) {
                zzefVar3.zzh(iZzg2 + 8);
                zzefVar3.zzk(1);
                iZzs2 = zzefVar3.zzs();
                zzefVar3.zzk(1);
                if (Objects.equals(str2, str5)) {
                    str4 = String.format("mhm1.%02X", Integer.valueOf(iZzs2));
                } else {
                    str4 = String.format("mha1.%02X", Integer.valueOf(iZzs2));
                }
                strZza = str4;
                int iZzt4 = zzefVar3.zzt();
                bArr2 = new byte[iZzt4];
                str3 = str5;
                z9 = false;
                zzefVar3.zzm(bArr2, 0, iZzt4);
                if (listZzj == null) {
                    listZzj = zzgjz.zzj(bArr2);
                } else {
                    listZzj = zzgjz.zzk(bArr2, (byte[]) listZzj.get(0));
                }
            } else {
                str3 = str5;
                z9 = false;
                if (iZzB3 == 1835557200) {
                    zzefVar3.zzh(iZzg2 + 8);
                    iZzs = zzefVar3.zzs();
                    if (iZzs > 0) {
                        bArr = new byte[iZzs];
                        zzefVar3.zzm(bArr, 0, iZzs);
                        if (listZzj == null) {
                            listZzj = zzgjz.zzj(bArr);
                            strZza = strZza;
                        } else {
                            listZzj = zzgjz.zzk((byte[]) listZzj.get(0), bArr);
                            strZza = strZza;
                            i21 = i21;
                        }
                    } else {
                        strZza = strZza;
                    }
                } else {
                    if (iZzB3 == 1702061171) {
                        if (z7) {
                        }
                        if (iZzB3 == 1651798644) {
                            zzahnVarZzq = zzq(zzefVar3, iZzg2);
                        } else {
                            if (iZzB3 == 1684103987) {
                                zzefVar3.zzh(iZzg2 + 8);
                                zzahuVar.zzb = zzabv.zza(zzefVar3, Integer.toString(i10), str, zzpVarZzb);
                            } else if (iZzB3 == 1684366131) {
                                zzefVar3.zzh(iZzg2 + 8);
                                zzahuVar.zzb = zzabv.zzb(zzefVar3, Integer.toString(i10), str, zzpVarZzb);
                            } else if (iZzB3 == 1684103988) {
                                zzefVar3.zzh(iZzg2 + 8);
                                zzahuVar.zzb = zzaby.zza(zzefVar3, Integer.toString(i10), str, zzpVarZzb);
                            } else if (iZzB3 != 1684892784) {
                                if (iZzB3 != 1684305011) {
                                }
                                zzs zzsVar3 = new zzs();
                                zzsVar3.zzb(i10);
                                zzsVar3.zzm(str2);
                                zzsVar3.zzE(iZzH);
                                i15 = i15;
                                zzsVar3.zzF(i15);
                                zzsVar3.zzq(zzpVarZzb);
                                zzsVar3.zze(str);
                                zzahuVar.zzb = zzsVar3.zzM();
                                strZza = strZza;
                            } else {
                                if (iZzB > 0) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB).length() + 49);
                                    sb2.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                    sb2.append(iZzB);
                                    throw zzas.zzb(sb2.toString(), null);
                                }
                                i15 = iZzB;
                                iZzH = i13;
                            }
                            strZza = strZza;
                        }
                        strZza = strZza;
                        i21 = i21;
                    } else {
                        i15 = i15;
                        iZzg = iZzg2;
                        i16 = -1;
                    }
                    if (iZzg != i16) {
                        zzahpVarZzp = zzp(zzefVar3, iZzg);
                        strZza2 = zzahpVarZzp.zza();
                        bArrZzb = zzahpVarZzp.zzb();
                        if (bArrZzb != null) {
                            if ("audio/vorbis".equals(strZza2)) {
                                zzefVar2 = new zzef(bArrZzb);
                                i17 = 1;
                                zzefVar2.zzk(1);
                                i18 = 0;
                                while (true) {
                                    if (zzefVar2.zzd() > 0) {
                                        i21 = i21;
                                        i19 = 255;
                                        break;
                                    }
                                    i21 = i21;
                                    i19 = 255;
                                    if (zzefVar2.zzn() == 255) {
                                        break;
                                        break;
                                    }
                                    zzefVar2.zzk(i17);
                                    i18 += 255;
                                    i21 = i21;
                                    i17 = 1;
                                }
                                int iZzs7 = i18 + zzefVar2.zzs();
                                i20 = 0;
                                while (zzefVar2.zzd() > 0) {
                                    zzefVar2.zzk(1);
                                    i20 += i19;
                                }
                                int iZzs8 = i20 + zzefVar2.zzs();
                                byte[] bArr9 = new byte[iZzs7];
                                int iZzg4 = zzefVar2.zzg();
                                System.arraycopy(bArrZzb, iZzg4, bArr9, 0, iZzs7);
                                int i33 = iZzg4 + iZzs7 + iZzs8;
                                int length3 = bArrZzb.length - i33;
                                byte[] bArr10 = new byte[length3];
                                System.arraycopy(bArrZzb, i33, bArr10, 0, length3);
                                listZzj = zzgjz.zzk(bArr9, bArr10);
                            } else {
                                i21 = i21;
                                if ("audio/mp4a-latm".equals(strZza2)) {
                                    zzabs zzabsVarZza2 = zzabt.zza(bArrZzb);
                                    int i34 = zzabsVarZza2.zza;
                                    iZzH = zzabsVarZza2.zzb;
                                    strZza = zzabsVarZza2.zzc;
                                    i15 = i34;
                                } else {
                                    strZza = strZza;
                                }
                                listZzj = zzgjz.zzj(bArrZzb);
                            }
                            str2 = strZza2;
                        } else {
                            i21 = i21;
                        }
                        strZza = strZza;
                        str2 = strZza2;
                    } else {
                        strZza = strZza;
                    }
                }
                iZzg2 += iZzB2;
                zzefVar3 = zzefVar;
                i22 = i9;
                iRound = i15;
                i21 = i21;
                str5 = str3;
            }
            i21 = i21;
            iZzg2 += iZzB2;
            zzefVar3 = zzefVar;
            i22 = i9;
            iRound = i15;
            i21 = i21;
            str5 = str3;
        }
        int i35 = iRound;
        String str7 = strZza;
        if (zzahuVar.zzb == null) {
        }
    }

    private static zzahp zzp(zzef zzefVar, int i7) {
        zzefVar.zzh(i7 + 12);
        zzefVar.zzk(1);
        zzs(zzefVar);
        zzefVar.zzk(2);
        int iZzs = zzefVar.zzs();
        if ((iZzs & 128) != 0) {
            zzefVar.zzk(2);
        }
        if ((iZzs & 64) != 0) {
            zzefVar.zzk(zzefVar.zzs());
        }
        if ((iZzs & 32) != 0) {
            zzefVar.zzk(2);
        }
        zzefVar.zzk(1);
        zzs(zzefVar);
        String strZzf = zzar.zzf(zzefVar.zzs());
        if ("audio/mpeg".equals(strZzf) || "audio/vnd.dts".equals(strZzf) || "audio/vnd.dts.hd".equals(strZzf)) {
            return new zzahp(strZzf, null, -1L, -1L);
        }
        zzefVar.zzk(4);
        long jZzz = zzefVar.zzz();
        long jZzz2 = zzefVar.zzz();
        zzefVar.zzk(1);
        int iZzs2 = zzs(zzefVar);
        long j7 = jZzz2;
        byte[] bArr = new byte[iZzs2];
        zzefVar.zzm(bArr, 0, iZzs2);
        if (j7 <= 0) {
            j7 = -1;
        }
        return new zzahp(strZzf, bArr, j7, jZzz > 0 ? jZzz : -1L);
    }

    private static zzahn zzq(zzef zzefVar, int i7) {
        zzefVar.zzh(i7 + 8);
        zzefVar.zzk(4);
        return new zzahn(zzefVar.zzz(), zzefVar.zzz());
    }

    private static Pair zzr(zzef zzefVar, int i7, int i8) throws zzas {
        zzait zzaitVar;
        Pair pairCreate;
        int i9;
        int i10;
        int iZzg = zzefVar.zzg();
        while (iZzg - i7 < i8) {
            zzefVar.zzh(iZzg);
            int iZzB = zzefVar.zzB();
            zzacy.zza(iZzB > 0, "childAtomSize must be positive");
            if (zzefVar.zzB() == 1936289382) {
                int i11 = iZzg + 8;
                int i12 = 0;
                int i13 = -1;
                Integer numValueOf = null;
                String strZzK = null;
                while (i11 - iZzg < iZzB) {
                    zzefVar.zzh(i11);
                    int iZzB2 = zzefVar.zzB();
                    int iZzB3 = zzefVar.zzB();
                    if (iZzB3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzefVar.zzB());
                    } else if (iZzB3 == 1935894637) {
                        zzefVar.zzk(4);
                        strZzK = zzefVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (iZzB3 == 1935894633) {
                        i13 = i11;
                        i12 = iZzB2;
                    }
                    i11 += iZzB2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strZzK) || "cbc1".equals(strZzK) || "cens".equals(strZzK) || "cbcs".equals(strZzK)) {
                    zzacy.zza(numValueOf != null, "frma atom is mandatory");
                    zzacy.zza(i13 != -1, "schi atom is mandatory");
                    int i14 = i13 + 8;
                    while (true) {
                        if (i14 - i13 >= i12) {
                            zzaitVar = null;
                            break;
                        }
                        zzefVar.zzh(i14);
                        int iZzB4 = zzefVar.zzB();
                        if (zzefVar.zzB() == 1952804451) {
                            int iZza = zza(zzefVar.zzB());
                            zzefVar.zzk(1);
                            if (iZza == 0) {
                                zzefVar.zzk(1);
                                i10 = 0;
                                i9 = 0;
                            } else {
                                int iZzs = zzefVar.zzs();
                                i9 = iZzs & 15;
                                i10 = (iZzs & 240) >> 4;
                            }
                            boolean z7 = zzefVar.zzs() == 1;
                            int iZzs2 = zzefVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzefVar.zzm(bArr2, 0, 16);
                            if (z7 && iZzs2 == 0) {
                                int iZzs3 = zzefVar.zzs();
                                byte[] bArr3 = new byte[iZzs3];
                                zzefVar.zzm(bArr3, 0, iZzs3);
                                bArr = bArr3;
                            }
                            zzaitVar = new zzait(z7, strZzK, iZzs2, bArr2, i10, i9, bArr);
                            break;
                        }
                        i14 += iZzB4;
                    }
                    zzacy.zza(zzaitVar != null, "tenc atom is mandatory");
                    String str = zzeo.zza;
                    pairCreate = Pair.create(numValueOf, zzaitVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzg += iZzB;
        }
        return null;
    }

    private static int zzs(zzef zzefVar) {
        int iZzs = zzefVar.zzs();
        int i7 = iZzs & 127;
        while ((iZzs & 128) == 128) {
            iZzs = zzefVar.zzs();
            i7 = (i7 << 7) | (iZzs & 127);
        }
        return i7;
    }
}
