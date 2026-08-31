package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
final class zzaer implements zzaek {
    public final zzgjz zza;
    private final int zzb;

    private zzaer(int i7, zzgjz zzgjzVar) {
        this.zzb = i7;
        this.zza = zzgjzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaer zzb(int i7, zzef zzefVar) {
        String str;
        zzaek zzaesVar;
        String str2;
        zzgjw zzgjwVar = new zzgjw();
        int iZze = zzefVar.zze();
        int iZzc = -2;
        while (zzefVar.zzd() > 8) {
            int iZzC = zzefVar.zzC();
            int iZzg = zzefVar.zzg() + zzefVar.zzC();
            zzefVar.zzf(iZzg);
            if (iZzC != 1414744396) {
                zzaes zzaesVar2 = null;
                switch (iZzC) {
                    case 1718776947:
                        if (iZzc != 2) {
                            if (iZzc == 1) {
                                int iZzu = zzefVar.zzu();
                                if (iZzu == 1) {
                                    str = "audio/raw";
                                } else if (iZzu == 85) {
                                    str = "audio/mpeg";
                                } else if (iZzu == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iZzu != 8192) {
                                    str = iZzu != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iZzu2 = zzefVar.zzu();
                                    int iZzC2 = zzefVar.zzC();
                                    zzefVar.zzk(6);
                                    int iZzz = zzeo.zzz(zzefVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                    int iZzu3 = zzefVar.zzd() > 0 ? zzefVar.zzu() : 0;
                                    zzs zzsVar = new zzs();
                                    zzsVar.zzm(str);
                                    zzsVar.zzE(iZzu2);
                                    zzsVar.zzF(iZzC2);
                                    if (str.equals("audio/raw") && iZzz != 0) {
                                        zzsVar.zzG(iZzz);
                                    }
                                    if (str.equals("audio/mp4a-latm") && iZzu3 > 0) {
                                        byte[] bArr = new byte[iZzu3];
                                        zzefVar.zzm(bArr, 0, iZzu3);
                                        zzsVar.zzp(zzgjz.zzj(bArr));
                                    }
                                    zzaesVar = new zzaes(zzsVar.zzM());
                                } else {
                                    StringBuilder sb = new StringBuilder(String.valueOf(iZzu).length() + 43);
                                    sb.append("Ignoring track with unsupported format tag ");
                                    sb.append(iZzu);
                                    zzds.zzc("StreamFormatChunk", sb.toString());
                                }
                            } else {
                                zzds.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzeo.zzQ(iZzc)));
                            }
                            break;
                        } else {
                            zzefVar.zzk(4);
                            int iZzC3 = zzefVar.zzC();
                            int iZzC4 = zzefVar.zzC();
                            zzefVar.zzk(4);
                            int iZzC5 = zzefVar.zzC();
                            switch (iZzC5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzC5).length() + 44);
                                sb2.append("Ignoring track with unsupported compression ");
                                sb2.append(iZzC5);
                                zzds.zzc("StreamFormatChunk", sb2.toString());
                            } else {
                                zzs zzsVar2 = new zzs();
                                zzsVar2.zzt(iZzC3);
                                zzsVar2.zzu(iZzC4);
                                zzsVar2.zzm(str2);
                                zzaesVar2 = new zzaes(zzsVar2.zzM());
                            }
                        }
                        zzaesVar = zzaesVar2;
                        break;
                    case 1751742049:
                        zzaesVar = zzaeo.zzb(zzefVar);
                        break;
                    case 1752331379:
                        zzaesVar = zzaep.zzb(zzefVar);
                        break;
                    case 1852994675:
                        zzaesVar = zzaet.zzb(zzefVar);
                        break;
                    default:
                        zzaesVar = zzaesVar2;
                        break;
                }
            } else {
                zzaesVar = zzb(zzefVar.zzC(), zzefVar);
            }
            if (zzaesVar != null) {
                if (zzaesVar.zza() == 1752331379) {
                    iZzc = ((zzaep) zzaesVar).zzc();
                }
                zzgjwVar.zzf(zzaesVar);
            }
            zzefVar.zzh(iZzg);
            zzefVar.zzf(iZze);
        }
        return new zzaer(i7, zzgjwVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaek
    public final int zza() {
        return this.zzb;
    }

    public final zzaek zzc(Class cls) {
        zzgjz zzgjzVar = this.zza;
        int size = zzgjzVar.size();
        int i7 = 0;
        while (i7 < size) {
            zzaek zzaekVar = (zzaek) zzgjzVar.get(i7);
            i7++;
            if (zzaekVar.getClass() == cls) {
                return zzaekVar;
            }
        }
        return null;
    }
}
