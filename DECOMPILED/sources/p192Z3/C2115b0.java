package p192Z3;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p411firebaseauthapi.zzbc;
import com.google.android.gms.internal.p411firebaseauthapi.zzbd;
import com.google.android.gms.internal.p411firebaseauthapi.zzby;
import com.google.android.gms.internal.p411firebaseauthapi.zzks;
import com.google.android.gms.internal.p411firebaseauthapi.zzkt;
import com.google.android.gms.internal.p411firebaseauthapi.zzlh;
import com.google.android.gms.internal.p411firebaseauthapi.zzmy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: renamed from: Z3.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2115b0 {

    /* JADX INFO: renamed from: c */
    private static C2115b0 f6922c;

    /* JADX INFO: renamed from: a */
    private final String f6923a;

    /* JADX INFO: renamed from: b */
    private final zzmy f6924b;

    private C2115b0(Context context, String str, boolean z7) {
        zzmy zzmyVarZza;
        this.f6923a = str;
        try {
            zzkt.zza();
            zzmy.zza zzaVarZza = new zzmy.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzlh.zza);
            zzaVarZza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzmyVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e7) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e7.getMessage());
            zzmyVarZza = null;
        }
        this.f6924b = zzmyVarZza;
    }

    /* JADX INFO: renamed from: a */
    public static C2115b0 m8686a(Context context, String str) {
        C2115b0 c2115b0 = f6922c;
        if (c2115b0 == null || !Objects.equals(c2115b0.f6923a, str)) {
            f6922c = new C2115b0(context, str, true);
        }
        return f6922c;
    }

    /* JADX INFO: renamed from: b */
    public final String m8687b() {
        if (this.f6924b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzby zzbyVarZza = zzbc.zza(byteArrayOutputStream);
        try {
            synchronized (this.f6924b) {
                this.f6924b.zza().zzb().zza(zzbyVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e7) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e7.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m8688c(String str) {
        String str2;
        zzmy zzmyVar = this.f6924b;
        if (zzmyVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzbd) this.f6924b.zza().zza(zzks.zza(), zzbd.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e7) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e7.getMessage());
            return null;
        }
    }
}
