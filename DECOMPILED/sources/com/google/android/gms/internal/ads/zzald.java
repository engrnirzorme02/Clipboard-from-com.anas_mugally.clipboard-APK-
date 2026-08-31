package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzald implements zzajv {
    private final zzef zza = new zzef();

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i7, int i8, zzaju zzajuVar, zzdf zzdfVar) {
        zzcl zzclVarZzr;
        zzef zzefVar = this.zza;
        zzefVar.zzb(bArr, i8 + i7);
        zzefVar.zzh(i7);
        ArrayList arrayList = new ArrayList();
        while (zzefVar.zzd() > 0) {
            zzghc.zzb(zzefVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iZzB = zzefVar.zzB() - 8;
            if (zzefVar.zzB() == 1987343459) {
                CharSequence charSequenceZzc = null;
                zzck zzckVarZzb = null;
                while (iZzB > 0) {
                    zzghc.zzb(iZzB >= 8, "Incomplete vtt cue box header found.");
                    int iZzB2 = zzefVar.zzB();
                    int iZzB3 = zzefVar.zzB();
                    int i9 = iZzB - 8;
                    int i10 = iZzB2 - 8;
                    String strZzj = zzeo.zzj(zzefVar.zzi(), zzefVar.zzg(), i10);
                    zzefVar.zzk(i10);
                    if (iZzB3 == 1937011815) {
                        zzckVarZzb = zzalm.zzb(strZzj);
                    } else if (iZzB3 == 1885436268) {
                        charSequenceZzc = zzalm.zzc(null, strZzj.trim(), Collections.EMPTY_LIST);
                    }
                    iZzB = i9 - i10;
                }
                if (charSequenceZzc == null) {
                    charSequenceZzc = "";
                }
                if (zzckVarZzb != null) {
                    zzckVarZzb.zza(charSequenceZzc);
                    zzclVarZzr = zzckVarZzb.zzr();
                } else {
                    Pattern pattern = zzalm.zza;
                    zzall zzallVar = new zzall();
                    zzallVar.zzc = charSequenceZzc;
                    zzclVarZzr = zzallVar.zza().zzr();
                }
                arrayList.add(zzclVarZzr);
            } else {
                zzefVar.zzk(iZzB);
            }
        }
        zzdfVar.zza(new zzajn(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
