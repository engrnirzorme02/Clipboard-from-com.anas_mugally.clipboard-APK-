package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaln implements zzajv {
    private final zzef zza = new zzef();
    private final zzale zzb = new zzale();

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i7, int i8, zzaju zzajuVar, zzdf zzdfVar) {
        zzef zzefVar = this.zza;
        zzefVar.zzb(bArr, i8 + i7);
        zzefVar.zzh(i7);
        ArrayList arrayList = new ArrayList();
        try {
            int iZzg = zzefVar.zzg();
            Charset charset = StandardCharsets.UTF_8;
            String strZzN = zzefVar.zzN(charset);
            if (strZzN == null || !strZzN.startsWith("WEBVTT")) {
                zzefVar.zzh(iZzg);
                throw zzas.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzefVar.zzN(charset))), null);
            }
            while (!TextUtils.isEmpty(zzefVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                byte b7 = -1;
                int iZzg2 = 0;
                while (b7 == -1) {
                    iZzg2 = zzefVar.zzg();
                    String strZzN2 = zzefVar.zzN(StandardCharsets.UTF_8);
                    if (strZzN2 == null) {
                        b7 = 0;
                    } else if ("STYLE".equals(strZzN2)) {
                        b7 = 2;
                    } else {
                        b7 = strZzN2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                zzefVar.zzh(iZzg2);
                if (b7 == 0) {
                    zzajp.zza(new zzalq(arrayList2), zzajuVar, zzdfVar);
                    return;
                }
                if (b7 == 1) {
                    while (!TextUtils.isEmpty(zzefVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (b7 != 2) {
                    zzalg zzalgVarZza = zzalm.zza(zzefVar, arrayList);
                    if (zzalgVarZza != null) {
                        arrayList2.add(zzalgVarZza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzefVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzefVar));
                }
            }
        } catch (zzas e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
