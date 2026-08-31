package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaeh {
    public static int zza(int i7) {
        int i8 = 0;
        while (i7 > 0) {
            i7 >>>= 1;
            i8++;
        }
        return i8;
    }

    public static zzaee zzb(zzef zzefVar, boolean z7, boolean z8) throws zzas {
        if (z7) {
            zzd(3, zzefVar, false);
        }
        String strZzK = zzefVar.zzK((int) zzefVar.zzA(), StandardCharsets.UTF_8);
        int length = strZzK.length();
        long jZzA = zzefVar.zzA();
        String[] strArr = new String[(int) jZzA];
        int length2 = length + 15;
        for (int i7 = 0; i7 < jZzA; i7++) {
            String strZzK2 = zzefVar.zzK((int) zzefVar.zzA(), StandardCharsets.UTF_8);
            strArr[i7] = strZzK2;
            length2 = length2 + 4 + strZzK2.length();
        }
        if (z8 && (zzefVar.zzs() & 1) == 0) {
            throw zzas.zzb("framing bit expected to be set", null);
        }
        return new zzaee(strZzK, strArr, length2 + 1);
    }

    public static zzao zzc(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            String str2 = zzeo.zza;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zzds.zzc("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafu.zzb(new zzef(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e7) {
                    zzds.zzd("VorbisUtil", "Failed to parse vorbis picture", e7);
                }
            } else {
                arrayList.add(new zzags(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzao(arrayList);
    }

    public static boolean zzd(int i7, zzef zzefVar, boolean z7) throws zzas {
        if (zzefVar.zzd() < 7) {
            if (z7) {
                return false;
            }
            int iZzd = zzefVar.zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(iZzd).length() + 18);
            sb.append("too short header: ");
            sb.append(iZzd);
            throw zzas.zzb(sb.toString(), null);
        }
        if (zzefVar.zzs() != i7) {
            if (z7) {
                return false;
            }
            throw zzas.zzb("expected header type ".concat(String.valueOf(Integer.toHexString(i7))), null);
        }
        if (zzefVar.zzs() == 118 && zzefVar.zzs() == 111 && zzefVar.zzs() == 114 && zzefVar.zzs() == 98 && zzefVar.zzs() == 105 && zzefVar.zzs() == 115) {
            return true;
        }
        if (z7) {
            return false;
        }
        throw zzas.zzb("expected characters 'vorbis'", null);
    }
}
