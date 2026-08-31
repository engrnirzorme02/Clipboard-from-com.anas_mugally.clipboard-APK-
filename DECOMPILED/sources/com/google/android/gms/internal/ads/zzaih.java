package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaih {
    public static void zza(int i7, zzao zzaoVar, zzs zzsVar, zzao zzaoVar2, zzao... zzaoVarArr) {
        if (zzaoVar2 == null) {
            zzaoVar2 = new zzao(-9223372036854775807L, new zzan[0]);
        }
        if (zzaoVar != null) {
            for (int i8 = 0; i8 < zzaoVar.zza(); i8++) {
                zzan zzanVarZzb = zzaoVar.zzb(i8);
                if (zzanVarZzb instanceof zzer) {
                    zzer zzerVar = (zzer) zzanVarZzb;
                    if (!zzerVar.zza.equals("com.android.capture.fps")) {
                        zzaoVar2 = zzaoVar2.zzd(zzerVar);
                    } else if (i7 == 2) {
                        zzaoVar2 = zzaoVar2.zzd(zzerVar);
                    }
                }
            }
        }
        for (zzao zzaoVar3 : zzaoVarArr) {
            zzaoVar2 = zzaoVar2.zzc(zzaoVar3);
        }
        if (zzaoVar2.zza() > 0) {
            zzsVar.zzk(zzaoVar2);
        }
    }

    public static void zzb(int i7, zzadk zzadkVar, zzs zzsVar) {
        if (i7 == 1 && zzadkVar.zzb()) {
            zzsVar.zzH(zzadkVar.zza);
            zzsVar.zzI(zzadkVar.zzb);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x026b A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:9:0x0039, B:11:0x0044, B:15:0x0053, B:18:0x005f, B:21:0x006c, B:24:0x007b, B:27:0x0088, B:30:0x0096, B:32:0x00a2, B:40:0x00bf, B:41:0x00dd, B:42:0x00ef, B:45:0x00fb, B:48:0x0108, B:51:0x0115, B:54:0x0122, B:57:0x012f, B:60:0x013c, B:63:0x0149, B:65:0x0153, B:67:0x015d, B:69:0x0167, B:73:0x0178, B:75:0x017e, B:77:0x0192, B:78:0x0199, B:80:0x01a0, B:85:0x01ab, B:90:0x01b7, B:128:0x026b, B:91:0x01cc, B:93:0x01d3, B:95:0x01df, B:96:0x01f3, B:109:0x021d, B:112:0x022a, B:115:0x0236, B:118:0x0242, B:121:0x024e, B:124:0x025a, B:127:0x0264, B:129:0x0288, B:130:0x028f), top: B:135:0x002b }] */
    public static zzan zzc(zzef zzefVar) {
        String str;
        zzan zzafxVar;
        int iZzg = zzefVar.zzg() + zzefVar.zzB();
        int iZzB = zzefVar.zzB();
        int i7 = (iZzB >> 24) & 255;
        zzan zzanVarZzd = null;
        try {
            if (i7 == 169 || i7 == 253) {
                int i8 = iZzB & 16777215;
                if (i8 == 6516084) {
                    int iZzB2 = zzefVar.zzB();
                    if (zzefVar.zzB() == 1684108385) {
                        zzefVar.zzk(8);
                        String strZzL = zzefVar.zzL(iZzB2 - 16);
                        zzanVarZzd = new zzagb("und", strZzL, strZzL);
                    } else {
                        zzds.zzc("MetadataUtil", "Failed to parse comment attribute: ".concat(zzev.zze(iZzB)));
                    }
                } else if (i8 == 7233901 || i8 == 7631467) {
                    zzanVarZzd = zzd(iZzB, "TIT2", zzefVar);
                } else if (i8 == 6516589 || i8 == 7828084) {
                    zzanVarZzd = zzd(iZzB, "TCOM", zzefVar);
                } else if (i8 == 6578553) {
                    zzanVarZzd = zzd(iZzB, "TDRC", zzefVar);
                } else if (i8 == 4280916) {
                    zzanVarZzd = zzd(iZzB, "TPE1", zzefVar);
                } else if (i8 == 7630703) {
                    zzanVarZzd = zzd(iZzB, "TSSE", zzefVar);
                } else if (i8 == 6384738) {
                    zzanVarZzd = zzd(iZzB, "TALB", zzefVar);
                } else if (i8 == 7108978) {
                    zzanVarZzd = zzd(iZzB, "USLT", zzefVar);
                } else if (i8 == 6776174) {
                    zzanVarZzd = zzd(iZzB, "TCON", zzefVar);
                } else if (i8 == 6779504) {
                    zzanVarZzd = zzd(iZzB, "TIT1", zzefVar);
                } else {
                    String strZze = zzev.zze(iZzB);
                    StringBuilder sb = new StringBuilder(strZze.length() + 32);
                    sb.append("Skipped unknown metadata entry: ");
                    sb.append(strZze);
                    zzds.zza("MetadataUtil", sb.toString());
                }
            } else if (iZzB == 1735291493) {
                String strZza = zzagi.zza(zzf(zzefVar) - 1);
                if (strZza != null) {
                    zzafxVar = new zzagm("TCON", null, zzgjz.zzj(strZza));
                    zzanVarZzd = zzafxVar;
                } else {
                    zzds.zzc("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (iZzB == 1684632427) {
                zzanVarZzd = zzg(1684632427, "TPOS", zzefVar);
            } else if (iZzB == 1953655662) {
                zzanVarZzd = zzg(1953655662, "TRCK", zzefVar);
            } else if (iZzB == 1953329263) {
                zzanVarZzd = zze(1953329263, "TBPM", zzefVar, true, false);
            } else if (iZzB == 1668311404) {
                zzanVarZzd = zze(1668311404, "TCMP", zzefVar, true, true);
            } else if (iZzB == 1668249202) {
                int iZzB3 = zzefVar.zzB();
                if (zzefVar.zzB() == 1684108385) {
                    int iZzB4 = zzefVar.zzB();
                    int i9 = zzahy.zza;
                    int i10 = iZzB4 & 16777215;
                    if (i10 == 13) {
                        str = "image/jpeg";
                    } else if (i10 == 14) {
                        str = "image/png";
                        i10 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 30);
                        sb2.append("Unrecognized cover art flags: ");
                        sb2.append(i10);
                        zzds.zzc("MetadataUtil", sb2.toString());
                    } else {
                        zzefVar.zzk(4);
                        int i11 = iZzB3 - 16;
                        byte[] bArr = new byte[i11];
                        zzefVar.zzm(bArr, 0, i11);
                        zzafxVar = new zzafx(str, null, 3, bArr);
                        zzanVarZzd = zzafxVar;
                    }
                } else {
                    zzds.zzc("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (iZzB == 1631670868) {
                zzanVarZzd = zzd(1631670868, "TPE2", zzefVar);
            } else if (iZzB == 1936682605) {
                zzanVarZzd = zzd(1936682605, "TSOT", zzefVar);
            } else if (iZzB == 1936679276) {
                zzanVarZzd = zzd(1936679276, "TSOA", zzefVar);
            } else if (iZzB == 1936679282) {
                zzanVarZzd = zzd(1936679282, "TSOP", zzefVar);
            } else if (iZzB == 1936679265) {
                zzanVarZzd = zzd(1936679265, "TSO2", zzefVar);
            } else if (iZzB == 1936679791) {
                zzanVarZzd = zzd(1936679791, "TSOC", zzefVar);
            } else if (iZzB == 1920233063) {
                zzanVarZzd = zze(1920233063, "ITUNESADVISORY", zzefVar, false, false);
            } else if (iZzB == 1885823344) {
                zzanVarZzd = zze(1885823344, "ITUNESGAPLESS", zzefVar, false, true);
            } else if (iZzB == 1936683886) {
                zzanVarZzd = zzd(1936683886, "TVSHOWSORT", zzefVar);
            } else if (iZzB == 1953919848) {
                zzanVarZzd = zzd(1953919848, "TVSHOW", zzefVar);
            } else if (iZzB == 757935405) {
                int i12 = -1;
                int i13 = -1;
                String strZzL2 = null;
                String strZzL3 = null;
                while (zzefVar.zzg() < iZzg) {
                    int iZzg2 = zzefVar.zzg();
                    int iZzB5 = zzefVar.zzB();
                    int iZzB6 = zzefVar.zzB();
                    zzefVar.zzk(4);
                    if (iZzB6 == 1835360622) {
                        strZzL2 = zzefVar.zzL(iZzB5 - 12);
                    } else {
                        int i14 = iZzB5 - 12;
                        if (iZzB6 == 1851878757) {
                            strZzL3 = zzefVar.zzL(i14);
                        } else {
                            if (iZzB6 == 1684108385) {
                                i13 = iZzB5;
                            }
                            if (iZzB6 == 1684108385) {
                                i12 = iZzg2;
                            }
                            zzefVar.zzk(i14);
                        }
                    }
                }
                if (strZzL2 != null && strZzL3 != null && i12 != -1) {
                    zzefVar.zzh(i12);
                    zzefVar.zzk(16);
                    zzanVarZzd = new zzagj(strZzL2, strZzL3, zzefVar.zzL(i13 - 16));
                }
            } else {
                String strZze2 = zzev.zze(iZzB);
                StringBuilder sb3 = new StringBuilder(strZze2.length() + 32);
                sb3.append("Skipped unknown metadata entry: ");
                sb3.append(strZze2);
                zzds.zza("MetadataUtil", sb3.toString());
            }
            zzefVar.zzh(iZzg);
            return zzanVarZzd;
        } catch (Throwable th) {
            zzefVar.zzh(iZzg);
            throw th;
        }
    }

    private static zzagm zzd(int i7, String str, zzef zzefVar) {
        int iZzB = zzefVar.zzB();
        if (zzefVar.zzB() == 1684108385) {
            zzefVar.zzk(8);
            return new zzagm(str, null, zzgjz.zzj(zzefVar.zzL(iZzB - 16)));
        }
        zzds.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzev.zze(i7)));
        return null;
    }

    private static zzagh zze(int i7, String str, zzef zzefVar, boolean z7, boolean z8) {
        int iZzf = zzf(zzefVar);
        if (z8) {
            iZzf = Math.min(1, iZzf);
        }
        if (iZzf >= 0) {
            return z7 ? new zzagm(str, null, zzgjz.zzj(Integer.toString(iZzf))) : new zzagb("und", str, Integer.toString(iZzf));
        }
        zzds.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzev.zze(i7)));
        return null;
    }

    private static int zzf(zzef zzefVar) {
        int iZzB = zzefVar.zzB();
        if (zzefVar.zzB() == 1684108385) {
            zzefVar.zzk(8);
            int i7 = iZzB - 16;
            if (i7 == 1) {
                return zzefVar.zzs();
            }
            if (i7 == 2) {
                return zzefVar.zzt();
            }
            if (i7 == 3) {
                return zzefVar.zzx();
            }
            if (i7 == 4 && (zzefVar.zzn() & 128) == 0) {
                return zzefVar.zzH();
            }
        }
        zzds.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzagm zzg(int i7, String str, zzef zzefVar) {
        int iZzB = zzefVar.zzB();
        if (zzefVar.zzB() == 1684108385 && iZzB >= 22) {
            zzefVar.zzk(10);
            int iZzt = zzefVar.zzt();
            if (iZzt > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iZzt).length());
                sb.append(iZzt);
                String string = sb.toString();
                int iZzt2 = zzefVar.zzt();
                if (iZzt2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(iZzt2).length());
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(iZzt2);
                    string = sb2.toString();
                }
                return new zzagm(str, null, zzgjz.zzj(string));
            }
        }
        zzds.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzev.zze(i7)));
        return null;
    }
}
