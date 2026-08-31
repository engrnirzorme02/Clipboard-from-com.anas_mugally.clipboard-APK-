package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfds {
    public zzfds() {
        try {
            zzgqw.zza();
        } catch (GeneralSecurityException e7) {
            AbstractC3490o0.m17545k("Failed to Configure Aead. ".concat(e7.toString()));
            C7351t.m32354l().zzg(e7, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] byteArray;
        try {
            zzgqo zzgqoVarZzf = zzgqo.zzf(zzgqg.zzb(zzgyk.zza().zzc("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgqa.zzb(zzgqoVarZzf, zzgpz.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e7) {
            AbstractC3490o0.m17545k("Failed to generate key".concat(e7.toString()));
            C7351t.m32354l().zzg(e7, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdsg zzdsgVar) {
        zzgqo zzgqoVarZzc;
        if (str != null && (zzgqoVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzgpx) zzgqoVarZzc.zzg(zzgre.zza(), zzgpx.class)).zza(bArr, bArr2);
                zzdsgVar.zzc().put("ds", "1");
                return new String(bArrZza, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e7) {
                AbstractC3490o0.m17545k("Failed to decrypt ".concat(e7.toString()));
                C7351t.m32354l().zzg(e7, "CryptoUtils.decrypt");
                zzdsgVar.zzc().put("dsf", e7.toString());
            }
        }
        return null;
    }

    private static final zzgqo zzc(String str) {
        try {
            try {
                return zzgqa.zza(zzgpy.zzb(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e7) {
            AbstractC3490o0.m17545k("Failed to get keysethandle".concat(e7.toString()));
            C7351t.m32354l().zzg(e7, "CryptoUtils.getHandle");
            return null;
        }
    }
}
