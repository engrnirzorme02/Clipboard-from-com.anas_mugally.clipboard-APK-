package p229d5;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p164V3.C1762g;

/* JADX INFO: renamed from: d5.b */
/* JADX INFO: loaded from: classes.dex */
public class C5242b {

    /* JADX INFO: renamed from: c */
    private static final String[] f19986c = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f19987a;

    /* JADX INFO: renamed from: b */
    private final String f19988b;

    public C5242b(C1762g c1762g) {
        this.f19987a = c1762g.m7405l().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f19988b = m24216b(c1762g);
    }

    /* JADX INFO: renamed from: a */
    private String m24215a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* JADX INFO: renamed from: b */
    private static String m24216b(C1762g c1762g) {
        String strM7425e = c1762g.m7407p().m7425e();
        if (strM7425e != null) {
            return strM7425e;
        }
        String strM7423c = c1762g.m7407p().m7423c();
        if (!strM7423c.startsWith("1:") && !strM7423c.startsWith("2:")) {
            return strM7423c;
        }
        String[] strArrSplit = strM7423c.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    private static String m24217c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private String m24218d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private PublicKey m24219e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e7) {
            Log.w("ContentValues", "Invalid key stored " + e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private String m24220g() {
        String string;
        synchronized (this.f19987a) {
            string = this.f19987a.getString("|S|id", null);
        }
        return string;
    }

    /* JADX INFO: renamed from: h */
    private String m24221h() {
        synchronized (this.f19987a) {
            try {
                String string = this.f19987a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyM24219e = m24219e(string);
                if (publicKeyM24219e == null) {
                    return null;
                }
                return m24217c(publicKeyM24219e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public String m24222f() {
        synchronized (this.f19987a) {
            try {
                String strM24220g = m24220g();
                if (strM24220g != null) {
                    return strM24220g;
                }
                return m24221h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public String m24223i() {
        synchronized (this.f19987a) {
            try {
                for (String str : f19986c) {
                    String string = this.f19987a.getString(m24215a(this.f19988b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = m24218d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
