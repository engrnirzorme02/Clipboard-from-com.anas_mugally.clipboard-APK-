package p192Z3;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzba;
import com.google.android.gms.internal.p411firebaseauthapi.zzcl;
import com.google.android.gms.internal.p411firebaseauthapi.zzco;
import com.google.android.gms.internal.p411firebaseauthapi.zzcv;
import com.google.android.gms.internal.p411firebaseauthapi.zzmy;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: renamed from: Z3.P */
/* JADX INFO: loaded from: classes.dex */
public final class C2102P {

    /* JADX INFO: renamed from: c */
    private static C2102P f6905c;

    /* JADX INFO: renamed from: a */
    private final String f6906a;

    /* JADX INFO: renamed from: b */
    private final zzmy f6907b;

    private C2102P(String str, zzmy zzmyVar) {
        this.f6906a = str;
        this.f6907b = zzmyVar;
    }

    /* JADX INFO: renamed from: a */
    public static C2102P m8645a(Context context, String str) {
        C2102P c2102p = f6905c;
        if (c2102p == null || !Objects.equals(c2102p.f6906a, str)) {
            f6905c = new C2102P(str, m8647e(context, str));
        }
        return f6905c;
    }

    /* JADX INFO: renamed from: c */
    private static zzmy m8646c(Context context, String str) {
        return new zzmy.zza().zza(context, "StorageCryptoKeyset", m8648f(str)).zza(zzcv.zzb).zza(String.format("android-keystore://firebear_main_key_id_for_storage_crypto.%s", str)).zza();
    }

    /* JADX INFO: renamed from: e */
    private static zzmy m8647e(Context context, String str) {
        try {
            zzcl.zza();
            return m8646c(context, str);
        } catch (IOException | GeneralSecurityException e7) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + e7.getMessage());
            if (e7 instanceof GeneralSecurityException) {
                context.getSharedPreferences(m8648f(str), 0).edit().remove("StorageCryptoKeyset").apply();
                try {
                    return m8646c(context, str);
                } catch (IOException | GeneralSecurityException e8) {
                    Log.e("FirebearStorageCryptoHelper", "Exception encountered during second attempt to crypto setup:\n" + e8.getMessage());
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static String m8648f(String str) {
        return String.format("com.google.firebase.auth.api.crypto.%s", str);
    }

    /* JADX INFO: renamed from: b */
    public final String m8649b(String str) {
        String str2;
        AbstractC3718s.m18083l(str);
        zzmy zzmyVar = this.f6907b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzba) this.f6907b.zza().zza(zzco.zza(), zzba.class)).zza(Base64.decode(str, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e7) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + e7.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m8650d(String str) {
        String strEncodeToString;
        AbstractC3718s.m18083l(str);
        zzmy zzmyVar = this.f6907b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                strEncodeToString = Base64.encodeToString(((zzba) this.f6907b.zza().zza(zzco.zza(), zzba.class)).zzb(str.getBytes(StandardCharsets.UTF_8), null), 2);
            }
            return strEncodeToString;
        } catch (GeneralSecurityException e7) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + e7.getMessage());
            return null;
        }
    }
}
