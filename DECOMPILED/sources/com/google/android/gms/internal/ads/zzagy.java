package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagy {
    public byte[] zzO;
    public zzaec zzU;
    public boolean zzW;
    public zzaeb zzY;
    public zzu zzZ;
    public boolean zza;
    public int zzaa;
    private int zzab;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzaea zzj;
    public byte[] zzk;
    public zzp zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = zzbbn.zzq.zzf;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzV = false;
    public boolean zzX = true;
    private String zzac = "eng";

    protected zzagy() {
    }

    private static Pair zzf(zzef zzefVar) throws zzas {
        try {
            zzefVar.zzk(16);
            long jZzA = zzefVar.zzA();
            if (jZzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzA != 826496599) {
                zzds.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzg = zzefVar.zzg() + 20;
            byte[] bArrZzi = zzefVar.zzi();
            while (true) {
                int length = bArrZzi.length;
                if (iZzg >= length - 4) {
                    throw zzas.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i7 = iZzg + 1;
                if (bArrZzi[iZzg] == 0 && bArrZzi[i7] == 0 && bArrZzi[iZzg + 2] == 1 && bArrZzi[iZzg + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzi, iZzg, length)));
                }
                iZzg = i7;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzas.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzas {
        int i7;
        int i8;
        try {
            if (bArr[0] != 2) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            int i9 = 0;
            int i10 = 1;
            while (true) {
                int i11 = bArr[i10];
                i10++;
                i7 = i11 & 255;
                if (i7 != 255) {
                    break;
                }
                i9 += 255;
            }
            int i12 = i9 + i7;
            int i13 = 0;
            while (true) {
                int i14 = bArr[i10];
                i10++;
                i8 = i14 & 255;
                if (i8 != 255) {
                    break;
                }
                i13 += 255;
            }
            int i15 = i13 + i8;
            if (bArr[i10] != 1) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i10, bArr2, 0, i12);
            int i16 = i10 + i12;
            if (bArr[i16] != 3) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            int i17 = i16 + i15;
            if (bArr[i17] != 5) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i17;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i17, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzas.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzef zzefVar) throws zzas {
        try {
            int iZzu = zzefVar.zzu();
            if (iZzu == 1) {
                return true;
            }
            if (iZzu == 65534) {
                zzefVar.zzh(24);
                if (zzefVar.zzD() == zzagz.zzf.getMostSignificantBits() && zzefVar.zzD() == zzagz.zzf.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzas.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzas {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzas.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x019e  */
    /* JADX WARN: Code duplicated, block: B:125:0x01fc A[PHI: r13
      0x01fc: PHI (r13v8 int) = (r13v2 int), (r13v3 int), (r13v4 int), (r13v5 int), (r13v6 int), (r13v0 int) binds: [B:146:0x02af, B:141:0x0270, B:138:0x0243, B:136:0x023e, B:133:0x0237, B:124:0x01fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:188:0x0415  */
    /* JADX WARN: Code duplicated, block: B:193:0x042f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0431  */
    /* JADX WARN: Code duplicated, block: B:197:0x043e  */
    /* JADX WARN: Code duplicated, block: B:198:0x044e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0454  */
    /* JADX WARN: Code duplicated, block: B:202:0x0458  */
    /* JADX WARN: Code duplicated, block: B:204:0x045d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0465  */
    /* JADX WARN: Code duplicated, block: B:209:0x046a  */
    /* JADX WARN: Code duplicated, block: B:212:0x0471  */
    /* JADX WARN: Code duplicated, block: B:215:0x047f  */
    /* JADX WARN: Code duplicated, block: B:218:0x0484  */
    /* JADX WARN: Code duplicated, block: B:220:0x048a  */
    /* JADX WARN: Code duplicated, block: B:238:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:241:0x0562  */
    /* JADX WARN: Code duplicated, block: B:244:0x0567  */
    /* JADX WARN: Code duplicated, block: B:247:0x0582  */
    /* JADX WARN: Code duplicated, block: B:250:0x0587  */
    /* JADX WARN: Code duplicated, block: B:268:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:270:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:272:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:287:0x0624  */
    /* JADX WARN: Code duplicated, block: B:292:0x063d  */
    /* JADX WARN: Code duplicated, block: B:293:0x0640  */
    /* JADX WARN: Code duplicated, block: B:296:0x0672  */
    /* JADX WARN: Code duplicated, block: B:298:? A[RETURN, SYNTHETIC] */
    public final void zza(zzacx zzacxVar, int i7) {
        byte b7;
        List listZzj;
        List list;
        String str;
        String str2;
        int i8;
        String str3;
        int i9;
        zzs zzsVar;
        int i10;
        int i11;
        int i12;
        float f7;
        zzh zzhVarZzg;
        String str4;
        int iIntValue;
        byte[] bArr;
        int i13;
        int i14;
        int i15;
        String str5;
        String str6;
        zzaeb zzaebVarZzu;
        zzeq zzeqVarZza;
        String str7 = this.zzc;
        int iZzz = 4;
        int i16 = 0;
        switch (str7) {
            case "V_MPEG4/ISO/AP":
                b7 = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b7 = 4;
                break;
            case "A_MS/ACM":
                b7 = 23;
                break;
            case "A_TRUEHD":
                b7 = 18;
                break;
            case "A_VORBIS":
                b7 = 11;
                break;
            case "A_MPEG/L2":
                b7 = 14;
                break;
            case "A_MPEG/L3":
                b7 = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b7 = 9;
                break;
            case "S_DVBSUB":
                b7 = 33;
                break;
            case "V_MPEG4/ISO/ASP":
                b7 = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b7 = 7;
                break;
            case "S_VOBSUB":
                b7 = 31;
                break;
            case "A_DTS/LOSSLESS":
                b7 = 21;
                break;
            case "A_AAC":
                b7 = 13;
                break;
            case "A_AC3":
                b7 = 16;
                break;
            case "A_DTS":
                b7 = 19;
                break;
            case "V_AV1":
                b7 = 2;
                break;
            case "V_VP8":
                b7 = 0;
                break;
            case "V_VP9":
                b7 = 1;
                break;
            case "S_HDMV/PGS":
                b7 = 32;
                break;
            case "V_THEORA":
                b7 = 10;
                break;
            case "A_DTS/EXPRESS":
                b7 = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b7 = 26;
                break;
            case "A_PCM/INT/BIG":
                b7 = 25;
                break;
            case "A_PCM/INT/LIT":
                b7 = 24;
                break;
            case "S_TEXT/ASS":
                b7 = 28;
                break;
            case "S_TEXT/SSA":
                b7 = 29;
                break;
            case "V_MPEGH/ISO/HEVC":
                b7 = 8;
                break;
            case "S_TEXT/WEBVTT":
                b7 = 30;
                break;
            case "S_TEXT/UTF8":
                b7 = 27;
                break;
            case "V_MPEG2":
                b7 = 3;
                break;
            case "A_EAC3":
                b7 = 17;
                break;
            case "A_FLAC":
                b7 = 22;
                break;
            case "A_OPUS":
                b7 = 12;
                break;
            default:
                b7 = -1;
                break;
        }
        String str8 = "audio/raw";
        switch (b7) {
            case 0:
                str8 = "video/x-vnd.on2.vp8";
                listZzj = null;
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null && (zzeqVarZza = zzeq.zza(new zzef(this.zzO))) != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z7 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i17 = i9 | (z7 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                } else if (zzar.zzb(str3)) {
                    if (this.zzr == 0) {
                        i14 = this.zzp;
                        i11 = -1;
                        if (i14 == -1) {
                            i14 = this.zzm;
                        }
                        this.zzp = i14;
                        i15 = this.zzq;
                        if (i15 == -1) {
                            i15 = this.zzn;
                        }
                        this.zzq = i15;
                    } else {
                        i11 = -1;
                    }
                    i12 = this.zzp;
                    if (i12 != i11 || (i13 = this.zzq) == i11) {
                        f7 = -1.0f;
                    } else {
                        f7 = (this.zzn * i12) / (this.zzm * i13);
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f || this.zzN == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder.putShort((short) this.zzC);
                            byteBufferOrder.putShort((short) this.zzD);
                        }
                        zzg zzgVar = new zzg();
                        zzgVar.zza(this.zzz);
                        zzgVar.zzb(this.zzB);
                        zzgVar.zzc(this.zzA);
                        zzgVar.zzd(bArr);
                        zzgVar.zze(this.zzo);
                        zzgVar.zzf(this.zzo);
                        zzhVarZzg = zzgVar.zzg();
                    } else {
                        zzhVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 == null && zzagz.zzg.containsKey(str4)) {
                        iIntValue = ((Integer) zzagz.zzg.get(this.zzb)).intValue();
                    } else {
                        iIntValue = i11;
                    }
                    if (this.zzs == 0 || Float.compare(this.zzt, 0.0f) != 0 || Float.compare(this.zzu, 0.0f) != 0) {
                        i16 = iIntValue;
                    } else if (Float.compare(this.zzv, 0.0f) != 0) {
                        if (Float.compare(this.zzv, 90.0f) == 0) {
                            i16 = 90;
                        } else if (Float.compare(this.zzv, -180.0f) == 0 || Float.compare(this.zzv, 180.0f) == 0) {
                            i16 = 180;
                        } else if (Float.compare(this.zzv, -90.0f) == 0) {
                            i16 = 270;
                        } else {
                            i16 = iIntValue;
                        }
                    }
                    zzsVar.zzt(this.zzm);
                    zzsVar.zzu(this.zzn);
                    zzsVar.zzz(f7);
                    zzsVar.zzy(i16);
                    zzsVar.zzA(this.zzw);
                    zzsVar.zzB(this.zzx);
                    zzsVar.zzC(zzhVarZzg);
                    i10 = 2;
                } else {
                    if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzas.zzb("Unexpected MIME type.", null);
                    }
                    i10 = 3;
                }
                str5 = this.zzb;
                if (str5 != null && !zzagz.zzg.containsKey(str5)) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i17);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    return;
                }
                zzaebVarZzu.zzu(this.zzZ);
                return;
            case 1:
                byte[] bArr2 = this.zzk;
                listZzj = bArr2 == null ? null : zzgjz.zzj(bArr2);
                str8 = "video/x-vnd.on2.vp9";
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z8 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i18 = i9 | (z8 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar2 = new zzg();
                            zzgVar2.zza(this.zzz);
                            zzgVar2.zzb(this.zzB);
                            zzgVar2.zzc(this.zzA);
                            zzgVar2.zzd(bArr);
                            zzgVar2.zze(this.zzo);
                            zzgVar2.zzf(this.zzo);
                            zzhVarZzg = zzgVar2.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i18);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 2:
                byte[] bArr3 = this.zzk;
                listZzj = bArr3 == null ? null : zzgjz.zzj(bArr3);
                str8 = "video/av01";
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z9 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i19 = i9 | (z9 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar3 = new zzg();
                            zzgVar3.zza(this.zzz);
                            zzgVar3.zzb(this.zzB);
                            zzgVar3.zzc(this.zzA);
                            zzgVar3.zzd(bArr);
                            zzgVar3.zze(this.zzo);
                            zzgVar3.zzf(this.zzo);
                            zzhVarZzg = zzgVar3.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i19);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 3:
                str8 = "video/mpeg2";
                listZzj = null;
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z10 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i110 = i9 | (z10 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar4 = new zzg();
                            zzgVar4.zza(this.zzz);
                            zzgVar4.zzb(this.zzB);
                            zzgVar4.zzc(this.zzA);
                            zzgVar4.zzd(bArr);
                            zzgVar4.zze(this.zzo);
                            zzgVar4.zzf(this.zzo);
                            zzhVarZzg = zzgVar4.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i110);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr4 = this.zzk;
                listZzj = bArr4 == null ? null : Collections.singletonList(bArr4);
                str8 = "video/mp4v-es";
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z11 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i111 = i9 | (z11 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar5 = new zzg();
                            zzgVar5.zza(this.zzz);
                            zzgVar5.zzb(this.zzB);
                            zzgVar5.zzc(this.zzA);
                            zzgVar5.zzd(bArr);
                            zzgVar5.zze(this.zzo);
                            zzgVar5.zzf(this.zzo);
                            zzhVarZzg = zzgVar5.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i111);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 7:
                zzabz zzabzVarZza = zzabz.zza(new zzef(zzi(this.zzc)));
                list = zzabzVarZza.zza;
                this.zzaa = zzabzVarZza.zzb;
                str = zzabzVarZza.zzl;
                str8 = "video/avc";
                str2 = str;
                listZzj = list;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z12 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i112 = i9 | (z12 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar6 = new zzg();
                            zzgVar6.zza(this.zzz);
                            zzgVar6.zzb(this.zzB);
                            zzgVar6.zzc(this.zzA);
                            zzgVar6.zzd(bArr);
                            zzgVar6.zze(this.zzo);
                            zzgVar6.zzf(this.zzo);
                            zzhVarZzg = zzgVar6.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i112);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 8:
                zzadl zzadlVarZza = zzadl.zza(new zzef(zzi(this.zzc)));
                list = zzadlVarZza.zza;
                this.zzaa = zzadlVarZza.zzb;
                str = zzadlVarZza.zzn;
                str8 = "video/hevc";
                str2 = str;
                listZzj = list;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z13 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i113 = i9 | (z13 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar7 = new zzg();
                            zzgVar7.zza(this.zzz);
                            zzgVar7.zzb(this.zzB);
                            zzgVar7.zzc(this.zzA);
                            zzgVar7.zzd(bArr);
                            zzgVar7.zze(this.zzo);
                            zzgVar7.zzf(this.zzo);
                            zzhVarZzg = zzgVar7.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i113);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 9:
                Pair pairZzf = zzf(new zzef(zzi(this.zzc)));
                str8 = (String) pairZzf.first;
                listZzj = (List) pairZzf.second;
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z14 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i114 = i9 | (z14 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar8 = new zzg();
                            zzgVar8.zza(this.zzz);
                            zzgVar8.zzb(this.zzB);
                            zzgVar8.zzc(this.zzA);
                            zzgVar8.zzd(bArr);
                            zzgVar8.zze(this.zzo);
                            zzgVar8.zzf(this.zzo);
                            zzhVarZzg = zzgVar8.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i114);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 10:
                str8 = "video/x-unknown";
                listZzj = null;
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z15 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i115 = i9 | (z15 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar9 = new zzg();
                            zzgVar9.zza(this.zzz);
                            zzgVar9.zzb(this.zzB);
                            zzgVar9.zzc(this.zzA);
                            zzgVar9.zzd(bArr);
                            zzgVar9.zze(this.zzo);
                            zzgVar9.zzf(this.zzo);
                            zzhVarZzg = zzgVar9.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i115);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 11:
                listZzj = zzg(zzi(str7));
                i8 = 8192;
                str8 = "audio/vorbis";
                str2 = null;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z16 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i116 = i9 | (z16 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar10 = new zzg();
                            zzgVar10.zza(this.zzz);
                            zzgVar10.zzb(this.zzB);
                            zzgVar10.zzc(this.zzA);
                            zzgVar10.zzd(bArr);
                            zzgVar10.zze(this.zzo);
                            zzgVar10.zzf(this.zzo);
                            zzhVarZzg = zzgVar10.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i116);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 12:
                listZzj = new ArrayList(3);
                listZzj.add(zzi(this.zzc));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                listZzj.add(byteBufferAllocate.order(byteOrder).putLong(this.zzS).array());
                listZzj.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzT).array());
                i8 = 5760;
                str8 = "audio/opus";
                str2 = null;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z17 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i117 = i9 | (z17 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar11 = new zzg();
                            zzgVar11.zza(this.zzz);
                            zzgVar11.zzb(this.zzB);
                            zzgVar11.zzc(this.zzA);
                            zzgVar11.zzd(bArr);
                            zzgVar11.zze(this.zzo);
                            zzgVar11.zzf(this.zzo);
                            zzhVarZzg = zzgVar11.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i117);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 13:
                listZzj = Collections.singletonList(zzi(str7));
                zzabs zzabsVarZza = zzabt.zza(this.zzk);
                this.zzR = zzabsVarZza.zza;
                this.zzP = zzabsVarZza.zzb;
                str8 = "audio/mp4a-latm";
                str2 = zzabsVarZza.zzc;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z18 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i118 = i9 | (z18 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar12 = new zzg();
                            zzgVar12.zza(this.zzz);
                            zzgVar12.zzb(this.zzB);
                            zzgVar12.zzc(this.zzA);
                            zzgVar12.zzd(bArr);
                            zzgVar12.zze(this.zzo);
                            zzgVar12.zzf(this.zzo);
                            zzhVarZzg = zzgVar12.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i118);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 14:
                str8 = "audio/mpeg-L2";
                listZzj = null;
                str2 = null;
                i8 = 4096;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z19 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i119 = i9 | (z19 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar13 = new zzg();
                            zzgVar13.zza(this.zzz);
                            zzgVar13.zzb(this.zzB);
                            zzgVar13.zzc(this.zzA);
                            zzgVar13.zzd(bArr);
                            zzgVar13.zze(this.zzo);
                            zzgVar13.zzf(this.zzo);
                            zzhVarZzg = zzgVar13.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i119);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 15:
                str8 = "audio/mpeg";
                listZzj = null;
                str2 = null;
                i8 = 4096;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z110 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i1110 = i9 | (z110 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar14 = new zzg();
                            zzgVar14.zza(this.zzz);
                            zzgVar14.zzb(this.zzB);
                            zzgVar14.zzc(this.zzA);
                            zzgVar14.zzd(bArr);
                            zzgVar14.zze(this.zzo);
                            zzgVar14.zzf(this.zzo);
                            zzhVarZzg = zzgVar14.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i1110);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 16:
                str8 = "audio/ac3";
                listZzj = null;
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z111 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i1111 = i9 | (z111 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar15 = new zzg();
                            zzgVar15.zza(this.zzz);
                            zzgVar15.zzb(this.zzB);
                            zzgVar15.zzc(this.zzA);
                            zzgVar15.zzd(bArr);
                            zzgVar15.zze(this.zzo);
                            zzgVar15.zzf(this.zzo);
                            zzhVarZzg = zzgVar15.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i1111);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 17:
                str8 = "audio/eac3";
                listZzj = null;
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z112 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i1112 = i9 | (z112 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar16 = new zzg();
                            zzgVar16.zza(this.zzz);
                            zzgVar16.zzb(this.zzB);
                            zzgVar16.zzc(this.zzA);
                            zzgVar16.zzd(bArr);
                            zzgVar16.zze(this.zzo);
                            zzgVar16.zzf(this.zzo);
                            zzhVarZzg = zzgVar16.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i1112);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 18:
                this.zzU = new zzaec();
                str8 = "audio/true-hd";
                listZzj = null;
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z113 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i1113 = i9 | (z113 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar17 = new zzg();
                            zzgVar17.zza(this.zzz);
                            zzgVar17.zzb(this.zzB);
                            zzgVar17.zzc(this.zzA);
                            zzgVar17.zzd(bArr);
                            zzgVar17.zze(this.zzo);
                            zzgVar17.zzf(this.zzo);
                            zzhVarZzg = zzgVar17.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i1113);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 19:
            case 20:
                this.zzV = true;
                str8 = "audio/vnd.dts";
                listZzj = null;
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z114 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i1114 = i9 | (z114 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar18 = new zzg();
                            zzgVar18.zza(this.zzz);
                            zzgVar18.zzb(this.zzB);
                            zzgVar18.zzc(this.zzA);
                            zzgVar18.zzd(bArr);
                            zzgVar18.zze(this.zzo);
                            zzgVar18.zzf(this.zzo);
                            zzhVarZzg = zzgVar18.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i1114);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case zzbbn.zzt.zzm /* 21 */:
                str8 = "audio/vnd.dts.hd";
                listZzj = null;
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z115 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i1115 = i9 | (z115 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar19 = new zzg();
                            zzgVar19.zza(this.zzz);
                            zzgVar19.zzb(this.zzB);
                            zzgVar19.zzc(this.zzA);
                            zzgVar19.zzd(bArr);
                            zzgVar19.zze(this.zzo);
                            zzgVar19.zzf(this.zzo);
                            zzhVarZzg = zzgVar19.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i1115);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 22:
                listZzj = Collections.singletonList(zzi(str7));
                str8 = "audio/flac";
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z116 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i1116 = i9 | (z116 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar110 = new zzg();
                            zzgVar110.zza(this.zzz);
                            zzgVar110.zzb(this.zzB);
                            zzgVar110.zzc(this.zzA);
                            zzgVar110.zzd(bArr);
                            zzgVar110.zze(this.zzo);
                            zzgVar110.zzf(this.zzo);
                            zzhVarZzg = zzgVar110.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i1116);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 23:
                if (zzh(new zzef(zzi(this.zzc)))) {
                    iZzz = zzeo.zzz(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                    if (iZzz == 0) {
                        int i20 = this.zzQ;
                        StringBuilder sb = new StringBuilder(String.valueOf(i20).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i20);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        zzds.zzc("MatroskaExtractor", sb.toString());
                    } else {
                        listZzj = null;
                        str2 = null;
                        i8 = -1;
                    }
                    if (this.zzO != null) {
                        str2 = zzeqVarZza.zza;
                        str8 = "video/dolby-vision";
                    }
                    str3 = str8;
                    boolean z117 = this.zzX;
                    if (true != this.zzW) {
                        i9 = 0;
                    } else {
                        i9 = 2;
                    }
                    int i1117 = i9 | (z117 ? 1 : 0);
                    zzsVar = new zzs();
                    if (zzar.zza(str3)) {
                        if (zzar.zzb(str3)) {
                            if (this.zzr == 0) {
                                i14 = this.zzp;
                                i11 = -1;
                                if (i14 == -1) {
                                    i14 = this.zzm;
                                }
                                this.zzp = i14;
                                i15 = this.zzq;
                                if (i15 == -1) {
                                    i15 = this.zzn;
                                }
                                this.zzq = i15;
                            } else {
                                i11 = -1;
                            }
                            i12 = this.zzp;
                            if (i12 != i11) {
                                f7 = -1.0f;
                            } else {
                                f7 = -1.0f;
                            }
                            if (this.zzy) {
                                if (this.zzE != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                zzg zzgVar111 = new zzg();
                                zzgVar111.zza(this.zzz);
                                zzgVar111.zzb(this.zzB);
                                zzgVar111.zzc(this.zzA);
                                zzgVar111.zzd(bArr);
                                zzgVar111.zze(this.zzo);
                                zzgVar111.zzf(this.zzo);
                                zzhVarZzg = zzgVar111.zzg();
                            } else {
                                zzhVarZzg = null;
                            }
                            str4 = this.zzb;
                            if (str4 == null) {
                                iIntValue = i11;
                            } else {
                                iIntValue = i11;
                            }
                            if (this.zzs == 0) {
                                i16 = iIntValue;
                            } else {
                                i16 = iIntValue;
                            }
                            zzsVar.zzt(this.zzm);
                            zzsVar.zzu(this.zzn);
                            zzsVar.zzz(f7);
                            zzsVar.zzy(i16);
                            zzsVar.zzA(this.zzw);
                            zzsVar.zzB(this.zzx);
                            zzsVar.zzC(zzhVarZzg);
                            i10 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i10 = 3;
                        }
                        break;
                    } else {
                        zzsVar.zzE(this.zzP);
                        zzsVar.zzF(this.zzR);
                        zzsVar.zzG(iZzz);
                        i10 = 1;
                    }
                    str5 = this.zzb;
                    if (str5 != null) {
                        zzsVar.zzc(this.zzb);
                    }
                    zzsVar.zzb(i7);
                    if (true != this.zza) {
                        str6 = "video/x-matroska";
                    } else {
                        str6 = "video/webm";
                    }
                    zzsVar.zzl(str6);
                    zzsVar.zzm(str3);
                    zzsVar.zzn(i8);
                    zzsVar.zze(this.zzac);
                    zzsVar.zzf(i1117);
                    zzsVar.zzp(listZzj);
                    zzsVar.zzj(str2);
                    zzsVar.zzq(this.zzl);
                    this.zzZ = zzsVar.zzM();
                    zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                    this.zzY = zzaebVarZzu;
                    if (this.zzV) {
                        zzaebVarZzu.zzu(this.zzZ);
                        return;
                    }
                    return;
                }
                zzds.zzc("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                listZzj = null;
                str2 = null;
                str8 = "audio/x-unknown";
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z118 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i1118 = i9 | (z118 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar112 = new zzg();
                            zzgVar112.zza(this.zzz);
                            zzgVar112.zzb(this.zzB);
                            zzgVar112.zzc(this.zzA);
                            zzgVar112.zzd(bArr);
                            zzgVar112.zze(this.zzo);
                            zzgVar112.zzf(this.zzo);
                            zzhVarZzg = zzgVar112.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i1118);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 24:
                iZzz = zzeo.zzz(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (iZzz == 0) {
                    int i21 = this.zzQ;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i21).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i21);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    zzds.zzc("MatroskaExtractor", sb2.toString());
                    listZzj = null;
                    str2 = null;
                    str8 = "audio/x-unknown";
                    i8 = -1;
                    iZzz = -1;
                } else {
                    listZzj = null;
                    str2 = null;
                    i8 = -1;
                }
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z119 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i1119 = i9 | (z119 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar113 = new zzg();
                            zzgVar113.zza(this.zzz);
                            zzgVar113.zzb(this.zzB);
                            zzgVar113.zzc(this.zzA);
                            zzgVar113.zzd(bArr);
                            zzgVar113.zze(this.zzo);
                            zzgVar113.zzf(this.zzo);
                            zzhVarZzg = zzgVar113.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i1119);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 25:
                int i22 = this.zzQ;
                if (i22 == 8) {
                    listZzj = null;
                    str2 = null;
                    i8 = -1;
                    iZzz = 3;
                } else {
                    if (i22 == 16) {
                        iZzz = 268435456;
                    } else if (i22 == 24) {
                        iZzz = 1342177280;
                    } else if (i22 == 32) {
                        iZzz = 1610612736;
                    } else {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i22).length() + 75);
                        sb3.append("Unsupported big endian PCM bit depth: ");
                        sb3.append(i22);
                        sb3.append(". Setting mimeType to audio/x-unknown");
                        zzds.zzc("MatroskaExtractor", sb3.toString());
                        listZzj = null;
                        str2 = null;
                        str8 = "audio/x-unknown";
                        i8 = -1;
                        iZzz = -1;
                    }
                    listZzj = null;
                    str2 = null;
                    i8 = -1;
                }
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1110 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i11110 = i9 | (z1110 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar114 = new zzg();
                            zzgVar114.zza(this.zzz);
                            zzgVar114.zzb(this.zzB);
                            zzgVar114.zzc(this.zzA);
                            zzgVar114.zzd(bArr);
                            zzgVar114.zze(this.zzo);
                            zzgVar114.zzf(this.zzo);
                            zzhVarZzg = zzgVar114.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i11110);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 26:
                int i23 = this.zzQ;
                if (i23 == 32) {
                    listZzj = null;
                    str2 = null;
                    i8 = -1;
                } else {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i23).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i23);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    zzds.zzc("MatroskaExtractor", sb4.toString());
                    listZzj = null;
                    str2 = null;
                    str8 = "audio/x-unknown";
                    i8 = -1;
                    iZzz = -1;
                }
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1111 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i11111 = i9 | (z1111 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar115 = new zzg();
                            zzgVar115.zza(this.zzz);
                            zzgVar115.zzb(this.zzB);
                            zzgVar115.zzc(this.zzA);
                            zzgVar115.zzd(bArr);
                            zzgVar115.zze(this.zzo);
                            zzgVar115.zzf(this.zzo);
                            zzhVarZzg = zzgVar115.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i11111);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 27:
                str8 = "application/x-subrip";
                listZzj = null;
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1112 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i11112 = i9 | (z1112 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar116 = new zzg();
                            zzgVar116.zza(this.zzz);
                            zzgVar116.zzb(this.zzB);
                            zzgVar116.zzc(this.zzA);
                            zzgVar116.zzd(bArr);
                            zzgVar116.zze(this.zzo);
                            zzgVar116.zzf(this.zzo);
                            zzhVarZzg = zzgVar116.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i11112);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 28:
            case 29:
                int i24 = zzagz.zza;
                listZzj = zzgjz.zzk(zzagz.zzc, zzi(this.zzc));
                str8 = "text/x-ssa";
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1113 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i11113 = i9 | (z1113 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar117 = new zzg();
                            zzgVar117.zza(this.zzz);
                            zzgVar117.zzb(this.zzB);
                            zzgVar117.zzc(this.zzA);
                            zzgVar117.zzd(bArr);
                            zzgVar117.zze(this.zzo);
                            zzgVar117.zzf(this.zzo);
                            zzhVarZzg = zzgVar117.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i11113);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 30:
                str8 = "text/vtt";
                listZzj = null;
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1114 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i11114 = i9 | (z1114 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar118 = new zzg();
                            zzgVar118.zza(this.zzz);
                            zzgVar118.zzb(this.zzB);
                            zzgVar118.zzc(this.zzA);
                            zzgVar118.zzd(bArr);
                            zzgVar118.zze(this.zzo);
                            zzgVar118.zzf(this.zzo);
                            zzhVarZzg = zzgVar118.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i11114);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 31:
                listZzj = zzgjz.zzj(zzi(str7));
                str8 = "application/vobsub";
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1115 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i11115 = i9 | (z1115 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar119 = new zzg();
                            zzgVar119.zza(this.zzz);
                            zzgVar119.zzb(this.zzB);
                            zzgVar119.zzc(this.zzA);
                            zzgVar119.zzd(bArr);
                            zzgVar119.zze(this.zzo);
                            zzgVar119.zzf(this.zzo);
                            zzhVarZzg = zzgVar119.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i11115);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 32:
                listZzj = null;
                str2 = null;
                str8 = "application/pgs";
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1116 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i11116 = i9 | (z1116 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar1110 = new zzg();
                            zzgVar1110.zza(this.zzz);
                            zzgVar1110.zzb(this.zzB);
                            zzgVar1110.zzc(this.zzA);
                            zzgVar1110.zzd(bArr);
                            zzgVar1110.zze(this.zzo);
                            zzgVar1110.zzf(this.zzo);
                            zzhVarZzg = zzgVar1110.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i11116);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 33:
                byte[] bArr5 = new byte[4];
                System.arraycopy(zzi(str7), 0, bArr5, 0, 4);
                listZzj = zzgjz.zzj(bArr5);
                str8 = "application/dvbsubs";
                str2 = null;
                i8 = -1;
                iZzz = -1;
                if (this.zzO != null) {
                    str2 = zzeqVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1117 = this.zzX;
                if (true != this.zzW) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                int i11117 = i9 | (z1117 ? 1 : 0);
                zzsVar = new zzs();
                if (zzar.zza(str3)) {
                    if (zzar.zzb(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            i11 = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != i11) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzg zzgVar1111 = new zzg();
                            zzgVar1111.zza(this.zzz);
                            zzgVar1111.zzb(this.zzB);
                            zzgVar1111.zzc(this.zzA);
                            zzgVar1111.zzd(bArr);
                            zzgVar1111.zze(this.zzo);
                            zzgVar1111.zzf(this.zzo);
                            zzhVarZzg = zzgVar1111.zzg();
                        } else {
                            zzhVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 == null) {
                            iIntValue = i11;
                        } else {
                            iIntValue = i11;
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f7);
                        zzsVar.zzy(i16);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVarZzg);
                        i10 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i10 = 3;
                    }
                    break;
                } else {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(iZzz);
                    i10 = 1;
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zzsVar.zzc(this.zzb);
                }
                zzsVar.zzb(i7);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zzsVar.zzl(str6);
                zzsVar.zzm(str3);
                zzsVar.zzn(i8);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i11117);
                zzsVar.zzp(listZzj);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaebVarZzu = zzacxVar.zzu(this.zzd, i10);
                this.zzY = zzaebVarZzu;
                if (this.zzV) {
                    zzaebVarZzu.zzu(this.zzZ);
                    return;
                }
                return;
            default:
                throw zzas.zzb("Unrecognized codec identifier.", null);
        }
    }

    final /* synthetic */ void zzb() {
        this.zzY.getClass();
    }

    final /* synthetic */ int zzc() {
        return this.zzab;
    }

    final /* synthetic */ void zzd(int i7) {
        this.zzab = i7;
    }

    final /* synthetic */ void zze(String str) {
        this.zzac = str;
    }
}
