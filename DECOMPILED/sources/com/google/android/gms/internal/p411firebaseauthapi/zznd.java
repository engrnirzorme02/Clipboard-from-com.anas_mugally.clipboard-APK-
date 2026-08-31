package com.google.android.gms.internal.p411firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes2.dex */
public final class zznd implements zzbx {
    private static final Object zza = new Object();

    public static final class zza {
        public zza() {
            zznd.zza();
        }
    }

    public zznd() {
        this(new zza());
    }

    static /* synthetic */ boolean zza() {
        return true;
    }

    static boolean zzc(String str) {
        synchronized (zza) {
            try {
                String strZza = zzaai.zza("android-keystore://", str);
                if (zzmz.zzb(strZza)) {
                    return false;
                }
                KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strZza, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(keyGenParameterSpecBuild);
                keyGenerator.generateKey();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzbx
    public final boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    private zznd(zza zzaVar) {
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzbx
    public final zzba zza(String str) throws GeneralSecurityException {
        zznb zznbVar;
        try {
            synchronized (zza) {
                try {
                    zznbVar = new zznb(zzaai.zza("android-keystore://", str));
                    byte[] bArrZza = zzqd.zza(10);
                    byte[] bArr = new byte[0];
                    if (!Arrays.equals(bArrZza, zznbVar.zza(zznbVar.zzb(bArrZza, bArr), bArr))) {
                        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zznbVar;
        } catch (IOException e7) {
            throw new GeneralSecurityException(e7);
        }
    }
}
