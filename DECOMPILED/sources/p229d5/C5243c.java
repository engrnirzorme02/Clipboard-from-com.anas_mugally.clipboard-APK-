package p229d5;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p164V3.C1762g;

/* JADX INFO: renamed from: d5.c */
/* JADX INFO: loaded from: classes.dex */
public class C5243c {

    /* JADX INFO: renamed from: a */
    private File f19989a;

    /* JADX INFO: renamed from: b */
    private final C1762g f19990b;

    /* JADX INFO: renamed from: d5.c$a */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C5243c(C1762g c1762g) {
        this.f19990b = c1762g;
    }

    /* JADX INFO: renamed from: a */
    private File m24224a() {
        if (this.f19989a == null) {
            synchronized (this) {
                try {
                    if (this.f19989a == null) {
                        this.f19989a = new File(this.f19990b.m7405l().getFilesDir(), "PersistedInstallation." + this.f19990b.m7408q() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f19989a;
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m24225c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m24224a());
            while (true) {
                try {
                    int i7 = fileInputStream.read(bArr, 0, 16384);
                    if (i7 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i7);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC5244d m24226b(AbstractC5244d abstractC5244d) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC5244d.mo24201d());
            jSONObject.put("Status", abstractC5244d.mo24204g().ordinal());
            jSONObject.put("AuthToken", abstractC5244d.mo24199b());
            jSONObject.put("RefreshToken", abstractC5244d.mo24203f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC5244d.mo24205h());
            jSONObject.put("ExpiresInSecs", abstractC5244d.mo24200c());
            jSONObject.put("FisError", abstractC5244d.mo24202e());
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f19990b.m7405l().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(m24224a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return abstractC5244d;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC5244d m24227d() {
        JSONObject jSONObjectM24225c = m24225c();
        String strOptString = jSONObjectM24225c.optString("Fid", null);
        int iOptInt = jSONObjectM24225c.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectM24225c.optString("AuthToken", null);
        String strOptString3 = jSONObjectM24225c.optString("RefreshToken", null);
        long jOptLong = jSONObjectM24225c.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectM24225c.optLong("ExpiresInSecs", 0L);
        return AbstractC5244d.m24229a().mo24210d(strOptString).mo24213g(a.values()[iOptInt]).mo24208b(strOptString2).mo24212f(strOptString3).mo24214h(jOptLong).mo24209c(jOptLong2).mo24211e(jSONObjectM24225c.optString("FisError", null)).mo24207a();
    }
}
