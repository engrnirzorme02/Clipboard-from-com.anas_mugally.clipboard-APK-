package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadk {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = zzeo.zza;
            int i7 = Integer.parseInt(strGroup, 16);
            int i8 = Integer.parseInt(matcher.group(2), 16);
            if (i7 <= 0 && i8 <= 0) {
                return false;
            }
            this.zza = i7;
            this.zzb = i8;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza(zzao zzaoVar) {
        for (int i7 = 0; i7 < zzaoVar.zza(); i7++) {
            zzan zzanVarZzb = zzaoVar.zzb(i7);
            if (zzanVarZzb instanceof zzagb) {
                zzagb zzagbVar = (zzagb) zzanVarZzb;
                if ("iTunSMPB".equals(zzagbVar.zzb) && zzc(zzagbVar.zzc)) {
                    return true;
                }
            } else if (zzanVarZzb instanceof zzagj) {
                zzagj zzagjVar = (zzagj) zzanVarZzb;
                if ("com.apple.iTunes".equals(zzagjVar.zza) && "iTunSMPB".equals(zzagjVar.zzb) && zzc(zzagjVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}
