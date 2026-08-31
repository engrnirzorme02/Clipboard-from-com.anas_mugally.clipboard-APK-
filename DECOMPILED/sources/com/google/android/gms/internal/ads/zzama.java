package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzama implements zzanq {
    private final List zza;

    public zzama(int i7, List list) {
        this.zza = list;
    }

    private final zzang zzc(zzanp zzanpVar) {
        return new zzang(zze(zzanpVar), "video/mp2t");
    }

    private final zzanv zzd(zzanp zzanpVar) {
        return new zzanv(zze(zzanpVar), "video/mp2t");
    }

    private final List zze(zzanp zzanpVar) {
        String str;
        int i7;
        List listSingletonList;
        zzef zzefVar = new zzef(zzanpVar.zze);
        List arrayList = this.zza;
        while (zzefVar.zzd() > 0) {
            int iZzs = zzefVar.zzs();
            int iZzg = zzefVar.zzg() + zzefVar.zzs();
            if (iZzs == 134) {
                arrayList = new ArrayList();
                int iZzs2 = zzefVar.zzs() & 31;
                for (int i8 = 0; i8 < iZzs2; i8++) {
                    String strZzK = zzefVar.zzK(3, StandardCharsets.UTF_8);
                    int iZzs3 = zzefVar.zzs();
                    boolean z7 = (iZzs3 & 128) != 0;
                    if (z7) {
                        i7 = iZzs3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte bZzs = (byte) zzefVar.zzs();
                    zzefVar.zzk(1);
                    if (z7) {
                        int i9 = bZzs & 64;
                        int i10 = zzdc.zza;
                        listSingletonList = Collections.singletonList(i9 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzs zzsVar = new zzs();
                    zzsVar.zzm(str);
                    zzsVar.zze(strZzK);
                    zzsVar.zzJ(i7);
                    zzsVar.zzp(listSingletonList);
                    arrayList.add(zzsVar.zzM());
                }
            }
            zzefVar.zzh(iZzg);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzanq
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzanq
    public final zzans zzb(int i7, zzanp zzanpVar) {
        if (i7 != 2) {
            if (i7 == 3 || i7 == 4) {
                return new zzamw(new zzamp(zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
            }
            if (i7 == 21) {
                return new zzamw(new zzamn("video/mp2t"));
            }
            if (i7 == 27) {
                return new zzamw(new zzamk(zzc(zzanpVar), false, false, "video/mp2t"));
            }
            if (i7 == 36) {
                return new zzamw(new zzamm(zzc(zzanpVar), "video/mp2t"));
            }
            if (i7 == 45) {
                return new zzamw(new zzamq("video/mp2t"));
            }
            if (i7 == 89) {
                return new zzamw(new zzamc(zzanpVar.zzd, "video/mp2t"));
            }
            if (i7 == 172) {
                return new zzamw(new zzalw(zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
            }
            if (i7 == 257) {
                return new zzane(new zzamv("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i7 != 128) {
                if (i7 != 129) {
                    if (i7 != 138) {
                        if (i7 == 139) {
                            return new zzamw(new zzamb(zzanpVar.zzb, zzanpVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i7) {
                            case 15:
                                return new zzamw(new zzalz(false, zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzamw(new zzami(zzd(zzanpVar), "video/mp2t"));
                            case 17:
                                return new zzamw(new zzamo(zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
                            default:
                                switch (i7) {
                                    case 134:
                                        return new zzane(new zzamv("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                    }
                    return new zzamw(new zzamb(zzanpVar.zzb, zzanpVar.zza(), 4096, "video/mp2t"));
                }
                return new zzamw(new zzalt(zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
            }
        }
        return new zzamw(new zzamf(zzd(zzanpVar), "video/mp2t"));
    }

    public zzama() {
        this(0);
    }

    public zzama(int i7) {
        this.zza = zzgjz.zzi();
    }
}
