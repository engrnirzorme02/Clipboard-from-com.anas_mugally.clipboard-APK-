package p329q;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import p049G.C0466a;

/* JADX INFO: renamed from: q.i */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC6789i {

    /* JADX INFO: renamed from: q.i$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static KeyGenParameterSpec m29798a(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        /* JADX INFO: renamed from: b */
        static KeyGenParameterSpec.Builder m29799b(String str, int i7) {
            return new KeyGenParameterSpec.Builder(str, i7);
        }

        /* JADX INFO: renamed from: c */
        static void m29800c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }

        /* JADX INFO: renamed from: d */
        static void m29801d(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        /* JADX INFO: renamed from: e */
        static void m29802e(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }
    }

    /* JADX INFO: renamed from: q.i$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        static BiometricPrompt.CryptoObject m29803a(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        /* JADX INFO: renamed from: b */
        static BiometricPrompt.CryptoObject m29804b(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        /* JADX INFO: renamed from: c */
        static BiometricPrompt.CryptoObject m29805c(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        /* JADX INFO: renamed from: d */
        static Cipher m29806d(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        /* JADX INFO: renamed from: e */
        static Mac m29807e(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        /* JADX INFO: renamed from: f */
        static Signature m29808f(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    /* JADX INFO: renamed from: q.i$c */
    private static class c {
        /* JADX INFO: renamed from: a */
        static BiometricPrompt.CryptoObject m29809a(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        /* JADX INFO: renamed from: b */
        static IdentityCredential m29810b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    /* JADX INFO: renamed from: a */
    static C6786f.c m29793a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderM29799b = a.m29799b("androidxBiometric", 3);
            a.m29801d(builderM29799b);
            a.m29802e(builderM29799b);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            a.m29800c(keyGenerator, a.m29798a(builderM29799b));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new C6786f.c(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e7) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    static C6786f.c m29794b(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential identityCredentialM29810b;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipherM29806d = b.m29806d(cryptoObject);
        if (cipherM29806d != null) {
            return new C6786f.c(cipherM29806d);
        }
        Signature signatureM29808f = b.m29808f(cryptoObject);
        if (signatureM29808f != null) {
            return new C6786f.c(signatureM29808f);
        }
        Mac macM29807e = b.m29807e(cryptoObject);
        if (macM29807e != null) {
            return new C6786f.c(macM29807e);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredentialM29810b = c.m29810b(cryptoObject)) == null) {
            return null;
        }
        return new C6786f.c(identityCredentialM29810b);
    }

    /* JADX INFO: renamed from: c */
    static C6786f.c m29795c(C0466a.e eVar) {
        if (eVar == null) {
            return null;
        }
        Cipher cipherM2026a = eVar.m2026a();
        if (cipherM2026a != null) {
            return new C6786f.c(cipherM2026a);
        }
        Signature signatureM2028c = eVar.m2028c();
        if (signatureM2028c != null) {
            return new C6786f.c(signatureM2028c);
        }
        Mac macM2027b = eVar.m2027b();
        if (macM2027b != null) {
            return new C6786f.c(macM2027b);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    static BiometricPrompt.CryptoObject m29796d(C6786f.c cVar) {
        IdentityCredential identityCredentialM29721b;
        if (cVar == null) {
            return null;
        }
        Cipher cipherM29720a = cVar.m29720a();
        if (cipherM29720a != null) {
            return b.m29804b(cipherM29720a);
        }
        Signature signatureM29723d = cVar.m29723d();
        if (signatureM29723d != null) {
            return b.m29803a(signatureM29723d);
        }
        Mac macM29722c = cVar.m29722c();
        if (macM29722c != null) {
            return b.m29805c(macM29722c);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredentialM29721b = cVar.m29721b()) == null) {
            return null;
        }
        return c.m29809a(identityCredentialM29721b);
    }

    /* JADX INFO: renamed from: e */
    static C0466a.e m29797e(C6786f.c cVar) {
        if (cVar == null) {
            return null;
        }
        Cipher cipherM29720a = cVar.m29720a();
        if (cipherM29720a != null) {
            return new C0466a.e(cipherM29720a);
        }
        Signature signatureM29723d = cVar.m29723d();
        if (signatureM29723d != null) {
            return new C0466a.e(signatureM29723d);
        }
        Mac macM29722c = cVar.m29722c();
        if (macM29722c != null) {
            return new C0466a.e(macM29722c);
        }
        if (Build.VERSION.SDK_INT >= 30 && cVar.m29721b() != null) {
            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
        }
        return null;
    }
}
