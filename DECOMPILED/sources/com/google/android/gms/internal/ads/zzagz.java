package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagz implements zzacu {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;
    private zzagy zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private boolean zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private zzdt zzM;
    private zzdt zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private long zzR;
    private long zzS;
    private int zzT;
    private int zzU;
    private int[] zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private int zzZ;
    private boolean zzaa;
    private long zzab;
    private int zzac;
    private int zzad;
    private int zzae;
    private boolean zzaf;
    private boolean zzag;
    private boolean zzah;
    private int zzai;
    private byte zzaj;
    private boolean zzak;
    private zzacx zzal;
    private final zzagu zzam;
    private final zzahb zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzajt zzl;
    private final zzef zzm;
    private final zzef zzn;
    private final zzef zzo;
    private final zzef zzp;
    private final zzef zzq;
    private final zzef zzr;
    private final zzef zzs;
    private final zzef zzt;
    private final zzef zzu;
    private final zzef zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i7 = zzagx.zza;
        zzb = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        String str = zzeo.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzagz() {
        this(new zzagu(), 2, zzajt.zza);
    }

    private final void zzA() {
        if (!this.zzD) {
            return;
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i7 >= sparseArray.size()) {
                zzacx zzacxVar = this.zzal;
                zzacxVar.getClass();
                zzacxVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzagy) sparseArray.valueAt(i7)).zzV) {
                return;
            } else {
                i7++;
            }
        }
    }

    private final void zzp(int i7) throws zzas {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 32);
        sb.append("Element ");
        sb.append(i7);
        sb.append(" must be in a TrackEntry");
        throw zzas.zzb(sb.toString(), null);
    }

    private final void zzq(int i7) throws zzas {
        if (this.zzM == null || this.zzN == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 26);
            sb.append("Element ");
            sb.append(i7);
            sb.append(" must be in a Cues");
            throw zzas.zzb(sb.toString(), null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    private final void zzr(zzagy zzagyVar, long j7, int i7, int i8, int i9) {
        byte b7;
        byte[] bArrZzw;
        int i10;
        int iZze;
        zzaec zzaecVar = zzagyVar.zzU;
        if (zzaecVar != null) {
            zzaecVar.zzc(zzagyVar.zzY, j7, i7, i8, i9, zzagyVar.zzj);
        } else {
            if ("S_TEXT/UTF8".equals(zzagyVar.zzc) || "S_TEXT/ASS".equals(zzagyVar.zzc) || "S_TEXT/SSA".equals(zzagyVar.zzc) || "S_TEXT/WEBVTT".equals(zzagyVar.zzc)) {
                if (this.zzU > 1) {
                    zzds.zzc("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j8 = this.zzS;
                    if (j8 == -9223372036854775807L) {
                        zzds.zzc("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = zzagyVar.zzc;
                        zzef zzefVar = this.zzs;
                        byte[] bArrZzi = zzefVar.zzi();
                        switch (str) {
                            case "S_TEXT/ASS":
                                b7 = 1;
                                break;
                            case "S_TEXT/SSA":
                                b7 = 2;
                                break;
                            case "S_TEXT/WEBVTT":
                                b7 = 3;
                                break;
                            case "S_TEXT/UTF8":
                                b7 = 0;
                                break;
                            default:
                                b7 = -1;
                                break;
                        }
                        if (b7 == 0) {
                            bArrZzw = zzw(j8, "%02d:%02d:%02d,%03d", 1000L);
                            i10 = 19;
                        } else if (b7 == 1 || b7 == 2) {
                            bArrZzw = zzw(j8, "%01d:%02d:%02d:%02d", 10000L);
                            i10 = 21;
                        } else {
                            if (b7 != 3) {
                                throw new IllegalArgumentException();
                            }
                            bArrZzw = zzw(j8, "%02d:%02d:%02d.%03d", 1000L);
                            i10 = 25;
                        }
                        System.arraycopy(bArrZzw, 0, bArrZzi, i10, bArrZzw.length);
                        for (int iZzg = zzefVar.zzg(); iZzg < zzefVar.zze(); iZzg++) {
                            if (zzefVar.zzi()[iZzg] == 0) {
                                zzefVar.zzf(iZzg);
                                zzagyVar.zzY.zzz(zzefVar, zzefVar.zze());
                                iZze = i8 + zzefVar.zze();
                            }
                        }
                        zzagyVar.zzY.zzz(zzefVar, zzefVar.zze());
                        iZze = i8 + zzefVar.zze();
                    }
                }
                iZze = i8;
            } else {
                iZze = i8;
            }
            if ((i7 & 268435456) != 0) {
                if (this.zzU > 1) {
                    this.zzv.zza(0);
                } else {
                    zzef zzefVar2 = this.zzv;
                    int iZze2 = zzefVar2.zze();
                    zzagyVar.zzY.zzw(zzefVar2, iZze2, 2);
                    iZze += iZze2;
                }
            }
            zzagyVar.zzY.zzx(j7, i7, iZze, i9, zzagyVar.zzj);
        }
        this.zzP = true;
    }

    private final void zzs(zzacv zzacvVar, int i7) {
        zzef zzefVar = this.zzo;
        if (zzefVar.zze() >= i7) {
            return;
        }
        if (zzefVar.zzj() < i7) {
            int iZzj = zzefVar.zzj();
            zzefVar.zzc(Math.max(iZzj + iZzj, i7));
        }
        zzacvVar.zzc(zzefVar.zzi(), zzefVar.zze(), i7 - zzefVar.zze());
        zzefVar.zzf(i7);
    }

    private final int zzt(zzacv zzacvVar, zzagy zzagyVar, int i7, boolean z7) throws zzas {
        int i8;
        if ("S_TEXT/UTF8".equals(zzagyVar.zzc)) {
            zzv(zzacvVar, zzb, i7);
            int i9 = this.zzad;
            zzu();
            return i9;
        }
        if ("S_TEXT/ASS".equals(zzagyVar.zzc) || "S_TEXT/SSA".equals(zzagyVar.zzc)) {
            zzv(zzacvVar, zzd, i7);
            int i10 = this.zzad;
            zzu();
            return i10;
        }
        if ("S_TEXT/WEBVTT".equals(zzagyVar.zzc)) {
            zzv(zzacvVar, zze, i7);
            int i11 = this.zzad;
            zzu();
            return i11;
        }
        if (zzagyVar.zzV) {
            zzagyVar.zzZ.getClass();
            int i12 = zzact.zza;
            zzef zzefVar = new zzef(i7);
            if (zzacvVar.zzh(zzefVar.zzi(), 0, i7, true)) {
                zzacvVar.zzl();
                if (zzact.zza(zzefVar.zzr()) == 1 && zzefVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzefVar.zzm(bArr, 0, 10);
                    zzefVar.zzh(0);
                    int iZzc = zzact.zzc(bArr);
                    if (zzefVar.zzd() >= iZzc + 4) {
                        zzefVar.zzk(iZzc);
                        if (zzact.zza(zzefVar.zzB()) == 2) {
                            zzs zzsVarZza = zzagyVar.zzZ.zza();
                            zzsVarZza.zzm("audio/vnd.dts.hd");
                            zzagyVar.zzZ = zzsVarZza.zzM();
                        }
                    }
                }
            }
            zzagyVar.zzY.zzu(zzagyVar.zzZ);
            zzagyVar.zzV = false;
            zzA();
        }
        zzaeb zzaebVar = zzagyVar.zzY;
        if (!this.zzaf) {
            if (zzagyVar.zzh) {
                this.zzY &= -1073741825;
                if (!this.zzag) {
                    zzef zzefVar2 = this.zzo;
                    zzacvVar.zzc(zzefVar2.zzi(), 0, 1);
                    this.zzac++;
                    if ((zzefVar2.zzi()[0] & 128) == 128) {
                        throw zzas.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzaj = zzefVar2.zzi()[0];
                    this.zzag = true;
                }
                byte b7 = this.zzaj;
                if ((b7 & 1) == 1) {
                    int i13 = b7 & 2;
                    this.zzY |= 1073741824;
                    if (!this.zzak) {
                        zzef zzefVar3 = this.zzt;
                        zzacvVar.zzc(zzefVar3.zzi(), 0, 8);
                        this.zzac += 8;
                        this.zzak = true;
                        zzef zzefVar4 = this.zzo;
                        zzefVar4.zzi()[0] = (byte) ((i13 != 2 ? 0 : 128) | 8);
                        zzefVar4.zzh(0);
                        zzaebVar.zzw(zzefVar4, 1, 1);
                        this.zzad++;
                        zzefVar3.zzh(0);
                        zzaebVar.zzw(zzefVar3, 8, 1);
                        this.zzad += 8;
                    }
                    if (i13 == 2) {
                        if (!this.zzah) {
                            zzef zzefVar5 = this.zzo;
                            zzacvVar.zzc(zzefVar5.zzi(), 0, 1);
                            this.zzac++;
                            zzefVar5.zzh(0);
                            this.zzai = zzefVar5.zzs();
                            this.zzah = true;
                        }
                        int i14 = this.zzai * 4;
                        zzef zzefVar6 = this.zzo;
                        zzefVar6.zza(i14);
                        zzacvVar.zzc(zzefVar6.zzi(), 0, i14);
                        this.zzac += i14;
                        int i15 = (this.zzai >> 1) + 1;
                        int i16 = (i15 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.zzw = ByteBuffer.allocate(i16);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i15);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i8 = this.zzai;
                            if (i17 >= i8) {
                                break;
                            }
                            int iZzH = zzefVar6.zzH();
                            int i19 = iZzH - i18;
                            if (i17 % 2 == 0) {
                                this.zzw.putShort((short) i19);
                            } else {
                                this.zzw.putInt(i19);
                            }
                            i17++;
                            i18 = iZzH;
                        }
                        int i20 = (i7 - this.zzac) - i18;
                        if ((i8 & 1) == 1) {
                            this.zzw.putInt(i20);
                        } else {
                            this.zzw.putShort((short) i20);
                            this.zzw.putInt(0);
                        }
                        zzef zzefVar7 = this.zzu;
                        zzefVar7.zzb(this.zzw.array(), i16);
                        zzaebVar.zzw(zzefVar7, i16, 1);
                        this.zzad += i16;
                    }
                }
            } else {
                byte[] bArr2 = zzagyVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzagyVar.zzc) ? zzagyVar.zzg > 0 : z7) {
                this.zzY |= 268435456;
                this.zzv.zza(0);
                int iZze = (this.zzr.zze() + i7) - this.zzac;
                zzef zzefVar8 = this.zzo;
                zzefVar8.zza(4);
                zzefVar8.zzi()[0] = (byte) ((iZze >> 24) & 255);
                zzefVar8.zzi()[1] = (byte) ((iZze >> 16) & 255);
                zzefVar8.zzi()[2] = (byte) ((iZze >> 8) & 255);
                zzefVar8.zzi()[3] = (byte) (iZze & 255);
                zzaebVar.zzw(zzefVar8, 4, 2);
                this.zzad += 4;
            }
            this.zzaf = true;
        }
        zzef zzefVar9 = this.zzr;
        int iZze2 = i7 + zzefVar9.zze();
        if (!"V_MPEG4/ISO/AVC".equals(zzagyVar.zzc) && !"V_MPEGH/ISO/HEVC".equals(zzagyVar.zzc)) {
            if (zzagyVar.zzU != null) {
                zzghc.zzh(zzefVar9.zze() == 0);
                zzagyVar.zzU.zzb(zzacvVar);
            }
            while (true) {
                int i21 = this.zzac;
                if (i21 >= iZze2) {
                    break;
                }
                int iZzx = zzx(zzacvVar, zzaebVar, iZze2 - i21);
                this.zzac += iZzx;
                this.zzad += iZzx;
            }
        } else {
            zzef zzefVar10 = this.zzn;
            byte[] bArrZzi = zzefVar10.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i22 = zzagyVar.zzaa;
            int i23 = 4 - i22;
            while (this.zzac < iZze2) {
                int i24 = this.zzae;
                if (i24 == 0) {
                    int iMin = Math.min(i22, zzefVar9.zzd());
                    zzacvVar.zzc(bArrZzi, i23 + iMin, i22 - iMin);
                    if (iMin > 0) {
                        zzefVar9.zzm(bArrZzi, i23, iMin);
                    }
                    this.zzac += i22;
                    zzefVar10.zzh(0);
                    this.zzae = zzefVar10.zzH();
                    zzef zzefVar11 = this.zzm;
                    zzefVar11.zzh(0);
                    zzaebVar.zzz(zzefVar11, 4);
                    this.zzad += 4;
                } else {
                    int iZzx2 = zzx(zzacvVar, zzaebVar, i24);
                    this.zzac += iZzx2;
                    this.zzad += iZzx2;
                    this.zzae -= iZzx2;
                }
            }
        }
        if ("A_VORBIS".equals(zzagyVar.zzc)) {
            zzef zzefVar12 = this.zzp;
            zzefVar12.zzh(0);
            zzaebVar.zzz(zzefVar12, 4);
            this.zzad += 4;
        }
        int i25 = this.zzad;
        zzu();
        return i25;
    }

    private final void zzu() {
        this.zzac = 0;
        this.zzad = 0;
        this.zzae = 0;
        this.zzaf = false;
        this.zzag = false;
        this.zzah = false;
        this.zzai = 0;
        this.zzaj = (byte) 0;
        this.zzak = false;
        this.zzr.zza(0);
    }

    private final void zzv(zzacv zzacvVar, byte[] bArr, int i7) {
        int length = bArr.length;
        int i8 = length + i7;
        zzef zzefVar = this.zzs;
        if (zzefVar.zzj() < i8) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i8 + i7);
            zzefVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzefVar.zzi(), 0, length);
        }
        zzacvVar.zzc(zzefVar.zzi(), length, i7);
        zzefVar.zzh(0);
        zzefVar.zzf(i8);
    }

    private static byte[] zzw(long j7, String str, long j8) {
        zzghc.zza(j7 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i7 = (int) (j7 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i7);
        long j9 = j7 - (((long) i7) * 3600000000L);
        int i8 = (int) (j9 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i8);
        long j10 = j9 - (((long) i8) * 60000000);
        int i9 = (int) (j10 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i9), Integer.valueOf((int) ((j10 - (((long) i9) * 1000000)) / j8)));
        String str3 = zzeo.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzx(zzacv zzacvVar, zzaeb zzaebVar, int i7) {
        zzef zzefVar = this.zzr;
        int iZzd = zzefVar.zzd();
        if (iZzd <= 0) {
            return zzaebVar.zzy(zzacvVar, i7, false);
        }
        int iMin = Math.min(i7, iZzd);
        zzaebVar.zzz(zzefVar, iMin);
        return iMin;
    }

    private final long zzy(long j7) throws zzas {
        long j8 = this.zzz;
        if (j8 != -9223372036854775807L) {
            return zzeo.zzt(j7, j8, 1000L, RoundingMode.DOWN);
        }
        throw zzas.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static int[] zzz(int[] iArr, int i7) {
        if (iArr == null) {
            return new int[i7];
        }
        int length = iArr.length;
        return length >= i7 ? iArr : new int[Math.max(length + length, i7)];
    }

    protected final void zza(int i7, long j7, long j8) throws zzas {
        zzacx zzacxVar = this.zzal;
        zzacxVar.getClass();
        if (i7 == 160) {
            this.zzaa = false;
            this.zzab = 0L;
            return;
        }
        if (i7 == 174) {
            zzagy zzagyVar = new zzagy();
            this.zzE = zzagyVar;
            zzagyVar.zza = this.zzC;
            return;
        }
        if (i7 == 187) {
            this.zzO = false;
            return;
        }
        if (i7 == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i7 == 20533) {
            zzp(i7);
            this.zzE.zzh = true;
            return;
        }
        if (i7 == 21968) {
            zzp(i7);
            this.zzE.zzy = true;
            return;
        }
        if (i7 == 408125543) {
            long j9 = this.zzy;
            if (j9 != -1 && j9 != j7) {
                throw zzas.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j7;
            this.zzx = j8;
            return;
        }
        if (i7 == 475249515) {
            this.zzM = new zzdt(32);
            this.zzN = new zzdt(32);
        } else if (i7 == 524531317 && !this.zzF) {
            if (this.zzj && this.zzJ != -1) {
                this.zzI = true;
            } else {
                zzacxVar.zzw(new zzadu(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    protected final void zzb(int i7) throws zzas {
        int i8;
        zzadv zzaduVar;
        int i9;
        zzacx zzacxVar = this.zzal;
        zzacxVar.getClass();
        byte b7 = 2;
        int i10 = 0;
        if (i7 == 160) {
            if (this.zzQ == 2) {
                zzagy zzagyVar = (zzagy) this.zzi.get(this.zzW);
                zzagyVar.zzb();
                if (this.zzab > 0 && "A_OPUS".equals(zzagyVar.zzc)) {
                    zzef zzefVar = this.zzv;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzab).array();
                    zzefVar.zzb(bArrArray, bArrArray.length);
                }
                int i11 = 0;
                for (int i12 = 0; i12 < this.zzU; i12++) {
                    i11 += this.zzV[i12];
                }
                int i13 = 0;
                while (i13 < this.zzU) {
                    long j7 = this.zzR + ((long) ((zzagyVar.zzf * i13) / zzbbn.zzq.zzf));
                    int i14 = this.zzY;
                    if (i13 == 0) {
                        if (!this.zzaa) {
                            i14 |= 1;
                        }
                        i8 = 0;
                    } else {
                        i8 = i13;
                    }
                    int i15 = this.zzV[i8];
                    int i16 = i11 - i15;
                    zzr(zzagyVar, j7, i14, i15, i16);
                    i13 = i8 + 1;
                    i11 = i16;
                }
                this.zzQ = 0;
                return;
            }
            return;
        }
        if (i7 != 174) {
            if (i7 == 19899) {
                int i17 = this.zzG;
                if (i17 != -1) {
                    long j8 = this.zzH;
                    if (j8 != -1) {
                        if (i17 == 475249515) {
                            this.zzJ = j8;
                            return;
                        }
                        return;
                    }
                }
                throw zzas.zzb("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i7 == 25152) {
                zzp(i7);
                zzagy zzagyVar2 = this.zzE;
                if (zzagyVar2.zzh) {
                    if (zzagyVar2.zzj == null) {
                        throw zzas.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzagyVar2.zzl = new zzp(null, new zzo(zzf.zza, null, "video/webm", this.zzE.zzj.zzb));
                    return;
                }
                return;
            }
            if (i7 == 28032) {
                zzp(i7);
                zzagy zzagyVar3 = this.zzE;
                if (zzagyVar3.zzh && zzagyVar3.zzi != null) {
                    throw zzas.zzb("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i7 == 357149030) {
                if (this.zzz == -9223372036854775807L) {
                    this.zzz = 1000000L;
                }
                long j9 = this.zzA;
                if (j9 != -9223372036854775807L) {
                    this.zzB = zzy(j9);
                    return;
                }
                return;
            }
            if (i7 == 374648427) {
                if (this.zzi.size() == 0) {
                    throw zzas.zzb("No valid tracks were found", null);
                }
                zzA();
                return;
            }
            if (i7 != 475249515) {
                return;
            }
            if (!this.zzF) {
                zzdt zzdtVar = this.zzM;
                zzdt zzdtVar2 = this.zzN;
                if (this.zzy == -1 || this.zzB == -9223372036854775807L || zzdtVar == null || zzdtVar.zzd() == 0 || zzdtVar2 == null || zzdtVar2.zzd() != zzdtVar.zzd()) {
                    zzaduVar = new zzadu(this.zzB, 0L);
                } else {
                    int iZzd = zzdtVar.zzd();
                    int[] iArrCopyOf = new int[iZzd];
                    long[] jArrCopyOf = new long[iZzd];
                    long[] jArrCopyOf2 = new long[iZzd];
                    long[] jArrCopyOf3 = new long[iZzd];
                    for (int i18 = 0; i18 < iZzd; i18++) {
                        jArrCopyOf3[i18] = zzdtVar.zzc(i18);
                        jArrCopyOf[i18] = this.zzy + zzdtVar2.zzc(i18);
                    }
                    while (true) {
                        i9 = iZzd - 1;
                        if (i10 >= i9) {
                            break;
                        }
                        int i19 = i10 + 1;
                        iArrCopyOf[i10] = (int) (jArrCopyOf[i19] - jArrCopyOf[i10]);
                        jArrCopyOf2[i10] = jArrCopyOf3[i19] - jArrCopyOf3[i10];
                        i10 = i19;
                    }
                    int i20 = i9;
                    while (i20 > 0 && jArrCopyOf3[i20] > this.zzB) {
                        i20--;
                    }
                    iArrCopyOf[i20] = (int) ((this.zzy + this.zzx) - jArrCopyOf[i20]);
                    jArrCopyOf2[i20] = this.zzB - jArrCopyOf3[i20];
                    if (i20 < i9) {
                        zzds.zzc("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                        int i21 = i20 + 1;
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i21);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i21);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i21);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i21);
                    }
                    zzaduVar = new zzaci(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                zzacxVar.zzw(zzaduVar);
                this.zzF = true;
            }
            this.zzM = null;
            this.zzN = null;
            return;
        }
        zzagy zzagyVar4 = this.zzE;
        zzagyVar4.getClass();
        String str = zzagyVar4.zzc;
        if (str == null) {
            throw zzas.zzb("CodecId is missing in TrackEntry element", null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                b7 = str.equals("V_MPEG4/ISO/AP") ? (byte) 6 : (byte) -1;
                break;
            case -2095575984:
                b7 = str.equals("V_MPEG4/ISO/SP") ? (byte) 4 : (byte) -1;
                break;
            case -1985379776:
                b7 = str.equals("A_MS/ACM") ? (byte) 23 : (byte) -1;
                break;
            case -1784763192:
                b7 = str.equals("A_TRUEHD") ? (byte) 18 : (byte) -1;
                break;
            case -1730367663:
                b7 = str.equals("A_VORBIS") ? (byte) 12 : (byte) -1;
                break;
            case -1482641358:
                b7 = str.equals("A_MPEG/L2") ? (byte) 14 : (byte) -1;
                break;
            case -1482641357:
                b7 = str.equals("A_MPEG/L3") ? (byte) 15 : (byte) -1;
                break;
            case -1373388978:
                b7 = str.equals("V_MS/VFW/FOURCC") ? (byte) 9 : (byte) -1;
                break;
            case -933872740:
                b7 = str.equals("S_DVBSUB") ? (byte) 33 : (byte) -1;
                break;
            case -538363189:
                b7 = str.equals("V_MPEG4/ISO/ASP") ? (byte) 5 : (byte) -1;
                break;
            case -538363109:
                b7 = str.equals("V_MPEG4/ISO/AVC") ? (byte) 7 : (byte) -1;
                break;
            case -425012669:
                b7 = str.equals("S_VOBSUB") ? (byte) 31 : (byte) -1;
                break;
            case -356037306:
                b7 = str.equals("A_DTS/LOSSLESS") ? (byte) 21 : (byte) -1;
                break;
            case 62923557:
                b7 = str.equals("A_AAC") ? (byte) 13 : (byte) -1;
                break;
            case 62923603:
                b7 = str.equals("A_AC3") ? (byte) 16 : (byte) -1;
                break;
            case 62927045:
                b7 = str.equals("A_DTS") ? (byte) 19 : (byte) -1;
                break;
            case 82318131:
                if (!str.equals("V_AV1")) {
                    b7 = -1;
                }
                break;
            case 82338133:
                b7 = str.equals("V_VP8") ? (byte) 0 : (byte) -1;
                break;
            case 82338134:
                b7 = str.equals("V_VP9") ? (byte) 1 : (byte) -1;
                break;
            case 99146302:
                b7 = str.equals("S_HDMV/PGS") ? (byte) 32 : (byte) -1;
                break;
            case 444813526:
                b7 = str.equals("V_THEORA") ? (byte) 10 : (byte) -1;
                break;
            case 542569478:
                b7 = str.equals("A_DTS/EXPRESS") ? (byte) 20 : (byte) -1;
                break;
            case 635596514:
                b7 = str.equals("A_PCM/FLOAT/IEEE") ? (byte) 26 : (byte) -1;
                break;
            case 725948237:
                b7 = str.equals("A_PCM/INT/BIG") ? (byte) 25 : (byte) -1;
                break;
            case 725957860:
                b7 = str.equals("A_PCM/INT/LIT") ? (byte) 24 : (byte) -1;
                break;
            case 738597099:
                b7 = str.equals("S_TEXT/ASS") ? (byte) 28 : (byte) -1;
                break;
            case 738614379:
                b7 = str.equals("S_TEXT/SSA") ? (byte) 29 : (byte) -1;
                break;
            case 855502857:
                b7 = str.equals("V_MPEGH/ISO/HEVC") ? (byte) 8 : (byte) -1;
                break;
            case 1045209816:
                b7 = str.equals("S_TEXT/WEBVTT") ? (byte) 30 : (byte) -1;
                break;
            case 1422270023:
                b7 = str.equals("S_TEXT/UTF8") ? (byte) 27 : (byte) -1;
                break;
            case 1809237540:
                b7 = str.equals("V_MPEG2") ? (byte) 3 : (byte) -1;
                break;
            case 1950749482:
                b7 = str.equals("A_EAC3") ? (byte) 17 : (byte) -1;
                break;
            case 1950789798:
                b7 = str.equals("A_FLAC") ? (byte) 22 : (byte) -1;
                break;
            case 1951062397:
                b7 = str.equals("A_OPUS") ? (byte) 11 : (byte) -1;
                break;
            default:
                b7 = -1;
                break;
        }
        switch (b7) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case zzbbn.zzt.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                zzagyVar4.zza(zzacxVar, zzagyVar4.zzd);
                this.zzi.put(zzagyVar4.zzd, zzagyVar4);
                break;
        }
        this.zzE = null;
    }

    protected final void zzc(int i7, long j7) throws zzas {
        boolean z7;
        if (i7 == 20529) {
            if (j7 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j7);
            sb.append(" not supported");
            throw zzas.zzb(sb.toString(), null);
        }
        if (i7 == 20530) {
            if (j7 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j7).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j7);
            sb2.append(" not supported");
            throw zzas.zzb(sb2.toString(), null);
        }
        switch (i7) {
            case 131:
                zzp(i7);
                this.zzE.zze = (int) j7;
                return;
            case 136:
                z7 = j7 == 1;
                zzp(i7);
                this.zzE.zzX = z7;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.zzS = zzy(j7);
                return;
            case 159:
                zzp(i7);
                this.zzE.zzP = (int) j7;
                return;
            case 176:
                zzp(i7);
                this.zzE.zzm = (int) j7;
                return;
            case 179:
                zzq(i7);
                this.zzM.zza(zzy(j7));
                return;
            case 186:
                zzp(i7);
                this.zzE.zzn = (int) j7;
                return;
            case 215:
                zzp(i7);
                this.zzE.zzd = (int) j7;
                return;
            case 231:
                this.zzL = zzy(j7);
                return;
            case 238:
                this.zzZ = (int) j7;
                return;
            case 241:
                if (this.zzO) {
                    return;
                }
                zzq(i7);
                this.zzN.zza(j7);
                this.zzO = true;
                return;
            case 251:
                this.zzaa = true;
                return;
            case 16871:
                zzp(i7);
                this.zzE.zzd((int) j7);
                return;
            case 16980:
                if (j7 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j7).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j7);
                sb3.append(" not supported");
                throw zzas.zzb(sb3.toString(), null);
            case 17029:
                if (j7 < 1 || j7 > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j7).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j7);
                    sb4.append(" not supported");
                    throw zzas.zzb(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j7 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j7).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j7);
                sb5.append(" not supported");
                throw zzas.zzb(sb5.toString(), null);
            case 18401:
                if (j7 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j7).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j7);
                sb6.append(" not supported");
                throw zzas.zzb(sb6.toString(), null);
            case 18408:
                if (j7 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j7).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j7);
                sb7.append(" not supported");
                throw zzas.zzb(sb7.toString(), null);
            case 21420:
                this.zzH = j7 + this.zzy;
                return;
            case 21432:
                int i8 = (int) j7;
                zzp(i7);
                if (i8 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i8 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i8 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i8 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzp(i7);
                this.zzE.zzp = (int) j7;
                return;
            case 21682:
                zzp(i7);
                this.zzE.zzr = (int) j7;
                return;
            case 21690:
                zzp(i7);
                this.zzE.zzq = (int) j7;
                return;
            case 21930:
                z7 = j7 == 1;
                zzp(i7);
                this.zzE.zzW = z7;
                return;
            case 21938:
                zzp(i7);
                zzagy zzagyVar = this.zzE;
                zzagyVar.zzy = true;
                zzagyVar.zzo = (int) j7;
                return;
            case 21998:
                zzp(i7);
                this.zzE.zzg = (int) j7;
                return;
            case 22186:
                zzp(i7);
                this.zzE.zzS = j7;
                return;
            case 22203:
                zzp(i7);
                this.zzE.zzT = j7;
                return;
            case 25188:
                zzp(i7);
                this.zzE.zzQ = (int) j7;
                return;
            case 30114:
                this.zzab = j7;
                return;
            case 30321:
                int i9 = (int) j7;
                zzp(i7);
                if (i9 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i9 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i9 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i9 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzp(i7);
                this.zzE.zzf = (int) j7;
                return;
            case 2807729:
                this.zzz = j7;
                return;
            default:
                switch (i7) {
                    case 21945:
                        int i10 = (int) j7;
                        zzp(i7);
                        if (i10 == 1) {
                            this.zzE.zzB = 2;
                            return;
                        } else {
                            if (i10 != 2) {
                                return;
                            }
                            this.zzE.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzp(i7);
                        int iZzc = zzh.zzc((int) j7);
                        if (iZzc != -1) {
                            this.zzE.zzA = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzp(i7);
                        this.zzE.zzy = true;
                        int iZzb = zzh.zzb((int) j7);
                        if (iZzb != -1) {
                            this.zzE.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzp(i7);
                        this.zzE.zzC = (int) j7;
                        return;
                    case 21949:
                        zzp(i7);
                        this.zzE.zzD = (int) j7;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) {
        return new zzaha().zza(zzacvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        if (this.zzk) {
            zzacxVar = new zzajw(zzacxVar, this.zzl);
        }
        this.zzal = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) {
        int i7 = 0;
        this.zzP = false;
        while (!this.zzP) {
            if (this.zzam.zzc(zzacvVar)) {
                long jZzn = zzacvVar.zzn();
                if (this.zzI) {
                    this.zzK = jZzn;
                    zzadsVar.zza = this.zzJ;
                    this.zzI = false;
                    return 1;
                }
                if (this.zzF) {
                    long j7 = this.zzK;
                    if (j7 != -1) {
                        zzadsVar.zza = j7;
                        this.zzK = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i7 >= sparseArray.size()) {
                        return -1;
                    }
                    zzagy zzagyVar = (zzagy) sparseArray.valueAt(i7);
                    zzagyVar.zzb();
                    zzaec zzaecVar = zzagyVar.zzU;
                    if (zzaecVar != null) {
                        zzaecVar.zzd(zzagyVar.zzY, zzagyVar.zzj);
                    }
                    i7++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        this.zzL = -9223372036854775807L;
        int i7 = 0;
        this.zzQ = 0;
        this.zzam.zzb();
        this.zzh.zza();
        zzu();
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i7 >= sparseArray.size()) {
                return;
            }
            zzaec zzaecVar = ((zzagy) sparseArray.valueAt(i7)).zzU;
            if (zzaecVar != null) {
                zzaecVar.zza();
            }
            i7++;
        }
    }

    protected final void zzj(int i7, double d7) throws zzas {
        if (i7 == 181) {
            zzp(i7);
            this.zzE.zzR = (int) d7;
            return;
        }
        if (i7 == 17545) {
            this.zzA = (long) d7;
            return;
        }
        switch (i7) {
            case 21969:
                zzp(i7);
                this.zzE.zzE = (float) d7;
                break;
            case 21970:
                zzp(i7);
                this.zzE.zzF = (float) d7;
                break;
            case 21971:
                zzp(i7);
                this.zzE.zzG = (float) d7;
                break;
            case 21972:
                zzp(i7);
                this.zzE.zzH = (float) d7;
                break;
            case 21973:
                zzp(i7);
                this.zzE.zzI = (float) d7;
                break;
            case 21974:
                zzp(i7);
                this.zzE.zzJ = (float) d7;
                break;
            case 21975:
                zzp(i7);
                this.zzE.zzK = (float) d7;
                break;
            case 21976:
                zzp(i7);
                this.zzE.zzL = (float) d7;
                break;
            case 21977:
                zzp(i7);
                this.zzE.zzM = (float) d7;
                break;
            case 21978:
                zzp(i7);
                this.zzE.zzN = (float) d7;
                break;
            default:
                switch (i7) {
                    case 30323:
                        zzp(i7);
                        this.zzE.zzt = (float) d7;
                        break;
                    case 30324:
                        zzp(i7);
                        this.zzE.zzu = (float) d7;
                        break;
                    case 30325:
                        zzp(i7);
                        this.zzE.zzv = (float) d7;
                        break;
                }
                break;
        }
    }

    protected final void zzk(int i7, String str) throws zzas {
        if (i7 == 134) {
            zzp(i7);
            this.zzE.zzc = str;
            return;
        }
        if (i7 != 17026) {
            if (i7 == 21358) {
                zzp(i7);
                this.zzE.zzb = str;
                return;
            } else {
                if (i7 != 2274716) {
                    return;
                }
                zzp(i7);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw zzas.zzb(sb.toString(), null);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:119:0x02bc  */
    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzl(int i7, int i8, zzacv zzacvVar) throws zzas {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j7;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i7;
        int i19 = 1;
        int i20 = 0;
        if (i18 != 161 && i18 != 163) {
            if (i18 == 165) {
                if (this.zzQ != 2) {
                    return;
                }
                zzagy zzagyVar = (zzagy) this.zzi.get(this.zzW);
                if (this.zzZ != 4 || !"V_VP9".equals(zzagyVar.zzc)) {
                    zzacvVar.zzf(i8);
                    return;
                }
                zzef zzefVar = this.zzv;
                zzefVar.zza(i8);
                zzacvVar.zzc(zzefVar.zzi(), 0, i8);
                return;
            }
            if (i18 == 16877) {
                zzp(i7);
                zzagy zzagyVar2 = this.zzE;
                if (zzagyVar2.zzc() != 1685485123 && zzagyVar2.zzc() != 1685480259) {
                    zzacvVar.zzf(i8);
                    return;
                }
                byte[] bArr = new byte[i8];
                zzagyVar2.zzO = bArr;
                zzacvVar.zzc(bArr, 0, i8);
                return;
            }
            if (i18 == 16981) {
                zzp(i7);
                byte[] bArr2 = new byte[i8];
                this.zzE.zzi = bArr2;
                zzacvVar.zzc(bArr2, 0, i8);
                return;
            }
            if (i18 == 18402) {
                byte[] bArr3 = new byte[i8];
                zzacvVar.zzc(bArr3, 0, i8);
                zzp(i7);
                this.zzE.zzj = new zzaea(1, bArr3, 0, 0);
                return;
            }
            if (i18 == 21419) {
                zzef zzefVar2 = this.zzq;
                Arrays.fill(zzefVar2.zzi(), (byte) 0);
                zzacvVar.zzc(zzefVar2.zzi(), 4 - i8, i8);
                zzefVar2.zzh(0);
                this.zzG = (int) zzefVar2.zzz();
                return;
            }
            if (i18 == 25506) {
                zzp(i7);
                byte[] bArr4 = new byte[i8];
                this.zzE.zzk = bArr4;
                zzacvVar.zzc(bArr4, 0, i8);
                return;
            }
            if (i18 != 30322) {
                StringBuilder sb = new StringBuilder(String.valueOf(i18).length() + 15);
                sb.append("Unexpected id: ");
                sb.append(i18);
                throw zzas.zzb(sb.toString(), null);
            }
            zzp(i7);
            byte[] bArr5 = new byte[i8];
            this.zzE.zzw = bArr5;
            zzacvVar.zzc(bArr5, 0, i8);
            return;
        }
        int i21 = 8;
        if (this.zzQ == 0) {
            zzahb zzahbVar = this.zzh;
            this.zzW = (int) zzahbVar.zzb(zzacvVar, false, true, 8);
            this.zzX = zzahbVar.zzc();
            this.zzS = -9223372036854775807L;
            this.zzQ = 1;
            this.zzo.zza(0);
        }
        zzagy zzagyVar3 = (zzagy) this.zzi.get(this.zzW);
        if (zzagyVar3 == null) {
            zzacvVar.zzf(i8 - this.zzX);
            this.zzQ = 0;
            return;
        }
        zzagyVar3.zzb();
        if (this.zzQ == 1) {
            zzs(zzacvVar, 3);
            zzef zzefVar3 = this.zzo;
            int i22 = (zzefVar3.zzi()[2] & 6) >> 1;
            if (i22 == 0) {
                this.zzU = 1;
                int[] iArrZzz = zzz(this.zzV, 1);
                this.zzV = iArrZzz;
                iArrZzz[0] = (i8 - this.zzX) - 3;
            } else {
                zzs(zzacvVar, 4);
                int i23 = (zzefVar3.zzi()[3] & 255) + 1;
                this.zzU = i23;
                int[] iArrZzz2 = zzz(this.zzV, i23);
                this.zzV = iArrZzz2;
                if (i22 == 2) {
                    int i24 = (i8 - this.zzX) - 4;
                    int i25 = this.zzU;
                    Arrays.fill(iArrZzz2, 0, i25, i24 / i25);
                } else {
                    if (i22 == 1) {
                        int i26 = 0;
                        int i27 = 0;
                        int i28 = 4;
                        while (true) {
                            i14 = this.zzU - 1;
                            if (i26 >= i14) {
                                break;
                            }
                            this.zzV[i26] = 0;
                            while (true) {
                                i15 = i28 + 1;
                                zzs(zzacvVar, i15);
                                int i29 = zzefVar3.zzi()[i28] & 255;
                                int[] iArr = this.zzV;
                                i16 = iArr[i26] + i29;
                                iArr[i26] = i16;
                                if (i29 != 255) {
                                    break;
                                } else {
                                    i28 = i15;
                                }
                            }
                            i27 += i16;
                            i26++;
                            i28 = i15;
                        }
                        this.zzV[i14] = ((i8 - this.zzX) - i28) - i27;
                    } else {
                        if (i22 != 3) {
                            throw zzas.zzb("Unexpected lacing value: 2", null);
                        }
                        int i30 = 0;
                        int i31 = 0;
                        int i32 = 4;
                        while (true) {
                            int i33 = this.zzU - 1;
                            if (i30 >= i33) {
                                i9 = i19;
                                i11 = i20;
                                this.zzV[i33] = ((i8 - this.zzX) - i32) - i31;
                                break;
                            }
                            this.zzV[i30] = i20;
                            int i34 = i32 + 1;
                            zzs(zzacvVar, i34);
                            if (zzefVar3.zzi()[i32] == 0) {
                                throw zzas.zzb("No valid varint length mask found", null);
                            }
                            int i35 = i19;
                            int i36 = i20;
                            while (true) {
                                if (i36 >= i21) {
                                    i12 = i20;
                                    i13 = i21;
                                    j7 = 0;
                                    break;
                                }
                                i13 = i21;
                                int i37 = i35 << (7 - i36);
                                if ((zzefVar3.zzi()[i32] & i37) != 0) {
                                    i34 += i36;
                                    zzs(zzacvVar, i34);
                                    i12 = i20;
                                    j7 = zzefVar3.zzi()[i32] & 255 & (~i37);
                                    int i38 = i32 + 1;
                                    while (i38 < i34) {
                                        j7 = (j7 << i13) | ((long) (zzefVar3.zzi()[i38] & 255));
                                        i38++;
                                        i36 = i36;
                                    }
                                    int i39 = i36;
                                    if (i30 <= 0) {
                                        break;
                                    }
                                    j7 -= (1 << ((i39 * 7) + 6)) - 1;
                                    break;
                                }
                                i36++;
                                i21 = i13;
                            }
                            i32 = i34;
                            if (j7 < -2147483648L || j7 > 2147483647L) {
                                throw zzas.zzb("EBML lacing sample size out of range.", null);
                            }
                            int[] iArr2 = this.zzV;
                            int i40 = (int) j7;
                            if (i30 != 0) {
                                i40 += iArr2[i30 - 1];
                            }
                            iArr2[i30] = i40;
                            i31 += i40;
                            i30++;
                            i19 = i35;
                            i20 = i12;
                            i21 = i13;
                        }
                    }
                    this.zzR = this.zzL + zzy((zzefVar3.zzi()[i11] << 8) | (zzefVar3.zzi()[i9] & 255));
                    if (zzagyVar3.zze != 2) {
                        i17 = i9;
                    } else if (i18 == 163) {
                        if ((zzefVar3.zzi()[2] & 128) == 128) {
                            i17 = i9;
                        } else {
                            i17 = i11;
                        }
                        i18 = 163;
                    } else {
                        i17 = i11;
                    }
                    this.zzY = i17;
                    this.zzQ = 2;
                    this.zzT = i11;
                    i10 = 163;
                }
            }
            i9 = 1;
            i11 = 0;
            this.zzR = this.zzL + zzy((zzefVar3.zzi()[i11] << 8) | (zzefVar3.zzi()[i9] & 255));
            if (zzagyVar3.zze != 2) {
                i17 = i9;
            } else if (i18 == 163) {
                if ((zzefVar3.zzi()[2] & 128) == 128) {
                    i17 = i9;
                } else {
                    i17 = i11;
                }
                i18 = 163;
            } else {
                i17 = i11;
            }
            this.zzY = i17;
            this.zzQ = 2;
            this.zzT = i11;
            i10 = 163;
        } else {
            i9 = 1;
            i10 = 163;
        }
        if (i18 == i10) {
            while (true) {
                int i41 = this.zzT;
                if (i41 >= this.zzU) {
                    this.zzQ = 0;
                    return;
                }
                int iZzt = zzt(zzacvVar, zzagyVar3, this.zzV[i41], false);
                zzagy zzagyVar4 = zzagyVar3;
                zzr(zzagyVar4, this.zzR + ((long) ((this.zzT * zzagyVar3.zzf) / zzbbn.zzq.zzf)), this.zzY, iZzt, 0);
                this.zzT++;
                zzagyVar3 = zzagyVar4;
            }
        } else {
            while (true) {
                int i42 = this.zzT;
                if (i42 >= this.zzU) {
                    return;
                }
                int[] iArr3 = this.zzV;
                boolean z7 = i9;
                iArr3[i42] = zzt(zzacvVar, zzagyVar3, iArr3[i42], z7);
                this.zzT += z7 ? 1 : 0;
            }
        }
    }

    zzagz(zzagu zzaguVar, int i7, zzajt zzajtVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzJ = -1L;
        this.zzK = -1L;
        this.zzL = -9223372036854775807L;
        this.zzam = zzaguVar;
        zzaguVar.zza(new zzagw(this, null));
        this.zzl = zzajtVar;
        this.zzj = 1 == ((i7 & 1) ^ 1);
        this.zzk = (i7 & 2) == 0;
        this.zzh = new zzahb();
        this.zzi = new SparseArray();
        this.zzo = new zzef(4);
        this.zzp = new zzef(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzef(4);
        this.zzm = new zzef(zzfl.zza);
        this.zzn = new zzef(4);
        this.zzr = new zzef();
        this.zzs = new zzef();
        this.zzt = new zzef(8);
        this.zzu = new zzef();
        this.zzv = new zzef();
        this.zzV = new int[1];
        this.zzD = true;
    }

    public zzagz(zzajt zzajtVar, int i7) {
        this(new zzagu(), 0, zzajtVar);
    }
}
