package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzaiq {
    private static final zzghq zza = zzghq.zza(zzggo.zzc(':'));
    private static final zzghq zzb = zzghq.zza(zzggo.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    public final int zzb(zzacv zzacvVar, zzads zzadsVar, List list) {
        byte b7;
        char c7;
        int i7 = this.zzd;
        if (i7 == 0) {
            long jZzo = zzacvVar.zzo();
            zzadsVar.zza = (jZzo == -1 || jZzo < 8) ? 0L : jZzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i8 = 2;
        if (i7 != 1) {
            short s7 = 2817;
            short s8 = 2816;
            short s9 = 2192;
            if (i7 != 2) {
                long jZzn = zzacvVar.zzn();
                int iZzo = (int) ((zzacvVar.zzo() - zzacvVar.zzn()) - ((long) this.zze));
                zzef zzefVar = new zzef(iZzo);
                zzacvVar.zzc(zzefVar.zzi(), 0, iZzo);
                int i9 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i9 >= list2.size()) {
                        zzadsVar.zza = 0L;
                        return 1;
                    }
                    zzaip zzaipVar = (zzaip) list2.get(i9);
                    zzefVar.zzh((int) (zzaipVar.zza - jZzn));
                    zzefVar.zzk(4);
                    int iZzC = zzefVar.zzC();
                    Charset charset = StandardCharsets.UTF_8;
                    switch (zzefVar.zzK(iZzC, charset)) {
                        case "SlowMotion_Data":
                            b7 = 0;
                            break;
                        case "Super_SlowMotion_Edit_Data":
                            b7 = 3;
                            break;
                        case "Super_SlowMotion_Data":
                            b7 = 1;
                            break;
                        case "Super_SlowMotion_Deflickering_On":
                            b7 = 4;
                            break;
                        case "Super_SlowMotion_BGM":
                            b7 = 2;
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    if (b7 == 0) {
                        c7 = 2192;
                    } else if (b7 == 1) {
                        c7 = 2816;
                    } else if (b7 == 2) {
                        c7 = 2817;
                    } else if (b7 == 3) {
                        c7 = 2819;
                    } else {
                        if (b7 != 4) {
                            throw zzas.zzb("Invalid SEF name", null);
                        }
                        c7 = 2820;
                    }
                    int i10 = zzaipVar.zzb - (iZzC + 8);
                    if (c7 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List listZze = zzb.zze(zzefVar.zzK(i10, charset));
                        for (int i11 = 0; i11 < listZze.size(); i11++) {
                            List listZze2 = zza.zze((CharSequence) listZze.get(i11));
                            if (listZze2.size() != 3) {
                                throw zzas.zzb(null, null);
                            }
                            try {
                                arrayList.add(new zzagp(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                            } catch (NumberFormatException e7) {
                                throw zzas.zzb(null, e7);
                            }
                        }
                        list.add(new zzagq(arrayList));
                    } else if (c7 != 2816 && c7 != 2817 && c7 != 2819 && c7 != 2820) {
                        throw new IllegalStateException();
                    }
                    i9++;
                }
            } else {
                long jZzo2 = zzacvVar.zzo();
                int i12 = this.zze - 20;
                zzef zzefVar2 = new zzef(i12);
                zzacvVar.zzc(zzefVar2.zzi(), 0, i12);
                int i13 = 0;
                while (i13 < i12 / 12) {
                    zzefVar2.zzk(i8);
                    short sZzw = zzefVar2.zzw();
                    if (sZzw == s9 || sZzw == s8 || sZzw == s7 || sZzw == 2819 || sZzw == 2820) {
                        this.zzc.add(new zzaip(sZzw, (jZzo2 - ((long) this.zze)) - ((long) zzefVar2.zzC()), zzefVar2.zzC()));
                    } else {
                        zzefVar2.zzk(8);
                    }
                    i13++;
                    i12 = i12;
                    i8 = 2;
                    s7 = 2817;
                    s8 = 2816;
                    s9 = 2192;
                }
                List list3 = this.zzc;
                if (list3.isEmpty()) {
                    zzadsVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzadsVar.zza = ((zzaip) list3.get(0)).zza;
                }
            }
        } else {
            zzef zzefVar3 = new zzef(8);
            zzacvVar.zzc(zzefVar3.zzi(), 0, 8);
            this.zze = zzefVar3.zzC() + 8;
            if (zzefVar3.zzB() != 1397048916) {
                zzadsVar.zza = 0L;
            } else {
                zzadsVar.zza = zzacvVar.zzn() - ((long) (this.zze - 12));
                this.zzd = 2;
            }
        }
        return 1;
    }
}
